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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeAllocation;
import org.polarsys.capella.core.data.fa.ComponentExchangeAllocator;
import org.polarsys.capella.core.data.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Exchange Allocator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeAllocatorImpl#getOwnedComponentExchangeAllocations <em>Owned Component Exchange Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeAllocatorImpl#getAllocatedComponentExchanges <em>Allocated Component Exchanges</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentExchangeAllocatorImpl extends NamedElementImpl implements ComponentExchangeAllocator {
	/**
	 * The cached value of the '{@link #getOwnedComponentExchangeAllocations() <em>Owned Component Exchange Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeAllocation> ownedComponentExchangeAllocations;

	/**
	 * The cached value of the '{@link #getAllocatedComponentExchanges() <em>Allocated Component Exchanges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedComponentExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchange> allocatedComponentExchanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentExchangeAllocatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.COMPONENT_EXCHANGE_ALLOCATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchangeAllocation> getOwnedComponentExchangeAllocations() {
		if (ownedComponentExchangeAllocations == null) {
			ownedComponentExchangeAllocations = new EObjectContainmentEList.Resolving<ComponentExchangeAllocation>(ComponentExchangeAllocation.class, this, FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS);
		}
		return ownedComponentExchangeAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchange> getAllocatedComponentExchanges() {
		if (allocatedComponentExchanges == null) {
			allocatedComponentExchanges = new EObjectResolvingEList<ComponentExchange>(ComponentExchange.class, this, FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES);
		}
		return allocatedComponentExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedComponentExchangeAllocations()).basicRemove(otherEnd, msgs);
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
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				return getOwnedComponentExchangeAllocations();
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES:
				return getAllocatedComponentExchanges();
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
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeAllocations().clear();
				getOwnedComponentExchangeAllocations().addAll((Collection<? extends ComponentExchangeAllocation>)newValue);
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
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeAllocations().clear();
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
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				return ownedComponentExchangeAllocations != null && !ownedComponentExchangeAllocations.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES:
				return allocatedComponentExchanges != null && !allocatedComponentExchanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentExchangeAllocatorImpl
