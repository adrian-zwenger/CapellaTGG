/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.information.communication.validation;

import org.polarsys.capella.core.data.information.ExchangeItem;

import org.polarsys.capella.core.data.information.communication.CommunicationLinkKind;
import org.polarsys.capella.core.data.information.communication.CommunicationLinkProtocol;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.information.communication.CommunicationLink}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CommunicationLinkValidator {
	boolean validate();

	boolean validateKind(CommunicationLinkKind value);
	boolean validateProtocol(CommunicationLinkProtocol value);
	boolean validateExchangeItem(ExchangeItem value);
}
