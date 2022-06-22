/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.information.communication.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.information.communication.CommunicationLink;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.information.communication.CommunicationLinkExchanger}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CommunicationLinkExchangerValidator {
	boolean validate();

	boolean validateOwnedCommunicationLinks(EList<CommunicationLink> value);
	boolean validateProduce(EList<CommunicationLink> value);
	boolean validateConsume(EList<CommunicationLink> value);
	boolean validateSend(EList<CommunicationLink> value);
	boolean validateReceive(EList<CommunicationLink> value);
	boolean validateCall(EList<CommunicationLink> value);
	boolean validateExecute(EList<CommunicationLink> value);
	boolean validateWrite(EList<CommunicationLink> value);
	boolean validateAccess(EList<CommunicationLink> value);
	boolean validateAcquire(EList<CommunicationLink> value);
	boolean validateTransmit(EList<CommunicationLink> value);
}