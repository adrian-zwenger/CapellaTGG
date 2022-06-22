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

import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeFunctionalExchangeAllocation;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.FunctionalExchange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Exchange Functional Exchange Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeFunctionalExchangeAllocationImpl#getAllocatedFunctionalExchange <em>Allocated Functional Exchange</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeFunctionalExchangeAllocationImpl#getAllocatingComponentExchange <em>Allocating Component Exchange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentExchangeFunctionalExchangeAllocationImpl extends AllocationImpl implements ComponentExchangeFunctionalExchangeAllocation {
	/**
	 * The cached value of the '{@link #getAllocatedFunctionalExchange() <em>Allocated Functional Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedFunctionalExchange()
	 * @generated
	 * @ordered
	 */
	protected FunctionalExchange allocatedFunctionalExchange;
	/**
	 * The cached value of the '{@link #getAllocatingComponentExchange() <em>Allocating Component Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingComponentExchange()
	 * @generated
	 * @ordered
	 */
	protected ComponentExchange allocatingComponentExchange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentExchangeFunctionalExchangeAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalExchange getAllocatedFunctionalExchange() {
		if (allocatedFunctionalExchange != null && allocatedFunctionalExchange.eIsProxy()) {
			InternalEObject oldAllocatedFunctionalExchange = (InternalEObject)allocatedFunctionalExchange;
			allocatedFunctionalExchange = (FunctionalExchange)eResolveProxy(oldAllocatedFunctionalExchange);
			if (allocatedFunctionalExchange != oldAllocatedFunctionalExchange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATED_FUNCTIONAL_EXCHANGE, oldAllocatedFunctionalExchange, allocatedFunctionalExchange));
			}
		}
		return allocatedFunctionalExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalExchange basicGetAllocatedFunctionalExchange() {
		return allocatedFunctionalExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatedFunctionalExchange(FunctionalExchange newAllocatedFunctionalExchange, NotificationChain msgs) {
		FunctionalExchange oldAllocatedFunctionalExchange = allocatedFunctionalExchange;
		allocatedFunctionalExchange = newAllocatedFunctionalExchange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATED_FUNCTIONAL_EXCHANGE, oldAllocatedFunctionalExchange, newAllocatedFunctionalExchange);
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
	public ComponentExchange getAllocatingComponentExchange() {
		if (allocatingComponentExchange != null && allocatingComponentExchange.eIsProxy()) {
			InternalEObject oldAllocatingComponentExchange = (InternalEObject)allocatingComponentExchange;
			allocatingComponentExchange = (ComponentExchange)eResolveProxy(oldAllocatingComponentExchange);
			if (allocatingComponentExchange != oldAllocatingComponentExchange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATING_COMPONENT_EXCHANGE, oldAllocatingComponentExchange, allocatingComponentExchange));
			}
		}
		return allocatingComponentExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchange basicGetAllocatingComponentExchange() {
		return allocatingComponentExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatingComponentExchange(ComponentExchange newAllocatingComponentExchange, NotificationChain msgs) {
		ComponentExchange oldAllocatingComponentExchange = allocatingComponentExchange;
		allocatingComponentExchange = newAllocatingComponentExchange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATING_COMPONENT_EXCHANGE, oldAllocatingComponentExchange, newAllocatingComponentExchange);
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
			case FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATED_FUNCTIONAL_EXCHANGE:
				if (allocatedFunctionalExchange != null)
					msgs = ((InternalEObject)allocatedFunctionalExchange).eInverseRemove(this, FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_REALIZATIONS, FunctionalExchange.class, msgs);
				return basicSetAllocatedFunctionalExchange((FunctionalExchange)otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATING_COMPONENT_EXCHANGE:
				if (allocatingComponentExchange != null)
					msgs = ((InternalEObject)allocatingComponentExchange).eInverseRemove(this, FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS, ComponentExchange.class, msgs);
				return basicSetAllocatingComponentExchange((ComponentExchange)otherEnd, msgs);
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
			case FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATED_FUNCTIONAL_EXCHANGE:
				return basicSetAllocatedFunctionalExchange(null, msgs);
			case FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATING_COMPONENT_EXCHANGE:
				return basicSetAllocatingComponentExchange(null, msgs);
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
			case FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATED_FUNCTIONAL_EXCHANGE:
				if (resolve) return getAllocatedFunctionalExchange();
				return basicGetAllocatedFunctionalExchange();
			case FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATING_COMPONENT_EXCHANGE:
				if (resolve) return getAllocatingComponentExchange();
				return basicGetAllocatingComponentExchange();
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
			case FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATED_FUNCTIONAL_EXCHANGE:
				return allocatedFunctionalExchange != null;
			case FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATING_COMPONENT_EXCHANGE:
				return allocatingComponentExchange != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentExchangeFunctionalExchangeAllocationImpl
