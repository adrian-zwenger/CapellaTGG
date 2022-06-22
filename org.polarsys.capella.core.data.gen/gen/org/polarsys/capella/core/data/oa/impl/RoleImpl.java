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

import org.polarsys.capella.core.data.information.impl.AbstractInstanceImpl;

import org.polarsys.capella.core.data.oa.ActivityAllocation;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.oa.OperationalActivity;
import org.polarsys.capella.core.data.oa.Role;
import org.polarsys.capella.core.data.oa.RoleAllocation;
import org.polarsys.capella.core.data.oa.RoleAssemblyUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.RoleImpl#getOwnedRoleAssemblyUsages <em>Owned Role Assembly Usages</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.RoleImpl#getOwnedActivityAllocations <em>Owned Activity Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.RoleImpl#getRoleAllocations <em>Role Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.RoleImpl#getActivityAllocations <em>Activity Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.RoleImpl#getAllocatingEntities <em>Allocating Entities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.RoleImpl#getAllocatedOperationalActivities <em>Allocated Operational Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends AbstractInstanceImpl implements Role {
	/**
	 * The cached value of the '{@link #getOwnedRoleAssemblyUsages() <em>Owned Role Assembly Usages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRoleAssemblyUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleAssemblyUsage> ownedRoleAssemblyUsages;

	/**
	 * The cached value of the '{@link #getOwnedActivityAllocations() <em>Owned Activity Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActivityAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityAllocation> ownedActivityAllocations;

	/**
	 * The cached value of the '{@link #getRoleAllocations() <em>Role Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleAllocation> roleAllocations;

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
	 * The cached value of the '{@link #getAllocatingEntities() <em>Allocating Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> allocatingEntities;

	/**
	 * The cached value of the '{@link #getAllocatedOperationalActivities() <em>Allocated Operational Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedOperationalActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalActivity> allocatedOperationalActivities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleAssemblyUsage> getOwnedRoleAssemblyUsages() {
		if (ownedRoleAssemblyUsages == null) {
			ownedRoleAssemblyUsages = new EObjectContainmentEList.Resolving<RoleAssemblyUsage>(RoleAssemblyUsage.class, this, OaPackage.ROLE__OWNED_ROLE_ASSEMBLY_USAGES);
		}
		return ownedRoleAssemblyUsages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityAllocation> getOwnedActivityAllocations() {
		if (ownedActivityAllocations == null) {
			ownedActivityAllocations = new EObjectContainmentEList.Resolving<ActivityAllocation>(ActivityAllocation.class, this, OaPackage.ROLE__OWNED_ACTIVITY_ALLOCATIONS);
		}
		return ownedActivityAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleAllocation> getRoleAllocations() {
		if (roleAllocations == null) {
			roleAllocations = new EObjectWithInverseResolvingEList<RoleAllocation>(RoleAllocation.class, this, OaPackage.ROLE__ROLE_ALLOCATIONS, OaPackage.ROLE_ALLOCATION__ROLE);
		}
		return roleAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityAllocation> getActivityAllocations() {
		if (activityAllocations == null) {
			activityAllocations = new EObjectWithInverseResolvingEList<ActivityAllocation>(ActivityAllocation.class, this, OaPackage.ROLE__ACTIVITY_ALLOCATIONS, OaPackage.ACTIVITY_ALLOCATION__ROLE);
		}
		return activityAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getAllocatingEntities() {
		if (allocatingEntities == null) {
			allocatingEntities = new EObjectResolvingEList<Entity>(Entity.class, this, OaPackage.ROLE__ALLOCATING_ENTITIES);
		}
		return allocatingEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalActivity> getAllocatedOperationalActivities() {
		if (allocatedOperationalActivities == null) {
			allocatedOperationalActivities = new EObjectResolvingEList<OperationalActivity>(OperationalActivity.class, this, OaPackage.ROLE__ALLOCATED_OPERATIONAL_ACTIVITIES);
		}
		return allocatedOperationalActivities;
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
			case OaPackage.ROLE__ROLE_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoleAllocations()).basicAdd(otherEnd, msgs);
			case OaPackage.ROLE__ACTIVITY_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityAllocations()).basicAdd(otherEnd, msgs);
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
			case OaPackage.ROLE__OWNED_ROLE_ASSEMBLY_USAGES:
				return ((InternalEList<?>)getOwnedRoleAssemblyUsages()).basicRemove(otherEnd, msgs);
			case OaPackage.ROLE__OWNED_ACTIVITY_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedActivityAllocations()).basicRemove(otherEnd, msgs);
			case OaPackage.ROLE__ROLE_ALLOCATIONS:
				return ((InternalEList<?>)getRoleAllocations()).basicRemove(otherEnd, msgs);
			case OaPackage.ROLE__ACTIVITY_ALLOCATIONS:
				return ((InternalEList<?>)getActivityAllocations()).basicRemove(otherEnd, msgs);
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
			case OaPackage.ROLE__OWNED_ROLE_ASSEMBLY_USAGES:
				return getOwnedRoleAssemblyUsages();
			case OaPackage.ROLE__OWNED_ACTIVITY_ALLOCATIONS:
				return getOwnedActivityAllocations();
			case OaPackage.ROLE__ROLE_ALLOCATIONS:
				return getRoleAllocations();
			case OaPackage.ROLE__ACTIVITY_ALLOCATIONS:
				return getActivityAllocations();
			case OaPackage.ROLE__ALLOCATING_ENTITIES:
				return getAllocatingEntities();
			case OaPackage.ROLE__ALLOCATED_OPERATIONAL_ACTIVITIES:
				return getAllocatedOperationalActivities();
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
			case OaPackage.ROLE__OWNED_ROLE_ASSEMBLY_USAGES:
				getOwnedRoleAssemblyUsages().clear();
				getOwnedRoleAssemblyUsages().addAll((Collection<? extends RoleAssemblyUsage>)newValue);
				return;
			case OaPackage.ROLE__OWNED_ACTIVITY_ALLOCATIONS:
				getOwnedActivityAllocations().clear();
				getOwnedActivityAllocations().addAll((Collection<? extends ActivityAllocation>)newValue);
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
			case OaPackage.ROLE__OWNED_ROLE_ASSEMBLY_USAGES:
				getOwnedRoleAssemblyUsages().clear();
				return;
			case OaPackage.ROLE__OWNED_ACTIVITY_ALLOCATIONS:
				getOwnedActivityAllocations().clear();
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
			case OaPackage.ROLE__OWNED_ROLE_ASSEMBLY_USAGES:
				return ownedRoleAssemblyUsages != null && !ownedRoleAssemblyUsages.isEmpty();
			case OaPackage.ROLE__OWNED_ACTIVITY_ALLOCATIONS:
				return ownedActivityAllocations != null && !ownedActivityAllocations.isEmpty();
			case OaPackage.ROLE__ROLE_ALLOCATIONS:
				return roleAllocations != null && !roleAllocations.isEmpty();
			case OaPackage.ROLE__ACTIVITY_ALLOCATIONS:
				return activityAllocations != null && !activityAllocations.isEmpty();
			case OaPackage.ROLE__ALLOCATING_ENTITIES:
				return allocatingEntities != null && !allocatingEntities.isEmpty();
			case OaPackage.ROLE__ALLOCATED_OPERATIONAL_ACTIVITIES:
				return allocatedOperationalActivities != null && !allocatedOperationalActivities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
