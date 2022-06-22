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
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalChainReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Chain Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalChainReferenceImpl#getReferencedFunctionalChain <em>Referenced Functional Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalChainReferenceImpl extends FunctionalChainInvolvementImpl implements FunctionalChainReference {
	/**
	 * The cached value of the '{@link #getReferencedFunctionalChain() <em>Referenced Functional Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedFunctionalChain()
	 * @generated
	 * @ordered
	 */
	protected FunctionalChain referencedFunctionalChain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalChainReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTIONAL_CHAIN_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalChain getReferencedFunctionalChain() {
		if (referencedFunctionalChain != null && referencedFunctionalChain.eIsProxy()) {
			InternalEObject oldReferencedFunctionalChain = (InternalEObject)referencedFunctionalChain;
			referencedFunctionalChain = (FunctionalChain)eResolveProxy(oldReferencedFunctionalChain);
			if (referencedFunctionalChain != oldReferencedFunctionalChain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN, oldReferencedFunctionalChain, referencedFunctionalChain));
			}
		}
		return referencedFunctionalChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalChain basicGetReferencedFunctionalChain() {
		return referencedFunctionalChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FaPackage.FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN:
				if (resolve) return getReferencedFunctionalChain();
				return basicGetReferencedFunctionalChain();
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
			case FaPackage.FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN:
				return referencedFunctionalChain != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalChainReferenceImpl
