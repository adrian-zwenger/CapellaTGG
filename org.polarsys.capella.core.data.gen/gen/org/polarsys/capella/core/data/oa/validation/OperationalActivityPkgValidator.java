/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.oa.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.oa.OperationalActivity;
import org.polarsys.capella.core.data.oa.OperationalActivityPkg;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.oa.OperationalActivityPkg}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OperationalActivityPkgValidator {
	boolean validate();

	boolean validateOwnedOperationalActivities(EList<OperationalActivity> value);
	boolean validateOwnedOperationalActivityPkgs(EList<OperationalActivityPkg> value);
}
