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
package org.polarsys.capella.core.data.la.impl;

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

import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.data.la.CapabilityRealizationPkg;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalComponentPkg;
import org.polarsys.capella.core.data.la.LogicalFunctionPkg;
import org.polarsys.capella.core.data.la.SystemAnalysisRealization;

import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.LogicalArchitectureImpl#getOwnedLogicalComponentPkg <em>Owned Logical Component Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.LogicalArchitectureImpl#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.LogicalArchitectureImpl#getContainedLogicalFunctionPkg <em>Contained Logical Function Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.LogicalArchitectureImpl#getOwnedSystemAnalysisRealizations <em>Owned System Analysis Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.LogicalArchitectureImpl#getAllocatedSystemAnalysisRealizations <em>Allocated System Analysis Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.LogicalArchitectureImpl#getAllocatedSystemAnalyses <em>Allocated System Analyses</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.la.impl.LogicalArchitectureImpl#getAllocatingPhysicalArchitectures <em>Allocating Physical Architectures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalArchitectureImpl extends ComponentArchitectureImpl implements LogicalArchitecture {
	/**
	 * The cached value of the '{@link #getOwnedLogicalComponentPkg() <em>Owned Logical Component Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalComponentPkg()
	 * @generated
	 * @ordered
	 */
	protected LogicalComponentPkg ownedLogicalComponentPkg;

	/**
	 * The cached value of the '{@link #getContainedCapabilityRealizationPkg() <em>Contained Capability Realization Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedCapabilityRealizationPkg()
	 * @generated
	 * @ordered
	 */
	protected CapabilityRealizationPkg containedCapabilityRealizationPkg;

	/**
	 * The cached value of the '{@link #getContainedLogicalFunctionPkg() <em>Contained Logical Function Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedLogicalFunctionPkg()
	 * @generated
	 * @ordered
	 */
	protected LogicalFunctionPkg containedLogicalFunctionPkg;

	/**
	 * The cached value of the '{@link #getOwnedSystemAnalysisRealizations() <em>Owned System Analysis Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemAnalysisRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemAnalysisRealization> ownedSystemAnalysisRealizations;

	/**
	 * The cached value of the '{@link #getAllocatedSystemAnalysisRealizations() <em>Allocated System Analysis Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedSystemAnalysisRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemAnalysisRealization> allocatedSystemAnalysisRealizations;

	/**
	 * The cached value of the '{@link #getAllocatedSystemAnalyses() <em>Allocated System Analyses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedSystemAnalyses()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemAnalysis> allocatedSystemAnalyses;

	/**
	 * The cached value of the '{@link #getAllocatingPhysicalArchitectures() <em>Allocating Physical Architectures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingPhysicalArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalArchitecture> allocatingPhysicalArchitectures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaPackage.Literals.LOGICAL_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalComponentPkg getOwnedLogicalComponentPkg() {
		if (ownedLogicalComponentPkg != null && ownedLogicalComponentPkg.eIsProxy()) {
			InternalEObject oldOwnedLogicalComponentPkg = (InternalEObject)ownedLogicalComponentPkg;
			ownedLogicalComponentPkg = (LogicalComponentPkg)eResolveProxy(oldOwnedLogicalComponentPkg);
			if (ownedLogicalComponentPkg != oldOwnedLogicalComponentPkg) {
				InternalEObject newOwnedLogicalComponentPkg = (InternalEObject)ownedLogicalComponentPkg;
				NotificationChain msgs = oldOwnedLogicalComponentPkg.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, null, null);
				if (newOwnedLogicalComponentPkg.eInternalContainer() == null) {
					msgs = newOwnedLogicalComponentPkg.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, oldOwnedLogicalComponentPkg, ownedLogicalComponentPkg));
			}
		}
		return ownedLogicalComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComponentPkg basicGetOwnedLogicalComponentPkg() {
		return ownedLogicalComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedLogicalComponentPkg(LogicalComponentPkg newOwnedLogicalComponentPkg, NotificationChain msgs) {
		LogicalComponentPkg oldOwnedLogicalComponentPkg = ownedLogicalComponentPkg;
		ownedLogicalComponentPkg = newOwnedLogicalComponentPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, oldOwnedLogicalComponentPkg, newOwnedLogicalComponentPkg);
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
	public void setOwnedLogicalComponentPkg(LogicalComponentPkg newOwnedLogicalComponentPkg) {
		if (newOwnedLogicalComponentPkg != ownedLogicalComponentPkg) {
			NotificationChain msgs = null;
			if (ownedLogicalComponentPkg != null)
				msgs = ((InternalEObject)ownedLogicalComponentPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, null, msgs);
			if (newOwnedLogicalComponentPkg != null)
				msgs = ((InternalEObject)newOwnedLogicalComponentPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, null, msgs);
			msgs = basicSetOwnedLogicalComponentPkg(newOwnedLogicalComponentPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, newOwnedLogicalComponentPkg, newOwnedLogicalComponentPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityRealizationPkg getContainedCapabilityRealizationPkg() {
		if (containedCapabilityRealizationPkg != null && containedCapabilityRealizationPkg.eIsProxy()) {
			InternalEObject oldContainedCapabilityRealizationPkg = (InternalEObject)containedCapabilityRealizationPkg;
			containedCapabilityRealizationPkg = (CapabilityRealizationPkg)eResolveProxy(oldContainedCapabilityRealizationPkg);
			if (containedCapabilityRealizationPkg != oldContainedCapabilityRealizationPkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG, oldContainedCapabilityRealizationPkg, containedCapabilityRealizationPkg));
			}
		}
		return containedCapabilityRealizationPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRealizationPkg basicGetContainedCapabilityRealizationPkg() {
		return containedCapabilityRealizationPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalFunctionPkg getContainedLogicalFunctionPkg() {
		if (containedLogicalFunctionPkg != null && containedLogicalFunctionPkg.eIsProxy()) {
			InternalEObject oldContainedLogicalFunctionPkg = (InternalEObject)containedLogicalFunctionPkg;
			containedLogicalFunctionPkg = (LogicalFunctionPkg)eResolveProxy(oldContainedLogicalFunctionPkg);
			if (containedLogicalFunctionPkg != oldContainedLogicalFunctionPkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG, oldContainedLogicalFunctionPkg, containedLogicalFunctionPkg));
			}
		}
		return containedLogicalFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFunctionPkg basicGetContainedLogicalFunctionPkg() {
		return containedLogicalFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemAnalysisRealization> getOwnedSystemAnalysisRealizations() {
		if (ownedSystemAnalysisRealizations == null) {
			ownedSystemAnalysisRealizations = new EObjectContainmentEList.Resolving<SystemAnalysisRealization>(SystemAnalysisRealization.class, this, LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS);
		}
		return ownedSystemAnalysisRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemAnalysisRealization> getAllocatedSystemAnalysisRealizations() {
		if (allocatedSystemAnalysisRealizations == null) {
			allocatedSystemAnalysisRealizations = new EObjectResolvingEList<SystemAnalysisRealization>(SystemAnalysisRealization.class, this, LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSIS_REALIZATIONS);
		}
		return allocatedSystemAnalysisRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemAnalysis> getAllocatedSystemAnalyses() {
		if (allocatedSystemAnalyses == null) {
			allocatedSystemAnalyses = new EObjectWithInverseResolvingEList.ManyInverse<SystemAnalysis>(SystemAnalysis.class, this, LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES, CtxPackage.SYSTEM_ANALYSIS__ALLOCATING_LOGICAL_ARCHITECTURES);
		}
		return allocatedSystemAnalyses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalArchitecture> getAllocatingPhysicalArchitectures() {
		if (allocatingPhysicalArchitectures == null) {
			allocatingPhysicalArchitectures = new EObjectWithInverseResolvingEList.ManyInverse<PhysicalArchitecture>(PhysicalArchitecture.class, this, LaPackage.LOGICAL_ARCHITECTURE__ALLOCATING_PHYSICAL_ARCHITECTURES, PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES);
		}
		return allocatingPhysicalArchitectures;
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
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatedSystemAnalyses()).basicAdd(otherEnd, msgs);
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATING_PHYSICAL_ARCHITECTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatingPhysicalArchitectures()).basicAdd(otherEnd, msgs);
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
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				return basicSetOwnedLogicalComponentPkg(null, msgs);
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS:
				return ((InternalEList<?>)getOwnedSystemAnalysisRealizations()).basicRemove(otherEnd, msgs);
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES:
				return ((InternalEList<?>)getAllocatedSystemAnalyses()).basicRemove(otherEnd, msgs);
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATING_PHYSICAL_ARCHITECTURES:
				return ((InternalEList<?>)getAllocatingPhysicalArchitectures()).basicRemove(otherEnd, msgs);
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
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				if (resolve) return getOwnedLogicalComponentPkg();
				return basicGetOwnedLogicalComponentPkg();
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				if (resolve) return getContainedCapabilityRealizationPkg();
				return basicGetContainedCapabilityRealizationPkg();
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG:
				if (resolve) return getContainedLogicalFunctionPkg();
				return basicGetContainedLogicalFunctionPkg();
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS:
				return getOwnedSystemAnalysisRealizations();
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSIS_REALIZATIONS:
				return getAllocatedSystemAnalysisRealizations();
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES:
				return getAllocatedSystemAnalyses();
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATING_PHYSICAL_ARCHITECTURES:
				return getAllocatingPhysicalArchitectures();
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
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				setOwnedLogicalComponentPkg((LogicalComponentPkg)newValue);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS:
				getOwnedSystemAnalysisRealizations().clear();
				getOwnedSystemAnalysisRealizations().addAll((Collection<? extends SystemAnalysisRealization>)newValue);
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
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				setOwnedLogicalComponentPkg((LogicalComponentPkg)null);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS:
				getOwnedSystemAnalysisRealizations().clear();
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
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				return ownedLogicalComponentPkg != null;
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				return containedCapabilityRealizationPkg != null;
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG:
				return containedLogicalFunctionPkg != null;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS:
				return ownedSystemAnalysisRealizations != null && !ownedSystemAnalysisRealizations.isEmpty();
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSIS_REALIZATIONS:
				return allocatedSystemAnalysisRealizations != null && !allocatedSystemAnalysisRealizations.isEmpty();
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES:
				return allocatedSystemAnalyses != null && !allocatedSystemAnalyses.isEmpty();
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATING_PHYSICAL_ARCHITECTURES:
				return allocatingPhysicalArchitectures != null && !allocatingPhysicalArchitectures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalArchitectureImpl
