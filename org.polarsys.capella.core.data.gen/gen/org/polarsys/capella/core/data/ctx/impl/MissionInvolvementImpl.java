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
package org.polarsys.capella.core.data.ctx.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.InvolverElement;

import org.polarsys.capella.core.data.capellacore.impl.RelationshipImpl;

import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.Mission;
import org.polarsys.capella.core.data.ctx.MissionInvolvement;
import org.polarsys.capella.core.data.ctx.SystemComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Involvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionInvolvementImpl#getInvolver <em>Involver</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionInvolvementImpl#getInvolved <em>Involved</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionInvolvementImpl#getSystemComponent <em>System Component</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.ctx.impl.MissionInvolvementImpl#getMission <em>Mission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionInvolvementImpl extends RelationshipImpl implements MissionInvolvement {
	/**
	 * The cached value of the '{@link #getInvolver() <em>Involver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolver()
	 * @generated
	 * @ordered
	 */
	protected InvolverElement involver;
	/**
	 * The cached value of the '{@link #getInvolved() <em>Involved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolved()
	 * @generated
	 * @ordered
	 */
	protected InvolvedElement involved;

	/**
	 * The cached value of the '{@link #getSystemComponent() <em>System Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemComponent()
	 * @generated
	 * @ordered
	 */
	protected SystemComponent systemComponent;
	/**
	 * The cached value of the '{@link #getMission() <em>Mission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMission()
	 * @generated
	 * @ordered
	 */
	protected Mission mission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionInvolvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.MISSION_INVOLVEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvolverElement getInvolver() {
		if (involver != null && involver.eIsProxy()) {
			InternalEObject oldInvolver = (InternalEObject)involver;
			involver = (InvolverElement)eResolveProxy(oldInvolver);
			if (involver != oldInvolver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxPackage.MISSION_INVOLVEMENT__INVOLVER, oldInvolver, involver));
			}
		}
		return involver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolverElement basicGetInvolver() {
		return involver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvolvedElement getInvolved() {
		if (involved != null && involved.eIsProxy()) {
			InternalEObject oldInvolved = (InternalEObject)involved;
			involved = (InvolvedElement)eResolveProxy(oldInvolved);
			if (involved != oldInvolved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxPackage.MISSION_INVOLVEMENT__INVOLVED, oldInvolved, involved));
			}
		}
		return involved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolvedElement basicGetInvolved() {
		return involved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvolved(InvolvedElement newInvolved) {
		InvolvedElement oldInvolved = involved;
		involved = newInvolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.MISSION_INVOLVEMENT__INVOLVED, oldInvolved, involved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemComponent getSystemComponent() {
		if (systemComponent != null && systemComponent.eIsProxy()) {
			InternalEObject oldSystemComponent = (InternalEObject)systemComponent;
			systemComponent = (SystemComponent)eResolveProxy(oldSystemComponent);
			if (systemComponent != oldSystemComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxPackage.MISSION_INVOLVEMENT__SYSTEM_COMPONENT, oldSystemComponent, systemComponent));
			}
		}
		return systemComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponent basicGetSystemComponent() {
		return systemComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mission getMission() {
		if (mission != null && mission.eIsProxy()) {
			InternalEObject oldMission = (InternalEObject)mission;
			mission = (Mission)eResolveProxy(oldMission);
			if (mission != oldMission) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxPackage.MISSION_INVOLVEMENT__MISSION, oldMission, mission));
			}
		}
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission basicGetMission() {
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtxPackage.MISSION_INVOLVEMENT__INVOLVER:
				if (resolve) return getInvolver();
				return basicGetInvolver();
			case CtxPackage.MISSION_INVOLVEMENT__INVOLVED:
				if (resolve) return getInvolved();
				return basicGetInvolved();
			case CtxPackage.MISSION_INVOLVEMENT__SYSTEM_COMPONENT:
				if (resolve) return getSystemComponent();
				return basicGetSystemComponent();
			case CtxPackage.MISSION_INVOLVEMENT__MISSION:
				if (resolve) return getMission();
				return basicGetMission();
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
			case CtxPackage.MISSION_INVOLVEMENT__INVOLVED:
				setInvolved((InvolvedElement)newValue);
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
			case CtxPackage.MISSION_INVOLVEMENT__INVOLVED:
				setInvolved((InvolvedElement)null);
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
			case CtxPackage.MISSION_INVOLVEMENT__INVOLVER:
				return involver != null;
			case CtxPackage.MISSION_INVOLVEMENT__INVOLVED:
				return involved != null;
			case CtxPackage.MISSION_INVOLVEMENT__SYSTEM_COMPONENT:
				return systemComponent != null;
			case CtxPackage.MISSION_INVOLVEMENT__MISSION:
				return mission != null;
		}
		return super.eIsSet(featureID);
	}

} //MissionInvolvementImpl
