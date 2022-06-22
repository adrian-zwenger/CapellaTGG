/**
 *
 * $Id$
 */
package modellingcore.validation;

import modellingcore.AbstractConstraint;
import modellingcore.AbstractParameter;
import modellingcore.ValueSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link modellingcore.AbstractParameterSet}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractParameterSetValidator {
	boolean validate();

	boolean validateOwnedConditions(EList<AbstractConstraint> value);
	boolean validateProbability(ValueSpecification value);
	boolean validateParameters(EList<AbstractParameter> value);
}