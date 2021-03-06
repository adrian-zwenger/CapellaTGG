/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.cs.validation;

import org.polarsys.capella.core.data.cs.Interface;

import org.polarsys.capella.core.data.information.ExchangeItem;

import org.polarsys.capella.core.data.information.communication.CommunicationLinkProtocol;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.cs.ExchangeItemAllocation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExchangeItemAllocationValidator {
	boolean validate();

	boolean validateSendProtocol(CommunicationLinkProtocol value);
	boolean validateReceiveProtocol(CommunicationLinkProtocol value);
	boolean validateAllocatedItem(ExchangeItem value);
	boolean validateAllocatingInterface(Interface value);
}
