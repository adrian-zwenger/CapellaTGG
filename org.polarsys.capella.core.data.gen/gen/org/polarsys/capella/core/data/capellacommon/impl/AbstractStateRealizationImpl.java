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
package org.polarsys.capella.core.data.capellacommon.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.capellacommon.AbstractState;
import org.polarsys.capella.core.data.capellacommon.AbstractStateRealization;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;

import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract State Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.AbstractStateRealizationImpl#getRealizedAbstractState <em>Realized Abstract State</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.AbstractStateRealizationImpl#getRealizingAbstractState <em>Realizing Abstract State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractStateRealizationImpl extends AllocationImpl implements AbstractStateRealization {
	/**
	 * The cached value of the '{@link #getRealizedAbstractState() <em>Realized Abstract State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedAbstractState()
	 * @generated
	 * @ordered
	 */
	protected AbstractState realizedAbstractState;
	/**
	 * The cached value of the '{@link #getRealizingAbstractState() <em>Realizing Abstract State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingAbstractState()
	 * @generated
	 * @ordered
	 */
	protected AbstractState realizingAbstractState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStateRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.ABSTRACT_STATE_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractState getRealizedAbstractState() {
		if (realizedAbstractState != null && realizedAbstractState.eIsProxy()) {
			InternalEObject oldRealizedAbstractState = (InternalEObject)realizedAbstractState;
			realizedAbstractState = (AbstractState)eResolveProxy(oldRealizedAbstractState);
			if (realizedAbstractState != oldRealizedAbstractState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.ABSTRACT_STATE_REALIZATION__REALIZED_ABSTRACT_STATE, oldRealizedAbstractState, realizedAbstractState));
			}
		}
		return realizedAbstractState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState basicGetRealizedAbstractState() {
		return realizedAbstractState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractState getRealizingAbstractState() {
		if (realizingAbstractState != null && realizingAbstractState.eIsProxy()) {
			InternalEObject oldRealizingAbstractState = (InternalEObject)realizingAbstractState;
			realizingAbstractState = (AbstractState)eResolveProxy(oldRealizingAbstractState);
			if (realizingAbstractState != oldRealizingAbstractState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.ABSTRACT_STATE_REALIZATION__REALIZING_ABSTRACT_STATE, oldRealizingAbstractState, realizingAbstractState));
			}
		}
		return realizingAbstractState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState basicGetRealizingAbstractState() {
		return realizingAbstractState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapellacommonPackage.ABSTRACT_STATE_REALIZATION__REALIZED_ABSTRACT_STATE:
				if (resolve) return getRealizedAbstractState();
				return basicGetRealizedAbstractState();
			case CapellacommonPackage.ABSTRACT_STATE_REALIZATION__REALIZING_ABSTRACT_STATE:
				if (resolve) return getRealizingAbstractState();
				return basicGetRealizingAbstractState();
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
			case CapellacommonPackage.ABSTRACT_STATE_REALIZATION__REALIZED_ABSTRACT_STATE:
				return realizedAbstractState != null;
			case CapellacommonPackage.ABSTRACT_STATE_REALIZATION__REALIZING_ABSTRACT_STATE:
				return realizingAbstractState != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractStateRealizationImpl
