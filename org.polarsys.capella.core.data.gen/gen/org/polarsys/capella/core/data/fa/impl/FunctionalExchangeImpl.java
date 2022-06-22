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

import behavior.AbstractBehavior;
import behavior.AbstractEvent;

import java.util.Collection;

import modellingcore.AbstractInformationFlow;
import modellingcore.AbstractRelationship;
import modellingcore.AbstractType;
import modellingcore.AbstractTypedElement;
import modellingcore.ModellingcorePackage;
import modellingcore.RateKind;
import modellingcore.ValueSpecification;

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
import org.polarsys.capella.common.data.activity.ActivityNode;
import org.polarsys.capella.common.data.activity.ActivityPackage;
import org.polarsys.capella.common.data.activity.ActivityPartition;
import org.polarsys.capella.common.data.activity.InterruptibleActivityRegion;
import org.polarsys.capella.common.data.activity.ObjectFlow;
import org.polarsys.capella.common.data.activity.StructuredActivityNode;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.capellacore.Relationship;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeFunctionalExchangeAllocation;
import org.polarsys.capella.core.data.fa.ExchangeCategory;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.FunctionInputPort;
import org.polarsys.capella.core.data.fa.FunctionOutputPort;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.fa.FunctionalExchangeRealization;
import org.polarsys.capella.core.data.fa.FunctionalExchangeSpecification;

import org.polarsys.capella.core.data.information.AbstractEventOperation;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.InformationPackage;

import org.polarsys.capella.core.data.interaction.SequenceMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getRealizedFlow <em>Realized Flow</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getKindOfRate <em>Kind Of Rate</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getInActivityPartition <em>In Activity Partition</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getInterrupts <em>Interrupts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#isIsMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#isIsMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getAbstractTypedElements <em>Abstract Typed Elements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getInvokingSequenceMessages <em>Invoking Sequence Messages</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getExchangeSpecifications <em>Exchange Specifications</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getInvolvingFunctionalChains <em>Involving Functional Chains</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getExchangedItems <em>Exchanged Items</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getAllocatingComponentExchanges <em>Allocating Component Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getIncomingComponentExchangeFunctionalExchangeRealizations <em>Incoming Component Exchange Functional Exchange Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getIncomingFunctionalExchangeRealizations <em>Incoming Functional Exchange Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getOutgoingFunctionalExchangeRealizations <em>Outgoing Functional Exchange Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getOwnedFunctionalExchangeRealizations <em>Owned Functional Exchange Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getSourceFunctionOutputPort <em>Source Function Output Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getTargetFunctionInputPort <em>Target Function Input Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getRealizedFunctionalExchanges <em>Realized Functional Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalExchangeImpl#getRealizingFunctionalExchanges <em>Realizing Functional Exchanges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalExchangeImpl extends NamedElementImpl implements FunctionalExchange {
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
	 * The cached value of the '{@link #getInvolvingInvolvements() <em>Involving Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvingInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<Involvement> involvingInvolvements;

	/**
	 * The default value of the '{@link #getKindOfRate() <em>Kind Of Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfRate()
	 * @generated
	 * @ordered
	 */
	protected static final RateKind KIND_OF_RATE_EDEFAULT = RateKind.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getKindOfRate() <em>Kind Of Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfRate()
	 * @generated
	 * @ordered
	 */
	protected RateKind kindOfRate = KIND_OF_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInActivityPartition() <em>In Activity Partition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInActivityPartition()
	 * @generated
	 * @ordered
	 */
	protected ActivityPartition inActivityPartition;

	/**
	 * The cached value of the '{@link #getInInterruptibleRegion() <em>In Interruptible Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInInterruptibleRegion()
	 * @generated
	 * @ordered
	 */
	protected InterruptibleActivityRegion inInterruptibleRegion;

	/**
	 * The cached value of the '{@link #getInStructuredNode() <em>In Structured Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInStructuredNode()
	 * @generated
	 * @ordered
	 */
	protected StructuredActivityNode inStructuredNode;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification rate;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification probability;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode source;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification guard;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification weight;

	/**
	 * The cached value of the '{@link #getInterrupts() <em>Interrupts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterrupts()
	 * @generated
	 * @ordered
	 */
	protected InterruptibleActivityRegion interrupts;

	/**
	 * The default value of the '{@link #isIsMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMulticast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTICAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMulticast()
	 * @generated
	 * @ordered
	 */
	protected boolean isMulticast = IS_MULTICAST_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultireceive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTIRECEIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultireceive()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultireceive = IS_MULTIRECEIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected AbstractBehavior transformation;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected AbstractBehavior selection;

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
	 * The cached value of the '{@link #getExchangeSpecifications() <em>Exchange Specifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalExchangeSpecification> exchangeSpecifications;

	/**
	 * The cached value of the '{@link #getInvolvingFunctionalChains() <em>Involving Functional Chains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvingFunctionalChains()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalChain> involvingFunctionalChains;

	/**
	 * The cached value of the '{@link #getExchangedItems() <em>Exchanged Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItem> exchangedItems;

	/**
	 * The cached value of the '{@link #getAllocatingComponentExchanges() <em>Allocating Component Exchanges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingComponentExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchange> allocatingComponentExchanges;

	/**
	 * The cached value of the '{@link #getIncomingComponentExchangeFunctionalExchangeRealizations() <em>Incoming Component Exchange Functional Exchange Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingComponentExchangeFunctionalExchangeRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeFunctionalExchangeAllocation> incomingComponentExchangeFunctionalExchangeRealizations;

	/**
	 * The cached value of the '{@link #getIncomingFunctionalExchangeRealizations() <em>Incoming Functional Exchange Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingFunctionalExchangeRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalExchangeRealization> incomingFunctionalExchangeRealizations;

	/**
	 * The cached value of the '{@link #getOutgoingFunctionalExchangeRealizations() <em>Outgoing Functional Exchange Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFunctionalExchangeRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalExchangeRealization> outgoingFunctionalExchangeRealizations;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeCategory> categories;

	/**
	 * The cached value of the '{@link #getOwnedFunctionalExchangeRealizations() <em>Owned Functional Exchange Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionalExchangeRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalExchangeRealization> ownedFunctionalExchangeRealizations;

	/**
	 * The cached value of the '{@link #getSourceFunctionOutputPort() <em>Source Function Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFunctionOutputPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionOutputPort sourceFunctionOutputPort;

	/**
	 * The cached value of the '{@link #getTargetFunctionInputPort() <em>Target Function Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFunctionInputPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionInputPort targetFunctionInputPort;

	/**
	 * The cached value of the '{@link #getRealizedFunctionalExchanges() <em>Realized Functional Exchanges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedFunctionalExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalExchange> realizedFunctionalExchanges;

	/**
	 * The cached value of the '{@link #getRealizingFunctionalExchanges() <em>Realizing Functional Exchanges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingFunctionalExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalExchange> realizingFunctionalExchanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTIONAL_EXCHANGE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW, oldRealizedFlow, realizedFlow));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW, oldRealizedFlow, newRealizedFlow);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW, newRealizedFlow, newRealizedFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Involvement> getInvolvingInvolvements() {
		if (involvingInvolvements == null) {
			involvingInvolvements = new EObjectResolvingEList<Involvement>(Involvement.class, this, FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_INVOLVEMENTS);
		}
		return involvingInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RateKind getKindOfRate() {
		return kindOfRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKindOfRate(RateKind newKindOfRate) {
		RateKind oldKindOfRate = kindOfRate;
		kindOfRate = newKindOfRate == null ? KIND_OF_RATE_EDEFAULT : newKindOfRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE, oldKindOfRate, kindOfRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityPartition getInActivityPartition() {
		if (inActivityPartition != null && inActivityPartition.eIsProxy()) {
			InternalEObject oldInActivityPartition = (InternalEObject)inActivityPartition;
			inActivityPartition = (ActivityPartition)eResolveProxy(oldInActivityPartition);
			if (inActivityPartition != oldInActivityPartition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__IN_ACTIVITY_PARTITION, oldInActivityPartition, inActivityPartition));
			}
		}
		return inActivityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition basicGetInActivityPartition() {
		return inActivityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterruptibleActivityRegion getInInterruptibleRegion() {
		if (inInterruptibleRegion != null && inInterruptibleRegion.eIsProxy()) {
			InternalEObject oldInInterruptibleRegion = (InternalEObject)inInterruptibleRegion;
			inInterruptibleRegion = (InterruptibleActivityRegion)eResolveProxy(oldInInterruptibleRegion);
			if (inInterruptibleRegion != oldInInterruptibleRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__IN_INTERRUPTIBLE_REGION, oldInInterruptibleRegion, inInterruptibleRegion));
			}
		}
		return inInterruptibleRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion basicGetInInterruptibleRegion() {
		return inInterruptibleRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuredActivityNode getInStructuredNode() {
		if (inStructuredNode != null && inStructuredNode.eIsProxy()) {
			InternalEObject oldInStructuredNode = (InternalEObject)inStructuredNode;
			inStructuredNode = (StructuredActivityNode)eResolveProxy(oldInStructuredNode);
			if (inStructuredNode != oldInStructuredNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__IN_STRUCTURED_NODE, oldInStructuredNode, inStructuredNode));
			}
		}
		return inStructuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode basicGetInStructuredNode() {
		return inStructuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification getRate() {
		if (rate != null && rate.eIsProxy()) {
			InternalEObject oldRate = (InternalEObject)rate;
			rate = (ValueSpecification)eResolveProxy(oldRate);
			if (rate != oldRate) {
				InternalEObject newRate = (InternalEObject)rate;
				NotificationChain msgs = oldRate.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__RATE, null, null);
				if (newRate.eInternalContainer() == null) {
					msgs = newRate.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__RATE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__RATE, oldRate, rate));
			}
		}
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRate(ValueSpecification newRate, NotificationChain msgs) {
		ValueSpecification oldRate = rate;
		rate = newRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__RATE, oldRate, newRate);
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
	public void setRate(ValueSpecification newRate) {
		if (newRate != rate) {
			NotificationChain msgs = null;
			if (rate != null)
				msgs = ((InternalEObject)rate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__RATE, null, msgs);
			if (newRate != null)
				msgs = ((InternalEObject)newRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__RATE, null, msgs);
			msgs = basicSetRate(newRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__RATE, newRate, newRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification getProbability() {
		if (probability != null && probability.eIsProxy()) {
			InternalEObject oldProbability = (InternalEObject)probability;
			probability = (ValueSpecification)eResolveProxy(oldProbability);
			if (probability != oldProbability) {
				InternalEObject newProbability = (InternalEObject)probability;
				NotificationChain msgs = oldProbability.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, null, null);
				if (newProbability.eInternalContainer() == null) {
					msgs = newProbability.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, oldProbability, probability));
			}
		}
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProbability(ValueSpecification newProbability, NotificationChain msgs) {
		ValueSpecification oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, oldProbability, newProbability);
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
	public void setProbability(ValueSpecification newProbability) {
		if (newProbability != probability) {
			NotificationChain msgs = null;
			if (probability != null)
				msgs = ((InternalEObject)probability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, null, msgs);
			if (newProbability != null)
				msgs = ((InternalEObject)newProbability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, null, msgs);
			msgs = basicSetProbability(newProbability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, newProbability, newProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ActivityNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(ActivityNode newTarget) {
		ActivityNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ActivityNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(ActivityNode newSource) {
		ActivityNode oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification getGuard() {
		if (guard != null && guard.eIsProxy()) {
			InternalEObject oldGuard = (InternalEObject)guard;
			guard = (ValueSpecification)eResolveProxy(oldGuard);
			if (guard != oldGuard) {
				InternalEObject newGuard = (InternalEObject)guard;
				NotificationChain msgs = oldGuard.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__GUARD, null, null);
				if (newGuard.eInternalContainer() == null) {
					msgs = newGuard.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__GUARD, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__GUARD, oldGuard, guard));
			}
		}
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(ValueSpecification newGuard, NotificationChain msgs) {
		ValueSpecification oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__GUARD, oldGuard, newGuard);
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
	public void setGuard(ValueSpecification newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification getWeight() {
		if (weight != null && weight.eIsProxy()) {
			InternalEObject oldWeight = (InternalEObject)weight;
			weight = (ValueSpecification)eResolveProxy(oldWeight);
			if (weight != oldWeight) {
				InternalEObject newWeight = (InternalEObject)weight;
				NotificationChain msgs = oldWeight.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, null, null);
				if (newWeight.eInternalContainer() == null) {
					msgs = newWeight.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, oldWeight, weight));
			}
		}
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeight(ValueSpecification newWeight, NotificationChain msgs) {
		ValueSpecification oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, oldWeight, newWeight);
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
	public void setWeight(ValueSpecification newWeight) {
		if (newWeight != weight) {
			NotificationChain msgs = null;
			if (weight != null)
				msgs = ((InternalEObject)weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, null, msgs);
			if (newWeight != null)
				msgs = ((InternalEObject)newWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, null, msgs);
			msgs = basicSetWeight(newWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, newWeight, newWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterruptibleActivityRegion getInterrupts() {
		if (interrupts != null && interrupts.eIsProxy()) {
			InternalEObject oldInterrupts = (InternalEObject)interrupts;
			interrupts = (InterruptibleActivityRegion)eResolveProxy(oldInterrupts);
			if (interrupts != oldInterrupts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS, oldInterrupts, interrupts));
			}
		}
		return interrupts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion basicGetInterrupts() {
		return interrupts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterrupts(InterruptibleActivityRegion newInterrupts, NotificationChain msgs) {
		InterruptibleActivityRegion oldInterrupts = interrupts;
		interrupts = newInterrupts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS, oldInterrupts, newInterrupts);
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
	public void setInterrupts(InterruptibleActivityRegion newInterrupts) {
		if (newInterrupts != interrupts) {
			NotificationChain msgs = null;
			if (interrupts != null)
				msgs = ((InternalEObject)interrupts).eInverseRemove(this, ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES, InterruptibleActivityRegion.class, msgs);
			if (newInterrupts != null)
				msgs = ((InternalEObject)newInterrupts).eInverseAdd(this, ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES, InterruptibleActivityRegion.class, msgs);
			msgs = basicSetInterrupts(newInterrupts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS, newInterrupts, newInterrupts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsMulticast() {
		return isMulticast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMulticast(boolean newIsMulticast) {
		boolean oldIsMulticast = isMulticast;
		isMulticast = newIsMulticast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST, oldIsMulticast, isMulticast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsMultireceive() {
		return isMultireceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMultireceive(boolean newIsMultireceive) {
		boolean oldIsMultireceive = isMultireceive;
		isMultireceive = newIsMultireceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE, oldIsMultireceive, isMultireceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractBehavior getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject)transformation;
			transformation = (AbstractBehavior)eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION, oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBehavior basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransformation(AbstractBehavior newTransformation) {
		AbstractBehavior oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractBehavior getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (AbstractBehavior)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBehavior basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelection(AbstractBehavior newSelection) {
		AbstractBehavior oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypedElement> getAbstractTypedElements() {
		if (abstractTypedElements == null) {
			abstractTypedElements = new EObjectResolvingEList<AbstractTypedElement>(AbstractTypedElement.class, this, FaPackage.FUNCTIONAL_EXCHANGE__ABSTRACT_TYPED_ELEMENTS);
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
			invokingSequenceMessages = new EObjectResolvingEList<SequenceMessage>(SequenceMessage.class, this, FaPackage.FUNCTIONAL_EXCHANGE__INVOKING_SEQUENCE_MESSAGES);
		}
		return invokingSequenceMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalExchangeSpecification> getExchangeSpecifications() {
		if (exchangeSpecifications == null) {
			exchangeSpecifications = new EObjectResolvingEList<FunctionalExchangeSpecification>(FunctionalExchangeSpecification.class, this, FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGE_SPECIFICATIONS);
		}
		return exchangeSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalChain> getInvolvingFunctionalChains() {
		if (involvingFunctionalChains == null) {
			involvingFunctionalChains = new EObjectWithInverseResolvingEList.ManyInverse<FunctionalChain>(FunctionalChain.class, this, FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_FUNCTIONAL_CHAINS, FaPackage.FUNCTIONAL_CHAIN__INVOLVED_FUNCTIONAL_EXCHANGES);
		}
		return involvingFunctionalChains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExchangeItem> getExchangedItems() {
		if (exchangedItems == null) {
			exchangedItems = new EObjectResolvingEList<ExchangeItem>(ExchangeItem.class, this, FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS);
		}
		return exchangedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchange> getAllocatingComponentExchanges() {
		if (allocatingComponentExchanges == null) {
			allocatingComponentExchanges = new EObjectWithInverseResolvingEList.ManyInverse<ComponentExchange>(ComponentExchange.class, this, FaPackage.FUNCTIONAL_EXCHANGE__ALLOCATING_COMPONENT_EXCHANGES, FaPackage.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES);
		}
		return allocatingComponentExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentExchangeFunctionalExchangeAllocation> getIncomingComponentExchangeFunctionalExchangeRealizations() {
		if (incomingComponentExchangeFunctionalExchangeRealizations == null) {
			incomingComponentExchangeFunctionalExchangeRealizations = new EObjectWithInverseResolvingEList<ComponentExchangeFunctionalExchangeAllocation>(ComponentExchangeFunctionalExchangeAllocation.class, this, FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_REALIZATIONS, FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATED_FUNCTIONAL_EXCHANGE);
		}
		return incomingComponentExchangeFunctionalExchangeRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalExchangeRealization> getIncomingFunctionalExchangeRealizations() {
		if (incomingFunctionalExchangeRealizations == null) {
			incomingFunctionalExchangeRealizations = new EObjectWithInverseResolvingEList<FunctionalExchangeRealization>(FunctionalExchangeRealization.class, this, FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_FUNCTIONAL_EXCHANGE_REALIZATIONS, FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZED_FUNCTIONAL_EXCHANGE);
		}
		return incomingFunctionalExchangeRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalExchangeRealization> getOutgoingFunctionalExchangeRealizations() {
		if (outgoingFunctionalExchangeRealizations == null) {
			outgoingFunctionalExchangeRealizations = new EObjectWithInverseResolvingEList<FunctionalExchangeRealization>(FunctionalExchangeRealization.class, this, FaPackage.FUNCTIONAL_EXCHANGE__OUTGOING_FUNCTIONAL_EXCHANGE_REALIZATIONS, FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZING_FUNCTIONAL_EXCHANGE);
		}
		return outgoingFunctionalExchangeRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExchangeCategory> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<ExchangeCategory>(ExchangeCategory.class, this, FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalExchangeRealization> getOwnedFunctionalExchangeRealizations() {
		if (ownedFunctionalExchangeRealizations == null) {
			ownedFunctionalExchangeRealizations = new EObjectContainmentEList.Resolving<FunctionalExchangeRealization>(FunctionalExchangeRealization.class, this, FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS);
		}
		return ownedFunctionalExchangeRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionOutputPort getSourceFunctionOutputPort() {
		if (sourceFunctionOutputPort != null && sourceFunctionOutputPort.eIsProxy()) {
			InternalEObject oldSourceFunctionOutputPort = (InternalEObject)sourceFunctionOutputPort;
			sourceFunctionOutputPort = (FunctionOutputPort)eResolveProxy(oldSourceFunctionOutputPort);
			if (sourceFunctionOutputPort != oldSourceFunctionOutputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT, oldSourceFunctionOutputPort, sourceFunctionOutputPort));
			}
		}
		return sourceFunctionOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionOutputPort basicGetSourceFunctionOutputPort() {
		return sourceFunctionOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionInputPort getTargetFunctionInputPort() {
		if (targetFunctionInputPort != null && targetFunctionInputPort.eIsProxy()) {
			InternalEObject oldTargetFunctionInputPort = (InternalEObject)targetFunctionInputPort;
			targetFunctionInputPort = (FunctionInputPort)eResolveProxy(oldTargetFunctionInputPort);
			if (targetFunctionInputPort != oldTargetFunctionInputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT, oldTargetFunctionInputPort, targetFunctionInputPort));
			}
		}
		return targetFunctionInputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInputPort basicGetTargetFunctionInputPort() {
		return targetFunctionInputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalExchange> getRealizedFunctionalExchanges() {
		if (realizedFunctionalExchanges == null) {
			realizedFunctionalExchanges = new EObjectWithInverseResolvingEList.ManyInverse<FunctionalExchange>(FunctionalExchange.class, this, FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES, FaPackage.FUNCTIONAL_EXCHANGE__REALIZING_FUNCTIONAL_EXCHANGES);
		}
		return realizedFunctionalExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalExchange> getRealizingFunctionalExchanges() {
		if (realizingFunctionalExchanges == null) {
			realizingFunctionalExchanges = new EObjectWithInverseResolvingEList.ManyInverse<FunctionalExchange>(FunctionalExchange.class, this, FaPackage.FUNCTIONAL_EXCHANGE__REALIZING_FUNCTIONAL_EXCHANGES, FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES);
		}
		return realizingFunctionalExchanges;
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
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW:
				if (realizedFlow != null)
					msgs = ((InternalEObject)realizedFlow).eInverseRemove(this, ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZATIONS, AbstractInformationFlow.class, msgs);
				return basicSetRealizedFlow((AbstractInformationFlow)otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
				if (interrupts != null)
					msgs = ((InternalEObject)interrupts).eInverseRemove(this, ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES, InterruptibleActivityRegion.class, msgs);
				return basicSetInterrupts((InterruptibleActivityRegion)otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_FUNCTIONAL_CHAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvolvingFunctionalChains()).basicAdd(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__ALLOCATING_COMPONENT_EXCHANGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatingComponentExchanges()).basicAdd(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingComponentExchangeFunctionalExchangeRealizations()).basicAdd(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingFunctionalExchangeRealizations()).basicAdd(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__OUTGOING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingFunctionalExchangeRealizations()).basicAdd(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizedFunctionalExchanges()).basicAdd(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZING_FUNCTIONAL_EXCHANGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizingFunctionalExchanges()).basicAdd(otherEnd, msgs);
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
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW:
				return basicSetRealizedFlow(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				return basicSetRate(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				return basicSetProbability(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				return basicSetGuard(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				return basicSetWeight(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
				return basicSetInterrupts(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_FUNCTIONAL_CHAINS:
				return ((InternalEList<?>)getInvolvingFunctionalChains()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__ALLOCATING_COMPONENT_EXCHANGES:
				return ((InternalEList<?>)getAllocatingComponentExchanges()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getIncomingComponentExchangeFunctionalExchangeRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getIncomingFunctionalExchangeRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__OUTGOING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getOutgoingFunctionalExchangeRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getOwnedFunctionalExchangeRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES:
				return ((InternalEList<?>)getRealizedFunctionalExchanges()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZING_FUNCTIONAL_EXCHANGES:
				return ((InternalEList<?>)getRealizingFunctionalExchanges()).basicRemove(otherEnd, msgs);
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
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW:
				if (resolve) return getRealizedFlow();
				return basicGetRealizedFlow();
			case FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
				return getKindOfRate();
			case FaPackage.FUNCTIONAL_EXCHANGE__IN_ACTIVITY_PARTITION:
				if (resolve) return getInActivityPartition();
				return basicGetInActivityPartition();
			case FaPackage.FUNCTIONAL_EXCHANGE__IN_INTERRUPTIBLE_REGION:
				if (resolve) return getInInterruptibleRegion();
				return basicGetInInterruptibleRegion();
			case FaPackage.FUNCTIONAL_EXCHANGE__IN_STRUCTURED_NODE:
				if (resolve) return getInStructuredNode();
				return basicGetInStructuredNode();
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				if (resolve) return getRate();
				return basicGetRate();
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				if (resolve) return getProbability();
				return basicGetProbability();
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				if (resolve) return getGuard();
				return basicGetGuard();
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				if (resolve) return getWeight();
				return basicGetWeight();
			case FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
				if (resolve) return getInterrupts();
				return basicGetInterrupts();
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
				return isIsMulticast();
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
				return isIsMultireceive();
			case FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION:
				if (resolve) return getTransformation();
				return basicGetTransformation();
			case FaPackage.FUNCTIONAL_EXCHANGE__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case FaPackage.FUNCTIONAL_EXCHANGE__ABSTRACT_TYPED_ELEMENTS:
				return getAbstractTypedElements();
			case FaPackage.FUNCTIONAL_EXCHANGE__INVOKING_SEQUENCE_MESSAGES:
				return getInvokingSequenceMessages();
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGE_SPECIFICATIONS:
				return getExchangeSpecifications();
			case FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_FUNCTIONAL_CHAINS:
				return getInvolvingFunctionalChains();
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
				return getExchangedItems();
			case FaPackage.FUNCTIONAL_EXCHANGE__ALLOCATING_COMPONENT_EXCHANGES:
				return getAllocatingComponentExchanges();
			case FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return getIncomingComponentExchangeFunctionalExchangeRealizations();
			case FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return getIncomingFunctionalExchangeRealizations();
			case FaPackage.FUNCTIONAL_EXCHANGE__OUTGOING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return getOutgoingFunctionalExchangeRealizations();
			case FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
				return getCategories();
			case FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return getOwnedFunctionalExchangeRealizations();
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT:
				if (resolve) return getSourceFunctionOutputPort();
				return basicGetSourceFunctionOutputPort();
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT:
				if (resolve) return getTargetFunctionInputPort();
				return basicGetTargetFunctionInputPort();
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES:
				return getRealizedFunctionalExchanges();
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZING_FUNCTIONAL_EXCHANGES:
				return getRealizingFunctionalExchanges();
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
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW:
				setRealizedFlow((AbstractInformationFlow)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
				setKindOfRate((RateKind)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				setRate((ValueSpecification)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				setProbability((ValueSpecification)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
				setTarget((ActivityNode)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
				setSource((ActivityNode)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				setGuard((ValueSpecification)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				setWeight((ValueSpecification)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
				setInterrupts((InterruptibleActivityRegion)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
				setIsMulticast((Boolean)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
				setIsMultireceive((Boolean)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION:
				setTransformation((AbstractBehavior)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__SELECTION:
				setSelection((AbstractBehavior)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGE_SPECIFICATIONS:
				getExchangeSpecifications().clear();
				getExchangeSpecifications().addAll((Collection<? extends FunctionalExchangeSpecification>)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
				getExchangedItems().clear();
				getExchangedItems().addAll((Collection<? extends ExchangeItem>)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				getOwnedFunctionalExchangeRealizations().clear();
				getOwnedFunctionalExchangeRealizations().addAll((Collection<? extends FunctionalExchangeRealization>)newValue);
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
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW:
				setRealizedFlow((AbstractInformationFlow)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
				setKindOfRate(KIND_OF_RATE_EDEFAULT);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				setRate((ValueSpecification)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				setProbability((ValueSpecification)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
				setTarget((ActivityNode)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
				setSource((ActivityNode)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				setGuard((ValueSpecification)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				setWeight((ValueSpecification)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
				setInterrupts((InterruptibleActivityRegion)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
				setIsMulticast(IS_MULTICAST_EDEFAULT);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
				setIsMultireceive(IS_MULTIRECEIVE_EDEFAULT);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION:
				setTransformation((AbstractBehavior)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__SELECTION:
				setSelection((AbstractBehavior)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGE_SPECIFICATIONS:
				getExchangeSpecifications().clear();
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
				getExchangedItems().clear();
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				getOwnedFunctionalExchangeRealizations().clear();
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
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW:
				return realizedFlow != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_INVOLVEMENTS:
				return involvingInvolvements != null && !involvingInvolvements.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
				return kindOfRate != KIND_OF_RATE_EDEFAULT;
			case FaPackage.FUNCTIONAL_EXCHANGE__IN_ACTIVITY_PARTITION:
				return inActivityPartition != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__IN_STRUCTURED_NODE:
				return inStructuredNode != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				return rate != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				return probability != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
				return target != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
				return source != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				return guard != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				return weight != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
				return interrupts != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
				return isMulticast != IS_MULTICAST_EDEFAULT;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
				return isMultireceive != IS_MULTIRECEIVE_EDEFAULT;
			case FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION:
				return transformation != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__SELECTION:
				return selection != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__ABSTRACT_TYPED_ELEMENTS:
				return abstractTypedElements != null && !abstractTypedElements.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__INVOKING_SEQUENCE_MESSAGES:
				return invokingSequenceMessages != null && !invokingSequenceMessages.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGE_SPECIFICATIONS:
				return exchangeSpecifications != null && !exchangeSpecifications.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_FUNCTIONAL_CHAINS:
				return involvingFunctionalChains != null && !involvingFunctionalChains.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
				return exchangedItems != null && !exchangedItems.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__ALLOCATING_COMPONENT_EXCHANGES:
				return allocatingComponentExchanges != null && !allocatingComponentExchanges.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return incomingComponentExchangeFunctionalExchangeRealizations != null && !incomingComponentExchangeFunctionalExchangeRealizations.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return incomingFunctionalExchangeRealizations != null && !incomingFunctionalExchangeRealizations.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__OUTGOING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return outgoingFunctionalExchangeRealizations != null && !outgoingFunctionalExchangeRealizations.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return ownedFunctionalExchangeRealizations != null && !ownedFunctionalExchangeRealizations.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT:
				return sourceFunctionOutputPort != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT:
				return targetFunctionInputPort != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES:
				return realizedFunctionalExchanges != null && !realizedFunctionalExchanges.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZING_FUNCTIONAL_EXCHANGES:
				return realizingFunctionalExchanges != null && !realizingFunctionalExchanges.isEmpty();
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
		if (baseClass == AbstractRelationship.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW: return ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW;
				default: return -1;
			}
		}
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == ActivityEdge.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE: return ActivityPackage.ACTIVITY_EDGE__KIND_OF_RATE;
				case FaPackage.FUNCTIONAL_EXCHANGE__IN_ACTIVITY_PARTITION: return ActivityPackage.ACTIVITY_EDGE__IN_ACTIVITY_PARTITION;
				case FaPackage.FUNCTIONAL_EXCHANGE__IN_INTERRUPTIBLE_REGION: return ActivityPackage.ACTIVITY_EDGE__IN_INTERRUPTIBLE_REGION;
				case FaPackage.FUNCTIONAL_EXCHANGE__IN_STRUCTURED_NODE: return ActivityPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE;
				case FaPackage.FUNCTIONAL_EXCHANGE__RATE: return ActivityPackage.ACTIVITY_EDGE__RATE;
				case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY: return ActivityPackage.ACTIVITY_EDGE__PROBABILITY;
				case FaPackage.FUNCTIONAL_EXCHANGE__TARGET: return ActivityPackage.ACTIVITY_EDGE__TARGET;
				case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE: return ActivityPackage.ACTIVITY_EDGE__SOURCE;
				case FaPackage.FUNCTIONAL_EXCHANGE__GUARD: return ActivityPackage.ACTIVITY_EDGE__GUARD;
				case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT: return ActivityPackage.ACTIVITY_EDGE__WEIGHT;
				case FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS: return ActivityPackage.ACTIVITY_EDGE__INTERRUPTS;
				default: return -1;
			}
		}
		if (baseClass == ObjectFlow.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST: return ActivityPackage.OBJECT_FLOW__IS_MULTICAST;
				case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE: return ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE;
				case FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION: return ActivityPackage.OBJECT_FLOW__TRANSFORMATION;
				case FaPackage.FUNCTIONAL_EXCHANGE__SELECTION: return ActivityPackage.OBJECT_FLOW__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTIONAL_EXCHANGE__ABSTRACT_TYPED_ELEMENTS: return ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS;
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
				case FaPackage.FUNCTIONAL_EXCHANGE__INVOKING_SEQUENCE_MESSAGES: return InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES;
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
		if (baseClass == AbstractRelationship.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW: return FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW;
				default: return -1;
			}
		}
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == ActivityEdge.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ACTIVITY_EDGE__KIND_OF_RATE: return FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE;
				case ActivityPackage.ACTIVITY_EDGE__IN_ACTIVITY_PARTITION: return FaPackage.FUNCTIONAL_EXCHANGE__IN_ACTIVITY_PARTITION;
				case ActivityPackage.ACTIVITY_EDGE__IN_INTERRUPTIBLE_REGION: return FaPackage.FUNCTIONAL_EXCHANGE__IN_INTERRUPTIBLE_REGION;
				case ActivityPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE: return FaPackage.FUNCTIONAL_EXCHANGE__IN_STRUCTURED_NODE;
				case ActivityPackage.ACTIVITY_EDGE__RATE: return FaPackage.FUNCTIONAL_EXCHANGE__RATE;
				case ActivityPackage.ACTIVITY_EDGE__PROBABILITY: return FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY;
				case ActivityPackage.ACTIVITY_EDGE__TARGET: return FaPackage.FUNCTIONAL_EXCHANGE__TARGET;
				case ActivityPackage.ACTIVITY_EDGE__SOURCE: return FaPackage.FUNCTIONAL_EXCHANGE__SOURCE;
				case ActivityPackage.ACTIVITY_EDGE__GUARD: return FaPackage.FUNCTIONAL_EXCHANGE__GUARD;
				case ActivityPackage.ACTIVITY_EDGE__WEIGHT: return FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT;
				case ActivityPackage.ACTIVITY_EDGE__INTERRUPTS: return FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS;
				default: return -1;
			}
		}
		if (baseClass == ObjectFlow.class) {
			switch (baseFeatureID) {
				case ActivityPackage.OBJECT_FLOW__IS_MULTICAST: return FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST;
				case ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE: return FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE;
				case ActivityPackage.OBJECT_FLOW__TRANSFORMATION: return FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION;
				case ActivityPackage.OBJECT_FLOW__SELECTION: return FaPackage.FUNCTIONAL_EXCHANGE__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS: return FaPackage.FUNCTIONAL_EXCHANGE__ABSTRACT_TYPED_ELEMENTS;
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
				case InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES: return FaPackage.FUNCTIONAL_EXCHANGE__INVOKING_SEQUENCE_MESSAGES;
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
		result.append(" (kindOfRate: "); //$NON-NLS-1$
		result.append(kindOfRate);
		result.append(", isMulticast: "); //$NON-NLS-1$
		result.append(isMulticast);
		result.append(", isMultireceive: "); //$NON-NLS-1$
		result.append(isMultireceive);
		result.append(')');
		return result.toString();
	}

} //FunctionalExchangeImpl
