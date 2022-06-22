/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.fa.validation;

import org.polarsys.capella.core.data.fa.FunctionalExchange;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.fa.FunctionalExchangeRealization}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FunctionalExchangeRealizationValidator {
	boolean validate();

	boolean validateRealizedFunctionalExchange(FunctionalExchange value);
	boolean validateRealizingFunctionalExchange(FunctionalExchange value);
}