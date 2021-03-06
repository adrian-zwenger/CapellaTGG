/**
 *
 * $Id$
 */
package org.polarsys.capella.common.data.activity.validation;

import org.polarsys.capella.common.data.activity.AbstractAction;

/**
 * A sample validator interface for {@link org.polarsys.capella.common.data.activity.InputPin}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InputPinValidator {
	boolean validate();

	boolean validateInputEvaluationAction(AbstractAction value);
}
