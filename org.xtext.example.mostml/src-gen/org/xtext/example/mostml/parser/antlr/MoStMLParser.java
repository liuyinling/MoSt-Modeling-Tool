/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mostml.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mostml.parser.antlr.internal.InternalMoStMLParser;
import org.xtext.example.mostml.services.MoStMLGrammarAccess;

public class MoStMLParser extends AbstractAntlrParser {

	@Inject
	private MoStMLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMoStMLParser createParser(XtextTokenStream stream) {
		return new InternalMoStMLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MoSt";
	}

	public MoStMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MoStMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
