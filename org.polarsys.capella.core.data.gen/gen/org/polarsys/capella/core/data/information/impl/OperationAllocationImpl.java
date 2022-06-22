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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.Operation;
import org.polarsys.capella.core.data.information.OperationAllocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.OperationAllocationImpl#getAllocatedOperation <em>Allocated Operation</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.OperationAllocationImpl#getAllocatingOperation <em>Allocating Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationAllocationImpl extends AllocationImpl implements OperationAllocation {
	/**
	 * The cached value of the '{@link #getAllocatedOperation() <em>Allocated Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation allocatedOperation;
	/**
	 * The cached value of the '{@link #getAllocatingOperation() <em>Allocating Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation allocatingOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.OPERATION_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getAllocatedOperation() {
		if (allocatedOperation != null && allocatedOperation.eIsProxy()) {
			InternalEObject oldAllocatedOperation = (InternalEObject)allocatedOperation;
			allocatedOperation = (Operation)eResolveProxy(oldAllocatedOperation);
			if (allocatedOperation != oldAllocatedOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationPackage.OPERATION_ALLOCATION__ALLOCATED_OPERATION, oldAllocatedOperation, allocatedOperation));
			}
		}
		return allocatedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetAllocatedOperation() {
		return allocatedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getAllocatingOperation() {
		if (allocatingOperation != null && allocatingOperation.eIsProxy()) {
			InternalEObject oldAllocatingOperation = (InternalEObject)allocatingOperation;
			allocatingOperation = (Operation)eResolveProxy(oldAllocatingOperation);
			if (allocatingOperation != oldAllocatingOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationPackage.OPERATION_ALLOCATION__ALLOCATING_OPERATION, oldAllocatingOperation, allocatingOperation));
			}
		}
		return allocatingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetAllocatingOperation() {
		return allocatingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InformationPackage.OPERATION_ALLOCATION__ALLOCATED_OPERATION:
				if (resolve) return getAllocatedOperation();
				return basicGetAllocatedOperation();
			case InformationPackage.OPERATION_ALLOCATION__ALLOCATING_OPERATION:
				if (resolve) return getAllocatingOperation();
				return basicGetAllocatingOperation();
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
			case InformationPackage.OPERATION_ALLOCATION__ALLOCATED_OPERATION:
				return allocatedOperation != null;
			case InformationPackage.OPERATION_ALLOCATION__ALLOCATING_OPERATION:
				return allocatingOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationAllocationImpl
