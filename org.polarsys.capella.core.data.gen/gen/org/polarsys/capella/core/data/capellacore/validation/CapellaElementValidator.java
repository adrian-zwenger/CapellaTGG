/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.capellacore.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyType;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;

import org.polarsys.capella.core.data.requirement.Requirement;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.capellacore.CapellaElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CapellaElementValidator {
	boolean validate();

	boolean validateSummary(String value);
	boolean validateDescription(String value);
	boolean validateReview(String value);
	boolean validateOwnedPropertyValues(EList<AbstractPropertyValue> value);
	boolean validateOwnedEnumerationPropertyTypes(EList<EnumerationPropertyType> value);
	boolean validateAppliedPropertyValues(EList<AbstractPropertyValue> value);
	boolean validateOwnedPropertyValueGroups(EList<PropertyValueGroup> value);
	boolean validateAppliedPropertyValueGroups(EList<PropertyValueGroup> value);
	boolean validateStatus(EnumerationPropertyLiteral value);
	boolean validateFeatures(EList<EnumerationPropertyLiteral> value);
	boolean validateAppliedRequirements(EList<Requirement> value);
}