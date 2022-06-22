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

import modellingcore.AbstractNamedElement;
import modellingcore.AbstractType;
import modellingcore.AbstractTypedElement;
import modellingcore.ModellingcorePackage;

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

import org.polarsys.capella.core.data.capellacommon.AbstractCapabilityPkg;
import org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvedElement;
import org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvement;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.data.capellacommon.GenericTrace;
import org.polarsys.capella.core.data.capellacommon.StateMachine;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.Classifier;
import org.polarsys.capella.core.data.capellacore.Feature;
import org.polarsys.capella.core.data.capellacore.GeneralizableElement;
import org.polarsys.capella.core.data.capellacore.Generalization;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.capellacore.ModellingBlock;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.capellacore.Namespace;
import org.polarsys.capella.core.data.capellacore.NamingRule;
import org.polarsys.capella.core.data.capellacore.Trace;
import org.polarsys.capella.core.data.capellacore.Type;
import org.polarsys.capella.core.data.capellacore.TypedElement;

import org.polarsys.capella.core.data.cs.AbstractDeploymentLink;
import org.polarsys.capella.core.data.cs.Block;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.ComponentRealization;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.DeployableElement;
import org.polarsys.capella.core.data.cs.DeploymentTarget;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.cs.InterfaceAllocation;
import org.polarsys.capella.core.data.cs.InterfaceAllocator;
import org.polarsys.capella.core.data.cs.InterfaceImplementation;
import org.polarsys.capella.core.data.cs.InterfacePkg;
import org.polarsys.capella.core.data.cs.InterfaceUse;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.cs.PhysicalLinkCategory;
import org.polarsys.capella.core.data.cs.PhysicalPath;
import org.polarsys.capella.core.data.cs.PhysicalPort;

import org.polarsys.capella.core.data.cs.impl.AbstractPhysicalArtifactImpl;

import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.AbstractFunctionalBlock;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeCategory;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.ExchangeLink;
import org.polarsys.capella.core.data.fa.FaPackage;

import org.polarsys.capella.core.data.information.DataPkg;
import org.polarsys.capella.core.data.information.Property;

import org.polarsys.capella.core.data.information.communication.CommunicationLink;
import org.polarsys.capella.core.data.information.communication.CommunicationLinkExchanger;
import org.polarsys.capella.core.data.information.communication.CommunicationPackage;

import org.polarsys.capella.core.data.la.CapabilityRealization;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.la.LogicalComponent;

import org.polarsys.capella.core.data.pa.LogicalInterfaceRealization;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponentKind;
import org.polarsys.capella.core.data.pa.PhysicalComponentNature;
import org.polarsys.capella.core.data.pa.PhysicalComponentPkg;
import org.polarsys.capella.core.data.pa.PhysicalFunction;

import org.polarsys.capella.core.data.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getAbstractTypedElements <em>Abstract Typed Elements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getTypedElements <em>Typed Elements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedFunctionalAllocation <em>Owned Functional Allocation</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedComponentExchanges <em>Owned Component Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedComponentExchangeCategories <em>Owned Component Exchange Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getFunctionalAllocations <em>Functional Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getAllocatedFunctions <em>Allocated Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getInExchangeLinks <em>In Exchange Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOutExchangeLinks <em>Out Exchange Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedAbstractCapabilityPkg <em>Owned Abstract Capability Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedInterfacePkg <em>Owned Interface Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedDataPkg <em>Owned Data Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedStateMachines <em>Owned State Machines</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedGeneralizations <em>Owned Generalizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getSuperGeneralizations <em>Super Generalizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getSubGeneralizations <em>Sub Generalizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedFeatures <em>Owned Features</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getContainedProperties <em>Contained Properties</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedInterfaceAllocations <em>Owned Interface Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getProvisionedInterfaceAllocations <em>Provisioned Interface Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getAllocatedInterfaces <em>Allocated Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedCommunicationLinks <em>Owned Communication Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getProduce <em>Produce</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getSend <em>Send</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getCall <em>Call</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getExecute <em>Execute</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getWrite <em>Write</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getAcquire <em>Acquire</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getTransmit <em>Transmit</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#isActor <em>Actor</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#isHuman <em>Human</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedInterfaceUses <em>Owned Interface Uses</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getUsedInterfaceLinks <em>Used Interface Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getUsedInterfaces <em>Used Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedInterfaceImplementations <em>Owned Interface Implementations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getImplementedInterfaceLinks <em>Implemented Interface Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getImplementedInterfaces <em>Implemented Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedComponentRealizations <em>Owned Component Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getRealizedComponents <em>Realized Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getRealizingComponents <em>Realizing Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getContainedComponentPorts <em>Contained Component Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getContainedParts <em>Contained Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getContainedPhysicalPorts <em>Contained Physical Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedPhysicalPath <em>Owned Physical Path</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedPhysicalLinks <em>Owned Physical Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedPhysicalLinkCategories <em>Owned Physical Link Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getRepresentingParts <em>Representing Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getCapabilityRealizationInvolvements <em>Capability Realization Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getInvolvingCapabilityRealizations <em>Involving Capability Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getDeployingLinks <em>Deploying Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getDeploymentLinks <em>Deployment Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedDeploymentLinks <em>Owned Deployment Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedPhysicalComponents <em>Owned Physical Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getOwnedPhysicalComponentPkgs <em>Owned Physical Component Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getLogicalInterfaceRealizations <em>Logical Interface Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getSubPhysicalComponents <em>Sub Physical Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getRealizedLogicalComponents <em>Realized Logical Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getAllocatedPhysicalFunctions <em>Allocated Physical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getDeployedPhysicalComponents <em>Deployed Physical Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalComponentImpl#getDeployingPhysicalComponents <em>Deploying Physical Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalComponentImpl extends AbstractPhysicalArtifactImpl implements PhysicalComponent {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbstractTypedElements() <em>Abstract Typed Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTypedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypedElement> abstractTypedElements;

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
	 * The cached value of the '{@link #getTypedElements() <em>Typed Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedElement> typedElements;

	/**
	 * The cached value of the '{@link #getOwnedFunctionalAllocation() <em>Owned Functional Allocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionalAllocation()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentFunctionalAllocation> ownedFunctionalAllocation;

	/**
	 * The cached value of the '{@link #getOwnedComponentExchanges() <em>Owned Component Exchanges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchange> ownedComponentExchanges;

	/**
	 * The cached value of the '{@link #getOwnedComponentExchangeCategories() <em>Owned Component Exchange Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeCategory> ownedComponentExchangeCategories;

	/**
	 * The cached value of the '{@link #getFunctionalAllocations() <em>Functional Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentFunctionalAllocation> functionalAllocations;

	/**
	 * The cached value of the '{@link #getAllocatedFunctions() <em>Allocated Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractFunction> allocatedFunctions;

	/**
	 * The cached value of the '{@link #getInExchangeLinks() <em>In Exchange Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInExchangeLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeLink> inExchangeLinks;

	/**
	 * The cached value of the '{@link #getOutExchangeLinks() <em>Out Exchange Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutExchangeLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeLink> outExchangeLinks;

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
	 * The cached value of the '{@link #getOwnedStateMachines() <em>Owned State Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStateMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> ownedStateMachines;

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
	 * The cached value of the '{@link #getInvolvingInvolvements() <em>Involving Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvingInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<Involvement> involvingInvolvements;

	/**
	 * The cached value of the '{@link #getCapabilityRealizationInvolvements() <em>Capability Realization Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityRealizationInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityRealizationInvolvement> capabilityRealizationInvolvements;

	/**
	 * The cached value of the '{@link #getInvolvingCapabilityRealizations() <em>Involving Capability Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvingCapabilityRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityRealization> involvingCapabilityRealizations;

	/**
	 * The cached value of the '{@link #getDeployingLinks() <em>Deploying Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> deployingLinks;

	/**
	 * The cached value of the '{@link #getDeploymentLinks() <em>Deployment Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> deploymentLinks;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final PhysicalComponentKind KIND_EDEFAULT = PhysicalComponentKind.UNSET;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected PhysicalComponentKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final PhysicalComponentNature NATURE_EDEFAULT = PhysicalComponentNature.UNSET;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected PhysicalComponentNature nature = NATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedDeploymentLinks() <em>Owned Deployment Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDeploymentLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> ownedDeploymentLinks;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalComponents() <em>Owned Physical Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> ownedPhysicalComponents;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalComponentPkgs() <em>Owned Physical Component Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalComponentPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponentPkg> ownedPhysicalComponentPkgs;

	/**
	 * The cached value of the '{@link #getLogicalInterfaceRealizations() <em>Logical Interface Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalInterfaceRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalInterfaceRealization> logicalInterfaceRealizations;

	/**
	 * The cached value of the '{@link #getSubPhysicalComponents() <em>Sub Physical Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPhysicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> subPhysicalComponents;

	/**
	 * The cached value of the '{@link #getRealizedLogicalComponents() <em>Realized Logical Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedLogicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComponent> realizedLogicalComponents;

	/**
	 * The cached value of the '{@link #getAllocatedPhysicalFunctions() <em>Allocated Physical Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedPhysicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalFunction> allocatedPhysicalFunctions;

	/**
	 * The cached value of the '{@link #getDeployedPhysicalComponents() <em>Deployed Physical Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedPhysicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> deployedPhysicalComponents;

	/**
	 * The cached value of the '{@link #getDeployingPhysicalComponents() <em>Deploying Physical Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployingPhysicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> deployingPhysicalComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypedElement> getAbstractTypedElements() {
		if (abstractTypedElements == null) {
			abstractTypedElements = new EObjectResolvingEList<AbstractTypedElement>(AbstractTypedElement.class, this, PaPackage.PHYSICAL_COMPONENT__ABSTRACT_TYPED_ELEMENTS);
		}
		return abstractTypedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_TRACES);
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
			containedGenericTraces = new EObjectResolvingEList<GenericTrace>(GenericTrace.class, this, PaPackage.PHYSICAL_COMPONENT__CONTAINED_GENERIC_TRACES);
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
			containedRequirementsTraces = new EObjectResolvingEList<RequirementsTrace>(RequirementsTrace.class, this, PaPackage.PHYSICAL_COMPONENT__CONTAINED_REQUIREMENTS_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, PaPackage.PHYSICAL_COMPONENT__NAMING_RULES);
		}
		return namingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypedElement> getTypedElements() {
		if (typedElements == null) {
			typedElements = new EObjectResolvingEList<TypedElement>(TypedElement.class, this, PaPackage.PHYSICAL_COMPONENT__TYPED_ELEMENTS);
		}
		return typedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentFunctionalAllocation> getOwnedFunctionalAllocation() {
		if (ownedFunctionalAllocation == null) {
			ownedFunctionalAllocation = new EObjectContainmentEList.Resolving<ComponentFunctionalAllocation>(ComponentFunctionalAllocation.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_FUNCTIONAL_ALLOCATION);
		}
		return ownedFunctionalAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchange> getOwnedComponentExchanges() {
		if (ownedComponentExchanges == null) {
			ownedComponentExchanges = new EObjectContainmentEList<ComponentExchange>(ComponentExchange.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGES);
		}
		return ownedComponentExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchangeCategory> getOwnedComponentExchangeCategories() {
		if (ownedComponentExchangeCategories == null) {
			ownedComponentExchangeCategories = new EObjectContainmentEList<ComponentExchangeCategory>(ComponentExchangeCategory.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES);
		}
		return ownedComponentExchangeCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentFunctionalAllocation> getFunctionalAllocations() {
		if (functionalAllocations == null) {
			functionalAllocations = new EObjectWithInverseResolvingEList<ComponentFunctionalAllocation>(ComponentFunctionalAllocation.class, this, PaPackage.PHYSICAL_COMPONENT__FUNCTIONAL_ALLOCATIONS, FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__BLOCK);
		}
		return functionalAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractFunction> getAllocatedFunctions() {
		if (allocatedFunctions == null) {
			allocatedFunctions = new EObjectWithInverseResolvingEList.ManyInverse<AbstractFunction>(AbstractFunction.class, this, PaPackage.PHYSICAL_COMPONENT__ALLOCATED_FUNCTIONS, FaPackage.ABSTRACT_FUNCTION__ALLOCATION_BLOCKS);
		}
		return allocatedFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExchangeLink> getInExchangeLinks() {
		if (inExchangeLinks == null) {
			inExchangeLinks = new EObjectResolvingEList<ExchangeLink>(ExchangeLink.class, this, PaPackage.PHYSICAL_COMPONENT__IN_EXCHANGE_LINKS);
		}
		return inExchangeLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExchangeLink> getOutExchangeLinks() {
		if (outExchangeLinks == null) {
			outExchangeLinks = new EObjectResolvingEList<ExchangeLink>(ExchangeLink.class, this, PaPackage.PHYSICAL_COMPONENT__OUT_EXCHANGE_LINKS);
		}
		return outExchangeLinks;
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
				NotificationChain msgs = oldOwnedAbstractCapabilityPkg.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG, null, null);
				if (newOwnedAbstractCapabilityPkg.eInternalContainer() == null) {
					msgs = newOwnedAbstractCapabilityPkg.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaPackage.PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG, oldOwnedAbstractCapabilityPkg, ownedAbstractCapabilityPkg));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG, oldOwnedAbstractCapabilityPkg, newOwnedAbstractCapabilityPkg);
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
				msgs = ((InternalEObject)ownedAbstractCapabilityPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG, null, msgs);
			if (newOwnedAbstractCapabilityPkg != null)
				msgs = ((InternalEObject)newOwnedAbstractCapabilityPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG, null, msgs);
			msgs = basicSetOwnedAbstractCapabilityPkg(newOwnedAbstractCapabilityPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG, newOwnedAbstractCapabilityPkg, newOwnedAbstractCapabilityPkg));
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
				NotificationChain msgs = oldOwnedInterfacePkg.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG, null, null);
				if (newOwnedInterfacePkg.eInternalContainer() == null) {
					msgs = newOwnedInterfacePkg.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG, oldOwnedInterfacePkg, ownedInterfacePkg));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG, oldOwnedInterfacePkg, newOwnedInterfacePkg);
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
				msgs = ((InternalEObject)ownedInterfacePkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG, null, msgs);
			if (newOwnedInterfacePkg != null)
				msgs = ((InternalEObject)newOwnedInterfacePkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG, null, msgs);
			msgs = basicSetOwnedInterfacePkg(newOwnedInterfacePkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG, newOwnedInterfacePkg, newOwnedInterfacePkg));
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
				NotificationChain msgs = oldOwnedDataPkg.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_COMPONENT__OWNED_DATA_PKG, null, null);
				if (newOwnedDataPkg.eInternalContainer() == null) {
					msgs = newOwnedDataPkg.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_COMPONENT__OWNED_DATA_PKG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaPackage.PHYSICAL_COMPONENT__OWNED_DATA_PKG, oldOwnedDataPkg, ownedDataPkg));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_COMPONENT__OWNED_DATA_PKG, oldOwnedDataPkg, newOwnedDataPkg);
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
				msgs = ((InternalEObject)ownedDataPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_COMPONENT__OWNED_DATA_PKG, null, msgs);
			if (newOwnedDataPkg != null)
				msgs = ((InternalEObject)newOwnedDataPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_COMPONENT__OWNED_DATA_PKG, null, msgs);
			msgs = basicSetOwnedDataPkg(newOwnedDataPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_COMPONENT__OWNED_DATA_PKG, newOwnedDataPkg, newOwnedDataPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StateMachine> getOwnedStateMachines() {
		if (ownedStateMachines == null) {
			ownedStateMachines = new EObjectContainmentEList.Resolving<StateMachine>(StateMachine.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_STATE_MACHINES);
		}
		return ownedStateMachines;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_COMPONENT__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Generalization> getOwnedGeneralizations() {
		if (ownedGeneralizations == null) {
			ownedGeneralizations = new EObjectContainmentEList.Resolving<Generalization>(Generalization.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_GENERALIZATIONS);
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
			superGeneralizations = new EObjectEList<Generalization>(Generalization.class, this, PaPackage.PHYSICAL_COMPONENT__SUPER_GENERALIZATIONS);
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
			subGeneralizations = new EObjectResolvingEList<Generalization>(Generalization.class, this, PaPackage.PHYSICAL_COMPONENT__SUB_GENERALIZATIONS);
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
			super_ = new EObjectWithInverseResolvingEList.ManyInverse<GeneralizableElement>(GeneralizableElement.class, this, PaPackage.PHYSICAL_COMPONENT__SUPER, CapellacorePackage.GENERALIZABLE_ELEMENT__SUB);
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
			sub = new EObjectWithInverseResolvingEList.ManyInverse<GeneralizableElement>(GeneralizableElement.class, this, PaPackage.PHYSICAL_COMPONENT__SUB, CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER);
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
			ownedFeatures = new EObjectContainmentEList.Resolving<Feature>(Feature.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_FEATURES);
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
			containedProperties = new EObjectResolvingEList<Property>(Property.class, this, PaPackage.PHYSICAL_COMPONENT__CONTAINED_PROPERTIES);
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
			ownedInterfaceAllocations = new EObjectContainmentEList.Resolving<InterfaceAllocation>(InterfaceAllocation.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_ALLOCATIONS);
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
			provisionedInterfaceAllocations = new EObjectWithInverseResolvingEList<InterfaceAllocation>(InterfaceAllocation.class, this, PaPackage.PHYSICAL_COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS, CsPackage.INTERFACE_ALLOCATION__ALLOCATING_INTERFACE_ALLOCATOR);
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
			allocatedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, PaPackage.PHYSICAL_COMPONENT__ALLOCATED_INTERFACES);
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
			ownedCommunicationLinks = new EObjectContainmentEList.Resolving<CommunicationLink>(CommunicationLink.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_COMMUNICATION_LINKS);
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
			produce = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, PaPackage.PHYSICAL_COMPONENT__PRODUCE);
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
			consume = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, PaPackage.PHYSICAL_COMPONENT__CONSUME);
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
			send = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, PaPackage.PHYSICAL_COMPONENT__SEND);
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
			receive = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, PaPackage.PHYSICAL_COMPONENT__RECEIVE);
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
			call = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, PaPackage.PHYSICAL_COMPONENT__CALL);
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
			execute = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, PaPackage.PHYSICAL_COMPONENT__EXECUTE);
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
			write = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, PaPackage.PHYSICAL_COMPONENT__WRITE);
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
			access = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, PaPackage.PHYSICAL_COMPONENT__ACCESS);
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
			acquire = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, PaPackage.PHYSICAL_COMPONENT__ACQUIRE);
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
			transmit = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, PaPackage.PHYSICAL_COMPONENT__TRANSMIT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_COMPONENT__ACTOR, oldActor, actor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_COMPONENT__HUMAN, oldHuman, human));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfaceUse> getOwnedInterfaceUses() {
		if (ownedInterfaceUses == null) {
			ownedInterfaceUses = new EObjectContainmentEList<InterfaceUse>(InterfaceUse.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_USES);
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
			usedInterfaceLinks = new EObjectWithInverseResolvingEList<InterfaceUse>(InterfaceUse.class, this, PaPackage.PHYSICAL_COMPONENT__USED_INTERFACE_LINKS, CsPackage.INTERFACE_USE__INTERFACE_USER);
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
			usedInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this, PaPackage.PHYSICAL_COMPONENT__USED_INTERFACES, CsPackage.INTERFACE__USER_COMPONENTS);
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
			ownedInterfaceImplementations = new EObjectContainmentEList<InterfaceImplementation>(InterfaceImplementation.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS);
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
			implementedInterfaceLinks = new EObjectWithInverseResolvingEList<InterfaceImplementation>(InterfaceImplementation.class, this, PaPackage.PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACE_LINKS, CsPackage.INTERFACE_IMPLEMENTATION__INTERFACE_IMPLEMENTOR);
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
			implementedInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this, PaPackage.PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACES, CsPackage.INTERFACE__IMPLEMENTOR_COMPONENTS);
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
			ownedComponentRealizations = new EObjectContainmentEList.Resolving<ComponentRealization>(ComponentRealization.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_REALIZATIONS);
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
			realizedComponents = new EObjectResolvingEList<Component>(Component.class, this, PaPackage.PHYSICAL_COMPONENT__REALIZED_COMPONENTS);
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
			realizingComponents = new EObjectResolvingEList<Component>(Component.class, this, PaPackage.PHYSICAL_COMPONENT__REALIZING_COMPONENTS);
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
			providedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, PaPackage.PHYSICAL_COMPONENT__PROVIDED_INTERFACES);
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
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, PaPackage.PHYSICAL_COMPONENT__REQUIRED_INTERFACES);
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
			containedComponentPorts = new EObjectResolvingEList<ComponentPort>(ComponentPort.class, this, PaPackage.PHYSICAL_COMPONENT__CONTAINED_COMPONENT_PORTS);
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
			containedParts = new EObjectResolvingEList<Part>(Part.class, this, PaPackage.PHYSICAL_COMPONENT__CONTAINED_PARTS);
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
			containedPhysicalPorts = new EObjectResolvingEList<PhysicalPort>(PhysicalPort.class, this, PaPackage.PHYSICAL_COMPONENT__CONTAINED_PHYSICAL_PORTS);
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
			ownedPhysicalPath = new EObjectContainmentEList.Resolving<PhysicalPath>(PhysicalPath.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_PATH);
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
			ownedPhysicalLinks = new EObjectContainmentEList.Resolving<PhysicalLink>(PhysicalLink.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINKS);
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
			ownedPhysicalLinkCategories = new EObjectContainmentEList.Resolving<PhysicalLinkCategory>(PhysicalLinkCategory.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES);
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
			representingParts = new EObjectResolvingEList<Part>(Part.class, this, PaPackage.PHYSICAL_COMPONENT__REPRESENTING_PARTS);
		}
		return representingParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Involvement> getInvolvingInvolvements() {
		if (involvingInvolvements == null) {
			involvingInvolvements = new EObjectResolvingEList<Involvement>(Involvement.class, this, PaPackage.PHYSICAL_COMPONENT__INVOLVING_INVOLVEMENTS);
		}
		return involvingInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityRealizationInvolvement> getCapabilityRealizationInvolvements() {
		if (capabilityRealizationInvolvements == null) {
			capabilityRealizationInvolvements = new EObjectResolvingEList<CapabilityRealizationInvolvement>(CapabilityRealizationInvolvement.class, this, PaPackage.PHYSICAL_COMPONENT__CAPABILITY_REALIZATION_INVOLVEMENTS);
		}
		return capabilityRealizationInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityRealization> getInvolvingCapabilityRealizations() {
		if (involvingCapabilityRealizations == null) {
			involvingCapabilityRealizations = new EObjectResolvingEList<CapabilityRealization>(CapabilityRealization.class, this, PaPackage.PHYSICAL_COMPONENT__INVOLVING_CAPABILITY_REALIZATIONS);
		}
		return involvingCapabilityRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractDeploymentLink> getDeployingLinks() {
		if (deployingLinks == null) {
			deployingLinks = new EObjectResolvingEList<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, PaPackage.PHYSICAL_COMPONENT__DEPLOYING_LINKS);
		}
		return deployingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractDeploymentLink> getDeploymentLinks() {
		if (deploymentLinks == null) {
			deploymentLinks = new EObjectResolvingEList<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, PaPackage.PHYSICAL_COMPONENT__DEPLOYMENT_LINKS);
		}
		return deploymentLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalComponentKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(PhysicalComponentKind newKind) {
		PhysicalComponentKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_COMPONENT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalComponentNature getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNature(PhysicalComponentNature newNature) {
		PhysicalComponentNature oldNature = nature;
		nature = newNature == null ? NATURE_EDEFAULT : newNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_COMPONENT__NATURE, oldNature, nature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractDeploymentLink> getOwnedDeploymentLinks() {
		if (ownedDeploymentLinks == null) {
			ownedDeploymentLinks = new EObjectContainmentEList.Resolving<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS);
		}
		return ownedDeploymentLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalComponent> getOwnedPhysicalComponents() {
		if (ownedPhysicalComponents == null) {
			ownedPhysicalComponents = new EObjectContainmentEList.Resolving<PhysicalComponent>(PhysicalComponent.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS);
		}
		return ownedPhysicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalComponentPkg> getOwnedPhysicalComponentPkgs() {
		if (ownedPhysicalComponentPkgs == null) {
			ownedPhysicalComponentPkgs = new EObjectContainmentEList.Resolving<PhysicalComponentPkg>(PhysicalComponentPkg.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS);
		}
		return ownedPhysicalComponentPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalInterfaceRealization> getLogicalInterfaceRealizations() {
		if (logicalInterfaceRealizations == null) {
			logicalInterfaceRealizations = new EObjectResolvingEList<LogicalInterfaceRealization>(LogicalInterfaceRealization.class, this, PaPackage.PHYSICAL_COMPONENT__LOGICAL_INTERFACE_REALIZATIONS);
		}
		return logicalInterfaceRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalComponent> getSubPhysicalComponents() {
		if (subPhysicalComponents == null) {
			subPhysicalComponents = new EObjectResolvingEList<PhysicalComponent>(PhysicalComponent.class, this, PaPackage.PHYSICAL_COMPONENT__SUB_PHYSICAL_COMPONENTS);
		}
		return subPhysicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalComponent> getRealizedLogicalComponents() {
		if (realizedLogicalComponents == null) {
			realizedLogicalComponents = new EObjectWithInverseResolvingEList.ManyInverse<LogicalComponent>(LogicalComponent.class, this, PaPackage.PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS, LaPackage.LOGICAL_COMPONENT__REALIZING_PHYSICAL_COMPONENTS);
		}
		return realizedLogicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalFunction> getAllocatedPhysicalFunctions() {
		if (allocatedPhysicalFunctions == null) {
			allocatedPhysicalFunctions = new EObjectWithInverseResolvingEList.ManyInverse<PhysicalFunction>(PhysicalFunction.class, this, PaPackage.PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS, PaPackage.PHYSICAL_FUNCTION__ALLOCATING_PHYSICAL_COMPONENTS);
		}
		return allocatedPhysicalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalComponent> getDeployedPhysicalComponents() {
		if (deployedPhysicalComponents == null) {
			deployedPhysicalComponents = new EObjectResolvingEList<PhysicalComponent>(PhysicalComponent.class, this, PaPackage.PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS);
		}
		return deployedPhysicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalComponent> getDeployingPhysicalComponents() {
		if (deployingPhysicalComponents == null) {
			deployingPhysicalComponents = new EObjectResolvingEList<PhysicalComponent>(PhysicalComponent.class, this, PaPackage.PHYSICAL_COMPONENT__DEPLOYING_PHYSICAL_COMPONENTS);
		}
		return deployingPhysicalComponents;
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
			case PaPackage.PHYSICAL_COMPONENT__FUNCTIONAL_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunctionalAllocations()).basicAdd(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatedFunctions()).basicAdd(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__SUPER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuper()).basicAdd(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__SUB:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSub()).basicAdd(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvisionedInterfaceAllocations()).basicAdd(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__USED_INTERFACE_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedInterfaceLinks()).basicAdd(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__USED_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedInterfaces()).basicAdd(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACE_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementedInterfaceLinks()).basicAdd(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementedInterfaces()).basicAdd(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizedLogicalComponents()).basicAdd(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatedPhysicalFunctions()).basicAdd(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_COMPONENT__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_FUNCTIONAL_ALLOCATION:
				return ((InternalEList<?>)getOwnedFunctionalAllocation()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGES:
				return ((InternalEList<?>)getOwnedComponentExchanges()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return ((InternalEList<?>)getOwnedComponentExchangeCategories()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__FUNCTIONAL_ALLOCATIONS:
				return ((InternalEList<?>)getFunctionalAllocations()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_FUNCTIONS:
				return ((InternalEList<?>)getAllocatedFunctions()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG:
				return basicSetOwnedAbstractCapabilityPkg(null, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG:
				return basicSetOwnedInterfacePkg(null, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_DATA_PKG:
				return basicSetOwnedDataPkg(null, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_STATE_MACHINES:
				return ((InternalEList<?>)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_GENERALIZATIONS:
				return ((InternalEList<?>)getOwnedGeneralizations()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__SUPER:
				return ((InternalEList<?>)getSuper()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_FEATURES:
				return ((InternalEList<?>)getOwnedFeatures()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedInterfaceAllocations()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS:
				return ((InternalEList<?>)getProvisionedInterfaceAllocations()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMMUNICATION_LINKS:
				return ((InternalEList<?>)getOwnedCommunicationLinks()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_USES:
				return ((InternalEList<?>)getOwnedInterfaceUses()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__USED_INTERFACE_LINKS:
				return ((InternalEList<?>)getUsedInterfaceLinks()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__USED_INTERFACES:
				return ((InternalEList<?>)getUsedInterfaces()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				return ((InternalEList<?>)getOwnedInterfaceImplementations()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACE_LINKS:
				return ((InternalEList<?>)getImplementedInterfaceLinks()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACES:
				return ((InternalEList<?>)getImplementedInterfaces()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_REALIZATIONS:
				return ((InternalEList<?>)getOwnedComponentRealizations()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_PATH:
				return ((InternalEList<?>)getOwnedPhysicalPath()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINKS:
				return ((InternalEList<?>)getOwnedPhysicalLinks()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				return ((InternalEList<?>)getOwnedPhysicalLinkCategories()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS:
				return ((InternalEList<?>)getOwnedDeploymentLinks()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				return ((InternalEList<?>)getOwnedPhysicalComponents()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				return ((InternalEList<?>)getOwnedPhysicalComponentPkgs()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS:
				return ((InternalEList<?>)getRealizedLogicalComponents()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS:
				return ((InternalEList<?>)getAllocatedPhysicalFunctions()).basicRemove(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_COMPONENT__NAME:
				return getName();
			case PaPackage.PHYSICAL_COMPONENT__ABSTRACT_TYPED_ELEMENTS:
				return getAbstractTypedElements();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_TRACES:
				return getOwnedTraces();
			case PaPackage.PHYSICAL_COMPONENT__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case PaPackage.PHYSICAL_COMPONENT__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case PaPackage.PHYSICAL_COMPONENT__NAMING_RULES:
				return getNamingRules();
			case PaPackage.PHYSICAL_COMPONENT__TYPED_ELEMENTS:
				return getTypedElements();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_FUNCTIONAL_ALLOCATION:
				return getOwnedFunctionalAllocation();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGES:
				return getOwnedComponentExchanges();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return getOwnedComponentExchangeCategories();
			case PaPackage.PHYSICAL_COMPONENT__FUNCTIONAL_ALLOCATIONS:
				return getFunctionalAllocations();
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_FUNCTIONS:
				return getAllocatedFunctions();
			case PaPackage.PHYSICAL_COMPONENT__IN_EXCHANGE_LINKS:
				return getInExchangeLinks();
			case PaPackage.PHYSICAL_COMPONENT__OUT_EXCHANGE_LINKS:
				return getOutExchangeLinks();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG:
				if (resolve) return getOwnedAbstractCapabilityPkg();
				return basicGetOwnedAbstractCapabilityPkg();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG:
				if (resolve) return getOwnedInterfacePkg();
				return basicGetOwnedInterfacePkg();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_DATA_PKG:
				if (resolve) return getOwnedDataPkg();
				return basicGetOwnedDataPkg();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_STATE_MACHINES:
				return getOwnedStateMachines();
			case PaPackage.PHYSICAL_COMPONENT__ABSTRACT:
				return isAbstract();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_GENERALIZATIONS:
				return getOwnedGeneralizations();
			case PaPackage.PHYSICAL_COMPONENT__SUPER_GENERALIZATIONS:
				return getSuperGeneralizations();
			case PaPackage.PHYSICAL_COMPONENT__SUB_GENERALIZATIONS:
				return getSubGeneralizations();
			case PaPackage.PHYSICAL_COMPONENT__SUPER:
				return getSuper();
			case PaPackage.PHYSICAL_COMPONENT__SUB:
				return getSub();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_FEATURES:
				return getOwnedFeatures();
			case PaPackage.PHYSICAL_COMPONENT__CONTAINED_PROPERTIES:
				return getContainedProperties();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				return getOwnedInterfaceAllocations();
			case PaPackage.PHYSICAL_COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS:
				return getProvisionedInterfaceAllocations();
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_INTERFACES:
				return getAllocatedInterfaces();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMMUNICATION_LINKS:
				return getOwnedCommunicationLinks();
			case PaPackage.PHYSICAL_COMPONENT__PRODUCE:
				return getProduce();
			case PaPackage.PHYSICAL_COMPONENT__CONSUME:
				return getConsume();
			case PaPackage.PHYSICAL_COMPONENT__SEND:
				return getSend();
			case PaPackage.PHYSICAL_COMPONENT__RECEIVE:
				return getReceive();
			case PaPackage.PHYSICAL_COMPONENT__CALL:
				return getCall();
			case PaPackage.PHYSICAL_COMPONENT__EXECUTE:
				return getExecute();
			case PaPackage.PHYSICAL_COMPONENT__WRITE:
				return getWrite();
			case PaPackage.PHYSICAL_COMPONENT__ACCESS:
				return getAccess();
			case PaPackage.PHYSICAL_COMPONENT__ACQUIRE:
				return getAcquire();
			case PaPackage.PHYSICAL_COMPONENT__TRANSMIT:
				return getTransmit();
			case PaPackage.PHYSICAL_COMPONENT__ACTOR:
				return isActor();
			case PaPackage.PHYSICAL_COMPONENT__HUMAN:
				return isHuman();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_USES:
				return getOwnedInterfaceUses();
			case PaPackage.PHYSICAL_COMPONENT__USED_INTERFACE_LINKS:
				return getUsedInterfaceLinks();
			case PaPackage.PHYSICAL_COMPONENT__USED_INTERFACES:
				return getUsedInterfaces();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				return getOwnedInterfaceImplementations();
			case PaPackage.PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACE_LINKS:
				return getImplementedInterfaceLinks();
			case PaPackage.PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACES:
				return getImplementedInterfaces();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_REALIZATIONS:
				return getOwnedComponentRealizations();
			case PaPackage.PHYSICAL_COMPONENT__REALIZED_COMPONENTS:
				return getRealizedComponents();
			case PaPackage.PHYSICAL_COMPONENT__REALIZING_COMPONENTS:
				return getRealizingComponents();
			case PaPackage.PHYSICAL_COMPONENT__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case PaPackage.PHYSICAL_COMPONENT__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case PaPackage.PHYSICAL_COMPONENT__CONTAINED_COMPONENT_PORTS:
				return getContainedComponentPorts();
			case PaPackage.PHYSICAL_COMPONENT__CONTAINED_PARTS:
				return getContainedParts();
			case PaPackage.PHYSICAL_COMPONENT__CONTAINED_PHYSICAL_PORTS:
				return getContainedPhysicalPorts();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_PATH:
				return getOwnedPhysicalPath();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINKS:
				return getOwnedPhysicalLinks();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				return getOwnedPhysicalLinkCategories();
			case PaPackage.PHYSICAL_COMPONENT__REPRESENTING_PARTS:
				return getRepresentingParts();
			case PaPackage.PHYSICAL_COMPONENT__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case PaPackage.PHYSICAL_COMPONENT__CAPABILITY_REALIZATION_INVOLVEMENTS:
				return getCapabilityRealizationInvolvements();
			case PaPackage.PHYSICAL_COMPONENT__INVOLVING_CAPABILITY_REALIZATIONS:
				return getInvolvingCapabilityRealizations();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYING_LINKS:
				return getDeployingLinks();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYMENT_LINKS:
				return getDeploymentLinks();
			case PaPackage.PHYSICAL_COMPONENT__KIND:
				return getKind();
			case PaPackage.PHYSICAL_COMPONENT__NATURE:
				return getNature();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS:
				return getOwnedDeploymentLinks();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				return getOwnedPhysicalComponents();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				return getOwnedPhysicalComponentPkgs();
			case PaPackage.PHYSICAL_COMPONENT__LOGICAL_INTERFACE_REALIZATIONS:
				return getLogicalInterfaceRealizations();
			case PaPackage.PHYSICAL_COMPONENT__SUB_PHYSICAL_COMPONENTS:
				return getSubPhysicalComponents();
			case PaPackage.PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS:
				return getRealizedLogicalComponents();
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS:
				return getAllocatedPhysicalFunctions();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS:
				return getDeployedPhysicalComponents();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYING_PHYSICAL_COMPONENTS:
				return getDeployingPhysicalComponents();
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
			case PaPackage.PHYSICAL_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_FUNCTIONAL_ALLOCATION:
				getOwnedFunctionalAllocation().clear();
				getOwnedFunctionalAllocation().addAll((Collection<? extends ComponentFunctionalAllocation>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGES:
				getOwnedComponentExchanges().clear();
				getOwnedComponentExchanges().addAll((Collection<? extends ComponentExchange>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				getOwnedComponentExchangeCategories().clear();
				getOwnedComponentExchangeCategories().addAll((Collection<? extends ComponentExchangeCategory>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__IN_EXCHANGE_LINKS:
				getInExchangeLinks().clear();
				getInExchangeLinks().addAll((Collection<? extends ExchangeLink>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OUT_EXCHANGE_LINKS:
				getOutExchangeLinks().clear();
				getOutExchangeLinks().addAll((Collection<? extends ExchangeLink>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG:
				setOwnedAbstractCapabilityPkg((AbstractCapabilityPkg)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG:
				setOwnedInterfacePkg((InterfacePkg)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_DATA_PKG:
				setOwnedDataPkg((DataPkg)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_STATE_MACHINES:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_GENERALIZATIONS:
				getOwnedGeneralizations().clear();
				getOwnedGeneralizations().addAll((Collection<? extends Generalization>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_FEATURES:
				getOwnedFeatures().clear();
				getOwnedFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				getOwnedInterfaceAllocations().clear();
				getOwnedInterfaceAllocations().addAll((Collection<? extends InterfaceAllocation>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMMUNICATION_LINKS:
				getOwnedCommunicationLinks().clear();
				getOwnedCommunicationLinks().addAll((Collection<? extends CommunicationLink>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__ACTOR:
				setActor((Boolean)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__HUMAN:
				setHuman((Boolean)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_USES:
				getOwnedInterfaceUses().clear();
				getOwnedInterfaceUses().addAll((Collection<? extends InterfaceUse>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				getOwnedInterfaceImplementations().clear();
				getOwnedInterfaceImplementations().addAll((Collection<? extends InterfaceImplementation>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_REALIZATIONS:
				getOwnedComponentRealizations().clear();
				getOwnedComponentRealizations().addAll((Collection<? extends ComponentRealization>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_PATH:
				getOwnedPhysicalPath().clear();
				getOwnedPhysicalPath().addAll((Collection<? extends PhysicalPath>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINKS:
				getOwnedPhysicalLinks().clear();
				getOwnedPhysicalLinks().addAll((Collection<? extends PhysicalLink>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				getOwnedPhysicalLinkCategories().clear();
				getOwnedPhysicalLinkCategories().addAll((Collection<? extends PhysicalLinkCategory>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__KIND:
				setKind((PhysicalComponentKind)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__NATURE:
				setNature((PhysicalComponentNature)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS:
				getOwnedDeploymentLinks().clear();
				getOwnedDeploymentLinks().addAll((Collection<? extends AbstractDeploymentLink>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				getOwnedPhysicalComponents().clear();
				getOwnedPhysicalComponents().addAll((Collection<? extends PhysicalComponent>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				getOwnedPhysicalComponentPkgs().clear();
				getOwnedPhysicalComponentPkgs().addAll((Collection<? extends PhysicalComponentPkg>)newValue);
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
			case PaPackage.PHYSICAL_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__NAMING_RULES:
				getNamingRules().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_FUNCTIONAL_ALLOCATION:
				getOwnedFunctionalAllocation().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGES:
				getOwnedComponentExchanges().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				getOwnedComponentExchangeCategories().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__IN_EXCHANGE_LINKS:
				getInExchangeLinks().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OUT_EXCHANGE_LINKS:
				getOutExchangeLinks().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG:
				setOwnedAbstractCapabilityPkg((AbstractCapabilityPkg)null);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG:
				setOwnedInterfacePkg((InterfacePkg)null);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_DATA_PKG:
				setOwnedDataPkg((DataPkg)null);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_STATE_MACHINES:
				getOwnedStateMachines().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_GENERALIZATIONS:
				getOwnedGeneralizations().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_FEATURES:
				getOwnedFeatures().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				getOwnedInterfaceAllocations().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMMUNICATION_LINKS:
				getOwnedCommunicationLinks().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__ACTOR:
				setActor(ACTOR_EDEFAULT);
				return;
			case PaPackage.PHYSICAL_COMPONENT__HUMAN:
				setHuman(HUMAN_EDEFAULT);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_USES:
				getOwnedInterfaceUses().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				getOwnedInterfaceImplementations().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_REALIZATIONS:
				getOwnedComponentRealizations().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_PATH:
				getOwnedPhysicalPath().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINKS:
				getOwnedPhysicalLinks().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				getOwnedPhysicalLinkCategories().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case PaPackage.PHYSICAL_COMPONENT__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS:
				getOwnedDeploymentLinks().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				getOwnedPhysicalComponents().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				getOwnedPhysicalComponentPkgs().clear();
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
			case PaPackage.PHYSICAL_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PaPackage.PHYSICAL_COMPONENT__ABSTRACT_TYPED_ELEMENTS:
				return abstractTypedElements != null && !abstractTypedElements.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__TYPED_ELEMENTS:
				return typedElements != null && !typedElements.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_FUNCTIONAL_ALLOCATION:
				return ownedFunctionalAllocation != null && !ownedFunctionalAllocation.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGES:
				return ownedComponentExchanges != null && !ownedComponentExchanges.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return ownedComponentExchangeCategories != null && !ownedComponentExchangeCategories.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__FUNCTIONAL_ALLOCATIONS:
				return functionalAllocations != null && !functionalAllocations.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_FUNCTIONS:
				return allocatedFunctions != null && !allocatedFunctions.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__IN_EXCHANGE_LINKS:
				return inExchangeLinks != null && !inExchangeLinks.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OUT_EXCHANGE_LINKS:
				return outExchangeLinks != null && !outExchangeLinks.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG:
				return ownedAbstractCapabilityPkg != null;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG:
				return ownedInterfacePkg != null;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_DATA_PKG:
				return ownedDataPkg != null;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_STATE_MACHINES:
				return ownedStateMachines != null && !ownedStateMachines.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_GENERALIZATIONS:
				return ownedGeneralizations != null && !ownedGeneralizations.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__SUPER_GENERALIZATIONS:
				return superGeneralizations != null && !superGeneralizations.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__SUB_GENERALIZATIONS:
				return subGeneralizations != null && !subGeneralizations.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__SUPER:
				return super_ != null && !super_.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__SUB:
				return sub != null && !sub.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_FEATURES:
				return ownedFeatures != null && !ownedFeatures.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__CONTAINED_PROPERTIES:
				return containedProperties != null && !containedProperties.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				return ownedInterfaceAllocations != null && !ownedInterfaceAllocations.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS:
				return provisionedInterfaceAllocations != null && !provisionedInterfaceAllocations.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_INTERFACES:
				return allocatedInterfaces != null && !allocatedInterfaces.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMMUNICATION_LINKS:
				return ownedCommunicationLinks != null && !ownedCommunicationLinks.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__PRODUCE:
				return produce != null && !produce.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__CONSUME:
				return consume != null && !consume.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__SEND:
				return send != null && !send.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__RECEIVE:
				return receive != null && !receive.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__CALL:
				return call != null && !call.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__EXECUTE:
				return execute != null && !execute.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__WRITE:
				return write != null && !write.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__ACCESS:
				return access != null && !access.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__ACQUIRE:
				return acquire != null && !acquire.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__TRANSMIT:
				return transmit != null && !transmit.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__ACTOR:
				return actor != ACTOR_EDEFAULT;
			case PaPackage.PHYSICAL_COMPONENT__HUMAN:
				return human != HUMAN_EDEFAULT;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_USES:
				return ownedInterfaceUses != null && !ownedInterfaceUses.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__USED_INTERFACE_LINKS:
				return usedInterfaceLinks != null && !usedInterfaceLinks.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__USED_INTERFACES:
				return usedInterfaces != null && !usedInterfaces.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				return ownedInterfaceImplementations != null && !ownedInterfaceImplementations.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACE_LINKS:
				return implementedInterfaceLinks != null && !implementedInterfaceLinks.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACES:
				return implementedInterfaces != null && !implementedInterfaces.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_REALIZATIONS:
				return ownedComponentRealizations != null && !ownedComponentRealizations.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__REALIZED_COMPONENTS:
				return realizedComponents != null && !realizedComponents.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__REALIZING_COMPONENTS:
				return realizingComponents != null && !realizingComponents.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__CONTAINED_COMPONENT_PORTS:
				return containedComponentPorts != null && !containedComponentPorts.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__CONTAINED_PARTS:
				return containedParts != null && !containedParts.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__CONTAINED_PHYSICAL_PORTS:
				return containedPhysicalPorts != null && !containedPhysicalPorts.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_PATH:
				return ownedPhysicalPath != null && !ownedPhysicalPath.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINKS:
				return ownedPhysicalLinks != null && !ownedPhysicalLinks.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				return ownedPhysicalLinkCategories != null && !ownedPhysicalLinkCategories.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__REPRESENTING_PARTS:
				return representingParts != null && !representingParts.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__INVOLVING_INVOLVEMENTS:
				return involvingInvolvements != null && !involvingInvolvements.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__CAPABILITY_REALIZATION_INVOLVEMENTS:
				return capabilityRealizationInvolvements != null && !capabilityRealizationInvolvements.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__INVOLVING_CAPABILITY_REALIZATIONS:
				return involvingCapabilityRealizations != null && !involvingCapabilityRealizations.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYING_LINKS:
				return deployingLinks != null && !deployingLinks.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYMENT_LINKS:
				return deploymentLinks != null && !deploymentLinks.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__KIND:
				return kind != KIND_EDEFAULT;
			case PaPackage.PHYSICAL_COMPONENT__NATURE:
				return nature != NATURE_EDEFAULT;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS:
				return ownedDeploymentLinks != null && !ownedDeploymentLinks.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				return ownedPhysicalComponents != null && !ownedPhysicalComponents.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				return ownedPhysicalComponentPkgs != null && !ownedPhysicalComponentPkgs.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__LOGICAL_INTERFACE_REALIZATIONS:
				return logicalInterfaceRealizations != null && !logicalInterfaceRealizations.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__SUB_PHYSICAL_COMPONENTS:
				return subPhysicalComponents != null && !subPhysicalComponents.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS:
				return realizedLogicalComponents != null && !realizedLogicalComponents.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS:
				return allocatedPhysicalFunctions != null && !allocatedPhysicalFunctions.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS:
				return deployedPhysicalComponents != null && !deployedPhysicalComponents.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYING_PHYSICAL_COMPONENTS:
				return deployingPhysicalComponents != null && !deployingPhysicalComponents.isEmpty();
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
		if (baseClass == AbstractNamedElement.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__NAME: return ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__ABSTRACT_TYPED_ELEMENTS: return ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__OWNED_TRACES: return CapellacorePackage.NAMESPACE__OWNED_TRACES;
				case PaPackage.PHYSICAL_COMPONENT__CONTAINED_GENERIC_TRACES: return CapellacorePackage.NAMESPACE__CONTAINED_GENERIC_TRACES;
				case PaPackage.PHYSICAL_COMPONENT__CONTAINED_REQUIREMENTS_TRACES: return CapellacorePackage.NAMESPACE__CONTAINED_REQUIREMENTS_TRACES;
				case PaPackage.PHYSICAL_COMPONENT__NAMING_RULES: return CapellacorePackage.NAMESPACE__NAMING_RULES;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__TYPED_ELEMENTS: return CapellacorePackage.TYPE__TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == ModellingBlock.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractFunctionalBlock.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__OWNED_FUNCTIONAL_ALLOCATION: return FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_FUNCTIONAL_ALLOCATION;
				case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGES: return FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES;
				case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES: return FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES;
				case PaPackage.PHYSICAL_COMPONENT__FUNCTIONAL_ALLOCATIONS: return FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__FUNCTIONAL_ALLOCATIONS;
				case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_FUNCTIONS: return FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__ALLOCATED_FUNCTIONS;
				case PaPackage.PHYSICAL_COMPONENT__IN_EXCHANGE_LINKS: return FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__IN_EXCHANGE_LINKS;
				case PaPackage.PHYSICAL_COMPONENT__OUT_EXCHANGE_LINKS: return FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OUT_EXCHANGE_LINKS;
				default: return -1;
			}
		}
		if (baseClass == Block.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG: return CsPackage.BLOCK__OWNED_ABSTRACT_CAPABILITY_PKG;
				case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG: return CsPackage.BLOCK__OWNED_INTERFACE_PKG;
				case PaPackage.PHYSICAL_COMPONENT__OWNED_DATA_PKG: return CsPackage.BLOCK__OWNED_DATA_PKG;
				case PaPackage.PHYSICAL_COMPONENT__OWNED_STATE_MACHINES: return CsPackage.BLOCK__OWNED_STATE_MACHINES;
				default: return -1;
			}
		}
		if (baseClass == GeneralizableElement.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__ABSTRACT: return CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT;
				case PaPackage.PHYSICAL_COMPONENT__OWNED_GENERALIZATIONS: return CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS;
				case PaPackage.PHYSICAL_COMPONENT__SUPER_GENERALIZATIONS: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS;
				case PaPackage.PHYSICAL_COMPONENT__SUB_GENERALIZATIONS: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUB_GENERALIZATIONS;
				case PaPackage.PHYSICAL_COMPONENT__SUPER: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER;
				case PaPackage.PHYSICAL_COMPONENT__SUB: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUB;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__OWNED_FEATURES: return CapellacorePackage.CLASSIFIER__OWNED_FEATURES;
				case PaPackage.PHYSICAL_COMPONENT__CONTAINED_PROPERTIES: return CapellacorePackage.CLASSIFIER__CONTAINED_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == InterfaceAllocator.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_ALLOCATIONS: return CsPackage.INTERFACE_ALLOCATOR__OWNED_INTERFACE_ALLOCATIONS;
				case PaPackage.PHYSICAL_COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS: return CsPackage.INTERFACE_ALLOCATOR__PROVISIONED_INTERFACE_ALLOCATIONS;
				case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_INTERFACES: return CsPackage.INTERFACE_ALLOCATOR__ALLOCATED_INTERFACES;
				default: return -1;
			}
		}
		if (baseClass == CommunicationLinkExchanger.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__OWNED_COMMUNICATION_LINKS: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS;
				case PaPackage.PHYSICAL_COMPONENT__PRODUCE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__PRODUCE;
				case PaPackage.PHYSICAL_COMPONENT__CONSUME: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CONSUME;
				case PaPackage.PHYSICAL_COMPONENT__SEND: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__SEND;
				case PaPackage.PHYSICAL_COMPONENT__RECEIVE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__RECEIVE;
				case PaPackage.PHYSICAL_COMPONENT__CALL: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CALL;
				case PaPackage.PHYSICAL_COMPONENT__EXECUTE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__EXECUTE;
				case PaPackage.PHYSICAL_COMPONENT__WRITE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__WRITE;
				case PaPackage.PHYSICAL_COMPONENT__ACCESS: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACCESS;
				case PaPackage.PHYSICAL_COMPONENT__ACQUIRE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACQUIRE;
				case PaPackage.PHYSICAL_COMPONENT__TRANSMIT: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__TRANSMIT;
				default: return -1;
			}
		}
		if (baseClass == Component.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__ACTOR: return CsPackage.COMPONENT__ACTOR;
				case PaPackage.PHYSICAL_COMPONENT__HUMAN: return CsPackage.COMPONENT__HUMAN;
				case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_USES: return CsPackage.COMPONENT__OWNED_INTERFACE_USES;
				case PaPackage.PHYSICAL_COMPONENT__USED_INTERFACE_LINKS: return CsPackage.COMPONENT__USED_INTERFACE_LINKS;
				case PaPackage.PHYSICAL_COMPONENT__USED_INTERFACES: return CsPackage.COMPONENT__USED_INTERFACES;
				case PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS: return CsPackage.COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS;
				case PaPackage.PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACE_LINKS: return CsPackage.COMPONENT__IMPLEMENTED_INTERFACE_LINKS;
				case PaPackage.PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACES: return CsPackage.COMPONENT__IMPLEMENTED_INTERFACES;
				case PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_REALIZATIONS: return CsPackage.COMPONENT__OWNED_COMPONENT_REALIZATIONS;
				case PaPackage.PHYSICAL_COMPONENT__REALIZED_COMPONENTS: return CsPackage.COMPONENT__REALIZED_COMPONENTS;
				case PaPackage.PHYSICAL_COMPONENT__REALIZING_COMPONENTS: return CsPackage.COMPONENT__REALIZING_COMPONENTS;
				case PaPackage.PHYSICAL_COMPONENT__PROVIDED_INTERFACES: return CsPackage.COMPONENT__PROVIDED_INTERFACES;
				case PaPackage.PHYSICAL_COMPONENT__REQUIRED_INTERFACES: return CsPackage.COMPONENT__REQUIRED_INTERFACES;
				case PaPackage.PHYSICAL_COMPONENT__CONTAINED_COMPONENT_PORTS: return CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS;
				case PaPackage.PHYSICAL_COMPONENT__CONTAINED_PARTS: return CsPackage.COMPONENT__CONTAINED_PARTS;
				case PaPackage.PHYSICAL_COMPONENT__CONTAINED_PHYSICAL_PORTS: return CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS;
				case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_PATH: return CsPackage.COMPONENT__OWNED_PHYSICAL_PATH;
				case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINKS: return CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS;
				case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES: return CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;
				case PaPackage.PHYSICAL_COMPONENT__REPRESENTING_PARTS: return CsPackage.COMPONENT__REPRESENTING_PARTS;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == CapabilityRealizationInvolvedElement.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__CAPABILITY_REALIZATION_INVOLVEMENTS: return CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__CAPABILITY_REALIZATION_INVOLVEMENTS;
				case PaPackage.PHYSICAL_COMPONENT__INVOLVING_CAPABILITY_REALIZATIONS: return CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_CAPABILITY_REALIZATIONS;
				default: return -1;
			}
		}
		if (baseClass == DeployableElement.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__DEPLOYING_LINKS: return CsPackage.DEPLOYABLE_ELEMENT__DEPLOYING_LINKS;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__DEPLOYMENT_LINKS: return CsPackage.DEPLOYMENT_TARGET__DEPLOYMENT_LINKS;
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
		if (baseClass == AbstractNamedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME: return PaPackage.PHYSICAL_COMPONENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS: return PaPackage.PHYSICAL_COMPONENT__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.NAMESPACE__OWNED_TRACES: return PaPackage.PHYSICAL_COMPONENT__OWNED_TRACES;
				case CapellacorePackage.NAMESPACE__CONTAINED_GENERIC_TRACES: return PaPackage.PHYSICAL_COMPONENT__CONTAINED_GENERIC_TRACES;
				case CapellacorePackage.NAMESPACE__CONTAINED_REQUIREMENTS_TRACES: return PaPackage.PHYSICAL_COMPONENT__CONTAINED_REQUIREMENTS_TRACES;
				case CapellacorePackage.NAMESPACE__NAMING_RULES: return PaPackage.PHYSICAL_COMPONENT__NAMING_RULES;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.TYPE__TYPED_ELEMENTS: return PaPackage.PHYSICAL_COMPONENT__TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == ModellingBlock.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractFunctionalBlock.class) {
			switch (baseFeatureID) {
				case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_FUNCTIONAL_ALLOCATION: return PaPackage.PHYSICAL_COMPONENT__OWNED_FUNCTIONAL_ALLOCATION;
				case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES: return PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGES;
				case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES: return PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES;
				case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__FUNCTIONAL_ALLOCATIONS: return PaPackage.PHYSICAL_COMPONENT__FUNCTIONAL_ALLOCATIONS;
				case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__ALLOCATED_FUNCTIONS: return PaPackage.PHYSICAL_COMPONENT__ALLOCATED_FUNCTIONS;
				case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__IN_EXCHANGE_LINKS: return PaPackage.PHYSICAL_COMPONENT__IN_EXCHANGE_LINKS;
				case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OUT_EXCHANGE_LINKS: return PaPackage.PHYSICAL_COMPONENT__OUT_EXCHANGE_LINKS;
				default: return -1;
			}
		}
		if (baseClass == Block.class) {
			switch (baseFeatureID) {
				case CsPackage.BLOCK__OWNED_ABSTRACT_CAPABILITY_PKG: return PaPackage.PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG;
				case CsPackage.BLOCK__OWNED_INTERFACE_PKG: return PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG;
				case CsPackage.BLOCK__OWNED_DATA_PKG: return PaPackage.PHYSICAL_COMPONENT__OWNED_DATA_PKG;
				case CsPackage.BLOCK__OWNED_STATE_MACHINES: return PaPackage.PHYSICAL_COMPONENT__OWNED_STATE_MACHINES;
				default: return -1;
			}
		}
		if (baseClass == GeneralizableElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT: return PaPackage.PHYSICAL_COMPONENT__ABSTRACT;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS: return PaPackage.PHYSICAL_COMPONENT__OWNED_GENERALIZATIONS;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS: return PaPackage.PHYSICAL_COMPONENT__SUPER_GENERALIZATIONS;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUB_GENERALIZATIONS: return PaPackage.PHYSICAL_COMPONENT__SUB_GENERALIZATIONS;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER: return PaPackage.PHYSICAL_COMPONENT__SUPER;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUB: return PaPackage.PHYSICAL_COMPONENT__SUB;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.CLASSIFIER__OWNED_FEATURES: return PaPackage.PHYSICAL_COMPONENT__OWNED_FEATURES;
				case CapellacorePackage.CLASSIFIER__CONTAINED_PROPERTIES: return PaPackage.PHYSICAL_COMPONENT__CONTAINED_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == InterfaceAllocator.class) {
			switch (baseFeatureID) {
				case CsPackage.INTERFACE_ALLOCATOR__OWNED_INTERFACE_ALLOCATIONS: return PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_ALLOCATIONS;
				case CsPackage.INTERFACE_ALLOCATOR__PROVISIONED_INTERFACE_ALLOCATIONS: return PaPackage.PHYSICAL_COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS;
				case CsPackage.INTERFACE_ALLOCATOR__ALLOCATED_INTERFACES: return PaPackage.PHYSICAL_COMPONENT__ALLOCATED_INTERFACES;
				default: return -1;
			}
		}
		if (baseClass == CommunicationLinkExchanger.class) {
			switch (baseFeatureID) {
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS: return PaPackage.PHYSICAL_COMPONENT__OWNED_COMMUNICATION_LINKS;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__PRODUCE: return PaPackage.PHYSICAL_COMPONENT__PRODUCE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CONSUME: return PaPackage.PHYSICAL_COMPONENT__CONSUME;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__SEND: return PaPackage.PHYSICAL_COMPONENT__SEND;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__RECEIVE: return PaPackage.PHYSICAL_COMPONENT__RECEIVE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CALL: return PaPackage.PHYSICAL_COMPONENT__CALL;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__EXECUTE: return PaPackage.PHYSICAL_COMPONENT__EXECUTE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__WRITE: return PaPackage.PHYSICAL_COMPONENT__WRITE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACCESS: return PaPackage.PHYSICAL_COMPONENT__ACCESS;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACQUIRE: return PaPackage.PHYSICAL_COMPONENT__ACQUIRE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__TRANSMIT: return PaPackage.PHYSICAL_COMPONENT__TRANSMIT;
				default: return -1;
			}
		}
		if (baseClass == Component.class) {
			switch (baseFeatureID) {
				case CsPackage.COMPONENT__ACTOR: return PaPackage.PHYSICAL_COMPONENT__ACTOR;
				case CsPackage.COMPONENT__HUMAN: return PaPackage.PHYSICAL_COMPONENT__HUMAN;
				case CsPackage.COMPONENT__OWNED_INTERFACE_USES: return PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_USES;
				case CsPackage.COMPONENT__USED_INTERFACE_LINKS: return PaPackage.PHYSICAL_COMPONENT__USED_INTERFACE_LINKS;
				case CsPackage.COMPONENT__USED_INTERFACES: return PaPackage.PHYSICAL_COMPONENT__USED_INTERFACES;
				case CsPackage.COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS: return PaPackage.PHYSICAL_COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS;
				case CsPackage.COMPONENT__IMPLEMENTED_INTERFACE_LINKS: return PaPackage.PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACE_LINKS;
				case CsPackage.COMPONENT__IMPLEMENTED_INTERFACES: return PaPackage.PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACES;
				case CsPackage.COMPONENT__OWNED_COMPONENT_REALIZATIONS: return PaPackage.PHYSICAL_COMPONENT__OWNED_COMPONENT_REALIZATIONS;
				case CsPackage.COMPONENT__REALIZED_COMPONENTS: return PaPackage.PHYSICAL_COMPONENT__REALIZED_COMPONENTS;
				case CsPackage.COMPONENT__REALIZING_COMPONENTS: return PaPackage.PHYSICAL_COMPONENT__REALIZING_COMPONENTS;
				case CsPackage.COMPONENT__PROVIDED_INTERFACES: return PaPackage.PHYSICAL_COMPONENT__PROVIDED_INTERFACES;
				case CsPackage.COMPONENT__REQUIRED_INTERFACES: return PaPackage.PHYSICAL_COMPONENT__REQUIRED_INTERFACES;
				case CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS: return PaPackage.PHYSICAL_COMPONENT__CONTAINED_COMPONENT_PORTS;
				case CsPackage.COMPONENT__CONTAINED_PARTS: return PaPackage.PHYSICAL_COMPONENT__CONTAINED_PARTS;
				case CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS: return PaPackage.PHYSICAL_COMPONENT__CONTAINED_PHYSICAL_PORTS;
				case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH: return PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_PATH;
				case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS: return PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINKS;
				case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES: return PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;
				case CsPackage.COMPONENT__REPRESENTING_PARTS: return PaPackage.PHYSICAL_COMPONENT__REPRESENTING_PARTS;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return PaPackage.PHYSICAL_COMPONENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == CapabilityRealizationInvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__CAPABILITY_REALIZATION_INVOLVEMENTS: return PaPackage.PHYSICAL_COMPONENT__CAPABILITY_REALIZATION_INVOLVEMENTS;
				case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_CAPABILITY_REALIZATIONS: return PaPackage.PHYSICAL_COMPONENT__INVOLVING_CAPABILITY_REALIZATIONS;
				default: return -1;
			}
		}
		if (baseClass == DeployableElement.class) {
			switch (baseFeatureID) {
				case CsPackage.DEPLOYABLE_ELEMENT__DEPLOYING_LINKS: return PaPackage.PHYSICAL_COMPONENT__DEPLOYING_LINKS;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
				case CsPackage.DEPLOYMENT_TARGET__DEPLOYMENT_LINKS: return PaPackage.PHYSICAL_COMPONENT__DEPLOYMENT_LINKS;
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", abstract: "); //$NON-NLS-1$
		result.append(abstract_);
		result.append(", actor: "); //$NON-NLS-1$
		result.append(actor);
		result.append(", human: "); //$NON-NLS-1$
		result.append(human);
		result.append(", kind: "); //$NON-NLS-1$
		result.append(kind);
		result.append(", nature: "); //$NON-NLS-1$
		result.append(nature);
		result.append(')');
		return result.toString();
	}

} //PhysicalComponentImpl
