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
package org.polarsys.capella.core.data.pa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.core.data.pa.PaPackage
 * @generated
 */
public interface PaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PaFactory eINSTANCE = org.polarsys.capella.core.data.pa.impl.PaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Physical Architecture Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Architecture Pkg</em>'.
	 * @generated
	 */
	PhysicalArchitecturePkg createPhysicalArchitecturePkg();

	/**
	 * Returns a new object of class '<em>Physical Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Architecture</em>'.
	 * @generated
	 */
	PhysicalArchitecture createPhysicalArchitecture();

	/**
	 * Returns a new object of class '<em>Physical Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Function</em>'.
	 * @generated
	 */
	PhysicalFunction createPhysicalFunction();

	/**
	 * Returns a new object of class '<em>Physical Function Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Function Pkg</em>'.
	 * @generated
	 */
	PhysicalFunctionPkg createPhysicalFunctionPkg();

	/**
	 * Returns a new object of class '<em>Physical Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Component</em>'.
	 * @generated
	 */
	PhysicalComponent createPhysicalComponent();

	/**
	 * Returns a new object of class '<em>Physical Component Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Component Pkg</em>'.
	 * @generated
	 */
	PhysicalComponentPkg createPhysicalComponentPkg();

	/**
	 * Returns a new object of class '<em>Physical Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Node</em>'.
	 * @generated
	 */
	PhysicalNode createPhysicalNode();

	/**
	 * Returns a new object of class '<em>Logical Architecture Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Architecture Realization</em>'.
	 * @generated
	 */
	LogicalArchitectureRealization createLogicalArchitectureRealization();

	/**
	 * Returns a new object of class '<em>Logical Interface Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Interface Realization</em>'.
	 * @generated
	 */
	LogicalInterfaceRealization createLogicalInterfaceRealization();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PaPackage getPaPackage();

} //PaFactory
