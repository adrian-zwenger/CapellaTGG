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
package org.polarsys.capella.common.data.activity.impl;

import modellingcore.impl.AbstractInformationFlowImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.common.data.activity.ActivityEdge;
import org.polarsys.capella.common.data.activity.ActivityExchange;
import org.polarsys.capella.common.data.activity.ActivityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.common.data.activity.impl.ActivityExchangeImpl#getRealizingActivityFlows <em>Realizing Activity Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityExchangeImpl extends AbstractInformationFlowImpl implements ActivityExchange {
	/**
	 * The cached value of the '{@link #getRealizingActivityFlows() <em>Realizing Activity Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingActivityFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> realizingActivityFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ACTIVITY_EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityEdge> getRealizingActivityFlows() {
		if (realizingActivityFlows == null) {
			realizingActivityFlows = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS);
		}
		return realizingActivityFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS:
				return getRealizingActivityFlows();
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
			case ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS:
				return realizingActivityFlows != null && !realizingActivityFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityExchangeImpl
