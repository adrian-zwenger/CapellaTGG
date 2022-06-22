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
package org.polarsys.capella.core.data.cs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.cs.InterfaceAllocation;
import org.polarsys.capella.core.data.cs.InterfaceAllocator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceAllocationImpl#getAllocatedInterface <em>Allocated Interface</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceAllocationImpl#getAllocatingInterfaceAllocator <em>Allocating Interface Allocator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InterfaceAllocationImpl extends AllocationImpl implements InterfaceAllocation {
	/**
	 * The cached value of the '{@link #getAllocatedInterface() <em>Allocated Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface allocatedInterface;
	/**
	 * The cached value of the '{@link #getAllocatingInterfaceAllocator() <em>Allocating Interface Allocator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingInterfaceAllocator()
	 * @generated
	 * @ordered
	 */
	protected InterfaceAllocator allocatingInterfaceAllocator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.INTERFACE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface getAllocatedInterface() {
		if (allocatedInterface != null && allocatedInterface.eIsProxy()) {
			InternalEObject oldAllocatedInterface = (InternalEObject)allocatedInterface;
			allocatedInterface = (Interface)eResolveProxy(oldAllocatedInterface);
			if (allocatedInterface != oldAllocatedInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.INTERFACE_ALLOCATION__ALLOCATED_INTERFACE, oldAllocatedInterface, allocatedInterface));
			}
		}
		return allocatedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetAllocatedInterface() {
		return allocatedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatedInterface(Interface newAllocatedInterface, NotificationChain msgs) {
		Interface oldAllocatedInterface = allocatedInterface;
		allocatedInterface = newAllocatedInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.INTERFACE_ALLOCATION__ALLOCATED_INTERFACE, oldAllocatedInterface, newAllocatedInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceAllocator getAllocatingInterfaceAllocator() {
		if (allocatingInterfaceAllocator != null && allocatingInterfaceAllocator.eIsProxy()) {
			InternalEObject oldAllocatingInterfaceAllocator = (InternalEObject)allocatingInterfaceAllocator;
			allocatingInterfaceAllocator = (InterfaceAllocator)eResolveProxy(oldAllocatingInterfaceAllocator);
			if (allocatingInterfaceAllocator != oldAllocatingInterfaceAllocator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.INTERFACE_ALLOCATION__ALLOCATING_INTERFACE_ALLOCATOR, oldAllocatingInterfaceAllocator, allocatingInterfaceAllocator));
			}
		}
		return allocatingInterfaceAllocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceAllocator basicGetAllocatingInterfaceAllocator() {
		return allocatingInterfaceAllocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatingInterfaceAllocator(InterfaceAllocator newAllocatingInterfaceAllocator, NotificationChain msgs) {
		InterfaceAllocator oldAllocatingInterfaceAllocator = allocatingInterfaceAllocator;
		allocatingInterfaceAllocator = newAllocatingInterfaceAllocator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.INTERFACE_ALLOCATION__ALLOCATING_INTERFACE_ALLOCATOR, oldAllocatingInterfaceAllocator, newAllocatingInterfaceAllocator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.INTERFACE_ALLOCATION__ALLOCATED_INTERFACE:
				if (allocatedInterface != null)
					msgs = ((InternalEObject)allocatedInterface).eInverseRemove(this, CsPackage.INTERFACE__PROVISIONING_INTERFACE_ALLOCATIONS, Interface.class, msgs);
				return basicSetAllocatedInterface((Interface)otherEnd, msgs);
			case CsPackage.INTERFACE_ALLOCATION__ALLOCATING_INTERFACE_ALLOCATOR:
				if (allocatingInterfaceAllocator != null)
					msgs = ((InternalEObject)allocatingInterfaceAllocator).eInverseRemove(this, CsPackage.INTERFACE_ALLOCATOR__PROVISIONED_INTERFACE_ALLOCATIONS, InterfaceAllocator.class, msgs);
				return basicSetAllocatingInterfaceAllocator((InterfaceAllocator)otherEnd, msgs);
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
			case CsPackage.INTERFACE_ALLOCATION__ALLOCATED_INTERFACE:
				return basicSetAllocatedInterface(null, msgs);
			case CsPackage.INTERFACE_ALLOCATION__ALLOCATING_INTERFACE_ALLOCATOR:
				return basicSetAllocatingInterfaceAllocator(null, msgs);
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
			case CsPackage.INTERFACE_ALLOCATION__ALLOCATED_INTERFACE:
				if (resolve) return getAllocatedInterface();
				return basicGetAllocatedInterface();
			case CsPackage.INTERFACE_ALLOCATION__ALLOCATING_INTERFACE_ALLOCATOR:
				if (resolve) return getAllocatingInterfaceAllocator();
				return basicGetAllocatingInterfaceAllocator();
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
			case CsPackage.INTERFACE_ALLOCATION__ALLOCATED_INTERFACE:
				return allocatedInterface != null;
			case CsPackage.INTERFACE_ALLOCATION__ALLOCATING_INTERFACE_ALLOCATOR:
				return allocatingInterfaceAllocator != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceAllocationImpl
