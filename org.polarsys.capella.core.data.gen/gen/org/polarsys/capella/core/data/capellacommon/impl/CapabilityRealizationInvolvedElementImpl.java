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
package org.polarsys.capella.core.data.capellacommon.impl;

import java.util.Collection;

import modellingcore.AbstractTrace;
import modellingcore.ModellingcorePackage;
import modellingcore.PublishableElement;

import modellingcore.impl.ModelElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvedElement;
import org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvement;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;

import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyType;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;

import org.polarsys.capella.core.data.la.CapabilityRealization;

import org.polarsys.capella.core.data.requirement.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Realization Involved Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getIncomingTraces <em>Incoming Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getOutgoingTraces <em>Outgoing Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#isVisibleInDoc <em>Visible In Doc</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#isVisibleInLM <em>Visible In LM</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getAppliedRequirements <em>Applied Requirements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getCapabilityRealizationInvolvements <em>Capability Realization Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacommon.impl.CapabilityRealizationInvolvedElementImpl#getInvolvingCapabilityRealizations <em>Involving Capability Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CapabilityRealizationInvolvedElementImpl extends ModelElementImpl implements CapabilityRealizationInvolvedElement {
	/**
	 * The cached value of the '{@link #getIncomingTraces() <em>Incoming Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTrace> incomingTraces;

	/**
	 * The cached value of the '{@link #getOutgoingTraces() <em>Outgoing Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTrace> outgoingTraces;

	/**
	 * The default value of the '{@link #isVisibleInDoc() <em>Visible In Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInDoc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_IN_DOC_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisibleInDoc() <em>Visible In Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInDoc()
	 * @generated
	 * @ordered
	 */
	protected boolean visibleInDoc = VISIBLE_IN_DOC_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisibleInLM() <em>Visible In LM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInLM()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_IN_LM_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisibleInLM() <em>Visible In LM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInLM()
	 * @generated
	 * @ordered
	 */
	protected boolean visibleInLM = VISIBLE_IN_LM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReview() <em>Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected static final String REVIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReview() <em>Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected String review = REVIEW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValues() <em>Owned Property Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPropertyValue> ownedPropertyValues;

	/**
	 * The cached value of the '{@link #getOwnedEnumerationPropertyTypes() <em>Owned Enumeration Property Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnumerationPropertyTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationPropertyType> ownedEnumerationPropertyTypes;

	/**
	 * The cached value of the '{@link #getAppliedPropertyValues() <em>Applied Property Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPropertyValue> appliedPropertyValues;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValueGroups() <em>Owned Property Value Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValueGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValueGroup> ownedPropertyValueGroups;

	/**
	 * The cached value of the '{@link #getAppliedPropertyValueGroups() <em>Applied Property Value Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedPropertyValueGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValueGroup> appliedPropertyValueGroups;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EnumerationPropertyLiteral status;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationPropertyLiteral> features;

	/**
	 * The cached value of the '{@link #getAppliedRequirements() <em>Applied Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> appliedRequirements;

	/**
	 * The cached value of the '{@link #getInvolvingInvolvements() <em>Involving Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvingInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<Involvement> involvingInvolvements;

	/**
	 * The cached value of the '{@link #getCapabilityRealizationInvolvements() <em>Capability Realization Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityRealizationInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityRealizationInvolvement> capabilityRealizationInvolvements;

	/**
	 * The cached value of the '{@link #getInvolvingCapabilityRealizations() <em>Involving Capability Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvingCapabilityRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityRealization> involvingCapabilityRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityRealizationInvolvedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.CAPABILITY_REALIZATION_INVOLVED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTrace> getIncomingTraces() {
		if (incomingTraces == null) {
			incomingTraces = new EObjectResolvingEList<AbstractTrace>(AbstractTrace.class, this, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INCOMING_TRACES);
		}
		return incomingTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTrace> getOutgoingTraces() {
		if (outgoingTraces == null) {
			outgoingTraces = new EObjectResolvingEList<AbstractTrace>(AbstractTrace.class, this, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OUTGOING_TRACES);
		}
		return outgoingTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVisibleInDoc() {
		return visibleInDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibleInDoc(boolean newVisibleInDoc) {
		boolean oldVisibleInDoc = visibleInDoc;
		visibleInDoc = newVisibleInDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__VISIBLE_IN_DOC, oldVisibleInDoc, visibleInDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVisibleInLM() {
		return visibleInLM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibleInLM(boolean newVisibleInLM) {
		boolean oldVisibleInLM = visibleInLM;
		visibleInLM = newVisibleInLM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__VISIBLE_IN_LM, oldVisibleInLM, visibleInLM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReview() {
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReview(String newReview) {
		String oldReview = review;
		review = newReview;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__REVIEW, oldReview, review));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractPropertyValue> getOwnedPropertyValues() {
		if (ownedPropertyValues == null) {
			ownedPropertyValues = new EObjectContainmentEList.Resolving<AbstractPropertyValue>(AbstractPropertyValue.class, this, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_PROPERTY_VALUES);
		}
		return ownedPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumerationPropertyType> getOwnedEnumerationPropertyTypes() {
		if (ownedEnumerationPropertyTypes == null) {
			ownedEnumerationPropertyTypes = new EObjectContainmentEList.Resolving<EnumerationPropertyType>(EnumerationPropertyType.class, this, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES);
		}
		return ownedEnumerationPropertyTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractPropertyValue> getAppliedPropertyValues() {
		if (appliedPropertyValues == null) {
			appliedPropertyValues = new EObjectResolvingEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__APPLIED_PROPERTY_VALUES);
		}
		return appliedPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyValueGroup> getOwnedPropertyValueGroups() {
		if (ownedPropertyValueGroups == null) {
			ownedPropertyValueGroups = new EObjectContainmentEList.Resolving<PropertyValueGroup>(PropertyValueGroup.class, this, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS);
		}
		return ownedPropertyValueGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyValueGroup> getAppliedPropertyValueGroups() {
		if (appliedPropertyValueGroups == null) {
			appliedPropertyValueGroups = new EObjectResolvingEList<PropertyValueGroup>(PropertyValueGroup.class, this, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS);
		}
		return appliedPropertyValueGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationPropertyLiteral getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (EnumerationPropertyLiteral)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationPropertyLiteral basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(EnumerationPropertyLiteral newStatus) {
		EnumerationPropertyLiteral oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumerationPropertyLiteral> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<EnumerationPropertyLiteral>(EnumerationPropertyLiteral.class, this, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getAppliedRequirements() {
		if (appliedRequirements == null) {
			appliedRequirements = new EObjectResolvingEList<Requirement>(Requirement.class, this, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__APPLIED_REQUIREMENTS);
		}
		return appliedRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Involvement> getInvolvingInvolvements() {
		if (involvingInvolvements == null) {
			involvingInvolvements = new EObjectResolvingEList<Involvement>(Involvement.class, this, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS);
		}
		return involvingInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityRealizationInvolvement> getCapabilityRealizationInvolvements() {
		if (capabilityRealizationInvolvements == null) {
			capabilityRealizationInvolvements = new EObjectResolvingEList<CapabilityRealizationInvolvement>(CapabilityRealizationInvolvement.class, this, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__CAPABILITY_REALIZATION_INVOLVEMENTS);
		}
		return capabilityRealizationInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityRealization> getInvolvingCapabilityRealizations() {
		if (involvingCapabilityRealizations == null) {
			involvingCapabilityRealizations = new EObjectResolvingEList<CapabilityRealization>(CapabilityRealization.class, this, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_CAPABILITY_REALIZATIONS);
		}
		return involvingCapabilityRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_PROPERTY_VALUES:
				return ((InternalEList<?>)getOwnedPropertyValues()).basicRemove(otherEnd, msgs);
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ((InternalEList<?>)getOwnedEnumerationPropertyTypes()).basicRemove(otherEnd, msgs);
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS:
				return ((InternalEList<?>)getOwnedPropertyValueGroups()).basicRemove(otherEnd, msgs);
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
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INCOMING_TRACES:
				return getIncomingTraces();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OUTGOING_TRACES:
				return getOutgoingTraces();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__VISIBLE_IN_DOC:
				return isVisibleInDoc();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__VISIBLE_IN_LM:
				return isVisibleInLM();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__SUMMARY:
				return getSummary();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__DESCRIPTION:
				return getDescription();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__REVIEW:
				return getReview();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_PROPERTY_VALUES:
				return getOwnedPropertyValues();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
				return getOwnedEnumerationPropertyTypes();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__APPLIED_PROPERTY_VALUES:
				return getAppliedPropertyValues();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS:
				return getOwnedPropertyValueGroups();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
				return getAppliedPropertyValueGroups();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__FEATURES:
				return getFeatures();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__APPLIED_REQUIREMENTS:
				return getAppliedRequirements();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__CAPABILITY_REALIZATION_INVOLVEMENTS:
				return getCapabilityRealizationInvolvements();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_CAPABILITY_REALIZATIONS:
				return getInvolvingCapabilityRealizations();
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
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__VISIBLE_IN_DOC:
				setVisibleInDoc((Boolean)newValue);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__VISIBLE_IN_LM:
				setVisibleInLM((Boolean)newValue);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__SUMMARY:
				setSummary((String)newValue);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__REVIEW:
				setReview((String)newValue);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				getOwnedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				getOwnedEnumerationPropertyTypes().addAll((Collection<? extends EnumerationPropertyType>)newValue);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				getAppliedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				getOwnedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				getAppliedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__STATUS:
				setStatus((EnumerationPropertyLiteral)newValue);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends EnumerationPropertyLiteral>)newValue);
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
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__VISIBLE_IN_DOC:
				setVisibleInDoc(VISIBLE_IN_DOC_EDEFAULT);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__VISIBLE_IN_LM:
				setVisibleInLM(VISIBLE_IN_LM_EDEFAULT);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__REVIEW:
				setReview(REVIEW_EDEFAULT);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__STATUS:
				setStatus((EnumerationPropertyLiteral)null);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__FEATURES:
				getFeatures().clear();
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
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INCOMING_TRACES:
				return incomingTraces != null && !incomingTraces.isEmpty();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OUTGOING_TRACES:
				return outgoingTraces != null && !outgoingTraces.isEmpty();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__VISIBLE_IN_DOC:
				return visibleInDoc != VISIBLE_IN_DOC_EDEFAULT;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__VISIBLE_IN_LM:
				return visibleInLM != VISIBLE_IN_LM_EDEFAULT;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__REVIEW:
				return REVIEW_EDEFAULT == null ? review != null : !REVIEW_EDEFAULT.equals(review);
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_PROPERTY_VALUES:
				return ownedPropertyValues != null && !ownedPropertyValues.isEmpty();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ownedEnumerationPropertyTypes != null && !ownedEnumerationPropertyTypes.isEmpty();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__APPLIED_PROPERTY_VALUES:
				return appliedPropertyValues != null && !appliedPropertyValues.isEmpty();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS:
				return ownedPropertyValueGroups != null && !ownedPropertyValueGroups.isEmpty();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
				return appliedPropertyValueGroups != null && !appliedPropertyValueGroups.isEmpty();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__STATUS:
				return status != null;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__FEATURES:
				return features != null && !features.isEmpty();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__APPLIED_REQUIREMENTS:
				return appliedRequirements != null && !appliedRequirements.isEmpty();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS:
				return involvingInvolvements != null && !involvingInvolvements.isEmpty();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__CAPABILITY_REALIZATION_INVOLVEMENTS:
				return capabilityRealizationInvolvements != null && !capabilityRealizationInvolvements.isEmpty();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_CAPABILITY_REALIZATIONS:
				return involvingCapabilityRealizations != null && !involvingCapabilityRealizations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PublishableElement.class) {
			switch (derivedFeatureID) {
				case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__VISIBLE_IN_DOC: return ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC;
				case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__VISIBLE_IN_LM: return ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PublishableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC: return CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__VISIBLE_IN_DOC;
				case ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM: return CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__VISIBLE_IN_LM;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (visibleInDoc: "); //$NON-NLS-1$
		result.append(visibleInDoc);
		result.append(", visibleInLM: "); //$NON-NLS-1$
		result.append(visibleInLM);
		result.append(", summary: "); //$NON-NLS-1$
		result.append(summary);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", review: "); //$NON-NLS-1$
		result.append(review);
		result.append(')');
		return result.toString();
	}

} //CapabilityRealizationInvolvedElementImpl
