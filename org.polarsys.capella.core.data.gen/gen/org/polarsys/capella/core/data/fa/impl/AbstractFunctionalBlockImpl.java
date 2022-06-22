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
package org.polarsys.capella.core.data.fa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacore.impl.TypeImpl;

import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.AbstractFunctionalBlock;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeCategory;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.fa.ExchangeLink;
import org.polarsys.capella.core.data.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Functional Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalBlockImpl#getOwnedFunctionalAllocation <em>Owned Functional Allocation</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalBlockImpl#getOwnedComponentExchanges <em>Owned Component Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalBlockImpl#getOwnedComponentExchangeCategories <em>Owned Component Exchange Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalBlockImpl#getFunctionalAllocations <em>Functional Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalBlockImpl#getAllocatedFunctions <em>Allocated Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalBlockImpl#getInExchangeLinks <em>In Exchange Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalBlockImpl#getOutExchangeLinks <em>Out Exchange Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractFunctionalBlockImpl extends TypeImpl implements AbstractFunctionalBlock {
	/**
	 * The cached value of the '{@link #getOwnedFunctionalAllocation() <em>Owned Functional Allocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionalAllocation()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentFunctionalAllocation> ownedFunctionalAllocation;

	/**
	 * The cached value of the '{@link #getOwnedComponentExchanges() <em>Owned Component Exchanges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchange> ownedComponentExchanges;

	/**
	 * The cached value of the '{@link #getOwnedComponentExchangeCategories() <em>Owned Component Exchange Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeCategory> ownedComponentExchangeCategories;

	/**
	 * The cached value of the '{@link #getFunctionalAllocations() <em>Functional Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentFunctionalAllocation> functionalAllocations;

	/**
	 * The cached value of the '{@link #getAllocatedFunctions() <em>Allocated Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractFunction> allocatedFunctions;

	/**
	 * The cached value of the '{@link #getInExchangeLinks() <em>In Exchange Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInExchangeLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeLink> inExchangeLinks;

	/**
	 * The cached value of the '{@link #getOutExchangeLinks() <em>Out Exchange Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutExchangeLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeLink> outExchangeLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFunctionalBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.ABSTRACT_FUNCTIONAL_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentFunctionalAllocation> getOwnedFunctionalAllocation() {
		if (ownedFunctionalAllocation == null) {
			ownedFunctionalAllocation = new EObjectContainmentEList.Resolving<ComponentFunctionalAllocation>(ComponentFunctionalAllocation.class, this, FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_FUNCTIONAL_ALLOCATION);
		}
		return ownedFunctionalAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchange> getOwnedComponentExchanges() {
		if (ownedComponentExchanges == null) {
			ownedComponentExchanges = new EObjectContainmentEList<ComponentExchange>(ComponentExchange.class, this, FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES);
		}
		return ownedComponentExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchangeCategory> getOwnedComponentExchangeCategories() {
		if (ownedComponentExchangeCategories == null) {
			ownedComponentExchangeCategories = new EObjectContainmentEList<ComponentExchangeCategory>(ComponentExchangeCategory.class, this, FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES);
		}
		return ownedComponentExchangeCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentFunctionalAllocation> getFunctionalAllocations() {
		if (functionalAllocations == null) {
			functionalAllocations = new EObjectWithInverseResolvingEList<ComponentFunctionalAllocation>(ComponentFunctionalAllocation.class, this, FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__FUNCTIONAL_ALLOCATIONS, FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__BLOCK);
		}
		return functionalAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractFunction> getAllocatedFunctions() {
		if (allocatedFunctions == null) {
			allocatedFunctions = new EObjectWithInverseResolvingEList.ManyInverse<AbstractFunction>(AbstractFunction.class, this, FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__ALLOCATED_FUNCTIONS, FaPackage.ABSTRACT_FUNCTION__ALLOCATION_BLOCKS);
		}
		return allocatedFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExchangeLink> getInExchangeLinks() {
		if (inExchangeLinks == null) {
			inExchangeLinks = new EObjectResolvingEList<ExchangeLink>(ExchangeLink.class, this, FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__IN_EXCHANGE_LINKS);
		}
		return inExchangeLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExchangeLink> getOutExchangeLinks() {
		if (outExchangeLinks == null) {
			outExchangeLinks = new EObjectResolvingEList<ExchangeLink>(ExchangeLink.class, this, FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OUT_EXCHANGE_LINKS);
		}
		return outExchangeLinks;
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
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__FUNCTIONAL_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunctionalAllocations()).basicAdd(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__ALLOCATED_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatedFunctions()).basicAdd(otherEnd, msgs);
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
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_FUNCTIONAL_ALLOCATION:
				return ((InternalEList<?>)getOwnedFunctionalAllocation()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES:
				return ((InternalEList<?>)getOwnedComponentExchanges()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return ((InternalEList<?>)getOwnedComponentExchangeCategories()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__FUNCTIONAL_ALLOCATIONS:
				return ((InternalEList<?>)getFunctionalAllocations()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__ALLOCATED_FUNCTIONS:
				return ((InternalEList<?>)getAllocatedFunctions()).basicRemove(otherEnd, msgs);
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
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_FUNCTIONAL_ALLOCATION:
				return getOwnedFunctionalAllocation();
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES:
				return getOwnedComponentExchanges();
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return getOwnedComponentExchangeCategories();
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__FUNCTIONAL_ALLOCATIONS:
				return getFunctionalAllocations();
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__ALLOCATED_FUNCTIONS:
				return getAllocatedFunctions();
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__IN_EXCHANGE_LINKS:
				return getInExchangeLinks();
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OUT_EXCHANGE_LINKS:
				return getOutExchangeLinks();
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
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_FUNCTIONAL_ALLOCATION:
				getOwnedFunctionalAllocation().clear();
				getOwnedFunctionalAllocation().addAll((Collection<? extends ComponentFunctionalAllocation>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES:
				getOwnedComponentExchanges().clear();
				getOwnedComponentExchanges().addAll((Collection<? extends ComponentExchange>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				getOwnedComponentExchangeCategories().clear();
				getOwnedComponentExchangeCategories().addAll((Collection<? extends ComponentExchangeCategory>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__IN_EXCHANGE_LINKS:
				getInExchangeLinks().clear();
				getInExchangeLinks().addAll((Collection<? extends ExchangeLink>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OUT_EXCHANGE_LINKS:
				getOutExchangeLinks().clear();
				getOutExchangeLinks().addAll((Collection<? extends ExchangeLink>)newValue);
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
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_FUNCTIONAL_ALLOCATION:
				getOwnedFunctionalAllocation().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES:
				getOwnedComponentExchanges().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				getOwnedComponentExchangeCategories().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__IN_EXCHANGE_LINKS:
				getInExchangeLinks().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OUT_EXCHANGE_LINKS:
				getOutExchangeLinks().clear();
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
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_FUNCTIONAL_ALLOCATION:
				return ownedFunctionalAllocation != null && !ownedFunctionalAllocation.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES:
				return ownedComponentExchanges != null && !ownedComponentExchanges.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return ownedComponentExchangeCategories != null && !ownedComponentExchangeCategories.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__FUNCTIONAL_ALLOCATIONS:
				return functionalAllocations != null && !functionalAllocations.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__ALLOCATED_FUNCTIONS:
				return allocatedFunctions != null && !allocatedFunctions.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__IN_EXCHANGE_LINKS:
				return inExchangeLinks != null && !inExchangeLinks.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OUT_EXCHANGE_LINKS:
				return outExchangeLinks != null && !outExchangeLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractFunctionalBlockImpl
