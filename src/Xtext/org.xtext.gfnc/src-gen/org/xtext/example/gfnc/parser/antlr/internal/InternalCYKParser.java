package org.xtext.example.gfnc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.gfnc.services.CYKGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCYKParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'S'", "'->'", "'|'", "'_'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'v'", "'w'", "'x'", "'y'", "'z'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCYKParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCYKParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCYKParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCYK.g"; }



     	private CYKGrammarAccess grammarAccess;

        public InternalCYKParser(TokenStream input, CYKGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GFNC";
       	}

       	@Override
       	protected CYKGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGFNC"
    // InternalCYK.g:64:1: entryRuleGFNC returns [EObject current=null] : iv_ruleGFNC= ruleGFNC EOF ;
    public final EObject entryRuleGFNC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGFNC = null;


        try {
            // InternalCYK.g:64:45: (iv_ruleGFNC= ruleGFNC EOF )
            // InternalCYK.g:65:2: iv_ruleGFNC= ruleGFNC EOF
            {
             newCompositeNode(grammarAccess.getGFNCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGFNC=ruleGFNC();

            state._fsp--;

             current =iv_ruleGFNC; 
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
    // $ANTLR end "entryRuleGFNC"


    // $ANTLR start "ruleGFNC"
    // InternalCYK.g:71:1: ruleGFNC returns [EObject current=null] : ( ( (lv_w_0_0= ruleSimple ) ) ( (lv_w_1_0= ruleSimple ) )* ( (lv_init_2_0= ruleInitial ) ) ( (lv_productions_3_0= ruleProduction ) )* ) ;
    public final EObject ruleGFNC() throws RecognitionException {
        EObject current = null;

        EObject lv_w_0_0 = null;

        EObject lv_w_1_0 = null;

        EObject lv_init_2_0 = null;

        EObject lv_productions_3_0 = null;



        	enterRule();

        try {
            // InternalCYK.g:77:2: ( ( ( (lv_w_0_0= ruleSimple ) ) ( (lv_w_1_0= ruleSimple ) )* ( (lv_init_2_0= ruleInitial ) ) ( (lv_productions_3_0= ruleProduction ) )* ) )
            // InternalCYK.g:78:2: ( ( (lv_w_0_0= ruleSimple ) ) ( (lv_w_1_0= ruleSimple ) )* ( (lv_init_2_0= ruleInitial ) ) ( (lv_productions_3_0= ruleProduction ) )* )
            {
            // InternalCYK.g:78:2: ( ( (lv_w_0_0= ruleSimple ) ) ( (lv_w_1_0= ruleSimple ) )* ( (lv_init_2_0= ruleInitial ) ) ( (lv_productions_3_0= ruleProduction ) )* )
            // InternalCYK.g:79:3: ( (lv_w_0_0= ruleSimple ) ) ( (lv_w_1_0= ruleSimple ) )* ( (lv_init_2_0= ruleInitial ) ) ( (lv_productions_3_0= ruleProduction ) )*
            {
            // InternalCYK.g:79:3: ( (lv_w_0_0= ruleSimple ) )
            // InternalCYK.g:80:4: (lv_w_0_0= ruleSimple )
            {
            // InternalCYK.g:80:4: (lv_w_0_0= ruleSimple )
            // InternalCYK.g:81:5: lv_w_0_0= ruleSimple
            {

            					newCompositeNode(grammarAccess.getGFNCAccess().getWSimpleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_w_0_0=ruleSimple();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGFNCRule());
            					}
            					add(
            						current,
            						"w",
            						lv_w_0_0,
            						"org.xtext.example.gfnc.CYK.Simple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCYK.g:98:3: ( (lv_w_1_0= ruleSimple ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=39)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCYK.g:99:4: (lv_w_1_0= ruleSimple )
            	    {
            	    // InternalCYK.g:99:4: (lv_w_1_0= ruleSimple )
            	    // InternalCYK.g:100:5: lv_w_1_0= ruleSimple
            	    {

            	    					newCompositeNode(grammarAccess.getGFNCAccess().getWSimpleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_w_1_0=ruleSimple();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGFNCRule());
            	    					}
            	    					add(
            	    						current,
            	    						"w",
            	    						lv_w_1_0,
            	    						"org.xtext.example.gfnc.CYK.Simple");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCYK.g:117:3: ( (lv_init_2_0= ruleInitial ) )
            // InternalCYK.g:118:4: (lv_init_2_0= ruleInitial )
            {
            // InternalCYK.g:118:4: (lv_init_2_0= ruleInitial )
            // InternalCYK.g:119:5: lv_init_2_0= ruleInitial
            {

            					newCompositeNode(grammarAccess.getGFNCAccess().getInitInitialParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_init_2_0=ruleInitial();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGFNCRule());
            					}
            					set(
            						current,
            						"init",
            						lv_init_2_0,
            						"org.xtext.example.gfnc.CYK.Initial");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCYK.g:136:3: ( (lv_productions_3_0= ruleProduction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=40 && LA2_0<=64)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCYK.g:137:4: (lv_productions_3_0= ruleProduction )
            	    {
            	    // InternalCYK.g:137:4: (lv_productions_3_0= ruleProduction )
            	    // InternalCYK.g:138:5: lv_productions_3_0= ruleProduction
            	    {

            	    					newCompositeNode(grammarAccess.getGFNCAccess().getProductionsProductionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_productions_3_0=ruleProduction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGFNCRule());
            	    					}
            	    					add(
            	    						current,
            	    						"productions",
            	    						lv_productions_3_0,
            	    						"org.xtext.example.gfnc.CYK.Production");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleGFNC"


    // $ANTLR start "entryRuleInitial"
    // InternalCYK.g:159:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalCYK.g:159:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalCYK.g:160:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
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
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalCYK.g:166:1: ruleInitial returns [EObject current=null] : ( () ( (lv_left_1_0= 'S' ) ) otherlv_2= '->' ( (lv_right_3_0= ruleLambda ) ) ( (otherlv_4= '|' )+ ( (lv_right_5_0= ruleRight ) ) )* ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token lv_left_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_right_3_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCYK.g:172:2: ( ( () ( (lv_left_1_0= 'S' ) ) otherlv_2= '->' ( (lv_right_3_0= ruleLambda ) ) ( (otherlv_4= '|' )+ ( (lv_right_5_0= ruleRight ) ) )* ) )
            // InternalCYK.g:173:2: ( () ( (lv_left_1_0= 'S' ) ) otherlv_2= '->' ( (lv_right_3_0= ruleLambda ) ) ( (otherlv_4= '|' )+ ( (lv_right_5_0= ruleRight ) ) )* )
            {
            // InternalCYK.g:173:2: ( () ( (lv_left_1_0= 'S' ) ) otherlv_2= '->' ( (lv_right_3_0= ruleLambda ) ) ( (otherlv_4= '|' )+ ( (lv_right_5_0= ruleRight ) ) )* )
            // InternalCYK.g:174:3: () ( (lv_left_1_0= 'S' ) ) otherlv_2= '->' ( (lv_right_3_0= ruleLambda ) ) ( (otherlv_4= '|' )+ ( (lv_right_5_0= ruleRight ) ) )*
            {
            // InternalCYK.g:174:3: ()
            // InternalCYK.g:175:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialAccess().getInitialAction_0(),
            					current);
            			

            }

            // InternalCYK.g:181:3: ( (lv_left_1_0= 'S' ) )
            // InternalCYK.g:182:4: (lv_left_1_0= 'S' )
            {
            // InternalCYK.g:182:4: (lv_left_1_0= 'S' )
            // InternalCYK.g:183:5: lv_left_1_0= 'S'
            {
            lv_left_1_0=(Token)match(input,11,FOLLOW_5); 

            					newLeafNode(lv_left_1_0, grammarAccess.getInitialAccess().getLeftSKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialRule());
            					}
            					setWithLastConsumed(current, "left", lv_left_1_0, "S");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getInitialAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalCYK.g:199:3: ( (lv_right_3_0= ruleLambda ) )
            // InternalCYK.g:200:4: (lv_right_3_0= ruleLambda )
            {
            // InternalCYK.g:200:4: (lv_right_3_0= ruleLambda )
            // InternalCYK.g:201:5: lv_right_3_0= ruleLambda
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getRightLambdaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_right_3_0=ruleLambda();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					add(
            						current,
            						"right",
            						lv_right_3_0,
            						"org.xtext.example.gfnc.CYK.Lambda");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCYK.g:218:3: ( (otherlv_4= '|' )+ ( (lv_right_5_0= ruleRight ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCYK.g:219:4: (otherlv_4= '|' )+ ( (lv_right_5_0= ruleRight ) )
            	    {
            	    // InternalCYK.g:219:4: (otherlv_4= '|' )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==13) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalCYK.g:220:5: otherlv_4= '|'
            	    	    {
            	    	    otherlv_4=(Token)match(input,13,FOLLOW_8); 

            	    	    					newLeafNode(otherlv_4, grammarAccess.getInitialAccess().getVerticalLineKeyword_4_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);

            	    // InternalCYK.g:225:4: ( (lv_right_5_0= ruleRight ) )
            	    // InternalCYK.g:226:5: (lv_right_5_0= ruleRight )
            	    {
            	    // InternalCYK.g:226:5: (lv_right_5_0= ruleRight )
            	    // InternalCYK.g:227:6: lv_right_5_0= ruleRight
            	    {

            	    						newCompositeNode(grammarAccess.getInitialAccess().getRightRightParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_5_0=ruleRight();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInitialRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.example.gfnc.CYK.Right");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleLambda"
    // InternalCYK.g:249:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalCYK.g:249:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalCYK.g:250:2: iv_ruleLambda= ruleLambda EOF
            {
             newCompositeNode(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLambda=ruleLambda();

            state._fsp--;

             current =iv_ruleLambda; 
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
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // InternalCYK.g:256:1: ruleLambda returns [EObject current=null] : ( ( () ( (lv_right_1_0= '_' ) ) ) | this_Right_2= ruleRight ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token lv_right_1_0=null;
        EObject this_Right_2 = null;



        	enterRule();

        try {
            // InternalCYK.g:262:2: ( ( ( () ( (lv_right_1_0= '_' ) ) ) | this_Right_2= ruleRight ) )
            // InternalCYK.g:263:2: ( ( () ( (lv_right_1_0= '_' ) ) ) | this_Right_2= ruleRight )
            {
            // InternalCYK.g:263:2: ( ( () ( (lv_right_1_0= '_' ) ) ) | this_Right_2= ruleRight )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=15 && LA5_0<=64)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCYK.g:264:3: ( () ( (lv_right_1_0= '_' ) ) )
                    {
                    // InternalCYK.g:264:3: ( () ( (lv_right_1_0= '_' ) ) )
                    // InternalCYK.g:265:4: () ( (lv_right_1_0= '_' ) )
                    {
                    // InternalCYK.g:265:4: ()
                    // InternalCYK.g:266:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLambdaAccess().getLambdaAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCYK.g:272:4: ( (lv_right_1_0= '_' ) )
                    // InternalCYK.g:273:5: (lv_right_1_0= '_' )
                    {
                    // InternalCYK.g:273:5: (lv_right_1_0= '_' )
                    // InternalCYK.g:274:6: lv_right_1_0= '_'
                    {
                    lv_right_1_0=(Token)match(input,14,FOLLOW_2); 

                    						newLeafNode(lv_right_1_0, grammarAccess.getLambdaAccess().getRight_Keyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLambdaRule());
                    						}
                    						setWithLastConsumed(current, "right", lv_right_1_0, "_");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:288:3: this_Right_2= ruleRight
                    {

                    			newCompositeNode(grammarAccess.getLambdaAccess().getRightParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Right_2=ruleRight();

                    state._fsp--;


                    			current = this_Right_2;
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
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleProduction"
    // InternalCYK.g:300:1: entryRuleProduction returns [EObject current=null] : iv_ruleProduction= ruleProduction EOF ;
    public final EObject entryRuleProduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduction = null;


        try {
            // InternalCYK.g:300:51: (iv_ruleProduction= ruleProduction EOF )
            // InternalCYK.g:301:2: iv_ruleProduction= ruleProduction EOF
            {
             newCompositeNode(grammarAccess.getProductionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProduction=ruleProduction();

            state._fsp--;

             current =iv_ruleProduction; 
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
    // $ANTLR end "entryRuleProduction"


    // $ANTLR start "ruleProduction"
    // InternalCYK.g:307:1: ruleProduction returns [EObject current=null] : ( () ( (lv_left_1_0= ruleNonTerminal ) ) otherlv_2= '->' ( (lv_right_3_0= ruleRight ) ) ( (otherlv_4= '|' )+ ( (lv_right_5_0= ruleRight ) ) )* ) ;
    public final EObject ruleProduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCYK.g:313:2: ( ( () ( (lv_left_1_0= ruleNonTerminal ) ) otherlv_2= '->' ( (lv_right_3_0= ruleRight ) ) ( (otherlv_4= '|' )+ ( (lv_right_5_0= ruleRight ) ) )* ) )
            // InternalCYK.g:314:2: ( () ( (lv_left_1_0= ruleNonTerminal ) ) otherlv_2= '->' ( (lv_right_3_0= ruleRight ) ) ( (otherlv_4= '|' )+ ( (lv_right_5_0= ruleRight ) ) )* )
            {
            // InternalCYK.g:314:2: ( () ( (lv_left_1_0= ruleNonTerminal ) ) otherlv_2= '->' ( (lv_right_3_0= ruleRight ) ) ( (otherlv_4= '|' )+ ( (lv_right_5_0= ruleRight ) ) )* )
            // InternalCYK.g:315:3: () ( (lv_left_1_0= ruleNonTerminal ) ) otherlv_2= '->' ( (lv_right_3_0= ruleRight ) ) ( (otherlv_4= '|' )+ ( (lv_right_5_0= ruleRight ) ) )*
            {
            // InternalCYK.g:315:3: ()
            // InternalCYK.g:316:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProductionAccess().getProductionAction_0(),
            					current);
            			

            }

            // InternalCYK.g:322:3: ( (lv_left_1_0= ruleNonTerminal ) )
            // InternalCYK.g:323:4: (lv_left_1_0= ruleNonTerminal )
            {
            // InternalCYK.g:323:4: (lv_left_1_0= ruleNonTerminal )
            // InternalCYK.g:324:5: lv_left_1_0= ruleNonTerminal
            {

            					newCompositeNode(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_left_1_0=ruleNonTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"org.xtext.example.gfnc.CYK.NonTerminal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalCYK.g:345:3: ( (lv_right_3_0= ruleRight ) )
            // InternalCYK.g:346:4: (lv_right_3_0= ruleRight )
            {
            // InternalCYK.g:346:4: (lv_right_3_0= ruleRight )
            // InternalCYK.g:347:5: lv_right_3_0= ruleRight
            {

            					newCompositeNode(grammarAccess.getProductionAccess().getRightRightParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_right_3_0=ruleRight();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductionRule());
            					}
            					add(
            						current,
            						"right",
            						lv_right_3_0,
            						"org.xtext.example.gfnc.CYK.Right");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCYK.g:364:3: ( (otherlv_4= '|' )+ ( (lv_right_5_0= ruleRight ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCYK.g:365:4: (otherlv_4= '|' )+ ( (lv_right_5_0= ruleRight ) )
            	    {
            	    // InternalCYK.g:365:4: (otherlv_4= '|' )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==13) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalCYK.g:366:5: otherlv_4= '|'
            	    	    {
            	    	    otherlv_4=(Token)match(input,13,FOLLOW_8); 

            	    	    					newLeafNode(otherlv_4, grammarAccess.getProductionAccess().getVerticalLineKeyword_4_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	    // InternalCYK.g:371:4: ( (lv_right_5_0= ruleRight ) )
            	    // InternalCYK.g:372:5: (lv_right_5_0= ruleRight )
            	    {
            	    // InternalCYK.g:372:5: (lv_right_5_0= ruleRight )
            	    // InternalCYK.g:373:6: lv_right_5_0= ruleRight
            	    {

            	    						newCompositeNode(grammarAccess.getProductionAccess().getRightRightParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_5_0=ruleRight();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProductionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.example.gfnc.CYK.Right");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleProduction"


    // $ANTLR start "entryRuleRight"
    // InternalCYK.g:395:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalCYK.g:395:46: (iv_ruleRight= ruleRight EOF )
            // InternalCYK.g:396:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
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
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalCYK.g:402:1: ruleRight returns [EObject current=null] : ( ( (lv_simple_0_0= ruleSimple ) ) | ( (lv_binary_1_0= ruleBinary ) ) ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_binary_1_0 = null;



        	enterRule();

        try {
            // InternalCYK.g:408:2: ( ( ( (lv_simple_0_0= ruleSimple ) ) | ( (lv_binary_1_0= ruleBinary ) ) ) )
            // InternalCYK.g:409:2: ( ( (lv_simple_0_0= ruleSimple ) ) | ( (lv_binary_1_0= ruleBinary ) ) )
            {
            // InternalCYK.g:409:2: ( ( (lv_simple_0_0= ruleSimple ) ) | ( (lv_binary_1_0= ruleBinary ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=15 && LA8_0<=39)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=40 && LA8_0<=64)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCYK.g:410:3: ( (lv_simple_0_0= ruleSimple ) )
                    {
                    // InternalCYK.g:410:3: ( (lv_simple_0_0= ruleSimple ) )
                    // InternalCYK.g:411:4: (lv_simple_0_0= ruleSimple )
                    {
                    // InternalCYK.g:411:4: (lv_simple_0_0= ruleSimple )
                    // InternalCYK.g:412:5: lv_simple_0_0= ruleSimple
                    {

                    					newCompositeNode(grammarAccess.getRightAccess().getSimpleSimpleParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simple_0_0=ruleSimple();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRightRule());
                    					}
                    					set(
                    						current,
                    						"simple",
                    						lv_simple_0_0,
                    						"org.xtext.example.gfnc.CYK.Simple");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:430:3: ( (lv_binary_1_0= ruleBinary ) )
                    {
                    // InternalCYK.g:430:3: ( (lv_binary_1_0= ruleBinary ) )
                    // InternalCYK.g:431:4: (lv_binary_1_0= ruleBinary )
                    {
                    // InternalCYK.g:431:4: (lv_binary_1_0= ruleBinary )
                    // InternalCYK.g:432:5: lv_binary_1_0= ruleBinary
                    {

                    					newCompositeNode(grammarAccess.getRightAccess().getBinaryBinaryParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_binary_1_0=ruleBinary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRightRule());
                    					}
                    					set(
                    						current,
                    						"binary",
                    						lv_binary_1_0,
                    						"org.xtext.example.gfnc.CYK.Binary");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleSimple"
    // InternalCYK.g:453:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalCYK.g:453:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalCYK.g:454:2: iv_ruleSimple= ruleSimple EOF
            {
             newCompositeNode(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimple=ruleSimple();

            state._fsp--;

             current =iv_ruleSimple; 
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
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalCYK.g:460:1: ruleSimple returns [EObject current=null] : ( () ( ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) ) ) ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        Token lv_terminals_1_1=null;
        Token lv_terminals_1_2=null;
        Token lv_terminals_1_3=null;
        Token lv_terminals_1_4=null;
        Token lv_terminals_1_5=null;
        Token lv_terminals_1_6=null;
        Token lv_terminals_1_7=null;
        Token lv_terminals_1_8=null;
        Token lv_terminals_1_9=null;
        Token lv_terminals_1_10=null;
        Token lv_terminals_1_11=null;
        Token lv_terminals_1_12=null;
        Token lv_terminals_1_13=null;
        Token lv_terminals_1_14=null;
        Token lv_terminals_1_15=null;
        Token lv_terminals_1_16=null;
        Token lv_terminals_1_17=null;
        Token lv_terminals_1_18=null;
        Token lv_terminals_1_19=null;
        Token lv_terminals_1_20=null;
        Token lv_terminals_1_21=null;
        Token lv_terminals_1_22=null;
        Token lv_terminals_1_23=null;
        Token lv_terminals_1_24=null;
        Token lv_terminals_1_25=null;


        	enterRule();

        try {
            // InternalCYK.g:466:2: ( ( () ( ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) ) ) ) )
            // InternalCYK.g:467:2: ( () ( ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) ) ) )
            {
            // InternalCYK.g:467:2: ( () ( ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) ) ) )
            // InternalCYK.g:468:3: () ( ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) ) )
            {
            // InternalCYK.g:468:3: ()
            // InternalCYK.g:469:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleAccess().getSimpleAction_0(),
            					current);
            			

            }

            // InternalCYK.g:475:3: ( ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) ) )
            // InternalCYK.g:476:4: ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) )
            {
            // InternalCYK.g:476:4: ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) )
            // InternalCYK.g:477:5: (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' )
            {
            // InternalCYK.g:477:5: (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' )
            int alt9=25;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case 17:
                {
                alt9=3;
                }
                break;
            case 18:
                {
                alt9=4;
                }
                break;
            case 19:
                {
                alt9=5;
                }
                break;
            case 20:
                {
                alt9=6;
                }
                break;
            case 21:
                {
                alt9=7;
                }
                break;
            case 22:
                {
                alt9=8;
                }
                break;
            case 23:
                {
                alt9=9;
                }
                break;
            case 24:
                {
                alt9=10;
                }
                break;
            case 25:
                {
                alt9=11;
                }
                break;
            case 26:
                {
                alt9=12;
                }
                break;
            case 27:
                {
                alt9=13;
                }
                break;
            case 28:
                {
                alt9=14;
                }
                break;
            case 29:
                {
                alt9=15;
                }
                break;
            case 30:
                {
                alt9=16;
                }
                break;
            case 31:
                {
                alt9=17;
                }
                break;
            case 32:
                {
                alt9=18;
                }
                break;
            case 33:
                {
                alt9=19;
                }
                break;
            case 34:
                {
                alt9=20;
                }
                break;
            case 35:
                {
                alt9=21;
                }
                break;
            case 36:
                {
                alt9=22;
                }
                break;
            case 37:
                {
                alt9=23;
                }
                break;
            case 38:
                {
                alt9=24;
                }
                break;
            case 39:
                {
                alt9=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCYK.g:478:6: lv_terminals_1_1= 'a'
                    {
                    lv_terminals_1_1=(Token)match(input,15,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_1, grammarAccess.getSimpleAccess().getTerminalsAKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCYK.g:489:6: lv_terminals_1_2= 'b'
                    {
                    lv_terminals_1_2=(Token)match(input,16,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_2, grammarAccess.getSimpleAccess().getTerminalsBKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalCYK.g:500:6: lv_terminals_1_3= 'c'
                    {
                    lv_terminals_1_3=(Token)match(input,17,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_3, grammarAccess.getSimpleAccess().getTerminalsCKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalCYK.g:511:6: lv_terminals_1_4= 'd'
                    {
                    lv_terminals_1_4=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_4, grammarAccess.getSimpleAccess().getTerminalsDKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalCYK.g:522:6: lv_terminals_1_5= 'e'
                    {
                    lv_terminals_1_5=(Token)match(input,19,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_5, grammarAccess.getSimpleAccess().getTerminalsEKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalCYK.g:533:6: lv_terminals_1_6= 'f'
                    {
                    lv_terminals_1_6=(Token)match(input,20,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_6, grammarAccess.getSimpleAccess().getTerminalsFKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalCYK.g:544:6: lv_terminals_1_7= 'g'
                    {
                    lv_terminals_1_7=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_7, grammarAccess.getSimpleAccess().getTerminalsGKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalCYK.g:555:6: lv_terminals_1_8= 'h'
                    {
                    lv_terminals_1_8=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_8, grammarAccess.getSimpleAccess().getTerminalsHKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalCYK.g:566:6: lv_terminals_1_9= 'i'
                    {
                    lv_terminals_1_9=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_9, grammarAccess.getSimpleAccess().getTerminalsIKeyword_1_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalCYK.g:577:6: lv_terminals_1_10= 'j'
                    {
                    lv_terminals_1_10=(Token)match(input,24,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_10, grammarAccess.getSimpleAccess().getTerminalsJKeyword_1_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalCYK.g:588:6: lv_terminals_1_11= 'k'
                    {
                    lv_terminals_1_11=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_11, grammarAccess.getSimpleAccess().getTerminalsKKeyword_1_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalCYK.g:599:6: lv_terminals_1_12= 'l'
                    {
                    lv_terminals_1_12=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_12, grammarAccess.getSimpleAccess().getTerminalsLKeyword_1_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalCYK.g:610:6: lv_terminals_1_13= 'm'
                    {
                    lv_terminals_1_13=(Token)match(input,27,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_13, grammarAccess.getSimpleAccess().getTerminalsMKeyword_1_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_13, null);
                    					

                    }
                    break;
                case 14 :
                    // InternalCYK.g:621:6: lv_terminals_1_14= 'n'
                    {
                    lv_terminals_1_14=(Token)match(input,28,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_14, grammarAccess.getSimpleAccess().getTerminalsNKeyword_1_0_13());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_14, null);
                    					

                    }
                    break;
                case 15 :
                    // InternalCYK.g:632:6: lv_terminals_1_15= 'o'
                    {
                    lv_terminals_1_15=(Token)match(input,29,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_15, grammarAccess.getSimpleAccess().getTerminalsOKeyword_1_0_14());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_15, null);
                    					

                    }
                    break;
                case 16 :
                    // InternalCYK.g:643:6: lv_terminals_1_16= 'p'
                    {
                    lv_terminals_1_16=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_16, grammarAccess.getSimpleAccess().getTerminalsPKeyword_1_0_15());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_16, null);
                    					

                    }
                    break;
                case 17 :
                    // InternalCYK.g:654:6: lv_terminals_1_17= 'q'
                    {
                    lv_terminals_1_17=(Token)match(input,31,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_17, grammarAccess.getSimpleAccess().getTerminalsQKeyword_1_0_16());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_17, null);
                    					

                    }
                    break;
                case 18 :
                    // InternalCYK.g:665:6: lv_terminals_1_18= 'r'
                    {
                    lv_terminals_1_18=(Token)match(input,32,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_18, grammarAccess.getSimpleAccess().getTerminalsRKeyword_1_0_17());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_18, null);
                    					

                    }
                    break;
                case 19 :
                    // InternalCYK.g:676:6: lv_terminals_1_19= 's'
                    {
                    lv_terminals_1_19=(Token)match(input,33,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_19, grammarAccess.getSimpleAccess().getTerminalsSKeyword_1_0_18());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_19, null);
                    					

                    }
                    break;
                case 20 :
                    // InternalCYK.g:687:6: lv_terminals_1_20= 't'
                    {
                    lv_terminals_1_20=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_20, grammarAccess.getSimpleAccess().getTerminalsTKeyword_1_0_19());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_20, null);
                    					

                    }
                    break;
                case 21 :
                    // InternalCYK.g:698:6: lv_terminals_1_21= 'v'
                    {
                    lv_terminals_1_21=(Token)match(input,35,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_21, grammarAccess.getSimpleAccess().getTerminalsVKeyword_1_0_20());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_21, null);
                    					

                    }
                    break;
                case 22 :
                    // InternalCYK.g:709:6: lv_terminals_1_22= 'w'
                    {
                    lv_terminals_1_22=(Token)match(input,36,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_22, grammarAccess.getSimpleAccess().getTerminalsWKeyword_1_0_21());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_22, null);
                    					

                    }
                    break;
                case 23 :
                    // InternalCYK.g:720:6: lv_terminals_1_23= 'x'
                    {
                    lv_terminals_1_23=(Token)match(input,37,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_23, grammarAccess.getSimpleAccess().getTerminalsXKeyword_1_0_22());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_23, null);
                    					

                    }
                    break;
                case 24 :
                    // InternalCYK.g:731:6: lv_terminals_1_24= 'y'
                    {
                    lv_terminals_1_24=(Token)match(input,38,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_24, grammarAccess.getSimpleAccess().getTerminalsYKeyword_1_0_23());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_24, null);
                    					

                    }
                    break;
                case 25 :
                    // InternalCYK.g:742:6: lv_terminals_1_25= 'z'
                    {
                    lv_terminals_1_25=(Token)match(input,39,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_25, grammarAccess.getSimpleAccess().getTerminalsZKeyword_1_0_24());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_25, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleNonTerminal"
    // InternalCYK.g:759:1: entryRuleNonTerminal returns [EObject current=null] : iv_ruleNonTerminal= ruleNonTerminal EOF ;
    public final EObject entryRuleNonTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonTerminal = null;


        try {
            // InternalCYK.g:759:52: (iv_ruleNonTerminal= ruleNonTerminal EOF )
            // InternalCYK.g:760:2: iv_ruleNonTerminal= ruleNonTerminal EOF
            {
             newCompositeNode(grammarAccess.getNonTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonTerminal=ruleNonTerminal();

            state._fsp--;

             current =iv_ruleNonTerminal; 
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
    // $ANTLR end "entryRuleNonTerminal"


    // $ANTLR start "ruleNonTerminal"
    // InternalCYK.g:766:1: ruleNonTerminal returns [EObject current=null] : ( () ( ( (lv_noTerminals_1_1= 'A' | lv_noTerminals_1_2= 'B' | lv_noTerminals_1_3= 'C' | lv_noTerminals_1_4= 'D' | lv_noTerminals_1_5= 'E' | lv_noTerminals_1_6= 'F' | lv_noTerminals_1_7= 'G' | lv_noTerminals_1_8= 'H' | lv_noTerminals_1_9= 'I' | lv_noTerminals_1_10= 'J' | lv_noTerminals_1_11= 'K' | lv_noTerminals_1_12= 'L' | lv_noTerminals_1_13= 'M' | lv_noTerminals_1_14= 'N' | lv_noTerminals_1_15= 'O' | lv_noTerminals_1_16= 'P' | lv_noTerminals_1_17= 'Q' | lv_noTerminals_1_18= 'R' | lv_noTerminals_1_19= 'T' | lv_noTerminals_1_20= 'U' | lv_noTerminals_1_21= 'V' | lv_noTerminals_1_22= 'W' | lv_noTerminals_1_23= 'X' | lv_noTerminals_1_24= 'Y' | lv_noTerminals_1_25= 'Z' ) ) ) ) ;
    public final EObject ruleNonTerminal() throws RecognitionException {
        EObject current = null;

        Token lv_noTerminals_1_1=null;
        Token lv_noTerminals_1_2=null;
        Token lv_noTerminals_1_3=null;
        Token lv_noTerminals_1_4=null;
        Token lv_noTerminals_1_5=null;
        Token lv_noTerminals_1_6=null;
        Token lv_noTerminals_1_7=null;
        Token lv_noTerminals_1_8=null;
        Token lv_noTerminals_1_9=null;
        Token lv_noTerminals_1_10=null;
        Token lv_noTerminals_1_11=null;
        Token lv_noTerminals_1_12=null;
        Token lv_noTerminals_1_13=null;
        Token lv_noTerminals_1_14=null;
        Token lv_noTerminals_1_15=null;
        Token lv_noTerminals_1_16=null;
        Token lv_noTerminals_1_17=null;
        Token lv_noTerminals_1_18=null;
        Token lv_noTerminals_1_19=null;
        Token lv_noTerminals_1_20=null;
        Token lv_noTerminals_1_21=null;
        Token lv_noTerminals_1_22=null;
        Token lv_noTerminals_1_23=null;
        Token lv_noTerminals_1_24=null;
        Token lv_noTerminals_1_25=null;


        	enterRule();

        try {
            // InternalCYK.g:772:2: ( ( () ( ( (lv_noTerminals_1_1= 'A' | lv_noTerminals_1_2= 'B' | lv_noTerminals_1_3= 'C' | lv_noTerminals_1_4= 'D' | lv_noTerminals_1_5= 'E' | lv_noTerminals_1_6= 'F' | lv_noTerminals_1_7= 'G' | lv_noTerminals_1_8= 'H' | lv_noTerminals_1_9= 'I' | lv_noTerminals_1_10= 'J' | lv_noTerminals_1_11= 'K' | lv_noTerminals_1_12= 'L' | lv_noTerminals_1_13= 'M' | lv_noTerminals_1_14= 'N' | lv_noTerminals_1_15= 'O' | lv_noTerminals_1_16= 'P' | lv_noTerminals_1_17= 'Q' | lv_noTerminals_1_18= 'R' | lv_noTerminals_1_19= 'T' | lv_noTerminals_1_20= 'U' | lv_noTerminals_1_21= 'V' | lv_noTerminals_1_22= 'W' | lv_noTerminals_1_23= 'X' | lv_noTerminals_1_24= 'Y' | lv_noTerminals_1_25= 'Z' ) ) ) ) )
            // InternalCYK.g:773:2: ( () ( ( (lv_noTerminals_1_1= 'A' | lv_noTerminals_1_2= 'B' | lv_noTerminals_1_3= 'C' | lv_noTerminals_1_4= 'D' | lv_noTerminals_1_5= 'E' | lv_noTerminals_1_6= 'F' | lv_noTerminals_1_7= 'G' | lv_noTerminals_1_8= 'H' | lv_noTerminals_1_9= 'I' | lv_noTerminals_1_10= 'J' | lv_noTerminals_1_11= 'K' | lv_noTerminals_1_12= 'L' | lv_noTerminals_1_13= 'M' | lv_noTerminals_1_14= 'N' | lv_noTerminals_1_15= 'O' | lv_noTerminals_1_16= 'P' | lv_noTerminals_1_17= 'Q' | lv_noTerminals_1_18= 'R' | lv_noTerminals_1_19= 'T' | lv_noTerminals_1_20= 'U' | lv_noTerminals_1_21= 'V' | lv_noTerminals_1_22= 'W' | lv_noTerminals_1_23= 'X' | lv_noTerminals_1_24= 'Y' | lv_noTerminals_1_25= 'Z' ) ) ) )
            {
            // InternalCYK.g:773:2: ( () ( ( (lv_noTerminals_1_1= 'A' | lv_noTerminals_1_2= 'B' | lv_noTerminals_1_3= 'C' | lv_noTerminals_1_4= 'D' | lv_noTerminals_1_5= 'E' | lv_noTerminals_1_6= 'F' | lv_noTerminals_1_7= 'G' | lv_noTerminals_1_8= 'H' | lv_noTerminals_1_9= 'I' | lv_noTerminals_1_10= 'J' | lv_noTerminals_1_11= 'K' | lv_noTerminals_1_12= 'L' | lv_noTerminals_1_13= 'M' | lv_noTerminals_1_14= 'N' | lv_noTerminals_1_15= 'O' | lv_noTerminals_1_16= 'P' | lv_noTerminals_1_17= 'Q' | lv_noTerminals_1_18= 'R' | lv_noTerminals_1_19= 'T' | lv_noTerminals_1_20= 'U' | lv_noTerminals_1_21= 'V' | lv_noTerminals_1_22= 'W' | lv_noTerminals_1_23= 'X' | lv_noTerminals_1_24= 'Y' | lv_noTerminals_1_25= 'Z' ) ) ) )
            // InternalCYK.g:774:3: () ( ( (lv_noTerminals_1_1= 'A' | lv_noTerminals_1_2= 'B' | lv_noTerminals_1_3= 'C' | lv_noTerminals_1_4= 'D' | lv_noTerminals_1_5= 'E' | lv_noTerminals_1_6= 'F' | lv_noTerminals_1_7= 'G' | lv_noTerminals_1_8= 'H' | lv_noTerminals_1_9= 'I' | lv_noTerminals_1_10= 'J' | lv_noTerminals_1_11= 'K' | lv_noTerminals_1_12= 'L' | lv_noTerminals_1_13= 'M' | lv_noTerminals_1_14= 'N' | lv_noTerminals_1_15= 'O' | lv_noTerminals_1_16= 'P' | lv_noTerminals_1_17= 'Q' | lv_noTerminals_1_18= 'R' | lv_noTerminals_1_19= 'T' | lv_noTerminals_1_20= 'U' | lv_noTerminals_1_21= 'V' | lv_noTerminals_1_22= 'W' | lv_noTerminals_1_23= 'X' | lv_noTerminals_1_24= 'Y' | lv_noTerminals_1_25= 'Z' ) ) )
            {
            // InternalCYK.g:774:3: ()
            // InternalCYK.g:775:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNonTerminalAccess().getNonTerminalAction_0(),
            					current);
            			

            }

            // InternalCYK.g:781:3: ( ( (lv_noTerminals_1_1= 'A' | lv_noTerminals_1_2= 'B' | lv_noTerminals_1_3= 'C' | lv_noTerminals_1_4= 'D' | lv_noTerminals_1_5= 'E' | lv_noTerminals_1_6= 'F' | lv_noTerminals_1_7= 'G' | lv_noTerminals_1_8= 'H' | lv_noTerminals_1_9= 'I' | lv_noTerminals_1_10= 'J' | lv_noTerminals_1_11= 'K' | lv_noTerminals_1_12= 'L' | lv_noTerminals_1_13= 'M' | lv_noTerminals_1_14= 'N' | lv_noTerminals_1_15= 'O' | lv_noTerminals_1_16= 'P' | lv_noTerminals_1_17= 'Q' | lv_noTerminals_1_18= 'R' | lv_noTerminals_1_19= 'T' | lv_noTerminals_1_20= 'U' | lv_noTerminals_1_21= 'V' | lv_noTerminals_1_22= 'W' | lv_noTerminals_1_23= 'X' | lv_noTerminals_1_24= 'Y' | lv_noTerminals_1_25= 'Z' ) ) )
            // InternalCYK.g:782:4: ( (lv_noTerminals_1_1= 'A' | lv_noTerminals_1_2= 'B' | lv_noTerminals_1_3= 'C' | lv_noTerminals_1_4= 'D' | lv_noTerminals_1_5= 'E' | lv_noTerminals_1_6= 'F' | lv_noTerminals_1_7= 'G' | lv_noTerminals_1_8= 'H' | lv_noTerminals_1_9= 'I' | lv_noTerminals_1_10= 'J' | lv_noTerminals_1_11= 'K' | lv_noTerminals_1_12= 'L' | lv_noTerminals_1_13= 'M' | lv_noTerminals_1_14= 'N' | lv_noTerminals_1_15= 'O' | lv_noTerminals_1_16= 'P' | lv_noTerminals_1_17= 'Q' | lv_noTerminals_1_18= 'R' | lv_noTerminals_1_19= 'T' | lv_noTerminals_1_20= 'U' | lv_noTerminals_1_21= 'V' | lv_noTerminals_1_22= 'W' | lv_noTerminals_1_23= 'X' | lv_noTerminals_1_24= 'Y' | lv_noTerminals_1_25= 'Z' ) )
            {
            // InternalCYK.g:782:4: ( (lv_noTerminals_1_1= 'A' | lv_noTerminals_1_2= 'B' | lv_noTerminals_1_3= 'C' | lv_noTerminals_1_4= 'D' | lv_noTerminals_1_5= 'E' | lv_noTerminals_1_6= 'F' | lv_noTerminals_1_7= 'G' | lv_noTerminals_1_8= 'H' | lv_noTerminals_1_9= 'I' | lv_noTerminals_1_10= 'J' | lv_noTerminals_1_11= 'K' | lv_noTerminals_1_12= 'L' | lv_noTerminals_1_13= 'M' | lv_noTerminals_1_14= 'N' | lv_noTerminals_1_15= 'O' | lv_noTerminals_1_16= 'P' | lv_noTerminals_1_17= 'Q' | lv_noTerminals_1_18= 'R' | lv_noTerminals_1_19= 'T' | lv_noTerminals_1_20= 'U' | lv_noTerminals_1_21= 'V' | lv_noTerminals_1_22= 'W' | lv_noTerminals_1_23= 'X' | lv_noTerminals_1_24= 'Y' | lv_noTerminals_1_25= 'Z' ) )
            // InternalCYK.g:783:5: (lv_noTerminals_1_1= 'A' | lv_noTerminals_1_2= 'B' | lv_noTerminals_1_3= 'C' | lv_noTerminals_1_4= 'D' | lv_noTerminals_1_5= 'E' | lv_noTerminals_1_6= 'F' | lv_noTerminals_1_7= 'G' | lv_noTerminals_1_8= 'H' | lv_noTerminals_1_9= 'I' | lv_noTerminals_1_10= 'J' | lv_noTerminals_1_11= 'K' | lv_noTerminals_1_12= 'L' | lv_noTerminals_1_13= 'M' | lv_noTerminals_1_14= 'N' | lv_noTerminals_1_15= 'O' | lv_noTerminals_1_16= 'P' | lv_noTerminals_1_17= 'Q' | lv_noTerminals_1_18= 'R' | lv_noTerminals_1_19= 'T' | lv_noTerminals_1_20= 'U' | lv_noTerminals_1_21= 'V' | lv_noTerminals_1_22= 'W' | lv_noTerminals_1_23= 'X' | lv_noTerminals_1_24= 'Y' | lv_noTerminals_1_25= 'Z' )
            {
            // InternalCYK.g:783:5: (lv_noTerminals_1_1= 'A' | lv_noTerminals_1_2= 'B' | lv_noTerminals_1_3= 'C' | lv_noTerminals_1_4= 'D' | lv_noTerminals_1_5= 'E' | lv_noTerminals_1_6= 'F' | lv_noTerminals_1_7= 'G' | lv_noTerminals_1_8= 'H' | lv_noTerminals_1_9= 'I' | lv_noTerminals_1_10= 'J' | lv_noTerminals_1_11= 'K' | lv_noTerminals_1_12= 'L' | lv_noTerminals_1_13= 'M' | lv_noTerminals_1_14= 'N' | lv_noTerminals_1_15= 'O' | lv_noTerminals_1_16= 'P' | lv_noTerminals_1_17= 'Q' | lv_noTerminals_1_18= 'R' | lv_noTerminals_1_19= 'T' | lv_noTerminals_1_20= 'U' | lv_noTerminals_1_21= 'V' | lv_noTerminals_1_22= 'W' | lv_noTerminals_1_23= 'X' | lv_noTerminals_1_24= 'Y' | lv_noTerminals_1_25= 'Z' )
            int alt10=25;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt10=1;
                }
                break;
            case 41:
                {
                alt10=2;
                }
                break;
            case 42:
                {
                alt10=3;
                }
                break;
            case 43:
                {
                alt10=4;
                }
                break;
            case 44:
                {
                alt10=5;
                }
                break;
            case 45:
                {
                alt10=6;
                }
                break;
            case 46:
                {
                alt10=7;
                }
                break;
            case 47:
                {
                alt10=8;
                }
                break;
            case 48:
                {
                alt10=9;
                }
                break;
            case 49:
                {
                alt10=10;
                }
                break;
            case 50:
                {
                alt10=11;
                }
                break;
            case 51:
                {
                alt10=12;
                }
                break;
            case 52:
                {
                alt10=13;
                }
                break;
            case 53:
                {
                alt10=14;
                }
                break;
            case 54:
                {
                alt10=15;
                }
                break;
            case 55:
                {
                alt10=16;
                }
                break;
            case 56:
                {
                alt10=17;
                }
                break;
            case 57:
                {
                alt10=18;
                }
                break;
            case 58:
                {
                alt10=19;
                }
                break;
            case 59:
                {
                alt10=20;
                }
                break;
            case 60:
                {
                alt10=21;
                }
                break;
            case 61:
                {
                alt10=22;
                }
                break;
            case 62:
                {
                alt10=23;
                }
                break;
            case 63:
                {
                alt10=24;
                }
                break;
            case 64:
                {
                alt10=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCYK.g:784:6: lv_noTerminals_1_1= 'A'
                    {
                    lv_noTerminals_1_1=(Token)match(input,40,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_1, grammarAccess.getNonTerminalAccess().getNoTerminalsAKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCYK.g:795:6: lv_noTerminals_1_2= 'B'
                    {
                    lv_noTerminals_1_2=(Token)match(input,41,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_2, grammarAccess.getNonTerminalAccess().getNoTerminalsBKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalCYK.g:806:6: lv_noTerminals_1_3= 'C'
                    {
                    lv_noTerminals_1_3=(Token)match(input,42,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_3, grammarAccess.getNonTerminalAccess().getNoTerminalsCKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalCYK.g:817:6: lv_noTerminals_1_4= 'D'
                    {
                    lv_noTerminals_1_4=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_4, grammarAccess.getNonTerminalAccess().getNoTerminalsDKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalCYK.g:828:6: lv_noTerminals_1_5= 'E'
                    {
                    lv_noTerminals_1_5=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_5, grammarAccess.getNonTerminalAccess().getNoTerminalsEKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalCYK.g:839:6: lv_noTerminals_1_6= 'F'
                    {
                    lv_noTerminals_1_6=(Token)match(input,45,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_6, grammarAccess.getNonTerminalAccess().getNoTerminalsFKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalCYK.g:850:6: lv_noTerminals_1_7= 'G'
                    {
                    lv_noTerminals_1_7=(Token)match(input,46,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_7, grammarAccess.getNonTerminalAccess().getNoTerminalsGKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalCYK.g:861:6: lv_noTerminals_1_8= 'H'
                    {
                    lv_noTerminals_1_8=(Token)match(input,47,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_8, grammarAccess.getNonTerminalAccess().getNoTerminalsHKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalCYK.g:872:6: lv_noTerminals_1_9= 'I'
                    {
                    lv_noTerminals_1_9=(Token)match(input,48,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_9, grammarAccess.getNonTerminalAccess().getNoTerminalsIKeyword_1_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalCYK.g:883:6: lv_noTerminals_1_10= 'J'
                    {
                    lv_noTerminals_1_10=(Token)match(input,49,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_10, grammarAccess.getNonTerminalAccess().getNoTerminalsJKeyword_1_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalCYK.g:894:6: lv_noTerminals_1_11= 'K'
                    {
                    lv_noTerminals_1_11=(Token)match(input,50,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_11, grammarAccess.getNonTerminalAccess().getNoTerminalsKKeyword_1_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalCYK.g:905:6: lv_noTerminals_1_12= 'L'
                    {
                    lv_noTerminals_1_12=(Token)match(input,51,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_12, grammarAccess.getNonTerminalAccess().getNoTerminalsLKeyword_1_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalCYK.g:916:6: lv_noTerminals_1_13= 'M'
                    {
                    lv_noTerminals_1_13=(Token)match(input,52,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_13, grammarAccess.getNonTerminalAccess().getNoTerminalsMKeyword_1_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_13, null);
                    					

                    }
                    break;
                case 14 :
                    // InternalCYK.g:927:6: lv_noTerminals_1_14= 'N'
                    {
                    lv_noTerminals_1_14=(Token)match(input,53,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_14, grammarAccess.getNonTerminalAccess().getNoTerminalsNKeyword_1_0_13());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_14, null);
                    					

                    }
                    break;
                case 15 :
                    // InternalCYK.g:938:6: lv_noTerminals_1_15= 'O'
                    {
                    lv_noTerminals_1_15=(Token)match(input,54,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_15, grammarAccess.getNonTerminalAccess().getNoTerminalsOKeyword_1_0_14());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_15, null);
                    					

                    }
                    break;
                case 16 :
                    // InternalCYK.g:949:6: lv_noTerminals_1_16= 'P'
                    {
                    lv_noTerminals_1_16=(Token)match(input,55,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_16, grammarAccess.getNonTerminalAccess().getNoTerminalsPKeyword_1_0_15());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_16, null);
                    					

                    }
                    break;
                case 17 :
                    // InternalCYK.g:960:6: lv_noTerminals_1_17= 'Q'
                    {
                    lv_noTerminals_1_17=(Token)match(input,56,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_17, grammarAccess.getNonTerminalAccess().getNoTerminalsQKeyword_1_0_16());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_17, null);
                    					

                    }
                    break;
                case 18 :
                    // InternalCYK.g:971:6: lv_noTerminals_1_18= 'R'
                    {
                    lv_noTerminals_1_18=(Token)match(input,57,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_18, grammarAccess.getNonTerminalAccess().getNoTerminalsRKeyword_1_0_17());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_18, null);
                    					

                    }
                    break;
                case 19 :
                    // InternalCYK.g:982:6: lv_noTerminals_1_19= 'T'
                    {
                    lv_noTerminals_1_19=(Token)match(input,58,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_19, grammarAccess.getNonTerminalAccess().getNoTerminalsTKeyword_1_0_18());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_19, null);
                    					

                    }
                    break;
                case 20 :
                    // InternalCYK.g:993:6: lv_noTerminals_1_20= 'U'
                    {
                    lv_noTerminals_1_20=(Token)match(input,59,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_20, grammarAccess.getNonTerminalAccess().getNoTerminalsUKeyword_1_0_19());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_20, null);
                    					

                    }
                    break;
                case 21 :
                    // InternalCYK.g:1004:6: lv_noTerminals_1_21= 'V'
                    {
                    lv_noTerminals_1_21=(Token)match(input,60,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_21, grammarAccess.getNonTerminalAccess().getNoTerminalsVKeyword_1_0_20());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_21, null);
                    					

                    }
                    break;
                case 22 :
                    // InternalCYK.g:1015:6: lv_noTerminals_1_22= 'W'
                    {
                    lv_noTerminals_1_22=(Token)match(input,61,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_22, grammarAccess.getNonTerminalAccess().getNoTerminalsWKeyword_1_0_21());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_22, null);
                    					

                    }
                    break;
                case 23 :
                    // InternalCYK.g:1026:6: lv_noTerminals_1_23= 'X'
                    {
                    lv_noTerminals_1_23=(Token)match(input,62,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_23, grammarAccess.getNonTerminalAccess().getNoTerminalsXKeyword_1_0_22());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_23, null);
                    					

                    }
                    break;
                case 24 :
                    // InternalCYK.g:1037:6: lv_noTerminals_1_24= 'Y'
                    {
                    lv_noTerminals_1_24=(Token)match(input,63,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_24, grammarAccess.getNonTerminalAccess().getNoTerminalsYKeyword_1_0_23());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_24, null);
                    					

                    }
                    break;
                case 25 :
                    // InternalCYK.g:1048:6: lv_noTerminals_1_25= 'Z'
                    {
                    lv_noTerminals_1_25=(Token)match(input,64,FOLLOW_2); 

                    						newLeafNode(lv_noTerminals_1_25, grammarAccess.getNonTerminalAccess().getNoTerminalsZKeyword_1_0_24());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "noTerminals", lv_noTerminals_1_25, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleNonTerminal"


    // $ANTLR start "entryRuleBinary"
    // InternalCYK.g:1065:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // InternalCYK.g:1065:47: (iv_ruleBinary= ruleBinary EOF )
            // InternalCYK.g:1066:2: iv_ruleBinary= ruleBinary EOF
            {
             newCompositeNode(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinary=ruleBinary();

            state._fsp--;

             current =iv_ruleBinary; 
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
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // InternalCYK.g:1072:1: ruleBinary returns [EObject current=null] : ( () ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) ) ;
    public final EObject ruleBinary() throws RecognitionException {
        EObject current = null;

        EObject lv_first_1_0 = null;

        EObject lv_second_2_0 = null;



        	enterRule();

        try {
            // InternalCYK.g:1078:2: ( ( () ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) ) )
            // InternalCYK.g:1079:2: ( () ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) )
            {
            // InternalCYK.g:1079:2: ( () ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) )
            // InternalCYK.g:1080:3: () ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) )
            {
            // InternalCYK.g:1080:3: ()
            // InternalCYK.g:1081:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBinaryAccess().getBinaryAction_0(),
            					current);
            			

            }

            // InternalCYK.g:1087:3: ( (lv_first_1_0= ruleNonTerminal ) )
            // InternalCYK.g:1088:4: (lv_first_1_0= ruleNonTerminal )
            {
            // InternalCYK.g:1088:4: (lv_first_1_0= ruleNonTerminal )
            // InternalCYK.g:1089:5: lv_first_1_0= ruleNonTerminal
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_first_1_0=ruleNonTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"first",
            						lv_first_1_0,
            						"org.xtext.example.gfnc.CYK.NonTerminal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCYK.g:1106:3: ( (lv_second_2_0= ruleNonTerminal ) )
            // InternalCYK.g:1107:4: (lv_second_2_0= ruleNonTerminal )
            {
            // InternalCYK.g:1107:4: (lv_second_2_0= ruleNonTerminal )
            // InternalCYK.g:1108:5: lv_second_2_0= ruleNonTerminal
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_second_2_0=ruleNonTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"second",
            						lv_second_2_0,
            						"org.xtext.example.gfnc.CYK.NonTerminal");
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
    // $ANTLR end "ruleBinary"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000FFFFFF8800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0xFFFFFF0000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xFFFFFFFFFFFFC000L,0x0000000000000001L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xFFFFFFFFFFFFE000L,0x0000000000000001L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0xFFFFFF0000000000L,0x0000000000000001L});

}