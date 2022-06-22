/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.la.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.ctx.SystemComponent;

import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.la.LogicalComponentPkg;
import org.polarsys.capella.core.data.la.LogicalFunction;

import org.polarsys.capella.core.data.pa.PhysicalComponent;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.la.LogicalComponent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LogicalComponentValidator {
	boolean validate();

	boolean validateOwnedLogicalComponents(EList<LogicalComponent> value);
	boolean validateOwnedLogicalArchitectures(EList<LogicalArchitecture> value);
	boolean validateOwnedLogicalComponentPkgs(EList<LogicalComponentPkg> value);
	boolean validateSubLogicalComponents(EList<LogicalComponent> value);
	boolean validateAllocatedLogicalFunctions(EList<LogicalFunction> value);
	boolean validateRealizedSystemComponents(EList<SystemComponent> value);
	boolean validateRealizingPhysicalComponents(EList<PhysicalComponent> value);
}
