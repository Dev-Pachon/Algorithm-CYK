package org.xtext.gfnc.model;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.gfnc.cYK.*;

public class AlgorithmCYK {

    public static String CYK(GFNC grammar){
    	ArrayList<NonTerminal> table[][] = initialize(grammar);
    	
    	table = step2(grammar, table);
    	
        return showTable(table);
    }

    @SuppressWarnings("unchecked")
	private static ArrayList<NonTerminal>[][] initialize(GFNC grammar){
        int n = grammar.getW().size();
        
        ArrayList<NonTerminal> table[][] = new ArrayList[n][];
        
        for (int i = 0; i < table.length; i++) {
            table[i] = new ArrayList[n-i];
            
            for(int j = 0; j< table[i].length; j++) {
            	table[i][j] = new ArrayList<>();
            }
        }

        for (int i = 0; i < n; i++) {
            //X(i,j) = X(i,1) := conjunto de variables A tales que A → ai
            table[i][0] = produces(grammar, i);
        }
        
        return table;
        
    }

    private static ArrayList<NonTerminal> produces(GFNC grammar, int i) {
    	String terminal = grammar.getW().get(i).getTerminals();
    	ArrayList<NonTerminal> producedBy = new ArrayList<>();
		for(Production p : grammar.getProductions()) {
			boolean produced = false;
			EList<Right> rightProductions = p.getRight();
			for(int j = 0; j < rightProductions.size()&& !produced;j++) {
				if(rightProductions.get(j).getSimple()!=null &&
						rightProductions.get(j).getSimple().getTerminals().equals(terminal)) {
					produced = true;
				}
			}
			if(produced) producedBy.add(p.getLeft());
		}
		return producedBy;
	}

	private static ArrayList<NonTerminal>[][] step2(GFNC grammar, ArrayList<NonTerminal>[][] table){
        int n = grammar.getW().size();
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
            	ArrayList<NonTerminal> temp = new ArrayList<>();
                for (int k = 0; k < j; k++) {
                    //X(i,j) := conjunto de variables A tales que A → BC es una producción de G,
                	//con B ∈ X(i,k) y C ∈ X(i+k,j−k), considerando todos los k tales que 1 ≤ k < j − 1.
               	 	temp.addAll(producesStep2(grammar, table[i][k], table[(i+1)+(k+1)-1][(j+1)-(k+1)-1]));
                }
                table[i][j] = temp;
            }  
        }
		return table;
    }
	
	
	
	private static ArrayList<NonTerminal> producesStep2(GFNC grammar, ArrayList<NonTerminal> B, ArrayList<NonTerminal> C) {
		ArrayList<NonTerminal> producedBy = new ArrayList<>();
		for(Production p : grammar.getProductions()) {
			boolean produced = false;
			EList<Right> rightProductions = p.getRight();
			for(int i = 0; i < rightProductions.size()&& !produced; i++) {
				for(NonTerminal nonTerminalB : B) {
					for(NonTerminal nonTerminalC : C) {
						Binary binaryProduction = rightProductions.get(i).getBinary(); 
						if(binaryProduction!=null &&
								binaryProduction.getFirst().getNonTerminals().equals(nonTerminalB.getNonTerminals()) && 
								binaryProduction.getSecond().getNonTerminals().equals(nonTerminalC.getNonTerminals())) {
							produced = true;
						}
					}
				}
			}
			if(produced) producedBy.add(p.getLeft());
		}
		return producedBy;
	}

	public static String showTable(ArrayList<NonTerminal> table[][]) {
		String msg = "";
		for (int i = 0; i < table.length; i++) {
			for(int j = 0; j< table[i].length; j++) {
				msg+= "[";
				for(NonTerminal nt : table[i][j])
					msg += nt.getNonTerminals()+ " ";
				msg = msg.trim();
				msg+= "] ";
			}
			msg = msg.trim();
			msg += "\n";
		}
		
		return msg;
	}
}
