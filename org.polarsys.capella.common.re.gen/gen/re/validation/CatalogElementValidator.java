/**
 *
 * $Id$
 */
package re.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import re.CatalogElement;
import re.CatalogElementKind;
import re.CatalogElementLink;
import re.CompliancyDefinition;

/**
 * A sample validator interface for {@link re.CatalogElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CatalogElementValidator {
	boolean validate();

	boolean validateKind(CatalogElementKind value);
	boolean validateAuthor(String value);
	boolean validateEnvironment(String value);
	boolean validateSuffix(String value);
	boolean validatePurpose(String value);
	boolean validateReadOnly(boolean value);
	boolean validateVersion(String value);
	boolean validateTags(EList<String> value);
	boolean validateOrigin(CatalogElement value);
	boolean validateCurrentCompliancy(CompliancyDefinition value);
	boolean validateDefaultReplicaCompliancy(CompliancyDefinition value);
	boolean validateOwnedLinks(EList<CatalogElementLink> value);
	boolean validateReferencedElements(EList<EObject> value);
	boolean validateReplicatedElements(EList<CatalogElement> value);
}
