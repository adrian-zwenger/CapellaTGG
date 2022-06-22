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
package org.polarsys.capella.core.data.capellacore.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractPropertyValueImpl#getInvolvedElements <em>Involved Elements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractPropertyValueImpl#getValuedElements <em>Valued Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractPropertyValueImpl extends NamedElementImpl implements AbstractPropertyValue {
	/**
	 * The cached value of the '{@link #getInvolvedElements() <em>Involved Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CapellaElement> involvedElements;

	/**
	 * The cached value of the '{@link #getValuedElements() <em>Valued Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CapellaElement> valuedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPropertyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacorePackage.Literals.ABSTRACT_PROPERTY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapellaElement> getInvolvedElements() {
		if (involvedElements == null) {
			involvedElements = new EObjectResolvingEList<CapellaElement>(CapellaElement.class, this, CapellacorePackage.ABSTRACT_PROPERTY_VALUE__INVOLVED_ELEMENTS);
		}
		return involvedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapellaElement> getValuedElements() {
		if (valuedElements == null) {
			valuedElements = new EObjectResolvingEList<CapellaElement>(CapellaElement.class, this, CapellacorePackage.ABSTRACT_PROPERTY_VALUE__VALUED_ELEMENTS);
		}
		return valuedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapellacorePackage.ABSTRACT_PROPERTY_VALUE__INVOLVED_ELEMENTS:
				return getInvolvedElements();
			case CapellacorePackage.ABSTRACT_PROPERTY_VALUE__VALUED_ELEMENTS:
				return getValuedElements();
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
			case CapellacorePackage.ABSTRACT_PROPERTY_VALUE__INVOLVED_ELEMENTS:
				getInvolvedElements().clear();
				getInvolvedElements().addAll((Collection<? extends CapellaElement>)newValue);
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
			case CapellacorePackage.ABSTRACT_PROPERTY_VALUE__INVOLVED_ELEMENTS:
				getInvolvedElements().clear();
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
			case CapellacorePackage.ABSTRACT_PROPERTY_VALUE__INVOLVED_ELEMENTS:
				return involvedElements != null && !involvedElements.isEmpty();
			case CapellacorePackage.ABSTRACT_PROPERTY_VALUE__VALUED_ELEMENTS:
				return valuedElements != null && !valuedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractPropertyValueImpl
