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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.Port;
import org.polarsys.capella.core.data.information.PortRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.PortRealizationImpl#getRealizedPort <em>Realized Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.PortRealizationImpl#getRealizingPort <em>Realizing Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortRealizationImpl extends AllocationImpl implements PortRealization {
	/**
	 * The cached value of the '{@link #getRealizedPort() <em>Realized Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedPort()
	 * @generated
	 * @ordered
	 */
	protected Port realizedPort;
	/**
	 * The cached value of the '{@link #getRealizingPort() <em>Realizing Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingPort()
	 * @generated
	 * @ordered
	 */
	protected Port realizingPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.PORT_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getRealizedPort() {
		if (realizedPort != null && realizedPort.eIsProxy()) {
			InternalEObject oldRealizedPort = (InternalEObject)realizedPort;
			realizedPort = (Port)eResolveProxy(oldRealizedPort);
			if (realizedPort != oldRealizedPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationPackage.PORT_REALIZATION__REALIZED_PORT, oldRealizedPort, realizedPort));
			}
		}
		return realizedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetRealizedPort() {
		return realizedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizedPort(Port newRealizedPort, NotificationChain msgs) {
		Port oldRealizedPort = realizedPort;
		realizedPort = newRealizedPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InformationPackage.PORT_REALIZATION__REALIZED_PORT, oldRealizedPort, newRealizedPort);
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
	public Port getRealizingPort() {
		if (realizingPort != null && realizingPort.eIsProxy()) {
			InternalEObject oldRealizingPort = (InternalEObject)realizingPort;
			realizingPort = (Port)eResolveProxy(oldRealizingPort);
			if (realizingPort != oldRealizingPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationPackage.PORT_REALIZATION__REALIZING_PORT, oldRealizingPort, realizingPort));
			}
		}
		return realizingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetRealizingPort() {
		return realizingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizingPort(Port newRealizingPort, NotificationChain msgs) {
		Port oldRealizingPort = realizingPort;
		realizingPort = newRealizingPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InformationPackage.PORT_REALIZATION__REALIZING_PORT, oldRealizingPort, newRealizingPort);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InformationPackage.PORT_REALIZATION__REALIZED_PORT:
				if (realizedPort != null)
					msgs = ((InternalEObject)realizedPort).eInverseRemove(this, InformationPackage.PORT__INCOMING_PORT_REALIZATIONS, Port.class, msgs);
				return basicSetRealizedPort((Port)otherEnd, msgs);
			case InformationPackage.PORT_REALIZATION__REALIZING_PORT:
				if (realizingPort != null)
					msgs = ((InternalEObject)realizingPort).eInverseRemove(this, InformationPackage.PORT__OUTGOING_PORT_REALIZATIONS, Port.class, msgs);
				return basicSetRealizingPort((Port)otherEnd, msgs);
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
			case InformationPackage.PORT_REALIZATION__REALIZED_PORT:
				return basicSetRealizedPort(null, msgs);
			case InformationPackage.PORT_REALIZATION__REALIZING_PORT:
				return basicSetRealizingPort(null, msgs);
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
			case InformationPackage.PORT_REALIZATION__REALIZED_PORT:
				if (resolve) return getRealizedPort();
				return basicGetRealizedPort();
			case InformationPackage.PORT_REALIZATION__REALIZING_PORT:
				if (resolve) return getRealizingPort();
				return basicGetRealizingPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InformationPackage.PORT_REALIZATION__REALIZED_PORT:
				return realizedPort != null;
			case InformationPackage.PORT_REALIZATION__REALIZING_PORT:
				return realizingPort != null;
		}
		return super.eIsSet(featureID);
	}

} //PortRealizationImpl
