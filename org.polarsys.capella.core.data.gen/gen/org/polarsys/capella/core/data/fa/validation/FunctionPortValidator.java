/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.fa.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.FunctionPort;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.fa.FunctionPort}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FunctionPortValidator {
	boolean validate();

	boolean validateRepresentedComponentPort(ComponentPort value);
	boolean validateAllocatorComponentPorts(EList<ComponentPort> value);
	boolean validateRealizedFunctionPorts(EList<FunctionPort> value);
	boolean validateRealizingFunctionPorts(EList<FunctionPort> value);
}
