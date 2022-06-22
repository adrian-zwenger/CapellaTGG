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
package org.polarsys.capella.core.data.information.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.Port;
import org.polarsys.capella.core.data.information.PortAllocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.PortAllocationImpl#getAllocatedPort <em>Allocated Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.PortAllocationImpl#getAllocatingPort <em>Allocating Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortAllocationImpl extends AllocationImpl implements PortAllocation {
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
	protected PortAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.PORT_ALLOCATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationPackage.PORT_ALLOCATION__ALLOCATED_PORT, oldAllocatedPort, allocatedPort));
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
	public NotificationChain basicSetAllocatedPort(Port newAllocatedPort, NotificationChain msgs) {
		Port oldAllocatedPort = allocatedPort;
		allocatedPort = newAllocatedPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InformationPackage.PORT_ALLOCATION__ALLOCATED_PORT, oldAllocatedPort, newAllocatedPort);
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
	public Port getAllocatingPort() {
		if (allocatingPort != null && allocatingPort.eIsProxy()) {
			InternalEObject oldAllocatingPort = (InternalEObject)allocatingPort;
			allocatingPort = (Port)eResolveProxy(oldAllocatingPort);
			if (allocatingPort != oldAllocatingPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationPackage.PORT_ALLOCATION__ALLOCATING_PORT, oldAllocatingPort, allocatingPort));
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
	public NotificationChain basicSetAllocatingPort(Port newAllocatingPort, NotificationChain msgs) {
		Port oldAllocatingPort = allocatingPort;
		allocatingPort = newAllocatingPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InformationPackage.PORT_ALLOCATION__ALLOCATING_PORT, oldAllocatingPort, newAllocatingPort);
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
			case InformationPackage.PORT_ALLOCATION__ALLOCATED_PORT:
				if (allocatedPort != null)
					msgs = ((InternalEObject)allocatedPort).eInverseRemove(this, InformationPackage.PORT__INCOMING_PORT_ALLOCATIONS, Port.class, msgs);
				return basicSetAllocatedPort((Port)otherEnd, msgs);
			case InformationPackage.PORT_ALLOCATION__ALLOCATING_PORT:
				if (allocatingPort != null)
					msgs = ((InternalEObject)allocatingPort).eInverseRemove(this, InformationPackage.PORT__OUTGOING_PORT_ALLOCATIONS, Port.class, msgs);
				return basicSetAllocatingPort((Port)otherEnd, msgs);
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
			case InformationPackage.PORT_ALLOCATION__ALLOCATED_PORT:
				return basicSetAllocatedPort(null, msgs);
			case InformationPackage.PORT_ALLOCATION__ALLOCATING_PORT:
				return basicSetAllocatingPort(null, msgs);
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
			case InformationPackage.PORT_ALLOCATION__ALLOCATED_PORT:
				if (resolve) return getAllocatedPort();
				return basicGetAllocatedPort();
			case InformationPackage.PORT_ALLOCATION__ALLOCATING_PORT:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InformationPackage.PORT_ALLOCATION__ALLOCATED_PORT:
				return allocatedPort != null;
			case InformationPackage.PORT_ALLOCATION__ALLOCATING_PORT:
				return allocatingPort != null;
		}
		return super.eIsSet(featureID);
	}

} //PortAllocationImpl
