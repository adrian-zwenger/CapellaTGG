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

import org.polarsys.capella.core.data.capellacore.impl.GeneralClassImpl;

import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.ExchangeItemAllocation;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.cs.InterfaceAllocation;
import org.polarsys.capella.core.data.cs.InterfaceAllocator;
import org.polarsys.capella.core.data.cs.InterfaceImplementation;
import org.polarsys.capella.core.data.cs.InterfaceUse;

import org.polarsys.capella.core.data.fa.ComponentPort;

import org.polarsys.capella.core.data.information.ExchangeItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getOwnedInterfaceAllocations <em>Owned Interface Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getProvisionedInterfaceAllocations <em>Provisioned Interface Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getAllocatedInterfaces <em>Allocated Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#isStructural <em>Structural</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getImplementorComponents <em>Implementor Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getUserComponents <em>User Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getInterfaceImplementations <em>Interface Implementations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getInterfaceUses <em>Interface Uses</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getProvisioningInterfaceAllocations <em>Provisioning Interface Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getAllocatingInterfaces <em>Allocating Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getAllocatingComponents <em>Allocating Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getExchangeItems <em>Exchange Items</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getOwnedExchangeItemAllocations <em>Owned Exchange Item Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getRequiringComponents <em>Requiring Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getRequiringComponentPorts <em>Requiring Component Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getProvidingComponents <em>Providing Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getProvidingComponentPorts <em>Providing Component Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getRealizingLogicalInterfaces <em>Realizing Logical Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getRealizedContextInterfaces <em>Realized Context Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getRealizingPhysicalInterfaces <em>Realizing Physical Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.InterfaceImpl#getRealizedLogicalInterfaces <em>Realized Logical Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends GeneralClassImpl implements Interface {
	/**
	 * The cached value of the '{@link #getOwnedInterfaceAllocations() <em>Owned Interface Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInterfaceAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceAllocation> ownedInterfaceAllocations;

	/**
	 * The cached value of the '{@link #getProvisionedInterfaceAllocations() <em>Provisioned Interface Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisionedInterfaceAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceAllocation> provisionedInterfaceAllocations;

	/**
	 * The cached value of the '{@link #getAllocatedInterfaces() <em>Allocated Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> allocatedInterfaces;

	/**
	 * The default value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final String MECHANISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected String mechanism = MECHANISM_EDEFAULT;

	/**
	 * The default value of the '{@link #isStructural() <em>Structural</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStructural()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRUCTURAL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isStructural() <em>Structural</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStructural()
	 * @generated
	 * @ordered
	 */
	protected boolean structural = STRUCTURAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplementorComponents() <em>Implementor Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementorComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> implementorComponents;

	/**
	 * The cached value of the '{@link #getUserComponents() <em>User Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> userComponents;

	/**
	 * The cached value of the '{@link #getInterfaceImplementations() <em>Interface Implementations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceImplementation> interfaceImplementations;

	/**
	 * The cached value of the '{@link #getInterfaceUses() <em>Interface Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceUses()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceUse> interfaceUses;

	/**
	 * The cached value of the '{@link #getProvisioningInterfaceAllocations() <em>Provisioning Interface Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisioningInterfaceAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceAllocation> provisioningInterfaceAllocations;

	/**
	 * The cached value of the '{@link #getAllocatingInterfaces() <em>Allocating Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> allocatingInterfaces;

	/**
	 * The cached value of the '{@link #getAllocatingComponents() <em>Allocating Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> allocatingComponents;

	/**
	 * The cached value of the '{@link #getExchangeItems() <em>Exchange Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItem> exchangeItems;

	/**
	 * The cached value of the '{@link #getOwnedExchangeItemAllocations() <em>Owned Exchange Item Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExchangeItemAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItemAllocation> ownedExchangeItemAllocations;

	/**
	 * The cached value of the '{@link #getRequiringComponents() <em>Requiring Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiringComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> requiringComponents;

	/**
	 * The cached value of the '{@link #getRequiringComponentPorts() <em>Requiring Component Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiringComponentPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPort> requiringComponentPorts;

	/**
	 * The cached value of the '{@link #getProvidingComponents() <em>Providing Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidingComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> providingComponents;

	/**
	 * The cached value of the '{@link #getProvidingComponentPorts() <em>Providing Component Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidingComponentPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPort> providingComponentPorts;

	/**
	 * The cached value of the '{@link #getRealizingLogicalInterfaces() <em>Realizing Logical Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingLogicalInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> realizingLogicalInterfaces;

	/**
	 * The cached value of the '{@link #getRealizedContextInterfaces() <em>Realized Context Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedContextInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> realizedContextInterfaces;

	/**
	 * The cached value of the '{@link #getRealizingPhysicalInterfaces() <em>Realizing Physical Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingPhysicalInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> realizingPhysicalInterfaces;

	/**
	 * The cached value of the '{@link #getRealizedLogicalInterfaces() <em>Realized Logical Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedLogicalInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> realizedLogicalInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfaceAllocation> getOwnedInterfaceAllocations() {
		if (ownedInterfaceAllocations == null) {
			ownedInterfaceAllocations = new EObjectContainmentEList.Resolving<InterfaceAllocation>(InterfaceAllocation.class, this, CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS);
		}
		return ownedInterfaceAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfaceAllocation> getProvisionedInterfaceAllocations() {
		if (provisionedInterfaceAllocations == null) {
			provisionedInterfaceAllocations = new EObjectWithInverseResolvingEList<InterfaceAllocation>(InterfaceAllocation.class, this, CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS, CsPackage.INTERFACE_ALLOCATION__ALLOCATING_INTERFACE_ALLOCATOR);
		}
		return provisionedInterfaceAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getAllocatedInterfaces() {
		if (allocatedInterfaces == null) {
			allocatedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.INTERFACE__ALLOCATED_INTERFACES);
		}
		return allocatedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMechanism() {
		return mechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMechanism(String newMechanism) {
		String oldMechanism = mechanism;
		mechanism = newMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.INTERFACE__MECHANISM, oldMechanism, mechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStructural() {
		return structural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStructural(boolean newStructural) {
		boolean oldStructural = structural;
		structural = newStructural;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.INTERFACE__STRUCTURAL, oldStructural, structural));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getImplementorComponents() {
		if (implementorComponents == null) {
			implementorComponents = new EObjectWithInverseResolvingEList.ManyInverse<Component>(Component.class, this, CsPackage.INTERFACE__IMPLEMENTOR_COMPONENTS, CsPackage.COMPONENT__IMPLEMENTED_INTERFACES);
		}
		return implementorComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getUserComponents() {
		if (userComponents == null) {
			userComponents = new EObjectWithInverseResolvingEList.ManyInverse<Component>(Component.class, this, CsPackage.INTERFACE__USER_COMPONENTS, CsPackage.COMPONENT__USED_INTERFACES);
		}
		return userComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfaceImplementation> getInterfaceImplementations() {
		if (interfaceImplementations == null) {
			interfaceImplementations = new EObjectResolvingEList<InterfaceImplementation>(InterfaceImplementation.class, this, CsPackage.INTERFACE__INTERFACE_IMPLEMENTATIONS);
		}
		return interfaceImplementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfaceUse> getInterfaceUses() {
		if (interfaceUses == null) {
			interfaceUses = new EObjectResolvingEList<InterfaceUse>(InterfaceUse.class, this, CsPackage.INTERFACE__INTERFACE_USES);
		}
		return interfaceUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfaceAllocation> getProvisioningInterfaceAllocations() {
		if (provisioningInterfaceAllocations == null) {
			provisioningInterfaceAllocations = new EObjectWithInverseResolvingEList<InterfaceAllocation>(InterfaceAllocation.class, this, CsPackage.INTERFACE__PROVISIONING_INTERFACE_ALLOCATIONS, CsPackage.INTERFACE_ALLOCATION__ALLOCATED_INTERFACE);
		}
		return provisioningInterfaceAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getAllocatingInterfaces() {
		if (allocatingInterfaces == null) {
			allocatingInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.INTERFACE__ALLOCATING_INTERFACES);
		}
		return allocatingInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getAllocatingComponents() {
		if (allocatingComponents == null) {
			allocatingComponents = new EObjectResolvingEList<Component>(Component.class, this, CsPackage.INTERFACE__ALLOCATING_COMPONENTS);
		}
		return allocatingComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExchangeItem> getExchangeItems() {
		if (exchangeItems == null) {
			exchangeItems = new EObjectResolvingEList<ExchangeItem>(ExchangeItem.class, this, CsPackage.INTERFACE__EXCHANGE_ITEMS);
		}
		return exchangeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExchangeItemAllocation> getOwnedExchangeItemAllocations() {
		if (ownedExchangeItemAllocations == null) {
			ownedExchangeItemAllocations = new EObjectContainmentEList.Resolving<ExchangeItemAllocation>(ExchangeItemAllocation.class, this, CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS);
		}
		return ownedExchangeItemAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getRequiringComponents() {
		if (requiringComponents == null) {
			requiringComponents = new EObjectResolvingEList<Component>(Component.class, this, CsPackage.INTERFACE__REQUIRING_COMPONENTS);
		}
		return requiringComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentPort> getRequiringComponentPorts() {
		if (requiringComponentPorts == null) {
			requiringComponentPorts = new EObjectResolvingEList<ComponentPort>(ComponentPort.class, this, CsPackage.INTERFACE__REQUIRING_COMPONENT_PORTS);
		}
		return requiringComponentPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getProvidingComponents() {
		if (providingComponents == null) {
			providingComponents = new EObjectResolvingEList<Component>(Component.class, this, CsPackage.INTERFACE__PROVIDING_COMPONENTS);
		}
		return providingComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentPort> getProvidingComponentPorts() {
		if (providingComponentPorts == null) {
			providingComponentPorts = new EObjectResolvingEList<ComponentPort>(ComponentPort.class, this, CsPackage.INTERFACE__PROVIDING_COMPONENT_PORTS);
		}
		return providingComponentPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getRealizingLogicalInterfaces() {
		if (realizingLogicalInterfaces == null) {
			realizingLogicalInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.INTERFACE__REALIZING_LOGICAL_INTERFACES);
		}
		return realizingLogicalInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getRealizedContextInterfaces() {
		if (realizedContextInterfaces == null) {
			realizedContextInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.INTERFACE__REALIZED_CONTEXT_INTERFACES);
		}
		return realizedContextInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getRealizingPhysicalInterfaces() {
		if (realizingPhysicalInterfaces == null) {
			realizingPhysicalInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.INTERFACE__REALIZING_PHYSICAL_INTERFACES);
		}
		return realizingPhysicalInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getRealizedLogicalInterfaces() {
		if (realizedLogicalInterfaces == null) {
			realizedLogicalInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.INTERFACE__REALIZED_LOGICAL_INTERFACES);
		}
		return realizedLogicalInterfaces;
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
			case CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvisionedInterfaceAllocations()).basicAdd(otherEnd, msgs);
			case CsPackage.INTERFACE__IMPLEMENTOR_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementorComponents()).basicAdd(otherEnd, msgs);
			case CsPackage.INTERFACE__USER_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserComponents()).basicAdd(otherEnd, msgs);
			case CsPackage.INTERFACE__PROVISIONING_INTERFACE_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvisioningInterfaceAllocations()).basicAdd(otherEnd, msgs);
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
			case CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedInterfaceAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS:
				return ((InternalEList<?>)getProvisionedInterfaceAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.INTERFACE__IMPLEMENTOR_COMPONENTS:
				return ((InternalEList<?>)getImplementorComponents()).basicRemove(otherEnd, msgs);
			case CsPackage.INTERFACE__USER_COMPONENTS:
				return ((InternalEList<?>)getUserComponents()).basicRemove(otherEnd, msgs);
			case CsPackage.INTERFACE__PROVISIONING_INTERFACE_ALLOCATIONS:
				return ((InternalEList<?>)getProvisioningInterfaceAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedExchangeItemAllocations()).basicRemove(otherEnd, msgs);
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
			case CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS:
				return getOwnedInterfaceAllocations();
			case CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS:
				return getProvisionedInterfaceAllocations();
			case CsPackage.INTERFACE__ALLOCATED_INTERFACES:
				return getAllocatedInterfaces();
			case CsPackage.INTERFACE__MECHANISM:
				return getMechanism();
			case CsPackage.INTERFACE__STRUCTURAL:
				return isStructural();
			case CsPackage.INTERFACE__IMPLEMENTOR_COMPONENTS:
				return getImplementorComponents();
			case CsPackage.INTERFACE__USER_COMPONENTS:
				return getUserComponents();
			case CsPackage.INTERFACE__INTERFACE_IMPLEMENTATIONS:
				return getInterfaceImplementations();
			case CsPackage.INTERFACE__INTERFACE_USES:
				return getInterfaceUses();
			case CsPackage.INTERFACE__PROVISIONING_INTERFACE_ALLOCATIONS:
				return getProvisioningInterfaceAllocations();
			case CsPackage.INTERFACE__ALLOCATING_INTERFACES:
				return getAllocatingInterfaces();
			case CsPackage.INTERFACE__ALLOCATING_COMPONENTS:
				return getAllocatingComponents();
			case CsPackage.INTERFACE__EXCHANGE_ITEMS:
				return getExchangeItems();
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				return getOwnedExchangeItemAllocations();
			case CsPackage.INTERFACE__REQUIRING_COMPONENTS:
				return getRequiringComponents();
			case CsPackage.INTERFACE__REQUIRING_COMPONENT_PORTS:
				return getRequiringComponentPorts();
			case CsPackage.INTERFACE__PROVIDING_COMPONENTS:
				return getProvidingComponents();
			case CsPackage.INTERFACE__PROVIDING_COMPONENT_PORTS:
				return getProvidingComponentPorts();
			case CsPackage.INTERFACE__REALIZING_LOGICAL_INTERFACES:
				return getRealizingLogicalInterfaces();
			case CsPackage.INTERFACE__REALIZED_CONTEXT_INTERFACES:
				return getRealizedContextInterfaces();
			case CsPackage.INTERFACE__REALIZING_PHYSICAL_INTERFACES:
				return getRealizingPhysicalInterfaces();
			case CsPackage.INTERFACE__REALIZED_LOGICAL_INTERFACES:
				return getRealizedLogicalInterfaces();
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
			case CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS:
				getOwnedInterfaceAllocations().clear();
				getOwnedInterfaceAllocations().addAll((Collection<? extends InterfaceAllocation>)newValue);
				return;
			case CsPackage.INTERFACE__MECHANISM:
				setMechanism((String)newValue);
				return;
			case CsPackage.INTERFACE__STRUCTURAL:
				setStructural((Boolean)newValue);
				return;
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				getOwnedExchangeItemAllocations().clear();
				getOwnedExchangeItemAllocations().addAll((Collection<? extends ExchangeItemAllocation>)newValue);
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
			case CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS:
				getOwnedInterfaceAllocations().clear();
				return;
			case CsPackage.INTERFACE__MECHANISM:
				setMechanism(MECHANISM_EDEFAULT);
				return;
			case CsPackage.INTERFACE__STRUCTURAL:
				setStructural(STRUCTURAL_EDEFAULT);
				return;
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				getOwnedExchangeItemAllocations().clear();
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
			case CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS:
				return ownedInterfaceAllocations != null && !ownedInterfaceAllocations.isEmpty();
			case CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS:
				return provisionedInterfaceAllocations != null && !provisionedInterfaceAllocations.isEmpty();
			case CsPackage.INTERFACE__ALLOCATED_INTERFACES:
				return allocatedInterfaces != null && !allocatedInterfaces.isEmpty();
			case CsPackage.INTERFACE__MECHANISM:
				return MECHANISM_EDEFAULT == null ? mechanism != null : !MECHANISM_EDEFAULT.equals(mechanism);
			case CsPackage.INTERFACE__STRUCTURAL:
				return structural != STRUCTURAL_EDEFAULT;
			case CsPackage.INTERFACE__IMPLEMENTOR_COMPONENTS:
				return implementorComponents != null && !implementorComponents.isEmpty();
			case CsPackage.INTERFACE__USER_COMPONENTS:
				return userComponents != null && !userComponents.isEmpty();
			case CsPackage.INTERFACE__INTERFACE_IMPLEMENTATIONS:
				return interfaceImplementations != null && !interfaceImplementations.isEmpty();
			case CsPackage.INTERFACE__INTERFACE_USES:
				return interfaceUses != null && !interfaceUses.isEmpty();
			case CsPackage.INTERFACE__PROVISIONING_INTERFACE_ALLOCATIONS:
				return provisioningInterfaceAllocations != null && !provisioningInterfaceAllocations.isEmpty();
			case CsPackage.INTERFACE__ALLOCATING_INTERFACES:
				return allocatingInterfaces != null && !allocatingInterfaces.isEmpty();
			case CsPackage.INTERFACE__ALLOCATING_COMPONENTS:
				return allocatingComponents != null && !allocatingComponents.isEmpty();
			case CsPackage.INTERFACE__EXCHANGE_ITEMS:
				return exchangeItems != null && !exchangeItems.isEmpty();
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				return ownedExchangeItemAllocations != null && !ownedExchangeItemAllocations.isEmpty();
			case CsPackage.INTERFACE__REQUIRING_COMPONENTS:
				return requiringComponents != null && !requiringComponents.isEmpty();
			case CsPackage.INTERFACE__REQUIRING_COMPONENT_PORTS:
				return requiringComponentPorts != null && !requiringComponentPorts.isEmpty();
			case CsPackage.INTERFACE__PROVIDING_COMPONENTS:
				return providingComponents != null && !providingComponents.isEmpty();
			case CsPackage.INTERFACE__PROVIDING_COMPONENT_PORTS:
				return providingComponentPorts != null && !providingComponentPorts.isEmpty();
			case CsPackage.INTERFACE__REALIZING_LOGICAL_INTERFACES:
				return realizingLogicalInterfaces != null && !realizingLogicalInterfaces.isEmpty();
			case CsPackage.INTERFACE__REALIZED_CONTEXT_INTERFACES:
				return realizedContextInterfaces != null && !realizedContextInterfaces.isEmpty();
			case CsPackage.INTERFACE__REALIZING_PHYSICAL_INTERFACES:
				return realizingPhysicalInterfaces != null && !realizingPhysicalInterfaces.isEmpty();
			case CsPackage.INTERFACE__REALIZED_LOGICAL_INTERFACES:
				return realizedLogicalInterfaces != null && !realizedLogicalInterfaces.isEmpty();
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
		if (baseClass == InterfaceAllocator.class) {
			switch (derivedFeatureID) {
				case CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS: return CsPackage.INTERFACE_ALLOCATOR__OWNED_INTERFACE_ALLOCATIONS;
				case CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS: return CsPackage.INTERFACE_ALLOCATOR__PROVISIONED_INTERFACE_ALLOCATIONS;
				case CsPackage.INTERFACE__ALLOCATED_INTERFACES: return CsPackage.INTERFACE_ALLOCATOR__ALLOCATED_INTERFACES;
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
		if (baseClass == InterfaceAllocator.class) {
			switch (baseFeatureID) {
				case CsPackage.INTERFACE_ALLOCATOR__OWNED_INTERFACE_ALLOCATIONS: return CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS;
				case CsPackage.INTERFACE_ALLOCATOR__PROVISIONED_INTERFACE_ALLOCATIONS: return CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS;
				case CsPackage.INTERFACE_ALLOCATOR__ALLOCATED_INTERFACES: return CsPackage.INTERFACE__ALLOCATED_INTERFACES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mechanism: "); //$NON-NLS-1$
		result.append(mechanism);
		result.append(", structural: "); //$NON-NLS-1$
		result.append(structural);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
