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
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeRealization;
import org.polarsys.capella.core.data.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Exchange Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeRealizationImpl#getAllocatedComponentExchange <em>Allocated Component Exchange</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeRealizationImpl#getAllocatingComponentExchange <em>Allocating Component Exchange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentExchangeRealizationImpl extends ExchangeSpecificationRealizationImpl implements ComponentExchangeRealization {
	/**
	 * The cached value of the '{@link #getAllocatedComponentExchange() <em>Allocated Component Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedComponentExchange()
	 * @generated
	 * @ordered
	 */
	protected ComponentExchange allocatedComponentExchange;
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
	protected ComponentExchangeRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.COMPONENT_EXCHANGE_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentExchange getAllocatedComponentExchange() {
		if (allocatedComponentExchange != null && allocatedComponentExchange.eIsProxy()) {
			InternalEObject oldAllocatedComponentExchange = (InternalEObject)allocatedComponentExchange;
			allocatedComponentExchange = (ComponentExchange)eResolveProxy(oldAllocatedComponentExchange);
			if (allocatedComponentExchange != oldAllocatedComponentExchange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATED_COMPONENT_EXCHANGE, oldAllocatedComponentExchange, allocatedComponentExchange));
			}
		}
		return allocatedComponentExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchange basicGetAllocatedComponentExchange() {
		return allocatedComponentExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatedComponentExchange(ComponentExchange newAllocatedComponentExchange, NotificationChain msgs) {
		ComponentExchange oldAllocatedComponentExchange = allocatedComponentExchange;
		allocatedComponentExchange = newAllocatedComponentExchange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATED_COMPONENT_EXCHANGE, oldAllocatedComponentExchange, newAllocatedComponentExchange);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATING_COMPONENT_EXCHANGE, oldAllocatingComponentExchange, allocatingComponentExchange));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATING_COMPONENT_EXCHANGE, oldAllocatingComponentExchange, newAllocatingComponentExchange);
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
			case FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATED_COMPONENT_EXCHANGE:
				if (allocatedComponentExchange != null)
					msgs = ((InternalEObject)allocatedComponentExchange).eInverseRemove(this, FaPackage.COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS, ComponentExchange.class, msgs);
				return basicSetAllocatedComponentExchange((ComponentExchange)otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATING_COMPONENT_EXCHANGE:
				if (allocatingComponentExchange != null)
					msgs = ((InternalEObject)allocatingComponentExchange).eInverseRemove(this, FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS, ComponentExchange.class, msgs);
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
			case FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATED_COMPONENT_EXCHANGE:
				return basicSetAllocatedComponentExchange(null, msgs);
			case FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATING_COMPONENT_EXCHANGE:
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
			case FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATED_COMPONENT_EXCHANGE:
				if (resolve) return getAllocatedComponentExchange();
				return basicGetAllocatedComponentExchange();
			case FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATING_COMPONENT_EXCHANGE:
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
			case FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATED_COMPONENT_EXCHANGE:
				return allocatedComponentExchange != null;
			case FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATING_COMPONENT_EXCHANGE:
				return allocatingComponentExchange != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentExchangeRealizationImpl
