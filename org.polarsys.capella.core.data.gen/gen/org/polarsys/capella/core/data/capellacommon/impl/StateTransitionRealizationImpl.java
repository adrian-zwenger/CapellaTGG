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
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.data.capellacommon.StateTransition;
import org.polarsys.capella.core.data.capellacommon.StateTransitionRealization;

import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Transition Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.StateTransitionRealizationImpl#getRealizedStateTransition <em>Realized State Transition</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.StateTransitionRealizationImpl#getRealizingStateTransition <em>Realizing State Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateTransitionRealizationImpl extends AllocationImpl implements StateTransitionRealization {
	/**
	 * The cached value of the '{@link #getRealizedStateTransition() <em>Realized State Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedStateTransition()
	 * @generated
	 * @ordered
	 */
	protected StateTransition realizedStateTransition;
	/**
	 * The cached value of the '{@link #getRealizingStateTransition() <em>Realizing State Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingStateTransition()
	 * @generated
	 * @ordered
	 */
	protected StateTransition realizingStateTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateTransitionRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.STATE_TRANSITION_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateTransition getRealizedStateTransition() {
		if (realizedStateTransition != null && realizedStateTransition.eIsProxy()) {
			InternalEObject oldRealizedStateTransition = (InternalEObject)realizedStateTransition;
			realizedStateTransition = (StateTransition)eResolveProxy(oldRealizedStateTransition);
			if (realizedStateTransition != oldRealizedStateTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.STATE_TRANSITION_REALIZATION__REALIZED_STATE_TRANSITION, oldRealizedStateTransition, realizedStateTransition));
			}
		}
		return realizedStateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransition basicGetRealizedStateTransition() {
		return realizedStateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateTransition getRealizingStateTransition() {
		if (realizingStateTransition != null && realizingStateTransition.eIsProxy()) {
			InternalEObject oldRealizingStateTransition = (InternalEObject)realizingStateTransition;
			realizingStateTransition = (StateTransition)eResolveProxy(oldRealizingStateTransition);
			if (realizingStateTransition != oldRealizingStateTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.STATE_TRANSITION_REALIZATION__REALIZING_STATE_TRANSITION, oldRealizingStateTransition, realizingStateTransition));
			}
		}
		return realizingStateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransition basicGetRealizingStateTransition() {
		return realizingStateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapellacommonPackage.STATE_TRANSITION_REALIZATION__REALIZED_STATE_TRANSITION:
				if (resolve) return getRealizedStateTransition();
				return basicGetRealizedStateTransition();
			case CapellacommonPackage.STATE_TRANSITION_REALIZATION__REALIZING_STATE_TRANSITION:
				if (resolve) return getRealizingStateTransition();
				return basicGetRealizingStateTransition();
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
			case CapellacommonPackage.STATE_TRANSITION_REALIZATION__REALIZED_STATE_TRANSITION:
				return realizedStateTransition != null;
			case CapellacommonPackage.STATE_TRANSITION_REALIZATION__REALIZING_STATE_TRANSITION:
				return realizingStateTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //StateTransitionRealizationImpl
