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
package org.polarsys.capella.core.data.pa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.fa.impl.AbstractFunctionImpl;

import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.la.LogicalFunction;

import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalFunction;
import org.polarsys.capella.core.data.pa.PhysicalFunctionPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalFunctionImpl#getOwnedPhysicalFunctionPkgs <em>Owned Physical Function Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalFunctionImpl#getAllocatingPhysicalComponents <em>Allocating Physical Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalFunctionImpl#getRealizedLogicalFunctions <em>Realized Logical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalFunctionImpl#getContainedPhysicalFunctions <em>Contained Physical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalFunctionImpl#getChildrenPhysicalFunctions <em>Children Physical Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalFunctionImpl extends AbstractFunctionImpl implements PhysicalFunction {
	/**
	 * The cached value of the '{@link #getOwnedPhysicalFunctionPkgs() <em>Owned Physical Function Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalFunctionPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalFunctionPkg> ownedPhysicalFunctionPkgs;

	/**
	 * The cached value of the '{@link #getAllocatingPhysicalComponents() <em>Allocating Physical Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingPhysicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> allocatingPhysicalComponents;
	/**
	 * The cached value of the '{@link #getRealizedLogicalFunctions() <em>Realized Logical Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedLogicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalFunction> realizedLogicalFunctions;
	/**
	 * The cached value of the '{@link #getContainedPhysicalFunctions() <em>Contained Physical Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPhysicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalFunction> containedPhysicalFunctions;
	/**
	 * The cached value of the '{@link #getChildrenPhysicalFunctions() <em>Children Physical Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenPhysicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalFunction> childrenPhysicalFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalFunctionPkg> getOwnedPhysicalFunctionPkgs() {
		if (ownedPhysicalFunctionPkgs == null) {
			ownedPhysicalFunctionPkgs = new EObjectContainmentEList.Resolving<PhysicalFunctionPkg>(PhysicalFunctionPkg.class, this, PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS);
		}
		return ownedPhysicalFunctionPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalComponent> getAllocatingPhysicalComponents() {
		if (allocatingPhysicalComponents == null) {
			allocatingPhysicalComponents = new EObjectWithInverseResolvingEList.ManyInverse<PhysicalComponent>(PhysicalComponent.class, this, PaPackage.PHYSICAL_FUNCTION__ALLOCATING_PHYSICAL_COMPONENTS, PaPackage.PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS);
		}
		return allocatingPhysicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalFunction> getRealizedLogicalFunctions() {
		if (realizedLogicalFunctions == null) {
			realizedLogicalFunctions = new EObjectWithInverseResolvingEList.ManyInverse<LogicalFunction>(LogicalFunction.class, this, PaPackage.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS, LaPackage.LOGICAL_FUNCTION__REALIZING_PHYSICAL_FUNCTIONS);
		}
		return realizedLogicalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalFunction> getContainedPhysicalFunctions() {
		if (containedPhysicalFunctions == null) {
			containedPhysicalFunctions = new EObjectResolvingEList<PhysicalFunction>(PhysicalFunction.class, this, PaPackage.PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS);
		}
		return containedPhysicalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalFunction> getChildrenPhysicalFunctions() {
		if (childrenPhysicalFunctions == null) {
			childrenPhysicalFunctions = new EObjectResolvingEList<PhysicalFunction>(PhysicalFunction.class, this, PaPackage.PHYSICAL_FUNCTION__CHILDREN_PHYSICAL_FUNCTIONS);
		}
		return childrenPhysicalFunctions;
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
			case PaPackage.PHYSICAL_FUNCTION__ALLOCATING_PHYSICAL_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatingPhysicalComponents()).basicAdd(otherEnd, msgs);
			case PaPackage.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizedLogicalFunctions()).basicAdd(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				return ((InternalEList<?>)getOwnedPhysicalFunctionPkgs()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_FUNCTION__ALLOCATING_PHYSICAL_COMPONENTS:
				return ((InternalEList<?>)getAllocatingPhysicalComponents()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS:
				return ((InternalEList<?>)getRealizedLogicalFunctions()).basicRemove(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				return getOwnedPhysicalFunctionPkgs();
			case PaPackage.PHYSICAL_FUNCTION__ALLOCATING_PHYSICAL_COMPONENTS:
				return getAllocatingPhysicalComponents();
			case PaPackage.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS:
				return getRealizedLogicalFunctions();
			case PaPackage.PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS:
				return getContainedPhysicalFunctions();
			case PaPackage.PHYSICAL_FUNCTION__CHILDREN_PHYSICAL_FUNCTIONS:
				return getChildrenPhysicalFunctions();
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
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				getOwnedPhysicalFunctionPkgs().clear();
				getOwnedPhysicalFunctionPkgs().addAll((Collection<? extends PhysicalFunctionPkg>)newValue);
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
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				getOwnedPhysicalFunctionPkgs().clear();
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
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				return ownedPhysicalFunctionPkgs != null && !ownedPhysicalFunctionPkgs.isEmpty();
			case PaPackage.PHYSICAL_FUNCTION__ALLOCATING_PHYSICAL_COMPONENTS:
				return allocatingPhysicalComponents != null && !allocatingPhysicalComponents.isEmpty();
			case PaPackage.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS:
				return realizedLogicalFunctions != null && !realizedLogicalFunctions.isEmpty();
			case PaPackage.PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS:
				return containedPhysicalFunctions != null && !containedPhysicalFunctions.isEmpty();
			case PaPackage.PHYSICAL_FUNCTION__CHILDREN_PHYSICAL_FUNCTIONS:
				return childrenPhysicalFunctions != null && !childrenPhysicalFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalFunctionImpl
