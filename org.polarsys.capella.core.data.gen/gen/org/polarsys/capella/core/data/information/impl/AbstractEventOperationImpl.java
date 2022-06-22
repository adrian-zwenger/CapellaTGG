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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.information.AbstractEventOperation;
import org.polarsys.capella.core.data.information.InformationPackage;

import org.polarsys.capella.core.data.interaction.SequenceMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Event Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.AbstractEventOperationImpl#getInvokingSequenceMessages <em>Invoking Sequence Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractEventOperationImpl extends NamedElementImpl implements AbstractEventOperation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractEventOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.ABSTRACT_EVENT_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SequenceMessage> getInvokingSequenceMessages() {
		if (invokingSequenceMessages == null) {
			invokingSequenceMessages = new EObjectResolvingEList<SequenceMessage>(SequenceMessage.class, this, InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES);
		}
		return invokingSequenceMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES:
				return getInvokingSequenceMessages();
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
			case InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES:
				return invokingSequenceMessages != null && !invokingSequenceMessages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractEventOperationImpl
