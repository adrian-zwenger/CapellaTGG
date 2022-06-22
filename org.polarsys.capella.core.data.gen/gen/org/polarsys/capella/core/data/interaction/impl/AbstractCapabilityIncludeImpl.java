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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.impl.RelationshipImpl;

import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityInclude;
import org.polarsys.capella.core.data.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Capability Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.AbstractCapabilityIncludeImpl#getIncluded <em>Included</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.AbstractCapabilityIncludeImpl#getInclusion <em>Inclusion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractCapabilityIncludeImpl extends RelationshipImpl implements AbstractCapabilityInclude {
	/**
	 * The cached value of the '{@link #getIncluded() <em>Included</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncluded()
	 * @generated
	 * @ordered
	 */
	protected AbstractCapability included;

	/**
	 * The cached value of the '{@link #getInclusion() <em>Inclusion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusion()
	 * @generated
	 * @ordered
	 */
	protected AbstractCapability inclusion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCapabilityIncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.ABSTRACT_CAPABILITY_INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCapability getIncluded() {
		if (included != null && included.eIsProxy()) {
			InternalEObject oldIncluded = (InternalEObject)included;
			included = (AbstractCapability)eResolveProxy(oldIncluded);
			if (included != oldIncluded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUDED, oldIncluded, included));
			}
		}
		return included;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability basicGetIncluded() {
		return included;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncluded(AbstractCapability newIncluded) {
		AbstractCapability oldIncluded = included;
		included = newIncluded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUDED, oldIncluded, included));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCapability getInclusion() {
		if (inclusion != null && inclusion.eIsProxy()) {
			InternalEObject oldInclusion = (InternalEObject)inclusion;
			inclusion = (AbstractCapability)eResolveProxy(oldInclusion);
			if (inclusion != oldInclusion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUSION, oldInclusion, inclusion));
			}
		}
		return inclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability basicGetInclusion() {
		return inclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUDED:
				if (resolve) return getIncluded();
				return basicGetIncluded();
			case InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUSION:
				if (resolve) return getInclusion();
				return basicGetInclusion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUDED:
				setIncluded((AbstractCapability)newValue);
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
			case InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUDED:
				setIncluded((AbstractCapability)null);
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
			case InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUDED:
				return included != null;
			case InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUSION:
				return inclusion != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractCapabilityIncludeImpl
