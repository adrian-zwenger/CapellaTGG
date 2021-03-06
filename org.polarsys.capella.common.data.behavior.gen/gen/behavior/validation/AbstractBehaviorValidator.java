/**
 *
 * $Id$
 */
package behavior.validation;

import modellingcore.AbstractParameter;
import modellingcore.AbstractParameterSet;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link behavior.AbstractBehavior}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractBehaviorValidator {
	boolean validate();

	boolean validateIsControlOperator(boolean value);
	boolean validateOwnedParameterSet(EList<AbstractParameterSet> value);
	boolean validateOwnedParameter(EList<AbstractParameter> value);
}
