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

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.capellacore.InvolverElement;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.ctx.CapabilityExploitation;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.Mission;
import org.polarsys.capella.core.data.ctx.MissionInvolvement;
import org.polarsys.capella.core.data.ctx.SystemComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionImpl#getInvolvedInvolvements <em>Involved Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionImpl#getOwnedMissionInvolvements <em>Owned Mission Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionImpl#getInvolvedSystemComponents <em>Involved System Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionImpl#getOwnedCapabilityExploitations <em>Owned Capability Exploitations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionImpl#getExploitedCapabilities <em>Exploited Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionImpl extends NamedElementImpl implements Mission {
	/**
	 * The cached value of the '{@link #getInvolvedInvolvements() <em>Involved Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<Involvement> involvedInvolvements;

	/**
	 * The cached value of the '{@link #getOwnedMissionInvolvements() <em>Owned Mission Involvements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMissionInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<MissionInvolvement> ownedMissionInvolvements;

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
	 * The cached value of the '{@link #getOwnedCapabilityExploitations() <em>Owned Capability Exploitations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCapabilityExploitations()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityExploitation> ownedCapabilityExploitations;

	/**
	 * The cached value of the '{@link #getExploitedCapabilities() <em>Exploited Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExploitedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> exploitedCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.MISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Involvement> getInvolvedInvolvements() {
		if (involvedInvolvements == null) {
			involvedInvolvements = new EObjectResolvingEList<Involvement>(Involvement.class, this, CtxPackage.MISSION__INVOLVED_INVOLVEMENTS);
		}
		return involvedInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MissionInvolvement> getOwnedMissionInvolvements() {
		if (ownedMissionInvolvements == null) {
			ownedMissionInvolvements = new EObjectContainmentEList<MissionInvolvement>(MissionInvolvement.class, this, CtxPackage.MISSION__OWNED_MISSION_INVOLVEMENTS);
		}
		return ownedMissionInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemComponent> getInvolvedSystemComponents() {
		if (involvedSystemComponents == null) {
			involvedSystemComponents = new EObjectResolvingEList<SystemComponent>(SystemComponent.class, this, CtxPackage.MISSION__INVOLVED_SYSTEM_COMPONENTS);
		}
		return involvedSystemComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityExploitation> getOwnedCapabilityExploitations() {
		if (ownedCapabilityExploitations == null) {
			ownedCapabilityExploitations = new EObjectContainmentEList<CapabilityExploitation>(CapabilityExploitation.class, this, CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS);
		}
		return ownedCapabilityExploitations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Capability> getExploitedCapabilities() {
		if (exploitedCapabilities == null) {
			exploitedCapabilities = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this, CtxPackage.MISSION__EXPLOITED_CAPABILITIES, CtxPackage.CAPABILITY__PURPOSE_MISSIONS);
		}
		return exploitedCapabilities;
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
			case CtxPackage.MISSION__EXPLOITED_CAPABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExploitedCapabilities()).basicAdd(otherEnd, msgs);
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
			case CtxPackage.MISSION__OWNED_MISSION_INVOLVEMENTS:
				return ((InternalEList<?>)getOwnedMissionInvolvements()).basicRemove(otherEnd, msgs);
			case CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS:
				return ((InternalEList<?>)getOwnedCapabilityExploitations()).basicRemove(otherEnd, msgs);
			case CtxPackage.MISSION__EXPLOITED_CAPABILITIES:
				return ((InternalEList<?>)getExploitedCapabilities()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.MISSION__INVOLVED_INVOLVEMENTS:
				return getInvolvedInvolvements();
			case CtxPackage.MISSION__OWNED_MISSION_INVOLVEMENTS:
				return getOwnedMissionInvolvements();
			case CtxPackage.MISSION__INVOLVED_SYSTEM_COMPONENTS:
				return getInvolvedSystemComponents();
			case CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS:
				return getOwnedCapabilityExploitations();
			case CtxPackage.MISSION__EXPLOITED_CAPABILITIES:
				return getExploitedCapabilities();
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
			case CtxPackage.MISSION__OWNED_MISSION_INVOLVEMENTS:
				getOwnedMissionInvolvements().clear();
				getOwnedMissionInvolvements().addAll((Collection<? extends MissionInvolvement>)newValue);
				return;
			case CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS:
				getOwnedCapabilityExploitations().clear();
				getOwnedCapabilityExploitations().addAll((Collection<? extends CapabilityExploitation>)newValue);
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
			case CtxPackage.MISSION__OWNED_MISSION_INVOLVEMENTS:
				getOwnedMissionInvolvements().clear();
				return;
			case CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS:
				getOwnedCapabilityExploitations().clear();
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
			case CtxPackage.MISSION__INVOLVED_INVOLVEMENTS:
				return involvedInvolvements != null && !involvedInvolvements.isEmpty();
			case CtxPackage.MISSION__OWNED_MISSION_INVOLVEMENTS:
				return ownedMissionInvolvements != null && !ownedMissionInvolvements.isEmpty();
			case CtxPackage.MISSION__INVOLVED_SYSTEM_COMPONENTS:
				return involvedSystemComponents != null && !involvedSystemComponents.isEmpty();
			case CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS:
				return ownedCapabilityExploitations != null && !ownedCapabilityExploitations.isEmpty();
			case CtxPackage.MISSION__EXPLOITED_CAPABILITIES:
				return exploitedCapabilities != null && !exploitedCapabilities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InvolverElement.class) {
			switch (derivedFeatureID) {
				case CtxPackage.MISSION__INVOLVED_INVOLVEMENTS: return CapellacorePackage.INVOLVER_ELEMENT__INVOLVED_INVOLVEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InvolverElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVER_ELEMENT__INVOLVED_INVOLVEMENTS: return CtxPackage.MISSION__INVOLVED_INVOLVEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MissionImpl
