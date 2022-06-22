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
import org.polarsys.capella.core.data.capellacommon.StateEvent;
import org.polarsys.capella.core.data.capellacommon.StateEventRealization;

import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Event Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.StateEventRealizationImpl#getRealizedEvent <em>Realized Event</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.StateEventRealizationImpl#getRealizingEvent <em>Realizing Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateEventRealizationImpl extends AllocationImpl implements StateEventRealization {
	/**
	 * The cached value of the '{@link #getRealizedEvent() <em>Realized Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedEvent()
	 * @generated
	 * @ordered
	 */
	protected StateEvent realizedEvent;
	/**
	 * The cached value of the '{@link #getRealizingEvent() <em>Realizing Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingEvent()
	 * @generated
	 * @ordered
	 */
	protected StateEvent realizingEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateEventRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.STATE_EVENT_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateEvent getRealizedEvent() {
		if (realizedEvent != null && realizedEvent.eIsProxy()) {
			InternalEObject oldRealizedEvent = (InternalEObject)realizedEvent;
			realizedEvent = (StateEvent)eResolveProxy(oldRealizedEvent);
			if (realizedEvent != oldRealizedEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.STATE_EVENT_REALIZATION__REALIZED_EVENT, oldRealizedEvent, realizedEvent));
			}
		}
		return realizedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEvent basicGetRealizedEvent() {
		return realizedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateEvent getRealizingEvent() {
		if (realizingEvent != null && realizingEvent.eIsProxy()) {
			InternalEObject oldRealizingEvent = (InternalEObject)realizingEvent;
			realizingEvent = (StateEvent)eResolveProxy(oldRealizingEvent);
			if (realizingEvent != oldRealizingEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.STATE_EVENT_REALIZATION__REALIZING_EVENT, oldRealizingEvent, realizingEvent));
			}
		}
		return realizingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEvent basicGetRealizingEvent() {
		return realizingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapellacommonPackage.STATE_EVENT_REALIZATION__REALIZED_EVENT:
				if (resolve) return getRealizedEvent();
				return basicGetRealizedEvent();
			case CapellacommonPackage.STATE_EVENT_REALIZATION__REALIZING_EVENT:
				if (resolve) return getRealizingEvent();
				return basicGetRealizingEvent();
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
			case CapellacommonPackage.STATE_EVENT_REALIZATION__REALIZED_EVENT:
				return realizedEvent != null;
			case CapellacommonPackage.STATE_EVENT_REALIZATION__REALIZING_EVENT:
				return realizingEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //StateEventRealizationImpl
