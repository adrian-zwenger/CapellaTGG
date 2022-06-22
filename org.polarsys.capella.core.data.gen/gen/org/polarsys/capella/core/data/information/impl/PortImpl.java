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
package org.polarsys.capella.core.data.information.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacommon.StateMachine;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.cs.Interface;

import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.Port;
import org.polarsys.capella.core.data.information.PortAllocation;
import org.polarsys.capella.core.data.information.PortRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.PortImpl#getIncomingPortRealizations <em>Incoming Port Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.PortImpl#getOutgoingPortRealizations <em>Outgoing Port Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.PortImpl#getOwnedProtocols <em>Owned Protocols</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.PortImpl#getIncomingPortAllocations <em>Incoming Port Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.PortImpl#getOutgoingPortAllocations <em>Outgoing Port Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.PortImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.PortImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.PortImpl#getOwnedPortRealizations <em>Owned Port Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.PortImpl#getOwnedPortAllocations <em>Owned Port Allocations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortImpl extends NamedElementImpl implements Port {
	/**
	 * The cached value of the '{@link #getIncomingPortRealizations() <em>Incoming Port Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingPortRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<PortRealization> incomingPortRealizations;

	/**
	 * The cached value of the '{@link #getOutgoingPortRealizations() <em>Outgoing Port Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingPortRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<PortRealization> outgoingPortRealizations;

	/**
	 * The cached value of the '{@link #getOwnedProtocols() <em>Owned Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> ownedProtocols;

	/**
	 * The cached value of the '{@link #getIncomingPortAllocations() <em>Incoming Port Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingPortAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<PortAllocation> incomingPortAllocations;

	/**
	 * The cached value of the '{@link #getOutgoingPortAllocations() <em>Outgoing Port Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingPortAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<PortAllocation> outgoingPortAllocations;

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
	 * The cached value of the '{@link #getOwnedPortRealizations() <em>Owned Port Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPortRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<PortRealization> ownedPortRealizations;

	/**
	 * The cached value of the '{@link #getOwnedPortAllocations() <em>Owned Port Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPortAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<PortAllocation> ownedPortAllocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortRealization> getIncomingPortRealizations() {
		if (incomingPortRealizations == null) {
			incomingPortRealizations = new EObjectWithInverseResolvingEList<PortRealization>(PortRealization.class, this, InformationPackage.PORT__INCOMING_PORT_REALIZATIONS, InformationPackage.PORT_REALIZATION__REALIZED_PORT);
		}
		return incomingPortRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortRealization> getOutgoingPortRealizations() {
		if (outgoingPortRealizations == null) {
			outgoingPortRealizations = new EObjectWithInverseResolvingEList<PortRealization>(PortRealization.class, this, InformationPackage.PORT__OUTGOING_PORT_REALIZATIONS, InformationPackage.PORT_REALIZATION__REALIZING_PORT);
		}
		return outgoingPortRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StateMachine> getOwnedProtocols() {
		if (ownedProtocols == null) {
			ownedProtocols = new EObjectContainmentEList.Resolving<StateMachine>(StateMachine.class, this, InformationPackage.PORT__OWNED_PROTOCOLS);
		}
		return ownedProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortAllocation> getIncomingPortAllocations() {
		if (incomingPortAllocations == null) {
			incomingPortAllocations = new EObjectWithInverseResolvingEList<PortAllocation>(PortAllocation.class, this, InformationPackage.PORT__INCOMING_PORT_ALLOCATIONS, InformationPackage.PORT_ALLOCATION__ALLOCATED_PORT);
		}
		return incomingPortAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortAllocation> getOutgoingPortAllocations() {
		if (outgoingPortAllocations == null) {
			outgoingPortAllocations = new EObjectWithInverseResolvingEList<PortAllocation>(PortAllocation.class, this, InformationPackage.PORT__OUTGOING_PORT_ALLOCATIONS, InformationPackage.PORT_ALLOCATION__ALLOCATING_PORT);
		}
		return outgoingPortAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, InformationPackage.PORT__PROVIDED_INTERFACES);
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
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, InformationPackage.PORT__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortRealization> getOwnedPortRealizations() {
		if (ownedPortRealizations == null) {
			ownedPortRealizations = new EObjectContainmentEList.Resolving<PortRealization>(PortRealization.class, this, InformationPackage.PORT__OWNED_PORT_REALIZATIONS);
		}
		return ownedPortRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortAllocation> getOwnedPortAllocations() {
		if (ownedPortAllocations == null) {
			ownedPortAllocations = new EObjectContainmentEList.Resolving<PortAllocation>(PortAllocation.class, this, InformationPackage.PORT__OWNED_PORT_ALLOCATIONS);
		}
		return ownedPortAllocations;
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
			case InformationPackage.PORT__INCOMING_PORT_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingPortRealizations()).basicAdd(otherEnd, msgs);
			case InformationPackage.PORT__OUTGOING_PORT_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingPortRealizations()).basicAdd(otherEnd, msgs);
			case InformationPackage.PORT__INCOMING_PORT_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingPortAllocations()).basicAdd(otherEnd, msgs);
			case InformationPackage.PORT__OUTGOING_PORT_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingPortAllocations()).basicAdd(otherEnd, msgs);
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
			case InformationPackage.PORT__INCOMING_PORT_REALIZATIONS:
				return ((InternalEList<?>)getIncomingPortRealizations()).basicRemove(otherEnd, msgs);
			case InformationPackage.PORT__OUTGOING_PORT_REALIZATIONS:
				return ((InternalEList<?>)getOutgoingPortRealizations()).basicRemove(otherEnd, msgs);
			case InformationPackage.PORT__OWNED_PROTOCOLS:
				return ((InternalEList<?>)getOwnedProtocols()).basicRemove(otherEnd, msgs);
			case InformationPackage.PORT__INCOMING_PORT_ALLOCATIONS:
				return ((InternalEList<?>)getIncomingPortAllocations()).basicRemove(otherEnd, msgs);
			case InformationPackage.PORT__OUTGOING_PORT_ALLOCATIONS:
				return ((InternalEList<?>)getOutgoingPortAllocations()).basicRemove(otherEnd, msgs);
			case InformationPackage.PORT__OWNED_PORT_REALIZATIONS:
				return ((InternalEList<?>)getOwnedPortRealizations()).basicRemove(otherEnd, msgs);
			case InformationPackage.PORT__OWNED_PORT_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedPortAllocations()).basicRemove(otherEnd, msgs);
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
			case InformationPackage.PORT__INCOMING_PORT_REALIZATIONS:
				return getIncomingPortRealizations();
			case InformationPackage.PORT__OUTGOING_PORT_REALIZATIONS:
				return getOutgoingPortRealizations();
			case InformationPackage.PORT__OWNED_PROTOCOLS:
				return getOwnedProtocols();
			case InformationPackage.PORT__INCOMING_PORT_ALLOCATIONS:
				return getIncomingPortAllocations();
			case InformationPackage.PORT__OUTGOING_PORT_ALLOCATIONS:
				return getOutgoingPortAllocations();
			case InformationPackage.PORT__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case InformationPackage.PORT__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case InformationPackage.PORT__OWNED_PORT_REALIZATIONS:
				return getOwnedPortRealizations();
			case InformationPackage.PORT__OWNED_PORT_ALLOCATIONS:
				return getOwnedPortAllocations();
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
			case InformationPackage.PORT__OWNED_PROTOCOLS:
				getOwnedProtocols().clear();
				getOwnedProtocols().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case InformationPackage.PORT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				getProvidedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case InformationPackage.PORT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				getRequiredInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case InformationPackage.PORT__OWNED_PORT_REALIZATIONS:
				getOwnedPortRealizations().clear();
				getOwnedPortRealizations().addAll((Collection<? extends PortRealization>)newValue);
				return;
			case InformationPackage.PORT__OWNED_PORT_ALLOCATIONS:
				getOwnedPortAllocations().clear();
				getOwnedPortAllocations().addAll((Collection<? extends PortAllocation>)newValue);
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
			case InformationPackage.PORT__OWNED_PROTOCOLS:
				getOwnedProtocols().clear();
				return;
			case InformationPackage.PORT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				return;
			case InformationPackage.PORT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				return;
			case InformationPackage.PORT__OWNED_PORT_REALIZATIONS:
				getOwnedPortRealizations().clear();
				return;
			case InformationPackage.PORT__OWNED_PORT_ALLOCATIONS:
				getOwnedPortAllocations().clear();
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
			case InformationPackage.PORT__INCOMING_PORT_REALIZATIONS:
				return incomingPortRealizations != null && !incomingPortRealizations.isEmpty();
			case InformationPackage.PORT__OUTGOING_PORT_REALIZATIONS:
				return outgoingPortRealizations != null && !outgoingPortRealizations.isEmpty();
			case InformationPackage.PORT__OWNED_PROTOCOLS:
				return ownedProtocols != null && !ownedProtocols.isEmpty();
			case InformationPackage.PORT__INCOMING_PORT_ALLOCATIONS:
				return incomingPortAllocations != null && !incomingPortAllocations.isEmpty();
			case InformationPackage.PORT__OUTGOING_PORT_ALLOCATIONS:
				return outgoingPortAllocations != null && !outgoingPortAllocations.isEmpty();
			case InformationPackage.PORT__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case InformationPackage.PORT__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case InformationPackage.PORT__OWNED_PORT_REALIZATIONS:
				return ownedPortRealizations != null && !ownedPortRealizations.isEmpty();
			case InformationPackage.PORT__OWNED_PORT_ALLOCATIONS:
				return ownedPortAllocations != null && !ownedPortAllocations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PortImpl
