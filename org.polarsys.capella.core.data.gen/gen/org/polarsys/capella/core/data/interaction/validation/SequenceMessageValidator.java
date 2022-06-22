/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.interaction.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.Constraint;

import org.polarsys.capella.core.data.cs.Part;

import org.polarsys.capella.core.data.fa.AbstractFunction;

import org.polarsys.capella.core.data.information.AbstractEventOperation;
import org.polarsys.capella.core.data.information.ExchangeItem;

import org.polarsys.capella.core.data.interaction.MessageEnd;
import org.polarsys.capella.core.data.interaction.MessageKind;
import org.polarsys.capella.core.data.interaction.SequenceMessageValuation;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.interaction.SequenceMessage}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SequenceMessageValidator {
	boolean validate();

	boolean validateKind(MessageKind value);
	boolean validateExchangeContext(Constraint value);
	boolean validateSendingEnd(MessageEnd value);
	boolean validateReceivingEnd(MessageEnd value);
	boolean validateInvokedOperation(AbstractEventOperation value);
	boolean validateExchangedItems(EList<ExchangeItem> value);
	boolean validateSendingPart(Part value);
	boolean validateReceivingPart(Part value);
	boolean validateSendingFunction(AbstractFunction value);
	boolean validateReceivingFunction(AbstractFunction value);
	boolean validateOwnedSequenceMessageValuations(EList<SequenceMessageValuation> value);
}