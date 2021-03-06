/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.la.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.la.LogicalArchitecture;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.la.LogicalArchitecturePkg}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LogicalArchitecturePkgValidator {
	boolean validate();

	boolean validateOwnedLogicalArchitectures(EList<LogicalArchitecture> value);
}
