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
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacommon.GenericTrace;

import org.polarsys.capella.core.data.capellacore.NamingRule;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellacore.Trace;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.Mission;
import org.polarsys.capella.core.data.ctx.MissionPkg;

import org.polarsys.capella.core.data.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionPkgImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionPkgImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionPkgImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionPkgImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionPkgImpl#getOwnedMissionPkgs <em>Owned Mission Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionPkgImpl#getOwnedMissions <em>Owned Missions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionPkgImpl extends NamedElementImpl implements MissionPkg {
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
	 * The cached value of the '{@link #getOwnedMissionPkgs() <em>Owned Mission Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMissionPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<MissionPkg> ownedMissionPkgs;

	/**
	 * The cached value of the '{@link #getOwnedMissions() <em>Owned Missions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Mission> ownedMissions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.MISSION_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, CtxPackage.MISSION_PKG__OWNED_TRACES);
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
			containedGenericTraces = new EObjectResolvingEList<GenericTrace>(GenericTrace.class, this, CtxPackage.MISSION_PKG__CONTAINED_GENERIC_TRACES);
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
			containedRequirementsTraces = new EObjectResolvingEList<RequirementsTrace>(RequirementsTrace.class, this, CtxPackage.MISSION_PKG__CONTAINED_REQUIREMENTS_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, CtxPackage.MISSION_PKG__NAMING_RULES);
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
			ownedPropertyValuePkgs = new EObjectContainmentEList.Resolving<PropertyValuePkg>(PropertyValuePkg.class, this, CtxPackage.MISSION_PKG__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MissionPkg> getOwnedMissionPkgs() {
		if (ownedMissionPkgs == null) {
			ownedMissionPkgs = new EObjectContainmentEList.Resolving<MissionPkg>(MissionPkg.class, this, CtxPackage.MISSION_PKG__OWNED_MISSION_PKGS);
		}
		return ownedMissionPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mission> getOwnedMissions() {
		if (ownedMissions == null) {
			ownedMissions = new EObjectContainmentEList<Mission>(Mission.class, this, CtxPackage.MISSION_PKG__OWNED_MISSIONS);
		}
		return ownedMissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxPackage.MISSION_PKG__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case CtxPackage.MISSION_PKG__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case CtxPackage.MISSION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case CtxPackage.MISSION_PKG__OWNED_MISSION_PKGS:
				return ((InternalEList<?>)getOwnedMissionPkgs()).basicRemove(otherEnd, msgs);
			case CtxPackage.MISSION_PKG__OWNED_MISSIONS:
				return ((InternalEList<?>)getOwnedMissions()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.MISSION_PKG__OWNED_TRACES:
				return getOwnedTraces();
			case CtxPackage.MISSION_PKG__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case CtxPackage.MISSION_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case CtxPackage.MISSION_PKG__NAMING_RULES:
				return getNamingRules();
			case CtxPackage.MISSION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case CtxPackage.MISSION_PKG__OWNED_MISSION_PKGS:
				return getOwnedMissionPkgs();
			case CtxPackage.MISSION_PKG__OWNED_MISSIONS:
				return getOwnedMissions();
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
			case CtxPackage.MISSION_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case CtxPackage.MISSION_PKG__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case CtxPackage.MISSION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case CtxPackage.MISSION_PKG__OWNED_MISSION_PKGS:
				getOwnedMissionPkgs().clear();
				getOwnedMissionPkgs().addAll((Collection<? extends MissionPkg>)newValue);
				return;
			case CtxPackage.MISSION_PKG__OWNED_MISSIONS:
				getOwnedMissions().clear();
				getOwnedMissions().addAll((Collection<? extends Mission>)newValue);
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
			case CtxPackage.MISSION_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case CtxPackage.MISSION_PKG__NAMING_RULES:
				getNamingRules().clear();
				return;
			case CtxPackage.MISSION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case CtxPackage.MISSION_PKG__OWNED_MISSION_PKGS:
				getOwnedMissionPkgs().clear();
				return;
			case CtxPackage.MISSION_PKG__OWNED_MISSIONS:
				getOwnedMissions().clear();
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
			case CtxPackage.MISSION_PKG__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case CtxPackage.MISSION_PKG__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case CtxPackage.MISSION_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case CtxPackage.MISSION_PKG__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case CtxPackage.MISSION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case CtxPackage.MISSION_PKG__OWNED_MISSION_PKGS:
				return ownedMissionPkgs != null && !ownedMissionPkgs.isEmpty();
			case CtxPackage.MISSION_PKG__OWNED_MISSIONS:
				return ownedMissions != null && !ownedMissions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MissionPkgImpl
