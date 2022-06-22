/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.cs.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.cs.PhysicalPort;
import org.polarsys.capella.core.data.cs.PhysicalPortRealization;

import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.ComponentPortAllocation;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.cs.PhysicalPort}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PhysicalPortValidator {
	boolean validate();

	boolean validateOwnedComponentPortAllocations(EList<ComponentPortAllocation> value);
	boolean validateOwnedPhysicalPortRealizations(EList<PhysicalPortRealization> value);
	boolean validateAllocatedComponentPorts(EList<ComponentPort> value);
	boolean validateRealizedPhysicalPorts(EList<PhysicalPort> value);
	boolean validateRealizingPhysicalPorts(EList<PhysicalPort> value);
}