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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.cs.impl.ComponentArchitectureImpl;

import org.polarsys.capella.core.data.ctx.CapabilityPkg;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.MissionPkg;
import org.polarsys.capella.core.data.ctx.OperationalAnalysisRealization;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;
import org.polarsys.capella.core.data.ctx.SystemFunctionPkg;

import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.la.LogicalArchitecture;

import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemAnalysisImpl#getOwnedSystemComponentPkg <em>Owned System Component Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemAnalysisImpl#getOwnedMissionPkg <em>Owned Mission Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemAnalysisImpl#getContainedCapabilityPkg <em>Contained Capability Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemAnalysisImpl#getContainedSystemFunctionPkg <em>Contained System Function Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemAnalysisImpl#getOwnedOperationalAnalysisRealizations <em>Owned Operational Analysis Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemAnalysisImpl#getAllocatedOperationalAnalysisRealizations <em>Allocated Operational Analysis Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemAnalysisImpl#getAllocatedOperationalAnalyses <em>Allocated Operational Analyses</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.SystemAnalysisImpl#getAllocatingLogicalArchitectures <em>Allocating Logical Architectures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemAnalysisImpl extends ComponentArchitectureImpl implements SystemAnalysis {
	/**
	 * The cached value of the '{@link #getOwnedSystemComponentPkg() <em>Owned System Component Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemComponentPkg()
	 * @generated
	 * @ordered
	 */
	protected SystemComponentPkg ownedSystemComponentPkg;

	/**
	 * The cached value of the '{@link #getOwnedMissionPkg() <em>Owned Mission Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMissionPkg()
	 * @generated
	 * @ordered
	 */
	protected MissionPkg ownedMissionPkg;

	/**
	 * The cached value of the '{@link #getContainedCapabilityPkg() <em>Contained Capability Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedCapabilityPkg()
	 * @generated
	 * @ordered
	 */
	protected CapabilityPkg containedCapabilityPkg;

	/**
	 * The cached value of the '{@link #getContainedSystemFunctionPkg() <em>Contained System Function Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedSystemFunctionPkg()
	 * @generated
	 * @ordered
	 */
	protected SystemFunctionPkg containedSystemFunctionPkg;

	/**
	 * The cached value of the '{@link #getOwnedOperationalAnalysisRealizations() <em>Owned Operational Analysis Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationalAnalysisRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalAnalysisRealization> ownedOperationalAnalysisRealizations;

	/**
	 * The cached value of the '{@link #getAllocatedOperationalAnalysisRealizations() <em>Allocated Operational Analysis Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedOperationalAnalysisRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalAnalysisRealization> allocatedOperationalAnalysisRealizations;

	/**
	 * The cached value of the '{@link #getAllocatedOperationalAnalyses() <em>Allocated Operational Analyses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedOperationalAnalyses()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalAnalysis> allocatedOperationalAnalyses;

	/**
	 * The cached value of the '{@link #getAllocatingLogicalArchitectures() <em>Allocating Logical Architectures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingLogicalArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalArchitecture> allocatingLogicalArchitectures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.SYSTEM_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemComponentPkg getOwnedSystemComponentPkg() {
		if (ownedSystemComponentPkg != null && ownedSystemComponentPkg.eIsProxy()) {
			InternalEObject oldOwnedSystemComponentPkg = (InternalEObject)ownedSystemComponentPkg;
			ownedSystemComponentPkg = (SystemComponentPkg)eResolveProxy(oldOwnedSystemComponentPkg);
			if (ownedSystemComponentPkg != oldOwnedSystemComponentPkg) {
				InternalEObject newOwnedSystemComponentPkg = (InternalEObject)ownedSystemComponentPkg;
				NotificationChain msgs = oldOwnedSystemComponentPkg.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_COMPONENT_PKG, null, null);
				if (newOwnedSystemComponentPkg.eInternalContainer() == null) {
					msgs = newOwnedSystemComponentPkg.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_COMPONENT_PKG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_COMPONENT_PKG, oldOwnedSystemComponentPkg, ownedSystemComponentPkg));
			}
		}
		return ownedSystemComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentPkg basicGetOwnedSystemComponentPkg() {
		return ownedSystemComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedSystemComponentPkg(SystemComponentPkg newOwnedSystemComponentPkg, NotificationChain msgs) {
		SystemComponentPkg oldOwnedSystemComponentPkg = ownedSystemComponentPkg;
		ownedSystemComponentPkg = newOwnedSystemComponentPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_COMPONENT_PKG, oldOwnedSystemComponentPkg, newOwnedSystemComponentPkg);
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
	public void setOwnedSystemComponentPkg(SystemComponentPkg newOwnedSystemComponentPkg) {
		if (newOwnedSystemComponentPkg != ownedSystemComponentPkg) {
			NotificationChain msgs = null;
			if (ownedSystemComponentPkg != null)
				msgs = ((InternalEObject)ownedSystemComponentPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_COMPONENT_PKG, null, msgs);
			if (newOwnedSystemComponentPkg != null)
				msgs = ((InternalEObject)newOwnedSystemComponentPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_COMPONENT_PKG, null, msgs);
			msgs = basicSetOwnedSystemComponentPkg(newOwnedSystemComponentPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_COMPONENT_PKG, newOwnedSystemComponentPkg, newOwnedSystemComponentPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionPkg getOwnedMissionPkg() {
		if (ownedMissionPkg != null && ownedMissionPkg.eIsProxy()) {
			InternalEObject oldOwnedMissionPkg = (InternalEObject)ownedMissionPkg;
			ownedMissionPkg = (MissionPkg)eResolveProxy(oldOwnedMissionPkg);
			if (ownedMissionPkg != oldOwnedMissionPkg) {
				InternalEObject newOwnedMissionPkg = (InternalEObject)ownedMissionPkg;
				NotificationChain msgs = oldOwnedMissionPkg.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, null, null);
				if (newOwnedMissionPkg.eInternalContainer() == null) {
					msgs = newOwnedMissionPkg.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, oldOwnedMissionPkg, ownedMissionPkg));
			}
		}
		return ownedMissionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionPkg basicGetOwnedMissionPkg() {
		return ownedMissionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMissionPkg(MissionPkg newOwnedMissionPkg, NotificationChain msgs) {
		MissionPkg oldOwnedMissionPkg = ownedMissionPkg;
		ownedMissionPkg = newOwnedMissionPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, oldOwnedMissionPkg, newOwnedMissionPkg);
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
	public void setOwnedMissionPkg(MissionPkg newOwnedMissionPkg) {
		if (newOwnedMissionPkg != ownedMissionPkg) {
			NotificationChain msgs = null;
			if (ownedMissionPkg != null)
				msgs = ((InternalEObject)ownedMissionPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, null, msgs);
			if (newOwnedMissionPkg != null)
				msgs = ((InternalEObject)newOwnedMissionPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, null, msgs);
			msgs = basicSetOwnedMissionPkg(newOwnedMissionPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, newOwnedMissionPkg, newOwnedMissionPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityPkg getContainedCapabilityPkg() {
		if (containedCapabilityPkg != null && containedCapabilityPkg.eIsProxy()) {
			InternalEObject oldContainedCapabilityPkg = (InternalEObject)containedCapabilityPkg;
			containedCapabilityPkg = (CapabilityPkg)eResolveProxy(oldContainedCapabilityPkg);
			if (containedCapabilityPkg != oldContainedCapabilityPkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxPackage.SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG, oldContainedCapabilityPkg, containedCapabilityPkg));
			}
		}
		return containedCapabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPkg basicGetContainedCapabilityPkg() {
		return containedCapabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemFunctionPkg getContainedSystemFunctionPkg() {
		if (containedSystemFunctionPkg != null && containedSystemFunctionPkg.eIsProxy()) {
			InternalEObject oldContainedSystemFunctionPkg = (InternalEObject)containedSystemFunctionPkg;
			containedSystemFunctionPkg = (SystemFunctionPkg)eResolveProxy(oldContainedSystemFunctionPkg);
			if (containedSystemFunctionPkg != oldContainedSystemFunctionPkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxPackage.SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG, oldContainedSystemFunctionPkg, containedSystemFunctionPkg));
			}
		}
		return containedSystemFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionPkg basicGetContainedSystemFunctionPkg() {
		return containedSystemFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalAnalysisRealization> getOwnedOperationalAnalysisRealizations() {
		if (ownedOperationalAnalysisRealizations == null) {
			ownedOperationalAnalysisRealizations = new EObjectContainmentEList.Resolving<OperationalAnalysisRealization>(OperationalAnalysisRealization.class, this, CtxPackage.SYSTEM_ANALYSIS__OWNED_OPERATIONAL_ANALYSIS_REALIZATIONS);
		}
		return ownedOperationalAnalysisRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalAnalysisRealization> getAllocatedOperationalAnalysisRealizations() {
		if (allocatedOperationalAnalysisRealizations == null) {
			allocatedOperationalAnalysisRealizations = new EObjectResolvingEList<OperationalAnalysisRealization>(OperationalAnalysisRealization.class, this, CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSIS_REALIZATIONS);
		}
		return allocatedOperationalAnalysisRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalAnalysis> getAllocatedOperationalAnalyses() {
		if (allocatedOperationalAnalyses == null) {
			allocatedOperationalAnalyses = new EObjectWithInverseResolvingEList.ManyInverse<OperationalAnalysis>(OperationalAnalysis.class, this, CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES, OaPackage.OPERATIONAL_ANALYSIS__ALLOCATING_SYSTEM_ANALYSES);
		}
		return allocatedOperationalAnalyses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalArchitecture> getAllocatingLogicalArchitectures() {
		if (allocatingLogicalArchitectures == null) {
			allocatingLogicalArchitectures = new EObjectWithInverseResolvingEList.ManyInverse<LogicalArchitecture>(LogicalArchitecture.class, this, CtxPackage.SYSTEM_ANALYSIS__ALLOCATING_LOGICAL_ARCHITECTURES, LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES);
		}
		return allocatingLogicalArchitectures;
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
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatedOperationalAnalyses()).basicAdd(otherEnd, msgs);
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATING_LOGICAL_ARCHITECTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatingLogicalArchitectures()).basicAdd(otherEnd, msgs);
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
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_COMPONENT_PKG:
				return basicSetOwnedSystemComponentPkg(null, msgs);
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				return basicSetOwnedMissionPkg(null, msgs);
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_OPERATIONAL_ANALYSIS_REALIZATIONS:
				return ((InternalEList<?>)getOwnedOperationalAnalysisRealizations()).basicRemove(otherEnd, msgs);
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES:
				return ((InternalEList<?>)getAllocatedOperationalAnalyses()).basicRemove(otherEnd, msgs);
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATING_LOGICAL_ARCHITECTURES:
				return ((InternalEList<?>)getAllocatingLogicalArchitectures()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_COMPONENT_PKG:
				if (resolve) return getOwnedSystemComponentPkg();
				return basicGetOwnedSystemComponentPkg();
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				if (resolve) return getOwnedMissionPkg();
				return basicGetOwnedMissionPkg();
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG:
				if (resolve) return getContainedCapabilityPkg();
				return basicGetContainedCapabilityPkg();
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG:
				if (resolve) return getContainedSystemFunctionPkg();
				return basicGetContainedSystemFunctionPkg();
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_OPERATIONAL_ANALYSIS_REALIZATIONS:
				return getOwnedOperationalAnalysisRealizations();
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSIS_REALIZATIONS:
				return getAllocatedOperationalAnalysisRealizations();
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES:
				return getAllocatedOperationalAnalyses();
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATING_LOGICAL_ARCHITECTURES:
				return getAllocatingLogicalArchitectures();
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
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_COMPONENT_PKG:
				setOwnedSystemComponentPkg((SystemComponentPkg)newValue);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				setOwnedMissionPkg((MissionPkg)newValue);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_OPERATIONAL_ANALYSIS_REALIZATIONS:
				getOwnedOperationalAnalysisRealizations().clear();
				getOwnedOperationalAnalysisRealizations().addAll((Collection<? extends OperationalAnalysisRealization>)newValue);
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
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_COMPONENT_PKG:
				setOwnedSystemComponentPkg((SystemComponentPkg)null);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				setOwnedMissionPkg((MissionPkg)null);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_OPERATIONAL_ANALYSIS_REALIZATIONS:
				getOwnedOperationalAnalysisRealizations().clear();
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
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_COMPONENT_PKG:
				return ownedSystemComponentPkg != null;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				return ownedMissionPkg != null;
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG:
				return containedCapabilityPkg != null;
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG:
				return containedSystemFunctionPkg != null;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_OPERATIONAL_ANALYSIS_REALIZATIONS:
				return ownedOperationalAnalysisRealizations != null && !ownedOperationalAnalysisRealizations.isEmpty();
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSIS_REALIZATIONS:
				return allocatedOperationalAnalysisRealizations != null && !allocatedOperationalAnalysisRealizations.isEmpty();
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES:
				return allocatedOperationalAnalyses != null && !allocatedOperationalAnalyses.isEmpty();
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATING_LOGICAL_ARCHITECTURES:
				return allocatingLogicalArchitectures != null && !allocatingLogicalArchitectures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemAnalysisImpl
