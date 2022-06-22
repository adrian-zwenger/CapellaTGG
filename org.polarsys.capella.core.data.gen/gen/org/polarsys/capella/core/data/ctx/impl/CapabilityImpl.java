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
package org.polarsys.capella.core.data.ctx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.ctx.CapabilityExploitation;
import org.polarsys.capella.core.data.ctx.CapabilityInvolvement;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.Mission;
import org.polarsys.capella.core.data.ctx.SystemComponent;

import org.polarsys.capella.core.data.interaction.impl.AbstractCapabilityImpl;

import org.polarsys.capella.core.data.la.CapabilityRealization;

import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.oa.OperationalCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.CapabilityImpl#getOwnedCapabilityInvolvements <em>Owned Capability Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.CapabilityImpl#getInvolvedSystemComponents <em>Involved System Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.CapabilityImpl#getPurposes <em>Purposes</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.CapabilityImpl#getPurposeMissions <em>Purpose Missions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.CapabilityImpl#getRealizedOperationalCapabilities <em>Realized Operational Capabilities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.CapabilityImpl#getRealizingCapabilityRealizations <em>Realizing Capability Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends AbstractCapabilityImpl implements Capability {
	/**
	 * The cached value of the '{@link #getOwnedCapabilityInvolvements() <em>Owned Capability Involvements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCapabilityInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityInvolvement> ownedCapabilityInvolvements;

	/**
	 * The cached value of the '{@link #getInvolvedSystemComponents() <em>Involved System Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedSystemComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemComponent> involvedSystemComponents;
	/**
	 * The cached value of the '{@link #getPurposes() <em>Purposes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityExploitation> purposes;
	/**
	 * The cached value of the '{@link #getPurposeMissions() <em>Purpose Missions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeMissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Mission> purposeMissions;
	/**
	 * The cached value of the '{@link #getRealizedOperationalCapabilities() <em>Realized Operational Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedOperationalCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalCapability> realizedOperationalCapabilities;
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
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityInvolvement> getOwnedCapabilityInvolvements() {
		if (ownedCapabilityInvolvements == null) {
			ownedCapabilityInvolvements = new EObjectContainmentEList<CapabilityInvolvement>(CapabilityInvolvement.class, this, CtxPackage.CAPABILITY__OWNED_CAPABILITY_INVOLVEMENTS);
		}
		return ownedCapabilityInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemComponent> getInvolvedSystemComponents() {
		if (involvedSystemComponents == null) {
			involvedSystemComponents = new EObjectResolvingEList<SystemComponent>(SystemComponent.class, this, CtxPackage.CAPABILITY__INVOLVED_SYSTEM_COMPONENTS);
		}
		return involvedSystemComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityExploitation> getPurposes() {
		if (purposes == null) {
			purposes = new EObjectResolvingEList<CapabilityExploitation>(CapabilityExploitation.class, this, CtxPackage.CAPABILITY__PURPOSES);
		}
		return purposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mission> getPurposeMissions() {
		if (purposeMissions == null) {
			purposeMissions = new EObjectWithInverseResolvingEList.ManyInverse<Mission>(Mission.class, this, CtxPackage.CAPABILITY__PURPOSE_MISSIONS, CtxPackage.MISSION__EXPLOITED_CAPABILITIES);
		}
		return purposeMissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalCapability> getRealizedOperationalCapabilities() {
		if (realizedOperationalCapabilities == null) {
			realizedOperationalCapabilities = new EObjectWithInverseResolvingEList.ManyInverse<OperationalCapability>(OperationalCapability.class, this, CtxPackage.CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES, OaPackage.OPERATIONAL_CAPABILITY__REALIZING_CAPABILITIES);
		}
		return realizedOperationalCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityRealization> getRealizingCapabilityRealizations() {
		if (realizingCapabilityRealizations == null) {
			realizingCapabilityRealizations = new EObjectWithInverseResolvingEList.ManyInverse<CapabilityRealization>(CapabilityRealization.class, this, CtxPackage.CAPABILITY__REALIZING_CAPABILITY_REALIZATIONS, LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES);
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
			case CtxPackage.CAPABILITY__PURPOSE_MISSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPurposeMissions()).basicAdd(otherEnd, msgs);
			case CtxPackage.CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizedOperationalCapabilities()).basicAdd(otherEnd, msgs);
			case CtxPackage.CAPABILITY__REALIZING_CAPABILITY_REALIZATIONS:
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
			case CtxPackage.CAPABILITY__OWNED_CAPABILITY_INVOLVEMENTS:
				return ((InternalEList<?>)getOwnedCapabilityInvolvements()).basicRemove(otherEnd, msgs);
			case CtxPackage.CAPABILITY__PURPOSE_MISSIONS:
				return ((InternalEList<?>)getPurposeMissions()).basicRemove(otherEnd, msgs);
			case CtxPackage.CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES:
				return ((InternalEList<?>)getRealizedOperationalCapabilities()).basicRemove(otherEnd, msgs);
			case CtxPackage.CAPABILITY__REALIZING_CAPABILITY_REALIZATIONS:
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
			case CtxPackage.CAPABILITY__OWNED_CAPABILITY_INVOLVEMENTS:
				return getOwnedCapabilityInvolvements();
			case CtxPackage.CAPABILITY__INVOLVED_SYSTEM_COMPONENTS:
				return getInvolvedSystemComponents();
			case CtxPackage.CAPABILITY__PURPOSES:
				return getPurposes();
			case CtxPackage.CAPABILITY__PURPOSE_MISSIONS:
				return getPurposeMissions();
			case CtxPackage.CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES:
				return getRealizedOperationalCapabilities();
			case CtxPackage.CAPABILITY__REALIZING_CAPABILITY_REALIZATIONS:
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
			case CtxPackage.CAPABILITY__OWNED_CAPABILITY_INVOLVEMENTS:
				getOwnedCapabilityInvolvements().clear();
				getOwnedCapabilityInvolvements().addAll((Collection<? extends CapabilityInvolvement>)newValue);
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
			case CtxPackage.CAPABILITY__OWNED_CAPABILITY_INVOLVEMENTS:
				getOwnedCapabilityInvolvements().clear();
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
			case CtxPackage.CAPABILITY__OWNED_CAPABILITY_INVOLVEMENTS:
				return ownedCapabilityInvolvements != null && !ownedCapabilityInvolvements.isEmpty();
			case CtxPackage.CAPABILITY__INVOLVED_SYSTEM_COMPONENTS:
				return involvedSystemComponents != null && !involvedSystemComponents.isEmpty();
			case CtxPackage.CAPABILITY__PURPOSES:
				return purposes != null && !purposes.isEmpty();
			case CtxPackage.CAPABILITY__PURPOSE_MISSIONS:
				return purposeMissions != null && !purposeMissions.isEmpty();
			case CtxPackage.CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES:
				return realizedOperationalCapabilities != null && !realizedOperationalCapabilities.isEmpty();
			case CtxPackage.CAPABILITY__REALIZING_CAPABILITY_REALIZATIONS:
				return realizingCapabilityRealizations != null && !realizingCapabilityRealizations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
