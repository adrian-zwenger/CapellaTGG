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
package org.polarsys.capella.core.data.interaction.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.interaction.ScenarioRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.ScenarioRealizationImpl#getRealizedScenario <em>Realized Scenario</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.ScenarioRealizationImpl#getRealizingScenario <em>Realizing Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioRealizationImpl extends AllocationImpl implements ScenarioRealization {
	/**
	 * The cached value of the '{@link #getRealizedScenario() <em>Realized Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedScenario()
	 * @generated
	 * @ordered
	 */
	protected Scenario realizedScenario;
	/**
	 * The cached value of the '{@link #getRealizingScenario() <em>Realizing Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingScenario()
	 * @generated
	 * @ordered
	 */
	protected Scenario realizingScenario;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.SCENARIO_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scenario getRealizedScenario() {
		if (realizedScenario != null && realizedScenario.eIsProxy()) {
			InternalEObject oldRealizedScenario = (InternalEObject)realizedScenario;
			realizedScenario = (Scenario)eResolveProxy(oldRealizedScenario);
			if (realizedScenario != oldRealizedScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.SCENARIO_REALIZATION__REALIZED_SCENARIO, oldRealizedScenario, realizedScenario));
			}
		}
		return realizedScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario basicGetRealizedScenario() {
		return realizedScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scenario getRealizingScenario() {
		if (realizingScenario != null && realizingScenario.eIsProxy()) {
			InternalEObject oldRealizingScenario = (InternalEObject)realizingScenario;
			realizingScenario = (Scenario)eResolveProxy(oldRealizingScenario);
			if (realizingScenario != oldRealizingScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.SCENARIO_REALIZATION__REALIZING_SCENARIO, oldRealizingScenario, realizingScenario));
			}
		}
		return realizingScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario basicGetRealizingScenario() {
		return realizingScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.SCENARIO_REALIZATION__REALIZED_SCENARIO:
				if (resolve) return getRealizedScenario();
				return basicGetRealizedScenario();
			case InteractionPackage.SCENARIO_REALIZATION__REALIZING_SCENARIO:
				if (resolve) return getRealizingScenario();
				return basicGetRealizingScenario();
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
			case InteractionPackage.SCENARIO_REALIZATION__REALIZED_SCENARIO:
				return realizedScenario != null;
			case InteractionPackage.SCENARIO_REALIZATION__REALIZING_SCENARIO:
				return realizingScenario != null;
		}
		return super.eIsSet(featureID);
	}

} //ScenarioRealizationImpl
