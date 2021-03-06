/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.information.validation;

import org.polarsys.capella.core.data.information.Port;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.information.PortAllocation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PortAllocationValidator {
	boolean validate();

	boolean validateAllocatedPort(Port value);
	boolean validateAllocatingPort(Port value);
}
