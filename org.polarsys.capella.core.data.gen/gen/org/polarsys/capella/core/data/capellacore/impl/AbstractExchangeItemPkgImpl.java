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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacommon.GenericTrace;

import org.polarsys.capella.core.data.capellacore.AbstractExchangeItemPkg;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.NamingRule;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellacore.Trace;

import org.polarsys.capella.core.data.information.ExchangeItem;

import org.polarsys.capella.core.data.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Exchange Item Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractExchangeItemPkgImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractExchangeItemPkgImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractExchangeItemPkgImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractExchangeItemPkgImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractExchangeItemPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractExchangeItemPkgImpl#getOwnedExchangeItems <em>Owned Exchange Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractExchangeItemPkgImpl extends NamedElementImpl implements AbstractExchangeItemPkg {
	/**
	 * The cached value of the '{@link #getOwnedTraces() <em>Owned Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> ownedTraces;

	/**
	 * The cached value of the '{@link #getContainedGenericTraces() <em>Contained Generic Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedGenericTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericTrace> containedGenericTraces;

	/**
	 * The cached value of the '{@link #getContainedRequirementsTraces() <em>Contained Requirements Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedRequirementsTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsTrace> containedRequirementsTraces;

	/**
	 * The cached value of the '{@link #getNamingRules() <em>Naming Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamingRules()
	 * @generated
	 * @ordered
	 */
	protected EList<NamingRule> namingRules;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValuePkgs() <em>Owned Property Value Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValuePkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValuePkg> ownedPropertyValuePkgs;

	/**
	 * The cached value of the '{@link #getOwnedExchangeItems() <em>Owned Exchange Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExchangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItem> ownedExchangeItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractExchangeItemPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacorePackage.Literals.ABSTRACT_EXCHANGE_ITEM_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_TRACES);
		}
		return ownedTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GenericTrace> getContainedGenericTraces() {
		if (containedGenericTraces == null) {
			containedGenericTraces = new EObjectResolvingEList<GenericTrace>(GenericTrace.class, this, CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_GENERIC_TRACES);
		}
		return containedGenericTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementsTrace> getContainedRequirementsTraces() {
		if (containedRequirementsTraces == null) {
			containedRequirementsTraces = new EObjectResolvingEList<RequirementsTrace>(RequirementsTrace.class, this, CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_REQUIREMENTS_TRACES);
		}
		return containedRequirementsTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamingRule> getNamingRules() {
		if (namingRules == null) {
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__NAMING_RULES);
		}
		return namingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyValuePkg> getOwnedPropertyValuePkgs() {
		if (ownedPropertyValuePkgs == null) {
			ownedPropertyValuePkgs = new EObjectContainmentEList.Resolving<PropertyValuePkg>(PropertyValuePkg.class, this, CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExchangeItem> getOwnedExchangeItems() {
		if (ownedExchangeItems == null) {
			ownedExchangeItems = new EObjectContainmentEList.Resolving<ExchangeItem>(ExchangeItem.class, this, CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS);
		}
		return ownedExchangeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS:
				return ((InternalEList<?>)getOwnedExchangeItems()).basicRemove(otherEnd, msgs);
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
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_TRACES:
				return getOwnedTraces();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__NAMING_RULES:
				return getNamingRules();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS:
				return getOwnedExchangeItems();
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
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS:
				getOwnedExchangeItems().clear();
				getOwnedExchangeItems().addAll((Collection<? extends ExchangeItem>)newValue);
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
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__NAMING_RULES:
				getNamingRules().clear();
				return;
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS:
				getOwnedExchangeItems().clear();
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
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS:
				return ownedExchangeItems != null && !ownedExchangeItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractExchangeItemPkgImpl
