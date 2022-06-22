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
package org.polarsys.capella.core.data.cs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.ComponentRealization;
import org.polarsys.capella.core.data.cs.CsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentRealizationImpl#getRealizedComponent <em>Realized Component</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentRealizationImpl#getRealizingComponent <em>Realizing Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentRealizationImpl extends AllocationImpl implements ComponentRealization {
	/**
	 * The cached value of the '{@link #getRealizedComponent() <em>Realized Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedComponent()
	 * @generated
	 * @ordered
	 */
	protected Component realizedComponent;
	/**
	 * The cached value of the '{@link #getRealizingComponent() <em>Realizing Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingComponent()
	 * @generated
	 * @ordered
	 */
	protected Component realizingComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.COMPONENT_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getRealizedComponent() {
		if (realizedComponent != null && realizedComponent.eIsProxy()) {
			InternalEObject oldRealizedComponent = (InternalEObject)realizedComponent;
			realizedComponent = (Component)eResolveProxy(oldRealizedComponent);
			if (realizedComponent != oldRealizedComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.COMPONENT_REALIZATION__REALIZED_COMPONENT, oldRealizedComponent, realizedComponent));
			}
		}
		return realizedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetRealizedComponent() {
		return realizedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getRealizingComponent() {
		if (realizingComponent != null && realizingComponent.eIsProxy()) {
			InternalEObject oldRealizingComponent = (InternalEObject)realizingComponent;
			realizingComponent = (Component)eResolveProxy(oldRealizingComponent);
			if (realizingComponent != oldRealizingComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.COMPONENT_REALIZATION__REALIZING_COMPONENT, oldRealizingComponent, realizingComponent));
			}
		}
		return realizingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetRealizingComponent() {
		return realizingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.COMPONENT_REALIZATION__REALIZED_COMPONENT:
				if (resolve) return getRealizedComponent();
				return basicGetRealizedComponent();
			case CsPackage.COMPONENT_REALIZATION__REALIZING_COMPONENT:
				if (resolve) return getRealizingComponent();
				return basicGetRealizingComponent();
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
			case CsPackage.COMPONENT_REALIZATION__REALIZED_COMPONENT:
				return realizedComponent != null;
			case CsPackage.COMPONENT_REALIZATION__REALIZING_COMPONENT:
				return realizingComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentRealizationImpl
