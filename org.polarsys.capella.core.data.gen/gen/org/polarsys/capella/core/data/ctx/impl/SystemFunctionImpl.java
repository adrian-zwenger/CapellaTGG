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
package org.polarsys.capella.core.data.ctx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.ctx.SystemFunctionPkg;

import org.polarsys.capella.core.data.fa.impl.AbstractFunctionImpl;

import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.la.LogicalFunction;

import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.oa.OperationalActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemFunctionImpl#getOwnedSystemFunctionPkgs <em>Owned System Function Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemFunctionImpl#getAllocatingSystemComponents <em>Allocating System Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemFunctionImpl#getRealizedOperationalActivities <em>Realized Operational Activities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemFunctionImpl#getRealizingLogicalFunctions <em>Realizing Logical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemFunctionImpl#getContainedSystemFunctions <em>Contained System Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemFunctionImpl#getChildrenSystemFunctions <em>Children System Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemFunctionImpl extends AbstractFunctionImpl implements SystemFunction {
	/**
	 * The cached value of the '{@link #getOwnedSystemFunctionPkgs() <em>Owned System Function Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemFunctionPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunctionPkg> ownedSystemFunctionPkgs;

	/**
	 * The cached value of the '{@link #getAllocatingSystemComponents() <em>Allocating System Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingSystemComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemComponent> allocatingSystemComponents;
	/**
	 * The cached value of the '{@link #getRealizedOperationalActivities() <em>Realized Operational Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedOperationalActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalActivity> realizedOperationalActivities;
	/**
	 * The cached value of the '{@link #getRealizingLogicalFunctions() <em>Realizing Logical Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingLogicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalFunction> realizingLogicalFunctions;
	/**
	 * The cached value of the '{@link #getContainedSystemFunctions() <em>Contained System Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedSystemFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunction> containedSystemFunctions;
	/**
	 * The cached value of the '{@link #getChildrenSystemFunctions() <em>Children System Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenSystemFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunction> childrenSystemFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.SYSTEM_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemFunctionPkg> getOwnedSystemFunctionPkgs() {
		if (ownedSystemFunctionPkgs == null) {
			ownedSystemFunctionPkgs = new EObjectContainmentEList.Resolving<SystemFunctionPkg>(SystemFunctionPkg.class, this, CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS);
		}
		return ownedSystemFunctionPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemComponent> getAllocatingSystemComponents() {
		if (allocatingSystemComponents == null) {
			allocatingSystemComponents = new EObjectResolvingEList<SystemComponent>(SystemComponent.class, this, CtxPackage.SYSTEM_FUNCTION__ALLOCATING_SYSTEM_COMPONENTS);
		}
		return allocatingSystemComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalActivity> getRealizedOperationalActivities() {
		if (realizedOperationalActivities == null) {
			realizedOperationalActivities = new EObjectWithInverseResolvingEList.ManyInverse<OperationalActivity>(OperationalActivity.class, this, CtxPackage.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES, OaPackage.OPERATIONAL_ACTIVITY__REALIZING_SYSTEM_FUNCTIONS);
		}
		return realizedOperationalActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalFunction> getRealizingLogicalFunctions() {
		if (realizingLogicalFunctions == null) {
			realizingLogicalFunctions = new EObjectWithInverseResolvingEList.ManyInverse<LogicalFunction>(LogicalFunction.class, this, CtxPackage.SYSTEM_FUNCTION__REALIZING_LOGICAL_FUNCTIONS, LaPackage.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS);
		}
		return realizingLogicalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemFunction> getContainedSystemFunctions() {
		if (containedSystemFunctions == null) {
			containedSystemFunctions = new EObjectResolvingEList<SystemFunction>(SystemFunction.class, this, CtxPackage.SYSTEM_FUNCTION__CONTAINED_SYSTEM_FUNCTIONS);
		}
		return containedSystemFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemFunction> getChildrenSystemFunctions() {
		if (childrenSystemFunctions == null) {
			childrenSystemFunctions = new EObjectResolvingEList<SystemFunction>(SystemFunction.class, this, CtxPackage.SYSTEM_FUNCTION__CHILDREN_SYSTEM_FUNCTIONS);
		}
		return childrenSystemFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxPackage.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizedOperationalActivities()).basicAdd(otherEnd, msgs);
			case CtxPackage.SYSTEM_FUNCTION__REALIZING_LOGICAL_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizingLogicalFunctions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				return ((InternalEList<?>)getOwnedSystemFunctionPkgs()).basicRemove(otherEnd, msgs);
			case CtxPackage.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES:
				return ((InternalEList<?>)getRealizedOperationalActivities()).basicRemove(otherEnd, msgs);
			case CtxPackage.SYSTEM_FUNCTION__REALIZING_LOGICAL_FUNCTIONS:
				return ((InternalEList<?>)getRealizingLogicalFunctions()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				return getOwnedSystemFunctionPkgs();
			case CtxPackage.SYSTEM_FUNCTION__ALLOCATING_SYSTEM_COMPONENTS:
				return getAllocatingSystemComponents();
			case CtxPackage.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES:
				return getRealizedOperationalActivities();
			case CtxPackage.SYSTEM_FUNCTION__REALIZING_LOGICAL_FUNCTIONS:
				return getRealizingLogicalFunctions();
			case CtxPackage.SYSTEM_FUNCTION__CONTAINED_SYSTEM_FUNCTIONS:
				return getContainedSystemFunctions();
			case CtxPackage.SYSTEM_FUNCTION__CHILDREN_SYSTEM_FUNCTIONS:
				return getChildrenSystemFunctions();
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
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				getOwnedSystemFunctionPkgs().clear();
				getOwnedSystemFunctionPkgs().addAll((Collection<? extends SystemFunctionPkg>)newValue);
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
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				getOwnedSystemFunctionPkgs().clear();
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
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				return ownedSystemFunctionPkgs != null && !ownedSystemFunctionPkgs.isEmpty();
			case CtxPackage.SYSTEM_FUNCTION__ALLOCATING_SYSTEM_COMPONENTS:
				return allocatingSystemComponents != null && !allocatingSystemComponents.isEmpty();
			case CtxPackage.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES:
				return realizedOperationalActivities != null && !realizedOperationalActivities.isEmpty();
			case CtxPackage.SYSTEM_FUNCTION__REALIZING_LOGICAL_FUNCTIONS:
				return realizingLogicalFunctions != null && !realizingLogicalFunctions.isEmpty();
			case CtxPackage.SYSTEM_FUNCTION__CONTAINED_SYSTEM_FUNCTIONS:
				return containedSystemFunctions != null && !containedSystemFunctions.isEmpty();
			case CtxPackage.SYSTEM_FUNCTION__CHILDREN_SYSTEM_FUNCTIONS:
				return childrenSystemFunctions != null && !childrenSystemFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemFunctionImpl
