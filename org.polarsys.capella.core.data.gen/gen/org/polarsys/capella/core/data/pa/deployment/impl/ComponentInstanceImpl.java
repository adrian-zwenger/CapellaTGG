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
package org.polarsys.capella.core.data.pa.deployment.impl;

import java.util.Collection;

import modellingcore.AbstractNamedElement;
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

import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.capella.core.data.cs.AbstractDeploymentLink;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.DeployableElement;
import org.polarsys.capella.core.data.cs.DeploymentTarget;

import org.polarsys.capella.core.data.pa.PhysicalComponent;

import org.polarsys.capella.core.data.pa.deployment.AbstractPhysicalInstance;
import org.polarsys.capella.core.data.pa.deployment.ComponentInstance;
import org.polarsys.capella.core.data.pa.deployment.DeploymentPackage;
import org.polarsys.capella.core.data.pa.deployment.InstanceDeploymentLink;
import org.polarsys.capella.core.data.pa.deployment.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.pa.deployment.impl.ComponentInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.deployment.impl.ComponentInstanceImpl#getDeployingLinks <em>Deploying Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.deployment.impl.ComponentInstanceImpl#getDeploymentLinks <em>Deployment Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.deployment.impl.ComponentInstanceImpl#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.deployment.impl.ComponentInstanceImpl#getOwnedAbstractPhysicalInstances <em>Owned Abstract Physical Instances</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.deployment.impl.ComponentInstanceImpl#getOwnedInstanceDeploymentLinks <em>Owned Instance Deployment Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.pa.deployment.impl.ComponentInstanceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInstanceImpl extends AbstractPhysicalInstanceImpl implements ComponentInstance {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getPortInstances() <em>Port Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstance> portInstances;

	/**
	 * The cached value of the '{@link #getOwnedAbstractPhysicalInstances() <em>Owned Abstract Physical Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAbstractPhysicalInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPhysicalInstance> ownedAbstractPhysicalInstances;

	/**
	 * The cached value of the '{@link #getOwnedInstanceDeploymentLinks() <em>Owned Instance Deployment Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInstanceDeploymentLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceDeploymentLink> ownedInstanceDeploymentLinks;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PhysicalComponent type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMPONENT_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractDeploymentLink> getDeployingLinks() {
		if (deployingLinks == null) {
			deployingLinks = new EObjectResolvingEList<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, DeploymentPackage.COMPONENT_INSTANCE__DEPLOYING_LINKS);
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
			deploymentLinks = new EObjectResolvingEList<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, DeploymentPackage.COMPONENT_INSTANCE__DEPLOYMENT_LINKS);
		}
		return deploymentLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortInstance> getPortInstances() {
		if (portInstances == null) {
			portInstances = new EObjectResolvingEList<PortInstance>(PortInstance.class, this, DeploymentPackage.COMPONENT_INSTANCE__PORT_INSTANCES);
		}
		return portInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractPhysicalInstance> getOwnedAbstractPhysicalInstances() {
		if (ownedAbstractPhysicalInstances == null) {
			ownedAbstractPhysicalInstances = new EObjectContainmentEList.Resolving<AbstractPhysicalInstance>(AbstractPhysicalInstance.class, this, DeploymentPackage.COMPONENT_INSTANCE__OWNED_ABSTRACT_PHYSICAL_INSTANCES);
		}
		return ownedAbstractPhysicalInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstanceDeploymentLink> getOwnedInstanceDeploymentLinks() {
		if (ownedInstanceDeploymentLinks == null) {
			ownedInstanceDeploymentLinks = new EObjectContainmentEList.Resolving<InstanceDeploymentLink>(InstanceDeploymentLink.class, this, DeploymentPackage.COMPONENT_INSTANCE__OWNED_INSTANCE_DEPLOYMENT_LINKS);
		}
		return ownedInstanceDeploymentLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalComponent getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (PhysicalComponent)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.COMPONENT_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponent basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(PhysicalComponent newType) {
		PhysicalComponent oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMPONENT_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentPackage.COMPONENT_INSTANCE__OWNED_ABSTRACT_PHYSICAL_INSTANCES:
				return ((InternalEList<?>)getOwnedAbstractPhysicalInstances()).basicRemove(otherEnd, msgs);
			case DeploymentPackage.COMPONENT_INSTANCE__OWNED_INSTANCE_DEPLOYMENT_LINKS:
				return ((InternalEList<?>)getOwnedInstanceDeploymentLinks()).basicRemove(otherEnd, msgs);
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
			case DeploymentPackage.COMPONENT_INSTANCE__NAME:
				return getName();
			case DeploymentPackage.COMPONENT_INSTANCE__DEPLOYING_LINKS:
				return getDeployingLinks();
			case DeploymentPackage.COMPONENT_INSTANCE__DEPLOYMENT_LINKS:
				return getDeploymentLinks();
			case DeploymentPackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				return getPortInstances();
			case DeploymentPackage.COMPONENT_INSTANCE__OWNED_ABSTRACT_PHYSICAL_INSTANCES:
				return getOwnedAbstractPhysicalInstances();
			case DeploymentPackage.COMPONENT_INSTANCE__OWNED_INSTANCE_DEPLOYMENT_LINKS:
				return getOwnedInstanceDeploymentLinks();
			case DeploymentPackage.COMPONENT_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case DeploymentPackage.COMPONENT_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case DeploymentPackage.COMPONENT_INSTANCE__OWNED_ABSTRACT_PHYSICAL_INSTANCES:
				getOwnedAbstractPhysicalInstances().clear();
				getOwnedAbstractPhysicalInstances().addAll((Collection<? extends AbstractPhysicalInstance>)newValue);
				return;
			case DeploymentPackage.COMPONENT_INSTANCE__OWNED_INSTANCE_DEPLOYMENT_LINKS:
				getOwnedInstanceDeploymentLinks().clear();
				getOwnedInstanceDeploymentLinks().addAll((Collection<? extends InstanceDeploymentLink>)newValue);
				return;
			case DeploymentPackage.COMPONENT_INSTANCE__TYPE:
				setType((PhysicalComponent)newValue);
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
			case DeploymentPackage.COMPONENT_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DeploymentPackage.COMPONENT_INSTANCE__OWNED_ABSTRACT_PHYSICAL_INSTANCES:
				getOwnedAbstractPhysicalInstances().clear();
				return;
			case DeploymentPackage.COMPONENT_INSTANCE__OWNED_INSTANCE_DEPLOYMENT_LINKS:
				getOwnedInstanceDeploymentLinks().clear();
				return;
			case DeploymentPackage.COMPONENT_INSTANCE__TYPE:
				setType((PhysicalComponent)null);
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
			case DeploymentPackage.COMPONENT_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DeploymentPackage.COMPONENT_INSTANCE__DEPLOYING_LINKS:
				return deployingLinks != null && !deployingLinks.isEmpty();
			case DeploymentPackage.COMPONENT_INSTANCE__DEPLOYMENT_LINKS:
				return deploymentLinks != null && !deploymentLinks.isEmpty();
			case DeploymentPackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				return portInstances != null && !portInstances.isEmpty();
			case DeploymentPackage.COMPONENT_INSTANCE__OWNED_ABSTRACT_PHYSICAL_INSTANCES:
				return ownedAbstractPhysicalInstances != null && !ownedAbstractPhysicalInstances.isEmpty();
			case DeploymentPackage.COMPONENT_INSTANCE__OWNED_INSTANCE_DEPLOYMENT_LINKS:
				return ownedInstanceDeploymentLinks != null && !ownedInstanceDeploymentLinks.isEmpty();
			case DeploymentPackage.COMPONENT_INSTANCE__TYPE:
				return type != null;
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
		if (baseClass == AbstractNamedElement.class) {
			switch (derivedFeatureID) {
				case DeploymentPackage.COMPONENT_INSTANCE__NAME: return ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DeployableElement.class) {
			switch (derivedFeatureID) {
				case DeploymentPackage.COMPONENT_INSTANCE__DEPLOYING_LINKS: return CsPackage.DEPLOYABLE_ELEMENT__DEPLOYING_LINKS;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
				case DeploymentPackage.COMPONENT_INSTANCE__DEPLOYMENT_LINKS: return CsPackage.DEPLOYMENT_TARGET__DEPLOYMENT_LINKS;
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
		if (baseClass == AbstractNamedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME: return DeploymentPackage.COMPONENT_INSTANCE__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DeployableElement.class) {
			switch (baseFeatureID) {
				case CsPackage.DEPLOYABLE_ELEMENT__DEPLOYING_LINKS: return DeploymentPackage.COMPONENT_INSTANCE__DEPLOYING_LINKS;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
				case CsPackage.DEPLOYMENT_TARGET__DEPLOYMENT_LINKS: return DeploymentPackage.COMPONENT_INSTANCE__DEPLOYMENT_LINKS;
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceImpl
