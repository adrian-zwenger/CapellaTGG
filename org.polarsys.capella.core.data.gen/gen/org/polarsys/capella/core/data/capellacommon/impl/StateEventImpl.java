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

import behavior.AbstractEvent;

import java.util.Collection;

import modellingcore.AbstractType;
import modellingcore.AbstractTypedElement;
import modellingcore.ModellingcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.data.capellacommon.StateEvent;
import org.polarsys.capella.core.data.capellacommon.StateEventRealization;

import org.polarsys.capella.core.data.capellacore.Constraint;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.StateEventImpl#getAbstractTypedElements <em>Abstract Typed Elements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.StateEventImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.StateEventImpl#getOwnedStateEventRealizations <em>Owned State Event Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StateEventImpl extends NamedElementImpl implements StateEvent {
	/**
	 * The cached value of the '{@link #getAbstractTypedElements() <em>Abstract Typed Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTypedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypedElement> abstractTypedElements;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Constraint expression;

	/**
	 * The cached value of the '{@link #getOwnedStateEventRealizations() <em>Owned State Event Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStateEventRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<StateEventRealization> ownedStateEventRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.STATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypedElement> getAbstractTypedElements() {
		if (abstractTypedElements == null) {
			abstractTypedElements = new EObjectResolvingEList<AbstractTypedElement>(AbstractTypedElement.class, this, CapellacommonPackage.STATE_EVENT__ABSTRACT_TYPED_ELEMENTS);
		}
		return abstractTypedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint getExpression() {
		if (expression != null && expression.eIsProxy()) {
			InternalEObject oldExpression = (InternalEObject)expression;
			expression = (Constraint)eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.STATE_EVENT__EXPRESSION, oldExpression, expression));
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(Constraint newExpression) {
		Constraint oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.STATE_EVENT__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StateEventRealization> getOwnedStateEventRealizations() {
		if (ownedStateEventRealizations == null) {
			ownedStateEventRealizations = new EObjectContainmentEList.Resolving<StateEventRealization>(StateEventRealization.class, this, CapellacommonPackage.STATE_EVENT__OWNED_STATE_EVENT_REALIZATIONS);
		}
		return ownedStateEventRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellacommonPackage.STATE_EVENT__OWNED_STATE_EVENT_REALIZATIONS:
				return ((InternalEList<?>)getOwnedStateEventRealizations()).basicRemove(otherEnd, msgs);
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
			case CapellacommonPackage.STATE_EVENT__ABSTRACT_TYPED_ELEMENTS:
				return getAbstractTypedElements();
			case CapellacommonPackage.STATE_EVENT__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
			case CapellacommonPackage.STATE_EVENT__OWNED_STATE_EVENT_REALIZATIONS:
				return getOwnedStateEventRealizations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CapellacommonPackage.STATE_EVENT__EXPRESSION:
				setExpression((Constraint)newValue);
				return;
			case CapellacommonPackage.STATE_EVENT__OWNED_STATE_EVENT_REALIZATIONS:
				getOwnedStateEventRealizations().clear();
				getOwnedStateEventRealizations().addAll((Collection<? extends StateEventRealization>)newValue);
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
			case CapellacommonPackage.STATE_EVENT__EXPRESSION:
				setExpression((Constraint)null);
				return;
			case CapellacommonPackage.STATE_EVENT__OWNED_STATE_EVENT_REALIZATIONS:
				getOwnedStateEventRealizations().clear();
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
			case CapellacommonPackage.STATE_EVENT__ABSTRACT_TYPED_ELEMENTS:
				return abstractTypedElements != null && !abstractTypedElements.isEmpty();
			case CapellacommonPackage.STATE_EVENT__EXPRESSION:
				return expression != null;
			case CapellacommonPackage.STATE_EVENT__OWNED_STATE_EVENT_REALIZATIONS:
				return ownedStateEventRealizations != null && !ownedStateEventRealizations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractType.class) {
			switch (derivedFeatureID) {
				case CapellacommonPackage.STATE_EVENT__ABSTRACT_TYPED_ELEMENTS: return ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractType.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS: return CapellacommonPackage.STATE_EVENT__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StateEventImpl
