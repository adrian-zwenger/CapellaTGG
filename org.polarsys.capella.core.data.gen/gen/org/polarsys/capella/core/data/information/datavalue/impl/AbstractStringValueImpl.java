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
import org.polarsys.capella.core.data.information.datatype.StringType;

import org.polarsys.capella.core.data.information.datavalue.AbstractStringValue;
import org.polarsys.capella.core.data.information.datavalue.DatavaluePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract String Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.information.datavalue.impl.AbstractStringValueImpl#getStringType <em>String Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractStringValueImpl extends DataValueImpl implements AbstractStringValue {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStringValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatavaluePackage.Literals.ABSTRACT_STRING_VALUE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.ABSTRACT_STRING_VALUE__STRING_TYPE, oldStringType, stringType));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatavaluePackage.ABSTRACT_STRING_VALUE__STRING_TYPE:
				if (resolve) return getStringType();
				return basicGetStringType();
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
			case DatavaluePackage.ABSTRACT_STRING_VALUE__STRING_TYPE:
				return stringType != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractStringValueImpl
