/*
 * generated by Xtext 2.26.0
 */
grammar InternalCYK;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.gfnc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGFNC
entryRuleGFNC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGFNCRule()); }
	iv_ruleGFNC=ruleGFNC
	{ $current=$iv_ruleGFNC.current; }
	EOF;

// Rule GFNC
ruleGFNC returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='W'
		{
			newLeafNode(otherlv_0, grammarAccess.getGFNCAccess().getWKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getGFNCAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGFNCAccess().getWWParserRuleCall_2_0());
				}
				lv_w_2_0=ruleW
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGFNCRule());
					}
					set(
						$current,
						"w",
						lv_w_2_0,
						"org.xtext.example.gfnc.CYK.W");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='G'
		{
			newLeafNode(otherlv_3, grammarAccess.getGFNCAccess().getGKeyword_3());
		}
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getGFNCAccess().getColonKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGFNCAccess().getProductionsProductionParserRuleCall_5_0());
				}
				lv_productions_5_0=ruleProduction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGFNCRule());
					}
					add(
						$current,
						"productions",
						lv_productions_5_0,
						"org.xtext.example.gfnc.CYK.Production");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleW
entryRuleW returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWRule()); }
	iv_ruleW=ruleW
	{ $current=$iv_ruleW.current; }
	EOF;

// Rule W
ruleW returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getWAccess().getLambdaLambdaParserRuleCall_0_0());
				}
				lv_lambda_0_0=ruleLambda
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWRule());
					}
					set(
						$current,
						"lambda",
						lv_lambda_0_0,
						"org.xtext.example.gfnc.CYK.Lambda");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getWAccess().getWTerminalParserRuleCall_1_0_0());
					}
					lv_w_1_0=ruleTerminal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWRule());
						}
						add(
							$current,
							"w",
							lv_w_1_0,
							"org.xtext.example.gfnc.CYK.Terminal");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getWAccess().getWTerminalParserRuleCall_1_1_0());
					}
					lv_w_2_0=ruleTerminal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWRule());
						}
						add(
							$current,
							"w",
							lv_w_2_0,
							"org.xtext.example.gfnc.CYK.Terminal");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
	)
;

// Entry rule entryRuleProduction
entryRuleProduction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProductionRule()); }
	iv_ruleProduction=ruleProduction
	{ $current=$iv_ruleProduction.current; }
	EOF;

// Rule Production
ruleProduction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0());
				}
				lv_left_0_0=ruleNonTerminal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProductionRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"org.xtext.example.gfnc.CYK.NonTerminal");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='->'
		{
			newLeafNode(otherlv_1, grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProductionAccess().getRightRightParserRuleCall_2_0());
				}
				lv_right_2_0=ruleRight
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProductionRule());
					}
					add(
						$current,
						"right",
						lv_right_2_0,
						"org.xtext.example.gfnc.CYK.Right");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_3='|'
				{
					newLeafNode(otherlv_3, grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0());
				}
			)+
			(
				(
					{
						newCompositeNode(grammarAccess.getProductionAccess().getRightRightParserRuleCall_3_1_0());
					}
					lv_right_4_0=ruleRight
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProductionRule());
						}
						add(
							$current,
							"right",
							lv_right_4_0,
							"org.xtext.example.gfnc.CYK.Right");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleRight
entryRuleRight returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRightRule()); }
	iv_ruleRight=ruleRight
	{ $current=$iv_ruleRight.current; }
	EOF;

// Rule Right
ruleRight returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRightAccess().getSimpleTerminalParserRuleCall_0_0());
				}
				lv_simple_0_0=ruleTerminal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRightRule());
					}
					set(
						$current,
						"simple",
						lv_simple_0_0,
						"org.xtext.example.gfnc.CYK.Terminal");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getRightAccess().getBinaryBinaryParserRuleCall_1_0());
				}
				lv_binary_1_0=ruleBinary
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRightRule());
					}
					set(
						$current,
						"binary",
						lv_binary_1_0,
						"org.xtext.example.gfnc.CYK.Binary");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getRightAccess().getLambdaLambdaParserRuleCall_2_0());
				}
				lv_lambda_2_0=ruleLambda
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRightRule());
					}
					set(
						$current,
						"lambda",
						lv_lambda_2_0,
						"org.xtext.example.gfnc.CYK.Lambda");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLambda
