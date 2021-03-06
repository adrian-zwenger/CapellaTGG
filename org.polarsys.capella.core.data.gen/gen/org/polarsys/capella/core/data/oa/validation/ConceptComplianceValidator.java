/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.oa.validation;

import org.polarsys.capella.core.data.oa.Concept;
import org.polarsys.capella.core.data.oa.OperationalCapability;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.oa.ConceptCompliance}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConceptComplianceValidator {
	boolean validate();

	boolean validateComplyWithConcept(Concept value);
	boolean validateCompliantCapability(OperationalCapability value);
}
