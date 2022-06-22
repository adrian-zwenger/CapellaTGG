/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.oa.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.oa.CommunicationMean;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.core.data.oa.EntityPkg;
import org.polarsys.capella.core.data.oa.Location;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.oa.EntityPkg}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EntityPkgValidator {
	boolean validate();

	boolean validateOwnedEntities(EList<Entity> value);
	boolean validateOwnedEntityPkgs(EList<EntityPkg> value);
	boolean validateOwnedLocations(EList<Location> value);
	boolean validateOwnedCommunicationMeans(EList<CommunicationMean> value);
}