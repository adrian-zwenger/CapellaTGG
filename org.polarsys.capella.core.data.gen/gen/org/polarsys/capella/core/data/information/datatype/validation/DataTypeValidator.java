/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.information.datatype.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.VisibilityKind;

import org.polarsys.capella.core.data.information.InformationRealization;

import org.polarsys.capella.core.data.information.datatype.DataType;

import org.polarsys.capella.core.data.information.datavalue.DataValue;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.information.datatype.DataType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DataTypeValidator {
	boolean validate();

	boolean validateDiscrete(boolean value);
	boolean validateMinInclusive(boolean value);
	boolean validateMaxInclusive(boolean value);
	boolean validatePattern(String value);
	boolean validateVisibility(VisibilityKind value);
	boolean validateDefaultValue(DataValue value);
	boolean validateNullValue(DataValue value);
	boolean validateOwnedInformationRealizations(EList<InformationRealization> value);
	boolean validateRealizedDataTypes(EList<DataType> value);
	boolean validateRealizingDataTypes(EList<DataType> value);
}