/**
 *
 * $Id$
 */
package org.polarsys.capella.common.data.activity.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.common.data.activity.ActivityEdge;
import org.polarsys.capella.common.data.activity.ActivityGroup;
import org.polarsys.capella.common.data.activity.ActivityNode;

/**
 * A sample validator interface for {@link org.polarsys.capella.common.data.activity.ActivityGroup}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ActivityGroupValidator {
	boolean validate();

	boolean validateSuperGroup(ActivityGroup value);
	boolean validateSubGroups(EList<ActivityGroup> value);
	boolean validateOwnedNodes(EList<ActivityNode> value);
	boolean validateOwnedEdges(EList<ActivityEdge> value);
}