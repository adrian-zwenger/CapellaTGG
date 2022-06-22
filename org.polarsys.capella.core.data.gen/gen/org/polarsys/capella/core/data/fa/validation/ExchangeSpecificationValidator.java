/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.fa.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.fa.ExchangeContainment;
import org.polarsys.capella.core.data.fa.ExchangeLink;
import org.polarsys.capella.core.data.fa.ExchangeSpecificationRealization;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.fa.ExchangeSpecification}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExchangeSpecificationValidator {
	boolean validate();

	boolean validateContainingLink(ExchangeLink value);
	boolean validateLink(ExchangeContainment value);
	boolean validateOutgoingExchangeSpecificationRealizations(EList<ExchangeSpecificationRealization> value);
	boolean validateIncomingExchangeSpecificationRealizations(EList<ExchangeSpecificationRealization> value);
}