/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.fa.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeCategory;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.fa.ExchangeLink;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.fa.AbstractFunctionalBlock}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractFunctionalBlockValidator {
	boolean validate();

	boolean validateOwnedFunctionalAllocation(EList<ComponentFunctionalAllocation> value);
	boolean validateOwnedComponentExchanges(EList<ComponentExchange> value);
	boolean validateOwnedComponentExchangeCategories(EList<ComponentExchangeCategory> value);
	boolean validateFunctionalAllocations(EList<ComponentFunctionalAllocation> value);
	boolean validateAllocatedFunctions(EList<AbstractFunction> value);
	boolean validateInExchangeLinks(EList<ExchangeLink> value);
	boolean validateOutExchangeLinks(EList<ExchangeLink> value);
}
