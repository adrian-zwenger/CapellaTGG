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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.core.data.interaction.Gate;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.interaction.InteractionUse;
import org.polarsys.capella.core.data.interaction.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.InteractionUseImpl#getReferencedScenario <em>Referenced Scenario</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.InteractionUseImpl#getActualGates <em>Actual Gates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionUseImpl extends AbstractFragmentImpl implements InteractionUse {
	/**
	 * The cached value of the '{@link #getReferencedScenario() <em>Referenced Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedScenario()
	 * @generated
	 * @ordered
	 */
	protected Scenario referencedScenario;

	/**
	 * The cached value of the '{@link #getActualGates() <em>Actual Gates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> actualGates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.INTERACTION_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scenario getReferencedScenario() {
		if (referencedScenario != null && referencedScenario.eIsProxy()) {
			InternalEObject oldReferencedScenario = (InternalEObject)referencedScenario;
			referencedScenario = (Scenario)eResolveProxy(oldReferencedScenario);
			if (referencedScenario != oldReferencedScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.INTERACTION_USE__REFERENCED_SCENARIO, oldReferencedScenario, referencedScenario));
			}
		}
		return referencedScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario basicGetReferencedScenario() {
		return referencedScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedScenario(Scenario newReferencedScenario) {
		Scenario oldReferencedScenario = referencedScenario;
		referencedScenario = newReferencedScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERACTION_USE__REFERENCED_SCENARIO, oldReferencedScenario, referencedScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gate> getActualGates() {
		if (actualGates == null) {
			actualGates = new EObjectResolvingEList<Gate>(Gate.class, this, InteractionPackage.INTERACTION_USE__ACTUAL_GATES);
		}
		return actualGates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.INTERACTION_USE__REFERENCED_SCENARIO:
				if (resolve) return getReferencedScenario();
				return basicGetReferencedScenario();
			case InteractionPackage.INTERACTION_USE__ACTUAL_GATES:
				return getActualGates();
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
			case InteractionPackage.INTERACTION_USE__REFERENCED_SCENARIO:
				setReferencedScenario((Scenario)newValue);
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
			case InteractionPackage.INTERACTION_USE__REFERENCED_SCENARIO:
				setReferencedScenario((Scenario)null);
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
			case InteractionPackage.INTERACTION_USE__REFERENCED_SCENARIO:
				return referencedScenario != null;
			case InteractionPackage.INTERACTION_USE__ACTUAL_GATES:
				return actualGates != null && !actualGates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractionUseImpl
