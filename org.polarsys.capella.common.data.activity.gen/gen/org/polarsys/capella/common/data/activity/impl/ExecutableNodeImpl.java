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
package org.polarsys.capella.common.data.activity.impl;

import java.util.Collection;

import modellingcore.impl.AbstractNamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.common.data.activity.ActivityEdge;
import org.polarsys.capella.common.data.activity.ActivityPackage;
import org.polarsys.capella.common.data.activity.ActivityPartition;
import org.polarsys.capella.common.data.activity.ExceptionHandler;
import org.polarsys.capella.common.data.activity.ExecutableNode;
import org.polarsys.capella.common.data.activity.InterruptibleActivityRegion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.common.data.activity.impl.ExecutableNodeImpl#getInActivityPartition <em>In Activity Partition</em>}</li>
 *   <li>{@link org.polarsys.capella.common.data.activity.impl.ExecutableNodeImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link org.polarsys.capella.common.data.activity.impl.ExecutableNodeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.polarsys.capella.common.data.activity.impl.ExecutableNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.polarsys.capella.common.data.activity.impl.ExecutableNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.polarsys.capella.common.data.activity.impl.ExecutableNodeImpl#getOwnedHandlers <em>Owned Handlers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExecutableNodeImpl extends AbstractNamedElementImpl implements ExecutableNode {
	/**
	 * The cached value of the '{@link #getInActivityPartition() <em>In Activity Partition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInActivityPartition()
	 * @generated
	 * @ordered
	 */
	protected ActivityPartition inActivityPartition;
	/**
	 * The cached value of the '{@link #getInInterruptibleRegion() <em>In Interruptible Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInInterruptibleRegion()
	 * @generated
	 * @ordered
	 */
	protected InterruptibleActivityRegion inInterruptibleRegion;
	/**
	 * The cached value of the '{@link #getInStructuredNode() <em>In Structured Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInStructuredNode()
	 * @generated
	 * @ordered
	 */
	protected InterruptibleActivityRegion inStructuredNode;
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> outgoing;
	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> incoming;
	/**
	 * The cached value of the '{@link #getOwnedHandlers() <em>Owned Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionHandler> ownedHandlers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.EXECUTABLE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityPartition getInActivityPartition() {
		if (inActivityPartition != null && inActivityPartition.eIsProxy()) {
			InternalEObject oldInActivityPartition = (InternalEObject)inActivityPartition;
			inActivityPartition = (ActivityPartition)eResolveProxy(oldInActivityPartition);
			if (inActivityPartition != oldInActivityPartition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.EXECUTABLE_NODE__IN_ACTIVITY_PARTITION, oldInActivityPartition, inActivityPartition));
			}
		}
		return inActivityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition basicGetInActivityPartition() {
		return inActivityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterruptibleActivityRegion getInInterruptibleRegion() {
		if (inInterruptibleRegion != null && inInterruptibleRegion.eIsProxy()) {
			InternalEObject oldInInterruptibleRegion = (InternalEObject)inInterruptibleRegion;
			inInterruptibleRegion = (InterruptibleActivityRegion)eResolveProxy(oldInInterruptibleRegion);
			if (inInterruptibleRegion != oldInInterruptibleRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION, oldInInterruptibleRegion, inInterruptibleRegion));
			}
		}
		return inInterruptibleRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion basicGetInInterruptibleRegion() {
		return inInterruptibleRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterruptibleActivityRegion getInStructuredNode() {
		if (inStructuredNode != null && inStructuredNode.eIsProxy()) {
			InternalEObject oldInStructuredNode = (InternalEObject)inStructuredNode;
			inStructuredNode = (InterruptibleActivityRegion)eResolveProxy(oldInStructuredNode);
			if (inStructuredNode != oldInStructuredNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.EXECUTABLE_NODE__IN_STRUCTURED_NODE, oldInStructuredNode, inStructuredNode));
			}
		}
		return inStructuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion basicGetInStructuredNode() {
		return inStructuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityEdge> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, ActivityPackage.EXECUTABLE_NODE__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityEdge> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, ActivityPackage.EXECUTABLE_NODE__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExceptionHandler> getOwnedHandlers() {
		if (ownedHandlers == null) {
			ownedHandlers = new EObjectContainmentWithInverseEList.Resolving<ExceptionHandler>(ExceptionHandler.class, this, ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS, ActivityPackage.EXCEPTION_HANDLER__PROTECTED_NODE);
		}
		return ownedHandlers;
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
			case ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedHandlers()).basicAdd(otherEnd, msgs);
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
			case ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS:
				return ((InternalEList<?>)getOwnedHandlers()).basicRemove(otherEnd, msgs);
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
			case ActivityPackage.EXECUTABLE_NODE__IN_ACTIVITY_PARTITION:
				if (resolve) return getInActivityPartition();
				return basicGetInActivityPartition();
			case ActivityPackage.EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION:
				if (resolve) return getInInterruptibleRegion();
				return basicGetInInterruptibleRegion();
			case ActivityPackage.EXECUTABLE_NODE__IN_STRUCTURED_NODE:
				if (resolve) return getInStructuredNode();
				return basicGetInStructuredNode();
			case ActivityPackage.EXECUTABLE_NODE__OUTGOING:
				return getOutgoing();
			case ActivityPackage.EXECUTABLE_NODE__INCOMING:
				return getIncoming();
			case ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS:
				return getOwnedHandlers();
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
			case ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS:
				getOwnedHandlers().clear();
				getOwnedHandlers().addAll((Collection<? extends ExceptionHandler>)newValue);
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
			case ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS:
				getOwnedHandlers().clear();
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
			case ActivityPackage.EXECUTABLE_NODE__IN_ACTIVITY_PARTITION:
				return inActivityPartition != null;
			case ActivityPackage.EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null;
			case ActivityPackage.EXECUTABLE_NODE__IN_STRUCTURED_NODE:
				return inStructuredNode != null;
			case ActivityPackage.EXECUTABLE_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case ActivityPackage.EXECUTABLE_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS:
				return ownedHandlers != null && !ownedHandlers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExecutableNodeImpl
