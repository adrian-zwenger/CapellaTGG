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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.InvolverElement;

import org.polarsys.capella.core.data.capellacore.impl.RelationshipImpl;

import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.FunctionalChainInvolvement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Chain Involvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalChainInvolvementImpl#getInvolver <em>Involver</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalChainInvolvementImpl#getInvolved <em>Involved</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalChainInvolvementImpl#getNextFunctionalChainInvolvements <em>Next Functional Chain Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalChainInvolvementImpl#getPreviousFunctionalChainInvolvements <em>Previous Functional Chain Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalChainInvolvementImpl#getInvolvedElement <em>Involved Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionalChainInvolvementImpl extends RelationshipImpl implements FunctionalChainInvolvement {
	/**
	 * The cached value of the '{@link #getInvolver() <em>Involver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolver()
	 * @generated
	 * @ordered
	 */
	protected InvolverElement involver;
	/**
	 * The cached value of the '{@link #getInvolved() <em>Involved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolved()
	 * @generated
	 * @ordered
	 */
	protected InvolvedElement involved;

	/**
	 * The cached value of the '{@link #getNextFunctionalChainInvolvements() <em>Next Functional Chain Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFunctionalChainInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalChainInvolvement> nextFunctionalChainInvolvements;
	/**
	 * The cached value of the '{@link #getPreviousFunctionalChainInvolvements() <em>Previous Functional Chain Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousFunctionalChainInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalChainInvolvement> previousFunctionalChainInvolvements;
	/**
	 * The cached value of the '{@link #getInvolvedElement() <em>Involved Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedElement()
	 * @generated
	 * @ordered
	 */
	protected InvolvedElement involvedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalChainInvolvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTIONAL_CHAIN_INVOLVEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvolverElement getInvolver() {
		if (involver != null && involver.eIsProxy()) {
			InternalEObject oldInvolver = (InternalEObject)involver;
			involver = (InvolverElement)eResolveProxy(oldInvolver);
			if (involver != oldInvolver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVER, oldInvolver, involver));
			}
		}
		return involver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolverElement basicGetInvolver() {
		return involver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvolvedElement getInvolved() {
		if (involved != null && involved.eIsProxy()) {
			InternalEObject oldInvolved = (InternalEObject)involved;
			involved = (InvolvedElement)eResolveProxy(oldInvolved);
			if (involved != oldInvolved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED, oldInvolved, involved));
			}
		}
		return involved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolvedElement basicGetInvolved() {
		return involved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvolved(InvolvedElement newInvolved) {
		InvolvedElement oldInvolved = involved;
		involved = newInvolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED, oldInvolved, involved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalChainInvolvement> getNextFunctionalChainInvolvements() {
		if (nextFunctionalChainInvolvements == null) {
			nextFunctionalChainInvolvements = new EObjectResolvingEList<FunctionalChainInvolvement>(FunctionalChainInvolvement.class, this, FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__NEXT_FUNCTIONAL_CHAIN_INVOLVEMENTS);
		}
		return nextFunctionalChainInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalChainInvolvement> getPreviousFunctionalChainInvolvements() {
		if (previousFunctionalChainInvolvements == null) {
			previousFunctionalChainInvolvements = new EObjectResolvingEList<FunctionalChainInvolvement>(FunctionalChainInvolvement.class, this, FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__PREVIOUS_FUNCTIONAL_CHAIN_INVOLVEMENTS);
		}
		return previousFunctionalChainInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvolvedElement getInvolvedElement() {
		if (involvedElement != null && involvedElement.eIsProxy()) {
			InternalEObject oldInvolvedElement = (InternalEObject)involvedElement;
			involvedElement = (InvolvedElement)eResolveProxy(oldInvolvedElement);
			if (involvedElement != oldInvolvedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED_ELEMENT, oldInvolvedElement, involvedElement));
			}
		}
		return involvedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolvedElement basicGetInvolvedElement() {
		return involvedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVER:
				if (resolve) return getInvolver();
				return basicGetInvolver();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED:
				if (resolve) return getInvolved();
				return basicGetInvolved();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__NEXT_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return getNextFunctionalChainInvolvements();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__PREVIOUS_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return getPreviousFunctionalChainInvolvements();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED_ELEMENT:
				if (resolve) return getInvolvedElement();
				return basicGetInvolvedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED:
				setInvolved((InvolvedElement)newValue);
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
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED:
				setInvolved((InvolvedElement)null);
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
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVER:
				return involver != null;
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED:
				return involved != null;
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__NEXT_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return nextFunctionalChainInvolvements != null && !nextFunctionalChainInvolvements.isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__PREVIOUS_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return previousFunctionalChainInvolvements != null && !previousFunctionalChainInvolvements.isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED_ELEMENT:
				return involvedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalChainInvolvementImpl
