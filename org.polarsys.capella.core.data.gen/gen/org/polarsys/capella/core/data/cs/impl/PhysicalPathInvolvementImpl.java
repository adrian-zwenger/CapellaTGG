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
package org.polarsys.capella.core.data.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.InvolverElement;

import org.polarsys.capella.core.data.capellacore.impl.RelationshipImpl;

import org.polarsys.capella.core.data.cs.AbstractPathInvolvedElement;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.PhysicalPathInvolvement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Path Involvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathInvolvementImpl#getInvolver <em>Involver</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathInvolvementImpl#getInvolved <em>Involved</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathInvolvementImpl#getNextInvolvements <em>Next Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathInvolvementImpl#getPreviousInvolvements <em>Previous Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathInvolvementImpl#getInvolvedElement <em>Involved Element</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PhysicalPathInvolvementImpl#getInvolvedComponent <em>Involved Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalPathInvolvementImpl extends RelationshipImpl implements PhysicalPathInvolvement {
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
	 * The cached value of the '{@link #getNextInvolvements() <em>Next Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPathInvolvement> nextInvolvements;

	/**
	 * The cached value of the '{@link #getPreviousInvolvements() <em>Previous Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPathInvolvement> previousInvolvements;

	/**
	 * The cached value of the '{@link #getInvolvedElement() <em>Involved Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedElement()
	 * @generated
	 * @ordered
	 */
	protected AbstractPathInvolvedElement involvedElement;

	/**
	 * The cached value of the '{@link #getInvolvedComponent() <em>Involved Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedComponent()
	 * @generated
	 * @ordered
	 */
	protected Component involvedComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalPathInvolvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PHYSICAL_PATH_INVOLVEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVER, oldInvolver, involver));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED, oldInvolved, involved));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED, oldInvolved, involved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalPathInvolvement> getNextInvolvements() {
		if (nextInvolvements == null) {
			nextInvolvements = new EObjectResolvingEList<PhysicalPathInvolvement>(PhysicalPathInvolvement.class, this, CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS);
		}
		return nextInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalPathInvolvement> getPreviousInvolvements() {
		if (previousInvolvements == null) {
			previousInvolvements = new EObjectResolvingEList<PhysicalPathInvolvement>(PhysicalPathInvolvement.class, this, CsPackage.PHYSICAL_PATH_INVOLVEMENT__PREVIOUS_INVOLVEMENTS);
		}
		return previousInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractPathInvolvedElement getInvolvedElement() {
		if (involvedElement != null && involvedElement.eIsProxy()) {
			InternalEObject oldInvolvedElement = (InternalEObject)involvedElement;
			involvedElement = (AbstractPathInvolvedElement)eResolveProxy(oldInvolvedElement);
			if (involvedElement != oldInvolvedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT, oldInvolvedElement, involvedElement));
			}
		}
		return involvedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPathInvolvedElement basicGetInvolvedElement() {
		return involvedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getInvolvedComponent() {
		if (involvedComponent != null && involvedComponent.eIsProxy()) {
			InternalEObject oldInvolvedComponent = (InternalEObject)involvedComponent;
			involvedComponent = (Component)eResolveProxy(oldInvolvedComponent);
			if (involvedComponent != oldInvolvedComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_COMPONENT, oldInvolvedComponent, involvedComponent));
			}
		}
		return involvedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetInvolvedComponent() {
		return involvedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVER:
				if (resolve) return getInvolver();
				return basicGetInvolver();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED:
				if (resolve) return getInvolved();
				return basicGetInvolved();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS:
				return getNextInvolvements();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__PREVIOUS_INVOLVEMENTS:
				return getPreviousInvolvements();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT:
				if (resolve) return getInvolvedElement();
				return basicGetInvolvedElement();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_COMPONENT:
				if (resolve) return getInvolvedComponent();
				return basicGetInvolvedComponent();
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
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED:
				setInvolved((InvolvedElement)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS:
				getNextInvolvements().clear();
				getNextInvolvements().addAll((Collection<? extends PhysicalPathInvolvement>)newValue);
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
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED:
				setInvolved((InvolvedElement)null);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS:
				getNextInvolvements().clear();
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
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVER:
				return involver != null;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED:
				return involved != null;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS:
				return nextInvolvements != null && !nextInvolvements.isEmpty();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__PREVIOUS_INVOLVEMENTS:
				return previousInvolvements != null && !previousInvolvements.isEmpty();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT:
				return involvedElement != null;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_COMPONENT:
				return involvedComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //PhysicalPathInvolvementImpl
