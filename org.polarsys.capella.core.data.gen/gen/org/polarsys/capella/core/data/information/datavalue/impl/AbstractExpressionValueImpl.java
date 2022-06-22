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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.Classifier;

import org.polarsys.capella.core.data.information.Unit;

import org.polarsys.capella.core.data.information.datatype.DataType;
import org.polarsys.capella.core.data.information.datatype.Enumeration;
import org.polarsys.capella.core.data.information.datatype.NumericType;
import org.polarsys.capella.core.data.information.datatype.StringType;

import org.polarsys.capella.core.data.information.datavalue.AbstractComplexValue;
import org.polarsys.capella.core.data.information.datavalue.AbstractEnumerationValue;
import org.polarsys.capella.core.data.information.datavalue.AbstractExpressionValue;
import org.polarsys.capella.core.data.information.datavalue.AbstractStringValue;
import org.polarsys.capella.core.data.information.datavalue.DatavaluePackage;
import org.polarsys.capella.core.data.information.datavalue.NumericValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Expression Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.information.datavalue.impl.AbstractExpressionValueImpl#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.datavalue.impl.AbstractExpressionValueImpl#getEnumerationType <em>Enumeration Type</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.datavalue.impl.AbstractExpressionValueImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.datavalue.impl.AbstractExpressionValueImpl#getNumericType <em>Numeric Type</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.datavalue.impl.AbstractExpressionValueImpl#getStringType <em>String Type</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.datavalue.impl.AbstractExpressionValueImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.datavalue.impl.AbstractExpressionValueImpl#getUnparsedExpression <em>Unparsed Expression</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.datavalue.impl.AbstractExpressionValueImpl#getExpressionType <em>Expression Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractExpressionValueImpl extends AbstractBooleanValueImpl implements AbstractExpressionValue {
	/**
	 * The cached value of the '{@link #getComplexType() <em>Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexType()
	 * @generated
	 * @ordered
	 */
	protected Classifier complexType;

	/**
	 * The cached value of the '{@link #getEnumerationType() <em>Enumeration Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationType()
	 * @generated
	 * @ordered
	 */
	protected Enumeration enumerationType;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit unit;

	/**
	 * The cached value of the '{@link #getNumericType() <em>Numeric Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericType()
	 * @generated
	 * @ordered
	 */
	protected NumericType numericType;

	/**
	 * The cached value of the '{@link #getStringType() <em>String Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringType()
	 * @generated
	 * @ordered
	 */
	protected StringType stringType;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnparsedExpression() <em>Unparsed Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnparsedExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String UNPARSED_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnparsedExpression() <em>Unparsed Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnparsedExpression()
	 * @generated
	 * @ordered
	 */
	protected String unparsedExpression = UNPARSED_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpressionType() <em>Expression Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionType()
	 * @generated
	 * @ordered
	 */
	protected DataType expressionType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractExpressionValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatavaluePackage.Literals.ABSTRACT_EXPRESSION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier getComplexType() {
		if (complexType != null && complexType.eIsProxy()) {
			InternalEObject oldComplexType = (InternalEObject)complexType;
			complexType = (Classifier)eResolveProxy(oldComplexType);
			if (complexType != oldComplexType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__COMPLEX_TYPE, oldComplexType, complexType));
			}
		}
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetComplexType() {
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getEnumerationType() {
		if (enumerationType != null && enumerationType.eIsProxy()) {
			InternalEObject oldEnumerationType = (InternalEObject)enumerationType;
			enumerationType = (Enumeration)eResolveProxy(oldEnumerationType);
			if (enumerationType != oldEnumerationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__ENUMERATION_TYPE, oldEnumerationType, enumerationType));
			}
		}
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetEnumerationType() {
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unit getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (Unit)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(Unit newUnit) {
		Unit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericType getNumericType() {
		if (numericType != null && numericType.eIsProxy()) {
			InternalEObject oldNumericType = (InternalEObject)numericType;
			numericType = (NumericType)eResolveProxy(oldNumericType);
			if (numericType != oldNumericType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__NUMERIC_TYPE, oldNumericType, numericType));
			}
		}
		return numericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType basicGetNumericType() {
		return numericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringType getStringType() {
		if (stringType != null && stringType.eIsProxy()) {
			InternalEObject oldStringType = (InternalEObject)stringType;
			stringType = (StringType)eResolveProxy(oldStringType);
			if (stringType != oldStringType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__STRING_TYPE, oldStringType, stringType));
			}
		}
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType basicGetStringType() {
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnparsedExpression() {
		return unparsedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnparsedExpression(String newUnparsedExpression) {
		String oldUnparsedExpression = unparsedExpression;
		unparsedExpression = newUnparsedExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION, oldUnparsedExpression, unparsedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getExpressionType() {
		if (expressionType != null && expressionType.eIsProxy()) {
			InternalEObject oldExpressionType = (InternalEObject)expressionType;
			expressionType = (DataType)eResolveProxy(oldExpressionType);
			if (expressionType != oldExpressionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__EXPRESSION_TYPE, oldExpressionType, expressionType));
			}
		}
		return expressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetExpressionType() {
		return expressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__COMPLEX_TYPE:
				if (resolve) return getComplexType();
				return basicGetComplexType();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__ENUMERATION_TYPE:
				if (resolve) return getEnumerationType();
				return basicGetEnumerationType();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__NUMERIC_TYPE:
				if (resolve) return getNumericType();
				return basicGetNumericType();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__STRING_TYPE:
				if (resolve) return getStringType();
				return basicGetStringType();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__EXPRESSION:
				return getExpression();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION:
				return getUnparsedExpression();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__EXPRESSION_TYPE:
				if (resolve) return getExpressionType();
				return basicGetExpressionType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT:
				setUnit((Unit)newValue);
				return;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION:
				setUnparsedExpression((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT:
				setUnit((Unit)null);
				return;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION:
				setUnparsedExpression(UNPARSED_EXPRESSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__COMPLEX_TYPE:
				return complexType != null;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__ENUMERATION_TYPE:
				return enumerationType != null;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT:
				return unit != null;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__NUMERIC_TYPE:
				return numericType != null;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__STRING_TYPE:
				return stringType != null;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION:
				return UNPARSED_EXPRESSION_EDEFAULT == null ? unparsedExpression != null : !UNPARSED_EXPRESSION_EDEFAULT.equals(unparsedExpression);
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__EXPRESSION_TYPE:
				return expressionType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractComplexValue.class) {
			switch (derivedFeatureID) {
				case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__COMPLEX_TYPE: return DatavaluePackage.ABSTRACT_COMPLEX_VALUE__COMPLEX_TYPE;
				default: return -1;
			}
		}
		if (baseClass == AbstractEnumerationValue.class) {
			switch (derivedFeatureID) {
				case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__ENUMERATION_TYPE: return DatavaluePackage.ABSTRACT_ENUMERATION_VALUE__ENUMERATION_TYPE;
				default: return -1;
			}
		}
		if (baseClass == NumericValue.class) {
			switch (derivedFeatureID) {
				case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT: return DatavaluePackage.NUMERIC_VALUE__UNIT;
				case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__NUMERIC_TYPE: return DatavaluePackage.NUMERIC_VALUE__NUMERIC_TYPE;
				default: return -1;
			}
		}
		if (baseClass == AbstractStringValue.class) {
			switch (derivedFeatureID) {
				case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__STRING_TYPE: return DatavaluePackage.ABSTRACT_STRING_VALUE__STRING_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractComplexValue.class) {
			switch (baseFeatureID) {
				case DatavaluePackage.ABSTRACT_COMPLEX_VALUE__COMPLEX_TYPE: return DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__COMPLEX_TYPE;
				default: return -1;
			}
		}
		if (baseClass == AbstractEnumerationValue.class) {
			switch (baseFeatureID) {
				case DatavaluePackage.ABSTRACT_ENUMERATION_VALUE__ENUMERATION_TYPE: return DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__ENUMERATION_TYPE;
				default: return -1;
			}
		}
		if (baseClass == NumericValue.class) {
			switch (baseFeatureID) {
				case DatavaluePackage.NUMERIC_VALUE__UNIT: return DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT;
				case DatavaluePackage.NUMERIC_VALUE__NUMERIC_TYPE: return DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__NUMERIC_TYPE;
				default: return -1;
			}
		}
		if (baseClass == AbstractStringValue.class) {
			switch (baseFeatureID) {
				case DatavaluePackage.ABSTRACT_STRING_VALUE__STRING_TYPE: return DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__STRING_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (expression: "); //$NON-NLS-1$
		result.append(expression);
		result.append(", unparsedExpression: "); //$NON-NLS-1$
		result.append(unparsedExpression);
		result.append(')');
		return result.toString();
	}

} //AbstractExpressionValueImpl
