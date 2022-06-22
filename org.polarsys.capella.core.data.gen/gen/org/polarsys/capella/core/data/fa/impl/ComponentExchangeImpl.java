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
package org.polarsys.capella.core.data.fa.impl;

import java.util.Collection;

import modellingcore.AbstractExchangeItem;
import modellingcore.AbstractInformationFlow;
import modellingcore.AbstractRelationship;
import modellingcore.AbstractTrace;
import modellingcore.InformationsExchanger;
import modellingcore.ModellingcorePackage;
import modellingcore.PublishableElement;
import modellingcore.TraceableElement;

import modellingcore.impl.AbstractTypeImpl;

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

import org.polarsys.capella.common.data.activity.ActivityEdge;
import org.polarsys.capella.common.data.activity.ActivityExchange;
import org.polarsys.capella.common.data.activity.ActivityPackage;

import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyType;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;

import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.cs.PhysicalLink;

import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeCategory;
import org.polarsys.capella.core.data.fa.ComponentExchangeEnd;
import org.polarsys.capella.core.data.fa.ComponentExchangeFunctionalExchangeAllocation;
import org.polarsys.capella.core.data.fa.ComponentExchangeKind;
import org.polarsys.capella.core.data.fa.ComponentExchangeRealization;
import org.polarsys.capella.core.data.fa.ExchangeContainment;
import org.polarsys.capella.core.data.fa.ExchangeLink;
import org.polarsys.capella.core.data.fa.ExchangeSpecification;
import org.polarsys.capella.core.data.fa.ExchangeSpecificationRealization;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.FunctionalExchange;

import org.polarsys.capella.core.data.information.AbstractEventOperation;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.Port;

import org.polarsys.capella.core.data.interaction.SequenceMessage;

import org.polarsys.capella.core.data.requirement.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getIncomingTraces <em>Incoming Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getOutgoingTraces <em>Outgoing Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#isVisibleInDoc <em>Visible In Doc</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#isVisibleInLM <em>Visible In LM</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getAppliedRequirements <em>Applied Requirements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getInvokingSequenceMessages <em>Invoking Sequence Messages</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getRealizedFlow <em>Realized Flow</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getRealizations <em>Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getConvoyedInformations <em>Convoyed Informations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getRealizingActivityFlows <em>Realizing Activity Flows</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getContainingLink <em>Containing Link</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getOutgoingExchangeSpecificationRealizations <em>Outgoing Exchange Specification Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getIncomingExchangeSpecificationRealizations <em>Incoming Exchange Specification Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#isOriented <em>Oriented</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getAllocatedFunctionalExchanges <em>Allocated Functional Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getIncomingComponentExchangeRealizations <em>Incoming Component Exchange Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getOutgoingComponentExchangeRealizations <em>Outgoing Component Exchange Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getOutgoingComponentExchangeFunctionalExchangeAllocations <em>Outgoing Component Exchange Functional Exchange Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getOwnedComponentExchangeFunctionalExchangeAllocations <em>Owned Component Exchange Functional Exchange Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getOwnedComponentExchangeRealizations <em>Owned Component Exchange Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getOwnedComponentExchangeEnds <em>Owned Component Exchange Ends</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getSourcePart <em>Source Part</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getTargetPort <em>Target Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getTargetPart <em>Target Part</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getAllocatorPhysicalLinks <em>Allocator Physical Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getRealizedComponentExchanges <em>Realized Component Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl#getRealizingComponentExchanges <em>Realizing Component Exchanges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentExchangeImpl extends AbstractTypeImpl implements ComponentExchange {
	/**
	 * The cached value of the '{@link #getIncomingTraces() <em>Incoming Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTrace> incomingTraces;

	/**
	 * The cached value of the '{@link #getOutgoingTraces() <em>Outgoing Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTrace> outgoingTraces;

	/**
	 * The default value of the '{@link #isVisibleInDoc() <em>Visible In Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInDoc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_IN_DOC_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisibleInDoc() <em>Visible In Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInDoc()
	 * @generated
	 * @ordered
	 */
	protected boolean visibleInDoc = VISIBLE_IN_DOC_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisibleInLM() <em>Visible In LM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInLM()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_IN_LM_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisibleInLM() <em>Visible In LM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInLM()
	 * @generated
	 * @ordered
	 */
	protected boolean visibleInLM = VISIBLE_IN_LM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReview() <em>Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected static final String REVIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReview() <em>Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected String review = REVIEW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValues() <em>Owned Property Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPropertyValue> ownedPropertyValues;

	/**
	 * The cached value of the '{@link #getOwnedEnumerationPropertyTypes() <em>Owned Enumeration Property Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnumerationPropertyTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationPropertyType> ownedEnumerationPropertyTypes;

	/**
	 * The cached value of the '{@link #getAppliedPropertyValues() <em>Applied Property Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPropertyValue> appliedPropertyValues;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValueGroups() <em>Owned Property Value Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValueGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValueGroup> ownedPropertyValueGroups;

	/**
	 * The cached value of the '{@link #getAppliedPropertyValueGroups() <em>Applied Property Value Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedPropertyValueGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValueGroup> appliedPropertyValueGroups;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EnumerationPropertyLiteral status;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationPropertyLiteral> features;

	/**
	 * The cached value of the '{@link #getAppliedRequirements() <em>Applied Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> appliedRequirements;

	/**
	 * The cached value of the '{@link #getInvokingSequenceMessages() <em>Invoking Sequence Messages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokingSequenceMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceMessage> invokingSequenceMessages;

	/**
	 * The cached value of the '{@link #getRealizedFlow() <em>Realized Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedFlow()
	 * @generated
	 * @ordered
	 */
	protected AbstractInformationFlow realizedFlow;

	/**
	 * The cached value of the '{@link #getRealizations() <em>Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractRelationship> realizations;

	/**
	 * The cached value of the '{@link #getConvoyedInformations() <em>Convoyed Informations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvoyedInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractExchangeItem> convoyedInformations;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected InformationsExchanger source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected InformationsExchanger target;

	/**
	 * The cached value of the '{@link #getRealizingActivityFlows() <em>Realizing Activity Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingActivityFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> realizingActivityFlows;

	/**
	 * The cached value of the '{@link #getContainingLink() <em>Containing Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingLink()
	 * @generated
	 * @ordered
	 */
	protected ExchangeLink containingLink;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected ExchangeContainment link;

	/**
	 * The cached value of the '{@link #getOutgoingExchangeSpecificationRealizations() <em>Outgoing Exchange Specification Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingExchangeSpecificationRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeSpecificationRealization> outgoingExchangeSpecificationRealizations;

	/**
	 * The cached value of the '{@link #getIncomingExchangeSpecificationRealizations() <em>Incoming Exchange Specification Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingExchangeSpecificationRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeSpecificationRealization> incomingExchangeSpecificationRealizations;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentExchangeKind KIND_EDEFAULT = ComponentExchangeKind.UNSET;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ComponentExchangeKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isOriented() <em>Oriented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOriented()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORIENTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOriented() <em>Oriented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOriented()
	 * @generated
	 * @ordered
	 */
	protected boolean oriented = ORIENTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllocatedFunctionalExchanges() <em>Allocated Functional Exchanges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedFunctionalExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalExchange> allocatedFunctionalExchanges;

	/**
	 * The cached value of the '{@link #getIncomingComponentExchangeRealizations() <em>Incoming Component Exchange Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingComponentExchangeRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeRealization> incomingComponentExchangeRealizations;

	/**
	 * The cached value of the '{@link #getOutgoingComponentExchangeRealizations() <em>Outgoing Component Exchange Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingComponentExchangeRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeRealization> outgoingComponentExchangeRealizations;

	/**
	 * The cached value of the '{@link #getOutgoingComponentExchangeFunctionalExchangeAllocations() <em>Outgoing Component Exchange Functional Exchange Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingComponentExchangeFunctionalExchangeAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeFunctionalExchangeAllocation> outgoingComponentExchangeFunctionalExchangeAllocations;

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
	 * The cached value of the '{@link #getOwnedComponentExchangeRealizations() <em>Owned Component Exchange Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeRealization> ownedComponentExchangeRealizations;

	/**
	 * The cached value of the '{@link #getOwnedComponentExchangeEnds() <em>Owned Component Exchange Ends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeEnd> ownedComponentExchangeEnds;

	/**
	 * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected Port sourcePort;

	/**
	 * The cached value of the '{@link #getSourcePart() <em>Source Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePart()
	 * @generated
	 * @ordered
	 */
	protected Part sourcePart;

	/**
	 * The cached value of the '{@link #getTargetPort() <em>Target Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPort()
	 * @generated
	 * @ordered
	 */
	protected Port targetPort;

	/**
	 * The cached value of the '{@link #getTargetPart() <em>Target Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPart()
	 * @generated
	 * @ordered
	 */
	protected Part targetPart;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeCategory> categories;

	/**
	 * The cached value of the '{@link #getAllocatorPhysicalLinks() <em>Allocator Physical Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatorPhysicalLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLink> allocatorPhysicalLinks;

	/**
	 * The cached value of the '{@link #getRealizedComponentExchanges() <em>Realized Component Exchanges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedComponentExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchange> realizedComponentExchanges;

	/**
	 * The cached value of the '{@link #getRealizingComponentExchanges() <em>Realizing Component Exchanges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingComponentExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchange> realizingComponentExchanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.COMPONENT_EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTrace> getIncomingTraces() {
		if (incomingTraces == null) {
			incomingTraces = new EObjectResolvingEList<AbstractTrace>(AbstractTrace.class, this, FaPackage.COMPONENT_EXCHANGE__INCOMING_TRACES);
		}
		return incomingTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTrace> getOutgoingTraces() {
		if (outgoingTraces == null) {
			outgoingTraces = new EObjectResolvingEList<AbstractTrace>(AbstractTrace.class, this, FaPackage.COMPONENT_EXCHANGE__OUTGOING_TRACES);
		}
		return outgoingTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVisibleInDoc() {
		return visibleInDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibleInDoc(boolean newVisibleInDoc) {
		boolean oldVisibleInDoc = visibleInDoc;
		visibleInDoc = newVisibleInDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC, oldVisibleInDoc, visibleInDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVisibleInLM() {
		return visibleInLM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibleInLM(boolean newVisibleInLM) {
		boolean oldVisibleInLM = visibleInLM;
		visibleInLM = newVisibleInLM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM, oldVisibleInLM, visibleInLM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReview() {
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReview(String newReview) {
		String oldReview = review;
		review = newReview;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__REVIEW, oldReview, review));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractPropertyValue> getOwnedPropertyValues() {
		if (ownedPropertyValues == null) {
			ownedPropertyValues = new EObjectContainmentEList.Resolving<AbstractPropertyValue>(AbstractPropertyValue.class, this, FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES);
		}
		return ownedPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumerationPropertyType> getOwnedEnumerationPropertyTypes() {
		if (ownedEnumerationPropertyTypes == null) {
			ownedEnumerationPropertyTypes = new EObjectContainmentEList.Resolving<EnumerationPropertyType>(EnumerationPropertyType.class, this, FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES);
		}
		return ownedEnumerationPropertyTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractPropertyValue> getAppliedPropertyValues() {
		if (appliedPropertyValues == null) {
			appliedPropertyValues = new EObjectResolvingEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES);
		}
		return appliedPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyValueGroup> getOwnedPropertyValueGroups() {
		if (ownedPropertyValueGroups == null) {
			ownedPropertyValueGroups = new EObjectContainmentEList.Resolving<PropertyValueGroup>(PropertyValueGroup.class, this, FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS);
		}
		return ownedPropertyValueGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyValueGroup> getAppliedPropertyValueGroups() {
		if (appliedPropertyValueGroups == null) {
			appliedPropertyValueGroups = new EObjectResolvingEList<PropertyValueGroup>(PropertyValueGroup.class, this, FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS);
		}
		return appliedPropertyValueGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationPropertyLiteral getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (EnumerationPropertyLiteral)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationPropertyLiteral basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(EnumerationPropertyLiteral newStatus) {
		EnumerationPropertyLiteral oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumerationPropertyLiteral> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<EnumerationPropertyLiteral>(EnumerationPropertyLiteral.class, this, FaPackage.COMPONENT_EXCHANGE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getAppliedRequirements() {
		if (appliedRequirements == null) {
			appliedRequirements = new EObjectResolvingEList<Requirement>(Requirement.class, this, FaPackage.COMPONENT_EXCHANGE__APPLIED_REQUIREMENTS);
		}
		return appliedRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SequenceMessage> getInvokingSequenceMessages() {
		if (invokingSequenceMessages == null) {
			invokingSequenceMessages = new EObjectResolvingEList<SequenceMessage>(SequenceMessage.class, this, FaPackage.COMPONENT_EXCHANGE__INVOKING_SEQUENCE_MESSAGES);
		}
		return invokingSequenceMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractInformationFlow getRealizedFlow() {
		if (realizedFlow != null && realizedFlow.eIsProxy()) {
			InternalEObject oldRealizedFlow = (InternalEObject)realizedFlow;
			realizedFlow = (AbstractInformationFlow)eResolveProxy(oldRealizedFlow);
			if (realizedFlow != oldRealizedFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW, oldRealizedFlow, realizedFlow));
			}
		}
		return realizedFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInformationFlow basicGetRealizedFlow() {
		return realizedFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizedFlow(AbstractInformationFlow newRealizedFlow, NotificationChain msgs) {
		AbstractInformationFlow oldRealizedFlow = realizedFlow;
		realizedFlow = newRealizedFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW, oldRealizedFlow, newRealizedFlow);
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
	public void setRealizedFlow(AbstractInformationFlow newRealizedFlow) {
		if (newRealizedFlow != realizedFlow) {
			NotificationChain msgs = null;
			if (realizedFlow != null)
				msgs = ((InternalEObject)realizedFlow).eInverseRemove(this, ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZATIONS, AbstractInformationFlow.class, msgs);
			if (newRealizedFlow != null)
				msgs = ((InternalEObject)newRealizedFlow).eInverseAdd(this, ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZATIONS, AbstractInformationFlow.class, msgs);
			msgs = basicSetRealizedFlow(newRealizedFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW, newRealizedFlow, newRealizedFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractRelationship> getRealizations() {
		if (realizations == null) {
			realizations = new EObjectWithInverseResolvingEList<AbstractRelationship>(AbstractRelationship.class, this, FaPackage.COMPONENT_EXCHANGE__REALIZATIONS, ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW);
		}
		return realizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractExchangeItem> getConvoyedInformations() {
		if (convoyedInformations == null) {
			convoyedInformations = new EObjectResolvingEList<AbstractExchangeItem>(AbstractExchangeItem.class, this, FaPackage.COMPONENT_EXCHANGE__CONVOYED_INFORMATIONS);
		}
		return convoyedInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformationsExchanger getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (InformationsExchanger)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationsExchanger basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(InformationsExchanger newSource) {
		InformationsExchanger oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformationsExchanger getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (InformationsExchanger)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationsExchanger basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(InformationsExchanger newTarget) {
		InformationsExchanger oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityEdge> getRealizingActivityFlows() {
		if (realizingActivityFlows == null) {
			realizingActivityFlows = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, FaPackage.COMPONENT_EXCHANGE__REALIZING_ACTIVITY_FLOWS);
		}
		return realizingActivityFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExchangeLink getContainingLink() {
		if (containingLink != null && containingLink.eIsProxy()) {
			InternalEObject oldContainingLink = (InternalEObject)containingLink;
			containingLink = (ExchangeLink)eResolveProxy(oldContainingLink);
			if (containingLink != oldContainingLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE__CONTAINING_LINK, oldContainingLink, containingLink));
			}
		}
		return containingLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeLink basicGetContainingLink() {
		return containingLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExchangeContainment getLink() {
		if (link != null && link.eIsProxy()) {
			InternalEObject oldLink = (InternalEObject)link;
			link = (ExchangeContainment)eResolveProxy(oldLink);
			if (link != oldLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE__LINK, oldLink, link));
			}
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeContainment basicGetLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(ExchangeContainment newLink, NotificationChain msgs) {
		ExchangeContainment oldLink = link;
		link = newLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__LINK, oldLink, newLink);
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
	public void setLink(ExchangeContainment newLink) {
		if (newLink != link) {
			NotificationChain msgs = null;
			if (link != null)
				msgs = ((InternalEObject)link).eInverseRemove(this, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, ExchangeContainment.class, msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, ExchangeContainment.class, msgs);
			msgs = basicSetLink(newLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExchangeSpecificationRealization> getOutgoingExchangeSpecificationRealizations() {
		if (outgoingExchangeSpecificationRealizations == null) {
			outgoingExchangeSpecificationRealizations = new EObjectWithInverseResolvingEList<ExchangeSpecificationRealization>(ExchangeSpecificationRealization.class, this, FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS, FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZING_EXCHANGE_SPECIFICATION);
		}
		return outgoingExchangeSpecificationRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExchangeSpecificationRealization> getIncomingExchangeSpecificationRealizations() {
		if (incomingExchangeSpecificationRealizations == null) {
			incomingExchangeSpecificationRealizations = new EObjectWithInverseResolvingEList<ExchangeSpecificationRealization>(ExchangeSpecificationRealization.class, this, FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS, FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZED_EXCHANGE_SPECIFICATION);
		}
		return incomingExchangeSpecificationRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentExchangeKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(ComponentExchangeKind newKind) {
		ComponentExchangeKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOriented() {
		return oriented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriented(boolean newOriented) {
		boolean oldOriented = oriented;
		oriented = newOriented;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__ORIENTED, oldOriented, oriented));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalExchange> getAllocatedFunctionalExchanges() {
		if (allocatedFunctionalExchanges == null) {
			allocatedFunctionalExchanges = new EObjectWithInverseResolvingEList.ManyInverse<FunctionalExchange>(FunctionalExchange.class, this, FaPackage.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES, FaPackage.FUNCTIONAL_EXCHANGE__ALLOCATING_COMPONENT_EXCHANGES);
		}
		return allocatedFunctionalExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchangeRealization> getIncomingComponentExchangeRealizations() {
		if (incomingComponentExchangeRealizations == null) {
			incomingComponentExchangeRealizations = new EObjectWithInverseResolvingEList<ComponentExchangeRealization>(ComponentExchangeRealization.class, this, FaPackage.COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS, FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATED_COMPONENT_EXCHANGE);
		}
		return incomingComponentExchangeRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchangeRealization> getOutgoingComponentExchangeRealizations() {
		if (outgoingComponentExchangeRealizations == null) {
			outgoingComponentExchangeRealizations = new EObjectWithInverseResolvingEList<ComponentExchangeRealization>(ComponentExchangeRealization.class, this, FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS, FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATING_COMPONENT_EXCHANGE);
		}
		return outgoingComponentExchangeRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchangeFunctionalExchangeAllocation> getOutgoingComponentExchangeFunctionalExchangeAllocations() {
		if (outgoingComponentExchangeFunctionalExchangeAllocations == null) {
			outgoingComponentExchangeFunctionalExchangeAllocations = new EObjectWithInverseResolvingEList<ComponentExchangeFunctionalExchangeAllocation>(ComponentExchangeFunctionalExchangeAllocation.class, this, FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS, FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATING_COMPONENT_EXCHANGE);
		}
		return outgoingComponentExchangeFunctionalExchangeAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchangeFunctionalExchangeAllocation> getOwnedComponentExchangeFunctionalExchangeAllocations() {
		if (ownedComponentExchangeFunctionalExchangeAllocations == null) {
			ownedComponentExchangeFunctionalExchangeAllocations = new EObjectContainmentEList.Resolving<ComponentExchangeFunctionalExchangeAllocation>(ComponentExchangeFunctionalExchangeAllocation.class, this, FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS);
		}
		return ownedComponentExchangeFunctionalExchangeAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchangeRealization> getOwnedComponentExchangeRealizations() {
		if (ownedComponentExchangeRealizations == null) {
			ownedComponentExchangeRealizations = new EObjectContainmentEList.Resolving<ComponentExchangeRealization>(ComponentExchangeRealization.class, this, FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS);
		}
		return ownedComponentExchangeRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchangeEnd> getOwnedComponentExchangeEnds() {
		if (ownedComponentExchangeEnds == null) {
			ownedComponentExchangeEnds = new EObjectContainmentEList.Resolving<ComponentExchangeEnd>(ComponentExchangeEnd.class, this, FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS);
		}
		return ownedComponentExchangeEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getSourcePort() {
		if (sourcePort != null && sourcePort.eIsProxy()) {
			InternalEObject oldSourcePort = (InternalEObject)sourcePort;
			sourcePort = (Port)eResolveProxy(oldSourcePort);
			if (sourcePort != oldSourcePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE__SOURCE_PORT, oldSourcePort, sourcePort));
			}
		}
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetSourcePort() {
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Part getSourcePart() {
		if (sourcePart != null && sourcePart.eIsProxy()) {
			InternalEObject oldSourcePart = (InternalEObject)sourcePart;
			sourcePart = (Part)eResolveProxy(oldSourcePart);
			if (sourcePart != oldSourcePart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE__SOURCE_PART, oldSourcePart, sourcePart));
			}
		}
		return sourcePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetSourcePart() {
		return sourcePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getTargetPort() {
		if (targetPort != null && targetPort.eIsProxy()) {
			InternalEObject oldTargetPort = (InternalEObject)targetPort;
			targetPort = (Port)eResolveProxy(oldTargetPort);
			if (targetPort != oldTargetPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE__TARGET_PORT, oldTargetPort, targetPort));
			}
		}
		return targetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetTargetPort() {
		return targetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Part getTargetPart() {
		if (targetPart != null && targetPart.eIsProxy()) {
			InternalEObject oldTargetPart = (InternalEObject)targetPart;
			targetPart = (Part)eResolveProxy(oldTargetPart);
			if (targetPart != oldTargetPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE__TARGET_PART, oldTargetPart, targetPart));
			}
		}
		return targetPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetTargetPart() {
		return targetPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchangeCategory> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<ComponentExchangeCategory>(ComponentExchangeCategory.class, this, FaPackage.COMPONENT_EXCHANGE__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalLink> getAllocatorPhysicalLinks() {
		if (allocatorPhysicalLinks == null) {
			allocatorPhysicalLinks = new EObjectResolvingEList<PhysicalLink>(PhysicalLink.class, this, FaPackage.COMPONENT_EXCHANGE__ALLOCATOR_PHYSICAL_LINKS);
		}
		return allocatorPhysicalLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchange> getRealizedComponentExchanges() {
		if (realizedComponentExchanges == null) {
			realizedComponentExchanges = new EObjectWithInverseResolvingEList.ManyInverse<ComponentExchange>(ComponentExchange.class, this, FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES, FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES);
		}
		return realizedComponentExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchange> getRealizingComponentExchanges() {
		if (realizingComponentExchanges == null) {
			realizingComponentExchanges = new EObjectWithInverseResolvingEList.ManyInverse<ComponentExchange>(ComponentExchange.class, this, FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES, FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES);
		}
		return realizingComponentExchanges;
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
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW:
				if (realizedFlow != null)
					msgs = ((InternalEObject)realizedFlow).eInverseRemove(this, ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZATIONS, AbstractInformationFlow.class, msgs);
				return basicSetRealizedFlow((AbstractInformationFlow)otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizations()).basicAdd(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__LINK:
				if (link != null)
					msgs = ((InternalEObject)link).eInverseRemove(this, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, ExchangeContainment.class, msgs);
				return basicSetLink((ExchangeContainment)otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingExchangeSpecificationRealizations()).basicAdd(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingExchangeSpecificationRealizations()).basicAdd(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatedFunctionalExchanges()).basicAdd(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingComponentExchangeRealizations()).basicAdd(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingComponentExchangeRealizations()).basicAdd(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingComponentExchangeFunctionalExchangeAllocations()).basicAdd(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizedComponentExchanges()).basicAdd(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizingComponentExchanges()).basicAdd(otherEnd, msgs);
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
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES:
				return ((InternalEList<?>)getOwnedPropertyValues()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ((InternalEList<?>)getOwnedEnumerationPropertyTypes()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
				return ((InternalEList<?>)getOwnedPropertyValueGroups()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW:
				return basicSetRealizedFlow(null, msgs);
			case FaPackage.COMPONENT_EXCHANGE__REALIZATIONS:
				return ((InternalEList<?>)getRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__LINK:
				return basicSetLink(null, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return ((InternalEList<?>)getOutgoingExchangeSpecificationRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return ((InternalEList<?>)getIncomingExchangeSpecificationRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES:
				return ((InternalEList<?>)getAllocatedFunctionalExchanges()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getIncomingComponentExchangeRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getOutgoingComponentExchangeRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return ((InternalEList<?>)getOutgoingComponentExchangeFunctionalExchangeAllocations()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedComponentExchangeFunctionalExchangeAllocations()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getOwnedComponentExchangeRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS:
				return ((InternalEList<?>)getOwnedComponentExchangeEnds()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES:
				return ((InternalEList<?>)getRealizedComponentExchanges()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES:
				return ((InternalEList<?>)getRealizingComponentExchanges()).basicRemove(otherEnd, msgs);
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
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_TRACES:
				return getIncomingTraces();
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_TRACES:
				return getOutgoingTraces();
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC:
				return isVisibleInDoc();
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM:
				return isVisibleInLM();
			case FaPackage.COMPONENT_EXCHANGE__SUMMARY:
				return getSummary();
			case FaPackage.COMPONENT_EXCHANGE__DESCRIPTION:
				return getDescription();
			case FaPackage.COMPONENT_EXCHANGE__REVIEW:
				return getReview();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES:
				return getOwnedPropertyValues();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
				return getOwnedEnumerationPropertyTypes();
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES:
				return getAppliedPropertyValues();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
				return getOwnedPropertyValueGroups();
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
				return getAppliedPropertyValueGroups();
			case FaPackage.COMPONENT_EXCHANGE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FaPackage.COMPONENT_EXCHANGE__FEATURES:
				return getFeatures();
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_REQUIREMENTS:
				return getAppliedRequirements();
			case FaPackage.COMPONENT_EXCHANGE__INVOKING_SEQUENCE_MESSAGES:
				return getInvokingSequenceMessages();
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW:
				if (resolve) return getRealizedFlow();
				return basicGetRealizedFlow();
			case FaPackage.COMPONENT_EXCHANGE__REALIZATIONS:
				return getRealizations();
			case FaPackage.COMPONENT_EXCHANGE__CONVOYED_INFORMATIONS:
				return getConvoyedInformations();
			case FaPackage.COMPONENT_EXCHANGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FaPackage.COMPONENT_EXCHANGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FaPackage.COMPONENT_EXCHANGE__REALIZING_ACTIVITY_FLOWS:
				return getRealizingActivityFlows();
			case FaPackage.COMPONENT_EXCHANGE__CONTAINING_LINK:
				if (resolve) return getContainingLink();
				return basicGetContainingLink();
			case FaPackage.COMPONENT_EXCHANGE__LINK:
				if (resolve) return getLink();
				return basicGetLink();
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return getOutgoingExchangeSpecificationRealizations();
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return getIncomingExchangeSpecificationRealizations();
			case FaPackage.COMPONENT_EXCHANGE__KIND:
				return getKind();
			case FaPackage.COMPONENT_EXCHANGE__ORIENTED:
				return isOriented();
			case FaPackage.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES:
				return getAllocatedFunctionalExchanges();
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS:
				return getIncomingComponentExchangeRealizations();
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS:
				return getOutgoingComponentExchangeRealizations();
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return getOutgoingComponentExchangeFunctionalExchangeAllocations();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return getOwnedComponentExchangeFunctionalExchangeAllocations();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return getOwnedComponentExchangeRealizations();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS:
				return getOwnedComponentExchangeEnds();
			case FaPackage.COMPONENT_EXCHANGE__SOURCE_PORT:
				if (resolve) return getSourcePort();
				return basicGetSourcePort();
			case FaPackage.COMPONENT_EXCHANGE__SOURCE_PART:
				if (resolve) return getSourcePart();
				return basicGetSourcePart();
			case FaPackage.COMPONENT_EXCHANGE__TARGET_PORT:
				if (resolve) return getTargetPort();
				return basicGetTargetPort();
			case FaPackage.COMPONENT_EXCHANGE__TARGET_PART:
				if (resolve) return getTargetPart();
				return basicGetTargetPart();
			case FaPackage.COMPONENT_EXCHANGE__CATEGORIES:
				return getCategories();
			case FaPackage.COMPONENT_EXCHANGE__ALLOCATOR_PHYSICAL_LINKS:
				return getAllocatorPhysicalLinks();
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES:
				return getRealizedComponentExchanges();
			case FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES:
				return getRealizingComponentExchanges();
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
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC:
				setVisibleInDoc((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM:
				setVisibleInLM((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__SUMMARY:
				setSummary((String)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__REVIEW:
				setReview((String)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				getOwnedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				getOwnedEnumerationPropertyTypes().addAll((Collection<? extends EnumerationPropertyType>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				getAppliedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				getOwnedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				getAppliedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__STATUS:
				setStatus((EnumerationPropertyLiteral)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends EnumerationPropertyLiteral>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW:
				setRealizedFlow((AbstractInformationFlow)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__REALIZATIONS:
				getRealizations().clear();
				getRealizations().addAll((Collection<? extends AbstractRelationship>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__CONVOYED_INFORMATIONS:
				getConvoyedInformations().clear();
				getConvoyedInformations().addAll((Collection<? extends AbstractExchangeItem>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__SOURCE:
				setSource((InformationsExchanger)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__TARGET:
				setTarget((InformationsExchanger)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__LINK:
				setLink((ExchangeContainment)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__KIND:
				setKind((ComponentExchangeKind)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__ORIENTED:
				setOriented((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeFunctionalExchangeAllocations().clear();
				getOwnedComponentExchangeFunctionalExchangeAllocations().addAll((Collection<? extends ComponentExchangeFunctionalExchangeAllocation>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				getOwnedComponentExchangeRealizations().clear();
				getOwnedComponentExchangeRealizations().addAll((Collection<? extends ComponentExchangeRealization>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS:
				getOwnedComponentExchangeEnds().clear();
				getOwnedComponentExchangeEnds().addAll((Collection<? extends ComponentExchangeEnd>)newValue);
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
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC:
				setVisibleInDoc(VISIBLE_IN_DOC_EDEFAULT);
				return;
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM:
				setVisibleInLM(VISIBLE_IN_LM_EDEFAULT);
				return;
			case FaPackage.COMPONENT_EXCHANGE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case FaPackage.COMPONENT_EXCHANGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FaPackage.COMPONENT_EXCHANGE__REVIEW:
				setReview(REVIEW_EDEFAULT);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__STATUS:
				setStatus((EnumerationPropertyLiteral)null);
				return;
			case FaPackage.COMPONENT_EXCHANGE__FEATURES:
				getFeatures().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW:
				setRealizedFlow((AbstractInformationFlow)null);
				return;
			case FaPackage.COMPONENT_EXCHANGE__REALIZATIONS:
				getRealizations().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__CONVOYED_INFORMATIONS:
				getConvoyedInformations().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__SOURCE:
				setSource((InformationsExchanger)null);
				return;
			case FaPackage.COMPONENT_EXCHANGE__TARGET:
				setTarget((InformationsExchanger)null);
				return;
			case FaPackage.COMPONENT_EXCHANGE__LINK:
				setLink((ExchangeContainment)null);
				return;
			case FaPackage.COMPONENT_EXCHANGE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case FaPackage.COMPONENT_EXCHANGE__ORIENTED:
				setOriented(ORIENTED_EDEFAULT);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeFunctionalExchangeAllocations().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				getOwnedComponentExchangeRealizations().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS:
				getOwnedComponentExchangeEnds().clear();
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
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_TRACES:
				return incomingTraces != null && !incomingTraces.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_TRACES:
				return outgoingTraces != null && !outgoingTraces.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC:
				return visibleInDoc != VISIBLE_IN_DOC_EDEFAULT;
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM:
				return visibleInLM != VISIBLE_IN_LM_EDEFAULT;
			case FaPackage.COMPONENT_EXCHANGE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case FaPackage.COMPONENT_EXCHANGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FaPackage.COMPONENT_EXCHANGE__REVIEW:
				return REVIEW_EDEFAULT == null ? review != null : !REVIEW_EDEFAULT.equals(review);
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES:
				return ownedPropertyValues != null && !ownedPropertyValues.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ownedEnumerationPropertyTypes != null && !ownedEnumerationPropertyTypes.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES:
				return appliedPropertyValues != null && !appliedPropertyValues.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
				return ownedPropertyValueGroups != null && !ownedPropertyValueGroups.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
				return appliedPropertyValueGroups != null && !appliedPropertyValueGroups.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__STATUS:
				return status != null;
			case FaPackage.COMPONENT_EXCHANGE__FEATURES:
				return features != null && !features.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_REQUIREMENTS:
				return appliedRequirements != null && !appliedRequirements.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__INVOKING_SEQUENCE_MESSAGES:
				return invokingSequenceMessages != null && !invokingSequenceMessages.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW:
				return realizedFlow != null;
			case FaPackage.COMPONENT_EXCHANGE__REALIZATIONS:
				return realizations != null && !realizations.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__CONVOYED_INFORMATIONS:
				return convoyedInformations != null && !convoyedInformations.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__SOURCE:
				return source != null;
			case FaPackage.COMPONENT_EXCHANGE__TARGET:
				return target != null;
			case FaPackage.COMPONENT_EXCHANGE__REALIZING_ACTIVITY_FLOWS:
				return realizingActivityFlows != null && !realizingActivityFlows.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__CONTAINING_LINK:
				return containingLink != null;
			case FaPackage.COMPONENT_EXCHANGE__LINK:
				return link != null;
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return outgoingExchangeSpecificationRealizations != null && !outgoingExchangeSpecificationRealizations.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return incomingExchangeSpecificationRealizations != null && !incomingExchangeSpecificationRealizations.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__KIND:
				return kind != KIND_EDEFAULT;
			case FaPackage.COMPONENT_EXCHANGE__ORIENTED:
				return oriented != ORIENTED_EDEFAULT;
			case FaPackage.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES:
				return allocatedFunctionalExchanges != null && !allocatedFunctionalExchanges.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS:
				return incomingComponentExchangeRealizations != null && !incomingComponentExchangeRealizations.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS:
				return outgoingComponentExchangeRealizations != null && !outgoingComponentExchangeRealizations.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return outgoingComponentExchangeFunctionalExchangeAllocations != null && !outgoingComponentExchangeFunctionalExchangeAllocations.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return ownedComponentExchangeFunctionalExchangeAllocations != null && !ownedComponentExchangeFunctionalExchangeAllocations.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return ownedComponentExchangeRealizations != null && !ownedComponentExchangeRealizations.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS:
				return ownedComponentExchangeEnds != null && !ownedComponentExchangeEnds.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__SOURCE_PORT:
				return sourcePort != null;
			case FaPackage.COMPONENT_EXCHANGE__SOURCE_PART:
				return sourcePart != null;
			case FaPackage.COMPONENT_EXCHANGE__TARGET_PORT:
				return targetPort != null;
			case FaPackage.COMPONENT_EXCHANGE__TARGET_PART:
				return targetPart != null;
			case FaPackage.COMPONENT_EXCHANGE__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__ALLOCATOR_PHYSICAL_LINKS:
				return allocatorPhysicalLinks != null && !allocatorPhysicalLinks.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES:
				return realizedComponentExchanges != null && !realizedComponentExchanges.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES:
				return realizingComponentExchanges != null && !realizingComponentExchanges.isEmpty();
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
		if (baseClass == TraceableElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__INCOMING_TRACES: return ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES;
				case FaPackage.COMPONENT_EXCHANGE__OUTGOING_TRACES: return ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES;
				default: return -1;
			}
		}
		if (baseClass == PublishableElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC: return ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC;
				case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM: return ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM;
				default: return -1;
			}
		}
		if (baseClass == CapellaElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__SUMMARY: return CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;
				case FaPackage.COMPONENT_EXCHANGE__DESCRIPTION: return CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;
				case FaPackage.COMPONENT_EXCHANGE__REVIEW: return CapellacorePackage.CAPELLA_ELEMENT__REVIEW;
				case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;
				case FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;
				case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;
				case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;
				case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;
				case FaPackage.COMPONENT_EXCHANGE__STATUS: return CapellacorePackage.CAPELLA_ELEMENT__STATUS;
				case FaPackage.COMPONENT_EXCHANGE__FEATURES: return CapellacorePackage.CAPELLA_ELEMENT__FEATURES;
				case FaPackage.COMPONENT_EXCHANGE__APPLIED_REQUIREMENTS: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEventOperation.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__INVOKING_SEQUENCE_MESSAGES: return InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES;
				default: return -1;
			}
		}
		if (baseClass == AbstractRelationship.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW: return ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW;
				default: return -1;
			}
		}
		if (baseClass == AbstractInformationFlow.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__REALIZATIONS: return ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZATIONS;
				case FaPackage.COMPONENT_EXCHANGE__CONVOYED_INFORMATIONS: return ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__CONVOYED_INFORMATIONS;
				case FaPackage.COMPONENT_EXCHANGE__SOURCE: return ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__SOURCE;
				case FaPackage.COMPONENT_EXCHANGE__TARGET: return ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__TARGET;
				default: return -1;
			}
		}
		if (baseClass == ActivityExchange.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__REALIZING_ACTIVITY_FLOWS: return ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == ExchangeSpecification.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__CONTAINING_LINK: return FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK;
				case FaPackage.COMPONENT_EXCHANGE__LINK: return FaPackage.EXCHANGE_SPECIFICATION__LINK;
				case FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS: return FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS;
				case FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS: return FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS;
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
		if (baseClass == TraceableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES: return FaPackage.COMPONENT_EXCHANGE__INCOMING_TRACES;
				case ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES: return FaPackage.COMPONENT_EXCHANGE__OUTGOING_TRACES;
				default: return -1;
			}
		}
		if (baseClass == PublishableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC: return FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC;
				case ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM: return FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM;
				default: return -1;
			}
		}
		if (baseClass == CapellaElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.CAPELLA_ELEMENT__SUMMARY: return FaPackage.COMPONENT_EXCHANGE__SUMMARY;
				case CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION: return FaPackage.COMPONENT_EXCHANGE__DESCRIPTION;
				case CapellacorePackage.CAPELLA_ELEMENT__REVIEW: return FaPackage.COMPONENT_EXCHANGE__REVIEW;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES: return FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES: return FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES: return FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS: return FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS: return FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS;
				case CapellacorePackage.CAPELLA_ELEMENT__STATUS: return FaPackage.COMPONENT_EXCHANGE__STATUS;
				case CapellacorePackage.CAPELLA_ELEMENT__FEATURES: return FaPackage.COMPONENT_EXCHANGE__FEATURES;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS: return FaPackage.COMPONENT_EXCHANGE__APPLIED_REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEventOperation.class) {
			switch (baseFeatureID) {
				case InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES: return FaPackage.COMPONENT_EXCHANGE__INVOKING_SEQUENCE_MESSAGES;
				default: return -1;
			}
		}
		if (baseClass == AbstractRelationship.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW: return FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW;
				default: return -1;
			}
		}
		if (baseClass == AbstractInformationFlow.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZATIONS: return FaPackage.COMPONENT_EXCHANGE__REALIZATIONS;
				case ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__CONVOYED_INFORMATIONS: return FaPackage.COMPONENT_EXCHANGE__CONVOYED_INFORMATIONS;
				case ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__SOURCE: return FaPackage.COMPONENT_EXCHANGE__SOURCE;
				case ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__TARGET: return FaPackage.COMPONENT_EXCHANGE__TARGET;
				default: return -1;
			}
		}
		if (baseClass == ActivityExchange.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS: return FaPackage.COMPONENT_EXCHANGE__REALIZING_ACTIVITY_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == ExchangeSpecification.class) {
			switch (baseFeatureID) {
				case FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK: return FaPackage.COMPONENT_EXCHANGE__CONTAINING_LINK;
				case FaPackage.EXCHANGE_SPECIFICATION__LINK: return FaPackage.COMPONENT_EXCHANGE__LINK;
				case FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS: return FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS;
				case FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS: return FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS;
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
		result.append(" (visibleInDoc: "); //$NON-NLS-1$
		result.append(visibleInDoc);
		result.append(", visibleInLM: "); //$NON-NLS-1$
		result.append(visibleInLM);
		result.append(", summary: "); //$NON-NLS-1$
		result.append(summary);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", review: "); //$NON-NLS-1$
		result.append(review);
		result.append(", kind: "); //$NON-NLS-1$
		result.append(kind);
		result.append(", oriented: "); //$NON-NLS-1$
		result.append(oriented);
		result.append(')');
		return result.toString();
	}

} //ComponentExchangeImpl
