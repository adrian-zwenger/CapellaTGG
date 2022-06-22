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
package org.polarsys.capella.core.data.pa.impl;

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

import org.polarsys.capella.core.data.cs.AbstractDeploymentLink;

import org.polarsys.capella.core.data.cs.impl.ComponentArchitectureImpl;

import org.polarsys.capella.core.data.epbs.EPBSArchitecture;

import org.polarsys.capella.core.data.epbs.EpbsPackage;
import org.polarsys.capella.core.data.la.CapabilityRealizationPkg;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.la.LogicalArchitecture;

import org.polarsys.capella.core.data.pa.LogicalArchitectureRealization;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponentPkg;
import org.polarsys.capella.core.data.pa.PhysicalFunctionPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalArchitectureImpl#getOwnedPhysicalComponentPkg <em>Owned Physical Component Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalArchitectureImpl#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalArchitectureImpl#getContainedPhysicalFunctionPkg <em>Contained Physical Function Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalArchitectureImpl#getOwnedDeployments <em>Owned Deployments</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalArchitectureImpl#getOwnedLogicalArchitectureRealizations <em>Owned Logical Architecture Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalArchitectureImpl#getAllocatedLogicalArchitectureRealizations <em>Allocated Logical Architecture Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalArchitectureImpl#getAllocatedLogicalArchitectures <em>Allocated Logical Architectures</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalArchitectureImpl#getAllocatingEpbsArchitectures <em>Allocating Epbs Architectures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalArchitectureImpl extends ComponentArchitectureImpl implements PhysicalArchitecture {
	/**
	 * The cached value of the '{@link #getOwnedPhysicalComponentPkg() <em>Owned Physical Component Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalComponentPkg()
	 * @generated
	 * @ordered
	 */
	protected PhysicalComponentPkg ownedPhysicalComponentPkg;

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
	 * The cached value of the '{@link #getContainedPhysicalFunctionPkg() <em>Contained Physical Function Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPhysicalFunctionPkg()
	 * @generated
	 * @ordered
	 */
	protected PhysicalFunctionPkg containedPhysicalFunctionPkg;

	/**
	 * The cached value of the '{@link #getOwnedDeployments() <em>Owned Deployments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> ownedDeployments;

	/**
	 * The cached value of the '{@link #getOwnedLogicalArchitectureRealizations() <em>Owned Logical Architecture Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalArchitectureRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalArchitectureRealization> ownedLogicalArchitectureRealizations;

	/**
	 * The cached value of the '{@link #getAllocatedLogicalArchitectureRealizations() <em>Allocated Logical Architecture Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedLogicalArchitectureRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalArchitectureRealization> allocatedLogicalArchitectureRealizations;

	/**
	 * The cached value of the '{@link #getAllocatedLogicalArchitectures() <em>Allocated Logical Architectures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedLogicalArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalArchitecture> allocatedLogicalArchitectures;

	/**
	 * The cached value of the '{@link #getAllocatingEpbsArchitectures() <em>Allocating Epbs Architectures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingEpbsArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<EPBSArchitecture> allocatingEpbsArchitectures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalComponentPkg getOwnedPhysicalComponentPkg() {
		if (ownedPhysicalComponentPkg != null && ownedPhysicalComponentPkg.eIsProxy()) {
			InternalEObject oldOwnedPhysicalComponentPkg = (InternalEObject)ownedPhysicalComponentPkg;
			ownedPhysicalComponentPkg = (PhysicalComponentPkg)eResolveProxy(oldOwnedPhysicalComponentPkg);
			if (ownedPhysicalComponentPkg != oldOwnedPhysicalComponentPkg) {
				InternalEObject newOwnedPhysicalComponentPkg = (InternalEObject)ownedPhysicalComponentPkg;
				NotificationChain msgs = oldOwnedPhysicalComponentPkg.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, null, null);
				if (newOwnedPhysicalComponentPkg.eInternalContainer() == null) {
					msgs = newOwnedPhysicalComponentPkg.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, oldOwnedPhysicalComponentPkg, ownedPhysicalComponentPkg));
			}
		}
		return ownedPhysicalComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponentPkg basicGetOwnedPhysicalComponentPkg() {
		return ownedPhysicalComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPhysicalComponentPkg(PhysicalComponentPkg newOwnedPhysicalComponentPkg, NotificationChain msgs) {
		PhysicalComponentPkg oldOwnedPhysicalComponentPkg = ownedPhysicalComponentPkg;
		ownedPhysicalComponentPkg = newOwnedPhysicalComponentPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, oldOwnedPhysicalComponentPkg, newOwnedPhysicalComponentPkg);
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
	public void setOwnedPhysicalComponentPkg(PhysicalComponentPkg newOwnedPhysicalComponentPkg) {
		if (newOwnedPhysicalComponentPkg != ownedPhysicalComponentPkg) {
			NotificationChain msgs = null;
			if (ownedPhysicalComponentPkg != null)
				msgs = ((InternalEObject)ownedPhysicalComponentPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, null, msgs);
			if (newOwnedPhysicalComponentPkg != null)
				msgs = ((InternalEObject)newOwnedPhysicalComponentPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, null, msgs);
			msgs = basicSetOwnedPhysicalComponentPkg(newOwnedPhysicalComponentPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, newOwnedPhysicalComponentPkg, newOwnedPhysicalComponentPkg));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG, oldContainedCapabilityRealizationPkg, containedCapabilityRealizationPkg));
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
	public PhysicalFunctionPkg getContainedPhysicalFunctionPkg() {
		if (containedPhysicalFunctionPkg != null && containedPhysicalFunctionPkg.eIsProxy()) {
			InternalEObject oldContainedPhysicalFunctionPkg = (InternalEObject)containedPhysicalFunctionPkg;
			containedPhysicalFunctionPkg = (PhysicalFunctionPkg)eResolveProxy(oldContainedPhysicalFunctionPkg);
			if (containedPhysicalFunctionPkg != oldContainedPhysicalFunctionPkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG, oldContainedPhysicalFunctionPkg, containedPhysicalFunctionPkg));
			}
		}
		return containedPhysicalFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFunctionPkg basicGetContainedPhysicalFunctionPkg() {
		return containedPhysicalFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractDeploymentLink> getOwnedDeployments() {
		if (ownedDeployments == null) {
			ownedDeployments = new EObjectContainmentEList.Resolving<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS);
		}
		return ownedDeployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalArchitectureRealization> getOwnedLogicalArchitectureRealizations() {
		if (ownedLogicalArchitectureRealizations == null) {
			ownedLogicalArchitectureRealizations = new EObjectContainmentEList.Resolving<LogicalArchitectureRealization>(LogicalArchitectureRealization.class, this, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_LOGICAL_ARCHITECTURE_REALIZATIONS);
		}
		return ownedLogicalArchitectureRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalArchitectureRealization> getAllocatedLogicalArchitectureRealizations() {
		if (allocatedLogicalArchitectureRealizations == null) {
			allocatedLogicalArchitectureRealizations = new EObjectResolvingEList<LogicalArchitectureRealization>(LogicalArchitectureRealization.class, this, PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURE_REALIZATIONS);
		}
		return allocatedLogicalArchitectureRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalArchitecture> getAllocatedLogicalArchitectures() {
		if (allocatedLogicalArchitectures == null) {
			allocatedLogicalArchitectures = new EObjectWithInverseResolvingEList.ManyInverse<LogicalArchitecture>(LogicalArchitecture.class, this, PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES, LaPackage.LOGICAL_ARCHITECTURE__ALLOCATING_PHYSICAL_ARCHITECTURES);
		}
		return allocatedLogicalArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EPBSArchitecture> getAllocatingEpbsArchitectures() {
		if (allocatingEpbsArchitectures == null) {
			allocatingEpbsArchitectures = new EObjectWithInverseResolvingEList.ManyInverse<EPBSArchitecture>(EPBSArchitecture.class, this, PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATING_EPBS_ARCHITECTURES, EpbsPackage.EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURES);
		}
		return allocatingEpbsArchitectures;
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
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatedLogicalArchitectures()).basicAdd(otherEnd, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATING_EPBS_ARCHITECTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatingEpbsArchitectures()).basicAdd(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				return basicSetOwnedPhysicalComponentPkg(null, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				return ((InternalEList<?>)getOwnedDeployments()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_LOGICAL_ARCHITECTURE_REALIZATIONS:
				return ((InternalEList<?>)getOwnedLogicalArchitectureRealizations()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES:
				return ((InternalEList<?>)getAllocatedLogicalArchitectures()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATING_EPBS_ARCHITECTURES:
				return ((InternalEList<?>)getAllocatingEpbsArchitectures()).basicRemove(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				if (resolve) return getOwnedPhysicalComponentPkg();
				return basicGetOwnedPhysicalComponentPkg();
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				if (resolve) return getContainedCapabilityRealizationPkg();
				return basicGetContainedCapabilityRealizationPkg();
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG:
				if (resolve) return getContainedPhysicalFunctionPkg();
				return basicGetContainedPhysicalFunctionPkg();
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				return getOwnedDeployments();
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_LOGICAL_ARCHITECTURE_REALIZATIONS:
				return getOwnedLogicalArchitectureRealizations();
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURE_REALIZATIONS:
				return getAllocatedLogicalArchitectureRealizations();
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES:
				return getAllocatedLogicalArchitectures();
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATING_EPBS_ARCHITECTURES:
				return getAllocatingEpbsArchitectures();
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
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				setOwnedPhysicalComponentPkg((PhysicalComponentPkg)newValue);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				getOwnedDeployments().clear();
				getOwnedDeployments().addAll((Collection<? extends AbstractDeploymentLink>)newValue);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_LOGICAL_ARCHITECTURE_REALIZATIONS:
				getOwnedLogicalArchitectureRealizations().clear();
				getOwnedLogicalArchitectureRealizations().addAll((Collection<? extends LogicalArchitectureRealization>)newValue);
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
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				setOwnedPhysicalComponentPkg((PhysicalComponentPkg)null);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				getOwnedDeployments().clear();
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_LOGICAL_ARCHITECTURE_REALIZATIONS:
				getOwnedLogicalArchitectureRealizations().clear();
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
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				return ownedPhysicalComponentPkg != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				return containedCapabilityRealizationPkg != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG:
				return containedPhysicalFunctionPkg != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				return ownedDeployments != null && !ownedDeployments.isEmpty();
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_LOGICAL_ARCHITECTURE_REALIZATIONS:
				return ownedLogicalArchitectureRealizations != null && !ownedLogicalArchitectureRealizations.isEmpty();
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURE_REALIZATIONS:
				return allocatedLogicalArchitectureRealizations != null && !allocatedLogicalArchitectureRealizations.isEmpty();
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES:
				return allocatedLogicalArchitectures != null && !allocatedLogicalArchitectures.isEmpty();
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATING_EPBS_ARCHITECTURES:
				return allocatingEpbsArchitectures != null && !allocatingEpbsArchitectures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalArchitectureImpl
