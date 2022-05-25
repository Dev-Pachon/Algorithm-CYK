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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'v'", "'w'", "'x'", "'y'", "'z'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "':'", "'->'", "'|'"
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


    // $ANTLR start "entryRuleW"
    // InternalCYK.g:78:1: entryRuleW : ruleW EOF ;
    public final void entryRuleW() throws RecognitionException {
        try {
            // InternalCYK.g:79:1: ( ruleW EOF )
            // InternalCYK.g:80:1: ruleW EOF
            {
             before(grammarAccess.getWRule()); 
            pushFollow(FOLLOW_1);
            ruleW();

            state._fsp--;

             after(grammarAccess.getWRule()); 
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
    // $ANTLR end "entryRuleW"


    // $ANTLR start "ruleW"
    // InternalCYK.g:87:1: ruleW : ( ( rule__W__Alternatives ) ) ;
    public final void ruleW() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:91:2: ( ( ( rule__W__Alternatives ) ) )
            // InternalCYK.g:92:2: ( ( rule__W__Alternatives ) )
            {
            // InternalCYK.g:92:2: ( ( rule__W__Alternatives ) )
            // InternalCYK.g:93:3: ( rule__W__Alternatives )
            {
             before(grammarAccess.getWAccess().getAlternatives()); 
            // InternalCYK.g:94:3: ( rule__W__Alternatives )
            // InternalCYK.g:94:4: rule__W__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__W__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWAccess().getAlternatives()); 

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
    // $ANTLR end "ruleW"


    // $ANTLR start "entryRuleProduction"
    // InternalCYK.g:103:1: entryRuleProduction : ruleProduction EOF ;
    public final void entryRuleProduction() throws RecognitionException {
        try {
            // InternalCYK.g:104:1: ( ruleProduction EOF )
            // InternalCYK.g:105:1: ruleProduction EOF
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
    // InternalCYK.g:112:1: ruleProduction : ( ( rule__Production__Group__0 ) ) ;
    public final void ruleProduction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:116:2: ( ( ( rule__Production__Group__0 ) ) )
            // InternalCYK.g:117:2: ( ( rule__Production__Group__0 ) )
            {
            // InternalCYK.g:117:2: ( ( rule__Production__Group__0 ) )
            // InternalCYK.g:118:3: ( rule__Production__Group__0 )
            {
             before(grammarAccess.getProductionAccess().getGroup()); 
            // InternalCYK.g:119:3: ( rule__Production__Group__0 )
            // InternalCYK.g:119:4: rule__Production__Group__0
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
    // InternalCYK.g:128:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalCYK.g:129:1: ( ruleRight EOF )
            // InternalCYK.g:130:1: ruleRight EOF
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
    // InternalCYK.g:137:1: ruleRight : ( ( rule__Right__Alternatives ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:141:2: ( ( ( rule__Right__Alternatives ) ) )
            // InternalCYK.g:142:2: ( ( rule__Right__Alternatives ) )
            {
            // InternalCYK.g:142:2: ( ( rule__Right__Alternatives ) )
            // InternalCYK.g:143:3: ( rule__Right__Alternatives )
            {
             before(grammarAccess.getRightAccess().getAlternatives()); 
            // InternalCYK.g:144:3: ( rule__Right__Alternatives )
            // InternalCYK.g:144:4: rule__Right__Alternatives
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


    // $ANTLR start "entryRuleLambda"
    // InternalCYK.g:153:1: entryRuleLambda : ruleLambda EOF ;
    public final void entryRuleLambda() throws RecognitionException {
        try {
            // InternalCYK.g:154:1: ( ruleLambda EOF )
            // InternalCYK.g:155:1: ruleLambda EOF
            {
             before(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getLambdaRule()); 
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
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // InternalCYK.g:162:1: ruleLambda : ( '_' ) ;
    public final void ruleLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:166:2: ( ( '_' ) )
            // InternalCYK.g:167:2: ( '_' )
            {
            // InternalCYK.g:167:2: ( '_' )
            // InternalCYK.g:168:3: '_'
            {
             before(grammarAccess.getLambdaAccess().get_Keyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().get_Keyword()); 

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
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleTerminal"
    // InternalCYK.g:178:1: entryRuleTerminal : ruleTerminal EOF ;
    public final void entryRuleTerminal() throws RecognitionException {
        try {
            // InternalCYK.g:179:1: ( ruleTerminal EOF )
            // InternalCYK.g:180:1: ruleTerminal EOF
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
    // InternalCYK.g:187:1: ruleTerminal : ( ( rule__Terminal__Group__0 ) ) ;
    public final void ruleTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:191:2: ( ( ( rule__Terminal__Group__0 ) ) )
            // InternalCYK.g:192:2: ( ( rule__Terminal__Group__0 ) )
            {
            // InternalCYK.g:192:2: ( ( rule__Terminal__Group__0 ) )
            // InternalCYK.g:193:3: ( rule__Terminal__Group__0 )
            {
             before(grammarAccess.getTerminalAccess().getGroup()); 
            // InternalCYK.g:194:3: ( rule__Terminal__Group__0 )
            // InternalCYK.g:194:4: rule__Terminal__Group__0
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
    // InternalCYK.g:203:1: entryRuleNonTerminal : ruleNonTerminal EOF ;
    public final void entryRuleNonTerminal() throws RecognitionException {
        try {
            // InternalCYK.g:204:1: ( ruleNonTerminal EOF )
            // InternalCYK.g:205:1: ruleNonTerminal EOF
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
    // InternalCYK.g:212:1: ruleNonTerminal : ( ( rule__NonTerminal__Group__0 ) ) ;
    public final void ruleNonTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:216:2: ( ( ( rule__NonTerminal__Group__0 ) ) )
            // InternalCYK.g:217:2: ( ( rule__NonTerminal__Group__0 ) )
            {
            // InternalCYK.g:217:2: ( ( rule__NonTerminal__Group__0 ) )
            // InternalCYK.g:218:3: ( rule__NonTerminal__Group__0 )
            {
             before(grammarAccess.getNonTerminalAccess().getGroup()); 
            // InternalCYK.g:219:3: ( rule__NonTerminal__Group__0 )
            // InternalCYK.g:219:4: rule__NonTerminal__Group__0
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
    // InternalCYK.g:228:1: entryRuleBinary : ruleBinary EOF ;
    public final void entryRuleBinary() throws RecognitionException {
        try {
            // InternalCYK.g:229:1: ( ruleBinary EOF )
            // InternalCYK.g:230:1: ruleBinary EOF
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
    // InternalCYK.g:237:1: ruleBinary : ( ( rule__Binary__Group__0 ) ) ;
    public final void ruleBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:241:2: ( ( ( rule__Binary__Group__0 ) ) )
            // InternalCYK.g:242:2: ( ( rule__Binary__Group__0 ) )
            {
            // InternalCYK.g:242:2: ( ( rule__Binary__Group__0 ) )
            // InternalCYK.g:243:3: ( rule__Binary__Group__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup()); 
            // InternalCYK.g:244:3: ( rule__Binary__Group__0 )
            // InternalCYK.g:244:4: rule__Binary__Group__0
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


    // $ANTLR start "rule__W__Alternatives"
    // InternalCYK.g:252:1: rule__W__Alternatives : ( ( ( rule__W__LambdaAssignment_0 ) ) | ( ( rule__W__Group_1__0 ) ) );
    public final void rule__W__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:256:1: ( ( ( rule__W__LambdaAssignment_0 ) ) | ( ( rule__W__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=12 && LA1_0<=36)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCYK.g:257:2: ( ( rule__W__LambdaAssignment_0 ) )
                    {
                    // InternalCYK.g:257:2: ( ( rule__W__LambdaAssignment_0 ) )
                    // InternalCYK.g:258:3: ( rule__W__LambdaAssignment_0 )
                    {
                     before(grammarAccess.getWAccess().getLambdaAssignment_0()); 
                    // InternalCYK.g:259:3: ( rule__W__LambdaAssignment_0 )
                    // InternalCYK.g:259:4: rule__W__LambdaAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__W__LambdaAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWAccess().getLambdaAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:263:2: ( ( rule__W__Group_1__0 ) )
                    {
                    // InternalCYK.g:263:2: ( ( rule__W__Group_1__0 ) )
                    // InternalCYK.g:264:3: ( rule__W__Group_1__0 )
                    {
                     before(grammarAccess.getWAccess().getGroup_1()); 
                    // InternalCYK.g:265:3: ( rule__W__Group_1__0 )
                    // InternalCYK.g:265:4: rule__W__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__W__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWAccess().getGroup_1()); 

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
    // $ANTLR end "rule__W__Alternatives"


    // $ANTLR start "rule__Right__Alternatives"
    // InternalCYK.g:273:1: rule__Right__Alternatives : ( ( ( rule__Right__SimpleAssignment_0 ) ) | ( ( rule__Right__BinaryAssignment_1 ) ) | ( ( rule__Right__LambdaAssignment_2 ) ) );
    public final void rule__Right__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:277:1: ( ( ( rule__Right__SimpleAssignment_0 ) ) | ( ( rule__Right__BinaryAssignment_1 ) ) | ( ( rule__Right__LambdaAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
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
            case 36:
                {
                alt2=1;
                }
                break;
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
            case 62:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCYK.g:278:2: ( ( rule__Right__SimpleAssignment_0 ) )
                    {
                    // InternalCYK.g:278:2: ( ( rule__Right__SimpleAssignment_0 ) )
                    // InternalCYK.g:279:3: ( rule__Right__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getRightAccess().getSimpleAssignment_0()); 
                    // InternalCYK.g:280:3: ( rule__Right__SimpleAssignment_0 )
                    // InternalCYK.g:280:4: rule__Right__SimpleAssignment_0
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
                    // InternalCYK.g:284:2: ( ( rule__Right__BinaryAssignment_1 ) )
                    {
                    // InternalCYK.g:284:2: ( ( rule__Right__BinaryAssignment_1 ) )
                    // InternalCYK.g:285:3: ( rule__Right__BinaryAssignment_1 )
                    {
                     before(grammarAccess.getRightAccess().getBinaryAssignment_1()); 
                    // InternalCYK.g:286:3: ( rule__Right__BinaryAssignment_1 )
                    // InternalCYK.g:286:4: rule__Right__BinaryAssignment_1
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
                    // InternalCYK.g:290:2: ( ( rule__Right__LambdaAssignment_2 ) )
                    {
                    // InternalCYK.g:290:2: ( ( rule__Right__LambdaAssignment_2 ) )
                    // InternalCYK.g:291:3: ( rule__Right__LambdaAssignment_2 )
                    {
                     before(grammarAccess.getRightAccess().getLambdaAssignment_2()); 
                    // InternalCYK.g:292:3: ( rule__Right__LambdaAssignment_2 )
                    // InternalCYK.g:292:4: rule__Right__LambdaAssignment_2
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
    // InternalCYK.g:300:1: rule__Terminal__TerminalsAlternatives_1_0 : ( ( 'a' ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) | ( 'g' ) | ( 'h' ) | ( 'i' ) | ( 'j' ) | ( 'k' ) | ( 'l' ) | ( 'm' ) | ( 'n' ) | ( 'o' ) | ( 'p' ) | ( 'q' ) | ( 'r' ) | ( 's' ) | ( 't' ) | ( 'v' ) | ( 'w' ) | ( 'x' ) | ( 'y' ) | ( 'z' ) );
    public final void rule__Terminal__TerminalsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:304:1: ( ( 'a' ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) | ( 'g' ) | ( 'h' ) | ( 'i' ) | ( 'j' ) | ( 'k' ) | ( 'l' ) | ( 'm' ) | ( 'n' ) | ( 'o' ) | ( 'p' ) | ( 'q' ) | ( 'r' ) | ( 's' ) | ( 't' ) | ( 'v' ) | ( 'w' ) | ( 'x' ) | ( 'y' ) | ( 'z' ) )
            int alt3=25;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            case 19:
                {
                alt3=8;
                }
                break;
            case 20:
                {
                alt3=9;
                }
                break;
            case 21:
                {
                alt3=10;
                }
                break;
            case 22:
                {
                alt3=11;
                }
                break;
            case 23:
                {
                alt3=12;
                }
                break;
            case 24:
                {
                alt3=13;
                }
                break;
            case 25:
                {
                alt3=14;
                }
                break;
            case 26:
                {
                alt3=15;
                }
                break;
            case 27:
                {
                alt3=16;
                }
                break;
            case 28:
                {
                alt3=17;
                }
                break;
            case 29:
                {
                alt3=18;
                }
                break;
            case 30:
                {
                alt3=19;
                }
                break;
            case 31:
                {
                alt3=20;
                }
                break;
            case 32:
                {
                alt3=21;
                }
                break;
            case 33:
                {
                alt3=22;
                }
                break;
            case 34:
                {
                alt3=23;
                }
                break;
            case 35:
                {
                alt3=24;
                }
                break;
            case 36:
                {
                alt3=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCYK.g:305:2: ( 'a' )
                    {
                    // InternalCYK.g:305:2: ( 'a' )
                    // InternalCYK.g:306:3: 'a'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsAKeyword_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsAKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:311:2: ( 'b' )
                    {
                    // InternalCYK.g:311:2: ( 'b' )
                    // InternalCYK.g:312:3: 'b'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsBKeyword_1_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsBKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCYK.g:317:2: ( 'c' )
                    {
                    // InternalCYK.g:317:2: ( 'c' )
                    // InternalCYK.g:318:3: 'c'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsCKeyword_1_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsCKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCYK.g:323:2: ( 'd' )
                    {
                    // InternalCYK.g:323:2: ( 'd' )
                    // InternalCYK.g:324:3: 'd'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsDKeyword_1_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsDKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCYK.g:329:2: ( 'e' )
                    {
                    // InternalCYK.g:329:2: ( 'e' )
                    // InternalCYK.g:330:3: 'e'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsEKeyword_1_0_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsEKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCYK.g:335:2: ( 'f' )
                    {
                    // InternalCYK.g:335:2: ( 'f' )
                    // InternalCYK.g:336:3: 'f'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsFKeyword_1_0_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsFKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCYK.g:341:2: ( 'g' )
                    {
                    // InternalCYK.g:341:2: ( 'g' )
                    // InternalCYK.g:342:3: 'g'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsGKeyword_1_0_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsGKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCYK.g:347:2: ( 'h' )
                    {
                    // InternalCYK.g:347:2: ( 'h' )
                    // InternalCYK.g:348:3: 'h'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsHKeyword_1_0_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsHKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCYK.g:353:2: ( 'i' )
                    {
                    // InternalCYK.g:353:2: ( 'i' )
                    // InternalCYK.g:354:3: 'i'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsIKeyword_1_0_8()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsIKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCYK.g:359:2: ( 'j' )
                    {
                    // InternalCYK.g:359:2: ( 'j' )
                    // InternalCYK.g:360:3: 'j'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsJKeyword_1_0_9()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsJKeyword_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalCYK.g:365:2: ( 'k' )
                    {
                    // InternalCYK.g:365:2: ( 'k' )
                    // InternalCYK.g:366:3: 'k'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsKKeyword_1_0_10()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsKKeyword_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalCYK.g:371:2: ( 'l' )
                    {
                    // InternalCYK.g:371:2: ( 'l' )
                    // InternalCYK.g:372:3: 'l'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsLKeyword_1_0_11()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsLKeyword_1_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalCYK.g:377:2: ( 'm' )
                    {
                    // InternalCYK.g:377:2: ( 'm' )
                    // InternalCYK.g:378:3: 'm'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsMKeyword_1_0_12()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsMKeyword_1_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalCYK.g:383:2: ( 'n' )
                    {
                    // InternalCYK.g:383:2: ( 'n' )
                    // InternalCYK.g:384:3: 'n'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsNKeyword_1_0_13()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsNKeyword_1_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalCYK.g:389:2: ( 'o' )
                    {
                    // InternalCYK.g:389:2: ( 'o' )
                    // InternalCYK.g:390:3: 'o'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsOKeyword_1_0_14()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsOKeyword_1_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalCYK.g:395:2: ( 'p' )
                    {
                    // InternalCYK.g:395:2: ( 'p' )
                    // InternalCYK.g:396:3: 'p'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsPKeyword_1_0_15()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsPKeyword_1_0_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalCYK.g:401:2: ( 'q' )
                    {
                    // InternalCYK.g:401:2: ( 'q' )
                    // InternalCYK.g:402:3: 'q'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsQKeyword_1_0_16()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsQKeyword_1_0_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalCYK.g:407:2: ( 'r' )
                    {
                    // InternalCYK.g:407:2: ( 'r' )
                    // InternalCYK.g:408:3: 'r'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsRKeyword_1_0_17()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsRKeyword_1_0_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalCYK.g:413:2: ( 's' )
                    {
                    // InternalCYK.g:413:2: ( 's' )
                    // InternalCYK.g:414:3: 's'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsSKeyword_1_0_18()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsSKeyword_1_0_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalCYK.g:419:2: ( 't' )
                    {
                    // InternalCYK.g:419:2: ( 't' )
                    // InternalCYK.g:420:3: 't'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsTKeyword_1_0_19()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsTKeyword_1_0_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalCYK.g:425:2: ( 'v' )
                    {
                    // InternalCYK.g:425:2: ( 'v' )
                    // InternalCYK.g:426:3: 'v'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsVKeyword_1_0_20()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsVKeyword_1_0_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalCYK.g:431:2: ( 'w' )
                    {
                    // InternalCYK.g:431:2: ( 'w' )
                    // InternalCYK.g:432:3: 'w'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsWKeyword_1_0_21()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsWKeyword_1_0_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalCYK.g:437:2: ( 'x' )
                    {
                    // InternalCYK.g:437:2: ( 'x' )
                    // InternalCYK.g:438:3: 'x'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsXKeyword_1_0_22()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsXKeyword_1_0_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalCYK.g:443:2: ( 'y' )
                    {
                    // InternalCYK.g:443:2: ( 'y' )
                    // InternalCYK.g:444:3: 'y'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsYKeyword_1_0_23()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTerminalsYKeyword_1_0_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalCYK.g:449:2: ( 'z' )
                    {
                    // InternalCYK.g:449:2: ( 'z' )
                    // InternalCYK.g:450:3: 'z'
                    {
                     before(grammarAccess.getTerminalAccess().getTerminalsZKeyword_1_0_24()); 
                    match(input,36,FOLLOW_2); 
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
    // InternalCYK.g:459:1: rule__NonTerminal__NonTerminalsAlternatives_1_0 : ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'H' ) | ( 'I' ) | ( 'J' ) | ( 'K' ) | ( 'L' ) | ( 'M' ) | ( 'N' ) | ( 'O' ) | ( 'P' ) | ( 'Q' ) | ( 'R' ) | ( 'S' ) | ( 'T' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'X' ) | ( 'Y' ) | ( 'Z' ) );
    public final void rule__NonTerminal__NonTerminalsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:463:1: ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'H' ) | ( 'I' ) | ( 'J' ) | ( 'K' ) | ( 'L' ) | ( 'M' ) | ( 'N' ) | ( 'O' ) | ( 'P' ) | ( 'Q' ) | ( 'R' ) | ( 'S' ) | ( 'T' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'X' ) | ( 'Y' ) | ( 'Z' ) )
            int alt4=26;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt4=1;
                }
                break;
            case 38:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            case 40:
                {
                alt4=4;
                }
                break;
            case 41:
                {
                alt4=5;
                }
                break;
            case 42:
                {
                alt4=6;
                }
                break;
            case 43:
                {
                alt4=7;
                }
                break;
            case 44:
                {
                alt4=8;
                }
                break;
            case 45:
                {
                alt4=9;
                }
                break;
            case 46:
                {
                alt4=10;
                }
                break;
            case 47:
                {
                alt4=11;
                }
                break;
            case 48:
                {
                alt4=12;
                }
                break;
            case 49:
                {
                alt4=13;
                }
                break;
            case 50:
                {
                alt4=14;
                }
                break;
            case 51:
                {
                alt4=15;
                }
                break;
            case 52:
                {
                alt4=16;
                }
                break;
            case 53:
                {
                alt4=17;
                }
                break;
            case 54:
                {
                alt4=18;
                }
                break;
            case 55:
                {
                alt4=19;
                }
                break;
            case 56:
                {
                alt4=20;
                }
                break;
            case 57:
                {
                alt4=21;
                }
                break;
            case 58:
                {
                alt4=22;
                }
                break;
            case 59:
                {
                alt4=23;
                }
                break;
            case 60:
                {
                alt4=24;
                }
                break;
            case 61:
                {
                alt4=25;
                }
                break;
            case 62:
                {
                alt4=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCYK.g:464:2: ( 'A' )
                    {
                    // InternalCYK.g:464:2: ( 'A' )
                    // InternalCYK.g:465:3: 'A'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsAKeyword_1_0_0()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsAKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:470:2: ( 'B' )
                    {
                    // InternalCYK.g:470:2: ( 'B' )
                    // InternalCYK.g:471:3: 'B'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsBKeyword_1_0_1()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsBKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCYK.g:476:2: ( 'C' )
                    {
                    // InternalCYK.g:476:2: ( 'C' )
                    // InternalCYK.g:477:3: 'C'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsCKeyword_1_0_2()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsCKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCYK.g:482:2: ( 'D' )
                    {
                    // InternalCYK.g:482:2: ( 'D' )
                    // InternalCYK.g:483:3: 'D'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsDKeyword_1_0_3()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsDKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCYK.g:488:2: ( 'E' )
                    {
                    // InternalCYK.g:488:2: ( 'E' )
                    // InternalCYK.g:489:3: 'E'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsEKeyword_1_0_4()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsEKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCYK.g:494:2: ( 'F' )
                    {
                    // InternalCYK.g:494:2: ( 'F' )
                    // InternalCYK.g:495:3: 'F'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsFKeyword_1_0_5()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsFKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCYK.g:500:2: ( 'G' )
                    {
                    // InternalCYK.g:500:2: ( 'G' )
                    // InternalCYK.g:501:3: 'G'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsGKeyword_1_0_6()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsGKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCYK.g:506:2: ( 'H' )
                    {
                    // InternalCYK.g:506:2: ( 'H' )
                    // InternalCYK.g:507:3: 'H'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsHKeyword_1_0_7()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsHKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCYK.g:512:2: ( 'I' )
                    {
                    // InternalCYK.g:512:2: ( 'I' )
                    // InternalCYK.g:513:3: 'I'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsIKeyword_1_0_8()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsIKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCYK.g:518:2: ( 'J' )
                    {
                    // InternalCYK.g:518:2: ( 'J' )
                    // InternalCYK.g:519:3: 'J'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsJKeyword_1_0_9()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsJKeyword_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalCYK.g:524:2: ( 'K' )
                    {
                    // InternalCYK.g:524:2: ( 'K' )
                    // InternalCYK.g:525:3: 'K'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsKKeyword_1_0_10()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsKKeyword_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalCYK.g:530:2: ( 'L' )
                    {
                    // InternalCYK.g:530:2: ( 'L' )
                    // InternalCYK.g:531:3: 'L'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsLKeyword_1_0_11()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsLKeyword_1_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalCYK.g:536:2: ( 'M' )
                    {
                    // InternalCYK.g:536:2: ( 'M' )
                    // InternalCYK.g:537:3: 'M'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsMKeyword_1_0_12()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsMKeyword_1_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalCYK.g:542:2: ( 'N' )
                    {
                    // InternalCYK.g:542:2: ( 'N' )
                    // InternalCYK.g:543:3: 'N'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsNKeyword_1_0_13()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsNKeyword_1_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalCYK.g:548:2: ( 'O' )
                    {
                    // InternalCYK.g:548:2: ( 'O' )
                    // InternalCYK.g:549:3: 'O'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsOKeyword_1_0_14()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsOKeyword_1_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalCYK.g:554:2: ( 'P' )
                    {
                    // InternalCYK.g:554:2: ( 'P' )
                    // InternalCYK.g:555:3: 'P'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsPKeyword_1_0_15()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsPKeyword_1_0_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalCYK.g:560:2: ( 'Q' )
                    {
                    // InternalCYK.g:560:2: ( 'Q' )
                    // InternalCYK.g:561:3: 'Q'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsQKeyword_1_0_16()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsQKeyword_1_0_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalCYK.g:566:2: ( 'R' )
                    {
                    // InternalCYK.g:566:2: ( 'R' )
                    // InternalCYK.g:567:3: 'R'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsRKeyword_1_0_17()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsRKeyword_1_0_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalCYK.g:572:2: ( 'S' )
                    {
                    // InternalCYK.g:572:2: ( 'S' )
                    // InternalCYK.g:573:3: 'S'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsSKeyword_1_0_18()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsSKeyword_1_0_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalCYK.g:578:2: ( 'T' )
                    {
                    // InternalCYK.g:578:2: ( 'T' )
                    // InternalCYK.g:579:3: 'T'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsTKeyword_1_0_19()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsTKeyword_1_0_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalCYK.g:584:2: ( 'U' )
                    {
                    // InternalCYK.g:584:2: ( 'U' )
                    // InternalCYK.g:585:3: 'U'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsUKeyword_1_0_20()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsUKeyword_1_0_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalCYK.g:590:2: ( 'V' )
                    {
                    // InternalCYK.g:590:2: ( 'V' )
                    // InternalCYK.g:591:3: 'V'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsVKeyword_1_0_21()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsVKeyword_1_0_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalCYK.g:596:2: ( 'W' )
                    {
                    // InternalCYK.g:596:2: ( 'W' )
                    // InternalCYK.g:597:3: 'W'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsWKeyword_1_0_22()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsWKeyword_1_0_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalCYK.g:602:2: ( 'X' )
                    {
                    // InternalCYK.g:602:2: ( 'X' )
                    // InternalCYK.g:603:3: 'X'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsXKeyword_1_0_23()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsXKeyword_1_0_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalCYK.g:608:2: ( 'Y' )
                    {
                    // InternalCYK.g:608:2: ( 'Y' )
                    // InternalCYK.g:609:3: 'Y'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsYKeyword_1_0_24()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNonTerminalsYKeyword_1_0_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalCYK.g:614:2: ( 'Z' )
                    {
                    // InternalCYK.g:614:2: ( 'Z' )
                    // InternalCYK.g:615:3: 'Z'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNonTerminalsZKeyword_1_0_25()); 
                    match(input,62,FOLLOW_2); 
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
    // InternalCYK.g:624:1: rule__GFNC__Group__0 : rule__GFNC__Group__0__Impl rule__GFNC__Group__1 ;
    public final void rule__GFNC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:628:1: ( rule__GFNC__Group__0__Impl rule__GFNC__Group__1 )
            // InternalCYK.g:629:2: rule__GFNC__Group__0__Impl rule__GFNC__Group__1
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
    // InternalCYK.g:636:1: rule__GFNC__Group__0__Impl : ( 'W' ) ;
    public final void rule__GFNC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:640:1: ( ( 'W' ) )
            // InternalCYK.g:641:1: ( 'W' )
            {
            // InternalCYK.g:641:1: ( 'W' )
            // InternalCYK.g:642:2: 'W'
            {
             before(grammarAccess.getGFNCAccess().getWKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalCYK.g:651:1: rule__GFNC__Group__1 : rule__GFNC__Group__1__Impl rule__GFNC__Group__2 ;
    public final void rule__GFNC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:655:1: ( rule__GFNC__Group__1__Impl rule__GFNC__Group__2 )
            // InternalCYK.g:656:2: rule__GFNC__Group__1__Impl rule__GFNC__Group__2
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
    // InternalCYK.g:663:1: rule__GFNC__Group__1__Impl : ( ':' ) ;
    public final void rule__GFNC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:667:1: ( ( ':' ) )
            // InternalCYK.g:668:1: ( ':' )
            {
            // InternalCYK.g:668:1: ( ':' )
            // InternalCYK.g:669:2: ':'
            {
             before(grammarAccess.getGFNCAccess().getColonKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalCYK.g:678:1: rule__GFNC__Group__2 : rule__GFNC__Group__2__Impl rule__GFNC__Group__3 ;
    public final void rule__GFNC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:682:1: ( rule__GFNC__Group__2__Impl rule__GFNC__Group__3 )
            // InternalCYK.g:683:2: rule__GFNC__Group__2__Impl rule__GFNC__Group__3
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
    // InternalCYK.g:690:1: rule__GFNC__Group__2__Impl : ( ( rule__GFNC__WAssignment_2 ) ) ;
    public final void rule__GFNC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:694:1: ( ( ( rule__GFNC__WAssignment_2 ) ) )
            // InternalCYK.g:695:1: ( ( rule__GFNC__WAssignment_2 ) )
            {
            // InternalCYK.g:695:1: ( ( rule__GFNC__WAssignment_2 ) )
            // InternalCYK.g:696:2: ( rule__GFNC__WAssignment_2 )
            {
             before(grammarAccess.getGFNCAccess().getWAssignment_2()); 
            // InternalCYK.g:697:2: ( rule__GFNC__WAssignment_2 )
            // InternalCYK.g:697:3: rule__GFNC__WAssignment_2
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
    // InternalCYK.g:705:1: rule__GFNC__Group__3 : rule__GFNC__Group__3__Impl rule__GFNC__Group__4 ;
    public final void rule__GFNC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:709:1: ( rule__GFNC__Group__3__Impl rule__GFNC__Group__4 )
            // InternalCYK.g:710:2: rule__GFNC__Group__3__Impl rule__GFNC__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalCYK.g:717:1: rule__GFNC__Group__3__Impl : ( 'G' ) ;
    public final void rule__GFNC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:721:1: ( ( 'G' ) )
            // InternalCYK.g:722:1: ( 'G' )
            {
            // InternalCYK.g:722:1: ( 'G' )
            // InternalCYK.g:723:2: 'G'
            {
             before(grammarAccess.getGFNCAccess().getGKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGFNCAccess().getGKeyword_3()); 

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
    // InternalCYK.g:732:1: rule__GFNC__Group__4 : rule__GFNC__Group__4__Impl rule__GFNC__Group__5 ;
    public final void rule__GFNC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:736:1: ( rule__GFNC__Group__4__Impl rule__GFNC__Group__5 )
            // InternalCYK.g:737:2: rule__GFNC__Group__4__Impl rule__GFNC__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalCYK.g:744:1: rule__GFNC__Group__4__Impl : ( ':' ) ;
    public final void rule__GFNC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:748:1: ( ( ':' ) )
            // InternalCYK.g:749:1: ( ':' )
            {
            // InternalCYK.g:749:1: ( ':' )
            // InternalCYK.g:750:2: ':'
            {
             before(grammarAccess.getGFNCAccess().getColonKeyword_4()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getGFNCAccess().getColonKeyword_4()); 

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
    // InternalCYK.g:759:1: rule__GFNC__Group__5 : rule__GFNC__Group__5__Impl ;
    public final void rule__GFNC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:763:1: ( rule__GFNC__Group__5__Impl )
            // InternalCYK.g:764:2: rule__GFNC__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GFNC__Group__5__Impl();

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
    // InternalCYK.g:770:1: rule__GFNC__Group__5__Impl : ( ( rule__GFNC__ProductionsAssignment_5 )* ) ;
    public final void rule__GFNC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:774:1: ( ( ( rule__GFNC__ProductionsAssignment_5 )* ) )
            // InternalCYK.g:775:1: ( ( rule__GFNC__ProductionsAssignment_5 )* )
            {
            // InternalCYK.g:775:1: ( ( rule__GFNC__ProductionsAssignment_5 )* )
            // InternalCYK.g:776:2: ( rule__GFNC__ProductionsAssignment_5 )*
            {
             before(grammarAccess.getGFNCAccess().getProductionsAssignment_5()); 
            // InternalCYK.g:777:2: ( rule__GFNC__ProductionsAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=37 && LA5_0<=62)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCYK.g:777:3: rule__GFNC__ProductionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__GFNC__ProductionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGFNCAccess().getProductionsAssignment_5()); 

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


    // $ANTLR start "rule__W__Group_1__0"
    // InternalCYK.g:786:1: rule__W__Group_1__0 : rule__W__Group_1__0__Impl rule__W__Group_1__1 ;
    public final void rule__W__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:790:1: ( rule__W__Group_1__0__Impl rule__W__Group_1__1 )
            // InternalCYK.g:791:2: rule__W__Group_1__0__Impl rule__W__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__W__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__W__Group_1__1();

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
    // $ANTLR end "rule__W__Group_1__0"


    // $ANTLR start "rule__W__Group_1__0__Impl"
    // InternalCYK.g:798:1: rule__W__Group_1__0__Impl : ( ( rule__W__WAssignment_1_0 ) ) ;
    public final void rule__W__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:802:1: ( ( ( rule__W__WAssignment_1_0 ) ) )
            // InternalCYK.g:803:1: ( ( rule__W__WAssignment_1_0 ) )
            {
            // InternalCYK.g:803:1: ( ( rule__W__WAssignment_1_0 ) )
            // InternalCYK.g:804:2: ( rule__W__WAssignment_1_0 )
            {
             before(grammarAccess.getWAccess().getWAssignment_1_0()); 
            // InternalCYK.g:805:2: ( rule__W__WAssignment_1_0 )
            // InternalCYK.g:805:3: rule__W__WAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__W__WAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getWAccess().getWAssignment_1_0()); 

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
    // $ANTLR end "rule__W__Group_1__0__Impl"


    // $ANTLR start "rule__W__Group_1__1"
    // InternalCYK.g:813:1: rule__W__Group_1__1 : rule__W__Group_1__1__Impl ;
    public final void rule__W__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:817:1: ( rule__W__Group_1__1__Impl )
            // InternalCYK.g:818:2: rule__W__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__W__Group_1__1__Impl();

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
    // $ANTLR end "rule__W__Group_1__1"


    // $ANTLR start "rule__W__Group_1__1__Impl"
    // InternalCYK.g:824:1: rule__W__Group_1__1__Impl : ( ( rule__W__WAssignment_1_1 )* ) ;
    public final void rule__W__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:828:1: ( ( ( rule__W__WAssignment_1_1 )* ) )
            // InternalCYK.g:829:1: ( ( rule__W__WAssignment_1_1 )* )
            {
            // InternalCYK.g:829:1: ( ( rule__W__WAssignment_1_1 )* )
            // InternalCYK.g:830:2: ( rule__W__WAssignment_1_1 )*
            {
             before(grammarAccess.getWAccess().getWAssignment_1_1()); 
            // InternalCYK.g:831:2: ( rule__W__WAssignment_1_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=12 && LA6_0<=36)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCYK.g:831:3: rule__W__WAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__W__WAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getWAccess().getWAssignment_1_1()); 

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
    // $ANTLR end "rule__W__Group_1__1__Impl"


    // $ANTLR start "rule__Production__Group__0"
    // InternalCYK.g:840:1: rule__Production__Group__0 : rule__Production__Group__0__Impl rule__Production__Group__1 ;
    public final void rule__Production__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:844:1: ( rule__Production__Group__0__Impl rule__Production__Group__1 )
            // InternalCYK.g:845:2: rule__Production__Group__0__Impl rule__Production__Group__1
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
    // InternalCYK.g:852:1: rule__Production__Group__0__Impl : ( ( rule__Production__LeftAssignment_0 ) ) ;
    public final void rule__Production__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:856:1: ( ( ( rule__Production__LeftAssignment_0 ) ) )
            // InternalCYK.g:857:1: ( ( rule__Production__LeftAssignment_0 ) )
            {
            // InternalCYK.g:857:1: ( ( rule__Production__LeftAssignment_0 ) )
            // InternalCYK.g:858:2: ( rule__Production__LeftAssignment_0 )
            {
             before(grammarAccess.getProductionAccess().getLeftAssignment_0()); 
            // InternalCYK.g:859:2: ( rule__Production__LeftAssignment_0 )
            // InternalCYK.g:859:3: rule__Production__LeftAssignment_0
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
    // InternalCYK.g:867:1: rule__Production__Group__1 : rule__Production__Group__1__Impl rule__Production__Group__2 ;
    public final void rule__Production__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:871:1: ( rule__Production__Group__1__Impl rule__Production__Group__2 )
            // InternalCYK.g:872:2: rule__Production__Group__1__Impl rule__Production__Group__2
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
    // InternalCYK.g:879:1: rule__Production__Group__1__Impl : ( '->' ) ;
    public final void rule__Production__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:883:1: ( ( '->' ) )
            // InternalCYK.g:884:1: ( '->' )
            {
            // InternalCYK.g:884:1: ( '->' )
            // InternalCYK.g:885:2: '->'
            {
             before(grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,64,FOLLOW_2); 
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
    // InternalCYK.g:894:1: rule__Production__Group__2 : rule__Production__Group__2__Impl rule__Production__Group__3 ;
    public final void rule__Production__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:898:1: ( rule__Production__Group__2__Impl rule__Production__Group__3 )
            // InternalCYK.g:899:2: rule__Production__Group__2__Impl rule__Production__Group__3
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
    // InternalCYK.g:906:1: rule__Production__Group__2__Impl : ( ( rule__Production__RightAssignment_2 ) ) ;
    public final void rule__Production__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:910:1: ( ( ( rule__Production__RightAssignment_2 ) ) )
            // InternalCYK.g:911:1: ( ( rule__Production__RightAssignment_2 ) )
            {
            // InternalCYK.g:911:1: ( ( rule__Production__RightAssignment_2 ) )
            // InternalCYK.g:912:2: ( rule__Production__RightAssignment_2 )
            {
             before(grammarAccess.getProductionAccess().getRightAssignment_2()); 
            // InternalCYK.g:913:2: ( rule__Production__RightAssignment_2 )
            // InternalCYK.g:913:3: rule__Production__RightAssignment_2
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
    // InternalCYK.g:921:1: rule__Production__Group__3 : rule__Production__Group__3__Impl ;
    public final void rule__Production__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:925:1: ( rule__Production__Group__3__Impl )
            // InternalCYK.g:926:2: rule__Production__Group__3__Impl
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
    // InternalCYK.g:932:1: rule__Production__Group__3__Impl : ( ( rule__Production__Group_3__0 )* ) ;
    public final void rule__Production__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:936:1: ( ( ( rule__Production__Group_3__0 )* ) )
            // InternalCYK.g:937:1: ( ( rule__Production__Group_3__0 )* )
            {
            // InternalCYK.g:937:1: ( ( rule__Production__Group_3__0 )* )
            // InternalCYK.g:938:2: ( rule__Production__Group_3__0 )*
            {
             before(grammarAccess.getProductionAccess().getGroup_3()); 
            // InternalCYK.g:939:2: ( rule__Production__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==65) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCYK.g:939:3: rule__Production__Group_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Production__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalCYK.g:948:1: rule__Production__Group_3__0 : rule__Production__Group_3__0__Impl rule__Production__Group_3__1 ;
    public final void rule__Production__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:952:1: ( rule__Production__Group_3__0__Impl rule__Production__Group_3__1 )
            // InternalCYK.g:953:2: rule__Production__Group_3__0__Impl rule__Production__Group_3__1
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
    // InternalCYK.g:960:1: rule__Production__Group_3__0__Impl : ( ( ( '|' ) ) ( ( '|' )* ) ) ;
    public final void rule__Production__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:964:1: ( ( ( ( '|' ) ) ( ( '|' )* ) ) )
            // InternalCYK.g:965:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            {
            // InternalCYK.g:965:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            // InternalCYK.g:966:2: ( ( '|' ) ) ( ( '|' )* )
            {
            // InternalCYK.g:966:2: ( ( '|' ) )
            // InternalCYK.g:967:3: ( '|' )
            {
             before(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 
            // InternalCYK.g:968:3: ( '|' )
            // InternalCYK.g:968:4: '|'
            {
            match(input,65,FOLLOW_12); 

            }

             after(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 

            }

            // InternalCYK.g:971:2: ( ( '|' )* )
            // InternalCYK.g:972:3: ( '|' )*
            {
             before(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 
            // InternalCYK.g:973:3: ( '|' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==65) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCYK.g:973:4: '|'
            	    {
            	    match(input,65,FOLLOW_12); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalCYK.g:982:1: rule__Production__Group_3__1 : rule__Production__Group_3__1__Impl ;
    public final void rule__Production__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:986:1: ( rule__Production__Group_3__1__Impl )
            // InternalCYK.g:987:2: rule__Production__Group_3__1__Impl
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
    // InternalCYK.g:993:1: rule__Production__Group_3__1__Impl : ( ( rule__Production__RightAssignment_3_1 ) ) ;
    public final void rule__Production__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:997:1: ( ( ( rule__Production__RightAssignment_3_1 ) ) )
            // InternalCYK.g:998:1: ( ( rule__Production__RightAssignment_3_1 ) )
            {
            // InternalCYK.g:998:1: ( ( rule__Production__RightAssignment_3_1 ) )
            // InternalCYK.g:999:2: ( rule__Production__RightAssignment_3_1 )
            {
             before(grammarAccess.getProductionAccess().getRightAssignment_3_1()); 
            // InternalCYK.g:1000:2: ( rule__Production__RightAssignment_3_1 )
            // InternalCYK.g:1000:3: rule__Production__RightAssignment_3_1
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
    // InternalCYK.g:1009:1: rule__Terminal__Group__0 : rule__Terminal__Group__0__Impl rule__Terminal__Group__1 ;
    public final void rule__Terminal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1013:1: ( rule__Terminal__Group__0__Impl rule__Terminal__Group__1 )
            // InternalCYK.g:1014:2: rule__Terminal__Group__0__Impl rule__Terminal__Group__1
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
    // InternalCYK.g:1021:1: rule__Terminal__Group__0__Impl : ( () ) ;
    public final void rule__Terminal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1025:1: ( ( () ) )
            // InternalCYK.g:1026:1: ( () )
            {
            // InternalCYK.g:1026:1: ( () )
            // InternalCYK.g:1027:2: ()
            {
             before(grammarAccess.getTerminalAccess().getTerminalAction_0()); 
            // InternalCYK.g:1028:2: ()
            // InternalCYK.g:1028:3: 
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
    // InternalCYK.g:1036:1: rule__Terminal__Group__1 : rule__Terminal__Group__1__Impl ;
    public final void rule__Terminal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1040:1: ( rule__Terminal__Group__1__Impl )
            // InternalCYK.g:1041:2: rule__Terminal__Group__1__Impl
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
    // InternalCYK.g:1047:1: rule__Terminal__Group__1__Impl : ( ( rule__Terminal__TerminalsAssignment_1 ) ) ;
    public final void rule__Terminal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1051:1: ( ( ( rule__Terminal__TerminalsAssignment_1 ) ) )
            // InternalCYK.g:1052:1: ( ( rule__Terminal__TerminalsAssignment_1 ) )
            {
            // InternalCYK.g:1052:1: ( ( rule__Terminal__TerminalsAssignment_1 ) )
            // InternalCYK.g:1053:2: ( rule__Terminal__TerminalsAssignment_1 )
            {
             before(grammarAccess.getTerminalAccess().getTerminalsAssignment_1()); 
            // InternalCYK.g:1054:2: ( rule__Terminal__TerminalsAssignment_1 )
            // InternalCYK.g:1054:3: rule__Terminal__TerminalsAssignment_1
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
    // InternalCYK.g:1063:1: rule__NonTerminal__Group__0 : rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1 ;
    public final void rule__NonTerminal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1067:1: ( rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1 )
            // InternalCYK.g:1068:2: rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCYK.g:1075:1: rule__NonTerminal__Group__0__Impl : ( () ) ;
    public final void rule__NonTerminal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1079:1: ( ( () ) )
            // InternalCYK.g:1080:1: ( () )
            {
            // InternalCYK.g:1080:1: ( () )
            // InternalCYK.g:1081:2: ()
            {
             before(grammarAccess.getNonTerminalAccess().getNonTerminalAction_0()); 
            // InternalCYK.g:1082:2: ()
            // InternalCYK.g:1082:3: 
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
    // InternalCYK.g:1090:1: rule__NonTerminal__Group__1 : rule__NonTerminal__Group__1__Impl ;
    public final void rule__NonTerminal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1094:1: ( rule__NonTerminal__Group__1__Impl )
            // InternalCYK.g:1095:2: rule__NonTerminal__Group__1__Impl
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
    // InternalCYK.g:1101:1: rule__NonTerminal__Group__1__Impl : ( ( rule__NonTerminal__NonTerminalsAssignment_1 ) ) ;
    public final void rule__NonTerminal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1105:1: ( ( ( rule__NonTerminal__NonTerminalsAssignment_1 ) ) )
            // InternalCYK.g:1106:1: ( ( rule__NonTerminal__NonTerminalsAssignment_1 ) )
            {
            // InternalCYK.g:1106:1: ( ( rule__NonTerminal__NonTerminalsAssignment_1 ) )
            // InternalCYK.g:1107:2: ( rule__NonTerminal__NonTerminalsAssignment_1 )
            {
             before(grammarAccess.getNonTerminalAccess().getNonTerminalsAssignment_1()); 
            // InternalCYK.g:1108:2: ( rule__NonTerminal__NonTerminalsAssignment_1 )
            // InternalCYK.g:1108:3: rule__NonTerminal__NonTerminalsAssignment_1
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
    // InternalCYK.g:1117:1: rule__Binary__Group__0 : rule__Binary__Group__0__Impl rule__Binary__Group__1 ;
    public final void rule__Binary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1121:1: ( rule__Binary__Group__0__Impl rule__Binary__Group__1 )
            // InternalCYK.g:1122:2: rule__Binary__Group__0__Impl rule__Binary__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCYK.g:1129:1: rule__Binary__Group__0__Impl : ( () ) ;
    public final void rule__Binary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1133:1: ( ( () ) )
            // InternalCYK.g:1134:1: ( () )
            {
            // InternalCYK.g:1134:1: ( () )
            // InternalCYK.g:1135:2: ()
            {
             before(grammarAccess.getBinaryAccess().getBinaryAction_0()); 
            // InternalCYK.g:1136:2: ()
            // InternalCYK.g:1136:3: 
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
    // InternalCYK.g:1144:1: rule__Binary__Group__1 : rule__Binary__Group__1__Impl ;
    public final void rule__Binary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1148:1: ( rule__Binary__Group__1__Impl )
            // InternalCYK.g:1149:2: rule__Binary__Group__1__Impl
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
    // InternalCYK.g:1155:1: rule__Binary__Group__1__Impl : ( ( rule__Binary__Group_1__0 ) ) ;
    public final void rule__Binary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1159:1: ( ( ( rule__Binary__Group_1__0 ) ) )
            // InternalCYK.g:1160:1: ( ( rule__Binary__Group_1__0 ) )
            {
            // InternalCYK.g:1160:1: ( ( rule__Binary__Group_1__0 ) )
            // InternalCYK.g:1161:2: ( rule__Binary__Group_1__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup_1()); 
            // InternalCYK.g:1162:2: ( rule__Binary__Group_1__0 )
            // InternalCYK.g:1162:3: rule__Binary__Group_1__0
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
    // InternalCYK.g:1171:1: rule__Binary__Group_1__0 : rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 ;
    public final void rule__Binary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1175:1: ( rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 )
            // InternalCYK.g:1176:2: rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCYK.g:1183:1: rule__Binary__Group_1__0__Impl : ( ( rule__Binary__FirstAssignment_1_0 ) ) ;
    public final void rule__Binary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1187:1: ( ( ( rule__Binary__FirstAssignment_1_0 ) ) )
            // InternalCYK.g:1188:1: ( ( rule__Binary__FirstAssignment_1_0 ) )
            {
            // InternalCYK.g:1188:1: ( ( rule__Binary__FirstAssignment_1_0 ) )
            // InternalCYK.g:1189:2: ( rule__Binary__FirstAssignment_1_0 )
            {
             before(grammarAccess.getBinaryAccess().getFirstAssignment_1_0()); 
            // InternalCYK.g:1190:2: ( rule__Binary__FirstAssignment_1_0 )
            // InternalCYK.g:1190:3: rule__Binary__FirstAssignment_1_0
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
    // InternalCYK.g:1198:1: rule__Binary__Group_1__1 : rule__Binary__Group_1__1__Impl ;
    public final void rule__Binary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1202:1: ( rule__Binary__Group_1__1__Impl )
            // InternalCYK.g:1203:2: rule__Binary__Group_1__1__Impl
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
    // InternalCYK.g:1209:1: rule__Binary__Group_1__1__Impl : ( ( rule__Binary__SecondAssignment_1_1 ) ) ;
    public final void rule__Binary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1213:1: ( ( ( rule__Binary__SecondAssignment_1_1 ) ) )
            // InternalCYK.g:1214:1: ( ( rule__Binary__SecondAssignment_1_1 ) )
            {
            // InternalCYK.g:1214:1: ( ( rule__Binary__SecondAssignment_1_1 ) )
            // InternalCYK.g:1215:2: ( rule__Binary__SecondAssignment_1_1 )
            {
             before(grammarAccess.getBinaryAccess().getSecondAssignment_1_1()); 
            // InternalCYK.g:1216:2: ( rule__Binary__SecondAssignment_1_1 )
            // InternalCYK.g:1216:3: rule__Binary__SecondAssignment_1_1
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
    // InternalCYK.g:1225:1: rule__GFNC__WAssignment_2 : ( ruleW ) ;
    public final void rule__GFNC__WAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1229:1: ( ( ruleW ) )
            // InternalCYK.g:1230:2: ( ruleW )
            {
            // InternalCYK.g:1230:2: ( ruleW )
            // InternalCYK.g:1231:3: ruleW
            {
             before(grammarAccess.getGFNCAccess().getWWParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleW();

            state._fsp--;

             after(grammarAccess.getGFNCAccess().getWWParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__GFNC__ProductionsAssignment_5"
    // InternalCYK.g:1240:1: rule__GFNC__ProductionsAssignment_5 : ( ruleProduction ) ;
    public final void rule__GFNC__ProductionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1244:1: ( ( ruleProduction ) )
            // InternalCYK.g:1245:2: ( ruleProduction )
            {
            // InternalCYK.g:1245:2: ( ruleProduction )
            // InternalCYK.g:1246:3: ruleProduction
            {
             before(grammarAccess.getGFNCAccess().getProductionsProductionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleProduction();

            state._fsp--;

             after(grammarAccess.getGFNCAccess().getProductionsProductionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__GFNC__ProductionsAssignment_5"


    // $ANTLR start "rule__W__LambdaAssignment_0"
    // InternalCYK.g:1255:1: rule__W__LambdaAssignment_0 : ( ruleLambda ) ;
    public final void rule__W__LambdaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1259:1: ( ( ruleLambda ) )
            // InternalCYK.g:1260:2: ( ruleLambda )
            {
            // InternalCYK.g:1260:2: ( ruleLambda )
            // InternalCYK.g:1261:3: ruleLambda
            {
             before(grammarAccess.getWAccess().getLambdaLambdaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getWAccess().getLambdaLambdaParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__W__LambdaAssignment_0"


    // $ANTLR start "rule__W__WAssignment_1_0"
    // InternalCYK.g:1270:1: rule__W__WAssignment_1_0 : ( ruleTerminal ) ;
    public final void rule__W__WAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1274:1: ( ( ruleTerminal ) )
            // InternalCYK.g:1275:2: ( ruleTerminal )
            {
            // InternalCYK.g:1275:2: ( ruleTerminal )
            // InternalCYK.g:1276:3: ruleTerminal
            {
             before(grammarAccess.getWAccess().getWTerminalParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminal();

            state._fsp--;

             after(grammarAccess.getWAccess().getWTerminalParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__W__WAssignment_1_0"


    // $ANTLR start "rule__W__WAssignment_1_1"
    // InternalCYK.g:1285:1: rule__W__WAssignment_1_1 : ( ruleTerminal ) ;
    public final void rule__W__WAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1289:1: ( ( ruleTerminal ) )
            // InternalCYK.g:1290:2: ( ruleTerminal )
            {
            // InternalCYK.g:1290:2: ( ruleTerminal )
            // InternalCYK.g:1291:3: ruleTerminal
            {
             before(grammarAccess.getWAccess().getWTerminalParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminal();

            state._fsp--;

             after(grammarAccess.getWAccess().getWTerminalParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__W__WAssignment_1_1"


    // $ANTLR start "rule__Production__LeftAssignment_0"
    // InternalCYK.g:1300:1: rule__Production__LeftAssignment_0 : ( ruleNonTerminal ) ;
    public final void rule__Production__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1304:1: ( ( ruleNonTerminal ) )
            // InternalCYK.g:1305:2: ( ruleNonTerminal )
            {
            // InternalCYK.g:1305:2: ( ruleNonTerminal )
            // InternalCYK.g:1306:3: ruleNonTerminal
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
    // InternalCYK.g:1315:1: rule__Production__RightAssignment_2 : ( ruleRight ) ;
    public final void rule__Production__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1319:1: ( ( ruleRight ) )
            // InternalCYK.g:1320:2: ( ruleRight )
            {
            // InternalCYK.g:1320:2: ( ruleRight )
            // InternalCYK.g:1321:3: ruleRight
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
    // InternalCYK.g:1330:1: rule__Production__RightAssignment_3_1 : ( ruleRight ) ;
    public final void rule__Production__RightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1334:1: ( ( ruleRight ) )
            // InternalCYK.g:1335:2: ( ruleRight )
            {
            // InternalCYK.g:1335:2: ( ruleRight )
            // InternalCYK.g:1336:3: ruleRight
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
    // InternalCYK.g:1345:1: rule__Right__SimpleAssignment_0 : ( ruleTerminal ) ;
    public final void rule__Right__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1349:1: ( ( ruleTerminal ) )
            // InternalCYK.g:1350:2: ( ruleTerminal )
            {
            // InternalCYK.g:1350:2: ( ruleTerminal )
            // InternalCYK.g:1351:3: ruleTerminal
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
    // InternalCYK.g:1360:1: rule__Right__BinaryAssignment_1 : ( ruleBinary ) ;
    public final void rule__Right__BinaryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1364:1: ( ( ruleBinary ) )
            // InternalCYK.g:1365:2: ( ruleBinary )
            {
            // InternalCYK.g:1365:2: ( ruleBinary )
            // InternalCYK.g:1366:3: ruleBinary
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
    // InternalCYK.g:1375:1: rule__Right__LambdaAssignment_2 : ( ruleLambda ) ;
    public final void rule__Right__LambdaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1379:1: ( ( ruleLambda ) )
            // InternalCYK.g:1380:2: ( ruleLambda )
            {
            // InternalCYK.g:1380:2: ( ruleLambda )
            // InternalCYK.g:1381:3: ruleLambda
            {
             before(grammarAccess.getRightAccess().getLambdaLambdaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getRightAccess().getLambdaLambdaParserRuleCall_2_0()); 

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
    // InternalCYK.g:1390:1: rule__Terminal__TerminalsAssignment_1 : ( ( rule__Terminal__TerminalsAlternatives_1_0 ) ) ;
    public final void rule__Terminal__TerminalsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1394:1: ( ( ( rule__Terminal__TerminalsAlternatives_1_0 ) ) )
            // InternalCYK.g:1395:2: ( ( rule__Terminal__TerminalsAlternatives_1_0 ) )
            {
            // InternalCYK.g:1395:2: ( ( rule__Terminal__TerminalsAlternatives_1_0 ) )
            // InternalCYK.g:1396:3: ( rule__Terminal__TerminalsAlternatives_1_0 )
            {
             before(grammarAccess.getTerminalAccess().getTerminalsAlternatives_1_0()); 
            // InternalCYK.g:1397:3: ( rule__Terminal__TerminalsAlternatives_1_0 )
            // InternalCYK.g:1397:4: rule__Terminal__TerminalsAlternatives_1_0
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
    // InternalCYK.g:1405:1: rule__NonTerminal__NonTerminalsAssignment_1 : ( ( rule__NonTerminal__NonTerminalsAlternatives_1_0 ) ) ;
    public final void rule__NonTerminal__NonTerminalsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1409:1: ( ( ( rule__NonTerminal__NonTerminalsAlternatives_1_0 ) ) )
            // InternalCYK.g:1410:2: ( ( rule__NonTerminal__NonTerminalsAlternatives_1_0 ) )
            {
            // InternalCYK.g:1410:2: ( ( rule__NonTerminal__NonTerminalsAlternatives_1_0 ) )
            // InternalCYK.g:1411:3: ( rule__NonTerminal__NonTerminalsAlternatives_1_0 )
            {
             before(grammarAccess.getNonTerminalAccess().getNonTerminalsAlternatives_1_0()); 
            // InternalCYK.g:1412:3: ( rule__NonTerminal__NonTerminalsAlternatives_1_0 )
            // InternalCYK.g:1412:4: rule__NonTerminal__NonTerminalsAlternatives_1_0
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
    // InternalCYK.g:1420:1: rule__Binary__FirstAssignment_1_0 : ( ruleNonTerminal ) ;
    public final void rule__Binary__FirstAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1424:1: ( ( ruleNonTerminal ) )
            // InternalCYK.g:1425:2: ( ruleNonTerminal )
            {
            // InternalCYK.g:1425:2: ( ruleNonTerminal )
            // InternalCYK.g:1426:3: ruleNonTerminal
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
    // InternalCYK.g:1435:1: rule__Binary__SecondAssignment_1_1 : ( ruleNonTerminal ) ;
    public final void rule__Binary__SecondAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1439:1: ( ( ruleNonTerminal ) )
            // InternalCYK.g:1440:2: ( ruleNonTerminal )
            {
            // InternalCYK.g:1440:2: ( ruleNonTerminal )
            // InternalCYK.g:1441:3: ruleNonTerminal
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001FFFFFF800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x7FFFFFE000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x7FFFFFE000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001FFFFFF802L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x7FFFFFFFFFFFF800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});

}