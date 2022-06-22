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

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.Involvement;

import org.polarsys.capella.core.data.cs.AbstractPathInvolvedElement;
import org.polarsys.capella.core.data.cs.AbstractPhysicalArtifact;
import org.polarsys.capella.core.data.cs.AbstractPhysicalLinkEnd;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.cs.PhysicalLinkCategory;
import org.polarsys.capella.core.data.cs.PhysicalLinkEnd;
import org.polarsys.capella.core.data.cs.PhysicalLinkRealization;
import org.polarsys.capella.core.data.cs.PhysicalPort;

import org.polarsys.capella.core.data.epbs.ConfigurationItem;

import org.polarsys.capella.core.data.epbs.EpbsPackage;
import org.polarsys.capella.core.data.fa.ComponentExchangeFunctionalExchangeAllocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalLinkImpl#getAllocatorConfigurationItems <em>Allocator Configuration Items</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalLinkImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalLinkImpl#getLinkEnds <em>Link Ends</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalLinkImpl#getOwnedComponentExchangeFunctionalExchangeAllocations <em>Owned Component Exchange Functional Exchange Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalLinkImpl#getOwnedPhysicalLinkEnds <em>Owned Physical Link Ends</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalLinkImpl#getOwnedPhysicalLinkRealizations <em>Owned Physical Link Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalLinkImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalLinkImpl#getSourcePhysicalPort <em>Source Physical Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalLinkImpl#getTargetPhysicalPort <em>Target Physical Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalLinkImpl#getRealizedPhysicalLinks <em>Realized Physical Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalLinkImpl#getRealizingPhysicalLinks <em>Realizing Physical Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalLinkImpl extends AbstractPhysicalPathLinkImpl implements PhysicalLink {
	/**
	 * The cached value of the '{@link #getAllocatorConfigurationItems() <em>Allocator Configuration Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatorConfigurationItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationItem> allocatorConfigurationItems;

	/**
	 * The cached value of the '{@link #getInvolvingInvolvements() <em>Involving Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvingInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<Involvement> involvingInvolvements;

	/**
	 * The cached value of the '{@link #getLinkEnds() <em>Link Ends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPhysicalLinkEnd> linkEnds;

	/**
	 * The cached value of the '{@link #getOwnedComponentExchangeFunctionalExchangeAllocations() <em>Owned Component Exchange Functional Exchange Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeFunctionalExchangeAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeFunctionalExchangeAllocation> ownedComponentExchangeFunctionalExchangeAllocations;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalLinkEnds() <em>Owned Physical Link Ends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalLinkEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLinkEnd> ownedPhysicalLinkEnds;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalLinkRealizations() <em>Owned Physical Link Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalLinkRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLinkRealization> ownedPhysicalLinkRealizations;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLinkCategory> categories;

	/**
	 * The cached value of the '{@link #getSourcePhysicalPort() <em>Source Physical Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePhysicalPort()
	 * @generated
	 * @ordered
	 */
	protected PhysicalPort sourcePhysicalPort;

	/**
	 * The cached value of the '{@link #getTargetPhysicalPort() <em>Target Physical Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPhysicalPort()
	 * @generated
	 * @ordered
	 */
	protected PhysicalPort targetPhysicalPort;

	/**
	 * The cached value of the '{@link #getRealizedPhysicalLinks() <em>Realized Physical Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedPhysicalLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLink> realizedPhysicalLinks;

	/**
	 * The cached value of the '{@link #getRealizingPhysicalLinks() <em>Realizing Physical Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingPhysicalLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLink> realizingPhysicalLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PHYSICAL_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfigurationItem> getAllocatorConfigurationItems() {
		if (allocatorConfigurationItems == null) {
			allocatorConfigurationItems = new EObjectWithInverseResolvingEList.ManyInverse<ConfigurationItem>(ConfigurationItem.class, this, CsPackage.PHYSICAL_LINK__ALLOCATOR_CONFIGURATION_ITEMS, EpbsPackage.CONFIGURATION_ITEM__ALLOCATED_PHYSICAL_ARTIFACTS);
		}
		return allocatorConfigurationItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Involvement> getInvolvingInvolvements() {
		if (involvingInvolvements == null) {
			involvingInvolvements = new EObjectResolvingEList<Involvement>(Involvement.class, this, CsPackage.PHYSICAL_LINK__INVOLVING_INVOLVEMENTS);
		}
		return involvingInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractPhysicalLinkEnd> getLinkEnds() {
		if (linkEnds == null) {
			linkEnds = new EObjectResolvingEList<AbstractPhysicalLinkEnd>(AbstractPhysicalLinkEnd.class, this, CsPackage.PHYSICAL_LINK__LINK_ENDS);
		}
		return linkEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchangeFunctionalExchangeAllocation> getOwnedComponentExchangeFunctionalExchangeAllocations() {
		if (ownedComponentExchangeFunctionalExchangeAllocations == null) {
			ownedComponentExchangeFunctionalExchangeAllocations = new EObjectContainmentEList.Resolving<ComponentExchangeFunctionalExchangeAllocation>(ComponentExchangeFunctionalExchangeAllocation.class, this, CsPackage.PHYSICAL_LINK__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS);
		}
		return ownedComponentExchangeFunctionalExchangeAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalLinkEnd> getOwnedPhysicalLinkEnds() {
		if (ownedPhysicalLinkEnds == null) {
			ownedPhysicalLinkEnds = new EObjectContainmentEList.Resolving<PhysicalLinkEnd>(PhysicalLinkEnd.class, this, CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS);
		}
		return ownedPhysicalLinkEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalLinkRealization> getOwnedPhysicalLinkRealizations() {
		if (ownedPhysicalLinkRealizations == null) {
			ownedPhysicalLinkRealizations = new EObjectContainmentEList.Resolving<PhysicalLinkRealization>(PhysicalLinkRealization.class, this, CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_REALIZATIONS);
		}
		return ownedPhysicalLinkRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalLinkCategory> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<PhysicalLinkCategory>(PhysicalLinkCategory.class, this, CsPackage.PHYSICAL_LINK__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalPort getSourcePhysicalPort() {
		if (sourcePhysicalPort != null && sourcePhysicalPort.eIsProxy()) {
			InternalEObject oldSourcePhysicalPort = (InternalEObject)sourcePhysicalPort;
			sourcePhysicalPort = (PhysicalPort)eResolveProxy(oldSourcePhysicalPort);
			if (sourcePhysicalPort != oldSourcePhysicalPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.PHYSICAL_LINK__SOURCE_PHYSICAL_PORT, oldSourcePhysicalPort, sourcePhysicalPort));
			}
		}
		return sourcePhysicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPort basicGetSourcePhysicalPort() {
		return sourcePhysicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalPort getTargetPhysicalPort() {
		if (targetPhysicalPort != null && targetPhysicalPort.eIsProxy()) {
			InternalEObject oldTargetPhysicalPort = (InternalEObject)targetPhysicalPort;
			targetPhysicalPort = (PhysicalPort)eResolveProxy(oldTargetPhysicalPort);
			if (targetPhysicalPort != oldTargetPhysicalPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.PHYSICAL_LINK__TARGET_PHYSICAL_PORT, oldTargetPhysicalPort, targetPhysicalPort));
			}
		}
		return targetPhysicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPort basicGetTargetPhysicalPort() {
		return targetPhysicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalLink> getRealizedPhysicalLinks() {
		if (realizedPhysicalLinks == null) {
			realizedPhysicalLinks = new EObjectResolvingEList<PhysicalLink>(PhysicalLink.class, this, CsPackage.PHYSICAL_LINK__REALIZED_PHYSICAL_LINKS);
		}
		return realizedPhysicalLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalLink> getRealizingPhysicalLinks() {
		if (realizingPhysicalLinks == null) {
			realizingPhysicalLinks = new EObjectResolvingEList<PhysicalLink>(PhysicalLink.class, this, CsPackage.PHYSICAL_LINK__REALIZING_PHYSICAL_LINKS);
		}
		return realizingPhysicalLinks;
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
			case CsPackage.PHYSICAL_LINK__ALLOCATOR_CONFIGURATION_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatorConfigurationItems()).basicAdd(otherEnd, msgs);
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
			case CsPackage.PHYSICAL_LINK__ALLOCATOR_CONFIGURATION_ITEMS:
				return ((InternalEList<?>)getAllocatorConfigurationItems()).basicRemove(otherEnd, msgs);
			case CsPackage.PHYSICAL_LINK__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedComponentExchangeFunctionalExchangeAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS:
				return ((InternalEList<?>)getOwnedPhysicalLinkEnds()).basicRemove(otherEnd, msgs);
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_REALIZATIONS:
				return ((InternalEList<?>)getOwnedPhysicalLinkRealizations()).basicRemove(otherEnd, msgs);
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
			case CsPackage.PHYSICAL_LINK__ALLOCATOR_CONFIGURATION_ITEMS:
				return getAllocatorConfigurationItems();
			case CsPackage.PHYSICAL_LINK__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case CsPackage.PHYSICAL_LINK__LINK_ENDS:
				return getLinkEnds();
			case CsPackage.PHYSICAL_LINK__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return getOwnedComponentExchangeFunctionalExchangeAllocations();
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS:
				return getOwnedPhysicalLinkEnds();
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_REALIZATIONS:
				return getOwnedPhysicalLinkRealizations();
			case CsPackage.PHYSICAL_LINK__CATEGORIES:
				return getCategories();
			case CsPackage.PHYSICAL_LINK__SOURCE_PHYSICAL_PORT:
				if (resolve) return getSourcePhysicalPort();
				return basicGetSourcePhysicalPort();
			case CsPackage.PHYSICAL_LINK__TARGET_PHYSICAL_PORT:
				if (resolve) return getTargetPhysicalPort();
				return basicGetTargetPhysicalPort();
			case CsPackage.PHYSICAL_LINK__REALIZED_PHYSICAL_LINKS:
				return getRealizedPhysicalLinks();
			case CsPackage.PHYSICAL_LINK__REALIZING_PHYSICAL_LINKS:
				return getRealizingPhysicalLinks();
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
			case CsPackage.PHYSICAL_LINK__LINK_ENDS:
				getLinkEnds().clear();
				getLinkEnds().addAll((Collection<? extends AbstractPhysicalLinkEnd>)newValue);
				return;
			case CsPackage.PHYSICAL_LINK__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeFunctionalExchangeAllocations().clear();
				getOwnedComponentExchangeFunctionalExchangeAllocations().addAll((Collection<? extends ComponentExchangeFunctionalExchangeAllocation>)newValue);
				return;
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS:
				getOwnedPhysicalLinkEnds().clear();
				getOwnedPhysicalLinkEnds().addAll((Collection<? extends PhysicalLinkEnd>)newValue);
				return;
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_REALIZATIONS:
				getOwnedPhysicalLinkRealizations().clear();
				getOwnedPhysicalLinkRealizations().addAll((Collection<? extends PhysicalLinkRealization>)newValue);
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
			case CsPackage.PHYSICAL_LINK__LINK_ENDS:
				getLinkEnds().clear();
				return;
			case CsPackage.PHYSICAL_LINK__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeFunctionalExchangeAllocations().clear();
				return;
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS:
				getOwnedPhysicalLinkEnds().clear();
				return;
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_REALIZATIONS:
				getOwnedPhysicalLinkRealizations().clear();
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
			case CsPackage.PHYSICAL_LINK__ALLOCATOR_CONFIGURATION_ITEMS:
				return allocatorConfigurationItems != null && !allocatorConfigurationItems.isEmpty();
			case CsPackage.PHYSICAL_LINK__INVOLVING_INVOLVEMENTS:
				return involvingInvolvements != null && !involvingInvolvements.isEmpty();
			case CsPackage.PHYSICAL_LINK__LINK_ENDS:
				return linkEnds != null && !linkEnds.isEmpty();
			case CsPackage.PHYSICAL_LINK__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return ownedComponentExchangeFunctionalExchangeAllocations != null && !ownedComponentExchangeFunctionalExchangeAllocations.isEmpty();
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS:
				return ownedPhysicalLinkEnds != null && !ownedPhysicalLinkEnds.isEmpty();
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_REALIZATIONS:
				return ownedPhysicalLinkRealizations != null && !ownedPhysicalLinkRealizations.isEmpty();
			case CsPackage.PHYSICAL_LINK__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case CsPackage.PHYSICAL_LINK__SOURCE_PHYSICAL_PORT:
				return sourcePhysicalPort != null;
			case CsPackage.PHYSICAL_LINK__TARGET_PHYSICAL_PORT:
				return targetPhysicalPort != null;
			case CsPackage.PHYSICAL_LINK__REALIZED_PHYSICAL_LINKS:
				return realizedPhysicalLinks != null && !realizedPhysicalLinks.isEmpty();
			case CsPackage.PHYSICAL_LINK__REALIZING_PHYSICAL_LINKS:
				return realizingPhysicalLinks != null && !realizingPhysicalLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractPhysicalArtifact.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_LINK__ALLOCATOR_CONFIGURATION_ITEMS: return CsPackage.ABSTRACT_PHYSICAL_ARTIFACT__ALLOCATOR_CONFIGURATION_ITEMS;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_LINK__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractPathInvolvedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractPhysicalArtifact.class) {
			switch (baseFeatureID) {
				case CsPackage.ABSTRACT_PHYSICAL_ARTIFACT__ALLOCATOR_CONFIGURATION_ITEMS: return CsPackage.PHYSICAL_LINK__ALLOCATOR_CONFIGURATION_ITEMS;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return CsPackage.PHYSICAL_LINK__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractPathInvolvedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PhysicalLinkImpl
