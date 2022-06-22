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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.capellacore.InvolverElement;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.cs.AbstractPathInvolvedElement;
import org.polarsys.capella.core.data.cs.AbstractPhysicalPathLink;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.PhysicalPath;
import org.polarsys.capella.core.data.cs.PhysicalPathInvolvement;
import org.polarsys.capella.core.data.cs.PhysicalPathRealization;

import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeAllocation;
import org.polarsys.capella.core.data.fa.ComponentExchangeAllocator;
import org.polarsys.capella.core.data.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathImpl#getOwnedComponentExchangeAllocations <em>Owned Component Exchange Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathImpl#getAllocatedComponentExchanges <em>Allocated Component Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathImpl#getInvolvedInvolvements <em>Involved Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathImpl#getInvolvedLinks <em>Involved Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathImpl#getOwnedPhysicalPathInvolvements <em>Owned Physical Path Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathImpl#getFirstPhysicalPathInvolvements <em>First Physical Path Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathImpl#getOwnedPhysicalPathRealizations <em>Owned Physical Path Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathImpl#getRealizedPhysicalPaths <em>Realized Physical Paths</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathImpl#getRealizingPhysicalPaths <em>Realizing Physical Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("deprecation")
public class PhysicalPathImpl extends NamedElementImpl implements PhysicalPath {
	/**
	 * The cached value of the '{@link #getOwnedComponentExchangeAllocations() <em>Owned Component Exchange Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeAllocation> ownedComponentExchangeAllocations;

	/**
	 * The cached value of the '{@link #getAllocatedComponentExchanges() <em>Allocated Component Exchanges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedComponentExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchange> allocatedComponentExchanges;

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
	 * The cached value of the '{@link #getInvolvedInvolvements() <em>Involved Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<Involvement> involvedInvolvements;

	/**
	 * The cached value of the '{@link #getInvolvedLinks() <em>Involved Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedLinks()
	 * @deprecated See {@link org.polarsys.capella.core.data.cs.PhysicalPath#getInvolvedLinks() model documentation} for details.
	 * @generated
	 * @ordered
	 */
	@Deprecated
	protected EList<AbstractPhysicalPathLink> involvedLinks;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalPathInvolvements() <em>Owned Physical Path Involvements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalPathInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPathInvolvement> ownedPhysicalPathInvolvements;

	/**
	 * The cached value of the '{@link #getFirstPhysicalPathInvolvements() <em>First Physical Path Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPhysicalPathInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPathInvolvement> firstPhysicalPathInvolvements;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalPathRealizations() <em>Owned Physical Path Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalPathRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPathRealization> ownedPhysicalPathRealizations;

	/**
	 * The cached value of the '{@link #getRealizedPhysicalPaths() <em>Realized Physical Paths</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedPhysicalPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPath> realizedPhysicalPaths;

	/**
	 * The cached value of the '{@link #getRealizingPhysicalPaths() <em>Realizing Physical Paths</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingPhysicalPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPath> realizingPhysicalPaths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PHYSICAL_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchangeAllocation> getOwnedComponentExchangeAllocations() {
		if (ownedComponentExchangeAllocations == null) {
			ownedComponentExchangeAllocations = new EObjectContainmentEList.Resolving<ComponentExchangeAllocation>(ComponentExchangeAllocation.class, this, CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS);
		}
		return ownedComponentExchangeAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchange> getAllocatedComponentExchanges() {
		if (allocatedComponentExchanges == null) {
			allocatedComponentExchanges = new EObjectResolvingEList<ComponentExchange>(ComponentExchange.class, this, CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES);
		}
		return allocatedComponentExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Involvement> getInvolvingInvolvements() {
		if (involvingInvolvements == null) {
			involvingInvolvements = new EObjectResolvingEList<Involvement>(Involvement.class, this, CsPackage.PHYSICAL_PATH__INVOLVING_INVOLVEMENTS);
		}
		return involvingInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Involvement> getInvolvedInvolvements() {
		if (involvedInvolvements == null) {
			involvedInvolvements = new EObjectResolvingEList<Involvement>(Involvement.class, this, CsPackage.PHYSICAL_PATH__INVOLVED_INVOLVEMENTS);
		}
		return involvedInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated See {@link org.polarsys.capella.core.data.cs.PhysicalPath#getInvolvedLinks() model documentation} for details.
	 * @generated
	 */
	@Deprecated
	@Override
	public EList<AbstractPhysicalPathLink> getInvolvedLinks() {
		if (involvedLinks == null) {
			involvedLinks = new EObjectResolvingEList<AbstractPhysicalPathLink>(AbstractPhysicalPathLink.class, this, CsPackage.PHYSICAL_PATH__INVOLVED_LINKS);
		}
		return involvedLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalPathInvolvement> getOwnedPhysicalPathInvolvements() {
		if (ownedPhysicalPathInvolvements == null) {
			ownedPhysicalPathInvolvements = new EObjectContainmentEList.Resolving<PhysicalPathInvolvement>(PhysicalPathInvolvement.class, this, CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS);
		}
		return ownedPhysicalPathInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalPathInvolvement> getFirstPhysicalPathInvolvements() {
		if (firstPhysicalPathInvolvements == null) {
			firstPhysicalPathInvolvements = new EObjectResolvingEList<PhysicalPathInvolvement>(PhysicalPathInvolvement.class, this, CsPackage.PHYSICAL_PATH__FIRST_PHYSICAL_PATH_INVOLVEMENTS);
		}
		return firstPhysicalPathInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalPathRealization> getOwnedPhysicalPathRealizations() {
		if (ownedPhysicalPathRealizations == null) {
			ownedPhysicalPathRealizations = new EObjectContainmentEList.Resolving<PhysicalPathRealization>(PhysicalPathRealization.class, this, CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_REALIZATIONS);
		}
		return ownedPhysicalPathRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalPath> getRealizedPhysicalPaths() {
		if (realizedPhysicalPaths == null) {
			realizedPhysicalPaths = new EObjectResolvingEList<PhysicalPath>(PhysicalPath.class, this, CsPackage.PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS);
		}
		return realizedPhysicalPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalPath> getRealizingPhysicalPaths() {
		if (realizingPhysicalPaths == null) {
			realizingPhysicalPaths = new EObjectResolvingEList<PhysicalPath>(PhysicalPath.class, this, CsPackage.PHYSICAL_PATH__REALIZING_PHYSICAL_PATHS);
		}
		return realizingPhysicalPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedComponentExchangeAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				return ((InternalEList<?>)getOwnedPhysicalPathInvolvements()).basicRemove(otherEnd, msgs);
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_REALIZATIONS:
				return ((InternalEList<?>)getOwnedPhysicalPathRealizations()).basicRemove(otherEnd, msgs);
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
			case CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				return getOwnedComponentExchangeAllocations();
			case CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES:
				return getAllocatedComponentExchanges();
			case CsPackage.PHYSICAL_PATH__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case CsPackage.PHYSICAL_PATH__INVOLVED_INVOLVEMENTS:
				return getInvolvedInvolvements();
			case CsPackage.PHYSICAL_PATH__INVOLVED_LINKS:
				return getInvolvedLinks();
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				return getOwnedPhysicalPathInvolvements();
			case CsPackage.PHYSICAL_PATH__FIRST_PHYSICAL_PATH_INVOLVEMENTS:
				return getFirstPhysicalPathInvolvements();
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_REALIZATIONS:
				return getOwnedPhysicalPathRealizations();
			case CsPackage.PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS:
				return getRealizedPhysicalPaths();
			case CsPackage.PHYSICAL_PATH__REALIZING_PHYSICAL_PATHS:
				return getRealizingPhysicalPaths();
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
			case CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeAllocations().clear();
				getOwnedComponentExchangeAllocations().addAll((Collection<? extends ComponentExchangeAllocation>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH__INVOLVED_LINKS:
				getInvolvedLinks().clear();
				getInvolvedLinks().addAll((Collection<? extends AbstractPhysicalPathLink>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				getOwnedPhysicalPathInvolvements().clear();
				getOwnedPhysicalPathInvolvements().addAll((Collection<? extends PhysicalPathInvolvement>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_REALIZATIONS:
				getOwnedPhysicalPathRealizations().clear();
				getOwnedPhysicalPathRealizations().addAll((Collection<? extends PhysicalPathRealization>)newValue);
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
			case CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeAllocations().clear();
				return;
			case CsPackage.PHYSICAL_PATH__INVOLVED_LINKS:
				getInvolvedLinks().clear();
				return;
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				getOwnedPhysicalPathInvolvements().clear();
				return;
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_REALIZATIONS:
				getOwnedPhysicalPathRealizations().clear();
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
			case CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				return ownedComponentExchangeAllocations != null && !ownedComponentExchangeAllocations.isEmpty();
			case CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES:
				return allocatedComponentExchanges != null && !allocatedComponentExchanges.isEmpty();
			case CsPackage.PHYSICAL_PATH__INVOLVING_INVOLVEMENTS:
				return involvingInvolvements != null && !involvingInvolvements.isEmpty();
			case CsPackage.PHYSICAL_PATH__INVOLVED_INVOLVEMENTS:
				return involvedInvolvements != null && !involvedInvolvements.isEmpty();
			case CsPackage.PHYSICAL_PATH__INVOLVED_LINKS:
				return involvedLinks != null && !involvedLinks.isEmpty();
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				return ownedPhysicalPathInvolvements != null && !ownedPhysicalPathInvolvements.isEmpty();
			case CsPackage.PHYSICAL_PATH__FIRST_PHYSICAL_PATH_INVOLVEMENTS:
				return firstPhysicalPathInvolvements != null && !firstPhysicalPathInvolvements.isEmpty();
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_REALIZATIONS:
				return ownedPhysicalPathRealizations != null && !ownedPhysicalPathRealizations.isEmpty();
			case CsPackage.PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS:
				return realizedPhysicalPaths != null && !realizedPhysicalPaths.isEmpty();
			case CsPackage.PHYSICAL_PATH__REALIZING_PHYSICAL_PATHS:
				return realizingPhysicalPaths != null && !realizingPhysicalPaths.isEmpty();
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
		if (baseClass == ComponentExchangeAllocator.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS: return FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS;
				case CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES: return FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_PATH__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractPathInvolvedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InvolverElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_PATH__INVOLVED_INVOLVEMENTS: return CapellacorePackage.INVOLVER_ELEMENT__INVOLVED_INVOLVEMENTS;
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
		if (baseClass == ComponentExchangeAllocator.class) {
			switch (baseFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS: return CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS;
				case FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES: return CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return CsPackage.PHYSICAL_PATH__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractPathInvolvedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InvolverElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVER_ELEMENT__INVOLVED_INVOLVEMENTS: return CsPackage.PHYSICAL_PATH__INVOLVED_INVOLVEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PhysicalPathImpl
