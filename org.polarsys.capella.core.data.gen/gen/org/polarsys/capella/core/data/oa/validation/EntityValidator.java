/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.oa.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.ctx.SystemComponent;

import org.polarsys.capella.core.data.oa.CommunicationMean;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.core.data.oa.Location;
import org.polarsys.capella.core.data.oa.OperationalActivity;
import org.polarsys.capella.core.data.oa.OperationalCapability;
import org.polarsys.capella.core.data.oa.OrganisationalUnitComposition;
import org.polarsys.capella.core.data.oa.Role;
import org.polarsys.capella.core.data.oa.RoleAllocation;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.oa.Entity}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EntityValidator {
	boolean validate();

	boolean validateRoleAllocations(EList<RoleAllocation> value);
	boolean validateOrganisationalUnitMemberships(EList<OrganisationalUnitComposition> value);
	boolean validateActualLocation(Location value);
	boolean validateSubEntities(EList<Entity> value);
	boolean validateOwnedEntities(EList<Entity> value);
	boolean validateOwnedCommunicationMeans(EList<CommunicationMean> value);
	boolean validateOwnedRoleAllocations(EList<RoleAllocation> value);
	boolean validateAllocatedOperationalActivities(EList<OperationalActivity> value);
	boolean validateAllocatedRoles(EList<Role> value);
	boolean validateInvolvingOperationalCapabilities(EList<OperationalCapability> value);
	boolean validateRealizingSystemComponents(EList<SystemComponent> value);
}
