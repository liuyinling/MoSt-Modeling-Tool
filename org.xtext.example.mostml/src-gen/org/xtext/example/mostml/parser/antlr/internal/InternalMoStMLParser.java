package org.xtext.example.mostml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mostml.services.MoStMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMoStMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'initialised'", "'to'", "'when'", "','", "'then'", "'all'", "'next'", "'exist'", "'globally'", "'future'", "'and'", "'or'", "'receives'", "'['", "']'", "'kg'", "'s'", "'km/h'", "'TRUE'", "'FALSE'", "'state'", "'mode'", "'moduled'", "'by'", "'divided'", "'multiplied'", "'subtracted'", "'added'", "'not'", "'greater'", "'equal'", "'less'", "'than'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMoStMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMoStMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMoStMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMoStML.g"; }



     	private MoStMLGrammarAccess grammarAccess;

        public InternalMoStMLParser(TokenStream input, MoStMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MoSt";
       	}

       	@Override
       	protected MoStMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMoSt"
    // InternalMoStML.g:64:1: entryRuleMoSt returns [EObject current=null] : iv_ruleMoSt= ruleMoSt EOF ;
    public final EObject entryRuleMoSt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoSt = null;


        try {
            // InternalMoStML.g:64:45: (iv_ruleMoSt= ruleMoSt EOF )
            // InternalMoStML.g:65:2: iv_ruleMoSt= ruleMoSt EOF
            {
             newCompositeNode(grammarAccess.getMoStRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoSt=ruleMoSt();

            state._fsp--;

             current =iv_ruleMoSt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoSt"


    // $ANTLR start "ruleMoSt"
    // InternalMoStML.g:71:1: ruleMoSt returns [EObject current=null] : ( ( (lv_model_0_1= ruleRequirement | lv_model_0_2= ruleNLRequirement ) ) )* ;
    public final EObject ruleMoSt() throws RecognitionException {
        EObject current = null;

        EObject lv_model_0_1 = null;

        EObject lv_model_0_2 = null;



        	enterRule();

        try {
            // InternalMoStML.g:77:2: ( ( ( (lv_model_0_1= ruleRequirement | lv_model_0_2= ruleNLRequirement ) ) )* )
            // InternalMoStML.g:78:2: ( ( (lv_model_0_1= ruleRequirement | lv_model_0_2= ruleNLRequirement ) ) )*
            {
            // InternalMoStML.g:78:2: ( ( (lv_model_0_1= ruleRequirement | lv_model_0_2= ruleNLRequirement ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMoStML.g:79:3: ( (lv_model_0_1= ruleRequirement | lv_model_0_2= ruleNLRequirement ) )
            	    {
            	    // InternalMoStML.g:79:3: ( (lv_model_0_1= ruleRequirement | lv_model_0_2= ruleNLRequirement ) )
            	    // InternalMoStML.g:80:4: (lv_model_0_1= ruleRequirement | lv_model_0_2= ruleNLRequirement )
            	    {
            	    // InternalMoStML.g:80:4: (lv_model_0_1= ruleRequirement | lv_model_0_2= ruleNLRequirement )
            	    int alt1=2;
            	    alt1 = dfa1.predict(input);
            	    switch (alt1) {
            	        case 1 :
            	            // InternalMoStML.g:81:5: lv_model_0_1= ruleRequirement
            	            {

            	            					newCompositeNode(grammarAccess.getMoStAccess().getModelRequirementParserRuleCall_0_0());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_model_0_1=ruleRequirement();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getMoStRule());
            	            					}
            	            					add(
            	            						current,
            	            						"model",
            	            						lv_model_0_1,
            	            						"org.xtext.example.mostml.MoStML.Requirement");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalMoStML.g:97:5: lv_model_0_2= ruleNLRequirement
            	            {

            	            					newCompositeNode(grammarAccess.getMoStAccess().getModelNLRequirementParserRuleCall_0_1());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_model_0_2=ruleNLRequirement();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getMoStRule());
            	            					}
            	            					add(
            	            						current,
            	            						"model",
            	            						lv_model_0_2,
            	            						"org.xtext.example.mostml.MoStML.NLRequirement");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoSt"


    // $ANTLR start "entryRuleNLRequirement"
    // InternalMoStML.g:118:1: entryRuleNLRequirement returns [EObject current=null] : iv_ruleNLRequirement= ruleNLRequirement EOF ;
    public final EObject entryRuleNLRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNLRequirement = null;


        try {
            // InternalMoStML.g:118:54: (iv_ruleNLRequirement= ruleNLRequirement EOF )
            // InternalMoStML.g:119:2: iv_ruleNLRequirement= ruleNLRequirement EOF
            {
             newCompositeNode(grammarAccess.getNLRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNLRequirement=ruleNLRequirement();

            state._fsp--;

             current =iv_ruleNLRequirement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNLRequirement"


    // $ANTLR start "ruleNLRequirement"
    // InternalMoStML.g:125:1: ruleNLRequirement returns [EObject current=null] : ( ( (lv_nlReqID_0_0= ruleReqID ) ) this_ID_1= RULE_ID (this_ID_2= RULE_ID )* otherlv_3= '.' ) ;
    public final EObject ruleNLRequirement() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token this_ID_2=null;
        Token otherlv_3=null;
        EObject lv_nlReqID_0_0 = null;



        	enterRule();

        try {
            // InternalMoStML.g:131:2: ( ( ( (lv_nlReqID_0_0= ruleReqID ) ) this_ID_1= RULE_ID (this_ID_2= RULE_ID )* otherlv_3= '.' ) )
            // InternalMoStML.g:132:2: ( ( (lv_nlReqID_0_0= ruleReqID ) ) this_ID_1= RULE_ID (this_ID_2= RULE_ID )* otherlv_3= '.' )
            {
            // InternalMoStML.g:132:2: ( ( (lv_nlReqID_0_0= ruleReqID ) ) this_ID_1= RULE_ID (this_ID_2= RULE_ID )* otherlv_3= '.' )
            // InternalMoStML.g:133:3: ( (lv_nlReqID_0_0= ruleReqID ) ) this_ID_1= RULE_ID (this_ID_2= RULE_ID )* otherlv_3= '.'
            {
            // InternalMoStML.g:133:3: ( (lv_nlReqID_0_0= ruleReqID ) )
            // InternalMoStML.g:134:4: (lv_nlReqID_0_0= ruleReqID )
            {
            // InternalMoStML.g:134:4: (lv_nlReqID_0_0= ruleReqID )
            // InternalMoStML.g:135:5: lv_nlReqID_0_0= ruleReqID
            {

            					newCompositeNode(grammarAccess.getNLRequirementAccess().getNlReqIDReqIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_nlReqID_0_0=ruleReqID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNLRequirementRule());
            					}
            					set(
            						current,
            						"nlReqID",
            						lv_nlReqID_0_0,
            						"org.xtext.example.mostml.MoStML.ReqID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            			newLeafNode(this_ID_1, grammarAccess.getNLRequirementAccess().getIDTerminalRuleCall_1());
            		
            // InternalMoStML.g:156:3: (this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMoStML.g:157:4: this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    				newLeafNode(this_ID_2, grammarAccess.getNLRequirementAccess().getIDTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNLRequirementAccess().getFullStopKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNLRequirement"


    // $ANTLR start "entryRuleRequirement"
    // InternalMoStML.g:170:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalMoStML.g:170:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalMoStML.g:171:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalMoStML.g:177:1: ruleRequirement returns [EObject current=null] : (this_MODE_0= ruleMODE | this_STATE_1= ruleSTATE | this_PROPERTY_2= rulePROPERTY | this_CONSTRAINT_3= ruleCONSTRAINT | this_Environment_4= ruleEnvironment ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        EObject this_MODE_0 = null;

        EObject this_STATE_1 = null;

        EObject this_PROPERTY_2 = null;

        EObject this_CONSTRAINT_3 = null;

        EObject this_Environment_4 = null;



        	enterRule();

        try {
            // InternalMoStML.g:183:2: ( (this_MODE_0= ruleMODE | this_STATE_1= ruleSTATE | this_PROPERTY_2= rulePROPERTY | this_CONSTRAINT_3= ruleCONSTRAINT | this_Environment_4= ruleEnvironment ) )
            // InternalMoStML.g:184:2: (this_MODE_0= ruleMODE | this_STATE_1= ruleSTATE | this_PROPERTY_2= rulePROPERTY | this_CONSTRAINT_3= ruleCONSTRAINT | this_Environment_4= ruleEnvironment )
            {
            // InternalMoStML.g:184:2: (this_MODE_0= ruleMODE | this_STATE_1= ruleSTATE | this_PROPERTY_2= rulePROPERTY | this_CONSTRAINT_3= ruleCONSTRAINT | this_Environment_4= ruleEnvironment )
            int alt4=5;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMoStML.g:185:3: this_MODE_0= ruleMODE
                    {

                    			newCompositeNode(grammarAccess.getRequirementAccess().getMODEParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MODE_0=ruleMODE();

                    state._fsp--;


                    			current = this_MODE_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoStML.g:194:3: this_STATE_1= ruleSTATE
                    {

                    			newCompositeNode(grammarAccess.getRequirementAccess().getSTATEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_STATE_1=ruleSTATE();

                    state._fsp--;


                    			current = this_STATE_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoStML.g:203:3: this_PROPERTY_2= rulePROPERTY
                    {

                    			newCompositeNode(grammarAccess.getRequirementAccess().getPROPERTYParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PROPERTY_2=rulePROPERTY();

                    state._fsp--;


                    			current = this_PROPERTY_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMoStML.g:212:3: this_CONSTRAINT_3= ruleCONSTRAINT
                    {

                    			newCompositeNode(grammarAccess.getRequirementAccess().getCONSTRAINTParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CONSTRAINT_3=ruleCONSTRAINT();

                    state._fsp--;


                    			current = this_CONSTRAINT_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMoStML.g:221:3: this_Environment_4= ruleEnvironment
                    {

                    			newCompositeNode(grammarAccess.getRequirementAccess().getEnvironmentParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Environment_4=ruleEnvironment();

                    state._fsp--;


                    			current = this_Environment_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleEnvironment"
    // InternalMoStML.g:233:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalMoStML.g:233:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalMoStML.g:234:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalMoStML.g:240:1: ruleEnvironment returns [EObject current=null] : ( ( (lv_envirReqID_0_0= ruleReqID ) ) this_ID_1= RULE_ID ( (lv_envirVariable_2_0= RULE_ID ) ) (this_ID_3= RULE_ID )* ( (otherlv_4= 'initialised' otherlv_5= 'to' ( (lv_envirAttributeValue_6_0= ruleATTRIBUTEVALUE ) ) ( (lv_envirUnit_7_0= ruleUNIT ) )* ) | ( (lv_range_8_0= ruleRANG ) ) ) (this_ID_9= RULE_ID )* otherlv_10= '.' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token lv_envirVariable_2_0=null;
        Token this_ID_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_ID_9=null;
        Token otherlv_10=null;
        EObject lv_envirReqID_0_0 = null;

        EObject lv_envirAttributeValue_6_0 = null;

        EObject lv_envirUnit_7_0 = null;

        EObject lv_range_8_0 = null;



        	enterRule();

        try {
            // InternalMoStML.g:246:2: ( ( ( (lv_envirReqID_0_0= ruleReqID ) ) this_ID_1= RULE_ID ( (lv_envirVariable_2_0= RULE_ID ) ) (this_ID_3= RULE_ID )* ( (otherlv_4= 'initialised' otherlv_5= 'to' ( (lv_envirAttributeValue_6_0= ruleATTRIBUTEVALUE ) ) ( (lv_envirUnit_7_0= ruleUNIT ) )* ) | ( (lv_range_8_0= ruleRANG ) ) ) (this_ID_9= RULE_ID )* otherlv_10= '.' ) )
            // InternalMoStML.g:247:2: ( ( (lv_envirReqID_0_0= ruleReqID ) ) this_ID_1= RULE_ID ( (lv_envirVariable_2_0= RULE_ID ) ) (this_ID_3= RULE_ID )* ( (otherlv_4= 'initialised' otherlv_5= 'to' ( (lv_envirAttributeValue_6_0= ruleATTRIBUTEVALUE ) ) ( (lv_envirUnit_7_0= ruleUNIT ) )* ) | ( (lv_range_8_0= ruleRANG ) ) ) (this_ID_9= RULE_ID )* otherlv_10= '.' )
            {
            // InternalMoStML.g:247:2: ( ( (lv_envirReqID_0_0= ruleReqID ) ) this_ID_1= RULE_ID ( (lv_envirVariable_2_0= RULE_ID ) ) (this_ID_3= RULE_ID )* ( (otherlv_4= 'initialised' otherlv_5= 'to' ( (lv_envirAttributeValue_6_0= ruleATTRIBUTEVALUE ) ) ( (lv_envirUnit_7_0= ruleUNIT ) )* ) | ( (lv_range_8_0= ruleRANG ) ) ) (this_ID_9= RULE_ID )* otherlv_10= '.' )
            // InternalMoStML.g:248:3: ( (lv_envirReqID_0_0= ruleReqID ) ) this_ID_1= RULE_ID ( (lv_envirVariable_2_0= RULE_ID ) ) (this_ID_3= RULE_ID )* ( (otherlv_4= 'initialised' otherlv_5= 'to' ( (lv_envirAttributeValue_6_0= ruleATTRIBUTEVALUE ) ) ( (lv_envirUnit_7_0= ruleUNIT ) )* ) | ( (lv_range_8_0= ruleRANG ) ) ) (this_ID_9= RULE_ID )* otherlv_10= '.'
            {
            // InternalMoStML.g:248:3: ( (lv_envirReqID_0_0= ruleReqID ) )
            // InternalMoStML.g:249:4: (lv_envirReqID_0_0= ruleReqID )
            {
            // InternalMoStML.g:249:4: (lv_envirReqID_0_0= ruleReqID )
            // InternalMoStML.g:250:5: lv_envirReqID_0_0= ruleReqID
            {

            					newCompositeNode(grammarAccess.getEnvironmentAccess().getEnvirReqIDReqIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_envirReqID_0_0=ruleReqID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            					}
            					set(
            						current,
            						"envirReqID",
            						lv_envirReqID_0_0,
            						"org.xtext.example.mostml.MoStML.ReqID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(this_ID_1, grammarAccess.getEnvironmentAccess().getIDTerminalRuleCall_1());
            		
            // InternalMoStML.g:271:3: ( (lv_envirVariable_2_0= RULE_ID ) )
            // InternalMoStML.g:272:4: (lv_envirVariable_2_0= RULE_ID )
            {
            // InternalMoStML.g:272:4: (lv_envirVariable_2_0= RULE_ID )
            // InternalMoStML.g:273:5: lv_envirVariable_2_0= RULE_ID
            {
            lv_envirVariable_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_envirVariable_2_0, grammarAccess.getEnvironmentAccess().getEnvirVariableIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvironmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"envirVariable",
            						lv_envirVariable_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoStML.g:289:3: (this_ID_3= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMoStML.g:290:4: this_ID_3= RULE_ID
            	    {
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				newLeafNode(this_ID_3, grammarAccess.getEnvironmentAccess().getIDTerminalRuleCall_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMoStML.g:295:3: ( (otherlv_4= 'initialised' otherlv_5= 'to' ( (lv_envirAttributeValue_6_0= ruleATTRIBUTEVALUE ) ) ( (lv_envirUnit_7_0= ruleUNIT ) )* ) | ( (lv_range_8_0= ruleRANG ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=40 && LA7_0<=43)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMoStML.g:296:4: (otherlv_4= 'initialised' otherlv_5= 'to' ( (lv_envirAttributeValue_6_0= ruleATTRIBUTEVALUE ) ) ( (lv_envirUnit_7_0= ruleUNIT ) )* )
                    {
                    // InternalMoStML.g:296:4: (otherlv_4= 'initialised' otherlv_5= 'to' ( (lv_envirAttributeValue_6_0= ruleATTRIBUTEVALUE ) ) ( (lv_envirUnit_7_0= ruleUNIT ) )* )
                    // InternalMoStML.g:297:5: otherlv_4= 'initialised' otherlv_5= 'to' ( (lv_envirAttributeValue_6_0= ruleATTRIBUTEVALUE ) ) ( (lv_envirUnit_7_0= ruleUNIT ) )*
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_7); 

                    					newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getInitialisedKeyword_4_0_0());
                    				
                    otherlv_5=(Token)match(input,13,FOLLOW_8); 

                    					newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getToKeyword_4_0_1());
                    				
                    // InternalMoStML.g:305:5: ( (lv_envirAttributeValue_6_0= ruleATTRIBUTEVALUE ) )
                    // InternalMoStML.g:306:6: (lv_envirAttributeValue_6_0= ruleATTRIBUTEVALUE )
                    {
                    // InternalMoStML.g:306:6: (lv_envirAttributeValue_6_0= ruleATTRIBUTEVALUE )
                    // InternalMoStML.g:307:7: lv_envirAttributeValue_6_0= ruleATTRIBUTEVALUE
                    {

                    							newCompositeNode(grammarAccess.getEnvironmentAccess().getEnvirAttributeValueATTRIBUTEVALUEParserRuleCall_4_0_2_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_envirAttributeValue_6_0=ruleATTRIBUTEVALUE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    							}
                    							set(
                    								current,
                    								"envirAttributeValue",
                    								lv_envirAttributeValue_6_0,
                    								"org.xtext.example.mostml.MoStML.ATTRIBUTEVALUE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMoStML.g:324:5: ( (lv_envirUnit_7_0= ruleUNIT ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=27 && LA6_0<=29)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMoStML.g:325:6: (lv_envirUnit_7_0= ruleUNIT )
                    	    {
                    	    // InternalMoStML.g:325:6: (lv_envirUnit_7_0= ruleUNIT )
                    	    // InternalMoStML.g:326:7: lv_envirUnit_7_0= ruleUNIT
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getEnvirUnitUNITParserRuleCall_4_0_3_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_envirUnit_7_0=ruleUNIT();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"envirUnit",
                    	    								lv_envirUnit_7_0,
                    	    								"org.xtext.example.mostml.MoStML.UNIT");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalMoStML.g:345:4: ( (lv_range_8_0= ruleRANG ) )
                    {
                    // InternalMoStML.g:345:4: ( (lv_range_8_0= ruleRANG ) )
                    // InternalMoStML.g:346:5: (lv_range_8_0= ruleRANG )
                    {
                    // InternalMoStML.g:346:5: (lv_range_8_0= ruleRANG )
                    // InternalMoStML.g:347:6: lv_range_8_0= ruleRANG
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getRangeRANGParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_range_8_0=ruleRANG();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						set(
                    							current,
                    							"range",
                    							lv_range_8_0,
                    							"org.xtext.example.mostml.MoStML.RANG");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoStML.g:365:3: (this_ID_9= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMoStML.g:366:4: this_ID_9= RULE_ID
            	    {
            	    this_ID_9=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    				newLeafNode(this_ID_9, grammarAccess.getEnvironmentAccess().getIDTerminalRuleCall_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getFullStopKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleMODE"
    // InternalMoStML.g:379:1: entryRuleMODE returns [EObject current=null] : iv_ruleMODE= ruleMODE EOF ;
    public final EObject entryRuleMODE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODE = null;


        try {
            // InternalMoStML.g:379:45: (iv_ruleMODE= ruleMODE EOF )
            // InternalMoStML.g:380:2: iv_ruleMODE= ruleMODE EOF
            {
             newCompositeNode(grammarAccess.getMODERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMODE=ruleMODE();

            state._fsp--;

             current =iv_ruleMODE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMODE"


    // $ANTLR start "ruleMODE"
    // InternalMoStML.g:386:1: ruleMODE returns [EObject current=null] : ( ( (lv_modeReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preModeConditions_2_0= ruleMODECONDITION ) ) ( ( (lv_preRelations_3_0= ruleRELATION ) ) ( ( (lv_preModeConditions_4_1= ruleSTATECONDITON | lv_preModeConditions_4_2= ruleATTRIBUTECONTION | lv_preModeConditions_4_3= ruleMODECONDITION | lv_preModeConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postModeCondition_7_0= ruleMODECONDITION ) ) otherlv_8= '.' ) ;
    public final EObject ruleMODE() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_modeReqID_0_0 = null;

        EObject lv_preModeConditions_2_0 = null;

        EObject lv_preRelations_3_0 = null;

        EObject lv_preModeConditions_4_1 = null;

        EObject lv_preModeConditions_4_2 = null;

        EObject lv_preModeConditions_4_3 = null;

        EObject lv_preModeConditions_4_4 = null;

        EObject lv_postModeCondition_7_0 = null;



        	enterRule();

        try {
            // InternalMoStML.g:392:2: ( ( ( (lv_modeReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preModeConditions_2_0= ruleMODECONDITION ) ) ( ( (lv_preRelations_3_0= ruleRELATION ) ) ( ( (lv_preModeConditions_4_1= ruleSTATECONDITON | lv_preModeConditions_4_2= ruleATTRIBUTECONTION | lv_preModeConditions_4_3= ruleMODECONDITION | lv_preModeConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postModeCondition_7_0= ruleMODECONDITION ) ) otherlv_8= '.' ) )
            // InternalMoStML.g:393:2: ( ( (lv_modeReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preModeConditions_2_0= ruleMODECONDITION ) ) ( ( (lv_preRelations_3_0= ruleRELATION ) ) ( ( (lv_preModeConditions_4_1= ruleSTATECONDITON | lv_preModeConditions_4_2= ruleATTRIBUTECONTION | lv_preModeConditions_4_3= ruleMODECONDITION | lv_preModeConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postModeCondition_7_0= ruleMODECONDITION ) ) otherlv_8= '.' )
            {
            // InternalMoStML.g:393:2: ( ( (lv_modeReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preModeConditions_2_0= ruleMODECONDITION ) ) ( ( (lv_preRelations_3_0= ruleRELATION ) ) ( ( (lv_preModeConditions_4_1= ruleSTATECONDITON | lv_preModeConditions_4_2= ruleATTRIBUTECONTION | lv_preModeConditions_4_3= ruleMODECONDITION | lv_preModeConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postModeCondition_7_0= ruleMODECONDITION ) ) otherlv_8= '.' )
            // InternalMoStML.g:394:3: ( (lv_modeReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preModeConditions_2_0= ruleMODECONDITION ) ) ( ( (lv_preRelations_3_0= ruleRELATION ) ) ( ( (lv_preModeConditions_4_1= ruleSTATECONDITON | lv_preModeConditions_4_2= ruleATTRIBUTECONTION | lv_preModeConditions_4_3= ruleMODECONDITION | lv_preModeConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postModeCondition_7_0= ruleMODECONDITION ) ) otherlv_8= '.'
            {
            // InternalMoStML.g:394:3: ( (lv_modeReqID_0_0= ruleReqID ) )
            // InternalMoStML.g:395:4: (lv_modeReqID_0_0= ruleReqID )
            {
            // InternalMoStML.g:395:4: (lv_modeReqID_0_0= ruleReqID )
            // InternalMoStML.g:396:5: lv_modeReqID_0_0= ruleReqID
            {

            					newCompositeNode(grammarAccess.getMODEAccess().getModeReqIDReqIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_modeReqID_0_0=ruleReqID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMODERule());
            					}
            					set(
            						current,
            						"modeReqID",
            						lv_modeReqID_0_0,
            						"org.xtext.example.mostml.MoStML.ReqID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMODEAccess().getWhenKeyword_1());
            		
            // InternalMoStML.g:417:3: ( (lv_preModeConditions_2_0= ruleMODECONDITION ) )
            // InternalMoStML.g:418:4: (lv_preModeConditions_2_0= ruleMODECONDITION )
            {
            // InternalMoStML.g:418:4: (lv_preModeConditions_2_0= ruleMODECONDITION )
            // InternalMoStML.g:419:5: lv_preModeConditions_2_0= ruleMODECONDITION
            {

            					newCompositeNode(grammarAccess.getMODEAccess().getPreModeConditionsMODECONDITIONParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_preModeConditions_2_0=ruleMODECONDITION();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMODERule());
            					}
            					add(
            						current,
            						"preModeConditions",
            						lv_preModeConditions_2_0,
            						"org.xtext.example.mostml.MoStML.MODECONDITION");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoStML.g:436:3: ( ( (lv_preRelations_3_0= ruleRELATION ) ) ( ( (lv_preModeConditions_4_1= ruleSTATECONDITON | lv_preModeConditions_4_2= ruleATTRIBUTECONTION | lv_preModeConditions_4_3= ruleMODECONDITION | lv_preModeConditions_4_4= ruleSIGNALCONDITION ) ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=22 && LA10_0<=23)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMoStML.g:437:4: ( (lv_preRelations_3_0= ruleRELATION ) ) ( ( (lv_preModeConditions_4_1= ruleSTATECONDITON | lv_preModeConditions_4_2= ruleATTRIBUTECONTION | lv_preModeConditions_4_3= ruleMODECONDITION | lv_preModeConditions_4_4= ruleSIGNALCONDITION ) ) )
            	    {
            	    // InternalMoStML.g:437:4: ( (lv_preRelations_3_0= ruleRELATION ) )
            	    // InternalMoStML.g:438:5: (lv_preRelations_3_0= ruleRELATION )
            	    {
            	    // InternalMoStML.g:438:5: (lv_preRelations_3_0= ruleRELATION )
            	    // InternalMoStML.g:439:6: lv_preRelations_3_0= ruleRELATION
            	    {

            	    						newCompositeNode(grammarAccess.getMODEAccess().getPreRelationsRELATIONParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_preRelations_3_0=ruleRELATION();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMODERule());
            	    						}
            	    						add(
            	    							current,
            	    							"preRelations",
            	    							lv_preRelations_3_0,
            	    							"org.xtext.example.mostml.MoStML.RELATION");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMoStML.g:456:4: ( ( (lv_preModeConditions_4_1= ruleSTATECONDITON | lv_preModeConditions_4_2= ruleATTRIBUTECONTION | lv_preModeConditions_4_3= ruleMODECONDITION | lv_preModeConditions_4_4= ruleSIGNALCONDITION ) ) )
            	    // InternalMoStML.g:457:5: ( (lv_preModeConditions_4_1= ruleSTATECONDITON | lv_preModeConditions_4_2= ruleATTRIBUTECONTION | lv_preModeConditions_4_3= ruleMODECONDITION | lv_preModeConditions_4_4= ruleSIGNALCONDITION ) )
            	    {
            	    // InternalMoStML.g:457:5: ( (lv_preModeConditions_4_1= ruleSTATECONDITON | lv_preModeConditions_4_2= ruleATTRIBUTECONTION | lv_preModeConditions_4_3= ruleMODECONDITION | lv_preModeConditions_4_4= ruleSIGNALCONDITION ) )
            	    // InternalMoStML.g:458:6: (lv_preModeConditions_4_1= ruleSTATECONDITON | lv_preModeConditions_4_2= ruleATTRIBUTECONTION | lv_preModeConditions_4_3= ruleMODECONDITION | lv_preModeConditions_4_4= ruleSIGNALCONDITION )
            	    {
            	    // InternalMoStML.g:458:6: (lv_preModeConditions_4_1= ruleSTATECONDITON | lv_preModeConditions_4_2= ruleATTRIBUTECONTION | lv_preModeConditions_4_3= ruleMODECONDITION | lv_preModeConditions_4_4= ruleSIGNALCONDITION )
            	    int alt9=4;
            	    alt9 = dfa9.predict(input);
            	    switch (alt9) {
            	        case 1 :
            	            // InternalMoStML.g:459:7: lv_preModeConditions_4_1= ruleSTATECONDITON
            	            {

            	            							newCompositeNode(grammarAccess.getMODEAccess().getPreModeConditionsSTATECONDITONParserRuleCall_3_1_0_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_preModeConditions_4_1=ruleSTATECONDITON();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMODERule());
            	            							}
            	            							add(
            	            								current,
            	            								"preModeConditions",
            	            								lv_preModeConditions_4_1,
            	            								"org.xtext.example.mostml.MoStML.STATECONDITON");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMoStML.g:475:7: lv_preModeConditions_4_2= ruleATTRIBUTECONTION
            	            {

            	            							newCompositeNode(grammarAccess.getMODEAccess().getPreModeConditionsATTRIBUTECONTIONParserRuleCall_3_1_0_1());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_preModeConditions_4_2=ruleATTRIBUTECONTION();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMODERule());
            	            							}
            	            							add(
            	            								current,
            	            								"preModeConditions",
            	            								lv_preModeConditions_4_2,
            	            								"org.xtext.example.mostml.MoStML.ATTRIBUTECONTION");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalMoStML.g:491:7: lv_preModeConditions_4_3= ruleMODECONDITION
            	            {

            	            							newCompositeNode(grammarAccess.getMODEAccess().getPreModeConditionsMODECONDITIONParserRuleCall_3_1_0_2());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_preModeConditions_4_3=ruleMODECONDITION();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMODERule());
            	            							}
            	            							add(
            	            								current,
            	            								"preModeConditions",
            	            								lv_preModeConditions_4_3,
            	            								"org.xtext.example.mostml.MoStML.MODECONDITION");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalMoStML.g:507:7: lv_preModeConditions_4_4= ruleSIGNALCONDITION
            	            {

            	            							newCompositeNode(grammarAccess.getMODEAccess().getPreModeConditionsSIGNALCONDITIONParserRuleCall_3_1_0_3());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_preModeConditions_4_4=ruleSIGNALCONDITION();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMODERule());
            	            							}
            	            							add(
            	            								current,
            	            								"preModeConditions",
            	            								lv_preModeConditions_4_4,
            	            								"org.xtext.example.mostml.MoStML.SIGNALCONDITION");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getMODEAccess().getCommaKeyword_4());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getMODEAccess().getThenKeyword_5());
            		
            // InternalMoStML.g:534:3: ( (lv_postModeCondition_7_0= ruleMODECONDITION ) )
            // InternalMoStML.g:535:4: (lv_postModeCondition_7_0= ruleMODECONDITION )
            {
            // InternalMoStML.g:535:4: (lv_postModeCondition_7_0= ruleMODECONDITION )
            // InternalMoStML.g:536:5: lv_postModeCondition_7_0= ruleMODECONDITION
            {

            					newCompositeNode(grammarAccess.getMODEAccess().getPostModeConditionMODECONDITIONParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_postModeCondition_7_0=ruleMODECONDITION();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMODERule());
            					}
            					set(
            						current,
            						"postModeCondition",
            						lv_postModeCondition_7_0,
            						"org.xtext.example.mostml.MoStML.MODECONDITION");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMODEAccess().getFullStopKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMODE"


    // $ANTLR start "entryRuleSTATE"
    // InternalMoStML.g:561:1: entryRuleSTATE returns [EObject current=null] : iv_ruleSTATE= ruleSTATE EOF ;
    public final EObject entryRuleSTATE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTATE = null;


        try {
            // InternalMoStML.g:561:46: (iv_ruleSTATE= ruleSTATE EOF )
            // InternalMoStML.g:562:2: iv_ruleSTATE= ruleSTATE EOF
            {
             newCompositeNode(grammarAccess.getSTATERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTATE=ruleSTATE();

            state._fsp--;

             current =iv_ruleSTATE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTATE"


    // $ANTLR start "ruleSTATE"
    // InternalMoStML.g:568:1: ruleSTATE returns [EObject current=null] : ( ( (lv_stateReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preStateConditions_2_0= ruleSTATECONDITON ) ) ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postStateConditions_7_0= ruleSTATECONDITON ) )* otherlv_8= '.' ) ;
    public final EObject ruleSTATE() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_stateReqID_0_0 = null;

        EObject lv_preStateConditions_2_0 = null;

        EObject lv_relations_3_0 = null;

        EObject lv_preStateConditions_4_1 = null;

        EObject lv_preStateConditions_4_2 = null;

        EObject lv_preStateConditions_4_3 = null;

        EObject lv_preStateConditions_4_4 = null;

        EObject lv_postStateConditions_7_0 = null;



        	enterRule();

        try {
            // InternalMoStML.g:574:2: ( ( ( (lv_stateReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preStateConditions_2_0= ruleSTATECONDITON ) ) ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postStateConditions_7_0= ruleSTATECONDITON ) )* otherlv_8= '.' ) )
            // InternalMoStML.g:575:2: ( ( (lv_stateReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preStateConditions_2_0= ruleSTATECONDITON ) ) ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postStateConditions_7_0= ruleSTATECONDITON ) )* otherlv_8= '.' )
            {
            // InternalMoStML.g:575:2: ( ( (lv_stateReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preStateConditions_2_0= ruleSTATECONDITON ) ) ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postStateConditions_7_0= ruleSTATECONDITON ) )* otherlv_8= '.' )
            // InternalMoStML.g:576:3: ( (lv_stateReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preStateConditions_2_0= ruleSTATECONDITON ) ) ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postStateConditions_7_0= ruleSTATECONDITON ) )* otherlv_8= '.'
            {
            // InternalMoStML.g:576:3: ( (lv_stateReqID_0_0= ruleReqID ) )
            // InternalMoStML.g:577:4: (lv_stateReqID_0_0= ruleReqID )
            {
            // InternalMoStML.g:577:4: (lv_stateReqID_0_0= ruleReqID )
            // InternalMoStML.g:578:5: lv_stateReqID_0_0= ruleReqID
            {

            					newCompositeNode(grammarAccess.getSTATEAccess().getStateReqIDReqIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_stateReqID_0_0=ruleReqID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSTATERule());
            					}
            					set(
            						current,
            						"stateReqID",
            						lv_stateReqID_0_0,
            						"org.xtext.example.mostml.MoStML.ReqID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSTATEAccess().getWhenKeyword_1());
            		
            // InternalMoStML.g:599:3: ( (lv_preStateConditions_2_0= ruleSTATECONDITON ) )
            // InternalMoStML.g:600:4: (lv_preStateConditions_2_0= ruleSTATECONDITON )
            {
            // InternalMoStML.g:600:4: (lv_preStateConditions_2_0= ruleSTATECONDITON )
            // InternalMoStML.g:601:5: lv_preStateConditions_2_0= ruleSTATECONDITON
            {

            					newCompositeNode(grammarAccess.getSTATEAccess().getPreStateConditionsSTATECONDITONParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_preStateConditions_2_0=ruleSTATECONDITON();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSTATERule());
            					}
            					add(
            						current,
            						"preStateConditions",
            						lv_preStateConditions_2_0,
            						"org.xtext.example.mostml.MoStML.STATECONDITON");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoStML.g:618:3: ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=22 && LA12_0<=23)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMoStML.g:619:4: ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) ) )
            	    {
            	    // InternalMoStML.g:619:4: ( (lv_relations_3_0= ruleRELATION ) )
            	    // InternalMoStML.g:620:5: (lv_relations_3_0= ruleRELATION )
            	    {
            	    // InternalMoStML.g:620:5: (lv_relations_3_0= ruleRELATION )
            	    // InternalMoStML.g:621:6: lv_relations_3_0= ruleRELATION
            	    {

            	    						newCompositeNode(grammarAccess.getSTATEAccess().getRelationsRELATIONParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_relations_3_0=ruleRELATION();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSTATERule());
            	    						}
            	    						add(
            	    							current,
            	    							"relations",
            	    							lv_relations_3_0,
            	    							"org.xtext.example.mostml.MoStML.RELATION");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMoStML.g:638:4: ( ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) ) )
            	    // InternalMoStML.g:639:5: ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) )
            	    {
            	    // InternalMoStML.g:639:5: ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) )
            	    // InternalMoStML.g:640:6: (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION )
            	    {
            	    // InternalMoStML.g:640:6: (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION )
            	    int alt11=4;
            	    alt11 = dfa11.predict(input);
            	    switch (alt11) {
            	        case 1 :
            	            // InternalMoStML.g:641:7: lv_preStateConditions_4_1= ruleSTATECONDITON
            	            {

            	            							newCompositeNode(grammarAccess.getSTATEAccess().getPreStateConditionsSTATECONDITONParserRuleCall_3_1_0_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_preStateConditions_4_1=ruleSTATECONDITON();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getSTATERule());
            	            							}
            	            							add(
            	            								current,
            	            								"preStateConditions",
            	            								lv_preStateConditions_4_1,
            	            								"org.xtext.example.mostml.MoStML.STATECONDITON");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMoStML.g:657:7: lv_preStateConditions_4_2= ruleATTRIBUTECONTION
            	            {

            	            							newCompositeNode(grammarAccess.getSTATEAccess().getPreStateConditionsATTRIBUTECONTIONParserRuleCall_3_1_0_1());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_preStateConditions_4_2=ruleATTRIBUTECONTION();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getSTATERule());
            	            							}
            	            							add(
            	            								current,
            	            								"preStateConditions",
            	            								lv_preStateConditions_4_2,
            	            								"org.xtext.example.mostml.MoStML.ATTRIBUTECONTION");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalMoStML.g:673:7: lv_preStateConditions_4_3= ruleMODECONDITION
            	            {

            	            							newCompositeNode(grammarAccess.getSTATEAccess().getPreStateConditionsMODECONDITIONParserRuleCall_3_1_0_2());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_preStateConditions_4_3=ruleMODECONDITION();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getSTATERule());
            	            							}
            	            							add(
            	            								current,
            	            								"preStateConditions",
            	            								lv_preStateConditions_4_3,
            	            								"org.xtext.example.mostml.MoStML.MODECONDITION");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalMoStML.g:689:7: lv_preStateConditions_4_4= ruleSIGNALCONDITION
            	            {

            	            							newCompositeNode(grammarAccess.getSTATEAccess().getPreStateConditionsSIGNALCONDITIONParserRuleCall_3_1_0_3());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_preStateConditions_4_4=ruleSIGNALCONDITION();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getSTATERule());
            	            							}
            	            							add(
            	            								current,
            	            								"preStateConditions",
            	            								lv_preStateConditions_4_4,
            	            								"org.xtext.example.mostml.MoStML.SIGNALCONDITION");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getSTATEAccess().getCommaKeyword_4());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getSTATEAccess().getThenKeyword_5());
            		
            // InternalMoStML.g:716:3: ( (lv_postStateConditions_7_0= ruleSTATECONDITON ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=40 && LA13_0<=43)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMoStML.g:717:4: (lv_postStateConditions_7_0= ruleSTATECONDITON )
            	    {
            	    // InternalMoStML.g:717:4: (lv_postStateConditions_7_0= ruleSTATECONDITON )
            	    // InternalMoStML.g:718:5: lv_postStateConditions_7_0= ruleSTATECONDITON
            	    {

            	    					newCompositeNode(grammarAccess.getSTATEAccess().getPostStateConditionsSTATECONDITONParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_postStateConditions_7_0=ruleSTATECONDITON();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSTATERule());
            	    					}
            	    					add(
            	    						current,
            	    						"postStateConditions",
            	    						lv_postStateConditions_7_0,
            	    						"org.xtext.example.mostml.MoStML.STATECONDITON");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_8=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSTATEAccess().getFullStopKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTATE"


    // $ANTLR start "entryRuleCONSTRAINT"
    // InternalMoStML.g:743:1: entryRuleCONSTRAINT returns [EObject current=null] : iv_ruleCONSTRAINT= ruleCONSTRAINT EOF ;
    public final EObject entryRuleCONSTRAINT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCONSTRAINT = null;


        try {
            // InternalMoStML.g:743:51: (iv_ruleCONSTRAINT= ruleCONSTRAINT EOF )
            // InternalMoStML.g:744:2: iv_ruleCONSTRAINT= ruleCONSTRAINT EOF
            {
             newCompositeNode(grammarAccess.getCONSTRAINTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCONSTRAINT=ruleCONSTRAINT();

            state._fsp--;

             current =iv_ruleCONSTRAINT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCONSTRAINT"


    // $ANTLR start "ruleCONSTRAINT"
    // InternalMoStML.g:750:1: ruleCONSTRAINT returns [EObject current=null] : ( ( (lv_constraintReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( ( (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION ) ) )* ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( ( (lv_postConstraintCondition_7_1= ruleSTATECONDITON | lv_postConstraintCondition_7_2= ruleATTRIBUTECONTION | lv_postConstraintCondition_7_3= ruleMODECONDITION | lv_postConstraintCondition_7_4= ruleARITHMETICCONDITION ) ) ) otherlv_8= '.' ) ;
    public final EObject ruleCONSTRAINT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_constraintReqID_0_0 = null;

        EObject lv_preConstraintConditions_2_1 = null;

        EObject lv_preConstraintConditions_2_2 = null;

        EObject lv_preConstraintConditions_2_3 = null;

        EObject lv_preConstraintConditions_2_4 = null;

        EObject lv_relations_3_0 = null;

        EObject lv_preConstraintConditions_4_1 = null;

        EObject lv_preConstraintConditions_4_2 = null;

        EObject lv_preConstraintConditions_4_3 = null;

        EObject lv_preConstraintConditions_4_4 = null;

        EObject lv_postConstraintCondition_7_1 = null;

        EObject lv_postConstraintCondition_7_2 = null;

        EObject lv_postConstraintCondition_7_3 = null;

        EObject lv_postConstraintCondition_7_4 = null;



        	enterRule();

        try {
            // InternalMoStML.g:756:2: ( ( ( (lv_constraintReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( ( (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION ) ) )* ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( ( (lv_postConstraintCondition_7_1= ruleSTATECONDITON | lv_postConstraintCondition_7_2= ruleATTRIBUTECONTION | lv_postConstraintCondition_7_3= ruleMODECONDITION | lv_postConstraintCondition_7_4= ruleARITHMETICCONDITION ) ) ) otherlv_8= '.' ) )
            // InternalMoStML.g:757:2: ( ( (lv_constraintReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( ( (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION ) ) )* ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( ( (lv_postConstraintCondition_7_1= ruleSTATECONDITON | lv_postConstraintCondition_7_2= ruleATTRIBUTECONTION | lv_postConstraintCondition_7_3= ruleMODECONDITION | lv_postConstraintCondition_7_4= ruleARITHMETICCONDITION ) ) ) otherlv_8= '.' )
            {
            // InternalMoStML.g:757:2: ( ( (lv_constraintReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( ( (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION ) ) )* ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( ( (lv_postConstraintCondition_7_1= ruleSTATECONDITON | lv_postConstraintCondition_7_2= ruleATTRIBUTECONTION | lv_postConstraintCondition_7_3= ruleMODECONDITION | lv_postConstraintCondition_7_4= ruleARITHMETICCONDITION ) ) ) otherlv_8= '.' )
            // InternalMoStML.g:758:3: ( (lv_constraintReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( ( (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION ) ) )* ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( ( (lv_postConstraintCondition_7_1= ruleSTATECONDITON | lv_postConstraintCondition_7_2= ruleATTRIBUTECONTION | lv_postConstraintCondition_7_3= ruleMODECONDITION | lv_postConstraintCondition_7_4= ruleARITHMETICCONDITION ) ) ) otherlv_8= '.'
            {
            // InternalMoStML.g:758:3: ( (lv_constraintReqID_0_0= ruleReqID ) )
            // InternalMoStML.g:759:4: (lv_constraintReqID_0_0= ruleReqID )
            {
            // InternalMoStML.g:759:4: (lv_constraintReqID_0_0= ruleReqID )
            // InternalMoStML.g:760:5: lv_constraintReqID_0_0= ruleReqID
            {

            					newCompositeNode(grammarAccess.getCONSTRAINTAccess().getConstraintReqIDReqIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_constraintReqID_0_0=ruleReqID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCONSTRAINTRule());
            					}
            					set(
            						current,
            						"constraintReqID",
            						lv_constraintReqID_0_0,
            						"org.xtext.example.mostml.MoStML.ReqID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCONSTRAINTAccess().getWhenKeyword_1());
            		
            // InternalMoStML.g:781:3: ( ( (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=40 && LA15_0<=43)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMoStML.g:782:4: ( (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION ) )
            	    {
            	    // InternalMoStML.g:782:4: ( (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION ) )
            	    // InternalMoStML.g:783:5: (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION )
            	    {
            	    // InternalMoStML.g:783:5: (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION )
            	    int alt14=4;
            	    alt14 = dfa14.predict(input);
            	    switch (alt14) {
            	        case 1 :
            	            // InternalMoStML.g:784:6: lv_preConstraintConditions_2_1= ruleSTATECONDITON
            	            {

            	            						newCompositeNode(grammarAccess.getCONSTRAINTAccess().getPreConstraintConditionsSTATECONDITONParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_preConstraintConditions_2_1=ruleSTATECONDITON();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getCONSTRAINTRule());
            	            						}
            	            						add(
            	            							current,
            	            							"preConstraintConditions",
            	            							lv_preConstraintConditions_2_1,
            	            							"org.xtext.example.mostml.MoStML.STATECONDITON");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMoStML.g:800:6: lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION
            	            {

            	            						newCompositeNode(grammarAccess.getCONSTRAINTAccess().getPreConstraintConditionsATTRIBUTECONTIONParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_preConstraintConditions_2_2=ruleATTRIBUTECONTION();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getCONSTRAINTRule());
            	            						}
            	            						add(
            	            							current,
            	            							"preConstraintConditions",
            	            							lv_preConstraintConditions_2_2,
            	            							"org.xtext.example.mostml.MoStML.ATTRIBUTECONTION");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalMoStML.g:816:6: lv_preConstraintConditions_2_3= ruleMODECONDITION
            	            {

            	            						newCompositeNode(grammarAccess.getCONSTRAINTAccess().getPreConstraintConditionsMODECONDITIONParserRuleCall_2_0_2());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_preConstraintConditions_2_3=ruleMODECONDITION();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getCONSTRAINTRule());
            	            						}
            	            						add(
            	            							current,
            	            							"preConstraintConditions",
            	            							lv_preConstraintConditions_2_3,
            	            							"org.xtext.example.mostml.MoStML.MODECONDITION");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalMoStML.g:832:6: lv_preConstraintConditions_2_4= ruleSIGNALCONDITION
            	            {

            	            						newCompositeNode(grammarAccess.getCONSTRAINTAccess().getPreConstraintConditionsSIGNALCONDITIONParserRuleCall_2_0_3());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_preConstraintConditions_2_4=ruleSIGNALCONDITION();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getCONSTRAINTRule());
            	            						}
            	            						add(
            	            							current,
            	            							"preConstraintConditions",
            	            							lv_preConstraintConditions_2_4,
            	            							"org.xtext.example.mostml.MoStML.SIGNALCONDITION");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalMoStML.g:850:3: ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION ) ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=22 && LA17_0<=23)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMoStML.g:851:4: ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION ) ) )
            	    {
            	    // InternalMoStML.g:851:4: ( (lv_relations_3_0= ruleRELATION ) )
            	    // InternalMoStML.g:852:5: (lv_relations_3_0= ruleRELATION )
            	    {
            	    // InternalMoStML.g:852:5: (lv_relations_3_0= ruleRELATION )
            	    // InternalMoStML.g:853:6: lv_relations_3_0= ruleRELATION
            	    {

            	    						newCompositeNode(grammarAccess.getCONSTRAINTAccess().getRelationsRELATIONParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_relations_3_0=ruleRELATION();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCONSTRAINTRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relations",
            	    							lv_relations_3_0,
            	    							"org.xtext.example.mostml.MoStML.RELATION");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMoStML.g:870:4: ( ( (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION ) ) )
            	    // InternalMoStML.g:871:5: ( (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION ) )
            	    {
            	    // InternalMoStML.g:871:5: ( (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION ) )
            	    // InternalMoStML.g:872:6: (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION )
            	    {
            	    // InternalMoStML.g:872:6: (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION )
            	    int alt16=4;
            	    alt16 = dfa16.predict(input);
            	    switch (alt16) {
            	        case 1 :
            	            // InternalMoStML.g:873:7: lv_preConstraintConditions_4_1= ruleSTATECONDITON
            	            {

            	            							newCompositeNode(grammarAccess.getCONSTRAINTAccess().getPreConstraintConditionsSTATECONDITONParserRuleCall_3_1_0_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_preConstraintConditions_4_1=ruleSTATECONDITON();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getCONSTRAINTRule());
            	            							}
            	            							add(
            	            								current,
            	            								"preConstraintConditions",
            	            								lv_preConstraintConditions_4_1,
            	            								"org.xtext.example.mostml.MoStML.STATECONDITON");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMoStML.g:889:7: lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION
            	            {

            	            							newCompositeNode(grammarAccess.getCONSTRAINTAccess().getPreConstraintConditionsATTRIBUTECONTIONParserRuleCall_3_1_0_1());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_preConstraintConditions_4_2=ruleATTRIBUTECONTION();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getCONSTRAINTRule());
            	            							}
            	            							add(
            	            								current,
            	            								"preConstraintConditions",
            	            								lv_preConstraintConditions_4_2,
            	            								"org.xtext.example.mostml.MoStML.ATTRIBUTECONTION");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalMoStML.g:905:7: lv_preConstraintConditions_4_3= ruleMODECONDITION
            	            {

            	            							newCompositeNode(grammarAccess.getCONSTRAINTAccess().getPreConstraintConditionsMODECONDITIONParserRuleCall_3_1_0_2());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_preConstraintConditions_4_3=ruleMODECONDITION();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getCONSTRAINTRule());
            	            							}
            	            							add(
            	            								current,
            	            								"preConstraintConditions",
            	            								lv_preConstraintConditions_4_3,
            	            								"org.xtext.example.mostml.MoStML.MODECONDITION");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalMoStML.g:921:7: lv_preConstraintConditions_4_4= ruleSIGNALCONDITION
            	            {

            	            							newCompositeNode(grammarAccess.getCONSTRAINTAccess().getPreConstraintConditionsSIGNALCONDITIONParserRuleCall_3_1_0_3());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_preConstraintConditions_4_4=ruleSIGNALCONDITION();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getCONSTRAINTRule());
            	            							}
            	            							add(
            	            								current,
            	            								"preConstraintConditions",
            	            								lv_preConstraintConditions_4_4,
            	            								"org.xtext.example.mostml.MoStML.SIGNALCONDITION");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getCONSTRAINTAccess().getCommaKeyword_4());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getCONSTRAINTAccess().getThenKeyword_5());
            		
            // InternalMoStML.g:948:3: ( ( (lv_postConstraintCondition_7_1= ruleSTATECONDITON | lv_postConstraintCondition_7_2= ruleATTRIBUTECONTION | lv_postConstraintCondition_7_3= ruleMODECONDITION | lv_postConstraintCondition_7_4= ruleARITHMETICCONDITION ) ) )
            // InternalMoStML.g:949:4: ( (lv_postConstraintCondition_7_1= ruleSTATECONDITON | lv_postConstraintCondition_7_2= ruleATTRIBUTECONTION | lv_postConstraintCondition_7_3= ruleMODECONDITION | lv_postConstraintCondition_7_4= ruleARITHMETICCONDITION ) )
            {
            // InternalMoStML.g:949:4: ( (lv_postConstraintCondition_7_1= ruleSTATECONDITON | lv_postConstraintCondition_7_2= ruleATTRIBUTECONTION | lv_postConstraintCondition_7_3= ruleMODECONDITION | lv_postConstraintCondition_7_4= ruleARITHMETICCONDITION ) )
            // InternalMoStML.g:950:5: (lv_postConstraintCondition_7_1= ruleSTATECONDITON | lv_postConstraintCondition_7_2= ruleATTRIBUTECONTION | lv_postConstraintCondition_7_3= ruleMODECONDITION | lv_postConstraintCondition_7_4= ruleARITHMETICCONDITION )
            {
            // InternalMoStML.g:950:5: (lv_postConstraintCondition_7_1= ruleSTATECONDITON | lv_postConstraintCondition_7_2= ruleATTRIBUTECONTION | lv_postConstraintCondition_7_3= ruleMODECONDITION | lv_postConstraintCondition_7_4= ruleARITHMETICCONDITION )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalMoStML.g:951:6: lv_postConstraintCondition_7_1= ruleSTATECONDITON
                    {

                    						newCompositeNode(grammarAccess.getCONSTRAINTAccess().getPostConstraintConditionSTATECONDITONParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_postConstraintCondition_7_1=ruleSTATECONDITON();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCONSTRAINTRule());
                    						}
                    						set(
                    							current,
                    							"postConstraintCondition",
                    							lv_postConstraintCondition_7_1,
                    							"org.xtext.example.mostml.MoStML.STATECONDITON");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMoStML.g:967:6: lv_postConstraintCondition_7_2= ruleATTRIBUTECONTION
                    {

                    						newCompositeNode(grammarAccess.getCONSTRAINTAccess().getPostConstraintConditionATTRIBUTECONTIONParserRuleCall_6_0_1());
                    					
                    pushFollow(FOLLOW_13);
                    lv_postConstraintCondition_7_2=ruleATTRIBUTECONTION();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCONSTRAINTRule());
                    						}
                    						set(
                    							current,
                    							"postConstraintCondition",
                    							lv_postConstraintCondition_7_2,
                    							"org.xtext.example.mostml.MoStML.ATTRIBUTECONTION");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMoStML.g:983:6: lv_postConstraintCondition_7_3= ruleMODECONDITION
                    {

                    						newCompositeNode(grammarAccess.getCONSTRAINTAccess().getPostConstraintConditionMODECONDITIONParserRuleCall_6_0_2());
                    					
                    pushFollow(FOLLOW_13);
                    lv_postConstraintCondition_7_3=ruleMODECONDITION();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCONSTRAINTRule());
                    						}
                    						set(
                    							current,
                    							"postConstraintCondition",
                    							lv_postConstraintCondition_7_3,
                    							"org.xtext.example.mostml.MoStML.MODECONDITION");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalMoStML.g:999:6: lv_postConstraintCondition_7_4= ruleARITHMETICCONDITION
                    {

                    						newCompositeNode(grammarAccess.getCONSTRAINTAccess().getPostConstraintConditionARITHMETICCONDITIONParserRuleCall_6_0_3());
                    					
                    pushFollow(FOLLOW_13);
                    lv_postConstraintCondition_7_4=ruleARITHMETICCONDITION();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCONSTRAINTRule());
                    						}
                    						set(
                    							current,
                    							"postConstraintCondition",
                    							lv_postConstraintCondition_7_4,
                    							"org.xtext.example.mostml.MoStML.ARITHMETICCONDITION");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_8=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCONSTRAINTAccess().getFullStopKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCONSTRAINT"


    // $ANTLR start "entryRulePROPERTY"
    // InternalMoStML.g:1025:1: entryRulePROPERTY returns [EObject current=null] : iv_rulePROPERTY= rulePROPERTY EOF ;
    public final EObject entryRulePROPERTY() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePROPERTY = null;


        try {
            // InternalMoStML.g:1025:49: (iv_rulePROPERTY= rulePROPERTY EOF )
            // InternalMoStML.g:1026:2: iv_rulePROPERTY= rulePROPERTY EOF
            {
             newCompositeNode(grammarAccess.getPROPERTYRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePROPERTY=rulePROPERTY();

            state._fsp--;

             current =iv_rulePROPERTY; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePROPERTY"


    // $ANTLR start "rulePROPERTY"
    // InternalMoStML.g:1032:1: rulePROPERTY returns [EObject current=null] : ( ( (lv_propertyReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( ( (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator ) ) ) ( ( (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION ) ) )* ( ( (lv_preRelations_4_0= ruleRELATION ) ) ( ( (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION ) ) ) )* otherlv_6= ',' otherlv_7= 'then' ( ( (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator ) ) ) ( ( (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION ) ) )* ( ( (lv_postRelations_10_0= ruleRELATION ) ) ( ( (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION ) ) ) )* otherlv_12= '.' ) ;
    public final EObject rulePROPERTY() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        EObject lv_propertyReqID_0_0 = null;

        EObject lv_preOperator_2_1 = null;

        EObject lv_preOperator_2_2 = null;

        EObject lv_prePropertyConditions_3_1 = null;

        EObject lv_prePropertyConditions_3_2 = null;

        EObject lv_prePropertyConditions_3_3 = null;

        EObject lv_preRelations_4_0 = null;

        EObject lv_prePropertyConditions_5_1 = null;

        EObject lv_prePropertyConditions_5_2 = null;

        EObject lv_prePropertyConditions_5_3 = null;

        EObject lv_postOperator_8_1 = null;

        EObject lv_postOperator_8_2 = null;

        EObject lv_postPropertyConditions_9_1 = null;

        EObject lv_postPropertyConditions_9_2 = null;

        EObject lv_postPropertyConditions_9_3 = null;

        EObject lv_postRelations_10_0 = null;

        EObject lv_postPropertyConditions_11_1 = null;

        EObject lv_postPropertyConditions_11_2 = null;

        EObject lv_postPropertyConditions_11_3 = null;



        	enterRule();

        try {
            // InternalMoStML.g:1038:2: ( ( ( (lv_propertyReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( ( (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator ) ) ) ( ( (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION ) ) )* ( ( (lv_preRelations_4_0= ruleRELATION ) ) ( ( (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION ) ) ) )* otherlv_6= ',' otherlv_7= 'then' ( ( (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator ) ) ) ( ( (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION ) ) )* ( ( (lv_postRelations_10_0= ruleRELATION ) ) ( ( (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION ) ) ) )* otherlv_12= '.' ) )
            // InternalMoStML.g:1039:2: ( ( (lv_propertyReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( ( (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator ) ) ) ( ( (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION ) ) )* ( ( (lv_preRelations_4_0= ruleRELATION ) ) ( ( (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION ) ) ) )* otherlv_6= ',' otherlv_7= 'then' ( ( (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator ) ) ) ( ( (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION ) ) )* ( ( (lv_postRelations_10_0= ruleRELATION ) ) ( ( (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION ) ) ) )* otherlv_12= '.' )
            {
            // InternalMoStML.g:1039:2: ( ( (lv_propertyReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( ( (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator ) ) ) ( ( (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION ) ) )* ( ( (lv_preRelations_4_0= ruleRELATION ) ) ( ( (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION ) ) ) )* otherlv_6= ',' otherlv_7= 'then' ( ( (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator ) ) ) ( ( (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION ) ) )* ( ( (lv_postRelations_10_0= ruleRELATION ) ) ( ( (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION ) ) ) )* otherlv_12= '.' )
            // InternalMoStML.g:1040:3: ( (lv_propertyReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( ( (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator ) ) ) ( ( (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION ) ) )* ( ( (lv_preRelations_4_0= ruleRELATION ) ) ( ( (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION ) ) ) )* otherlv_6= ',' otherlv_7= 'then' ( ( (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator ) ) ) ( ( (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION ) ) )* ( ( (lv_postRelations_10_0= ruleRELATION ) ) ( ( (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION ) ) ) )* otherlv_12= '.'
            {
            // InternalMoStML.g:1040:3: ( (lv_propertyReqID_0_0= ruleReqID ) )
            // InternalMoStML.g:1041:4: (lv_propertyReqID_0_0= ruleReqID )
            {
            // InternalMoStML.g:1041:4: (lv_propertyReqID_0_0= ruleReqID )
            // InternalMoStML.g:1042:5: lv_propertyReqID_0_0= ruleReqID
            {

            					newCompositeNode(grammarAccess.getPROPERTYAccess().getPropertyReqIDReqIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_propertyReqID_0_0=ruleReqID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            					}
            					set(
            						current,
            						"propertyReqID",
            						lv_propertyReqID_0_0,
            						"org.xtext.example.mostml.MoStML.ReqID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPROPERTYAccess().getWhenKeyword_1());
            		
            // InternalMoStML.g:1063:3: ( ( (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator ) ) )
            // InternalMoStML.g:1064:4: ( (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator ) )
            {
            // InternalMoStML.g:1064:4: ( (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator ) )
            // InternalMoStML.g:1065:5: (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator )
            {
            // InternalMoStML.g:1065:5: (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17||LA19_0==19) ) {
                alt19=1;
            }
            else if ( (LA19_0==18||(LA19_0>=20 && LA19_0<=21)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMoStML.g:1066:6: lv_preOperator_2_1= ruleCTLOperator
                    {

                    						newCompositeNode(grammarAccess.getPROPERTYAccess().getPreOperatorCTLOperatorParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_preOperator_2_1=ruleCTLOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPROPERTYRule());
                    						}
                    						set(
                    							current,
                    							"preOperator",
                    							lv_preOperator_2_1,
                    							"org.xtext.example.mostml.MoStML.CTLOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMoStML.g:1082:6: lv_preOperator_2_2= ruleLTLOperator
                    {

                    						newCompositeNode(grammarAccess.getPROPERTYAccess().getPreOperatorLTLOperatorParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_15);
                    lv_preOperator_2_2=ruleLTLOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPROPERTYRule());
                    						}
                    						set(
                    							current,
                    							"preOperator",
                    							lv_preOperator_2_2,
                    							"org.xtext.example.mostml.MoStML.LTLOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMoStML.g:1100:3: ( ( (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=40 && LA21_0<=43)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMoStML.g:1101:4: ( (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION ) )
            	    {
            	    // InternalMoStML.g:1101:4: ( (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION ) )
            	    // InternalMoStML.g:1102:5: (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION )
            	    {
            	    // InternalMoStML.g:1102:5: (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION )
            	    int alt20=3;
            	    alt20 = dfa20.predict(input);
            	    switch (alt20) {
            	        case 1 :
            	            // InternalMoStML.g:1103:6: lv_prePropertyConditions_3_1= ruleSTATECONDITON
            	            {

            	            						newCompositeNode(grammarAccess.getPROPERTYAccess().getPrePropertyConditionsSTATECONDITONParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_prePropertyConditions_3_1=ruleSTATECONDITON();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            	            						}
            	            						add(
            	            							current,
            	            							"prePropertyConditions",
            	            							lv_prePropertyConditions_3_1,
            	            							"org.xtext.example.mostml.MoStML.STATECONDITON");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMoStML.g:1119:6: lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION
            	            {

            	            						newCompositeNode(grammarAccess.getPROPERTYAccess().getPrePropertyConditionsATTRIBUTECONTIONParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_prePropertyConditions_3_2=ruleATTRIBUTECONTION();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            	            						}
            	            						add(
            	            							current,
            	            							"prePropertyConditions",
            	            							lv_prePropertyConditions_3_2,
            	            							"org.xtext.example.mostml.MoStML.ATTRIBUTECONTION");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalMoStML.g:1135:6: lv_prePropertyConditions_3_3= ruleMODECONDITION
            	            {

            	            						newCompositeNode(grammarAccess.getPROPERTYAccess().getPrePropertyConditionsMODECONDITIONParserRuleCall_3_0_2());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_prePropertyConditions_3_3=ruleMODECONDITION();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            	            						}
            	            						add(
            	            							current,
            	            							"prePropertyConditions",
            	            							lv_prePropertyConditions_3_3,
            	            							"org.xtext.example.mostml.MoStML.MODECONDITION");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalMoStML.g:1153:3: ( ( (lv_preRelations_4_0= ruleRELATION ) ) ( ( (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION ) ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=22 && LA23_0<=23)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMoStML.g:1154:4: ( (lv_preRelations_4_0= ruleRELATION ) ) ( ( (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION ) ) )
            	    {
            	    // InternalMoStML.g:1154:4: ( (lv_preRelations_4_0= ruleRELATION ) )
            	    // InternalMoStML.g:1155:5: (lv_preRelations_4_0= ruleRELATION )
            	    {
            	    // InternalMoStML.g:1155:5: (lv_preRelations_4_0= ruleRELATION )
            	    // InternalMoStML.g:1156:6: lv_preRelations_4_0= ruleRELATION
            	    {

            	    						newCompositeNode(grammarAccess.getPROPERTYAccess().getPreRelationsRELATIONParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_preRelations_4_0=ruleRELATION();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            	    						}
            	    						add(
            	    							current,
            	    							"preRelations",
            	    							lv_preRelations_4_0,
            	    							"org.xtext.example.mostml.MoStML.RELATION");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMoStML.g:1173:4: ( ( (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION ) ) )
            	    // InternalMoStML.g:1174:5: ( (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION ) )
            	    {
            	    // InternalMoStML.g:1174:5: ( (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION ) )
            	    // InternalMoStML.g:1175:6: (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION )
            	    {
            	    // InternalMoStML.g:1175:6: (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION )
            	    int alt22=3;
            	    alt22 = dfa22.predict(input);
            	    switch (alt22) {
            	        case 1 :
            	            // InternalMoStML.g:1176:7: lv_prePropertyConditions_5_1= ruleSTATECONDITON
            	            {

            	            							newCompositeNode(grammarAccess.getPROPERTYAccess().getPrePropertyConditionsSTATECONDITONParserRuleCall_4_1_0_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_prePropertyConditions_5_1=ruleSTATECONDITON();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            	            							}
            	            							add(
            	            								current,
            	            								"prePropertyConditions",
            	            								lv_prePropertyConditions_5_1,
            	            								"org.xtext.example.mostml.MoStML.STATECONDITON");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMoStML.g:1192:7: lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION
            	            {

            	            							newCompositeNode(grammarAccess.getPROPERTYAccess().getPrePropertyConditionsATTRIBUTECONTIONParserRuleCall_4_1_0_1());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_prePropertyConditions_5_2=ruleATTRIBUTECONTION();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            	            							}
            	            							add(
            	            								current,
            	            								"prePropertyConditions",
            	            								lv_prePropertyConditions_5_2,
            	            								"org.xtext.example.mostml.MoStML.ATTRIBUTECONTION");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalMoStML.g:1208:7: lv_prePropertyConditions_5_3= ruleMODECONDITION
            	            {

            	            							newCompositeNode(grammarAccess.getPROPERTYAccess().getPrePropertyConditionsMODECONDITIONParserRuleCall_4_1_0_2());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_prePropertyConditions_5_3=ruleMODECONDITION();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            	            							}
            	            							add(
            	            								current,
            	            								"prePropertyConditions",
            	            								lv_prePropertyConditions_5_3,
            	            								"org.xtext.example.mostml.MoStML.MODECONDITION");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getPROPERTYAccess().getCommaKeyword_5());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getPROPERTYAccess().getThenKeyword_6());
            		
            // InternalMoStML.g:1235:3: ( ( (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator ) ) )
            // InternalMoStML.g:1236:4: ( (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator ) )
            {
            // InternalMoStML.g:1236:4: ( (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator ) )
            // InternalMoStML.g:1237:5: (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator )
            {
            // InternalMoStML.g:1237:5: (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17||LA24_0==19) ) {
                alt24=1;
            }
            else if ( (LA24_0==18||(LA24_0>=20 && LA24_0<=21)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMoStML.g:1238:6: lv_postOperator_8_1= ruleCTLOperator
                    {

                    						newCompositeNode(grammarAccess.getPROPERTYAccess().getPostOperatorCTLOperatorParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_postOperator_8_1=ruleCTLOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPROPERTYRule());
                    						}
                    						set(
                    							current,
                    							"postOperator",
                    							lv_postOperator_8_1,
                    							"org.xtext.example.mostml.MoStML.CTLOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMoStML.g:1254:6: lv_postOperator_8_2= ruleLTLOperator
                    {

                    						newCompositeNode(grammarAccess.getPROPERTYAccess().getPostOperatorLTLOperatorParserRuleCall_7_0_1());
                    					
                    pushFollow(FOLLOW_17);
                    lv_postOperator_8_2=ruleLTLOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPROPERTYRule());
                    						}
                    						set(
                    							current,
                    							"postOperator",
                    							lv_postOperator_8_2,
                    							"org.xtext.example.mostml.MoStML.LTLOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMoStML.g:1272:3: ( ( (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||(LA26_0>=40 && LA26_0<=43)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMoStML.g:1273:4: ( (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION ) )
            	    {
            	    // InternalMoStML.g:1273:4: ( (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION ) )
            	    // InternalMoStML.g:1274:5: (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION )
            	    {
            	    // InternalMoStML.g:1274:5: (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION )
            	    int alt25=3;
            	    alt25 = dfa25.predict(input);
            	    switch (alt25) {
            	        case 1 :
            	            // InternalMoStML.g:1275:6: lv_postPropertyConditions_9_1= ruleSTATECONDITON
            	            {

            	            						newCompositeNode(grammarAccess.getPROPERTYAccess().getPostPropertyConditionsSTATECONDITONParserRuleCall_8_0_0());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_postPropertyConditions_9_1=ruleSTATECONDITON();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            	            						}
            	            						add(
            	            							current,
            	            							"postPropertyConditions",
            	            							lv_postPropertyConditions_9_1,
            	            							"org.xtext.example.mostml.MoStML.STATECONDITON");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMoStML.g:1291:6: lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION
            	            {

            	            						newCompositeNode(grammarAccess.getPROPERTYAccess().getPostPropertyConditionsATTRIBUTECONTIONParserRuleCall_8_0_1());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_postPropertyConditions_9_2=ruleATTRIBUTECONTION();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            	            						}
            	            						add(
            	            							current,
            	            							"postPropertyConditions",
            	            							lv_postPropertyConditions_9_2,
            	            							"org.xtext.example.mostml.MoStML.ATTRIBUTECONTION");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalMoStML.g:1307:6: lv_postPropertyConditions_9_3= ruleMODECONDITION
            	            {

            	            						newCompositeNode(grammarAccess.getPROPERTYAccess().getPostPropertyConditionsMODECONDITIONParserRuleCall_8_0_2());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_postPropertyConditions_9_3=ruleMODECONDITION();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            	            						}
            	            						add(
            	            							current,
            	            							"postPropertyConditions",
            	            							lv_postPropertyConditions_9_3,
            	            							"org.xtext.example.mostml.MoStML.MODECONDITION");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalMoStML.g:1325:3: ( ( (lv_postRelations_10_0= ruleRELATION ) ) ( ( (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION ) ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=22 && LA28_0<=23)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMoStML.g:1326:4: ( (lv_postRelations_10_0= ruleRELATION ) ) ( ( (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION ) ) )
            	    {
            	    // InternalMoStML.g:1326:4: ( (lv_postRelations_10_0= ruleRELATION ) )
            	    // InternalMoStML.g:1327:5: (lv_postRelations_10_0= ruleRELATION )
            	    {
            	    // InternalMoStML.g:1327:5: (lv_postRelations_10_0= ruleRELATION )
            	    // InternalMoStML.g:1328:6: lv_postRelations_10_0= ruleRELATION
            	    {

            	    						newCompositeNode(grammarAccess.getPROPERTYAccess().getPostRelationsRELATIONParserRuleCall_9_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_postRelations_10_0=ruleRELATION();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            	    						}
            	    						add(
            	    							current,
            	    							"postRelations",
            	    							lv_postRelations_10_0,
            	    							"org.xtext.example.mostml.MoStML.RELATION");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMoStML.g:1345:4: ( ( (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION ) ) )
            	    // InternalMoStML.g:1346:5: ( (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION ) )
            	    {
            	    // InternalMoStML.g:1346:5: ( (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION ) )
            	    // InternalMoStML.g:1347:6: (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION )
            	    {
            	    // InternalMoStML.g:1347:6: (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION )
            	    int alt27=3;
            	    alt27 = dfa27.predict(input);
            	    switch (alt27) {
            	        case 1 :
            	            // InternalMoStML.g:1348:7: lv_postPropertyConditions_11_1= ruleSTATECONDITON
            	            {

            	            							newCompositeNode(grammarAccess.getPROPERTYAccess().getPostPropertyConditionsSTATECONDITONParserRuleCall_9_1_0_0());
            	            						
            	            pushFollow(FOLLOW_18);
            	            lv_postPropertyConditions_11_1=ruleSTATECONDITON();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            	            							}
            	            							add(
            	            								current,
            	            								"postPropertyConditions",
            	            								lv_postPropertyConditions_11_1,
            	            								"org.xtext.example.mostml.MoStML.STATECONDITON");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMoStML.g:1364:7: lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION
            	            {

            	            							newCompositeNode(grammarAccess.getPROPERTYAccess().getPostPropertyConditionsATTRIBUTECONTIONParserRuleCall_9_1_0_1());
            	            						
            	            pushFollow(FOLLOW_18);
            	            lv_postPropertyConditions_11_2=ruleATTRIBUTECONTION();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            	            							}
            	            							add(
            	            								current,
            	            								"postPropertyConditions",
            	            								lv_postPropertyConditions_11_2,
            	            								"org.xtext.example.mostml.MoStML.ATTRIBUTECONTION");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalMoStML.g:1380:7: lv_postPropertyConditions_11_3= ruleMODECONDITION
            	            {

            	            							newCompositeNode(grammarAccess.getPROPERTYAccess().getPostPropertyConditionsMODECONDITIONParserRuleCall_9_1_0_2());
            	            						
            	            pushFollow(FOLLOW_18);
            	            lv_postPropertyConditions_11_3=ruleMODECONDITION();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPROPERTYRule());
            	            							}
            	            							add(
            	            								current,
            	            								"postPropertyConditions",
            	            								lv_postPropertyConditions_11_3,
            	            								"org.xtext.example.mostml.MoStML.MODECONDITION");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_12=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPROPERTYAccess().getFullStopKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePROPERTY"


    // $ANTLR start "entryRuleRANG"
    // InternalMoStML.g:1407:1: entryRuleRANG returns [EObject current=null] : iv_ruleRANG= ruleRANG EOF ;
    public final EObject entryRuleRANG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRANG = null;


        try {
            // InternalMoStML.g:1407:45: (iv_ruleRANG= ruleRANG EOF )
            // InternalMoStML.g:1408:2: iv_ruleRANG= ruleRANG EOF
            {
             newCompositeNode(grammarAccess.getRANGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRANG=ruleRANG();

            state._fsp--;

             current =iv_ruleRANG; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRANG"


    // $ANTLR start "ruleRANG"
    // InternalMoStML.g:1414:1: ruleRANG returns [EObject current=null] : ( ( (lv_compOperator1_0_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound1_1_0= ruleATTRIBUTEVALUE ) ) ( (lv_compOperator2_2_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound2_3_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_4_0= ruleUNIT ) ) ) ;
    public final EObject ruleRANG() throws RecognitionException {
        EObject current = null;

        EObject lv_compOperator1_0_0 = null;

        EObject lv_bound1_1_0 = null;

        EObject lv_compOperator2_2_0 = null;

        EObject lv_bound2_3_0 = null;

        EObject lv_unit_4_0 = null;



        	enterRule();

        try {
            // InternalMoStML.g:1420:2: ( ( ( (lv_compOperator1_0_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound1_1_0= ruleATTRIBUTEVALUE ) ) ( (lv_compOperator2_2_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound2_3_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_4_0= ruleUNIT ) ) ) )
            // InternalMoStML.g:1421:2: ( ( (lv_compOperator1_0_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound1_1_0= ruleATTRIBUTEVALUE ) ) ( (lv_compOperator2_2_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound2_3_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_4_0= ruleUNIT ) ) )
            {
            // InternalMoStML.g:1421:2: ( ( (lv_compOperator1_0_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound1_1_0= ruleATTRIBUTEVALUE ) ) ( (lv_compOperator2_2_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound2_3_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_4_0= ruleUNIT ) ) )
            // InternalMoStML.g:1422:3: ( (lv_compOperator1_0_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound1_1_0= ruleATTRIBUTEVALUE ) ) ( (lv_compOperator2_2_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound2_3_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_4_0= ruleUNIT ) )
            {
            // InternalMoStML.g:1422:3: ( (lv_compOperator1_0_0= ruleCOMPARISONOPERATOR ) )
            // InternalMoStML.g:1423:4: (lv_compOperator1_0_0= ruleCOMPARISONOPERATOR )
            {
            // InternalMoStML.g:1423:4: (lv_compOperator1_0_0= ruleCOMPARISONOPERATOR )
            // InternalMoStML.g:1424:5: lv_compOperator1_0_0= ruleCOMPARISONOPERATOR
            {

            					newCompositeNode(grammarAccess.getRANGAccess().getCompOperator1COMPARISONOPERATORParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_compOperator1_0_0=ruleCOMPARISONOPERATOR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRANGRule());
            					}
            					set(
            						current,
            						"compOperator1",
            						lv_compOperator1_0_0,
            						"org.xtext.example.mostml.MoStML.COMPARISONOPERATOR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoStML.g:1441:3: ( (lv_bound1_1_0= ruleATTRIBUTEVALUE ) )
            // InternalMoStML.g:1442:4: (lv_bound1_1_0= ruleATTRIBUTEVALUE )
            {
            // InternalMoStML.g:1442:4: (lv_bound1_1_0= ruleATTRIBUTEVALUE )
            // InternalMoStML.g:1443:5: lv_bound1_1_0= ruleATTRIBUTEVALUE
            {

            					newCompositeNode(grammarAccess.getRANGAccess().getBound1ATTRIBUTEVALUEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_bound1_1_0=ruleATTRIBUTEVALUE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRANGRule());
            					}
            					set(
            						current,
            						"bound1",
            						lv_bound1_1_0,
            						"org.xtext.example.mostml.MoStML.ATTRIBUTEVALUE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoStML.g:1460:3: ( (lv_compOperator2_2_0= ruleCOMPARISONOPERATOR ) )
            // InternalMoStML.g:1461:4: (lv_compOperator2_2_0= ruleCOMPARISONOPERATOR )
            {
            // InternalMoStML.g:1461:4: (lv_compOperator2_2_0= ruleCOMPARISONOPERATOR )
            // InternalMoStML.g:1462:5: lv_compOperator2_2_0= ruleCOMPARISONOPERATOR
            {

            					newCompositeNode(grammarAccess.getRANGAccess().getCompOperator2COMPARISONOPERATORParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_compOperator2_2_0=ruleCOMPARISONOPERATOR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRANGRule());
            					}
            					set(
            						current,
            						"compOperator2",
            						lv_compOperator2_2_0,
            						"org.xtext.example.mostml.MoStML.COMPARISONOPERATOR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoStML.g:1479:3: ( (lv_bound2_3_0= ruleATTRIBUTEVALUE ) )
            // InternalMoStML.g:1480:4: (lv_bound2_3_0= ruleATTRIBUTEVALUE )
            {
            // InternalMoStML.g:1480:4: (lv_bound2_3_0= ruleATTRIBUTEVALUE )
            // InternalMoStML.g:1481:5: lv_bound2_3_0= ruleATTRIBUTEVALUE
            {

            					newCompositeNode(grammarAccess.getRANGAccess().getBound2ATTRIBUTEVALUEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_bound2_3_0=ruleATTRIBUTEVALUE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRANGRule());
            					}
            					set(
            						current,
            						"bound2",
            						lv_bound2_3_0,
            						"org.xtext.example.mostml.MoStML.ATTRIBUTEVALUE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoStML.g:1498:3: ( (lv_unit_4_0= ruleUNIT ) )
            // InternalMoStML.g:1499:4: (lv_unit_4_0= ruleUNIT )
            {
            // InternalMoStML.g:1499:4: (lv_unit_4_0= ruleUNIT )
            // InternalMoStML.g:1500:5: lv_unit_4_0= ruleUNIT
            {

            					newCompositeNode(grammarAccess.getRANGAccess().getUnitUNITParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_4_0=ruleUNIT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRANGRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_4_0,
            						"org.xtext.example.mostml.MoStML.UNIT");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRANG"


    // $ANTLR start "entryRuleCTLOperator"
    // InternalMoStML.g:1521:1: entryRuleCTLOperator returns [EObject current=null] : iv_ruleCTLOperator= ruleCTLOperator EOF ;
    public final EObject entryRuleCTLOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCTLOperator = null;


        try {
            // InternalMoStML.g:1521:52: (iv_ruleCTLOperator= ruleCTLOperator EOF )
            // InternalMoStML.g:1522:2: iv_ruleCTLOperator= ruleCTLOperator EOF
            {
             newCompositeNode(grammarAccess.getCTLOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCTLOperator=ruleCTLOperator();

            state._fsp--;

             current =iv_ruleCTLOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCTLOperator"


    // $ANTLR start "ruleCTLOperator"
    // InternalMoStML.g:1528:1: ruleCTLOperator returns [EObject current=null] : (this_AG_0= ruleAG | this_AF_1= ruleAF | this_EF_2= ruleEF | this_EG_3= ruleEG | this_AX_4= ruleAX ) ;
    public final EObject ruleCTLOperator() throws RecognitionException {
        EObject current = null;

        EObject this_AG_0 = null;

        EObject this_AF_1 = null;

        EObject this_EF_2 = null;

        EObject this_EG_3 = null;

        EObject this_AX_4 = null;



        	enterRule();

        try {
            // InternalMoStML.g:1534:2: ( (this_AG_0= ruleAG | this_AF_1= ruleAF | this_EF_2= ruleEF | this_EG_3= ruleEG | this_AX_4= ruleAX ) )
            // InternalMoStML.g:1535:2: (this_AG_0= ruleAG | this_AF_1= ruleAF | this_EF_2= ruleEF | this_EG_3= ruleEG | this_AX_4= ruleAX )
            {
            // InternalMoStML.g:1535:2: (this_AG_0= ruleAG | this_AF_1= ruleAF | this_EF_2= ruleEF | this_EG_3= ruleEG | this_AX_4= ruleAX )
            int alt29=5;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt29=5;
                    }
                    break;
                case 21:
                    {
                    alt29=2;
                    }
                    break;
                case 20:
                    {
                    alt29=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA29_0==19) ) {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==20) ) {
                    alt29=4;
                }
                else if ( (LA29_2==21) ) {
                    alt29=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMoStML.g:1536:3: this_AG_0= ruleAG
                    {

                    			newCompositeNode(grammarAccess.getCTLOperatorAccess().getAGParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AG_0=ruleAG();

                    state._fsp--;


                    			current = this_AG_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoStML.g:1545:3: this_AF_1= ruleAF
                    {

                    			newCompositeNode(grammarAccess.getCTLOperatorAccess().getAFParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AF_1=ruleAF();

                    state._fsp--;


                    			current = this_AF_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoStML.g:1554:3: this_EF_2= ruleEF
                    {

                    			newCompositeNode(grammarAccess.getCTLOperatorAccess().getEFParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EF_2=ruleEF();

                    state._fsp--;


                    			current = this_EF_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMoStML.g:1563:3: this_EG_3= ruleEG
                    {

                    			newCompositeNode(grammarAccess.getCTLOperatorAccess().getEGParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EG_3=ruleEG();

                    state._fsp--;


                    			current = this_EG_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMoStML.g:1572:3: this_AX_4= ruleAX
                    {

                    			newCompositeNode(grammarAccess.getCTLOperatorAccess().getAXParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AX_4=ruleAX();

                    state._fsp--;


                    			current = this_AX_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCTLOperator"


    // $ANTLR start "entryRuleAX"
    // InternalMoStML.g:1584:1: entryRuleAX returns [EObject current=null] : iv_ruleAX= ruleAX EOF ;
    public final EObject entryRuleAX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAX = null;


        try {
            // InternalMoStML.g:1584:43: (iv_ruleAX= ruleAX EOF )
            // InternalMoStML.g:1585:2: iv_ruleAX= ruleAX EOF
            {
             newCompositeNode(grammarAccess.getAXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAX=ruleAX();

            state._fsp--;

             current =iv_ruleAX; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAX"


    // $ANTLR start "ruleAX"
    // InternalMoStML.g:1591:1: ruleAX returns [EObject current=null] : ( ( (lv_ax_0_0= 'all' ) ) otherlv_1= 'next' ) ;
    public final EObject ruleAX() throws RecognitionException {
        EObject current = null;

        Token lv_ax_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:1597:2: ( ( ( (lv_ax_0_0= 'all' ) ) otherlv_1= 'next' ) )
            // InternalMoStML.g:1598:2: ( ( (lv_ax_0_0= 'all' ) ) otherlv_1= 'next' )
            {
            // InternalMoStML.g:1598:2: ( ( (lv_ax_0_0= 'all' ) ) otherlv_1= 'next' )
            // InternalMoStML.g:1599:3: ( (lv_ax_0_0= 'all' ) ) otherlv_1= 'next'
            {
            // InternalMoStML.g:1599:3: ( (lv_ax_0_0= 'all' ) )
            // InternalMoStML.g:1600:4: (lv_ax_0_0= 'all' )
            {
            // InternalMoStML.g:1600:4: (lv_ax_0_0= 'all' )
            // InternalMoStML.g:1601:5: lv_ax_0_0= 'all'
            {
            lv_ax_0_0=(Token)match(input,17,FOLLOW_20); 

            					newLeafNode(lv_ax_0_0, grammarAccess.getAXAccess().getAxAllKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAXRule());
            					}
            					setWithLastConsumed(current, "ax", lv_ax_0_0, "all");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAXAccess().getNextKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAX"


    // $ANTLR start "entryRuleEG"
    // InternalMoStML.g:1621:1: entryRuleEG returns [EObject current=null] : iv_ruleEG= ruleEG EOF ;
    public final EObject entryRuleEG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEG = null;


        try {
            // InternalMoStML.g:1621:43: (iv_ruleEG= ruleEG EOF )
            // InternalMoStML.g:1622:2: iv_ruleEG= ruleEG EOF
            {
             newCompositeNode(grammarAccess.getEGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEG=ruleEG();

            state._fsp--;

             current =iv_ruleEG; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEG"


    // $ANTLR start "ruleEG"
    // InternalMoStML.g:1628:1: ruleEG returns [EObject current=null] : ( ( (lv_eg_0_0= 'exist' ) ) otherlv_1= 'globally' ) ;
    public final EObject ruleEG() throws RecognitionException {
        EObject current = null;

        Token lv_eg_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:1634:2: ( ( ( (lv_eg_0_0= 'exist' ) ) otherlv_1= 'globally' ) )
            // InternalMoStML.g:1635:2: ( ( (lv_eg_0_0= 'exist' ) ) otherlv_1= 'globally' )
            {
            // InternalMoStML.g:1635:2: ( ( (lv_eg_0_0= 'exist' ) ) otherlv_1= 'globally' )
            // InternalMoStML.g:1636:3: ( (lv_eg_0_0= 'exist' ) ) otherlv_1= 'globally'
            {
            // InternalMoStML.g:1636:3: ( (lv_eg_0_0= 'exist' ) )
            // InternalMoStML.g:1637:4: (lv_eg_0_0= 'exist' )
            {
            // InternalMoStML.g:1637:4: (lv_eg_0_0= 'exist' )
            // InternalMoStML.g:1638:5: lv_eg_0_0= 'exist'
            {
            lv_eg_0_0=(Token)match(input,19,FOLLOW_21); 

            					newLeafNode(lv_eg_0_0, grammarAccess.getEGAccess().getEgExistKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEGRule());
            					}
            					setWithLastConsumed(current, "eg", lv_eg_0_0, "exist");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEGAccess().getGloballyKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEG"


    // $ANTLR start "entryRuleEF"
    // InternalMoStML.g:1658:1: entryRuleEF returns [EObject current=null] : iv_ruleEF= ruleEF EOF ;
    public final EObject entryRuleEF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEF = null;


        try {
            // InternalMoStML.g:1658:43: (iv_ruleEF= ruleEF EOF )
            // InternalMoStML.g:1659:2: iv_ruleEF= ruleEF EOF
            {
             newCompositeNode(grammarAccess.getEFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEF=ruleEF();

            state._fsp--;

             current =iv_ruleEF; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEF"


    // $ANTLR start "ruleEF"
    // InternalMoStML.g:1665:1: ruleEF returns [EObject current=null] : ( ( (lv_ef_0_0= 'exist' ) ) otherlv_1= 'future' ) ;
    public final EObject ruleEF() throws RecognitionException {
        EObject current = null;

        Token lv_ef_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:1671:2: ( ( ( (lv_ef_0_0= 'exist' ) ) otherlv_1= 'future' ) )
            // InternalMoStML.g:1672:2: ( ( (lv_ef_0_0= 'exist' ) ) otherlv_1= 'future' )
            {
            // InternalMoStML.g:1672:2: ( ( (lv_ef_0_0= 'exist' ) ) otherlv_1= 'future' )
            // InternalMoStML.g:1673:3: ( (lv_ef_0_0= 'exist' ) ) otherlv_1= 'future'
            {
            // InternalMoStML.g:1673:3: ( (lv_ef_0_0= 'exist' ) )
            // InternalMoStML.g:1674:4: (lv_ef_0_0= 'exist' )
            {
            // InternalMoStML.g:1674:4: (lv_ef_0_0= 'exist' )
            // InternalMoStML.g:1675:5: lv_ef_0_0= 'exist'
            {
            lv_ef_0_0=(Token)match(input,19,FOLLOW_22); 

            					newLeafNode(lv_ef_0_0, grammarAccess.getEFAccess().getEfExistKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEFRule());
            					}
            					setWithLastConsumed(current, "ef", lv_ef_0_0, "exist");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEFAccess().getFutureKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEF"


    // $ANTLR start "entryRuleAF"
    // InternalMoStML.g:1695:1: entryRuleAF returns [EObject current=null] : iv_ruleAF= ruleAF EOF ;
    public final EObject entryRuleAF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAF = null;


        try {
            // InternalMoStML.g:1695:43: (iv_ruleAF= ruleAF EOF )
            // InternalMoStML.g:1696:2: iv_ruleAF= ruleAF EOF
            {
             newCompositeNode(grammarAccess.getAFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAF=ruleAF();

            state._fsp--;

             current =iv_ruleAF; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAF"


    // $ANTLR start "ruleAF"
    // InternalMoStML.g:1702:1: ruleAF returns [EObject current=null] : ( ( (lv_af_0_0= 'all' ) ) otherlv_1= 'future' ) ;
    public final EObject ruleAF() throws RecognitionException {
        EObject current = null;

        Token lv_af_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:1708:2: ( ( ( (lv_af_0_0= 'all' ) ) otherlv_1= 'future' ) )
            // InternalMoStML.g:1709:2: ( ( (lv_af_0_0= 'all' ) ) otherlv_1= 'future' )
            {
            // InternalMoStML.g:1709:2: ( ( (lv_af_0_0= 'all' ) ) otherlv_1= 'future' )
            // InternalMoStML.g:1710:3: ( (lv_af_0_0= 'all' ) ) otherlv_1= 'future'
            {
            // InternalMoStML.g:1710:3: ( (lv_af_0_0= 'all' ) )
            // InternalMoStML.g:1711:4: (lv_af_0_0= 'all' )
            {
            // InternalMoStML.g:1711:4: (lv_af_0_0= 'all' )
            // InternalMoStML.g:1712:5: lv_af_0_0= 'all'
            {
            lv_af_0_0=(Token)match(input,17,FOLLOW_22); 

            					newLeafNode(lv_af_0_0, grammarAccess.getAFAccess().getAfAllKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAFRule());
            					}
            					setWithLastConsumed(current, "af", lv_af_0_0, "all");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAFAccess().getFutureKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAF"


    // $ANTLR start "entryRuleAG"
    // InternalMoStML.g:1732:1: entryRuleAG returns [EObject current=null] : iv_ruleAG= ruleAG EOF ;
    public final EObject entryRuleAG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAG = null;


        try {
            // InternalMoStML.g:1732:43: (iv_ruleAG= ruleAG EOF )
            // InternalMoStML.g:1733:2: iv_ruleAG= ruleAG EOF
            {
             newCompositeNode(grammarAccess.getAGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAG=ruleAG();

            state._fsp--;

             current =iv_ruleAG; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAG"


    // $ANTLR start "ruleAG"
    // InternalMoStML.g:1739:1: ruleAG returns [EObject current=null] : ( ( (lv_ag_0_0= 'all' ) ) otherlv_1= 'globally' ) ;
    public final EObject ruleAG() throws RecognitionException {
        EObject current = null;

        Token lv_ag_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:1745:2: ( ( ( (lv_ag_0_0= 'all' ) ) otherlv_1= 'globally' ) )
            // InternalMoStML.g:1746:2: ( ( (lv_ag_0_0= 'all' ) ) otherlv_1= 'globally' )
            {
            // InternalMoStML.g:1746:2: ( ( (lv_ag_0_0= 'all' ) ) otherlv_1= 'globally' )
            // InternalMoStML.g:1747:3: ( (lv_ag_0_0= 'all' ) ) otherlv_1= 'globally'
            {
            // InternalMoStML.g:1747:3: ( (lv_ag_0_0= 'all' ) )
            // InternalMoStML.g:1748:4: (lv_ag_0_0= 'all' )
            {
            // InternalMoStML.g:1748:4: (lv_ag_0_0= 'all' )
            // InternalMoStML.g:1749:5: lv_ag_0_0= 'all'
            {
            lv_ag_0_0=(Token)match(input,17,FOLLOW_21); 

            					newLeafNode(lv_ag_0_0, grammarAccess.getAGAccess().getAgAllKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAGRule());
            					}
            					setWithLastConsumed(current, "ag", lv_ag_0_0, "all");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAGAccess().getGloballyKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAG"


    // $ANTLR start "entryRuleLTLOperator"
    // InternalMoStML.g:1769:1: entryRuleLTLOperator returns [EObject current=null] : iv_ruleLTLOperator= ruleLTLOperator EOF ;
    public final EObject entryRuleLTLOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLTLOperator = null;


        try {
            // InternalMoStML.g:1769:52: (iv_ruleLTLOperator= ruleLTLOperator EOF )
            // InternalMoStML.g:1770:2: iv_ruleLTLOperator= ruleLTLOperator EOF
            {
             newCompositeNode(grammarAccess.getLTLOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLTLOperator=ruleLTLOperator();

            state._fsp--;

             current =iv_ruleLTLOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLTLOperator"


    // $ANTLR start "ruleLTLOperator"
    // InternalMoStML.g:1776:1: ruleLTLOperator returns [EObject current=null] : (this_F_0= ruleF | this_G_1= ruleG | this_X_2= ruleX ) ;
    public final EObject ruleLTLOperator() throws RecognitionException {
        EObject current = null;

        EObject this_F_0 = null;

        EObject this_G_1 = null;

        EObject this_X_2 = null;



        	enterRule();

        try {
            // InternalMoStML.g:1782:2: ( (this_F_0= ruleF | this_G_1= ruleG | this_X_2= ruleX ) )
            // InternalMoStML.g:1783:2: (this_F_0= ruleF | this_G_1= ruleG | this_X_2= ruleX )
            {
            // InternalMoStML.g:1783:2: (this_F_0= ruleF | this_G_1= ruleG | this_X_2= ruleX )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt30=1;
                }
                break;
            case 20:
                {
                alt30=2;
                }
                break;
            case 18:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMoStML.g:1784:3: this_F_0= ruleF
                    {

                    			newCompositeNode(grammarAccess.getLTLOperatorAccess().getFParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_F_0=ruleF();

                    state._fsp--;


                    			current = this_F_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoStML.g:1793:3: this_G_1= ruleG
                    {

                    			newCompositeNode(grammarAccess.getLTLOperatorAccess().getGParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_G_1=ruleG();

                    state._fsp--;


                    			current = this_G_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoStML.g:1802:3: this_X_2= ruleX
                    {

                    			newCompositeNode(grammarAccess.getLTLOperatorAccess().getXParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_X_2=ruleX();

                    state._fsp--;


                    			current = this_X_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLTLOperator"


    // $ANTLR start "entryRuleF"
    // InternalMoStML.g:1814:1: entryRuleF returns [EObject current=null] : iv_ruleF= ruleF EOF ;
    public final EObject entryRuleF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleF = null;


        try {
            // InternalMoStML.g:1814:42: (iv_ruleF= ruleF EOF )
            // InternalMoStML.g:1815:2: iv_ruleF= ruleF EOF
            {
             newCompositeNode(grammarAccess.getFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleF=ruleF();

            state._fsp--;

             current =iv_ruleF; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleF"


    // $ANTLR start "ruleF"
    // InternalMoStML.g:1821:1: ruleF returns [EObject current=null] : ( (lv_f_0_0= 'future' ) ) ;
    public final EObject ruleF() throws RecognitionException {
        EObject current = null;

        Token lv_f_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:1827:2: ( ( (lv_f_0_0= 'future' ) ) )
            // InternalMoStML.g:1828:2: ( (lv_f_0_0= 'future' ) )
            {
            // InternalMoStML.g:1828:2: ( (lv_f_0_0= 'future' ) )
            // InternalMoStML.g:1829:3: (lv_f_0_0= 'future' )
            {
            // InternalMoStML.g:1829:3: (lv_f_0_0= 'future' )
            // InternalMoStML.g:1830:4: lv_f_0_0= 'future'
            {
            lv_f_0_0=(Token)match(input,21,FOLLOW_2); 

            				newLeafNode(lv_f_0_0, grammarAccess.getFAccess().getFFutureKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFRule());
            				}
            				setWithLastConsumed(current, "f", lv_f_0_0, "future");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleF"


    // $ANTLR start "entryRuleG"
    // InternalMoStML.g:1845:1: entryRuleG returns [EObject current=null] : iv_ruleG= ruleG EOF ;
    public final EObject entryRuleG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleG = null;


        try {
            // InternalMoStML.g:1845:42: (iv_ruleG= ruleG EOF )
            // InternalMoStML.g:1846:2: iv_ruleG= ruleG EOF
            {
             newCompositeNode(grammarAccess.getGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleG=ruleG();

            state._fsp--;

             current =iv_ruleG; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleG"


    // $ANTLR start "ruleG"
    // InternalMoStML.g:1852:1: ruleG returns [EObject current=null] : ( (lv_g_0_0= 'globally' ) ) ;
    public final EObject ruleG() throws RecognitionException {
        EObject current = null;

        Token lv_g_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:1858:2: ( ( (lv_g_0_0= 'globally' ) ) )
            // InternalMoStML.g:1859:2: ( (lv_g_0_0= 'globally' ) )
            {
            // InternalMoStML.g:1859:2: ( (lv_g_0_0= 'globally' ) )
            // InternalMoStML.g:1860:3: (lv_g_0_0= 'globally' )
            {
            // InternalMoStML.g:1860:3: (lv_g_0_0= 'globally' )
            // InternalMoStML.g:1861:4: lv_g_0_0= 'globally'
            {
            lv_g_0_0=(Token)match(input,20,FOLLOW_2); 

            				newLeafNode(lv_g_0_0, grammarAccess.getGAccess().getGGloballyKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGRule());
            				}
            				setWithLastConsumed(current, "g", lv_g_0_0, "globally");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleG"


    // $ANTLR start "entryRuleX"
    // InternalMoStML.g:1876:1: entryRuleX returns [EObject current=null] : iv_ruleX= ruleX EOF ;
    public final EObject entryRuleX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX = null;


        try {
            // InternalMoStML.g:1876:42: (iv_ruleX= ruleX EOF )
            // InternalMoStML.g:1877:2: iv_ruleX= ruleX EOF
            {
             newCompositeNode(grammarAccess.getXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleX=ruleX();

            state._fsp--;

             current =iv_ruleX; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleX"


    // $ANTLR start "ruleX"
    // InternalMoStML.g:1883:1: ruleX returns [EObject current=null] : ( (lv_x_0_0= 'next' ) ) ;
    public final EObject ruleX() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:1889:2: ( ( (lv_x_0_0= 'next' ) ) )
            // InternalMoStML.g:1890:2: ( (lv_x_0_0= 'next' ) )
            {
            // InternalMoStML.g:1890:2: ( (lv_x_0_0= 'next' ) )
            // InternalMoStML.g:1891:3: (lv_x_0_0= 'next' )
            {
            // InternalMoStML.g:1891:3: (lv_x_0_0= 'next' )
            // InternalMoStML.g:1892:4: lv_x_0_0= 'next'
            {
            lv_x_0_0=(Token)match(input,18,FOLLOW_2); 

            				newLeafNode(lv_x_0_0, grammarAccess.getXAccess().getXNextKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getXRule());
            				}
            				setWithLastConsumed(current, "x", lv_x_0_0, "next");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleX"


    // $ANTLR start "entryRuleRELATION"
    // InternalMoStML.g:1907:1: entryRuleRELATION returns [EObject current=null] : iv_ruleRELATION= ruleRELATION EOF ;
    public final EObject entryRuleRELATION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRELATION = null;


        try {
            // InternalMoStML.g:1907:49: (iv_ruleRELATION= ruleRELATION EOF )
            // InternalMoStML.g:1908:2: iv_ruleRELATION= ruleRELATION EOF
            {
             newCompositeNode(grammarAccess.getRELATIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRELATION=ruleRELATION();

            state._fsp--;

             current =iv_ruleRELATION; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRELATION"


    // $ANTLR start "ruleRELATION"
    // InternalMoStML.g:1914:1: ruleRELATION returns [EObject current=null] : ( ( (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' ) ) ) ;
    public final EObject ruleRELATION() throws RecognitionException {
        EObject current = null;

        Token lv_relaion_0_1=null;
        Token lv_relaion_0_2=null;


        	enterRule();

        try {
            // InternalMoStML.g:1920:2: ( ( ( (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' ) ) ) )
            // InternalMoStML.g:1921:2: ( ( (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' ) ) )
            {
            // InternalMoStML.g:1921:2: ( ( (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' ) ) )
            // InternalMoStML.g:1922:3: ( (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' ) )
            {
            // InternalMoStML.g:1922:3: ( (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' ) )
            // InternalMoStML.g:1923:4: (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' )
            {
            // InternalMoStML.g:1923:4: (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            else if ( (LA31_0==23) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMoStML.g:1924:5: lv_relaion_0_1= 'and'
                    {
                    lv_relaion_0_1=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_relaion_0_1, grammarAccess.getRELATIONAccess().getRelaionAndKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRELATIONRule());
                    					}
                    					setWithLastConsumed(current, "relaion", lv_relaion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMoStML.g:1935:5: lv_relaion_0_2= 'or'
                    {
                    lv_relaion_0_2=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_relaion_0_2, grammarAccess.getRELATIONAccess().getRelaionOrKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRELATIONRule());
                    					}
                    					setWithLastConsumed(current, "relaion", lv_relaion_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRELATION"


    // $ANTLR start "entryRuleSIGNALCONDITION"
    // InternalMoStML.g:1951:1: entryRuleSIGNALCONDITION returns [EObject current=null] : iv_ruleSIGNALCONDITION= ruleSIGNALCONDITION EOF ;
    public final EObject entryRuleSIGNALCONDITION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSIGNALCONDITION = null;


        try {
            // InternalMoStML.g:1951:56: (iv_ruleSIGNALCONDITION= ruleSIGNALCONDITION EOF )
            // InternalMoStML.g:1952:2: iv_ruleSIGNALCONDITION= ruleSIGNALCONDITION EOF
            {
             newCompositeNode(grammarAccess.getSIGNALCONDITIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSIGNALCONDITION=ruleSIGNALCONDITION();

            state._fsp--;

             current =iv_ruleSIGNALCONDITION; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSIGNALCONDITION"


    // $ANTLR start "ruleSIGNALCONDITION"
    // InternalMoStML.g:1958:1: ruleSIGNALCONDITION returns [EObject current=null] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'receives' ( (lv_signalName_3_0= RULE_ID ) ) this_ID_4= RULE_ID ) ;
    public final EObject ruleSIGNALCONDITION() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token lv_signalName_3_0=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalMoStML.g:1964:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'receives' ( (lv_signalName_3_0= RULE_ID ) ) this_ID_4= RULE_ID ) )
            // InternalMoStML.g:1965:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'receives' ( (lv_signalName_3_0= RULE_ID ) ) this_ID_4= RULE_ID )
            {
            // InternalMoStML.g:1965:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'receives' ( (lv_signalName_3_0= RULE_ID ) ) this_ID_4= RULE_ID )
            // InternalMoStML.g:1966:3: this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'receives' ( (lv_signalName_3_0= RULE_ID ) ) this_ID_4= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            			newLeafNode(this_ID_0, grammarAccess.getSIGNALCONDITIONAccess().getIDTerminalRuleCall_0());
            		
            // InternalMoStML.g:1970:3: (this_ID_1= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMoStML.g:1971:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    				newLeafNode(this_ID_1, grammarAccess.getSIGNALCONDITIONAccess().getIDTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSIGNALCONDITIONAccess().getReceivesKeyword_2());
            		
            // InternalMoStML.g:1980:3: ( (lv_signalName_3_0= RULE_ID ) )
            // InternalMoStML.g:1981:4: (lv_signalName_3_0= RULE_ID )
            {
            // InternalMoStML.g:1981:4: (lv_signalName_3_0= RULE_ID )
            // InternalMoStML.g:1982:5: lv_signalName_3_0= RULE_ID
            {
            lv_signalName_3_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_signalName_3_0, grammarAccess.getSIGNALCONDITIONAccess().getSignalNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSIGNALCONDITIONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"signalName",
            						lv_signalName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(this_ID_4, grammarAccess.getSIGNALCONDITIONAccess().getIDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSIGNALCONDITION"


    // $ANTLR start "entryRuleReqID"
    // InternalMoStML.g:2006:1: entryRuleReqID returns [EObject current=null] : iv_ruleReqID= ruleReqID EOF ;
    public final EObject entryRuleReqID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqID = null;


        try {
            // InternalMoStML.g:2006:46: (iv_ruleReqID= ruleReqID EOF )
            // InternalMoStML.g:2007:2: iv_ruleReqID= ruleReqID EOF
            {
             newCompositeNode(grammarAccess.getReqIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReqID=ruleReqID();

            state._fsp--;

             current =iv_ruleReqID; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReqID"


    // $ANTLR start "ruleReqID"
    // InternalMoStML.g:2013:1: ruleReqID returns [EObject current=null] : (otherlv_0= '[' ( (lv_reqID_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_reqID_3_0= RULE_INT ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleReqID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_reqID_1_0=null;
        Token otherlv_2=null;
        Token lv_reqID_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMoStML.g:2019:2: ( (otherlv_0= '[' ( (lv_reqID_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_reqID_3_0= RULE_INT ) ) )* otherlv_4= ']' ) )
            // InternalMoStML.g:2020:2: (otherlv_0= '[' ( (lv_reqID_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_reqID_3_0= RULE_INT ) ) )* otherlv_4= ']' )
            {
            // InternalMoStML.g:2020:2: (otherlv_0= '[' ( (lv_reqID_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_reqID_3_0= RULE_INT ) ) )* otherlv_4= ']' )
            // InternalMoStML.g:2021:3: otherlv_0= '[' ( (lv_reqID_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_reqID_3_0= RULE_INT ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getReqIDAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMoStML.g:2025:3: ( (lv_reqID_1_0= RULE_INT ) )
            // InternalMoStML.g:2026:4: (lv_reqID_1_0= RULE_INT )
            {
            // InternalMoStML.g:2026:4: (lv_reqID_1_0= RULE_INT )
            // InternalMoStML.g:2027:5: lv_reqID_1_0= RULE_INT
            {
            lv_reqID_1_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_reqID_1_0, grammarAccess.getReqIDAccess().getReqIDINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReqIDRule());
            					}
            					addWithLastConsumed(
            						current,
            						"reqID",
            						lv_reqID_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMoStML.g:2043:3: (otherlv_2= '.' ( (lv_reqID_3_0= RULE_INT ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==11) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMoStML.g:2044:4: otherlv_2= '.' ( (lv_reqID_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,11,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getReqIDAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalMoStML.g:2048:4: ( (lv_reqID_3_0= RULE_INT ) )
            	    // InternalMoStML.g:2049:5: (lv_reqID_3_0= RULE_INT )
            	    {
            	    // InternalMoStML.g:2049:5: (lv_reqID_3_0= RULE_INT )
            	    // InternalMoStML.g:2050:6: lv_reqID_3_0= RULE_INT
            	    {
            	    lv_reqID_3_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            	    						newLeafNode(lv_reqID_3_0, grammarAccess.getReqIDAccess().getReqIDINTTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getReqIDRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"reqID",
            	    							lv_reqID_3_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReqIDAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReqID"


    // $ANTLR start "entryRuleATTRIBUTECONTION"
    // InternalMoStML.g:2075:1: entryRuleATTRIBUTECONTION returns [EObject current=null] : iv_ruleATTRIBUTECONTION= ruleATTRIBUTECONTION EOF ;
    public final EObject entryRuleATTRIBUTECONTION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATTRIBUTECONTION = null;


        try {
            // InternalMoStML.g:2075:57: (iv_ruleATTRIBUTECONTION= ruleATTRIBUTECONTION EOF )
            // InternalMoStML.g:2076:2: iv_ruleATTRIBUTECONTION= ruleATTRIBUTECONTION EOF
            {
             newCompositeNode(grammarAccess.getATTRIBUTECONTIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleATTRIBUTECONTION=ruleATTRIBUTECONTION();

            state._fsp--;

             current =iv_ruleATTRIBUTECONTION; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleATTRIBUTECONTION"


    // $ANTLR start "ruleATTRIBUTECONTION"
    // InternalMoStML.g:2082:1: ruleATTRIBUTECONTION returns [EObject current=null] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ( (lv_attributeName_2_0= RULE_ID ) ) this_ID_3= RULE_ID ( (lv_operator_4_0= ruleCOMPARISONOPERATOR ) ) ( (lv_attributeValue_5_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_6_0= ruleUNIT ) )* ) ;
    public final EObject ruleATTRIBUTECONTION() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token lv_attributeName_2_0=null;
        Token this_ID_3=null;
        EObject lv_operator_4_0 = null;

        EObject lv_attributeValue_5_0 = null;

        EObject lv_unit_6_0 = null;



        	enterRule();

        try {
            // InternalMoStML.g:2088:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ( (lv_attributeName_2_0= RULE_ID ) ) this_ID_3= RULE_ID ( (lv_operator_4_0= ruleCOMPARISONOPERATOR ) ) ( (lv_attributeValue_5_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_6_0= ruleUNIT ) )* ) )
            // InternalMoStML.g:2089:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ( (lv_attributeName_2_0= RULE_ID ) ) this_ID_3= RULE_ID ( (lv_operator_4_0= ruleCOMPARISONOPERATOR ) ) ( (lv_attributeValue_5_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_6_0= ruleUNIT ) )* )
            {
            // InternalMoStML.g:2089:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ( (lv_attributeName_2_0= RULE_ID ) ) this_ID_3= RULE_ID ( (lv_operator_4_0= ruleCOMPARISONOPERATOR ) ) ( (lv_attributeValue_5_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_6_0= ruleUNIT ) )* )
            // InternalMoStML.g:2090:3: this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ( (lv_attributeName_2_0= RULE_ID ) ) this_ID_3= RULE_ID ( (lv_operator_4_0= ruleCOMPARISONOPERATOR ) ) ( (lv_attributeValue_5_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_6_0= ruleUNIT ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(this_ID_0, grammarAccess.getATTRIBUTECONTIONAccess().getIDTerminalRuleCall_0());
            		
            // InternalMoStML.g:2094:3: (this_ID_1= RULE_ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==RULE_ID) ) {
                        int LA34_2 = input.LA(3);

                        if ( (LA34_2==RULE_ID) ) {
                            alt34=1;
                        }


                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalMoStML.g:2095:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    				newLeafNode(this_ID_1, grammarAccess.getATTRIBUTECONTIONAccess().getIDTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // InternalMoStML.g:2100:3: ( (lv_attributeName_2_0= RULE_ID ) )
            // InternalMoStML.g:2101:4: (lv_attributeName_2_0= RULE_ID )
            {
            // InternalMoStML.g:2101:4: (lv_attributeName_2_0= RULE_ID )
            // InternalMoStML.g:2102:5: lv_attributeName_2_0= RULE_ID
            {
            lv_attributeName_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_attributeName_2_0, grammarAccess.getATTRIBUTECONTIONAccess().getAttributeNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getATTRIBUTECONTIONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attributeName",
            						lv_attributeName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(this_ID_3, grammarAccess.getATTRIBUTECONTIONAccess().getIDTerminalRuleCall_3());
            		
            // InternalMoStML.g:2122:3: ( (lv_operator_4_0= ruleCOMPARISONOPERATOR ) )
            // InternalMoStML.g:2123:4: (lv_operator_4_0= ruleCOMPARISONOPERATOR )
            {
            // InternalMoStML.g:2123:4: (lv_operator_4_0= ruleCOMPARISONOPERATOR )
            // InternalMoStML.g:2124:5: lv_operator_4_0= ruleCOMPARISONOPERATOR
            {

            					newCompositeNode(grammarAccess.getATTRIBUTECONTIONAccess().getOperatorCOMPARISONOPERATORParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_operator_4_0=ruleCOMPARISONOPERATOR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATTRIBUTECONTIONRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_4_0,
            						"org.xtext.example.mostml.MoStML.COMPARISONOPERATOR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoStML.g:2141:3: ( (lv_attributeValue_5_0= ruleATTRIBUTEVALUE ) )
            // InternalMoStML.g:2142:4: (lv_attributeValue_5_0= ruleATTRIBUTEVALUE )
            {
            // InternalMoStML.g:2142:4: (lv_attributeValue_5_0= ruleATTRIBUTEVALUE )
            // InternalMoStML.g:2143:5: lv_attributeValue_5_0= ruleATTRIBUTEVALUE
            {

            					newCompositeNode(grammarAccess.getATTRIBUTECONTIONAccess().getAttributeValueATTRIBUTEVALUEParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
            lv_attributeValue_5_0=ruleATTRIBUTEVALUE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATTRIBUTECONTIONRule());
            					}
            					set(
            						current,
            						"attributeValue",
            						lv_attributeValue_5_0,
            						"org.xtext.example.mostml.MoStML.ATTRIBUTEVALUE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoStML.g:2160:3: ( (lv_unit_6_0= ruleUNIT ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=27 && LA35_0<=29)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMoStML.g:2161:4: (lv_unit_6_0= ruleUNIT )
            	    {
            	    // InternalMoStML.g:2161:4: (lv_unit_6_0= ruleUNIT )
            	    // InternalMoStML.g:2162:5: lv_unit_6_0= ruleUNIT
            	    {

            	    					newCompositeNode(grammarAccess.getATTRIBUTECONTIONAccess().getUnitUNITParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_unit_6_0=ruleUNIT();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getATTRIBUTECONTIONRule());
            	    					}
            	    					add(
            	    						current,
            	    						"unit",
            	    						lv_unit_6_0,
            	    						"org.xtext.example.mostml.MoStML.UNIT");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleATTRIBUTECONTION"


    // $ANTLR start "entryRuleUNIT"
    // InternalMoStML.g:2183:1: entryRuleUNIT returns [EObject current=null] : iv_ruleUNIT= ruleUNIT EOF ;
    public final EObject entryRuleUNIT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNIT = null;


        try {
            // InternalMoStML.g:2183:45: (iv_ruleUNIT= ruleUNIT EOF )
            // InternalMoStML.g:2184:2: iv_ruleUNIT= ruleUNIT EOF
            {
             newCompositeNode(grammarAccess.getUNITRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNIT=ruleUNIT();

            state._fsp--;

             current =iv_ruleUNIT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUNIT"


    // $ANTLR start "ruleUNIT"
    // InternalMoStML.g:2190:1: ruleUNIT returns [EObject current=null] : (this_SPEED_0= ruleSPEED | this_TIME_1= ruleTIME | this_WEIGHT_2= ruleWEIGHT ) ;
    public final EObject ruleUNIT() throws RecognitionException {
        EObject current = null;

        EObject this_SPEED_0 = null;

        EObject this_TIME_1 = null;

        EObject this_WEIGHT_2 = null;



        	enterRule();

        try {
            // InternalMoStML.g:2196:2: ( (this_SPEED_0= ruleSPEED | this_TIME_1= ruleTIME | this_WEIGHT_2= ruleWEIGHT ) )
            // InternalMoStML.g:2197:2: (this_SPEED_0= ruleSPEED | this_TIME_1= ruleTIME | this_WEIGHT_2= ruleWEIGHT )
            {
            // InternalMoStML.g:2197:2: (this_SPEED_0= ruleSPEED | this_TIME_1= ruleTIME | this_WEIGHT_2= ruleWEIGHT )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt36=1;
                }
                break;
            case 28:
                {
                alt36=2;
                }
                break;
            case 27:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalMoStML.g:2198:3: this_SPEED_0= ruleSPEED
                    {

                    			newCompositeNode(grammarAccess.getUNITAccess().getSPEEDParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SPEED_0=ruleSPEED();

                    state._fsp--;


                    			current = this_SPEED_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoStML.g:2207:3: this_TIME_1= ruleTIME
                    {

                    			newCompositeNode(grammarAccess.getUNITAccess().getTIMEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TIME_1=ruleTIME();

                    state._fsp--;


                    			current = this_TIME_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoStML.g:2216:3: this_WEIGHT_2= ruleWEIGHT
                    {

                    			newCompositeNode(grammarAccess.getUNITAccess().getWEIGHTParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WEIGHT_2=ruleWEIGHT();

                    state._fsp--;


                    			current = this_WEIGHT_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUNIT"


    // $ANTLR start "entryRuleWEIGHT"
    // InternalMoStML.g:2228:1: entryRuleWEIGHT returns [EObject current=null] : iv_ruleWEIGHT= ruleWEIGHT EOF ;
    public final EObject entryRuleWEIGHT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWEIGHT = null;


        try {
            // InternalMoStML.g:2228:47: (iv_ruleWEIGHT= ruleWEIGHT EOF )
            // InternalMoStML.g:2229:2: iv_ruleWEIGHT= ruleWEIGHT EOF
            {
             newCompositeNode(grammarAccess.getWEIGHTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWEIGHT=ruleWEIGHT();

            state._fsp--;

             current =iv_ruleWEIGHT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWEIGHT"


    // $ANTLR start "ruleWEIGHT"
    // InternalMoStML.g:2235:1: ruleWEIGHT returns [EObject current=null] : ( (lv_weight_0_0= 'kg' ) ) ;
    public final EObject ruleWEIGHT() throws RecognitionException {
        EObject current = null;

        Token lv_weight_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:2241:2: ( ( (lv_weight_0_0= 'kg' ) ) )
            // InternalMoStML.g:2242:2: ( (lv_weight_0_0= 'kg' ) )
            {
            // InternalMoStML.g:2242:2: ( (lv_weight_0_0= 'kg' ) )
            // InternalMoStML.g:2243:3: (lv_weight_0_0= 'kg' )
            {
            // InternalMoStML.g:2243:3: (lv_weight_0_0= 'kg' )
            // InternalMoStML.g:2244:4: lv_weight_0_0= 'kg'
            {
            lv_weight_0_0=(Token)match(input,27,FOLLOW_2); 

            				newLeafNode(lv_weight_0_0, grammarAccess.getWEIGHTAccess().getWeightKgKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getWEIGHTRule());
            				}
            				setWithLastConsumed(current, "weight", lv_weight_0_0, "kg");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWEIGHT"


    // $ANTLR start "entryRuleTIME"
    // InternalMoStML.g:2259:1: entryRuleTIME returns [EObject current=null] : iv_ruleTIME= ruleTIME EOF ;
    public final EObject entryRuleTIME() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTIME = null;


        try {
            // InternalMoStML.g:2259:45: (iv_ruleTIME= ruleTIME EOF )
            // InternalMoStML.g:2260:2: iv_ruleTIME= ruleTIME EOF
            {
             newCompositeNode(grammarAccess.getTIMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTIME=ruleTIME();

            state._fsp--;

             current =iv_ruleTIME; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTIME"


    // $ANTLR start "ruleTIME"
    // InternalMoStML.g:2266:1: ruleTIME returns [EObject current=null] : ( (lv_time_0_0= 's' ) ) ;
    public final EObject ruleTIME() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:2272:2: ( ( (lv_time_0_0= 's' ) ) )
            // InternalMoStML.g:2273:2: ( (lv_time_0_0= 's' ) )
            {
            // InternalMoStML.g:2273:2: ( (lv_time_0_0= 's' ) )
            // InternalMoStML.g:2274:3: (lv_time_0_0= 's' )
            {
            // InternalMoStML.g:2274:3: (lv_time_0_0= 's' )
            // InternalMoStML.g:2275:4: lv_time_0_0= 's'
            {
            lv_time_0_0=(Token)match(input,28,FOLLOW_2); 

            				newLeafNode(lv_time_0_0, grammarAccess.getTIMEAccess().getTimeSKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTIMERule());
            				}
            				setWithLastConsumed(current, "time", lv_time_0_0, "s");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTIME"


    // $ANTLR start "entryRuleSPEED"
    // InternalMoStML.g:2290:1: entryRuleSPEED returns [EObject current=null] : iv_ruleSPEED= ruleSPEED EOF ;
    public final EObject entryRuleSPEED() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPEED = null;


        try {
            // InternalMoStML.g:2290:46: (iv_ruleSPEED= ruleSPEED EOF )
            // InternalMoStML.g:2291:2: iv_ruleSPEED= ruleSPEED EOF
            {
             newCompositeNode(grammarAccess.getSPEEDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSPEED=ruleSPEED();

            state._fsp--;

             current =iv_ruleSPEED; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSPEED"


    // $ANTLR start "ruleSPEED"
    // InternalMoStML.g:2297:1: ruleSPEED returns [EObject current=null] : ( (lv_speed_0_0= 'km/h' ) ) ;
    public final EObject ruleSPEED() throws RecognitionException {
        EObject current = null;

        Token lv_speed_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:2303:2: ( ( (lv_speed_0_0= 'km/h' ) ) )
            // InternalMoStML.g:2304:2: ( (lv_speed_0_0= 'km/h' ) )
            {
            // InternalMoStML.g:2304:2: ( (lv_speed_0_0= 'km/h' ) )
            // InternalMoStML.g:2305:3: (lv_speed_0_0= 'km/h' )
            {
            // InternalMoStML.g:2305:3: (lv_speed_0_0= 'km/h' )
            // InternalMoStML.g:2306:4: lv_speed_0_0= 'km/h'
            {
            lv_speed_0_0=(Token)match(input,29,FOLLOW_2); 

            				newLeafNode(lv_speed_0_0, grammarAccess.getSPEEDAccess().getSpeedKmHKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSPEEDRule());
            				}
            				setWithLastConsumed(current, "speed", lv_speed_0_0, "km/h");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSPEED"


    // $ANTLR start "entryRuleATTRIBUTEVALUE"
    // InternalMoStML.g:2321:1: entryRuleATTRIBUTEVALUE returns [EObject current=null] : iv_ruleATTRIBUTEVALUE= ruleATTRIBUTEVALUE EOF ;
    public final EObject entryRuleATTRIBUTEVALUE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATTRIBUTEVALUE = null;


        try {
            // InternalMoStML.g:2321:55: (iv_ruleATTRIBUTEVALUE= ruleATTRIBUTEVALUE EOF )
            // InternalMoStML.g:2322:2: iv_ruleATTRIBUTEVALUE= ruleATTRIBUTEVALUE EOF
            {
             newCompositeNode(grammarAccess.getATTRIBUTEVALUERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleATTRIBUTEVALUE=ruleATTRIBUTEVALUE();

            state._fsp--;

             current =iv_ruleATTRIBUTEVALUE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleATTRIBUTEVALUE"


    // $ANTLR start "ruleATTRIBUTEVALUE"
    // InternalMoStML.g:2328:1: ruleATTRIBUTEVALUE returns [EObject current=null] : (this_INTTYPE_0= ruleINTTYPE | this_STRINGTYPE_1= ruleSTRINGTYPE | this_BOOLEANTYPE_2= ruleBOOLEANTYPE ) ;
    public final EObject ruleATTRIBUTEVALUE() throws RecognitionException {
        EObject current = null;

        EObject this_INTTYPE_0 = null;

        EObject this_STRINGTYPE_1 = null;

        EObject this_BOOLEANTYPE_2 = null;



        	enterRule();

        try {
            // InternalMoStML.g:2334:2: ( (this_INTTYPE_0= ruleINTTYPE | this_STRINGTYPE_1= ruleSTRINGTYPE | this_BOOLEANTYPE_2= ruleBOOLEANTYPE ) )
            // InternalMoStML.g:2335:2: (this_INTTYPE_0= ruleINTTYPE | this_STRINGTYPE_1= ruleSTRINGTYPE | this_BOOLEANTYPE_2= ruleBOOLEANTYPE )
            {
            // InternalMoStML.g:2335:2: (this_INTTYPE_0= ruleINTTYPE | this_STRINGTYPE_1= ruleSTRINGTYPE | this_BOOLEANTYPE_2= ruleBOOLEANTYPE )
            int alt37=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt37=1;
                }
                break;
            case RULE_STRING:
                {
                alt37=2;
                }
                break;
            case 30:
            case 31:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalMoStML.g:2336:3: this_INTTYPE_0= ruleINTTYPE
                    {

                    			newCompositeNode(grammarAccess.getATTRIBUTEVALUEAccess().getINTTYPEParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_INTTYPE_0=ruleINTTYPE();

                    state._fsp--;


                    			current = this_INTTYPE_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoStML.g:2345:3: this_STRINGTYPE_1= ruleSTRINGTYPE
                    {

                    			newCompositeNode(grammarAccess.getATTRIBUTEVALUEAccess().getSTRINGTYPEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_STRINGTYPE_1=ruleSTRINGTYPE();

                    state._fsp--;


                    			current = this_STRINGTYPE_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoStML.g:2354:3: this_BOOLEANTYPE_2= ruleBOOLEANTYPE
                    {

                    			newCompositeNode(grammarAccess.getATTRIBUTEVALUEAccess().getBOOLEANTYPEParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BOOLEANTYPE_2=ruleBOOLEANTYPE();

                    state._fsp--;


                    			current = this_BOOLEANTYPE_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleATTRIBUTEVALUE"


    // $ANTLR start "entryRuleSTRINGTYPE"
    // InternalMoStML.g:2366:1: entryRuleSTRINGTYPE returns [EObject current=null] : iv_ruleSTRINGTYPE= ruleSTRINGTYPE EOF ;
    public final EObject entryRuleSTRINGTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTRINGTYPE = null;


        try {
            // InternalMoStML.g:2366:51: (iv_ruleSTRINGTYPE= ruleSTRINGTYPE EOF )
            // InternalMoStML.g:2367:2: iv_ruleSTRINGTYPE= ruleSTRINGTYPE EOF
            {
             newCompositeNode(grammarAccess.getSTRINGTYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTRINGTYPE=ruleSTRINGTYPE();

            state._fsp--;

             current =iv_ruleSTRINGTYPE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTRINGTYPE"


    // $ANTLR start "ruleSTRINGTYPE"
    // InternalMoStML.g:2373:1: ruleSTRINGTYPE returns [EObject current=null] : ( (lv_string_0_0= RULE_STRING ) ) ;
    public final EObject ruleSTRINGTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:2379:2: ( ( (lv_string_0_0= RULE_STRING ) ) )
            // InternalMoStML.g:2380:2: ( (lv_string_0_0= RULE_STRING ) )
            {
            // InternalMoStML.g:2380:2: ( (lv_string_0_0= RULE_STRING ) )
            // InternalMoStML.g:2381:3: (lv_string_0_0= RULE_STRING )
            {
            // InternalMoStML.g:2381:3: (lv_string_0_0= RULE_STRING )
            // InternalMoStML.g:2382:4: lv_string_0_0= RULE_STRING
            {
            lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_string_0_0, grammarAccess.getSTRINGTYPEAccess().getStringSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSTRINGTYPERule());
            				}
            				setWithLastConsumed(
            					current,
            					"string",
            					lv_string_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTRINGTYPE"


    // $ANTLR start "entryRuleINTTYPE"
    // InternalMoStML.g:2401:1: entryRuleINTTYPE returns [EObject current=null] : iv_ruleINTTYPE= ruleINTTYPE EOF ;
    public final EObject entryRuleINTTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINTTYPE = null;


        try {
            // InternalMoStML.g:2401:48: (iv_ruleINTTYPE= ruleINTTYPE EOF )
            // InternalMoStML.g:2402:2: iv_ruleINTTYPE= ruleINTTYPE EOF
            {
             newCompositeNode(grammarAccess.getINTTYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINTTYPE=ruleINTTYPE();

            state._fsp--;

             current =iv_ruleINTTYPE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTTYPE"


    // $ANTLR start "ruleINTTYPE"
    // InternalMoStML.g:2408:1: ruleINTTYPE returns [EObject current=null] : ( (lv_int_0_0= RULE_INT ) ) ;
    public final EObject ruleINTTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_int_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:2414:2: ( ( (lv_int_0_0= RULE_INT ) ) )
            // InternalMoStML.g:2415:2: ( (lv_int_0_0= RULE_INT ) )
            {
            // InternalMoStML.g:2415:2: ( (lv_int_0_0= RULE_INT ) )
            // InternalMoStML.g:2416:3: (lv_int_0_0= RULE_INT )
            {
            // InternalMoStML.g:2416:3: (lv_int_0_0= RULE_INT )
            // InternalMoStML.g:2417:4: lv_int_0_0= RULE_INT
            {
            lv_int_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_int_0_0, grammarAccess.getINTTYPEAccess().getIntINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getINTTYPERule());
            				}
            				setWithLastConsumed(
            					current,
            					"int",
            					lv_int_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTTYPE"


    // $ANTLR start "entryRuleBOOLEANTYPE"
    // InternalMoStML.g:2436:1: entryRuleBOOLEANTYPE returns [EObject current=null] : iv_ruleBOOLEANTYPE= ruleBOOLEANTYPE EOF ;
    public final EObject entryRuleBOOLEANTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEANTYPE = null;


        try {
            // InternalMoStML.g:2436:52: (iv_ruleBOOLEANTYPE= ruleBOOLEANTYPE EOF )
            // InternalMoStML.g:2437:2: iv_ruleBOOLEANTYPE= ruleBOOLEANTYPE EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANTYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEANTYPE=ruleBOOLEANTYPE();

            state._fsp--;

             current =iv_ruleBOOLEANTYPE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEANTYPE"


    // $ANTLR start "ruleBOOLEANTYPE"
    // InternalMoStML.g:2443:1: ruleBOOLEANTYPE returns [EObject current=null] : ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) ;
    public final EObject ruleBOOLEANTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalMoStML.g:2449:2: ( ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) )
            // InternalMoStML.g:2450:2: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            {
            // InternalMoStML.g:2450:2: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            // InternalMoStML.g:2451:3: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            {
            // InternalMoStML.g:2451:3: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            // InternalMoStML.g:2452:4: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            {
            // InternalMoStML.g:2452:4: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==30) ) {
                alt38=1;
            }
            else if ( (LA38_0==31) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMoStML.g:2453:5: lv_value_0_1= 'TRUE'
                    {
                    lv_value_0_1=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBOOLEANTYPEAccess().getValueTRUEKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBOOLEANTYPERule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMoStML.g:2464:5: lv_value_0_2= 'FALSE'
                    {
                    lv_value_0_2=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBOOLEANTYPEAccess().getValueFALSEKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBOOLEANTYPERule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEANTYPE"


    // $ANTLR start "entryRuleSTATECONDITON"
    // InternalMoStML.g:2480:1: entryRuleSTATECONDITON returns [EObject current=null] : iv_ruleSTATECONDITON= ruleSTATECONDITON EOF ;
    public final EObject entryRuleSTATECONDITON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTATECONDITON = null;


        try {
            // InternalMoStML.g:2480:54: (iv_ruleSTATECONDITON= ruleSTATECONDITON EOF )
            // InternalMoStML.g:2481:2: iv_ruleSTATECONDITON= ruleSTATECONDITON EOF
            {
             newCompositeNode(grammarAccess.getSTATECONDITONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTATECONDITON=ruleSTATECONDITON();

            state._fsp--;

             current =iv_ruleSTATECONDITON; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTATECONDITON"


    // $ANTLR start "ruleSTATECONDITON"
    // InternalMoStML.g:2487:1: ruleSTATECONDITON returns [EObject current=null] : ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) ) ) | ( ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) ) ) ) ;
    public final EObject ruleSTATECONDITON() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token lv_stateName_3_0=null;
        Token this_ID_4=null;
        Token this_ID_6=null;
        Token otherlv_7=null;
        Token lv_stateName_8_0=null;
        EObject lv_compOperator_5_0 = null;



        	enterRule();

        try {
            // InternalMoStML.g:2493:2: ( ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) ) ) | ( ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) ) ) ) )
            // InternalMoStML.g:2494:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) ) ) | ( ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) ) ) )
            {
            // InternalMoStML.g:2494:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) ) ) | ( ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) ) ) )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalMoStML.g:2495:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) ) )
                    {
                    // InternalMoStML.g:2495:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) ) )
                    // InternalMoStML.g:2496:4: this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) )
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    				newLeafNode(this_ID_0, grammarAccess.getSTATECONDITONAccess().getIDTerminalRuleCall_0_0());
                    			
                    // InternalMoStML.g:2500:4: (this_ID_1= RULE_ID )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalMoStML.g:2501:5: this_ID_1= RULE_ID
                    	    {
                    	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_27); 

                    	    					newLeafNode(this_ID_1, grammarAccess.getSTATECONDITONAccess().getIDTerminalRuleCall_0_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_2=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getSTATECONDITONAccess().getStateKeyword_0_2());
                    			
                    // InternalMoStML.g:2510:4: ( (lv_stateName_3_0= RULE_ID ) )
                    // InternalMoStML.g:2511:5: (lv_stateName_3_0= RULE_ID )
                    {
                    // InternalMoStML.g:2511:5: (lv_stateName_3_0= RULE_ID )
                    // InternalMoStML.g:2512:6: lv_stateName_3_0= RULE_ID
                    {
                    lv_stateName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_stateName_3_0, grammarAccess.getSTATECONDITONAccess().getStateNameIDTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSTATECONDITONRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"stateName",
                    							lv_stateName_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoStML.g:2530:3: ( ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) ) )
                    {
                    // InternalMoStML.g:2530:3: ( ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) ) )
                    // InternalMoStML.g:2531:4: ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) )
                    {
                    // InternalMoStML.g:2531:4: ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) )
                    // InternalMoStML.g:2532:5: (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) )
                    {
                    // InternalMoStML.g:2532:5: (this_ID_4= RULE_ID )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_ID) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalMoStML.g:2533:6: this_ID_4= RULE_ID
                    	    {
                    	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_6); 

                    	    						newLeafNode(this_ID_4, grammarAccess.getSTATECONDITONAccess().getIDTerminalRuleCall_1_0_0());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    // InternalMoStML.g:2538:5: ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) )
                    // InternalMoStML.g:2539:6: (lv_compOperator_5_0= ruleCOMPARISONOPERATOR )
                    {
                    // InternalMoStML.g:2539:6: (lv_compOperator_5_0= ruleCOMPARISONOPERATOR )
                    // InternalMoStML.g:2540:7: lv_compOperator_5_0= ruleCOMPARISONOPERATOR
                    {

                    							newCompositeNode(grammarAccess.getSTATECONDITONAccess().getCompOperatorCOMPARISONOPERATORParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_27);
                    lv_compOperator_5_0=ruleCOMPARISONOPERATOR();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSTATECONDITONRule());
                    							}
                    							set(
                    								current,
                    								"compOperator",
                    								lv_compOperator_5_0,
                    								"org.xtext.example.mostml.MoStML.COMPARISONOPERATOR");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    // InternalMoStML.g:2558:4: (this_ID_6= RULE_ID )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_ID) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalMoStML.g:2559:5: this_ID_6= RULE_ID
                    	    {
                    	    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_27); 

                    	    					newLeafNode(this_ID_6, grammarAccess.getSTATECONDITONAccess().getIDTerminalRuleCall_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getSTATECONDITONAccess().getStateKeyword_1_2());
                    			
                    // InternalMoStML.g:2568:4: ( (lv_stateName_8_0= RULE_ID ) )
                    // InternalMoStML.g:2569:5: (lv_stateName_8_0= RULE_ID )
                    {
                    // InternalMoStML.g:2569:5: (lv_stateName_8_0= RULE_ID )
                    // InternalMoStML.g:2570:6: lv_stateName_8_0= RULE_ID
                    {
                    lv_stateName_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_stateName_8_0, grammarAccess.getSTATECONDITONAccess().getStateNameIDTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSTATECONDITONRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"stateName",
                    							lv_stateName_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTATECONDITON"


    // $ANTLR start "entryRuleMODECONDITION"
    // InternalMoStML.g:2591:1: entryRuleMODECONDITION returns [EObject current=null] : iv_ruleMODECONDITION= ruleMODECONDITION EOF ;
    public final EObject entryRuleMODECONDITION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODECONDITION = null;


        try {
            // InternalMoStML.g:2591:54: (iv_ruleMODECONDITION= ruleMODECONDITION EOF )
            // InternalMoStML.g:2592:2: iv_ruleMODECONDITION= ruleMODECONDITION EOF
            {
             newCompositeNode(grammarAccess.getMODECONDITIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMODECONDITION=ruleMODECONDITION();

            state._fsp--;

             current =iv_ruleMODECONDITION; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMODECONDITION"


    // $ANTLR start "ruleMODECONDITION"
    // InternalMoStML.g:2598:1: ruleMODECONDITION returns [EObject current=null] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'mode' ( (lv_modeName_3_0= RULE_ID ) ) ) ;
    public final EObject ruleMODECONDITION() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token lv_modeName_3_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:2604:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'mode' ( (lv_modeName_3_0= RULE_ID ) ) ) )
            // InternalMoStML.g:2605:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'mode' ( (lv_modeName_3_0= RULE_ID ) ) )
            {
            // InternalMoStML.g:2605:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'mode' ( (lv_modeName_3_0= RULE_ID ) ) )
            // InternalMoStML.g:2606:3: this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'mode' ( (lv_modeName_3_0= RULE_ID ) )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            			newLeafNode(this_ID_0, grammarAccess.getMODECONDITIONAccess().getIDTerminalRuleCall_0());
            		
            // InternalMoStML.g:2610:3: (this_ID_1= RULE_ID )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMoStML.g:2611:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    				newLeafNode(this_ID_1, grammarAccess.getMODECONDITIONAccess().getIDTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_2=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMODECONDITIONAccess().getModeKeyword_2());
            		
            // InternalMoStML.g:2620:3: ( (lv_modeName_3_0= RULE_ID ) )
            // InternalMoStML.g:2621:4: (lv_modeName_3_0= RULE_ID )
            {
            // InternalMoStML.g:2621:4: (lv_modeName_3_0= RULE_ID )
            // InternalMoStML.g:2622:5: lv_modeName_3_0= RULE_ID
            {
            lv_modeName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_modeName_3_0, grammarAccess.getMODECONDITIONAccess().getModeNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMODECONDITIONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"modeName",
            						lv_modeName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMODECONDITION"


    // $ANTLR start "entryRuleARITHMETICCONDITION"
    // InternalMoStML.g:2642:1: entryRuleARITHMETICCONDITION returns [EObject current=null] : iv_ruleARITHMETICCONDITION= ruleARITHMETICCONDITION EOF ;
    public final EObject entryRuleARITHMETICCONDITION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARITHMETICCONDITION = null;


        try {
            // InternalMoStML.g:2642:60: (iv_ruleARITHMETICCONDITION= ruleARITHMETICCONDITION EOF )
            // InternalMoStML.g:2643:2: iv_ruleARITHMETICCONDITION= ruleARITHMETICCONDITION EOF
            {
             newCompositeNode(grammarAccess.getARITHMETICCONDITIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleARITHMETICCONDITION=ruleARITHMETICCONDITION();

            state._fsp--;

             current =iv_ruleARITHMETICCONDITION; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleARITHMETICCONDITION"


    // $ANTLR start "ruleARITHMETICCONDITION"
    // InternalMoStML.g:2649:1: ruleARITHMETICCONDITION returns [EObject current=null] : (this_ID_0= RULE_ID ( (lv_result_1_0= RULE_ID ) ) (this_ID_2= RULE_ID )* ( (lv_compcondition_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_var1_4_0= RULE_ID ) ) ( (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR ) ) ( (lv_var2_6_0= RULE_ID ) ) ) ;
    public final EObject ruleARITHMETICCONDITION() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token lv_result_1_0=null;
        Token this_ID_2=null;
        Token lv_var1_4_0=null;
        Token lv_var2_6_0=null;
        EObject lv_compcondition_3_0 = null;

        EObject lv_arithmeticOperator_5_0 = null;



        	enterRule();

        try {
            // InternalMoStML.g:2655:2: ( (this_ID_0= RULE_ID ( (lv_result_1_0= RULE_ID ) ) (this_ID_2= RULE_ID )* ( (lv_compcondition_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_var1_4_0= RULE_ID ) ) ( (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR ) ) ( (lv_var2_6_0= RULE_ID ) ) ) )
            // InternalMoStML.g:2656:2: (this_ID_0= RULE_ID ( (lv_result_1_0= RULE_ID ) ) (this_ID_2= RULE_ID )* ( (lv_compcondition_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_var1_4_0= RULE_ID ) ) ( (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR ) ) ( (lv_var2_6_0= RULE_ID ) ) )
            {
            // InternalMoStML.g:2656:2: (this_ID_0= RULE_ID ( (lv_result_1_0= RULE_ID ) ) (this_ID_2= RULE_ID )* ( (lv_compcondition_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_var1_4_0= RULE_ID ) ) ( (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR ) ) ( (lv_var2_6_0= RULE_ID ) ) )
            // InternalMoStML.g:2657:3: this_ID_0= RULE_ID ( (lv_result_1_0= RULE_ID ) ) (this_ID_2= RULE_ID )* ( (lv_compcondition_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_var1_4_0= RULE_ID ) ) ( (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR ) ) ( (lv_var2_6_0= RULE_ID ) )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(this_ID_0, grammarAccess.getARITHMETICCONDITIONAccess().getIDTerminalRuleCall_0());
            		
            // InternalMoStML.g:2661:3: ( (lv_result_1_0= RULE_ID ) )
            // InternalMoStML.g:2662:4: (lv_result_1_0= RULE_ID )
            {
            // InternalMoStML.g:2662:4: (lv_result_1_0= RULE_ID )
            // InternalMoStML.g:2663:5: lv_result_1_0= RULE_ID
            {
            lv_result_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_result_1_0, grammarAccess.getARITHMETICCONDITIONAccess().getResultIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getARITHMETICCONDITIONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"result",
            						lv_result_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoStML.g:2679:3: (this_ID_2= RULE_ID )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMoStML.g:2680:4: this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				newLeafNode(this_ID_2, grammarAccess.getARITHMETICCONDITIONAccess().getIDTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // InternalMoStML.g:2685:3: ( (lv_compcondition_3_0= ruleCOMPARISONOPERATOR ) )
            // InternalMoStML.g:2686:4: (lv_compcondition_3_0= ruleCOMPARISONOPERATOR )
            {
            // InternalMoStML.g:2686:4: (lv_compcondition_3_0= ruleCOMPARISONOPERATOR )
            // InternalMoStML.g:2687:5: lv_compcondition_3_0= ruleCOMPARISONOPERATOR
            {

            					newCompositeNode(grammarAccess.getARITHMETICCONDITIONAccess().getCompconditionCOMPARISONOPERATORParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_compcondition_3_0=ruleCOMPARISONOPERATOR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getARITHMETICCONDITIONRule());
            					}
            					set(
            						current,
            						"compcondition",
            						lv_compcondition_3_0,
            						"org.xtext.example.mostml.MoStML.COMPARISONOPERATOR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoStML.g:2704:3: ( (lv_var1_4_0= RULE_ID ) )
            // InternalMoStML.g:2705:4: (lv_var1_4_0= RULE_ID )
            {
            // InternalMoStML.g:2705:4: (lv_var1_4_0= RULE_ID )
            // InternalMoStML.g:2706:5: lv_var1_4_0= RULE_ID
            {
            lv_var1_4_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_var1_4_0, grammarAccess.getARITHMETICCONDITIONAccess().getVar1IDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getARITHMETICCONDITIONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var1",
            						lv_var1_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoStML.g:2722:3: ( (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR ) )
            // InternalMoStML.g:2723:4: (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR )
            {
            // InternalMoStML.g:2723:4: (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR )
            // InternalMoStML.g:2724:5: lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR
            {

            					newCompositeNode(grammarAccess.getARITHMETICCONDITIONAccess().getArithmeticOperatorARITHMETICOPERATORParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_4);
            lv_arithmeticOperator_5_0=ruleARITHMETICOPERATOR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getARITHMETICCONDITIONRule());
            					}
            					set(
            						current,
            						"arithmeticOperator",
            						lv_arithmeticOperator_5_0,
            						"org.xtext.example.mostml.MoStML.ARITHMETICOPERATOR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoStML.g:2741:3: ( (lv_var2_6_0= RULE_ID ) )
            // InternalMoStML.g:2742:4: (lv_var2_6_0= RULE_ID )
            {
            // InternalMoStML.g:2742:4: (lv_var2_6_0= RULE_ID )
            // InternalMoStML.g:2743:5: lv_var2_6_0= RULE_ID
            {
            lv_var2_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_var2_6_0, grammarAccess.getARITHMETICCONDITIONAccess().getVar2IDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getARITHMETICCONDITIONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var2",
            						lv_var2_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleARITHMETICCONDITION"


    // $ANTLR start "entryRuleARITHMETICOPERATOR"
    // InternalMoStML.g:2763:1: entryRuleARITHMETICOPERATOR returns [EObject current=null] : iv_ruleARITHMETICOPERATOR= ruleARITHMETICOPERATOR EOF ;
    public final EObject entryRuleARITHMETICOPERATOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARITHMETICOPERATOR = null;


        try {
            // InternalMoStML.g:2763:59: (iv_ruleARITHMETICOPERATOR= ruleARITHMETICOPERATOR EOF )
            // InternalMoStML.g:2764:2: iv_ruleARITHMETICOPERATOR= ruleARITHMETICOPERATOR EOF
            {
             newCompositeNode(grammarAccess.getARITHMETICOPERATORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleARITHMETICOPERATOR=ruleARITHMETICOPERATOR();

            state._fsp--;

             current =iv_ruleARITHMETICOPERATOR; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleARITHMETICOPERATOR"


    // $ANTLR start "ruleARITHMETICOPERATOR"
    // InternalMoStML.g:2770:1: ruleARITHMETICOPERATOR returns [EObject current=null] : (this_ADD_0= ruleADD | this_SUBTRACTION_1= ruleSUBTRACTION | this_MULTIPLICATION_2= ruleMULTIPLICATION | this_DIVISION_3= ruleDIVISION | this_MODULE_4= ruleMODULE ) ;
    public final EObject ruleARITHMETICOPERATOR() throws RecognitionException {
        EObject current = null;

        EObject this_ADD_0 = null;

        EObject this_SUBTRACTION_1 = null;

        EObject this_MULTIPLICATION_2 = null;

        EObject this_DIVISION_3 = null;

        EObject this_MODULE_4 = null;



        	enterRule();

        try {
            // InternalMoStML.g:2776:2: ( (this_ADD_0= ruleADD | this_SUBTRACTION_1= ruleSUBTRACTION | this_MULTIPLICATION_2= ruleMULTIPLICATION | this_DIVISION_3= ruleDIVISION | this_MODULE_4= ruleMODULE ) )
            // InternalMoStML.g:2777:2: (this_ADD_0= ruleADD | this_SUBTRACTION_1= ruleSUBTRACTION | this_MULTIPLICATION_2= ruleMULTIPLICATION | this_DIVISION_3= ruleDIVISION | this_MODULE_4= ruleMODULE )
            {
            // InternalMoStML.g:2777:2: (this_ADD_0= ruleADD | this_SUBTRACTION_1= ruleSUBTRACTION | this_MULTIPLICATION_2= ruleMULTIPLICATION | this_DIVISION_3= ruleDIVISION | this_MODULE_4= ruleMODULE )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt45=1;
                }
                break;
            case 38:
                {
                alt45=2;
                }
                break;
            case 37:
                {
                alt45=3;
                }
                break;
            case 36:
                {
                alt45=4;
                }
                break;
            case 34:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalMoStML.g:2778:3: this_ADD_0= ruleADD
                    {

                    			newCompositeNode(grammarAccess.getARITHMETICOPERATORAccess().getADDParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ADD_0=ruleADD();

                    state._fsp--;


                    			current = this_ADD_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoStML.g:2787:3: this_SUBTRACTION_1= ruleSUBTRACTION
                    {

                    			newCompositeNode(grammarAccess.getARITHMETICOPERATORAccess().getSUBTRACTIONParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SUBTRACTION_1=ruleSUBTRACTION();

                    state._fsp--;


                    			current = this_SUBTRACTION_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoStML.g:2796:3: this_MULTIPLICATION_2= ruleMULTIPLICATION
                    {

                    			newCompositeNode(grammarAccess.getARITHMETICOPERATORAccess().getMULTIPLICATIONParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MULTIPLICATION_2=ruleMULTIPLICATION();

                    state._fsp--;


                    			current = this_MULTIPLICATION_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMoStML.g:2805:3: this_DIVISION_3= ruleDIVISION
                    {

                    			newCompositeNode(grammarAccess.getARITHMETICOPERATORAccess().getDIVISIONParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DIVISION_3=ruleDIVISION();

                    state._fsp--;


                    			current = this_DIVISION_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMoStML.g:2814:3: this_MODULE_4= ruleMODULE
                    {

                    			newCompositeNode(grammarAccess.getARITHMETICOPERATORAccess().getMODULEParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MODULE_4=ruleMODULE();

                    state._fsp--;


                    			current = this_MODULE_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleARITHMETICOPERATOR"


    // $ANTLR start "entryRuleMODULE"
    // InternalMoStML.g:2826:1: entryRuleMODULE returns [EObject current=null] : iv_ruleMODULE= ruleMODULE EOF ;
    public final EObject entryRuleMODULE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODULE = null;


        try {
            // InternalMoStML.g:2826:47: (iv_ruleMODULE= ruleMODULE EOF )
            // InternalMoStML.g:2827:2: iv_ruleMODULE= ruleMODULE EOF
            {
             newCompositeNode(grammarAccess.getMODULERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMODULE=ruleMODULE();

            state._fsp--;

             current =iv_ruleMODULE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMODULE"


    // $ANTLR start "ruleMODULE"
    // InternalMoStML.g:2833:1: ruleMODULE returns [EObject current=null] : ( ( (lv_add_0_0= 'moduled' ) ) otherlv_1= 'by' ) ;
    public final EObject ruleMODULE() throws RecognitionException {
        EObject current = null;

        Token lv_add_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:2839:2: ( ( ( (lv_add_0_0= 'moduled' ) ) otherlv_1= 'by' ) )
            // InternalMoStML.g:2840:2: ( ( (lv_add_0_0= 'moduled' ) ) otherlv_1= 'by' )
            {
            // InternalMoStML.g:2840:2: ( ( (lv_add_0_0= 'moduled' ) ) otherlv_1= 'by' )
            // InternalMoStML.g:2841:3: ( (lv_add_0_0= 'moduled' ) ) otherlv_1= 'by'
            {
            // InternalMoStML.g:2841:3: ( (lv_add_0_0= 'moduled' ) )
            // InternalMoStML.g:2842:4: (lv_add_0_0= 'moduled' )
            {
            // InternalMoStML.g:2842:4: (lv_add_0_0= 'moduled' )
            // InternalMoStML.g:2843:5: lv_add_0_0= 'moduled'
            {
            lv_add_0_0=(Token)match(input,34,FOLLOW_30); 

            					newLeafNode(lv_add_0_0, grammarAccess.getMODULEAccess().getAddModuledKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMODULERule());
            					}
            					setWithLastConsumed(current, "add", lv_add_0_0, "moduled");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMODULEAccess().getByKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMODULE"


    // $ANTLR start "entryRuleDIVISION"
    // InternalMoStML.g:2863:1: entryRuleDIVISION returns [EObject current=null] : iv_ruleDIVISION= ruleDIVISION EOF ;
    public final EObject entryRuleDIVISION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDIVISION = null;


        try {
            // InternalMoStML.g:2863:49: (iv_ruleDIVISION= ruleDIVISION EOF )
            // InternalMoStML.g:2864:2: iv_ruleDIVISION= ruleDIVISION EOF
            {
             newCompositeNode(grammarAccess.getDIVISIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDIVISION=ruleDIVISION();

            state._fsp--;

             current =iv_ruleDIVISION; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDIVISION"


    // $ANTLR start "ruleDIVISION"
    // InternalMoStML.g:2870:1: ruleDIVISION returns [EObject current=null] : ( ( (lv_division_0_0= 'divided' ) ) otherlv_1= 'by' ) ;
    public final EObject ruleDIVISION() throws RecognitionException {
        EObject current = null;

        Token lv_division_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:2876:2: ( ( ( (lv_division_0_0= 'divided' ) ) otherlv_1= 'by' ) )
            // InternalMoStML.g:2877:2: ( ( (lv_division_0_0= 'divided' ) ) otherlv_1= 'by' )
            {
            // InternalMoStML.g:2877:2: ( ( (lv_division_0_0= 'divided' ) ) otherlv_1= 'by' )
            // InternalMoStML.g:2878:3: ( (lv_division_0_0= 'divided' ) ) otherlv_1= 'by'
            {
            // InternalMoStML.g:2878:3: ( (lv_division_0_0= 'divided' ) )
            // InternalMoStML.g:2879:4: (lv_division_0_0= 'divided' )
            {
            // InternalMoStML.g:2879:4: (lv_division_0_0= 'divided' )
            // InternalMoStML.g:2880:5: lv_division_0_0= 'divided'
            {
            lv_division_0_0=(Token)match(input,36,FOLLOW_30); 

            					newLeafNode(lv_division_0_0, grammarAccess.getDIVISIONAccess().getDivisionDividedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDIVISIONRule());
            					}
            					setWithLastConsumed(current, "division", lv_division_0_0, "divided");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDIVISIONAccess().getByKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDIVISION"


    // $ANTLR start "entryRuleMULTIPLICATION"
    // InternalMoStML.g:2900:1: entryRuleMULTIPLICATION returns [EObject current=null] : iv_ruleMULTIPLICATION= ruleMULTIPLICATION EOF ;
    public final EObject entryRuleMULTIPLICATION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMULTIPLICATION = null;


        try {
            // InternalMoStML.g:2900:55: (iv_ruleMULTIPLICATION= ruleMULTIPLICATION EOF )
            // InternalMoStML.g:2901:2: iv_ruleMULTIPLICATION= ruleMULTIPLICATION EOF
            {
             newCompositeNode(grammarAccess.getMULTIPLICATIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMULTIPLICATION=ruleMULTIPLICATION();

            state._fsp--;

             current =iv_ruleMULTIPLICATION; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMULTIPLICATION"


    // $ANTLR start "ruleMULTIPLICATION"
    // InternalMoStML.g:2907:1: ruleMULTIPLICATION returns [EObject current=null] : ( ( (lv_multiplication_0_0= 'multiplied' ) ) otherlv_1= 'by' ) ;
    public final EObject ruleMULTIPLICATION() throws RecognitionException {
        EObject current = null;

        Token lv_multiplication_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:2913:2: ( ( ( (lv_multiplication_0_0= 'multiplied' ) ) otherlv_1= 'by' ) )
            // InternalMoStML.g:2914:2: ( ( (lv_multiplication_0_0= 'multiplied' ) ) otherlv_1= 'by' )
            {
            // InternalMoStML.g:2914:2: ( ( (lv_multiplication_0_0= 'multiplied' ) ) otherlv_1= 'by' )
            // InternalMoStML.g:2915:3: ( (lv_multiplication_0_0= 'multiplied' ) ) otherlv_1= 'by'
            {
            // InternalMoStML.g:2915:3: ( (lv_multiplication_0_0= 'multiplied' ) )
            // InternalMoStML.g:2916:4: (lv_multiplication_0_0= 'multiplied' )
            {
            // InternalMoStML.g:2916:4: (lv_multiplication_0_0= 'multiplied' )
            // InternalMoStML.g:2917:5: lv_multiplication_0_0= 'multiplied'
            {
            lv_multiplication_0_0=(Token)match(input,37,FOLLOW_30); 

            					newLeafNode(lv_multiplication_0_0, grammarAccess.getMULTIPLICATIONAccess().getMultiplicationMultipliedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMULTIPLICATIONRule());
            					}
            					setWithLastConsumed(current, "multiplication", lv_multiplication_0_0, "multiplied");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMULTIPLICATIONAccess().getByKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMULTIPLICATION"


    // $ANTLR start "entryRuleSUBTRACTION"
    // InternalMoStML.g:2937:1: entryRuleSUBTRACTION returns [EObject current=null] : iv_ruleSUBTRACTION= ruleSUBTRACTION EOF ;
    public final EObject entryRuleSUBTRACTION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSUBTRACTION = null;


        try {
            // InternalMoStML.g:2937:52: (iv_ruleSUBTRACTION= ruleSUBTRACTION EOF )
            // InternalMoStML.g:2938:2: iv_ruleSUBTRACTION= ruleSUBTRACTION EOF
            {
             newCompositeNode(grammarAccess.getSUBTRACTIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSUBTRACTION=ruleSUBTRACTION();

            state._fsp--;

             current =iv_ruleSUBTRACTION; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSUBTRACTION"


    // $ANTLR start "ruleSUBTRACTION"
    // InternalMoStML.g:2944:1: ruleSUBTRACTION returns [EObject current=null] : ( ( (lv_substraction_0_0= 'subtracted' ) ) otherlv_1= 'by' ) ;
    public final EObject ruleSUBTRACTION() throws RecognitionException {
        EObject current = null;

        Token lv_substraction_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:2950:2: ( ( ( (lv_substraction_0_0= 'subtracted' ) ) otherlv_1= 'by' ) )
            // InternalMoStML.g:2951:2: ( ( (lv_substraction_0_0= 'subtracted' ) ) otherlv_1= 'by' )
            {
            // InternalMoStML.g:2951:2: ( ( (lv_substraction_0_0= 'subtracted' ) ) otherlv_1= 'by' )
            // InternalMoStML.g:2952:3: ( (lv_substraction_0_0= 'subtracted' ) ) otherlv_1= 'by'
            {
            // InternalMoStML.g:2952:3: ( (lv_substraction_0_0= 'subtracted' ) )
            // InternalMoStML.g:2953:4: (lv_substraction_0_0= 'subtracted' )
            {
            // InternalMoStML.g:2953:4: (lv_substraction_0_0= 'subtracted' )
            // InternalMoStML.g:2954:5: lv_substraction_0_0= 'subtracted'
            {
            lv_substraction_0_0=(Token)match(input,38,FOLLOW_30); 

            					newLeafNode(lv_substraction_0_0, grammarAccess.getSUBTRACTIONAccess().getSubstractionSubtractedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSUBTRACTIONRule());
            					}
            					setWithLastConsumed(current, "substraction", lv_substraction_0_0, "subtracted");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSUBTRACTIONAccess().getByKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSUBTRACTION"


    // $ANTLR start "entryRuleADD"
    // InternalMoStML.g:2974:1: entryRuleADD returns [EObject current=null] : iv_ruleADD= ruleADD EOF ;
    public final EObject entryRuleADD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADD = null;


        try {
            // InternalMoStML.g:2974:44: (iv_ruleADD= ruleADD EOF )
            // InternalMoStML.g:2975:2: iv_ruleADD= ruleADD EOF
            {
             newCompositeNode(grammarAccess.getADDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleADD=ruleADD();

            state._fsp--;

             current =iv_ruleADD; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleADD"


    // $ANTLR start "ruleADD"
    // InternalMoStML.g:2981:1: ruleADD returns [EObject current=null] : ( ( (lv_add_0_0= 'added' ) ) otherlv_1= 'by' ) ;
    public final EObject ruleADD() throws RecognitionException {
        EObject current = null;

        Token lv_add_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:2987:2: ( ( ( (lv_add_0_0= 'added' ) ) otherlv_1= 'by' ) )
            // InternalMoStML.g:2988:2: ( ( (lv_add_0_0= 'added' ) ) otherlv_1= 'by' )
            {
            // InternalMoStML.g:2988:2: ( ( (lv_add_0_0= 'added' ) ) otherlv_1= 'by' )
            // InternalMoStML.g:2989:3: ( (lv_add_0_0= 'added' ) ) otherlv_1= 'by'
            {
            // InternalMoStML.g:2989:3: ( (lv_add_0_0= 'added' ) )
            // InternalMoStML.g:2990:4: (lv_add_0_0= 'added' )
            {
            // InternalMoStML.g:2990:4: (lv_add_0_0= 'added' )
            // InternalMoStML.g:2991:5: lv_add_0_0= 'added'
            {
            lv_add_0_0=(Token)match(input,39,FOLLOW_30); 

            					newLeafNode(lv_add_0_0, grammarAccess.getADDAccess().getAddAddedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getADDRule());
            					}
            					setWithLastConsumed(current, "add", lv_add_0_0, "added");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getADDAccess().getByKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleADD"


    // $ANTLR start "entryRuleCOMPARISONOPERATOR"
    // InternalMoStML.g:3011:1: entryRuleCOMPARISONOPERATOR returns [EObject current=null] : iv_ruleCOMPARISONOPERATOR= ruleCOMPARISONOPERATOR EOF ;
    public final EObject entryRuleCOMPARISONOPERATOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOMPARISONOPERATOR = null;


        try {
            // InternalMoStML.g:3011:59: (iv_ruleCOMPARISONOPERATOR= ruleCOMPARISONOPERATOR EOF )
            // InternalMoStML.g:3012:2: iv_ruleCOMPARISONOPERATOR= ruleCOMPARISONOPERATOR EOF
            {
             newCompositeNode(grammarAccess.getCOMPARISONOPERATORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOMPARISONOPERATOR=ruleCOMPARISONOPERATOR();

            state._fsp--;

             current =iv_ruleCOMPARISONOPERATOR; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOMPARISONOPERATOR"


    // $ANTLR start "ruleCOMPARISONOPERATOR"
    // InternalMoStML.g:3018:1: ruleCOMPARISONOPERATOR returns [EObject current=null] : (this_EQUAL_0= ruleEQUAL | this_LESS_1= ruleLESS | this_GREATER_2= ruleGREATER | this_NOTEQUAL_3= ruleNOTEQUAL | this_LESSEQUAL_4= ruleLESSEQUAL | this_GREATEQUAL_5= ruleGREATEQUAL | this_NOT_6= ruleNOT ) ;
    public final EObject ruleCOMPARISONOPERATOR() throws RecognitionException {
        EObject current = null;

        EObject this_EQUAL_0 = null;

        EObject this_LESS_1 = null;

        EObject this_GREATER_2 = null;

        EObject this_NOTEQUAL_3 = null;

        EObject this_LESSEQUAL_4 = null;

        EObject this_GREATEQUAL_5 = null;

        EObject this_NOT_6 = null;



        	enterRule();

        try {
            // InternalMoStML.g:3024:2: ( (this_EQUAL_0= ruleEQUAL | this_LESS_1= ruleLESS | this_GREATER_2= ruleGREATER | this_NOTEQUAL_3= ruleNOTEQUAL | this_LESSEQUAL_4= ruleLESSEQUAL | this_GREATEQUAL_5= ruleGREATEQUAL | this_NOT_6= ruleNOT ) )
            // InternalMoStML.g:3025:2: (this_EQUAL_0= ruleEQUAL | this_LESS_1= ruleLESS | this_GREATER_2= ruleGREATER | this_NOTEQUAL_3= ruleNOTEQUAL | this_LESSEQUAL_4= ruleLESSEQUAL | this_GREATEQUAL_5= ruleGREATEQUAL | this_NOT_6= ruleNOT )
            {
            // InternalMoStML.g:3025:2: (this_EQUAL_0= ruleEQUAL | this_LESS_1= ruleLESS | this_GREATER_2= ruleGREATER | this_NOTEQUAL_3= ruleNOTEQUAL | this_LESSEQUAL_4= ruleLESSEQUAL | this_GREATEQUAL_5= ruleGREATEQUAL | this_NOT_6= ruleNOT )
            int alt46=7;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalMoStML.g:3026:3: this_EQUAL_0= ruleEQUAL
                    {

                    			newCompositeNode(grammarAccess.getCOMPARISONOPERATORAccess().getEQUALParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EQUAL_0=ruleEQUAL();

                    state._fsp--;


                    			current = this_EQUAL_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoStML.g:3035:3: this_LESS_1= ruleLESS
                    {

                    			newCompositeNode(grammarAccess.getCOMPARISONOPERATORAccess().getLESSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LESS_1=ruleLESS();

                    state._fsp--;


                    			current = this_LESS_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoStML.g:3044:3: this_GREATER_2= ruleGREATER
                    {

                    			newCompositeNode(grammarAccess.getCOMPARISONOPERATORAccess().getGREATERParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GREATER_2=ruleGREATER();

                    state._fsp--;


                    			current = this_GREATER_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMoStML.g:3053:3: this_NOTEQUAL_3= ruleNOTEQUAL
                    {

                    			newCompositeNode(grammarAccess.getCOMPARISONOPERATORAccess().getNOTEQUALParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NOTEQUAL_3=ruleNOTEQUAL();

                    state._fsp--;


                    			current = this_NOTEQUAL_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMoStML.g:3062:3: this_LESSEQUAL_4= ruleLESSEQUAL
                    {

                    			newCompositeNode(grammarAccess.getCOMPARISONOPERATORAccess().getLESSEQUALParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LESSEQUAL_4=ruleLESSEQUAL();

                    state._fsp--;


                    			current = this_LESSEQUAL_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMoStML.g:3071:3: this_GREATEQUAL_5= ruleGREATEQUAL
                    {

                    			newCompositeNode(grammarAccess.getCOMPARISONOPERATORAccess().getGREATEQUALParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_GREATEQUAL_5=ruleGREATEQUAL();

                    state._fsp--;


                    			current = this_GREATEQUAL_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMoStML.g:3080:3: this_NOT_6= ruleNOT
                    {

                    			newCompositeNode(grammarAccess.getCOMPARISONOPERATORAccess().getNOTParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_NOT_6=ruleNOT();

                    state._fsp--;


                    			current = this_NOT_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOMPARISONOPERATOR"


    // $ANTLR start "entryRuleNOT"
    // InternalMoStML.g:3092:1: entryRuleNOT returns [EObject current=null] : iv_ruleNOT= ruleNOT EOF ;
    public final EObject entryRuleNOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOT = null;


        try {
            // InternalMoStML.g:3092:44: (iv_ruleNOT= ruleNOT EOF )
            // InternalMoStML.g:3093:2: iv_ruleNOT= ruleNOT EOF
            {
             newCompositeNode(grammarAccess.getNOTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNOT=ruleNOT();

            state._fsp--;

             current =iv_ruleNOT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNOT"


    // $ANTLR start "ruleNOT"
    // InternalMoStML.g:3099:1: ruleNOT returns [EObject current=null] : ( (lv_not_0_0= 'not' ) ) ;
    public final EObject ruleNOT() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:3105:2: ( ( (lv_not_0_0= 'not' ) ) )
            // InternalMoStML.g:3106:2: ( (lv_not_0_0= 'not' ) )
            {
            // InternalMoStML.g:3106:2: ( (lv_not_0_0= 'not' ) )
            // InternalMoStML.g:3107:3: (lv_not_0_0= 'not' )
            {
            // InternalMoStML.g:3107:3: (lv_not_0_0= 'not' )
            // InternalMoStML.g:3108:4: lv_not_0_0= 'not'
            {
            lv_not_0_0=(Token)match(input,40,FOLLOW_2); 

            				newLeafNode(lv_not_0_0, grammarAccess.getNOTAccess().getNotNotKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNOTRule());
            				}
            				setWithLastConsumed(current, "not", lv_not_0_0, "not");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNOT"


    // $ANTLR start "entryRuleGREATEQUAL"
    // InternalMoStML.g:3123:1: entryRuleGREATEQUAL returns [EObject current=null] : iv_ruleGREATEQUAL= ruleGREATEQUAL EOF ;
    public final EObject entryRuleGREATEQUAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGREATEQUAL = null;


        try {
            // InternalMoStML.g:3123:51: (iv_ruleGREATEQUAL= ruleGREATEQUAL EOF )
            // InternalMoStML.g:3124:2: iv_ruleGREATEQUAL= ruleGREATEQUAL EOF
            {
             newCompositeNode(grammarAccess.getGREATEQUALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGREATEQUAL=ruleGREATEQUAL();

            state._fsp--;

             current =iv_ruleGREATEQUAL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGREATEQUAL"


    // $ANTLR start "ruleGREATEQUAL"
    // InternalMoStML.g:3130:1: ruleGREATEQUAL returns [EObject current=null] : ( ( (lv_greateEqual_0_0= 'greater' ) ) ( (lv_greateEqual_1_0= 'or' ) ) ( (lv_greateEqual_2_0= 'equal' ) ) ( (lv_greateEqual_3_0= 'to' ) ) ) ;
    public final EObject ruleGREATEQUAL() throws RecognitionException {
        EObject current = null;

        Token lv_greateEqual_0_0=null;
        Token lv_greateEqual_1_0=null;
        Token lv_greateEqual_2_0=null;
        Token lv_greateEqual_3_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:3136:2: ( ( ( (lv_greateEqual_0_0= 'greater' ) ) ( (lv_greateEqual_1_0= 'or' ) ) ( (lv_greateEqual_2_0= 'equal' ) ) ( (lv_greateEqual_3_0= 'to' ) ) ) )
            // InternalMoStML.g:3137:2: ( ( (lv_greateEqual_0_0= 'greater' ) ) ( (lv_greateEqual_1_0= 'or' ) ) ( (lv_greateEqual_2_0= 'equal' ) ) ( (lv_greateEqual_3_0= 'to' ) ) )
            {
            // InternalMoStML.g:3137:2: ( ( (lv_greateEqual_0_0= 'greater' ) ) ( (lv_greateEqual_1_0= 'or' ) ) ( (lv_greateEqual_2_0= 'equal' ) ) ( (lv_greateEqual_3_0= 'to' ) ) )
            // InternalMoStML.g:3138:3: ( (lv_greateEqual_0_0= 'greater' ) ) ( (lv_greateEqual_1_0= 'or' ) ) ( (lv_greateEqual_2_0= 'equal' ) ) ( (lv_greateEqual_3_0= 'to' ) )
            {
            // InternalMoStML.g:3138:3: ( (lv_greateEqual_0_0= 'greater' ) )
            // InternalMoStML.g:3139:4: (lv_greateEqual_0_0= 'greater' )
            {
            // InternalMoStML.g:3139:4: (lv_greateEqual_0_0= 'greater' )
            // InternalMoStML.g:3140:5: lv_greateEqual_0_0= 'greater'
            {
            lv_greateEqual_0_0=(Token)match(input,41,FOLLOW_31); 

            					newLeafNode(lv_greateEqual_0_0, grammarAccess.getGREATEQUALAccess().getGreateEqualGreaterKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGREATEQUALRule());
            					}
            					addWithLastConsumed(current, "greateEqual", lv_greateEqual_0_0, "greater");
            				

            }


            }

            // InternalMoStML.g:3152:3: ( (lv_greateEqual_1_0= 'or' ) )
            // InternalMoStML.g:3153:4: (lv_greateEqual_1_0= 'or' )
            {
            // InternalMoStML.g:3153:4: (lv_greateEqual_1_0= 'or' )
            // InternalMoStML.g:3154:5: lv_greateEqual_1_0= 'or'
            {
            lv_greateEqual_1_0=(Token)match(input,23,FOLLOW_32); 

            					newLeafNode(lv_greateEqual_1_0, grammarAccess.getGREATEQUALAccess().getGreateEqualOrKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGREATEQUALRule());
            					}
            					addWithLastConsumed(current, "greateEqual", lv_greateEqual_1_0, "or");
            				

            }


            }

            // InternalMoStML.g:3166:3: ( (lv_greateEqual_2_0= 'equal' ) )
            // InternalMoStML.g:3167:4: (lv_greateEqual_2_0= 'equal' )
            {
            // InternalMoStML.g:3167:4: (lv_greateEqual_2_0= 'equal' )
            // InternalMoStML.g:3168:5: lv_greateEqual_2_0= 'equal'
            {
            lv_greateEqual_2_0=(Token)match(input,42,FOLLOW_7); 

            					newLeafNode(lv_greateEqual_2_0, grammarAccess.getGREATEQUALAccess().getGreateEqualEqualKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGREATEQUALRule());
            					}
            					addWithLastConsumed(current, "greateEqual", lv_greateEqual_2_0, "equal");
            				

            }


            }

            // InternalMoStML.g:3180:3: ( (lv_greateEqual_3_0= 'to' ) )
            // InternalMoStML.g:3181:4: (lv_greateEqual_3_0= 'to' )
            {
            // InternalMoStML.g:3181:4: (lv_greateEqual_3_0= 'to' )
            // InternalMoStML.g:3182:5: lv_greateEqual_3_0= 'to'
            {
            lv_greateEqual_3_0=(Token)match(input,13,FOLLOW_2); 

            					newLeafNode(lv_greateEqual_3_0, grammarAccess.getGREATEQUALAccess().getGreateEqualToKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGREATEQUALRule());
            					}
            					addWithLastConsumed(current, "greateEqual", lv_greateEqual_3_0, "to");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGREATEQUAL"


    // $ANTLR start "entryRuleLESSEQUAL"
    // InternalMoStML.g:3198:1: entryRuleLESSEQUAL returns [EObject current=null] : iv_ruleLESSEQUAL= ruleLESSEQUAL EOF ;
    public final EObject entryRuleLESSEQUAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLESSEQUAL = null;


        try {
            // InternalMoStML.g:3198:50: (iv_ruleLESSEQUAL= ruleLESSEQUAL EOF )
            // InternalMoStML.g:3199:2: iv_ruleLESSEQUAL= ruleLESSEQUAL EOF
            {
             newCompositeNode(grammarAccess.getLESSEQUALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLESSEQUAL=ruleLESSEQUAL();

            state._fsp--;

             current =iv_ruleLESSEQUAL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLESSEQUAL"


    // $ANTLR start "ruleLESSEQUAL"
    // InternalMoStML.g:3205:1: ruleLESSEQUAL returns [EObject current=null] : ( ( (lv_lessEqual_0_0= 'less' ) ) otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'to' ) ;
    public final EObject ruleLESSEQUAL() throws RecognitionException {
        EObject current = null;

        Token lv_lessEqual_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoStML.g:3211:2: ( ( ( (lv_lessEqual_0_0= 'less' ) ) otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'to' ) )
            // InternalMoStML.g:3212:2: ( ( (lv_lessEqual_0_0= 'less' ) ) otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'to' )
            {
            // InternalMoStML.g:3212:2: ( ( (lv_lessEqual_0_0= 'less' ) ) otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'to' )
            // InternalMoStML.g:3213:3: ( (lv_lessEqual_0_0= 'less' ) ) otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'to'
            {
            // InternalMoStML.g:3213:3: ( (lv_lessEqual_0_0= 'less' ) )
            // InternalMoStML.g:3214:4: (lv_lessEqual_0_0= 'less' )
            {
            // InternalMoStML.g:3214:4: (lv_lessEqual_0_0= 'less' )
            // InternalMoStML.g:3215:5: lv_lessEqual_0_0= 'less'
            {
            lv_lessEqual_0_0=(Token)match(input,43,FOLLOW_31); 

            					newLeafNode(lv_lessEqual_0_0, grammarAccess.getLESSEQUALAccess().getLessEqualLessKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLESSEQUALRule());
            					}
            					setWithLastConsumed(current, "lessEqual", lv_lessEqual_0_0, "less");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getLESSEQUALAccess().getOrKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLESSEQUALAccess().getEqualKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLESSEQUALAccess().getToKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLESSEQUAL"


    // $ANTLR start "entryRuleNOTEQUAL"
    // InternalMoStML.g:3243:1: entryRuleNOTEQUAL returns [EObject current=null] : iv_ruleNOTEQUAL= ruleNOTEQUAL EOF ;
    public final EObject entryRuleNOTEQUAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOTEQUAL = null;


        try {
            // InternalMoStML.g:3243:49: (iv_ruleNOTEQUAL= ruleNOTEQUAL EOF )
            // InternalMoStML.g:3244:2: iv_ruleNOTEQUAL= ruleNOTEQUAL EOF
            {
             newCompositeNode(grammarAccess.getNOTEQUALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNOTEQUAL=ruleNOTEQUAL();

            state._fsp--;

             current =iv_ruleNOTEQUAL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNOTEQUAL"


    // $ANTLR start "ruleNOTEQUAL"
    // InternalMoStML.g:3250:1: ruleNOTEQUAL returns [EObject current=null] : ( ( (lv_notEqual_0_0= 'not' ) ) otherlv_1= 'equal' otherlv_2= 'to' ) ;
    public final EObject ruleNOTEQUAL() throws RecognitionException {
        EObject current = null;

        Token lv_notEqual_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMoStML.g:3256:2: ( ( ( (lv_notEqual_0_0= 'not' ) ) otherlv_1= 'equal' otherlv_2= 'to' ) )
            // InternalMoStML.g:3257:2: ( ( (lv_notEqual_0_0= 'not' ) ) otherlv_1= 'equal' otherlv_2= 'to' )
            {
            // InternalMoStML.g:3257:2: ( ( (lv_notEqual_0_0= 'not' ) ) otherlv_1= 'equal' otherlv_2= 'to' )
            // InternalMoStML.g:3258:3: ( (lv_notEqual_0_0= 'not' ) ) otherlv_1= 'equal' otherlv_2= 'to'
            {
            // InternalMoStML.g:3258:3: ( (lv_notEqual_0_0= 'not' ) )
            // InternalMoStML.g:3259:4: (lv_notEqual_0_0= 'not' )
            {
            // InternalMoStML.g:3259:4: (lv_notEqual_0_0= 'not' )
            // InternalMoStML.g:3260:5: lv_notEqual_0_0= 'not'
            {
            lv_notEqual_0_0=(Token)match(input,40,FOLLOW_32); 

            					newLeafNode(lv_notEqual_0_0, grammarAccess.getNOTEQUALAccess().getNotEqualNotKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNOTEQUALRule());
            					}
            					setWithLastConsumed(current, "notEqual", lv_notEqual_0_0, "not");
            				

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getNOTEQUALAccess().getEqualKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNOTEQUALAccess().getToKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNOTEQUAL"


    // $ANTLR start "entryRuleGREATER"
    // InternalMoStML.g:3284:1: entryRuleGREATER returns [EObject current=null] : iv_ruleGREATER= ruleGREATER EOF ;
    public final EObject entryRuleGREATER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGREATER = null;


        try {
            // InternalMoStML.g:3284:48: (iv_ruleGREATER= ruleGREATER EOF )
            // InternalMoStML.g:3285:2: iv_ruleGREATER= ruleGREATER EOF
            {
             newCompositeNode(grammarAccess.getGREATERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGREATER=ruleGREATER();

            state._fsp--;

             current =iv_ruleGREATER; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGREATER"


    // $ANTLR start "ruleGREATER"
    // InternalMoStML.g:3291:1: ruleGREATER returns [EObject current=null] : ( ( (lv_greater_0_0= 'greater' ) ) otherlv_1= 'than' ) ;
    public final EObject ruleGREATER() throws RecognitionException {
        EObject current = null;

        Token lv_greater_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:3297:2: ( ( ( (lv_greater_0_0= 'greater' ) ) otherlv_1= 'than' ) )
            // InternalMoStML.g:3298:2: ( ( (lv_greater_0_0= 'greater' ) ) otherlv_1= 'than' )
            {
            // InternalMoStML.g:3298:2: ( ( (lv_greater_0_0= 'greater' ) ) otherlv_1= 'than' )
            // InternalMoStML.g:3299:3: ( (lv_greater_0_0= 'greater' ) ) otherlv_1= 'than'
            {
            // InternalMoStML.g:3299:3: ( (lv_greater_0_0= 'greater' ) )
            // InternalMoStML.g:3300:4: (lv_greater_0_0= 'greater' )
            {
            // InternalMoStML.g:3300:4: (lv_greater_0_0= 'greater' )
            // InternalMoStML.g:3301:5: lv_greater_0_0= 'greater'
            {
            lv_greater_0_0=(Token)match(input,41,FOLLOW_33); 

            					newLeafNode(lv_greater_0_0, grammarAccess.getGREATERAccess().getGreaterGreaterKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGREATERRule());
            					}
            					setWithLastConsumed(current, "greater", lv_greater_0_0, "greater");
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGREATERAccess().getThanKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGREATER"


    // $ANTLR start "entryRuleLESS"
    // InternalMoStML.g:3321:1: entryRuleLESS returns [EObject current=null] : iv_ruleLESS= ruleLESS EOF ;
    public final EObject entryRuleLESS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLESS = null;


        try {
            // InternalMoStML.g:3321:45: (iv_ruleLESS= ruleLESS EOF )
            // InternalMoStML.g:3322:2: iv_ruleLESS= ruleLESS EOF
            {
             newCompositeNode(grammarAccess.getLESSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLESS=ruleLESS();

            state._fsp--;

             current =iv_ruleLESS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLESS"


    // $ANTLR start "ruleLESS"
    // InternalMoStML.g:3328:1: ruleLESS returns [EObject current=null] : ( ( (lv_less_0_0= 'less' ) ) ( (lv_less_1_0= 'than' ) ) ) ;
    public final EObject ruleLESS() throws RecognitionException {
        EObject current = null;

        Token lv_less_0_0=null;
        Token lv_less_1_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:3334:2: ( ( ( (lv_less_0_0= 'less' ) ) ( (lv_less_1_0= 'than' ) ) ) )
            // InternalMoStML.g:3335:2: ( ( (lv_less_0_0= 'less' ) ) ( (lv_less_1_0= 'than' ) ) )
            {
            // InternalMoStML.g:3335:2: ( ( (lv_less_0_0= 'less' ) ) ( (lv_less_1_0= 'than' ) ) )
            // InternalMoStML.g:3336:3: ( (lv_less_0_0= 'less' ) ) ( (lv_less_1_0= 'than' ) )
            {
            // InternalMoStML.g:3336:3: ( (lv_less_0_0= 'less' ) )
            // InternalMoStML.g:3337:4: (lv_less_0_0= 'less' )
            {
            // InternalMoStML.g:3337:4: (lv_less_0_0= 'less' )
            // InternalMoStML.g:3338:5: lv_less_0_0= 'less'
            {
            lv_less_0_0=(Token)match(input,43,FOLLOW_33); 

            					newLeafNode(lv_less_0_0, grammarAccess.getLESSAccess().getLessLessKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLESSRule());
            					}
            					addWithLastConsumed(current, "less", lv_less_0_0, "less");
            				

            }


            }

            // InternalMoStML.g:3350:3: ( (lv_less_1_0= 'than' ) )
            // InternalMoStML.g:3351:4: (lv_less_1_0= 'than' )
            {
            // InternalMoStML.g:3351:4: (lv_less_1_0= 'than' )
            // InternalMoStML.g:3352:5: lv_less_1_0= 'than'
            {
            lv_less_1_0=(Token)match(input,44,FOLLOW_2); 

            					newLeafNode(lv_less_1_0, grammarAccess.getLESSAccess().getLessThanKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLESSRule());
            					}
            					addWithLastConsumed(current, "less", lv_less_1_0, "than");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLESS"


    // $ANTLR start "entryRuleEQUAL"
    // InternalMoStML.g:3368:1: entryRuleEQUAL returns [EObject current=null] : iv_ruleEQUAL= ruleEQUAL EOF ;
    public final EObject entryRuleEQUAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQUAL = null;


        try {
            // InternalMoStML.g:3368:46: (iv_ruleEQUAL= ruleEQUAL EOF )
            // InternalMoStML.g:3369:2: iv_ruleEQUAL= ruleEQUAL EOF
            {
             newCompositeNode(grammarAccess.getEQUALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEQUAL=ruleEQUAL();

            state._fsp--;

             current =iv_ruleEQUAL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEQUAL"


    // $ANTLR start "ruleEQUAL"
    // InternalMoStML.g:3375:1: ruleEQUAL returns [EObject current=null] : ( ( (lv_equal_0_0= 'equal' ) ) otherlv_1= 'to' ) ;
    public final EObject ruleEQUAL() throws RecognitionException {
        EObject current = null;

        Token lv_equal_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:3381:2: ( ( ( (lv_equal_0_0= 'equal' ) ) otherlv_1= 'to' ) )
            // InternalMoStML.g:3382:2: ( ( (lv_equal_0_0= 'equal' ) ) otherlv_1= 'to' )
            {
            // InternalMoStML.g:3382:2: ( ( (lv_equal_0_0= 'equal' ) ) otherlv_1= 'to' )
            // InternalMoStML.g:3383:3: ( (lv_equal_0_0= 'equal' ) ) otherlv_1= 'to'
            {
            // InternalMoStML.g:3383:3: ( (lv_equal_0_0= 'equal' ) )
            // InternalMoStML.g:3384:4: (lv_equal_0_0= 'equal' )
            {
            // InternalMoStML.g:3384:4: (lv_equal_0_0= 'equal' )
            // InternalMoStML.g:3385:5: lv_equal_0_0= 'equal'
            {
            lv_equal_0_0=(Token)match(input,42,FOLLOW_7); 

            					newLeafNode(lv_equal_0_0, grammarAccess.getEQUALAccess().getEqualEqualKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEQUALRule());
            					}
            					setWithLastConsumed(current, "equal", lv_equal_0_0, "equal");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEQUALAccess().getToKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEQUAL"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\31\1\5\1\13\1\5\1\4\1\13\1\uffff\2\4\1\uffff\1\4";
    static final String dfa_3s = "\1\31\1\5\1\32\1\5\1\16\1\32\1\uffff\1\13\1\53\1\uffff\1\53";
    static final String dfa_4s = "\6\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3\16\uffff\1\4",
            "\1\5",
            "\1\7\11\uffff\1\6",
            "\1\3\16\uffff\1\4",
            "",
            "\1\10\6\uffff\1\11",
            "\1\12\6\uffff\1\11\1\6\33\uffff\4\6",
            "",
            "\1\12\6\uffff\1\11\1\6\33\uffff\4\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "80:4: (lv_model_0_1= ruleRequirement | lv_model_0_2= ruleNLRequirement )";
        }
    }
    static final String dfa_7s = "\u00dc\uffff";
    static final String dfa_8s = "\1\31\1\5\1\13\1\5\1\4\1\13\1\4\1\uffff\1\4\1\15\2\27\1\4\2\uffff\5\4\2\52\1\4\1\15\5\4\2\15\2\4\1\15\2\27\3\4\1\20\2\4\1\20\4\4\2\52\1\4\1\15\1\4\1\15\2\27\3\4\1\15\2\27\2\4\2\15\6\4\1\52\1\4\1\52\1\4\1\15\3\4\1\15\2\27\1\4\1\uffff\5\4\1\52\1\4\1\52\1\4\1\15\6\4\1\17\1\4\1\17\2\15\1\4\1\17\3\4\1\52\2\4\1\52\2\4\1\15\1\4\1\17\1\4\1\17\2\15\1\4\1\17\2\4\1\15\2\27\1\4\1\17\3\4\1\15\2\27\2\4\2\15\2\4\1\15\2\27\1\4\1\17\3\4\1\13\1\4\1\52\2\4\1\52\1\15\4\17\1\15\2\27\2\4\1\52\2\4\1\52\1\4\1\15\1\uffff\3\4\1\52\1\4\1\52\1\4\1\15\4\17\1\uffff\2\15\1\4\3\17\1\4\1\52\2\4\1\52\3\15\1\4\2\15\1\4\3\17\2\4\2\15\7\4";
    static final String dfa_9s = "\1\31\1\5\1\32\1\5\1\16\1\32\1\53\1\uffff\1\53\1\15\2\54\1\52\2\uffff\1\53\2\4\2\40\2\52\1\40\1\15\1\40\1\4\3\53\2\15\1\40\1\53\1\15\2\54\1\52\2\53\1\20\2\53\1\20\4\40\2\52\1\40\1\15\1\53\1\15\2\54\1\52\2\53\1\15\2\54\1\52\1\53\2\15\1\40\1\53\3\4\1\40\1\52\1\40\1\52\1\40\1\15\1\40\1\4\1\53\1\15\2\54\1\52\1\uffff\1\53\3\4\1\40\1\52\1\40\1\52\1\40\1\15\1\40\1\4\1\53\2\40\1\53\1\27\1\4\1\27\2\15\1\40\1\27\1\53\1\4\1\40\1\52\2\40\1\52\1\40\1\4\1\15\1\53\1\27\1\4\1\27\2\15\1\40\1\27\1\53\1\4\1\15\2\54\1\52\1\27\2\40\1\53\1\15\2\54\1\52\1\53\2\15\1\53\1\40\1\15\2\54\1\52\1\27\2\40\1\53\1\13\1\40\1\52\2\40\1\52\1\15\4\35\1\15\2\54\1\52\1\40\1\52\2\40\1\52\1\47\1\15\1\uffff\3\40\1\52\1\40\1\52\1\40\1\15\4\35\1\uffff\2\15\1\40\3\35\1\40\1\52\2\40\1\52\3\15\1\40\2\15\1\40\3\35\2\40\2\15\7\40";
    static final String dfa_10s = "\7\uffff\1\5\5\uffff\1\4\1\3\104\uffff\1\2\132\uffff\1\2\14\uffff\1\1\40\uffff";
    static final String dfa_11s = "\u00dc\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\1\3\16\uffff\1\4",
            "\1\5",
            "\1\7\11\uffff\1\6",
            "\1\3\16\uffff\1\4",
            "\1\10\12\uffff\1\15\1\uffff\5\16\2\15\20\uffff\1\14\1\13\1\11\1\12",
            "",
            "\1\17\23\uffff\1\15\7\uffff\1\20\1\21\6\uffff\1\14\1\13\1\11\1\12",
            "\1\22",
            "\1\24\24\uffff\1\23",
            "\1\25\24\uffff\1\26",
            "\1\30\33\uffff\1\31\11\uffff\1\27",
            "",
            "",
            "\1\32\23\uffff\1\15\7\uffff\1\20\1\21\6\uffff\1\14\1\13\1\11\1\12",
            "\1\33",
            "\1\34",
            "\1\30\33\uffff\1\31",
            "\1\30\33\uffff\1\31",
            "\1\35",
            "\1\36",
            "\1\30\33\uffff\1\31",
            "\1\37",
            "\1\30\33\uffff\1\31",
            "\1\40",
            "\1\32\23\uffff\1\15\7\uffff\1\20\1\21\6\uffff\1\44\1\43\1\41\1\42",
            "\1\15\12\uffff\1\47\6\uffff\1\45\1\46\20\uffff\4\15",
            "\1\15\12\uffff\1\52\6\uffff\1\50\1\51\20\uffff\4\15",
            "\1\53",
            "\1\54",
            "\1\30\33\uffff\1\31",
            "\1\15\12\uffff\1\47\6\uffff\1\45\1\46\20\uffff\4\15",
            "\1\55",
            "\1\57\24\uffff\1\56",
            "\1\60\24\uffff\1\61",
            "\1\30\2\15\27\uffff\2\15\1\31\11\uffff\1\62",
            "\1\63\43\uffff\1\67\1\66\1\64\1\65",
            "\1\63\43\uffff\1\67\1\66\1\64\1\65",
            "\1\70",
            "\1\71\43\uffff\1\75\1\74\1\72\1\73",
            "\1\71\43\uffff\1\75\1\74\1\72\1\73",
            "\1\76",
            "\1\30\33\uffff\1\31",
            "\1\30\33\uffff\1\31",
            "\1\30\2\15\27\uffff\2\15\1\31",
            "\1\30\2\15\27\uffff\2\15\1\31",
            "\1\77",
            "\1\100",
            "\1\30\2\15\27\uffff\2\15\1\31",
            "\1\101",
            "\1\102\23\uffff\1\104\7\uffff\1\103\1\105\6\uffff\1\67\1\66\1\64\1\65",
            "\1\106",
            "\1\107\24\uffff\1\110",
            "\1\111\24\uffff\1\112",
            "\1\114\33\uffff\1\115\11\uffff\1\113",
            "\1\116\6\uffff\1\123\34\uffff\1\122\1\121\1\117\1\120",
            "\1\124\23\uffff\1\126\7\uffff\1\125\1\127\6\uffff\1\75\1\74\1\72\1\73",
            "\1\130",
            "\1\131\24\uffff\1\132",
            "\1\133\24\uffff\1\134",
            "\1\136\33\uffff\1\137\11\uffff\1\135",
            "\1\140\43\uffff\4\15",
            "\1\141",
            "\1\142",
            "\1\30\2\15\27\uffff\2\15\1\31",
            "\1\143\23\uffff\1\104\7\uffff\1\103\1\105\6\uffff\1\67\1\66\1\64\1\65",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\114\33\uffff\1\115",
            "\1\147",
            "\1\114\33\uffff\1\115",
            "\1\150",
            "\1\114\33\uffff\1\115",
            "\1\151",
            "\1\114\33\uffff\1\115",
            "\1\152",
            "\1\153\33\uffff\1\154\1\15\6\uffff\1\122\1\121\1\117\1\120",
            "\1\155",
            "\1\156\24\uffff\1\157",
            "\1\161\24\uffff\1\160",
            "\1\162\33\uffff\1\163\11\uffff\1\164",
            "",
            "\1\165\23\uffff\1\126\7\uffff\1\125\1\127\6\uffff\1\75\1\74\1\72\1\73",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\136\33\uffff\1\137",
            "\1\171",
            "\1\136\33\uffff\1\137",
            "\1\172",
            "\1\136\33\uffff\1\137",
            "\1\173",
            "\1\136\33\uffff\1\137",
            "\1\174",
            "\1\175\33\uffff\1\15\1\176\6\uffff\4\15",
            "\1\30\2\15\27\uffff\2\15\1\31",
            "\1\30\2\15\27\uffff\2\15\1\31",
            "\1\143\23\uffff\1\104\7\uffff\1\103\1\105\6\uffff\1\u0082\1\u0081\1\177\1\u0080",
            "\1\47\6\uffff\1\45\1\46",
            "\1\u0083",
            "\1\47\6\uffff\1\45\1\46",
            "\1\u0084",
            "\1\u0085",
            "\1\114\33\uffff\1\115",
            "\1\47\6\uffff\1\45\1\46",
            "\1\u0086\33\uffff\1\154\1\15\6\uffff\1\u008a\1\u0089\1\u0087\1\u0088",
            "\1\u008b",
            "\1\162\33\uffff\1\163",
            "\1\u008c",
            "\1\162\33\uffff\1\163",
            "\1\162\33\uffff\1\163",
            "\1\u008d",
            "\1\162\33\uffff\1\163",
            "\1\u008e",
            "\1\u008f",
            "\1\165\23\uffff\1\126\7\uffff\1\125\1\127\6\uffff\1\u0093\1\u0092\1\u0090\1\u0091",
            "\1\52\6\uffff\1\50\1\51",
            "\1\u0094",
            "\1\52\6\uffff\1\50\1\51",
            "\1\u0095",
            "\1\u0096",
            "\1\136\33\uffff\1\137",
            "\1\52\6\uffff\1\50\1\51",
            "\1\u0097\33\uffff\1\15\1\176\6\uffff\4\15",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a\24\uffff\1\u009b",
            "\1\u009d\24\uffff\1\u009c",
            "\1\114\1\u009f\1\u00a0\27\uffff\1\u00a1\1\u00a2\1\115\11\uffff\1\u009e",
            "\1\47\6\uffff\1\45\1\46",
            "\1\114\33\uffff\1\115",
            "\1\114\33\uffff\1\115",
            "\1\u0086\33\uffff\1\154\1\15\6\uffff\1\u00a6\1\u00a5\1\u00a3\1\u00a4",
            "\1\u00a7",
            "\1\u00a8\24\uffff\1\u00a9",
            "\1\u00ab\24\uffff\1\u00aa",
            "\1\u00ac\33\uffff\1\163\11\uffff\1\u00ad",
            "\1\u00ae\6\uffff\1\u00ae\34\uffff\4\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00ae\6\uffff\1\u00ae\34\uffff\4\u00ae",
            "\1\162\33\uffff\1\163",
            "\1\u00b1",
            "\1\u00b2\24\uffff\1\u00b3",
            "\1\u00b4\24\uffff\1\u00b5",
            "\1\136\1\u00b7\1\u00b8\27\uffff\1\u00b9\1\u00ba\1\137\11\uffff\1\u00b6",
            "\1\52\6\uffff\1\50\1\51",
            "\1\136\33\uffff\1\137",
            "\1\136\33\uffff\1\137",
            "\1\u0097\33\uffff\1\15\1\176\6\uffff\4\15",
            "\1\u00bb",
            "\1\114\1\u009f\1\u00a0\27\uffff\1\u00a1\1\u00a2\1\115",
            "\1\u00bc",
            "\1\114\1\u009f\1\u00a0\27\uffff\1\u00a1\1\u00a2\1\115",
            "\1\114\1\u009f\1\u00a0\27\uffff\1\u00a1\1\u00a2\1\115",
            "\1\u00bd",
            "\1\u00be",
            "\1\47\6\uffff\1\45\1\46\3\uffff\1\u00c1\1\u00c0\1\u00bf",
            "\1\47\6\uffff\1\45\1\46\3\uffff\1\u00c1\1\u00c0\1\u00bf",
            "\1\47\6\uffff\1\45\1\46\3\uffff\1\u00c1\1\u00c0\1\u00bf",
            "\1\47\6\uffff\1\45\1\46\3\uffff\1\u00c1\1\u00c0\1\u00bf",
            "\1\u00c2",
            "\1\u00c3\24\uffff\1\u00c4",
            "\1\u00c6\24\uffff\1\u00c5",
            "\1\u00ac\2\15\27\uffff\2\15\1\163\11\uffff\1\u00c7",
            "\1\u00ac\33\uffff\1\163",
            "\1\u00c8",
            "\1\u00ac\33\uffff\1\163",
            "\1\u00ac\33\uffff\1\163",
            "\1\u00c9",
            "\1\162\33\uffff\1\163\1\uffff\1\15\1\uffff\4\15",
            "\1\u00ca",
            "",
            "\1\162\33\uffff\1\163",
            "\1\162\33\uffff\1\163",
            "\1\136\1\u00b7\1\u00b8\27\uffff\1\u00b9\1\u00ba\1\137",
            "\1\u00cb",
            "\1\136\1\u00b7\1\u00b8\27\uffff\1\u00b9\1\u00ba\1\137",
            "\1\u00cc",
            "\1\136\1\u00b7\1\u00b8\27\uffff\1\u00b9\1\u00ba\1\137",
            "\1\u00cd",
            "\1\52\6\uffff\1\50\1\51\3\uffff\1\u00d0\1\u00cf\1\u00ce",
            "\1\52\6\uffff\1\50\1\51\3\uffff\1\u00d0\1\u00cf\1\u00ce",
            "\1\52\6\uffff\1\50\1\51\3\uffff\1\u00d0\1\u00cf\1\u00ce",
            "\1\52\6\uffff\1\50\1\51\3\uffff\1\u00d0\1\u00cf\1\u00ce",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\114\1\u009f\1\u00a0\27\uffff\1\u00a1\1\u00a2\1\115",
            "\1\47\6\uffff\1\45\1\46\3\uffff\1\u00c1\1\u00c0\1\u00bf",
            "\1\47\6\uffff\1\45\1\46\3\uffff\1\u00c1\1\u00c0\1\u00bf",
            "\1\47\6\uffff\1\45\1\46\3\uffff\1\u00c1\1\u00c0\1\u00bf",
            "\1\u00ac\2\15\27\uffff\2\15\1\163",
            "\1\u00d3",
            "\1\u00ac\2\15\27\uffff\2\15\1\163",
            "\1\u00ac\2\15\27\uffff\2\15\1\163",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00ac\33\uffff\1\163",
            "\1\u00d8",
            "\1\u00d9",
            "\1\136\1\u00b7\1\u00b8\27\uffff\1\u00b9\1\u00ba\1\137",
            "\1\52\6\uffff\1\50\1\51\3\uffff\1\u00d0\1\u00cf\1\u00ce",
            "\1\52\6\uffff\1\50\1\51\3\uffff\1\u00d0\1\u00cf\1\u00ce",
            "\1\52\6\uffff\1\50\1\51\3\uffff\1\u00d0\1\u00cf\1\u00ce",
            "\1\114\1\u009f\1\u00a0\27\uffff\1\u00a1\1\u00a2\1\115",
            "\1\114\1\u009f\1\u00a0\27\uffff\1\u00a1\1\u00a2\1\115",
            "\1\u00da",
            "\1\u00db",
            "\1\u00ac\2\15\27\uffff\2\15\1\163",
            "\1\u00ac\33\uffff\1\163",
            "\1\u00ac\33\uffff\1\163",
            "\1\136\1\u00b7\1\u00b8\27\uffff\1\u00b9\1\u00ba\1\137",
            "\1\136\1\u00b7\1\u00b8\27\uffff\1\u00b9\1\u00ba\1\137",
            "\1\u00ac\2\15\27\uffff\2\15\1\163",
            "\1\u00ac\2\15\27\uffff\2\15\1\163"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "184:2: (this_MODE_0= ruleMODE | this_STATE_1= ruleSTATE | this_PROPERTY_2= rulePROPERTY | this_CONSTRAINT_3= ruleCONSTRAINT | this_Environment_4= ruleEnvironment )";
        }
    }
    static final String dfa_13s = "\27\uffff";
    static final String dfa_14s = "\2\4\1\uffff\1\4\2\uffff\1\4\1\15\2\27\2\4\1\52\1\4\1\52\1\4\1\15\1\uffff\2\15\3\4";
    static final String dfa_15s = "\2\53\1\uffff\1\53\2\uffff\1\53\1\15\2\54\1\52\1\40\1\52\1\40\1\52\1\40\1\15\1\uffff\2\15\3\40";
    static final String dfa_16s = "\2\uffff\1\1\1\uffff\1\3\1\4\13\uffff\1\2\5\uffff";
    static final String dfa_17s = "\27\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\43\uffff\4\2",
            "\1\3\23\uffff\1\5\7\uffff\1\2\1\4\6\uffff\4\2",
            "",
            "\1\6\23\uffff\1\5\7\uffff\1\2\1\4\6\uffff\4\2",
            "",
            "",
            "\1\6\23\uffff\1\5\7\uffff\1\2\1\4\6\uffff\1\12\1\11\1\7\1\10",
            "\1\13",
            "\1\14\24\uffff\1\15",
            "\1\16\24\uffff\1\17",
            "\1\2\2\21\27\uffff\2\21\1\2\11\uffff\1\20",
            "\1\2\2\21\27\uffff\2\21\1\2",
            "\1\22",
            "\1\2\2\21\27\uffff\2\21\1\2",
            "\1\23",
            "\1\2\2\21\27\uffff\2\21\1\2",
            "\1\24",
            "",
            "\1\25",
            "\1\26",
            "\1\2\2\21\27\uffff\2\21\1\2",
            "\1\2\2\21\27\uffff\2\21\1\2",
            "\1\2\2\21\27\uffff\2\21\1\2"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "458:6: (lv_preModeConditions_4_1= ruleSTATECONDITON | lv_preModeConditions_4_2= ruleATTRIBUTECONTION | lv_preModeConditions_4_3= ruleMODECONDITION | lv_preModeConditions_4_4= ruleSIGNALCONDITION )";
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "640:6: (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION )";
        }
    }
    static final String dfa_19s = "\2\4\1\uffff\1\4\2\uffff\1\4\1\15\2\27\2\4\1\52\2\4\1\52\1\uffff\3\15\3\4";
    static final String dfa_20s = "\2\53\1\uffff\1\53\2\uffff\1\53\1\15\2\54\1\52\1\40\1\52\2\40\1\52\1\uffff\3\15\3\40";
    static final String dfa_21s = "\2\uffff\1\1\1\uffff\1\4\1\3\12\uffff\1\2\6\uffff";
    static final String[] dfa_22s = {
            "\1\1\43\uffff\4\2",
            "\1\3\23\uffff\1\4\7\uffff\1\2\1\5\6\uffff\4\2",
            "",
            "\1\6\23\uffff\1\4\7\uffff\1\2\1\5\6\uffff\4\2",
            "",
            "",
            "\1\6\23\uffff\1\4\7\uffff\1\2\1\5\6\uffff\1\12\1\11\1\7\1\10",
            "\1\13",
            "\1\14\24\uffff\1\15",
            "\1\17\24\uffff\1\16",
            "\1\2\2\20\27\uffff\2\20\1\2\11\uffff\1\21",
            "\1\2\2\20\27\uffff\2\20\1\2",
            "\1\22",
            "\1\2\2\20\27\uffff\2\20\1\2",
            "\1\2\2\20\27\uffff\2\20\1\2",
            "\1\23",
            "",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\2\2\20\27\uffff\2\20\1\2",
            "\1\2\2\20\27\uffff\2\20\1\2",
            "\1\2\2\20\27\uffff\2\20\1\2"
    };
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_17;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "783:5: (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION )";
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_17;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "872:6: (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION )";
        }
    }
    static final String dfa_23s = "\47\uffff";
    static final String dfa_24s = "\2\4\1\uffff\1\4\1\uffff\1\4\1\15\2\27\1\4\1\15\2\27\2\4\1\52\2\4\1\52\1\4\1\15\1\4\1\52\2\4\1\52\1\uffff\3\15\1\uffff\1\4\2\15\5\4";
    static final String dfa_25s = "\2\53\1\uffff\1\53\1\uffff\1\53\1\15\2\54\1\52\1\15\2\54\1\52\1\40\1\52\2\40\1\52\1\47\1\15\1\40\1\52\2\40\1\52\1\uffff\3\15\1\uffff\1\40\2\15\5\40";
    static final String dfa_26s = "\2\uffff\1\1\1\uffff\1\3\25\uffff\1\2\3\uffff\1\4\10\uffff";
    static final String dfa_27s = "\47\uffff}>";
    static final String[] dfa_28s = {
            "\1\1\43\uffff\4\2",
            "\1\3\33\uffff\1\2\1\4\6\uffff\4\2",
            "",
            "\1\5\33\uffff\1\2\1\4\6\uffff\1\11\1\10\1\6\1\7",
            "",
            "\1\5\33\uffff\1\2\1\4\6\uffff\1\15\1\14\1\12\1\13",
            "\1\16",
            "\1\17\24\uffff\1\20",
            "\1\22\24\uffff\1\21",
            "\1\23\33\uffff\1\2\11\uffff\1\24",
            "\1\25",
            "\1\26\24\uffff\1\27",
            "\1\31\24\uffff\1\30",
            "\1\23\2\32\27\uffff\2\32\1\2\11\uffff\1\33",
            "\1\23\33\uffff\1\2",
            "\1\34",
            "\1\23\33\uffff\1\2",
            "\1\23\33\uffff\1\2",
            "\1\35",
            "\1\2\33\uffff\1\2\1\uffff\1\36\1\uffff\4\36",
            "\1\37",
            "\1\23\2\32\27\uffff\2\32\1\2",
            "\1\40",
            "\1\23\2\32\27\uffff\2\32\1\2",
            "\1\23\2\32\27\uffff\2\32\1\2",
            "\1\41",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "\1\23\33\uffff\1\2",
            "\1\45",
            "\1\46",
            "\1\23\2\32\27\uffff\2\32\1\2",
            "\1\23\33\uffff\1\2",
            "\1\23\33\uffff\1\2",
            "\1\23\2\32\27\uffff\2\32\1\2",
            "\1\23\2\32\27\uffff\2\32\1\2"
    };

    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_23;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "950:5: (lv_postConstraintCondition_7_1= ruleSTATECONDITON | lv_postConstraintCondition_7_2= ruleATTRIBUTECONTION | lv_postConstraintCondition_7_3= ruleMODECONDITION | lv_postConstraintCondition_7_4= ruleARITHMETICCONDITION )";
        }
    }
    static final String dfa_29s = "\26\uffff";
    static final String dfa_30s = "\2\4\1\uffff\1\4\1\uffff\1\4\1\15\2\27\2\4\1\52\2\4\1\52\1\uffff\3\15\3\4";
    static final String dfa_31s = "\2\53\1\uffff\1\53\1\uffff\1\53\1\15\2\54\1\52\1\40\1\52\2\40\1\52\1\uffff\3\15\3\40";
    static final String dfa_32s = "\2\uffff\1\1\1\uffff\1\3\12\uffff\1\2\6\uffff";
    static final String dfa_33s = "\26\uffff}>";
    static final String[] dfa_34s = {
            "\1\1\43\uffff\4\2",
            "\1\3\33\uffff\1\2\1\4\6\uffff\4\2",
            "",
            "\1\5\33\uffff\1\2\1\4\6\uffff\4\2",
            "",
            "\1\5\33\uffff\1\2\1\4\6\uffff\1\11\1\10\1\6\1\7",
            "\1\12",
            "\1\13\24\uffff\1\14",
            "\1\16\24\uffff\1\15",
            "\1\2\2\17\27\uffff\2\17\1\2\11\uffff\1\20",
            "\1\2\2\17\27\uffff\2\17\1\2",
            "\1\21",
            "\1\2\2\17\27\uffff\2\17\1\2",
            "\1\2\2\17\27\uffff\2\17\1\2",
            "\1\22",
            "",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\2\2\17\27\uffff\2\17\1\2",
            "\1\2\2\17\27\uffff\2\17\1\2",
            "\1\2\2\17\27\uffff\2\17\1\2"
    };

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_29;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_33;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "1102:5: (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION )";
        }
    }
    static final String dfa_35s = "\2\4\1\uffff\1\4\1\uffff\1\4\1\15\2\27\2\4\1\52\1\4\1\52\1\4\1\15\1\uffff\2\15\3\4";
    static final String dfa_36s = "\2\53\1\uffff\1\53\1\uffff\1\53\1\15\2\54\1\52\1\40\1\52\1\40\1\52\1\40\1\15\1\uffff\2\15\3\40";
    static final String dfa_37s = "\2\uffff\1\1\1\uffff\1\3\13\uffff\1\2\5\uffff";
    static final String[] dfa_38s = {
            "\1\1\43\uffff\4\2",
            "\1\3\33\uffff\1\2\1\4\6\uffff\4\2",
            "",
            "\1\5\33\uffff\1\2\1\4\6\uffff\4\2",
            "",
            "\1\5\33\uffff\1\2\1\4\6\uffff\1\11\1\10\1\6\1\7",
            "\1\12",
            "\1\13\24\uffff\1\14",
            "\1\15\24\uffff\1\16",
            "\1\2\2\20\27\uffff\2\20\1\2\11\uffff\1\17",
            "\1\2\2\20\27\uffff\2\20\1\2",
            "\1\21",
            "\1\2\2\20\27\uffff\2\20\1\2",
            "\1\22",
            "\1\2\2\20\27\uffff\2\20\1\2",
            "\1\23",
            "",
            "\1\24",
            "\1\25",
            "\1\2\2\20\27\uffff\2\20\1\2",
            "\1\2\2\20\27\uffff\2\20\1\2",
            "\1\2\2\20\27\uffff\2\20\1\2"
    };
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_29;
            this.eof = dfa_29;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_33;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "1175:6: (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION )";
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_29;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_33;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "1274:5: (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION )";
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_29;
            this.eof = dfa_29;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_33;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "1347:6: (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION )";
        }
    }
    static final String dfa_39s = "\5\uffff";
    static final String dfa_40s = "\2\4\1\uffff\1\4\1\uffff";
    static final String dfa_41s = "\2\53\1\uffff\1\53\1\uffff";
    static final String dfa_42s = "\2\uffff\1\2\1\uffff\1\1";
    static final String dfa_43s = "\5\uffff}>";
    static final String[] dfa_44s = {
            "\1\1\43\uffff\4\2",
            "\1\3\33\uffff\1\4\7\uffff\4\2",
            "",
            "\1\3\33\uffff\1\4\7\uffff\4\2",
            ""
    };

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_39;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "2494:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) ) ) | ( ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) ) ) )";
        }
    }
    static final String dfa_45s = "\4\uffff\1\12\6\uffff";
    static final String dfa_46s = "\1\50\1\uffff\2\27\1\4\6\uffff";
    static final String dfa_47s = "\1\53\1\uffff\2\54\1\52\6\uffff";
    static final String dfa_48s = "\1\uffff\1\1\3\uffff\1\2\1\5\1\6\1\3\1\4\1\7";
    static final String[] dfa_49s = {
            "\1\4\1\3\1\1\1\2",
            "",
            "\1\6\24\uffff\1\5",
            "\1\7\24\uffff\1\10",
            "\3\12\27\uffff\3\12\11\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_1;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_5;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "3025:2: (this_EQUAL_0= ruleEQUAL | this_LESS_1= ruleLESS | this_GREATER_2= ruleGREATER | this_NOTEQUAL_3= ruleNOTEQUAL | this_LESSEQUAL_4= ruleLESSEQUAL | this_GREATEQUAL_5= ruleGREATEQUAL | this_NOT_6= ruleNOT )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000F0000001010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000C0000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000038000810L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C08000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000F0000001810L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000F0000C09010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000F0000C01810L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000F400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});

}