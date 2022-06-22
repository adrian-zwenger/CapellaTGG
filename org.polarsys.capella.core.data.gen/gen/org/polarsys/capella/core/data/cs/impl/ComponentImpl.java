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
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.Classifier;
import org.polarsys.capella.core.data.capellacore.Feature;
import org.polarsys.capella.core.data.capellacore.GeneralizableElement;
import org.polarsys.capella.core.data.capellacore.Generalization;

import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.ComponentRealization;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.cs.InterfaceAllocation;
import org.polarsys.capella.core.data.cs.InterfaceAllocator;
import org.polarsys.capella.core.data.cs.InterfaceImplementation;
import org.polarsys.capella.core.data.cs.InterfaceUse;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.cs.PhysicalLinkCategory;
import org.polarsys.capella.core.data.cs.PhysicalPath;
import org.polarsys.capella.core.data.cs.PhysicalPort;

import org.polarsys.capella.core.data.fa.ComponentPort;

import org.polarsys.capella.core.data.information.Property;

import org.polarsys.capella.core.data.information.communication.CommunicationLink;
import org.polarsys.capella.core.data.information.communication.CommunicationLinkExchanger;
import org.polarsys.capella.core.data.information.communication.CommunicationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getOwnedGeneralizations <em>Owned Generalizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getSuperGeneralizations <em>Super Generalizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getSubGeneralizations <em>Sub Generalizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getOwnedFeatures <em>Owned Features</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getContainedProperties <em>Contained Properties</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getOwnedInterfaceAllocations <em>Owned Interface Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getProvisionedInterfaceAllocations <em>Provisioned Interface Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getAllocatedInterfaces <em>Allocated Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getOwnedCommunicationLinks <em>Owned Communication Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getProduce <em>Produce</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getSend <em>Send</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getCall <em>Call</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getExecute <em>Execute</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getWrite <em>Write</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getAcquire <em>Acquire</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getTransmit <em>Transmit</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#isActor <em>Actor</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#isHuman <em>Human</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getOwnedInterfaceUses <em>Owned Interface Uses</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getUsedInterfaceLinks <em>Used Interface Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getUsedInterfaces <em>Used Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getOwnedInterfaceImplementations <em>Owned Interface Implementations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getImplementedInterfaceLinks <em>Implemented Interface Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getImplementedInterfaces <em>Implemented Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getOwnedComponentRealizations <em>Owned Component Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getRealizedComponents <em>Realized Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getRealizingComponents <em>Realizing Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getContainedComponentPorts <em>Contained Component Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getContainedParts <em>Contained Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getContainedPhysicalPorts <em>Contained Physical Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getOwnedPhysicalPath <em>Owned Physical Path</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getOwnedPhysicalLinks <em>Owned Physical Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getOwnedPhysicalLinkCategories <em>Owned Physical Link Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.ComponentImpl#getRepresentingParts <em>Representing Parts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends BlockImpl implements Component {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedGeneralizations() <em>Owned Generalizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> ownedGeneralizations;

	/**
	 * The cached value of the '{@link #getSuperGeneralizations() <em>Super Generalizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> superGeneralizations;

	/**
	 * The cached value of the '{@link #getSubGeneralizations() <em>Sub Generalizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> subGeneralizations;

	/**
	 * The cached value of the '{@link #getSuper() <em>Super</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizableElement> super_;

	/**
	 * The cached value of the '{@link #getSub() <em>Sub</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizableElement> sub;

	/**
	 * The cached value of the '{@link #getOwnedFeatures() <em>Owned Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> ownedFeatures;

	/**
	 * The cached value of the '{@link #getContainedProperties() <em>Contained Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> containedProperties;

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
	 * The cached value of the '{@link #getOwnedCommunicationLinks() <em>Owned Communication Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCommunicationLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> ownedCommunicationLinks;

	/**
	 * The cached value of the '{@link #getProduce() <em>Produce</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduce()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> produce;

	/**
	 * The cached value of the '{@link #getConsume() <em>Consume</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsume()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> consume;

	/**
	 * The cached value of the '{@link #getSend() <em>Send</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> send;

	/**
	 * The cached value of the '{@link #getReceive() <em>Receive</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceive()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> receive;

	/**
	 * The cached value of the '{@link #getCall() <em>Call</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCall()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> call;

	/**
	 * The cached value of the '{@link #getExecute() <em>Execute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> execute;

	/**
	 * The cached value of the '{@link #getWrite() <em>Write</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> write;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> access;

	/**
	 * The cached value of the '{@link #getAcquire() <em>Acquire</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquire()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> acquire;

	/**
	 * The cached value of the '{@link #getTransmit() <em>Transmit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmit()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> transmit;

	/**
	 * The default value of the '{@link #isActor() <em>Actor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActor() <em>Actor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActor()
	 * @generated
	 * @ordered
	 */
	protected boolean actor = ACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isHuman() <em>Human</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHuman()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HUMAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHuman() <em>Human</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHuman()
	 * @generated
	 * @ordered
	 */
	protected boolean human = HUMAN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedInterfaceUses() <em>Owned Interface Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInterfaceUses()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceUse> ownedInterfaceUses;

	/**
	 * The cached value of the '{@link #getUsedInterfaceLinks() <em>Used Interface Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedInterfaceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceUse> usedInterfaceLinks;

	/**
	 * The cached value of the '{@link #getUsedInterfaces() <em>Used Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> usedInterfaces;

	/**
	 * The cached value of the '{@link #getOwnedInterfaceImplementations() <em>Owned Interface Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInterfaceImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceImplementation> ownedInterfaceImplementations;

	/**
	 * The cached value of the '{@link #getImplementedInterfaceLinks() <em>Implemented Interface Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedInterfaceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceImplementation> implementedInterfaceLinks;

	/**
	 * The cached value of the '{@link #getImplementedInterfaces() <em>Implemented Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> implementedInterfaces;

	/**
	 * The cached value of the '{@link #getOwnedComponentRealizations() <em>Owned Component Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentRealization> ownedComponentRealizations;

	/**
	 * The cached value of the '{@link #getRealizedComponents() <em>Realized Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> realizedComponents;

	/**
	 * The cached value of the '{@link #getRealizingComponents() <em>Realizing Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> realizingComponents;

	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> providedInterfaces;

	/**
	 * The cached value of the '{@link #getRequiredInterfaces() <em>Required Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> requiredInterfaces;

	/**
	 * The cached value of the '{@link #getContainedComponentPorts() <em>Contained Component Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedComponentPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPort> containedComponentPorts;

	/**
	 * The cached value of the '{@link #getContainedParts() <em>Contained Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> containedParts;

	/**
	 * The cached value of the '{@link #getContainedPhysicalPorts() <em>Contained Physical Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPhysicalPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPort> containedPhysicalPorts;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalPath() <em>Owned Physical Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalPath()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPath> ownedPhysicalPath;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalLinks() <em>Owned Physical Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLink> ownedPhysicalLinks;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalLinkCategories() <em>Owned Physical Link Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalLinkCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLinkCategory> ownedPhysicalLinkCategories;

	/**
	 * The cached value of the '{@link #getRepresentingParts() <em>Representing Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentingParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> representingParts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.COMPONENT__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Generalization> getOwnedGeneralizations() {
		if (ownedGeneralizations == null) {
			ownedGeneralizations = new EObjectContainmentEList.Resolving<Generalization>(Generalization.class, this, CsPackage.COMPONENT__OWNED_GENERALIZATIONS);
		}
		return ownedGeneralizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Generalization> getSuperGeneralizations() {
		if (superGeneralizations == null) {
			superGeneralizations = new EObjectEList<Generalization>(Generalization.class, this, CsPackage.COMPONENT__SUPER_GENERALIZATIONS);
		}
		return superGeneralizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Generalization> getSubGeneralizations() {
		if (subGeneralizations == null) {
			subGeneralizations = new EObjectResolvingEList<Generalization>(Generalization.class, this, CsPackage.COMPONENT__SUB_GENERALIZATIONS);
		}
		return subGeneralizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GeneralizableElement> getSuper() {
		if (super_ == null) {
			super_ = new EObjectWithInverseResolvingEList.ManyInverse<GeneralizableElement>(GeneralizableElement.class, this, CsPackage.COMPONENT__SUPER, CapellacorePackage.GENERALIZABLE_ELEMENT__SUB);
		}
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GeneralizableElement> getSub() {
		if (sub == null) {
			sub = new EObjectWithInverseResolvingEList.ManyInverse<GeneralizableElement>(GeneralizableElement.class, this, CsPackage.COMPONENT__SUB, CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER);
		}
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getOwnedFeatures() {
		if (ownedFeatures == null) {
			ownedFeatures = new EObjectContainmentEList.Resolving<Feature>(Feature.class, this, CsPackage.COMPONENT__OWNED_FEATURES);
		}
		return ownedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getContainedProperties() {
		if (containedProperties == null) {
			containedProperties = new EObjectResolvingEList<Property>(Property.class, this, CsPackage.COMPONENT__CONTAINED_PROPERTIES);
		}
		return containedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfaceAllocation> getOwnedInterfaceAllocations() {
		if (ownedInterfaceAllocations == null) {
			ownedInterfaceAllocations = new EObjectContainmentEList.Resolving<InterfaceAllocation>(InterfaceAllocation.class, this, CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS);
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
			provisionedInterfaceAllocations = new EObjectWithInverseResolvingEList<InterfaceAllocation>(InterfaceAllocation.class, this, CsPackage.COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS, CsPackage.INTERFACE_ALLOCATION__ALLOCATING_INTERFACE_ALLOCATOR);
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
			allocatedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.COMPONENT__ALLOCATED_INTERFACES);
		}
		return allocatedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationLink> getOwnedCommunicationLinks() {
		if (ownedCommunicationLinks == null) {
			ownedCommunicationLinks = new EObjectContainmentEList.Resolving<CommunicationLink>(CommunicationLink.class, this, CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS);
		}
		return ownedCommunicationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationLink> getProduce() {
		if (produce == null) {
			produce = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CsPackage.COMPONENT__PRODUCE);
		}
		return produce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationLink> getConsume() {
		if (consume == null) {
			consume = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CsPackage.COMPONENT__CONSUME);
		}
		return consume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationLink> getSend() {
		if (send == null) {
			send = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CsPackage.COMPONENT__SEND);
		}
		return send;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationLink> getReceive() {
		if (receive == null) {
			receive = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CsPackage.COMPONENT__RECEIVE);
		}
		return receive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationLink> getCall() {
		if (call == null) {
			call = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CsPackage.COMPONENT__CALL);
		}
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationLink> getExecute() {
		if (execute == null) {
			execute = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CsPackage.COMPONENT__EXECUTE);
		}
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationLink> getWrite() {
		if (write == null) {
			write = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CsPackage.COMPONENT__WRITE);
		}
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationLink> getAccess() {
		if (access == null) {
			access = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CsPackage.COMPONENT__ACCESS);
		}
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationLink> getAcquire() {
		if (acquire == null) {
			acquire = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CsPackage.COMPONENT__ACQUIRE);
		}
		return acquire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationLink> getTransmit() {
		if (transmit == null) {
			transmit = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CsPackage.COMPONENT__TRANSMIT);
		}
		return transmit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActor(boolean newActor) {
		boolean oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.COMPONENT__ACTOR, oldActor, actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHuman() {
		return human;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHuman(boolean newHuman) {
		boolean oldHuman = human;
		human = newHuman;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.COMPONENT__HUMAN, oldHuman, human));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfaceUse> getOwnedInterfaceUses() {
		if (ownedInterfaceUses == null) {
			ownedInterfaceUses = new EObjectContainmentEList<InterfaceUse>(InterfaceUse.class, this, CsPackage.COMPONENT__OWNED_INTERFACE_USES);
		}
		return ownedInterfaceUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfaceUse> getUsedInterfaceLinks() {
		if (usedInterfaceLinks == null) {
			usedInterfaceLinks = new EObjectWithInverseResolvingEList<InterfaceUse>(InterfaceUse.class, this, CsPackage.COMPONENT__USED_INTERFACE_LINKS, CsPackage.INTERFACE_USE__INTERFACE_USER);
		}
		return usedInterfaceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getUsedInterfaces() {
		if (usedInterfaces == null) {
			usedInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this, CsPackage.COMPONENT__USED_INTERFACES, CsPackage.INTERFACE__USER_COMPONENTS);
		}
		return usedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfaceImplementation> getOwnedInterfaceImplementations() {
		if (ownedInterfaceImplementations == null) {
			ownedInterfaceImplementations = new EObjectContainmentEList<InterfaceImplementation>(InterfaceImplementation.class, this, CsPackage.COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS);
		}
		return ownedInterfaceImplementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfaceImplementation> getImplementedInterfaceLinks() {
		if (implementedInterfaceLinks == null) {
			implementedInterfaceLinks = new EObjectWithInverseResolvingEList<InterfaceImplementation>(InterfaceImplementation.class, this, CsPackage.COMPONENT__IMPLEMENTED_INTERFACE_LINKS, CsPackage.INTERFACE_IMPLEMENTATION__INTERFACE_IMPLEMENTOR);
		}
		return implementedInterfaceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getImplementedInterfaces() {
		if (implementedInterfaces == null) {
			implementedInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this, CsPackage.COMPONENT__IMPLEMENTED_INTERFACES, CsPackage.INTERFACE__IMPLEMENTOR_COMPONENTS);
		}
		return implementedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentRealization> getOwnedComponentRealizations() {
		if (ownedComponentRealizations == null) {
			ownedComponentRealizations = new EObjectContainmentEList.Resolving<ComponentRealization>(ComponentRealization.class, this, CsPackage.COMPONENT__OWNED_COMPONENT_REALIZATIONS);
		}
		return ownedComponentRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getRealizedComponents() {
		if (realizedComponents == null) {
			realizedComponents = new EObjectResolvingEList<Component>(Component.class, this, CsPackage.COMPONENT__REALIZED_COMPONENTS);
		}
		return realizedComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getRealizingComponents() {
		if (realizingComponents == null) {
			realizingComponents = new EObjectResolvingEList<Component>(Component.class, this, CsPackage.COMPONENT__REALIZING_COMPONENTS);
		}
		return realizingComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.COMPONENT__PROVIDED_INTERFACES);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getRequiredInterfaces() {
		if (requiredInterfaces == null) {
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.COMPONENT__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentPort> getContainedComponentPorts() {
		if (containedComponentPorts == null) {
			containedComponentPorts = new EObjectResolvingEList<ComponentPort>(ComponentPort.class, this, CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS);
		}
		return containedComponentPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Part> getContainedParts() {
		if (containedParts == null) {
			containedParts = new EObjectResolvingEList<Part>(Part.class, this, CsPackage.COMPONENT__CONTAINED_PARTS);
		}
		return containedParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalPort> getContainedPhysicalPorts() {
		if (containedPhysicalPorts == null) {
			containedPhysicalPorts = new EObjectResolvingEList<PhysicalPort>(PhysicalPort.class, this, CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS);
		}
		return containedPhysicalPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalPath> getOwnedPhysicalPath() {
		if (ownedPhysicalPath == null) {
			ownedPhysicalPath = new EObjectContainmentEList.Resolving<PhysicalPath>(PhysicalPath.class, this, CsPackage.COMPONENT__OWNED_PHYSICAL_PATH);
		}
		return ownedPhysicalPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalLink> getOwnedPhysicalLinks() {
		if (ownedPhysicalLinks == null) {
			ownedPhysicalLinks = new EObjectContainmentEList.Resolving<PhysicalLink>(PhysicalLink.class, this, CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS);
		}
		return ownedPhysicalLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalLinkCategory> getOwnedPhysicalLinkCategories() {
		if (ownedPhysicalLinkCategories == null) {
			ownedPhysicalLinkCategories = new EObjectContainmentEList.Resolving<PhysicalLinkCategory>(PhysicalLinkCategory.class, this, CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES);
		}
		return ownedPhysicalLinkCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Part> getRepresentingParts() {
		if (representingParts == null) {
			representingParts = new EObjectResolvingEList<Part>(Part.class, this, CsPackage.COMPONENT__REPRESENTING_PARTS);
		}
		return representingParts;
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
			case CsPackage.COMPONENT__SUPER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuper()).basicAdd(otherEnd, msgs);
			case CsPackage.COMPONENT__SUB:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSub()).basicAdd(otherEnd, msgs);
			case CsPackage.COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvisionedInterfaceAllocations()).basicAdd(otherEnd, msgs);
			case CsPackage.COMPONENT__USED_INTERFACE_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedInterfaceLinks()).basicAdd(otherEnd, msgs);
			case CsPackage.COMPONENT__USED_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedInterfaces()).basicAdd(otherEnd, msgs);
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACE_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementedInterfaceLinks()).basicAdd(otherEnd, msgs);
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementedInterfaces()).basicAdd(otherEnd, msgs);
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
			case CsPackage.COMPONENT__OWNED_GENERALIZATIONS:
				return ((InternalEList<?>)getOwnedGeneralizations()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__SUPER:
				return ((InternalEList<?>)getSuper()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_FEATURES:
				return ((InternalEList<?>)getOwnedFeatures()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedInterfaceAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS:
				return ((InternalEList<?>)getProvisionedInterfaceAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				return ((InternalEList<?>)getOwnedCommunicationLinks()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_INTERFACE_USES:
				return ((InternalEList<?>)getOwnedInterfaceUses()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__USED_INTERFACE_LINKS:
				return ((InternalEList<?>)getUsedInterfaceLinks()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__USED_INTERFACES:
				return ((InternalEList<?>)getUsedInterfaces()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				return ((InternalEList<?>)getOwnedInterfaceImplementations()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACE_LINKS:
				return ((InternalEList<?>)getImplementedInterfaceLinks()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACES:
				return ((InternalEList<?>)getImplementedInterfaces()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_COMPONENT_REALIZATIONS:
				return ((InternalEList<?>)getOwnedComponentRealizations()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				return ((InternalEList<?>)getOwnedPhysicalPath()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				return ((InternalEList<?>)getOwnedPhysicalLinks()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				return ((InternalEList<?>)getOwnedPhysicalLinkCategories()).basicRemove(otherEnd, msgs);
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
			case CsPackage.COMPONENT__ABSTRACT:
				return isAbstract();
			case CsPackage.COMPONENT__OWNED_GENERALIZATIONS:
				return getOwnedGeneralizations();
			case CsPackage.COMPONENT__SUPER_GENERALIZATIONS:
				return getSuperGeneralizations();
			case CsPackage.COMPONENT__SUB_GENERALIZATIONS:
				return getSubGeneralizations();
			case CsPackage.COMPONENT__SUPER:
				return getSuper();
			case CsPackage.COMPONENT__SUB:
				return getSub();
			case CsPackage.COMPONENT__OWNED_FEATURES:
				return getOwnedFeatures();
			case CsPackage.COMPONENT__CONTAINED_PROPERTIES:
				return getContainedProperties();
			case CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				return getOwnedInterfaceAllocations();
			case CsPackage.COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS:
				return getProvisionedInterfaceAllocations();
			case CsPackage.COMPONENT__ALLOCATED_INTERFACES:
				return getAllocatedInterfaces();
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				return getOwnedCommunicationLinks();
			case CsPackage.COMPONENT__PRODUCE:
				return getProduce();
			case CsPackage.COMPONENT__CONSUME:
				return getConsume();
			case CsPackage.COMPONENT__SEND:
				return getSend();
			case CsPackage.COMPONENT__RECEIVE:
				return getReceive();
			case CsPackage.COMPONENT__CALL:
				return getCall();
			case CsPackage.COMPONENT__EXECUTE:
				return getExecute();
			case CsPackage.COMPONENT__WRITE:
				return getWrite();
			case CsPackage.COMPONENT__ACCESS:
				return getAccess();
			case CsPackage.COMPONENT__ACQUIRE:
				return getAcquire();
			case CsPackage.COMPONENT__TRANSMIT:
				return getTransmit();
			case CsPackage.COMPONENT__ACTOR:
				return isActor();
			case CsPackage.COMPONENT__HUMAN:
				return isHuman();
			case CsPackage.COMPONENT__OWNED_INTERFACE_USES:
				return getOwnedInterfaceUses();
			case CsPackage.COMPONENT__USED_INTERFACE_LINKS:
				return getUsedInterfaceLinks();
			case CsPackage.COMPONENT__USED_INTERFACES:
				return getUsedInterfaces();
			case CsPackage.COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				return getOwnedInterfaceImplementations();
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACE_LINKS:
				return getImplementedInterfaceLinks();
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACES:
				return getImplementedInterfaces();
			case CsPackage.COMPONENT__OWNED_COMPONENT_REALIZATIONS:
				return getOwnedComponentRealizations();
			case CsPackage.COMPONENT__REALIZED_COMPONENTS:
				return getRealizedComponents();
			case CsPackage.COMPONENT__REALIZING_COMPONENTS:
				return getRealizingComponents();
			case CsPackage.COMPONENT__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case CsPackage.COMPONENT__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS:
				return getContainedComponentPorts();
			case CsPackage.COMPONENT__CONTAINED_PARTS:
				return getContainedParts();
			case CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS:
				return getContainedPhysicalPorts();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				return getOwnedPhysicalPath();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				return getOwnedPhysicalLinks();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				return getOwnedPhysicalLinkCategories();
			case CsPackage.COMPONENT__REPRESENTING_PARTS:
				return getRepresentingParts();
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
			case CsPackage.COMPONENT__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_GENERALIZATIONS:
				getOwnedGeneralizations().clear();
				getOwnedGeneralizations().addAll((Collection<? extends Generalization>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_FEATURES:
				getOwnedFeatures().clear();
				getOwnedFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				getOwnedInterfaceAllocations().clear();
				getOwnedInterfaceAllocations().addAll((Collection<? extends InterfaceAllocation>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				getOwnedCommunicationLinks().clear();
				getOwnedCommunicationLinks().addAll((Collection<? extends CommunicationLink>)newValue);
				return;
			case CsPackage.COMPONENT__ACTOR:
				setActor((Boolean)newValue);
				return;
			case CsPackage.COMPONENT__HUMAN:
				setHuman((Boolean)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_INTERFACE_USES:
				getOwnedInterfaceUses().clear();
				getOwnedInterfaceUses().addAll((Collection<? extends InterfaceUse>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				getOwnedInterfaceImplementations().clear();
				getOwnedInterfaceImplementations().addAll((Collection<? extends InterfaceImplementation>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_COMPONENT_REALIZATIONS:
				getOwnedComponentRealizations().clear();
				getOwnedComponentRealizations().addAll((Collection<? extends ComponentRealization>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				getOwnedPhysicalPath().clear();
				getOwnedPhysicalPath().addAll((Collection<? extends PhysicalPath>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				getOwnedPhysicalLinks().clear();
				getOwnedPhysicalLinks().addAll((Collection<? extends PhysicalLink>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				getOwnedPhysicalLinkCategories().clear();
				getOwnedPhysicalLinkCategories().addAll((Collection<? extends PhysicalLinkCategory>)newValue);
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
			case CsPackage.COMPONENT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case CsPackage.COMPONENT__OWNED_GENERALIZATIONS:
				getOwnedGeneralizations().clear();
				return;
			case CsPackage.COMPONENT__OWNED_FEATURES:
				getOwnedFeatures().clear();
				return;
			case CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				getOwnedInterfaceAllocations().clear();
				return;
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				getOwnedCommunicationLinks().clear();
				return;
			case CsPackage.COMPONENT__ACTOR:
				setActor(ACTOR_EDEFAULT);
				return;
			case CsPackage.COMPONENT__HUMAN:
				setHuman(HUMAN_EDEFAULT);
				return;
			case CsPackage.COMPONENT__OWNED_INTERFACE_USES:
				getOwnedInterfaceUses().clear();
				return;
			case CsPackage.COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				getOwnedInterfaceImplementations().clear();
				return;
			case CsPackage.COMPONENT__OWNED_COMPONENT_REALIZATIONS:
				getOwnedComponentRealizations().clear();
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				getOwnedPhysicalPath().clear();
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				getOwnedPhysicalLinks().clear();
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				getOwnedPhysicalLinkCategories().clear();
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
			case CsPackage.COMPONENT__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case CsPackage.COMPONENT__OWNED_GENERALIZATIONS:
				return ownedGeneralizations != null && !ownedGeneralizations.isEmpty();
			case CsPackage.COMPONENT__SUPER_GENERALIZATIONS:
				return superGeneralizations != null && !superGeneralizations.isEmpty();
			case CsPackage.COMPONENT__SUB_GENERALIZATIONS:
				return subGeneralizations != null && !subGeneralizations.isEmpty();
			case CsPackage.COMPONENT__SUPER:
				return super_ != null && !super_.isEmpty();
			case CsPackage.COMPONENT__SUB:
				return sub != null && !sub.isEmpty();
			case CsPackage.COMPONENT__OWNED_FEATURES:
				return ownedFeatures != null && !ownedFeatures.isEmpty();
			case CsPackage.COMPONENT__CONTAINED_PROPERTIES:
				return containedProperties != null && !containedProperties.isEmpty();
			case CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				return ownedInterfaceAllocations != null && !ownedInterfaceAllocations.isEmpty();
			case CsPackage.COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS:
				return provisionedInterfaceAllocations != null && !provisionedInterfaceAllocations.isEmpty();
			case CsPackage.COMPONENT__ALLOCATED_INTERFACES:
				return allocatedInterfaces != null && !allocatedInterfaces.isEmpty();
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				return ownedCommunicationLinks != null && !ownedCommunicationLinks.isEmpty();
			case CsPackage.COMPONENT__PRODUCE:
				return produce != null && !produce.isEmpty();
			case CsPackage.COMPONENT__CONSUME:
				return consume != null && !consume.isEmpty();
			case CsPackage.COMPONENT__SEND:
				return send != null && !send.isEmpty();
			case CsPackage.COMPONENT__RECEIVE:
				return receive != null && !receive.isEmpty();
			case CsPackage.COMPONENT__CALL:
				return call != null && !call.isEmpty();
			case CsPackage.COMPONENT__EXECUTE:
				return execute != null && !execute.isEmpty();
			case CsPackage.COMPONENT__WRITE:
				return write != null && !write.isEmpty();
			case CsPackage.COMPONENT__ACCESS:
				return access != null && !access.isEmpty();
			case CsPackage.COMPONENT__ACQUIRE:
				return acquire != null && !acquire.isEmpty();
			case CsPackage.COMPONENT__TRANSMIT:
				return transmit != null && !transmit.isEmpty();
			case CsPackage.COMPONENT__ACTOR:
				return actor != ACTOR_EDEFAULT;
			case CsPackage.COMPONENT__HUMAN:
				return human != HUMAN_EDEFAULT;
			case CsPackage.COMPONENT__OWNED_INTERFACE_USES:
				return ownedInterfaceUses != null && !ownedInterfaceUses.isEmpty();
			case CsPackage.COMPONENT__USED_INTERFACE_LINKS:
				return usedInterfaceLinks != null && !usedInterfaceLinks.isEmpty();
			case CsPackage.COMPONENT__USED_INTERFACES:
				return usedInterfaces != null && !usedInterfaces.isEmpty();
			case CsPackage.COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				return ownedInterfaceImplementations != null && !ownedInterfaceImplementations.isEmpty();
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACE_LINKS:
				return implementedInterfaceLinks != null && !implementedInterfaceLinks.isEmpty();
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACES:
				return implementedInterfaces != null && !implementedInterfaces.isEmpty();
			case CsPackage.COMPONENT__OWNED_COMPONENT_REALIZATIONS:
				return ownedComponentRealizations != null && !ownedComponentRealizations.isEmpty();
			case CsPackage.COMPONENT__REALIZED_COMPONENTS:
				return realizedComponents != null && !realizedComponents.isEmpty();
			case CsPackage.COMPONENT__REALIZING_COMPONENTS:
				return realizingComponents != null && !realizingComponents.isEmpty();
			case CsPackage.COMPONENT__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case CsPackage.COMPONENT__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS:
				return containedComponentPorts != null && !containedComponentPorts.isEmpty();
			case CsPackage.COMPONENT__CONTAINED_PARTS:
				return containedParts != null && !containedParts.isEmpty();
			case CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS:
				return containedPhysicalPorts != null && !containedPhysicalPorts.isEmpty();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				return ownedPhysicalPath != null && !ownedPhysicalPath.isEmpty();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				return ownedPhysicalLinks != null && !ownedPhysicalLinks.isEmpty();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				return ownedPhysicalLinkCategories != null && !ownedPhysicalLinkCategories.isEmpty();
			case CsPackage.COMPONENT__REPRESENTING_PARTS:
				return representingParts != null && !representingParts.isEmpty();
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
		if (baseClass == GeneralizableElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.COMPONENT__ABSTRACT: return CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT;
				case CsPackage.COMPONENT__OWNED_GENERALIZATIONS: return CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS;
				case CsPackage.COMPONENT__SUPER_GENERALIZATIONS: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS;
				case CsPackage.COMPONENT__SUB_GENERALIZATIONS: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUB_GENERALIZATIONS;
				case CsPackage.COMPONENT__SUPER: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER;
				case CsPackage.COMPONENT__SUB: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUB;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				case CsPackage.COMPONENT__OWNED_FEATURES: return CapellacorePackage.CLASSIFIER__OWNED_FEATURES;
				case CsPackage.COMPONENT__CONTAINED_PROPERTIES: return CapellacorePackage.CLASSIFIER__CONTAINED_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == InterfaceAllocator.class) {
			switch (derivedFeatureID) {
				case CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS: return CsPackage.INTERFACE_ALLOCATOR__OWNED_INTERFACE_ALLOCATIONS;
				case CsPackage.COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS: return CsPackage.INTERFACE_ALLOCATOR__PROVISIONED_INTERFACE_ALLOCATIONS;
				case CsPackage.COMPONENT__ALLOCATED_INTERFACES: return CsPackage.INTERFACE_ALLOCATOR__ALLOCATED_INTERFACES;
				default: return -1;
			}
		}
		if (baseClass == CommunicationLinkExchanger.class) {
			switch (derivedFeatureID) {
				case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS;
				case CsPackage.COMPONENT__PRODUCE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__PRODUCE;
				case CsPackage.COMPONENT__CONSUME: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CONSUME;
				case CsPackage.COMPONENT__SEND: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__SEND;
				case CsPackage.COMPONENT__RECEIVE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__RECEIVE;
				case CsPackage.COMPONENT__CALL: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CALL;
				case CsPackage.COMPONENT__EXECUTE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__EXECUTE;
				case CsPackage.COMPONENT__WRITE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__WRITE;
				case CsPackage.COMPONENT__ACCESS: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACCESS;
				case CsPackage.COMPONENT__ACQUIRE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACQUIRE;
				case CsPackage.COMPONENT__TRANSMIT: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__TRANSMIT;
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
		if (baseClass == GeneralizableElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT: return CsPackage.COMPONENT__ABSTRACT;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS: return CsPackage.COMPONENT__OWNED_GENERALIZATIONS;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS: return CsPackage.COMPONENT__SUPER_GENERALIZATIONS;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUB_GENERALIZATIONS: return CsPackage.COMPONENT__SUB_GENERALIZATIONS;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER: return CsPackage.COMPONENT__SUPER;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUB: return CsPackage.COMPONENT__SUB;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.CLASSIFIER__OWNED_FEATURES: return CsPackage.COMPONENT__OWNED_FEATURES;
				case CapellacorePackage.CLASSIFIER__CONTAINED_PROPERTIES: return CsPackage.COMPONENT__CONTAINED_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == InterfaceAllocator.class) {
			switch (baseFeatureID) {
				case CsPackage.INTERFACE_ALLOCATOR__OWNED_INTERFACE_ALLOCATIONS: return CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS;
				case CsPackage.INTERFACE_ALLOCATOR__PROVISIONED_INTERFACE_ALLOCATIONS: return CsPackage.COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS;
				case CsPackage.INTERFACE_ALLOCATOR__ALLOCATED_INTERFACES: return CsPackage.COMPONENT__ALLOCATED_INTERFACES;
				default: return -1;
			}
		}
		if (baseClass == CommunicationLinkExchanger.class) {
			switch (baseFeatureID) {
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS: return CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__PRODUCE: return CsPackage.COMPONENT__PRODUCE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CONSUME: return CsPackage.COMPONENT__CONSUME;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__SEND: return CsPackage.COMPONENT__SEND;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__RECEIVE: return CsPackage.COMPONENT__RECEIVE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CALL: return CsPackage.COMPONENT__CALL;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__EXECUTE: return CsPackage.COMPONENT__EXECUTE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__WRITE: return CsPackage.COMPONENT__WRITE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACCESS: return CsPackage.COMPONENT__ACCESS;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACQUIRE: return CsPackage.COMPONENT__ACQUIRE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__TRANSMIT: return CsPackage.COMPONENT__TRANSMIT;
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
		result.append(" (abstract: "); //$NON-NLS-1$
		result.append(abstract_);
		result.append(", actor: "); //$NON-NLS-1$
		result.append(actor);
		result.append(", human: "); //$NON-NLS-1$
		result.append(human);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
