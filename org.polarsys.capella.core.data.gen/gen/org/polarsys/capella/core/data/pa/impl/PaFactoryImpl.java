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
package org.polarsys.capella.core.data.pa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.data.pa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaFactoryImpl extends EFactoryImpl implements PaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PaFactory init() {
		try {
			PaFactory thePaFactory = (PaFactory)EPackage.Registry.INSTANCE.getEFactory(PaPackage.eNS_URI);
			if (thePaFactory != null) {
				return thePaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaFactoryImpl() {
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
			case PaPackage.PHYSICAL_ARCHITECTURE_PKG: return createPhysicalArchitecturePkg();
			case PaPackage.PHYSICAL_ARCHITECTURE: return createPhysicalArchitecture();
			case PaPackage.PHYSICAL_FUNCTION: return createPhysicalFunction();
			case PaPackage.PHYSICAL_FUNCTION_PKG: return createPhysicalFunctionPkg();
			case PaPackage.PHYSICAL_COMPONENT: return createPhysicalComponent();
			case PaPackage.PHYSICAL_COMPONENT_PKG: return createPhysicalComponentPkg();
			case PaPackage.PHYSICAL_NODE: return createPhysicalNode();
			case PaPackage.LOGICAL_ARCHITECTURE_REALIZATION: return createLogicalArchitectureRealization();
			case PaPackage.LOGICAL_INTERFACE_REALIZATION: return createLogicalInterfaceRealization();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PaPackage.PHYSICAL_COMPONENT_KIND:
				return createPhysicalComponentKindFromString(eDataType, initialValue);
			case PaPackage.PHYSICAL_COMPONENT_NATURE:
				return createPhysicalComponentNatureFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PaPackage.PHYSICAL_COMPONENT_KIND:
				return convertPhysicalComponentKindToString(eDataType, instanceValue);
			case PaPackage.PHYSICAL_COMPONENT_NATURE:
				return convertPhysicalComponentNatureToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalArchitecturePkg createPhysicalArchitecturePkg() {
		PhysicalArchitecturePkgImpl physicalArchitecturePkg = new PhysicalArchitecturePkgImpl();
		return physicalArchitecturePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalArchitecture createPhysicalArchitecture() {
		PhysicalArchitectureImpl physicalArchitecture = new PhysicalArchitectureImpl();
		return physicalArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalFunction createPhysicalFunction() {
		PhysicalFunctionImpl physicalFunction = new PhysicalFunctionImpl();
		return physicalFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalFunctionPkg createPhysicalFunctionPkg() {
		PhysicalFunctionPkgImpl physicalFunctionPkg = new PhysicalFunctionPkgImpl();
		return physicalFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalComponent createPhysicalComponent() {
		PhysicalComponentImpl physicalComponent = new PhysicalComponentImpl();
		return physicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalComponentPkg createPhysicalComponentPkg() {
		PhysicalComponentPkgImpl physicalComponentPkg = new PhysicalComponentPkgImpl();
		return physicalComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalNode createPhysicalNode() {
		PhysicalNodeImpl physicalNode = new PhysicalNodeImpl();
		return physicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalArchitectureRealization createLogicalArchitectureRealization() {
		LogicalArchitectureRealizationImpl logicalArchitectureRealization = new LogicalArchitectureRealizationImpl();
		return logicalArchitectureRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalInterfaceRealization createLogicalInterfaceRealization() {
		LogicalInterfaceRealizationImpl logicalInterfaceRealization = new LogicalInterfaceRealizationImpl();
		return logicalInterfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponentKind createPhysicalComponentKindFromString(EDataType eDataType, String initialValue) {
		PhysicalComponentKind result = PhysicalComponentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhysicalComponentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponentNature createPhysicalComponentNatureFromString(EDataType eDataType, String initialValue) {
		PhysicalComponentNature result = PhysicalComponentNature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhysicalComponentNatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaPackage getPaPackage() {
		return (PaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PaPackage getPackage() {
		return PaPackage.eINSTANCE;
	}

} //PaFactoryImpl
