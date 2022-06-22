/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.pa.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.cs.AbstractDeploymentLink;

import org.polarsys.capella.core.data.la.LogicalComponent;

import org.polarsys.capella.core.data.pa.LogicalInterfaceRealization;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponentKind;
import org.polarsys.capella.core.data.pa.PhysicalComponentNature;
import org.polarsys.capella.core.data.pa.PhysicalComponentPkg;
import org.polarsys.capella.core.data.pa.PhysicalFunction;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.pa.PhysicalComponent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PhysicalComponentValidator {
	boolean validate();

	boolean validateKind(PhysicalComponentKind value);
	boolean validateNature(PhysicalComponentNature value);
	boolean validateOwnedDeploymentLinks(EList<AbstractDeploymentLink> value);
	boolean validateOwnedPhysicalComponents(EList<PhysicalComponent> value);
	boolean validateOwnedPhysicalComponentPkgs(EList<PhysicalComponentPkg> value);
	boolean validateLogicalInterfaceRealizations(EList<LogicalInterfaceRealization> value);
	boolean validateSubPhysicalComponents(EList<PhysicalComponent> value);
	boolean validateRealizedLogicalComponents(EList<LogicalComponent> value);
	boolean validateAllocatedPhysicalFunctions(EList<PhysicalFunction> value);
	boolean validateDeployedPhysicalComponents(EList<PhysicalComponent> value);
	boolean validateDeployingPhysicalComponents(EList<PhysicalComponent> value);
}
