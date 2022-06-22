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
package org.polarsys.capella.core.data.sharedmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacommon.GenericTrace;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamingRule;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellacore.Trace;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.requirement.RequirementsTrace;

import org.polarsys.capella.core.data.sharedmodel.GenericPkg;
import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.sharedmodel.impl.GenericPkgImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.sharedmodel.impl.GenericPkgImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.sharedmodel.impl.GenericPkgImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.sharedmodel.impl.GenericPkgImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.sharedmodel.impl.GenericPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.sharedmodel.impl.GenericPkgImpl#getSubGenericPkgs <em>Sub Generic Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.sharedmodel.impl.GenericPkgImpl#getCapellaElements <em>Capella Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericPkgImpl extends NamedElementImpl implements GenericPkg {
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
	 * The cached value of the '{@link #getSubGenericPkgs() <em>Sub Generic Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGenericPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericPkg> subGenericPkgs;

	/**
	 * The cached value of the '{@link #getCapellaElements() <em>Capella Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapellaElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CapellaElement> capellaElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SharedmodelPackage.Literals.GENERIC_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, SharedmodelPackage.GENERIC_PKG__OWNED_TRACES);
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
			containedGenericTraces = new EObjectResolvingEList<GenericTrace>(GenericTrace.class, this, SharedmodelPackage.GENERIC_PKG__CONTAINED_GENERIC_TRACES);
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
			containedRequirementsTraces = new EObjectResolvingEList<RequirementsTrace>(RequirementsTrace.class, this, SharedmodelPackage.GENERIC_PKG__CONTAINED_REQUIREMENTS_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, SharedmodelPackage.GENERIC_PKG__NAMING_RULES);
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
			ownedPropertyValuePkgs = new EObjectContainmentEList.Resolving<PropertyValuePkg>(PropertyValuePkg.class, this, SharedmodelPackage.GENERIC_PKG__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GenericPkg> getSubGenericPkgs() {
		if (subGenericPkgs == null) {
			subGenericPkgs = new EObjectContainmentEList<GenericPkg>(GenericPkg.class, this, SharedmodelPackage.GENERIC_PKG__SUB_GENERIC_PKGS);
		}
		return subGenericPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapellaElement> getCapellaElements() {
		if (capellaElements == null) {
			capellaElements = new EObjectContainmentEList<CapellaElement>(CapellaElement.class, this, SharedmodelPackage.GENERIC_PKG__CAPELLA_ELEMENTS);
		}
		return capellaElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SharedmodelPackage.GENERIC_PKG__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case SharedmodelPackage.GENERIC_PKG__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case SharedmodelPackage.GENERIC_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case SharedmodelPackage.GENERIC_PKG__SUB_GENERIC_PKGS:
				return ((InternalEList<?>)getSubGenericPkgs()).basicRemove(otherEnd, msgs);
			case SharedmodelPackage.GENERIC_PKG__CAPELLA_ELEMENTS:
				return ((InternalEList<?>)getCapellaElements()).basicRemove(otherEnd, msgs);
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
			case SharedmodelPackage.GENERIC_PKG__OWNED_TRACES:
				return getOwnedTraces();
			case SharedmodelPackage.GENERIC_PKG__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case SharedmodelPackage.GENERIC_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case SharedmodelPackage.GENERIC_PKG__NAMING_RULES:
				return getNamingRules();
			case SharedmodelPackage.GENERIC_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case SharedmodelPackage.GENERIC_PKG__SUB_GENERIC_PKGS:
				return getSubGenericPkgs();
			case SharedmodelPackage.GENERIC_PKG__CAPELLA_ELEMENTS:
				return getCapellaElements();
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
			case SharedmodelPackage.GENERIC_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case SharedmodelPackage.GENERIC_PKG__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case SharedmodelPackage.GENERIC_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case SharedmodelPackage.GENERIC_PKG__SUB_GENERIC_PKGS:
				getSubGenericPkgs().clear();
				getSubGenericPkgs().addAll((Collection<? extends GenericPkg>)newValue);
				return;
			case SharedmodelPackage.GENERIC_PKG__CAPELLA_ELEMENTS:
				getCapellaElements().clear();
				getCapellaElements().addAll((Collection<? extends CapellaElement>)newValue);
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
			case SharedmodelPackage.GENERIC_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case SharedmodelPackage.GENERIC_PKG__NAMING_RULES:
				getNamingRules().clear();
				return;
			case SharedmodelPackage.GENERIC_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case SharedmodelPackage.GENERIC_PKG__SUB_GENERIC_PKGS:
				getSubGenericPkgs().clear();
				return;
			case SharedmodelPackage.GENERIC_PKG__CAPELLA_ELEMENTS:
				getCapellaElements().clear();
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
			case SharedmodelPackage.GENERIC_PKG__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case SharedmodelPackage.GENERIC_PKG__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case SharedmodelPackage.GENERIC_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case SharedmodelPackage.GENERIC_PKG__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case SharedmodelPackage.GENERIC_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case SharedmodelPackage.GENERIC_PKG__SUB_GENERIC_PKGS:
				return subGenericPkgs != null && !subGenericPkgs.isEmpty();
			case SharedmodelPackage.GENERIC_PKG__CAPELLA_ELEMENTS:
				return capellaElements != null && !capellaElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenericPkgImpl
