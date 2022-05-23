/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.gfnc.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class CYKGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class GFNCElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.gfnc.CYK.GFNC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cWAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cWSimpleParserRuleCall_2_0 = (RuleCall)cWAssignment_2.eContents().get(0);
		private final Assignment cWAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cWSimpleParserRuleCall_3_0 = (RuleCall)cWAssignment_3.eContents().get(0);
		private final Keyword cGKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cProductionsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cProductionsProductionParserRuleCall_6_0 = (RuleCall)cProductionsAssignment_6.eContents().get(0);
		
		//GFNC:
		//    'W' ':' w+=(Simple)(w+=Simple)* //W is the string which will be analyzed by CYK
		//    'G' ':'  productions+=Production*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'W' ':' w+=(Simple)(w+=Simple)* //W is the string which will be analyzed by CYK
		//'G' ':'  productions+=Production*
		public Group getGroup() { return cGroup; }
		
		//'W'
		public Keyword getWKeyword_0() { return cWKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//w+=(Simple)
		public Assignment getWAssignment_2() { return cWAssignment_2; }
		
		//(Simple)
		public RuleCall getWSimpleParserRuleCall_2_0() { return cWSimpleParserRuleCall_2_0; }
		
		//(w+=Simple)*
		public Assignment getWAssignment_3() { return cWAssignment_3; }
		
		//Simple
		public RuleCall getWSimpleParserRuleCall_3_0() { return cWSimpleParserRuleCall_3_0; }
		
		////W is the string which will be analyzed by CYK
		//   'G'
		public Keyword getGKeyword_4() { return cGKeyword_4; }
		
		//':'
		public Keyword getColonKeyword_5() { return cColonKeyword_5; }
		
		//productions+=Production*
		public Assignment getProductionsAssignment_6() { return cProductionsAssignment_6; }
		
		//Production
		public RuleCall getProductionsProductionParserRuleCall_6_0() { return cProductionsProductionParserRuleCall_6_0; }
	}
	public class ProductionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.gfnc.CYK.Production");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftNonTerminalParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRightAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRightRightParserRuleCall_2_0 = (RuleCall)cRightAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cVerticalLineKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cRightAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cRightRightParserRuleCall_3_1_0 = (RuleCall)cRightAssignment_3_1.eContents().get(0);
		
		//Production:
		//    left=NonTerminal '->' right +=(Right)('|' + right+=Right)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//left=NonTerminal '->' right +=(Right)('|' + right+=Right)*
		public Group getGroup() { return cGroup; }
		
		//left=NonTerminal
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//NonTerminal
		public RuleCall getLeftNonTerminalParserRuleCall_0_0() { return cLeftNonTerminalParserRuleCall_0_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }
		
		//right +=(Right)
		public Assignment getRightAssignment_2() { return cRightAssignment_2; }
		
		//(Right)
		public RuleCall getRightRightParserRuleCall_2_0() { return cRightRightParserRuleCall_2_0; }
		
		//('|' + right+=Right)*
		public Group getGroup_3() { return cGroup_3; }
		
		//'|' +
		public Keyword getVerticalLineKeyword_3_0() { return cVerticalLineKeyword_3_0; }
		
		//right+=Right
		public Assignment getRightAssignment_3_1() { return cRightAssignment_3_1; }
		
		//Right
		public RuleCall getRightRightParserRuleCall_3_1_0() { return cRightRightParserRuleCall_3_1_0; }
	}
	public class RightElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.gfnc.CYK.Right");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cSimpleAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cSimpleSimpleParserRuleCall_0_0 = (RuleCall)cSimpleAssignment_0.eContents().get(0);
		private final Assignment cBinaryAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cBinaryBinaryParserRuleCall_1_0 = (RuleCall)cBinaryAssignment_1.eContents().get(0);
		private final Assignment cLambdaAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cLambda_Keyword_2_0 = (Keyword)cLambdaAssignment_2.eContents().get(0);
		
		//Right:
		//    simple=Simple | binary=Binary | lambda = '_'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//simple=Simple | binary=Binary | lambda = '_'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//simple=Simple
		public Assignment getSimpleAssignment_0() { return cSimpleAssignment_0; }
		
		//Simple
		public RuleCall getSimpleSimpleParserRuleCall_0_0() { return cSimpleSimpleParserRuleCall_0_0; }
		
		//binary=Binary
		public Assignment getBinaryAssignment_1() { return cBinaryAssignment_1; }
		
		//Binary
		public RuleCall getBinaryBinaryParserRuleCall_1_0() { return cBinaryBinaryParserRuleCall_1_0; }
		
		//lambda = '_'
		public Assignment getLambdaAssignment_2() { return cLambdaAssignment_2; }
		
		//'_'
		public Keyword getLambda_Keyword_2_0() { return cLambda_Keyword_2_0; }
	}
	public class SimpleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.gfnc.CYK.Simple");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSimpleAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTerminalsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cTerminalsAlternatives_1_0 = (Alternatives)cTerminalsAssignment_1.eContents().get(0);
		private final Keyword cTerminalsAKeyword_1_0_0 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(0);
		private final Keyword cTerminalsBKeyword_1_0_1 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(1);
		private final Keyword cTerminalsCKeyword_1_0_2 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(2);
		private final Keyword cTerminalsDKeyword_1_0_3 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(3);
		private final Keyword cTerminalsEKeyword_1_0_4 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(4);
		private final Keyword cTerminalsFKeyword_1_0_5 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(5);
		private final Keyword cTerminalsGKeyword_1_0_6 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(6);
		private final Keyword cTerminalsHKeyword_1_0_7 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(7);
		private final Keyword cTerminalsIKeyword_1_0_8 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(8);
		private final Keyword cTerminalsJKeyword_1_0_9 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(9);
		private final Keyword cTerminalsKKeyword_1_0_10 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(10);
		private final Keyword cTerminalsLKeyword_1_0_11 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(11);
		private final Keyword cTerminalsMKeyword_1_0_12 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(12);
		private final Keyword cTerminalsNKeyword_1_0_13 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(13);
		private final Keyword cTerminalsOKeyword_1_0_14 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(14);
		private final Keyword cTerminalsPKeyword_1_0_15 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(15);
		private final Keyword cTerminalsQKeyword_1_0_16 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(16);
		private final Keyword cTerminalsRKeyword_1_0_17 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(17);
		private final Keyword cTerminalsSKeyword_1_0_18 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(18);
		private final Keyword cTerminalsTKeyword_1_0_19 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(19);
		private final Keyword cTerminalsVKeyword_1_0_20 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(20);
		private final Keyword cTerminalsWKeyword_1_0_21 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(21);
		private final Keyword cTerminalsXKeyword_1_0_22 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(22);
		private final Keyword cTerminalsYKeyword_1_0_23 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(23);
		private final Keyword cTerminalsZKeyword_1_0_24 = (Keyword)cTerminalsAlternatives_1_0.eContents().get(24);
		
		//Simple:
		//    {Simple} terminals = ('a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|
		//    'm'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'v'|'w'|'x'|'y'|'z')
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Simple} terminals = ('a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|
		//'m'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'v'|'w'|'x'|'y'|'z')
		public Group getGroup() { return cGroup; }
		
		//{Simple}
		public Action getSimpleAction_0() { return cSimpleAction_0; }
		
		//terminals = ('a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|
		//   'm'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'v'|'w'|'x'|'y'|'z')
		public Assignment getTerminalsAssignment_1() { return cTerminalsAssignment_1; }
		
		//('a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|
		//   'm'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'v'|'w'|'x'|'y'|'z')
		public Alternatives getTerminalsAlternatives_1_0() { return cTerminalsAlternatives_1_0; }
		
		//'a'
		public Keyword getTerminalsAKeyword_1_0_0() { return cTerminalsAKeyword_1_0_0; }
		
		//'b'
		public Keyword getTerminalsBKeyword_1_0_1() { return cTerminalsBKeyword_1_0_1; }
		
		//'c'
		public Keyword getTerminalsCKeyword_1_0_2() { return cTerminalsCKeyword_1_0_2; }
		
		//'d'
		public Keyword getTerminalsDKeyword_1_0_3() { return cTerminalsDKeyword_1_0_3; }
		
		//'e'
		public Keyword getTerminalsEKeyword_1_0_4() { return cTerminalsEKeyword_1_0_4; }
		
		//'f'
		public Keyword getTerminalsFKeyword_1_0_5() { return cTerminalsFKeyword_1_0_5; }
		
		//'g'
		public Keyword getTerminalsGKeyword_1_0_6() { return cTerminalsGKeyword_1_0_6; }
		
		//'h'
		public Keyword getTerminalsHKeyword_1_0_7() { return cTerminalsHKeyword_1_0_7; }
		
		//'i'
		public Keyword getTerminalsIKeyword_1_0_8() { return cTerminalsIKeyword_1_0_8; }
		
		//'j'
		public Keyword getTerminalsJKeyword_1_0_9() { return cTerminalsJKeyword_1_0_9; }
		
		//'k'
		public Keyword getTerminalsKKeyword_1_0_10() { return cTerminalsKKeyword_1_0_10; }
		
		//'l'
		public Keyword getTerminalsLKeyword_1_0_11() { return cTerminalsLKeyword_1_0_11; }
		
		//'m'
		public Keyword getTerminalsMKeyword_1_0_12() { return cTerminalsMKeyword_1_0_12; }
		
		//'n'
		public Keyword getTerminalsNKeyword_1_0_13() { return cTerminalsNKeyword_1_0_13; }
		
		//'o'
		public Keyword getTerminalsOKeyword_1_0_14() { return cTerminalsOKeyword_1_0_14; }
		
		//'p'
		public Keyword getTerminalsPKeyword_1_0_15() { return cTerminalsPKeyword_1_0_15; }
		
		//'q'
		public Keyword getTerminalsQKeyword_1_0_16() { return cTerminalsQKeyword_1_0_16; }
		
		//'r'
		public Keyword getTerminalsRKeyword_1_0_17() { return cTerminalsRKeyword_1_0_17; }
		
		//'s'
		public Keyword getTerminalsSKeyword_1_0_18() { return cTerminalsSKeyword_1_0_18; }
		
		//'t'
		public Keyword getTerminalsTKeyword_1_0_19() { return cTerminalsTKeyword_1_0_19; }
		
		//'v'
		public Keyword getTerminalsVKeyword_1_0_20() { return cTerminalsVKeyword_1_0_20; }
		
		//'w'
		public Keyword getTerminalsWKeyword_1_0_21() { return cTerminalsWKeyword_1_0_21; }
		
		//'x'
		public Keyword getTerminalsXKeyword_1_0_22() { return cTerminalsXKeyword_1_0_22; }
		
		//'y'
		public Keyword getTerminalsYKeyword_1_0_23() { return cTerminalsYKeyword_1_0_23; }
		
		//'z'
		public Keyword getTerminalsZKeyword_1_0_24() { return cTerminalsZKeyword_1_0_24; }
	}
	public class NonTerminalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.gfnc.CYK.NonTerminal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNonTerminalAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNoTerminalsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cNoTerminalsAlternatives_1_0 = (Alternatives)cNoTerminalsAssignment_1.eContents().get(0);
		private final Keyword cNoTerminalsAKeyword_1_0_0 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(0);
		private final Keyword cNoTerminalsBKeyword_1_0_1 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(1);
		private final Keyword cNoTerminalsCKeyword_1_0_2 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(2);
		private final Keyword cNoTerminalsDKeyword_1_0_3 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(3);
		private final Keyword cNoTerminalsEKeyword_1_0_4 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(4);
		private final Keyword cNoTerminalsFKeyword_1_0_5 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(5);
		private final Keyword cNoTerminalsGKeyword_1_0_6 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(6);
		private final Keyword cNoTerminalsHKeyword_1_0_7 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(7);
		private final Keyword cNoTerminalsIKeyword_1_0_8 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(8);
		private final Keyword cNoTerminalsJKeyword_1_0_9 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(9);
		private final Keyword cNoTerminalsKKeyword_1_0_10 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(10);
		private final Keyword cNoTerminalsLKeyword_1_0_11 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(11);
		private final Keyword cNoTerminalsMKeyword_1_0_12 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(12);
		private final Keyword cNoTerminalsNKeyword_1_0_13 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(13);
		private final Keyword cNoTerminalsOKeyword_1_0_14 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(14);
		private final Keyword cNoTerminalsPKeyword_1_0_15 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(15);
		private final Keyword cNoTerminalsQKeyword_1_0_16 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(16);
		private final Keyword cNoTerminalsRKeyword_1_0_17 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(17);
		private final Keyword cNoTerminalsSKeyword_1_0_18 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(18);
		private final Keyword cNoTerminalsTKeyword_1_0_19 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(19);
		private final Keyword cNoTerminalsUKeyword_1_0_20 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(20);
		private final Keyword cNoTerminalsVKeyword_1_0_21 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(21);
		private final Keyword cNoTerminalsWKeyword_1_0_22 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(22);
		private final Keyword cNoTerminalsXKeyword_1_0_23 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(23);
		private final Keyword cNoTerminalsYKeyword_1_0_24 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(24);
		private final Keyword cNoTerminalsZKeyword_1_0_25 = (Keyword)cNoTerminalsAlternatives_1_0.eContents().get(25);
		
		//NonTerminal:
		//    {NonTerminal} noTerminals = ('A'|'B'|'C'| 'D'|'E'|'F'|'G'|'H'|'I'|'J'|'K'|'L'|
		//    'M'|'N'|'O'|'P'|'Q'|'R'|'S'|'T'|'U'|'V'|'W'| 'X'|'Y'|'Z')
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{NonTerminal} noTerminals = ('A'|'B'|'C'| 'D'|'E'|'F'|'G'|'H'|'I'|'J'|'K'|'L'|
		//'M'|'N'|'O'|'P'|'Q'|'R'|'S'|'T'|'U'|'V'|'W'| 'X'|'Y'|'Z')
		public Group getGroup() { return cGroup; }
		
		//{NonTerminal}
		public Action getNonTerminalAction_0() { return cNonTerminalAction_0; }
		
		//noTerminals = ('A'|'B'|'C'| 'D'|'E'|'F'|'G'|'H'|'I'|'J'|'K'|'L'|
		//   'M'|'N'|'O'|'P'|'Q'|'R'|'S'|'T'|'U'|'V'|'W'| 'X'|'Y'|'Z')
		public Assignment getNoTerminalsAssignment_1() { return cNoTerminalsAssignment_1; }
		
		//('A'|'B'|'C'| 'D'|'E'|'F'|'G'|'H'|'I'|'J'|'K'|'L'|
		//   'M'|'N'|'O'|'P'|'Q'|'R'|'S'|'T'|'U'|'V'|'W'| 'X'|'Y'|'Z')
		public Alternatives getNoTerminalsAlternatives_1_0() { return cNoTerminalsAlternatives_1_0; }
		
		//'A'
		public Keyword getNoTerminalsAKeyword_1_0_0() { return cNoTerminalsAKeyword_1_0_0; }
		
		//'B'
		public Keyword getNoTerminalsBKeyword_1_0_1() { return cNoTerminalsBKeyword_1_0_1; }
		
		//'C'
		public Keyword getNoTerminalsCKeyword_1_0_2() { return cNoTerminalsCKeyword_1_0_2; }
		
		//'D'
		public Keyword getNoTerminalsDKeyword_1_0_3() { return cNoTerminalsDKeyword_1_0_3; }
		
		//'E'
		public Keyword getNoTerminalsEKeyword_1_0_4() { return cNoTerminalsEKeyword_1_0_4; }
		
		//'F'
		public Keyword getNoTerminalsFKeyword_1_0_5() { return cNoTerminalsFKeyword_1_0_5; }
		
		//'G'
		public Keyword getNoTerminalsGKeyword_1_0_6() { return cNoTerminalsGKeyword_1_0_6; }
		
		//'H'
		public Keyword getNoTerminalsHKeyword_1_0_7() { return cNoTerminalsHKeyword_1_0_7; }
		
		//'I'
		public Keyword getNoTerminalsIKeyword_1_0_8() { return cNoTerminalsIKeyword_1_0_8; }
		
		//'J'
		public Keyword getNoTerminalsJKeyword_1_0_9() { return cNoTerminalsJKeyword_1_0_9; }
		
		//'K'
		public Keyword getNoTerminalsKKeyword_1_0_10() { return cNoTerminalsKKeyword_1_0_10; }
		
		//'L'
		public Keyword getNoTerminalsLKeyword_1_0_11() { return cNoTerminalsLKeyword_1_0_11; }
		
		//'M'
		public Keyword getNoTerminalsMKeyword_1_0_12() { return cNoTerminalsMKeyword_1_0_12; }
		
		//'N'
		public Keyword getNoTerminalsNKeyword_1_0_13() { return cNoTerminalsNKeyword_1_0_13; }
		
		//'O'
		public Keyword getNoTerminalsOKeyword_1_0_14() { return cNoTerminalsOKeyword_1_0_14; }
		
		//'P'
		public Keyword getNoTerminalsPKeyword_1_0_15() { return cNoTerminalsPKeyword_1_0_15; }
		
		//'Q'
		public Keyword getNoTerminalsQKeyword_1_0_16() { return cNoTerminalsQKeyword_1_0_16; }
		
		//'R'
		public Keyword getNoTerminalsRKeyword_1_0_17() { return cNoTerminalsRKeyword_1_0_17; }
		
		//'S'
		public Keyword getNoTerminalsSKeyword_1_0_18() { return cNoTerminalsSKeyword_1_0_18; }
		
		//'T'
		public Keyword getNoTerminalsTKeyword_1_0_19() { return cNoTerminalsTKeyword_1_0_19; }
		
		//'U'
		public Keyword getNoTerminalsUKeyword_1_0_20() { return cNoTerminalsUKeyword_1_0_20; }
		
		//'V'
		public Keyword getNoTerminalsVKeyword_1_0_21() { return cNoTerminalsVKeyword_1_0_21; }
		
		//'W'
		public Keyword getNoTerminalsWKeyword_1_0_22() { return cNoTerminalsWKeyword_1_0_22; }
		
		//'X'
		public Keyword getNoTerminalsXKeyword_1_0_23() { return cNoTerminalsXKeyword_1_0_23; }
		
		//'Y'
		public Keyword getNoTerminalsYKeyword_1_0_24() { return cNoTerminalsYKeyword_1_0_24; }
		
		//'Z'
		public Keyword getNoTerminalsZKeyword_1_0_25() { return cNoTerminalsZKeyword_1_0_25; }
	}
	public class BinaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.gfnc.CYK.Binary");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBinaryAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cFirstAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cFirstNonTerminalParserRuleCall_1_0_0 = (RuleCall)cFirstAssignment_1_0.eContents().get(0);
		private final Assignment cSecondAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSecondNonTerminalParserRuleCall_1_1_0 = (RuleCall)cSecondAssignment_1_1.eContents().get(0);
		
		//Binary:
		//    {Binary}(first=NonTerminal second=NonTerminal)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Binary}(first=NonTerminal second=NonTerminal)
		public Group getGroup() { return cGroup; }
		
		//{Binary}
		public Action getBinaryAction_0() { return cBinaryAction_0; }
		
		//(first=NonTerminal second=NonTerminal)
		public Group getGroup_1() { return cGroup_1; }
		
		//first=NonTerminal
		public Assignment getFirstAssignment_1_0() { return cFirstAssignment_1_0; }
		
		//NonTerminal
		public RuleCall getFirstNonTerminalParserRuleCall_1_0_0() { return cFirstNonTerminalParserRuleCall_1_0_0; }
		
		//second=NonTerminal
		public Assignment getSecondAssignment_1_1() { return cSecondAssignment_1_1; }
		
		//NonTerminal
		public RuleCall getSecondNonTerminalParserRuleCall_1_1_0() { return cSecondNonTerminalParserRuleCall_1_1_0; }
	}
	
	
	private final GFNCElements pGFNC;
	private final ProductionElements pProduction;
	private final RightElements pRight;
	private final SimpleElements pSimple;
	private final NonTerminalElements pNonTerminal;
	private final BinaryElements pBinary;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CYKGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGFNC = new GFNCElements();
		this.pProduction = new ProductionElements();
		this.pRight = new RightElements();
		this.pSimple = new SimpleElements();
		this.pNonTerminal = new NonTerminalElements();
		this.pBinary = new BinaryElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.gfnc.CYK".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//GFNC:
	//    'W' ':' w+=(Simple)(w+=Simple)* //W is the string which will be analyzed by CYK
	//    'G' ':'  productions+=Production*
	//;
	public GFNCElements getGFNCAccess() {
		return pGFNC;
	}
	
	public ParserRule getGFNCRule() {
		return getGFNCAccess().getRule();
	}
	
	//Production:
	//    left=NonTerminal '->' right +=(Right)('|' + right+=Right)*
	//;
	public ProductionElements getProductionAccess() {
		return pProduction;
	}
	
	public ParserRule getProductionRule() {
		return getProductionAccess().getRule();
	}
	
	//Right:
	//    simple=Simple | binary=Binary | lambda = '_'
	//;
	public RightElements getRightAccess() {
		return pRight;
	}
	
	public ParserRule getRightRule() {
		return getRightAccess().getRule();
	}
	
	//Simple:
	//    {Simple} terminals = ('a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|
	//    'm'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'v'|'w'|'x'|'y'|'z')
	//;
	public SimpleElements getSimpleAccess() {
		return pSimple;
	}
	
	public ParserRule getSimpleRule() {
		return getSimpleAccess().getRule();
	}
	
	//NonTerminal:
	//    {NonTerminal} noTerminals = ('A'|'B'|'C'| 'D'|'E'|'F'|'G'|'H'|'I'|'J'|'K'|'L'|
	//    'M'|'N'|'O'|'P'|'Q'|'R'|'S'|'T'|'U'|'V'|'W'| 'X'|'Y'|'Z')
	//;
	public NonTerminalElements getNonTerminalAccess() {
		return pNonTerminal;
	}
	
	public ParserRule getNonTerminalRule() {
		return getNonTerminalAccess().getRule();
	}
	
	//Binary:
	//    {Binary}(first=NonTerminal second=NonTerminal)
	//;
	public BinaryElements getBinaryAccess() {
		return pBinary;
	}
	
	public ParserRule getBinaryRule() {
		return getBinaryAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
