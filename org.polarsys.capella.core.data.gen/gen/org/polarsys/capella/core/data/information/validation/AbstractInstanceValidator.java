/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.information.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.interaction.InstanceRole;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.information.AbstractInstance}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractInstanceValidator {
	boolean validate();

	boolean validateRepresentingInstanceRoles(EList<InstanceRole> value);
}
