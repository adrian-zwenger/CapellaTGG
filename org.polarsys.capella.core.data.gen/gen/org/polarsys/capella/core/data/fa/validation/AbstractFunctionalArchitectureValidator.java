/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.fa.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeCategory;
import org.polarsys.capella.core.data.fa.ComponentExchangeRealization;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.fa.ExchangeLink;
import org.polarsys.capella.core.data.fa.FunctionPkg;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.fa.AbstractFunctionalArchitecture}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractFunctionalArchitectureValidator {
	boolean validate();

	boolean validateOwnedFunctionPkg(FunctionPkg value);
	boolean validateOwnedComponentExchanges(EList<ComponentExchange> value);
	boolean validateOwnedComponentExchangeCategories(EList<ComponentExchangeCategory> value);
	boolean validateOwnedFunctionalLinks(EList<ExchangeLink> value);
	boolean validateOwnedFunctionalAllocations(EList<ComponentFunctionalAllocation> value);
	boolean validateOwnedComponentExchangeRealizations(EList<ComponentExchangeRealization> value);
}