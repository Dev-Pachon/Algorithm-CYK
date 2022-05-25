package org.xtext.gfnc.model;

import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.gfnc.cYK.*;

public class AlgorithmCYK {

	private static boolean generated;

	public static String CYK(GFNC grammar) {
		Set<NonTerminal> table[][] = initialize(grammar);
		if (grammar.getW().getLambda() != null) {
			if (validateLambda(grammar)) {
				generated = true;
				return "[S]";
			}
			generated = false;
			return "[]";
		}

		table = step2(grammar, table);

		isGenerated(table);

		return showTable(table);

	}

	private static boolean validateLambda(GFNC grammar) {

		for (Right r : grammar.getProductions().get(0).getRight()) {
			if (r.getLambda() != null) {
				return true;
			}
		}

		return false;
	}

	private static void isGenerated(Set<NonTerminal>[][] table) {
		Set<NonTerminal> temp = table[0][table.length - 1];
		for (NonTerminal aux : temp) {
			if (aux.getNonTerminals().equals("S")) {
				generated = true;
			}
		}
	}

	@SuppressWarnings("unchecked")
	// Initializing the table with the first row of the table.
	private static Set<NonTerminal>[][] initialize(GFNC grammar) {
		int n = grammar.getW().getW().size();

		Set<NonTerminal> table[][] = new LinkedHashSet[n][];

		for (int i = 0; i < table.length; i++) {
			table[i] = new LinkedHashSet[n - i];

			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = new LinkedHashSet<NonTerminal>();
			}
		}

		for (int i = 0; i < n; i++) {
			// X(i,j) = X(i,1) := conjunto de variables A tales que A → ai
			table[i][0] = produces(grammar, i);
		}

		return table;

	}

	/**
	 * It returns a set of non-terminals that produce a given terminal
	 * 
	 * @param grammar the grammar to be analyzed
	 * @param i       the index of the terminal in the grammar's W
	 * @return A set of non-terminals that produce the terminal at position i in the
	 *         word.
	 */
	private static Set<NonTerminal> produces(GFNC grammar, int i) {
		String terminal = grammar.getW().getW().get(i).getTerminals();
		Set<NonTerminal> producedBy = new LinkedHashSet<>();
		for (Production p : grammar.getProductions()) {
			boolean produced = false;
			EList<Right> rightProductions = p.getRight();
			for (int j = 0; j < rightProductions.size() && !produced; j++) {
				if (rightProductions.get(j).getSimple() != null
						&& rightProductions.get(j).getSimple().getTerminals().equals(terminal)) {
					produced = true;
				}
			}
			if (produced)
				producedBy.add(p.getLeft());
		}
		return producedBy;
	}

	/**
	 * For each non-terminal in the grammar, check if it can produce the two sets of
	 * non-terminals in the table. If it can, add it to the table
	 * 
	 * @param grammar The grammar to be used
	 * @param table   the table that will be filled with the results of the
	 *                algorithm
	 * @return The table with the sets of non-terminals that can be produced by the
	 *         grammar.
	 */
	private static Set<NonTerminal>[][] step2(GFNC grammar, Set<NonTerminal>[][] table) {
		int n = grammar.getW().getW().size();
		for (int j = 1; j < n; j++) {
			for (int i = 0; i < n - j; i++) {
				Set<NonTerminal> temp = new LinkedHashSet<NonTerminal>();
				for (int k = 0; k < j; k++) {
					// X(i,j) := conjunto de variables A tales que A → BC es una producción de G,
					// con B ∈ X(i,k) y C ∈ X(i+k,j−k), considerando todos los k tales que 1 ≤ k < j
					// − 1.
					temp.addAll(
							producesStep2(grammar, table[i][k], table[(i + 1) + (k + 1) - 1][(j + 1) - (k + 1) - 1]));
				}
				table[i][j] = temp;
			}
		}
		return table;
	}

	/**
	 * Given a grammar, a set of non-terminals B and a set of non-terminals C, this
	 * function returns the set of non-terminals that can produce a string of the
	 * form BxC
	 * 
	 * @param grammar the grammar to be analyzed
	 * @param B       the set of non-terminals
	 * @param C       the set of non-terminals
	 * @return A set of non-terminals that can produce the binary production of the
	 *         form BxC.
	 */
	private static Set<NonTerminal> producesStep2(GFNC grammar, Set<NonTerminal> B, Set<NonTerminal> C) {
		Set<NonTerminal> producedBy = new LinkedHashSet<NonTerminal>();
		for (Production p : grammar.getProductions()) {
			boolean produced = false;
			EList<Right> rightProductions = p.getRight();
			for (int i = 0; i < rightProductions.size() && !produced; i++) {
				for (NonTerminal nonTerminalB : B) {
					for (NonTerminal nonTerminalC : C) {
						Binary binaryProduction = rightProductions.get(i).getBinary();
						if (binaryProduction != null
								&& binaryProduction.getFirst().getNonTerminals().equals(nonTerminalB.getNonTerminals())
								&& binaryProduction.getSecond().getNonTerminals()
										.equals(nonTerminalC.getNonTerminals())) {
							produced = true;
						}
					}
				}
			}
			if (produced)
				producedBy.add(p.getLeft());
		}
		return producedBy;
	}

	/**
	 * It takes a 2D array of sets of non-terminals and returns a string
	 * representation of the table
	 * 
	 * @param table The table to be printed
	 * @return A string representation of the table.
	 */
	private static String showTable(Set<NonTerminal> table[][]) {
		String msg = "";
		for (int i = 0; i < table.length; i++) {
			
			final Object[] line = new String[table[i].length];
			
			for (int j = 0; j < table[i].length; j++) {
				String lineAux = "";
				lineAux += "[";
				for (NonTerminal nt : table[i][j])
					lineAux += nt.getNonTerminals() + " ";
				lineAux = lineAux.trim();
				lineAux += "] ";
				line[j] = lineAux;
			}
			
			String format = "";
			
			for(int f = 0; f < table[i].length;f++) {
				format += "%-15s";
			}
			format += " \r";
			
			msg += String.format(format,line);
			
			msg = msg.trim();
			msg += "\n";
			
		}

		return msg;
	}

	public static String message() {
		if (generated) {
			return "es generada por la gramática.";
		} else {
			return "NO es generada por la gramática.";
		}
	}
}
