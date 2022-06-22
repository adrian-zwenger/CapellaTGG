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
package org.polarsys.capella.core.data.oa.impl;

import behavior.AbstractEvent;

import java.util.Collection;

import modellingcore.AbstractExchangeItem;
import modellingcore.AbstractInformationFlow;
import modellingcore.AbstractNamedElement;
import modellingcore.AbstractRelationship;
import modellingcore.AbstractType;
import modellingcore.AbstractTypedElement;
import modellingcore.InformationsExchanger;
import modellingcore.ModellingcorePackage;

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

import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.capellacore.NamingRule;

import org.polarsys.capella.core.data.capellacore.impl.RelationshipImpl;

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

import org.polarsys.capella.core.data.oa.CommunicationMean;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.core.data.oa.OaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Mean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getAbstractTypedElements <em>Abstract Typed Elements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getInvokingSequenceMessages <em>Invoking Sequence Messages</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getRealizations <em>Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getConvoyedInformations <em>Convoyed Informations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getRealizingActivityFlows <em>Realizing Activity Flows</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getContainingLink <em>Containing Link</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getOutgoingExchangeSpecificationRealizations <em>Outgoing Exchange Specification Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getIncomingExchangeSpecificationRealizations <em>Incoming Exchange Specification Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#isOriented <em>Oriented</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getAllocatedFunctionalExchanges <em>Allocated Functional Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getIncomingComponentExchangeRealizations <em>Incoming Component Exchange Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getOutgoingComponentExchangeRealizations <em>Outgoing Component Exchange Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getOutgoingComponentExchangeFunctionalExchangeAllocations <em>Outgoing Component Exchange Functional Exchange Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getOwnedComponentExchangeFunctionalExchangeAllocations <em>Owned Component Exchange Functional Exchange Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getOwnedComponentExchangeRealizations <em>Owned Component Exchange Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getOwnedComponentExchangeEnds <em>Owned Component Exchange Ends</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getSourcePart <em>Source Part</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getTargetPort <em>Target Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getTargetPart <em>Target Part</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getAllocatorPhysicalLinks <em>Allocator Physical Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getRealizedComponentExchanges <em>Realized Component Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getRealizingComponentExchanges <em>Realizing Component Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.CommunicationMeanImpl#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationMeanImpl extends RelationshipImpl implements CommunicationMean {
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
	 * The cached value of the '{@link #getNamingRules() <em>Naming Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamingRules()
	 * @generated
	 * @ordered
	 */
	protected EList<NamingRule> namingRules;

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
	 * The cached value of the '{@link #getInvokingSequenceMessages() <em>Invoking Sequence Messages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokingSequenceMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceMessage> invokingSequenceMessages;

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
	 * The cached value of the '{@link #getSourceEntity() <em>Source Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity sourceEntity;

	/**
	 * The cached value of the '{@link #getTargetEntity() <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity targetEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationMeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.COMMUNICATION_MEAN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.COMMUNICATION_MEAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamingRule> getNamingRules() {
		if (namingRules == null) {
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, OaPackage.COMMUNICATION_MEAN__NAMING_RULES);
		}
		return namingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypedElement> getAbstractTypedElements() {
		if (abstractTypedElements == null) {
			abstractTypedElements = new EObjectResolvingEList<AbstractTypedElement>(AbstractTypedElement.class, this, OaPackage.COMMUNICATION_MEAN__ABSTRACT_TYPED_ELEMENTS);
		}
		return abstractTypedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SequenceMessage> getInvokingSequenceMessages() {
		if (invokingSequenceMessages == null) {
			invokingSequenceMessages = new EObjectResolvingEList<SequenceMessage>(SequenceMessage.class, this, OaPackage.COMMUNICATION_MEAN__INVOKING_SEQUENCE_MESSAGES);
		}
		return invokingSequenceMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractRelationship> getRealizations() {
		if (realizations == null) {
			realizations = new EObjectWithInverseResolvingEList<AbstractRelationship>(AbstractRelationship.class, this, OaPackage.COMMUNICATION_MEAN__REALIZATIONS, ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW);
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
			convoyedInformations = new EObjectResolvingEList<AbstractExchangeItem>(AbstractExchangeItem.class, this, OaPackage.COMMUNICATION_MEAN__CONVOYED_INFORMATIONS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OaPackage.COMMUNICATION_MEAN__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.COMMUNICATION_MEAN__SOURCE, oldSource, source));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OaPackage.COMMUNICATION_MEAN__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.COMMUNICATION_MEAN__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityEdge> getRealizingActivityFlows() {
		if (realizingActivityFlows == null) {
			realizingActivityFlows = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, OaPackage.COMMUNICATION_MEAN__REALIZING_ACTIVITY_FLOWS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OaPackage.COMMUNICATION_MEAN__CONTAINING_LINK, oldContainingLink, containingLink));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OaPackage.COMMUNICATION_MEAN__LINK, oldLink, link));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaPackage.COMMUNICATION_MEAN__LINK, oldLink, newLink);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.COMMUNICATION_MEAN__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExchangeSpecificationRealization> getOutgoingExchangeSpecificationRealizations() {
		if (outgoingExchangeSpecificationRealizations == null) {
			outgoingExchangeSpecificationRealizations = new EObjectWithInverseResolvingEList<ExchangeSpecificationRealization>(ExchangeSpecificationRealization.class, this, OaPackage.COMMUNICATION_MEAN__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS, FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZING_EXCHANGE_SPECIFICATION);
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
			incomingExchangeSpecificationRealizations = new EObjectWithInverseResolvingEList<ExchangeSpecificationRealization>(ExchangeSpecificationRealization.class, this, OaPackage.COMMUNICATION_MEAN__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS, FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZED_EXCHANGE_SPECIFICATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.COMMUNICATION_MEAN__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.COMMUNICATION_MEAN__ORIENTED, oldOriented, oriented));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalExchange> getAllocatedFunctionalExchanges() {
		if (allocatedFunctionalExchanges == null) {
			allocatedFunctionalExchanges = new EObjectWithInverseResolvingEList.ManyInverse<FunctionalExchange>(FunctionalExchange.class, this, OaPackage.COMMUNICATION_MEAN__ALLOCATED_FUNCTIONAL_EXCHANGES, FaPackage.FUNCTIONAL_EXCHANGE__ALLOCATING_COMPONENT_EXCHANGES);
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
			incomingComponentExchangeRealizations = new EObjectWithInverseResolvingEList<ComponentExchangeRealization>(ComponentExchangeRealization.class, this, OaPackage.COMMUNICATION_MEAN__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS, FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATED_COMPONENT_EXCHANGE);
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
			outgoingComponentExchangeRealizations = new EObjectWithInverseResolvingEList<ComponentExchangeRealization>(ComponentExchangeRealization.class, this, OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS, FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATING_COMPONENT_EXCHANGE);
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
			outgoingComponentExchangeFunctionalExchangeAllocations = new EObjectWithInverseResolvingEList<ComponentExchangeFunctionalExchangeAllocation>(ComponentExchangeFunctionalExchangeAllocation.class, this, OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS, FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATING_COMPONENT_EXCHANGE);
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
			ownedComponentExchangeFunctionalExchangeAllocations = new EObjectContainmentEList.Resolving<ComponentExchangeFunctionalExchangeAllocation>(ComponentExchangeFunctionalExchangeAllocation.class, this, OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS);
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
			ownedComponentExchangeRealizations = new EObjectContainmentEList.Resolving<ComponentExchangeRealization>(ComponentExchangeRealization.class, this, OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS);
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
			ownedComponentExchangeEnds = new EObjectContainmentEList.Resolving<ComponentExchangeEnd>(ComponentExchangeEnd.class, this, OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OaPackage.COMMUNICATION_MEAN__SOURCE_PORT, oldSourcePort, sourcePort));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OaPackage.COMMUNICATION_MEAN__SOURCE_PART, oldSourcePart, sourcePart));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OaPackage.COMMUNICATION_MEAN__TARGET_PORT, oldTargetPort, targetPort));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OaPackage.COMMUNICATION_MEAN__TARGET_PART, oldTargetPart, targetPart));
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
			categories = new EObjectResolvingEList<ComponentExchangeCategory>(ComponentExchangeCategory.class, this, OaPackage.COMMUNICATION_MEAN__CATEGORIES);
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
			allocatorPhysicalLinks = new EObjectResolvingEList<PhysicalLink>(PhysicalLink.class, this, OaPackage.COMMUNICATION_MEAN__ALLOCATOR_PHYSICAL_LINKS);
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
			realizedComponentExchanges = new EObjectWithInverseResolvingEList.ManyInverse<ComponentExchange>(ComponentExchange.class, this, OaPackage.COMMUNICATION_MEAN__REALIZED_COMPONENT_EXCHANGES, FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES);
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
			realizingComponentExchanges = new EObjectWithInverseResolvingEList.ManyInverse<ComponentExchange>(ComponentExchange.class, this, OaPackage.COMMUNICATION_MEAN__REALIZING_COMPONENT_EXCHANGES, FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES);
		}
		return realizingComponentExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getSourceEntity() {
		if (sourceEntity != null && sourceEntity.eIsProxy()) {
			InternalEObject oldSourceEntity = (InternalEObject)sourceEntity;
			sourceEntity = (Entity)eResolveProxy(oldSourceEntity);
			if (sourceEntity != oldSourceEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OaPackage.COMMUNICATION_MEAN__SOURCE_ENTITY, oldSourceEntity, sourceEntity));
			}
		}
		return sourceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSourceEntity() {
		return sourceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getTargetEntity() {
		if (targetEntity != null && targetEntity.eIsProxy()) {
			InternalEObject oldTargetEntity = (InternalEObject)targetEntity;
			targetEntity = (Entity)eResolveProxy(oldTargetEntity);
			if (targetEntity != oldTargetEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OaPackage.COMMUNICATION_MEAN__TARGET_ENTITY, oldTargetEntity, targetEntity));
			}
		}
		return targetEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTargetEntity() {
		return targetEntity;
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
			case OaPackage.COMMUNICATION_MEAN__REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizations()).basicAdd(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__LINK:
				if (link != null)
					msgs = ((InternalEObject)link).eInverseRemove(this, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, ExchangeContainment.class, msgs);
				return basicSetLink((ExchangeContainment)otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingExchangeSpecificationRealizations()).basicAdd(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingExchangeSpecificationRealizations()).basicAdd(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__ALLOCATED_FUNCTIONAL_EXCHANGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatedFunctionalExchanges()).basicAdd(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingComponentExchangeRealizations()).basicAdd(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingComponentExchangeRealizations()).basicAdd(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingComponentExchangeFunctionalExchangeAllocations()).basicAdd(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__REALIZED_COMPONENT_EXCHANGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizedComponentExchanges()).basicAdd(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__REALIZING_COMPONENT_EXCHANGES:
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
			case OaPackage.COMMUNICATION_MEAN__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__REALIZATIONS:
				return ((InternalEList<?>)getRealizations()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__LINK:
				return basicSetLink(null, msgs);
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return ((InternalEList<?>)getOutgoingExchangeSpecificationRealizations()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return ((InternalEList<?>)getIncomingExchangeSpecificationRealizations()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__ALLOCATED_FUNCTIONAL_EXCHANGES:
				return ((InternalEList<?>)getAllocatedFunctionalExchanges()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getIncomingComponentExchangeRealizations()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getOutgoingComponentExchangeRealizations()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return ((InternalEList<?>)getOutgoingComponentExchangeFunctionalExchangeAllocations()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedComponentExchangeFunctionalExchangeAllocations()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getOwnedComponentExchangeRealizations()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS:
				return ((InternalEList<?>)getOwnedComponentExchangeEnds()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__REALIZED_COMPONENT_EXCHANGES:
				return ((InternalEList<?>)getRealizedComponentExchanges()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__REALIZING_COMPONENT_EXCHANGES:
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
			case OaPackage.COMMUNICATION_MEAN__NAME:
				return getName();
			case OaPackage.COMMUNICATION_MEAN__NAMING_RULES:
				return getNamingRules();
			case OaPackage.COMMUNICATION_MEAN__ABSTRACT_TYPED_ELEMENTS:
				return getAbstractTypedElements();
			case OaPackage.COMMUNICATION_MEAN__INVOKING_SEQUENCE_MESSAGES:
				return getInvokingSequenceMessages();
			case OaPackage.COMMUNICATION_MEAN__REALIZATIONS:
				return getRealizations();
			case OaPackage.COMMUNICATION_MEAN__CONVOYED_INFORMATIONS:
				return getConvoyedInformations();
			case OaPackage.COMMUNICATION_MEAN__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OaPackage.COMMUNICATION_MEAN__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case OaPackage.COMMUNICATION_MEAN__REALIZING_ACTIVITY_FLOWS:
				return getRealizingActivityFlows();
			case OaPackage.COMMUNICATION_MEAN__CONTAINING_LINK:
				if (resolve) return getContainingLink();
				return basicGetContainingLink();
			case OaPackage.COMMUNICATION_MEAN__LINK:
				if (resolve) return getLink();
				return basicGetLink();
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return getOutgoingExchangeSpecificationRealizations();
			case OaPackage.COMMUNICATION_MEAN__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return getIncomingExchangeSpecificationRealizations();
			case OaPackage.COMMUNICATION_MEAN__KIND:
				return getKind();
			case OaPackage.COMMUNICATION_MEAN__ORIENTED:
				return isOriented();
			case OaPackage.COMMUNICATION_MEAN__ALLOCATED_FUNCTIONAL_EXCHANGES:
				return getAllocatedFunctionalExchanges();
			case OaPackage.COMMUNICATION_MEAN__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS:
				return getIncomingComponentExchangeRealizations();
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS:
				return getOutgoingComponentExchangeRealizations();
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return getOutgoingComponentExchangeFunctionalExchangeAllocations();
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return getOwnedComponentExchangeFunctionalExchangeAllocations();
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return getOwnedComponentExchangeRealizations();
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS:
				return getOwnedComponentExchangeEnds();
			case OaPackage.COMMUNICATION_MEAN__SOURCE_PORT:
				if (resolve) return getSourcePort();
				return basicGetSourcePort();
			case OaPackage.COMMUNICATION_MEAN__SOURCE_PART:
				if (resolve) return getSourcePart();
				return basicGetSourcePart();
			case OaPackage.COMMUNICATION_MEAN__TARGET_PORT:
				if (resolve) return getTargetPort();
				return basicGetTargetPort();
			case OaPackage.COMMUNICATION_MEAN__TARGET_PART:
				if (resolve) return getTargetPart();
				return basicGetTargetPart();
			case OaPackage.COMMUNICATION_MEAN__CATEGORIES:
				return getCategories();
			case OaPackage.COMMUNICATION_MEAN__ALLOCATOR_PHYSICAL_LINKS:
				return getAllocatorPhysicalLinks();
			case OaPackage.COMMUNICATION_MEAN__REALIZED_COMPONENT_EXCHANGES:
				return getRealizedComponentExchanges();
			case OaPackage.COMMUNICATION_MEAN__REALIZING_COMPONENT_EXCHANGES:
				return getRealizingComponentExchanges();
			case OaPackage.COMMUNICATION_MEAN__SOURCE_ENTITY:
				if (resolve) return getSourceEntity();
				return basicGetSourceEntity();
			case OaPackage.COMMUNICATION_MEAN__TARGET_ENTITY:
				if (resolve) return getTargetEntity();
				return basicGetTargetEntity();
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
			case OaPackage.COMMUNICATION_MEAN__NAME:
				setName((String)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__REALIZATIONS:
				getRealizations().clear();
				getRealizations().addAll((Collection<? extends AbstractRelationship>)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__CONVOYED_INFORMATIONS:
				getConvoyedInformations().clear();
				getConvoyedInformations().addAll((Collection<? extends AbstractExchangeItem>)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__SOURCE:
				setSource((InformationsExchanger)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__TARGET:
				setTarget((InformationsExchanger)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__LINK:
				setLink((ExchangeContainment)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__KIND:
				setKind((ComponentExchangeKind)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__ORIENTED:
				setOriented((Boolean)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeFunctionalExchangeAllocations().clear();
				getOwnedComponentExchangeFunctionalExchangeAllocations().addAll((Collection<? extends ComponentExchangeFunctionalExchangeAllocation>)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				getOwnedComponentExchangeRealizations().clear();
				getOwnedComponentExchangeRealizations().addAll((Collection<? extends ComponentExchangeRealization>)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS:
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
			case OaPackage.COMMUNICATION_MEAN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OaPackage.COMMUNICATION_MEAN__NAMING_RULES:
				getNamingRules().clear();
				return;
			case OaPackage.COMMUNICATION_MEAN__REALIZATIONS:
				getRealizations().clear();
				return;
			case OaPackage.COMMUNICATION_MEAN__CONVOYED_INFORMATIONS:
				getConvoyedInformations().clear();
				return;
			case OaPackage.COMMUNICATION_MEAN__SOURCE:
				setSource((InformationsExchanger)null);
				return;
			case OaPackage.COMMUNICATION_MEAN__TARGET:
				setTarget((InformationsExchanger)null);
				return;
			case OaPackage.COMMUNICATION_MEAN__LINK:
				setLink((ExchangeContainment)null);
				return;
			case OaPackage.COMMUNICATION_MEAN__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case OaPackage.COMMUNICATION_MEAN__ORIENTED:
				setOriented(ORIENTED_EDEFAULT);
				return;
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeFunctionalExchangeAllocations().clear();
				return;
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				getOwnedComponentExchangeRealizations().clear();
				return;
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS:
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
			case OaPackage.COMMUNICATION_MEAN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OaPackage.COMMUNICATION_MEAN__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__ABSTRACT_TYPED_ELEMENTS:
				return abstractTypedElements != null && !abstractTypedElements.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__INVOKING_SEQUENCE_MESSAGES:
				return invokingSequenceMessages != null && !invokingSequenceMessages.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__REALIZATIONS:
				return realizations != null && !realizations.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__CONVOYED_INFORMATIONS:
				return convoyedInformations != null && !convoyedInformations.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__SOURCE:
				return source != null;
			case OaPackage.COMMUNICATION_MEAN__TARGET:
				return target != null;
			case OaPackage.COMMUNICATION_MEAN__REALIZING_ACTIVITY_FLOWS:
				return realizingActivityFlows != null && !realizingActivityFlows.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__CONTAINING_LINK:
				return containingLink != null;
			case OaPackage.COMMUNICATION_MEAN__LINK:
				return link != null;
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return outgoingExchangeSpecificationRealizations != null && !outgoingExchangeSpecificationRealizations.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return incomingExchangeSpecificationRealizations != null && !incomingExchangeSpecificationRealizations.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__KIND:
				return kind != KIND_EDEFAULT;
			case OaPackage.COMMUNICATION_MEAN__ORIENTED:
				return oriented != ORIENTED_EDEFAULT;
			case OaPackage.COMMUNICATION_MEAN__ALLOCATED_FUNCTIONAL_EXCHANGES:
				return allocatedFunctionalExchanges != null && !allocatedFunctionalExchanges.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS:
				return incomingComponentExchangeRealizations != null && !incomingComponentExchangeRealizations.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS:
				return outgoingComponentExchangeRealizations != null && !outgoingComponentExchangeRealizations.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return outgoingComponentExchangeFunctionalExchangeAllocations != null && !outgoingComponentExchangeFunctionalExchangeAllocations.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return ownedComponentExchangeFunctionalExchangeAllocations != null && !ownedComponentExchangeFunctionalExchangeAllocations.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return ownedComponentExchangeRealizations != null && !ownedComponentExchangeRealizations.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS:
				return ownedComponentExchangeEnds != null && !ownedComponentExchangeEnds.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__SOURCE_PORT:
				return sourcePort != null;
			case OaPackage.COMMUNICATION_MEAN__SOURCE_PART:
				return sourcePart != null;
			case OaPackage.COMMUNICATION_MEAN__TARGET_PORT:
				return targetPort != null;
			case OaPackage.COMMUNICATION_MEAN__TARGET_PART:
				return targetPart != null;
			case OaPackage.COMMUNICATION_MEAN__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__ALLOCATOR_PHYSICAL_LINKS:
				return allocatorPhysicalLinks != null && !allocatorPhysicalLinks.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__REALIZED_COMPONENT_EXCHANGES:
				return realizedComponentExchanges != null && !realizedComponentExchanges.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__REALIZING_COMPONENT_EXCHANGES:
				return realizingComponentExchanges != null && !realizingComponentExchanges.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__SOURCE_ENTITY:
				return sourceEntity != null;
			case OaPackage.COMMUNICATION_MEAN__TARGET_ENTITY:
				return targetEntity != null;
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
				case OaPackage.COMMUNICATION_MEAN__NAME: return ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (derivedFeatureID) {
				case OaPackage.COMMUNICATION_MEAN__ABSTRACT_TYPED_ELEMENTS: return ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEventOperation.class) {
			switch (derivedFeatureID) {
				case OaPackage.COMMUNICATION_MEAN__INVOKING_SEQUENCE_MESSAGES: return InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES;
				default: return -1;
			}
		}
		if (baseClass == AbstractInformationFlow.class) {
			switch (derivedFeatureID) {
				case OaPackage.COMMUNICATION_MEAN__REALIZATIONS: return ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZATIONS;
				case OaPackage.COMMUNICATION_MEAN__CONVOYED_INFORMATIONS: return ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__CONVOYED_INFORMATIONS;
				case OaPackage.COMMUNICATION_MEAN__SOURCE: return ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__SOURCE;
				case OaPackage.COMMUNICATION_MEAN__TARGET: return ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__TARGET;
				default: return -1;
			}
		}
		if (baseClass == ActivityExchange.class) {
			switch (derivedFeatureID) {
				case OaPackage.COMMUNICATION_MEAN__REALIZING_ACTIVITY_FLOWS: return ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == ExchangeSpecification.class) {
			switch (derivedFeatureID) {
				case OaPackage.COMMUNICATION_MEAN__CONTAINING_LINK: return FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK;
				case OaPackage.COMMUNICATION_MEAN__LINK: return FaPackage.EXCHANGE_SPECIFICATION__LINK;
				case OaPackage.COMMUNICATION_MEAN__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS: return FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS;
				case OaPackage.COMMUNICATION_MEAN__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS: return FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS;
				default: return -1;
			}
		}
		if (baseClass == ComponentExchange.class) {
			switch (derivedFeatureID) {
				case OaPackage.COMMUNICATION_MEAN__KIND: return FaPackage.COMPONENT_EXCHANGE__KIND;
				case OaPackage.COMMUNICATION_MEAN__ORIENTED: return FaPackage.COMPONENT_EXCHANGE__ORIENTED;
				case OaPackage.COMMUNICATION_MEAN__ALLOCATED_FUNCTIONAL_EXCHANGES: return FaPackage.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES;
				case OaPackage.COMMUNICATION_MEAN__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS: return FaPackage.COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS;
				case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS: return FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS;
				case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS: return FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS;
				case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS: return FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS;
				case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS: return FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS;
				case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS: return FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS;
				case OaPackage.COMMUNICATION_MEAN__SOURCE_PORT: return FaPackage.COMPONENT_EXCHANGE__SOURCE_PORT;
				case OaPackage.COMMUNICATION_MEAN__SOURCE_PART: return FaPackage.COMPONENT_EXCHANGE__SOURCE_PART;
				case OaPackage.COMMUNICATION_MEAN__TARGET_PORT: return FaPackage.COMPONENT_EXCHANGE__TARGET_PORT;
				case OaPackage.COMMUNICATION_MEAN__TARGET_PART: return FaPackage.COMPONENT_EXCHANGE__TARGET_PART;
				case OaPackage.COMMUNICATION_MEAN__CATEGORIES: return FaPackage.COMPONENT_EXCHANGE__CATEGORIES;
				case OaPackage.COMMUNICATION_MEAN__ALLOCATOR_PHYSICAL_LINKS: return FaPackage.COMPONENT_EXCHANGE__ALLOCATOR_PHYSICAL_LINKS;
				case OaPackage.COMMUNICATION_MEAN__REALIZED_COMPONENT_EXCHANGES: return FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES;
				case OaPackage.COMMUNICATION_MEAN__REALIZING_COMPONENT_EXCHANGES: return FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES;
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
				case ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME: return OaPackage.COMMUNICATION_MEAN__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS: return OaPackage.COMMUNICATION_MEAN__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEventOperation.class) {
			switch (baseFeatureID) {
				case InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES: return OaPackage.COMMUNICATION_MEAN__INVOKING_SEQUENCE_MESSAGES;
				default: return -1;
			}
		}
		if (baseClass == AbstractInformationFlow.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZATIONS: return OaPackage.COMMUNICATION_MEAN__REALIZATIONS;
				case ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__CONVOYED_INFORMATIONS: return OaPackage.COMMUNICATION_MEAN__CONVOYED_INFORMATIONS;
				case ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__SOURCE: return OaPackage.COMMUNICATION_MEAN__SOURCE;
				case ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__TARGET: return OaPackage.COMMUNICATION_MEAN__TARGET;
				default: return -1;
			}
		}
		if (baseClass == ActivityExchange.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS: return OaPackage.COMMUNICATION_MEAN__REALIZING_ACTIVITY_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == ExchangeSpecification.class) {
			switch (baseFeatureID) {
				case FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK: return OaPackage.COMMUNICATION_MEAN__CONTAINING_LINK;
				case FaPackage.EXCHANGE_SPECIFICATION__LINK: return OaPackage.COMMUNICATION_MEAN__LINK;
				case FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS: return OaPackage.COMMUNICATION_MEAN__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS;
				case FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS: return OaPackage.COMMUNICATION_MEAN__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS;
				default: return -1;
			}
		}
		if (baseClass == ComponentExchange.class) {
			switch (baseFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__KIND: return OaPackage.COMMUNICATION_MEAN__KIND;
				case FaPackage.COMPONENT_EXCHANGE__ORIENTED: return OaPackage.COMMUNICATION_MEAN__ORIENTED;
				case FaPackage.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES: return OaPackage.COMMUNICATION_MEAN__ALLOCATED_FUNCTIONAL_EXCHANGES;
				case FaPackage.COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS: return OaPackage.COMMUNICATION_MEAN__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS;
				case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS: return OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS;
				case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS: return OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS;
				case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS: return OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS;
				case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS: return OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS;
				case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS: return OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS;
				case FaPackage.COMPONENT_EXCHANGE__SOURCE_PORT: return OaPackage.COMMUNICATION_MEAN__SOURCE_PORT;
				case FaPackage.COMPONENT_EXCHANGE__SOURCE_PART: return OaPackage.COMMUNICATION_MEAN__SOURCE_PART;
				case FaPackage.COMPONENT_EXCHANGE__TARGET_PORT: return OaPackage.COMMUNICATION_MEAN__TARGET_PORT;
				case FaPackage.COMPONENT_EXCHANGE__TARGET_PART: return OaPackage.COMMUNICATION_MEAN__TARGET_PART;
				case FaPackage.COMPONENT_EXCHANGE__CATEGORIES: return OaPackage.COMMUNICATION_MEAN__CATEGORIES;
				case FaPackage.COMPONENT_EXCHANGE__ALLOCATOR_PHYSICAL_LINKS: return OaPackage.COMMUNICATION_MEAN__ALLOCATOR_PHYSICAL_LINKS;
				case FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES: return OaPackage.COMMUNICATION_MEAN__REALIZED_COMPONENT_EXCHANGES;
				case FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES: return OaPackage.COMMUNICATION_MEAN__REALIZING_COMPONENT_EXCHANGES;
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
		result.append(", kind: "); //$NON-NLS-1$
		result.append(kind);
		result.append(", oriented: "); //$NON-NLS-1$
		result.append(oriented);
		result.append(')');
		return result.toString();
	}

} //CommunicationMeanImpl
