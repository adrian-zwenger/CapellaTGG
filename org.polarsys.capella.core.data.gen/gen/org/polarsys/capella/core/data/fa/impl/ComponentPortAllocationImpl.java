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
package org.polarsys.capella.core.data.fa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

import org.polarsys.capella.core.data.fa.ComponentPortAllocation;
import org.polarsys.capella.core.data.fa.ComponentPortAllocationEnd;
import org.polarsys.capella.core.data.fa.FaPackage;

import org.polarsys.capella.core.data.information.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Port Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentPortAllocationImpl#getOwnedComponentPortAllocationEnds <em>Owned Component Port Allocation Ends</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentPortAllocationImpl#getAllocatedPort <em>Allocated Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentPortAllocationImpl#getAllocatingPort <em>Allocating Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentPortAllocationImpl extends AllocationImpl implements ComponentPortAllocation {
	/**
	 * The cached value of the '{@link #getOwnedComponentPortAllocationEnds() <em>Owned Component Port Allocation Ends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentPortAllocationEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPortAllocationEnd> ownedComponentPortAllocationEnds;

	/**
	 * The cached value of the '{@link #getAllocatedPort() <em>Allocated Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedPort()
	 * @generated
	 * @ordered
	 */
	protected Port allocatedPort;
	/**
	 * The cached value of the '{@link #getAllocatingPort() <em>Allocating Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingPort()
	 * @generated
	 * @ordered
	 */
	protected Port allocatingPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPortAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.COMPONENT_PORT_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentPortAllocationEnd> getOwnedComponentPortAllocationEnds() {
		if (ownedComponentPortAllocationEnds == null) {
			ownedComponentPortAllocationEnds = new EObjectContainmentEList.Resolving<ComponentPortAllocationEnd>(ComponentPortAllocationEnd.class, this, FaPackage.COMPONENT_PORT_ALLOCATION__OWNED_COMPONENT_PORT_ALLOCATION_ENDS);
		}
		return ownedComponentPortAllocationEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getAllocatedPort() {
		if (allocatedPort != null && allocatedPort.eIsProxy()) {
			InternalEObject oldAllocatedPort = (InternalEObject)allocatedPort;
			allocatedPort = (Port)eResolveProxy(oldAllocatedPort);
			if (allocatedPort != oldAllocatedPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_PORT_ALLOCATION__ALLOCATED_PORT, oldAllocatedPort, allocatedPort));
			}
		}
		return allocatedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetAllocatedPort() {
		return allocatedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getAllocatingPort() {
		if (allocatingPort != null && allocatingPort.eIsProxy()) {
			InternalEObject oldAllocatingPort = (InternalEObject)allocatingPort;
			allocatingPort = (Port)eResolveProxy(oldAllocatingPort);
			if (allocatingPort != oldAllocatingPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_PORT_ALLOCATION__ALLOCATING_PORT, oldAllocatingPort, allocatingPort));
			}
		}
		return allocatingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetAllocatingPort() {
		return allocatingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.COMPONENT_PORT_ALLOCATION__OWNED_COMPONENT_PORT_ALLOCATION_ENDS:
				return ((InternalEList<?>)getOwnedComponentPortAllocationEnds()).basicRemove(otherEnd, msgs);
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
			case FaPackage.COMPONENT_PORT_ALLOCATION__OWNED_COMPONENT_PORT_ALLOCATION_ENDS:
				return getOwnedComponentPortAllocationEnds();
			case FaPackage.COMPONENT_PORT_ALLOCATION__ALLOCATED_PORT:
				if (resolve) return getAllocatedPort();
				return basicGetAllocatedPort();
			case FaPackage.COMPONENT_PORT_ALLOCATION__ALLOCATING_PORT:
				if (resolve) return getAllocatingPort();
				return basicGetAllocatingPort();
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
			case FaPackage.COMPONENT_PORT_ALLOCATION__OWNED_COMPONENT_PORT_ALLOCATION_ENDS:
				getOwnedComponentPortAllocationEnds().clear();
				getOwnedComponentPortAllocationEnds().addAll((Collection<? extends ComponentPortAllocationEnd>)newValue);
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
			case FaPackage.COMPONENT_PORT_ALLOCATION__OWNED_COMPONENT_PORT_ALLOCATION_ENDS:
				getOwnedComponentPortAllocationEnds().clear();
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
			case FaPackage.COMPONENT_PORT_ALLOCATION__OWNED_COMPONENT_PORT_ALLOCATION_ENDS:
				return ownedComponentPortAllocationEnds != null && !ownedComponentPortAllocationEnds.isEmpty();
			case FaPackage.COMPONENT_PORT_ALLOCATION__ALLOCATED_PORT:
				return allocatedPort != null;
			case FaPackage.COMPONENT_PORT_ALLOCATION__ALLOCATING_PORT:
				return allocatingPort != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentPortAllocationImpl
