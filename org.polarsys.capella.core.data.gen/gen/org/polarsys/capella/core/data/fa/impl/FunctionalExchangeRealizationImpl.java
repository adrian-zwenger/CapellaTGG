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

import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.fa.FunctionalExchangeRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Exchange Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeRealizationImpl#getRealizedFunctionalExchange <em>Realized Functional Exchange</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeRealizationImpl#getRealizingFunctionalExchange <em>Realizing Functional Exchange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalExchangeRealizationImpl extends AllocationImpl implements FunctionalExchangeRealization {
	/**
	 * The cached value of the '{@link #getRealizedFunctionalExchange() <em>Realized Functional Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedFunctionalExchange()
	 * @generated
	 * @ordered
	 */
	protected FunctionalExchange realizedFunctionalExchange;
	/**
	 * The cached value of the '{@link #getRealizingFunctionalExchange() <em>Realizing Functional Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingFunctionalExchange()
	 * @generated
	 * @ordered
	 */
	protected FunctionalExchange realizingFunctionalExchange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalExchangeRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTIONAL_EXCHANGE_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalExchange getRealizedFunctionalExchange() {
		if (realizedFunctionalExchange != null && realizedFunctionalExchange.eIsProxy()) {
			InternalEObject oldRealizedFunctionalExchange = (InternalEObject)realizedFunctionalExchange;
			realizedFunctionalExchange = (FunctionalExchange)eResolveProxy(oldRealizedFunctionalExchange);
			if (realizedFunctionalExchange != oldRealizedFunctionalExchange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZED_FUNCTIONAL_EXCHANGE, oldRealizedFunctionalExchange, realizedFunctionalExchange));
			}
		}
		return realizedFunctionalExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalExchange basicGetRealizedFunctionalExchange() {
		return realizedFunctionalExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizedFunctionalExchange(FunctionalExchange newRealizedFunctionalExchange, NotificationChain msgs) {
		FunctionalExchange oldRealizedFunctionalExchange = realizedFunctionalExchange;
		realizedFunctionalExchange = newRealizedFunctionalExchange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZED_FUNCTIONAL_EXCHANGE, oldRealizedFunctionalExchange, newRealizedFunctionalExchange);
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
	public FunctionalExchange getRealizingFunctionalExchange() {
		if (realizingFunctionalExchange != null && realizingFunctionalExchange.eIsProxy()) {
			InternalEObject oldRealizingFunctionalExchange = (InternalEObject)realizingFunctionalExchange;
			realizingFunctionalExchange = (FunctionalExchange)eResolveProxy(oldRealizingFunctionalExchange);
			if (realizingFunctionalExchange != oldRealizingFunctionalExchange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZING_FUNCTIONAL_EXCHANGE, oldRealizingFunctionalExchange, realizingFunctionalExchange));
			}
		}
		return realizingFunctionalExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalExchange basicGetRealizingFunctionalExchange() {
		return realizingFunctionalExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizingFunctionalExchange(FunctionalExchange newRealizingFunctionalExchange, NotificationChain msgs) {
		FunctionalExchange oldRealizingFunctionalExchange = realizingFunctionalExchange;
		realizingFunctionalExchange = newRealizingFunctionalExchange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZING_FUNCTIONAL_EXCHANGE, oldRealizingFunctionalExchange, newRealizingFunctionalExchange);
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
			case FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZED_FUNCTIONAL_EXCHANGE:
				if (realizedFunctionalExchange != null)
					msgs = ((InternalEObject)realizedFunctionalExchange).eInverseRemove(this, FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_FUNCTIONAL_EXCHANGE_REALIZATIONS, FunctionalExchange.class, msgs);
				return basicSetRealizedFunctionalExchange((FunctionalExchange)otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZING_FUNCTIONAL_EXCHANGE:
				if (realizingFunctionalExchange != null)
					msgs = ((InternalEObject)realizingFunctionalExchange).eInverseRemove(this, FaPackage.FUNCTIONAL_EXCHANGE__OUTGOING_FUNCTIONAL_EXCHANGE_REALIZATIONS, FunctionalExchange.class, msgs);
				return basicSetRealizingFunctionalExchange((FunctionalExchange)otherEnd, msgs);
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
			case FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZED_FUNCTIONAL_EXCHANGE:
				return basicSetRealizedFunctionalExchange(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZING_FUNCTIONAL_EXCHANGE:
				return basicSetRealizingFunctionalExchange(null, msgs);
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
			case FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZED_FUNCTIONAL_EXCHANGE:
				if (resolve) return getRealizedFunctionalExchange();
				return basicGetRealizedFunctionalExchange();
			case FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZING_FUNCTIONAL_EXCHANGE:
				if (resolve) return getRealizingFunctionalExchange();
				return basicGetRealizingFunctionalExchange();
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
			case FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZED_FUNCTIONAL_EXCHANGE:
				return realizedFunctionalExchange != null;
			case FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZING_FUNCTIONAL_EXCHANGE:
				return realizingFunctionalExchange != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalExchangeRealizationImpl
