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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacommon.GenericTrace;

import org.polarsys.capella.core.data.capellacore.NamingRule;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellacore.Trace;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.fa.AbstractFunctionalArchitecture;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeCategory;
import org.polarsys.capella.core.data.fa.ComponentExchangeRealization;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.fa.ExchangeLink;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.FunctionPkg;

import org.polarsys.capella.core.data.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Functional Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalArchitectureImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalArchitectureImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalArchitectureImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalArchitectureImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalArchitectureImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalArchitectureImpl#getOwnedFunctionPkg <em>Owned Function Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalArchitectureImpl#getOwnedComponentExchanges <em>Owned Component Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalArchitectureImpl#getOwnedComponentExchangeCategories <em>Owned Component Exchange Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalArchitectureImpl#getOwnedFunctionalLinks <em>Owned Functional Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalArchitectureImpl#getOwnedFunctionalAllocations <em>Owned Functional Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.AbstractFunctionalArchitectureImpl#getOwnedComponentExchangeRealizations <em>Owned Component Exchange Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractFunctionalArchitectureImpl extends NamedElementImpl implements AbstractFunctionalArchitecture {
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
	 * The cached value of the '{@link #getOwnedFunctionPkg() <em>Owned Function Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionPkg()
	 * @generated
	 * @ordered
	 */
	protected FunctionPkg ownedFunctionPkg;

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
	 * The cached value of the '{@link #getOwnedFunctionalLinks() <em>Owned Functional Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionalLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeLink> ownedFunctionalLinks;

	/**
	 * The cached value of the '{@link #getOwnedFunctionalAllocations() <em>Owned Functional Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionalAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentFunctionalAllocation> ownedFunctionalAllocations;

	/**
	 * The cached value of the '{@link #getOwnedComponentExchangeRealizations() <em>Owned Component Exchange Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeRealization> ownedComponentExchangeRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFunctionalArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.ABSTRACT_FUNCTIONAL_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_TRACES);
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
			containedGenericTraces = new EObjectResolvingEList<GenericTrace>(GenericTrace.class, this, FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__CONTAINED_GENERIC_TRACES);
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
			containedRequirementsTraces = new EObjectResolvingEList<RequirementsTrace>(RequirementsTrace.class, this, FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__NAMING_RULES);
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
			ownedPropertyValuePkgs = new EObjectContainmentEList.Resolving<PropertyValuePkg>(PropertyValuePkg.class, this, FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionPkg getOwnedFunctionPkg() {
		if (ownedFunctionPkg != null && ownedFunctionPkg.eIsProxy()) {
			InternalEObject oldOwnedFunctionPkg = (InternalEObject)ownedFunctionPkg;
			ownedFunctionPkg = (FunctionPkg)eResolveProxy(oldOwnedFunctionPkg);
			if (ownedFunctionPkg != oldOwnedFunctionPkg) {
				InternalEObject newOwnedFunctionPkg = (InternalEObject)ownedFunctionPkg;
				NotificationChain msgs = oldOwnedFunctionPkg.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTION_PKG, null, null);
				if (newOwnedFunctionPkg.eInternalContainer() == null) {
					msgs = newOwnedFunctionPkg.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTION_PKG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTION_PKG, oldOwnedFunctionPkg, ownedFunctionPkg));
			}
		}
		return ownedFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPkg basicGetOwnedFunctionPkg() {
		return ownedFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedFunctionPkg(FunctionPkg newOwnedFunctionPkg, NotificationChain msgs) {
		FunctionPkg oldOwnedFunctionPkg = ownedFunctionPkg;
		ownedFunctionPkg = newOwnedFunctionPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTION_PKG, oldOwnedFunctionPkg, newOwnedFunctionPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedFunctionPkg(FunctionPkg newOwnedFunctionPkg) {
		if (newOwnedFunctionPkg != ownedFunctionPkg) {
			NotificationChain msgs = null;
			if (ownedFunctionPkg != null)
				msgs = ((InternalEObject)ownedFunctionPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTION_PKG, null, msgs);
			if (newOwnedFunctionPkg != null)
				msgs = ((InternalEObject)newOwnedFunctionPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTION_PKG, null, msgs);
			msgs = basicSetOwnedFunctionPkg(newOwnedFunctionPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTION_PKG, newOwnedFunctionPkg, newOwnedFunctionPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchange> getOwnedComponentExchanges() {
		if (ownedComponentExchanges == null) {
			ownedComponentExchanges = new EObjectContainmentEList<ComponentExchange>(ComponentExchange.class, this, FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES);
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
			ownedComponentExchangeCategories = new EObjectContainmentEList<ComponentExchangeCategory>(ComponentExchangeCategory.class, this, FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES);
		}
		return ownedComponentExchangeCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExchangeLink> getOwnedFunctionalLinks() {
		if (ownedFunctionalLinks == null) {
			ownedFunctionalLinks = new EObjectContainmentEList<ExchangeLink>(ExchangeLink.class, this, FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTIONAL_LINKS);
		}
		return ownedFunctionalLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentFunctionalAllocation> getOwnedFunctionalAllocations() {
		if (ownedFunctionalAllocations == null) {
			ownedFunctionalAllocations = new EObjectContainmentEList.Resolving<ComponentFunctionalAllocation>(ComponentFunctionalAllocation.class, this, FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTIONAL_ALLOCATIONS);
		}
		return ownedFunctionalAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchangeRealization> getOwnedComponentExchangeRealizations() {
		if (ownedComponentExchangeRealizations == null) {
			ownedComponentExchangeRealizations = new EObjectContainmentEList<ComponentExchangeRealization>(ComponentExchangeRealization.class, this, FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS);
		}
		return ownedComponentExchangeRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTION_PKG:
				return basicSetOwnedFunctionPkg(null, msgs);
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES:
				return ((InternalEList<?>)getOwnedComponentExchanges()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return ((InternalEList<?>)getOwnedComponentExchangeCategories()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTIONAL_LINKS:
				return ((InternalEList<?>)getOwnedFunctionalLinks()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTIONAL_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedFunctionalAllocations()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getOwnedComponentExchangeRealizations()).basicRemove(otherEnd, msgs);
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
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_TRACES:
				return getOwnedTraces();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__NAMING_RULES:
				return getNamingRules();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTION_PKG:
				if (resolve) return getOwnedFunctionPkg();
				return basicGetOwnedFunctionPkg();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES:
				return getOwnedComponentExchanges();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return getOwnedComponentExchangeCategories();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTIONAL_LINKS:
				return getOwnedFunctionalLinks();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTIONAL_ALLOCATIONS:
				return getOwnedFunctionalAllocations();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return getOwnedComponentExchangeRealizations();
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
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTION_PKG:
				setOwnedFunctionPkg((FunctionPkg)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES:
				getOwnedComponentExchanges().clear();
				getOwnedComponentExchanges().addAll((Collection<? extends ComponentExchange>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				getOwnedComponentExchangeCategories().clear();
				getOwnedComponentExchangeCategories().addAll((Collection<? extends ComponentExchangeCategory>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTIONAL_LINKS:
				getOwnedFunctionalLinks().clear();
				getOwnedFunctionalLinks().addAll((Collection<? extends ExchangeLink>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTIONAL_ALLOCATIONS:
				getOwnedFunctionalAllocations().clear();
				getOwnedFunctionalAllocations().addAll((Collection<? extends ComponentFunctionalAllocation>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				getOwnedComponentExchangeRealizations().clear();
				getOwnedComponentExchangeRealizations().addAll((Collection<? extends ComponentExchangeRealization>)newValue);
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
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__NAMING_RULES:
				getNamingRules().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTION_PKG:
				setOwnedFunctionPkg((FunctionPkg)null);
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES:
				getOwnedComponentExchanges().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				getOwnedComponentExchangeCategories().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTIONAL_LINKS:
				getOwnedFunctionalLinks().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTIONAL_ALLOCATIONS:
				getOwnedFunctionalAllocations().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				getOwnedComponentExchangeRealizations().clear();
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
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTION_PKG:
				return ownedFunctionPkg != null;
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES:
				return ownedComponentExchanges != null && !ownedComponentExchanges.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return ownedComponentExchangeCategories != null && !ownedComponentExchangeCategories.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTIONAL_LINKS:
				return ownedFunctionalLinks != null && !ownedFunctionalLinks.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTIONAL_ALLOCATIONS:
				return ownedFunctionalAllocations != null && !ownedFunctionalAllocations.isEmpty();
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return ownedComponentExchangeRealizations != null && !ownedComponentExchangeRealizations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractFunctionalArchitectureImpl
