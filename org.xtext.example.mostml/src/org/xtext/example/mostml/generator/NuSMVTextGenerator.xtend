package org.xtext.example.mostml.generator

import org.xtext.example.mostml.moStML.MoSt
import org.xtext.example.mostml.moStML.Environment
import org.xtext.example.mostml.moStML.LESS
import org.xtext.example.mostml.moStML.GREATEQUAL
import org.xtext.example.mostml.moStML.STRINGTYPE
import org.xtext.example.mostml.moStML.INTTYPE
import org.xtext.example.mostml.moStML.NOTEQUAL
import org.xtext.example.mostml.moStML.LESSEQUAL
import org.xtext.example.mostml.moStML.GREATER
import org.xtext.example.mostml.moStML.EQUAL
import org.xtext.example.mostml.moStML.BOOLEANTYPE
import org.xtext.example.mostml.moStML.SPEED
import org.xtext.example.mostml.moStML.TIME
import org.xtext.example.mostml.moStML.WEIGHT
import org.xtext.example.mostml.moStML.MODECONDITION
import org.xtext.example.mostml.moStML.STATECONDITON
import org.xtext.example.mostml.moStML.ATTRIBUTECONTION
import org.xtext.example.mostml.moStML.SIGNALCONDITION
import org.xtext.example.mostml.moStML.STATE
import org.xtext.example.mostml.moStML.PROPERTY
import org.xtext.example.mostml.moStML.CTLOperator
import org.xtext.example.mostml.moStML.LTLOperator
import org.xtext.example.mostml.moStML.AX
import org.xtext.example.mostml.moStML.AG
import org.xtext.example.mostml.moStML.AF
import org.xtext.example.mostml.moStML.EF
import org.xtext.example.mostml.moStML.EG
import org.xtext.example.mostml.moStML.F
import org.xtext.example.mostml.moStML.G
import org.xtext.example.mostml.moStML.X
import org.xtext.example.mostml.moStML.RELATION
import org.xtext.example.mostml.moStML.CONSTRAINT
import org.xtext.example.mostml.moStML.ARITHMETICCONDITION
import org.xtext.example.mostml.moStML.ADD
import org.xtext.example.mostml.moStML.SUBTRACTION
import org.xtext.example.mostml.moStML.MULTIPLICATION
import org.xtext.example.mostml.moStML.DIVISION
import java.util.HashMap
import org.xtext.example.mostml.moStML.MODE
import org.xtext.example.mostml.moStML.ACC

class NuSMVTextGenerator {
	// Environment Requirement: the speed of the car should less than 100 km/h.
	
	// Mode Requirement: when the car is in mode sportive, then its accelerateSpeed will be equal to 10 km/h.	
	var static parameterConstraints = new HashMap<String,String>();
	var static states = new HashMap<String,String>();
	var static actions = new HashMap<String,String>();
	var static attributes = new HashMap<String,String>();
	var static modeTransitions = new HashMap<String,String>();
	def static toNuSMV(MoSt root) 
		
	'''
	«getConstraintRequirements(root)»
	«getEnvironmentRequirements(root)»
	«getModeTransitions(root)»
	MODULE main
	----------------Specification Definition-------------------
	«FOR propertyReq: root.model.filter(PROPERTY)» 
	«var indexPreProperties =0»
	«var indexPostProperties =0»
	SPEC «propertyReq.preOperator.logicOperator» (( «FOR prePropertyCondition: propertyReq.prePropertyConditions»«prePropertyCondition.condition»«IF indexPreProperties<=(propertyReq.preRelations.size-1)» «propertyReq.preRelations.get(indexPreProperties++).relation»«ENDIF» «ENDFOR» ) -> «propertyReq.postOperator.logicOperator» («FOR postPropertyCondition: propertyReq.postPropertyConditions»«postPropertyCondition.condition»«IF indexPostProperties<=(propertyReq.postRelations.size-1)» «propertyReq.postRelations.get(indexPostProperties++).relation» «ENDIF»«ENDFOR» ))--«propertyReq.propertyReqID.reqID»
	«ENDFOR»
	----------------Specification Definition-------------------
	«var indexAttriStates = 0»
	«var indexAttriActions = 0»
	«var indexModeTransitions =0»
	VAR state:{«FOR state: states.entrySet»«state.key» «IF (indexAttriStates++)<states.entrySet.size-1», «ENDIF»«ENDFOR»};
	VAR mode:{«FOR modeTransition: modeTransitions.entrySet»«modeTransition.value.split(";").get(0).split(":").get(1)» «IF (indexModeTransitions++)<modeTransitions.entrySet.size-1», «ENDIF»«ENDFOR»};
	IVAR action:{«FOR action: actions.entrySet»«action.key»«IF (indexAttriActions++)<(actions.entrySet.size-1)», «ENDIF»«ENDFOR»};
	«FOR attribute: attributes.entrySet»
	VAR «attribute.key»: «attribute.value»;
	«ENDFOR»
	INIT (state = «root.model.filter(STATE).get(0).preStateConditions.get(0).condition.split("=").get(1)»)
	  TRANS(next(state) = 
	    case 
		«FOR stateReq: root.model.filter(STATE)»
			«var indexStates =0»
			«FOR preStateCondition: stateReq.preStateConditions»«preStateCondition.condition»«IF indexStates<=(stateReq.relations.size-1)» «stateReq.relations.get(indexStates++).relation» «ENDIF»«ENDFOR»: «stateReq.postStateCondition.condition.split("=").get(1)»;--«stateReq.stateReqID.reqID»
		«ENDFOR»
	    	TRUE : state;
	    esac)
	
	  	«FOR constraintMap: parameterConstraints.entrySet»
	  	ASSIGN
	  	  init(«constraintMap.key»):= «IF constraintMap.value.split("@").get(0)!==null»«constraintMap.value.split("@").get(0)»«ENDIF»
	  	  next(«constraintMap.key»):=
	  	    case
    	    «IF constraintMap.value.contains("@")»
		  	«FOR condition: constraintMap.value.split("@").get(1).split("#")»
				«IF condition!==""»
				«condition»
				«ENDIF»
		    «ENDFOR»
	  	    «ENDIF»
	  	        TRUE: «constraintMap.key»;
	  	    esac;
		«ENDFOR»

		ASSIGN
		init(mode):=«root.model.filter(MODE).get(0).preModeConditions.get(0).condition.split("=").get(1)»;
		next(mode):=
		  case
			«FOR modeTransition: modeTransitions.entrySet»
				«modeTransition.key» & «modeTransition.value»
			«ENDFOR»
			TRUE:mode;
		  esac;
	'''
	def static HashMap<String,String> getConstraintRequirements(MoSt root){
		var String temp="";
		var String pre;
		var String key;
		parameterConstraints.clear;
		for(constraintReq: root.model.filter(CONSTRAINT)){
    		var indexConstraints =0;
    		for(preConstraintCondition: constraintReq.preConstraintConditions ){
    			temp+=preConstraintCondition.condition
		    	if(indexConstraints<=(constraintReq.relations.size-1))
					temp+=constraintReq.relations.get(indexConstraints++).relation     
	  		}
	  		key=constraintReq.postConstraintCondition.condition.split("=").get(0);
	  		temp+=":"+constraintReq.postConstraintCondition.condition.split("=").get(1)+";--"+constraintReq.constraintReqID.reqID+"#";
	  		pre=parameterConstraints.get(key);
	  		println("pre="+pre+"; temp="+temp);
	  		if(pre!==null)
	  			temp+=pre;
	  		if(pre!==temp){
	  			parameterConstraints.put(key,temp)
	  		}
	  		temp="";		
		}
		
	}
	
	def static getModeTransitions(MoSt root){
		var String temp="";
		for(modeReq: root.model.filter(MODE)){
			var indexPreRelations =0;
			for(preModeCondition: modeReq.preModeConditions){ 
				temp+=preModeCondition.condition;
				if(indexPreRelations<=(modeReq.preRelations.size-1)){
					temp+=modeReq.preRelations.get(indexPreRelations++).relation
				}		
			}
			if(modeReq.postModeCondition.condition!==null){
				//mode = A, signal =B, mode = BB
				temp+=":"+modeReq.postModeCondition.condition.split("=").get(1)+";";
				println("mode transition = "+temp);	
					modeTransitions.put(temp.split("&").get(0),temp.split("&").get(1)+"--"+modeReq.modeReqID.reqID);	
			}
			temp="";
			
		}
		
	}
	
	def static getEnvironmentRequirements(MoSt root){
		var String pre="";
		var String key="";
		for(environmentReq: root.model.filter(Environment)){
			key=environmentReq.envirVariable;
 			// initialised attributes need string concatenation
 			if(environmentReq.range===null){
				pre=parameterConstraints.get(key)
				if(pre===null)
					pre="";//if there is no constraints on this key, pre=null. The "null" could be added to the attribute conditions.
				pre=environmentReq.envirAttributeValue.attributeValue.toString+";--"+environmentReq.envirReqID.reqID+"@"+pre;
				println("PRE = "+pre)
				parameterConstraints.put(key,pre);	
					
			}
			else{		
				if(environmentReq.range.bound1.attributeValue.toString <= environmentReq.range.bound2.attributeValue.toString){
					attributes.put(key,environmentReq.range.bound1.attributeValue+".."+environmentReq.range.bound2.attributeValue);	
				}
				else{	
					attributes.put(key,environmentReq.range.bound2.attributeValue+".."+environmentReq.range.bound1.attributeValue);	
				}
			}
		}	
	}
		
	def static getRelation(RELATION re){
		if(re.relaion.trim.equals("and")) "&"
		else if(re.relaion.toString.trim.equals("or")) "|"
		else ""
	}
	// a set of dispatch methods
	def static dispatch getOperator(LESS less){
		if(less!==null) "<"
	}
	
	def static dispatch getOperator(GREATEQUAL greatEqual){
		if(greatEqual!==null) ">="
	}
	
	def static dispatch getOperator(LESSEQUAL lessEqual){
		if(lessEqual!==null) "<="
	}
	
	def static dispatch getOperator(NOTEQUAL notEqual){
		if(notEqual!==null) "!="
	}
		
	def static dispatch getOperator(GREATER greater){
		if(greater!==null) ">"
	}
	
	def static dispatch getOperator(EQUAL equal){
		if(equal!==null) "="
	}
	
	def static dispatch getArithmeticOperator(ADD add){
		if(add!==null) "+"
	}
	
	def static dispatch getArithmeticOperator(SUBTRACTION subtraction){
		if(subtraction!==null) "-"
	}
	
	def static dispatch getArithmeticOperator(MULTIPLICATION multiplication){
		if(multiplication!==null) "*"
	}
	
	def static dispatch getArithmeticOperator(DIVISION division){
		if(division!==null) "/"
	}
	
	def static dispatch getLogicOperator(CTLOperator ctl){
		if(ctl!==null)
			ctl.logicType
	}
	
	def static dispatch getLogicOperator(LTLOperator ltl){
		if(ltl!==null)
			ltl.logicType
	}
	
	def static dispatch getLogicType(AX ax){
		if(ax !== null) "AX"
	}
	def static dispatch getLogicType(AG ag){
		if(ag !== null) "AG"
	}
	
	def static dispatch getLogicType(AF af){
		if(af !== null) "AF"
	}
	
	def static dispatch getLogicType(EF ef){
		if(ef !== null) "EF"
	}
	
	def static dispatch getLogicType(EG eg){
		if(eg !== null) "EG"
	}
	
	def static dispatch getLogicType(F f){
		if(f !== null) "F"
	}
	
	def static dispatch getLogicType(G g){
		if(g !== null) "G"
	}
	
	def static dispatch getLogicType(X x){
		if(x !== null) "X"
	}
	
 	def static dispatch getAttributeValue(STRINGTYPE type){
		if(type!==null) type.string
	}
	
	def static dispatch getAttributeValue(INTTYPE type){
		if(type!==null) type.int
	}
	
	def static dispatch getAttributeValue(BOOLEANTYPE type){
		if(type!==null) type.value
	}
	
	def static dispatch getUnit(SPEED s){
		if(s!==null) s.speed
	}
	
	def static dispatch getUnit(TIME t){
		if(t!==null) t.time
	}
	def static dispatch getUnit(WEIGHT w){
		if(w!==null) w.weight
	}
	
	def static dispatch getUnit(ACC ac){
		if(ac!==null) ac.acc
	}
	def  dispatch static getCondition(MODECONDITION modeCondition){
		if(modeCondition!==null) 
			"mode = "+modeCondition.modeName
	}
	def  dispatch static getCondition(STATECONDITON stateCondition){
		states.put(stateCondition.stateName,"state");
		if(stateCondition.compOperator!==null) "state != "+stateCondition.stateName
		else "state = "+stateCondition.stateName
		
	}
	def  dispatch static getCondition(ATTRIBUTECONTION attributeCondition){
		if(attributeCondition!==null){
			if(attributes.get(attributeCondition.attributeName)!==null){
				if(attributes.get(attributeCondition.attributeName).contains("..")){
			  		println("The type of the attribute is not boolean."); 
			 	}
			}
			else{
				attributes.put(attributeCondition.attributeName,"boolean"); 
			}
			attributeCondition.attributeName+attributeCondition.operator.operator+ attributeCondition.attributeValue.attributeValue		 	
		 }
	}	
	def  dispatch static getCondition(SIGNALCONDITION signalCondition){
		if(signalCondition!==null){
			 actions.put(signalCondition.signalName,"action");
			 "action = "+signalCondition.signalName	
		}
	}
	def  dispatch static getCondition(ARITHMETICCONDITION arithmeticCondition){
		if(arithmeticCondition!==null) arithmeticCondition.result+arithmeticCondition.compcondition.operator+arithmeticCondition.var1+arithmeticCondition.arithmeticOperator.arithmeticOperator+arithmeticCondition.var2
	}	
}