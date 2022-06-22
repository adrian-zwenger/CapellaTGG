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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeAllocation;
import org.polarsys.capella.core.data.fa.ComponentExchangeAllocator;
import org.polarsys.capella.core.data.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Exchange Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeAllocationImpl#getComponentExchangeAllocated <em>Component Exchange Allocated</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeAllocationImpl#getComponentExchangeAllocator <em>Component Exchange Allocator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentExchangeAllocationImpl extends AllocationImpl implements ComponentExchangeAllocation {
	/**
	 * The cached value of the '{@link #getComponentExchangeAllocated() <em>Component Exchange Allocated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentExchangeAllocated()
	 * @generated
	 * @ordered
	 */
	protected ComponentExchange componentExchangeAllocated;
	/**
	 * The cached value of the '{@link #getComponentExchangeAllocator() <em>Component Exchange Allocator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentExchangeAllocator()
	 * @generated
	 * @ordered
	 */
	protected ComponentExchangeAllocator componentExchangeAllocator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentExchangeAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.COMPONENT_EXCHANGE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentExchange getComponentExchangeAllocated() {
		if (componentExchangeAllocated != null && componentExchangeAllocated.eIsProxy()) {
			InternalEObject oldComponentExchangeAllocated = (InternalEObject)componentExchangeAllocated;
			componentExchangeAllocated = (ComponentExchange)eResolveProxy(oldComponentExchangeAllocated);
			if (componentExchangeAllocated != oldComponentExchangeAllocated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE_ALLOCATION__COMPONENT_EXCHANGE_ALLOCATED, oldComponentExchangeAllocated, componentExchangeAllocated));
			}
		}
		return componentExchangeAllocated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchange basicGetComponentExchangeAllocated() {
		return componentExchangeAllocated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentExchangeAllocator getComponentExchangeAllocator() {
		if (componentExchangeAllocator != null && componentExchangeAllocator.eIsProxy()) {
			InternalEObject oldComponentExchangeAllocator = (InternalEObject)componentExchangeAllocator;
			componentExchangeAllocator = (ComponentExchangeAllocator)eResolveProxy(oldComponentExchangeAllocator);
			if (componentExchangeAllocator != oldComponentExchangeAllocator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE_ALLOCATION__COMPONENT_EXCHANGE_ALLOCATOR, oldComponentExchangeAllocator, componentExchangeAllocator));
			}
		}
		return componentExchangeAllocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchangeAllocator basicGetComponentExchangeAllocator() {
		return componentExchangeAllocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATION__COMPONENT_EXCHANGE_ALLOCATED:
				if (resolve) return getComponentExchangeAllocated();
				return basicGetComponentExchangeAllocated();
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATION__COMPONENT_EXCHANGE_ALLOCATOR:
				if (resolve) return getComponentExchangeAllocator();
				return basicGetComponentExchangeAllocator();
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
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATION__COMPONENT_EXCHANGE_ALLOCATED:
				return componentExchangeAllocated != null;
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATION__COMPONENT_EXCHANGE_ALLOCATOR:
				return componentExchangeAllocator != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentExchangeAllocationImpl
