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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'W'", "':'", "'G'", "'->'", "'|'", "'_'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'v'", "'w'", "'x'", "'y'", "'z'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'X'", "'Y'", "'Z'"
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
    public static final int T__65=65;
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
    // InternalCYK.g:71:1: ruleGFNC returns [EObject current=null] : (otherlv_0= 'W' otherlv_1= ':' ( (lv_w_2_0= ruleTerminal ) ) ( (lv_w_3_0= ruleTerminal ) )* otherlv_4= 'G' otherlv_5= ':' ( (lv_productions_6_0= ruleProduction ) )* ) ;
    public final EObject ruleGFNC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_w_2_0 = null;

        EObject lv_w_3_0 = null;

        EObject lv_productions_6_0 = null;



        	enterRule();

        try {
            // InternalCYK.g:77:2: ( (otherlv_0= 'W' otherlv_1= ':' ( (lv_w_2_0= ruleTerminal ) ) ( (lv_w_3_0= ruleTerminal ) )* otherlv_4= 'G' otherlv_5= ':' ( (lv_productions_6_0= ruleProduction ) )* ) )
            // InternalCYK.g:78:2: (otherlv_0= 'W' otherlv_1= ':' ( (lv_w_2_0= ruleTerminal ) ) ( (lv_w_3_0= ruleTerminal ) )* otherlv_4= 'G' otherlv_5= ':' ( (lv_productions_6_0= ruleProduction ) )* )
            {
            // InternalCYK.g:78:2: (otherlv_0= 'W' otherlv_1= ':' ( (lv_w_2_0= ruleTerminal ) ) ( (lv_w_3_0= ruleTerminal ) )* otherlv_4= 'G' otherlv_5= ':' ( (lv_productions_6_0= ruleProduction ) )* )
            // InternalCYK.g:79:3: otherlv_0= 'W' otherlv_1= ':' ( (lv_w_2_0= ruleTerminal ) ) ( (lv_w_3_0= ruleTerminal ) )* otherlv_4= 'G' otherlv_5= ':' ( (lv_productions_6_0= ruleProduction ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGFNCAccess().getWKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGFNCAccess().getColonKeyword_1());
            		
            // InternalCYK.g:87:3: ( (lv_w_2_0= ruleTerminal ) )
            // InternalCYK.g:88:4: (lv_w_2_0= ruleTerminal )
            {
            // InternalCYK.g:88:4: (lv_w_2_0= ruleTerminal )
            // InternalCYK.g:89:5: lv_w_2_0= ruleTerminal
            {

            					newCompositeNode(grammarAccess.getGFNCAccess().getWTerminalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_w_2_0=ruleTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGFNCRule());
            					}
            					add(
            						current,
            						"w",
            						lv_w_2_0,
            						"org.xtext.example.gfnc.CYK.Terminal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCYK.g:106:3: ( (lv_w_3_0= ruleTerminal ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=41)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCYK.g:107:4: (lv_w_3_0= ruleTerminal )
            	    {
            	    // InternalCYK.g:107:4: (lv_w_3_0= ruleTerminal )
            	    // InternalCYK.g:108:5: lv_w_3_0= ruleTerminal
            	    {

            	    					newCompositeNode(grammarAccess.getGFNCAccess().getWTerminalParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_w_3_0=ruleTerminal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGFNCRule());
            	    					}
            	    					add(
            	    						current,
            	    						"w",
            	    						lv_w_3_0,
            	    						"org.xtext.example.gfnc.CYK.Terminal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getGFNCAccess().getGKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getGFNCAccess().getColonKeyword_5());
            		
            // InternalCYK.g:133:3: ( (lv_productions_6_0= ruleProduction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==13||(LA2_0>=42 && LA2_0<=65)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCYK.g:134:4: (lv_productions_6_0= ruleProduction )
            	    {
            	    // InternalCYK.g:134:4: (lv_productions_6_0= ruleProduction )
            	    // InternalCYK.g:135:5: lv_productions_6_0= ruleProduction
            	    {

            	    					newCompositeNode(grammarAccess.getGFNCAccess().getProductionsProductionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_productions_6_0=ruleProduction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGFNCRule());
            	    					}
            	    					add(
            	    						current,
            	    						"productions",
            	    						lv_productions_6_0,
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


    // $ANTLR start "entryRuleProduction"
    // InternalCYK.g:156:1: entryRuleProduction returns [EObject current=null] : iv_ruleProduction= ruleProduction EOF ;
    public final EObject entryRuleProduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduction = null;


        try {
            // InternalCYK.g:156:51: (iv_ruleProduction= ruleProduction EOF )
            // InternalCYK.g:157:2: iv_ruleProduction= ruleProduction EOF
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
    // InternalCYK.g:163:1: ruleProduction returns [EObject current=null] : ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_right_2_0= ruleRight ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )* ) ;
    public final EObject ruleProduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCYK.g:169:2: ( ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_right_2_0= ruleRight ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )* ) )
            // InternalCYK.g:170:2: ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_right_2_0= ruleRight ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )* )
            {
            // InternalCYK.g:170:2: ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_right_2_0= ruleRight ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )* )
            // InternalCYK.g:171:3: ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_right_2_0= ruleRight ) ) ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )*
            {
            // InternalCYK.g:171:3: ( (lv_left_0_0= ruleNonTerminal ) )
            // InternalCYK.g:172:4: (lv_left_0_0= ruleNonTerminal )
            {
            // InternalCYK.g:172:4: (lv_left_0_0= ruleNonTerminal )
            // InternalCYK.g:173:5: lv_left_0_0= ruleNonTerminal
            {

            					newCompositeNode(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalCYK.g:194:3: ( (lv_right_2_0= ruleRight ) )
            // InternalCYK.g:195:4: (lv_right_2_0= ruleRight )
            {
            // InternalCYK.g:195:4: (lv_right_2_0= ruleRight )
            // InternalCYK.g:196:5: lv_right_2_0= ruleRight
            {

            					newCompositeNode(grammarAccess.getProductionAccess().getRightRightParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalCYK.g:213:3: ( (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCYK.g:214:4: (otherlv_3= '|' )+ ( (lv_right_4_0= ruleRight ) )
            	    {
            	    // InternalCYK.g:214:4: (otherlv_3= '|' )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==15) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalCYK.g:215:5: otherlv_3= '|'
            	    	    {
            	    	    otherlv_3=(Token)match(input,15,FOLLOW_10); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0());
            	    	    				

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

            	    // InternalCYK.g:220:4: ( (lv_right_4_0= ruleRight ) )
            	    // InternalCYK.g:221:5: (lv_right_4_0= ruleRight )
            	    {
            	    // InternalCYK.g:221:5: (lv_right_4_0= ruleRight )
            	    // InternalCYK.g:222:6: lv_right_4_0= ruleRight
            	    {

            	    						newCompositeNode(grammarAccess.getProductionAccess().getRightRightParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
    // $ANTLR end "ruleProduction"


    // $ANTLR start "entryRuleRight"
    // InternalCYK.g:244:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalCYK.g:244:46: (iv_ruleRight= ruleRight EOF )
            // InternalCYK.g:245:2: iv_ruleRight= ruleRight EOF
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
    // InternalCYK.g:251:1: ruleRight returns [EObject current=null] : ( ( (lv_simple_0_0= ruleTerminal ) ) | ( (lv_binary_1_0= ruleBinary ) ) | ( (lv_lambda_2_0= '_' ) ) ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token lv_lambda_2_0=null;
        EObject lv_simple_0_0 = null;

        EObject lv_binary_1_0 = null;



        	enterRule();

        try {
            // InternalCYK.g:257:2: ( ( ( (lv_simple_0_0= ruleTerminal ) ) | ( (lv_binary_1_0= ruleBinary ) ) | ( (lv_lambda_2_0= '_' ) ) ) )
            // InternalCYK.g:258:2: ( ( (lv_simple_0_0= ruleTerminal ) ) | ( (lv_binary_1_0= ruleBinary ) ) | ( (lv_lambda_2_0= '_' ) ) )
            {
            // InternalCYK.g:258:2: ( ( (lv_simple_0_0= ruleTerminal ) ) | ( (lv_binary_1_0= ruleBinary ) ) | ( (lv_lambda_2_0= '_' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt5=1;
                }
                break;
            case 11:
            case 13:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCYK.g:259:3: ( (lv_simple_0_0= ruleTerminal ) )
                    {
                    // InternalCYK.g:259:3: ( (lv_simple_0_0= ruleTerminal ) )
                    // InternalCYK.g:260:4: (lv_simple_0_0= ruleTerminal )
                    {
                    // InternalCYK.g:260:4: (lv_simple_0_0= ruleTerminal )
                    // InternalCYK.g:261:5: lv_simple_0_0= ruleTerminal
                    {

                    					newCompositeNode(grammarAccess.getRightAccess().getSimpleTerminalParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simple_0_0=ruleTerminal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRightRule());
                    					}
                    					set(
                    						current,
                    						"simple",
                    						lv_simple_0_0,
                    						"org.xtext.example.gfnc.CYK.Terminal");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:279:3: ( (lv_binary_1_0= ruleBinary ) )
                    {
                    // InternalCYK.g:279:3: ( (lv_binary_1_0= ruleBinary ) )
                    // InternalCYK.g:280:4: (lv_binary_1_0= ruleBinary )
                    {
                    // InternalCYK.g:280:4: (lv_binary_1_0= ruleBinary )
                    // InternalCYK.g:281:5: lv_binary_1_0= ruleBinary
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
                case 3 :
                    // InternalCYK.g:299:3: ( (lv_lambda_2_0= '_' ) )
                    {
                    // InternalCYK.g:299:3: ( (lv_lambda_2_0= '_' ) )
                    // InternalCYK.g:300:4: (lv_lambda_2_0= '_' )
                    {
                    // InternalCYK.g:300:4: (lv_lambda_2_0= '_' )
                    // InternalCYK.g:301:5: lv_lambda_2_0= '_'
                    {
                    lv_lambda_2_0=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_lambda_2_0, grammarAccess.getRightAccess().getLambda_Keyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRightRule());
                    					}
                    					setWithLastConsumed(current, "lambda", lv_lambda_2_0, "_");
                    				

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


    // $ANTLR start "entryRuleTerminal"
    // InternalCYK.g:317:1: entryRuleTerminal returns [EObject current=null] : iv_ruleTerminal= ruleTerminal EOF ;
    public final EObject entryRuleTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminal = null;


        try {
            // InternalCYK.g:317:49: (iv_ruleTerminal= ruleTerminal EOF )
            // InternalCYK.g:318:2: iv_ruleTerminal= ruleTerminal EOF
            {
             newCompositeNode(grammarAccess.getTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminal=ruleTerminal();

            state._fsp--;

             current =iv_ruleTerminal; 
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
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // InternalCYK.g:324:1: ruleTerminal returns [EObject current=null] : ( () ( ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) ) ) ) ;
    public final EObject ruleTerminal() throws RecognitionException {
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
            // InternalCYK.g:330:2: ( ( () ( ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) ) ) ) )
            // InternalCYK.g:331:2: ( () ( ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) ) ) )
            {
            // InternalCYK.g:331:2: ( () ( ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) ) ) )
            // InternalCYK.g:332:3: () ( ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) ) )
            {
            // InternalCYK.g:332:3: ()
            // InternalCYK.g:333:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTerminalAccess().getTerminalAction_0(),
            					current);
            			

            }

            // InternalCYK.g:339:3: ( ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) ) )
            // InternalCYK.g:340:4: ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) )
            {
            // InternalCYK.g:340:4: ( (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' ) )
            // InternalCYK.g:341:5: (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' )
            {
            // InternalCYK.g:341:5: (lv_terminals_1_1= 'a' | lv_terminals_1_2= 'b' | lv_terminals_1_3= 'c' | lv_terminals_1_4= 'd' | lv_terminals_1_5= 'e' | lv_terminals_1_6= 'f' | lv_terminals_1_7= 'g' | lv_terminals_1_8= 'h' | lv_terminals_1_9= 'i' | lv_terminals_1_10= 'j' | lv_terminals_1_11= 'k' | lv_terminals_1_12= 'l' | lv_terminals_1_13= 'm' | lv_terminals_1_14= 'n' | lv_terminals_1_15= 'o' | lv_terminals_1_16= 'p' | lv_terminals_1_17= 'q' | lv_terminals_1_18= 'r' | lv_terminals_1_19= 's' | lv_terminals_1_20= 't' | lv_terminals_1_21= 'v' | lv_terminals_1_22= 'w' | lv_terminals_1_23= 'x' | lv_terminals_1_24= 'y' | lv_terminals_1_25= 'z' )
            int alt6=25;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 21:
                {
                alt6=5;
                }
                break;
            case 22:
                {
                alt6=6;
                }
                break;
            case 23:
                {
                alt6=7;
                }
                break;
            case 24:
                {
                alt6=8;
                }
                break;
            case 25:
                {
                alt6=9;
                }
                break;
            case 26:
                {
                alt6=10;
                }
                break;
            case 27:
                {
                alt6=11;
                }
                break;
            case 28:
                {
                alt6=12;
                }
                break;
            case 29:
                {
                alt6=13;
                }
                break;
            case 30:
                {
                alt6=14;
                }
                break;
            case 31:
                {
                alt6=15;
                }
                break;
            case 32:
                {
                alt6=16;
                }
                break;
            case 33:
                {
                alt6=17;
                }
                break;
            case 34:
                {
                alt6=18;
                }
                break;
            case 35:
                {
                alt6=19;
                }
                break;
            case 36:
                {
                alt6=20;
                }
                break;
            case 37:
                {
                alt6=21;
                }
                break;
            case 38:
                {
                alt6=22;
                }
                break;
            case 39:
                {
                alt6=23;
                }
                break;
            case 40:
                {
                alt6=24;
                }
                break;
            case 41:
                {
                alt6=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCYK.g:342:6: lv_terminals_1_1= 'a'
                    {
                    lv_terminals_1_1=(Token)match(input,17,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_1, grammarAccess.getTerminalAccess().getTerminalsAKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCYK.g:353:6: lv_terminals_1_2= 'b'
                    {
                    lv_terminals_1_2=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_2, grammarAccess.getTerminalAccess().getTerminalsBKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalCYK.g:364:6: lv_terminals_1_3= 'c'
                    {
                    lv_terminals_1_3=(Token)match(input,19,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_3, grammarAccess.getTerminalAccess().getTerminalsCKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalCYK.g:375:6: lv_terminals_1_4= 'd'
                    {
                    lv_terminals_1_4=(Token)match(input,20,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_4, grammarAccess.getTerminalAccess().getTerminalsDKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalCYK.g:386:6: lv_terminals_1_5= 'e'
                    {
                    lv_terminals_1_5=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_5, grammarAccess.getTerminalAccess().getTerminalsEKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalCYK.g:397:6: lv_terminals_1_6= 'f'
                    {
                    lv_terminals_1_6=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_6, grammarAccess.getTerminalAccess().getTerminalsFKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalCYK.g:408:6: lv_terminals_1_7= 'g'
                    {
                    lv_terminals_1_7=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_7, grammarAccess.getTerminalAccess().getTerminalsGKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalCYK.g:419:6: lv_terminals_1_8= 'h'
                    {
                    lv_terminals_1_8=(Token)match(input,24,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_8, grammarAccess.getTerminalAccess().getTerminalsHKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalCYK.g:430:6: lv_terminals_1_9= 'i'
                    {
                    lv_terminals_1_9=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_9, grammarAccess.getTerminalAccess().getTerminalsIKeyword_1_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalCYK.g:441:6: lv_terminals_1_10= 'j'
                    {
                    lv_terminals_1_10=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_10, grammarAccess.getTerminalAccess().getTerminalsJKeyword_1_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalCYK.g:452:6: lv_terminals_1_11= 'k'
                    {
                    lv_terminals_1_11=(Token)match(input,27,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_11, grammarAccess.getTerminalAccess().getTerminalsKKeyword_1_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalCYK.g:463:6: lv_terminals_1_12= 'l'
                    {
                    lv_terminals_1_12=(Token)match(input,28,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_12, grammarAccess.getTerminalAccess().getTerminalsLKeyword_1_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalCYK.g:474:6: lv_terminals_1_13= 'm'
                    {
                    lv_terminals_1_13=(Token)match(input,29,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_13, grammarAccess.getTerminalAccess().getTerminalsMKeyword_1_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_13, null);
                    					

                    }
                    break;
                case 14 :
                    // InternalCYK.g:485:6: lv_terminals_1_14= 'n'
                    {
                    lv_terminals_1_14=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_14, grammarAccess.getTerminalAccess().getTerminalsNKeyword_1_0_13());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_14, null);
                    					

                    }
                    break;
                case 15 :
                    // InternalCYK.g:496:6: lv_terminals_1_15= 'o'
                    {
                    lv_terminals_1_15=(Token)match(input,31,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_15, grammarAccess.getTerminalAccess().getTerminalsOKeyword_1_0_14());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_15, null);
                    					

                    }
                    break;
                case 16 :
                    // InternalCYK.g:507:6: lv_terminals_1_16= 'p'
                    {
                    lv_terminals_1_16=(Token)match(input,32,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_16, grammarAccess.getTerminalAccess().getTerminalsPKeyword_1_0_15());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_16, null);
                    					

                    }
                    break;
                case 17 :
                    // InternalCYK.g:518:6: lv_terminals_1_17= 'q'
                    {
                    lv_terminals_1_17=(Token)match(input,33,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_17, grammarAccess.getTerminalAccess().getTerminalsQKeyword_1_0_16());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_17, null);
                    					

                    }
                    break;
                case 18 :
                    // InternalCYK.g:529:6: lv_terminals_1_18= 'r'
                    {
                    lv_terminals_1_18=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_18, grammarAccess.getTerminalAccess().getTerminalsRKeyword_1_0_17());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_18, null);
                    					

                    }
                    break;
                case 19 :
                    // InternalCYK.g:540:6: lv_terminals_1_19= 's'
                    {
                    lv_terminals_1_19=(Token)match(input,35,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_19, grammarAccess.getTerminalAccess().getTerminalsSKeyword_1_0_18());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_19, null);
                    					

                    }
                    break;
                case 20 :
                    // InternalCYK.g:551:6: lv_terminals_1_20= 't'
                    {
                    lv_terminals_1_20=(Token)match(input,36,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_20, grammarAccess.getTerminalAccess().getTerminalsTKeyword_1_0_19());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_20, null);
                    					

                    }
                    break;
                case 21 :
                    // InternalCYK.g:562:6: lv_terminals_1_21= 'v'
                    {
                    lv_terminals_1_21=(Token)match(input,37,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_21, grammarAccess.getTerminalAccess().getTerminalsVKeyword_1_0_20());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_21, null);
                    					

                    }
                    break;
                case 22 :
                    // InternalCYK.g:573:6: lv_terminals_1_22= 'w'
                    {
                    lv_terminals_1_22=(Token)match(input,38,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_22, grammarAccess.getTerminalAccess().getTerminalsWKeyword_1_0_21());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_22, null);
                    					

                    }
                    break;
                case 23 :
                    // InternalCYK.g:584:6: lv_terminals_1_23= 'x'
                    {
                    lv_terminals_1_23=(Token)match(input,39,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_23, grammarAccess.getTerminalAccess().getTerminalsXKeyword_1_0_22());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_23, null);
                    					

                    }
                    break;
                case 24 :
                    // InternalCYK.g:595:6: lv_terminals_1_24= 'y'
                    {
                    lv_terminals_1_24=(Token)match(input,40,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_24, grammarAccess.getTerminalAccess().getTerminalsYKeyword_1_0_23());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(current, "terminals", lv_terminals_1_24, null);
                    					

                    }
                    break;
                case 25 :
                    // InternalCYK.g:606:6: lv_terminals_1_25= 'z'
                    {
                    lv_terminals_1_25=(Token)match(input,41,FOLLOW_2); 

                    						newLeafNode(lv_terminals_1_25, grammarAccess.getTerminalAccess().getTerminalsZKeyword_1_0_24());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
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
    // $ANTLR end "ruleTerminal"


    // $ANTLR start "entryRuleNonTerminal"
    // InternalCYK.g:623:1: entryRuleNonTerminal returns [EObject current=null] : iv_ruleNonTerminal= ruleNonTerminal EOF ;
    public final EObject entryRuleNonTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonTerminal = null;


        try {
            // InternalCYK.g:623:52: (iv_ruleNonTerminal= ruleNonTerminal EOF )
            // InternalCYK.g:624:2: iv_ruleNonTerminal= ruleNonTerminal EOF
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
    // InternalCYK.g:630:1: ruleNonTerminal returns [EObject current=null] : ( () ( ( (lv_nonTerminals_1_1= 'A' | lv_nonTerminals_1_2= 'B' | lv_nonTerminals_1_3= 'C' | lv_nonTerminals_1_4= 'D' | lv_nonTerminals_1_5= 'E' | lv_nonTerminals_1_6= 'F' | lv_nonTerminals_1_7= 'G' | lv_nonTerminals_1_8= 'H' | lv_nonTerminals_1_9= 'I' | lv_nonTerminals_1_10= 'J' | lv_nonTerminals_1_11= 'K' | lv_nonTerminals_1_12= 'L' | lv_nonTerminals_1_13= 'M' | lv_nonTerminals_1_14= 'N' | lv_nonTerminals_1_15= 'O' | lv_nonTerminals_1_16= 'P' | lv_nonTerminals_1_17= 'Q' | lv_nonTerminals_1_18= 'R' | lv_nonTerminals_1_19= 'S' | lv_nonTerminals_1_20= 'T' | lv_nonTerminals_1_21= 'U' | lv_nonTerminals_1_22= 'V' | lv_nonTerminals_1_23= 'W' | lv_nonTerminals_1_24= 'X' | lv_nonTerminals_1_25= 'Y' | lv_nonTerminals_1_26= 'Z' ) ) ) ) ;
    public final EObject ruleNonTerminal() throws RecognitionException {
        EObject current = null;

        Token lv_nonTerminals_1_1=null;
        Token lv_nonTerminals_1_2=null;
        Token lv_nonTerminals_1_3=null;
        Token lv_nonTerminals_1_4=null;
        Token lv_nonTerminals_1_5=null;
        Token lv_nonTerminals_1_6=null;
        Token lv_nonTerminals_1_7=null;
        Token lv_nonTerminals_1_8=null;
        Token lv_nonTerminals_1_9=null;
        Token lv_nonTerminals_1_10=null;
        Token lv_nonTerminals_1_11=null;
        Token lv_nonTerminals_1_12=null;
        Token lv_nonTerminals_1_13=null;
        Token lv_nonTerminals_1_14=null;
        Token lv_nonTerminals_1_15=null;
        Token lv_nonTerminals_1_16=null;
        Token lv_nonTerminals_1_17=null;
        Token lv_nonTerminals_1_18=null;
        Token lv_nonTerminals_1_19=null;
        Token lv_nonTerminals_1_20=null;
        Token lv_nonTerminals_1_21=null;
        Token lv_nonTerminals_1_22=null;
        Token lv_nonTerminals_1_23=null;
        Token lv_nonTerminals_1_24=null;
        Token lv_nonTerminals_1_25=null;
        Token lv_nonTerminals_1_26=null;


        	enterRule();

        try {
            // InternalCYK.g:636:2: ( ( () ( ( (lv_nonTerminals_1_1= 'A' | lv_nonTerminals_1_2= 'B' | lv_nonTerminals_1_3= 'C' | lv_nonTerminals_1_4= 'D' | lv_nonTerminals_1_5= 'E' | lv_nonTerminals_1_6= 'F' | lv_nonTerminals_1_7= 'G' | lv_nonTerminals_1_8= 'H' | lv_nonTerminals_1_9= 'I' | lv_nonTerminals_1_10= 'J' | lv_nonTerminals_1_11= 'K' | lv_nonTerminals_1_12= 'L' | lv_nonTerminals_1_13= 'M' | lv_nonTerminals_1_14= 'N' | lv_nonTerminals_1_15= 'O' | lv_nonTerminals_1_16= 'P' | lv_nonTerminals_1_17= 'Q' | lv_nonTerminals_1_18= 'R' | lv_nonTerminals_1_19= 'S' | lv_nonTerminals_1_20= 'T' | lv_nonTerminals_1_21= 'U' | lv_nonTerminals_1_22= 'V' | lv_nonTerminals_1_23= 'W' | lv_nonTerminals_1_24= 'X' | lv_nonTerminals_1_25= 'Y' | lv_nonTerminals_1_26= 'Z' ) ) ) ) )
            // InternalCYK.g:637:2: ( () ( ( (lv_nonTerminals_1_1= 'A' | lv_nonTerminals_1_2= 'B' | lv_nonTerminals_1_3= 'C' | lv_nonTerminals_1_4= 'D' | lv_nonTerminals_1_5= 'E' | lv_nonTerminals_1_6= 'F' | lv_nonTerminals_1_7= 'G' | lv_nonTerminals_1_8= 'H' | lv_nonTerminals_1_9= 'I' | lv_nonTerminals_1_10= 'J' | lv_nonTerminals_1_11= 'K' | lv_nonTerminals_1_12= 'L' | lv_nonTerminals_1_13= 'M' | lv_nonTerminals_1_14= 'N' | lv_nonTerminals_1_15= 'O' | lv_nonTerminals_1_16= 'P' | lv_nonTerminals_1_17= 'Q' | lv_nonTerminals_1_18= 'R' | lv_nonTerminals_1_19= 'S' | lv_nonTerminals_1_20= 'T' | lv_nonTerminals_1_21= 'U' | lv_nonTerminals_1_22= 'V' | lv_nonTerminals_1_23= 'W' | lv_nonTerminals_1_24= 'X' | lv_nonTerminals_1_25= 'Y' | lv_nonTerminals_1_26= 'Z' ) ) ) )
            {
            // InternalCYK.g:637:2: ( () ( ( (lv_nonTerminals_1_1= 'A' | lv_nonTerminals_1_2= 'B' | lv_nonTerminals_1_3= 'C' | lv_nonTerminals_1_4= 'D' | lv_nonTerminals_1_5= 'E' | lv_nonTerminals_1_6= 'F' | lv_nonTerminals_1_7= 'G' | lv_nonTerminals_1_8= 'H' | lv_nonTerminals_1_9= 'I' | lv_nonTerminals_1_10= 'J' | lv_nonTerminals_1_11= 'K' | lv_nonTerminals_1_12= 'L' | lv_nonTerminals_1_13= 'M' | lv_nonTerminals_1_14= 'N' | lv_nonTerminals_1_15= 'O' | lv_nonTerminals_1_16= 'P' | lv_nonTerminals_1_17= 'Q' | lv_nonTerminals_1_18= 'R' | lv_nonTerminals_1_19= 'S' | lv_nonTerminals_1_20= 'T' | lv_nonTerminals_1_21= 'U' | lv_nonTerminals_1_22= 'V' | lv_nonTerminals_1_23= 'W' | lv_nonTerminals_1_24= 'X' | lv_nonTerminals_1_25= 'Y' | lv_nonTerminals_1_26= 'Z' ) ) ) )
            // InternalCYK.g:638:3: () ( ( (lv_nonTerminals_1_1= 'A' | lv_nonTerminals_1_2= 'B' | lv_nonTerminals_1_3= 'C' | lv_nonTerminals_1_4= 'D' | lv_nonTerminals_1_5= 'E' | lv_nonTerminals_1_6= 'F' | lv_nonTerminals_1_7= 'G' | lv_nonTerminals_1_8= 'H' | lv_nonTerminals_1_9= 'I' | lv_nonTerminals_1_10= 'J' | lv_nonTerminals_1_11= 'K' | lv_nonTerminals_1_12= 'L' | lv_nonTerminals_1_13= 'M' | lv_nonTerminals_1_14= 'N' | lv_nonTerminals_1_15= 'O' | lv_nonTerminals_1_16= 'P' | lv_nonTerminals_1_17= 'Q' | lv_nonTerminals_1_18= 'R' | lv_nonTerminals_1_19= 'S' | lv_nonTerminals_1_20= 'T' | lv_nonTerminals_1_21= 'U' | lv_nonTerminals_1_22= 'V' | lv_nonTerminals_1_23= 'W' | lv_nonTerminals_1_24= 'X' | lv_nonTerminals_1_25= 'Y' | lv_nonTerminals_1_26= 'Z' ) ) )
            {
            // InternalCYK.g:638:3: ()
            // InternalCYK.g:639:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNonTerminalAccess().getNonTerminalAction_0(),
            					current);
            			

            }

            // InternalCYK.g:645:3: ( ( (lv_nonTerminals_1_1= 'A' | lv_nonTerminals_1_2= 'B' | lv_nonTerminals_1_3= 'C' | lv_nonTerminals_1_4= 'D' | lv_nonTerminals_1_5= 'E' | lv_nonTerminals_1_6= 'F' | lv_nonTerminals_1_7= 'G' | lv_nonTerminals_1_8= 'H' | lv_nonTerminals_1_9= 'I' | lv_nonTerminals_1_10= 'J' | lv_nonTerminals_1_11= 'K' | lv_nonTerminals_1_12= 'L' | lv_nonTerminals_1_13= 'M' | lv_nonTerminals_1_14= 'N' | lv_nonTerminals_1_15= 'O' | lv_nonTerminals_1_16= 'P' | lv_nonTerminals_1_17= 'Q' | lv_nonTerminals_1_18= 'R' | lv_nonTerminals_1_19= 'S' | lv_nonTerminals_1_20= 'T' | lv_nonTerminals_1_21= 'U' | lv_nonTerminals_1_22= 'V' | lv_nonTerminals_1_23= 'W' | lv_nonTerminals_1_24= 'X' | lv_nonTerminals_1_25= 'Y' | lv_nonTerminals_1_26= 'Z' ) ) )
            // InternalCYK.g:646:4: ( (lv_nonTerminals_1_1= 'A' | lv_nonTerminals_1_2= 'B' | lv_nonTerminals_1_3= 'C' | lv_nonTerminals_1_4= 'D' | lv_nonTerminals_1_5= 'E' | lv_nonTerminals_1_6= 'F' | lv_nonTerminals_1_7= 'G' | lv_nonTerminals_1_8= 'H' | lv_nonTerminals_1_9= 'I' | lv_nonTerminals_1_10= 'J' | lv_nonTerminals_1_11= 'K' | lv_nonTerminals_1_12= 'L' | lv_nonTerminals_1_13= 'M' | lv_nonTerminals_1_14= 'N' | lv_nonTerminals_1_15= 'O' | lv_nonTerminals_1_16= 'P' | lv_nonTerminals_1_17= 'Q' | lv_nonTerminals_1_18= 'R' | lv_nonTerminals_1_19= 'S' | lv_nonTerminals_1_20= 'T' | lv_nonTerminals_1_21= 'U' | lv_nonTerminals_1_22= 'V' | lv_nonTerminals_1_23= 'W' | lv_nonTerminals_1_24= 'X' | lv_nonTerminals_1_25= 'Y' | lv_nonTerminals_1_26= 'Z' ) )
            {
            // InternalCYK.g:646:4: ( (lv_nonTerminals_1_1= 'A' | lv_nonTerminals_1_2= 'B' | lv_nonTerminals_1_3= 'C' | lv_nonTerminals_1_4= 'D' | lv_nonTerminals_1_5= 'E' | lv_nonTerminals_1_6= 'F' | lv_nonTerminals_1_7= 'G' | lv_nonTerminals_1_8= 'H' | lv_nonTerminals_1_9= 'I' | lv_nonTerminals_1_10= 'J' | lv_nonTerminals_1_11= 'K' | lv_nonTerminals_1_12= 'L' | lv_nonTerminals_1_13= 'M' | lv_nonTerminals_1_14= 'N' | lv_nonTerminals_1_15= 'O' | lv_nonTerminals_1_16= 'P' | lv_nonTerminals_1_17= 'Q' | lv_nonTerminals_1_18= 'R' | lv_nonTerminals_1_19= 'S' | lv_nonTerminals_1_20= 'T' | lv_nonTerminals_1_21= 'U' | lv_nonTerminals_1_22= 'V' | lv_nonTerminals_1_23= 'W' | lv_nonTerminals_1_24= 'X' | lv_nonTerminals_1_25= 'Y' | lv_nonTerminals_1_26= 'Z' ) )
            // InternalCYK.g:647:5: (lv_nonTerminals_1_1= 'A' | lv_nonTerminals_1_2= 'B' | lv_nonTerminals_1_3= 'C' | lv_nonTerminals_1_4= 'D' | lv_nonTerminals_1_5= 'E' | lv_nonTerminals_1_6= 'F' | lv_nonTerminals_1_7= 'G' | lv_nonTerminals_1_8= 'H' | lv_nonTerminals_1_9= 'I' | lv_nonTerminals_1_10= 'J' | lv_nonTerminals_1_11= 'K' | lv_nonTerminals_1_12= 'L' | lv_nonTerminals_1_13= 'M' | lv_nonTerminals_1_14= 'N' | lv_nonTerminals_1_15= 'O' | lv_nonTerminals_1_16= 'P' | lv_nonTerminals_1_17= 'Q' | lv_nonTerminals_1_18= 'R' | lv_nonTerminals_1_19= 'S' | lv_nonTerminals_1_20= 'T' | lv_nonTerminals_1_21= 'U' | lv_nonTerminals_1_22= 'V' | lv_nonTerminals_1_23= 'W' | lv_nonTerminals_1_24= 'X' | lv_nonTerminals_1_25= 'Y' | lv_nonTerminals_1_26= 'Z' )
            {
            // InternalCYK.g:647:5: (lv_nonTerminals_1_1= 'A' | lv_nonTerminals_1_2= 'B' | lv_nonTerminals_1_3= 'C' | lv_nonTerminals_1_4= 'D' | lv_nonTerminals_1_5= 'E' | lv_nonTerminals_1_6= 'F' | lv_nonTerminals_1_7= 'G' | lv_nonTerminals_1_8= 'H' | lv_nonTerminals_1_9= 'I' | lv_nonTerminals_1_10= 'J' | lv_nonTerminals_1_11= 'K' | lv_nonTerminals_1_12= 'L' | lv_nonTerminals_1_13= 'M' | lv_nonTerminals_1_14= 'N' | lv_nonTerminals_1_15= 'O' | lv_nonTerminals_1_16= 'P' | lv_nonTerminals_1_17= 'Q' | lv_nonTerminals_1_18= 'R' | lv_nonTerminals_1_19= 'S' | lv_nonTerminals_1_20= 'T' | lv_nonTerminals_1_21= 'U' | lv_nonTerminals_1_22= 'V' | lv_nonTerminals_1_23= 'W' | lv_nonTerminals_1_24= 'X' | lv_nonTerminals_1_25= 'Y' | lv_nonTerminals_1_26= 'Z' )
            int alt7=26;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt7=1;
                }
                break;
            case 43:
                {
                alt7=2;
                }
                break;
            case 44:
                {
                alt7=3;
                }
                break;
            case 45:
                {
                alt7=4;
                }
                break;
            case 46:
                {
                alt7=5;
                }
                break;
            case 47:
                {
                alt7=6;
                }
                break;
            case 13:
                {
                alt7=7;
                }
                break;
            case 48:
                {
                alt7=8;
                }
                break;
            case 49:
                {
                alt7=9;
                }
                break;
            case 50:
                {
                alt7=10;
                }
                break;
            case 51:
                {
                alt7=11;
                }
                break;
            case 52:
                {
                alt7=12;
                }
                break;
            case 53:
                {
                alt7=13;
                }
                break;
            case 54:
                {
                alt7=14;
                }
                break;
            case 55:
                {
                alt7=15;
                }
                break;
            case 56:
                {
                alt7=16;
                }
                break;
            case 57:
                {
                alt7=17;
                }
                break;
            case 58:
                {
                alt7=18;
                }
                break;
            case 59:
                {
                alt7=19;
                }
                break;
            case 60:
                {
                alt7=20;
                }
                break;
            case 61:
                {
                alt7=21;
                }
                break;
            case 62:
                {
                alt7=22;
                }
                break;
            case 11:
                {
                alt7=23;
                }
                break;
            case 63:
                {
                alt7=24;
                }
                break;
            case 64:
                {
                alt7=25;
                }
                break;
            case 65:
                {
                alt7=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCYK.g:648:6: lv_nonTerminals_1_1= 'A'
                    {
                    lv_nonTerminals_1_1=(Token)match(input,42,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_1, grammarAccess.getNonTerminalAccess().getNonTerminalsAKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCYK.g:659:6: lv_nonTerminals_1_2= 'B'
                    {
                    lv_nonTerminals_1_2=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_2, grammarAccess.getNonTerminalAccess().getNonTerminalsBKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalCYK.g:670:6: lv_nonTerminals_1_3= 'C'
                    {
                    lv_nonTerminals_1_3=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_3, grammarAccess.getNonTerminalAccess().getNonTerminalsCKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalCYK.g:681:6: lv_nonTerminals_1_4= 'D'
                    {
                    lv_nonTerminals_1_4=(Token)match(input,45,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_4, grammarAccess.getNonTerminalAccess().getNonTerminalsDKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalCYK.g:692:6: lv_nonTerminals_1_5= 'E'
                    {
                    lv_nonTerminals_1_5=(Token)match(input,46,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_5, grammarAccess.getNonTerminalAccess().getNonTerminalsEKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalCYK.g:703:6: lv_nonTerminals_1_6= 'F'
                    {
                    lv_nonTerminals_1_6=(Token)match(input,47,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_6, grammarAccess.getNonTerminalAccess().getNonTerminalsFKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalCYK.g:714:6: lv_nonTerminals_1_7= 'G'
                    {
                    lv_nonTerminals_1_7=(Token)match(input,13,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_7, grammarAccess.getNonTerminalAccess().getNonTerminalsGKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalCYK.g:725:6: lv_nonTerminals_1_8= 'H'
                    {
                    lv_nonTerminals_1_8=(Token)match(input,48,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_8, grammarAccess.getNonTerminalAccess().getNonTerminalsHKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalCYK.g:736:6: lv_nonTerminals_1_9= 'I'
                    {
                    lv_nonTerminals_1_9=(Token)match(input,49,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_9, grammarAccess.getNonTerminalAccess().getNonTerminalsIKeyword_1_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalCYK.g:747:6: lv_nonTerminals_1_10= 'J'
                    {
                    lv_nonTerminals_1_10=(Token)match(input,50,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_10, grammarAccess.getNonTerminalAccess().getNonTerminalsJKeyword_1_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalCYK.g:758:6: lv_nonTerminals_1_11= 'K'
                    {
                    lv_nonTerminals_1_11=(Token)match(input,51,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_11, grammarAccess.getNonTerminalAccess().getNonTerminalsKKeyword_1_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalCYK.g:769:6: lv_nonTerminals_1_12= 'L'
                    {
                    lv_nonTerminals_1_12=(Token)match(input,52,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_12, grammarAccess.getNonTerminalAccess().getNonTerminalsLKeyword_1_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalCYK.g:780:6: lv_nonTerminals_1_13= 'M'
                    {
                    lv_nonTerminals_1_13=(Token)match(input,53,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_13, grammarAccess.getNonTerminalAccess().getNonTerminalsMKeyword_1_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_13, null);
                    					

                    }
                    break;
                case 14 :
                    // InternalCYK.g:791:6: lv_nonTerminals_1_14= 'N'
                    {
                    lv_nonTerminals_1_14=(Token)match(input,54,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_14, grammarAccess.getNonTerminalAccess().getNonTerminalsNKeyword_1_0_13());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_14, null);
                    					

                    }
                    break;
                case 15 :
                    // InternalCYK.g:802:6: lv_nonTerminals_1_15= 'O'
                    {
                    lv_nonTerminals_1_15=(Token)match(input,55,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_15, grammarAccess.getNonTerminalAccess().getNonTerminalsOKeyword_1_0_14());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_15, null);
                    					

                    }
                    break;
                case 16 :
                    // InternalCYK.g:813:6: lv_nonTerminals_1_16= 'P'
                    {
                    lv_nonTerminals_1_16=(Token)match(input,56,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_16, grammarAccess.getNonTerminalAccess().getNonTerminalsPKeyword_1_0_15());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_16, null);
                    					

                    }
                    break;
                case 17 :
                    // InternalCYK.g:824:6: lv_nonTerminals_1_17= 'Q'
                    {
                    lv_nonTerminals_1_17=(Token)match(input,57,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_17, grammarAccess.getNonTerminalAccess().getNonTerminalsQKeyword_1_0_16());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_17, null);
                    					

                    }
                    break;
                case 18 :
                    // InternalCYK.g:835:6: lv_nonTerminals_1_18= 'R'
                    {
                    lv_nonTerminals_1_18=(Token)match(input,58,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_18, grammarAccess.getNonTerminalAccess().getNonTerminalsRKeyword_1_0_17());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_18, null);
                    					

                    }
                    break;
                case 19 :
                    // InternalCYK.g:846:6: lv_nonTerminals_1_19= 'S'
                    {
                    lv_nonTerminals_1_19=(Token)match(input,59,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_19, grammarAccess.getNonTerminalAccess().getNonTerminalsSKeyword_1_0_18());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_19, null);
                    					

                    }
                    break;
                case 20 :
                    // InternalCYK.g:857:6: lv_nonTerminals_1_20= 'T'
                    {
                    lv_nonTerminals_1_20=(Token)match(input,60,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_20, grammarAccess.getNonTerminalAccess().getNonTerminalsTKeyword_1_0_19());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_20, null);
                    					

                    }
                    break;
                case 21 :
                    // InternalCYK.g:868:6: lv_nonTerminals_1_21= 'U'
                    {
                    lv_nonTerminals_1_21=(Token)match(input,61,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_21, grammarAccess.getNonTerminalAccess().getNonTerminalsUKeyword_1_0_20());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_21, null);
                    					

                    }
                    break;
                case 22 :
                    // InternalCYK.g:879:6: lv_nonTerminals_1_22= 'V'
                    {
                    lv_nonTerminals_1_22=(Token)match(input,62,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_22, grammarAccess.getNonTerminalAccess().getNonTerminalsVKeyword_1_0_21());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_22, null);
                    					

                    }
                    break;
                case 23 :
                    // InternalCYK.g:890:6: lv_nonTerminals_1_23= 'W'
                    {
                    lv_nonTerminals_1_23=(Token)match(input,11,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_23, grammarAccess.getNonTerminalAccess().getNonTerminalsWKeyword_1_0_22());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_23, null);
                    					

                    }
                    break;
                case 24 :
                    // InternalCYK.g:901:6: lv_nonTerminals_1_24= 'X'
                    {
                    lv_nonTerminals_1_24=(Token)match(input,63,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_24, grammarAccess.getNonTerminalAccess().getNonTerminalsXKeyword_1_0_23());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_24, null);
                    					

                    }
                    break;
                case 25 :
                    // InternalCYK.g:912:6: lv_nonTerminals_1_25= 'Y'
                    {
                    lv_nonTerminals_1_25=(Token)match(input,64,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_25, grammarAccess.getNonTerminalAccess().getNonTerminalsYKeyword_1_0_24());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_25, null);
                    					

                    }
                    break;
                case 26 :
                    // InternalCYK.g:923:6: lv_nonTerminals_1_26= 'Z'
                    {
                    lv_nonTerminals_1_26=(Token)match(input,65,FOLLOW_2); 

                    						newLeafNode(lv_nonTerminals_1_26, grammarAccess.getNonTerminalAccess().getNonTerminalsZKeyword_1_0_25());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "nonTerminals", lv_nonTerminals_1_26, null);
                    					

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
    // InternalCYK.g:940:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // InternalCYK.g:940:47: (iv_ruleBinary= ruleBinary EOF )
            // InternalCYK.g:941:2: iv_ruleBinary= ruleBinary EOF
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
    // InternalCYK.g:947:1: ruleBinary returns [EObject current=null] : ( () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) ) ) ;
    public final EObject ruleBinary() throws RecognitionException {
        EObject current = null;

        EObject lv_first_1_0 = null;

        EObject lv_second_2_0 = null;



        	enterRule();

        try {
            // InternalCYK.g:953:2: ( ( () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) ) ) )
            // InternalCYK.g:954:2: ( () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) ) )
            {
            // InternalCYK.g:954:2: ( () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) ) )
            // InternalCYK.g:955:3: () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) )
            {
            // InternalCYK.g:955:3: ()
            // InternalCYK.g:956:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBinaryAccess().getBinaryAction_0(),
            					current);
            			

            }

            // InternalCYK.g:962:3: ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) )
            // InternalCYK.g:963:4: ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) )
            {
            // InternalCYK.g:963:4: ( (lv_first_1_0= ruleNonTerminal ) )
            // InternalCYK.g:964:5: (lv_first_1_0= ruleNonTerminal )
            {
            // InternalCYK.g:964:5: (lv_first_1_0= ruleNonTerminal )
            // InternalCYK.g:965:6: lv_first_1_0= ruleNonTerminal
            {

            						newCompositeNode(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_11);
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

            // InternalCYK.g:982:4: ( (lv_second_2_0= ruleNonTerminal ) )
            // InternalCYK.g:983:5: (lv_second_2_0= ruleNonTerminal )
            {
            // InternalCYK.g:983:5: (lv_second_2_0= ruleNonTerminal )
            // InternalCYK.g:984:6: lv_second_2_0= ruleNonTerminal
            {

            						newCompositeNode(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0());
            					
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000003FFFFFE0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000003FFFFFE2000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xFFFFFC0000002802L,0x0000000000000003L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xFFFFFFFFFFFF2800L,0x0000000000000003L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xFFFFFFFFFFFFA800L,0x0000000000000003L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xFFFFFC0000002800L,0x0000000000000003L});

}