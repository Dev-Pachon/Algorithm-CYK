/*
 * generated by Xtext 2.26.0
 */
grammar InternalCYK;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.gfnc.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleGFNC
entryRuleGFNC
:
{ before(grammarAccess.getGFNCRule()); }
	 ruleGFNC
{ after(grammarAccess.getGFNCRule()); } 
	 EOF 
;

// Rule GFNC
ruleGFNC 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGFNCAccess().getGroup()); }
		(rule__GFNC__Group__0)
		{ after(grammarAccess.getGFNCAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProduction
entryRuleProduction
:
{ before(grammarAccess.getProductionRule()); }
	 ruleProduction
{ after(grammarAccess.getProductionRule()); } 
	 EOF 
;

// Rule Production
ruleProduction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProductionAccess().getGroup()); }
		(rule__Production__Group__0)
		{ after(grammarAccess.getProductionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRight
entryRuleRight
:
{ before(grammarAccess.getRightRule()); }
	 ruleRight
{ after(grammarAccess.getRightRule()); } 
	 EOF 
;

// Rule Right
ruleRight 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRightAccess().getAlternatives()); }
		(rule__Right__Alternatives)
		{ after(grammarAccess.getRightAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSimple
entryRuleSimple
:
{ before(grammarAccess.getSimpleRule()); }
	 ruleSimple
{ after(grammarAccess.getSimpleRule()); } 
	 EOF 
;

// Rule Simple
ruleSimple 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSimpleAccess().getGroup()); }
		(rule__Simple__Group__0)
		{ after(grammarAccess.getSimpleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNonTerminal
entryRuleNonTerminal
:
{ before(grammarAccess.getNonTerminalRule()); }
	 ruleNonTerminal
{ after(grammarAccess.getNonTerminalRule()); } 
	 EOF 
;

// Rule NonTerminal
ruleNonTerminal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNonTerminalAccess().getGroup()); }
		(rule__NonTerminal__Group__0)
		{ after(grammarAccess.getNonTerminalAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBinary
entryRuleBinary
:
{ before(grammarAccess.getBinaryRule()); }
	 ruleBinary
{ after(grammarAccess.getBinaryRule()); } 
	 EOF 
;

// Rule Binary
ruleBinary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBinaryAccess().getGroup()); }
		(rule__Binary__Group__0)
		{ after(grammarAccess.getBinaryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Right__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRightAccess().getSimpleAssignment_0()); }
		(rule__Right__SimpleAssignment_0)
		{ after(grammarAccess.getRightAccess().getSimpleAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getRightAccess().getBinaryAssignment_1()); }
		(rule__Right__BinaryAssignment_1)
		{ after(grammarAccess.getRightAccess().getBinaryAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getRightAccess().getLambdaAssignment_2()); }
		(rule__Right__LambdaAssignment_2)
		{ after(grammarAccess.getRightAccess().getLambdaAssignment_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__TerminalsAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsAKeyword_1_0_0()); }
		'a'
		{ after(grammarAccess.getSimpleAccess().getTerminalsAKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsBKeyword_1_0_1()); }
		'b'
		{ after(grammarAccess.getSimpleAccess().getTerminalsBKeyword_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsCKeyword_1_0_2()); }
		'c'
		{ after(grammarAccess.getSimpleAccess().getTerminalsCKeyword_1_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsDKeyword_1_0_3()); }
		'd'
		{ after(grammarAccess.getSimpleAccess().getTerminalsDKeyword_1_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsEKeyword_1_0_4()); }
		'e'
		{ after(grammarAccess.getSimpleAccess().getTerminalsEKeyword_1_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsFKeyword_1_0_5()); }
		'f'
		{ after(grammarAccess.getSimpleAccess().getTerminalsFKeyword_1_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsGKeyword_1_0_6()); }
		'g'
		{ after(grammarAccess.getSimpleAccess().getTerminalsGKeyword_1_0_6()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsHKeyword_1_0_7()); }
		'h'
		{ after(grammarAccess.getSimpleAccess().getTerminalsHKeyword_1_0_7()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsIKeyword_1_0_8()); }
		'i'
		{ after(grammarAccess.getSimpleAccess().getTerminalsIKeyword_1_0_8()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsJKeyword_1_0_9()); }
		'j'
		{ after(grammarAccess.getSimpleAccess().getTerminalsJKeyword_1_0_9()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsKKeyword_1_0_10()); }
		'k'
		{ after(grammarAccess.getSimpleAccess().getTerminalsKKeyword_1_0_10()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsLKeyword_1_0_11()); }
		'l'
		{ after(grammarAccess.getSimpleAccess().getTerminalsLKeyword_1_0_11()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsMKeyword_1_0_12()); }
		'm'
		{ after(grammarAccess.getSimpleAccess().getTerminalsMKeyword_1_0_12()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsNKeyword_1_0_13()); }
		'n'
		{ after(grammarAccess.getSimpleAccess().getTerminalsNKeyword_1_0_13()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsOKeyword_1_0_14()); }
		'o'
		{ after(grammarAccess.getSimpleAccess().getTerminalsOKeyword_1_0_14()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsPKeyword_1_0_15()); }
		'p'
		{ after(grammarAccess.getSimpleAccess().getTerminalsPKeyword_1_0_15()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsQKeyword_1_0_16()); }
		'q'
		{ after(grammarAccess.getSimpleAccess().getTerminalsQKeyword_1_0_16()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsRKeyword_1_0_17()); }
		'r'
		{ after(grammarAccess.getSimpleAccess().getTerminalsRKeyword_1_0_17()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsSKeyword_1_0_18()); }
		's'
		{ after(grammarAccess.getSimpleAccess().getTerminalsSKeyword_1_0_18()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsTKeyword_1_0_19()); }
		't'
		{ after(grammarAccess.getSimpleAccess().getTerminalsTKeyword_1_0_19()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsVKeyword_1_0_20()); }
		'v'
		{ after(grammarAccess.getSimpleAccess().getTerminalsVKeyword_1_0_20()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsWKeyword_1_0_21()); }
		'w'
		{ after(grammarAccess.getSimpleAccess().getTerminalsWKeyword_1_0_21()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsXKeyword_1_0_22()); }
		'x'
		{ after(grammarAccess.getSimpleAccess().getTerminalsXKeyword_1_0_22()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsYKeyword_1_0_23()); }
		'y'
		{ after(grammarAccess.getSimpleAccess().getTerminalsYKeyword_1_0_23()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsZKeyword_1_0_24()); }
		'z'
		{ after(grammarAccess.getSimpleAccess().getTerminalsZKeyword_1_0_24()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonTerminal__NoTerminalsAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsAKeyword_1_0_0()); }
		'A'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsAKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsBKeyword_1_0_1()); }
		'B'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsBKeyword_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsCKeyword_1_0_2()); }
		'C'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsCKeyword_1_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsDKeyword_1_0_3()); }
		'D'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsDKeyword_1_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsEKeyword_1_0_4()); }
		'E'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsEKeyword_1_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsFKeyword_1_0_5()); }
		'F'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsFKeyword_1_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsGKeyword_1_0_6()); }
		'G'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsGKeyword_1_0_6()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsHKeyword_1_0_7()); }
		'H'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsHKeyword_1_0_7()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsIKeyword_1_0_8()); }
		'I'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsIKeyword_1_0_8()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsJKeyword_1_0_9()); }
		'J'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsJKeyword_1_0_9()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsKKeyword_1_0_10()); }
		'K'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsKKeyword_1_0_10()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsLKeyword_1_0_11()); }
		'L'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsLKeyword_1_0_11()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsMKeyword_1_0_12()); }
		'M'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsMKeyword_1_0_12()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsNKeyword_1_0_13()); }
		'N'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsNKeyword_1_0_13()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsOKeyword_1_0_14()); }
		'O'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsOKeyword_1_0_14()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsPKeyword_1_0_15()); }
		'P'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsPKeyword_1_0_15()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsQKeyword_1_0_16()); }
		'Q'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsQKeyword_1_0_16()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsRKeyword_1_0_17()); }
		'R'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsRKeyword_1_0_17()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsSKeyword_1_0_18()); }
		'S'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsSKeyword_1_0_18()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsTKeyword_1_0_19()); }
		'T'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsTKeyword_1_0_19()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsUKeyword_1_0_20()); }
		'U'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsUKeyword_1_0_20()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsVKeyword_1_0_21()); }
		'V'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsVKeyword_1_0_21()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsWKeyword_1_0_22()); }
		'W'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsWKeyword_1_0_22()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsXKeyword_1_0_23()); }
		'X'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsXKeyword_1_0_23()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsYKeyword_1_0_24()); }
		'Y'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsYKeyword_1_0_24()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsZKeyword_1_0_25()); }
		'Z'
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsZKeyword_1_0_25()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GFNC__Group__0__Impl
	rule__GFNC__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGFNCAccess().getWKeyword_0()); }
	'W'
	{ after(grammarAccess.getGFNCAccess().getWKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GFNC__Group__1__Impl
	rule__GFNC__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGFNCAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getGFNCAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GFNC__Group__2__Impl
	rule__GFNC__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGFNCAccess().getWAssignment_2()); }
	(rule__GFNC__WAssignment_2)
	{ after(grammarAccess.getGFNCAccess().getWAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GFNC__Group__3__Impl
	rule__GFNC__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGFNCAccess().getWAssignment_3()); }
	(rule__GFNC__WAssignment_3)*
	{ after(grammarAccess.getGFNCAccess().getWAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GFNC__Group__4__Impl
	rule__GFNC__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGFNCAccess().getGKeyword_4()); }
	'G'
	{ after(grammarAccess.getGFNCAccess().getGKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GFNC__Group__5__Impl
	rule__GFNC__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGFNCAccess().getColonKeyword_5()); }
	':'
	{ after(grammarAccess.getGFNCAccess().getColonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GFNC__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGFNCAccess().getProductionsAssignment_6()); }
	(rule__GFNC__ProductionsAssignment_6)*
	{ after(grammarAccess.getGFNCAccess().getProductionsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Production__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Production__Group__0__Impl
	rule__Production__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductionAccess().getLeftAssignment_0()); }
	(rule__Production__LeftAssignment_0)
	{ after(grammarAccess.getProductionAccess().getLeftAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Production__Group__1__Impl
	rule__Production__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1()); }
	'->'
	{ after(grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Production__Group__2__Impl
	rule__Production__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductionAccess().getRightAssignment_2()); }
	(rule__Production__RightAssignment_2)
	{ after(grammarAccess.getProductionAccess().getRightAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Production__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductionAccess().getGroup_3()); }
	(rule__Production__Group_3__0)*
	{ after(grammarAccess.getProductionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Production__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Production__Group_3__0__Impl
	rule__Production__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); }
		('|')
		{ after(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); }
	)
	(
		{ before(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); }
		('|')*
		{ after(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Production__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductionAccess().getRightAssignment_3_1()); }
	(rule__Production__RightAssignment_3_1)
	{ after(grammarAccess.getProductionAccess().getRightAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Simple__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__0__Impl
	rule__Simple__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getSimpleAction_0()); }
	()
	{ after(grammarAccess.getSimpleAccess().getSimpleAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getTerminalsAssignment_1()); }
	(rule__Simple__TerminalsAssignment_1)
	{ after(grammarAccess.getSimpleAccess().getTerminalsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NonTerminal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonTerminal__Group__0__Impl
	rule__NonTerminal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NonTerminal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonTerminalAccess().getNonTerminalAction_0()); }
	()
	{ after(grammarAccess.getNonTerminalAccess().getNonTerminalAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonTerminal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonTerminal__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NonTerminal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsAssignment_1()); }
	(rule__NonTerminal__NoTerminalsAssignment_1)
	{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Binary__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binary__Group__0__Impl
	rule__Binary__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryAccess().getBinaryAction_0()); }
	()
	{ after(grammarAccess.getBinaryAccess().getBinaryAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binary__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryAccess().getGroup_1()); }
	(rule__Binary__Group_1__0)
	{ after(grammarAccess.getBinaryAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Binary__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binary__Group_1__0__Impl
	rule__Binary__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryAccess().getFirstAssignment_1_0()); }
	(rule__Binary__FirstAssignment_1_0)
	{ after(grammarAccess.getBinaryAccess().getFirstAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binary__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryAccess().getSecondAssignment_1_1()); }
	(rule__Binary__SecondAssignment_1_1)
	{ after(grammarAccess.getBinaryAccess().getSecondAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GFNC__WAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGFNCAccess().getWSimpleParserRuleCall_2_0()); }
		ruleSimple
		{ after(grammarAccess.getGFNCAccess().getWSimpleParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__WAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGFNCAccess().getWSimpleParserRuleCall_3_0()); }
		ruleSimple
		{ after(grammarAccess.getGFNCAccess().getWSimpleParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GFNC__ProductionsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGFNCAccess().getProductionsProductionParserRuleCall_6_0()); }
		ruleProduction
		{ after(grammarAccess.getGFNCAccess().getProductionsProductionParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__LeftAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0()); }
		ruleNonTerminal
		{ after(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__RightAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductionAccess().getRightRightParserRuleCall_2_0()); }
		ruleRight
		{ after(grammarAccess.getProductionAccess().getRightRightParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__RightAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductionAccess().getRightRightParserRuleCall_3_1_0()); }
		ruleRight
		{ after(grammarAccess.getProductionAccess().getRightRightParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Right__SimpleAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRightAccess().getSimpleSimpleParserRuleCall_0_0()); }
		ruleSimple
		{ after(grammarAccess.getRightAccess().getSimpleSimpleParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Right__BinaryAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRightAccess().getBinaryBinaryParserRuleCall_1_0()); }
		ruleBinary
		{ after(grammarAccess.getRightAccess().getBinaryBinaryParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Right__LambdaAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRightAccess().getLambda_Keyword_2_0()); }
		(
			{ before(grammarAccess.getRightAccess().getLambda_Keyword_2_0()); }
			'_'
			{ after(grammarAccess.getRightAccess().getLambda_Keyword_2_0()); }
		)
		{ after(grammarAccess.getRightAccess().getLambda_Keyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__TerminalsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getTerminalsAlternatives_1_0()); }
		(rule__Simple__TerminalsAlternatives_1_0)
		{ after(grammarAccess.getSimpleAccess().getTerminalsAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonTerminal__NoTerminalsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonTerminalAccess().getNoTerminalsAlternatives_1_0()); }
		(rule__NonTerminal__NoTerminalsAlternatives_1_0)
		{ after(grammarAccess.getNonTerminalAccess().getNoTerminalsAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__FirstAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0()); }
		ruleNonTerminal
		{ after(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__SecondAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0()); }
		ruleNonTerminal
		{ after(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
