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
import modellingcore.InformationsExchanger;
import modellingcore.ModellingcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.common.data.activity.ActivityEdge;
import org.polarsys.capella.common.data.activity.ActivityExchange;
import org.polarsys.capella.common.data.activity.ActivityPackage;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.fa.ExchangeContainment;
import org.polarsys.capella.core.data.fa.ExchangeLink;
import org.polarsys.capella.core.data.fa.ExchangeSpecification;
import org.polarsys.capella.core.data.fa.ExchangeSpecificationRealization;
import org.polarsys.capella.core.data.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ExchangeSpecificationImpl#getRealizedFlow <em>Realized Flow</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ExchangeSpecificationImpl#getRealizations <em>Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ExchangeSpecificationImpl#getConvoyedInformations <em>Convoyed Informations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ExchangeSpecificationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ExchangeSpecificationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ExchangeSpecificationImpl#getRealizingActivityFlows <em>Realizing Activity Flows</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ExchangeSpecificationImpl#getContainingLink <em>Containing Link</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ExchangeSpecificationImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ExchangeSpecificationImpl#getOutgoingExchangeSpecificationRealizations <em>Outgoing Exchange Specification Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ExchangeSpecificationImpl#getIncomingExchangeSpecificationRealizations <em>Incoming Exchange Specification Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExchangeSpecificationImpl extends NamedElementImpl implements ExchangeSpecification {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.EXCHANGE_SPECIFICATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW, oldRealizedFlow, realizedFlow));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW, oldRealizedFlow, newRealizedFlow);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW, newRealizedFlow, newRealizedFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractRelationship> getRealizations() {
		if (realizations == null) {
			realizations = new EObjectWithInverseResolvingEList<AbstractRelationship>(AbstractRelationship.class, this, FaPackage.EXCHANGE_SPECIFICATION__REALIZATIONS, ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW);
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
			convoyedInformations = new EObjectResolvingEList<AbstractExchangeItem>(AbstractExchangeItem.class, this, FaPackage.EXCHANGE_SPECIFICATION__CONVOYED_INFORMATIONS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.EXCHANGE_SPECIFICATION__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_SPECIFICATION__SOURCE, oldSource, source));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.EXCHANGE_SPECIFICATION__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_SPECIFICATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityEdge> getRealizingActivityFlows() {
		if (realizingActivityFlows == null) {
			realizingActivityFlows = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, FaPackage.EXCHANGE_SPECIFICATION__REALIZING_ACTIVITY_FLOWS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK, oldContainingLink, containingLink));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.EXCHANGE_SPECIFICATION__LINK, oldLink, link));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_SPECIFICATION__LINK, oldLink, newLink);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_SPECIFICATION__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExchangeSpecificationRealization> getOutgoingExchangeSpecificationRealizations() {
		if (outgoingExchangeSpecificationRealizations == null) {
			outgoingExchangeSpecificationRealizations = new EObjectWithInverseResolvingEList<ExchangeSpecificationRealization>(ExchangeSpecificationRealization.class, this, FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS, FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZING_EXCHANGE_SPECIFICATION);
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
			incomingExchangeSpecificationRealizations = new EObjectWithInverseResolvingEList<ExchangeSpecificationRealization>(ExchangeSpecificationRealization.class, this, FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS, FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZED_EXCHANGE_SPECIFICATION);
		}
		return incomingExchangeSpecificationRealizations;
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
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW:
				if (realizedFlow != null)
					msgs = ((InternalEObject)realizedFlow).eInverseRemove(this, ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZATIONS, AbstractInformationFlow.class, msgs);
				return basicSetRealizedFlow((AbstractInformationFlow)otherEnd, msgs);
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizations()).basicAdd(otherEnd, msgs);
			case FaPackage.EXCHANGE_SPECIFICATION__LINK:
				if (link != null)
					msgs = ((InternalEObject)link).eInverseRemove(this, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, ExchangeContainment.class, msgs);
				return basicSetLink((ExchangeContainment)otherEnd, msgs);
			case FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingExchangeSpecificationRealizations()).basicAdd(otherEnd, msgs);
			case FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingExchangeSpecificationRealizations()).basicAdd(otherEnd, msgs);
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
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW:
				return basicSetRealizedFlow(null, msgs);
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZATIONS:
				return ((InternalEList<?>)getRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.EXCHANGE_SPECIFICATION__LINK:
				return basicSetLink(null, msgs);
			case FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return ((InternalEList<?>)getOutgoingExchangeSpecificationRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return ((InternalEList<?>)getIncomingExchangeSpecificationRealizations()).basicRemove(otherEnd, msgs);
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
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW:
				if (resolve) return getRealizedFlow();
				return basicGetRealizedFlow();
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZATIONS:
				return getRealizations();
			case FaPackage.EXCHANGE_SPECIFICATION__CONVOYED_INFORMATIONS:
				return getConvoyedInformations();
			case FaPackage.EXCHANGE_SPECIFICATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FaPackage.EXCHANGE_SPECIFICATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZING_ACTIVITY_FLOWS:
				return getRealizingActivityFlows();
			case FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK:
				if (resolve) return getContainingLink();
				return basicGetContainingLink();
			case FaPackage.EXCHANGE_SPECIFICATION__LINK:
				if (resolve) return getLink();
				return basicGetLink();
			case FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return getOutgoingExchangeSpecificationRealizations();
			case FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return getIncomingExchangeSpecificationRealizations();
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
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW:
				setRealizedFlow((AbstractInformationFlow)newValue);
				return;
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZATIONS:
				getRealizations().clear();
				getRealizations().addAll((Collection<? extends AbstractRelationship>)newValue);
				return;
			case FaPackage.EXCHANGE_SPECIFICATION__CONVOYED_INFORMATIONS:
				getConvoyedInformations().clear();
				getConvoyedInformations().addAll((Collection<? extends AbstractExchangeItem>)newValue);
				return;
			case FaPackage.EXCHANGE_SPECIFICATION__SOURCE:
				setSource((InformationsExchanger)newValue);
				return;
			case FaPackage.EXCHANGE_SPECIFICATION__TARGET:
				setTarget((InformationsExchanger)newValue);
				return;
			case FaPackage.EXCHANGE_SPECIFICATION__LINK:
				setLink((ExchangeContainment)newValue);
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
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW:
				setRealizedFlow((AbstractInformationFlow)null);
				return;
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZATIONS:
				getRealizations().clear();
				return;
			case FaPackage.EXCHANGE_SPECIFICATION__CONVOYED_INFORMATIONS:
				getConvoyedInformations().clear();
				return;
			case FaPackage.EXCHANGE_SPECIFICATION__SOURCE:
				setSource((InformationsExchanger)null);
				return;
			case FaPackage.EXCHANGE_SPECIFICATION__TARGET:
				setTarget((InformationsExchanger)null);
				return;
			case FaPackage.EXCHANGE_SPECIFICATION__LINK:
				setLink((ExchangeContainment)null);
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
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW:
				return realizedFlow != null;
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZATIONS:
				return realizations != null && !realizations.isEmpty();
			case FaPackage.EXCHANGE_SPECIFICATION__CONVOYED_INFORMATIONS:
				return convoyedInformations != null && !convoyedInformations.isEmpty();
			case FaPackage.EXCHANGE_SPECIFICATION__SOURCE:
				return source != null;
			case FaPackage.EXCHANGE_SPECIFICATION__TARGET:
				return target != null;
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZING_ACTIVITY_FLOWS:
				return realizingActivityFlows != null && !realizingActivityFlows.isEmpty();
			case FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK:
				return containingLink != null;
			case FaPackage.EXCHANGE_SPECIFICATION__LINK:
				return link != null;
			case FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return outgoingExchangeSpecificationRealizations != null && !outgoingExchangeSpecificationRealizations.isEmpty();
			case FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return incomingExchangeSpecificationRealizations != null && !incomingExchangeSpecificationRealizations.isEmpty();
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
				case FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW: return ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW;
				default: return -1;
			}
		}
		if (baseClass == AbstractInformationFlow.class) {
			switch (derivedFeatureID) {
				case FaPackage.EXCHANGE_SPECIFICATION__REALIZATIONS: return ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZATIONS;
				case FaPackage.EXCHANGE_SPECIFICATION__CONVOYED_INFORMATIONS: return ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__CONVOYED_INFORMATIONS;
				case FaPackage.EXCHANGE_SPECIFICATION__SOURCE: return ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__SOURCE;
				case FaPackage.EXCHANGE_SPECIFICATION__TARGET: return ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__TARGET;
				default: return -1;
			}
		}
		if (baseClass == ActivityExchange.class) {
			switch (derivedFeatureID) {
				case FaPackage.EXCHANGE_SPECIFICATION__REALIZING_ACTIVITY_FLOWS: return ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS;
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
				case ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW: return FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW;
				default: return -1;
			}
		}
		if (baseClass == AbstractInformationFlow.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZATIONS: return FaPackage.EXCHANGE_SPECIFICATION__REALIZATIONS;
				case ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__CONVOYED_INFORMATIONS: return FaPackage.EXCHANGE_SPECIFICATION__CONVOYED_INFORMATIONS;
				case ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__SOURCE: return FaPackage.EXCHANGE_SPECIFICATION__SOURCE;
				case ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__TARGET: return FaPackage.EXCHANGE_SPECIFICATION__TARGET;
				default: return -1;
			}
		}
		if (baseClass == ActivityExchange.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS: return FaPackage.EXCHANGE_SPECIFICATION__REALIZING_ACTIVITY_FLOWS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ExchangeSpecificationImpl
