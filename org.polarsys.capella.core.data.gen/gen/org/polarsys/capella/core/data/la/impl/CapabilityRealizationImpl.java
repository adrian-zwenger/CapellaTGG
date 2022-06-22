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
package org.polarsys.capella.core.data.la.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvedElement;
import org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvement;

import org.polarsys.capella.core.data.ctx.Capability;

import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.interaction.impl.AbstractCapabilityImpl;

import org.polarsys.capella.core.data.la.CapabilityRealization;
import org.polarsys.capella.core.data.la.LaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.CapabilityRealizationImpl#getOwnedCapabilityRealizationInvolvements <em>Owned Capability Realization Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.CapabilityRealizationImpl#getInvolvedComponents <em>Involved Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.CapabilityRealizationImpl#getRealizedCapabilities <em>Realized Capabilities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.CapabilityRealizationImpl#getRealizedCapabilityRealizations <em>Realized Capability Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.CapabilityRealizationImpl#getRealizingCapabilityRealizations <em>Realizing Capability Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityRealizationImpl extends AbstractCapabilityImpl implements CapabilityRealization {
	/**
	 * The cached value of the '{@link #getOwnedCapabilityRealizationInvolvements() <em>Owned Capability Realization Involvements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCapabilityRealizationInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityRealizationInvolvement> ownedCapabilityRealizationInvolvements;

	/**
	 * The cached value of the '{@link #getInvolvedComponents() <em>Involved Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityRealizationInvolvedElement> involvedComponents;
	/**
	 * The cached value of the '{@link #getRealizedCapabilities() <em>Realized Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> realizedCapabilities;
	/**
	 * The cached value of the '{@link #getRealizedCapabilityRealizations() <em>Realized Capability Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedCapabilityRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityRealization> realizedCapabilityRealizations;
	/**
	 * The cached value of the '{@link #getRealizingCapabilityRealizations() <em>Realizing Capability Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingCapabilityRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityRealization> realizingCapabilityRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaPackage.Literals.CAPABILITY_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityRealizationInvolvement> getOwnedCapabilityRealizationInvolvements() {
		if (ownedCapabilityRealizationInvolvements == null) {
			ownedCapabilityRealizationInvolvements = new EObjectContainmentEList<CapabilityRealizationInvolvement>(CapabilityRealizationInvolvement.class, this, LaPackage.CAPABILITY_REALIZATION__OWNED_CAPABILITY_REALIZATION_INVOLVEMENTS);
		}
		return ownedCapabilityRealizationInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityRealizationInvolvedElement> getInvolvedComponents() {
		if (involvedComponents == null) {
			involvedComponents = new EObjectResolvingEList<CapabilityRealizationInvolvedElement>(CapabilityRealizationInvolvedElement.class, this, LaPackage.CAPABILITY_REALIZATION__INVOLVED_COMPONENTS);
		}
		return involvedComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Capability> getRealizedCapabilities() {
		if (realizedCapabilities == null) {
			realizedCapabilities = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this, LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES, CtxPackage.CAPABILITY__REALIZING_CAPABILITY_REALIZATIONS);
		}
		return realizedCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityRealization> getRealizedCapabilityRealizations() {
		if (realizedCapabilityRealizations == null) {
			realizedCapabilityRealizations = new EObjectWithInverseResolvingEList.ManyInverse<CapabilityRealization>(CapabilityRealization.class, this, LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS, LaPackage.CAPABILITY_REALIZATION__REALIZING_CAPABILITY_REALIZATIONS);
		}
		return realizedCapabilityRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityRealization> getRealizingCapabilityRealizations() {
		if (realizingCapabilityRealizations == null) {
			realizingCapabilityRealizations = new EObjectWithInverseResolvingEList.ManyInverse<CapabilityRealization>(CapabilityRealization.class, this, LaPackage.CAPABILITY_REALIZATION__REALIZING_CAPABILITY_REALIZATIONS, LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS);
		}
		return realizingCapabilityRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizedCapabilities()).basicAdd(otherEnd, msgs);
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizedCapabilityRealizations()).basicAdd(otherEnd, msgs);
			case LaPackage.CAPABILITY_REALIZATION__REALIZING_CAPABILITY_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizingCapabilityRealizations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LaPackage.CAPABILITY_REALIZATION__OWNED_CAPABILITY_REALIZATION_INVOLVEMENTS:
				return ((InternalEList<?>)getOwnedCapabilityRealizationInvolvements()).basicRemove(otherEnd, msgs);
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES:
				return ((InternalEList<?>)getRealizedCapabilities()).basicRemove(otherEnd, msgs);
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS:
				return ((InternalEList<?>)getRealizedCapabilityRealizations()).basicRemove(otherEnd, msgs);
			case LaPackage.CAPABILITY_REALIZATION__REALIZING_CAPABILITY_REALIZATIONS:
				return ((InternalEList<?>)getRealizingCapabilityRealizations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LaPackage.CAPABILITY_REALIZATION__OWNED_CAPABILITY_REALIZATION_INVOLVEMENTS:
				return getOwnedCapabilityRealizationInvolvements();
			case LaPackage.CAPABILITY_REALIZATION__INVOLVED_COMPONENTS:
				return getInvolvedComponents();
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES:
				return getRealizedCapabilities();
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS:
				return getRealizedCapabilityRealizations();
			case LaPackage.CAPABILITY_REALIZATION__REALIZING_CAPABILITY_REALIZATIONS:
				return getRealizingCapabilityRealizations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LaPackage.CAPABILITY_REALIZATION__OWNED_CAPABILITY_REALIZATION_INVOLVEMENTS:
				getOwnedCapabilityRealizationInvolvements().clear();
				getOwnedCapabilityRealizationInvolvements().addAll((Collection<? extends CapabilityRealizationInvolvement>)newValue);
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
			case LaPackage.CAPABILITY_REALIZATION__OWNED_CAPABILITY_REALIZATION_INVOLVEMENTS:
				getOwnedCapabilityRealizationInvolvements().clear();
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
			case LaPackage.CAPABILITY_REALIZATION__OWNED_CAPABILITY_REALIZATION_INVOLVEMENTS:
				return ownedCapabilityRealizationInvolvements != null && !ownedCapabilityRealizationInvolvements.isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__INVOLVED_COMPONENTS:
				return involvedComponents != null && !involvedComponents.isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES:
				return realizedCapabilities != null && !realizedCapabilities.isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS:
				return realizedCapabilityRealizations != null && !realizedCapabilityRealizations.isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__REALIZING_CAPABILITY_REALIZATIONS:
				return realizingCapabilityRealizations != null && !realizingCapabilityRealizations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityRealizationImpl
