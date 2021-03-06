/**
 *
 * $Id$
 */
package modellingcore.validation;

import modellingcore.AbstractParameterSet;
import modellingcore.ParameterEffectKind;
import modellingcore.RateKind;
import modellingcore.ValueSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link modellingcore.AbstractParameter}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractParameterValidator {
	boolean validate();

	boolean validateIsException(boolean value);
	boolean validateIsStream(boolean value);
	boolean validateIsOptional(boolean value);
	boolean validateKindOfRate(RateKind value);
	boolean validateEffect(ParameterEffectKind value);
	boolean validateRate(ValueSpecification value);
	boolean validateProbability(ValueSpecification value);
	boolean validateParameterSet(EList<AbstractParameterSet> value);
}
