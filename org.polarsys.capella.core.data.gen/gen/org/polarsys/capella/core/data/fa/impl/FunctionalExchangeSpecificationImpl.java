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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.fa.FunctionalExchangeSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Exchange Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeSpecificationImpl#getFunctionalExchanges <em>Functional Exchanges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalExchangeSpecificationImpl extends ExchangeSpecificationImpl implements FunctionalExchangeSpecification {
	/**
	 * The cached value of the '{@link #getFunctionalExchanges() <em>Functional Exchanges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalExchange> functionalExchanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalExchangeSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTIONAL_EXCHANGE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalExchange> getFunctionalExchanges() {
		if (functionalExchanges == null) {
			functionalExchanges = new EObjectResolvingEList<FunctionalExchange>(FunctionalExchange.class, this, FaPackage.FUNCTIONAL_EXCHANGE_SPECIFICATION__FUNCTIONAL_EXCHANGES);
		}
		return functionalExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FaPackage.FUNCTIONAL_EXCHANGE_SPECIFICATION__FUNCTIONAL_EXCHANGES:
				return getFunctionalExchanges();
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
			case FaPackage.FUNCTIONAL_EXCHANGE_SPECIFICATION__FUNCTIONAL_EXCHANGES:
				return functionalExchanges != null && !functionalExchanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalExchangeSpecificationImpl
