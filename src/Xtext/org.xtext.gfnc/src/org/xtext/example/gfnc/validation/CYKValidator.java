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
	public void checkGreetingStartsWithCapital(GFNC grammar) {
		if (!grammar.getProductions().isEmpty() && !grammar.getProductions().get(0).getLeft().getNoTerminals().equals("S")) {
			error("The grammar must starts with the non Terminal S",  CYKPackage.Literals.GFNC__PRODUCTIONS);
		}
	}

	@Check
	public void checkUniqueNonTerminals(Production production) {
		GFNC superEntity = ((GFNC) production.eContainer());
		if (superEntity != null) {
			int cont = 0;
			for (Production other : superEntity.getProductions()) {
				if (production.getLeft().getNoTerminals().equals(other.getLeft().getNoTerminals())) {
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
	public void checkUniqueLambda(Rigth rigth) {
		GFNC superEntity = ((GFNC) rigth.eContainer().eContainer());
		if (superEntity != null && rigth.getLambda() != null) {
			int cont = 0;
			int numProduction = 0;
			if (!superEntity.getProductions().isEmpty())
				for (Production other : superEntity.getProductions()) {
					numProduction++;
					for (Rigth r : other.getRigth()) {
						if (r.getLambda() != null) {
							cont++;
						}
					}
					if (numProduction == 1 && cont > 1) {
						error("The production lambda is duplicated", CYKPackage.Literals.RIGTH__LAMBDA);
						return;
					} else if (cont > 1) {
						error("The lambda must be only in the first production", CYKPackage.Literals.RIGTH__LAMBDA);
						return;
					}
				}

		}
	}
	
	@Check
	public void checkString(GFNC grammar) {
		if(!grammar.getW().isEmpty()) {
			for(Simple ter: grammar.getW()) {
				boolean belongs = false;
				if(!grammar.getProductions().isEmpty()) {
					for(Production production:grammar.getProductions()) {
						for(Rigth rigth: production.getRigth()) {
							if(rigth.getSimple()!=null&&rigth.getSimple().getTerminals().equals(ter.getTerminals())) {
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
