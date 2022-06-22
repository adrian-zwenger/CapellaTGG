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
package org.polarsys.capella.core.data.requirement.impl;

import java.util.Collection;

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

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamingRule;
import org.polarsys.capella.core.data.capellacore.Trace;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.requirement.Requirement;
import org.polarsys.capella.core.data.requirement.RequirementPackage;
import org.polarsys.capella.core.data.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.requirement.impl.RequirementImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.requirement.impl.RequirementImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.requirement.impl.RequirementImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.requirement.impl.RequirementImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.requirement.impl.RequirementImpl#isIsObsolete <em>Is Obsolete</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.requirement.impl.RequirementImpl#getRequirementId <em>Requirement Id</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.requirement.impl.RequirementImpl#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.requirement.impl.RequirementImpl#getVerificationMethod <em>Verification Method</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.requirement.impl.RequirementImpl#getVerificationPhase <em>Verification Phase</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.requirement.impl.RequirementImpl#getImplementationVersion <em>Implementation Version</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.requirement.impl.RequirementImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.requirement.impl.RequirementImpl#getRelatedCapellaElements <em>Related Capella Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementImpl extends NamedElementImpl implements Requirement {
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
	 * The default value of the '{@link #isIsObsolete() <em>Is Obsolete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsObsolete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OBSOLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsObsolete() <em>Is Obsolete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsObsolete()
	 * @generated
	 * @ordered
	 */
	protected boolean isObsolete = IS_OBSOLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequirementId() <em>Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIREMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequirementId() <em>Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementId()
	 * @generated
	 * @ordered
	 */
	protected String requirementId = REQUIREMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected String additionalInformation = ADDITIONAL_INFORMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerificationMethod() <em>Verification Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String VERIFICATION_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerificationMethod() <em>Verification Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationMethod()
	 * @generated
	 * @ordered
	 */
	protected String verificationMethod = VERIFICATION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerificationPhase() <em>Verification Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationPhase()
	 * @generated
	 * @ordered
	 */
	protected static final String VERIFICATION_PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerificationPhase() <em>Verification Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationPhase()
	 * @generated
	 * @ordered
	 */
	protected String verificationPhase = VERIFICATION_PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementationVersion() <em>Implementation Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationVersion() <em>Implementation Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationVersion()
	 * @generated
	 * @ordered
	 */
	protected String implementationVersion = IMPLEMENTATION_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected String feature = FEATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedCapellaElements() <em>Related Capella Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedCapellaElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CapellaElement> relatedCapellaElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, RequirementPackage.REQUIREMENT__OWNED_TRACES);
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
			containedGenericTraces = new EObjectResolvingEList<GenericTrace>(GenericTrace.class, this, RequirementPackage.REQUIREMENT__CONTAINED_GENERIC_TRACES);
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
			containedRequirementsTraces = new EObjectResolvingEList<RequirementsTrace>(RequirementsTrace.class, this, RequirementPackage.REQUIREMENT__CONTAINED_REQUIREMENTS_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, RequirementPackage.REQUIREMENT__NAMING_RULES);
		}
		return namingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsObsolete() {
		return isObsolete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsObsolete(boolean newIsObsolete) {
		boolean oldIsObsolete = isObsolete;
		isObsolete = newIsObsolete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__IS_OBSOLETE, oldIsObsolete, isObsolete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequirementId() {
		return requirementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementId(String newRequirementId) {
		String oldRequirementId = requirementId;
		requirementId = newRequirementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__REQUIREMENT_ID, oldRequirementId, requirementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalInformation() {
		return additionalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalInformation(String newAdditionalInformation) {
		String oldAdditionalInformation = additionalInformation;
		additionalInformation = newAdditionalInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__ADDITIONAL_INFORMATION, oldAdditionalInformation, additionalInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerificationMethod() {
		return verificationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerificationMethod(String newVerificationMethod) {
		String oldVerificationMethod = verificationMethod;
		verificationMethod = newVerificationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__VERIFICATION_METHOD, oldVerificationMethod, verificationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerificationPhase() {
		return verificationPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerificationPhase(String newVerificationPhase) {
		String oldVerificationPhase = verificationPhase;
		verificationPhase = newVerificationPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__VERIFICATION_PHASE, oldVerificationPhase, verificationPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplementationVersion() {
		return implementationVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementationVersion(String newImplementationVersion) {
		String oldImplementationVersion = implementationVersion;
		implementationVersion = newImplementationVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__IMPLEMENTATION_VERSION, oldImplementationVersion, implementationVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeature(String newFeature) {
		String oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapellaElement> getRelatedCapellaElements() {
		if (relatedCapellaElements == null) {
			relatedCapellaElements = new EObjectResolvingEList<CapellaElement>(CapellaElement.class, this, RequirementPackage.REQUIREMENT__RELATED_CAPELLA_ELEMENTS);
		}
		return relatedCapellaElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementPackage.REQUIREMENT__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case RequirementPackage.REQUIREMENT__NAMING_RULES:
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
			case RequirementPackage.REQUIREMENT__OWNED_TRACES:
				return getOwnedTraces();
			case RequirementPackage.REQUIREMENT__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case RequirementPackage.REQUIREMENT__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case RequirementPackage.REQUIREMENT__NAMING_RULES:
				return getNamingRules();
			case RequirementPackage.REQUIREMENT__IS_OBSOLETE:
				return isIsObsolete();
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ID:
				return getRequirementId();
			case RequirementPackage.REQUIREMENT__ADDITIONAL_INFORMATION:
				return getAdditionalInformation();
			case RequirementPackage.REQUIREMENT__VERIFICATION_METHOD:
				return getVerificationMethod();
			case RequirementPackage.REQUIREMENT__VERIFICATION_PHASE:
				return getVerificationPhase();
			case RequirementPackage.REQUIREMENT__IMPLEMENTATION_VERSION:
				return getImplementationVersion();
			case RequirementPackage.REQUIREMENT__FEATURE:
				return getFeature();
			case RequirementPackage.REQUIREMENT__RELATED_CAPELLA_ELEMENTS:
				return getRelatedCapellaElements();
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
			case RequirementPackage.REQUIREMENT__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case RequirementPackage.REQUIREMENT__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case RequirementPackage.REQUIREMENT__IS_OBSOLETE:
				setIsObsolete((Boolean)newValue);
				return;
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ID:
				setRequirementId((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__ADDITIONAL_INFORMATION:
				setAdditionalInformation((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__VERIFICATION_METHOD:
				setVerificationMethod((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__VERIFICATION_PHASE:
				setVerificationPhase((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__IMPLEMENTATION_VERSION:
				setImplementationVersion((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__FEATURE:
				setFeature((String)newValue);
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
			case RequirementPackage.REQUIREMENT__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case RequirementPackage.REQUIREMENT__NAMING_RULES:
				getNamingRules().clear();
				return;
			case RequirementPackage.REQUIREMENT__IS_OBSOLETE:
				setIsObsolete(IS_OBSOLETE_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ID:
				setRequirementId(REQUIREMENT_ID_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__ADDITIONAL_INFORMATION:
				setAdditionalInformation(ADDITIONAL_INFORMATION_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__VERIFICATION_METHOD:
				setVerificationMethod(VERIFICATION_METHOD_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__VERIFICATION_PHASE:
				setVerificationPhase(VERIFICATION_PHASE_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__IMPLEMENTATION_VERSION:
				setImplementationVersion(IMPLEMENTATION_VERSION_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__FEATURE:
				setFeature(FEATURE_EDEFAULT);
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
			case RequirementPackage.REQUIREMENT__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case RequirementPackage.REQUIREMENT__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case RequirementPackage.REQUIREMENT__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case RequirementPackage.REQUIREMENT__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case RequirementPackage.REQUIREMENT__IS_OBSOLETE:
				return isObsolete != IS_OBSOLETE_EDEFAULT;
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ID:
				return REQUIREMENT_ID_EDEFAULT == null ? requirementId != null : !REQUIREMENT_ID_EDEFAULT.equals(requirementId);
			case RequirementPackage.REQUIREMENT__ADDITIONAL_INFORMATION:
				return ADDITIONAL_INFORMATION_EDEFAULT == null ? additionalInformation != null : !ADDITIONAL_INFORMATION_EDEFAULT.equals(additionalInformation);
			case RequirementPackage.REQUIREMENT__VERIFICATION_METHOD:
				return VERIFICATION_METHOD_EDEFAULT == null ? verificationMethod != null : !VERIFICATION_METHOD_EDEFAULT.equals(verificationMethod);
			case RequirementPackage.REQUIREMENT__VERIFICATION_PHASE:
				return VERIFICATION_PHASE_EDEFAULT == null ? verificationPhase != null : !VERIFICATION_PHASE_EDEFAULT.equals(verificationPhase);
			case RequirementPackage.REQUIREMENT__IMPLEMENTATION_VERSION:
				return IMPLEMENTATION_VERSION_EDEFAULT == null ? implementationVersion != null : !IMPLEMENTATION_VERSION_EDEFAULT.equals(implementationVersion);
			case RequirementPackage.REQUIREMENT__FEATURE:
				return FEATURE_EDEFAULT == null ? feature != null : !FEATURE_EDEFAULT.equals(feature);
			case RequirementPackage.REQUIREMENT__RELATED_CAPELLA_ELEMENTS:
				return relatedCapellaElements != null && !relatedCapellaElements.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (isObsolete: "); //$NON-NLS-1$
		result.append(isObsolete);
		result.append(", requirementId: "); //$NON-NLS-1$
		result.append(requirementId);
		result.append(", additionalInformation: "); //$NON-NLS-1$
		result.append(additionalInformation);
		result.append(", verificationMethod: "); //$NON-NLS-1$
		result.append(verificationMethod);
		result.append(", verificationPhase: "); //$NON-NLS-1$
		result.append(verificationPhase);
		result.append(", implementationVersion: "); //$NON-NLS-1$
		result.append(implementationVersion);
		result.append(", feature: "); //$NON-NLS-1$
		result.append(feature);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
