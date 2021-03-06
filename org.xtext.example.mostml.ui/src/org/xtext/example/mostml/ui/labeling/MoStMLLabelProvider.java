/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mostml.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.xtext.example.mostml.moStML.ATTRIBUTECONTION;
import org.xtext.example.mostml.moStML.CONSTRAINT;
import org.xtext.example.mostml.moStML.Environment;
import org.xtext.example.mostml.moStML.MODE;
import org.xtext.example.mostml.moStML.MODECONDITION;
import org.xtext.example.mostml.moStML.NLRequirement;
import org.xtext.example.mostml.moStML.PROPERTY;
import org.xtext.example.mostml.moStML.RELATION;
import org.xtext.example.mostml.moStML.SIGNALCONDITION;
import org.xtext.example.mostml.moStML.STATE;
import org.xtext.example.mostml.moStML.STATECONDITON;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
public class MoStMLLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public MoStMLLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
	String text(STATECONDITON stateCondition) {
		return "state: " + stateCondition.getStateName();
	}
	String text(MODECONDITION modeCondition) {
		return "mode: " + modeCondition.getModeName();
	}
	String text(SIGNALCONDITION signalCondition) {
		return "signal: " + signalCondition.getSignalName();
	}
	
	String text(ATTRIBUTECONTION attributeCondition) {
		return "attribute: " + attributeCondition.getAttributeName();
	}
	
	String text(STATE state) {
		return "state requirement: " + state.getStateReqID().getReqID();
	}
	String text(MODE mode) {
		return "mode requirement: " + mode.getModeReqID().getReqID();
	}
	String text(PROPERTY property) {
		return "property requirement: " + property.getPropertyReqID().getReqID();
	}
	String text(CONSTRAINT constraint) {
		return "constraint requirement: " + constraint.getConstraintReqID().getReqID();
	}
	String text(NLRequirement nlReq) {
		return "natural requirement: " + nlReq.getNlReqID().getReqID();
	}
	String text(Environment envir) {
		return "environment requirement: " + envir.getEnvirReqID().getReqID();
	}

	String text(RELATION relation) {
		return "relation: " + relation.getRelaion();
	}

}