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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.data.pa.deployment.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentFactoryImpl extends EFactoryImpl implements DeploymentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeploymentFactory init() {
		try {
			DeploymentFactory theDeploymentFactory = (DeploymentFactory)EPackage.Registry.INSTANCE.getEFactory(DeploymentPackage.eNS_URI);
			if (theDeploymentFactory != null) {
				return theDeploymentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeploymentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DeploymentPackage.COMPONENT_INSTANCE: return createComponentInstance();
			case DeploymentPackage.CONNECTION_INSTANCE: return createConnectionInstance();
			case DeploymentPackage.DEPLOYMENT_ASPECT: return createDeploymentAspect();
			case DeploymentPackage.DEPLOYMENT_CONFIGURATION: return createDeploymentConfiguration();
			case DeploymentPackage.INSTANCE_DEPLOYMENT_LINK: return createInstanceDeploymentLink();
			case DeploymentPackage.PART_DEPLOYMENT_LINK: return createPartDeploymentLink();
			case DeploymentPackage.PORT_INSTANCE: return createPortInstance();
			case DeploymentPackage.TYPE_DEPLOYMENT_LINK: return createTypeDeploymentLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionInstance createConnectionInstance() {
		ConnectionInstanceImpl connectionInstance = new ConnectionInstanceImpl();
		return connectionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentAspect createDeploymentAspect() {
		DeploymentAspectImpl deploymentAspect = new DeploymentAspectImpl();
		return deploymentAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentConfiguration createDeploymentConfiguration() {
		DeploymentConfigurationImpl deploymentConfiguration = new DeploymentConfigurationImpl();
		return deploymentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceDeploymentLink createInstanceDeploymentLink() {
		InstanceDeploymentLinkImpl instanceDeploymentLink = new InstanceDeploymentLinkImpl();
		return instanceDeploymentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartDeploymentLink createPartDeploymentLink() {
		PartDeploymentLinkImpl partDeploymentLink = new PartDeploymentLinkImpl();
		return partDeploymentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortInstance createPortInstance() {
		PortInstanceImpl portInstance = new PortInstanceImpl();
		return portInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDeploymentLink createTypeDeploymentLink() {
		TypeDeploymentLinkImpl typeDeploymentLink = new TypeDeploymentLinkImpl();
		return typeDeploymentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentPackage getDeploymentPackage() {
		return (DeploymentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeploymentPackage getPackage() {
		return DeploymentPackage.eINSTANCE;
	}

} //DeploymentFactoryImpl
