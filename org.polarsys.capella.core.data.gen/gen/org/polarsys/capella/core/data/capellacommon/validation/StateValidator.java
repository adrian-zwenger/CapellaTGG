/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.capellacommon.validation;

import behavior.AbstractEvent;

import modellingcore.AbstractConstraint;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacommon.Pseudostate;
import org.polarsys.capella.core.data.capellacommon.Region;

import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalChain;

import org.polarsys.capella.core.data.interaction.AbstractCapability;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.capellacommon.State}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StateValidator {
	boolean validate();

	boolean validateOwnedRegions(EList<Region> value);
	boolean validateOwnedConnectionPoints(EList<Pseudostate> value);
	boolean validateAvailableAbstractFunctions(EList<AbstractFunction> value);
	boolean validateAvailableFunctionalChains(EList<FunctionalChain> value);
	boolean validateAvailableAbstractCapabilities(EList<AbstractCapability> value);
	boolean validateEntry(EList<AbstractEvent> value);
	boolean validateDoActivity(EList<AbstractEvent> value);
	boolean validateExit(EList<AbstractEvent> value);
	boolean validateStateInvariant(AbstractConstraint value);
}