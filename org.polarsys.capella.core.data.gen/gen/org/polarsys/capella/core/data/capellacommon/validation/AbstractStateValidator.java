/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.capellacommon.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacommon.AbstractState;
import org.polarsys.capella.core.data.capellacommon.AbstractStateRealization;
import org.polarsys.capella.core.data.capellacommon.Region;
import org.polarsys.capella.core.data.capellacommon.StateTransition;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.capellacommon.AbstractState}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractStateValidator {
	boolean validate();

	boolean validateOwnedAbstractStateRealizations(EList<AbstractStateRealization> value);
	boolean validateRealizedAbstractStates(EList<AbstractState> value);
	boolean validateRealizingAbstractStates(EList<AbstractState> value);
	boolean validateOutgoing(EList<StateTransition> value);
	boolean validateIncoming(EList<StateTransition> value);
	boolean validateInvolverRegions(EList<Region> value);
}
