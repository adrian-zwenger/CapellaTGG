/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.information.datatype.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.information.datatype.DataType;

import org.polarsys.capella.core.data.information.datavalue.AbstractEnumerationValue;
import org.polarsys.capella.core.data.information.datavalue.EnumerationLiteral;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.information.datatype.Enumeration}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EnumerationValidator {
	boolean validate();

	boolean validateOwnedLiterals(EList<EnumerationLiteral> value);
	boolean validateOwnedDefaultValue(AbstractEnumerationValue value);
	boolean validateOwnedNullValue(AbstractEnumerationValue value);
	boolean validateOwnedMinValue(AbstractEnumerationValue value);
	boolean validateOwnedMaxValue(AbstractEnumerationValue value);
	boolean validateDomainType(DataType value);
}