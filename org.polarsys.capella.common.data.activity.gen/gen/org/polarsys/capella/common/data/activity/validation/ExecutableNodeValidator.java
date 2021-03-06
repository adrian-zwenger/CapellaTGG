/**
 *
 * $Id$
 */
package org.polarsys.capella.common.data.activity.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.common.data.activity.ExceptionHandler;

/**
 * A sample validator interface for {@link org.polarsys.capella.common.data.activity.ExecutableNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExecutableNodeValidator {
	boolean validate();

	boolean validateOwnedHandlers(EList<ExceptionHandler> value);
}