entryRuleLambda returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLambdaRule()); }
	iv_ruleLambda=ruleLambda
	{ $current=$iv_ruleLambda.current.getText(); }
	EOF;

// Rule Lambda
ruleLambda returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='_'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getLambdaAccess().get_Keyword());
	}
;

// Entry rule entryRuleTerminal
entryRuleTerminal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalRule()); }
	iv_ruleTerminal=ruleTerminal
	{ $current=$iv_ruleTerminal.current; }
	EOF;

// Rule Terminal
ruleTerminal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTerminalAccess().getTerminalAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_terminals_1_1='a'
					{
						newLeafNode(lv_terminals_1_1, grammarAccess.getTerminalAccess().getTerminalsAKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_1, null);
					}
					    |
					lv_terminals_1_2='b'
					{
						newLeafNode(lv_terminals_1_2, grammarAccess.getTerminalAccess().getTerminalsBKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_2, null);
					}
					    |
					lv_terminals_1_3='c'
					{
						newLeafNode(lv_terminals_1_3, grammarAccess.getTerminalAccess().getTerminalsCKeyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_3, null);
					}
					    |
					lv_terminals_1_4='d'
					{
						newLeafNode(lv_terminals_1_4, grammarAccess.getTerminalAccess().getTerminalsDKeyword_1_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_4, null);
					}
					    |
					lv_terminals_1_5='e'
					{
						newLeafNode(lv_terminals_1_5, grammarAccess.getTerminalAccess().getTerminalsEKeyword_1_0_4());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_5, null);
					}
					    |
					lv_terminals_1_6='f'
					{
						newLeafNode(lv_terminals_1_6, grammarAccess.getTerminalAccess().getTerminalsFKeyword_1_0_5());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_6, null);
					}
					    |
					lv_terminals_1_7='g'
					{
						newLeafNode(lv_terminals_1_7, grammarAccess.getTerminalAccess().getTerminalsGKeyword_1_0_6());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_7, null);
					}
					    |
					lv_terminals_1_8='h'
					{
						newLeafNode(lv_terminals_1_8, grammarAccess.getTerminalAccess().getTerminalsHKeyword_1_0_7());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_8, null);
					}
					    |
					lv_terminals_1_9='i'
					{
						newLeafNode(lv_terminals_1_9, grammarAccess.getTerminalAccess().getTerminalsIKeyword_1_0_8());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_9, null);
					}
					    |
					lv_terminals_1_10='j'
					{
						newLeafNode(lv_terminals_1_10, grammarAccess.getTerminalAccess().getTerminalsJKeyword_1_0_9());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_10, null);
					}
					    |
					lv_terminals_1_11='k'
					{
						newLeafNode(lv_terminals_1_11, grammarAccess.getTerminalAccess().getTerminalsKKeyword_1_0_10());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_11, null);
					}
					    |
					lv_terminals_1_12='l'
					{
						newLeafNode(lv_terminals_1_12, grammarAccess.getTerminalAccess().getTerminalsLKeyword_1_0_11());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_12, null);
					}
					    |
					lv_terminals_1_13='m'
					{
						newLeafNode(lv_terminals_1_13, grammarAccess.getTerminalAccess().getTerminalsMKeyword_1_0_12());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_13, null);
					}
					    |
					lv_terminals_1_14='n'
					{
						newLeafNode(lv_terminals_1_14, grammarAccess.getTerminalAccess().getTerminalsNKeyword_1_0_13());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_14, null);
					}
					    |
					lv_terminals_1_15='o'
					{
						newLeafNode(lv_terminals_1_15, grammarAccess.getTerminalAccess().getTerminalsOKeyword_1_0_14());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_15, null);
					}
					    |
					lv_terminals_1_16='p'
					{
						newLeafNode(lv_terminals_1_16, grammarAccess.getTerminalAccess().getTerminalsPKeyword_1_0_15());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_16, null);
					}
					    |
					lv_terminals_1_17='q'
					{
						newLeafNode(lv_terminals_1_17, grammarAccess.getTerminalAccess().getTerminalsQKeyword_1_0_16());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_17, null);
					}
					    |
					lv_terminals_1_18='r'
					{
						newLeafNode(lv_terminals_1_18, grammarAccess.getTerminalAccess().getTerminalsRKeyword_1_0_17());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_18, null);
					}
					    |
					lv_terminals_1_19='s'
					{
						newLeafNode(lv_terminals_1_19, grammarAccess.getTerminalAccess().getTerminalsSKeyword_1_0_18());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_19, null);
					}
					    |
					lv_terminals_1_20='t'
					{
						newLeafNode(lv_terminals_1_20, grammarAccess.getTerminalAccess().getTerminalsTKeyword_1_0_19());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_20, null);
					}
					    |
					lv_terminals_1_21='v'
					{
						newLeafNode(lv_terminals_1_21, grammarAccess.getTerminalAccess().getTerminalsVKeyword_1_0_20());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_21, null);
					}
					    |
					lv_terminals_1_22='w'
					{
						newLeafNode(lv_terminals_1_22, grammarAccess.getTerminalAccess().getTerminalsWKeyword_1_0_21());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_22, null);
					}
					    |
					lv_terminals_1_23='x'
					{
						newLeafNode(lv_terminals_1_23, grammarAccess.getTerminalAccess().getTerminalsXKeyword_1_0_22());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_23, null);
					}
					    |
					lv_terminals_1_24='y'
					{
						newLeafNode(lv_terminals_1_24, grammarAccess.getTerminalAccess().getTerminalsYKeyword_1_0_23());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_24, null);
					}
					    |
					lv_terminals_1_25='z'
					{
						newLeafNode(lv_terminals_1_25, grammarAccess.getTerminalAccess().getTerminalsZKeyword_1_0_24());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRule());
						}
						setWithLastConsumed($current, "terminals", lv_terminals_1_25, null);
					}
				)
			)
		)
	)
;

// Entry rule entryRuleNonTerminal
entryRuleNonTerminal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNonTerminalRule()); }
	iv_ruleNonTerminal=ruleNonTerminal
	{ $current=$iv_ruleNonTerminal.current; }
	EOF;

// Rule NonTerminal
ruleNonTerminal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getNonTerminalAccess().getNonTerminalAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_nonTerminals_1_1='A'
					{
						newLeafNode(lv_nonTerminals_1_1, grammarAccess.getNonTerminalAccess().getNonTerminalsAKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_1, null);
					}
					    |
					lv_nonTerminals_1_2='B'
					{
						newLeafNode(lv_nonTerminals_1_2, grammarAccess.getNonTerminalAccess().getNonTerminalsBKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_2, null);
					}
					    |
					lv_nonTerminals_1_3='C'
					{
						newLeafNode(lv_nonTerminals_1_3, grammarAccess.getNonTerminalAccess().getNonTerminalsCKeyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_3, null);
					}
					    |
					lv_nonTerminals_1_4='D'
					{
						newLeafNode(lv_nonTerminals_1_4, grammarAccess.getNonTerminalAccess().getNonTerminalsDKeyword_1_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_4, null);
					}
					    |
					lv_nonTerminals_1_5='E'
					{
						newLeafNode(lv_nonTerminals_1_5, grammarAccess.getNonTerminalAccess().getNonTerminalsEKeyword_1_0_4());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_5, null);
					}
					    |
					lv_nonTerminals_1_6='F'
					{
						newLeafNode(lv_nonTerminals_1_6, grammarAccess.getNonTerminalAccess().getNonTerminalsFKeyword_1_0_5());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_6, null);
					}
					    |
					lv_nonTerminals_1_7='G'
					{
						newLeafNode(lv_nonTerminals_1_7, grammarAccess.getNonTerminalAccess().getNonTerminalsGKeyword_1_0_6());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_7, null);
					}
					    |
					lv_nonTerminals_1_8='H'
					{
						newLeafNode(lv_nonTerminals_1_8, grammarAccess.getNonTerminalAccess().getNonTerminalsHKeyword_1_0_7());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_8, null);
					}
					    |
					lv_nonTerminals_1_9='I'
					{
						newLeafNode(lv_nonTerminals_1_9, grammarAccess.getNonTerminalAccess().getNonTerminalsIKeyword_1_0_8());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_9, null);
					}
					    |
					lv_nonTerminals_1_10='J'
					{
						newLeafNode(lv_nonTerminals_1_10, grammarAccess.getNonTerminalAccess().getNonTerminalsJKeyword_1_0_9());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_10, null);
					}
					    |
					lv_nonTerminals_1_11='K'
					{
						newLeafNode(lv_nonTerminals_1_11, grammarAccess.getNonTerminalAccess().getNonTerminalsKKeyword_1_0_10());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_11, null);
					}
					    |
					lv_nonTerminals_1_12='L'
					{
						newLeafNode(lv_nonTerminals_1_12, grammarAccess.getNonTerminalAccess().getNonTerminalsLKeyword_1_0_11());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_12, null);
					}
					    |
					lv_nonTerminals_1_13='M'
					{
						newLeafNode(lv_nonTerminals_1_13, grammarAccess.getNonTerminalAccess().getNonTerminalsMKeyword_1_0_12());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_13, null);
					}
					    |
					lv_nonTerminals_1_14='N'
					{
						newLeafNode(lv_nonTerminals_1_14, grammarAccess.getNonTerminalAccess().getNonTerminalsNKeyword_1_0_13());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_14, null);
					}
					    |
					lv_nonTerminals_1_15='O'
					{
						newLeafNode(lv_nonTerminals_1_15, grammarAccess.getNonTerminalAccess().getNonTerminalsOKeyword_1_0_14());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_15, null);
					}
					    |
					lv_nonTerminals_1_16='P'
					{
						newLeafNode(lv_nonTerminals_1_16, grammarAccess.getNonTerminalAccess().getNonTerminalsPKeyword_1_0_15());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_16, null);
					}
					    |
					lv_nonTerminals_1_17='Q'
					{
						newLeafNode(lv_nonTerminals_1_17, grammarAccess.getNonTerminalAccess().getNonTerminalsQKeyword_1_0_16());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_17, null);
					}
					    |
					lv_nonTerminals_1_18='R'
					{
						newLeafNode(lv_nonTerminals_1_18, grammarAccess.getNonTerminalAccess().getNonTerminalsRKeyword_1_0_17());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_18, null);
					}
					    |
					lv_nonTerminals_1_19='S'
					{
						newLeafNode(lv_nonTerminals_1_19, grammarAccess.getNonTerminalAccess().getNonTerminalsSKeyword_1_0_18());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_19, null);
					}
					    |
					lv_nonTerminals_1_20='T'
					{
						newLeafNode(lv_nonTerminals_1_20, grammarAccess.getNonTerminalAccess().getNonTerminalsTKeyword_1_0_19());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_20, null);
					}
					    |
					lv_nonTerminals_1_21='U'
					{
						newLeafNode(lv_nonTerminals_1_21, grammarAccess.getNonTerminalAccess().getNonTerminalsUKeyword_1_0_20());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_21, null);
					}
					    |
					lv_nonTerminals_1_22='V'
					{
						newLeafNode(lv_nonTerminals_1_22, grammarAccess.getNonTerminalAccess().getNonTerminalsVKeyword_1_0_21());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_22, null);
					}
					    |
					lv_nonTerminals_1_23='W'
					{
						newLeafNode(lv_nonTerminals_1_23, grammarAccess.getNonTerminalAccess().getNonTerminalsWKeyword_1_0_22());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_23, null);
					}
					    |
					lv_nonTerminals_1_24='X'
					{
						newLeafNode(lv_nonTerminals_1_24, grammarAccess.getNonTerminalAccess().getNonTerminalsXKeyword_1_0_23());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_24, null);
					}
					    |
					lv_nonTerminals_1_25='Y'
					{
						newLeafNode(lv_nonTerminals_1_25, grammarAccess.getNonTerminalAccess().getNonTerminalsYKeyword_1_0_24());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_25, null);
					}
					    |
					lv_nonTerminals_1_26='Z'
					{
						newLeafNode(lv_nonTerminals_1_26, grammarAccess.getNonTerminalAccess().getNonTerminalsZKeyword_1_0_25());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNonTerminalRule());
						}
						setWithLastConsumed($current, "nonTerminals", lv_nonTerminals_1_26, null);
					}
				)
			)
		)
	)
;

// Entry rule entryRuleBinary
entryRuleBinary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBinaryRule()); }
	iv_ruleBinary=ruleBinary
	{ $current=$iv_ruleBinary.current; }
	EOF;

// Rule Binary
ruleBinary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBinaryAccess().getBinaryAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0());
					}
					lv_first_1_0=ruleNonTerminal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBinaryRule());
						}
						set(
							$current,
							"first",
							lv_first_1_0,
							"org.xtext.example.gfnc.CYK.NonTerminal");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0());
					}
					lv_second_2_0=ruleNonTerminal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBinaryRule());
						}
						set(
							$current,
							"second",
							lv_second_2_0,
							"org.xtext.example.gfnc.CYK.NonTerminal");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
