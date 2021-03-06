/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.cs.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.cs.AbstractPhysicalLinkEnd;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.cs.PhysicalLinkCategory;
import org.polarsys.capella.core.data.cs.PhysicalLinkEnd;
import org.polarsys.capella.core.data.cs.PhysicalLinkRealization;
import org.polarsys.capella.core.data.cs.PhysicalPort;

import org.polarsys.capella.core.data.fa.ComponentExchangeFunctionalExchangeAllocation;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.cs.PhysicalLink}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PhysicalLinkValidator {
	boolean validate();

	boolean validateLinkEnds(EList<AbstractPhysicalLinkEnd> value);
	boolean validateOwnedComponentExchangeFunctionalExchangeAllocations(EList<ComponentExchangeFunctionalExchangeAllocation> value);
	boolean validateOwnedPhysicalLinkEnds(EList<PhysicalLinkEnd> value);
	boolean validateOwnedPhysicalLinkRealizations(EList<PhysicalLinkRealization> value);
	boolean validateCategories(EList<PhysicalLinkCategory> value);
	boolean validateSourcePhysicalPort(PhysicalPort value);
	boolean validateTargetPhysicalPort(PhysicalPort value);
	boolean validateRealizedPhysicalLinks(EList<PhysicalLink> value);
	boolean validateRealizingPhysicalLinks(EList<PhysicalLink> value);
}
