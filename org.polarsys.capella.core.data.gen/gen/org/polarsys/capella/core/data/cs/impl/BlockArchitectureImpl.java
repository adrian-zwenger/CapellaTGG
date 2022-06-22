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
package org.polarsys.capella.core.data.cs.impl;

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

import org.polarsys.capella.core.data.capellacommon.AbstractCapabilityPkg;

import org.polarsys.capella.core.data.cs.ArchitectureAllocation;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.InterfacePkg;

import org.polarsys.capella.core.data.fa.impl.AbstractFunctionalArchitectureImpl;

import org.polarsys.capella.core.data.information.DataPkg;

import org.polarsys.capella.core.data.requirement.RequirementsPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.BlockArchitectureImpl#getOwnedRequirementPkgs <em>Owned Requirement Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.BlockArchitectureImpl#getOwnedAbstractCapabilityPkg <em>Owned Abstract Capability Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.BlockArchitectureImpl#getOwnedInterfacePkg <em>Owned Interface Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.BlockArchitectureImpl#getOwnedDataPkg <em>Owned Data Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.BlockArchitectureImpl#getProvisionedArchitectureAllocations <em>Provisioned Architecture Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.BlockArchitectureImpl#getProvisioningArchitectureAllocations <em>Provisioning Architecture Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.BlockArchitectureImpl#getAllocatedArchitectures <em>Allocated Architectures</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.BlockArchitectureImpl#getAllocatingArchitectures <em>Allocating Architectures</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.BlockArchitectureImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BlockArchitectureImpl extends AbstractFunctionalArchitectureImpl implements BlockArchitecture {
	/**
	 * The cached value of the '{@link #getOwnedRequirementPkgs() <em>Owned Requirement Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRequirementPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsPkg> ownedRequirementPkgs;

	/**
	 * The cached value of the '{@link #getOwnedAbstractCapabilityPkg() <em>Owned Abstract Capability Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAbstractCapabilityPkg()
	 * @generated
	 * @ordered
	 */
	protected AbstractCapabilityPkg ownedAbstractCapabilityPkg;

	/**
	 * The cached value of the '{@link #getOwnedInterfacePkg() <em>Owned Interface Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInterfacePkg()
	 * @generated
	 * @ordered
	 */
	protected InterfacePkg ownedInterfacePkg;

	/**
	 * The cached value of the '{@link #getOwnedDataPkg() <em>Owned Data Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDataPkg()
	 * @generated
	 * @ordered
	 */
	protected DataPkg ownedDataPkg;

	/**
	 * The cached value of the '{@link #getProvisionedArchitectureAllocations() <em>Provisioned Architecture Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisionedArchitectureAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitectureAllocation> provisionedArchitectureAllocations;

	/**
	 * The cached value of the '{@link #getProvisioningArchitectureAllocations() <em>Provisioning Architecture Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisioningArchitectureAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitectureAllocation> provisioningArchitectureAllocations;

	/**
	 * The cached value of the '{@link #getAllocatedArchitectures() <em>Allocated Architectures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<BlockArchitecture> allocatedArchitectures;

	/**
	 * The cached value of the '{@link #getAllocatingArchitectures() <em>Allocating Architectures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<BlockArchitecture> allocatingArchitectures;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Component system;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.BLOCK_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementsPkg> getOwnedRequirementPkgs() {
		if (ownedRequirementPkgs == null) {
			ownedRequirementPkgs = new EObjectContainmentEList.Resolving<RequirementsPkg>(RequirementsPkg.class, this, CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS);
		}
		return ownedRequirementPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCapabilityPkg getOwnedAbstractCapabilityPkg() {
		if (ownedAbstractCapabilityPkg != null && ownedAbstractCapabilityPkg.eIsProxy()) {
			InternalEObject oldOwnedAbstractCapabilityPkg = (InternalEObject)ownedAbstractCapabilityPkg;
			ownedAbstractCapabilityPkg = (AbstractCapabilityPkg)eResolveProxy(oldOwnedAbstractCapabilityPkg);
			if (ownedAbstractCapabilityPkg != oldOwnedAbstractCapabilityPkg) {
				InternalEObject newOwnedAbstractCapabilityPkg = (InternalEObject)ownedAbstractCapabilityPkg;
				NotificationChain msgs = oldOwnedAbstractCapabilityPkg.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG, null, null);
				if (newOwnedAbstractCapabilityPkg.eInternalContainer() == null) {
					msgs = newOwnedAbstractCapabilityPkg.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG, oldOwnedAbstractCapabilityPkg, ownedAbstractCapabilityPkg));
			}
		}
		return ownedAbstractCapabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapabilityPkg basicGetOwnedAbstractCapabilityPkg() {
		return ownedAbstractCapabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedAbstractCapabilityPkg(AbstractCapabilityPkg newOwnedAbstractCapabilityPkg, NotificationChain msgs) {
		AbstractCapabilityPkg oldOwnedAbstractCapabilityPkg = ownedAbstractCapabilityPkg;
		ownedAbstractCapabilityPkg = newOwnedAbstractCapabilityPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG, oldOwnedAbstractCapabilityPkg, newOwnedAbstractCapabilityPkg);
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
	public void setOwnedAbstractCapabilityPkg(AbstractCapabilityPkg newOwnedAbstractCapabilityPkg) {
		if (newOwnedAbstractCapabilityPkg != ownedAbstractCapabilityPkg) {
			NotificationChain msgs = null;
			if (ownedAbstractCapabilityPkg != null)
				msgs = ((InternalEObject)ownedAbstractCapabilityPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG, null, msgs);
			if (newOwnedAbstractCapabilityPkg != null)
				msgs = ((InternalEObject)newOwnedAbstractCapabilityPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG, null, msgs);
			msgs = basicSetOwnedAbstractCapabilityPkg(newOwnedAbstractCapabilityPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG, newOwnedAbstractCapabilityPkg, newOwnedAbstractCapabilityPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfacePkg getOwnedInterfacePkg() {
		if (ownedInterfacePkg != null && ownedInterfacePkg.eIsProxy()) {
			InternalEObject oldOwnedInterfacePkg = (InternalEObject)ownedInterfacePkg;
			ownedInterfacePkg = (InterfacePkg)eResolveProxy(oldOwnedInterfacePkg);
			if (ownedInterfacePkg != oldOwnedInterfacePkg) {
				InternalEObject newOwnedInterfacePkg = (InternalEObject)ownedInterfacePkg;
				NotificationChain msgs = oldOwnedInterfacePkg.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG, null, null);
				if (newOwnedInterfacePkg.eInternalContainer() == null) {
					msgs = newOwnedInterfacePkg.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG, oldOwnedInterfacePkg, ownedInterfacePkg));
			}
		}
		return ownedInterfacePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacePkg basicGetOwnedInterfacePkg() {
		return ownedInterfacePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedInterfacePkg(InterfacePkg newOwnedInterfacePkg, NotificationChain msgs) {
		InterfacePkg oldOwnedInterfacePkg = ownedInterfacePkg;
		ownedInterfacePkg = newOwnedInterfacePkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG, oldOwnedInterfacePkg, newOwnedInterfacePkg);
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
	public void setOwnedInterfacePkg(InterfacePkg newOwnedInterfacePkg) {
		if (newOwnedInterfacePkg != ownedInterfacePkg) {
			NotificationChain msgs = null;
			if (ownedInterfacePkg != null)
				msgs = ((InternalEObject)ownedInterfacePkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG, null, msgs);
			if (newOwnedInterfacePkg != null)
				msgs = ((InternalEObject)newOwnedInterfacePkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG, null, msgs);
			msgs = basicSetOwnedInterfacePkg(newOwnedInterfacePkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG, newOwnedInterfacePkg, newOwnedInterfacePkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataPkg getOwnedDataPkg() {
		if (ownedDataPkg != null && ownedDataPkg.eIsProxy()) {
			InternalEObject oldOwnedDataPkg = (InternalEObject)ownedDataPkg;
			ownedDataPkg = (DataPkg)eResolveProxy(oldOwnedDataPkg);
			if (ownedDataPkg != oldOwnedDataPkg) {
				InternalEObject newOwnedDataPkg = (InternalEObject)ownedDataPkg;
				NotificationChain msgs = oldOwnedDataPkg.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG, null, null);
				if (newOwnedDataPkg.eInternalContainer() == null) {
					msgs = newOwnedDataPkg.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG, oldOwnedDataPkg, ownedDataPkg));
			}
		}
		return ownedDataPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPkg basicGetOwnedDataPkg() {
		return ownedDataPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedDataPkg(DataPkg newOwnedDataPkg, NotificationChain msgs) {
		DataPkg oldOwnedDataPkg = ownedDataPkg;
		ownedDataPkg = newOwnedDataPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG, oldOwnedDataPkg, newOwnedDataPkg);
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
	public void setOwnedDataPkg(DataPkg newOwnedDataPkg) {
		if (newOwnedDataPkg != ownedDataPkg) {
			NotificationChain msgs = null;
			if (ownedDataPkg != null)
				msgs = ((InternalEObject)ownedDataPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG, null, msgs);
			if (newOwnedDataPkg != null)
				msgs = ((InternalEObject)newOwnedDataPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG, null, msgs);
			msgs = basicSetOwnedDataPkg(newOwnedDataPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG, newOwnedDataPkg, newOwnedDataPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArchitectureAllocation> getProvisionedArchitectureAllocations() {
		if (provisionedArchitectureAllocations == null) {
			provisionedArchitectureAllocations = new EObjectWithInverseResolvingEList<ArchitectureAllocation>(ArchitectureAllocation.class, this, CsPackage.BLOCK_ARCHITECTURE__PROVISIONED_ARCHITECTURE_ALLOCATIONS, CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATING_ARCHITECTURE);
		}
		return provisionedArchitectureAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArchitectureAllocation> getProvisioningArchitectureAllocations() {
		if (provisioningArchitectureAllocations == null) {
			provisioningArchitectureAllocations = new EObjectWithInverseResolvingEList<ArchitectureAllocation>(ArchitectureAllocation.class, this, CsPackage.BLOCK_ARCHITECTURE__PROVISIONING_ARCHITECTURE_ALLOCATIONS, CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATED_ARCHITECTURE);
		}
		return provisioningArchitectureAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockArchitecture> getAllocatedArchitectures() {
		if (allocatedArchitectures == null) {
			allocatedArchitectures = new EObjectResolvingEList<BlockArchitecture>(BlockArchitecture.class, this, CsPackage.BLOCK_ARCHITECTURE__ALLOCATED_ARCHITECTURES);
		}
		return allocatedArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockArchitecture> getAllocatingArchitectures() {
		if (allocatingArchitectures == null) {
			allocatingArchitectures = new EObjectResolvingEList<BlockArchitecture>(BlockArchitecture.class, this, CsPackage.BLOCK_ARCHITECTURE__ALLOCATING_ARCHITECTURES);
		}
		return allocatingArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (Component)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.BLOCK_ARCHITECTURE__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetSystem() {
		return system;
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
			case CsPackage.BLOCK_ARCHITECTURE__PROVISIONED_ARCHITECTURE_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvisionedArchitectureAllocations()).basicAdd(otherEnd, msgs);
			case CsPackage.BLOCK_ARCHITECTURE__PROVISIONING_ARCHITECTURE_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvisioningArchitectureAllocations()).basicAdd(otherEnd, msgs);
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
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS:
				return ((InternalEList<?>)getOwnedRequirementPkgs()).basicRemove(otherEnd, msgs);
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG:
				return basicSetOwnedAbstractCapabilityPkg(null, msgs);
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG:
				return basicSetOwnedInterfacePkg(null, msgs);
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG:
				return basicSetOwnedDataPkg(null, msgs);
			case CsPackage.BLOCK_ARCHITECTURE__PROVISIONED_ARCHITECTURE_ALLOCATIONS:
				return ((InternalEList<?>)getProvisionedArchitectureAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.BLOCK_ARCHITECTURE__PROVISIONING_ARCHITECTURE_ALLOCATIONS:
				return ((InternalEList<?>)getProvisioningArchitectureAllocations()).basicRemove(otherEnd, msgs);
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
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS:
				return getOwnedRequirementPkgs();
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG:
				if (resolve) return getOwnedAbstractCapabilityPkg();
				return basicGetOwnedAbstractCapabilityPkg();
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG:
				if (resolve) return getOwnedInterfacePkg();
				return basicGetOwnedInterfacePkg();
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG:
				if (resolve) return getOwnedDataPkg();
				return basicGetOwnedDataPkg();
			case CsPackage.BLOCK_ARCHITECTURE__PROVISIONED_ARCHITECTURE_ALLOCATIONS:
				return getProvisionedArchitectureAllocations();
			case CsPackage.BLOCK_ARCHITECTURE__PROVISIONING_ARCHITECTURE_ALLOCATIONS:
				return getProvisioningArchitectureAllocations();
			case CsPackage.BLOCK_ARCHITECTURE__ALLOCATED_ARCHITECTURES:
				return getAllocatedArchitectures();
			case CsPackage.BLOCK_ARCHITECTURE__ALLOCATING_ARCHITECTURES:
				return getAllocatingArchitectures();
			case CsPackage.BLOCK_ARCHITECTURE__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
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
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS:
				getOwnedRequirementPkgs().clear();
				getOwnedRequirementPkgs().addAll((Collection<? extends RequirementsPkg>)newValue);
				return;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG:
				setOwnedAbstractCapabilityPkg((AbstractCapabilityPkg)newValue);
				return;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG:
				setOwnedInterfacePkg((InterfacePkg)newValue);
				return;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG:
				setOwnedDataPkg((DataPkg)newValue);
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
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS:
				getOwnedRequirementPkgs().clear();
				return;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG:
				setOwnedAbstractCapabilityPkg((AbstractCapabilityPkg)null);
				return;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG:
				setOwnedInterfacePkg((InterfacePkg)null);
				return;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG:
				setOwnedDataPkg((DataPkg)null);
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
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS:
				return ownedRequirementPkgs != null && !ownedRequirementPkgs.isEmpty();
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG:
				return ownedAbstractCapabilityPkg != null;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG:
				return ownedInterfacePkg != null;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG:
				return ownedDataPkg != null;
			case CsPackage.BLOCK_ARCHITECTURE__PROVISIONED_ARCHITECTURE_ALLOCATIONS:
				return provisionedArchitectureAllocations != null && !provisionedArchitectureAllocations.isEmpty();
			case CsPackage.BLOCK_ARCHITECTURE__PROVISIONING_ARCHITECTURE_ALLOCATIONS:
				return provisioningArchitectureAllocations != null && !provisioningArchitectureAllocations.isEmpty();
			case CsPackage.BLOCK_ARCHITECTURE__ALLOCATED_ARCHITECTURES:
				return allocatedArchitectures != null && !allocatedArchitectures.isEmpty();
			case CsPackage.BLOCK_ARCHITECTURE__ALLOCATING_ARCHITECTURES:
				return allocatingArchitectures != null && !allocatingArchitectures.isEmpty();
			case CsPackage.BLOCK_ARCHITECTURE__SYSTEM:
				return system != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockArchitectureImpl
