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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.core.data.fa.impl.FunctionalChainImpl;

import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.oa.OperationalCapability;
import org.polarsys.capella.core.data.oa.OperationalProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalProcessImpl#getInvolvingOperationalCapabilities <em>Involving Operational Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalProcessImpl extends FunctionalChainImpl implements OperationalProcess {
	/**
	 * The cached value of the '{@link #getInvolvingOperationalCapabilities() <em>Involving Operational Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvingOperationalCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalCapability> involvingOperationalCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.OPERATIONAL_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalCapability> getInvolvingOperationalCapabilities() {
		if (involvingOperationalCapabilities == null) {
			involvingOperationalCapabilities = new EObjectResolvingEList<OperationalCapability>(OperationalCapability.class, this, OaPackage.OPERATIONAL_PROCESS__INVOLVING_OPERATIONAL_CAPABILITIES);
		}
		return involvingOperationalCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OaPackage.OPERATIONAL_PROCESS__INVOLVING_OPERATIONAL_CAPABILITIES:
				return getInvolvingOperationalCapabilities();
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
			case OaPackage.OPERATIONAL_PROCESS__INVOLVING_OPERATIONAL_CAPABILITIES:
				return involvingOperationalCapabilities != null && !involvingOperationalCapabilities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalProcessImpl
