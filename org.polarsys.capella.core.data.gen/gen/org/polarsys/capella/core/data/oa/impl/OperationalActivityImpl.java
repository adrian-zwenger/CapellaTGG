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
package org.polarsys.capella.core.data.oa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.SystemFunction;

import org.polarsys.capella.core.data.fa.impl.AbstractFunctionImpl;

import org.polarsys.capella.core.data.oa.ActivityAllocation;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.oa.OperationalActivity;
import org.polarsys.capella.core.data.oa.OperationalActivityPkg;
import org.polarsys.capella.core.data.oa.OperationalProcess;
import org.polarsys.capella.core.data.oa.Role;
import org.polarsys.capella.core.data.oa.Swimlane;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalActivityImpl#getOwnedOperationalActivityPkgs <em>Owned Operational Activity Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalActivityImpl#getActivityAllocations <em>Activity Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalActivityImpl#getOwnedSwimlanes <em>Owned Swimlanes</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalActivityImpl#getOwnedProcess <em>Owned Process</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalActivityImpl#getAllocatorEntities <em>Allocator Entities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalActivityImpl#getRealizingSystemFunctions <em>Realizing System Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalActivityImpl#getAllocatingRoles <em>Allocating Roles</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalActivityImpl#getContainedOperationalActivities <em>Contained Operational Activities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalActivityImpl#getChildrenOperationalActivities <em>Children Operational Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalActivityImpl extends AbstractFunctionImpl implements OperationalActivity {
	/**
	 * The cached value of the '{@link #getOwnedOperationalActivityPkgs() <em>Owned Operational Activity Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationalActivityPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalActivityPkg> ownedOperationalActivityPkgs;

	/**
	 * The cached value of the '{@link #getActivityAllocations() <em>Activity Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityAllocation> activityAllocations;
	/**
	 * The cached value of the '{@link #getOwnedSwimlanes() <em>Owned Swimlanes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSwimlanes()
	 * @generated
	 * @ordered
	 */
	protected EList<Swimlane> ownedSwimlanes;
	/**
	 * The cached value of the '{@link #getOwnedProcess() <em>Owned Process</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalProcess> ownedProcess;
	/**
	 * The cached value of the '{@link #getAllocatorEntities() <em>Allocator Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatorEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> allocatorEntities;
	/**
	 * The cached value of the '{@link #getRealizingSystemFunctions() <em>Realizing System Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingSystemFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunction> realizingSystemFunctions;
	/**
	 * The cached value of the '{@link #getAllocatingRoles() <em>Allocating Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> allocatingRoles;
	/**
	 * The cached value of the '{@link #getContainedOperationalActivities() <em>Contained Operational Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedOperationalActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalActivity> containedOperationalActivities;
	/**
	 * The cached value of the '{@link #getChildrenOperationalActivities() <em>Children Operational Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenOperationalActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalActivity> childrenOperationalActivities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.OPERATIONAL_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalActivityPkg> getOwnedOperationalActivityPkgs() {
		if (ownedOperationalActivityPkgs == null) {
			ownedOperationalActivityPkgs = new EObjectContainmentEList.Resolving<OperationalActivityPkg>(OperationalActivityPkg.class, this, OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS);
		}
		return ownedOperationalActivityPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityAllocation> getActivityAllocations() {
		if (activityAllocations == null) {
			activityAllocations = new EObjectWithInverseResolvingEList<ActivityAllocation>(ActivityAllocation.class, this, OaPackage.OPERATIONAL_ACTIVITY__ACTIVITY_ALLOCATIONS, OaPackage.ACTIVITY_ALLOCATION__ACTIVITY);
		}
		return activityAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Swimlane> getOwnedSwimlanes() {
		if (ownedSwimlanes == null) {
			ownedSwimlanes = new EObjectResolvingEList<Swimlane>(Swimlane.class, this, OaPackage.OPERATIONAL_ACTIVITY__OWNED_SWIMLANES);
		}
		return ownedSwimlanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalProcess> getOwnedProcess() {
		if (ownedProcess == null) {
			ownedProcess = new EObjectResolvingEList<OperationalProcess>(OperationalProcess.class, this, OaPackage.OPERATIONAL_ACTIVITY__OWNED_PROCESS);
		}
		return ownedProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getAllocatorEntities() {
		if (allocatorEntities == null) {
			allocatorEntities = new EObjectWithInverseResolvingEList.ManyInverse<Entity>(Entity.class, this, OaPackage.OPERATIONAL_ACTIVITY__ALLOCATOR_ENTITIES, OaPackage.ENTITY__ALLOCATED_OPERATIONAL_ACTIVITIES);
		}
		return allocatorEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemFunction> getRealizingSystemFunctions() {
		if (realizingSystemFunctions == null) {
			realizingSystemFunctions = new EObjectWithInverseResolvingEList.ManyInverse<SystemFunction>(SystemFunction.class, this, OaPackage.OPERATIONAL_ACTIVITY__REALIZING_SYSTEM_FUNCTIONS, CtxPackage.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES);
		}
		return realizingSystemFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getAllocatingRoles() {
		if (allocatingRoles == null) {
			allocatingRoles = new EObjectResolvingEList<Role>(Role.class, this, OaPackage.OPERATIONAL_ACTIVITY__ALLOCATING_ROLES);
		}
		return allocatingRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalActivity> getContainedOperationalActivities() {
		if (containedOperationalActivities == null) {
			containedOperationalActivities = new EObjectResolvingEList<OperationalActivity>(OperationalActivity.class, this, OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_OPERATIONAL_ACTIVITIES);
		}
		return containedOperationalActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalActivity> getChildrenOperationalActivities() {
		if (childrenOperationalActivities == null) {
			childrenOperationalActivities = new EObjectResolvingEList<OperationalActivity>(OperationalActivity.class, this, OaPackage.OPERATIONAL_ACTIVITY__CHILDREN_OPERATIONAL_ACTIVITIES);
		}
		return childrenOperationalActivities;
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
			case OaPackage.OPERATIONAL_ACTIVITY__ACTIVITY_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityAllocations()).basicAdd(otherEnd, msgs);
			case OaPackage.OPERATIONAL_ACTIVITY__ALLOCATOR_ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatorEntities()).basicAdd(otherEnd, msgs);
			case OaPackage.OPERATIONAL_ACTIVITY__REALIZING_SYSTEM_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizingSystemFunctions()).basicAdd(otherEnd, msgs);
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
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				return ((InternalEList<?>)getOwnedOperationalActivityPkgs()).basicRemove(otherEnd, msgs);
			case OaPackage.OPERATIONAL_ACTIVITY__ACTIVITY_ALLOCATIONS:
				return ((InternalEList<?>)getActivityAllocations()).basicRemove(otherEnd, msgs);
			case OaPackage.OPERATIONAL_ACTIVITY__ALLOCATOR_ENTITIES:
				return ((InternalEList<?>)getAllocatorEntities()).basicRemove(otherEnd, msgs);
			case OaPackage.OPERATIONAL_ACTIVITY__REALIZING_SYSTEM_FUNCTIONS:
				return ((InternalEList<?>)getRealizingSystemFunctions()).basicRemove(otherEnd, msgs);
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
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				return getOwnedOperationalActivityPkgs();
			case OaPackage.OPERATIONAL_ACTIVITY__ACTIVITY_ALLOCATIONS:
				return getActivityAllocations();
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_SWIMLANES:
				return getOwnedSwimlanes();
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_PROCESS:
				return getOwnedProcess();
			case OaPackage.OPERATIONAL_ACTIVITY__ALLOCATOR_ENTITIES:
				return getAllocatorEntities();
			case OaPackage.OPERATIONAL_ACTIVITY__REALIZING_SYSTEM_FUNCTIONS:
				return getRealizingSystemFunctions();
			case OaPackage.OPERATIONAL_ACTIVITY__ALLOCATING_ROLES:
				return getAllocatingRoles();
			case OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_OPERATIONAL_ACTIVITIES:
				return getContainedOperationalActivities();
			case OaPackage.OPERATIONAL_ACTIVITY__CHILDREN_OPERATIONAL_ACTIVITIES:
				return getChildrenOperationalActivities();
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
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				getOwnedOperationalActivityPkgs().clear();
				getOwnedOperationalActivityPkgs().addAll((Collection<? extends OperationalActivityPkg>)newValue);
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
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				getOwnedOperationalActivityPkgs().clear();
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
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				return ownedOperationalActivityPkgs != null && !ownedOperationalActivityPkgs.isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__ACTIVITY_ALLOCATIONS:
				return activityAllocations != null && !activityAllocations.isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_SWIMLANES:
				return ownedSwimlanes != null && !ownedSwimlanes.isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_PROCESS:
				return ownedProcess != null && !ownedProcess.isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__ALLOCATOR_ENTITIES:
				return allocatorEntities != null && !allocatorEntities.isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__REALIZING_SYSTEM_FUNCTIONS:
				return realizingSystemFunctions != null && !realizingSystemFunctions.isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__ALLOCATING_ROLES:
				return allocatingRoles != null && !allocatingRoles.isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_OPERATIONAL_ACTIVITIES:
				return containedOperationalActivities != null && !containedOperationalActivities.isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__CHILDREN_OPERATIONAL_ACTIVITIES:
				return childrenOperationalActivities != null && !childrenOperationalActivities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalActivityImpl
