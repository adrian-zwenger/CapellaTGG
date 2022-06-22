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

import java.util.Collection;

import modellingcore.TraceableElement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.data.capellacommon.GenericTrace;

import org.polarsys.capella.core.data.capellacore.KeyValue;

import org.polarsys.capella.core.data.capellacore.impl.TraceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.GenericTraceImpl#getKeyValuePairs <em>Key Value Pairs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.GenericTraceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.GenericTraceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericTraceImpl extends TraceImpl implements GenericTrace {
	/**
	 * The cached value of the '{@link #getKeyValuePairs() <em>Key Value Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyValuePairs()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValue> keyValuePairs;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected TraceableElement source;
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TraceableElement target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.GENERIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeyValue> getKeyValuePairs() {
		if (keyValuePairs == null) {
			keyValuePairs = new EObjectContainmentEList<KeyValue>(KeyValue.class, this, CapellacommonPackage.GENERIC_TRACE__KEY_VALUE_PAIRS);
		}
		return keyValuePairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TraceableElement getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TraceableElement getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellacommonPackage.GENERIC_TRACE__KEY_VALUE_PAIRS:
				return ((InternalEList<?>)getKeyValuePairs()).basicRemove(otherEnd, msgs);
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
			case CapellacommonPackage.GENERIC_TRACE__KEY_VALUE_PAIRS:
				return getKeyValuePairs();
			case CapellacommonPackage.GENERIC_TRACE__SOURCE:
				return getSource();
			case CapellacommonPackage.GENERIC_TRACE__TARGET:
				return getTarget();
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
			case CapellacommonPackage.GENERIC_TRACE__KEY_VALUE_PAIRS:
				getKeyValuePairs().clear();
				getKeyValuePairs().addAll((Collection<? extends KeyValue>)newValue);
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
			case CapellacommonPackage.GENERIC_TRACE__KEY_VALUE_PAIRS:
				getKeyValuePairs().clear();
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
			case CapellacommonPackage.GENERIC_TRACE__KEY_VALUE_PAIRS:
				return keyValuePairs != null && !keyValuePairs.isEmpty();
			case CapellacommonPackage.GENERIC_TRACE__SOURCE:
				return source != null;
			case CapellacommonPackage.GENERIC_TRACE__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //GenericTraceImpl
