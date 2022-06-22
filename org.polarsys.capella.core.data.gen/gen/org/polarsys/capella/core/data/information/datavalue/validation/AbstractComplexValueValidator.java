/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.information.datavalue.validation;

import org.polarsys.capella.core.data.capellacore.Classifier;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.information.datavalue.AbstractComplexValue}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractComplexValueValidator {
	boolean validate();

	boolean validateComplexType(Classifier value);
}
