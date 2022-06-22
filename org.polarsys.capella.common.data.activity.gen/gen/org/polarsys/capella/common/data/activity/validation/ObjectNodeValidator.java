/**
 *
 * $Id$
 */
package org.polarsys.capella.common.data.activity.validation;

import behavior.AbstractBehavior;

import modellingcore.IState;
import modellingcore.ValueSpecification;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.common.data.activity.ObjectNodeKind;
import org.polarsys.capella.common.data.activity.ObjectNodeOrderingKind;

/**
 * A sample validator interface for {@link org.polarsys.capella.common.data.activity.ObjectNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ObjectNodeValidator {
	boolean validate();

	boolean validateIsControlType(boolean value);
	boolean validateKindOfNode(ObjectNodeKind value);
	boolean validateOrdering(ObjectNodeOrderingKind value);
	boolean validateUpperBound(ValueSpecification value);
	boolean validateInState(EList<IState> value);
	boolean validateSelection(AbstractBehavior value);
}