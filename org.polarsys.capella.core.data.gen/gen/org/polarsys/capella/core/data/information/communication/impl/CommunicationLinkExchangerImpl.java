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
package org.polarsys.capella.core.data.information.communication.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.information.communication.CommunicationLink;
import org.polarsys.capella.core.data.information.communication.CommunicationLinkExchanger;
import org.polarsys.capella.core.data.information.communication.CommunicationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Exchanger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.information.communication.impl.CommunicationLinkExchangerImpl#getOwnedCommunicationLinks <em>Owned Communication Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.communication.impl.CommunicationLinkExchangerImpl#getProduce <em>Produce</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.communication.impl.CommunicationLinkExchangerImpl#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.communication.impl.CommunicationLinkExchangerImpl#getSend <em>Send</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.communication.impl.CommunicationLinkExchangerImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.communication.impl.CommunicationLinkExchangerImpl#getCall <em>Call</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.communication.impl.CommunicationLinkExchangerImpl#getExecute <em>Execute</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.communication.impl.CommunicationLinkExchangerImpl#getWrite <em>Write</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.communication.impl.CommunicationLinkExchangerImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.communication.impl.CommunicationLinkExchangerImpl#getAcquire <em>Acquire</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.communication.impl.CommunicationLinkExchangerImpl#getTransmit <em>Transmit</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommunicationLinkExchangerImpl extends EObjectImpl implements CommunicationLinkExchanger {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationLinkExchangerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMMUNICATION_LINK_EXCHANGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationLink> getOwnedCommunicationLinks() {
		if (ownedCommunicationLinks == null) {
			ownedCommunicationLinks = new EObjectContainmentEList.Resolving<CommunicationLink>(CommunicationLink.class, this, CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS);
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
			produce = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__PRODUCE);
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
			consume = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CONSUME);
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
			send = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__SEND);
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
			receive = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__RECEIVE);
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
			call = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CALL);
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
			execute = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__EXECUTE);
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
			write = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__WRITE);
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
			access = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACCESS);
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
			acquire = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACQUIRE);
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
			transmit = new EObjectResolvingEList<CommunicationLink>(CommunicationLink.class, this, CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__TRANSMIT);
		}
		return transmit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS:
				return ((InternalEList<?>)getOwnedCommunicationLinks()).basicRemove(otherEnd, msgs);
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
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS:
				return getOwnedCommunicationLinks();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__PRODUCE:
				return getProduce();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CONSUME:
				return getConsume();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__SEND:
				return getSend();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__RECEIVE:
				return getReceive();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CALL:
				return getCall();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__EXECUTE:
				return getExecute();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__WRITE:
				return getWrite();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACCESS:
				return getAccess();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACQUIRE:
				return getAcquire();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__TRANSMIT:
				return getTransmit();
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
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS:
				getOwnedCommunicationLinks().clear();
				getOwnedCommunicationLinks().addAll((Collection<? extends CommunicationLink>)newValue);
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
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS:
				getOwnedCommunicationLinks().clear();
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
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS:
				return ownedCommunicationLinks != null && !ownedCommunicationLinks.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__PRODUCE:
				return produce != null && !produce.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CONSUME:
				return consume != null && !consume.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__SEND:
				return send != null && !send.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__RECEIVE:
				return receive != null && !receive.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CALL:
				return call != null && !call.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__EXECUTE:
				return execute != null && !execute.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__WRITE:
				return write != null && !write.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACCESS:
				return access != null && !access.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACQUIRE:
				return acquire != null && !acquire.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__TRANSMIT:
				return transmit != null && !transmit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunicationLinkExchangerImpl
