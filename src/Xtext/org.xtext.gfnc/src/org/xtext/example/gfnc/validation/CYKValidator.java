/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.gfnc.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.gfnc.cYK.*;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class CYKValidator extends AbstractCYKValidator {
	
	@Check
	public void checkInitialProduction(GFNC grammar) {
		if (!grammar.getProductions().isEmpty() && !grammar.getProductions().get(0).getLeft().getNonTerminals().equals("S")) {
			error("The grammar must starts with the non Terminal S",  CYKPackage.Literals.GFNC__PRODUCTIONS);
		}
	}

	@Check
	public void checkUniqueNonTerminals(Production production) {
		GFNC grammar = ((GFNC) production.eContainer());
		if (grammar != null) {
			int cont = 0;
			for (Production other : grammar.getProductions()) {
				if (production.getLeft().getNonTerminals().equals(other.getLeft().getNonTerminals())) {
					cont++;
				}
			}
			if (cont > 1) {
				error("Production names have to be unique", CYKPackage.Literals.PRODUCTION__LEFT);
				return;
			}
		}
	}

	@Check
	public void checkUniqueLambda(Right right) {
		GFNC grammar = ((GFNC) right.eContainer().eContainer());
		if (grammar != null && right.getLambda() != null) {
			int cont = 0;
			int numProduction = 0;
			if (!grammar.getProductions().isEmpty())
				for (Production other : grammar.getProductions()) {
					numProduction++;
					for (Right r : other.getRight()) {
						if (r.getLambda() != null) {
							cont++;
						}
					}
					if (numProduction == 1 && cont > 1) {
						error("The production lambda is duplicated", CYKPackage.Literals.RIGHT__LAMBDA);
						return;
					} else if (cont > 1) {
						error("The lambda must be only in the first production", CYKPackage.Literals.RIGHT__LAMBDA);
						return;
					}
			}
		}
	}
	
	@Check
	public void checkString(GFNC grammar) {
		if(!grammar.getW().isEmpty()) {
			for(Terminal ter: grammar.getW()) {
				boolean belongs = false;
				if(!grammar.getProductions().isEmpty()) {
					for(Production production:grammar.getProductions()) {
						for(Right right: production.getRight()) {
							if(right.getSimple()!=null&&right.getSimple().getTerminals().equals(ter.getTerminals())) {
								belongs = true;
							}
						}
					}
					if(!belongs) {
						error("The characters of the string must be terminals of the grammar", CYKPackage.Literals.GFNC__W);
						return;
					}
				}
			}
		}
	}
	
}
