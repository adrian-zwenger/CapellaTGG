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

import modellingcore.AbstractInformationFlow;
import modellingcore.AbstractType;
import modellingcore.InformationsExchanger;
import modellingcore.ModellingcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.Involvement;

import org.polarsys.capella.core.data.cs.AbstractDeploymentLink;
import org.polarsys.capella.core.data.cs.AbstractPathInvolvedElement;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.DeployableElement;
import org.polarsys.capella.core.data.cs.DeploymentTarget;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.cs.Part;

import org.polarsys.capella.core.data.information.impl.AbstractInstanceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PartImpl#getIncomingInformationFlows <em>Incoming Information Flows</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PartImpl#getOutgoingInformationFlows <em>Outgoing Information Flows</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PartImpl#getInformationFlows <em>Information Flows</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PartImpl#getDeployingLinks <em>Deploying Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PartImpl#getDeploymentLinks <em>Deployment Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PartImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PartImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PartImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PartImpl#getOwnedDeploymentLinks <em>Owned Deployment Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PartImpl#getDeployedParts <em>Deployed Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PartImpl#getDeployingParts <em>Deploying Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.cs.impl.PartImpl#getOwnedAbstractType <em>Owned Abstract Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartImpl extends AbstractInstanceImpl implements Part {
	/**
	 * The cached value of the '{@link #getIncomingInformationFlows() <em>Incoming Information Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingInformationFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInformationFlow> incomingInformationFlows;

	/**
	 * The cached value of the '{@link #getOutgoingInformationFlows() <em>Outgoing Information Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingInformationFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInformationFlow> outgoingInformationFlows;

	/**
	 * The cached value of the '{@link #getInformationFlows() <em>Information Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInformationFlow> informationFlows;

	/**
	 * The cached value of the '{@link #getDeployingLinks() <em>Deploying Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> deployingLinks;

	/**
	 * The cached value of the '{@link #getDeploymentLinks() <em>Deployment Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> deploymentLinks;

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
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> providedInterfaces;

	/**
	 * The cached value of the '{@link #getRequiredInterfaces() <em>Required Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> requiredInterfaces;

	/**
	 * The cached value of the '{@link #getOwnedDeploymentLinks() <em>Owned Deployment Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDeploymentLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> ownedDeploymentLinks;

	/**
	 * The cached value of the '{@link #getDeployedParts() <em>Deployed Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> deployedParts;

	/**
	 * The cached value of the '{@link #getDeployingParts() <em>Deploying Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployingParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> deployingParts;

	/**
	 * The cached value of the '{@link #getOwnedAbstractType() <em>Owned Abstract Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAbstractType()
	 * @generated
	 * @ordered
	 */
	protected AbstractType ownedAbstractType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractInformationFlow> getIncomingInformationFlows() {
		if (incomingInformationFlows == null) {
			incomingInformationFlows = new EObjectResolvingEList<AbstractInformationFlow>(AbstractInformationFlow.class, this, CsPackage.PART__INCOMING_INFORMATION_FLOWS);
		}
		return incomingInformationFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractInformationFlow> getOutgoingInformationFlows() {
		if (outgoingInformationFlows == null) {
			outgoingInformationFlows = new EObjectResolvingEList<AbstractInformationFlow>(AbstractInformationFlow.class, this, CsPackage.PART__OUTGOING_INFORMATION_FLOWS);
		}
		return outgoingInformationFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractInformationFlow> getInformationFlows() {
		if (informationFlows == null) {
			informationFlows = new EObjectResolvingEList<AbstractInformationFlow>(AbstractInformationFlow.class, this, CsPackage.PART__INFORMATION_FLOWS);
		}
		return informationFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractDeploymentLink> getDeployingLinks() {
		if (deployingLinks == null) {
			deployingLinks = new EObjectResolvingEList<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, CsPackage.PART__DEPLOYING_LINKS);
		}
		return deployingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractDeploymentLink> getDeploymentLinks() {
		if (deploymentLinks == null) {
			deploymentLinks = new EObjectResolvingEList<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, CsPackage.PART__DEPLOYMENT_LINKS);
		}
		return deploymentLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Involvement> getInvolvingInvolvements() {
		if (involvingInvolvements == null) {
			involvingInvolvements = new EObjectResolvingEList<Involvement>(Involvement.class, this, CsPackage.PART__INVOLVING_INVOLVEMENTS);
		}
		return involvingInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.PART__PROVIDED_INTERFACES);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getRequiredInterfaces() {
		if (requiredInterfaces == null) {
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.PART__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractDeploymentLink> getOwnedDeploymentLinks() {
		if (ownedDeploymentLinks == null) {
			ownedDeploymentLinks = new EObjectContainmentEList.Resolving<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, CsPackage.PART__OWNED_DEPLOYMENT_LINKS);
		}
		return ownedDeploymentLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Part> getDeployedParts() {
		if (deployedParts == null) {
			deployedParts = new EObjectResolvingEList<Part>(Part.class, this, CsPackage.PART__DEPLOYED_PARTS);
		}
		return deployedParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Part> getDeployingParts() {
		if (deployingParts == null) {
			deployingParts = new EObjectResolvingEList<Part>(Part.class, this, CsPackage.PART__DEPLOYING_PARTS);
		}
		return deployingParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractType getOwnedAbstractType() {
		if (ownedAbstractType != null && ownedAbstractType.eIsProxy()) {
			InternalEObject oldOwnedAbstractType = (InternalEObject)ownedAbstractType;
			ownedAbstractType = (AbstractType)eResolveProxy(oldOwnedAbstractType);
			if (ownedAbstractType != oldOwnedAbstractType) {
				InternalEObject newOwnedAbstractType = (InternalEObject)ownedAbstractType;
				NotificationChain msgs = oldOwnedAbstractType.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.PART__OWNED_ABSTRACT_TYPE, null, null);
				if (newOwnedAbstractType.eInternalContainer() == null) {
					msgs = newOwnedAbstractType.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.PART__OWNED_ABSTRACT_TYPE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.PART__OWNED_ABSTRACT_TYPE, oldOwnedAbstractType, ownedAbstractType));
			}
		}
		return ownedAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType basicGetOwnedAbstractType() {
		return ownedAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedAbstractType(AbstractType newOwnedAbstractType, NotificationChain msgs) {
		AbstractType oldOwnedAbstractType = ownedAbstractType;
		ownedAbstractType = newOwnedAbstractType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.PART__OWNED_ABSTRACT_TYPE, oldOwnedAbstractType, newOwnedAbstractType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedAbstractType(AbstractType newOwnedAbstractType) {
		if (newOwnedAbstractType != ownedAbstractType) {
			NotificationChain msgs = null;
			if (ownedAbstractType != null)
				msgs = ((InternalEObject)ownedAbstractType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.PART__OWNED_ABSTRACT_TYPE, null, msgs);
			if (newOwnedAbstractType != null)
				msgs = ((InternalEObject)newOwnedAbstractType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.PART__OWNED_ABSTRACT_TYPE, null, msgs);
			msgs = basicSetOwnedAbstractType(newOwnedAbstractType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PART__OWNED_ABSTRACT_TYPE, newOwnedAbstractType, newOwnedAbstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.PART__OWNED_DEPLOYMENT_LINKS:
				return ((InternalEList<?>)getOwnedDeploymentLinks()).basicRemove(otherEnd, msgs);
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				return basicSetOwnedAbstractType(null, msgs);
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
			case CsPackage.PART__INCOMING_INFORMATION_FLOWS:
				return getIncomingInformationFlows();
			case CsPackage.PART__OUTGOING_INFORMATION_FLOWS:
				return getOutgoingInformationFlows();
			case CsPackage.PART__INFORMATION_FLOWS:
				return getInformationFlows();
			case CsPackage.PART__DEPLOYING_LINKS:
				return getDeployingLinks();
			case CsPackage.PART__DEPLOYMENT_LINKS:
				return getDeploymentLinks();
			case CsPackage.PART__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case CsPackage.PART__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case CsPackage.PART__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case CsPackage.PART__OWNED_DEPLOYMENT_LINKS:
				return getOwnedDeploymentLinks();
			case CsPackage.PART__DEPLOYED_PARTS:
				return getDeployedParts();
			case CsPackage.PART__DEPLOYING_PARTS:
				return getDeployingParts();
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				if (resolve) return getOwnedAbstractType();
				return basicGetOwnedAbstractType();
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
			case CsPackage.PART__INCOMING_INFORMATION_FLOWS:
				getIncomingInformationFlows().clear();
				getIncomingInformationFlows().addAll((Collection<? extends AbstractInformationFlow>)newValue);
				return;
			case CsPackage.PART__OWNED_DEPLOYMENT_LINKS:
				getOwnedDeploymentLinks().clear();
				getOwnedDeploymentLinks().addAll((Collection<? extends AbstractDeploymentLink>)newValue);
				return;
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				setOwnedAbstractType((AbstractType)newValue);
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
			case CsPackage.PART__INCOMING_INFORMATION_FLOWS:
				getIncomingInformationFlows().clear();
				return;
			case CsPackage.PART__OWNED_DEPLOYMENT_LINKS:
				getOwnedDeploymentLinks().clear();
				return;
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				setOwnedAbstractType((AbstractType)null);
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
			case CsPackage.PART__INCOMING_INFORMATION_FLOWS:
				return incomingInformationFlows != null && !incomingInformationFlows.isEmpty();
			case CsPackage.PART__OUTGOING_INFORMATION_FLOWS:
				return outgoingInformationFlows != null && !outgoingInformationFlows.isEmpty();
			case CsPackage.PART__INFORMATION_FLOWS:
				return informationFlows != null && !informationFlows.isEmpty();
			case CsPackage.PART__DEPLOYING_LINKS:
				return deployingLinks != null && !deployingLinks.isEmpty();
			case CsPackage.PART__DEPLOYMENT_LINKS:
				return deploymentLinks != null && !deploymentLinks.isEmpty();
			case CsPackage.PART__INVOLVING_INVOLVEMENTS:
				return involvingInvolvements != null && !involvingInvolvements.isEmpty();
			case CsPackage.PART__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case CsPackage.PART__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case CsPackage.PART__OWNED_DEPLOYMENT_LINKS:
				return ownedDeploymentLinks != null && !ownedDeploymentLinks.isEmpty();
			case CsPackage.PART__DEPLOYED_PARTS:
				return deployedParts != null && !deployedParts.isEmpty();
			case CsPackage.PART__DEPLOYING_PARTS:
				return deployingParts != null && !deployingParts.isEmpty();
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				return ownedAbstractType != null;
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
		if (baseClass == InformationsExchanger.class) {
			switch (derivedFeatureID) {
				case CsPackage.PART__INCOMING_INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS;
				case CsPackage.PART__OUTGOING_INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS;
				case CsPackage.PART__INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == DeployableElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.PART__DEPLOYING_LINKS: return CsPackage.DEPLOYABLE_ELEMENT__DEPLOYING_LINKS;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
				case CsPackage.PART__DEPLOYMENT_LINKS: return CsPackage.DEPLOYMENT_TARGET__DEPLOYMENT_LINKS;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.PART__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractPathInvolvedElement.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == InformationsExchanger.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS: return CsPackage.PART__INCOMING_INFORMATION_FLOWS;
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS: return CsPackage.PART__OUTGOING_INFORMATION_FLOWS;
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS: return CsPackage.PART__INFORMATION_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == DeployableElement.class) {
			switch (baseFeatureID) {
				case CsPackage.DEPLOYABLE_ELEMENT__DEPLOYING_LINKS: return CsPackage.PART__DEPLOYING_LINKS;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
				case CsPackage.DEPLOYMENT_TARGET__DEPLOYMENT_LINKS: return CsPackage.PART__DEPLOYMENT_LINKS;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return CsPackage.PART__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractPathInvolvedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PartImpl
