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
package org.polarsys.capella.core.data.capellacore.impl;

import java.util.Collection;

import modellingcore.AbstractTrace;
import modellingcore.ModellingcorePackage;
import modellingcore.PublishableElement;
import modellingcore.TraceableElement;

import modellingcore.impl.AbstractTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacommon.GenericTrace;

import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyType;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.capellacore.Namespace;
import org.polarsys.capella.core.data.capellacore.NamingRule;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.data.capellacore.Trace;
import org.polarsys.capella.core.data.capellacore.Type;
import org.polarsys.capella.core.data.capellacore.TypedElement;

import org.polarsys.capella.core.data.requirement.Requirement;
import org.polarsys.capella.core.data.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getIncomingTraces <em>Incoming Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getOutgoingTraces <em>Outgoing Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#isVisibleInDoc <em>Visible In Doc</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#isVisibleInLM <em>Visible In LM</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getAppliedRequirements <em>Applied Requirements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellacore.impl.TypeImpl#getTypedElements <em>Typed Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypeImpl extends AbstractTypeImpl implements Type {
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
	 * The cached value of the '{@link #getOwnedTraces() <em>Owned Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> ownedTraces;

	/**
	 * The cached value of the '{@link #getContainedGenericTraces() <em>Contained Generic Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedGenericTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericTrace> containedGenericTraces;

	/**
	 * The cached value of the '{@link #getContainedRequirementsTraces() <em>Contained Requirements Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedRequirementsTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsTrace> containedRequirementsTraces;

	/**
	 * The cached value of the '{@link #getNamingRules() <em>Naming Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamingRules()
	 * @generated
	 * @ordered
	 */
	protected EList<NamingRule> namingRules;

	/**
	 * The cached value of the '{@link #getTypedElements() <em>Typed Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedElement> typedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacorePackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTrace> getIncomingTraces() {
		if (incomingTraces == null) {
			incomingTraces = new EObjectResolvingEList<AbstractTrace>(AbstractTrace.class, this, CapellacorePackage.TYPE__INCOMING_TRACES);
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
			outgoingTraces = new EObjectResolvingEList<AbstractTrace>(AbstractTrace.class, this, CapellacorePackage.TYPE__OUTGOING_TRACES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacorePackage.TYPE__VISIBLE_IN_DOC, oldVisibleInDoc, visibleInDoc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacorePackage.TYPE__VISIBLE_IN_LM, oldVisibleInLM, visibleInLM));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacorePackage.TYPE__SUMMARY, oldSummary, summary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacorePackage.TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacorePackage.TYPE__REVIEW, oldReview, review));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractPropertyValue> getOwnedPropertyValues() {
		if (ownedPropertyValues == null) {
			ownedPropertyValues = new EObjectContainmentEList.Resolving<AbstractPropertyValue>(AbstractPropertyValue.class, this, CapellacorePackage.TYPE__OWNED_PROPERTY_VALUES);
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
			ownedEnumerationPropertyTypes = new EObjectContainmentEList.Resolving<EnumerationPropertyType>(EnumerationPropertyType.class, this, CapellacorePackage.TYPE__OWNED_ENUMERATION_PROPERTY_TYPES);
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
			appliedPropertyValues = new EObjectResolvingEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUES);
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
			ownedPropertyValueGroups = new EObjectContainmentEList.Resolving<PropertyValueGroup>(PropertyValueGroup.class, this, CapellacorePackage.TYPE__OWNED_PROPERTY_VALUE_GROUPS);
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
			appliedPropertyValueGroups = new EObjectResolvingEList<PropertyValueGroup>(PropertyValueGroup.class, this, CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUE_GROUPS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacorePackage.TYPE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacorePackage.TYPE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumerationPropertyLiteral> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<EnumerationPropertyLiteral>(EnumerationPropertyLiteral.class, this, CapellacorePackage.TYPE__FEATURES);
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
			appliedRequirements = new EObjectResolvingEList<Requirement>(Requirement.class, this, CapellacorePackage.TYPE__APPLIED_REQUIREMENTS);
		}
		return appliedRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, CapellacorePackage.TYPE__OWNED_TRACES);
		}
		return ownedTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GenericTrace> getContainedGenericTraces() {
		if (containedGenericTraces == null) {
			containedGenericTraces = new EObjectResolvingEList<GenericTrace>(GenericTrace.class, this, CapellacorePackage.TYPE__CONTAINED_GENERIC_TRACES);
		}
		return containedGenericTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementsTrace> getContainedRequirementsTraces() {
		if (containedRequirementsTraces == null) {
			containedRequirementsTraces = new EObjectResolvingEList<RequirementsTrace>(RequirementsTrace.class, this, CapellacorePackage.TYPE__CONTAINED_REQUIREMENTS_TRACES);
		}
		return containedRequirementsTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamingRule> getNamingRules() {
		if (namingRules == null) {
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, CapellacorePackage.TYPE__NAMING_RULES);
		}
		return namingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypedElement> getTypedElements() {
		if (typedElements == null) {
			typedElements = new EObjectResolvingEList<TypedElement>(TypedElement.class, this, CapellacorePackage.TYPE__TYPED_ELEMENTS);
		}
		return typedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellacorePackage.TYPE__OWNED_PROPERTY_VALUES:
				return ((InternalEList<?>)getOwnedPropertyValues()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.TYPE__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ((InternalEList<?>)getOwnedEnumerationPropertyTypes()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.TYPE__OWNED_PROPERTY_VALUE_GROUPS:
				return ((InternalEList<?>)getOwnedPropertyValueGroups()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.TYPE__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.TYPE__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
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
			case CapellacorePackage.TYPE__INCOMING_TRACES:
				return getIncomingTraces();
			case CapellacorePackage.TYPE__OUTGOING_TRACES:
				return getOutgoingTraces();
			case CapellacorePackage.TYPE__VISIBLE_IN_DOC:
				return isVisibleInDoc();
			case CapellacorePackage.TYPE__VISIBLE_IN_LM:
				return isVisibleInLM();
			case CapellacorePackage.TYPE__SUMMARY:
				return getSummary();
			case CapellacorePackage.TYPE__DESCRIPTION:
				return getDescription();
			case CapellacorePackage.TYPE__REVIEW:
				return getReview();
			case CapellacorePackage.TYPE__OWNED_PROPERTY_VALUES:
				return getOwnedPropertyValues();
			case CapellacorePackage.TYPE__OWNED_ENUMERATION_PROPERTY_TYPES:
				return getOwnedEnumerationPropertyTypes();
			case CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUES:
				return getAppliedPropertyValues();
			case CapellacorePackage.TYPE__OWNED_PROPERTY_VALUE_GROUPS:
				return getOwnedPropertyValueGroups();
			case CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUE_GROUPS:
				return getAppliedPropertyValueGroups();
			case CapellacorePackage.TYPE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case CapellacorePackage.TYPE__FEATURES:
				return getFeatures();
			case CapellacorePackage.TYPE__APPLIED_REQUIREMENTS:
				return getAppliedRequirements();
			case CapellacorePackage.TYPE__OWNED_TRACES:
				return getOwnedTraces();
			case CapellacorePackage.TYPE__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case CapellacorePackage.TYPE__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case CapellacorePackage.TYPE__NAMING_RULES:
				return getNamingRules();
			case CapellacorePackage.TYPE__TYPED_ELEMENTS:
				return getTypedElements();
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
			case CapellacorePackage.TYPE__VISIBLE_IN_DOC:
				setVisibleInDoc((Boolean)newValue);
				return;
			case CapellacorePackage.TYPE__VISIBLE_IN_LM:
				setVisibleInLM((Boolean)newValue);
				return;
			case CapellacorePackage.TYPE__SUMMARY:
				setSummary((String)newValue);
				return;
			case CapellacorePackage.TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CapellacorePackage.TYPE__REVIEW:
				setReview((String)newValue);
				return;
			case CapellacorePackage.TYPE__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				getOwnedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case CapellacorePackage.TYPE__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				getOwnedEnumerationPropertyTypes().addAll((Collection<? extends EnumerationPropertyType>)newValue);
				return;
			case CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				getAppliedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case CapellacorePackage.TYPE__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				getOwnedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				getAppliedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case CapellacorePackage.TYPE__STATUS:
				setStatus((EnumerationPropertyLiteral)newValue);
				return;
			case CapellacorePackage.TYPE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends EnumerationPropertyLiteral>)newValue);
				return;
			case CapellacorePackage.TYPE__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case CapellacorePackage.TYPE__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
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
			case CapellacorePackage.TYPE__VISIBLE_IN_DOC:
				setVisibleInDoc(VISIBLE_IN_DOC_EDEFAULT);
				return;
			case CapellacorePackage.TYPE__VISIBLE_IN_LM:
				setVisibleInLM(VISIBLE_IN_LM_EDEFAULT);
				return;
			case CapellacorePackage.TYPE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case CapellacorePackage.TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CapellacorePackage.TYPE__REVIEW:
				setReview(REVIEW_EDEFAULT);
				return;
			case CapellacorePackage.TYPE__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				return;
			case CapellacorePackage.TYPE__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				return;
			case CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				return;
			case CapellacorePackage.TYPE__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				return;
			case CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				return;
			case CapellacorePackage.TYPE__STATUS:
				setStatus((EnumerationPropertyLiteral)null);
				return;
			case CapellacorePackage.TYPE__FEATURES:
				getFeatures().clear();
				return;
			case CapellacorePackage.TYPE__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case CapellacorePackage.TYPE__NAMING_RULES:
				getNamingRules().clear();
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
			case CapellacorePackage.TYPE__INCOMING_TRACES:
				return incomingTraces != null && !incomingTraces.isEmpty();
			case CapellacorePackage.TYPE__OUTGOING_TRACES:
				return outgoingTraces != null && !outgoingTraces.isEmpty();
			case CapellacorePackage.TYPE__VISIBLE_IN_DOC:
				return visibleInDoc != VISIBLE_IN_DOC_EDEFAULT;
			case CapellacorePackage.TYPE__VISIBLE_IN_LM:
				return visibleInLM != VISIBLE_IN_LM_EDEFAULT;
			case CapellacorePackage.TYPE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case CapellacorePackage.TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CapellacorePackage.TYPE__REVIEW:
				return REVIEW_EDEFAULT == null ? review != null : !REVIEW_EDEFAULT.equals(review);
			case CapellacorePackage.TYPE__OWNED_PROPERTY_VALUES:
				return ownedPropertyValues != null && !ownedPropertyValues.isEmpty();
			case CapellacorePackage.TYPE__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ownedEnumerationPropertyTypes != null && !ownedEnumerationPropertyTypes.isEmpty();
			case CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUES:
				return appliedPropertyValues != null && !appliedPropertyValues.isEmpty();
			case CapellacorePackage.TYPE__OWNED_PROPERTY_VALUE_GROUPS:
				return ownedPropertyValueGroups != null && !ownedPropertyValueGroups.isEmpty();
			case CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUE_GROUPS:
				return appliedPropertyValueGroups != null && !appliedPropertyValueGroups.isEmpty();
			case CapellacorePackage.TYPE__STATUS:
				return status != null;
			case CapellacorePackage.TYPE__FEATURES:
				return features != null && !features.isEmpty();
			case CapellacorePackage.TYPE__APPLIED_REQUIREMENTS:
				return appliedRequirements != null && !appliedRequirements.isEmpty();
			case CapellacorePackage.TYPE__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case CapellacorePackage.TYPE__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case CapellacorePackage.TYPE__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case CapellacorePackage.TYPE__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case CapellacorePackage.TYPE__TYPED_ELEMENTS:
				return typedElements != null && !typedElements.isEmpty();
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
		if (baseClass == TraceableElement.class) {
			switch (derivedFeatureID) {
				case CapellacorePackage.TYPE__INCOMING_TRACES: return ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES;
				case CapellacorePackage.TYPE__OUTGOING_TRACES: return ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES;
				default: return -1;
			}
		}
		if (baseClass == PublishableElement.class) {
			switch (derivedFeatureID) {
				case CapellacorePackage.TYPE__VISIBLE_IN_DOC: return ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC;
				case CapellacorePackage.TYPE__VISIBLE_IN_LM: return ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM;
				default: return -1;
			}
		}
		if (baseClass == CapellaElement.class) {
			switch (derivedFeatureID) {
				case CapellacorePackage.TYPE__SUMMARY: return CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;
				case CapellacorePackage.TYPE__DESCRIPTION: return CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;
				case CapellacorePackage.TYPE__REVIEW: return CapellacorePackage.CAPELLA_ELEMENT__REVIEW;
				case CapellacorePackage.TYPE__OWNED_PROPERTY_VALUES: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;
				case CapellacorePackage.TYPE__OWNED_ENUMERATION_PROPERTY_TYPES: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;
				case CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUES: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;
				case CapellacorePackage.TYPE__OWNED_PROPERTY_VALUE_GROUPS: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;
				case CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUE_GROUPS: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;
				case CapellacorePackage.TYPE__STATUS: return CapellacorePackage.CAPELLA_ELEMENT__STATUS;
				case CapellacorePackage.TYPE__FEATURES: return CapellacorePackage.CAPELLA_ELEMENT__FEATURES;
				case CapellacorePackage.TYPE__APPLIED_REQUIREMENTS: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case CapellacorePackage.TYPE__OWNED_TRACES: return CapellacorePackage.NAMESPACE__OWNED_TRACES;
				case CapellacorePackage.TYPE__CONTAINED_GENERIC_TRACES: return CapellacorePackage.NAMESPACE__CONTAINED_GENERIC_TRACES;
				case CapellacorePackage.TYPE__CONTAINED_REQUIREMENTS_TRACES: return CapellacorePackage.NAMESPACE__CONTAINED_REQUIREMENTS_TRACES;
				case CapellacorePackage.TYPE__NAMING_RULES: return CapellacorePackage.NAMESPACE__NAMING_RULES;
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
		if (baseClass == TraceableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES: return CapellacorePackage.TYPE__INCOMING_TRACES;
				case ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES: return CapellacorePackage.TYPE__OUTGOING_TRACES;
				default: return -1;
			}
		}
		if (baseClass == PublishableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC: return CapellacorePackage.TYPE__VISIBLE_IN_DOC;
				case ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM: return CapellacorePackage.TYPE__VISIBLE_IN_LM;
				default: return -1;
			}
		}
		if (baseClass == CapellaElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.CAPELLA_ELEMENT__SUMMARY: return CapellacorePackage.TYPE__SUMMARY;
				case CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION: return CapellacorePackage.TYPE__DESCRIPTION;
				case CapellacorePackage.CAPELLA_ELEMENT__REVIEW: return CapellacorePackage.TYPE__REVIEW;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES: return CapellacorePackage.TYPE__OWNED_PROPERTY_VALUES;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES: return CapellacorePackage.TYPE__OWNED_ENUMERATION_PROPERTY_TYPES;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES: return CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUES;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS: return CapellacorePackage.TYPE__OWNED_PROPERTY_VALUE_GROUPS;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS: return CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUE_GROUPS;
				case CapellacorePackage.CAPELLA_ELEMENT__STATUS: return CapellacorePackage.TYPE__STATUS;
				case CapellacorePackage.CAPELLA_ELEMENT__FEATURES: return CapellacorePackage.TYPE__FEATURES;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS: return CapellacorePackage.TYPE__APPLIED_REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.NAMESPACE__OWNED_TRACES: return CapellacorePackage.TYPE__OWNED_TRACES;
				case CapellacorePackage.NAMESPACE__CONTAINED_GENERIC_TRACES: return CapellacorePackage.TYPE__CONTAINED_GENERIC_TRACES;
				case CapellacorePackage.NAMESPACE__CONTAINED_REQUIREMENTS_TRACES: return CapellacorePackage.TYPE__CONTAINED_REQUIREMENTS_TRACES;
				case CapellacorePackage.NAMESPACE__NAMING_RULES: return CapellacorePackage.TYPE__NAMING_RULES;
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

} //TypeImpl
