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
import org.polarsys.capella.core.data.information.datatype.BooleanType;

import org.polarsys.capella.core.data.information.datavalue.AbstractBooleanValue;
import org.polarsys.capella.core.data.information.datavalue.DatavaluePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.information.datavalue.impl.AbstractBooleanValueImpl#getBooleanType <em>Boolean Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractBooleanValueImpl extends DataValueImpl implements AbstractBooleanValue {
	/**
	 * The cached value of the '{@link #getBooleanType() <em>Boolean Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanType()
	 * @generated
	 * @ordered
	 */
	protected BooleanType booleanType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractBooleanValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatavaluePackage.Literals.ABSTRACT_BOOLEAN_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanType getBooleanType() {
		if (booleanType != null && booleanType.eIsProxy()) {
			InternalEObject oldBooleanType = (InternalEObject)booleanType;
			booleanType = (BooleanType)eResolveProxy(oldBooleanType);
			if (booleanType != oldBooleanType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.ABSTRACT_BOOLEAN_VALUE__BOOLEAN_TYPE, oldBooleanType, booleanType));
			}
		}
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType basicGetBooleanType() {
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatavaluePackage.ABSTRACT_BOOLEAN_VALUE__BOOLEAN_TYPE:
				if (resolve) return getBooleanType();
				return basicGetBooleanType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatavaluePackage.ABSTRACT_BOOLEAN_VALUE__BOOLEAN_TYPE:
				return booleanType != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractBooleanValueImpl
