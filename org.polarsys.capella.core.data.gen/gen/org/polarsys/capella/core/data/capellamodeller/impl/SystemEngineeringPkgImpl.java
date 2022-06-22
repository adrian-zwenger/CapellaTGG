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
package org.polarsys.capella.core.data.capellamodeller.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacommon.GenericTrace;

import org.polarsys.capella.core.data.capellacore.NamingRule;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellacore.Trace;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineeringPkg;

import org.polarsys.capella.core.data.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Engineering Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.SystemEngineeringPkgImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.SystemEngineeringPkgImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.SystemEngineeringPkgImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.SystemEngineeringPkgImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.SystemEngineeringPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.SystemEngineeringPkgImpl#getOwnedSystemEngineerings <em>Owned System Engineerings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemEngineeringPkgImpl extends NamedElementImpl implements SystemEngineeringPkg {
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
	 * The cached value of the '{@link #getOwnedSystemEngineerings() <em>Owned System Engineerings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemEngineerings()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemEngineering> ownedSystemEngineerings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemEngineeringPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellamodellerPackage.Literals.SYSTEM_ENGINEERING_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_TRACES);
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
			containedGenericTraces = new EObjectResolvingEList<GenericTrace>(GenericTrace.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__CONTAINED_GENERIC_TRACES);
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
			containedRequirementsTraces = new EObjectResolvingEList<RequirementsTrace>(RequirementsTrace.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__CONTAINED_REQUIREMENTS_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__NAMING_RULES);
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
			ownedPropertyValuePkgs = new EObjectContainmentEList.Resolving<PropertyValuePkg>(PropertyValuePkg.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemEngineering> getOwnedSystemEngineerings() {
		if (ownedSystemEngineerings == null) {
			ownedSystemEngineerings = new EObjectContainmentEList<SystemEngineering>(SystemEngineering.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_SYSTEM_ENGINEERINGS);
		}
		return ownedSystemEngineerings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_SYSTEM_ENGINEERINGS:
				return ((InternalEList<?>)getOwnedSystemEngineerings()).basicRemove(otherEnd, msgs);
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
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_TRACES:
				return getOwnedTraces();
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__NAMING_RULES:
				return getNamingRules();
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_SYSTEM_ENGINEERINGS:
				return getOwnedSystemEngineerings();
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
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_SYSTEM_ENGINEERINGS:
				getOwnedSystemEngineerings().clear();
				getOwnedSystemEngineerings().addAll((Collection<? extends SystemEngineering>)newValue);
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
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__NAMING_RULES:
				getNamingRules().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_SYSTEM_ENGINEERINGS:
				getOwnedSystemEngineerings().clear();
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
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG__OWNED_SYSTEM_ENGINEERINGS:
				return ownedSystemEngineerings != null && !ownedSystemEngineerings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemEngineeringPkgImpl
