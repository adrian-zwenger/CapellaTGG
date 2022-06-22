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

import org.polarsys.capella.core.data.fa.ExchangeSpecification;
import org.polarsys.capella.core.data.fa.ExchangeSpecificationRealization;
import org.polarsys.capella.core.data.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Specification Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ExchangeSpecificationRealizationImpl#getRealizedExchangeSpecification <em>Realized Exchange Specification</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ExchangeSpecificationRealizationImpl#getRealizingExchangeSpecification <em>Realizing Exchange Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExchangeSpecificationRealizationImpl extends AllocationImpl implements ExchangeSpecificationRealization {
	/**
	 * The cached value of the '{@link #getRealizedExchangeSpecification() <em>Realized Exchange Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedExchangeSpecification()
	 * @generated
	 * @ordered
	 */
	protected ExchangeSpecification realizedExchangeSpecification;
	/**
	 * The cached value of the '{@link #getRealizingExchangeSpecification() <em>Realizing Exchange Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingExchangeSpecification()
	 * @generated
	 * @ordered
	 */
	protected ExchangeSpecification realizingExchangeSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeSpecificationRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.EXCHANGE_SPECIFICATION_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExchangeSpecification getRealizedExchangeSpecification() {
		if (realizedExchangeSpecification != null && realizedExchangeSpecification.eIsProxy()) {
			InternalEObject oldRealizedExchangeSpecification = (InternalEObject)realizedExchangeSpecification;
			realizedExchangeSpecification = (ExchangeSpecification)eResolveProxy(oldRealizedExchangeSpecification);
			if (realizedExchangeSpecification != oldRealizedExchangeSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZED_EXCHANGE_SPECIFICATION, oldRealizedExchangeSpecification, realizedExchangeSpecification));
			}
		}
		return realizedExchangeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeSpecification basicGetRealizedExchangeSpecification() {
		return realizedExchangeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizedExchangeSpecification(ExchangeSpecification newRealizedExchangeSpecification, NotificationChain msgs) {
		ExchangeSpecification oldRealizedExchangeSpecification = realizedExchangeSpecification;
		realizedExchangeSpecification = newRealizedExchangeSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZED_EXCHANGE_SPECIFICATION, oldRealizedExchangeSpecification, newRealizedExchangeSpecification);
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
	public ExchangeSpecification getRealizingExchangeSpecification() {
		if (realizingExchangeSpecification != null && realizingExchangeSpecification.eIsProxy()) {
			InternalEObject oldRealizingExchangeSpecification = (InternalEObject)realizingExchangeSpecification;
			realizingExchangeSpecification = (ExchangeSpecification)eResolveProxy(oldRealizingExchangeSpecification);
			if (realizingExchangeSpecification != oldRealizingExchangeSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZING_EXCHANGE_SPECIFICATION, oldRealizingExchangeSpecification, realizingExchangeSpecification));
			}
		}
		return realizingExchangeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeSpecification basicGetRealizingExchangeSpecification() {
		return realizingExchangeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizingExchangeSpecification(ExchangeSpecification newRealizingExchangeSpecification, NotificationChain msgs) {
		ExchangeSpecification oldRealizingExchangeSpecification = realizingExchangeSpecification;
		realizingExchangeSpecification = newRealizingExchangeSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZING_EXCHANGE_SPECIFICATION, oldRealizingExchangeSpecification, newRealizingExchangeSpecification);
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
			case FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZED_EXCHANGE_SPECIFICATION:
				if (realizedExchangeSpecification != null)
					msgs = ((InternalEObject)realizedExchangeSpecification).eInverseRemove(this, FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS, ExchangeSpecification.class, msgs);
				return basicSetRealizedExchangeSpecification((ExchangeSpecification)otherEnd, msgs);
			case FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZING_EXCHANGE_SPECIFICATION:
				if (realizingExchangeSpecification != null)
					msgs = ((InternalEObject)realizingExchangeSpecification).eInverseRemove(this, FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS, ExchangeSpecification.class, msgs);
				return basicSetRealizingExchangeSpecification((ExchangeSpecification)otherEnd, msgs);
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
			case FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZED_EXCHANGE_SPECIFICATION:
				return basicSetRealizedExchangeSpecification(null, msgs);
			case FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZING_EXCHANGE_SPECIFICATION:
				return basicSetRealizingExchangeSpecification(null, msgs);
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
			case FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZED_EXCHANGE_SPECIFICATION:
				if (resolve) return getRealizedExchangeSpecification();
				return basicGetRealizedExchangeSpecification();
			case FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZING_EXCHANGE_SPECIFICATION:
				if (resolve) return getRealizingExchangeSpecification();
				return basicGetRealizingExchangeSpecification();
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
			case FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZED_EXCHANGE_SPECIFICATION:
				return realizedExchangeSpecification != null;
			case FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZING_EXCHANGE_SPECIFICATION:
				return realizingExchangeSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //ExchangeSpecificationRealizationImpl
