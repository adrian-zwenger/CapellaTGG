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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.FunctionRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionRealizationImpl#getAllocatedFunction <em>Allocated Function</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionRealizationImpl#getAllocatingFunction <em>Allocating Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionRealizationImpl extends AllocationImpl implements FunctionRealization {
	/**
	 * The cached value of the '{@link #getAllocatedFunction() <em>Allocated Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedFunction()
	 * @generated
	 * @ordered
	 */
	protected AbstractFunction allocatedFunction;
	/**
	 * The cached value of the '{@link #getAllocatingFunction() <em>Allocating Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingFunction()
	 * @generated
	 * @ordered
	 */
	protected AbstractFunction allocatingFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTION_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractFunction getAllocatedFunction() {
		if (allocatedFunction != null && allocatedFunction.eIsProxy()) {
			InternalEObject oldAllocatedFunction = (InternalEObject)allocatedFunction;
			allocatedFunction = (AbstractFunction)eResolveProxy(oldAllocatedFunction);
			if (allocatedFunction != oldAllocatedFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTION_REALIZATION__ALLOCATED_FUNCTION, oldAllocatedFunction, allocatedFunction));
			}
		}
		return allocatedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunction basicGetAllocatedFunction() {
		return allocatedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatedFunction(AbstractFunction newAllocatedFunction, NotificationChain msgs) {
		AbstractFunction oldAllocatedFunction = allocatedFunction;
		allocatedFunction = newAllocatedFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTION_REALIZATION__ALLOCATED_FUNCTION, oldAllocatedFunction, newAllocatedFunction);
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
	public AbstractFunction getAllocatingFunction() {
		if (allocatingFunction != null && allocatingFunction.eIsProxy()) {
			InternalEObject oldAllocatingFunction = (InternalEObject)allocatingFunction;
			allocatingFunction = (AbstractFunction)eResolveProxy(oldAllocatingFunction);
			if (allocatingFunction != oldAllocatingFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTION_REALIZATION__ALLOCATING_FUNCTION, oldAllocatingFunction, allocatingFunction));
			}
		}
		return allocatingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunction basicGetAllocatingFunction() {
		return allocatingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatingFunction(AbstractFunction newAllocatingFunction, NotificationChain msgs) {
		AbstractFunction oldAllocatingFunction = allocatingFunction;
		allocatingFunction = newAllocatingFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTION_REALIZATION__ALLOCATING_FUNCTION, oldAllocatingFunction, newAllocatingFunction);
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
			case FaPackage.FUNCTION_REALIZATION__ALLOCATED_FUNCTION:
				if (allocatedFunction != null)
					msgs = ((InternalEObject)allocatedFunction).eInverseRemove(this, FaPackage.ABSTRACT_FUNCTION__IN_FUNCTION_REALIZATIONS, AbstractFunction.class, msgs);
				return basicSetAllocatedFunction((AbstractFunction)otherEnd, msgs);
			case FaPackage.FUNCTION_REALIZATION__ALLOCATING_FUNCTION:
				if (allocatingFunction != null)
					msgs = ((InternalEObject)allocatingFunction).eInverseRemove(this, FaPackage.ABSTRACT_FUNCTION__OUT_FUNCTION_REALIZATIONS, AbstractFunction.class, msgs);
				return basicSetAllocatingFunction((AbstractFunction)otherEnd, msgs);
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
			case FaPackage.FUNCTION_REALIZATION__ALLOCATED_FUNCTION:
				return basicSetAllocatedFunction(null, msgs);
			case FaPackage.FUNCTION_REALIZATION__ALLOCATING_FUNCTION:
				return basicSetAllocatingFunction(null, msgs);
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
			case FaPackage.FUNCTION_REALIZATION__ALLOCATED_FUNCTION:
				if (resolve) return getAllocatedFunction();
				return basicGetAllocatedFunction();
			case FaPackage.FUNCTION_REALIZATION__ALLOCATING_FUNCTION:
				if (resolve) return getAllocatingFunction();
				return basicGetAllocatingFunction();
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
			case FaPackage.FUNCTION_REALIZATION__ALLOCATED_FUNCTION:
				return allocatedFunction != null;
			case FaPackage.FUNCTION_REALIZATION__ALLOCATING_FUNCTION:
				return allocatingFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionRealizationImpl
