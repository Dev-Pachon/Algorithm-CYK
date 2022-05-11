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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'v'", "'w'", "'x'", "'y'", "'z'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'->'", "'|'", "'S'", "'_'", "'a'", "'A'"
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


    // $ANTLR start "entryRuleInitial"
    // InternalCYK.g:78:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // InternalCYK.g:79:1: ( ruleInitial EOF )
            // InternalCYK.g:80:1: ruleInitial EOF
            {
             before(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getInitialRule()); 
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
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalCYK.g:87:1: ruleInitial : ( ( rule__Initial__Group__0 ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:91:2: ( ( ( rule__Initial__Group__0 ) ) )
            // InternalCYK.g:92:2: ( ( rule__Initial__Group__0 ) )
            {
            // InternalCYK.g:92:2: ( ( rule__Initial__Group__0 ) )
            // InternalCYK.g:93:3: ( rule__Initial__Group__0 )
            {
             before(grammarAccess.getInitialAccess().getGroup()); 
            // InternalCYK.g:94:3: ( rule__Initial__Group__0 )
            // InternalCYK.g:94:4: rule__Initial__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getGroup()); 

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
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleLambda"
    // InternalCYK.g:103:1: entryRuleLambda : ruleLambda EOF ;
    public final void entryRuleLambda() throws RecognitionException {
        try {
            // InternalCYK.g:104:1: ( ruleLambda EOF )
            // InternalCYK.g:105:1: ruleLambda EOF
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
    // InternalCYK.g:112:1: ruleLambda : ( ( rule__Lambda__Alternatives ) ) ;
    public final void ruleLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:116:2: ( ( ( rule__Lambda__Alternatives ) ) )
            // InternalCYK.g:117:2: ( ( rule__Lambda__Alternatives ) )
            {
            // InternalCYK.g:117:2: ( ( rule__Lambda__Alternatives ) )
            // InternalCYK.g:118:3: ( rule__Lambda__Alternatives )
            {
             before(grammarAccess.getLambdaAccess().getAlternatives()); 
            // InternalCYK.g:119:3: ( rule__Lambda__Alternatives )
            // InternalCYK.g:119:4: rule__Lambda__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleProduction"
    // InternalCYK.g:128:1: entryRuleProduction : ruleProduction EOF ;
    public final void entryRuleProduction() throws RecognitionException {
        try {
            // InternalCYK.g:129:1: ( ruleProduction EOF )
            // InternalCYK.g:130:1: ruleProduction EOF
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
    // InternalCYK.g:137:1: ruleProduction : ( ( rule__Production__Group__0 ) ) ;
    public final void ruleProduction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:141:2: ( ( ( rule__Production__Group__0 ) ) )
            // InternalCYK.g:142:2: ( ( rule__Production__Group__0 ) )
            {
            // InternalCYK.g:142:2: ( ( rule__Production__Group__0 ) )
            // InternalCYK.g:143:3: ( rule__Production__Group__0 )
            {
             before(grammarAccess.getProductionAccess().getGroup()); 
            // InternalCYK.g:144:3: ( rule__Production__Group__0 )
            // InternalCYK.g:144:4: rule__Production__Group__0
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
    // InternalCYK.g:153:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalCYK.g:154:1: ( ruleRight EOF )
            // InternalCYK.g:155:1: ruleRight EOF
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
    // InternalCYK.g:162:1: ruleRight : ( ( rule__Right__Alternatives ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:166:2: ( ( ( rule__Right__Alternatives ) ) )
            // InternalCYK.g:167:2: ( ( rule__Right__Alternatives ) )
            {
            // InternalCYK.g:167:2: ( ( rule__Right__Alternatives ) )
            // InternalCYK.g:168:3: ( rule__Right__Alternatives )
            {
             before(grammarAccess.getRightAccess().getAlternatives()); 
            // InternalCYK.g:169:3: ( rule__Right__Alternatives )
            // InternalCYK.g:169:4: rule__Right__Alternatives
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


    // $ANTLR start "entryRuleSimple"
    // InternalCYK.g:178:1: entryRuleSimple : ruleSimple EOF ;
    public final void entryRuleSimple() throws RecognitionException {
        try {
            // InternalCYK.g:179:1: ( ruleSimple EOF )
            // InternalCYK.g:180:1: ruleSimple EOF
            {
             before(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getSimpleRule()); 
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
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalCYK.g:187:1: ruleSimple : ( ( rule__Simple__Alternatives ) ) ;
    public final void ruleSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:191:2: ( ( ( rule__Simple__Alternatives ) ) )
            // InternalCYK.g:192:2: ( ( rule__Simple__Alternatives ) )
            {
            // InternalCYK.g:192:2: ( ( rule__Simple__Alternatives ) )
            // InternalCYK.g:193:3: ( rule__Simple__Alternatives )
            {
             before(grammarAccess.getSimpleAccess().getAlternatives()); 
            // InternalCYK.g:194:3: ( rule__Simple__Alternatives )
            // InternalCYK.g:194:4: rule__Simple__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSimple"


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
    // InternalCYK.g:212:1: ruleNonTerminal : ( ( rule__NonTerminal__Alternatives ) ) ;
    public final void ruleNonTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:216:2: ( ( ( rule__NonTerminal__Alternatives ) ) )
            // InternalCYK.g:217:2: ( ( rule__NonTerminal__Alternatives ) )
            {
            // InternalCYK.g:217:2: ( ( rule__NonTerminal__Alternatives ) )
            // InternalCYK.g:218:3: ( rule__NonTerminal__Alternatives )
            {
             before(grammarAccess.getNonTerminalAccess().getAlternatives()); 
            // InternalCYK.g:219:3: ( rule__NonTerminal__Alternatives )
            // InternalCYK.g:219:4: rule__NonTerminal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNonTerminalAccess().getAlternatives()); 

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


    // $ANTLR start "rule__Lambda__Alternatives"
    // InternalCYK.g:252:1: rule__Lambda__Alternatives : ( ( ( rule__Lambda__RightAssignment_0 ) ) | ( ruleRight ) );
    public final void rule__Lambda__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:256:1: ( ( ( rule__Lambda__RightAssignment_0 ) ) | ( ruleRight ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==62) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=11 && LA1_0<=58)||(LA1_0>=63 && LA1_0<=64)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCYK.g:257:2: ( ( rule__Lambda__RightAssignment_0 ) )
                    {
                    // InternalCYK.g:257:2: ( ( rule__Lambda__RightAssignment_0 ) )
                    // InternalCYK.g:258:3: ( rule__Lambda__RightAssignment_0 )
                    {
                     before(grammarAccess.getLambdaAccess().getRightAssignment_0()); 
                    // InternalCYK.g:259:3: ( rule__Lambda__RightAssignment_0 )
                    // InternalCYK.g:259:4: rule__Lambda__RightAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lambda__RightAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLambdaAccess().getRightAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:263:2: ( ruleRight )
                    {
                    // InternalCYK.g:263:2: ( ruleRight )
                    // InternalCYK.g:264:3: ruleRight
                    {
                     before(grammarAccess.getLambdaAccess().getRightParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRight();

                    state._fsp--;

                     after(grammarAccess.getLambdaAccess().getRightParserRuleCall_1()); 

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
    // $ANTLR end "rule__Lambda__Alternatives"


    // $ANTLR start "rule__Right__Alternatives"
    // InternalCYK.g:273:1: rule__Right__Alternatives : ( ( ruleSimple ) | ( ruleBinary ) );
    public final void rule__Right__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:277:1: ( ( ruleSimple ) | ( ruleBinary ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=34)||LA2_0==63) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=35 && LA2_0<=58)||LA2_0==64) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCYK.g:278:2: ( ruleSimple )
                    {
                    // InternalCYK.g:278:2: ( ruleSimple )
                    // InternalCYK.g:279:3: ruleSimple
                    {
                     before(grammarAccess.getRightAccess().getSimpleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimple();

                    state._fsp--;

                     after(grammarAccess.getRightAccess().getSimpleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:284:2: ( ruleBinary )
                    {
                    // InternalCYK.g:284:2: ( ruleBinary )
                    // InternalCYK.g:285:3: ruleBinary
                    {
                     before(grammarAccess.getRightAccess().getBinaryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBinary();

                    state._fsp--;

                     after(grammarAccess.getRightAccess().getBinaryParserRuleCall_1()); 

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


    // $ANTLR start "rule__Simple__Alternatives"
    // InternalCYK.g:294:1: rule__Simple__Alternatives : ( ( ( rule__Simple__AlphaAssignment_0 ) ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) | ( 'g' ) | ( 'h' ) | ( 'i' ) | ( 'j' ) | ( 'k' ) | ( 'l' ) | ( 'm' ) | ( 'n' ) | ( 'o' ) | ( 'p' ) | ( 'q' ) | ( 'r' ) | ( 's' ) | ( 't' ) | ( 'v' ) | ( 'w' ) | ( 'x' ) | ( 'y' ) | ( 'z' ) );
    public final void rule__Simple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:298:1: ( ( ( rule__Simple__AlphaAssignment_0 ) ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) | ( 'g' ) | ( 'h' ) | ( 'i' ) | ( 'j' ) | ( 'k' ) | ( 'l' ) | ( 'm' ) | ( 'n' ) | ( 'o' ) | ( 'p' ) | ( 'q' ) | ( 'r' ) | ( 's' ) | ( 't' ) | ( 'v' ) | ( 'w' ) | ( 'x' ) | ( 'y' ) | ( 'z' ) )
            int alt3=25;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt3=1;
                }
                break;
            case 11:
                {
                alt3=2;
                }
                break;
            case 12:
                {
                alt3=3;
                }
                break;
            case 13:
                {
                alt3=4;
                }
                break;
            case 14:
                {
                alt3=5;
                }
                break;
            case 15:
                {
                alt3=6;
                }
                break;
            case 16:
                {
                alt3=7;
                }
                break;
            case 17:
                {
                alt3=8;
                }
                break;
            case 18:
                {
                alt3=9;
                }
                break;
            case 19:
                {
                alt3=10;
                }
                break;
            case 20:
                {
                alt3=11;
                }
                break;
            case 21:
                {
                alt3=12;
                }
                break;
            case 22:
                {
                alt3=13;
                }
                break;
            case 23:
                {
                alt3=14;
                }
                break;
            case 24:
                {
                alt3=15;
                }
                break;
            case 25:
                {
                alt3=16;
                }
                break;
            case 26:
                {
                alt3=17;
                }
                break;
            case 27:
                {
                alt3=18;
                }
                break;
            case 28:
                {
                alt3=19;
                }
                break;
            case 29:
                {
                alt3=20;
                }
                break;
            case 30:
                {
                alt3=21;
                }
                break;
            case 31:
                {
                alt3=22;
                }
                break;
            case 32:
                {
                alt3=23;
                }
                break;
            case 33:
                {
                alt3=24;
                }
                break;
            case 34:
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
                    // InternalCYK.g:299:2: ( ( rule__Simple__AlphaAssignment_0 ) )
                    {
                    // InternalCYK.g:299:2: ( ( rule__Simple__AlphaAssignment_0 ) )
                    // InternalCYK.g:300:3: ( rule__Simple__AlphaAssignment_0 )
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaAssignment_0()); 
                    // InternalCYK.g:301:3: ( rule__Simple__AlphaAssignment_0 )
                    // InternalCYK.g:301:4: rule__Simple__AlphaAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple__AlphaAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAccess().getAlphaAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:305:2: ( 'b' )
                    {
                    // InternalCYK.g:305:2: ( 'b' )
                    // InternalCYK.g:306:3: 'b'
                    {
                     before(grammarAccess.getSimpleAccess().getBKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getBKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCYK.g:311:2: ( 'c' )
                    {
                    // InternalCYK.g:311:2: ( 'c' )
                    // InternalCYK.g:312:3: 'c'
                    {
                     before(grammarAccess.getSimpleAccess().getCKeyword_2()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getCKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCYK.g:317:2: ( 'd' )
                    {
                    // InternalCYK.g:317:2: ( 'd' )
                    // InternalCYK.g:318:3: 'd'
                    {
                     before(grammarAccess.getSimpleAccess().getDKeyword_3()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getDKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCYK.g:323:2: ( 'e' )
                    {
                    // InternalCYK.g:323:2: ( 'e' )
                    // InternalCYK.g:324:3: 'e'
                    {
                     before(grammarAccess.getSimpleAccess().getEKeyword_4()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getEKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCYK.g:329:2: ( 'f' )
                    {
                    // InternalCYK.g:329:2: ( 'f' )
                    // InternalCYK.g:330:3: 'f'
                    {
                     before(grammarAccess.getSimpleAccess().getFKeyword_5()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getFKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCYK.g:335:2: ( 'g' )
                    {
                    // InternalCYK.g:335:2: ( 'g' )
                    // InternalCYK.g:336:3: 'g'
                    {
                     before(grammarAccess.getSimpleAccess().getGKeyword_6()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getGKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCYK.g:341:2: ( 'h' )
                    {
                    // InternalCYK.g:341:2: ( 'h' )
                    // InternalCYK.g:342:3: 'h'
                    {
                     before(grammarAccess.getSimpleAccess().getHKeyword_7()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getHKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCYK.g:347:2: ( 'i' )
                    {
                    // InternalCYK.g:347:2: ( 'i' )
                    // InternalCYK.g:348:3: 'i'
                    {
                     before(grammarAccess.getSimpleAccess().getIKeyword_8()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getIKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCYK.g:353:2: ( 'j' )
                    {
                    // InternalCYK.g:353:2: ( 'j' )
                    // InternalCYK.g:354:3: 'j'
                    {
                     before(grammarAccess.getSimpleAccess().getJKeyword_9()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getJKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalCYK.g:359:2: ( 'k' )
                    {
                    // InternalCYK.g:359:2: ( 'k' )
                    // InternalCYK.g:360:3: 'k'
                    {
                     before(grammarAccess.getSimpleAccess().getKKeyword_10()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getKKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalCYK.g:365:2: ( 'l' )
                    {
                    // InternalCYK.g:365:2: ( 'l' )
                    // InternalCYK.g:366:3: 'l'
                    {
                     before(grammarAccess.getSimpleAccess().getLKeyword_11()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getLKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalCYK.g:371:2: ( 'm' )
                    {
                    // InternalCYK.g:371:2: ( 'm' )
                    // InternalCYK.g:372:3: 'm'
                    {
                     before(grammarAccess.getSimpleAccess().getMKeyword_12()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getMKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalCYK.g:377:2: ( 'n' )
                    {
                    // InternalCYK.g:377:2: ( 'n' )
                    // InternalCYK.g:378:3: 'n'
                    {
                     before(grammarAccess.getSimpleAccess().getNKeyword_13()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getNKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalCYK.g:383:2: ( 'o' )
                    {
                    // InternalCYK.g:383:2: ( 'o' )
                    // InternalCYK.g:384:3: 'o'
                    {
                     before(grammarAccess.getSimpleAccess().getOKeyword_14()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getOKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalCYK.g:389:2: ( 'p' )
                    {
                    // InternalCYK.g:389:2: ( 'p' )
                    // InternalCYK.g:390:3: 'p'
                    {
                     before(grammarAccess.getSimpleAccess().getPKeyword_15()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getPKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalCYK.g:395:2: ( 'q' )
                    {
                    // InternalCYK.g:395:2: ( 'q' )
                    // InternalCYK.g:396:3: 'q'
                    {
                     before(grammarAccess.getSimpleAccess().getQKeyword_16()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getQKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalCYK.g:401:2: ( 'r' )
                    {
                    // InternalCYK.g:401:2: ( 'r' )
                    // InternalCYK.g:402:3: 'r'
                    {
                     before(grammarAccess.getSimpleAccess().getRKeyword_17()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getRKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalCYK.g:407:2: ( 's' )
                    {
                    // InternalCYK.g:407:2: ( 's' )
                    // InternalCYK.g:408:3: 's'
                    {
                     before(grammarAccess.getSimpleAccess().getSKeyword_18()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getSKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalCYK.g:413:2: ( 't' )
                    {
                    // InternalCYK.g:413:2: ( 't' )
                    // InternalCYK.g:414:3: 't'
                    {
                     before(grammarAccess.getSimpleAccess().getTKeyword_19()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getTKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalCYK.g:419:2: ( 'v' )
                    {
                    // InternalCYK.g:419:2: ( 'v' )
                    // InternalCYK.g:420:3: 'v'
                    {
                     before(grammarAccess.getSimpleAccess().getVKeyword_20()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getVKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalCYK.g:425:2: ( 'w' )
                    {
                    // InternalCYK.g:425:2: ( 'w' )
                    // InternalCYK.g:426:3: 'w'
                    {
                     before(grammarAccess.getSimpleAccess().getWKeyword_21()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getWKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalCYK.g:431:2: ( 'x' )
                    {
                    // InternalCYK.g:431:2: ( 'x' )
                    // InternalCYK.g:432:3: 'x'
                    {
                     before(grammarAccess.getSimpleAccess().getXKeyword_22()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getXKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalCYK.g:437:2: ( 'y' )
                    {
                    // InternalCYK.g:437:2: ( 'y' )
                    // InternalCYK.g:438:3: 'y'
                    {
                     before(grammarAccess.getSimpleAccess().getYKeyword_23()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getYKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalCYK.g:443:2: ( 'z' )
                    {
                    // InternalCYK.g:443:2: ( 'z' )
                    // InternalCYK.g:444:3: 'z'
                    {
                     before(grammarAccess.getSimpleAccess().getZKeyword_24()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getZKeyword_24()); 

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
    // $ANTLR end "rule__Simple__Alternatives"


    // $ANTLR start "rule__NonTerminal__Alternatives"
    // InternalCYK.g:453:1: rule__NonTerminal__Alternatives : ( ( ( rule__NonTerminal__VarAssignment_0 ) ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'H' ) | ( 'I' ) | ( 'J' ) | ( 'K' ) | ( 'L' ) | ( 'M' ) | ( 'N' ) | ( 'O' ) | ( 'P' ) | ( 'Q' ) | ( 'R' ) | ( 'T' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'X' ) | ( 'Y' ) | ( 'Z' ) );
    public final void rule__NonTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:457:1: ( ( ( rule__NonTerminal__VarAssignment_0 ) ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'H' ) | ( 'I' ) | ( 'J' ) | ( 'K' ) | ( 'L' ) | ( 'M' ) | ( 'N' ) | ( 'O' ) | ( 'P' ) | ( 'Q' ) | ( 'R' ) | ( 'T' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'X' ) | ( 'Y' ) | ( 'Z' ) )
            int alt4=25;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case 36:
                {
                alt4=3;
                }
                break;
            case 37:
                {
                alt4=4;
                }
                break;
            case 38:
                {
                alt4=5;
                }
                break;
            case 39:
                {
                alt4=6;
                }
                break;
            case 40:
                {
                alt4=7;
                }
                break;
            case 41:
                {
                alt4=8;
                }
                break;
            case 42:
                {
                alt4=9;
                }
                break;
            case 43:
                {
                alt4=10;
                }
                break;
            case 44:
                {
                alt4=11;
                }
                break;
            case 45:
                {
                alt4=12;
                }
                break;
            case 46:
                {
                alt4=13;
                }
                break;
            case 47:
                {
                alt4=14;
                }
                break;
            case 48:
                {
                alt4=15;
                }
                break;
            case 49:
                {
                alt4=16;
                }
                break;
            case 50:
                {
                alt4=17;
                }
                break;
            case 51:
                {
                alt4=18;
                }
                break;
            case 52:
                {
                alt4=19;
                }
                break;
            case 53:
                {
                alt4=20;
                }
                break;
            case 54:
                {
                alt4=21;
                }
                break;
            case 55:
                {
                alt4=22;
                }
                break;
            case 56:
                {
                alt4=23;
                }
                break;
            case 57:
                {
                alt4=24;
                }
                break;
            case 58:
                {
                alt4=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCYK.g:458:2: ( ( rule__NonTerminal__VarAssignment_0 ) )
                    {
                    // InternalCYK.g:458:2: ( ( rule__NonTerminal__VarAssignment_0 ) )
                    // InternalCYK.g:459:3: ( rule__NonTerminal__VarAssignment_0 )
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarAssignment_0()); 
                    // InternalCYK.g:460:3: ( rule__NonTerminal__VarAssignment_0 )
                    // InternalCYK.g:460:4: rule__NonTerminal__VarAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonTerminal__VarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonTerminalAccess().getVarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCYK.g:464:2: ( 'B' )
                    {
                    // InternalCYK.g:464:2: ( 'B' )
                    // InternalCYK.g:465:3: 'B'
                    {
                     before(grammarAccess.getNonTerminalAccess().getBKeyword_1()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getBKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCYK.g:470:2: ( 'C' )
                    {
                    // InternalCYK.g:470:2: ( 'C' )
                    // InternalCYK.g:471:3: 'C'
                    {
                     before(grammarAccess.getNonTerminalAccess().getCKeyword_2()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getCKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCYK.g:476:2: ( 'D' )
                    {
                    // InternalCYK.g:476:2: ( 'D' )
                    // InternalCYK.g:477:3: 'D'
                    {
                     before(grammarAccess.getNonTerminalAccess().getDKeyword_3()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getDKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCYK.g:482:2: ( 'E' )
                    {
                    // InternalCYK.g:482:2: ( 'E' )
                    // InternalCYK.g:483:3: 'E'
                    {
                     before(grammarAccess.getNonTerminalAccess().getEKeyword_4()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getEKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCYK.g:488:2: ( 'F' )
                    {
                    // InternalCYK.g:488:2: ( 'F' )
                    // InternalCYK.g:489:3: 'F'
                    {
                     before(grammarAccess.getNonTerminalAccess().getFKeyword_5()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getFKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCYK.g:494:2: ( 'G' )
                    {
                    // InternalCYK.g:494:2: ( 'G' )
                    // InternalCYK.g:495:3: 'G'
                    {
                     before(grammarAccess.getNonTerminalAccess().getGKeyword_6()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getGKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCYK.g:500:2: ( 'H' )
                    {
                    // InternalCYK.g:500:2: ( 'H' )
                    // InternalCYK.g:501:3: 'H'
                    {
                     before(grammarAccess.getNonTerminalAccess().getHKeyword_7()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getHKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCYK.g:506:2: ( 'I' )
                    {
                    // InternalCYK.g:506:2: ( 'I' )
                    // InternalCYK.g:507:3: 'I'
                    {
                     before(grammarAccess.getNonTerminalAccess().getIKeyword_8()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getIKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCYK.g:512:2: ( 'J' )
                    {
                    // InternalCYK.g:512:2: ( 'J' )
                    // InternalCYK.g:513:3: 'J'
                    {
                     before(grammarAccess.getNonTerminalAccess().getJKeyword_9()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getJKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalCYK.g:518:2: ( 'K' )
                    {
                    // InternalCYK.g:518:2: ( 'K' )
                    // InternalCYK.g:519:3: 'K'
                    {
                     before(grammarAccess.getNonTerminalAccess().getKKeyword_10()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getKKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalCYK.g:524:2: ( 'L' )
                    {
                    // InternalCYK.g:524:2: ( 'L' )
                    // InternalCYK.g:525:3: 'L'
                    {
                     before(grammarAccess.getNonTerminalAccess().getLKeyword_11()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getLKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalCYK.g:530:2: ( 'M' )
                    {
                    // InternalCYK.g:530:2: ( 'M' )
                    // InternalCYK.g:531:3: 'M'
                    {
                     before(grammarAccess.getNonTerminalAccess().getMKeyword_12()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getMKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalCYK.g:536:2: ( 'N' )
                    {
                    // InternalCYK.g:536:2: ( 'N' )
                    // InternalCYK.g:537:3: 'N'
                    {
                     before(grammarAccess.getNonTerminalAccess().getNKeyword_13()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getNKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalCYK.g:542:2: ( 'O' )
                    {
                    // InternalCYK.g:542:2: ( 'O' )
                    // InternalCYK.g:543:3: 'O'
                    {
                     before(grammarAccess.getNonTerminalAccess().getOKeyword_14()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getOKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalCYK.g:548:2: ( 'P' )
                    {
                    // InternalCYK.g:548:2: ( 'P' )
                    // InternalCYK.g:549:3: 'P'
                    {
                     before(grammarAccess.getNonTerminalAccess().getPKeyword_15()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getPKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalCYK.g:554:2: ( 'Q' )
                    {
                    // InternalCYK.g:554:2: ( 'Q' )
                    // InternalCYK.g:555:3: 'Q'
                    {
                     before(grammarAccess.getNonTerminalAccess().getQKeyword_16()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getQKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalCYK.g:560:2: ( 'R' )
                    {
                    // InternalCYK.g:560:2: ( 'R' )
                    // InternalCYK.g:561:3: 'R'
                    {
                     before(grammarAccess.getNonTerminalAccess().getRKeyword_17()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getRKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalCYK.g:566:2: ( 'T' )
                    {
                    // InternalCYK.g:566:2: ( 'T' )
                    // InternalCYK.g:567:3: 'T'
                    {
                     before(grammarAccess.getNonTerminalAccess().getTKeyword_18()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getTKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalCYK.g:572:2: ( 'U' )
                    {
                    // InternalCYK.g:572:2: ( 'U' )
                    // InternalCYK.g:573:3: 'U'
                    {
                     before(grammarAccess.getNonTerminalAccess().getUKeyword_19()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getUKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalCYK.g:578:2: ( 'V' )
                    {
                    // InternalCYK.g:578:2: ( 'V' )
                    // InternalCYK.g:579:3: 'V'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVKeyword_20()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalCYK.g:584:2: ( 'W' )
                    {
                    // InternalCYK.g:584:2: ( 'W' )
                    // InternalCYK.g:585:3: 'W'
                    {
                     before(grammarAccess.getNonTerminalAccess().getWKeyword_21()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getWKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalCYK.g:590:2: ( 'X' )
                    {
                    // InternalCYK.g:590:2: ( 'X' )
                    // InternalCYK.g:591:3: 'X'
                    {
                     before(grammarAccess.getNonTerminalAccess().getXKeyword_22()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getXKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalCYK.g:596:2: ( 'Y' )
                    {
                    // InternalCYK.g:596:2: ( 'Y' )
                    // InternalCYK.g:597:3: 'Y'
                    {
                     before(grammarAccess.getNonTerminalAccess().getYKeyword_23()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getYKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalCYK.g:602:2: ( 'Z' )
                    {
                    // InternalCYK.g:602:2: ( 'Z' )
                    // InternalCYK.g:603:3: 'Z'
                    {
                     before(grammarAccess.getNonTerminalAccess().getZKeyword_24()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getZKeyword_24()); 

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
    // $ANTLR end "rule__NonTerminal__Alternatives"


    // $ANTLR start "rule__GFNC__Group__0"
    // InternalCYK.g:612:1: rule__GFNC__Group__0 : rule__GFNC__Group__0__Impl rule__GFNC__Group__1 ;
    public final void rule__GFNC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:616:1: ( rule__GFNC__Group__0__Impl rule__GFNC__Group__1 )
            // InternalCYK.g:617:2: rule__GFNC__Group__0__Impl rule__GFNC__Group__1
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
    // InternalCYK.g:624:1: rule__GFNC__Group__0__Impl : ( ( rule__GFNC__InitAssignment_0 ) ) ;
    public final void rule__GFNC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:628:1: ( ( ( rule__GFNC__InitAssignment_0 ) ) )
            // InternalCYK.g:629:1: ( ( rule__GFNC__InitAssignment_0 ) )
            {
            // InternalCYK.g:629:1: ( ( rule__GFNC__InitAssignment_0 ) )
            // InternalCYK.g:630:2: ( rule__GFNC__InitAssignment_0 )
            {
             before(grammarAccess.getGFNCAccess().getInitAssignment_0()); 
            // InternalCYK.g:631:2: ( rule__GFNC__InitAssignment_0 )
            // InternalCYK.g:631:3: rule__GFNC__InitAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GFNC__InitAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGFNCAccess().getInitAssignment_0()); 

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
    // InternalCYK.g:639:1: rule__GFNC__Group__1 : rule__GFNC__Group__1__Impl ;
    public final void rule__GFNC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:643:1: ( rule__GFNC__Group__1__Impl )
            // InternalCYK.g:644:2: rule__GFNC__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GFNC__Group__1__Impl();

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
    // InternalCYK.g:650:1: rule__GFNC__Group__1__Impl : ( ( rule__GFNC__ProductionsAssignment_1 )* ) ;
    public final void rule__GFNC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:654:1: ( ( ( rule__GFNC__ProductionsAssignment_1 )* ) )
            // InternalCYK.g:655:1: ( ( rule__GFNC__ProductionsAssignment_1 )* )
            {
            // InternalCYK.g:655:1: ( ( rule__GFNC__ProductionsAssignment_1 )* )
            // InternalCYK.g:656:2: ( rule__GFNC__ProductionsAssignment_1 )*
            {
             before(grammarAccess.getGFNCAccess().getProductionsAssignment_1()); 
            // InternalCYK.g:657:2: ( rule__GFNC__ProductionsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=35 && LA5_0<=58)||LA5_0==64) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCYK.g:657:3: rule__GFNC__ProductionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__GFNC__ProductionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGFNCAccess().getProductionsAssignment_1()); 

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


    // $ANTLR start "rule__Initial__Group__0"
    // InternalCYK.g:666:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:670:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // InternalCYK.g:671:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Initial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__1();

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
    // $ANTLR end "rule__Initial__Group__0"


    // $ANTLR start "rule__Initial__Group__0__Impl"
    // InternalCYK.g:678:1: rule__Initial__Group__0__Impl : ( ( rule__Initial__LeftAssignment_0 ) ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:682:1: ( ( ( rule__Initial__LeftAssignment_0 ) ) )
            // InternalCYK.g:683:1: ( ( rule__Initial__LeftAssignment_0 ) )
            {
            // InternalCYK.g:683:1: ( ( rule__Initial__LeftAssignment_0 ) )
            // InternalCYK.g:684:2: ( rule__Initial__LeftAssignment_0 )
            {
             before(grammarAccess.getInitialAccess().getLeftAssignment_0()); 
            // InternalCYK.g:685:2: ( rule__Initial__LeftAssignment_0 )
            // InternalCYK.g:685:3: rule__Initial__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Initial__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__Initial__Group__0__Impl"


    // $ANTLR start "rule__Initial__Group__1"
    // InternalCYK.g:693:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:697:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // InternalCYK.g:698:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Initial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__2();

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
    // $ANTLR end "rule__Initial__Group__1"


    // $ANTLR start "rule__Initial__Group__1__Impl"
    // InternalCYK.g:705:1: rule__Initial__Group__1__Impl : ( '->' ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:709:1: ( ( '->' ) )
            // InternalCYK.g:710:1: ( '->' )
            {
            // InternalCYK.g:710:1: ( '->' )
            // InternalCYK.g:711:2: '->'
            {
             before(grammarAccess.getInitialAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__Initial__Group__1__Impl"


    // $ANTLR start "rule__Initial__Group__2"
    // InternalCYK.g:720:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl rule__Initial__Group__3 ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:724:1: ( rule__Initial__Group__2__Impl rule__Initial__Group__3 )
            // InternalCYK.g:725:2: rule__Initial__Group__2__Impl rule__Initial__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Initial__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__3();

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
    // $ANTLR end "rule__Initial__Group__2"


    // $ANTLR start "rule__Initial__Group__2__Impl"
    // InternalCYK.g:732:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__RightAssignment_2 ) ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:736:1: ( ( ( rule__Initial__RightAssignment_2 ) ) )
            // InternalCYK.g:737:1: ( ( rule__Initial__RightAssignment_2 ) )
            {
            // InternalCYK.g:737:1: ( ( rule__Initial__RightAssignment_2 ) )
            // InternalCYK.g:738:2: ( rule__Initial__RightAssignment_2 )
            {
             before(grammarAccess.getInitialAccess().getRightAssignment_2()); 
            // InternalCYK.g:739:2: ( rule__Initial__RightAssignment_2 )
            // InternalCYK.g:739:3: rule__Initial__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Initial__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__Initial__Group__2__Impl"


    // $ANTLR start "rule__Initial__Group__3"
    // InternalCYK.g:747:1: rule__Initial__Group__3 : rule__Initial__Group__3__Impl ;
    public final void rule__Initial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:751:1: ( rule__Initial__Group__3__Impl )
            // InternalCYK.g:752:2: rule__Initial__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Group__3__Impl();

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
    // $ANTLR end "rule__Initial__Group__3"


    // $ANTLR start "rule__Initial__Group__3__Impl"
    // InternalCYK.g:758:1: rule__Initial__Group__3__Impl : ( ( rule__Initial__Group_3__0 )* ) ;
    public final void rule__Initial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:762:1: ( ( ( rule__Initial__Group_3__0 )* ) )
            // InternalCYK.g:763:1: ( ( rule__Initial__Group_3__0 )* )
            {
            // InternalCYK.g:763:1: ( ( rule__Initial__Group_3__0 )* )
            // InternalCYK.g:764:2: ( rule__Initial__Group_3__0 )*
            {
             before(grammarAccess.getInitialAccess().getGroup_3()); 
            // InternalCYK.g:765:2: ( rule__Initial__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==60) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCYK.g:765:3: rule__Initial__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Initial__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getInitialAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Initial__Group__3__Impl"


    // $ANTLR start "rule__Initial__Group_3__0"
    // InternalCYK.g:774:1: rule__Initial__Group_3__0 : rule__Initial__Group_3__0__Impl rule__Initial__Group_3__1 ;
    public final void rule__Initial__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:778:1: ( rule__Initial__Group_3__0__Impl rule__Initial__Group_3__1 )
            // InternalCYK.g:779:2: rule__Initial__Group_3__0__Impl rule__Initial__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Initial__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group_3__1();

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
    // $ANTLR end "rule__Initial__Group_3__0"


    // $ANTLR start "rule__Initial__Group_3__0__Impl"
    // InternalCYK.g:786:1: rule__Initial__Group_3__0__Impl : ( ( ( '|' ) ) ( ( '|' )* ) ) ;
    public final void rule__Initial__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:790:1: ( ( ( ( '|' ) ) ( ( '|' )* ) ) )
            // InternalCYK.g:791:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            {
            // InternalCYK.g:791:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            // InternalCYK.g:792:2: ( ( '|' ) ) ( ( '|' )* )
            {
            // InternalCYK.g:792:2: ( ( '|' ) )
            // InternalCYK.g:793:3: ( '|' )
            {
             before(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); 
            // InternalCYK.g:794:3: ( '|' )
            // InternalCYK.g:794:4: '|'
            {
            match(input,60,FOLLOW_8); 

            }

             after(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); 

            }

            // InternalCYK.g:797:2: ( ( '|' )* )
            // InternalCYK.g:798:3: ( '|' )*
            {
             before(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); 
            // InternalCYK.g:799:3: ( '|' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==60) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCYK.g:799:4: '|'
            	    {
            	    match(input,60,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); 

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
    // $ANTLR end "rule__Initial__Group_3__0__Impl"


    // $ANTLR start "rule__Initial__Group_3__1"
    // InternalCYK.g:808:1: rule__Initial__Group_3__1 : rule__Initial__Group_3__1__Impl ;
    public final void rule__Initial__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:812:1: ( rule__Initial__Group_3__1__Impl )
            // InternalCYK.g:813:2: rule__Initial__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Group_3__1__Impl();

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
    // $ANTLR end "rule__Initial__Group_3__1"


    // $ANTLR start "rule__Initial__Group_3__1__Impl"
    // InternalCYK.g:819:1: rule__Initial__Group_3__1__Impl : ( ( rule__Initial__RightAssignment_3_1 ) ) ;
    public final void rule__Initial__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:823:1: ( ( ( rule__Initial__RightAssignment_3_1 ) ) )
            // InternalCYK.g:824:1: ( ( rule__Initial__RightAssignment_3_1 ) )
            {
            // InternalCYK.g:824:1: ( ( rule__Initial__RightAssignment_3_1 ) )
            // InternalCYK.g:825:2: ( rule__Initial__RightAssignment_3_1 )
            {
             before(grammarAccess.getInitialAccess().getRightAssignment_3_1()); 
            // InternalCYK.g:826:2: ( rule__Initial__RightAssignment_3_1 )
            // InternalCYK.g:826:3: rule__Initial__RightAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Initial__RightAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getRightAssignment_3_1()); 

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
    // $ANTLR end "rule__Initial__Group_3__1__Impl"


    // $ANTLR start "rule__Production__Group__0"
    // InternalCYK.g:835:1: rule__Production__Group__0 : rule__Production__Group__0__Impl rule__Production__Group__1 ;
    public final void rule__Production__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:839:1: ( rule__Production__Group__0__Impl rule__Production__Group__1 )
            // InternalCYK.g:840:2: rule__Production__Group__0__Impl rule__Production__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCYK.g:847:1: rule__Production__Group__0__Impl : ( ( rule__Production__LeftAssignment_0 ) ) ;
    public final void rule__Production__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:851:1: ( ( ( rule__Production__LeftAssignment_0 ) ) )
            // InternalCYK.g:852:1: ( ( rule__Production__LeftAssignment_0 ) )
            {
            // InternalCYK.g:852:1: ( ( rule__Production__LeftAssignment_0 ) )
            // InternalCYK.g:853:2: ( rule__Production__LeftAssignment_0 )
            {
             before(grammarAccess.getProductionAccess().getLeftAssignment_0()); 
            // InternalCYK.g:854:2: ( rule__Production__LeftAssignment_0 )
            // InternalCYK.g:854:3: rule__Production__LeftAssignment_0
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
    // InternalCYK.g:862:1: rule__Production__Group__1 : rule__Production__Group__1__Impl rule__Production__Group__2 ;
    public final void rule__Production__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:866:1: ( rule__Production__Group__1__Impl rule__Production__Group__2 )
            // InternalCYK.g:867:2: rule__Production__Group__1__Impl rule__Production__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalCYK.g:874:1: rule__Production__Group__1__Impl : ( '->' ) ;
    public final void rule__Production__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:878:1: ( ( '->' ) )
            // InternalCYK.g:879:1: ( '->' )
            {
            // InternalCYK.g:879:1: ( '->' )
            // InternalCYK.g:880:2: '->'
            {
             before(grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalCYK.g:889:1: rule__Production__Group__2 : rule__Production__Group__2__Impl rule__Production__Group__3 ;
    public final void rule__Production__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:893:1: ( rule__Production__Group__2__Impl rule__Production__Group__3 )
            // InternalCYK.g:894:2: rule__Production__Group__2__Impl rule__Production__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalCYK.g:901:1: rule__Production__Group__2__Impl : ( ( rule__Production__RightAssignment_2 ) ) ;
    public final void rule__Production__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:905:1: ( ( ( rule__Production__RightAssignment_2 ) ) )
            // InternalCYK.g:906:1: ( ( rule__Production__RightAssignment_2 ) )
            {
            // InternalCYK.g:906:1: ( ( rule__Production__RightAssignment_2 ) )
            // InternalCYK.g:907:2: ( rule__Production__RightAssignment_2 )
            {
             before(grammarAccess.getProductionAccess().getRightAssignment_2()); 
            // InternalCYK.g:908:2: ( rule__Production__RightAssignment_2 )
            // InternalCYK.g:908:3: rule__Production__RightAssignment_2
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
    // InternalCYK.g:916:1: rule__Production__Group__3 : rule__Production__Group__3__Impl ;
    public final void rule__Production__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:920:1: ( rule__Production__Group__3__Impl )
            // InternalCYK.g:921:2: rule__Production__Group__3__Impl
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
    // InternalCYK.g:927:1: rule__Production__Group__3__Impl : ( ( rule__Production__Group_3__0 )* ) ;
    public final void rule__Production__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:931:1: ( ( ( rule__Production__Group_3__0 )* ) )
            // InternalCYK.g:932:1: ( ( rule__Production__Group_3__0 )* )
            {
            // InternalCYK.g:932:1: ( ( rule__Production__Group_3__0 )* )
            // InternalCYK.g:933:2: ( rule__Production__Group_3__0 )*
            {
             before(grammarAccess.getProductionAccess().getGroup_3()); 
            // InternalCYK.g:934:2: ( rule__Production__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==60) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCYK.g:934:3: rule__Production__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Production__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalCYK.g:943:1: rule__Production__Group_3__0 : rule__Production__Group_3__0__Impl rule__Production__Group_3__1 ;
    public final void rule__Production__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:947:1: ( rule__Production__Group_3__0__Impl rule__Production__Group_3__1 )
            // InternalCYK.g:948:2: rule__Production__Group_3__0__Impl rule__Production__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCYK.g:955:1: rule__Production__Group_3__0__Impl : ( ( ( '|' ) ) ( ( '|' )* ) ) ;
    public final void rule__Production__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:959:1: ( ( ( ( '|' ) ) ( ( '|' )* ) ) )
            // InternalCYK.g:960:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            {
            // InternalCYK.g:960:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            // InternalCYK.g:961:2: ( ( '|' ) ) ( ( '|' )* )
            {
            // InternalCYK.g:961:2: ( ( '|' ) )
            // InternalCYK.g:962:3: ( '|' )
            {
             before(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 
            // InternalCYK.g:963:3: ( '|' )
            // InternalCYK.g:963:4: '|'
            {
            match(input,60,FOLLOW_8); 

            }

             after(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 

            }

            // InternalCYK.g:966:2: ( ( '|' )* )
            // InternalCYK.g:967:3: ( '|' )*
            {
             before(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 
            // InternalCYK.g:968:3: ( '|' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==60) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCYK.g:968:4: '|'
            	    {
            	    match(input,60,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalCYK.g:977:1: rule__Production__Group_3__1 : rule__Production__Group_3__1__Impl ;
    public final void rule__Production__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:981:1: ( rule__Production__Group_3__1__Impl )
            // InternalCYK.g:982:2: rule__Production__Group_3__1__Impl
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
    // InternalCYK.g:988:1: rule__Production__Group_3__1__Impl : ( ( rule__Production__RightAssignment_3_1 ) ) ;
    public final void rule__Production__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:992:1: ( ( ( rule__Production__RightAssignment_3_1 ) ) )
            // InternalCYK.g:993:1: ( ( rule__Production__RightAssignment_3_1 ) )
            {
            // InternalCYK.g:993:1: ( ( rule__Production__RightAssignment_3_1 ) )
            // InternalCYK.g:994:2: ( rule__Production__RightAssignment_3_1 )
            {
             before(grammarAccess.getProductionAccess().getRightAssignment_3_1()); 
            // InternalCYK.g:995:2: ( rule__Production__RightAssignment_3_1 )
            // InternalCYK.g:995:3: rule__Production__RightAssignment_3_1
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


    // $ANTLR start "rule__Binary__Group__0"
    // InternalCYK.g:1004:1: rule__Binary__Group__0 : rule__Binary__Group__0__Impl rule__Binary__Group__1 ;
    public final void rule__Binary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1008:1: ( rule__Binary__Group__0__Impl rule__Binary__Group__1 )
            // InternalCYK.g:1009:2: rule__Binary__Group__0__Impl rule__Binary__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalCYK.g:1016:1: rule__Binary__Group__0__Impl : ( ( rule__Binary__FirstAssignment_0 ) ) ;
    public final void rule__Binary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1020:1: ( ( ( rule__Binary__FirstAssignment_0 ) ) )
            // InternalCYK.g:1021:1: ( ( rule__Binary__FirstAssignment_0 ) )
            {
            // InternalCYK.g:1021:1: ( ( rule__Binary__FirstAssignment_0 ) )
            // InternalCYK.g:1022:2: ( rule__Binary__FirstAssignment_0 )
            {
             before(grammarAccess.getBinaryAccess().getFirstAssignment_0()); 
            // InternalCYK.g:1023:2: ( rule__Binary__FirstAssignment_0 )
            // InternalCYK.g:1023:3: rule__Binary__FirstAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Binary__FirstAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getFirstAssignment_0()); 

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
    // $ANTLR end "rule__Binary__Group__0__Impl"


    // $ANTLR start "rule__Binary__Group__1"
    // InternalCYK.g:1031:1: rule__Binary__Group__1 : rule__Binary__Group__1__Impl ;
    public final void rule__Binary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1035:1: ( rule__Binary__Group__1__Impl )
            // InternalCYK.g:1036:2: rule__Binary__Group__1__Impl
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
    // InternalCYK.g:1042:1: rule__Binary__Group__1__Impl : ( ( rule__Binary__SecondAssignment_1 ) ) ;
    public final void rule__Binary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1046:1: ( ( ( rule__Binary__SecondAssignment_1 ) ) )
            // InternalCYK.g:1047:1: ( ( rule__Binary__SecondAssignment_1 ) )
            {
            // InternalCYK.g:1047:1: ( ( rule__Binary__SecondAssignment_1 ) )
            // InternalCYK.g:1048:2: ( rule__Binary__SecondAssignment_1 )
            {
             before(grammarAccess.getBinaryAccess().getSecondAssignment_1()); 
            // InternalCYK.g:1049:2: ( rule__Binary__SecondAssignment_1 )
            // InternalCYK.g:1049:3: rule__Binary__SecondAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Binary__SecondAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getSecondAssignment_1()); 

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


    // $ANTLR start "rule__GFNC__InitAssignment_0"
    // InternalCYK.g:1058:1: rule__GFNC__InitAssignment_0 : ( ruleInitial ) ;
    public final void rule__GFNC__InitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1062:1: ( ( ruleInitial ) )
            // InternalCYK.g:1063:2: ( ruleInitial )
            {
            // InternalCYK.g:1063:2: ( ruleInitial )
            // InternalCYK.g:1064:3: ruleInitial
            {
             before(grammarAccess.getGFNCAccess().getInitInitialParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getGFNCAccess().getInitInitialParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__GFNC__InitAssignment_0"


    // $ANTLR start "rule__GFNC__ProductionsAssignment_1"
    // InternalCYK.g:1073:1: rule__GFNC__ProductionsAssignment_1 : ( ruleProduction ) ;
    public final void rule__GFNC__ProductionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1077:1: ( ( ruleProduction ) )
            // InternalCYK.g:1078:2: ( ruleProduction )
            {
            // InternalCYK.g:1078:2: ( ruleProduction )
            // InternalCYK.g:1079:3: ruleProduction
            {
             before(grammarAccess.getGFNCAccess().getProductionsProductionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProduction();

            state._fsp--;

             after(grammarAccess.getGFNCAccess().getProductionsProductionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__GFNC__ProductionsAssignment_1"


    // $ANTLR start "rule__Initial__LeftAssignment_0"
    // InternalCYK.g:1088:1: rule__Initial__LeftAssignment_0 : ( ( 'S' ) ) ;
    public final void rule__Initial__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1092:1: ( ( ( 'S' ) ) )
            // InternalCYK.g:1093:2: ( ( 'S' ) )
            {
            // InternalCYK.g:1093:2: ( ( 'S' ) )
            // InternalCYK.g:1094:3: ( 'S' )
            {
             before(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); 
            // InternalCYK.g:1095:3: ( 'S' )
            // InternalCYK.g:1096:4: 'S'
            {
             before(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); 

            }

             after(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); 

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
    // $ANTLR end "rule__Initial__LeftAssignment_0"


    // $ANTLR start "rule__Initial__RightAssignment_2"
    // InternalCYK.g:1107:1: rule__Initial__RightAssignment_2 : ( ruleLambda ) ;
    public final void rule__Initial__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1111:1: ( ( ruleLambda ) )
            // InternalCYK.g:1112:2: ( ruleLambda )
            {
            // InternalCYK.g:1112:2: ( ruleLambda )
            // InternalCYK.g:1113:3: ruleLambda
            {
             before(grammarAccess.getInitialAccess().getRightLambdaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getRightLambdaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Initial__RightAssignment_2"


    // $ANTLR start "rule__Initial__RightAssignment_3_1"
    // InternalCYK.g:1122:1: rule__Initial__RightAssignment_3_1 : ( ruleRight ) ;
    public final void rule__Initial__RightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1126:1: ( ( ruleRight ) )
            // InternalCYK.g:1127:2: ( ruleRight )
            {
            // InternalCYK.g:1127:2: ( ruleRight )
            // InternalCYK.g:1128:3: ruleRight
            {
             before(grammarAccess.getInitialAccess().getRightRightParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getRightRightParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Initial__RightAssignment_3_1"


    // $ANTLR start "rule__Lambda__RightAssignment_0"
    // InternalCYK.g:1137:1: rule__Lambda__RightAssignment_0 : ( ( '_' ) ) ;
    public final void rule__Lambda__RightAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1141:1: ( ( ( '_' ) ) )
            // InternalCYK.g:1142:2: ( ( '_' ) )
            {
            // InternalCYK.g:1142:2: ( ( '_' ) )
            // InternalCYK.g:1143:3: ( '_' )
            {
             before(grammarAccess.getLambdaAccess().getRight_Keyword_0_0()); 
            // InternalCYK.g:1144:3: ( '_' )
            // InternalCYK.g:1145:4: '_'
            {
             before(grammarAccess.getLambdaAccess().getRight_Keyword_0_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getRight_Keyword_0_0()); 

            }

             after(grammarAccess.getLambdaAccess().getRight_Keyword_0_0()); 

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
    // $ANTLR end "rule__Lambda__RightAssignment_0"


    // $ANTLR start "rule__Production__LeftAssignment_0"
    // InternalCYK.g:1156:1: rule__Production__LeftAssignment_0 : ( ruleNonTerminal ) ;
    public final void rule__Production__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1160:1: ( ( ruleNonTerminal ) )
            // InternalCYK.g:1161:2: ( ruleNonTerminal )
            {
            // InternalCYK.g:1161:2: ( ruleNonTerminal )
            // InternalCYK.g:1162:3: ruleNonTerminal
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
    // InternalCYK.g:1171:1: rule__Production__RightAssignment_2 : ( ruleRight ) ;
    public final void rule__Production__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1175:1: ( ( ruleRight ) )
            // InternalCYK.g:1176:2: ( ruleRight )
            {
            // InternalCYK.g:1176:2: ( ruleRight )
            // InternalCYK.g:1177:3: ruleRight
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
    // InternalCYK.g:1186:1: rule__Production__RightAssignment_3_1 : ( ruleRight ) ;
    public final void rule__Production__RightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1190:1: ( ( ruleRight ) )
            // InternalCYK.g:1191:2: ( ruleRight )
            {
            // InternalCYK.g:1191:2: ( ruleRight )
            // InternalCYK.g:1192:3: ruleRight
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


    // $ANTLR start "rule__Simple__AlphaAssignment_0"
    // InternalCYK.g:1201:1: rule__Simple__AlphaAssignment_0 : ( ( 'a' ) ) ;
    public final void rule__Simple__AlphaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1205:1: ( ( ( 'a' ) ) )
            // InternalCYK.g:1206:2: ( ( 'a' ) )
            {
            // InternalCYK.g:1206:2: ( ( 'a' ) )
            // InternalCYK.g:1207:3: ( 'a' )
            {
             before(grammarAccess.getSimpleAccess().getAlphaAKeyword_0_0()); 
            // InternalCYK.g:1208:3: ( 'a' )
            // InternalCYK.g:1209:4: 'a'
            {
             before(grammarAccess.getSimpleAccess().getAlphaAKeyword_0_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getSimpleAccess().getAlphaAKeyword_0_0()); 

            }

             after(grammarAccess.getSimpleAccess().getAlphaAKeyword_0_0()); 

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
    // $ANTLR end "rule__Simple__AlphaAssignment_0"


    // $ANTLR start "rule__NonTerminal__VarAssignment_0"
    // InternalCYK.g:1220:1: rule__NonTerminal__VarAssignment_0 : ( ( 'A' ) ) ;
    public final void rule__NonTerminal__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1224:1: ( ( ( 'A' ) ) )
            // InternalCYK.g:1225:2: ( ( 'A' ) )
            {
            // InternalCYK.g:1225:2: ( ( 'A' ) )
            // InternalCYK.g:1226:3: ( 'A' )
            {
             before(grammarAccess.getNonTerminalAccess().getVarAKeyword_0_0()); 
            // InternalCYK.g:1227:3: ( 'A' )
            // InternalCYK.g:1228:4: 'A'
            {
             before(grammarAccess.getNonTerminalAccess().getVarAKeyword_0_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getNonTerminalAccess().getVarAKeyword_0_0()); 

            }

             after(grammarAccess.getNonTerminalAccess().getVarAKeyword_0_0()); 

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
    // $ANTLR end "rule__NonTerminal__VarAssignment_0"


    // $ANTLR start "rule__Binary__FirstAssignment_0"
    // InternalCYK.g:1239:1: rule__Binary__FirstAssignment_0 : ( ruleNonTerminal ) ;
    public final void rule__Binary__FirstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1243:1: ( ( ruleNonTerminal ) )
            // InternalCYK.g:1244:2: ( ruleNonTerminal )
            {
            // InternalCYK.g:1244:2: ( ruleNonTerminal )
            // InternalCYK.g:1245:3: ruleNonTerminal
            {
             before(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Binary__FirstAssignment_0"


    // $ANTLR start "rule__Binary__SecondAssignment_1"
    // InternalCYK.g:1254:1: rule__Binary__SecondAssignment_1 : ( ruleNonTerminal ) ;
    public final void rule__Binary__SecondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCYK.g:1258:1: ( ( ruleNonTerminal ) )
            // InternalCYK.g:1259:2: ( ruleNonTerminal )
            {
            // InternalCYK.g:1259:2: ( ruleNonTerminal )
            // InternalCYK.g:1260:3: ruleNonTerminal
            {
             before(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Binary__SecondAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x07FFFFF800000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x07FFFFF800000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xC7FFFFFFFFFFF800L,0x0000000000000001L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1000000000000002L});

}