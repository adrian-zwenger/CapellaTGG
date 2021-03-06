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
package org.polarsys.capella.core.data.capellacommon.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvedElement;
import org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvement;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;

import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.InvolverElement;

import org.polarsys.capella.core.data.capellacore.impl.RelationshipImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Realization Involvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvementImpl#getInvolver <em>Involver</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvementImpl#getInvolved <em>Involved</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvementImpl#getInvolvedCapabilityRealizationInvolvedElement <em>Involved Capability Realization Involved Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityRealizationInvolvementImpl extends RelationshipImpl implements CapabilityRealizationInvolvement {
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
	 * The cached value of the '{@link #getInvolvedCapabilityRealizationInvolvedElement() <em>Involved Capability Realization Involved Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedCapabilityRealizationInvolvedElement()
	 * @generated
	 * @ordered
	 */
	protected CapabilityRealizationInvolvedElement involvedCapabilityRealizationInvolvedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityRealizationInvolvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.CAPABILITY_REALIZATION_INVOLVEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVER, oldInvolver, involver));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED, oldInvolved, involved));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED, oldInvolved, involved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityRealizationInvolvedElement getInvolvedCapabilityRealizationInvolvedElement() {
		if (involvedCapabilityRealizationInvolvedElement != null && involvedCapabilityRealizationInvolvedElement.eIsProxy()) {
			InternalEObject oldInvolvedCapabilityRealizationInvolvedElement = (InternalEObject)involvedCapabilityRealizationInvolvedElement;
			involvedCapabilityRealizationInvolvedElement = (CapabilityRealizationInvolvedElement)eResolveProxy(oldInvolvedCapabilityRealizationInvolvedElement);
			if (involvedCapabilityRealizationInvolvedElement != oldInvolvedCapabilityRealizationInvolvedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED_CAPABILITY_REALIZATION_INVOLVED_ELEMENT, oldInvolvedCapabilityRealizationInvolvedElement, involvedCapabilityRealizationInvolvedElement));
			}
		}
		return involvedCapabilityRealizationInvolvedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRealizationInvolvedElement basicGetInvolvedCapabilityRealizationInvolvedElement() {
		return involvedCapabilityRealizationInvolvedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVER:
				if (resolve) return getInvolver();
				return basicGetInvolver();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED:
				if (resolve) return getInvolved();
				return basicGetInvolved();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED_CAPABILITY_REALIZATION_INVOLVED_ELEMENT:
				if (resolve) return getInvolvedCapabilityRealizationInvolvedElement();
				return basicGetInvolvedCapabilityRealizationInvolvedElement();
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
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED:
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
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED:
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
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVER:
				return involver != null;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED:
				return involved != null;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED_CAPABILITY_REALIZATION_INVOLVED_ELEMENT:
				return involvedCapabilityRealizationInvolvedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityRealizationInvolvementImpl
