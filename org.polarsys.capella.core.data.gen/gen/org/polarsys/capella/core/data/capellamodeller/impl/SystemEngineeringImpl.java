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
package org.polarsys.capella.core.data.capellamodeller.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.core.data.capellacore.impl.AbstractModellingStructureImpl;

import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.data.epbs.EPBSArchitecture;

import org.polarsys.capella.core.data.la.LogicalArchitecture;

import org.polarsys.capella.core.data.oa.OperationalAnalysis;

import org.polarsys.capella.core.data.pa.PhysicalArchitecture;

import org.polarsys.capella.core.data.sharedmodel.SharedPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Engineering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.SystemEngineeringImpl#getContainedOperationalAnalysis <em>Contained Operational Analysis</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.SystemEngineeringImpl#getContainedSystemAnalysis <em>Contained System Analysis</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.SystemEngineeringImpl#getContainedLogicalArchitectures <em>Contained Logical Architectures</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.SystemEngineeringImpl#getContainedPhysicalArchitectures <em>Contained Physical Architectures</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.SystemEngineeringImpl#getContainedEPBSArchitectures <em>Contained EPBS Architectures</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.capellamodeller.impl.SystemEngineeringImpl#getContainedSharedPkgs <em>Contained Shared Pkgs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemEngineeringImpl extends AbstractModellingStructureImpl implements SystemEngineering {
	/**
	 * The cached value of the '{@link #getContainedOperationalAnalysis() <em>Contained Operational Analysis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedOperationalAnalysis()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalAnalysis> containedOperationalAnalysis;
	/**
	 * The cached value of the '{@link #getContainedSystemAnalysis() <em>Contained System Analysis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedSystemAnalysis()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemAnalysis> containedSystemAnalysis;
	/**
	 * The cached value of the '{@link #getContainedLogicalArchitectures() <em>Contained Logical Architectures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedLogicalArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalArchitecture> containedLogicalArchitectures;
	/**
	 * The cached value of the '{@link #getContainedPhysicalArchitectures() <em>Contained Physical Architectures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPhysicalArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalArchitecture> containedPhysicalArchitectures;
	/**
	 * The cached value of the '{@link #getContainedEPBSArchitectures() <em>Contained EPBS Architectures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEPBSArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<EPBSArchitecture> containedEPBSArchitectures;
	/**
	 * The cached value of the '{@link #getContainedSharedPkgs() <em>Contained Shared Pkgs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedSharedPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedPkg> containedSharedPkgs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemEngineeringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellamodellerPackage.Literals.SYSTEM_ENGINEERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalAnalysis> getContainedOperationalAnalysis() {
		if (containedOperationalAnalysis == null) {
			containedOperationalAnalysis = new EObjectResolvingEList<OperationalAnalysis>(OperationalAnalysis.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_OPERATIONAL_ANALYSIS);
		}
		return containedOperationalAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemAnalysis> getContainedSystemAnalysis() {
		if (containedSystemAnalysis == null) {
			containedSystemAnalysis = new EObjectResolvingEList<SystemAnalysis>(SystemAnalysis.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SYSTEM_ANALYSIS);
		}
		return containedSystemAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalArchitecture> getContainedLogicalArchitectures() {
		if (containedLogicalArchitectures == null) {
			containedLogicalArchitectures = new EObjectResolvingEList<LogicalArchitecture>(LogicalArchitecture.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_LOGICAL_ARCHITECTURES);
		}
		return containedLogicalArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalArchitecture> getContainedPhysicalArchitectures() {
		if (containedPhysicalArchitectures == null) {
			containedPhysicalArchitectures = new EObjectResolvingEList<PhysicalArchitecture>(PhysicalArchitecture.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_PHYSICAL_ARCHITECTURES);
		}
		return containedPhysicalArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EPBSArchitecture> getContainedEPBSArchitectures() {
		if (containedEPBSArchitectures == null) {
			containedEPBSArchitectures = new EObjectResolvingEList<EPBSArchitecture>(EPBSArchitecture.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_EPBS_ARCHITECTURES);
		}
		return containedEPBSArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SharedPkg> getContainedSharedPkgs() {
		if (containedSharedPkgs == null) {
			containedSharedPkgs = new EObjectResolvingEList<SharedPkg>(SharedPkg.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SHARED_PKGS);
		}
		return containedSharedPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_OPERATIONAL_ANALYSIS:
				return getContainedOperationalAnalysis();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SYSTEM_ANALYSIS:
				return getContainedSystemAnalysis();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_LOGICAL_ARCHITECTURES:
				return getContainedLogicalArchitectures();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_PHYSICAL_ARCHITECTURES:
				return getContainedPhysicalArchitectures();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_EPBS_ARCHITECTURES:
				return getContainedEPBSArchitectures();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SHARED_PKGS:
				return getContainedSharedPkgs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_OPERATIONAL_ANALYSIS:
				return containedOperationalAnalysis != null && !containedOperationalAnalysis.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SYSTEM_ANALYSIS:
				return containedSystemAnalysis != null && !containedSystemAnalysis.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_LOGICAL_ARCHITECTURES:
				return containedLogicalArchitectures != null && !containedLogicalArchitectures.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_PHYSICAL_ARCHITECTURES:
				return containedPhysicalArchitectures != null && !containedPhysicalArchitectures.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_EPBS_ARCHITECTURES:
				return containedEPBSArchitectures != null && !containedEPBSArchitectures.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SHARED_PKGS:
				return containedSharedPkgs != null && !containedSharedPkgs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemEngineeringImpl
