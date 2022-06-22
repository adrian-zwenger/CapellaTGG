/**
 *
 * $Id$
 */
package org.polarsys.capella.common.data.activity.validation;

import modellingcore.AbstractType;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.common.data.activity.ActivityPartition;

/**
 * A sample validator interface for {@link org.polarsys.capella.common.data.activity.ActivityPartition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ActivityPartitionValidator {
	boolean validate();

	boolean validateIsDimension(boolean value);
	boolean validateIsExternal(boolean value);
	boolean validateRepresentedElement(AbstractType value);
	boolean validateSuperPartition(ActivityPartition value);
	boolean validateSubPartitions(EList<ActivityPartition> value);
}
