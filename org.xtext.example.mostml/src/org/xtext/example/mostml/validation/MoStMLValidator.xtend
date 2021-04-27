package org.xtext.example.mostml.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.mostml.moStML.MODECONDITION
import org.xtext.example.mostml.moStML.MoStMLPackage
import org.xtext.example.mostml.moStML.STATECONDITON
import org.xtext.example.mostml.moStML.SIGNALCONDITION
import org.xtext.example.mostml.moStML.ATTRIBUTECONTION
import java.util.HashMap
import org.xtext.example.mostml.moStML.MODE
import org.xtext.example.mostml.moStML.STATE
import org.xtext.example.mostml.moStML.PROPERTY
import org.xtext.example.mostml.moStML.CONSTRAINT
import org.xtext.example.mostml.moStML.NLRequirement
import org.xtext.example.mostml.moStML.Environment
import org.xtext.example.mostml.moStML.MoSt
import org.xtext.example.mostml.moStML.ARITHMETICCONDITION
import org.xtext.example.mostml.moStML.LESS
import org.xtext.example.mostml.moStML.GREATEQUAL
import org.xtext.example.mostml.moStML.LESSEQUAL
import org.xtext.example.mostml.moStML.NOTEQUAL
import org.xtext.example.mostml.moStML.GREATER
import org.xtext.example.mostml.moStML.EQUAL
import org.xtext.example.mostml.moStML.STRINGTYPE
import org.xtext.example.mostml.moStML.INTTYPE
import org.xtext.example.mostml.moStML.BOOLEANTYPE
import org.xtext.example.mostml.moStML.ADD
import org.xtext.example.mostml.moStML.SUBTRACTION
import org.xtext.example.mostml.moStML.MULTIPLICATION
import org.xtext.example.mostml.moStML.DIVISION
import org.xtext.example.mostml.moStML.RELATION
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

class MoStMLValidator extends AbstractMoStMLValidator {
	
	public static val INVALID_ReqID = "invalidName";
	public static HashMap<String,String> reqIDs = new HashMap<String, String> ();
	public static HashMap<String,Integer> envirVariables = new HashMap<String, Integer> ();
	public static HashMap<String,String> stateReqs = new HashMap<String, String> ();
	public static HashMap<String,String> modeReqs = new HashMap<String, String> ();
	public static HashMap<String,String> propertyReqs = new HashMap<String, String> ();
	public static HashMap<String,String> constraintReqs = new HashMap<String, String> ();
	@Check
	def void main(MoSt most){
		reqIDs.clear; // to avoid that same information is added to reqIDs
		envirVariables.clear;
		stateReqs.clear;
		modeReqs.clear;
		propertyReqs.clear;
		constraintReqs.clear;
		for(envirReq: most.model.filter(Environment)){
			// initialize envirVariables
			if(envirReq.envirVariable!==null && !envirVariables.containsKey(envirReq.envirVariable)){
				envirVariables.put(envirReq.envirVariable,1);	
			}
			else if(envirReq.envirVariable!==null && envirVariables.containsKey(envirReq.envirVariable) && envirVariables.get(envirReq.envirVariable)==1){
				envirVariables.put(envirReq.envirVariable,2);		
			}
			else if(envirReq.envirVariable!==null && envirVariables.containsKey(envirReq.envirVariable) && envirVariables.get(envirReq.envirVariable)==2){
				envirVariables.put(envirReq.envirVariable,3);// environment requirements are repeated.	
			}
			else{
				
			}

		}
		//get an overview of state requirements
		for(stateReq: most.model.filter(STATE)){
			getRequirement(stateReq);
		}
		for(modeReq: most.model.filter(MODE)){
			getRequirement(modeReq);
		}
		for(constraintReq: most.model.filter(CONSTRAINT)){
			getRequirement(constraintReq);
		}
		for(propertyReq: most.model.filter(PROPERTY)){
			getRequirement(propertyReq);
		}
		
	}
	
	@Check
	def void checkModeName(MODECONDITION modeCondition){
		if(modeCondition.getModeName().charAt(0)<='Z'&&modeCondition.getModeName().charAt(0)>='A'){
			error("Mode name should start with a lower case"+": error '"+modeCondition.getModeName().charAt(0)+"'",
					  MoStMLPackage.Literals.MODECONDITION__MODE_NAME,INVALID_ReqID);
		}	
		
	}
	
	
	@Check
	def void checkStateName(STATECONDITON stateCondition){
		if(stateCondition.getStateName().charAt(0)<='Z'&&stateCondition.getStateName().charAt(0)>='A'){
			error("State name should start with a lower case"+": error '"+stateCondition.getStateName().charAt(0)+"'",
					  MoStMLPackage.Literals.STATECONDITON__STATE_NAME,INVALID_ReqID);
		}	
	}
	
	@Check
	def void checkSignalName(SIGNALCONDITION signalCondition){
		if(signalCondition.getSignalName().charAt(0)>'Z'|| signalCondition.getSignalName().charAt(0)<'A'){
			error("State name should start with a upper case"+": error '"+signalCondition.getSignalName().charAt(0)+"'",
					  MoStMLPackage.Literals.SIGNALCONDITION__SIGNAL_NAME,INVALID_ReqID);
		}	
	}
	@Check
	def void checkAttributeName(ATTRIBUTECONTION attributeCondition){
		if(attributeCondition.getAttributeName().charAt(0)<='Z'&&attributeCondition.getAttributeName().charAt(0)>='A'){
			error("State name should start with a lower case"+": error '"+attributeCondition.getAttributeName().charAt(0)+"'",
					  MoStMLPackage.Literals.ATTRIBUTECONTION__ATTRIBUTE_NAME,INVALID_ReqID);
		}	
	}
	
	@Check
	def void loadModeIDs(MODE mode){
		if(reqIDs.containsKey(mode.getModeReqID().getReqID().toString())){
			error("ID can not be repeated "+"'"+mode.getModeReqID().getReqID().toString()+"'",
					  MoStMLPackage.Literals.MODE__MODE_REQ_ID,INVALID_ReqID);
		}
		else
			reqIDs.put(mode.getModeReqID().getReqID().toString(),"");		
	}
	
	@Check
	def void loadStateIDs(STATE state){
		if(reqIDs.containsKey(state.getStateReqID().getReqID().toString())){
			error("ID can not be repeated "+"'"+state.getStateReqID().getReqID().toString()+"'",
					  MoStMLPackage.Literals.STATE__STATE_REQ_ID,INVALID_ReqID);
		}
		else
			reqIDs.put(state.getStateReqID().getReqID().toString(),"");	
	}
	@Check
	def void loadPropertyIDs(PROPERTY property){
		if(reqIDs.containsKey(property.getPropertyReqID().getReqID().toString())){
			error("ID can not be repeated "+"'"+property.getPropertyReqID().getReqID().toString()+"'",
					  MoStMLPackage.Literals.PROPERTY__PROPERTY_REQ_ID,INVALID_ReqID);
		}
		else
			reqIDs.put(property.getPropertyReqID().getReqID().toString(),"");	
	}
	@Check
	def void loadConstraintIDs(CONSTRAINT constraint){
		if(reqIDs.containsKey(constraint.getConstraintReqID().getReqID().toString())){
			error("ID can not be repeated "+"'"+constraint.getConstraintReqID().getReqID().toString()+"'",
					  MoStMLPackage.Literals.CONSTRAINT__CONSTRAINT_REQ_ID,INVALID_ReqID);
		}
		else
			reqIDs.put(constraint.getConstraintReqID().getReqID().toString(),"");	
	}
	@Check
	def void loadNLReqIDs(NLRequirement nlReq){
		if(reqIDs.containsKey(nlReq.getNlReqID().getReqID().toString())){
			error("ID can not be repeated "+"'"+nlReq.getNlReqID().getReqID().toString()+"'",
					  MoStMLPackage.Literals.NL_REQUIREMENT__NL_REQ_ID,INVALID_ReqID);
		}
		else
			reqIDs.put(nlReq.getNlReqID().getReqID().toString(),"");	
		
		System.out.println("execute NRL");
	}
	
