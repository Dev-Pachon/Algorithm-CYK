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
    // InternalCYK.g:71:1: ruleGFNC returns [EObject current=null] : ( ( (lv_init_0_0= ruleInitial ) ) ( (lv_productions_1_0= ruleProduction ) )* ) ;
    public final EObject ruleGFNC() throws RecognitionException {
        EObject current = null;

        EObject lv_init_0_0 = null;

        EObject lv_productions_1_0 = null;



        	enterRule();

        try {
            // InternalCYK.g:77:2: ( ( ( (lv_init_0_0= ruleInitial ) ) ( (lv_productions_1_0= ruleProduction ) )* ) )
            // InternalCYK.g:78:2: ( ( (lv_init_0_0= ruleInitial ) ) ( (lv_productions_1_0= ruleProduction ) )* )
            {
            // InternalCYK.g:78:2: ( ( (lv_init_0_0= ruleInitial ) ) ( (lv_productions_1_0= ruleProduction ) )* )
            // InternalCYK.g:79:3: ( (lv_init_0_0= ruleInitial ) ) ( (lv_productions_1_0= ruleProduction ) )*
            {
            // InternalCYK.g:79:3: ( (lv_init_0_0= ruleInitial ) )
            // InternalCYK.g:80:4: (lv_init_0_0= ruleInitial )
            {
            // InternalCYK.g:80:4: (lv_init_0_0= ruleInitial )
            // InternalCYK.g:81:5: lv_init_0_0= ruleInitial
            {

            					newCompositeNode(grammarAccess.getGFNCAccess().getInitInitialParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_init_0_0=ruleInitial();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGFNCRule());
            					}
            					set(
            						current,
            						"init",
            						lv_init_0_0,
            						"org.xtext.example.gfnc.CYK.Initial");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCYK.g:98:3: ( (lv_productions_1_0= ruleProduction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=40 && LA1_0<=64)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCYK.g:99:4: (lv_productions_1_0= ruleProduction )
            	    {
            	    // InternalCYK.g:99:4: (lv_productions_1_0= ruleProduction )
            	    // InternalCYK.g:100:5: lv_productions_1_0= ruleProduction
            	    {

            	    					newCompositeNode(grammarAccess.getGFNCAccess().getProductionsProductionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_productions_1_0=ruleProduction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGFNCRule());
            	    					}
            	    					add(
            	    						current,
            	    						"productions",
            	    						lv_productions_1_0,
            	    						"org.xtext.example.gfnc.CYK.Production");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalCYK.g:121:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalCYK.g:121:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalCYK.g:122:2: iv_ruleInitial= ruleInitial EOF
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
    // InternalCYK.g:128:1: ruleInitial returns [EObject current=null] : ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_right_2_0= ruleLambda ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )* ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_right_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCYK.g:134:2: ( ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_right_2_0= ruleLambda ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )* ) )
            // InternalCYK.g:135:2: ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_right_2_0= ruleLambda ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )* )
            {
            // InternalCYK.g:135:2: ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_right_2_0= ruleLambda ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )* )
            // InternalCYK.g:136:3: ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_right_2_0= ruleLambda ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )*
            {
            // InternalCYK.g:136:3: ( (lv_left_0_0= 'S' ) )
            // InternalCYK.g:137:4: (lv_left_0_0= 'S' )
            {
            // InternalCYK.g:137:4: (lv_left_0_0= 'S' )
            // InternalCYK.g:138:5: lv_left_0_0= 'S'
            {
            lv_left_0_0=(Token)match(input,11,FOLLOW_4); 

            					newLeafNode(lv_left_0_0, grammarAccess.getInitialAccess().getLeftSKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialRule());
            					}
            					setWithLastConsumed(current, "left", lv_left_0_0, "S");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalCYK.g:154:3: ( (lv_right_2_0= ruleLambda ) )
            // InternalCYK.g:155:4: (lv_right_2_0= ruleLambda )
            {
            // InternalCYK.g:155:4: (lv_right_2_0= ruleLambda )
            // InternalCYK.g:156:5: lv_right_2_0= ruleLambda
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getRightLambdaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_right_2_0=ruleLambda();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					add(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.xtext.example.gfnc.CYK.Lambda");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCYK.g:173:3: ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCYK.g:174:4: (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) )
            	    {
            	    // InternalCYK.g:174:4: (otherlv_3= '|' )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==13) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalCYK.g:175:5: otherlv_3= '|'
            	    	    {
            	    	    otherlv_3=(Token)match(input,13,FOLLOW_7); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	    // InternalCYK.g:180:4: ( (lv_right_4_0= ruleRight ) )
            	    // InternalCYK.g:181:5: (lv_right_4_0= ruleRight )
            	    {
            	    // InternalCYK.g:181:5: (lv_right_4_0= ruleRight )
            	    // InternalCYK.g:182:6: lv_right_4_0= ruleRight
            	    {

            	    						newCompositeNode(grammarAccess.getInitialAccess().getRightRightParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_right_4_0=ruleRight();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInitialRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"org.xtext.example.gfnc.CYK.Right");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalCYK.g:204:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalCYK.g:204:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalCYK.g:205:2: iv_ruleLambda= ruleLambda EOF
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
    // InternalCYK.g:211:1: ruleLambda returns [EObject current=null] : ( ( (lv_right_0_0= '_' ) ) | this_Right_1= ruleRight ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token lv_right_0_0=null;
        EObject this_Right_1 = null;



        	enterRule();

        try {
            // InternalCYK.g:217:2: ( ( ( (lv_right_0_0= '_' ) ) | this_Right_1= ruleRight ) )
            // InternalCYK.g:218:2: ( ( (lv_right_0_0= '_' ) ) | this_Right_1= ruleRight )
            {
            // InternalCYK.g:218:2: ( ( (lv_right_0_0= '_' ) ) | this_Right_1= ruleRight )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=15 && LA4_0<=64)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCYK.g:219:3: ( (lv_right_0_0= '_' ) )
                    {
                    // InternalCYK.g:219:3: ( (lv_right_0_0= '_' ) )
                    // InternalCYK.g:220:4: (lv_right_0_0= '_' )
                    {
                    // InternalCYK.g:220:4: (lv_right_0_0= '_' )
                    // InternalCYK.g:221:5: lv_right_0_0= '_'
                    {
                    lv_right_0_0=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(lv_right_0_0, grammarAccess.getLambdaAccess().getRight_Keyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLambdaRule());
                    					}
                    					setWithLastConsumed(current, "right", lv_right_0_0, "_");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:234:3: this_Right_1= ruleRight
                    {

                    			newCompositeNode(grammarAccess.getLambdaAccess().getRightParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Right_1=ruleRight();

                    state._fsp--;


                    			current = this_Right_1;
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
    // InternalCYK.g:246:1: entryRuleProduction returns [EObject current=null] : iv_ruleProduction= ruleProduction EOF ;
    public final EObject entryRuleProduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduction = null;


        try {
            // InternalCYK.g:246:51: (iv_ruleProduction= ruleProduction EOF )
            // InternalCYK.g:247:2: iv_ruleProduction= ruleProduction EOF
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
    // InternalCYK.g:253:1: ruleProduction returns [EObject current=null] : ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_right_2_0= ruleRight ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )* ) ;
    public final EObject ruleProduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCYK.g:259:2: ( ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_right_2_0= ruleRight ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )* ) )
            // InternalCYK.g:260:2: ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_right_2_0= ruleRight ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )* )
            {
            // InternalCYK.g:260:2: ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_right_2_0= ruleRight ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )* )
            // InternalCYK.g:261:3: ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_right_2_0= ruleRight ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )*
            {
            // InternalCYK.g:261:3: ( (lv_left_0_0= ruleNonTerminal ) )
            // InternalCYK.g:262:4: (lv_left_0_0= ruleNonTerminal )
            {
            // InternalCYK.g:262:4: (lv_left_0_0= ruleNonTerminal )
            // InternalCYK.g:263:5: lv_left_0_0= ruleNonTerminal
            {

            					newCompositeNode(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_left_0_0=ruleNonTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.example.gfnc.CYK.NonTerminal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalCYK.g:284:3: ( (lv_right_2_0= ruleRight ) )
            // InternalCYK.g:285:4: (lv_right_2_0= ruleRight )
            {
            // InternalCYK.g:285:4: (lv_right_2_0= ruleRight )
            // InternalCYK.g:286:5: lv_right_2_0= ruleRight
            {

            					newCompositeNode(grammarAccess.getProductionAccess().getRightRightParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_right_2_0=ruleRight();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductionRule());
            					}
            					add(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.xtext.example.gfnc.CYK.Right");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCYK.g:303:3: ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCYK.g:304:4: (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) )
            	    {
            	    // InternalCYK.g:304:4: (otherlv_3= '|' )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==13) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalCYK.g:305:5: otherlv_3= '|'
            	    	    {
            	    	    otherlv_3=(Token)match(input,13,FOLLOW_7); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    // InternalCYK.g:310:4: ( (lv_right_4_0= ruleRight ) )
            	    // InternalCYK.g:311:5: (lv_right_4_0= ruleRight )
            	    {
            	    // InternalCYK.g:311:5: (lv_right_4_0= ruleRight )
            	    // InternalCYK.g:312:6: lv_right_4_0= ruleRight
            	    {

            	    						newCompositeNode(grammarAccess.getProductionAccess().getRightRightParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_right_4_0=ruleRight();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProductionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"org.xtext.example.gfnc.CYK.Right");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalCYK.g:334:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalCYK.g:334:46: (iv_ruleRight= ruleRight EOF )
            // InternalCYK.g:335:2: iv_ruleRight= ruleRight EOF
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
    // InternalCYK.g:341:1: ruleRight returns [EObject current=null] : (this_Simple_0= ruleSimple | this_Binary_1= ruleBinary ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        EObject this_Simple_0 = null;

        EObject this_Binary_1 = null;



        	enterRule();

        try {
            // InternalCYK.g:347:2: ( (this_Simple_0= ruleSimple | this_Binary_1= ruleBinary ) )
            // InternalCYK.g:348:2: (this_Simple_0= ruleSimple | this_Binary_1= ruleBinary )
            {
            // InternalCYK.g:348:2: (this_Simple_0= ruleSimple | this_Binary_1= ruleBinary )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=15 && LA7_0<=39)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=40 && LA7_0<=64)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCYK.g:349:3: this_Simple_0= ruleSimple
                    {

                    			newCompositeNode(grammarAccess.getRightAccess().getSimpleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Simple_0=ruleSimple();

                    state._fsp--;


                    			current = this_Simple_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCYK.g:358:3: this_Binary_1= ruleBinary
                    {

                    			newCompositeNode(grammarAccess.getRightAccess().getBinaryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Binary_1=ruleBinary();

                    state._fsp--;


                    			current = this_Binary_1;
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
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleSimple"
    // InternalCYK.g:370:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalCYK.g:370:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalCYK.g:371:2: iv_ruleSimple= ruleSimple EOF
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
    // InternalCYK.g:377:1: ruleSimple returns [EObject current=null] : ( ( (lv_alpha_0_0= 'a' ) ) | otherlv_1= 'b' | otherlv_2= 'c' | otherlv_3= 'd' | otherlv_4= 'e' | otherlv_5= 'f' | otherlv_6= 'g' | otherlv_7= 'h' | otherlv_8= 'i' | otherlv_9= 'j' | otherlv_10= 'k' | otherlv_11= 'l' | otherlv_12= 'm' | otherlv_13= 'n' | otherlv_14= 'o' | otherlv_15= 'p' | otherlv_16= 'q' | otherlv_17= 'r' | otherlv_18= 's' | otherlv_19= 't' | otherlv_20= 'v' | otherlv_21= 'w' | otherlv_22= 'x' | otherlv_23= 'y' | otherlv_24= 'z' ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        Token lv_alpha_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;


        	enterRule();

        try {
            // InternalCYK.g:383:2: ( ( ( (lv_alpha_0_0= 'a' ) ) | otherlv_1= 'b' | otherlv_2= 'c' | otherlv_3= 'd' | otherlv_4= 'e' | otherlv_5= 'f' | otherlv_6= 'g' | otherlv_7= 'h' | otherlv_8= 'i' | otherlv_9= 'j' | otherlv_10= 'k' | otherlv_11= 'l' | otherlv_12= 'm' | otherlv_13= 'n' | otherlv_14= 'o' | otherlv_15= 'p' | otherlv_16= 'q' | otherlv_17= 'r' | otherlv_18= 's' | otherlv_19= 't' | otherlv_20= 'v' | otherlv_21= 'w' | otherlv_22= 'x' | otherlv_23= 'y' | otherlv_24= 'z' ) )
            // InternalCYK.g:384:2: ( ( (lv_alpha_0_0= 'a' ) ) | otherlv_1= 'b' | otherlv_2= 'c' | otherlv_3= 'd' | otherlv_4= 'e' | otherlv_5= 'f' | otherlv_6= 'g' | otherlv_7= 'h' | otherlv_8= 'i' | otherlv_9= 'j' | otherlv_10= 'k' | otherlv_11= 'l' | otherlv_12= 'm' | otherlv_13= 'n' | otherlv_14= 'o' | otherlv_15= 'p' | otherlv_16= 'q' | otherlv_17= 'r' | otherlv_18= 's' | otherlv_19= 't' | otherlv_20= 'v' | otherlv_21= 'w' | otherlv_22= 'x' | otherlv_23= 'y' | otherlv_24= 'z' )
            {
            // InternalCYK.g:384:2: ( ( (lv_alpha_0_0= 'a' ) ) | otherlv_1= 'b' | otherlv_2= 'c' | otherlv_3= 'd' | otherlv_4= 'e' | otherlv_5= 'f' | otherlv_6= 'g' | otherlv_7= 'h' | otherlv_8= 'i' | otherlv_9= 'j' | otherlv_10= 'k' | otherlv_11= 'l' | otherlv_12= 'm' | otherlv_13= 'n' | otherlv_14= 'o' | otherlv_15= 'p' | otherlv_16= 'q' | otherlv_17= 'r' | otherlv_18= 's' | otherlv_19= 't' | otherlv_20= 'v' | otherlv_21= 'w' | otherlv_22= 'x' | otherlv_23= 'y' | otherlv_24= 'z' )
            int alt8=25;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            case 18:
                {
                alt8=4;
                }
                break;
            case 19:
                {
                alt8=5;
                }
                break;
            case 20:
                {
                alt8=6;
                }
                break;
            case 21:
                {
                alt8=7;
                }
                break;
            case 22:
                {
                alt8=8;
                }
                break;
            case 23:
                {
                alt8=9;
                }
                break;
            case 24:
                {
                alt8=10;
                }
                break;
            case 25:
                {
                alt8=11;
                }
                break;
            case 26:
                {
                alt8=12;
                }
                break;
            case 27:
                {
                alt8=13;
                }
                break;
            case 28:
                {
                alt8=14;
                }
                break;
            case 29:
                {
                alt8=15;
                }
                break;
            case 30:
                {
                alt8=16;
                }
                break;
            case 31:
                {
                alt8=17;
                }
                break;
            case 32:
                {
                alt8=18;
                }
                break;
            case 33:
                {
                alt8=19;
                }
                break;
            case 34:
                {
                alt8=20;
                }
                break;
            case 35:
                {
                alt8=21;
                }
                break;
            case 36:
                {
                alt8=22;
                }
                break;
            case 37:
                {
                alt8=23;
                }
                break;
            case 38:
                {
                alt8=24;
                }
                break;
            case 39:
                {
                alt8=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCYK.g:385:3: ( (lv_alpha_0_0= 'a' ) )
                    {
                    // InternalCYK.g:385:3: ( (lv_alpha_0_0= 'a' ) )
                    // InternalCYK.g:386:4: (lv_alpha_0_0= 'a' )
                    {
                    // InternalCYK.g:386:4: (lv_alpha_0_0= 'a' )
                    // InternalCYK.g:387:5: lv_alpha_0_0= 'a'
                    {
                    lv_alpha_0_0=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_alpha_0_0, grammarAccess.getSimpleAccess().getAlphaAKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "alpha", lv_alpha_0_0, "a");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:400:3: otherlv_1= 'b'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getSimpleAccess().getBKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCYK.g:405:3: otherlv_2= 'c'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_2); 

                    			newLeafNode(otherlv_2, grammarAccess.getSimpleAccess().getCKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalCYK.g:410:3: otherlv_3= 'd'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_2); 

                    			newLeafNode(otherlv_3, grammarAccess.getSimpleAccess().getDKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalCYK.g:415:3: otherlv_4= 'e'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_2); 

                    			newLeafNode(otherlv_4, grammarAccess.getSimpleAccess().getEKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalCYK.g:420:3: otherlv_5= 'f'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_5, grammarAccess.getSimpleAccess().getFKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalCYK.g:425:3: otherlv_6= 'g'
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_2); 

                    			newLeafNode(otherlv_6, grammarAccess.getSimpleAccess().getGKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalCYK.g:430:3: otherlv_7= 'h'
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_2); 

                    			newLeafNode(otherlv_7, grammarAccess.getSimpleAccess().getHKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalCYK.g:435:3: otherlv_8= 'i'
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_2); 

                    			newLeafNode(otherlv_8, grammarAccess.getSimpleAccess().getIKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalCYK.g:440:3: otherlv_9= 'j'
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_2); 

                    			newLeafNode(otherlv_9, grammarAccess.getSimpleAccess().getJKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalCYK.g:445:3: otherlv_10= 'k'
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_2); 

                    			newLeafNode(otherlv_10, grammarAccess.getSimpleAccess().getKKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalCYK.g:450:3: otherlv_11= 'l'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_2); 

                    			newLeafNode(otherlv_11, grammarAccess.getSimpleAccess().getLKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalCYK.g:455:3: otherlv_12= 'm'
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_2); 

                    			newLeafNode(otherlv_12, grammarAccess.getSimpleAccess().getMKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalCYK.g:460:3: otherlv_13= 'n'
                    {
                    otherlv_13=(Token)match(input,28,FOLLOW_2); 

                    			newLeafNode(otherlv_13, grammarAccess.getSimpleAccess().getNKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalCYK.g:465:3: otherlv_14= 'o'
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_2); 

                    			newLeafNode(otherlv_14, grammarAccess.getSimpleAccess().getOKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalCYK.g:470:3: otherlv_15= 'p'
                    {
                    otherlv_15=(Token)match(input,30,FOLLOW_2); 

                    			newLeafNode(otherlv_15, grammarAccess.getSimpleAccess().getPKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalCYK.g:475:3: otherlv_16= 'q'
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_2); 

                    			newLeafNode(otherlv_16, grammarAccess.getSimpleAccess().getQKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalCYK.g:480:3: otherlv_17= 'r'
                    {
                    otherlv_17=(Token)match(input,32,FOLLOW_2); 

                    			newLeafNode(otherlv_17, grammarAccess.getSimpleAccess().getRKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalCYK.g:485:3: otherlv_18= 's'
                    {
                    otherlv_18=(Token)match(input,33,FOLLOW_2); 

                    			newLeafNode(otherlv_18, grammarAccess.getSimpleAccess().getSKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalCYK.g:490:3: otherlv_19= 't'
                    {
                    otherlv_19=(Token)match(input,34,FOLLOW_2); 

                    			newLeafNode(otherlv_19, grammarAccess.getSimpleAccess().getTKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalCYK.g:495:3: otherlv_20= 'v'
                    {
                    otherlv_20=(Token)match(input,35,FOLLOW_2); 

                    			newLeafNode(otherlv_20, grammarAccess.getSimpleAccess().getVKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalCYK.g:500:3: otherlv_21= 'w'
                    {
                    otherlv_21=(Token)match(input,36,FOLLOW_2); 

                    			newLeafNode(otherlv_21, grammarAccess.getSimpleAccess().getWKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalCYK.g:505:3: otherlv_22= 'x'
                    {
                    otherlv_22=(Token)match(input,37,FOLLOW_2); 

                    			newLeafNode(otherlv_22, grammarAccess.getSimpleAccess().getXKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalCYK.g:510:3: otherlv_23= 'y'
                    {
                    otherlv_23=(Token)match(input,38,FOLLOW_2); 

                    			newLeafNode(otherlv_23, grammarAccess.getSimpleAccess().getYKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalCYK.g:515:3: otherlv_24= 'z'
                    {
                    otherlv_24=(Token)match(input,39,FOLLOW_2); 

                    			newLeafNode(otherlv_24, grammarAccess.getSimpleAccess().getZKeyword_24());
                    		

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
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleNonTerminal"
    // InternalCYK.g:523:1: entryRuleNonTerminal returns [EObject current=null] : iv_ruleNonTerminal= ruleNonTerminal EOF ;
    public final EObject entryRuleNonTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonTerminal = null;


        try {
            // InternalCYK.g:523:52: (iv_ruleNonTerminal= ruleNonTerminal EOF )
            // InternalCYK.g:524:2: iv_ruleNonTerminal= ruleNonTerminal EOF
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
    // InternalCYK.g:530:1: ruleNonTerminal returns [EObject current=null] : ( ( (lv_var_0_0= 'A' ) ) | otherlv_1= 'B' | otherlv_2= 'C' | otherlv_3= 'D' | otherlv_4= 'E' | otherlv_5= 'F' | otherlv_6= 'G' | otherlv_7= 'H' | otherlv_8= 'I' | otherlv_9= 'J' | otherlv_10= 'K' | otherlv_11= 'L' | otherlv_12= 'M' | otherlv_13= 'N' | otherlv_14= 'O' | otherlv_15= 'P' | otherlv_16= 'Q' | otherlv_17= 'R' | otherlv_18= 'T' | otherlv_19= 'U' | otherlv_20= 'V' | otherlv_21= 'W' | otherlv_22= 'X' | otherlv_23= 'Y' | otherlv_24= 'Z' ) ;
    public final EObject ruleNonTerminal() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;


        	enterRule();

        try {
            // InternalCYK.g:536:2: ( ( ( (lv_var_0_0= 'A' ) ) | otherlv_1= 'B' | otherlv_2= 'C' | otherlv_3= 'D' | otherlv_4= 'E' | otherlv_5= 'F' | otherlv_6= 'G' | otherlv_7= 'H' | otherlv_8= 'I' | otherlv_9= 'J' | otherlv_10= 'K' | otherlv_11= 'L' | otherlv_12= 'M' | otherlv_13= 'N' | otherlv_14= 'O' | otherlv_15= 'P' | otherlv_16= 'Q' | otherlv_17= 'R' | otherlv_18= 'T' | otherlv_19= 'U' | otherlv_20= 'V' | otherlv_21= 'W' | otherlv_22= 'X' | otherlv_23= 'Y' | otherlv_24= 'Z' ) )
            // InternalCYK.g:537:2: ( ( (lv_var_0_0= 'A' ) ) | otherlv_1= 'B' | otherlv_2= 'C' | otherlv_3= 'D' | otherlv_4= 'E' | otherlv_5= 'F' | otherlv_6= 'G' | otherlv_7= 'H' | otherlv_8= 'I' | otherlv_9= 'J' | otherlv_10= 'K' | otherlv_11= 'L' | otherlv_12= 'M' | otherlv_13= 'N' | otherlv_14= 'O' | otherlv_15= 'P' | otherlv_16= 'Q' | otherlv_17= 'R' | otherlv_18= 'T' | otherlv_19= 'U' | otherlv_20= 'V' | otherlv_21= 'W' | otherlv_22= 'X' | otherlv_23= 'Y' | otherlv_24= 'Z' )
            {
            // InternalCYK.g:537:2: ( ( (lv_var_0_0= 'A' ) ) | otherlv_1= 'B' | otherlv_2= 'C' | otherlv_3= 'D' | otherlv_4= 'E' | otherlv_5= 'F' | otherlv_6= 'G' | otherlv_7= 'H' | otherlv_8= 'I' | otherlv_9= 'J' | otherlv_10= 'K' | otherlv_11= 'L' | otherlv_12= 'M' | otherlv_13= 'N' | otherlv_14= 'O' | otherlv_15= 'P' | otherlv_16= 'Q' | otherlv_17= 'R' | otherlv_18= 'T' | otherlv_19= 'U' | otherlv_20= 'V' | otherlv_21= 'W' | otherlv_22= 'X' | otherlv_23= 'Y' | otherlv_24= 'Z' )
            int alt9=25;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt9=1;
                }
                break;
            case 41:
                {
                alt9=2;
                }
                break;
            case 42:
                {
                alt9=3;
                }
                break;
            case 43:
                {
                alt9=4;
                }
                break;
            case 44:
                {
                alt9=5;
                }
                break;
            case 45:
                {
                alt9=6;
                }
                break;
            case 46:
                {
                alt9=7;
                }
                break;
            case 47:
                {
                alt9=8;
                }
                break;
            case 48:
                {
                alt9=9;
                }
                break;
            case 49:
                {
                alt9=10;
                }
                break;
            case 50:
                {
                alt9=11;
                }
                break;
            case 51:
                {
                alt9=12;
                }
                break;
            case 52:
                {
                alt9=13;
                }
                break;
            case 53:
                {
                alt9=14;
                }
                break;
            case 54:
                {
                alt9=15;
                }
                break;
            case 55:
                {
                alt9=16;
                }
                break;
            case 56:
                {
                alt9=17;
                }
                break;
            case 57:
                {
                alt9=18;
                }
                break;
            case 58:
                {
                alt9=19;
                }
                break;
            case 59:
                {
                alt9=20;
                }
                break;
            case 60:
                {
                alt9=21;
                }
                break;
            case 61:
                {
                alt9=22;
                }
                break;
            case 62:
                {
                alt9=23;
                }
                break;
            case 63:
                {
                alt9=24;
                }
                break;
            case 64:
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
                    // InternalCYK.g:538:3: ( (lv_var_0_0= 'A' ) )
                    {
                    // InternalCYK.g:538:3: ( (lv_var_0_0= 'A' ) )
                    // InternalCYK.g:539:4: (lv_var_0_0= 'A' )
                    {
                    // InternalCYK.g:539:4: (lv_var_0_0= 'A' )
                    // InternalCYK.g:540:5: lv_var_0_0= 'A'
                    {
                    lv_var_0_0=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_var_0_0, grammarAccess.getNonTerminalAccess().getVarAKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNonTerminalRule());
                    					}
                    					setWithLastConsumed(current, "var", lv_var_0_0, "A");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:553:3: otherlv_1= 'B'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getNonTerminalAccess().getBKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCYK.g:558:3: otherlv_2= 'C'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_2); 

                    			newLeafNode(otherlv_2, grammarAccess.getNonTerminalAccess().getCKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalCYK.g:563:3: otherlv_3= 'D'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_2); 

                    			newLeafNode(otherlv_3, grammarAccess.getNonTerminalAccess().getDKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalCYK.g:568:3: otherlv_4= 'E'
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_2); 

                    			newLeafNode(otherlv_4, grammarAccess.getNonTerminalAccess().getEKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalCYK.g:573:3: otherlv_5= 'F'
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_2); 

                    			newLeafNode(otherlv_5, grammarAccess.getNonTerminalAccess().getFKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalCYK.g:578:3: otherlv_6= 'G'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_2); 

                    			newLeafNode(otherlv_6, grammarAccess.getNonTerminalAccess().getGKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalCYK.g:583:3: otherlv_7= 'H'
                    {
                    otherlv_7=(Token)match(input,47,FOLLOW_2); 

                    			newLeafNode(otherlv_7, grammarAccess.getNonTerminalAccess().getHKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalCYK.g:588:3: otherlv_8= 'I'
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_2); 

                    			newLeafNode(otherlv_8, grammarAccess.getNonTerminalAccess().getIKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalCYK.g:593:3: otherlv_9= 'J'
                    {
                    otherlv_9=(Token)match(input,49,FOLLOW_2); 

                    			newLeafNode(otherlv_9, grammarAccess.getNonTerminalAccess().getJKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalCYK.g:598:3: otherlv_10= 'K'
                    {
                    otherlv_10=(Token)match(input,50,FOLLOW_2); 

                    			newLeafNode(otherlv_10, grammarAccess.getNonTerminalAccess().getKKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalCYK.g:603:3: otherlv_11= 'L'
                    {
                    otherlv_11=(Token)match(input,51,FOLLOW_2); 

                    			newLeafNode(otherlv_11, grammarAccess.getNonTerminalAccess().getLKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalCYK.g:608:3: otherlv_12= 'M'
                    {
                    otherlv_12=(Token)match(input,52,FOLLOW_2); 

                    			newLeafNode(otherlv_12, grammarAccess.getNonTerminalAccess().getMKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalCYK.g:613:3: otherlv_13= 'N'
                    {
                    otherlv_13=(Token)match(input,53,FOLLOW_2); 

                    			newLeafNode(otherlv_13, grammarAccess.getNonTerminalAccess().getNKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalCYK.g:618:3: otherlv_14= 'O'
                    {
                    otherlv_14=(Token)match(input,54,FOLLOW_2); 

                    			newLeafNode(otherlv_14, grammarAccess.getNonTerminalAccess().getOKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalCYK.g:623:3: otherlv_15= 'P'
                    {
                    otherlv_15=(Token)match(input,55,FOLLOW_2); 

                    			newLeafNode(otherlv_15, grammarAccess.getNonTerminalAccess().getPKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalCYK.g:628:3: otherlv_16= 'Q'
                    {
                    otherlv_16=(Token)match(input,56,FOLLOW_2); 

                    			newLeafNode(otherlv_16, grammarAccess.getNonTerminalAccess().getQKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalCYK.g:633:3: otherlv_17= 'R'
                    {
                    otherlv_17=(Token)match(input,57,FOLLOW_2); 

                    			newLeafNode(otherlv_17, grammarAccess.getNonTerminalAccess().getRKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalCYK.g:638:3: otherlv_18= 'T'
                    {
                    otherlv_18=(Token)match(input,58,FOLLOW_2); 

                    			newLeafNode(otherlv_18, grammarAccess.getNonTerminalAccess().getTKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalCYK.g:643:3: otherlv_19= 'U'
                    {
                    otherlv_19=(Token)match(input,59,FOLLOW_2); 

                    			newLeafNode(otherlv_19, grammarAccess.getNonTerminalAccess().getUKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalCYK.g:648:3: otherlv_20= 'V'
                    {
                    otherlv_20=(Token)match(input,60,FOLLOW_2); 

                    			newLeafNode(otherlv_20, grammarAccess.getNonTerminalAccess().getVKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalCYK.g:653:3: otherlv_21= 'W'
                    {
                    otherlv_21=(Token)match(input,61,FOLLOW_2); 

                    			newLeafNode(otherlv_21, grammarAccess.getNonTerminalAccess().getWKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalCYK.g:658:3: otherlv_22= 'X'
                    {
                    otherlv_22=(Token)match(input,62,FOLLOW_2); 

                    			newLeafNode(otherlv_22, grammarAccess.getNonTerminalAccess().getXKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalCYK.g:663:3: otherlv_23= 'Y'
                    {
                    otherlv_23=(Token)match(input,63,FOLLOW_2); 

                    			newLeafNode(otherlv_23, grammarAccess.getNonTerminalAccess().getYKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalCYK.g:668:3: otherlv_24= 'Z'
                    {
                    otherlv_24=(Token)match(input,64,FOLLOW_2); 

                    			newLeafNode(otherlv_24, grammarAccess.getNonTerminalAccess().getZKeyword_24());
                    		

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
    // $ANTLR end "ruleNonTerminal"


    // $ANTLR start "entryRuleBinary"
    // InternalCYK.g:676:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // InternalCYK.g:676:47: (iv_ruleBinary= ruleBinary EOF )
            // InternalCYK.g:677:2: iv_ruleBinary= ruleBinary EOF
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
    // InternalCYK.g:683:1: ruleBinary returns [EObject current=null] : ( ( (lv_first_0_0= ruleNonTerminal ) ) ( (lv_second_1_0= ruleNonTerminal ) ) ) ;
    public final EObject ruleBinary() throws RecognitionException {
        EObject current = null;

        EObject lv_first_0_0 = null;

        EObject lv_second_1_0 = null;



        	enterRule();

        try {
            // InternalCYK.g:689:2: ( ( ( (lv_first_0_0= ruleNonTerminal ) ) ( (lv_second_1_0= ruleNonTerminal ) ) ) )
            // InternalCYK.g:690:2: ( ( (lv_first_0_0= ruleNonTerminal ) ) ( (lv_second_1_0= ruleNonTerminal ) ) )
            {
            // InternalCYK.g:690:2: ( ( (lv_first_0_0= ruleNonTerminal ) ) ( (lv_second_1_0= ruleNonTerminal ) ) )
            // InternalCYK.g:691:3: ( (lv_first_0_0= ruleNonTerminal ) ) ( (lv_second_1_0= ruleNonTerminal ) )
            {
            // InternalCYK.g:691:3: ( (lv_first_0_0= ruleNonTerminal ) )
            // InternalCYK.g:692:4: (lv_first_0_0= ruleNonTerminal )
            {
            // InternalCYK.g:692:4: (lv_first_0_0= ruleNonTerminal )
            // InternalCYK.g:693:5: lv_first_0_0= ruleNonTerminal
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_first_0_0=ruleNonTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"first",
            						lv_first_0_0,
            						"org.xtext.example.gfnc.CYK.NonTerminal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCYK.g:710:3: ( (lv_second_1_0= ruleNonTerminal ) )
            // InternalCYK.g:711:4: (lv_second_1_0= ruleNonTerminal )
            {
            // InternalCYK.g:711:4: (lv_second_1_0= ruleNonTerminal )
            // InternalCYK.g:712:5: lv_second_1_0= ruleNonTerminal
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_second_1_0=ruleNonTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"second",
            						lv_second_1_0,
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFF0000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xFFFFFFFFFFFFC000L,0x0000000000000001L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xFFFFFFFFFFFFE000L,0x0000000000000001L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xFFFFFF0000000000L,0x0000000000000001L});

}