/**
 *  Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *  Contributors:
 *     Thales - initial API and implementation
 */
package org.polarsys.capella.core.data.information.datavalue.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.data.information.datavalue.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatavalueFactoryImpl extends EFactoryImpl implements DatavalueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatavalueFactory init() {
		try {
			DatavalueFactory theDatavalueFactory = (DatavalueFactory)EPackage.Registry.INSTANCE.getEFactory(DatavaluePackage.eNS_URI);
			if (theDatavalueFactory != null) {
				return theDatavalueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatavalueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatavalueFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatavaluePackage.LITERAL_BOOLEAN_VALUE: return createLiteralBooleanValue();
			case DatavaluePackage.BOOLEAN_REFERENCE: return createBooleanReference();
			case DatavaluePackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case DatavaluePackage.ENUMERATION_REFERENCE: return createEnumerationReference();
			case DatavaluePackage.LITERAL_STRING_VALUE: return createLiteralStringValue();
			case DatavaluePackage.STRING_REFERENCE: return createStringReference();
			case DatavaluePackage.LITERAL_NUMERIC_VALUE: return createLiteralNumericValue();
			case DatavaluePackage.NUMERIC_REFERENCE: return createNumericReference();
			case DatavaluePackage.COMPLEX_VALUE: return createComplexValue();
			case DatavaluePackage.COMPLEX_VALUE_REFERENCE: return createComplexValueReference();
			case DatavaluePackage.VALUE_PART: return createValuePart();
			case DatavaluePackage.BINARY_EXPRESSION: return createBinaryExpression();
			case DatavaluePackage.UNARY_EXPRESSION: return createUnaryExpression();
			case DatavaluePackage.OPAQUE_EXPRESSION: return createOpaqueExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DatavaluePackage.BINARY_OPERATOR:
				return createBinaryOperatorFromString(eDataType, initialValue);
			case DatavaluePackage.UNARY_OPERATOR:
				return createUnaryOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DatavaluePackage.BINARY_OPERATOR:
				return convertBinaryOperatorToString(eDataType, instanceValue);
			case DatavaluePackage.UNARY_OPERATOR:
				return convertUnaryOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralBooleanValue createLiteralBooleanValue() {
		LiteralBooleanValueImpl literalBooleanValue = new LiteralBooleanValueImpl();
		return literalBooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanReference createBooleanReference() {
		BooleanReferenceImpl booleanReference = new BooleanReferenceImpl();
		return booleanReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationReference createEnumerationReference() {
		EnumerationReferenceImpl enumerationReference = new EnumerationReferenceImpl();
		return enumerationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralStringValue createLiteralStringValue() {
		LiteralStringValueImpl literalStringValue = new LiteralStringValueImpl();
		return literalStringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringReference createStringReference() {
		StringReferenceImpl stringReference = new StringReferenceImpl();
		return stringReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralNumericValue createLiteralNumericValue() {
		LiteralNumericValueImpl literalNumericValue = new LiteralNumericValueImpl();
		return literalNumericValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericReference createNumericReference() {
		NumericReferenceImpl numericReference = new NumericReferenceImpl();
		return numericReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexValue createComplexValue() {
		ComplexValueImpl complexValue = new ComplexValueImpl();
		return complexValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexValueReference createComplexValueReference() {
		ComplexValueReferenceImpl complexValueReference = new ComplexValueReferenceImpl();
		return complexValueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValuePart createValuePart() {
		ValuePartImpl valuePart = new ValuePartImpl();
		return valuePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpaqueExpression createOpaqueExpression() {
		OpaqueExpressionImpl opaqueExpression = new OpaqueExpressionImpl();
		return opaqueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		BinaryOperator result = BinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator createUnaryOperatorFromString(EDataType eDataType, String initialValue) {
		UnaryOperator result = UnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatavaluePackage getDatavaluePackage() {
		return (DatavaluePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatavaluePackage getPackage() {
		return DatavaluePackage.eINSTANCE;
	}

} //DatavalueFactoryImpl
