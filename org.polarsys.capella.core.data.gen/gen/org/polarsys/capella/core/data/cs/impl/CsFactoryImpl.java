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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.data.cs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsFactoryImpl extends EFactoryImpl implements CsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CsFactory init() {
		try {
			CsFactory theCsFactory = (CsFactory)EPackage.Registry.INSTANCE.getEFactory(CsPackage.eNS_URI);
			if (theCsFactory != null) {
				return theCsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsFactoryImpl() {
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
			case CsPackage.PART: return createPart();
			case CsPackage.COMPONENT_REALIZATION: return createComponentRealization();
			case CsPackage.INTERFACE_PKG: return createInterfacePkg();
			case CsPackage.INTERFACE: return createInterface();
			case CsPackage.INTERFACE_IMPLEMENTATION: return createInterfaceImplementation();
			case CsPackage.INTERFACE_USE: return createInterfaceUse();
			case CsPackage.EXCHANGE_ITEM_ALLOCATION: return createExchangeItemAllocation();
			case CsPackage.PHYSICAL_LINK: return createPhysicalLink();
			case CsPackage.PHYSICAL_LINK_CATEGORY: return createPhysicalLinkCategory();
			case CsPackage.PHYSICAL_LINK_END: return createPhysicalLinkEnd();
			case CsPackage.PHYSICAL_LINK_REALIZATION: return createPhysicalLinkRealization();
			case CsPackage.PHYSICAL_PATH: return createPhysicalPath();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT: return createPhysicalPathInvolvement();
			case CsPackage.PHYSICAL_PATH_REFERENCE: return createPhysicalPathReference();
			case CsPackage.PHYSICAL_PATH_REALIZATION: return createPhysicalPathRealization();
			case CsPackage.PHYSICAL_PORT: return createPhysicalPort();
			case CsPackage.PHYSICAL_PORT_REALIZATION: return createPhysicalPortRealization();
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
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentRealization createComponentRealization() {
		ComponentRealizationImpl componentRealization = new ComponentRealizationImpl();
		return componentRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfacePkg createInterfacePkg() {
		InterfacePkgImpl interfacePkg = new InterfacePkgImpl();
		return interfacePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceImplementation createInterfaceImplementation() {
		InterfaceImplementationImpl interfaceImplementation = new InterfaceImplementationImpl();
		return interfaceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceUse createInterfaceUse() {
		InterfaceUseImpl interfaceUse = new InterfaceUseImpl();
		return interfaceUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExchangeItemAllocation createExchangeItemAllocation() {
		ExchangeItemAllocationImpl exchangeItemAllocation = new ExchangeItemAllocationImpl();
		return exchangeItemAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalLink createPhysicalLink() {
		PhysicalLinkImpl physicalLink = new PhysicalLinkImpl();
		return physicalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalLinkCategory createPhysicalLinkCategory() {
		PhysicalLinkCategoryImpl physicalLinkCategory = new PhysicalLinkCategoryImpl();
		return physicalLinkCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalLinkEnd createPhysicalLinkEnd() {
		PhysicalLinkEndImpl physicalLinkEnd = new PhysicalLinkEndImpl();
		return physicalLinkEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalLinkRealization createPhysicalLinkRealization() {
		PhysicalLinkRealizationImpl physicalLinkRealization = new PhysicalLinkRealizationImpl();
		return physicalLinkRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalPath createPhysicalPath() {
		PhysicalPathImpl physicalPath = new PhysicalPathImpl();
		return physicalPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalPathInvolvement createPhysicalPathInvolvement() {
		PhysicalPathInvolvementImpl physicalPathInvolvement = new PhysicalPathInvolvementImpl();
		return physicalPathInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalPathReference createPhysicalPathReference() {
		PhysicalPathReferenceImpl physicalPathReference = new PhysicalPathReferenceImpl();
		return physicalPathReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalPathRealization createPhysicalPathRealization() {
		PhysicalPathRealizationImpl physicalPathRealization = new PhysicalPathRealizationImpl();
		return physicalPathRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalPort createPhysicalPort() {
		PhysicalPortImpl physicalPort = new PhysicalPortImpl();
		return physicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalPortRealization createPhysicalPortRealization() {
		PhysicalPortRealizationImpl physicalPortRealization = new PhysicalPortRealizationImpl();
		return physicalPortRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CsPackage getCsPackage() {
		return (CsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CsPackage getPackage() {
		return CsPackage.eINSTANCE;
	}

} //CsFactoryImpl