	@Check
	def void loadEnvirIDs(Environment envir){
		if(reqIDs.containsKey(envir.getEnvirReqID().getReqID().toString())){
			error("ID can not be repeated "+"'"+envir.getEnvirReqID().getReqID().toString()+"'",
					  MoStMLPackage.Literals.ENVIRONMENT__ENVIR_REQ_ID,INVALID_ReqID);
		}
		else {
			reqIDs.put(envir.getEnvirReqID().getReqID().toString(),"");	
		}
	}
	
	@Check
	def void checkEnvirVariable(Environment envir){
		if(envir!==null){
			if(envir.envirUnit.size>0){ // integer variable must have range declaration.
				if(envirVariables.get(envir.envirVariable)==1){
					error("Range should be given to environment variables "+"'"+envir.envirVariable+"'",
					  MoStMLPackage.Literals.ENVIRONMENT__ENVIR_VARIABLE,INVALID_ReqID);
				}
			}

			if(envir.envirUnit.size==0 && envir.range===null){ // when it is the variable of other types
				if(envirVariables.get(envir.envirVariable)==2){
					error("Non-integer variables should only be initialised once! "+"'"+envir.envirVariable+"'",
					  MoStMLPackage.Literals.ENVIRONMENT__ENVIR_VARIABLE,INVALID_ReqID);
				}
			}
			
			if(envirVariables.get(envir.envirVariable)>2){
					error("You may have repeat this environment requirements. "+"'"+envir.envirVariable+"'",
					  MoStMLPackage.Literals.ENVIRONMENT__ENVIR_VARIABLE,INVALID_ReqID);
				}
			
		}
	}
	@Check
	def void checkStateConditions(STATE stateReq){
		var tempPreCondition="";
		var indexRelation=0;
		for(precondition:stateReq.preStateConditions){
			if(indexRelation<stateReq.relations.size){
				tempPreCondition+=precondition.condition+stateReq.relations.get(indexRelation).relation;
				indexRelation++;
			}
			else{
				tempPreCondition+=precondition.condition;
			}
		}
		if(stateReqs.containsKey(tempPreCondition)){
			if(stateReqs.get(tempPreCondition).equals("repeat")){
				error("You have written the same state conditions ",
					  MoStMLPackage.Literals.STATE__STATE_REQ_ID,INVALID_ReqID);
			}
			else if(stateReqs.get(tempPreCondition).equals("conflict")){
				error("You have written different state postconditions with the same preconditions ",
					  MoStMLPackage.Literals.STATE__STATE_REQ_ID,INVALID_ReqID);
			}
			else{
				
			}
		}
		
		
	}
	@Check
	def void checkModeCondition(MODE modeReq){
		var tempPreCondition="";
		var indexRelation=0;
		for(precondition:modeReq.preModeConditions){
			if(indexRelation<modeReq.preRelations.size){
				tempPreCondition+=precondition.condition+modeReq.preRelations.get(indexRelation).relation;
				indexRelation++;
			}
			else{
				tempPreCondition+=precondition.condition;
			}
		}
		if(modeReqs.containsKey(tempPreCondition)){
			if(modeReqs.get(tempPreCondition).equals("repeat")){
				error("You have written the same mode conditions ",
					  MoStMLPackage.Literals.MODE__MODE_REQ_ID,INVALID_ReqID);
			}
			else if(modeReqs.get(tempPreCondition).equals("conflict")){
				error("You have written different mode postconditions with the same preconditions ",
					  MoStMLPackage.Literals.MODE__MODE_REQ_ID,INVALID_ReqID);
			}
			else{
				
			}
		}
		
	}
	
	@Check
	def void checkConstraintCondition(CONSTRAINT constraintReq){
		var tempPreCondition="";
		var attribute="";
		var indexRelation=0;
		for(precondition:constraintReq.preConstraintConditions){
			if(indexRelation<constraintReq.relations.size){
				tempPreCondition+=precondition.condition+constraintReq.relations.get(indexRelation).relation;
				indexRelation++;
			}
			else{
				tempPreCondition+=precondition.condition;
			}
		}
		attribute=constraintReq.postConstraintCondition.condition.split("=").get(0);
		if(constraintReqs.containsKey(tempPreCondition)){
			if(constraintReqs.get(tempPreCondition).equals("repeat")){
				error("You have written the same constraint conditions ",
					  MoStMLPackage.Literals.CONSTRAINT__CONSTRAINT_REQ_ID,INVALID_ReqID);
			}
		}
		if(!envirVariables.containsKey(attribute)){
				error("You have not initialised this variable ",
					  MoStMLPackage.Literals.CONSTRAINT__POST_CONSTRAINT_CONDITION,INVALID_ReqID);
		}
		
	}

	@Check
	def void checkPropertyCondition(PROPERTY propertyReq){
		var tempPreCondition="";
		var tempPostCondition="";
		var indexRelation=0;
		tempPreCondition=propertyReq.preOperator.logicType
		for(precondition:propertyReq.prePropertyConditions){
			if(indexRelation<propertyReq.preRelations.size){
				tempPreCondition+=precondition.condition+propertyReq.preRelations.get(indexRelation).relation;
				indexRelation++;
			}
			else{
				tempPreCondition+=precondition.condition;
			}
		}
		if(propertyReq.postPropertyConditions.size!==0){
			tempPostCondition+=propertyReq.postOperator.logicType
			tempPostCondition+=	propertyReq.postPropertyConditions.get(0).condition;
		}
		if(propertyReqs.containsKey(tempPreCondition+tempPostCondition)){
			if(propertyReqs.get(tempPreCondition+tempPostCondition).equals("repeat")){
				error("You have written the same property conditions ",
					  MoStMLPackage.Literals.PROPERTY__PROPERTY_REQ_ID,INVALID_ReqID);
			}

		}
		
	}

	
	def  dispatch static getCondition(MODECONDITION modeCondition){
		if(modeCondition!==null) 
			"mode = "+modeCondition.modeName
	}
	def  dispatch static getCondition(STATECONDITON stateCondition){
		if(stateCondition.compOperator!==null) "state != "+stateCondition.stateName
		else "state = "+stateCondition.stateName
		
	}
	def  dispatch static getCondition(ATTRIBUTECONTION attributeCondition){

			attributeCondition.attributeName+attributeCondition.operator.operator+ attributeCondition.attributeValue.attributeValue		 	
		 
	}	

	def  dispatch static getCondition(SIGNALCONDITION signalCondition){
		if(signalCondition!==null){
			
			 "action = "+signalCondition.signalName	
		}
	}
	def  dispatch static getCondition(ARITHMETICCONDITION arithmeticCondition){
		if(arithmeticCondition!==null) arithmeticCondition.result+arithmeticCondition.compcondition.operator+arithmeticCondition.var1+arithmeticCondition.arithmeticOperator.arithmeticOperator+arithmeticCondition.var2
	}	
	
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
	 	def static dispatch getAttributeValue(STRINGTYPE type){
		if(type!==null) type.string
	}
	
	def static dispatch getAttributeValue(INTTYPE type){
		if(type!==null) type.int
	}
	
