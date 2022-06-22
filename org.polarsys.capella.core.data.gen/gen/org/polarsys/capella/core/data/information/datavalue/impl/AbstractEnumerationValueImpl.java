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
import org.polarsys.capella.core.data.information.datatype.Enumeration;

import org.polarsys.capella.core.data.information.datavalue.AbstractEnumerationValue;
import org.polarsys.capella.core.data.information.datavalue.DatavaluePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.information.datavalue.impl.AbstractEnumerationValueImpl#getEnumerationType <em>Enumeration Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractEnumerationValueImpl extends DataValueImpl implements AbstractEnumerationValue {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractEnumerationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatavaluePackage.Literals.ABSTRACT_ENUMERATION_VALUE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.ABSTRACT_ENUMERATION_VALUE__ENUMERATION_TYPE, oldEnumerationType, enumerationType));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatavaluePackage.ABSTRACT_ENUMERATION_VALUE__ENUMERATION_TYPE:
				if (resolve) return getEnumerationType();
				return basicGetEnumerationType();
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
			case DatavaluePackage.ABSTRACT_ENUMERATION_VALUE__ENUMERATION_TYPE:
				return enumerationType != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractEnumerationValueImpl
