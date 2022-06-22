/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.requirement.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.requirement.Requirement;
import org.polarsys.capella.core.data.requirement.RequirementsPkg;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.requirement.RequirementsPkg}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RequirementsPkgValidator {
	boolean validate();

	boolean validateAdditionalInformation(String value);
	boolean validateLevel(String value);
	boolean validateOwnedRequirements(EList<Requirement> value);
	boolean validateOwnedRequirementPkgs(EList<RequirementsPkg> value);
}