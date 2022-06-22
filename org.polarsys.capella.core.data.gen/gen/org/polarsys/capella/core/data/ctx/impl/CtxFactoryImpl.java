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
package org.polarsys.capella.core.data.ctx.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.data.ctx.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CtxFactoryImpl extends EFactoryImpl implements CtxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CtxFactory init() {
		try {
			CtxFactory theCtxFactory = (CtxFactory)EPackage.Registry.INSTANCE.getEFactory(CtxPackage.eNS_URI);
			if (theCtxFactory != null) {
				return theCtxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CtxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxFactoryImpl() {
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
			case CtxPackage.SYSTEM_ANALYSIS: return createSystemAnalysis();
			case CtxPackage.SYSTEM_FUNCTION: return createSystemFunction();
			case CtxPackage.SYSTEM_FUNCTION_PKG: return createSystemFunctionPkg();
			case CtxPackage.SYSTEM_COMMUNICATION_HOOK: return createSystemCommunicationHook();
			case CtxPackage.SYSTEM_COMMUNICATION: return createSystemCommunication();
			case CtxPackage.CAPABILITY_INVOLVEMENT: return createCapabilityInvolvement();
			case CtxPackage.MISSION_INVOLVEMENT: return createMissionInvolvement();
			case CtxPackage.MISSION: return createMission();
			case CtxPackage.MISSION_PKG: return createMissionPkg();
			case CtxPackage.CAPABILITY: return createCapability();
			case CtxPackage.CAPABILITY_EXPLOITATION: return createCapabilityExploitation();
			case CtxPackage.CAPABILITY_PKG: return createCapabilityPkg();
			case CtxPackage.OPERATIONAL_ANALYSIS_REALIZATION: return createOperationalAnalysisRealization();
			case CtxPackage.SYSTEM_COMPONENT_PKG: return createSystemComponentPkg();
			case CtxPackage.SYSTEM_COMPONENT: return createSystemComponent();
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
	public SystemAnalysis createSystemAnalysis() {
		SystemAnalysisImpl systemAnalysis = new SystemAnalysisImpl();
		return systemAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemFunction createSystemFunction() {
		SystemFunctionImpl systemFunction = new SystemFunctionImpl();
		return systemFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemFunctionPkg createSystemFunctionPkg() {
		SystemFunctionPkgImpl systemFunctionPkg = new SystemFunctionPkgImpl();
		return systemFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemCommunicationHook createSystemCommunicationHook() {
		SystemCommunicationHookImpl systemCommunicationHook = new SystemCommunicationHookImpl();
		return systemCommunicationHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemCommunication createSystemCommunication() {
		SystemCommunicationImpl systemCommunication = new SystemCommunicationImpl();
		return systemCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityInvolvement createCapabilityInvolvement() {
		CapabilityInvolvementImpl capabilityInvolvement = new CapabilityInvolvementImpl();
		return capabilityInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionInvolvement createMissionInvolvement() {
		MissionInvolvementImpl missionInvolvement = new MissionInvolvementImpl();
		return missionInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mission createMission() {
		MissionImpl mission = new MissionImpl();
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionPkg createMissionPkg() {
		MissionPkgImpl missionPkg = new MissionPkgImpl();
		return missionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityExploitation createCapabilityExploitation() {
		CapabilityExploitationImpl capabilityExploitation = new CapabilityExploitationImpl();
		return capabilityExploitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityPkg createCapabilityPkg() {
		CapabilityPkgImpl capabilityPkg = new CapabilityPkgImpl();
		return capabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationalAnalysisRealization createOperationalAnalysisRealization() {
		OperationalAnalysisRealizationImpl operationalAnalysisRealization = new OperationalAnalysisRealizationImpl();
		return operationalAnalysisRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemComponentPkg createSystemComponentPkg() {
		SystemComponentPkgImpl systemComponentPkg = new SystemComponentPkgImpl();
		return systemComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemComponent createSystemComponent() {
		SystemComponentImpl systemComponent = new SystemComponentImpl();
		return systemComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CtxPackage getCtxPackage() {
		return (CtxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CtxPackage getPackage() {
		return CtxPackage.eINSTANCE;
	}

} //CtxFactoryImpl
