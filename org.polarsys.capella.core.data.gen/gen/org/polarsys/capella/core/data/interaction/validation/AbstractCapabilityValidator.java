/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.interaction.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacommon.State;

import org.polarsys.capella.core.data.capellacore.Constraint;

import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalChain;

import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityExtend;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityExtensionPoint;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityGeneralization;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityInclude;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityRealization;
import org.polarsys.capella.core.data.interaction.AbstractFunctionAbstractCapabilityInvolvement;
import org.polarsys.capella.core.data.interaction.FunctionalChainAbstractCapabilityInvolvement;
import org.polarsys.capella.core.data.interaction.Scenario;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.interaction.AbstractCapability}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractCapabilityValidator {
	boolean validate();

	boolean validatePreCondition(Constraint value);
	boolean validatePostCondition(Constraint value);
	boolean validateOwnedScenarios(EList<Scenario> value);
	boolean validateIncomingCapabilityAllocation(EList<AbstractCapabilityRealization> value);
	boolean validateOutgoingCapabilityAllocation(EList<AbstractCapabilityRealization> value);
	boolean validateExtends(EList<AbstractCapabilityExtend> value);
	boolean validateExtending(EList<AbstractCapabilityExtend> value);
	boolean validateAbstractCapabilityExtensionPoints(EList<AbstractCapabilityExtensionPoint> value);
	boolean validateSuperGeneralizations(EList<AbstractCapabilityGeneralization> value);
	boolean validateSubGeneralizations(EList<AbstractCapabilityGeneralization> value);
	boolean validateIncludes(EList<AbstractCapabilityInclude> value);
	boolean validateIncluding(EList<AbstractCapabilityInclude> value);
	boolean validateSuper(EList<AbstractCapability> value);
	boolean validateSub(EList<AbstractCapability> value);
	boolean validateIncludedAbstractCapabilities(EList<AbstractCapability> value);
	boolean validateIncludingAbstractCapabilities(EList<AbstractCapability> value);
	boolean validateExtendedAbstractCapabilities(EList<AbstractCapability> value);
	boolean validateExtendingAbstractCapabilities(EList<AbstractCapability> value);
	boolean validateOwnedFunctionalChainAbstractCapabilityInvolvements(EList<FunctionalChainAbstractCapabilityInvolvement> value);
	boolean validateOwnedAbstractFunctionAbstractCapabilityInvolvements(EList<AbstractFunctionAbstractCapabilityInvolvement> value);
	boolean validateAvailableInStates(EList<State> value);
	boolean validateOwnedAbstractCapabilityRealizations(EList<AbstractCapabilityRealization> value);
	boolean validateInvolvedAbstractFunctions(EList<AbstractFunction> value);
	boolean validateInvolvedFunctionalChains(EList<FunctionalChain> value);
}
