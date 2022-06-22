/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.capellacommon.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacommon.Pseudostate;
import org.polarsys.capella.core.data.capellacommon.Region;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.capellacommon.StateMachine}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StateMachineValidator {
	boolean validate();

	boolean validateOwnedRegions(EList<Region> value);
	boolean validateOwnedConnectionPoints(EList<Pseudostate> value);
}