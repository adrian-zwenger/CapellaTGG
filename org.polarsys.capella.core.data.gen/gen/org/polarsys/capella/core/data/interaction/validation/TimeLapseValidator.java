/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.interaction.validation;

import org.polarsys.capella.core.data.interaction.InteractionFragment;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.interaction.TimeLapse}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TimeLapseValidator {
	boolean validate();

	boolean validateStart(InteractionFragment value);
	boolean validateFinish(InteractionFragment value);
}
