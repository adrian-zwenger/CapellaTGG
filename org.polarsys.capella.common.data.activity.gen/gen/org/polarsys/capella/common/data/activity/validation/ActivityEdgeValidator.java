/**
 *
 * $Id$
 */
package org.polarsys.capella.common.data.activity.validation;

import modellingcore.RateKind;
import modellingcore.ValueSpecification;

import org.polarsys.capella.common.data.activity.ActivityNode;
import org.polarsys.capella.common.data.activity.ActivityPartition;
import org.polarsys.capella.common.data.activity.InterruptibleActivityRegion;
import org.polarsys.capella.common.data.activity.StructuredActivityNode;

/**
 * A sample validator interface for {@link org.polarsys.capella.common.data.activity.ActivityEdge}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ActivityEdgeValidator {
	boolean validate();

	boolean validateKindOfRate(RateKind value);
	boolean validateInActivityPartition(ActivityPartition value);
	boolean validateInInterruptibleRegion(InterruptibleActivityRegion value);
	boolean validateInStructuredNode(StructuredActivityNode value);
	boolean validateRate(ValueSpecification value);
	boolean validateProbability(ValueSpecification value);
	boolean validateTarget(ActivityNode value);
	boolean validateSource(ActivityNode value);
	boolean validateGuard(ValueSpecification value);
	boolean validateWeight(ValueSpecification value);
	boolean validateInterrupts(InterruptibleActivityRegion value);
}
