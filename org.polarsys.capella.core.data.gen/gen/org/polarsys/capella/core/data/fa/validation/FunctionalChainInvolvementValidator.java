/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.fa.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.InvolvedElement;

import org.polarsys.capella.core.data.fa.FunctionalChainInvolvement;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.fa.FunctionalChainInvolvement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FunctionalChainInvolvementValidator {
	boolean validate();

	boolean validateNextFunctionalChainInvolvements(EList<FunctionalChainInvolvement> value);
	boolean validatePreviousFunctionalChainInvolvements(EList<FunctionalChainInvolvement> value);
	boolean validateInvolvedElement(InvolvedElement value);
}
