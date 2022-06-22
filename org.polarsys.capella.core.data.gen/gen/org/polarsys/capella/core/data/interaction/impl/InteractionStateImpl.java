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

import org.polarsys.capella.core.data.capellacommon.AbstractState;

import org.polarsys.capella.core.data.fa.AbstractFunction;

import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.interaction.InteractionState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.InteractionStateImpl#getRelatedAbstractState <em>Related Abstract State</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.InteractionStateImpl#getRelatedAbstractFunction <em>Related Abstract Function</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.InteractionStateImpl#getCovered <em>Covered</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("deprecation")
public class InteractionStateImpl extends InteractionFragmentImpl implements InteractionState {
	/**
	 * The cached value of the '{@link #getRelatedAbstractState() <em>Related Abstract State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAbstractState()
	 * @deprecated See {@link org.polarsys.capella.core.data.interaction.InteractionState#getRelatedAbstractState() model documentation} for details.
	 * @generated
	 * @ordered
	 */
	@Deprecated
	protected AbstractState relatedAbstractState;

	/**
	 * The cached value of the '{@link #getRelatedAbstractFunction() <em>Related Abstract Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAbstractFunction()
	 * @deprecated See {@link org.polarsys.capella.core.data.interaction.InteractionState#getRelatedAbstractFunction() model documentation} for details.
	 * @generated
	 * @ordered
	 */
	@Deprecated
	protected AbstractFunction relatedAbstractFunction;

	/**
	 * The cached value of the '{@link #getCovered() <em>Covered</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovered()
	 * @generated
	 * @ordered
	 */
	protected InstanceRole covered;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.INTERACTION_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated See {@link org.polarsys.capella.core.data.interaction.InteractionState#getRelatedAbstractState() model documentation} for details.
	 * @generated
	 */
	@Deprecated
	@Override
	public AbstractState getRelatedAbstractState() {
		if (relatedAbstractState != null && relatedAbstractState.eIsProxy()) {
			InternalEObject oldRelatedAbstractState = (InternalEObject)relatedAbstractState;
			relatedAbstractState = (AbstractState)eResolveProxy(oldRelatedAbstractState);
			if (relatedAbstractState != oldRelatedAbstractState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_STATE, oldRelatedAbstractState, relatedAbstractState));
			}
		}
		return relatedAbstractState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated See {@link org.polarsys.capella.core.data.interaction.InteractionState#getRelatedAbstractState() model documentation} for details.
	 * @generated
	 */
	@Deprecated
	public AbstractState basicGetRelatedAbstractState() {
		return relatedAbstractState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated See {@link org.polarsys.capella.core.data.interaction.InteractionState#getRelatedAbstractState() model documentation} for details.
	 * @generated
	 */
	@Deprecated
	@Override
	public void setRelatedAbstractState(AbstractState newRelatedAbstractState) {
		AbstractState oldRelatedAbstractState = relatedAbstractState;
		relatedAbstractState = newRelatedAbstractState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_STATE, oldRelatedAbstractState, relatedAbstractState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated See {@link org.polarsys.capella.core.data.interaction.InteractionState#getRelatedAbstractFunction() model documentation} for details.
	 * @generated
	 */
	@Deprecated
	@Override
	public AbstractFunction getRelatedAbstractFunction() {
		if (relatedAbstractFunction != null && relatedAbstractFunction.eIsProxy()) {
			InternalEObject oldRelatedAbstractFunction = (InternalEObject)relatedAbstractFunction;
			relatedAbstractFunction = (AbstractFunction)eResolveProxy(oldRelatedAbstractFunction);
			if (relatedAbstractFunction != oldRelatedAbstractFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_FUNCTION, oldRelatedAbstractFunction, relatedAbstractFunction));
			}
		}
		return relatedAbstractFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated See {@link org.polarsys.capella.core.data.interaction.InteractionState#getRelatedAbstractFunction() model documentation} for details.
	 * @generated
	 */
	@Deprecated
	public AbstractFunction basicGetRelatedAbstractFunction() {
		return relatedAbstractFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated See {@link org.polarsys.capella.core.data.interaction.InteractionState#getRelatedAbstractFunction() model documentation} for details.
	 * @generated
	 */
	@Deprecated
	@Override
	public void setRelatedAbstractFunction(AbstractFunction newRelatedAbstractFunction) {
		AbstractFunction oldRelatedAbstractFunction = relatedAbstractFunction;
		relatedAbstractFunction = newRelatedAbstractFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_FUNCTION, oldRelatedAbstractFunction, relatedAbstractFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceRole getCovered() {
		if (covered != null && covered.eIsProxy()) {
			InternalEObject oldCovered = (InternalEObject)covered;
			covered = (InstanceRole)eResolveProxy(oldCovered);
			if (covered != oldCovered) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.INTERACTION_STATE__COVERED, oldCovered, covered));
			}
		}
		return covered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceRole basicGetCovered() {
		return covered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_STATE:
				if (resolve) return getRelatedAbstractState();
				return basicGetRelatedAbstractState();
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_FUNCTION:
				if (resolve) return getRelatedAbstractFunction();
				return basicGetRelatedAbstractFunction();
			case InteractionPackage.INTERACTION_STATE__COVERED:
				if (resolve) return getCovered();
				return basicGetCovered();
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
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_STATE:
				setRelatedAbstractState((AbstractState)newValue);
				return;
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_FUNCTION:
				setRelatedAbstractFunction((AbstractFunction)newValue);
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
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_STATE:
				setRelatedAbstractState((AbstractState)null);
				return;
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_FUNCTION:
				setRelatedAbstractFunction((AbstractFunction)null);
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
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_STATE:
				return relatedAbstractState != null;
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_FUNCTION:
				return relatedAbstractFunction != null;
			case InteractionPackage.INTERACTION_STATE__COVERED:
				return covered != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionStateImpl
