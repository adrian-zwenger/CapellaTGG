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

import modellingcore.AbstractExchangeItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

import org.polarsys.capella.core.data.information.ExchangeItemRealization;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Item Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.ExchangeItemRealizationImpl#getRealizedItem <em>Realized Item</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.ExchangeItemRealizationImpl#getRealizingOperation <em>Realizing Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangeItemRealizationImpl extends AllocationImpl implements ExchangeItemRealization {
	/**
	 * The cached value of the '{@link #getRealizedItem() <em>Realized Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedItem()
	 * @generated
	 * @ordered
	 */
	protected AbstractExchangeItem realizedItem;
	/**
	 * The cached value of the '{@link #getRealizingOperation() <em>Realizing Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation realizingOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeItemRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.EXCHANGE_ITEM_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractExchangeItem getRealizedItem() {
		if (realizedItem != null && realizedItem.eIsProxy()) {
			InternalEObject oldRealizedItem = (InternalEObject)realizedItem;
			realizedItem = (AbstractExchangeItem)eResolveProxy(oldRealizedItem);
			if (realizedItem != oldRealizedItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationPackage.EXCHANGE_ITEM_REALIZATION__REALIZED_ITEM, oldRealizedItem, realizedItem));
			}
		}
		return realizedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExchangeItem basicGetRealizedItem() {
		return realizedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getRealizingOperation() {
		if (realizingOperation != null && realizingOperation.eIsProxy()) {
			InternalEObject oldRealizingOperation = (InternalEObject)realizingOperation;
			realizingOperation = (Operation)eResolveProxy(oldRealizingOperation);
			if (realizingOperation != oldRealizingOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationPackage.EXCHANGE_ITEM_REALIZATION__REALIZING_OPERATION, oldRealizingOperation, realizingOperation));
			}
		}
		return realizingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetRealizingOperation() {
		return realizingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InformationPackage.EXCHANGE_ITEM_REALIZATION__REALIZED_ITEM:
				if (resolve) return getRealizedItem();
				return basicGetRealizedItem();
			case InformationPackage.EXCHANGE_ITEM_REALIZATION__REALIZING_OPERATION:
				if (resolve) return getRealizingOperation();
				return basicGetRealizingOperation();
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
			case InformationPackage.EXCHANGE_ITEM_REALIZATION__REALIZED_ITEM:
				return realizedItem != null;
			case InformationPackage.EXCHANGE_ITEM_REALIZATION__REALIZING_OPERATION:
				return realizingOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //ExchangeItemRealizationImpl
