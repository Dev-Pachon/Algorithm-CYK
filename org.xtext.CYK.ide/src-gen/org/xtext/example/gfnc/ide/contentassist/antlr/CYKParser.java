/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.gfnc.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.gfnc.ide.contentassist.antlr.internal.InternalCYKParser;
import org.xtext.example.gfnc.services.CYKGrammarAccess;

public class CYKParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CYKGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CYKGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getLambdaAccess().getAlternatives(), "rule__Lambda__Alternatives");
			builder.put(grammarAccess.getRightAccess().getAlternatives(), "rule__Right__Alternatives");
			builder.put(grammarAccess.getSimpleAccess().getAlternatives(), "rule__Simple__Alternatives");
			builder.put(grammarAccess.getNonTerminalAccess().getAlternatives(), "rule__NonTerminal__Alternatives");
			builder.put(grammarAccess.getGFNCAccess().getGroup(), "rule__GFNC__Group__0");
			builder.put(grammarAccess.getInitialAccess().getGroup(), "rule__Initial__Group__0");
			builder.put(grammarAccess.getInitialAccess().getGroup_3(), "rule__Initial__Group_3__0");
			builder.put(grammarAccess.getProductionAccess().getGroup(), "rule__Production__Group__0");
			builder.put(grammarAccess.getProductionAccess().getGroup_3(), "rule__Production__Group_3__0");
			builder.put(grammarAccess.getBinaryAccess().getGroup(), "rule__Binary__Group__0");
			builder.put(grammarAccess.getGFNCAccess().getInitAssignment_0(), "rule__GFNC__InitAssignment_0");
			builder.put(grammarAccess.getGFNCAccess().getProductionsAssignment_1(), "rule__GFNC__ProductionsAssignment_1");
			builder.put(grammarAccess.getInitialAccess().getLeftAssignment_0(), "rule__Initial__LeftAssignment_0");
			builder.put(grammarAccess.getInitialAccess().getRightAssignment_2(), "rule__Initial__RightAssignment_2");
			builder.put(grammarAccess.getInitialAccess().getRightAssignment_3_1(), "rule__Initial__RightAssignment_3_1");
			builder.put(grammarAccess.getLambdaAccess().getRightAssignment_0(), "rule__Lambda__RightAssignment_0");
			builder.put(grammarAccess.getProductionAccess().getLeftAssignment_0(), "rule__Production__LeftAssignment_0");
			builder.put(grammarAccess.getProductionAccess().getRightAssignment_2(), "rule__Production__RightAssignment_2");
			builder.put(grammarAccess.getProductionAccess().getRightAssignment_3_1(), "rule__Production__RightAssignment_3_1");
			builder.put(grammarAccess.getSimpleAccess().getAlphaAssignment_0(), "rule__Simple__AlphaAssignment_0");
			builder.put(grammarAccess.getNonTerminalAccess().getVarAssignment_0(), "rule__NonTerminal__VarAssignment_0");
			builder.put(grammarAccess.getBinaryAccess().getFirstAssignment_0(), "rule__Binary__FirstAssignment_0");
			builder.put(grammarAccess.getBinaryAccess().getSecondAssignment_1(), "rule__Binary__SecondAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CYKGrammarAccess grammarAccess;

	@Override
	protected InternalCYKParser createParser() {
		InternalCYKParser result = new InternalCYKParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CYKGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CYKGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
