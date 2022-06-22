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
package org.polarsys.capella.core.data.la.impl;

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
import org.polarsys.capella.core.data.ctx.SystemFunction;

import org.polarsys.capella.core.data.fa.impl.AbstractFunctionImpl;

import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.la.LogicalFunction;
import org.polarsys.capella.core.data.la.LogicalFunctionPkg;

import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.PhysicalFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.LogicalFunctionImpl#getOwnedLogicalFunctionPkgs <em>Owned Logical Function Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.LogicalFunctionImpl#getAllocatingLogicalComponents <em>Allocating Logical Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.LogicalFunctionImpl#getRealizedSystemFunctions <em>Realized System Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.LogicalFunctionImpl#getRealizingPhysicalFunctions <em>Realizing Physical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.LogicalFunctionImpl#getContainedLogicalFunctions <em>Contained Logical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.LogicalFunctionImpl#getChildrenLogicalFunctions <em>Children Logical Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalFunctionImpl extends AbstractFunctionImpl implements LogicalFunction {
	/**
	 * The cached value of the '{@link #getOwnedLogicalFunctionPkgs() <em>Owned Logical Function Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalFunctionPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalFunctionPkg> ownedLogicalFunctionPkgs;

	/**
	 * The cached value of the '{@link #getAllocatingLogicalComponents() <em>Allocating Logical Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingLogicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComponent> allocatingLogicalComponents;
	/**
	 * The cached value of the '{@link #getRealizedSystemFunctions() <em>Realized System Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedSystemFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunction> realizedSystemFunctions;
	/**
	 * The cached value of the '{@link #getRealizingPhysicalFunctions() <em>Realizing Physical Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingPhysicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalFunction> realizingPhysicalFunctions;
	/**
	 * The cached value of the '{@link #getContainedLogicalFunctions() <em>Contained Logical Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedLogicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalFunction> containedLogicalFunctions;
	/**
	 * The cached value of the '{@link #getChildrenLogicalFunctions() <em>Children Logical Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenLogicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalFunction> childrenLogicalFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaPackage.Literals.LOGICAL_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalFunctionPkg> getOwnedLogicalFunctionPkgs() {
		if (ownedLogicalFunctionPkgs == null) {
			ownedLogicalFunctionPkgs = new EObjectContainmentEList.Resolving<LogicalFunctionPkg>(LogicalFunctionPkg.class, this, LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS);
		}
		return ownedLogicalFunctionPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalComponent> getAllocatingLogicalComponents() {
		if (allocatingLogicalComponents == null) {
			allocatingLogicalComponents = new EObjectWithInverseResolvingEList.ManyInverse<LogicalComponent>(LogicalComponent.class, this, LaPackage.LOGICAL_FUNCTION__ALLOCATING_LOGICAL_COMPONENTS, LaPackage.LOGICAL_COMPONENT__ALLOCATED_LOGICAL_FUNCTIONS);
		}
		return allocatingLogicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemFunction> getRealizedSystemFunctions() {
		if (realizedSystemFunctions == null) {
			realizedSystemFunctions = new EObjectWithInverseResolvingEList.ManyInverse<SystemFunction>(SystemFunction.class, this, LaPackage.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS, CtxPackage.SYSTEM_FUNCTION__REALIZING_LOGICAL_FUNCTIONS);
		}
		return realizedSystemFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalFunction> getRealizingPhysicalFunctions() {
		if (realizingPhysicalFunctions == null) {
			realizingPhysicalFunctions = new EObjectWithInverseResolvingEList.ManyInverse<PhysicalFunction>(PhysicalFunction.class, this, LaPackage.LOGICAL_FUNCTION__REALIZING_PHYSICAL_FUNCTIONS, PaPackage.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS);
		}
		return realizingPhysicalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalFunction> getContainedLogicalFunctions() {
		if (containedLogicalFunctions == null) {
			containedLogicalFunctions = new EObjectResolvingEList<LogicalFunction>(LogicalFunction.class, this, LaPackage.LOGICAL_FUNCTION__CONTAINED_LOGICAL_FUNCTIONS);
		}
		return containedLogicalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalFunction> getChildrenLogicalFunctions() {
		if (childrenLogicalFunctions == null) {
			childrenLogicalFunctions = new EObjectResolvingEList<LogicalFunction>(LogicalFunction.class, this, LaPackage.LOGICAL_FUNCTION__CHILDREN_LOGICAL_FUNCTIONS);
		}
		return childrenLogicalFunctions;
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
			case LaPackage.LOGICAL_FUNCTION__ALLOCATING_LOGICAL_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatingLogicalComponents()).basicAdd(otherEnd, msgs);
			case LaPackage.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizedSystemFunctions()).basicAdd(otherEnd, msgs);
			case LaPackage.LOGICAL_FUNCTION__REALIZING_PHYSICAL_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizingPhysicalFunctions()).basicAdd(otherEnd, msgs);
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
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				return ((InternalEList<?>)getOwnedLogicalFunctionPkgs()).basicRemove(otherEnd, msgs);
			case LaPackage.LOGICAL_FUNCTION__ALLOCATING_LOGICAL_COMPONENTS:
				return ((InternalEList<?>)getAllocatingLogicalComponents()).basicRemove(otherEnd, msgs);
			case LaPackage.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS:
				return ((InternalEList<?>)getRealizedSystemFunctions()).basicRemove(otherEnd, msgs);
			case LaPackage.LOGICAL_FUNCTION__REALIZING_PHYSICAL_FUNCTIONS:
				return ((InternalEList<?>)getRealizingPhysicalFunctions()).basicRemove(otherEnd, msgs);
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
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				return getOwnedLogicalFunctionPkgs();
			case LaPackage.LOGICAL_FUNCTION__ALLOCATING_LOGICAL_COMPONENTS:
				return getAllocatingLogicalComponents();
			case LaPackage.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS:
				return getRealizedSystemFunctions();
			case LaPackage.LOGICAL_FUNCTION__REALIZING_PHYSICAL_FUNCTIONS:
				return getRealizingPhysicalFunctions();
			case LaPackage.LOGICAL_FUNCTION__CONTAINED_LOGICAL_FUNCTIONS:
				return getContainedLogicalFunctions();
			case LaPackage.LOGICAL_FUNCTION__CHILDREN_LOGICAL_FUNCTIONS:
				return getChildrenLogicalFunctions();
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
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				getOwnedLogicalFunctionPkgs().clear();
				getOwnedLogicalFunctionPkgs().addAll((Collection<? extends LogicalFunctionPkg>)newValue);
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
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				getOwnedLogicalFunctionPkgs().clear();
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
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				return ownedLogicalFunctionPkgs != null && !ownedLogicalFunctionPkgs.isEmpty();
			case LaPackage.LOGICAL_FUNCTION__ALLOCATING_LOGICAL_COMPONENTS:
				return allocatingLogicalComponents != null && !allocatingLogicalComponents.isEmpty();
			case LaPackage.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS:
				return realizedSystemFunctions != null && !realizedSystemFunctions.isEmpty();
			case LaPackage.LOGICAL_FUNCTION__REALIZING_PHYSICAL_FUNCTIONS:
				return realizingPhysicalFunctions != null && !realizingPhysicalFunctions.isEmpty();
			case LaPackage.LOGICAL_FUNCTION__CONTAINED_LOGICAL_FUNCTIONS:
				return containedLogicalFunctions != null && !containedLogicalFunctions.isEmpty();
			case LaPackage.LOGICAL_FUNCTION__CHILDREN_LOGICAL_FUNCTIONS:
				return childrenLogicalFunctions != null && !childrenLogicalFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalFunctionImpl
