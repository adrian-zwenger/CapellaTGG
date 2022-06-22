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

import org.polarsys.capella.core.data.information.Unit;

import org.polarsys.capella.core.data.information.datatype.NumericType;

import org.polarsys.capella.core.data.information.datavalue.DatavaluePackage;
import org.polarsys.capella.core.data.information.datavalue.NumericValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.information.datavalue.impl.NumericValueImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.datavalue.impl.NumericValueImpl#getNumericType <em>Numeric Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NumericValueImpl extends DataValueImpl implements NumericValue {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatavaluePackage.Literals.NUMERIC_VALUE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.NUMERIC_VALUE__UNIT, oldUnit, unit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatavaluePackage.NUMERIC_VALUE__UNIT, oldUnit, unit));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.NUMERIC_VALUE__NUMERIC_TYPE, oldNumericType, numericType));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatavaluePackage.NUMERIC_VALUE__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case DatavaluePackage.NUMERIC_VALUE__NUMERIC_TYPE:
				if (resolve) return getNumericType();
				return basicGetNumericType();
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
			case DatavaluePackage.NUMERIC_VALUE__UNIT:
				setUnit((Unit)newValue);
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
			case DatavaluePackage.NUMERIC_VALUE__UNIT:
				setUnit((Unit)null);
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
			case DatavaluePackage.NUMERIC_VALUE__UNIT:
				return unit != null;
			case DatavaluePackage.NUMERIC_VALUE__NUMERIC_TYPE:
				return numericType != null;
		}
		return super.eIsSet(featureID);
	}

} //NumericValueImpl
