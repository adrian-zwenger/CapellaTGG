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
package org.polarsys.capella.core.data.la.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.data.la.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LaFactoryImpl extends EFactoryImpl implements LaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LaFactory init() {
		try {
			LaFactory theLaFactory = (LaFactory)EPackage.Registry.INSTANCE.getEFactory(LaPackage.eNS_URI);
			if (theLaFactory != null) {
				return theLaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaFactoryImpl() {
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
			case LaPackage.LOGICAL_ARCHITECTURE_PKG: return createLogicalArchitecturePkg();
			case LaPackage.LOGICAL_ARCHITECTURE: return createLogicalArchitecture();
			case LaPackage.LOGICAL_FUNCTION: return createLogicalFunction();
			case LaPackage.LOGICAL_FUNCTION_PKG: return createLogicalFunctionPkg();
			case LaPackage.LOGICAL_COMPONENT: return createLogicalComponent();
			case LaPackage.LOGICAL_COMPONENT_PKG: return createLogicalComponentPkg();
			case LaPackage.CAPABILITY_REALIZATION: return createCapabilityRealization();
			case LaPackage.CAPABILITY_REALIZATION_PKG: return createCapabilityRealizationPkg();
			case LaPackage.SYSTEM_ANALYSIS_REALIZATION: return createSystemAnalysisRealization();
			case LaPackage.CONTEXT_INTERFACE_REALIZATION: return createContextInterfaceRealization();
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
	public LogicalArchitecturePkg createLogicalArchitecturePkg() {
		LogicalArchitecturePkgImpl logicalArchitecturePkg = new LogicalArchitecturePkgImpl();
		return logicalArchitecturePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalArchitecture createLogicalArchitecture() {
		LogicalArchitectureImpl logicalArchitecture = new LogicalArchitectureImpl();
		return logicalArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalFunction createLogicalFunction() {
		LogicalFunctionImpl logicalFunction = new LogicalFunctionImpl();
		return logicalFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalFunctionPkg createLogicalFunctionPkg() {
		LogicalFunctionPkgImpl logicalFunctionPkg = new LogicalFunctionPkgImpl();
		return logicalFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalComponent createLogicalComponent() {
		LogicalComponentImpl logicalComponent = new LogicalComponentImpl();
		return logicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalComponentPkg createLogicalComponentPkg() {
		LogicalComponentPkgImpl logicalComponentPkg = new LogicalComponentPkgImpl();
		return logicalComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityRealization createCapabilityRealization() {
		CapabilityRealizationImpl capabilityRealization = new CapabilityRealizationImpl();
		return capabilityRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityRealizationPkg createCapabilityRealizationPkg() {
		CapabilityRealizationPkgImpl capabilityRealizationPkg = new CapabilityRealizationPkgImpl();
		return capabilityRealizationPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemAnalysisRealization createSystemAnalysisRealization() {
		SystemAnalysisRealizationImpl systemAnalysisRealization = new SystemAnalysisRealizationImpl();
		return systemAnalysisRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextInterfaceRealization createContextInterfaceRealization() {
		ContextInterfaceRealizationImpl contextInterfaceRealization = new ContextInterfaceRealizationImpl();
		return contextInterfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LaPackage getLaPackage() {
		return (LaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LaPackage getPackage() {
		return LaPackage.eINSTANCE;
	}

} //LaFactoryImpl
