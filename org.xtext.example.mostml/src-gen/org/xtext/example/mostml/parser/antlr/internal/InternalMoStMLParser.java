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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'initialised'", "'to'", "'when'", "','", "'then'", "'and'", "'all'", "'next'", "'exist'", "'globally'", "'future'", "'or'", "'receives'", "'['", "']'", "'m/s2'", "'kg'", "'s'", "'km/h'", "'TRUE'", "'FALSE'", "'state'", "'mode'", "'moduled'", "'by'", "'divided'", "'multiplied'", "'subtracted'", "'added'", "'not'", "'greater'", "'equal'", "'less'", "'than'"
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
    public static final int T__45=45;
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
            else if ( ((LA7_0>=41 && LA7_0<=44)) ) {
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

                        if ( ((LA6_0>=27 && LA6_0<=30)) ) {
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

                if ( (LA10_0==17||LA10_0==23) ) {
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
    // InternalMoStML.g:568:1: ruleSTATE returns [EObject current=null] : ( ( (lv_stateReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preStateConditions_2_0= ruleSTATECONDITON ) ) ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postStateCondition_7_0= ruleSTATECONDITON ) ) otherlv_8= '.' ) ;
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

        EObject lv_postStateCondition_7_0 = null;



        	enterRule();

        try {
            // InternalMoStML.g:574:2: ( ( ( (lv_stateReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preStateConditions_2_0= ruleSTATECONDITON ) ) ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postStateCondition_7_0= ruleSTATECONDITON ) ) otherlv_8= '.' ) )
            // InternalMoStML.g:575:2: ( ( (lv_stateReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preStateConditions_2_0= ruleSTATECONDITON ) ) ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postStateCondition_7_0= ruleSTATECONDITON ) ) otherlv_8= '.' )
            {
            // InternalMoStML.g:575:2: ( ( (lv_stateReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preStateConditions_2_0= ruleSTATECONDITON ) ) ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postStateCondition_7_0= ruleSTATECONDITON ) ) otherlv_8= '.' )
            // InternalMoStML.g:576:3: ( (lv_stateReqID_0_0= ruleReqID ) ) otherlv_1= 'when' ( (lv_preStateConditions_2_0= ruleSTATECONDITON ) ) ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION ) ) ) )* otherlv_5= ',' otherlv_6= 'then' ( (lv_postStateCondition_7_0= ruleSTATECONDITON ) ) otherlv_8= '.'
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

                if ( (LA12_0==17||LA12_0==23) ) {
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
            		
            otherlv_6=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getSTATEAccess().getThenKeyword_5());
            		
            // InternalMoStML.g:716:3: ( (lv_postStateCondition_7_0= ruleSTATECONDITON ) )
            // InternalMoStML.g:717:4: (lv_postStateCondition_7_0= ruleSTATECONDITON )
            {
            // InternalMoStML.g:717:4: (lv_postStateCondition_7_0= ruleSTATECONDITON )
            // InternalMoStML.g:718:5: lv_postStateCondition_7_0= ruleSTATECONDITON
            {

            					newCompositeNode(grammarAccess.getSTATEAccess().getPostStateConditionSTATECONDITONParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_postStateCondition_7_0=ruleSTATECONDITON();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSTATERule());
            					}
            					set(
            						current,
            						"postStateCondition",
            						lv_postStateCondition_7_0,
            						"org.xtext.example.mostml.MoStML.STATECONDITON");
            					afterParserOrEnumRuleCall();
            				

            }


            }

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

            otherlv_1=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCONSTRAINTAccess().getWhenKeyword_1());
            		
            // InternalMoStML.g:781:3: ( ( (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=41 && LA14_0<=44)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMoStML.g:782:4: ( (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION ) )
            	    {
            	    // InternalMoStML.g:782:4: ( (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION ) )
            	    // InternalMoStML.g:783:5: (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION )
            	    {
            	    // InternalMoStML.g:783:5: (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION )
            	    int alt13=4;
            	    alt13 = dfa13.predict(input);
            	    switch (alt13) {
            	        case 1 :
            	            // InternalMoStML.g:784:6: lv_preConstraintConditions_2_1= ruleSTATECONDITON
            	            {

            	            						newCompositeNode(grammarAccess.getCONSTRAINTAccess().getPreConstraintConditionsSTATECONDITONParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_14);
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
            	            					
            	            pushFollow(FOLLOW_14);
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
            	            					
            	            pushFollow(FOLLOW_14);
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
            	            					
            	            pushFollow(FOLLOW_14);
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
            	    break loop14;
                }
            } while (true);

            // InternalMoStML.g:850:3: ( ( (lv_relations_3_0= ruleRELATION ) ) ( ( (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION ) ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17||LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
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
            	    int alt15=4;
            	    alt15 = dfa15.predict(input);
            	    switch (alt15) {
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
            	    break loop16;
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
            int alt17=4;
            alt17 = dfa17.predict(input);
            switch (alt17) {
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

            otherlv_1=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPROPERTYAccess().getWhenKeyword_1());
            		
            // InternalMoStML.g:1063:3: ( ( (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator ) ) )
            // InternalMoStML.g:1064:4: ( (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator ) )
            {
            // InternalMoStML.g:1064:4: ( (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator ) )
            // InternalMoStML.g:1065:5: (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator )
            {
            // InternalMoStML.g:1065:5: (lv_preOperator_2_1= ruleCTLOperator | lv_preOperator_2_2= ruleLTLOperator )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18||LA18_0==20) ) {
                alt18=1;
            }
            else if ( (LA18_0==19||(LA18_0>=21 && LA18_0<=22)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMoStML.g:1066:6: lv_preOperator_2_1= ruleCTLOperator
                    {

                    						newCompositeNode(grammarAccess.getPROPERTYAccess().getPreOperatorCTLOperatorParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
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
                    					
                    pushFollow(FOLLOW_14);
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
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=41 && LA20_0<=44)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMoStML.g:1101:4: ( (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION ) )
            	    {
            	    // InternalMoStML.g:1101:4: ( (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION ) )
            	    // InternalMoStML.g:1102:5: (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION )
            	    {
            	    // InternalMoStML.g:1102:5: (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION )
            	    int alt19=3;
            	    alt19 = dfa19.predict(input);
            	    switch (alt19) {
            	        case 1 :
            	            // InternalMoStML.g:1103:6: lv_prePropertyConditions_3_1= ruleSTATECONDITON
            	            {

            	            						newCompositeNode(grammarAccess.getPROPERTYAccess().getPrePropertyConditionsSTATECONDITONParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_14);
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
            	            					
            	            pushFollow(FOLLOW_14);
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
            	            					
            	            pushFollow(FOLLOW_14);
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
            	    break loop20;
                }
            } while (true);

            // InternalMoStML.g:1153:3: ( ( (lv_preRelations_4_0= ruleRELATION ) ) ( ( (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION ) ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==17||LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
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
            	    int alt21=3;
            	    alt21 = dfa21.predict(input);
            	    switch (alt21) {
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
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getPROPERTYAccess().getCommaKeyword_5());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getPROPERTYAccess().getThenKeyword_6());
            		
            // InternalMoStML.g:1235:3: ( ( (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator ) ) )
            // InternalMoStML.g:1236:4: ( (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator ) )
            {
            // InternalMoStML.g:1236:4: ( (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator ) )
            // InternalMoStML.g:1237:5: (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator )
            {
            // InternalMoStML.g:1237:5: (lv_postOperator_8_1= ruleCTLOperator | lv_postOperator_8_2= ruleLTLOperator )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18||LA23_0==20) ) {
                alt23=1;
            }
            else if ( (LA23_0==19||(LA23_0>=21 && LA23_0<=22)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMoStML.g:1238:6: lv_postOperator_8_1= ruleCTLOperator
                    {

                    						newCompositeNode(grammarAccess.getPROPERTYAccess().getPostOperatorCTLOperatorParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_16);
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
                    					
                    pushFollow(FOLLOW_16);
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
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=41 && LA25_0<=44)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMoStML.g:1273:4: ( (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION ) )
            	    {
            	    // InternalMoStML.g:1273:4: ( (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION ) )
            	    // InternalMoStML.g:1274:5: (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION )
            	    {
            	    // InternalMoStML.g:1274:5: (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION )
            	    int alt24=3;
            	    alt24 = dfa24.predict(input);
            	    switch (alt24) {
            	        case 1 :
            	            // InternalMoStML.g:1275:6: lv_postPropertyConditions_9_1= ruleSTATECONDITON
            	            {

            	            						newCompositeNode(grammarAccess.getPROPERTYAccess().getPostPropertyConditionsSTATECONDITONParserRuleCall_8_0_0());
            	            					
            	            pushFollow(FOLLOW_16);
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
            	            					
            	            pushFollow(FOLLOW_16);
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
            	            					
            	            pushFollow(FOLLOW_16);
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
            	    break loop25;
                }
            } while (true);

            // InternalMoStML.g:1325:3: ( ( (lv_postRelations_10_0= ruleRELATION ) ) ( ( (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION ) ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==17||LA27_0==23) ) {
                    alt27=1;
                }


                switch (alt27) {
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
            	    int alt26=3;
            	    alt26 = dfa26.predict(input);
            	    switch (alt26) {
            	        case 1 :
            	            // InternalMoStML.g:1348:7: lv_postPropertyConditions_11_1= ruleSTATECONDITON
            	            {

            	            							newCompositeNode(grammarAccess.getPROPERTYAccess().getPostPropertyConditionsSTATECONDITONParserRuleCall_9_1_0_0());
            	            						
            	            pushFollow(FOLLOW_17);
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
            	            						
            	            pushFollow(FOLLOW_17);
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
            	            						
            	            pushFollow(FOLLOW_17);
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
            	    break loop27;
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
    // InternalMoStML.g:1414:1: ruleRANG returns [EObject current=null] : ( ( (lv_compOperator1_0_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound1_1_0= ruleATTRIBUTEVALUE ) ) otherlv_2= 'and' ( (lv_compOperator2_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound2_4_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_5_0= ruleUNIT ) ) ) ;
    public final EObject ruleRANG() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_compOperator1_0_0 = null;

        EObject lv_bound1_1_0 = null;

        EObject lv_compOperator2_3_0 = null;

        EObject lv_bound2_4_0 = null;

        EObject lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalMoStML.g:1420:2: ( ( ( (lv_compOperator1_0_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound1_1_0= ruleATTRIBUTEVALUE ) ) otherlv_2= 'and' ( (lv_compOperator2_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound2_4_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_5_0= ruleUNIT ) ) ) )
            // InternalMoStML.g:1421:2: ( ( (lv_compOperator1_0_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound1_1_0= ruleATTRIBUTEVALUE ) ) otherlv_2= 'and' ( (lv_compOperator2_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound2_4_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_5_0= ruleUNIT ) ) )
            {
            // InternalMoStML.g:1421:2: ( ( (lv_compOperator1_0_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound1_1_0= ruleATTRIBUTEVALUE ) ) otherlv_2= 'and' ( (lv_compOperator2_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound2_4_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_5_0= ruleUNIT ) ) )
            // InternalMoStML.g:1422:3: ( (lv_compOperator1_0_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound1_1_0= ruleATTRIBUTEVALUE ) ) otherlv_2= 'and' ( (lv_compOperator2_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_bound2_4_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_5_0= ruleUNIT ) )
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
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRANGAccess().getAndKeyword_2());
            		
            // InternalMoStML.g:1464:3: ( (lv_compOperator2_3_0= ruleCOMPARISONOPERATOR ) )
            // InternalMoStML.g:1465:4: (lv_compOperator2_3_0= ruleCOMPARISONOPERATOR )
            {
            // InternalMoStML.g:1465:4: (lv_compOperator2_3_0= ruleCOMPARISONOPERATOR )
            // InternalMoStML.g:1466:5: lv_compOperator2_3_0= ruleCOMPARISONOPERATOR
            {

            					newCompositeNode(grammarAccess.getRANGAccess().getCompOperator2COMPARISONOPERATORParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_compOperator2_3_0=ruleCOMPARISONOPERATOR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRANGRule());
            					}
            					set(
            						current,
            						"compOperator2",
            						lv_compOperator2_3_0,
            						"org.xtext.example.mostml.MoStML.COMPARISONOPERATOR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoStML.g:1483:3: ( (lv_bound2_4_0= ruleATTRIBUTEVALUE ) )
            // InternalMoStML.g:1484:4: (lv_bound2_4_0= ruleATTRIBUTEVALUE )
            {
            // InternalMoStML.g:1484:4: (lv_bound2_4_0= ruleATTRIBUTEVALUE )
            // InternalMoStML.g:1485:5: lv_bound2_4_0= ruleATTRIBUTEVALUE
            {

            					newCompositeNode(grammarAccess.getRANGAccess().getBound2ATTRIBUTEVALUEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_bound2_4_0=ruleATTRIBUTEVALUE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRANGRule());
            					}
            					set(
            						current,
            						"bound2",
            						lv_bound2_4_0,
            						"org.xtext.example.mostml.MoStML.ATTRIBUTEVALUE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoStML.g:1502:3: ( (lv_unit_5_0= ruleUNIT ) )
            // InternalMoStML.g:1503:4: (lv_unit_5_0= ruleUNIT )
            {
            // InternalMoStML.g:1503:4: (lv_unit_5_0= ruleUNIT )
            // InternalMoStML.g:1504:5: lv_unit_5_0= ruleUNIT
            {

            					newCompositeNode(grammarAccess.getRANGAccess().getUnitUNITParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_5_0=ruleUNIT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRANGRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_5_0,
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
    // InternalMoStML.g:1525:1: entryRuleCTLOperator returns [EObject current=null] : iv_ruleCTLOperator= ruleCTLOperator EOF ;
    public final EObject entryRuleCTLOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCTLOperator = null;


        try {
            // InternalMoStML.g:1525:52: (iv_ruleCTLOperator= ruleCTLOperator EOF )
            // InternalMoStML.g:1526:2: iv_ruleCTLOperator= ruleCTLOperator EOF
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
    // InternalMoStML.g:1532:1: ruleCTLOperator returns [EObject current=null] : (this_AG_0= ruleAG | this_AF_1= ruleAF | this_EF_2= ruleEF | this_EG_3= ruleEG | this_AX_4= ruleAX ) ;
    public final EObject ruleCTLOperator() throws RecognitionException {
        EObject current = null;

        EObject this_AG_0 = null;

        EObject this_AF_1 = null;

        EObject this_EF_2 = null;

        EObject this_EG_3 = null;

        EObject this_AX_4 = null;



        	enterRule();

        try {
            // InternalMoStML.g:1538:2: ( (this_AG_0= ruleAG | this_AF_1= ruleAF | this_EF_2= ruleEF | this_EG_3= ruleEG | this_AX_4= ruleAX ) )
            // InternalMoStML.g:1539:2: (this_AG_0= ruleAG | this_AF_1= ruleAF | this_EF_2= ruleEF | this_EG_3= ruleEG | this_AX_4= ruleAX )
            {
            // InternalMoStML.g:1539:2: (this_AG_0= ruleAG | this_AF_1= ruleAF | this_EF_2= ruleEF | this_EG_3= ruleEG | this_AX_4= ruleAX )
            int alt28=5;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    alt28=5;
                    }
                    break;
                case 22:
                    {
                    alt28=2;
                    }
                    break;
                case 21:
                    {
                    alt28=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA28_0==20) ) {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==21) ) {
                    alt28=4;
                }
                else if ( (LA28_2==22) ) {
                    alt28=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalMoStML.g:1540:3: this_AG_0= ruleAG
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
                    // InternalMoStML.g:1549:3: this_AF_1= ruleAF
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
                    // InternalMoStML.g:1558:3: this_EF_2= ruleEF
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
                    // InternalMoStML.g:1567:3: this_EG_3= ruleEG
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
                    // InternalMoStML.g:1576:3: this_AX_4= ruleAX
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
    // InternalMoStML.g:1588:1: entryRuleAX returns [EObject current=null] : iv_ruleAX= ruleAX EOF ;
    public final EObject entryRuleAX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAX = null;


        try {
            // InternalMoStML.g:1588:43: (iv_ruleAX= ruleAX EOF )
            // InternalMoStML.g:1589:2: iv_ruleAX= ruleAX EOF
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
    // InternalMoStML.g:1595:1: ruleAX returns [EObject current=null] : ( ( (lv_ax_0_0= 'all' ) ) otherlv_1= 'next' ) ;
    public final EObject ruleAX() throws RecognitionException {
        EObject current = null;

        Token lv_ax_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:1601:2: ( ( ( (lv_ax_0_0= 'all' ) ) otherlv_1= 'next' ) )
            // InternalMoStML.g:1602:2: ( ( (lv_ax_0_0= 'all' ) ) otherlv_1= 'next' )
            {
            // InternalMoStML.g:1602:2: ( ( (lv_ax_0_0= 'all' ) ) otherlv_1= 'next' )
            // InternalMoStML.g:1603:3: ( (lv_ax_0_0= 'all' ) ) otherlv_1= 'next'
            {
            // InternalMoStML.g:1603:3: ( (lv_ax_0_0= 'all' ) )
            // InternalMoStML.g:1604:4: (lv_ax_0_0= 'all' )
            {
            // InternalMoStML.g:1604:4: (lv_ax_0_0= 'all' )
            // InternalMoStML.g:1605:5: lv_ax_0_0= 'all'
            {
            lv_ax_0_0=(Token)match(input,18,FOLLOW_20); 

            					newLeafNode(lv_ax_0_0, grammarAccess.getAXAccess().getAxAllKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAXRule());
            					}
            					setWithLastConsumed(current, "ax", lv_ax_0_0, "all");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); 

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
    // InternalMoStML.g:1625:1: entryRuleEG returns [EObject current=null] : iv_ruleEG= ruleEG EOF ;
    public final EObject entryRuleEG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEG = null;


        try {
            // InternalMoStML.g:1625:43: (iv_ruleEG= ruleEG EOF )
            // InternalMoStML.g:1626:2: iv_ruleEG= ruleEG EOF
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
    // InternalMoStML.g:1632:1: ruleEG returns [EObject current=null] : ( ( (lv_eg_0_0= 'exist' ) ) otherlv_1= 'globally' ) ;
    public final EObject ruleEG() throws RecognitionException {
        EObject current = null;

        Token lv_eg_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:1638:2: ( ( ( (lv_eg_0_0= 'exist' ) ) otherlv_1= 'globally' ) )
            // InternalMoStML.g:1639:2: ( ( (lv_eg_0_0= 'exist' ) ) otherlv_1= 'globally' )
            {
            // InternalMoStML.g:1639:2: ( ( (lv_eg_0_0= 'exist' ) ) otherlv_1= 'globally' )
            // InternalMoStML.g:1640:3: ( (lv_eg_0_0= 'exist' ) ) otherlv_1= 'globally'
            {
            // InternalMoStML.g:1640:3: ( (lv_eg_0_0= 'exist' ) )
            // InternalMoStML.g:1641:4: (lv_eg_0_0= 'exist' )
            {
            // InternalMoStML.g:1641:4: (lv_eg_0_0= 'exist' )
            // InternalMoStML.g:1642:5: lv_eg_0_0= 'exist'
            {
            lv_eg_0_0=(Token)match(input,20,FOLLOW_21); 

            					newLeafNode(lv_eg_0_0, grammarAccess.getEGAccess().getEgExistKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEGRule());
            					}
            					setWithLastConsumed(current, "eg", lv_eg_0_0, "exist");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMoStML.g:1662:1: entryRuleEF returns [EObject current=null] : iv_ruleEF= ruleEF EOF ;
    public final EObject entryRuleEF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEF = null;


        try {
            // InternalMoStML.g:1662:43: (iv_ruleEF= ruleEF EOF )
            // InternalMoStML.g:1663:2: iv_ruleEF= ruleEF EOF
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
    // InternalMoStML.g:1669:1: ruleEF returns [EObject current=null] : ( ( (lv_ef_0_0= 'exist' ) ) otherlv_1= 'future' ) ;
    public final EObject ruleEF() throws RecognitionException {
        EObject current = null;

        Token lv_ef_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:1675:2: ( ( ( (lv_ef_0_0= 'exist' ) ) otherlv_1= 'future' ) )
            // InternalMoStML.g:1676:2: ( ( (lv_ef_0_0= 'exist' ) ) otherlv_1= 'future' )
            {
            // InternalMoStML.g:1676:2: ( ( (lv_ef_0_0= 'exist' ) ) otherlv_1= 'future' )
            // InternalMoStML.g:1677:3: ( (lv_ef_0_0= 'exist' ) ) otherlv_1= 'future'
            {
            // InternalMoStML.g:1677:3: ( (lv_ef_0_0= 'exist' ) )
            // InternalMoStML.g:1678:4: (lv_ef_0_0= 'exist' )
            {
            // InternalMoStML.g:1678:4: (lv_ef_0_0= 'exist' )
            // InternalMoStML.g:1679:5: lv_ef_0_0= 'exist'
            {
            lv_ef_0_0=(Token)match(input,20,FOLLOW_22); 

            					newLeafNode(lv_ef_0_0, grammarAccess.getEFAccess().getEfExistKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEFRule());
            					}
            					setWithLastConsumed(current, "ef", lv_ef_0_0, "exist");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMoStML.g:1699:1: entryRuleAF returns [EObject current=null] : iv_ruleAF= ruleAF EOF ;
    public final EObject entryRuleAF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAF = null;


        try {
            // InternalMoStML.g:1699:43: (iv_ruleAF= ruleAF EOF )
            // InternalMoStML.g:1700:2: iv_ruleAF= ruleAF EOF
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
    // InternalMoStML.g:1706:1: ruleAF returns [EObject current=null] : ( ( (lv_af_0_0= 'all' ) ) otherlv_1= 'future' ) ;
    public final EObject ruleAF() throws RecognitionException {
        EObject current = null;

        Token lv_af_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:1712:2: ( ( ( (lv_af_0_0= 'all' ) ) otherlv_1= 'future' ) )
            // InternalMoStML.g:1713:2: ( ( (lv_af_0_0= 'all' ) ) otherlv_1= 'future' )
            {
            // InternalMoStML.g:1713:2: ( ( (lv_af_0_0= 'all' ) ) otherlv_1= 'future' )
            // InternalMoStML.g:1714:3: ( (lv_af_0_0= 'all' ) ) otherlv_1= 'future'
            {
            // InternalMoStML.g:1714:3: ( (lv_af_0_0= 'all' ) )
            // InternalMoStML.g:1715:4: (lv_af_0_0= 'all' )
            {
            // InternalMoStML.g:1715:4: (lv_af_0_0= 'all' )
            // InternalMoStML.g:1716:5: lv_af_0_0= 'all'
            {
            lv_af_0_0=(Token)match(input,18,FOLLOW_22); 

            					newLeafNode(lv_af_0_0, grammarAccess.getAFAccess().getAfAllKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAFRule());
            					}
            					setWithLastConsumed(current, "af", lv_af_0_0, "all");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMoStML.g:1736:1: entryRuleAG returns [EObject current=null] : iv_ruleAG= ruleAG EOF ;
    public final EObject entryRuleAG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAG = null;


        try {
            // InternalMoStML.g:1736:43: (iv_ruleAG= ruleAG EOF )
            // InternalMoStML.g:1737:2: iv_ruleAG= ruleAG EOF
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
    // InternalMoStML.g:1743:1: ruleAG returns [EObject current=null] : ( ( (lv_ag_0_0= 'all' ) ) otherlv_1= 'globally' ) ;
    public final EObject ruleAG() throws RecognitionException {
        EObject current = null;

        Token lv_ag_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:1749:2: ( ( ( (lv_ag_0_0= 'all' ) ) otherlv_1= 'globally' ) )
            // InternalMoStML.g:1750:2: ( ( (lv_ag_0_0= 'all' ) ) otherlv_1= 'globally' )
            {
            // InternalMoStML.g:1750:2: ( ( (lv_ag_0_0= 'all' ) ) otherlv_1= 'globally' )
            // InternalMoStML.g:1751:3: ( (lv_ag_0_0= 'all' ) ) otherlv_1= 'globally'
            {
            // InternalMoStML.g:1751:3: ( (lv_ag_0_0= 'all' ) )
            // InternalMoStML.g:1752:4: (lv_ag_0_0= 'all' )
            {
            // InternalMoStML.g:1752:4: (lv_ag_0_0= 'all' )
            // InternalMoStML.g:1753:5: lv_ag_0_0= 'all'
            {
            lv_ag_0_0=(Token)match(input,18,FOLLOW_21); 

            					newLeafNode(lv_ag_0_0, grammarAccess.getAGAccess().getAgAllKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAGRule());
            					}
            					setWithLastConsumed(current, "ag", lv_ag_0_0, "all");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMoStML.g:1773:1: entryRuleLTLOperator returns [EObject current=null] : iv_ruleLTLOperator= ruleLTLOperator EOF ;
    public final EObject entryRuleLTLOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLTLOperator = null;


        try {
            // InternalMoStML.g:1773:52: (iv_ruleLTLOperator= ruleLTLOperator EOF )
            // InternalMoStML.g:1774:2: iv_ruleLTLOperator= ruleLTLOperator EOF
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
    // InternalMoStML.g:1780:1: ruleLTLOperator returns [EObject current=null] : (this_F_0= ruleF | this_G_1= ruleG | this_X_2= ruleX ) ;
    public final EObject ruleLTLOperator() throws RecognitionException {
        EObject current = null;

        EObject this_F_0 = null;

        EObject this_G_1 = null;

        EObject this_X_2 = null;



        	enterRule();

        try {
            // InternalMoStML.g:1786:2: ( (this_F_0= ruleF | this_G_1= ruleG | this_X_2= ruleX ) )
            // InternalMoStML.g:1787:2: (this_F_0= ruleF | this_G_1= ruleG | this_X_2= ruleX )
            {
            // InternalMoStML.g:1787:2: (this_F_0= ruleF | this_G_1= ruleG | this_X_2= ruleX )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt29=1;
                }
                break;
            case 21:
                {
                alt29=2;
                }
                break;
            case 19:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMoStML.g:1788:3: this_F_0= ruleF
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
                    // InternalMoStML.g:1797:3: this_G_1= ruleG
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
                    // InternalMoStML.g:1806:3: this_X_2= ruleX
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
    // InternalMoStML.g:1818:1: entryRuleF returns [EObject current=null] : iv_ruleF= ruleF EOF ;
    public final EObject entryRuleF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleF = null;


        try {
            // InternalMoStML.g:1818:42: (iv_ruleF= ruleF EOF )
            // InternalMoStML.g:1819:2: iv_ruleF= ruleF EOF
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
    // InternalMoStML.g:1825:1: ruleF returns [EObject current=null] : ( (lv_f_0_0= 'future' ) ) ;
    public final EObject ruleF() throws RecognitionException {
        EObject current = null;

        Token lv_f_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:1831:2: ( ( (lv_f_0_0= 'future' ) ) )
            // InternalMoStML.g:1832:2: ( (lv_f_0_0= 'future' ) )
            {
            // InternalMoStML.g:1832:2: ( (lv_f_0_0= 'future' ) )
            // InternalMoStML.g:1833:3: (lv_f_0_0= 'future' )
            {
            // InternalMoStML.g:1833:3: (lv_f_0_0= 'future' )
            // InternalMoStML.g:1834:4: lv_f_0_0= 'future'
            {
            lv_f_0_0=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMoStML.g:1849:1: entryRuleG returns [EObject current=null] : iv_ruleG= ruleG EOF ;
    public final EObject entryRuleG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleG = null;


        try {
            // InternalMoStML.g:1849:42: (iv_ruleG= ruleG EOF )
            // InternalMoStML.g:1850:2: iv_ruleG= ruleG EOF
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
    // InternalMoStML.g:1856:1: ruleG returns [EObject current=null] : ( (lv_g_0_0= 'globally' ) ) ;
    public final EObject ruleG() throws RecognitionException {
        EObject current = null;

        Token lv_g_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:1862:2: ( ( (lv_g_0_0= 'globally' ) ) )
            // InternalMoStML.g:1863:2: ( (lv_g_0_0= 'globally' ) )
            {
            // InternalMoStML.g:1863:2: ( (lv_g_0_0= 'globally' ) )
            // InternalMoStML.g:1864:3: (lv_g_0_0= 'globally' )
            {
            // InternalMoStML.g:1864:3: (lv_g_0_0= 'globally' )
            // InternalMoStML.g:1865:4: lv_g_0_0= 'globally'
            {
            lv_g_0_0=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMoStML.g:1880:1: entryRuleX returns [EObject current=null] : iv_ruleX= ruleX EOF ;
    public final EObject entryRuleX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX = null;


        try {
            // InternalMoStML.g:1880:42: (iv_ruleX= ruleX EOF )
            // InternalMoStML.g:1881:2: iv_ruleX= ruleX EOF
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
    // InternalMoStML.g:1887:1: ruleX returns [EObject current=null] : ( (lv_x_0_0= 'next' ) ) ;
    public final EObject ruleX() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:1893:2: ( ( (lv_x_0_0= 'next' ) ) )
            // InternalMoStML.g:1894:2: ( (lv_x_0_0= 'next' ) )
            {
            // InternalMoStML.g:1894:2: ( (lv_x_0_0= 'next' ) )
            // InternalMoStML.g:1895:3: (lv_x_0_0= 'next' )
            {
            // InternalMoStML.g:1895:3: (lv_x_0_0= 'next' )
            // InternalMoStML.g:1896:4: lv_x_0_0= 'next'
            {
            lv_x_0_0=(Token)match(input,19,FOLLOW_2); 

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
    // InternalMoStML.g:1911:1: entryRuleRELATION returns [EObject current=null] : iv_ruleRELATION= ruleRELATION EOF ;
    public final EObject entryRuleRELATION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRELATION = null;


        try {
            // InternalMoStML.g:1911:49: (iv_ruleRELATION= ruleRELATION EOF )
            // InternalMoStML.g:1912:2: iv_ruleRELATION= ruleRELATION EOF
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
    // InternalMoStML.g:1918:1: ruleRELATION returns [EObject current=null] : ( ( (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' ) ) ) ;
    public final EObject ruleRELATION() throws RecognitionException {
        EObject current = null;

        Token lv_relaion_0_1=null;
        Token lv_relaion_0_2=null;


        	enterRule();

        try {
            // InternalMoStML.g:1924:2: ( ( ( (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' ) ) ) )
            // InternalMoStML.g:1925:2: ( ( (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' ) ) )
            {
            // InternalMoStML.g:1925:2: ( ( (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' ) ) )
            // InternalMoStML.g:1926:3: ( (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' ) )
            {
            // InternalMoStML.g:1926:3: ( (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' ) )
            // InternalMoStML.g:1927:4: (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' )
            {
            // InternalMoStML.g:1927:4: (lv_relaion_0_1= 'and' | lv_relaion_0_2= 'or' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==17) ) {
                alt30=1;
            }
            else if ( (LA30_0==23) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMoStML.g:1928:5: lv_relaion_0_1= 'and'
                    {
                    lv_relaion_0_1=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_relaion_0_1, grammarAccess.getRELATIONAccess().getRelaionAndKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRELATIONRule());
                    					}
                    					setWithLastConsumed(current, "relaion", lv_relaion_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMoStML.g:1939:5: lv_relaion_0_2= 'or'
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
    // InternalMoStML.g:1955:1: entryRuleSIGNALCONDITION returns [EObject current=null] : iv_ruleSIGNALCONDITION= ruleSIGNALCONDITION EOF ;
    public final EObject entryRuleSIGNALCONDITION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSIGNALCONDITION = null;


        try {
            // InternalMoStML.g:1955:56: (iv_ruleSIGNALCONDITION= ruleSIGNALCONDITION EOF )
            // InternalMoStML.g:1956:2: iv_ruleSIGNALCONDITION= ruleSIGNALCONDITION EOF
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
    // InternalMoStML.g:1962:1: ruleSIGNALCONDITION returns [EObject current=null] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'receives' ( (lv_signalName_3_0= RULE_ID ) ) this_ID_4= RULE_ID ) ;
    public final EObject ruleSIGNALCONDITION() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token lv_signalName_3_0=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalMoStML.g:1968:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'receives' ( (lv_signalName_3_0= RULE_ID ) ) this_ID_4= RULE_ID ) )
            // InternalMoStML.g:1969:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'receives' ( (lv_signalName_3_0= RULE_ID ) ) this_ID_4= RULE_ID )
            {
            // InternalMoStML.g:1969:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'receives' ( (lv_signalName_3_0= RULE_ID ) ) this_ID_4= RULE_ID )
            // InternalMoStML.g:1970:3: this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'receives' ( (lv_signalName_3_0= RULE_ID ) ) this_ID_4= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            			newLeafNode(this_ID_0, grammarAccess.getSIGNALCONDITIONAccess().getIDTerminalRuleCall_0());
            		
            // InternalMoStML.g:1974:3: (this_ID_1= RULE_ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMoStML.g:1975:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    				newLeafNode(this_ID_1, grammarAccess.getSIGNALCONDITIONAccess().getIDTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSIGNALCONDITIONAccess().getReceivesKeyword_2());
            		
            // InternalMoStML.g:1984:3: ( (lv_signalName_3_0= RULE_ID ) )
            // InternalMoStML.g:1985:4: (lv_signalName_3_0= RULE_ID )
            {
            // InternalMoStML.g:1985:4: (lv_signalName_3_0= RULE_ID )
            // InternalMoStML.g:1986:5: lv_signalName_3_0= RULE_ID
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
    // InternalMoStML.g:2010:1: entryRuleReqID returns [EObject current=null] : iv_ruleReqID= ruleReqID EOF ;
    public final EObject entryRuleReqID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqID = null;


        try {
            // InternalMoStML.g:2010:46: (iv_ruleReqID= ruleReqID EOF )
            // InternalMoStML.g:2011:2: iv_ruleReqID= ruleReqID EOF
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
    // InternalMoStML.g:2017:1: ruleReqID returns [EObject current=null] : (otherlv_0= '[' ( (lv_reqID_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_reqID_3_0= RULE_INT ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleReqID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_reqID_1_0=null;
        Token otherlv_2=null;
        Token lv_reqID_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMoStML.g:2023:2: ( (otherlv_0= '[' ( (lv_reqID_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_reqID_3_0= RULE_INT ) ) )* otherlv_4= ']' ) )
            // InternalMoStML.g:2024:2: (otherlv_0= '[' ( (lv_reqID_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_reqID_3_0= RULE_INT ) ) )* otherlv_4= ']' )
            {
            // InternalMoStML.g:2024:2: (otherlv_0= '[' ( (lv_reqID_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_reqID_3_0= RULE_INT ) ) )* otherlv_4= ']' )
            // InternalMoStML.g:2025:3: otherlv_0= '[' ( (lv_reqID_1_0= RULE_INT ) ) (otherlv_2= '.' ( (lv_reqID_3_0= RULE_INT ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getReqIDAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMoStML.g:2029:3: ( (lv_reqID_1_0= RULE_INT ) )
            // InternalMoStML.g:2030:4: (lv_reqID_1_0= RULE_INT )
            {
            // InternalMoStML.g:2030:4: (lv_reqID_1_0= RULE_INT )
            // InternalMoStML.g:2031:5: lv_reqID_1_0= RULE_INT
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

            // InternalMoStML.g:2047:3: (otherlv_2= '.' ( (lv_reqID_3_0= RULE_INT ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==11) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMoStML.g:2048:4: otherlv_2= '.' ( (lv_reqID_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,11,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getReqIDAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalMoStML.g:2052:4: ( (lv_reqID_3_0= RULE_INT ) )
            	    // InternalMoStML.g:2053:5: (lv_reqID_3_0= RULE_INT )
            	    {
            	    // InternalMoStML.g:2053:5: (lv_reqID_3_0= RULE_INT )
            	    // InternalMoStML.g:2054:6: lv_reqID_3_0= RULE_INT
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
            	    break loop32;
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
    // InternalMoStML.g:2079:1: entryRuleATTRIBUTECONTION returns [EObject current=null] : iv_ruleATTRIBUTECONTION= ruleATTRIBUTECONTION EOF ;
    public final EObject entryRuleATTRIBUTECONTION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATTRIBUTECONTION = null;


        try {
            // InternalMoStML.g:2079:57: (iv_ruleATTRIBUTECONTION= ruleATTRIBUTECONTION EOF )
            // InternalMoStML.g:2080:2: iv_ruleATTRIBUTECONTION= ruleATTRIBUTECONTION EOF
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
    // InternalMoStML.g:2086:1: ruleATTRIBUTECONTION returns [EObject current=null] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ( (lv_attributeName_2_0= RULE_ID ) ) this_ID_3= RULE_ID ( (lv_operator_4_0= ruleCOMPARISONOPERATOR ) ) ( (lv_attributeValue_5_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_6_0= ruleUNIT ) )* ) ;
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
            // InternalMoStML.g:2092:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ( (lv_attributeName_2_0= RULE_ID ) ) this_ID_3= RULE_ID ( (lv_operator_4_0= ruleCOMPARISONOPERATOR ) ) ( (lv_attributeValue_5_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_6_0= ruleUNIT ) )* ) )
            // InternalMoStML.g:2093:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ( (lv_attributeName_2_0= RULE_ID ) ) this_ID_3= RULE_ID ( (lv_operator_4_0= ruleCOMPARISONOPERATOR ) ) ( (lv_attributeValue_5_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_6_0= ruleUNIT ) )* )
            {
            // InternalMoStML.g:2093:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ( (lv_attributeName_2_0= RULE_ID ) ) this_ID_3= RULE_ID ( (lv_operator_4_0= ruleCOMPARISONOPERATOR ) ) ( (lv_attributeValue_5_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_6_0= ruleUNIT ) )* )
            // InternalMoStML.g:2094:3: this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ( (lv_attributeName_2_0= RULE_ID ) ) this_ID_3= RULE_ID ( (lv_operator_4_0= ruleCOMPARISONOPERATOR ) ) ( (lv_attributeValue_5_0= ruleATTRIBUTEVALUE ) ) ( (lv_unit_6_0= ruleUNIT ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(this_ID_0, grammarAccess.getATTRIBUTECONTIONAccess().getIDTerminalRuleCall_0());
            		
            // InternalMoStML.g:2098:3: (this_ID_1= RULE_ID )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_ID) ) {
                        int LA33_2 = input.LA(3);

                        if ( (LA33_2==RULE_ID) ) {
                            alt33=1;
                        }


                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalMoStML.g:2099:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    				newLeafNode(this_ID_1, grammarAccess.getATTRIBUTECONTIONAccess().getIDTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalMoStML.g:2104:3: ( (lv_attributeName_2_0= RULE_ID ) )
            // InternalMoStML.g:2105:4: (lv_attributeName_2_0= RULE_ID )
            {
            // InternalMoStML.g:2105:4: (lv_attributeName_2_0= RULE_ID )
            // InternalMoStML.g:2106:5: lv_attributeName_2_0= RULE_ID
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
            		
            // InternalMoStML.g:2126:3: ( (lv_operator_4_0= ruleCOMPARISONOPERATOR ) )
            // InternalMoStML.g:2127:4: (lv_operator_4_0= ruleCOMPARISONOPERATOR )
            {
            // InternalMoStML.g:2127:4: (lv_operator_4_0= ruleCOMPARISONOPERATOR )
            // InternalMoStML.g:2128:5: lv_operator_4_0= ruleCOMPARISONOPERATOR
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

            // InternalMoStML.g:2145:3: ( (lv_attributeValue_5_0= ruleATTRIBUTEVALUE ) )
            // InternalMoStML.g:2146:4: (lv_attributeValue_5_0= ruleATTRIBUTEVALUE )
            {
            // InternalMoStML.g:2146:4: (lv_attributeValue_5_0= ruleATTRIBUTEVALUE )
            // InternalMoStML.g:2147:5: lv_attributeValue_5_0= ruleATTRIBUTEVALUE
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

            // InternalMoStML.g:2164:3: ( (lv_unit_6_0= ruleUNIT ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=27 && LA34_0<=30)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMoStML.g:2165:4: (lv_unit_6_0= ruleUNIT )
            	    {
            	    // InternalMoStML.g:2165:4: (lv_unit_6_0= ruleUNIT )
            	    // InternalMoStML.g:2166:5: lv_unit_6_0= ruleUNIT
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
            	    break loop34;
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
    // InternalMoStML.g:2187:1: entryRuleUNIT returns [EObject current=null] : iv_ruleUNIT= ruleUNIT EOF ;
    public final EObject entryRuleUNIT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNIT = null;


        try {
            // InternalMoStML.g:2187:45: (iv_ruleUNIT= ruleUNIT EOF )
            // InternalMoStML.g:2188:2: iv_ruleUNIT= ruleUNIT EOF
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
    // InternalMoStML.g:2194:1: ruleUNIT returns [EObject current=null] : (this_SPEED_0= ruleSPEED | this_ACC_1= ruleACC | this_TIME_2= ruleTIME | this_WEIGHT_3= ruleWEIGHT ) ;
    public final EObject ruleUNIT() throws RecognitionException {
        EObject current = null;

        EObject this_SPEED_0 = null;

        EObject this_ACC_1 = null;

        EObject this_TIME_2 = null;

        EObject this_WEIGHT_3 = null;



        	enterRule();

        try {
            // InternalMoStML.g:2200:2: ( (this_SPEED_0= ruleSPEED | this_ACC_1= ruleACC | this_TIME_2= ruleTIME | this_WEIGHT_3= ruleWEIGHT ) )
            // InternalMoStML.g:2201:2: (this_SPEED_0= ruleSPEED | this_ACC_1= ruleACC | this_TIME_2= ruleTIME | this_WEIGHT_3= ruleWEIGHT )
            {
            // InternalMoStML.g:2201:2: (this_SPEED_0= ruleSPEED | this_ACC_1= ruleACC | this_TIME_2= ruleTIME | this_WEIGHT_3= ruleWEIGHT )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt35=1;
                }
                break;
            case 27:
                {
                alt35=2;
                }
                break;
            case 29:
                {
                alt35=3;
                }
                break;
            case 28:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalMoStML.g:2202:3: this_SPEED_0= ruleSPEED
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
                    // InternalMoStML.g:2211:3: this_ACC_1= ruleACC
                    {

                    			newCompositeNode(grammarAccess.getUNITAccess().getACCParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ACC_1=ruleACC();

                    state._fsp--;


                    			current = this_ACC_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoStML.g:2220:3: this_TIME_2= ruleTIME
                    {

                    			newCompositeNode(grammarAccess.getUNITAccess().getTIMEParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TIME_2=ruleTIME();

                    state._fsp--;


                    			current = this_TIME_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMoStML.g:2229:3: this_WEIGHT_3= ruleWEIGHT
                    {

                    			newCompositeNode(grammarAccess.getUNITAccess().getWEIGHTParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WEIGHT_3=ruleWEIGHT();

                    state._fsp--;


                    			current = this_WEIGHT_3;
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


    // $ANTLR start "entryRuleACC"
    // InternalMoStML.g:2241:1: entryRuleACC returns [EObject current=null] : iv_ruleACC= ruleACC EOF ;
    public final EObject entryRuleACC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACC = null;


        try {
            // InternalMoStML.g:2241:44: (iv_ruleACC= ruleACC EOF )
            // InternalMoStML.g:2242:2: iv_ruleACC= ruleACC EOF
            {
             newCompositeNode(grammarAccess.getACCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleACC=ruleACC();

            state._fsp--;

             current =iv_ruleACC; 
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
    // $ANTLR end "entryRuleACC"


    // $ANTLR start "ruleACC"
    // InternalMoStML.g:2248:1: ruleACC returns [EObject current=null] : ( (lv_acc_0_0= 'm/s2' ) ) ;
    public final EObject ruleACC() throws RecognitionException {
        EObject current = null;

        Token lv_acc_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:2254:2: ( ( (lv_acc_0_0= 'm/s2' ) ) )
            // InternalMoStML.g:2255:2: ( (lv_acc_0_0= 'm/s2' ) )
            {
            // InternalMoStML.g:2255:2: ( (lv_acc_0_0= 'm/s2' ) )
            // InternalMoStML.g:2256:3: (lv_acc_0_0= 'm/s2' )
            {
            // InternalMoStML.g:2256:3: (lv_acc_0_0= 'm/s2' )
            // InternalMoStML.g:2257:4: lv_acc_0_0= 'm/s2'
            {
            lv_acc_0_0=(Token)match(input,27,FOLLOW_2); 

            				newLeafNode(lv_acc_0_0, grammarAccess.getACCAccess().getAccMS2Keyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getACCRule());
            				}
            				setWithLastConsumed(current, "acc", lv_acc_0_0, "m/s2");
            			

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
    // $ANTLR end "ruleACC"


    // $ANTLR start "entryRuleWEIGHT"
    // InternalMoStML.g:2272:1: entryRuleWEIGHT returns [EObject current=null] : iv_ruleWEIGHT= ruleWEIGHT EOF ;
    public final EObject entryRuleWEIGHT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWEIGHT = null;


        try {
            // InternalMoStML.g:2272:47: (iv_ruleWEIGHT= ruleWEIGHT EOF )
            // InternalMoStML.g:2273:2: iv_ruleWEIGHT= ruleWEIGHT EOF
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
    // InternalMoStML.g:2279:1: ruleWEIGHT returns [EObject current=null] : ( (lv_weight_0_0= 'kg' ) ) ;
    public final EObject ruleWEIGHT() throws RecognitionException {
        EObject current = null;

        Token lv_weight_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:2285:2: ( ( (lv_weight_0_0= 'kg' ) ) )
            // InternalMoStML.g:2286:2: ( (lv_weight_0_0= 'kg' ) )
            {
            // InternalMoStML.g:2286:2: ( (lv_weight_0_0= 'kg' ) )
            // InternalMoStML.g:2287:3: (lv_weight_0_0= 'kg' )
            {
            // InternalMoStML.g:2287:3: (lv_weight_0_0= 'kg' )
            // InternalMoStML.g:2288:4: lv_weight_0_0= 'kg'
            {
            lv_weight_0_0=(Token)match(input,28,FOLLOW_2); 

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
    // InternalMoStML.g:2303:1: entryRuleTIME returns [EObject current=null] : iv_ruleTIME= ruleTIME EOF ;
    public final EObject entryRuleTIME() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTIME = null;


        try {
            // InternalMoStML.g:2303:45: (iv_ruleTIME= ruleTIME EOF )
            // InternalMoStML.g:2304:2: iv_ruleTIME= ruleTIME EOF
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
    // InternalMoStML.g:2310:1: ruleTIME returns [EObject current=null] : ( (lv_time_0_0= 's' ) ) ;
    public final EObject ruleTIME() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:2316:2: ( ( (lv_time_0_0= 's' ) ) )
            // InternalMoStML.g:2317:2: ( (lv_time_0_0= 's' ) )
            {
            // InternalMoStML.g:2317:2: ( (lv_time_0_0= 's' ) )
            // InternalMoStML.g:2318:3: (lv_time_0_0= 's' )
            {
            // InternalMoStML.g:2318:3: (lv_time_0_0= 's' )
            // InternalMoStML.g:2319:4: lv_time_0_0= 's'
            {
            lv_time_0_0=(Token)match(input,29,FOLLOW_2); 

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
    // InternalMoStML.g:2334:1: entryRuleSPEED returns [EObject current=null] : iv_ruleSPEED= ruleSPEED EOF ;
    public final EObject entryRuleSPEED() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPEED = null;


        try {
            // InternalMoStML.g:2334:46: (iv_ruleSPEED= ruleSPEED EOF )
            // InternalMoStML.g:2335:2: iv_ruleSPEED= ruleSPEED EOF
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
    // InternalMoStML.g:2341:1: ruleSPEED returns [EObject current=null] : ( (lv_speed_0_0= 'km/h' ) ) ;
    public final EObject ruleSPEED() throws RecognitionException {
        EObject current = null;

        Token lv_speed_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:2347:2: ( ( (lv_speed_0_0= 'km/h' ) ) )
            // InternalMoStML.g:2348:2: ( (lv_speed_0_0= 'km/h' ) )
            {
            // InternalMoStML.g:2348:2: ( (lv_speed_0_0= 'km/h' ) )
            // InternalMoStML.g:2349:3: (lv_speed_0_0= 'km/h' )
            {
            // InternalMoStML.g:2349:3: (lv_speed_0_0= 'km/h' )
            // InternalMoStML.g:2350:4: lv_speed_0_0= 'km/h'
            {
            lv_speed_0_0=(Token)match(input,30,FOLLOW_2); 

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
    // InternalMoStML.g:2365:1: entryRuleATTRIBUTEVALUE returns [EObject current=null] : iv_ruleATTRIBUTEVALUE= ruleATTRIBUTEVALUE EOF ;
    public final EObject entryRuleATTRIBUTEVALUE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATTRIBUTEVALUE = null;


        try {
            // InternalMoStML.g:2365:55: (iv_ruleATTRIBUTEVALUE= ruleATTRIBUTEVALUE EOF )
            // InternalMoStML.g:2366:2: iv_ruleATTRIBUTEVALUE= ruleATTRIBUTEVALUE EOF
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
    // InternalMoStML.g:2372:1: ruleATTRIBUTEVALUE returns [EObject current=null] : (this_INTTYPE_0= ruleINTTYPE | this_STRINGTYPE_1= ruleSTRINGTYPE | this_BOOLEANTYPE_2= ruleBOOLEANTYPE ) ;
    public final EObject ruleATTRIBUTEVALUE() throws RecognitionException {
        EObject current = null;

        EObject this_INTTYPE_0 = null;

        EObject this_STRINGTYPE_1 = null;

        EObject this_BOOLEANTYPE_2 = null;



        	enterRule();

        try {
            // InternalMoStML.g:2378:2: ( (this_INTTYPE_0= ruleINTTYPE | this_STRINGTYPE_1= ruleSTRINGTYPE | this_BOOLEANTYPE_2= ruleBOOLEANTYPE ) )
            // InternalMoStML.g:2379:2: (this_INTTYPE_0= ruleINTTYPE | this_STRINGTYPE_1= ruleSTRINGTYPE | this_BOOLEANTYPE_2= ruleBOOLEANTYPE )
            {
            // InternalMoStML.g:2379:2: (this_INTTYPE_0= ruleINTTYPE | this_STRINGTYPE_1= ruleSTRINGTYPE | this_BOOLEANTYPE_2= ruleBOOLEANTYPE )
            int alt36=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt36=1;
                }
                break;
            case RULE_STRING:
                {
                alt36=2;
                }
                break;
            case 31:
            case 32:
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
                    // InternalMoStML.g:2380:3: this_INTTYPE_0= ruleINTTYPE
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
                    // InternalMoStML.g:2389:3: this_STRINGTYPE_1= ruleSTRINGTYPE
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
                    // InternalMoStML.g:2398:3: this_BOOLEANTYPE_2= ruleBOOLEANTYPE
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
    // InternalMoStML.g:2410:1: entryRuleSTRINGTYPE returns [EObject current=null] : iv_ruleSTRINGTYPE= ruleSTRINGTYPE EOF ;
    public final EObject entryRuleSTRINGTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTRINGTYPE = null;


        try {
            // InternalMoStML.g:2410:51: (iv_ruleSTRINGTYPE= ruleSTRINGTYPE EOF )
            // InternalMoStML.g:2411:2: iv_ruleSTRINGTYPE= ruleSTRINGTYPE EOF
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
    // InternalMoStML.g:2417:1: ruleSTRINGTYPE returns [EObject current=null] : ( (lv_string_0_0= RULE_STRING ) ) ;
    public final EObject ruleSTRINGTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:2423:2: ( ( (lv_string_0_0= RULE_STRING ) ) )
            // InternalMoStML.g:2424:2: ( (lv_string_0_0= RULE_STRING ) )
            {
            // InternalMoStML.g:2424:2: ( (lv_string_0_0= RULE_STRING ) )
            // InternalMoStML.g:2425:3: (lv_string_0_0= RULE_STRING )
            {
            // InternalMoStML.g:2425:3: (lv_string_0_0= RULE_STRING )
            // InternalMoStML.g:2426:4: lv_string_0_0= RULE_STRING
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
    // InternalMoStML.g:2445:1: entryRuleINTTYPE returns [EObject current=null] : iv_ruleINTTYPE= ruleINTTYPE EOF ;
    public final EObject entryRuleINTTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINTTYPE = null;


        try {
            // InternalMoStML.g:2445:48: (iv_ruleINTTYPE= ruleINTTYPE EOF )
            // InternalMoStML.g:2446:2: iv_ruleINTTYPE= ruleINTTYPE EOF
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
    // InternalMoStML.g:2452:1: ruleINTTYPE returns [EObject current=null] : ( (lv_int_0_0= RULE_INT ) ) ;
    public final EObject ruleINTTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_int_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:2458:2: ( ( (lv_int_0_0= RULE_INT ) ) )
            // InternalMoStML.g:2459:2: ( (lv_int_0_0= RULE_INT ) )
            {
            // InternalMoStML.g:2459:2: ( (lv_int_0_0= RULE_INT ) )
            // InternalMoStML.g:2460:3: (lv_int_0_0= RULE_INT )
            {
            // InternalMoStML.g:2460:3: (lv_int_0_0= RULE_INT )
            // InternalMoStML.g:2461:4: lv_int_0_0= RULE_INT
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
    // InternalMoStML.g:2480:1: entryRuleBOOLEANTYPE returns [EObject current=null] : iv_ruleBOOLEANTYPE= ruleBOOLEANTYPE EOF ;
    public final EObject entryRuleBOOLEANTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEANTYPE = null;


        try {
            // InternalMoStML.g:2480:52: (iv_ruleBOOLEANTYPE= ruleBOOLEANTYPE EOF )
            // InternalMoStML.g:2481:2: iv_ruleBOOLEANTYPE= ruleBOOLEANTYPE EOF
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
    // InternalMoStML.g:2487:1: ruleBOOLEANTYPE returns [EObject current=null] : ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) ;
    public final EObject ruleBOOLEANTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalMoStML.g:2493:2: ( ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) )
            // InternalMoStML.g:2494:2: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            {
            // InternalMoStML.g:2494:2: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            // InternalMoStML.g:2495:3: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            {
            // InternalMoStML.g:2495:3: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            // InternalMoStML.g:2496:4: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            {
            // InternalMoStML.g:2496:4: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            else if ( (LA37_0==32) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalMoStML.g:2497:5: lv_value_0_1= 'TRUE'
                    {
                    lv_value_0_1=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBOOLEANTYPEAccess().getValueTRUEKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBOOLEANTYPERule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMoStML.g:2508:5: lv_value_0_2= 'FALSE'
                    {
                    lv_value_0_2=(Token)match(input,32,FOLLOW_2); 

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
    // InternalMoStML.g:2524:1: entryRuleSTATECONDITON returns [EObject current=null] : iv_ruleSTATECONDITON= ruleSTATECONDITON EOF ;
    public final EObject entryRuleSTATECONDITON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTATECONDITON = null;


        try {
            // InternalMoStML.g:2524:54: (iv_ruleSTATECONDITON= ruleSTATECONDITON EOF )
            // InternalMoStML.g:2525:2: iv_ruleSTATECONDITON= ruleSTATECONDITON EOF
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
    // InternalMoStML.g:2531:1: ruleSTATECONDITON returns [EObject current=null] : ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) ) ) | ( ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) ) ) ) ;
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
            // InternalMoStML.g:2537:2: ( ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) ) ) | ( ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) ) ) ) )
            // InternalMoStML.g:2538:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) ) ) | ( ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) ) ) )
            {
            // InternalMoStML.g:2538:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) ) ) | ( ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) ) ) )
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalMoStML.g:2539:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) ) )
                    {
                    // InternalMoStML.g:2539:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) ) )
                    // InternalMoStML.g:2540:4: this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) )
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    				newLeafNode(this_ID_0, grammarAccess.getSTATECONDITONAccess().getIDTerminalRuleCall_0_0());
                    			
                    // InternalMoStML.g:2544:4: (this_ID_1= RULE_ID )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_ID) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalMoStML.g:2545:5: this_ID_1= RULE_ID
                    	    {
                    	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_27); 

                    	    					newLeafNode(this_ID_1, grammarAccess.getSTATECONDITONAccess().getIDTerminalRuleCall_0_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_2=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getSTATECONDITONAccess().getStateKeyword_0_2());
                    			
                    // InternalMoStML.g:2554:4: ( (lv_stateName_3_0= RULE_ID ) )
                    // InternalMoStML.g:2555:5: (lv_stateName_3_0= RULE_ID )
                    {
                    // InternalMoStML.g:2555:5: (lv_stateName_3_0= RULE_ID )
                    // InternalMoStML.g:2556:6: lv_stateName_3_0= RULE_ID
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
                    // InternalMoStML.g:2574:3: ( ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) ) )
                    {
                    // InternalMoStML.g:2574:3: ( ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) ) )
                    // InternalMoStML.g:2575:4: ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) )
                    {
                    // InternalMoStML.g:2575:4: ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) )
                    // InternalMoStML.g:2576:5: (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) )
                    {
                    // InternalMoStML.g:2576:5: (this_ID_4= RULE_ID )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalMoStML.g:2577:6: this_ID_4= RULE_ID
                    	    {
                    	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_6); 

                    	    						newLeafNode(this_ID_4, grammarAccess.getSTATECONDITONAccess().getIDTerminalRuleCall_1_0_0());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    // InternalMoStML.g:2582:5: ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) )
                    // InternalMoStML.g:2583:6: (lv_compOperator_5_0= ruleCOMPARISONOPERATOR )
                    {
                    // InternalMoStML.g:2583:6: (lv_compOperator_5_0= ruleCOMPARISONOPERATOR )
                    // InternalMoStML.g:2584:7: lv_compOperator_5_0= ruleCOMPARISONOPERATOR
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

                    // InternalMoStML.g:2602:4: (this_ID_6= RULE_ID )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_ID) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalMoStML.g:2603:5: this_ID_6= RULE_ID
                    	    {
                    	    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_27); 

                    	    					newLeafNode(this_ID_6, grammarAccess.getSTATECONDITONAccess().getIDTerminalRuleCall_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getSTATECONDITONAccess().getStateKeyword_1_2());
                    			
                    // InternalMoStML.g:2612:4: ( (lv_stateName_8_0= RULE_ID ) )
                    // InternalMoStML.g:2613:5: (lv_stateName_8_0= RULE_ID )
                    {
                    // InternalMoStML.g:2613:5: (lv_stateName_8_0= RULE_ID )
                    // InternalMoStML.g:2614:6: lv_stateName_8_0= RULE_ID
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
    // InternalMoStML.g:2635:1: entryRuleMODECONDITION returns [EObject current=null] : iv_ruleMODECONDITION= ruleMODECONDITION EOF ;
    public final EObject entryRuleMODECONDITION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODECONDITION = null;


        try {
            // InternalMoStML.g:2635:54: (iv_ruleMODECONDITION= ruleMODECONDITION EOF )
            // InternalMoStML.g:2636:2: iv_ruleMODECONDITION= ruleMODECONDITION EOF
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
    // InternalMoStML.g:2642:1: ruleMODECONDITION returns [EObject current=null] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'mode' ( (lv_modeName_3_0= RULE_ID ) ) ) ;
    public final EObject ruleMODECONDITION() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token lv_modeName_3_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:2648:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'mode' ( (lv_modeName_3_0= RULE_ID ) ) ) )
            // InternalMoStML.g:2649:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'mode' ( (lv_modeName_3_0= RULE_ID ) ) )
            {
            // InternalMoStML.g:2649:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'mode' ( (lv_modeName_3_0= RULE_ID ) ) )
            // InternalMoStML.g:2650:3: this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'mode' ( (lv_modeName_3_0= RULE_ID ) )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            			newLeafNode(this_ID_0, grammarAccess.getMODECONDITIONAccess().getIDTerminalRuleCall_0());
            		
            // InternalMoStML.g:2654:3: (this_ID_1= RULE_ID )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMoStML.g:2655:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    				newLeafNode(this_ID_1, grammarAccess.getMODECONDITIONAccess().getIDTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_2=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMODECONDITIONAccess().getModeKeyword_2());
            		
            // InternalMoStML.g:2664:3: ( (lv_modeName_3_0= RULE_ID ) )
            // InternalMoStML.g:2665:4: (lv_modeName_3_0= RULE_ID )
            {
            // InternalMoStML.g:2665:4: (lv_modeName_3_0= RULE_ID )
            // InternalMoStML.g:2666:5: lv_modeName_3_0= RULE_ID
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
    // InternalMoStML.g:2686:1: entryRuleARITHMETICCONDITION returns [EObject current=null] : iv_ruleARITHMETICCONDITION= ruleARITHMETICCONDITION EOF ;
    public final EObject entryRuleARITHMETICCONDITION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARITHMETICCONDITION = null;


        try {
            // InternalMoStML.g:2686:60: (iv_ruleARITHMETICCONDITION= ruleARITHMETICCONDITION EOF )
            // InternalMoStML.g:2687:2: iv_ruleARITHMETICCONDITION= ruleARITHMETICCONDITION EOF
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
    // InternalMoStML.g:2693:1: ruleARITHMETICCONDITION returns [EObject current=null] : (this_ID_0= RULE_ID ( (lv_result_1_0= RULE_ID ) ) (this_ID_2= RULE_ID )* ( (lv_compcondition_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_var1_4_0= RULE_ID ) ) ( (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR ) ) ( ( (lv_var2_6_0= RULE_ID ) ) | ( (lv_var3_7_0= RULE_INT ) ) ) ) ;
    public final EObject ruleARITHMETICCONDITION() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token lv_result_1_0=null;
        Token this_ID_2=null;
        Token lv_var1_4_0=null;
        Token lv_var2_6_0=null;
        Token lv_var3_7_0=null;
        EObject lv_compcondition_3_0 = null;

        EObject lv_arithmeticOperator_5_0 = null;



        	enterRule();

        try {
            // InternalMoStML.g:2699:2: ( (this_ID_0= RULE_ID ( (lv_result_1_0= RULE_ID ) ) (this_ID_2= RULE_ID )* ( (lv_compcondition_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_var1_4_0= RULE_ID ) ) ( (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR ) ) ( ( (lv_var2_6_0= RULE_ID ) ) | ( (lv_var3_7_0= RULE_INT ) ) ) ) )
            // InternalMoStML.g:2700:2: (this_ID_0= RULE_ID ( (lv_result_1_0= RULE_ID ) ) (this_ID_2= RULE_ID )* ( (lv_compcondition_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_var1_4_0= RULE_ID ) ) ( (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR ) ) ( ( (lv_var2_6_0= RULE_ID ) ) | ( (lv_var3_7_0= RULE_INT ) ) ) )
            {
            // InternalMoStML.g:2700:2: (this_ID_0= RULE_ID ( (lv_result_1_0= RULE_ID ) ) (this_ID_2= RULE_ID )* ( (lv_compcondition_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_var1_4_0= RULE_ID ) ) ( (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR ) ) ( ( (lv_var2_6_0= RULE_ID ) ) | ( (lv_var3_7_0= RULE_INT ) ) ) )
            // InternalMoStML.g:2701:3: this_ID_0= RULE_ID ( (lv_result_1_0= RULE_ID ) ) (this_ID_2= RULE_ID )* ( (lv_compcondition_3_0= ruleCOMPARISONOPERATOR ) ) ( (lv_var1_4_0= RULE_ID ) ) ( (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR ) ) ( ( (lv_var2_6_0= RULE_ID ) ) | ( (lv_var3_7_0= RULE_INT ) ) )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(this_ID_0, grammarAccess.getARITHMETICCONDITIONAccess().getIDTerminalRuleCall_0());
            		
            // InternalMoStML.g:2705:3: ( (lv_result_1_0= RULE_ID ) )
            // InternalMoStML.g:2706:4: (lv_result_1_0= RULE_ID )
            {
            // InternalMoStML.g:2706:4: (lv_result_1_0= RULE_ID )
            // InternalMoStML.g:2707:5: lv_result_1_0= RULE_ID
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

            // InternalMoStML.g:2723:3: (this_ID_2= RULE_ID )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMoStML.g:2724:4: this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				newLeafNode(this_ID_2, grammarAccess.getARITHMETICCONDITIONAccess().getIDTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // InternalMoStML.g:2729:3: ( (lv_compcondition_3_0= ruleCOMPARISONOPERATOR ) )
            // InternalMoStML.g:2730:4: (lv_compcondition_3_0= ruleCOMPARISONOPERATOR )
            {
            // InternalMoStML.g:2730:4: (lv_compcondition_3_0= ruleCOMPARISONOPERATOR )
            // InternalMoStML.g:2731:5: lv_compcondition_3_0= ruleCOMPARISONOPERATOR
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

            // InternalMoStML.g:2748:3: ( (lv_var1_4_0= RULE_ID ) )
            // InternalMoStML.g:2749:4: (lv_var1_4_0= RULE_ID )
            {
            // InternalMoStML.g:2749:4: (lv_var1_4_0= RULE_ID )
            // InternalMoStML.g:2750:5: lv_var1_4_0= RULE_ID
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

            // InternalMoStML.g:2766:3: ( (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR ) )
            // InternalMoStML.g:2767:4: (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR )
            {
            // InternalMoStML.g:2767:4: (lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR )
            // InternalMoStML.g:2768:5: lv_arithmeticOperator_5_0= ruleARITHMETICOPERATOR
            {

            					newCompositeNode(grammarAccess.getARITHMETICCONDITIONAccess().getArithmeticOperatorARITHMETICOPERATORParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalMoStML.g:2785:3: ( ( (lv_var2_6_0= RULE_ID ) ) | ( (lv_var3_7_0= RULE_INT ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_INT) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalMoStML.g:2786:4: ( (lv_var2_6_0= RULE_ID ) )
                    {
                    // InternalMoStML.g:2786:4: ( (lv_var2_6_0= RULE_ID ) )
                    // InternalMoStML.g:2787:5: (lv_var2_6_0= RULE_ID )
                    {
                    // InternalMoStML.g:2787:5: (lv_var2_6_0= RULE_ID )
                    // InternalMoStML.g:2788:6: lv_var2_6_0= RULE_ID
                    {
                    lv_var2_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_var2_6_0, grammarAccess.getARITHMETICCONDITIONAccess().getVar2IDTerminalRuleCall_6_0_0());
                    					

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
                    break;
                case 2 :
                    // InternalMoStML.g:2805:4: ( (lv_var3_7_0= RULE_INT ) )
                    {
                    // InternalMoStML.g:2805:4: ( (lv_var3_7_0= RULE_INT ) )
                    // InternalMoStML.g:2806:5: (lv_var3_7_0= RULE_INT )
                    {
                    // InternalMoStML.g:2806:5: (lv_var3_7_0= RULE_INT )
                    // InternalMoStML.g:2807:6: lv_var3_7_0= RULE_INT
                    {
                    lv_var3_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_var3_7_0, grammarAccess.getARITHMETICCONDITIONAccess().getVar3INTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getARITHMETICCONDITIONRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"var3",
                    							lv_var3_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

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
    // InternalMoStML.g:2828:1: entryRuleARITHMETICOPERATOR returns [EObject current=null] : iv_ruleARITHMETICOPERATOR= ruleARITHMETICOPERATOR EOF ;
    public final EObject entryRuleARITHMETICOPERATOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARITHMETICOPERATOR = null;


        try {
            // InternalMoStML.g:2828:59: (iv_ruleARITHMETICOPERATOR= ruleARITHMETICOPERATOR EOF )
            // InternalMoStML.g:2829:2: iv_ruleARITHMETICOPERATOR= ruleARITHMETICOPERATOR EOF
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
    // InternalMoStML.g:2835:1: ruleARITHMETICOPERATOR returns [EObject current=null] : (this_ADD_0= ruleADD | this_SUBTRACTION_1= ruleSUBTRACTION | this_MULTIPLICATION_2= ruleMULTIPLICATION | this_DIVISION_3= ruleDIVISION | this_MODULE_4= ruleMODULE ) ;
    public final EObject ruleARITHMETICOPERATOR() throws RecognitionException {
        EObject current = null;

        EObject this_ADD_0 = null;

        EObject this_SUBTRACTION_1 = null;

        EObject this_MULTIPLICATION_2 = null;

        EObject this_DIVISION_3 = null;

        EObject this_MODULE_4 = null;



        	enterRule();

        try {
            // InternalMoStML.g:2841:2: ( (this_ADD_0= ruleADD | this_SUBTRACTION_1= ruleSUBTRACTION | this_MULTIPLICATION_2= ruleMULTIPLICATION | this_DIVISION_3= ruleDIVISION | this_MODULE_4= ruleMODULE ) )
            // InternalMoStML.g:2842:2: (this_ADD_0= ruleADD | this_SUBTRACTION_1= ruleSUBTRACTION | this_MULTIPLICATION_2= ruleMULTIPLICATION | this_DIVISION_3= ruleDIVISION | this_MODULE_4= ruleMODULE )
            {
            // InternalMoStML.g:2842:2: (this_ADD_0= ruleADD | this_SUBTRACTION_1= ruleSUBTRACTION | this_MULTIPLICATION_2= ruleMULTIPLICATION | this_DIVISION_3= ruleDIVISION | this_MODULE_4= ruleMODULE )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt45=1;
                }
                break;
            case 39:
                {
                alt45=2;
                }
                break;
            case 38:
                {
                alt45=3;
                }
                break;
            case 37:
                {
                alt45=4;
                }
                break;
            case 35:
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
                    // InternalMoStML.g:2843:3: this_ADD_0= ruleADD
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
                    // InternalMoStML.g:2852:3: this_SUBTRACTION_1= ruleSUBTRACTION
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
                    // InternalMoStML.g:2861:3: this_MULTIPLICATION_2= ruleMULTIPLICATION
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
                    // InternalMoStML.g:2870:3: this_DIVISION_3= ruleDIVISION
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
                    // InternalMoStML.g:2879:3: this_MODULE_4= ruleMODULE
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
    // InternalMoStML.g:2891:1: entryRuleMODULE returns [EObject current=null] : iv_ruleMODULE= ruleMODULE EOF ;
    public final EObject entryRuleMODULE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODULE = null;


        try {
            // InternalMoStML.g:2891:47: (iv_ruleMODULE= ruleMODULE EOF )
            // InternalMoStML.g:2892:2: iv_ruleMODULE= ruleMODULE EOF
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
    // InternalMoStML.g:2898:1: ruleMODULE returns [EObject current=null] : ( ( (lv_add_0_0= 'moduled' ) ) otherlv_1= 'by' ) ;
    public final EObject ruleMODULE() throws RecognitionException {
        EObject current = null;

        Token lv_add_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:2904:2: ( ( ( (lv_add_0_0= 'moduled' ) ) otherlv_1= 'by' ) )
            // InternalMoStML.g:2905:2: ( ( (lv_add_0_0= 'moduled' ) ) otherlv_1= 'by' )
            {
            // InternalMoStML.g:2905:2: ( ( (lv_add_0_0= 'moduled' ) ) otherlv_1= 'by' )
            // InternalMoStML.g:2906:3: ( (lv_add_0_0= 'moduled' ) ) otherlv_1= 'by'
            {
            // InternalMoStML.g:2906:3: ( (lv_add_0_0= 'moduled' ) )
            // InternalMoStML.g:2907:4: (lv_add_0_0= 'moduled' )
            {
            // InternalMoStML.g:2907:4: (lv_add_0_0= 'moduled' )
            // InternalMoStML.g:2908:5: lv_add_0_0= 'moduled'
            {
            lv_add_0_0=(Token)match(input,35,FOLLOW_31); 

            					newLeafNode(lv_add_0_0, grammarAccess.getMODULEAccess().getAddModuledKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMODULERule());
            					}
            					setWithLastConsumed(current, "add", lv_add_0_0, "moduled");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMoStML.g:2928:1: entryRuleDIVISION returns [EObject current=null] : iv_ruleDIVISION= ruleDIVISION EOF ;
    public final EObject entryRuleDIVISION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDIVISION = null;


        try {
            // InternalMoStML.g:2928:49: (iv_ruleDIVISION= ruleDIVISION EOF )
            // InternalMoStML.g:2929:2: iv_ruleDIVISION= ruleDIVISION EOF
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
    // InternalMoStML.g:2935:1: ruleDIVISION returns [EObject current=null] : ( ( (lv_division_0_0= 'divided' ) ) otherlv_1= 'by' ) ;
    public final EObject ruleDIVISION() throws RecognitionException {
        EObject current = null;

        Token lv_division_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:2941:2: ( ( ( (lv_division_0_0= 'divided' ) ) otherlv_1= 'by' ) )
            // InternalMoStML.g:2942:2: ( ( (lv_division_0_0= 'divided' ) ) otherlv_1= 'by' )
            {
            // InternalMoStML.g:2942:2: ( ( (lv_division_0_0= 'divided' ) ) otherlv_1= 'by' )
            // InternalMoStML.g:2943:3: ( (lv_division_0_0= 'divided' ) ) otherlv_1= 'by'
            {
            // InternalMoStML.g:2943:3: ( (lv_division_0_0= 'divided' ) )
            // InternalMoStML.g:2944:4: (lv_division_0_0= 'divided' )
            {
            // InternalMoStML.g:2944:4: (lv_division_0_0= 'divided' )
            // InternalMoStML.g:2945:5: lv_division_0_0= 'divided'
            {
            lv_division_0_0=(Token)match(input,37,FOLLOW_31); 

            					newLeafNode(lv_division_0_0, grammarAccess.getDIVISIONAccess().getDivisionDividedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDIVISIONRule());
            					}
            					setWithLastConsumed(current, "division", lv_division_0_0, "divided");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMoStML.g:2965:1: entryRuleMULTIPLICATION returns [EObject current=null] : iv_ruleMULTIPLICATION= ruleMULTIPLICATION EOF ;
    public final EObject entryRuleMULTIPLICATION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMULTIPLICATION = null;


        try {
            // InternalMoStML.g:2965:55: (iv_ruleMULTIPLICATION= ruleMULTIPLICATION EOF )
            // InternalMoStML.g:2966:2: iv_ruleMULTIPLICATION= ruleMULTIPLICATION EOF
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
    // InternalMoStML.g:2972:1: ruleMULTIPLICATION returns [EObject current=null] : ( ( (lv_multiplication_0_0= 'multiplied' ) ) otherlv_1= 'by' ) ;
    public final EObject ruleMULTIPLICATION() throws RecognitionException {
        EObject current = null;

        Token lv_multiplication_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:2978:2: ( ( ( (lv_multiplication_0_0= 'multiplied' ) ) otherlv_1= 'by' ) )
            // InternalMoStML.g:2979:2: ( ( (lv_multiplication_0_0= 'multiplied' ) ) otherlv_1= 'by' )
            {
            // InternalMoStML.g:2979:2: ( ( (lv_multiplication_0_0= 'multiplied' ) ) otherlv_1= 'by' )
            // InternalMoStML.g:2980:3: ( (lv_multiplication_0_0= 'multiplied' ) ) otherlv_1= 'by'
            {
            // InternalMoStML.g:2980:3: ( (lv_multiplication_0_0= 'multiplied' ) )
            // InternalMoStML.g:2981:4: (lv_multiplication_0_0= 'multiplied' )
            {
            // InternalMoStML.g:2981:4: (lv_multiplication_0_0= 'multiplied' )
            // InternalMoStML.g:2982:5: lv_multiplication_0_0= 'multiplied'
            {
            lv_multiplication_0_0=(Token)match(input,38,FOLLOW_31); 

            					newLeafNode(lv_multiplication_0_0, grammarAccess.getMULTIPLICATIONAccess().getMultiplicationMultipliedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMULTIPLICATIONRule());
            					}
            					setWithLastConsumed(current, "multiplication", lv_multiplication_0_0, "multiplied");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMoStML.g:3002:1: entryRuleSUBTRACTION returns [EObject current=null] : iv_ruleSUBTRACTION= ruleSUBTRACTION EOF ;
    public final EObject entryRuleSUBTRACTION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSUBTRACTION = null;


        try {
            // InternalMoStML.g:3002:52: (iv_ruleSUBTRACTION= ruleSUBTRACTION EOF )
            // InternalMoStML.g:3003:2: iv_ruleSUBTRACTION= ruleSUBTRACTION EOF
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
    // InternalMoStML.g:3009:1: ruleSUBTRACTION returns [EObject current=null] : ( ( (lv_substraction_0_0= 'subtracted' ) ) otherlv_1= 'by' ) ;
    public final EObject ruleSUBTRACTION() throws RecognitionException {
        EObject current = null;

        Token lv_substraction_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:3015:2: ( ( ( (lv_substraction_0_0= 'subtracted' ) ) otherlv_1= 'by' ) )
            // InternalMoStML.g:3016:2: ( ( (lv_substraction_0_0= 'subtracted' ) ) otherlv_1= 'by' )
            {
            // InternalMoStML.g:3016:2: ( ( (lv_substraction_0_0= 'subtracted' ) ) otherlv_1= 'by' )
            // InternalMoStML.g:3017:3: ( (lv_substraction_0_0= 'subtracted' ) ) otherlv_1= 'by'
            {
            // InternalMoStML.g:3017:3: ( (lv_substraction_0_0= 'subtracted' ) )
            // InternalMoStML.g:3018:4: (lv_substraction_0_0= 'subtracted' )
            {
            // InternalMoStML.g:3018:4: (lv_substraction_0_0= 'subtracted' )
            // InternalMoStML.g:3019:5: lv_substraction_0_0= 'subtracted'
            {
            lv_substraction_0_0=(Token)match(input,39,FOLLOW_31); 

            					newLeafNode(lv_substraction_0_0, grammarAccess.getSUBTRACTIONAccess().getSubstractionSubtractedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSUBTRACTIONRule());
            					}
            					setWithLastConsumed(current, "substraction", lv_substraction_0_0, "subtracted");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMoStML.g:3039:1: entryRuleADD returns [EObject current=null] : iv_ruleADD= ruleADD EOF ;
    public final EObject entryRuleADD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADD = null;


        try {
            // InternalMoStML.g:3039:44: (iv_ruleADD= ruleADD EOF )
            // InternalMoStML.g:3040:2: iv_ruleADD= ruleADD EOF
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
    // InternalMoStML.g:3046:1: ruleADD returns [EObject current=null] : ( ( (lv_add_0_0= 'added' ) ) otherlv_1= 'by' ) ;
    public final EObject ruleADD() throws RecognitionException {
        EObject current = null;

        Token lv_add_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:3052:2: ( ( ( (lv_add_0_0= 'added' ) ) otherlv_1= 'by' ) )
            // InternalMoStML.g:3053:2: ( ( (lv_add_0_0= 'added' ) ) otherlv_1= 'by' )
            {
            // InternalMoStML.g:3053:2: ( ( (lv_add_0_0= 'added' ) ) otherlv_1= 'by' )
            // InternalMoStML.g:3054:3: ( (lv_add_0_0= 'added' ) ) otherlv_1= 'by'
            {
            // InternalMoStML.g:3054:3: ( (lv_add_0_0= 'added' ) )
            // InternalMoStML.g:3055:4: (lv_add_0_0= 'added' )
            {
            // InternalMoStML.g:3055:4: (lv_add_0_0= 'added' )
            // InternalMoStML.g:3056:5: lv_add_0_0= 'added'
            {
            lv_add_0_0=(Token)match(input,40,FOLLOW_31); 

            					newLeafNode(lv_add_0_0, grammarAccess.getADDAccess().getAddAddedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getADDRule());
            					}
            					setWithLastConsumed(current, "add", lv_add_0_0, "added");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMoStML.g:3076:1: entryRuleCOMPARISONOPERATOR returns [EObject current=null] : iv_ruleCOMPARISONOPERATOR= ruleCOMPARISONOPERATOR EOF ;
    public final EObject entryRuleCOMPARISONOPERATOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOMPARISONOPERATOR = null;


        try {
            // InternalMoStML.g:3076:59: (iv_ruleCOMPARISONOPERATOR= ruleCOMPARISONOPERATOR EOF )
            // InternalMoStML.g:3077:2: iv_ruleCOMPARISONOPERATOR= ruleCOMPARISONOPERATOR EOF
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
    // InternalMoStML.g:3083:1: ruleCOMPARISONOPERATOR returns [EObject current=null] : (this_EQUAL_0= ruleEQUAL | this_LESS_1= ruleLESS | this_GREATER_2= ruleGREATER | this_NOTEQUAL_3= ruleNOTEQUAL | this_LESSEQUAL_4= ruleLESSEQUAL | this_GREATEQUAL_5= ruleGREATEQUAL | this_NOT_6= ruleNOT ) ;
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
            // InternalMoStML.g:3089:2: ( (this_EQUAL_0= ruleEQUAL | this_LESS_1= ruleLESS | this_GREATER_2= ruleGREATER | this_NOTEQUAL_3= ruleNOTEQUAL | this_LESSEQUAL_4= ruleLESSEQUAL | this_GREATEQUAL_5= ruleGREATEQUAL | this_NOT_6= ruleNOT ) )
            // InternalMoStML.g:3090:2: (this_EQUAL_0= ruleEQUAL | this_LESS_1= ruleLESS | this_GREATER_2= ruleGREATER | this_NOTEQUAL_3= ruleNOTEQUAL | this_LESSEQUAL_4= ruleLESSEQUAL | this_GREATEQUAL_5= ruleGREATEQUAL | this_NOT_6= ruleNOT )
            {
            // InternalMoStML.g:3090:2: (this_EQUAL_0= ruleEQUAL | this_LESS_1= ruleLESS | this_GREATER_2= ruleGREATER | this_NOTEQUAL_3= ruleNOTEQUAL | this_LESSEQUAL_4= ruleLESSEQUAL | this_GREATEQUAL_5= ruleGREATEQUAL | this_NOT_6= ruleNOT )
            int alt46=7;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalMoStML.g:3091:3: this_EQUAL_0= ruleEQUAL
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
                    // InternalMoStML.g:3100:3: this_LESS_1= ruleLESS
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
                    // InternalMoStML.g:3109:3: this_GREATER_2= ruleGREATER
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
                    // InternalMoStML.g:3118:3: this_NOTEQUAL_3= ruleNOTEQUAL
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
                    // InternalMoStML.g:3127:3: this_LESSEQUAL_4= ruleLESSEQUAL
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
                    // InternalMoStML.g:3136:3: this_GREATEQUAL_5= ruleGREATEQUAL
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
                    // InternalMoStML.g:3145:3: this_NOT_6= ruleNOT
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
    // InternalMoStML.g:3157:1: entryRuleNOT returns [EObject current=null] : iv_ruleNOT= ruleNOT EOF ;
    public final EObject entryRuleNOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOT = null;


        try {
            // InternalMoStML.g:3157:44: (iv_ruleNOT= ruleNOT EOF )
            // InternalMoStML.g:3158:2: iv_ruleNOT= ruleNOT EOF
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
    // InternalMoStML.g:3164:1: ruleNOT returns [EObject current=null] : ( (lv_not_0_0= 'not' ) ) ;
    public final EObject ruleNOT() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:3170:2: ( ( (lv_not_0_0= 'not' ) ) )
            // InternalMoStML.g:3171:2: ( (lv_not_0_0= 'not' ) )
            {
            // InternalMoStML.g:3171:2: ( (lv_not_0_0= 'not' ) )
            // InternalMoStML.g:3172:3: (lv_not_0_0= 'not' )
            {
            // InternalMoStML.g:3172:3: (lv_not_0_0= 'not' )
            // InternalMoStML.g:3173:4: lv_not_0_0= 'not'
            {
            lv_not_0_0=(Token)match(input,41,FOLLOW_2); 

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
    // InternalMoStML.g:3188:1: entryRuleGREATEQUAL returns [EObject current=null] : iv_ruleGREATEQUAL= ruleGREATEQUAL EOF ;
    public final EObject entryRuleGREATEQUAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGREATEQUAL = null;


        try {
            // InternalMoStML.g:3188:51: (iv_ruleGREATEQUAL= ruleGREATEQUAL EOF )
            // InternalMoStML.g:3189:2: iv_ruleGREATEQUAL= ruleGREATEQUAL EOF
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
    // InternalMoStML.g:3195:1: ruleGREATEQUAL returns [EObject current=null] : ( ( (lv_greateEqual_0_0= 'greater' ) ) ( (lv_greateEqual_1_0= 'or' ) ) ( (lv_greateEqual_2_0= 'equal' ) ) ( (lv_greateEqual_3_0= 'to' ) ) ) ;
    public final EObject ruleGREATEQUAL() throws RecognitionException {
        EObject current = null;

        Token lv_greateEqual_0_0=null;
        Token lv_greateEqual_1_0=null;
        Token lv_greateEqual_2_0=null;
        Token lv_greateEqual_3_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:3201:2: ( ( ( (lv_greateEqual_0_0= 'greater' ) ) ( (lv_greateEqual_1_0= 'or' ) ) ( (lv_greateEqual_2_0= 'equal' ) ) ( (lv_greateEqual_3_0= 'to' ) ) ) )
            // InternalMoStML.g:3202:2: ( ( (lv_greateEqual_0_0= 'greater' ) ) ( (lv_greateEqual_1_0= 'or' ) ) ( (lv_greateEqual_2_0= 'equal' ) ) ( (lv_greateEqual_3_0= 'to' ) ) )
            {
            // InternalMoStML.g:3202:2: ( ( (lv_greateEqual_0_0= 'greater' ) ) ( (lv_greateEqual_1_0= 'or' ) ) ( (lv_greateEqual_2_0= 'equal' ) ) ( (lv_greateEqual_3_0= 'to' ) ) )
            // InternalMoStML.g:3203:3: ( (lv_greateEqual_0_0= 'greater' ) ) ( (lv_greateEqual_1_0= 'or' ) ) ( (lv_greateEqual_2_0= 'equal' ) ) ( (lv_greateEqual_3_0= 'to' ) )
            {
            // InternalMoStML.g:3203:3: ( (lv_greateEqual_0_0= 'greater' ) )
            // InternalMoStML.g:3204:4: (lv_greateEqual_0_0= 'greater' )
            {
            // InternalMoStML.g:3204:4: (lv_greateEqual_0_0= 'greater' )
            // InternalMoStML.g:3205:5: lv_greateEqual_0_0= 'greater'
            {
            lv_greateEqual_0_0=(Token)match(input,42,FOLLOW_32); 

            					newLeafNode(lv_greateEqual_0_0, grammarAccess.getGREATEQUALAccess().getGreateEqualGreaterKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGREATEQUALRule());
            					}
            					addWithLastConsumed(current, "greateEqual", lv_greateEqual_0_0, "greater");
            				

            }


            }

            // InternalMoStML.g:3217:3: ( (lv_greateEqual_1_0= 'or' ) )
            // InternalMoStML.g:3218:4: (lv_greateEqual_1_0= 'or' )
            {
            // InternalMoStML.g:3218:4: (lv_greateEqual_1_0= 'or' )
            // InternalMoStML.g:3219:5: lv_greateEqual_1_0= 'or'
            {
            lv_greateEqual_1_0=(Token)match(input,23,FOLLOW_33); 

            					newLeafNode(lv_greateEqual_1_0, grammarAccess.getGREATEQUALAccess().getGreateEqualOrKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGREATEQUALRule());
            					}
            					addWithLastConsumed(current, "greateEqual", lv_greateEqual_1_0, "or");
            				

            }


            }

            // InternalMoStML.g:3231:3: ( (lv_greateEqual_2_0= 'equal' ) )
            // InternalMoStML.g:3232:4: (lv_greateEqual_2_0= 'equal' )
            {
            // InternalMoStML.g:3232:4: (lv_greateEqual_2_0= 'equal' )
            // InternalMoStML.g:3233:5: lv_greateEqual_2_0= 'equal'
            {
            lv_greateEqual_2_0=(Token)match(input,43,FOLLOW_7); 

            					newLeafNode(lv_greateEqual_2_0, grammarAccess.getGREATEQUALAccess().getGreateEqualEqualKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGREATEQUALRule());
            					}
            					addWithLastConsumed(current, "greateEqual", lv_greateEqual_2_0, "equal");
            				

            }


            }

            // InternalMoStML.g:3245:3: ( (lv_greateEqual_3_0= 'to' ) )
            // InternalMoStML.g:3246:4: (lv_greateEqual_3_0= 'to' )
            {
            // InternalMoStML.g:3246:4: (lv_greateEqual_3_0= 'to' )
            // InternalMoStML.g:3247:5: lv_greateEqual_3_0= 'to'
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
    // InternalMoStML.g:3263:1: entryRuleLESSEQUAL returns [EObject current=null] : iv_ruleLESSEQUAL= ruleLESSEQUAL EOF ;
    public final EObject entryRuleLESSEQUAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLESSEQUAL = null;


        try {
            // InternalMoStML.g:3263:50: (iv_ruleLESSEQUAL= ruleLESSEQUAL EOF )
            // InternalMoStML.g:3264:2: iv_ruleLESSEQUAL= ruleLESSEQUAL EOF
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
    // InternalMoStML.g:3270:1: ruleLESSEQUAL returns [EObject current=null] : ( ( (lv_lessEqual_0_0= 'less' ) ) otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'to' ) ;
    public final EObject ruleLESSEQUAL() throws RecognitionException {
        EObject current = null;

        Token lv_lessEqual_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoStML.g:3276:2: ( ( ( (lv_lessEqual_0_0= 'less' ) ) otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'to' ) )
            // InternalMoStML.g:3277:2: ( ( (lv_lessEqual_0_0= 'less' ) ) otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'to' )
            {
            // InternalMoStML.g:3277:2: ( ( (lv_lessEqual_0_0= 'less' ) ) otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'to' )
            // InternalMoStML.g:3278:3: ( (lv_lessEqual_0_0= 'less' ) ) otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'to'
            {
            // InternalMoStML.g:3278:3: ( (lv_lessEqual_0_0= 'less' ) )
            // InternalMoStML.g:3279:4: (lv_lessEqual_0_0= 'less' )
            {
            // InternalMoStML.g:3279:4: (lv_lessEqual_0_0= 'less' )
            // InternalMoStML.g:3280:5: lv_lessEqual_0_0= 'less'
            {
            lv_lessEqual_0_0=(Token)match(input,44,FOLLOW_32); 

            					newLeafNode(lv_lessEqual_0_0, grammarAccess.getLESSEQUALAccess().getLessEqualLessKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLESSEQUALRule());
            					}
            					setWithLastConsumed(current, "lessEqual", lv_lessEqual_0_0, "less");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getLESSEQUALAccess().getOrKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_7); 

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
    // InternalMoStML.g:3308:1: entryRuleNOTEQUAL returns [EObject current=null] : iv_ruleNOTEQUAL= ruleNOTEQUAL EOF ;
    public final EObject entryRuleNOTEQUAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOTEQUAL = null;


        try {
            // InternalMoStML.g:3308:49: (iv_ruleNOTEQUAL= ruleNOTEQUAL EOF )
            // InternalMoStML.g:3309:2: iv_ruleNOTEQUAL= ruleNOTEQUAL EOF
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
    // InternalMoStML.g:3315:1: ruleNOTEQUAL returns [EObject current=null] : ( ( (lv_notEqual_0_0= 'not' ) ) otherlv_1= 'equal' otherlv_2= 'to' ) ;
    public final EObject ruleNOTEQUAL() throws RecognitionException {
        EObject current = null;

        Token lv_notEqual_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMoStML.g:3321:2: ( ( ( (lv_notEqual_0_0= 'not' ) ) otherlv_1= 'equal' otherlv_2= 'to' ) )
            // InternalMoStML.g:3322:2: ( ( (lv_notEqual_0_0= 'not' ) ) otherlv_1= 'equal' otherlv_2= 'to' )
            {
            // InternalMoStML.g:3322:2: ( ( (lv_notEqual_0_0= 'not' ) ) otherlv_1= 'equal' otherlv_2= 'to' )
            // InternalMoStML.g:3323:3: ( (lv_notEqual_0_0= 'not' ) ) otherlv_1= 'equal' otherlv_2= 'to'
            {
            // InternalMoStML.g:3323:3: ( (lv_notEqual_0_0= 'not' ) )
            // InternalMoStML.g:3324:4: (lv_notEqual_0_0= 'not' )
            {
            // InternalMoStML.g:3324:4: (lv_notEqual_0_0= 'not' )
            // InternalMoStML.g:3325:5: lv_notEqual_0_0= 'not'
            {
            lv_notEqual_0_0=(Token)match(input,41,FOLLOW_33); 

            					newLeafNode(lv_notEqual_0_0, grammarAccess.getNOTEQUALAccess().getNotEqualNotKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNOTEQUALRule());
            					}
            					setWithLastConsumed(current, "notEqual", lv_notEqual_0_0, "not");
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_7); 

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
    // InternalMoStML.g:3349:1: entryRuleGREATER returns [EObject current=null] : iv_ruleGREATER= ruleGREATER EOF ;
    public final EObject entryRuleGREATER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGREATER = null;


        try {
            // InternalMoStML.g:3349:48: (iv_ruleGREATER= ruleGREATER EOF )
            // InternalMoStML.g:3350:2: iv_ruleGREATER= ruleGREATER EOF
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
    // InternalMoStML.g:3356:1: ruleGREATER returns [EObject current=null] : ( ( (lv_greater_0_0= 'greater' ) ) otherlv_1= 'than' ) ;
    public final EObject ruleGREATER() throws RecognitionException {
        EObject current = null;

        Token lv_greater_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:3362:2: ( ( ( (lv_greater_0_0= 'greater' ) ) otherlv_1= 'than' ) )
            // InternalMoStML.g:3363:2: ( ( (lv_greater_0_0= 'greater' ) ) otherlv_1= 'than' )
            {
            // InternalMoStML.g:3363:2: ( ( (lv_greater_0_0= 'greater' ) ) otherlv_1= 'than' )
            // InternalMoStML.g:3364:3: ( (lv_greater_0_0= 'greater' ) ) otherlv_1= 'than'
            {
            // InternalMoStML.g:3364:3: ( (lv_greater_0_0= 'greater' ) )
            // InternalMoStML.g:3365:4: (lv_greater_0_0= 'greater' )
            {
            // InternalMoStML.g:3365:4: (lv_greater_0_0= 'greater' )
            // InternalMoStML.g:3366:5: lv_greater_0_0= 'greater'
            {
            lv_greater_0_0=(Token)match(input,42,FOLLOW_34); 

            					newLeafNode(lv_greater_0_0, grammarAccess.getGREATERAccess().getGreaterGreaterKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGREATERRule());
            					}
            					setWithLastConsumed(current, "greater", lv_greater_0_0, "greater");
            				

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

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
    // InternalMoStML.g:3386:1: entryRuleLESS returns [EObject current=null] : iv_ruleLESS= ruleLESS EOF ;
    public final EObject entryRuleLESS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLESS = null;


        try {
            // InternalMoStML.g:3386:45: (iv_ruleLESS= ruleLESS EOF )
            // InternalMoStML.g:3387:2: iv_ruleLESS= ruleLESS EOF
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
    // InternalMoStML.g:3393:1: ruleLESS returns [EObject current=null] : ( ( (lv_less_0_0= 'less' ) ) ( (lv_less_1_0= 'than' ) ) ) ;
    public final EObject ruleLESS() throws RecognitionException {
        EObject current = null;

        Token lv_less_0_0=null;
        Token lv_less_1_0=null;


        	enterRule();

        try {
            // InternalMoStML.g:3399:2: ( ( ( (lv_less_0_0= 'less' ) ) ( (lv_less_1_0= 'than' ) ) ) )
            // InternalMoStML.g:3400:2: ( ( (lv_less_0_0= 'less' ) ) ( (lv_less_1_0= 'than' ) ) )
            {
            // InternalMoStML.g:3400:2: ( ( (lv_less_0_0= 'less' ) ) ( (lv_less_1_0= 'than' ) ) )
            // InternalMoStML.g:3401:3: ( (lv_less_0_0= 'less' ) ) ( (lv_less_1_0= 'than' ) )
            {
            // InternalMoStML.g:3401:3: ( (lv_less_0_0= 'less' ) )
            // InternalMoStML.g:3402:4: (lv_less_0_0= 'less' )
            {
            // InternalMoStML.g:3402:4: (lv_less_0_0= 'less' )
            // InternalMoStML.g:3403:5: lv_less_0_0= 'less'
            {
            lv_less_0_0=(Token)match(input,44,FOLLOW_34); 

            					newLeafNode(lv_less_0_0, grammarAccess.getLESSAccess().getLessLessKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLESSRule());
            					}
            					addWithLastConsumed(current, "less", lv_less_0_0, "less");
            				

            }


            }

            // InternalMoStML.g:3415:3: ( (lv_less_1_0= 'than' ) )
            // InternalMoStML.g:3416:4: (lv_less_1_0= 'than' )
            {
            // InternalMoStML.g:3416:4: (lv_less_1_0= 'than' )
            // InternalMoStML.g:3417:5: lv_less_1_0= 'than'
            {
            lv_less_1_0=(Token)match(input,45,FOLLOW_2); 

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
    // InternalMoStML.g:3433:1: entryRuleEQUAL returns [EObject current=null] : iv_ruleEQUAL= ruleEQUAL EOF ;
    public final EObject entryRuleEQUAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQUAL = null;


        try {
            // InternalMoStML.g:3433:46: (iv_ruleEQUAL= ruleEQUAL EOF )
            // InternalMoStML.g:3434:2: iv_ruleEQUAL= ruleEQUAL EOF
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
    // InternalMoStML.g:3440:1: ruleEQUAL returns [EObject current=null] : ( ( (lv_equal_0_0= 'equal' ) ) otherlv_1= 'to' ) ;
    public final EObject ruleEQUAL() throws RecognitionException {
        EObject current = null;

        Token lv_equal_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoStML.g:3446:2: ( ( ( (lv_equal_0_0= 'equal' ) ) otherlv_1= 'to' ) )
            // InternalMoStML.g:3447:2: ( ( (lv_equal_0_0= 'equal' ) ) otherlv_1= 'to' )
            {
            // InternalMoStML.g:3447:2: ( ( (lv_equal_0_0= 'equal' ) ) otherlv_1= 'to' )
            // InternalMoStML.g:3448:3: ( (lv_equal_0_0= 'equal' ) ) otherlv_1= 'to'
            {
            // InternalMoStML.g:3448:3: ( (lv_equal_0_0= 'equal' ) )
            // InternalMoStML.g:3449:4: (lv_equal_0_0= 'equal' )
            {
            // InternalMoStML.g:3449:4: (lv_equal_0_0= 'equal' )
            // InternalMoStML.g:3450:5: lv_equal_0_0= 'equal'
            {
            lv_equal_0_0=(Token)match(input,43,FOLLOW_7); 

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
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\31\1\5\1\13\1\5\1\4\1\13\1\uffff\2\4\1\uffff\1\4";
    static final String dfa_3s = "\1\31\1\5\1\32\1\5\1\16\1\32\1\uffff\1\13\1\54\1\uffff\1\54";
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
            "\1\12\6\uffff\1\11\1\6\34\uffff\4\6",
            "",
            "\1\12\6\uffff\1\11\1\6\34\uffff\4\6"
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
    static final String dfa_7s = "\u00dd\uffff";
    static final String dfa_8s = "\1\31\1\5\1\13\1\5\1\4\1\13\1\4\1\uffff\1\4\1\15\2\27\1\4\2\uffff\5\4\2\53\1\4\1\15\5\4\2\15\2\4\1\15\2\27\3\4\1\20\2\4\1\20\4\4\1\53\1\4\1\53\1\15\1\4\1\15\2\27\3\4\1\15\2\27\2\4\2\15\7\4\2\53\1\4\1\15\3\4\1\15\2\27\7\4\1\53\1\4\1\53\1\15\6\4\2\17\1\4\2\15\1\4\1\17\3\4\1\53\1\4\1\53\1\4\1\15\3\4\2\17\1\4\2\15\1\4\1\17\2\4\1\15\2\27\1\4\1\17\3\4\1\15\2\27\1\4\1\13\2\15\1\4\1\13\1\15\2\27\1\4\1\17\3\4\1\13\2\4\1\53\1\4\1\53\4\17\2\15\2\27\2\4\1\53\1\4\1\53\1\4\1\15\1\4\1\uffff\4\4\1\53\1\4\1\53\4\17\1\15\1\uffff\2\15\4\17\2\4\1\53\1\4\1\53\1\4\3\15\1\4\2\15\4\17\3\4\2\15\7\4";
    static final String dfa_9s = "\1\31\1\5\1\32\1\5\1\16\1\32\1\54\1\uffff\1\54\1\15\2\55\1\53\2\uffff\1\54\2\4\2\41\2\53\1\41\1\15\1\41\1\4\3\54\2\15\1\41\1\54\1\15\2\55\1\53\2\54\1\20\2\54\1\20\4\41\1\53\1\41\1\53\1\15\1\54\1\15\2\55\1\53\2\54\1\15\2\55\1\53\1\54\2\15\1\41\1\54\3\4\2\41\2\53\1\41\1\15\1\41\1\4\1\54\1\15\2\55\1\53\1\54\3\4\2\41\1\53\1\41\1\53\1\15\1\41\1\4\1\54\2\41\1\54\2\27\1\4\2\15\1\41\1\27\1\54\1\4\1\41\1\53\1\41\1\53\1\41\1\15\1\41\1\4\1\54\2\27\1\4\2\15\1\41\1\27\1\54\1\4\1\15\2\55\1\53\1\27\2\41\1\54\1\15\2\55\1\53\1\13\2\15\1\41\1\13\1\15\2\55\1\53\1\27\2\41\1\54\1\13\2\41\1\53\1\41\1\53\4\36\2\15\2\55\1\53\1\41\1\53\1\41\1\53\1\41\1\15\1\50\1\uffff\4\41\1\53\1\41\1\53\4\36\1\15\1\uffff\2\15\4\36\2\41\1\53\1\41\1\53\1\41\3\15\1\41\2\15\4\36\3\41\2\15\7\41";
    static final String dfa_10s = "\7\uffff\1\5\5\uffff\1\4\1\3\u009e\uffff\1\2\14\uffff\1\1\42\uffff";
    static final String dfa_11s = "\u00dd\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\1\3\16\uffff\1\4",
            "\1\5",
            "\1\7\11\uffff\1\6",
            "\1\3\16\uffff\1\4",
            "\1\10\12\uffff\1\15\1\uffff\1\15\5\16\1\15\21\uffff\1\14\1\13\1\11\1\12",
            "",
            "\1\17\23\uffff\1\15\10\uffff\1\20\1\21\6\uffff\1\14\1\13\1\11\1\12",
            "\1\22",
            "\1\24\25\uffff\1\23",
            "\1\25\25\uffff\1\26",
            "\1\30\34\uffff\1\31\11\uffff\1\27",
            "",
            "",
            "\1\32\23\uffff\1\15\10\uffff\1\20\1\21\6\uffff\1\14\1\13\1\11\1\12",
            "\1\33",
            "\1\34",
            "\1\30\34\uffff\1\31",
            "\1\30\34\uffff\1\31",
            "\1\35",
            "\1\36",
            "\1\30\34\uffff\1\31",
            "\1\37",
            "\1\30\34\uffff\1\31",
            "\1\40",
            "\1\32\23\uffff\1\15\10\uffff\1\20\1\21\6\uffff\1\44\1\43\1\41\1\42",
            "\1\15\12\uffff\1\47\1\uffff\1\45\5\uffff\1\46\21\uffff\4\15",
            "\1\15\12\uffff\1\52\1\uffff\1\50\5\uffff\1\51\21\uffff\4\15",
            "\1\53",
            "\1\54",
            "\1\30\34\uffff\1\31",
            "\1\15\12\uffff\1\47\1\uffff\1\45\5\uffff\1\46\21\uffff\4\15",
            "\1\55",
            "\1\57\25\uffff\1\56",
            "\1\61\25\uffff\1\60",
            "\1\30\2\15\30\uffff\2\15\1\31\11\uffff\1\62",
            "\1\63\44\uffff\1\67\1\66\1\64\1\65",
            "\1\63\44\uffff\1\67\1\66\1\64\1\65",
            "\1\70",
            "\1\71\44\uffff\1\75\1\74\1\72\1\73",
            "\1\71\44\uffff\1\75\1\74\1\72\1\73",
            "\1\76",
            "\1\30\34\uffff\1\31",
            "\1\30\34\uffff\1\31",
            "\1\30\2\15\30\uffff\2\15\1\31",
            "\1\30\2\15\30\uffff\2\15\1\31",
            "\1\77",
            "\1\30\2\15\30\uffff\2\15\1\31",
            "\1\100",
            "\1\101",
            "\1\102\23\uffff\1\105\10\uffff\1\104\1\103\6\uffff\1\67\1\66\1\64\1\65",
            "\1\106",
            "\1\110\25\uffff\1\107",
            "\1\111\25\uffff\1\112",
            "\1\114\34\uffff\1\115\11\uffff\1\113",
            "\1\116\44\uffff\1\122\1\121\1\117\1\120",
            "\1\123\23\uffff\1\126\10\uffff\1\125\1\124\6\uffff\1\75\1\74\1\72\1\73",
            "\1\127",
            "\1\131\25\uffff\1\130",
            "\1\133\25\uffff\1\132",
            "\1\135\34\uffff\1\136\11\uffff\1\134",
            "\1\137\44\uffff\4\15",
            "\1\140",
            "\1\141",
            "\1\30\2\15\30\uffff\2\15\1\31",
            "\1\142\23\uffff\1\105\10\uffff\1\104\1\103\6\uffff\1\67\1\66\1\64\1\65",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\114\34\uffff\1\115",
            "\1\114\34\uffff\1\115",
            "\1\146",
            "\1\147",
            "\1\114\34\uffff\1\115",
            "\1\150",
            "\1\114\34\uffff\1\115",
            "\1\151",
            "\1\152\34\uffff\1\153\1\15\6\uffff\1\122\1\121\1\117\1\120",
            "\1\154",
            "\1\155\25\uffff\1\156",
            "\1\157\25\uffff\1\160",
            "\1\162\34\uffff\1\163\11\uffff\1\161",
            "\1\164\23\uffff\1\126\10\uffff\1\125\1\124\6\uffff\1\75\1\74\1\72\1\73",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\135\34\uffff\1\136",
            "\1\135\34\uffff\1\136",
            "\1\170",
            "\1\135\34\uffff\1\136",
            "\1\171",
            "\1\172",
            "\1\135\34\uffff\1\136",
            "\1\173",
            "\1\174\34\uffff\1\15\1\175\6\uffff\4\15",
            "\1\30\2\15\30\uffff\2\15\1\31",
            "\1\30\2\15\30\uffff\2\15\1\31",
            "\1\142\23\uffff\1\105\10\uffff\1\104\1\103\6\uffff\1\u0081\1\u0080\1\176\1\177",
            "\1\47\1\uffff\1\45\5\uffff\1\46",
            "\1\47\1\uffff\1\45\5\uffff\1\46",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\114\34\uffff\1\115",
            "\1\47\1\uffff\1\45\5\uffff\1\46",
            "\1\u0085\34\uffff\1\153\1\15\6\uffff\1\u0089\1\u0088\1\u0086\1\u0087",
            "\1\u008a",
            "\1\162\34\uffff\1\163",
            "\1\u008b",
            "\1\162\34\uffff\1\163",
            "\1\u008c",
            "\1\162\34\uffff\1\163",
            "\1\u008d",
            "\1\162\34\uffff\1\163",
            "\1\u008e",
            "\1\164\23\uffff\1\126\10\uffff\1\125\1\124\6\uffff\1\u0092\1\u0091\1\u008f\1\u0090",
            "\1\52\1\uffff\1\50\5\uffff\1\51",
            "\1\52\1\uffff\1\50\5\uffff\1\51",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\135\34\uffff\1\136",
            "\1\52\1\uffff\1\50\5\uffff\1\51",
            "\1\u0096\34\uffff\1\15\1\175\6\uffff\4\15",
            "\1\u0097",
            "\1\u0098",
            "\1\u009a\25\uffff\1\u0099",
            "\1\u009c\25\uffff\1\u009b",
            "\1\114\1\u009d\1\u009e\30\uffff\1\u009f\1\u00a0\1\115\11\uffff\1\u00a1",
            "\1\47\1\uffff\1\45\5\uffff\1\46",
            "\1\114\34\uffff\1\115",
            "\1\114\34\uffff\1\115",
            "\1\u0085\34\uffff\1\153\1\15\6\uffff\1\u00a5\1\u00a4\1\u00a2\1\u00a3",
            "\1\u00a6",
            "\1\u00a7\25\uffff\1\u00a8",
            "\1\u00a9\25\uffff\1\u00aa",
            "\1\u00ac\34\uffff\1\163\11\uffff\1\u00ab",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\162\34\uffff\1\163",
            "\1\u00ad",
            "\1\u00b0",
            "\1\u00b2\25\uffff\1\u00b1",
            "\1\u00b4\25\uffff\1\u00b3",
            "\1\135\1\u00b5\1\u00b6\30\uffff\1\u00b7\1\u00b8\1\136\11\uffff\1\u00b9",
            "\1\52\1\uffff\1\50\5\uffff\1\51",
            "\1\135\34\uffff\1\136",
            "\1\135\34\uffff\1\136",
            "\1\u0096\34\uffff\1\15\1\175\6\uffff\4\15",
            "\1\u00ba",
            "\1\114\1\u009d\1\u009e\30\uffff\1\u009f\1\u00a0\1\115",
            "\1\114\1\u009d\1\u009e\30\uffff\1\u009f\1\u00a0\1\115",
            "\1\u00bb",
            "\1\114\1\u009d\1\u009e\30\uffff\1\u009f\1\u00a0\1\115",
            "\1\u00bc",
            "\1\47\1\uffff\1\45\5\uffff\1\46\3\uffff\1\u00be\1\u00c0\1\u00bf\1\u00bd",
            "\1\47\1\uffff\1\45\5\uffff\1\46\3\uffff\1\u00be\1\u00c0\1\u00bf\1\u00bd",
            "\1\47\1\uffff\1\45\5\uffff\1\46\3\uffff\1\u00be\1\u00c0\1\u00bf\1\u00bd",
            "\1\47\1\uffff\1\45\5\uffff\1\46\3\uffff\1\u00be\1\u00c0\1\u00bf\1\u00bd",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3\25\uffff\1\u00c4",
            "\1\u00c5\25\uffff\1\u00c6",
            "\1\u00ac\2\15\30\uffff\2\15\1\163\11\uffff\1\u00c7",
            "\1\u00ac\34\uffff\1\163",
            "\1\u00c8",
            "\1\u00ac\34\uffff\1\163",
            "\1\u00c9",
            "\1\u00ac\34\uffff\1\163",
            "\1\u00ca",
            "\1\162\34\uffff\1\163\1\uffff\1\15\1\uffff\4\15",
            "",
            "\1\162\34\uffff\1\163",
            "\1\162\34\uffff\1\163",
            "\1\135\1\u00b5\1\u00b6\30\uffff\1\u00b7\1\u00b8\1\136",
            "\1\135\1\u00b5\1\u00b6\30\uffff\1\u00b7\1\u00b8\1\136",
            "\1\u00cb",
            "\1\135\1\u00b5\1\u00b6\30\uffff\1\u00b7\1\u00b8\1\136",
            "\1\u00cc",
            "\1\52\1\uffff\1\50\5\uffff\1\51\3\uffff\1\u00ce\1\u00d0\1\u00cf\1\u00cd",
            "\1\52\1\uffff\1\50\5\uffff\1\51\3\uffff\1\u00ce\1\u00d0\1\u00cf\1\u00cd",
            "\1\52\1\uffff\1\50\5\uffff\1\51\3\uffff\1\u00ce\1\u00d0\1\u00cf\1\u00cd",
            "\1\52\1\uffff\1\50\5\uffff\1\51\3\uffff\1\u00ce\1\u00d0\1\u00cf\1\u00cd",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\47\1\uffff\1\45\5\uffff\1\46\3\uffff\1\u00be\1\u00c0\1\u00bf\1\u00bd",
            "\1\47\1\uffff\1\45\5\uffff\1\46\3\uffff\1\u00be\1\u00c0\1\u00bf\1\u00bd",
            "\1\47\1\uffff\1\45\5\uffff\1\46\3\uffff\1\u00be\1\u00c0\1\u00bf\1\u00bd",
            "\1\47\1\uffff\1\45\5\uffff\1\46\3\uffff\1\u00be\1\u00c0\1\u00bf\1\u00bd",
            "\1\114\1\u009d\1\u009e\30\uffff\1\u009f\1\u00a0\1\115",
            "\1\u00ac\2\15\30\uffff\2\15\1\163",
            "\1\u00d4",
            "\1\u00ac\2\15\30\uffff\2\15\1\163",
            "\1\u00d5",
            "\1\u00ac\2\15\30\uffff\2\15\1\163",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00ac\34\uffff\1\163",
            "\1\u00d9",
            "\1\u00da",
            "\1\52\1\uffff\1\50\5\uffff\1\51\3\uffff\1\u00ce\1\u00d0\1\u00cf\1\u00cd",
            "\1\52\1\uffff\1\50\5\uffff\1\51\3\uffff\1\u00ce\1\u00d0\1\u00cf\1\u00cd",
            "\1\52\1\uffff\1\50\5\uffff\1\51\3\uffff\1\u00ce\1\u00d0\1\u00cf\1\u00cd",
            "\1\52\1\uffff\1\50\5\uffff\1\51\3\uffff\1\u00ce\1\u00d0\1\u00cf\1\u00cd",
            "\1\135\1\u00b5\1\u00b6\30\uffff\1\u00b7\1\u00b8\1\136",
            "\1\114\1\u009d\1\u009e\30\uffff\1\u009f\1\u00a0\1\115",
            "\1\114\1\u009d\1\u009e\30\uffff\1\u009f\1\u00a0\1\115",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00ac\2\15\30\uffff\2\15\1\163",
            "\1\u00ac\34\uffff\1\163",
            "\1\u00ac\34\uffff\1\163",
            "\1\135\1\u00b5\1\u00b6\30\uffff\1\u00b7\1\u00b8\1\136",
            "\1\135\1\u00b5\1\u00b6\30\uffff\1\u00b7\1\u00b8\1\136",
            "\1\u00ac\2\15\30\uffff\2\15\1\163",
            "\1\u00ac\2\15\30\uffff\2\15\1\163"
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
    static final String dfa_14s = "\2\4\1\uffff\1\4\2\uffff\1\4\1\15\2\27\2\4\1\53\2\4\1\53\1\uffff\3\15\3\4";
    static final String dfa_15s = "\2\54\1\uffff\1\54\2\uffff\1\54\1\15\2\55\1\53\1\41\1\53\2\41\1\53\1\uffff\3\15\3\41";
    static final String dfa_16s = "\2\uffff\1\1\1\uffff\1\4\1\3\12\uffff\1\2\6\uffff";
    static final String dfa_17s = "\27\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\44\uffff\4\2",
            "\1\3\23\uffff\1\4\10\uffff\1\2\1\5\6\uffff\4\2",
            "",
            "\1\6\23\uffff\1\4\10\uffff\1\2\1\5\6\uffff\4\2",
            "",
            "",
            "\1\6\23\uffff\1\4\10\uffff\1\2\1\5\6\uffff\1\12\1\11\1\7\1\10",
            "\1\13",
            "\1\14\25\uffff\1\15",
            "\1\17\25\uffff\1\16",
            "\1\2\2\20\30\uffff\2\20\1\2\11\uffff\1\21",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\22",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\23",
            "",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\2\2\20\30\uffff\2\20\1\2"
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
    static final String dfa_19s = "\2\4\1\uffff\1\4\2\uffff\1\4\1\15\2\27\2\4\1\53\2\4\1\53\1\15\1\uffff\2\15\3\4";
    static final String dfa_20s = "\2\54\1\uffff\1\54\2\uffff\1\54\1\15\2\55\1\53\1\41\1\53\2\41\1\53\1\15\1\uffff\2\15\3\41";
    static final String dfa_21s = "\2\uffff\1\1\1\uffff\1\4\1\3\13\uffff\1\2\5\uffff";
    static final String[] dfa_22s = {
            "\1\1\44\uffff\4\2",
            "\1\3\23\uffff\1\4\10\uffff\1\2\1\5\6\uffff\4\2",
            "",
            "\1\6\23\uffff\1\4\10\uffff\1\2\1\5\6\uffff\4\2",
            "",
            "",
            "\1\6\23\uffff\1\4\10\uffff\1\2\1\5\6\uffff\1\12\1\11\1\7\1\10",
            "\1\13",
            "\1\14\25\uffff\1\15",
            "\1\17\25\uffff\1\16",
            "\1\2\2\21\30\uffff\2\21\1\2\11\uffff\1\20",
            "\1\2\2\21\30\uffff\2\21\1\2",
            "\1\22",
            "\1\2\2\21\30\uffff\2\21\1\2",
            "\1\2\2\21\30\uffff\2\21\1\2",
            "\1\23",
            "\1\24",
            "",
            "\1\25",
            "\1\26",
            "\1\2\2\21\30\uffff\2\21\1\2",
            "\1\2\2\21\30\uffff\2\21\1\2",
            "\1\2\2\21\30\uffff\2\21\1\2"
    };
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_17;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "640:6: (lv_preStateConditions_4_1= ruleSTATECONDITON | lv_preStateConditions_4_2= ruleATTRIBUTECONTION | lv_preStateConditions_4_3= ruleMODECONDITION | lv_preStateConditions_4_4= ruleSIGNALCONDITION )";
        }
    }
    static final String dfa_23s = "\2\4\1\uffff\1\4\2\uffff\1\4\1\15\2\27\3\4\2\53\1\4\1\15\1\uffff\2\15\3\4";
    static final String dfa_24s = "\2\54\1\uffff\1\54\2\uffff\1\54\1\15\2\55\1\53\2\41\2\53\1\41\1\15\1\uffff\2\15\3\41";
    static final String[] dfa_25s = {
            "\1\1\44\uffff\4\2",
            "\1\3\23\uffff\1\4\10\uffff\1\2\1\5\6\uffff\4\2",
            "",
            "\1\6\23\uffff\1\4\10\uffff\1\2\1\5\6\uffff\4\2",
            "",
            "",
            "\1\6\23\uffff\1\4\10\uffff\1\2\1\5\6\uffff\1\12\1\11\1\7\1\10",
            "\1\13",
            "\1\15\25\uffff\1\14",
            "\1\16\25\uffff\1\17",
            "\1\2\2\21\30\uffff\2\21\1\2\11\uffff\1\20",
            "\1\2\2\21\30\uffff\2\21\1\2",
            "\1\2\2\21\30\uffff\2\21\1\2",
            "\1\22",
            "\1\23",
            "\1\2\2\21\30\uffff\2\21\1\2",
            "\1\24",
            "",
            "\1\25",
            "\1\26",
            "\1\2\2\21\30\uffff\2\21\1\2",
            "\1\2\2\21\30\uffff\2\21\1\2",
            "\1\2\2\21\30\uffff\2\21\1\2"
    };
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_21;
            this.special = dfa_17;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "783:5: (lv_preConstraintConditions_2_1= ruleSTATECONDITON | lv_preConstraintConditions_2_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_2_3= ruleMODECONDITION | lv_preConstraintConditions_2_4= ruleSIGNALCONDITION )";
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_21;
            this.special = dfa_17;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "872:6: (lv_preConstraintConditions_4_1= ruleSTATECONDITON | lv_preConstraintConditions_4_2= ruleATTRIBUTECONTION | lv_preConstraintConditions_4_3= ruleMODECONDITION | lv_preConstraintConditions_4_4= ruleSIGNALCONDITION )";
        }
    }
    static final String dfa_26s = "\47\uffff";
    static final String dfa_27s = "\2\4\1\uffff\1\4\1\uffff\1\4\1\15\2\27\1\4\1\15\2\27\2\4\1\53\1\4\1\53\1\4\1\15\2\4\1\53\1\4\1\53\1\4\1\15\1\uffff\2\15\1\4\1\uffff\2\15\5\4";
    static final String dfa_28s = "\2\54\1\uffff\1\54\1\uffff\1\54\1\15\2\55\1\53\1\15\2\55\1\53\1\41\1\53\1\41\1\53\1\41\1\15\1\50\1\41\1\53\1\41\1\53\1\41\1\15\1\uffff\2\15\1\41\1\uffff\2\15\5\41";
    static final String dfa_29s = "\2\uffff\1\1\1\uffff\1\3\26\uffff\1\2\3\uffff\1\4\7\uffff";
    static final String dfa_30s = "\47\uffff}>";
    static final String[] dfa_31s = {
            "\1\1\44\uffff\4\2",
            "\1\3\34\uffff\1\2\1\4\6\uffff\4\2",
            "",
            "\1\5\34\uffff\1\2\1\4\6\uffff\1\11\1\10\1\6\1\7",
            "",
            "\1\5\34\uffff\1\2\1\4\6\uffff\1\15\1\14\1\12\1\13",
            "\1\16",
            "\1\17\25\uffff\1\20",
            "\1\21\25\uffff\1\22",
            "\1\24\34\uffff\1\2\11\uffff\1\23",
            "\1\25",
            "\1\26\25\uffff\1\27",
            "\1\30\25\uffff\1\31",
            "\1\24\2\33\30\uffff\2\33\1\2\11\uffff\1\32",
            "\1\24\34\uffff\1\2",
            "\1\34",
            "\1\24\34\uffff\1\2",
            "\1\35",
            "\1\24\34\uffff\1\2",
            "\1\36",
            "\1\2\34\uffff\1\2\1\uffff\1\37\1\uffff\4\37",
            "\1\24\2\33\30\uffff\2\33\1\2",
            "\1\40",
            "\1\24\2\33\30\uffff\2\33\1\2",
            "\1\41",
            "\1\24\2\33\30\uffff\2\33\1\2",
            "\1\42",
            "",
            "\1\43",
            "\1\44",
            "\1\24\34\uffff\1\2",
            "",
            "\1\45",
            "\1\46",
            "\1\24\2\33\30\uffff\2\33\1\2",
            "\1\24\34\uffff\1\2",
            "\1\24\34\uffff\1\2",
            "\1\24\2\33\30\uffff\2\33\1\2",
            "\1\24\2\33\30\uffff\2\33\1\2"
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "950:5: (lv_postConstraintCondition_7_1= ruleSTATECONDITON | lv_postConstraintCondition_7_2= ruleATTRIBUTECONTION | lv_postConstraintCondition_7_3= ruleMODECONDITION | lv_postConstraintCondition_7_4= ruleARITHMETICCONDITION )";
        }
    }
    static final String dfa_32s = "\26\uffff";
    static final String dfa_33s = "\2\4\1\uffff\1\4\1\uffff\1\4\1\15\2\27\2\4\1\53\1\4\1\53\1\4\1\15\1\uffff\2\15\3\4";
    static final String dfa_34s = "\2\54\1\uffff\1\54\1\uffff\1\54\1\15\2\55\1\53\1\41\1\53\1\41\1\53\1\41\1\15\1\uffff\2\15\3\41";
    static final String dfa_35s = "\2\uffff\1\1\1\uffff\1\3\13\uffff\1\2\5\uffff";
    static final String dfa_36s = "\26\uffff}>";
    static final String[] dfa_37s = {
            "\1\1\44\uffff\4\2",
            "\1\3\34\uffff\1\2\1\4\6\uffff\4\2",
            "",
            "\1\5\34\uffff\1\2\1\4\6\uffff\4\2",
            "",
            "\1\5\34\uffff\1\2\1\4\6\uffff\1\11\1\10\1\6\1\7",
            "\1\12",
            "\1\13\25\uffff\1\14",
            "\1\15\25\uffff\1\16",
            "\1\2\2\20\30\uffff\2\20\1\2\11\uffff\1\17",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\21",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\22",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\23",
            "",
            "\1\24",
            "\1\25",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\2\2\20\30\uffff\2\20\1\2"
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_32;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "1102:5: (lv_prePropertyConditions_3_1= ruleSTATECONDITON | lv_prePropertyConditions_3_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_3_3= ruleMODECONDITION )";
        }
    }
    static final String dfa_38s = "\2\4\1\uffff\1\4\1\uffff\1\4\1\15\2\27\3\4\1\53\1\4\1\53\1\uffff\3\15\3\4";
    static final String dfa_39s = "\2\54\1\uffff\1\54\1\uffff\1\54\1\15\2\55\1\53\2\41\1\53\1\41\1\53\1\uffff\3\15\3\41";
    static final String dfa_40s = "\2\uffff\1\1\1\uffff\1\3\12\uffff\1\2\6\uffff";
    static final String[] dfa_41s = {
            "\1\1\44\uffff\4\2",
            "\1\3\34\uffff\1\2\1\4\6\uffff\4\2",
            "",
            "\1\5\34\uffff\1\2\1\4\6\uffff\4\2",
            "",
            "\1\5\34\uffff\1\2\1\4\6\uffff\1\11\1\10\1\6\1\7",
            "\1\12",
            "\1\14\25\uffff\1\13",
            "\1\16\25\uffff\1\15",
            "\1\2\2\17\30\uffff\2\17\1\2\11\uffff\1\20",
            "\1\2\2\17\30\uffff\2\17\1\2",
            "\1\2\2\17\30\uffff\2\17\1\2",
            "\1\21",
            "\1\2\2\17\30\uffff\2\17\1\2",
            "\1\22",
            "",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\2\2\17\30\uffff\2\17\1\2",
            "\1\2\2\17\30\uffff\2\17\1\2",
            "\1\2\2\17\30\uffff\2\17\1\2"
    };
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[][] dfa_41 = unpackEncodedStringArray(dfa_41s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_32;
            this.eof = dfa_32;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_36;
            this.transition = dfa_41;
        }
        public String getDescription() {
            return "1175:6: (lv_prePropertyConditions_5_1= ruleSTATECONDITON | lv_prePropertyConditions_5_2= ruleATTRIBUTECONTION | lv_prePropertyConditions_5_3= ruleMODECONDITION )";
        }
    }
    static final String dfa_42s = "\2\4\1\uffff\1\4\1\uffff\1\4\1\15\2\27\3\4\2\53\1\4\1\15\1\uffff\2\15\3\4";
    static final String dfa_43s = "\2\54\1\uffff\1\54\1\uffff\1\54\1\15\2\55\1\53\2\41\2\53\1\41\1\15\1\uffff\2\15\3\41";
    static final String[] dfa_44s = {
            "\1\1\44\uffff\4\2",
            "\1\3\34\uffff\1\2\1\4\6\uffff\4\2",
            "",
            "\1\5\34\uffff\1\2\1\4\6\uffff\4\2",
            "",
            "\1\5\34\uffff\1\2\1\4\6\uffff\1\11\1\10\1\6\1\7",
            "\1\12",
            "\1\14\25\uffff\1\13",
            "\1\15\25\uffff\1\16",
            "\1\2\2\20\30\uffff\2\20\1\2\11\uffff\1\17",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\21",
            "\1\22",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\23",
            "",
            "\1\24",
            "\1\25",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\2\2\20\30\uffff\2\20\1\2",
            "\1\2\2\20\30\uffff\2\20\1\2"
    };
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_32;
            this.eof = dfa_32;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "1274:5: (lv_postPropertyConditions_9_1= ruleSTATECONDITON | lv_postPropertyConditions_9_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_9_3= ruleMODECONDITION )";
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_32;
            this.eof = dfa_32;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_36;
            this.transition = dfa_41;
        }
        public String getDescription() {
            return "1347:6: (lv_postPropertyConditions_11_1= ruleSTATECONDITON | lv_postPropertyConditions_11_2= ruleATTRIBUTECONTION | lv_postPropertyConditions_11_3= ruleMODECONDITION )";
        }
    }
    static final String dfa_45s = "\5\uffff";
    static final String dfa_46s = "\2\4\1\uffff\1\4\1\uffff";
    static final String dfa_47s = "\2\54\1\uffff\1\54\1\uffff";
    static final String dfa_48s = "\2\uffff\1\2\1\uffff\1\1";
    static final String dfa_49s = "\5\uffff}>";
    static final String[] dfa_50s = {
            "\1\1\44\uffff\4\2",
            "\1\3\34\uffff\1\4\7\uffff\4\2",
            "",
            "\1\3\34\uffff\1\4\7\uffff\4\2",
            ""
    };

    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_45;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_49;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "2538:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* otherlv_2= 'state' ( (lv_stateName_3_0= RULE_ID ) ) ) | ( ( (this_ID_4= RULE_ID )* ( (lv_compOperator_5_0= ruleCOMPARISONOPERATOR ) ) ) (this_ID_6= RULE_ID )* otherlv_7= 'state' ( (lv_stateName_8_0= RULE_ID ) ) ) )";
        }
    }
    static final String dfa_51s = "\4\uffff\1\12\6\uffff";
    static final String dfa_52s = "\1\51\1\uffff\2\27\1\4\6\uffff";
    static final String dfa_53s = "\1\54\1\uffff\2\55\1\53\6\uffff";
    static final String dfa_54s = "\1\uffff\1\1\3\uffff\1\2\1\5\1\6\1\3\1\4\1\7";
    static final String[] dfa_55s = {
            "\1\4\1\3\1\1\1\2",
            "",
            "\1\6\25\uffff\1\5",
            "\1\7\25\uffff\1\10",
            "\3\12\30\uffff\3\12\11\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[][] dfa_55 = unpackEncodedStringArray(dfa_55s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_1;
            this.eof = dfa_51;
            this.min = dfa_52;
            this.max = dfa_53;
            this.accept = dfa_54;
            this.special = dfa_5;
            this.transition = dfa_55;
        }
        public String getDescription() {
            return "3090:2: (this_EQUAL_0= ruleEQUAL | this_LESS_1= ruleLESS | this_GREATER_2= ruleGREATER | this_NOTEQUAL_3= ruleNOTEQUAL | this_LESSEQUAL_4= ruleLESSEQUAL | this_GREATEQUAL_5= ruleGREATEQUAL | this_NOT_6= ruleNOT )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00001E0000001010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000180000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000078000810L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000828000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00001E0000829010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00001E0000821810L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000820800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000001E800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});

}