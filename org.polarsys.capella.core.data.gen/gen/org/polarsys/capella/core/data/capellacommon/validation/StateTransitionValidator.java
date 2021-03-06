/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.capellacommon.validation;

import behavior.AbstractEvent;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacommon.AbstractState;
import org.polarsys.capella.core.data.capellacommon.StateTransition;
import org.polarsys.capella.core.data.capellacommon.StateTransitionRealization;
import org.polarsys.capella.core.data.capellacommon.TransitionKind;

import org.polarsys.capella.core.data.capellacore.Constraint;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.capellacommon.StateTransition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StateTransitionValidator {
	boolean validate();

	boolean validateKind(TransitionKind value);
	boolean validateTriggerDescription(String value);
	boolean validateGuard(Constraint value);
	boolean validateSource(AbstractState value);
	boolean validateTarget(AbstractState value);
	boolean validateEffect(EList<AbstractEvent> value);
	boolean validateTriggers(EList<AbstractEvent> value);
	boolean validateOwnedStateTransitionRealizations(EList<StateTransitionRealization> value);
	boolean validateRealizedStateTransitions(EList<StateTransition> value);
	boolean validateRealizingStateTransitions(EList<StateTransition> value);
}
