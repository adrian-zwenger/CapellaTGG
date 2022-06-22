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
package org.polarsys.capella.core.data.interaction.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.InvolverElement;

import org.polarsys.capella.core.data.capellacore.impl.RelationshipImpl;

import org.polarsys.capella.core.data.fa.AbstractFunction;

import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.data.interaction.AbstractFunctionAbstractCapabilityInvolvement;
import org.polarsys.capella.core.data.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Function Abstract Capability Involvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.AbstractFunctionAbstractCapabilityInvolvementImpl#getInvolver <em>Involver</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.AbstractFunctionAbstractCapabilityInvolvementImpl#getInvolved <em>Involved</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.AbstractFunctionAbstractCapabilityInvolvementImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.AbstractFunctionAbstractCapabilityInvolvementImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractFunctionAbstractCapabilityInvolvementImpl extends RelationshipImpl implements AbstractFunctionAbstractCapabilityInvolvement {
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
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected AbstractCapability capability;
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected AbstractFunction function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFunctionAbstractCapabilityInvolvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVER, oldInvolver, involver));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVED, oldInvolved, involved));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVED, oldInvolved, involved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCapability getCapability() {
		if (capability != null && capability.eIsProxy()) {
			InternalEObject oldCapability = (InternalEObject)capability;
			capability = (AbstractCapability)eResolveProxy(oldCapability);
			if (capability != oldCapability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__CAPABILITY, oldCapability, capability));
			}
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability basicGetCapability() {
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractFunction getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject)function;
			function = (AbstractFunction)eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunction basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVER:
				if (resolve) return getInvolver();
				return basicGetInvolver();
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVED:
				if (resolve) return getInvolved();
				return basicGetInvolved();
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__CAPABILITY:
				if (resolve) return getCapability();
				return basicGetCapability();
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
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
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVED:
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
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVED:
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
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVER:
				return involver != null;
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVED:
				return involved != null;
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__CAPABILITY:
				return capability != null;
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__FUNCTION:
				return function != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractFunctionAbstractCapabilityInvolvementImpl
