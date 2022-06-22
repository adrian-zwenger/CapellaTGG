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

import org.polarsys.capella.core.data.capellacore.KeyValue;
import org.polarsys.capella.core.data.capellacore.NamingRule;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellacore.Trace;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;
import org.polarsys.capella.core.data.capellamodeller.Folder;
import org.polarsys.capella.core.data.capellamodeller.ModelRoot;
import org.polarsys.capella.core.data.capellamodeller.Project;

import org.polarsys.capella.core.data.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.ProjectImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.ProjectImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.ProjectImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.ProjectImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.ProjectImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.ProjectImpl#getKeyValuePairs <em>Key Value Pairs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.ProjectImpl#getOwnedFolders <em>Owned Folders</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.ProjectImpl#getOwnedModelRoots <em>Owned Model Roots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends NamedElementImpl implements Project {
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
	 * The cached value of the '{@link #getKeyValuePairs() <em>Key Value Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyValuePairs()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValue> keyValuePairs;

	/**
	 * The cached value of the '{@link #getOwnedFolders() <em>Owned Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder> ownedFolders;

	/**
	 * The cached value of the '{@link #getOwnedModelRoots() <em>Owned Model Roots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModelRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelRoot> ownedModelRoots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellamodellerPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, CapellamodellerPackage.PROJECT__OWNED_TRACES);
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
			containedGenericTraces = new EObjectResolvingEList<GenericTrace>(GenericTrace.class, this, CapellamodellerPackage.PROJECT__CONTAINED_GENERIC_TRACES);
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
			containedRequirementsTraces = new EObjectResolvingEList<RequirementsTrace>(RequirementsTrace.class, this, CapellamodellerPackage.PROJECT__CONTAINED_REQUIREMENTS_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, CapellamodellerPackage.PROJECT__NAMING_RULES);
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
			ownedPropertyValuePkgs = new EObjectContainmentEList.Resolving<PropertyValuePkg>(PropertyValuePkg.class, this, CapellamodellerPackage.PROJECT__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeyValue> getKeyValuePairs() {
		if (keyValuePairs == null) {
			keyValuePairs = new EObjectContainmentEList<KeyValue>(KeyValue.class, this, CapellamodellerPackage.PROJECT__KEY_VALUE_PAIRS);
		}
		return keyValuePairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Folder> getOwnedFolders() {
		if (ownedFolders == null) {
			ownedFolders = new EObjectContainmentEList.Resolving<Folder>(Folder.class, this, CapellamodellerPackage.PROJECT__OWNED_FOLDERS);
		}
		return ownedFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelRoot> getOwnedModelRoots() {
		if (ownedModelRoots == null) {
			ownedModelRoots = new EObjectContainmentEList.Resolving<ModelRoot>(ModelRoot.class, this, CapellamodellerPackage.PROJECT__OWNED_MODEL_ROOTS);
		}
		return ownedModelRoots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellamodellerPackage.PROJECT__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.PROJECT__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.PROJECT__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.PROJECT__KEY_VALUE_PAIRS:
				return ((InternalEList<?>)getKeyValuePairs()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.PROJECT__OWNED_FOLDERS:
				return ((InternalEList<?>)getOwnedFolders()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.PROJECT__OWNED_MODEL_ROOTS:
				return ((InternalEList<?>)getOwnedModelRoots()).basicRemove(otherEnd, msgs);
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
			case CapellamodellerPackage.PROJECT__OWNED_TRACES:
				return getOwnedTraces();
			case CapellamodellerPackage.PROJECT__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case CapellamodellerPackage.PROJECT__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case CapellamodellerPackage.PROJECT__NAMING_RULES:
				return getNamingRules();
			case CapellamodellerPackage.PROJECT__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case CapellamodellerPackage.PROJECT__KEY_VALUE_PAIRS:
				return getKeyValuePairs();
			case CapellamodellerPackage.PROJECT__OWNED_FOLDERS:
				return getOwnedFolders();
			case CapellamodellerPackage.PROJECT__OWNED_MODEL_ROOTS:
				return getOwnedModelRoots();
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
			case CapellamodellerPackage.PROJECT__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case CapellamodellerPackage.PROJECT__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case CapellamodellerPackage.PROJECT__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case CapellamodellerPackage.PROJECT__KEY_VALUE_PAIRS:
				getKeyValuePairs().clear();
				getKeyValuePairs().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case CapellamodellerPackage.PROJECT__OWNED_FOLDERS:
				getOwnedFolders().clear();
				getOwnedFolders().addAll((Collection<? extends Folder>)newValue);
				return;
			case CapellamodellerPackage.PROJECT__OWNED_MODEL_ROOTS:
				getOwnedModelRoots().clear();
				getOwnedModelRoots().addAll((Collection<? extends ModelRoot>)newValue);
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
			case CapellamodellerPackage.PROJECT__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case CapellamodellerPackage.PROJECT__NAMING_RULES:
				getNamingRules().clear();
				return;
			case CapellamodellerPackage.PROJECT__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case CapellamodellerPackage.PROJECT__KEY_VALUE_PAIRS:
				getKeyValuePairs().clear();
				return;
			case CapellamodellerPackage.PROJECT__OWNED_FOLDERS:
				getOwnedFolders().clear();
				return;
			case CapellamodellerPackage.PROJECT__OWNED_MODEL_ROOTS:
				getOwnedModelRoots().clear();
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
			case CapellamodellerPackage.PROJECT__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case CapellamodellerPackage.PROJECT__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case CapellamodellerPackage.PROJECT__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case CapellamodellerPackage.PROJECT__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case CapellamodellerPackage.PROJECT__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case CapellamodellerPackage.PROJECT__KEY_VALUE_PAIRS:
				return keyValuePairs != null && !keyValuePairs.isEmpty();
			case CapellamodellerPackage.PROJECT__OWNED_FOLDERS:
				return ownedFolders != null && !ownedFolders.isEmpty();
			case CapellamodellerPackage.PROJECT__OWNED_MODEL_ROOTS:
				return ownedModelRoots != null && !ownedModelRoots.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
