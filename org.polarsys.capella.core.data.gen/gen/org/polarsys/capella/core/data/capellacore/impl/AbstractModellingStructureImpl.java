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

import org.polarsys.capella.core.data.capellacore.AbstractModellingStructure;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.ModellingArchitecture;
import org.polarsys.capella.core.data.capellacore.ModellingArchitecturePkg;
import org.polarsys.capella.core.data.capellacore.NamingRule;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellacore.ReuseLink;
import org.polarsys.capella.core.data.capellacore.Trace;

import org.polarsys.capella.core.data.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Modelling Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractModellingStructureImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractModellingStructureImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractModellingStructureImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractModellingStructureImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractModellingStructureImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractModellingStructureImpl#getReuseLinks <em>Reuse Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractModellingStructureImpl#getOwnedReuseLinks <em>Owned Reuse Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractModellingStructureImpl#getOwnedArchitectures <em>Owned Architectures</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.AbstractModellingStructureImpl#getOwnedArchitecturePkgs <em>Owned Architecture Pkgs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractModellingStructureImpl extends NamedElementImpl implements AbstractModellingStructure {
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
	 * The cached value of the '{@link #getReuseLinks() <em>Reuse Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReuseLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ReuseLink> reuseLinks;

	/**
	 * The cached value of the '{@link #getOwnedReuseLinks() <em>Owned Reuse Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReuseLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ReuseLink> ownedReuseLinks;

	/**
	 * The cached value of the '{@link #getOwnedArchitectures() <em>Owned Architectures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<ModellingArchitecture> ownedArchitectures;

	/**
	 * The cached value of the '{@link #getOwnedArchitecturePkgs() <em>Owned Architecture Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedArchitecturePkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<ModellingArchitecturePkg> ownedArchitecturePkgs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractModellingStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacorePackage.Literals.ABSTRACT_MODELLING_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_TRACES);
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
			containedGenericTraces = new EObjectResolvingEList<GenericTrace>(GenericTrace.class, this, CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__CONTAINED_GENERIC_TRACES);
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
			containedRequirementsTraces = new EObjectResolvingEList<RequirementsTrace>(RequirementsTrace.class, this, CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__CONTAINED_REQUIREMENTS_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__NAMING_RULES);
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
			ownedPropertyValuePkgs = new EObjectContainmentEList.Resolving<PropertyValuePkg>(PropertyValuePkg.class, this, CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReuseLink> getReuseLinks() {
		if (reuseLinks == null) {
			reuseLinks = new EObjectResolvingEList<ReuseLink>(ReuseLink.class, this, CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__REUSE_LINKS);
		}
		return reuseLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReuseLink> getOwnedReuseLinks() {
		if (ownedReuseLinks == null) {
			ownedReuseLinks = new EObjectContainmentEList<ReuseLink>(ReuseLink.class, this, CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_REUSE_LINKS);
		}
		return ownedReuseLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModellingArchitecture> getOwnedArchitectures() {
		if (ownedArchitectures == null) {
			ownedArchitectures = new EObjectContainmentEList.Resolving<ModellingArchitecture>(ModellingArchitecture.class, this, CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_ARCHITECTURES);
		}
		return ownedArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModellingArchitecturePkg> getOwnedArchitecturePkgs() {
		if (ownedArchitecturePkgs == null) {
			ownedArchitecturePkgs = new EObjectContainmentEList.Resolving<ModellingArchitecturePkg>(ModellingArchitecturePkg.class, this, CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_ARCHITECTURE_PKGS);
		}
		return ownedArchitecturePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_REUSE_LINKS:
				return ((InternalEList<?>)getOwnedReuseLinks()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_ARCHITECTURES:
				return ((InternalEList<?>)getOwnedArchitectures()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_ARCHITECTURE_PKGS:
				return ((InternalEList<?>)getOwnedArchitecturePkgs()).basicRemove(otherEnd, msgs);
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
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_TRACES:
				return getOwnedTraces();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__NAMING_RULES:
				return getNamingRules();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__REUSE_LINKS:
				return getReuseLinks();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_REUSE_LINKS:
				return getOwnedReuseLinks();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_ARCHITECTURES:
				return getOwnedArchitectures();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_ARCHITECTURE_PKGS:
				return getOwnedArchitecturePkgs();
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
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__REUSE_LINKS:
				getReuseLinks().clear();
				getReuseLinks().addAll((Collection<? extends ReuseLink>)newValue);
				return;
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_REUSE_LINKS:
				getOwnedReuseLinks().clear();
				getOwnedReuseLinks().addAll((Collection<? extends ReuseLink>)newValue);
				return;
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_ARCHITECTURES:
				getOwnedArchitectures().clear();
				getOwnedArchitectures().addAll((Collection<? extends ModellingArchitecture>)newValue);
				return;
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_ARCHITECTURE_PKGS:
				getOwnedArchitecturePkgs().clear();
				getOwnedArchitecturePkgs().addAll((Collection<? extends ModellingArchitecturePkg>)newValue);
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
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__NAMING_RULES:
				getNamingRules().clear();
				return;
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__REUSE_LINKS:
				getReuseLinks().clear();
				return;
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_REUSE_LINKS:
				getOwnedReuseLinks().clear();
				return;
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_ARCHITECTURES:
				getOwnedArchitectures().clear();
				return;
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_ARCHITECTURE_PKGS:
				getOwnedArchitecturePkgs().clear();
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
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__REUSE_LINKS:
				return reuseLinks != null && !reuseLinks.isEmpty();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_REUSE_LINKS:
				return ownedReuseLinks != null && !ownedReuseLinks.isEmpty();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_ARCHITECTURES:
				return ownedArchitectures != null && !ownedArchitectures.isEmpty();
			case CapellacorePackage.ABSTRACT_MODELLING_STRUCTURE__OWNED_ARCHITECTURE_PKGS:
				return ownedArchitecturePkgs != null && !ownedArchitecturePkgs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractModellingStructureImpl
