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
package org.polarsys.capella.core.data.epbs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

import org.polarsys.capella.core.data.cs.AbstractPhysicalArtifact;

import org.polarsys.capella.core.data.epbs.ConfigurationItem;
import org.polarsys.capella.core.data.epbs.EpbsPackage;
import org.polarsys.capella.core.data.epbs.PhysicalArtifactRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Artifact Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.epbs.impl.PhysicalArtifactRealizationImpl#getRealizedPhysicalArtifact <em>Realized Physical Artifact</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.epbs.impl.PhysicalArtifactRealizationImpl#getRealizingConfigurationItem <em>Realizing Configuration Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalArtifactRealizationImpl extends AllocationImpl implements PhysicalArtifactRealization {
	/**
	 * The cached value of the '{@link #getRealizedPhysicalArtifact() <em>Realized Physical Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedPhysicalArtifact()
	 * @generated
	 * @ordered
	 */
	protected AbstractPhysicalArtifact realizedPhysicalArtifact;
	/**
	 * The cached value of the '{@link #getRealizingConfigurationItem() <em>Realizing Configuration Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingConfigurationItem()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationItem realizingConfigurationItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalArtifactRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpbsPackage.Literals.PHYSICAL_ARTIFACT_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractPhysicalArtifact getRealizedPhysicalArtifact() {
		if (realizedPhysicalArtifact != null && realizedPhysicalArtifact.eIsProxy()) {
			InternalEObject oldRealizedPhysicalArtifact = (InternalEObject)realizedPhysicalArtifact;
			realizedPhysicalArtifact = (AbstractPhysicalArtifact)eResolveProxy(oldRealizedPhysicalArtifact);
			if (realizedPhysicalArtifact != oldRealizedPhysicalArtifact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EpbsPackage.PHYSICAL_ARTIFACT_REALIZATION__REALIZED_PHYSICAL_ARTIFACT, oldRealizedPhysicalArtifact, realizedPhysicalArtifact));
			}
		}
		return realizedPhysicalArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPhysicalArtifact basicGetRealizedPhysicalArtifact() {
		return realizedPhysicalArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationItem getRealizingConfigurationItem() {
		if (realizingConfigurationItem != null && realizingConfigurationItem.eIsProxy()) {
			InternalEObject oldRealizingConfigurationItem = (InternalEObject)realizingConfigurationItem;
			realizingConfigurationItem = (ConfigurationItem)eResolveProxy(oldRealizingConfigurationItem);
			if (realizingConfigurationItem != oldRealizingConfigurationItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EpbsPackage.PHYSICAL_ARTIFACT_REALIZATION__REALIZING_CONFIGURATION_ITEM, oldRealizingConfigurationItem, realizingConfigurationItem));
			}
		}
		return realizingConfigurationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationItem basicGetRealizingConfigurationItem() {
		return realizingConfigurationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EpbsPackage.PHYSICAL_ARTIFACT_REALIZATION__REALIZED_PHYSICAL_ARTIFACT:
				if (resolve) return getRealizedPhysicalArtifact();
				return basicGetRealizedPhysicalArtifact();
			case EpbsPackage.PHYSICAL_ARTIFACT_REALIZATION__REALIZING_CONFIGURATION_ITEM:
				if (resolve) return getRealizingConfigurationItem();
				return basicGetRealizingConfigurationItem();
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
			case EpbsPackage.PHYSICAL_ARTIFACT_REALIZATION__REALIZED_PHYSICAL_ARTIFACT:
				return realizedPhysicalArtifact != null;
			case EpbsPackage.PHYSICAL_ARTIFACT_REALIZATION__REALIZING_CONFIGURATION_ITEM:
				return realizingConfigurationItem != null;
		}
		return super.eIsSet(featureID);
	}

} //PhysicalArtifactRealizationImpl
