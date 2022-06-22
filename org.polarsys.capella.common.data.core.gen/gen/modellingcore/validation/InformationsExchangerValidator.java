/**
 *
 * $Id$
 */
package modellingcore.validation;

import modellingcore.AbstractInformationFlow;

import modellingcore.InformationsExchanger;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link modellingcore.InformationsExchanger}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InformationsExchangerValidator {
	boolean validate();

	boolean validateIncomingInformationFlows(EList<AbstractInformationFlow> value);
	boolean validateOutgoingInformationFlows(EList<AbstractInformationFlow> value);
	boolean validateInformationFlows(EList<AbstractInformationFlow> value);

	boolean validateTEST(EList<InformationsExchanger> value);

	boolean validateTEST(InformationsExchanger value);
}