	def static dispatch getAttributeValue(BOOLEANTYPE type){
		if(type!==null) type.value
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
	def static getRelation(RELATION re){
		if(re.relaion.trim.equals("and")) "&"
		else if(re.relaion.toString.trim.equals("or")) "|"
		else ""
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

	
	def static dispatch getRequirement(STATE stateReq){
		var tempPostCondition="";
		var tempPreCondition="";
		var indexStateRelation=0;
		for(preCondition:stateReq.preStateConditions){
			if(indexStateRelation<stateReq.relations.size){
				tempPreCondition+=preCondition.condition + stateReq.relations.get(indexStateRelation).relation;
				indexStateRelation++;
			}
			else{
				tempPreCondition+=preCondition.condition;
			}	
		}
		if(stateReq.postStateConditions.size!==0){
			tempPostCondition+=	stateReq.postStateConditions.get(0).condition;
		}
		if(stateReqs.containsKey(tempPreCondition)){
			if(stateReqs.get(tempPreCondition).equals(tempPostCondition)){
				stateReqs.put(tempPreCondition,"repeat");//repeat requirements
			}
			else if(!stateReqs.get(tempPreCondition).equals(tempPostCondition)){
				stateReqs.put(tempPreCondition,"conflict");//same preconditions different postconditions.
			}
			else{
					
			}
		}
		else{
			stateReqs.put(tempPreCondition,tempPostCondition);
		}
				
	}
				
	def static dispatch getRequirement(MODE modeReq){
		var tempPostCondition="";
		var tempPreCondition="";
		var indexModeRelation=0;
		for(preCondition:modeReq.preModeConditions){
			if(indexModeRelation<modeReq.preRelations.size){
				tempPreCondition+=preCondition.condition + modeReq.preRelations.get(indexModeRelation).relation;
				indexModeRelation++;
			}
			else{
				tempPreCondition+=preCondition.condition;
			}	
		}
		if(modeReq.postModeCondition.condition!==null){
			tempPostCondition+=	modeReq.postModeCondition.condition;
		}
		if(modeReqs.containsKey(tempPreCondition)){
			if(modeReqs.get(tempPreCondition).equals(tempPostCondition)){
				modeReqs.put(tempPreCondition,"repeat");//repeat requirements
			}
			else if(!modeReqs.get(tempPreCondition).equals(tempPostCondition)){
				modeReqs.put(tempPreCondition,"conflict");//same preconditions different postconditions.
			}
			else{
					
			}
		}
		else{
			modeReqs.put(tempPreCondition,tempPostCondition);
		}
				
	}
				

	def static dispatch getRequirement(CONSTRAINT constraintReq){
		var tempPostCondition="";
		var tempPreCondition="";
		var indexConstraintRelation=0;
		for(preCondition:constraintReq.preConstraintConditions){
			if(indexConstraintRelation<constraintReq.relations.size){
				tempPreCondition+=preCondition.condition + constraintReq.relations.get(indexConstraintRelation).relation;
				indexConstraintRelation++;
			}
			else{
				tempPreCondition+=preCondition.condition;
			}	
		}
		if(constraintReq.postConstraintCondition!==null){
			tempPostCondition+=	constraintReq.postConstraintCondition.condition;
		}
		if(constraintReqs.containsKey(tempPreCondition)){
			if(constraintReqs.get(tempPreCondition).equals(tempPostCondition)){
				constraintReqs.put(tempPreCondition,"repeat");//repeat requirements
			}                    // it is possible that we have same preconditions and different postconditions.
		}
		else{
			constraintReqs.put(tempPreCondition,tempPostCondition);
		}
				
	}			
				
	def static dispatch getRequirement(PROPERTY propertyReq){
		var tempPostCondition="";
		var tempPreCondition="";
		var indexPropertyRelation=0;
		tempPreCondition=propertyReq.preOperator.logicType;
		for(preCondition:propertyReq.prePropertyConditions){
			if(indexPropertyRelation<propertyReq.preRelations.size){
				tempPreCondition+=preCondition.condition + propertyReq.preRelations.get(indexPropertyRelation).relation;
				indexPropertyRelation++;
			}
			else{
				tempPreCondition+=preCondition.condition;
			}	
		}
		if(propertyReq.postPropertyConditions.size!==0){
			tempPostCondition+=propertyReq.postOperator.logicType
			tempPostCondition+=	propertyReq.postPropertyConditions.get(0).condition;
		}
		if(propertyReqs.containsKey(tempPreCondition+tempPostCondition)){ // key is the whole item of the property requirement.
			propertyReqs.put(tempPreCondition+tempPostCondition,"repeat");//repeat requirements	
		}
		else{
			propertyReqs.put(tempPreCondition+tempPostCondition,"");
		}

				
	}

	
}