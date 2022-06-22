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

import modellingcore.AbstractInformationFlow;
import modellingcore.InformationsExchanger;
import modellingcore.ModellingcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.Involvement;

import org.polarsys.capella.core.data.ctx.SystemComponent;

import org.polarsys.capella.core.data.oa.CommunicationMean;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.core.data.oa.Location;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.oa.OperationalActivity;
import org.polarsys.capella.core.data.oa.OperationalCapability;
import org.polarsys.capella.core.data.oa.OrganisationalUnitComposition;
import org.polarsys.capella.core.data.oa.Role;
import org.polarsys.capella.core.data.oa.RoleAllocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getIncomingInformationFlows <em>Incoming Information Flows</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getOutgoingInformationFlows <em>Outgoing Information Flows</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getInformationFlows <em>Information Flows</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getRoleAllocations <em>Role Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getOrganisationalUnitMemberships <em>Organisational Unit Memberships</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getActualLocation <em>Actual Location</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getSubEntities <em>Sub Entities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getOwnedEntities <em>Owned Entities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getOwnedCommunicationMeans <em>Owned Communication Means</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getOwnedRoleAllocations <em>Owned Role Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getAllocatedOperationalActivities <em>Allocated Operational Activities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getAllocatedRoles <em>Allocated Roles</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getInvolvingOperationalCapabilities <em>Involving Operational Capabilities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.EntityImpl#getRealizingSystemComponents <em>Realizing System Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends AbstractConceptItemImpl implements Entity {
	/**
	 * The cached value of the '{@link #getIncomingInformationFlows() <em>Incoming Information Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingInformationFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInformationFlow> incomingInformationFlows;

	/**
	 * The cached value of the '{@link #getOutgoingInformationFlows() <em>Outgoing Information Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingInformationFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInformationFlow> outgoingInformationFlows;

	/**
	 * The cached value of the '{@link #getInformationFlows() <em>Information Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInformationFlow> informationFlows;

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
	 * The cached value of the '{@link #getRoleAllocations() <em>Role Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleAllocation> roleAllocations;

	/**
	 * The cached value of the '{@link #getOrganisationalUnitMemberships() <em>Organisational Unit Memberships</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationalUnitMemberships()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganisationalUnitComposition> organisationalUnitMemberships;

	/**
	 * The cached value of the '{@link #getActualLocation() <em>Actual Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualLocation()
	 * @generated
	 * @ordered
	 */
	protected Location actualLocation;

	/**
	 * The cached value of the '{@link #getSubEntities() <em>Sub Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> subEntities;

	/**
	 * The cached value of the '{@link #getOwnedEntities() <em>Owned Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> ownedEntities;

	/**
	 * The cached value of the '{@link #getOwnedCommunicationMeans() <em>Owned Communication Means</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCommunicationMeans()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationMean> ownedCommunicationMeans;

	/**
	 * The cached value of the '{@link #getOwnedRoleAllocations() <em>Owned Role Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRoleAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleAllocation> ownedRoleAllocations;

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
	 * The cached value of the '{@link #getAllocatedRoles() <em>Allocated Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> allocatedRoles;

	/**
	 * The cached value of the '{@link #getInvolvingOperationalCapabilities() <em>Involving Operational Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvingOperationalCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalCapability> involvingOperationalCapabilities;

	/**
	 * The cached value of the '{@link #getRealizingSystemComponents() <em>Realizing System Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingSystemComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemComponent> realizingSystemComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractInformationFlow> getIncomingInformationFlows() {
		if (incomingInformationFlows == null) {
			incomingInformationFlows = new EObjectResolvingEList<AbstractInformationFlow>(AbstractInformationFlow.class, this, OaPackage.ENTITY__INCOMING_INFORMATION_FLOWS);
		}
		return incomingInformationFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractInformationFlow> getOutgoingInformationFlows() {
		if (outgoingInformationFlows == null) {
			outgoingInformationFlows = new EObjectResolvingEList<AbstractInformationFlow>(AbstractInformationFlow.class, this, OaPackage.ENTITY__OUTGOING_INFORMATION_FLOWS);
		}
		return outgoingInformationFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractInformationFlow> getInformationFlows() {
		if (informationFlows == null) {
			informationFlows = new EObjectResolvingEList<AbstractInformationFlow>(AbstractInformationFlow.class, this, OaPackage.ENTITY__INFORMATION_FLOWS);
		}
		return informationFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Involvement> getInvolvingInvolvements() {
		if (involvingInvolvements == null) {
			involvingInvolvements = new EObjectResolvingEList<Involvement>(Involvement.class, this, OaPackage.ENTITY__INVOLVING_INVOLVEMENTS);
		}
		return involvingInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleAllocation> getRoleAllocations() {
		if (roleAllocations == null) {
			roleAllocations = new EObjectWithInverseResolvingEList<RoleAllocation>(RoleAllocation.class, this, OaPackage.ENTITY__ROLE_ALLOCATIONS, OaPackage.ROLE_ALLOCATION__ENTITY);
		}
		return roleAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrganisationalUnitComposition> getOrganisationalUnitMemberships() {
		if (organisationalUnitMemberships == null) {
			organisationalUnitMemberships = new EObjectResolvingEList<OrganisationalUnitComposition>(OrganisationalUnitComposition.class, this, OaPackage.ENTITY__ORGANISATIONAL_UNIT_MEMBERSHIPS);
		}
		return organisationalUnitMemberships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getActualLocation() {
		if (actualLocation != null && actualLocation.eIsProxy()) {
			InternalEObject oldActualLocation = (InternalEObject)actualLocation;
			actualLocation = (Location)eResolveProxy(oldActualLocation);
			if (actualLocation != oldActualLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OaPackage.ENTITY__ACTUAL_LOCATION, oldActualLocation, actualLocation));
			}
		}
		return actualLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetActualLocation() {
		return actualLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualLocation(Location newActualLocation) {
		Location oldActualLocation = actualLocation;
		actualLocation = newActualLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.ENTITY__ACTUAL_LOCATION, oldActualLocation, actualLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getSubEntities() {
		if (subEntities == null) {
			subEntities = new EObjectResolvingEList<Entity>(Entity.class, this, OaPackage.ENTITY__SUB_ENTITIES);
		}
		return subEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getOwnedEntities() {
		if (ownedEntities == null) {
			ownedEntities = new EObjectContainmentEList.Resolving<Entity>(Entity.class, this, OaPackage.ENTITY__OWNED_ENTITIES);
		}
		return ownedEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationMean> getOwnedCommunicationMeans() {
		if (ownedCommunicationMeans == null) {
			ownedCommunicationMeans = new EObjectContainmentEList.Resolving<CommunicationMean>(CommunicationMean.class, this, OaPackage.ENTITY__OWNED_COMMUNICATION_MEANS);
		}
		return ownedCommunicationMeans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleAllocation> getOwnedRoleAllocations() {
		if (ownedRoleAllocations == null) {
			ownedRoleAllocations = new EObjectContainmentEList.Resolving<RoleAllocation>(RoleAllocation.class, this, OaPackage.ENTITY__OWNED_ROLE_ALLOCATIONS);
		}
		return ownedRoleAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalActivity> getAllocatedOperationalActivities() {
		if (allocatedOperationalActivities == null) {
			allocatedOperationalActivities = new EObjectWithInverseResolvingEList.ManyInverse<OperationalActivity>(OperationalActivity.class, this, OaPackage.ENTITY__ALLOCATED_OPERATIONAL_ACTIVITIES, OaPackage.OPERATIONAL_ACTIVITY__ALLOCATOR_ENTITIES);
		}
		return allocatedOperationalActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getAllocatedRoles() {
		if (allocatedRoles == null) {
			allocatedRoles = new EObjectResolvingEList<Role>(Role.class, this, OaPackage.ENTITY__ALLOCATED_ROLES);
		}
		return allocatedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalCapability> getInvolvingOperationalCapabilities() {
		if (involvingOperationalCapabilities == null) {
			involvingOperationalCapabilities = new EObjectResolvingEList<OperationalCapability>(OperationalCapability.class, this, OaPackage.ENTITY__INVOLVING_OPERATIONAL_CAPABILITIES);
		}
		return involvingOperationalCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemComponent> getRealizingSystemComponents() {
		if (realizingSystemComponents == null) {
			realizingSystemComponents = new EObjectResolvingEList<SystemComponent>(SystemComponent.class, this, OaPackage.ENTITY__REALIZING_SYSTEM_COMPONENTS);
		}
		return realizingSystemComponents;
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
			case OaPackage.ENTITY__ROLE_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoleAllocations()).basicAdd(otherEnd, msgs);
			case OaPackage.ENTITY__ALLOCATED_OPERATIONAL_ACTIVITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatedOperationalActivities()).basicAdd(otherEnd, msgs);
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
			case OaPackage.ENTITY__ROLE_ALLOCATIONS:
				return ((InternalEList<?>)getRoleAllocations()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__OWNED_ENTITIES:
				return ((InternalEList<?>)getOwnedEntities()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__OWNED_COMMUNICATION_MEANS:
				return ((InternalEList<?>)getOwnedCommunicationMeans()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__OWNED_ROLE_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedRoleAllocations()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__ALLOCATED_OPERATIONAL_ACTIVITIES:
				return ((InternalEList<?>)getAllocatedOperationalActivities()).basicRemove(otherEnd, msgs);
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
			case OaPackage.ENTITY__INCOMING_INFORMATION_FLOWS:
				return getIncomingInformationFlows();
			case OaPackage.ENTITY__OUTGOING_INFORMATION_FLOWS:
				return getOutgoingInformationFlows();
			case OaPackage.ENTITY__INFORMATION_FLOWS:
				return getInformationFlows();
			case OaPackage.ENTITY__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case OaPackage.ENTITY__ROLE_ALLOCATIONS:
				return getRoleAllocations();
			case OaPackage.ENTITY__ORGANISATIONAL_UNIT_MEMBERSHIPS:
				return getOrganisationalUnitMemberships();
			case OaPackage.ENTITY__ACTUAL_LOCATION:
				if (resolve) return getActualLocation();
				return basicGetActualLocation();
			case OaPackage.ENTITY__SUB_ENTITIES:
				return getSubEntities();
			case OaPackage.ENTITY__OWNED_ENTITIES:
				return getOwnedEntities();
			case OaPackage.ENTITY__OWNED_COMMUNICATION_MEANS:
				return getOwnedCommunicationMeans();
			case OaPackage.ENTITY__OWNED_ROLE_ALLOCATIONS:
				return getOwnedRoleAllocations();
			case OaPackage.ENTITY__ALLOCATED_OPERATIONAL_ACTIVITIES:
				return getAllocatedOperationalActivities();
			case OaPackage.ENTITY__ALLOCATED_ROLES:
				return getAllocatedRoles();
			case OaPackage.ENTITY__INVOLVING_OPERATIONAL_CAPABILITIES:
				return getInvolvingOperationalCapabilities();
			case OaPackage.ENTITY__REALIZING_SYSTEM_COMPONENTS:
				return getRealizingSystemComponents();
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
			case OaPackage.ENTITY__INCOMING_INFORMATION_FLOWS:
				getIncomingInformationFlows().clear();
				getIncomingInformationFlows().addAll((Collection<? extends AbstractInformationFlow>)newValue);
				return;
			case OaPackage.ENTITY__ORGANISATIONAL_UNIT_MEMBERSHIPS:
				getOrganisationalUnitMemberships().clear();
				getOrganisationalUnitMemberships().addAll((Collection<? extends OrganisationalUnitComposition>)newValue);
				return;
			case OaPackage.ENTITY__ACTUAL_LOCATION:
				setActualLocation((Location)newValue);
				return;
			case OaPackage.ENTITY__OWNED_ENTITIES:
				getOwnedEntities().clear();
				getOwnedEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case OaPackage.ENTITY__OWNED_COMMUNICATION_MEANS:
				getOwnedCommunicationMeans().clear();
				getOwnedCommunicationMeans().addAll((Collection<? extends CommunicationMean>)newValue);
				return;
			case OaPackage.ENTITY__OWNED_ROLE_ALLOCATIONS:
				getOwnedRoleAllocations().clear();
				getOwnedRoleAllocations().addAll((Collection<? extends RoleAllocation>)newValue);
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
			case OaPackage.ENTITY__INCOMING_INFORMATION_FLOWS:
				getIncomingInformationFlows().clear();
				return;
			case OaPackage.ENTITY__ORGANISATIONAL_UNIT_MEMBERSHIPS:
				getOrganisationalUnitMemberships().clear();
				return;
			case OaPackage.ENTITY__ACTUAL_LOCATION:
				setActualLocation((Location)null);
				return;
			case OaPackage.ENTITY__OWNED_ENTITIES:
				getOwnedEntities().clear();
				return;
			case OaPackage.ENTITY__OWNED_COMMUNICATION_MEANS:
				getOwnedCommunicationMeans().clear();
				return;
			case OaPackage.ENTITY__OWNED_ROLE_ALLOCATIONS:
				getOwnedRoleAllocations().clear();
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
			case OaPackage.ENTITY__INCOMING_INFORMATION_FLOWS:
				return incomingInformationFlows != null && !incomingInformationFlows.isEmpty();
			case OaPackage.ENTITY__OUTGOING_INFORMATION_FLOWS:
				return outgoingInformationFlows != null && !outgoingInformationFlows.isEmpty();
			case OaPackage.ENTITY__INFORMATION_FLOWS:
				return informationFlows != null && !informationFlows.isEmpty();
			case OaPackage.ENTITY__INVOLVING_INVOLVEMENTS:
				return involvingInvolvements != null && !involvingInvolvements.isEmpty();
			case OaPackage.ENTITY__ROLE_ALLOCATIONS:
				return roleAllocations != null && !roleAllocations.isEmpty();
			case OaPackage.ENTITY__ORGANISATIONAL_UNIT_MEMBERSHIPS:
				return organisationalUnitMemberships != null && !organisationalUnitMemberships.isEmpty();
			case OaPackage.ENTITY__ACTUAL_LOCATION:
				return actualLocation != null;
			case OaPackage.ENTITY__SUB_ENTITIES:
				return subEntities != null && !subEntities.isEmpty();
			case OaPackage.ENTITY__OWNED_ENTITIES:
				return ownedEntities != null && !ownedEntities.isEmpty();
			case OaPackage.ENTITY__OWNED_COMMUNICATION_MEANS:
				return ownedCommunicationMeans != null && !ownedCommunicationMeans.isEmpty();
			case OaPackage.ENTITY__OWNED_ROLE_ALLOCATIONS:
				return ownedRoleAllocations != null && !ownedRoleAllocations.isEmpty();
			case OaPackage.ENTITY__ALLOCATED_OPERATIONAL_ACTIVITIES:
				return allocatedOperationalActivities != null && !allocatedOperationalActivities.isEmpty();
			case OaPackage.ENTITY__ALLOCATED_ROLES:
				return allocatedRoles != null && !allocatedRoles.isEmpty();
			case OaPackage.ENTITY__INVOLVING_OPERATIONAL_CAPABILITIES:
				return involvingOperationalCapabilities != null && !involvingOperationalCapabilities.isEmpty();
			case OaPackage.ENTITY__REALIZING_SYSTEM_COMPONENTS:
				return realizingSystemComponents != null && !realizingSystemComponents.isEmpty();
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
		if (baseClass == InformationsExchanger.class) {
			switch (derivedFeatureID) {
				case OaPackage.ENTITY__INCOMING_INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS;
				case OaPackage.ENTITY__OUTGOING_INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS;
				case OaPackage.ENTITY__INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case OaPackage.ENTITY__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
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
		if (baseClass == InformationsExchanger.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS: return OaPackage.ENTITY__INCOMING_INFORMATION_FLOWS;
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS: return OaPackage.ENTITY__OUTGOING_INFORMATION_FLOWS;
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS: return OaPackage.ENTITY__INFORMATION_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return OaPackage.ENTITY__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EntityImpl
