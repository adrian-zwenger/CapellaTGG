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
package org.polarsys.capella.core.data.interaction.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityRealization;
import org.polarsys.capella.core.data.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Capability Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.AbstractCapabilityRealizationImpl#getRealizedCapability <em>Realized Capability</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.AbstractCapabilityRealizationImpl#getRealizingCapability <em>Realizing Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractCapabilityRealizationImpl extends AllocationImpl implements AbstractCapabilityRealization {
	/**
	 * The cached value of the '{@link #getRealizedCapability() <em>Realized Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedCapability()
	 * @generated
	 * @ordered
	 */
	protected AbstractCapability realizedCapability;
	/**
	 * The cached value of the '{@link #getRealizingCapability() <em>Realizing Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingCapability()
	 * @generated
	 * @ordered
	 */
	protected AbstractCapability realizingCapability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCapabilityRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.ABSTRACT_CAPABILITY_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCapability getRealizedCapability() {
		if (realizedCapability != null && realizedCapability.eIsProxy()) {
			InternalEObject oldRealizedCapability = (InternalEObject)realizedCapability;
			realizedCapability = (AbstractCapability)eResolveProxy(oldRealizedCapability);
			if (realizedCapability != oldRealizedCapability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZED_CAPABILITY, oldRealizedCapability, realizedCapability));
			}
		}
		return realizedCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability basicGetRealizedCapability() {
		return realizedCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizedCapability(AbstractCapability newRealizedCapability, NotificationChain msgs) {
		AbstractCapability oldRealizedCapability = realizedCapability;
		realizedCapability = newRealizedCapability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZED_CAPABILITY, oldRealizedCapability, newRealizedCapability);
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
	public AbstractCapability getRealizingCapability() {
		if (realizingCapability != null && realizingCapability.eIsProxy()) {
			InternalEObject oldRealizingCapability = (InternalEObject)realizingCapability;
			realizingCapability = (AbstractCapability)eResolveProxy(oldRealizingCapability);
			if (realizingCapability != oldRealizingCapability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZING_CAPABILITY, oldRealizingCapability, realizingCapability));
			}
		}
		return realizingCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability basicGetRealizingCapability() {
		return realizingCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizingCapability(AbstractCapability newRealizingCapability, NotificationChain msgs) {
		AbstractCapability oldRealizingCapability = realizingCapability;
		realizingCapability = newRealizingCapability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZING_CAPABILITY, oldRealizingCapability, newRealizingCapability);
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
			case InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZED_CAPABILITY:
				if (realizedCapability != null)
					msgs = ((InternalEObject)realizedCapability).eInverseRemove(this, InteractionPackage.ABSTRACT_CAPABILITY__INCOMING_CAPABILITY_ALLOCATION, AbstractCapability.class, msgs);
				return basicSetRealizedCapability((AbstractCapability)otherEnd, msgs);
			case InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZING_CAPABILITY:
				if (realizingCapability != null)
					msgs = ((InternalEObject)realizingCapability).eInverseRemove(this, InteractionPackage.ABSTRACT_CAPABILITY__OUTGOING_CAPABILITY_ALLOCATION, AbstractCapability.class, msgs);
				return basicSetRealizingCapability((AbstractCapability)otherEnd, msgs);
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
			case InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZED_CAPABILITY:
				return basicSetRealizedCapability(null, msgs);
			case InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZING_CAPABILITY:
				return basicSetRealizingCapability(null, msgs);
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
			case InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZED_CAPABILITY:
				if (resolve) return getRealizedCapability();
				return basicGetRealizedCapability();
			case InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZING_CAPABILITY:
				if (resolve) return getRealizingCapability();
				return basicGetRealizingCapability();
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
			case InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZED_CAPABILITY:
				return realizedCapability != null;
			case InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZING_CAPABILITY:
				return realizingCapability != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractCapabilityRealizationImpl
