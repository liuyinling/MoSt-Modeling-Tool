/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mostml.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mostml.moStML.ACC;
import org.xtext.example.mostml.moStML.ADD;
import org.xtext.example.mostml.moStML.AF;
import org.xtext.example.mostml.moStML.AG;
import org.xtext.example.mostml.moStML.ARITHMETICCONDITION;
import org.xtext.example.mostml.moStML.ATTRIBUTECONTION;
import org.xtext.example.mostml.moStML.AX;
import org.xtext.example.mostml.moStML.BOOLEANTYPE;
import org.xtext.example.mostml.moStML.CONSTRAINT;
import org.xtext.example.mostml.moStML.DIVISION;
import org.xtext.example.mostml.moStML.EF;
import org.xtext.example.mostml.moStML.EG;
import org.xtext.example.mostml.moStML.EQUAL;
import org.xtext.example.mostml.moStML.Environment;
import org.xtext.example.mostml.moStML.F;
import org.xtext.example.mostml.moStML.G;
import org.xtext.example.mostml.moStML.GREATEQUAL;
import org.xtext.example.mostml.moStML.GREATER;
import org.xtext.example.mostml.moStML.INTTYPE;
import org.xtext.example.mostml.moStML.LESS;
import org.xtext.example.mostml.moStML.LESSEQUAL;
import org.xtext.example.mostml.moStML.MODE;
import org.xtext.example.mostml.moStML.MODECONDITION;
import org.xtext.example.mostml.moStML.MODULE;
import org.xtext.example.mostml.moStML.MULTIPLICATION;
import org.xtext.example.mostml.moStML.MoSt;
import org.xtext.example.mostml.moStML.MoStMLPackage;
import org.xtext.example.mostml.moStML.NLRequirement;
import org.xtext.example.mostml.moStML.NOT;
import org.xtext.example.mostml.moStML.NOTEQUAL;
import org.xtext.example.mostml.moStML.PROPERTY;
import org.xtext.example.mostml.moStML.RANG;
import org.xtext.example.mostml.moStML.RELATION;
import org.xtext.example.mostml.moStML.ReqID;
import org.xtext.example.mostml.moStML.SIGNALCONDITION;
import org.xtext.example.mostml.moStML.SPEED;
import org.xtext.example.mostml.moStML.SPINNINGSPEED;
import org.xtext.example.mostml.moStML.STATE;
import org.xtext.example.mostml.moStML.STATECONDITON;
import org.xtext.example.mostml.moStML.STRINGTYPE;
import org.xtext.example.mostml.moStML.SUBTRACTION;
import org.xtext.example.mostml.moStML.TEMPERATURE;
import org.xtext.example.mostml.moStML.TIME;
import org.xtext.example.mostml.moStML.WEIGHT;
import org.xtext.example.mostml.moStML.X;
import org.xtext.example.mostml.services.MoStMLGrammarAccess;

@SuppressWarnings("all")
public class MoStMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MoStMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MoStMLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MoStMLPackage.ACC:
				sequence_ACC(context, (ACC) semanticObject); 
				return; 
			case MoStMLPackage.ADD:
				sequence_ADD(context, (ADD) semanticObject); 
				return; 
			case MoStMLPackage.AF:
				sequence_AF(context, (AF) semanticObject); 
				return; 
			case MoStMLPackage.AG:
				sequence_AG(context, (AG) semanticObject); 
				return; 
			case MoStMLPackage.ARITHMETICCONDITION:
				sequence_ARITHMETICCONDITION(context, (ARITHMETICCONDITION) semanticObject); 
				return; 
			case MoStMLPackage.ATTRIBUTECONTION:
				sequence_ATTRIBUTECONTION(context, (ATTRIBUTECONTION) semanticObject); 
				return; 
			case MoStMLPackage.AX:
				sequence_AX(context, (AX) semanticObject); 
				return; 
			case MoStMLPackage.BOOLEANTYPE:
				sequence_BOOLEANTYPE(context, (BOOLEANTYPE) semanticObject); 
				return; 
			case MoStMLPackage.CONSTRAINT:
				sequence_CONSTRAINT(context, (CONSTRAINT) semanticObject); 
				return; 
			case MoStMLPackage.DIVISION:
				sequence_DIVISION(context, (DIVISION) semanticObject); 
				return; 
			case MoStMLPackage.EF:
				sequence_EF(context, (EF) semanticObject); 
				return; 
			case MoStMLPackage.EG:
				sequence_EG(context, (EG) semanticObject); 
				return; 
			case MoStMLPackage.EQUAL:
				sequence_EQUAL(context, (EQUAL) semanticObject); 
				return; 
			case MoStMLPackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case MoStMLPackage.F:
				sequence_F(context, (F) semanticObject); 
				return; 
			case MoStMLPackage.G:
				sequence_G(context, (G) semanticObject); 
				return; 
			case MoStMLPackage.GREATEQUAL:
				sequence_GREATEQUAL(context, (GREATEQUAL) semanticObject); 
				return; 
			case MoStMLPackage.GREATER:
				sequence_GREATER(context, (GREATER) semanticObject); 
				return; 
			case MoStMLPackage.INTTYPE:
				sequence_INTTYPE(context, (INTTYPE) semanticObject); 
				return; 
			case MoStMLPackage.LESS:
				sequence_LESS(context, (LESS) semanticObject); 
				return; 
			case MoStMLPackage.LESSEQUAL:
				sequence_LESSEQUAL(context, (LESSEQUAL) semanticObject); 
				return; 
			case MoStMLPackage.MODE:
				sequence_MODE(context, (MODE) semanticObject); 
				return; 
			case MoStMLPackage.MODECONDITION:
				sequence_MODECONDITION(context, (MODECONDITION) semanticObject); 
				return; 
			case MoStMLPackage.MODULE:
				sequence_MODULE(context, (MODULE) semanticObject); 
				return; 
			case MoStMLPackage.MULTIPLICATION:
				sequence_MULTIPLICATION(context, (MULTIPLICATION) semanticObject); 
				return; 
			case MoStMLPackage.MO_ST:
				sequence_MoSt(context, (MoSt) semanticObject); 
				return; 
			case MoStMLPackage.NL_REQUIREMENT:
				sequence_NLRequirement(context, (NLRequirement) semanticObject); 
				return; 
			case MoStMLPackage.NOT:
				sequence_NOT(context, (NOT) semanticObject); 
				return; 
			case MoStMLPackage.NOTEQUAL:
				sequence_NOTEQUAL(context, (NOTEQUAL) semanticObject); 
				return; 
			case MoStMLPackage.PROPERTY:
				sequence_PROPERTY(context, (PROPERTY) semanticObject); 
				return; 
			case MoStMLPackage.RANG:
				sequence_RANG(context, (RANG) semanticObject); 
				return; 
			case MoStMLPackage.RELATION:
				sequence_RELATION(context, (RELATION) semanticObject); 
				return; 
			case MoStMLPackage.REQ_ID:
				sequence_ReqID(context, (ReqID) semanticObject); 
				return; 
			case MoStMLPackage.SIGNALCONDITION:
				sequence_SIGNALCONDITION(context, (SIGNALCONDITION) semanticObject); 
				return; 
			case MoStMLPackage.SPEED:
				sequence_SPEED(context, (SPEED) semanticObject); 
				return; 
			case MoStMLPackage.SPINNINGSPEED:
				sequence_SPINNINGSPEED(context, (SPINNINGSPEED) semanticObject); 
				return; 
			case MoStMLPackage.STATE:
				sequence_STATE(context, (STATE) semanticObject); 
				return; 
			case MoStMLPackage.STATECONDITON:
				sequence_STATECONDITON(context, (STATECONDITON) semanticObject); 
				return; 
			case MoStMLPackage.STRINGTYPE:
				sequence_STRINGTYPE(context, (STRINGTYPE) semanticObject); 
				return; 
			case MoStMLPackage.SUBTRACTION:
				sequence_SUBTRACTION(context, (SUBTRACTION) semanticObject); 
				return; 
			case MoStMLPackage.TEMPERATURE:
				sequence_TEMPERATURE(context, (TEMPERATURE) semanticObject); 
				return; 
			case MoStMLPackage.TIME:
				sequence_TIME(context, (TIME) semanticObject); 
				return; 
			case MoStMLPackage.WEIGHT:
				sequence_WEIGHT(context, (WEIGHT) semanticObject); 
				return; 
			case MoStMLPackage.X:
				sequence_X(context, (X) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     UNIT returns ACC
	 *     ACC returns ACC
	 *
	 * Constraint:
	 *     acc='m/s2'
	 * </pre>
	 */
	protected void sequence_ACC(ISerializationContext context, ACC semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.ACC__ACC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.ACC__ACC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getACCAccess().getAccMS2Keyword_0(), semanticObject.getAcc());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ARITHMETICOPERATOR returns ADD
	 *     ADD returns ADD
	 *
	 * Constraint:
	 *     add='added'
	 * </pre>
	 */
	protected void sequence_ADD(ISerializationContext context, ADD semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.ADD__ADD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.ADD__ADD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getADDAccess().getAddAddedKeyword_0_0(), semanticObject.getAdd());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CTLOperator returns AF
	 *     AF returns AF
	 *
	 * Constraint:
	 *     af='all'
	 * </pre>
	 */
	protected void sequence_AF(ISerializationContext context, AF semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.AF__AF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.AF__AF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAFAccess().getAfAllKeyword_0_0(), semanticObject.getAf());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CTLOperator returns AG
	 *     AG returns AG
	 *
	 * Constraint:
	 *     ag='all'
	 * </pre>
	 */
	protected void sequence_AG(ISerializationContext context, AG semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.AG__AG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.AG__AG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAGAccess().getAgAllKeyword_0_0(), semanticObject.getAg());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ARITHMETICCONDITION returns ARITHMETICCONDITION
	 *
	 * Constraint:
	 *     (result=ID compcondition=COMPARISONOPERATOR var1=ID arithmeticOperator=ARITHMETICOPERATOR (var2=ID | var3=INT))
	 * </pre>
	 */
	protected void sequence_ARITHMETICCONDITION(ISerializationContext context, ARITHMETICCONDITION semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ATTRIBUTECONTION returns ATTRIBUTECONTION
	 *
	 * Constraint:
	 *     (attributeName=ID operator=COMPARISONOPERATOR attributeValue=ATTRIBUTEVALUE unit+=UNIT*)
	 * </pre>
	 */
	protected void sequence_ATTRIBUTECONTION(ISerializationContext context, ATTRIBUTECONTION semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CTLOperator returns AX
	 *     AX returns AX
	 *
	 * Constraint:
	 *     ax='all'
	 * </pre>
	 */
	protected void sequence_AX(ISerializationContext context, AX semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.AX__AX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.AX__AX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAXAccess().getAxAllKeyword_0_0(), semanticObject.getAx());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ATTRIBUTEVALUE returns BOOLEANTYPE
	 *     BOOLEANTYPE returns BOOLEANTYPE
	 *
	 * Constraint:
	 *     (value='TRUE' | value='FALSE')
	 * </pre>
	 */
	protected void sequence_BOOLEANTYPE(ISerializationContext context, BOOLEANTYPE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Requirement returns CONSTRAINT
	 *     CONSTRAINT returns CONSTRAINT
	 *
	 * Constraint:
	 *     (
	 *         constraintReqID=ReqID 
	 *         preConstraintConditions+=MODECONDITION? 
	 *         (
	 *             (preConstraintConditions+=STATECONDITON | preConstraintConditions+=ATTRIBUTECONTION | preConstraintConditions+=SIGNALCONDITION)? 
	 *             preConstraintConditions+=MODECONDITION?
	 *         )* 
	 *         (
	 *             relations+=RELATION 
	 *             (
	 *                 preConstraintConditions+=STATECONDITON | 
	 *                 preConstraintConditions+=ATTRIBUTECONTION | 
	 *                 preConstraintConditions+=MODECONDITION | 
	 *                 preConstraintConditions+=SIGNALCONDITION
	 *             )
	 *         )* 
	 *         (
	 *             postConstraintCondition=STATECONDITON | 
	 *             postConstraintCondition=ATTRIBUTECONTION | 
	 *             postConstraintCondition=MODECONDITION | 
	 *             postConstraintCondition=ARITHMETICCONDITION
	 *         )
	 *     )
	 * </pre>
	 */
	protected void sequence_CONSTRAINT(ISerializationContext context, CONSTRAINT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ARITHMETICOPERATOR returns DIVISION
	 *     DIVISION returns DIVISION
	 *
	 * Constraint:
	 *     division='divided'
	 * </pre>
	 */
	protected void sequence_DIVISION(ISerializationContext context, DIVISION semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.DIVISION__DIVISION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.DIVISION__DIVISION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDIVISIONAccess().getDivisionDividedKeyword_0_0(), semanticObject.getDivision());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CTLOperator returns EF
	 *     EF returns EF
	 *
	 * Constraint:
	 *     ef='exist'
	 * </pre>
	 */
	protected void sequence_EF(ISerializationContext context, EF semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.EF__EF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.EF__EF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEFAccess().getEfExistKeyword_0_0(), semanticObject.getEf());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CTLOperator returns EG
	 *     EG returns EG
	 *
	 * Constraint:
	 *     eg='exist'
	 * </pre>
	 */
	protected void sequence_EG(ISerializationContext context, EG semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.EG__EG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.EG__EG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEGAccess().getEgExistKeyword_0_0(), semanticObject.getEg());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     COMPARISONOPERATOR returns EQUAL
	 *     EQUAL returns EQUAL
	 *
	 * Constraint:
	 *     equal='equal'
	 * </pre>
	 */
	protected void sequence_EQUAL(ISerializationContext context, EQUAL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.EQUAL__EQUAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.EQUAL__EQUAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEQUALAccess().getEqualEqualKeyword_0_0(), semanticObject.getEqual());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Requirement returns Environment
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     (envirReqID=ReqID envirVariable=ID ((envirAttributeValue=ATTRIBUTEVALUE envirUnit+=UNIT*) | range=RANG))
	 * </pre>
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     LTLOperator returns F
	 *     F returns F
	 *
	 * Constraint:
	 *     f='future'
	 * </pre>
	 */
	protected void sequence_F(ISerializationContext context, F semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.F__F) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.F__F));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFAccess().getFFutureKeyword_0(), semanticObject.getF());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     COMPARISONOPERATOR returns GREATEQUAL
	 *     GREATEQUAL returns GREATEQUAL
	 *
	 * Constraint:
	 *     (greateEqual+='greater' greateEqual+='or' greateEqual+='equal' greateEqual+='to')
	 * </pre>
	 */
	protected void sequence_GREATEQUAL(ISerializationContext context, GREATEQUAL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     COMPARISONOPERATOR returns GREATER
	 *     GREATER returns GREATER
	 *
	 * Constraint:
	 *     greater='greater'
	 * </pre>
	 */
	protected void sequence_GREATER(ISerializationContext context, GREATER semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.GREATER__GREATER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.GREATER__GREATER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGREATERAccess().getGreaterGreaterKeyword_0_0(), semanticObject.getGreater());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     LTLOperator returns G
	 *     G returns G
	 *
	 * Constraint:
	 *     g='globally'
	 * </pre>
	 */
	protected void sequence_G(ISerializationContext context, G semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.G__G) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.G__G));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGAccess().getGGloballyKeyword_0(), semanticObject.getG());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ATTRIBUTEVALUE returns INTTYPE
	 *     INTTYPE returns INTTYPE
	 *
	 * Constraint:
	 *     int=INT
	 * </pre>
	 */
	protected void sequence_INTTYPE(ISerializationContext context, INTTYPE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.INTTYPE__INT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.INTTYPE__INT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getINTTYPEAccess().getIntINTTerminalRuleCall_0(), semanticObject.getInt());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     COMPARISONOPERATOR returns LESSEQUAL
	 *     LESSEQUAL returns LESSEQUAL
	 *
	 * Constraint:
	 *     lessEqual='less'
	 * </pre>
	 */
	protected void sequence_LESSEQUAL(ISerializationContext context, LESSEQUAL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.LESSEQUAL__LESS_EQUAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.LESSEQUAL__LESS_EQUAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLESSEQUALAccess().getLessEqualLessKeyword_0_0(), semanticObject.getLessEqual());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     COMPARISONOPERATOR returns LESS
	 *     LESS returns LESS
	 *
	 * Constraint:
	 *     (less+='less' less+='than')
	 * </pre>
	 */
	protected void sequence_LESS(ISerializationContext context, LESS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MODECONDITION returns MODECONDITION
	 *
	 * Constraint:
	 *     modeName=ID
	 * </pre>
	 */
	protected void sequence_MODECONDITION(ISerializationContext context, MODECONDITION semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.MODECONDITION__MODE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.MODECONDITION__MODE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMODECONDITIONAccess().getModeNameIDTerminalRuleCall_3_0(), semanticObject.getModeName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Requirement returns MODE
	 *     MODE returns MODE
	 *
	 * Constraint:
	 *     (
	 *         modeReqID=ReqID 
	 *         preModeConditions+=MODECONDITION 
	 *         (
	 *             preRelations+=RELATION 
	 *             (preModeConditions+=STATECONDITON | preModeConditions+=ATTRIBUTECONTION | preModeConditions+=MODECONDITION | preModeConditions+=SIGNALCONDITION)
	 *         )* 
	 *         postModeCondition=MODECONDITION
	 *     )
	 * </pre>
	 */
	protected void sequence_MODE(ISerializationContext context, MODE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ARITHMETICOPERATOR returns MODULE
	 *     MODULE returns MODULE
	 *
	 * Constraint:
	 *     add='moduled'
	 * </pre>
	 */
	protected void sequence_MODULE(ISerializationContext context, MODULE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.MODULE__ADD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.MODULE__ADD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMODULEAccess().getAddModuledKeyword_0_0(), semanticObject.getAdd());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ARITHMETICOPERATOR returns MULTIPLICATION
	 *     MULTIPLICATION returns MULTIPLICATION
	 *
	 * Constraint:
	 *     multiplication='multiplied'
	 * </pre>
	 */
	protected void sequence_MULTIPLICATION(ISerializationContext context, MULTIPLICATION semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.MULTIPLICATION__MULTIPLICATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.MULTIPLICATION__MULTIPLICATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMULTIPLICATIONAccess().getMultiplicationMultipliedKeyword_0_0(), semanticObject.getMultiplication());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MoSt returns MoSt
	 *
	 * Constraint:
	 *     (model+=Requirement | model+=NLRequirement)+
	 * </pre>
	 */
	protected void sequence_MoSt(ISerializationContext context, MoSt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NLRequirement returns NLRequirement
	 *
	 * Constraint:
	 *     nlReqID=ReqID
	 * </pre>
	 */
	protected void sequence_NLRequirement(ISerializationContext context, NLRequirement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.NL_REQUIREMENT__NL_REQ_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.NL_REQUIREMENT__NL_REQ_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNLRequirementAccess().getNlReqIDReqIDParserRuleCall_0_0(), semanticObject.getNlReqID());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     COMPARISONOPERATOR returns NOTEQUAL
	 *     NOTEQUAL returns NOTEQUAL
	 *
	 * Constraint:
	 *     notEqual='not'
	 * </pre>
	 */
	protected void sequence_NOTEQUAL(ISerializationContext context, NOTEQUAL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.NOTEQUAL__NOT_EQUAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.NOTEQUAL__NOT_EQUAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNOTEQUALAccess().getNotEqualNotKeyword_0_0(), semanticObject.getNotEqual());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     COMPARISONOPERATOR returns NOT
	 *     NOT returns NOT
	 *
	 * Constraint:
	 *     not='not'
	 * </pre>
	 */
	protected void sequence_NOT(ISerializationContext context, NOT semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.NOT__NOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.NOT__NOT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNOTAccess().getNotNotKeyword_0(), semanticObject.getNot());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Requirement returns PROPERTY
	 *     PROPERTY returns PROPERTY
	 *
	 * Constraint:
	 *     (
	 *         propertyReqID=ReqID 
	 *         (preOperator=CTLOperator | preOperator=LTLOperator) 
	 *         prePropertyConditions+=ATTRIBUTECONTION? 
	 *         ((prePropertyConditions+=STATECONDITON | prePropertyConditions+=MODECONDITION)? prePropertyConditions+=ATTRIBUTECONTION?)* 
	 *         (
	 *             preRelations+=RELATION 
	 *             (prePropertyConditions+=STATECONDITON | prePropertyConditions+=ATTRIBUTECONTION | prePropertyConditions+=MODECONDITION)
	 *         )* 
	 *         (postOperator=CTLOperator | postOperator=LTLOperator) 
	 *         (postPropertyConditions+=STATECONDITON | postPropertyConditions+=ATTRIBUTECONTION | postPropertyConditions+=MODECONDITION)* 
	 *         (
	 *             postRelations+=RELATION 
	 *             (postPropertyConditions+=STATECONDITON | postPropertyConditions+=ATTRIBUTECONTION | postPropertyConditions+=MODECONDITION)
	 *         )*
	 *     )
	 * </pre>
	 */
	protected void sequence_PROPERTY(ISerializationContext context, PROPERTY semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RANG returns RANG
	 *
	 * Constraint:
	 *     (compOperator1=COMPARISONOPERATOR bound1=ATTRIBUTEVALUE compOperator2=COMPARISONOPERATOR bound2=ATTRIBUTEVALUE unit=UNIT)
	 * </pre>
	 */
	protected void sequence_RANG(ISerializationContext context, RANG semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.RANG__COMP_OPERATOR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.RANG__COMP_OPERATOR1));
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.RANG__BOUND1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.RANG__BOUND1));
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.RANG__COMP_OPERATOR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.RANG__COMP_OPERATOR2));
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.RANG__BOUND2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.RANG__BOUND2));
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.RANG__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.RANG__UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRANGAccess().getCompOperator1COMPARISONOPERATORParserRuleCall_0_0(), semanticObject.getCompOperator1());
		feeder.accept(grammarAccess.getRANGAccess().getBound1ATTRIBUTEVALUEParserRuleCall_1_0(), semanticObject.getBound1());
		feeder.accept(grammarAccess.getRANGAccess().getCompOperator2COMPARISONOPERATORParserRuleCall_3_0(), semanticObject.getCompOperator2());
		feeder.accept(grammarAccess.getRANGAccess().getBound2ATTRIBUTEVALUEParserRuleCall_4_0(), semanticObject.getBound2());
		feeder.accept(grammarAccess.getRANGAccess().getUnitUNITParserRuleCall_5_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RELATION returns RELATION
	 *
	 * Constraint:
	 *     (relaion='and' | relaion='or')
	 * </pre>
	 */
	protected void sequence_RELATION(ISerializationContext context, RELATION semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ReqID returns ReqID
	 *
	 * Constraint:
	 *     (reqID+=INT reqID+=INT*)
	 * </pre>
	 */
	protected void sequence_ReqID(ISerializationContext context, ReqID semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SIGNALCONDITION returns SIGNALCONDITION
	 *
	 * Constraint:
	 *     signalName=ID
	 * </pre>
	 */
	protected void sequence_SIGNALCONDITION(ISerializationContext context, SIGNALCONDITION semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.SIGNALCONDITION__SIGNAL_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.SIGNALCONDITION__SIGNAL_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSIGNALCONDITIONAccess().getSignalNameIDTerminalRuleCall_3_0(), semanticObject.getSignalName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UNIT returns SPEED
	 *     SPEED returns SPEED
	 *
	 * Constraint:
	 *     speed='km/h'
	 * </pre>
	 */
	protected void sequence_SPEED(ISerializationContext context, SPEED semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.SPEED__SPEED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.SPEED__SPEED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSPEEDAccess().getSpeedKmHKeyword_0(), semanticObject.getSpeed());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UNIT returns SPINNINGSPEED
	 *     SPINNINGSPEED returns SPINNINGSPEED
	 *
	 * Constraint:
	 *     spinningspeed='r/m'
	 * </pre>
	 */
	protected void sequence_SPINNINGSPEED(ISerializationContext context, SPINNINGSPEED semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.SPINNINGSPEED__SPINNINGSPEED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.SPINNINGSPEED__SPINNINGSPEED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSPINNINGSPEEDAccess().getSpinningspeedRMKeyword_0(), semanticObject.getSpinningspeed());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     STATECONDITON returns STATECONDITON
	 *
	 * Constraint:
	 *     (stateName=ID | (compOperator=COMPARISONOPERATOR stateName=ID))
	 * </pre>
	 */
	protected void sequence_STATECONDITON(ISerializationContext context, STATECONDITON semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Requirement returns STATE
	 *     STATE returns STATE
	 *
	 * Constraint:
	 *     (
	 *         stateReqID=ReqID 
	 *         preStateConditions+=STATECONDITON 
	 *         (
	 *             relations+=RELATION 
	 *             (preStateConditions+=STATECONDITON | preStateConditions+=ATTRIBUTECONTION | preStateConditions+=MODECONDITION | preStateConditions+=SIGNALCONDITION)
	 *         )* 
	 *         postStateCondition=STATECONDITON
	 *     )
	 * </pre>
	 */
	protected void sequence_STATE(ISerializationContext context, STATE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ATTRIBUTEVALUE returns STRINGTYPE
	 *     STRINGTYPE returns STRINGTYPE
	 *
	 * Constraint:
	 *     string=STRING
	 * </pre>
	 */
	protected void sequence_STRINGTYPE(ISerializationContext context, STRINGTYPE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.STRINGTYPE__STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.STRINGTYPE__STRING));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSTRINGTYPEAccess().getStringSTRINGTerminalRuleCall_0(), semanticObject.getString());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ARITHMETICOPERATOR returns SUBTRACTION
	 *     SUBTRACTION returns SUBTRACTION
	 *
	 * Constraint:
	 *     substraction='subtracted'
	 * </pre>
	 */
	protected void sequence_SUBTRACTION(ISerializationContext context, SUBTRACTION semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.SUBTRACTION__SUBSTRACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.SUBTRACTION__SUBSTRACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSUBTRACTIONAccess().getSubstractionSubtractedKeyword_0_0(), semanticObject.getSubstraction());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UNIT returns TEMPERATURE
	 *     TEMPERATURE returns TEMPERATURE
	 *
	 * Constraint:
	 *     temperature='°C'
	 * </pre>
	 */
	protected void sequence_TEMPERATURE(ISerializationContext context, TEMPERATURE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.TEMPERATURE__TEMPERATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.TEMPERATURE__TEMPERATURE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTEMPERATUREAccess().getTemperatureCKeyword_0(), semanticObject.getTemperature());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UNIT returns TIME
	 *     TIME returns TIME
	 *
	 * Constraint:
	 *     time='s'
	 * </pre>
	 */
	protected void sequence_TIME(ISerializationContext context, TIME semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.TIME__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.TIME__TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTIMEAccess().getTimeSKeyword_0(), semanticObject.getTime());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UNIT returns WEIGHT
	 *     WEIGHT returns WEIGHT
	 *
	 * Constraint:
	 *     weight='kg'
	 * </pre>
	 */
	protected void sequence_WEIGHT(ISerializationContext context, WEIGHT semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.WEIGHT__WEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.WEIGHT__WEIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWEIGHTAccess().getWeightKgKeyword_0(), semanticObject.getWeight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     LTLOperator returns X
	 *     X returns X
	 *
	 * Constraint:
	 *     x='next'
	 * </pre>
	 */
	protected void sequence_X(ISerializationContext context, X semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoStMLPackage.Literals.X__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoStMLPackage.Literals.X__X));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXAccess().getXNextKeyword_0(), semanticObject.getX());
		feeder.finish();
	}
	
	
}
