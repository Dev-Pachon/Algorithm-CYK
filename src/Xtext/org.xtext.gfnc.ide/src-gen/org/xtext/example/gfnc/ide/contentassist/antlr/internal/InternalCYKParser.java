package org.xtext.example.gfnc.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.gfnc.services.CYKGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCYKParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'v'", "'w'", "'x'", "'y'", "'z'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "':'", "'->'", "'|'", "'_'"
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

    	public void setGrammarAccess(CYKGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGFNC"
    // InternalCYK.g:53:1: entryRuleGFNC : ruleGFNC EOF ;
    public final void entryRuleGFNC() throws RecognitionException {
        try {
            // InternalCYK.g:54:1: ( ruleGFNC EOF )
            // InternalCYK.g:55:1: ruleGFNC EOF
            {
             before(grammarAccess.getGFNCRule()); 
            pushFollow(FOLLOW_1);
            ruleGFNC();

            state._fsp--;

             after(grammarAccess.getGFNCRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGFNC"


    // $ANTLR start "ruleGFNC"
    // InternalCYK.g:62:1: ruleGFNC : ( ( rule__GFNC__Group__0 ) ) ;
    public final void ruleGFNC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:66:2: ( ( ( rule__GFNC__Group__0 ) ) )
            // InternalCYK.g:67:2: ( ( rule__GFNC__Group__0 ) )
            {
            // InternalCYK.g:67:2: ( ( rule__GFNC__Group__0 ) )
            // InternalCYK.g:68:3: ( rule__GFNC__Group__0 )
            {
             before(grammarAccess.getGFNCAccess().getGroup()); 
            // InternalCYK.g:69:3: ( rule__GFNC__Group__0 )
            // InternalCYK.g:69:4: rule__GFNC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GFNC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGFNCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGFNC"


    // $ANTLR start "entryRuleProduction"
    // InternalCYK.g:78:1: entryRuleProduction : ruleProduction EOF ;
    public final void entryRuleProduction() throws RecognitionException {
        try {
            // InternalCYK.g:79:1: ( ruleProduction EOF )
            // InternalCYK.g:80:1: ruleProduction EOF
            {
             before(grammarAccess.getProductionRule()); 
            pushFollow(FOLLOW_1);
            ruleProduction();

            state._fsp--;

             after(grammarAccess.getProductionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProduction"


    // $ANTLR start "ruleProduction"
    // InternalCYK.g:87:1: ruleProduction : ( ( rule__Production__Group__0 ) ) ;
    public final void ruleProduction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:91:2: ( ( ( rule__Production__Group__0 ) ) )
            // InternalCYK.g:92:2: ( ( rule__Production__Group__0 ) )
            {
            // InternalCYK.g:92:2: ( ( rule__Production__Group__0 ) )
            // InternalCYK.g:93:3: ( rule__Production__Group__0 )
            {
             before(grammarAccess.getProductionAccess().getGroup()); 
            // InternalCYK.g:94:3: ( rule__Production__Group__0 )
            // InternalCYK.g:94:4: rule__Production__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Production__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProduction"


    // $ANTLR start "entryRuleRight"
    // InternalCYK.g:103:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalCYK.g:104:1: ( ruleRight EOF )
            // InternalCYK.g:105:1: ruleRight EOF
            {
             before(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getRightRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalCYK.g:112:1: ruleRight : ( ( rule__Right__Alternatives ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:116:2: ( ( ( rule__Right__Alternatives ) ) )
            // InternalCYK.g:117:2: ( ( rule__Right__Alternatives ) )
            {
            // InternalCYK.g:117:2: ( ( rule__Right__Alternatives ) )
            // InternalCYK.g:118:3: ( rule__Right__Alternatives )
            {
             before(grammarAccess.getRightAccess().getAlternatives()); 
            // InternalCYK.g:119:3: ( rule__Right__Alternatives )
            // InternalCYK.g:119:4: rule__Right__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Right__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleTerminal"
    // InternalCYK.g:128:1: entryRuleTerminal : ruleTerminal EOF ;
    public final void entryRuleTerminal() throws RecognitionException {
        try {
            // InternalCYK.g:129:1: ( ruleTerminal EOF )
            // InternalCYK.g:130:1: ruleTerminal EOF
            {
             before(grammarAccess.getTerminalRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminal();

            state._fsp--;

             after(grammarAccess.getTerminalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // InternalCYK.g:137:1: ruleTerminal : ( ( rule__Terminal__Group__0 ) ) ;
    public final void ruleTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:141:2: ( ( ( rule__Terminal__Group__0 ) ) )
            // InternalCYK.g:142:2: ( ( rule__Terminal__Group__0 ) )
            {
            // InternalCYK.g:142:2: ( ( rule__Terminal__Group__0 ) )
            // InternalCYK.g:143:3: ( rule__Terminal__Group__0 )
            {
             before(grammarAccess.getTerminalAccess().getGroup()); 
            // InternalCYK.g:144:3: ( rule__Terminal__Group__0 )
            // InternalCYK.g:144:4: rule__Terminal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminal"


    // $ANTLR start "entryRuleNonTerminal"
    // InternalCYK.g:153:1: entryRuleNonTerminal : ruleNonTerminal EOF ;
    public final void entryRuleNonTerminal() throws RecognitionException {
        try {
            // InternalCYK.g:154:1: ( ruleNonTerminal EOF )
            // InternalCYK.g:155:1: ruleNonTerminal EOF
            {
             before(grammarAccess.getNonTerminalRule()); 
            pushFollow(FOLLOW_1);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getNonTerminalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNonTerminal"


    // $ANTLR start "ruleNonTerminal"
    // InternalCYK.g:162:1: ruleNonTerminal : ( ( rule__NonTerminal__Group__0 ) ) ;
    public final void ruleNonTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:166:2: ( ( ( rule__NonTerminal__Group__0 ) ) )
            // InternalCYK.g:167:2: ( ( rule__NonTerminal__Group__0 ) )
            {
            // InternalCYK.g:167:2: ( ( rule__NonTerminal__Group__0 ) )
            // InternalCYK.g:168:3: ( rule__NonTerminal__Group__0 )
            {
             before(grammarAccess.getNonTerminalAccess().getGroup()); 
            // InternalCYK.g:169:3: ( rule__NonTerminal__Group__0 )
            // InternalCYK.g:169:4: rule__NonTerminal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonTerminalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonTerminal"


    // $ANTLR start "entryRuleBinary"
    // InternalCYK.g:178:1: entryRuleBinary : ruleBinary EOF ;
    public final void entryRuleBinary() throws RecognitionException {
        try {
            // InternalCYK.g:179:1: ( ruleBinary EOF )
            // InternalCYK.g:180:1: ruleBinary EOF
            {
             before(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_1);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getBinaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // InternalCYK.g:187:1: ruleBinary : ( ( rule__Binary__Group__0 ) ) ;
    public final void ruleBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:191:2: ( ( ( rule__Binary__Group__0 ) ) )
            // InternalCYK.g:192:2: ( ( rule__Binary__Group__0 ) )
            {
            // InternalCYK.g:192:2: ( ( rule__Binary__Group__0 ) )
            // InternalCYK.g:193:3: ( rule__Binary__Group__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup()); 
            // InternalCYK.g:194:3: ( rule__Binary__Group__0 )
            // InternalCYK.g:194:4: rule__Binary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinary"


    // $ANTLR start "rule__Right__Alternatives"
    // InternalCYK.g:202:1: rule__Right__Alternatives : ( ( ( rule__Right__SimpleAssignment_0 ) ) | ( ( rule__Right__BinaryAssignment_1 ) ) | ( ( rule__Right__LambdaAssignment_2 ) ) );
    public final void rule__Right__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:206:1: ( ( ( rule__Right__SimpleAssignment_0 ) ) | ( ( rule__Right__BinaryAssignment_1 ) ) | ( ( rule__Right__LambdaAssignment_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
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
                {
                alt1=1;
                }
                break;
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
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
                {
                alt1=2;
                }
                break;
            case 65:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCYK.g:207:2: ( ( rule__Right__SimpleAssignment_0 ) )
                    {
                    // InternalCYK.g:207:2: ( ( rule__Right__SimpleAssignment_0 ) )
                    // InternalCYK.g:208:3: ( rule__Right__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getRightAccess().getSimpleAssignment_0()); 
                    // InternalCYK.g:209:3: ( rule__Right__SimpleAssignment_0 )
                    // InternalCYK.g:209:4: rule__Right__SimpleAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Right__SimpleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRightAccess().getSimpleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:213:2: ( ( rule__Right__BinaryAssignment_1 ) )
                    {
                    // InternalCYK.g:213:2: ( ( rule__Right__BinaryAssignment_1 ) )
                    // InternalCYK.g:214:3: ( rule__Right__BinaryAssignment_1 )
                    {
                     before(grammarAccess.getRightAccess().getBinaryAssignment_1()); 
                    // InternalCYK.g:215:3: ( rule__Right__BinaryAssignment_1 )
                    // InternalCYK.g:215:4: rule__Right__BinaryAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Right__BinaryAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRightAccess().getBinaryAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCYK.g:219:2: ( ( rule__Right__LambdaAssignment_2 ) )
                    {
                    // InternalCYK.g:219:2: ( ( rule__Right__LambdaAssignment_2 ) )
                    // InternalCYK.g:220:3: ( rule__Right__LambdaAssignment_2 )
                    {
                     before(grammarAccess.getRightAccess().getLambdaAssignment_2()); 
                    // InternalCYK.g:221:3: ( rule__Right__LambdaAssignment_2 )
                    // InternalCYK.g:221:4: rule__Right__LambdaAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Right__LambdaAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRightAccess().getLambdaAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Alternatives"


    // $ANTLR start "rule__Terminal__TerminalsAlternatives_1_0"
    // InternalCYK.g:229:1: rule__Terminal__TerminalsAlternatives_1_0 : ( ( 'a' ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) | ( 'g' ) | ( 'h' ) | ( 'i' ) | ( 'j' ) | ( 'k' ) | ( 'l' ) | ( 'm' ) | ( 'n' ) | ( 'o' ) | ( 'p' ) | ( 'q' ) | ( 'r' ) | ( 's' ) | ( 't' ) | ( 'v' ) | ( 'w' ) | ( 'x' ) | ( 'y' ) | ( 'z' ) );
    public final void rule__Terminal__TerminalsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:233:1: ( ( 'a' ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) | ( 'g' ) | ( 'h' ) | ( 'i' ) | ( 'j' ) | ( 'k' ) | ( 'l' ) | ( 'm' ) | ( 'n' ) | ( 'o' ) | ( 'p' ) | ( 'q' ) | ( 'r' ) | ( 's' ) | ( 't' ) | ( 'v' ) | ( 'w' ) | ( 'x' ) | ( 'y' ) | ( 'z' ) )
            int alt2=25;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            case 20:
                {
                alt2=10;
                }
                break;
            case 21:
                {
                alt2=11;
                }
                break;
            case 22:
                {
                alt2=12;
                }
                break;
            case 23:
                {
                alt2=13;
                }
                break;
            case 24:
                {
                alt2=14;
                }
                break;
            case 25:
                {
                alt2=15;
                }
                break;
            case 26:
                {
                alt2=16;
                }
                break;
            case 27:
                {
                alt2=17;
                }
                break;
            case 28:
                {
                alt2=18;
                }
                break;
            case 29:
                {
                alt2=19;
                }
                break;
            case 30:
                {
                alt2=20;
                }
                break;
            case 31:
                {
                alt2=21;
                }
                break;
            case 32:
                {
                alt2=22;
                }
                break;
            case 33:
                {
                alt2=23;
                }
                break;
            case 34:
                {
                alt2=24;
                }
                break;
            case 35:
                {
                alt2=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCYK.g:234:2: ( 'a' )
                    {
                    // InternalCYK.g:234:2: ( 'a' )
                    // InternalCYK.g:235:3: 'a'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsAKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsAKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:240:2: ( 'b' )
                    {
                    // InternalCYK.g:240:2: ( 'b' )
                    // InternalCYK.g:241:3: 'b'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsBKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsBKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCYK.g:246:2: ( 'c' )
                    {
                    // InternalCYK.g:246:2: ( 'c' )
                    // InternalCYK.g:247:3: 'c'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsCKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsCKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCYK.g:252:2: ( 'd' )
                    {
                    // InternalCYK.g:252:2: ( 'd' )
                    // InternalCYK.g:253:3: 'd'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsDKeyword_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsDKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCYK.g:258:2: ( 'e' )
                    {
                    // InternalCYK.g:258:2: ( 'e' )
                    // InternalCYK.g:259:3: 'e'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsEKeyword_1_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsEKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCYK.g:264:2: ( 'f' )
                    {
                    // InternalCYK.g:264:2: ( 'f' )
                    // InternalCYK.g:265:3: 'f'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsFKeyword_1_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsFKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCYK.g:270:2: ( 'g' )
                    {
                    // InternalCYK.g:270:2: ( 'g' )
                    // InternalCYK.g:271:3: 'g'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsGKeyword_1_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsGKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCYK.g:276:2: ( 'h' )
                    {
                    // InternalCYK.g:276:2: ( 'h' )
                    // InternalCYK.g:277:3: 'h'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsHKeyword_1_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsHKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCYK.g:282:2: ( 'i' )
                    {
                    // InternalCYK.g:282:2: ( 'i' )
                    // InternalCYK.g:283:3: 'i'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsIKeyword_1_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsIKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCYK.g:288:2: ( 'j' )
                    {
                    // InternalCYK.g:288:2: ( 'j' )
                    // InternalCYK.g:289:3: 'j'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsJKeyword_1_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsJKeyword_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalCYK.g:294:2: ( 'k' )
                    {
                    // InternalCYK.g:294:2: ( 'k' )
                    // InternalCYK.g:295:3: 'k'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsKKeyword_1_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsKKeyword_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalCYK.g:300:2: ( 'l' )
                    {
                    // InternalCYK.g:300:2: ( 'l' )
                    // InternalCYK.g:301:3: 'l'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsLKeyword_1_0_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsLKeyword_1_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalCYK.g:306:2: ( 'm' )
                    {
                    // InternalCYK.g:306:2: ( 'm' )
                    // InternalCYK.g:307:3: 'm'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsMKeyword_1_0_12()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsMKeyword_1_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalCYK.g:312:2: ( 'n' )
                    {
                    // InternalCYK.g:312:2: ( 'n' )
                    // InternalCYK.g:313:3: 'n'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsNKeyword_1_0_13()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsNKeyword_1_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalCYK.g:318:2: ( 'o' )
                    {
                    // InternalCYK.g:318:2: ( 'o' )
                    // InternalCYK.g:319:3: 'o'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsOKeyword_1_0_14()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsOKeyword_1_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalCYK.g:324:2: ( 'p' )
                    {
                    // InternalCYK.g:324:2: ( 'p' )
                    // InternalCYK.g:325:3: 'p'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsPKeyword_1_0_15()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsPKeyword_1_0_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalCYK.g:330:2: ( 'q' )
                    {
                    // InternalCYK.g:330:2: ( 'q' )
                    // InternalCYK.g:331:3: 'q'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsQKeyword_1_0_16()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsQKeyword_1_0_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalCYK.g:336:2: ( 'r' )
                    {
                    // InternalCYK.g:336:2: ( 'r' )
                    // InternalCYK.g:337:3: 'r'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsRKeyword_1_0_17()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsRKeyword_1_0_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalCYK.g:342:2: ( 's' )
                    {
                    // InternalCYK.g:342:2: ( 's' )
                    // InternalCYK.g:343:3: 's'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsSKeyword_1_0_18()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsSKeyword_1_0_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalCYK.g:348:2: ( 't' )
                    {
                    // InternalCYK.g:348:2: ( 't' )
                    // InternalCYK.g:349:3: 't'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsTKeyword_1_0_19()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsTKeyword_1_0_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalCYK.g:354:2: ( 'v' )
                    {
                    // InternalCYK.g:354:2: ( 'v' )
                    // InternalCYK.g:355:3: 'v'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsVKeyword_1_0_20()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsVKeyword_1_0_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalCYK.g:360:2: ( 'w' )
                    {
                    // InternalCYK.g:360:2: ( 'w' )
                    // InternalCYK.g:361:3: 'w'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsWKeyword_1_0_21()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsWKeyword_1_0_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalCYK.g:366:2: ( 'x' )
                    {
                    // InternalCYK.g:366:2: ( 'x' )
                    // InternalCYK.g:367:3: 'x'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsXKeyword_1_0_22()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsXKeyword_1_0_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalCYK.g:372:2: ( 'y' )
                    {
                    // InternalCYK.g:372:2: ( 'y' )
                    // InternalCYK.g:373:3: 'y'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsYKeyword_1_0_23()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsYKeyword_1_0_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalCYK.g:378:2: ( 'z' )
                    {
                    // InternalCYK.g:378:2: ( 'z' )
                    // InternalCYK.g:379:3: 'z'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsZKeyword_1_0_24()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsZKeyword_1_0_24()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__TerminalsAlternatives_1_0"


    // $ANTLR start "rule__NonTerminal__NonTerminalsAlternatives_1_0"
    // InternalCYK.g:388:1: rule__NonTerminal__NonTerminalsAlternatives_1_0 : ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'H' ) | ( 'I' ) | ( 'J' ) | ( 'K' ) | ( 'L' ) | ( 'M' ) | ( 'N' ) | ( 'O' ) | ( 'P' ) | ( 'Q' ) | ( 'R' ) | ( 'S' ) | ( 'T' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'X' ) | ( 'Y' ) | ( 'Z' ) );
    public final void rule__NonTerminal__NonTerminalsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:392:1: ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'H' ) | ( 'I' ) | ( 'J' ) | ( 'K' ) | ( 'L' ) | ( 'M' ) | ( 'N' ) | ( 'O' ) | ( 'P' ) | ( 'Q' ) | ( 'R' ) | ( 'S' ) | ( 'T' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'X' ) | ( 'Y' ) | ( 'Z' ) )
            int alt3=26;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
                }
                break;
            case 39:
                {
                alt3=4;
                }
                break;
            case 40:
                {
                alt3=5;
                }
                break;
            case 41:
                {
                alt3=6;
                }
                break;
            case 42:
                {
                alt3=7;
                }
                break;
            case 43:
                {
                alt3=8;
                }
                break;
            case 44:
                {
                alt3=9;
                }
                break;
            case 45:
                {
                alt3=10;
                }
                break;
            case 46:
                {
                alt3=11;
                }
                break;
            case 47:
                {
                alt3=12;
                }
                break;
            case 48:
                {
                alt3=13;
                }
                break;
            case 49:
                {
                alt3=14;
                }
                break;
            case 50:
                {
                alt3=15;
                }
                break;
            case 51:
                {
                alt3=16;
                }
                break;
            case 52:
                {
                alt3=17;
                }
                break;
            case 53:
                {
                alt3=18;
                }
                break;
            case 54:
                {
                alt3=19;
                }
                break;
            case 55:
                {
                alt3=20;
                }
                break;
            case 56:
                {
                alt3=21;
                }
                break;
            case 57:
                {
                alt3=22;
                }
                break;
            case 58:
                {
                alt3=23;
                }
                break;
            case 59:
                {
                alt3=24;
                }
                break;
            case 60:
                {
                alt3=25;
                }
                break;
            case 61:
                {
                alt3=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCYK.g:393:2: ( 'A' )
                    {
                    // InternalCYK.g:393:2: ( 'A' )
                    // InternalCYK.g:394:3: 'A'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsAKeyword_1_0_0()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsAKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:399:2: ( 'B' )
                    {
                    // InternalCYK.g:399:2: ( 'B' )
                    // InternalCYK.g:400:3: 'B'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsBKeyword_1_0_1()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsBKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCYK.g:405:2: ( 'C' )
                    {
                    // InternalCYK.g:405:2: ( 'C' )
                    // InternalCYK.g:406:3: 'C'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsCKeyword_1_0_2()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsCKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCYK.g:411:2: ( 'D' )
                    {
                    // InternalCYK.g:411:2: ( 'D' )
                    // InternalCYK.g:412:3: 'D'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsDKeyword_1_0_3()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsDKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCYK.g:417:2: ( 'E' )
                    {
                    // InternalCYK.g:417:2: ( 'E' )
                    // InternalCYK.g:418:3: 'E'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsEKeyword_1_0_4()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsEKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCYK.g:423:2: ( 'F' )
                    {
                    // InternalCYK.g:423:2: ( 'F' )
                    // InternalCYK.g:424:3: 'F'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsFKeyword_1_0_5()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsFKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCYK.g:429:2: ( 'G' )
                    {
                    // InternalCYK.g:429:2: ( 'G' )
                    // InternalCYK.g:430:3: 'G'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsGKeyword_1_0_6()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsGKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCYK.g:435:2: ( 'H' )
                    {
                    // InternalCYK.g:435:2: ( 'H' )
                    // InternalCYK.g:436:3: 'H'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsHKeyword_1_0_7()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsHKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCYK.g:441:2: ( 'I' )
                    {
                    // InternalCYK.g:441:2: ( 'I' )
                    // InternalCYK.g:442:3: 'I'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsIKeyword_1_0_8()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsIKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCYK.g:447:2: ( 'J' )
                    {
                    // InternalCYK.g:447:2: ( 'J' )
                    // InternalCYK.g:448:3: 'J'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsJKeyword_1_0_9()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsJKeyword_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalCYK.g:453:2: ( 'K' )
                    {
                    // InternalCYK.g:453:2: ( 'K' )
                    // InternalCYK.g:454:3: 'K'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsKKeyword_1_0_10()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsKKeyword_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalCYK.g:459:2: ( 'L' )
                    {
                    // InternalCYK.g:459:2: ( 'L' )
                    // InternalCYK.g:460:3: 'L'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsLKeyword_1_0_11()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsLKeyword_1_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalCYK.g:465:2: ( 'M' )
                    {
                    // InternalCYK.g:465:2: ( 'M' )
                    // InternalCYK.g:466:3: 'M'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsMKeyword_1_0_12()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsMKeyword_1_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalCYK.g:471:2: ( 'N' )
                    {
                    // InternalCYK.g:471:2: ( 'N' )
                    // InternalCYK.g:472:3: 'N'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsNKeyword_1_0_13()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsNKeyword_1_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalCYK.g:477:2: ( 'O' )
                    {
                    // InternalCYK.g:477:2: ( 'O' )
                    // InternalCYK.g:478:3: 'O'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsOKeyword_1_0_14()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsOKeyword_1_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalCYK.g:483:2: ( 'P' )
                    {
                    // InternalCYK.g:483:2: ( 'P' )
                    // InternalCYK.g:484:3: 'P'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsPKeyword_1_0_15()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsPKeyword_1_0_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalCYK.g:489:2: ( 'Q' )
                    {
                    // InternalCYK.g:489:2: ( 'Q' )
                    // InternalCYK.g:490:3: 'Q'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsQKeyword_1_0_16()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsQKeyword_1_0_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalCYK.g:495:2: ( 'R' )
                    {
                    // InternalCYK.g:495:2: ( 'R' )
                    // InternalCYK.g:496:3: 'R'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsRKeyword_1_0_17()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsRKeyword_1_0_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalCYK.g:501:2: ( 'S' )
                    {
                    // InternalCYK.g:501:2: ( 'S' )
                    // InternalCYK.g:502:3: 'S'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsSKeyword_1_0_18()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsSKeyword_1_0_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalCYK.g:507:2: ( 'T' )
                    {
                    // InternalCYK.g:507:2: ( 'T' )
                    // InternalCYK.g:508:3: 'T'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsTKeyword_1_0_19()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsTKeyword_1_0_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalCYK.g:513:2: ( 'U' )
                    {
                    // InternalCYK.g:513:2: ( 'U' )
                    // InternalCYK.g:514:3: 'U'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsUKeyword_1_0_20()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsUKeyword_1_0_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalCYK.g:519:2: ( 'V' )
                    {
                    // InternalCYK.g:519:2: ( 'V' )
                    // InternalCYK.g:520:3: 'V'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsVKeyword_1_0_21()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsVKeyword_1_0_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalCYK.g:525:2: ( 'W' )
                    {
                    // InternalCYK.g:525:2: ( 'W' )
                    // InternalCYK.g:526:3: 'W'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsWKeyword_1_0_22()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsWKeyword_1_0_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalCYK.g:531:2: ( 'X' )
                    {
                    // InternalCYK.g:531:2: ( 'X' )
                    // InternalCYK.g:532:3: 'X'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsXKeyword_1_0_23()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsXKeyword_1_0_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalCYK.g:537:2: ( 'Y' )
                    {
                    // InternalCYK.g:537:2: ( 'Y' )
                    // InternalCYK.g:538:3: 'Y'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsYKeyword_1_0_24()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsYKeyword_1_0_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalCYK.g:543:2: ( 'Z' )
                    {
                    // InternalCYK.g:543:2: ( 'Z' )
                    // InternalCYK.g:544:3: 'Z'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsZKeyword_1_0_25()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsZKeyword_1_0_25()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__NonTerminalsAlternatives_1_0"


    // $ANTLR start "rule__GFNC__Group__0"
    // InternalCYK.g:553:1: rule__GFNC__Group__0 : rule__GFNC__Group__0__Impl rule__GFNC__Group__1 ;
    public final void rule__GFNC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:557:1: ( rule__GFNC__Group__0__Impl rule__GFNC__Group__1 )
            // InternalCYK.g:558:2: rule__GFNC__Group__0__Impl rule__GFNC__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GFNC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GFNC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__Group__0"


    // $ANTLR start "rule__GFNC__Group__0__Impl"
    // InternalCYK.g:565:1: rule__GFNC__Group__0__Impl : ( 'W' ) ;
    public final void rule__GFNC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:569:1: ( ( 'W' ) )
            // InternalCYK.g:570:1: ( 'W' )
            {
            // InternalCYK.g:570:1: ( 'W' )
            // InternalCYK.g:571:2: 'W'
            {
             before(grammarAccess.getGFNCAccess().getWKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGFNCAccess().getWKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__Group__0__Impl"


    // $ANTLR start "rule__GFNC__Group__1"
    // InternalCYK.g:580:1: rule__GFNC__Group__1 : rule__GFNC__Group__1__Impl rule__GFNC__Group__2 ;
    public final void rule__GFNC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:584:1: ( rule__GFNC__Group__1__Impl rule__GFNC__Group__2 )
            // InternalCYK.g:585:2: rule__GFNC__Group__1__Impl rule__GFNC__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GFNC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GFNC__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__Group__1"


    // $ANTLR start "rule__GFNC__Group__1__Impl"
    // InternalCYK.g:592:1: rule__GFNC__Group__1__Impl : ( ':' ) ;
    public final void rule__GFNC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:596:1: ( ( ':' ) )
            // InternalCYK.g:597:1: ( ':' )
            {
            // InternalCYK.g:597:1: ( ':' )
            // InternalCYK.g:598:2: ':'
            {
             before(grammarAccess.getGFNCAccess().getColonKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getGFNCAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__Group__1__Impl"


    // $ANTLR start "rule__GFNC__Group__2"
    // InternalCYK.g:607:1: rule__GFNC__Group__2 : rule__GFNC__Group__2__Impl rule__GFNC__Group__3 ;
    public final void rule__GFNC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:611:1: ( rule__GFNC__Group__2__Impl rule__GFNC__Group__3 )
            // InternalCYK.g:612:2: rule__GFNC__Group__2__Impl rule__GFNC__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__GFNC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GFNC__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__Group__2"


    // $ANTLR start "rule__GFNC__Group__2__Impl"
    // InternalCYK.g:619:1: rule__GFNC__Group__2__Impl : ( ( rule__GFNC__WAssignment_2 ) ) ;
    public final void rule__GFNC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:623:1: ( ( ( rule__GFNC__WAssignment_2 ) ) )
            // InternalCYK.g:624:1: ( ( rule__GFNC__WAssignment_2 ) )
            {
            // InternalCYK.g:624:1: ( ( rule__GFNC__WAssignment_2 ) )
            // InternalCYK.g:625:2: ( rule__GFNC__WAssignment_2 )
            {
             before(grammarAccess.getGFNCAccess().getWAssignment_2()); 
            // InternalCYK.g:626:2: ( rule__GFNC__WAssignment_2 )
            // InternalCYK.g:626:3: rule__GFNC__WAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GFNC__WAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGFNCAccess().getWAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__Group__2__Impl"


    // $ANTLR start "rule__GFNC__Group__3"
    // InternalCYK.g:634:1: rule__GFNC__Group__3 : rule__GFNC__Group__3__Impl rule__GFNC__Group__4 ;
    public final void rule__GFNC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:638:1: ( rule__GFNC__Group__3__Impl rule__GFNC__Group__4 )
            // InternalCYK.g:639:2: rule__GFNC__Group__3__Impl rule__GFNC__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__GFNC__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GFNC__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__Group__3"


    // $ANTLR start "rule__GFNC__Group__3__Impl"
    // InternalCYK.g:646:1: rule__GFNC__Group__3__Impl : ( ( rule__GFNC__WAssignment_3 )* ) ;
    public final void rule__GFNC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:650:1: ( ( ( rule__GFNC__WAssignment_3 )* ) )
            // InternalCYK.g:651:1: ( ( rule__GFNC__WAssignment_3 )* )
            {
            // InternalCYK.g:651:1: ( ( rule__GFNC__WAssignment_3 )* )
            // InternalCYK.g:652:2: ( rule__GFNC__WAssignment_3 )*
            {
             before(grammarAccess.getGFNCAccess().getWAssignment_3()); 
            // InternalCYK.g:653:2: ( rule__GFNC__WAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=35)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCYK.g:653:3: rule__GFNC__WAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GFNC__WAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getGFNCAccess().getWAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__Group__3__Impl"


    // $ANTLR start "rule__GFNC__Group__4"
    // InternalCYK.g:661:1: rule__GFNC__Group__4 : rule__GFNC__Group__4__Impl rule__GFNC__Group__5 ;
    public final void rule__GFNC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:665:1: ( rule__GFNC__Group__4__Impl rule__GFNC__Group__5 )
            // InternalCYK.g:666:2: rule__GFNC__Group__4__Impl rule__GFNC__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__GFNC__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GFNC__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__Group__4"


    // $ANTLR start "rule__GFNC__Group__4__Impl"
    // InternalCYK.g:673:1: rule__GFNC__Group__4__Impl : ( 'G' ) ;
    public final void rule__GFNC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:677:1: ( ( 'G' ) )
            // InternalCYK.g:678:1: ( 'G' )
            {
            // InternalCYK.g:678:1: ( 'G' )
            // InternalCYK.g:679:2: 'G'
            {
             before(grammarAccess.getGFNCAccess().getGKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getGFNCAccess().getGKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__Group__4__Impl"


    // $ANTLR start "rule__GFNC__Group__5"
    // InternalCYK.g:688:1: rule__GFNC__Group__5 : rule__GFNC__Group__5__Impl rule__GFNC__Group__6 ;
    public final void rule__GFNC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:692:1: ( rule__GFNC__Group__5__Impl rule__GFNC__Group__6 )
            // InternalCYK.g:693:2: rule__GFNC__Group__5__Impl rule__GFNC__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__GFNC__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GFNC__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__Group__5"


    // $ANTLR start "rule__GFNC__Group__5__Impl"
    // InternalCYK.g:700:1: rule__GFNC__Group__5__Impl : ( ':' ) ;
    public final void rule__GFNC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:704:1: ( ( ':' ) )
            // InternalCYK.g:705:1: ( ':' )
            {
            // InternalCYK.g:705:1: ( ':' )
            // InternalCYK.g:706:2: ':'
            {
             before(grammarAccess.getGFNCAccess().getColonKeyword_5()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getGFNCAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__Group__5__Impl"


    // $ANTLR start "rule__GFNC__Group__6"
    // InternalCYK.g:715:1: rule__GFNC__Group__6 : rule__GFNC__Group__6__Impl ;
    public final void rule__GFNC__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:719:1: ( rule__GFNC__Group__6__Impl )
            // InternalCYK.g:720:2: rule__GFNC__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GFNC__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__Group__6"


    // $ANTLR start "rule__GFNC__Group__6__Impl"
    // InternalCYK.g:726:1: rule__GFNC__Group__6__Impl : ( ( rule__GFNC__ProductionsAssignment_6 )* ) ;
    public final void rule__GFNC__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:730:1: ( ( ( rule__GFNC__ProductionsAssignment_6 )* ) )
            // InternalCYK.g:731:1: ( ( rule__GFNC__ProductionsAssignment_6 )* )
            {
            // InternalCYK.g:731:1: ( ( rule__GFNC__ProductionsAssignment_6 )* )
            // InternalCYK.g:732:2: ( rule__GFNC__ProductionsAssignment_6 )*
            {
             before(grammarAccess.getGFNCAccess().getProductionsAssignment_6()); 
            // InternalCYK.g:733:2: ( rule__GFNC__ProductionsAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=36 && LA5_0<=61)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCYK.g:733:3: rule__GFNC__ProductionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__GFNC__ProductionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGFNCAccess().getProductionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__Group__6__Impl"


    // $ANTLR start "rule__Production__Group__0"
    // InternalCYK.g:742:1: rule__Production__Group__0 : rule__Production__Group__0__Impl rule__Production__Group__1 ;
    public final void rule__Production__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:746:1: ( rule__Production__Group__0__Impl rule__Production__Group__1 )
            // InternalCYK.g:747:2: rule__Production__Group__0__Impl rule__Production__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Production__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Production__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__0"


    // $ANTLR start "rule__Production__Group__0__Impl"
    // InternalCYK.g:754:1: rule__Production__Group__0__Impl : ( ( rule__Production__LeftAssignment_0 ) ) ;
    public final void rule__Production__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:758:1: ( ( ( rule__Production__LeftAssignment_0 ) ) )
            // InternalCYK.g:759:1: ( ( rule__Production__LeftAssignment_0 ) )
            {
            // InternalCYK.g:759:1: ( ( rule__Production__LeftAssignment_0 ) )
            // InternalCYK.g:760:2: ( rule__Production__LeftAssignment_0 )
            {
             before(grammarAccess.getProductionAccess().getLeftAssignment_0()); 
            // InternalCYK.g:761:2: ( rule__Production__LeftAssignment_0 )
            // InternalCYK.g:761:3: rule__Production__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Production__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProductionAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__0__Impl"


    // $ANTLR start "rule__Production__Group__1"
    // InternalCYK.g:769:1: rule__Production__Group__1 : rule__Production__Group__1__Impl rule__Production__Group__2 ;
    public final void rule__Production__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:773:1: ( rule__Production__Group__1__Impl rule__Production__Group__2 )
            // InternalCYK.g:774:2: rule__Production__Group__1__Impl rule__Production__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Production__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Production__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__1"


    // $ANTLR start "rule__Production__Group__1__Impl"
    // InternalCYK.g:781:1: rule__Production__Group__1__Impl : ( '->' ) ;
    public final void rule__Production__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:785:1: ( ( '->' ) )
            // InternalCYK.g:786:1: ( '->' )
            {
            // InternalCYK.g:786:1: ( '->' )
            // InternalCYK.g:787:2: '->'
            {
             before(grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__1__Impl"


    // $ANTLR start "rule__Production__Group__2"
    // InternalCYK.g:796:1: rule__Production__Group__2 : rule__Production__Group__2__Impl rule__Production__Group__3 ;
    public final void rule__Production__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:800:1: ( rule__Production__Group__2__Impl rule__Production__Group__3 )
            // InternalCYK.g:801:2: rule__Production__Group__2__Impl rule__Production__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Production__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Production__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__2"


    // $ANTLR start "rule__Production__Group__2__Impl"
    // InternalCYK.g:808:1: rule__Production__Group__2__Impl : ( ( rule__Production__RightAssignment_2 ) ) ;
    public final void rule__Production__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:812:1: ( ( ( rule__Production__RightAssignment_2 ) ) )
            // InternalCYK.g:813:1: ( ( rule__Production__RightAssignment_2 ) )
            {
            // InternalCYK.g:813:1: ( ( rule__Production__RightAssignment_2 ) )
            // InternalCYK.g:814:2: ( rule__Production__RightAssignment_2 )
            {
             before(grammarAccess.getProductionAccess().getRightAssignment_2()); 
            // InternalCYK.g:815:2: ( rule__Production__RightAssignment_2 )
            // InternalCYK.g:815:3: rule__Production__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Production__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProductionAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__2__Impl"


    // $ANTLR start "rule__Production__Group__3"
    // InternalCYK.g:823:1: rule__Production__Group__3 : rule__Production__Group__3__Impl ;
    public final void rule__Production__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:827:1: ( rule__Production__Group__3__Impl )
            // InternalCYK.g:828:2: rule__Production__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Production__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__3"


    // $ANTLR start "rule__Production__Group__3__Impl"
    // InternalCYK.g:834:1: rule__Production__Group__3__Impl : ( ( rule__Production__Group_3__0 )* ) ;
    public final void rule__Production__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:838:1: ( ( ( rule__Production__Group_3__0 )* ) )
            // InternalCYK.g:839:1: ( ( rule__Production__Group_3__0 )* )
            {
            // InternalCYK.g:839:1: ( ( rule__Production__Group_3__0 )* )
            // InternalCYK.g:840:2: ( rule__Production__Group_3__0 )*
            {
             before(grammarAccess.getProductionAccess().getGroup_3()); 
            // InternalCYK.g:841:2: ( rule__Production__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==64) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCYK.g:841:3: rule__Production__Group_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Production__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProductionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group__3__Impl"


    // $ANTLR start "rule__Production__Group_3__0"
    // InternalCYK.g:850:1: rule__Production__Group_3__0 : rule__Production__Group_3__0__Impl rule__Production__Group_3__1 ;
    public final void rule__Production__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:854:1: ( rule__Production__Group_3__0__Impl rule__Production__Group_3__1 )
            // InternalCYK.g:855:2: rule__Production__Group_3__0__Impl rule__Production__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Production__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Production__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group_3__0"


    // $ANTLR start "rule__Production__Group_3__0__Impl"
    // InternalCYK.g:862:1: rule__Production__Group_3__0__Impl : ( ( ( '|' ) ) ( ( '|' )* ) ) ;
    public final void rule__Production__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:866:1: ( ( ( ( '|' ) ) ( ( '|' )* ) ) )
            // InternalCYK.g:867:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            {
            // InternalCYK.g:867:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            // InternalCYK.g:868:2: ( ( '|' ) ) ( ( '|' )* )
            {
            // InternalCYK.g:868:2: ( ( '|' ) )
            // InternalCYK.g:869:3: ( '|' )
            {
             before(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 
            // InternalCYK.g:870:3: ( '|' )
            // InternalCYK.g:870:4: '|'
            {
            match(input,64,FOLLOW_12); 

            }

             after(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 

            }

            // InternalCYK.g:873:2: ( ( '|' )* )
            // InternalCYK.g:874:3: ( '|' )*
            {
             before(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 
            // InternalCYK.g:875:3: ( '|' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==64) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCYK.g:875:4: '|'
            	    {
            	    match(input,64,FOLLOW_12); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group_3__0__Impl"


    // $ANTLR start "rule__Production__Group_3__1"
    // InternalCYK.g:884:1: rule__Production__Group_3__1 : rule__Production__Group_3__1__Impl ;
    public final void rule__Production__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:888:1: ( rule__Production__Group_3__1__Impl )
            // InternalCYK.g:889:2: rule__Production__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Production__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group_3__1"


    // $ANTLR start "rule__Production__Group_3__1__Impl"
    // InternalCYK.g:895:1: rule__Production__Group_3__1__Impl : ( ( rule__Production__RightAssignment_3_1 ) ) ;
    public final void rule__Production__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:899:1: ( ( ( rule__Production__RightAssignment_3_1 ) ) )
            // InternalCYK.g:900:1: ( ( rule__Production__RightAssignment_3_1 ) )
            {
            // InternalCYK.g:900:1: ( ( rule__Production__RightAssignment_3_1 ) )
            // InternalCYK.g:901:2: ( rule__Production__RightAssignment_3_1 )
            {
             before(grammarAccess.getProductionAccess().getRightAssignment_3_1()); 
            // InternalCYK.g:902:2: ( rule__Production__RightAssignment_3_1 )
            // InternalCYK.g:902:3: rule__Production__RightAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Production__RightAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProductionAccess().getRightAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__Group_3__1__Impl"


    // $ANTLR start "rule__Terminal__Group__0"
    // InternalCYK.g:911:1: rule__Terminal__Group__0 : rule__Terminal__Group__0__Impl rule__Terminal__Group__1 ;
    public final void rule__Terminal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:915:1: ( rule__Terminal__Group__0__Impl rule__Terminal__Group__1 )
            // InternalCYK.g:916:2: rule__Terminal__Group__0__Impl rule__Terminal__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Terminal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group__0"


    // $ANTLR start "rule__Terminal__Group__0__Impl"
    // InternalCYK.g:923:1: rule__Terminal__Group__0__Impl : ( () ) ;
    public final void rule__Terminal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:927:1: ( ( () ) )
            // InternalCYK.g:928:1: ( () )
            {
            // InternalCYK.g:928:1: ( () )
            // InternalCYK.g:929:2: ()
            {
             before(grammarAccess.getTerminalAccess().getTerminalAction_0()); 
            // InternalCYK.g:930:2: ()
            // InternalCYK.g:930:3: 
            {
            }

             after(grammarAccess.getTerminalAccess().getTerminalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group__0__Impl"


    // $ANTLR start "rule__Terminal__Group__1"
    // InternalCYK.g:938:1: rule__Terminal__Group__1 : rule__Terminal__Group__1__Impl ;
    public final void rule__Terminal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:942:1: ( rule__Terminal__Group__1__Impl )
            // InternalCYK.g:943:2: rule__Terminal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group__1"


    // $ANTLR start "rule__Terminal__Group__1__Impl"
    // InternalCYK.g:949:1: rule__Terminal__Group__1__Impl : ( ( rule__Terminal__TerminalsAssignment_1 ) ) ;
    public final void rule__Terminal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:953:1: ( ( ( rule__Terminal__TerminalsAssignment_1 ) ) )
            // InternalCYK.g:954:1: ( ( rule__Terminal__TerminalsAssignment_1 ) )
            {
            // InternalCYK.g:954:1: ( ( rule__Terminal__TerminalsAssignment_1 ) )
            // InternalCYK.g:955:2: ( rule__Terminal__TerminalsAssignment_1 )
            {
             before(grammarAccess.getTerminalAccess().getTerminalsAssignment_1()); 
            // InternalCYK.g:956:2: ( rule__Terminal__TerminalsAssignment_1 )
            // InternalCYK.g:956:3: rule__Terminal__TerminalsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__TerminalsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAccess().getTerminalsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group__1__Impl"


    // $ANTLR start "rule__NonTerminal__Group__0"
    // InternalCYK.g:965:1: rule__NonTerminal__Group__0 : rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1 ;
    public final void rule__NonTerminal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:969:1: ( rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1 )
            // InternalCYK.g:970:2: rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__NonTerminal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonTerminal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__Group__0"


    // $ANTLR start "rule__NonTerminal__Group__0__Impl"
    // InternalCYK.g:977:1: rule__NonTerminal__Group__0__Impl : ( () ) ;
    public final void rule__NonTerminal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:981:1: ( ( () ) )
            // InternalCYK.g:982:1: ( () )
            {
            // InternalCYK.g:982:1: ( () )
            // InternalCYK.g:983:2: ()
            {
             before(grammarAccess.getNonTerminalAccess().getNonTerminalAction_0()); 
            // InternalCYK.g:984:2: ()
            // InternalCYK.g:984:3: 
            {
            }

             after(grammarAccess.getNonTerminalAccess().getNonTerminalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__Group__0__Impl"


    // $ANTLR start "rule__NonTerminal__Group__1"
    // InternalCYK.g:992:1: rule__NonTerminal__Group__1 : rule__NonTerminal__Group__1__Impl ;
    public final void rule__NonTerminal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:996:1: ( rule__NonTerminal__Group__1__Impl )
            // InternalCYK.g:997:2: rule__NonTerminal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__Group__1"


    // $ANTLR start "rule__NonTerminal__Group__1__Impl"
    // InternalCYK.g:1003:1: rule__NonTerminal__Group__1__Impl : ( ( rule__NonTerminal__NonTerminalsAssignment_1 ) ) ;
    public final void rule__NonTerminal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1007:1: ( ( ( rule__NonTerminal__NonTerminalsAssignment_1 ) ) )
            // InternalCYK.g:1008:1: ( ( rule__NonTerminal__NonTerminalsAssignment_1 ) )
            {
            // InternalCYK.g:1008:1: ( ( rule__NonTerminal__NonTerminalsAssignment_1 ) )
            // InternalCYK.g:1009:2: ( rule__NonTerminal__NonTerminalsAssignment_1 )
            {
             before(grammarAccess.getNonTerminalAccess().getNonTerminalsAssignment_1()); 
            // InternalCYK.g:1010:2: ( rule__NonTerminal__NonTerminalsAssignment_1 )
            // InternalCYK.g:1010:3: rule__NonTerminal__NonTerminalsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__NonTerminalsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNonTerminalAccess().getNonTerminalsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__Group__1__Impl"


    // $ANTLR start "rule__Binary__Group__0"
    // InternalCYK.g:1019:1: rule__Binary__Group__0 : rule__Binary__Group__0__Impl rule__Binary__Group__1 ;
    public final void rule__Binary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1023:1: ( rule__Binary__Group__0__Impl rule__Binary__Group__1 )
            // InternalCYK.g:1024:2: rule__Binary__Group__0__Impl rule__Binary__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Binary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__0"


    // $ANTLR start "rule__Binary__Group__0__Impl"
    // InternalCYK.g:1031:1: rule__Binary__Group__0__Impl : ( () ) ;
    public final void rule__Binary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1035:1: ( ( () ) )
            // InternalCYK.g:1036:1: ( () )
            {
            // InternalCYK.g:1036:1: ( () )
            // InternalCYK.g:1037:2: ()
            {
             before(grammarAccess.getBinaryAccess().getBinaryAction_0()); 
            // InternalCYK.g:1038:2: ()
            // InternalCYK.g:1038:3: 
            {
            }

             after(grammarAccess.getBinaryAccess().getBinaryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__0__Impl"


    // $ANTLR start "rule__Binary__Group__1"
    // InternalCYK.g:1046:1: rule__Binary__Group__1 : rule__Binary__Group__1__Impl ;
    public final void rule__Binary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1050:1: ( rule__Binary__Group__1__Impl )
            // InternalCYK.g:1051:2: rule__Binary__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__1"


    // $ANTLR start "rule__Binary__Group__1__Impl"
    // InternalCYK.g:1057:1: rule__Binary__Group__1__Impl : ( ( rule__Binary__Group_1__0 ) ) ;
    public final void rule__Binary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1061:1: ( ( ( rule__Binary__Group_1__0 ) ) )
            // InternalCYK.g:1062:1: ( ( rule__Binary__Group_1__0 ) )
            {
            // InternalCYK.g:1062:1: ( ( rule__Binary__Group_1__0 ) )
            // InternalCYK.g:1063:2: ( rule__Binary__Group_1__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup_1()); 
            // InternalCYK.g:1064:2: ( rule__Binary__Group_1__0 )
            // InternalCYK.g:1064:3: rule__Binary__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__1__Impl"


    // $ANTLR start "rule__Binary__Group_1__0"
    // InternalCYK.g:1073:1: rule__Binary__Group_1__0 : rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 ;
    public final void rule__Binary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1077:1: ( rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 )
            // InternalCYK.g:1078:2: rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Binary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group_1__0"


    // $ANTLR start "rule__Binary__Group_1__0__Impl"
    // InternalCYK.g:1085:1: rule__Binary__Group_1__0__Impl : ( ( rule__Binary__FirstAssignment_1_0 ) ) ;
    public final void rule__Binary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1089:1: ( ( ( rule__Binary__FirstAssignment_1_0 ) ) )
            // InternalCYK.g:1090:1: ( ( rule__Binary__FirstAssignment_1_0 ) )
            {
            // InternalCYK.g:1090:1: ( ( rule__Binary__FirstAssignment_1_0 ) )
            // InternalCYK.g:1091:2: ( rule__Binary__FirstAssignment_1_0 )
            {
             before(grammarAccess.getBinaryAccess().getFirstAssignment_1_0()); 
            // InternalCYK.g:1092:2: ( rule__Binary__FirstAssignment_1_0 )
            // InternalCYK.g:1092:3: rule__Binary__FirstAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Binary__FirstAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getFirstAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group_1__0__Impl"


    // $ANTLR start "rule__Binary__Group_1__1"
    // InternalCYK.g:1100:1: rule__Binary__Group_1__1 : rule__Binary__Group_1__1__Impl ;
    public final void rule__Binary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1104:1: ( rule__Binary__Group_1__1__Impl )
            // InternalCYK.g:1105:2: rule__Binary__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group_1__1"


    // $ANTLR start "rule__Binary__Group_1__1__Impl"
    // InternalCYK.g:1111:1: rule__Binary__Group_1__1__Impl : ( ( rule__Binary__SecondAssignment_1_1 ) ) ;
    public final void rule__Binary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1115:1: ( ( ( rule__Binary__SecondAssignment_1_1 ) ) )
            // InternalCYK.g:1116:1: ( ( rule__Binary__SecondAssignment_1_1 ) )
            {
            // InternalCYK.g:1116:1: ( ( rule__Binary__SecondAssignment_1_1 ) )
            // InternalCYK.g:1117:2: ( rule__Binary__SecondAssignment_1_1 )
            {
             before(grammarAccess.getBinaryAccess().getSecondAssignment_1_1()); 
            // InternalCYK.g:1118:2: ( rule__Binary__SecondAssignment_1_1 )
            // InternalCYK.g:1118:3: rule__Binary__SecondAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Binary__SecondAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getSecondAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group_1__1__Impl"


    // $ANTLR start "rule__GFNC__WAssignment_2"
    // InternalCYK.g:1127:1: rule__GFNC__WAssignment_2 : ( ruleTerminal ) ;
    public final void rule__GFNC__WAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1131:1: ( ( ruleTerminal ) )
            // InternalCYK.g:1132:2: ( ruleTerminal )
            {
            // InternalCYK.g:1132:2: ( ruleTerminal )
            // InternalCYK.g:1133:3: ruleTerminal
            {
             before(grammarAccess.getGFNCAccess().getWTerminalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminal();

            state._fsp--;

             after(grammarAccess.getGFNCAccess().getWTerminalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__WAssignment_2"


    // $ANTLR start "rule__GFNC__WAssignment_3"
    // InternalCYK.g:1142:1: rule__GFNC__WAssignment_3 : ( ruleTerminal ) ;
    public final void rule__GFNC__WAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1146:1: ( ( ruleTerminal ) )
            // InternalCYK.g:1147:2: ( ruleTerminal )
            {
            // InternalCYK.g:1147:2: ( ruleTerminal )
            // InternalCYK.g:1148:3: ruleTerminal
            {
             before(grammarAccess.getGFNCAccess().getWTerminalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminal();

            state._fsp--;

             after(grammarAccess.getGFNCAccess().getWTerminalParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__WAssignment_3"


    // $ANTLR start "rule__GFNC__ProductionsAssignment_6"
    // InternalCYK.g:1157:1: rule__GFNC__ProductionsAssignment_6 : ( ruleProduction ) ;
    public final void rule__GFNC__ProductionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1161:1: ( ( ruleProduction ) )
            // InternalCYK.g:1162:2: ( ruleProduction )
            {
            // InternalCYK.g:1162:2: ( ruleProduction )
            // InternalCYK.g:1163:3: ruleProduction
            {
             before(grammarAccess.getGFNCAccess().getProductionsProductionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleProduction();

            state._fsp--;

             after(grammarAccess.getGFNCAccess().getProductionsProductionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GFNC__ProductionsAssignment_6"


    // $ANTLR start "rule__Production__LeftAssignment_0"
    // InternalCYK.g:1172:1: rule__Production__LeftAssignment_0 : ( ruleNonTerminal ) ;
    public final void rule__Production__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1176:1: ( ( ruleNonTerminal ) )
            // InternalCYK.g:1177:2: ( ruleNonTerminal )
            {
            // InternalCYK.g:1177:2: ( ruleNonTerminal )
            // InternalCYK.g:1178:3: ruleNonTerminal
            {
             before(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__LeftAssignment_0"


    // $ANTLR start "rule__Production__RightAssignment_2"
    // InternalCYK.g:1187:1: rule__Production__RightAssignment_2 : ( ruleRight ) ;
    public final void rule__Production__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1191:1: ( ( ruleRight ) )
            // InternalCYK.g:1192:2: ( ruleRight )
            {
            // InternalCYK.g:1192:2: ( ruleRight )
            // InternalCYK.g:1193:3: ruleRight
            {
             before(grammarAccess.getProductionAccess().getRightRightParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getProductionAccess().getRightRightParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__RightAssignment_2"


    // $ANTLR start "rule__Production__RightAssignment_3_1"
    // InternalCYK.g:1202:1: rule__Production__RightAssignment_3_1 : ( ruleRight ) ;
    public final void rule__Production__RightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1206:1: ( ( ruleRight ) )
            // InternalCYK.g:1207:2: ( ruleRight )
            {
            // InternalCYK.g:1207:2: ( ruleRight )
            // InternalCYK.g:1208:3: ruleRight
            {
             before(grammarAccess.getProductionAccess().getRightRightParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getProductionAccess().getRightRightParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Production__RightAssignment_3_1"


    // $ANTLR start "rule__Right__SimpleAssignment_0"
    // InternalCYK.g:1217:1: rule__Right__SimpleAssignment_0 : ( ruleTerminal ) ;
    public final void rule__Right__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1221:1: ( ( ruleTerminal ) )
            // InternalCYK.g:1222:2: ( ruleTerminal )
            {
            // InternalCYK.g:1222:2: ( ruleTerminal )
            // InternalCYK.g:1223:3: ruleTerminal
            {
             before(grammarAccess.getRightAccess().getSimpleTerminalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminal();

            state._fsp--;

             after(grammarAccess.getRightAccess().getSimpleTerminalParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__SimpleAssignment_0"


    // $ANTLR start "rule__Right__BinaryAssignment_1"
    // InternalCYK.g:1232:1: rule__Right__BinaryAssignment_1 : ( ruleBinary ) ;
    public final void rule__Right__BinaryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1236:1: ( ( ruleBinary ) )
            // InternalCYK.g:1237:2: ( ruleBinary )
            {
            // InternalCYK.g:1237:2: ( ruleBinary )
            // InternalCYK.g:1238:3: ruleBinary
            {
             before(grammarAccess.getRightAccess().getBinaryBinaryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getRightAccess().getBinaryBinaryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__BinaryAssignment_1"


    // $ANTLR start "rule__Right__LambdaAssignment_2"
    // InternalCYK.g:1247:1: rule__Right__LambdaAssignment_2 : ( ( '_' ) ) ;
    public final void rule__Right__LambdaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1251:1: ( ( ( '_' ) ) )
            // InternalCYK.g:1252:2: ( ( '_' ) )
            {
            // InternalCYK.g:1252:2: ( ( '_' ) )
            // InternalCYK.g:1253:3: ( '_' )
            {
             before(grammarAccess.getRightAccess().getLambda_Keyword_2_0()); 
            // InternalCYK.g:1254:3: ( '_' )
            // InternalCYK.g:1255:4: '_'
            {
             before(grammarAccess.getRightAccess().getLambda_Keyword_2_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getLambda_Keyword_2_0()); 

            }

             after(grammarAccess.getRightAccess().getLambda_Keyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__LambdaAssignment_2"


    // $ANTLR start "rule__Terminal__TerminalsAssignment_1"
    // InternalCYK.g:1266:1: rule__Terminal__TerminalsAssignment_1 : ( ( rule__Terminal__TerminalsAlternatives_1_0 ) ) ;
    public final void rule__Terminal__TerminalsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1270:1: ( ( ( rule__Terminal__TerminalsAlternatives_1_0 ) ) )
            // InternalCYK.g:1271:2: ( ( rule__Terminal__TerminalsAlternatives_1_0 ) )
            {
            // InternalCYK.g:1271:2: ( ( rule__Terminal__TerminalsAlternatives_1_0 ) )
            // InternalCYK.g:1272:3: ( rule__Terminal__TerminalsAlternatives_1_0 )
            {
             before(grammarAccess.getTerminalAccess().getTerminalsAlternatives_1_0()); 
            // InternalCYK.g:1273:3: ( rule__Terminal__TerminalsAlternatives_1_0 )
            // InternalCYK.g:1273:4: rule__Terminal__TerminalsAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__TerminalsAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAccess().getTerminalsAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__TerminalsAssignment_1"


    // $ANTLR start "rule__NonTerminal__NonTerminalsAssignment_1"
    // InternalCYK.g:1281:1: rule__NonTerminal__NonTerminalsAssignment_1 : ( ( rule__NonTerminal__NonTerminalsAlternatives_1_0 ) ) ;
    public final void rule__NonTerminal__NonTerminalsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1285:1: ( ( ( rule__NonTerminal__NonTerminalsAlternatives_1_0 ) ) )
            // InternalCYK.g:1286:2: ( ( rule__NonTerminal__NonTerminalsAlternatives_1_0 ) )
            {
            // InternalCYK.g:1286:2: ( ( rule__NonTerminal__NonTerminalsAlternatives_1_0 ) )
            // InternalCYK.g:1287:3: ( rule__NonTerminal__NonTerminalsAlternatives_1_0 )
            {
             before(grammarAccess.getNonTerminalAccess().getNonTerminalsAlternatives_1_0()); 
            // InternalCYK.g:1288:3: ( rule__NonTerminal__NonTerminalsAlternatives_1_0 )
            // InternalCYK.g:1288:4: rule__NonTerminal__NonTerminalsAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__NonTerminalsAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNonTerminalAccess().getNonTerminalsAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__NonTerminalsAssignment_1"


    // $ANTLR start "rule__Binary__FirstAssignment_1_0"
    // InternalCYK.g:1296:1: rule__Binary__FirstAssignment_1_0 : ( ruleNonTerminal ) ;
    public final void rule__Binary__FirstAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1300:1: ( ( ruleNonTerminal ) )
            // InternalCYK.g:1301:2: ( ruleNonTerminal )
            {
            // InternalCYK.g:1301:2: ( ruleNonTerminal )
            // InternalCYK.g:1302:3: ruleNonTerminal
            {
             before(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__FirstAssignment_1_0"


    // $ANTLR start "rule__Binary__SecondAssignment_1_1"
    // InternalCYK.g:1311:1: rule__Binary__SecondAssignment_1_1 : ( ruleNonTerminal ) ;
    public final void rule__Binary__SecondAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1315:1: ( ( ruleNonTerminal ) )
            // InternalCYK.g:1316:2: ( ruleNonTerminal )
            {
            // InternalCYK.g:1316:2: ( ruleNonTerminal )
            // InternalCYK.g:1317:3: ruleNonTerminal
            {
             before(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__SecondAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000FFFFFF800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000040FFFFFF800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000FFFFFF802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x3FFFFFF000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x3FFFFFF000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x3FFFFFFFFFFFF800L,0x0000000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});

}