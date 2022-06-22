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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.Classifier;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.Involvement;

import org.polarsys.capella.core.data.cs.impl.ComponentImpl;

import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.ctx.CapabilityInvolvement;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.Mission;
import org.polarsys.capella.core.data.ctx.MissionInvolvement;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;
import org.polarsys.capella.core.data.ctx.SystemFunction;

import org.polarsys.capella.core.data.la.LogicalComponent;

import org.polarsys.capella.core.data.oa.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemComponentImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemComponentImpl#getOwnedSystemComponents <em>Owned System Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemComponentImpl#getOwnedSystemComponentPkgs <em>Owned System Component Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemComponentImpl#isDataComponent <em>Data Component</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemComponentImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemComponentImpl#getInvolvingCapabilities <em>Involving Capabilities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemComponentImpl#getCapabilityInvolvements <em>Capability Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemComponentImpl#getInvolvingMissions <em>Involving Missions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemComponentImpl#getMissionInvolvements <em>Mission Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemComponentImpl#getRealizedEntities <em>Realized Entities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemComponentImpl#getRealizingLogicalComponents <em>Realizing Logical Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemComponentImpl#getAllocatedSystemFunctions <em>Allocated System Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemComponentImpl extends ComponentImpl implements SystemComponent {
	/**
	 * The cached value of the '{@link #getInvolvingInvolvements() <em>Involving Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvingInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<Involvement> involvingInvolvements;

	/**
	 * The cached value of the '{@link #getOwnedSystemComponents() <em>Owned System Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemComponent> ownedSystemComponents;

	/**
	 * The cached value of the '{@link #getOwnedSystemComponentPkgs() <em>Owned System Component Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemComponentPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemComponentPkg> ownedSystemComponentPkgs;

	/**
	 * The default value of the '{@link #isDataComponent() <em>Data Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataComponent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATA_COMPONENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDataComponent() <em>Data Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataComponent()
	 * @generated
	 * @ordered
	 */
	protected boolean dataComponent = DATA_COMPONENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> dataType;

	/**
	 * The cached value of the '{@link #getInvolvingCapabilities() <em>Involving Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvingCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> involvingCapabilities;

	/**
	 * The cached value of the '{@link #getCapabilityInvolvements() <em>Capability Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityInvolvement> capabilityInvolvements;

	/**
	 * The cached value of the '{@link #getInvolvingMissions() <em>Involving Missions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvingMissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Mission> involvingMissions;

	/**
	 * The cached value of the '{@link #getMissionInvolvements() <em>Mission Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<MissionInvolvement> missionInvolvements;

	/**
	 * The cached value of the '{@link #getRealizedEntities() <em>Realized Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> realizedEntities;

	/**
	 * The cached value of the '{@link #getRealizingLogicalComponents() <em>Realizing Logical Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingLogicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComponent> realizingLogicalComponents;

	/**
	 * The cached value of the '{@link #getAllocatedSystemFunctions() <em>Allocated System Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedSystemFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunction> allocatedSystemFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.SYSTEM_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Involvement> getInvolvingInvolvements() {
		if (involvingInvolvements == null) {
			involvingInvolvements = new EObjectResolvingEList<Involvement>(Involvement.class, this, CtxPackage.SYSTEM_COMPONENT__INVOLVING_INVOLVEMENTS);
		}
		return involvingInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemComponent> getOwnedSystemComponents() {
		if (ownedSystemComponents == null) {
			ownedSystemComponents = new EObjectContainmentEList.Resolving<SystemComponent>(SystemComponent.class, this, CtxPackage.SYSTEM_COMPONENT__OWNED_SYSTEM_COMPONENTS);
		}
		return ownedSystemComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemComponentPkg> getOwnedSystemComponentPkgs() {
		if (ownedSystemComponentPkgs == null) {
			ownedSystemComponentPkgs = new EObjectContainmentEList.Resolving<SystemComponentPkg>(SystemComponentPkg.class, this, CtxPackage.SYSTEM_COMPONENT__OWNED_SYSTEM_COMPONENT_PKGS);
		}
		return ownedSystemComponentPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDataComponent() {
		return dataComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataComponent(boolean newDataComponent) {
		boolean oldDataComponent = dataComponent;
		dataComponent = newDataComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_COMPONENT__DATA_COMPONENT, oldDataComponent, dataComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getDataType() {
		if (dataType == null) {
			dataType = new EObjectResolvingEList<Classifier>(Classifier.class, this, CtxPackage.SYSTEM_COMPONENT__DATA_TYPE);
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Capability> getInvolvingCapabilities() {
		if (involvingCapabilities == null) {
			involvingCapabilities = new EObjectResolvingEList<Capability>(Capability.class, this, CtxPackage.SYSTEM_COMPONENT__INVOLVING_CAPABILITIES);
		}
		return involvingCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityInvolvement> getCapabilityInvolvements() {
		if (capabilityInvolvements == null) {
			capabilityInvolvements = new EObjectResolvingEList<CapabilityInvolvement>(CapabilityInvolvement.class, this, CtxPackage.SYSTEM_COMPONENT__CAPABILITY_INVOLVEMENTS);
		}
		return capabilityInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mission> getInvolvingMissions() {
		if (involvingMissions == null) {
			involvingMissions = new EObjectResolvingEList<Mission>(Mission.class, this, CtxPackage.SYSTEM_COMPONENT__INVOLVING_MISSIONS);
		}
		return involvingMissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MissionInvolvement> getMissionInvolvements() {
		if (missionInvolvements == null) {
			missionInvolvements = new EObjectResolvingEList<MissionInvolvement>(MissionInvolvement.class, this, CtxPackage.SYSTEM_COMPONENT__MISSION_INVOLVEMENTS);
		}
		return missionInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getRealizedEntities() {
		if (realizedEntities == null) {
			realizedEntities = new EObjectResolvingEList<Entity>(Entity.class, this, CtxPackage.SYSTEM_COMPONENT__REALIZED_ENTITIES);
		}
		return realizedEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalComponent> getRealizingLogicalComponents() {
		if (realizingLogicalComponents == null) {
			realizingLogicalComponents = new EObjectResolvingEList<LogicalComponent>(LogicalComponent.class, this, CtxPackage.SYSTEM_COMPONENT__REALIZING_LOGICAL_COMPONENTS);
		}
		return realizingLogicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemFunction> getAllocatedSystemFunctions() {
		if (allocatedSystemFunctions == null) {
			allocatedSystemFunctions = new EObjectResolvingEList<SystemFunction>(SystemFunction.class, this, CtxPackage.SYSTEM_COMPONENT__ALLOCATED_SYSTEM_FUNCTIONS);
		}
		return allocatedSystemFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxPackage.SYSTEM_COMPONENT__OWNED_SYSTEM_COMPONENTS:
				return ((InternalEList<?>)getOwnedSystemComponents()).basicRemove(otherEnd, msgs);
			case CtxPackage.SYSTEM_COMPONENT__OWNED_SYSTEM_COMPONENT_PKGS:
				return ((InternalEList<?>)getOwnedSystemComponentPkgs()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.SYSTEM_COMPONENT__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case CtxPackage.SYSTEM_COMPONENT__OWNED_SYSTEM_COMPONENTS:
				return getOwnedSystemComponents();
			case CtxPackage.SYSTEM_COMPONENT__OWNED_SYSTEM_COMPONENT_PKGS:
				return getOwnedSystemComponentPkgs();
			case CtxPackage.SYSTEM_COMPONENT__DATA_COMPONENT:
				return isDataComponent();
			case CtxPackage.SYSTEM_COMPONENT__DATA_TYPE:
				return getDataType();
			case CtxPackage.SYSTEM_COMPONENT__INVOLVING_CAPABILITIES:
				return getInvolvingCapabilities();
			case CtxPackage.SYSTEM_COMPONENT__CAPABILITY_INVOLVEMENTS:
				return getCapabilityInvolvements();
			case CtxPackage.SYSTEM_COMPONENT__INVOLVING_MISSIONS:
				return getInvolvingMissions();
			case CtxPackage.SYSTEM_COMPONENT__MISSION_INVOLVEMENTS:
				return getMissionInvolvements();
			case CtxPackage.SYSTEM_COMPONENT__REALIZED_ENTITIES:
				return getRealizedEntities();
			case CtxPackage.SYSTEM_COMPONENT__REALIZING_LOGICAL_COMPONENTS:
				return getRealizingLogicalComponents();
			case CtxPackage.SYSTEM_COMPONENT__ALLOCATED_SYSTEM_FUNCTIONS:
				return getAllocatedSystemFunctions();
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
			case CtxPackage.SYSTEM_COMPONENT__OWNED_SYSTEM_COMPONENTS:
				getOwnedSystemComponents().clear();
				getOwnedSystemComponents().addAll((Collection<? extends SystemComponent>)newValue);
				return;
			case CtxPackage.SYSTEM_COMPONENT__OWNED_SYSTEM_COMPONENT_PKGS:
				getOwnedSystemComponentPkgs().clear();
				getOwnedSystemComponentPkgs().addAll((Collection<? extends SystemComponentPkg>)newValue);
				return;
			case CtxPackage.SYSTEM_COMPONENT__DATA_COMPONENT:
				setDataComponent((Boolean)newValue);
				return;
			case CtxPackage.SYSTEM_COMPONENT__DATA_TYPE:
				getDataType().clear();
				getDataType().addAll((Collection<? extends Classifier>)newValue);
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
			case CtxPackage.SYSTEM_COMPONENT__OWNED_SYSTEM_COMPONENTS:
				getOwnedSystemComponents().clear();
				return;
			case CtxPackage.SYSTEM_COMPONENT__OWNED_SYSTEM_COMPONENT_PKGS:
				getOwnedSystemComponentPkgs().clear();
				return;
			case CtxPackage.SYSTEM_COMPONENT__DATA_COMPONENT:
				setDataComponent(DATA_COMPONENT_EDEFAULT);
				return;
			case CtxPackage.SYSTEM_COMPONENT__DATA_TYPE:
				getDataType().clear();
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
			case CtxPackage.SYSTEM_COMPONENT__INVOLVING_INVOLVEMENTS:
				return involvingInvolvements != null && !involvingInvolvements.isEmpty();
			case CtxPackage.SYSTEM_COMPONENT__OWNED_SYSTEM_COMPONENTS:
				return ownedSystemComponents != null && !ownedSystemComponents.isEmpty();
			case CtxPackage.SYSTEM_COMPONENT__OWNED_SYSTEM_COMPONENT_PKGS:
				return ownedSystemComponentPkgs != null && !ownedSystemComponentPkgs.isEmpty();
			case CtxPackage.SYSTEM_COMPONENT__DATA_COMPONENT:
				return dataComponent != DATA_COMPONENT_EDEFAULT;
			case CtxPackage.SYSTEM_COMPONENT__DATA_TYPE:
				return dataType != null && !dataType.isEmpty();
			case CtxPackage.SYSTEM_COMPONENT__INVOLVING_CAPABILITIES:
				return involvingCapabilities != null && !involvingCapabilities.isEmpty();
			case CtxPackage.SYSTEM_COMPONENT__CAPABILITY_INVOLVEMENTS:
				return capabilityInvolvements != null && !capabilityInvolvements.isEmpty();
			case CtxPackage.SYSTEM_COMPONENT__INVOLVING_MISSIONS:
				return involvingMissions != null && !involvingMissions.isEmpty();
			case CtxPackage.SYSTEM_COMPONENT__MISSION_INVOLVEMENTS:
				return missionInvolvements != null && !missionInvolvements.isEmpty();
			case CtxPackage.SYSTEM_COMPONENT__REALIZED_ENTITIES:
				return realizedEntities != null && !realizedEntities.isEmpty();
			case CtxPackage.SYSTEM_COMPONENT__REALIZING_LOGICAL_COMPONENTS:
				return realizingLogicalComponents != null && !realizingLogicalComponents.isEmpty();
			case CtxPackage.SYSTEM_COMPONENT__ALLOCATED_SYSTEM_FUNCTIONS:
				return allocatedSystemFunctions != null && !allocatedSystemFunctions.isEmpty();
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
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case CtxPackage.SYSTEM_COMPONENT__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
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
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return CtxPackage.SYSTEM_COMPONENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dataComponent: "); //$NON-NLS-1$
		result.append(dataComponent);
		result.append(')');
		return result.toString();
	}

} //SystemComponentImpl
