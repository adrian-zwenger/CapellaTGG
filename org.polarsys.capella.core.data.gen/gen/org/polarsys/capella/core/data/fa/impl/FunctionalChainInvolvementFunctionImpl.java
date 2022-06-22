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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.FunctionalChainInvolvementFunction;
import org.polarsys.capella.core.data.fa.FunctionalChainInvolvementLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Chain Involvement Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalChainInvolvementFunctionImpl#getOutgoingInvolvementLinks <em>Outgoing Involvement Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionalChainInvolvementFunctionImpl#getIncomingInvolvementLinks <em>Incoming Involvement Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalChainInvolvementFunctionImpl extends FunctionalChainInvolvementImpl implements FunctionalChainInvolvementFunction {
	/**
	 * The cached value of the '{@link #getOutgoingInvolvementLinks() <em>Outgoing Involvement Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingInvolvementLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalChainInvolvementLink> outgoingInvolvementLinks;
	/**
	 * The cached value of the '{@link #getIncomingInvolvementLinks() <em>Incoming Involvement Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingInvolvementLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalChainInvolvementLink> incomingInvolvementLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalChainInvolvementFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTIONAL_CHAIN_INVOLVEMENT_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalChainInvolvementLink> getOutgoingInvolvementLinks() {
		if (outgoingInvolvementLinks == null) {
			outgoingInvolvementLinks = new EObjectResolvingEList<FunctionalChainInvolvementLink>(FunctionalChainInvolvementLink.class, this, FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT_FUNCTION__OUTGOING_INVOLVEMENT_LINKS);
		}
		return outgoingInvolvementLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalChainInvolvementLink> getIncomingInvolvementLinks() {
		if (incomingInvolvementLinks == null) {
			incomingInvolvementLinks = new EObjectResolvingEList<FunctionalChainInvolvementLink>(FunctionalChainInvolvementLink.class, this, FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT_FUNCTION__INCOMING_INVOLVEMENT_LINKS);
		}
		return incomingInvolvementLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT_FUNCTION__OUTGOING_INVOLVEMENT_LINKS:
				return getOutgoingInvolvementLinks();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT_FUNCTION__INCOMING_INVOLVEMENT_LINKS:
				return getIncomingInvolvementLinks();
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
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT_FUNCTION__OUTGOING_INVOLVEMENT_LINKS:
				return outgoingInvolvementLinks != null && !outgoingInvolvementLinks.isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT_FUNCTION__INCOMING_INVOLVEMENT_LINKS:
				return incomingInvolvementLinks != null && !incomingInvolvementLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalChainInvolvementFunctionImpl
