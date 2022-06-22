/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.capellacommon.validation;

import org.polarsys.capella.core.data.capellacommon.TimeEventKind;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.capellacommon.TimeEvent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TimeEventValidator {
	boolean validate();

	boolean validateKind(TimeEventKind value);
}
