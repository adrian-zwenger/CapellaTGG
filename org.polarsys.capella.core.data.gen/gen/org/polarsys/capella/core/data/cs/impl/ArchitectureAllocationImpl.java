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

import org.polarsys.capella.core.data.cs.ArchitectureAllocation;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.CsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ArchitectureAllocationImpl#getAllocatedArchitecture <em>Allocated Architecture</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ArchitectureAllocationImpl#getAllocatingArchitecture <em>Allocating Architecture</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArchitectureAllocationImpl extends AllocationImpl implements ArchitectureAllocation {
	/**
	 * The cached value of the '{@link #getAllocatedArchitecture() <em>Allocated Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedArchitecture()
	 * @generated
	 * @ordered
	 */
	protected BlockArchitecture allocatedArchitecture;
	/**
	 * The cached value of the '{@link #getAllocatingArchitecture() <em>Allocating Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingArchitecture()
	 * @generated
	 * @ordered
	 */
	protected BlockArchitecture allocatingArchitecture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.ARCHITECTURE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockArchitecture getAllocatedArchitecture() {
		if (allocatedArchitecture != null && allocatedArchitecture.eIsProxy()) {
			InternalEObject oldAllocatedArchitecture = (InternalEObject)allocatedArchitecture;
			allocatedArchitecture = (BlockArchitecture)eResolveProxy(oldAllocatedArchitecture);
			if (allocatedArchitecture != oldAllocatedArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATED_ARCHITECTURE, oldAllocatedArchitecture, allocatedArchitecture));
			}
		}
		return allocatedArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockArchitecture basicGetAllocatedArchitecture() {
		return allocatedArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatedArchitecture(BlockArchitecture newAllocatedArchitecture, NotificationChain msgs) {
		BlockArchitecture oldAllocatedArchitecture = allocatedArchitecture;
		allocatedArchitecture = newAllocatedArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATED_ARCHITECTURE, oldAllocatedArchitecture, newAllocatedArchitecture);
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
	public BlockArchitecture getAllocatingArchitecture() {
		if (allocatingArchitecture != null && allocatingArchitecture.eIsProxy()) {
			InternalEObject oldAllocatingArchitecture = (InternalEObject)allocatingArchitecture;
			allocatingArchitecture = (BlockArchitecture)eResolveProxy(oldAllocatingArchitecture);
			if (allocatingArchitecture != oldAllocatingArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATING_ARCHITECTURE, oldAllocatingArchitecture, allocatingArchitecture));
			}
		}
		return allocatingArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockArchitecture basicGetAllocatingArchitecture() {
		return allocatingArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatingArchitecture(BlockArchitecture newAllocatingArchitecture, NotificationChain msgs) {
		BlockArchitecture oldAllocatingArchitecture = allocatingArchitecture;
		allocatingArchitecture = newAllocatingArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATING_ARCHITECTURE, oldAllocatingArchitecture, newAllocatingArchitecture);
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
			case CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATED_ARCHITECTURE:
				if (allocatedArchitecture != null)
					msgs = ((InternalEObject)allocatedArchitecture).eInverseRemove(this, CsPackage.BLOCK_ARCHITECTURE__PROVISIONING_ARCHITECTURE_ALLOCATIONS, BlockArchitecture.class, msgs);
				return basicSetAllocatedArchitecture((BlockArchitecture)otherEnd, msgs);
			case CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATING_ARCHITECTURE:
				if (allocatingArchitecture != null)
					msgs = ((InternalEObject)allocatingArchitecture).eInverseRemove(this, CsPackage.BLOCK_ARCHITECTURE__PROVISIONED_ARCHITECTURE_ALLOCATIONS, BlockArchitecture.class, msgs);
				return basicSetAllocatingArchitecture((BlockArchitecture)otherEnd, msgs);
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
			case CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATED_ARCHITECTURE:
				return basicSetAllocatedArchitecture(null, msgs);
			case CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATING_ARCHITECTURE:
				return basicSetAllocatingArchitecture(null, msgs);
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
			case CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATED_ARCHITECTURE:
				if (resolve) return getAllocatedArchitecture();
				return basicGetAllocatedArchitecture();
			case CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATING_ARCHITECTURE:
				if (resolve) return getAllocatingArchitecture();
				return basicGetAllocatingArchitecture();
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
			case CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATED_ARCHITECTURE:
				return allocatedArchitecture != null;
			case CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATING_ARCHITECTURE:
				return allocatingArchitecture != null;
		}
		return super.eIsSet(featureID);
	}

} //ArchitectureAllocationImpl
