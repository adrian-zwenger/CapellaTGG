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
package org.polarsys.capella.core.data.interaction.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.data.interaction.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionFactoryImpl extends EFactoryImpl implements InteractionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionFactory init() {
		try {
			InteractionFactory theInteractionFactory = (InteractionFactory)EPackage.Registry.INSTANCE.getEFactory(InteractionPackage.eNS_URI);
			if (theInteractionFactory != null) {
				return theInteractionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InteractionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFactoryImpl() {
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
			case InteractionPackage.SEQUENCE_MESSAGE: return createSequenceMessage();
			case InteractionPackage.SCENARIO: return createScenario();
			case InteractionPackage.MESSAGE_END: return createMessageEnd();
			case InteractionPackage.EXECUTION: return createExecution();
			case InteractionPackage.EXECUTION_END: return createExecutionEnd();
			case InteractionPackage.CREATION_EVENT: return createCreationEvent();
			case InteractionPackage.DESTRUCTION_EVENT: return createDestructionEvent();
			case InteractionPackage.EXECUTION_EVENT: return createExecutionEvent();
			case InteractionPackage.INSTANCE_ROLE: return createInstanceRole();
			case InteractionPackage.EVENT_RECEIPT_OPERATION: return createEventReceiptOperation();
			case InteractionPackage.EVENT_SENT_OPERATION: return createEventSentOperation();
			case InteractionPackage.MERGE_LINK: return createMergeLink();
			case InteractionPackage.REFINEMENT_LINK: return createRefinementLink();
			case InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION: return createAbstractCapabilityRealization();
			case InteractionPackage.ABSTRACT_CAPABILITY_EXTEND: return createAbstractCapabilityExtend();
			case InteractionPackage.ABSTRACT_CAPABILITY_EXTENSION_POINT: return createAbstractCapabilityExtensionPoint();
			case InteractionPackage.ABSTRACT_CAPABILITY_GENERALIZATION: return createAbstractCapabilityGeneralization();
			case InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE: return createAbstractCapabilityInclude();
			case InteractionPackage.INTERACTION_STATE: return createInteractionState();
			case InteractionPackage.INTERACTION_USE: return createInteractionUse();
			case InteractionPackage.COMBINED_FRAGMENT: return createCombinedFragment();
			case InteractionPackage.GATE: return createGate();
			case InteractionPackage.INTERACTION_OPERAND: return createInteractionOperand();
			case InteractionPackage.FRAGMENT_END: return createFragmentEnd();
			case InteractionPackage.FUNCTIONAL_CHAIN_ABSTRACT_CAPABILITY_INVOLVEMENT: return createFunctionalChainAbstractCapabilityInvolvement();
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT: return createAbstractFunctionAbstractCapabilityInvolvement();
			case InteractionPackage.SCENARIO_REALIZATION: return createScenarioRealization();
			case InteractionPackage.STATE_FRAGMENT: return createStateFragment();
			case InteractionPackage.ARM_TIMER_EVENT: return createArmTimerEvent();
			case InteractionPackage.CANCEL_TIMER_EVENT: return createCancelTimerEvent();
			case InteractionPackage.CONSTRAINT_DURATION: return createConstraintDuration();
			case InteractionPackage.SEQUENCE_MESSAGE_VALUATION: return createSequenceMessageValuation();
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
			case InteractionPackage.MESSAGE_KIND:
				return createMessageKindFromString(eDataType, initialValue);
			case InteractionPackage.SCENARIO_KIND:
				return createScenarioKindFromString(eDataType, initialValue);
			case InteractionPackage.INTERACTION_OPERATOR_KIND:
				return createInteractionOperatorKindFromString(eDataType, initialValue);
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
			case InteractionPackage.MESSAGE_KIND:
				return convertMessageKindToString(eDataType, instanceValue);
			case InteractionPackage.SCENARIO_KIND:
				return convertScenarioKindToString(eDataType, instanceValue);
			case InteractionPackage.INTERACTION_OPERATOR_KIND:
				return convertInteractionOperatorKindToString(eDataType, instanceValue);
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
	public SequenceMessage createSequenceMessage() {
		SequenceMessageImpl sequenceMessage = new SequenceMessageImpl();
		return sequenceMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageEnd createMessageEnd() {
		MessageEndImpl messageEnd = new MessageEndImpl();
		return messageEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Execution createExecution() {
		ExecutionImpl execution = new ExecutionImpl();
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionEnd createExecutionEnd() {
		ExecutionEndImpl executionEnd = new ExecutionEndImpl();
		return executionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreationEvent createCreationEvent() {
		CreationEventImpl creationEvent = new CreationEventImpl();
		return creationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DestructionEvent createDestructionEvent() {
		DestructionEventImpl destructionEvent = new DestructionEventImpl();
		return destructionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionEvent createExecutionEvent() {
		ExecutionEventImpl executionEvent = new ExecutionEventImpl();
		return executionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceRole createInstanceRole() {
		InstanceRoleImpl instanceRole = new InstanceRoleImpl();
		return instanceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventReceiptOperation createEventReceiptOperation() {
		EventReceiptOperationImpl eventReceiptOperation = new EventReceiptOperationImpl();
		return eventReceiptOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventSentOperation createEventSentOperation() {
		EventSentOperationImpl eventSentOperation = new EventSentOperationImpl();
		return eventSentOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergeLink createMergeLink() {
		MergeLinkImpl mergeLink = new MergeLinkImpl();
		return mergeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefinementLink createRefinementLink() {
		RefinementLinkImpl refinementLink = new RefinementLinkImpl();
		return refinementLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCapabilityRealization createAbstractCapabilityRealization() {
		AbstractCapabilityRealizationImpl abstractCapabilityRealization = new AbstractCapabilityRealizationImpl();
		return abstractCapabilityRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCapabilityExtend createAbstractCapabilityExtend() {
		AbstractCapabilityExtendImpl abstractCapabilityExtend = new AbstractCapabilityExtendImpl();
		return abstractCapabilityExtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCapabilityExtensionPoint createAbstractCapabilityExtensionPoint() {
		AbstractCapabilityExtensionPointImpl abstractCapabilityExtensionPoint = new AbstractCapabilityExtensionPointImpl();
		return abstractCapabilityExtensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCapabilityGeneralization createAbstractCapabilityGeneralization() {
		AbstractCapabilityGeneralizationImpl abstractCapabilityGeneralization = new AbstractCapabilityGeneralizationImpl();
		return abstractCapabilityGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCapabilityInclude createAbstractCapabilityInclude() {
		AbstractCapabilityIncludeImpl abstractCapabilityInclude = new AbstractCapabilityIncludeImpl();
		return abstractCapabilityInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteractionState createInteractionState() {
		InteractionStateImpl interactionState = new InteractionStateImpl();
		return interactionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteractionUse createInteractionUse() {
		InteractionUseImpl interactionUse = new InteractionUseImpl();
		return interactionUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CombinedFragment createCombinedFragment() {
		CombinedFragmentImpl combinedFragment = new CombinedFragmentImpl();
		return combinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteractionOperand createInteractionOperand() {
		InteractionOperandImpl interactionOperand = new InteractionOperandImpl();
		return interactionOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FragmentEnd createFragmentEnd() {
		FragmentEndImpl fragmentEnd = new FragmentEndImpl();
		return fragmentEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalChainAbstractCapabilityInvolvement createFunctionalChainAbstractCapabilityInvolvement() {
		FunctionalChainAbstractCapabilityInvolvementImpl functionalChainAbstractCapabilityInvolvement = new FunctionalChainAbstractCapabilityInvolvementImpl();
		return functionalChainAbstractCapabilityInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractFunctionAbstractCapabilityInvolvement createAbstractFunctionAbstractCapabilityInvolvement() {
		AbstractFunctionAbstractCapabilityInvolvementImpl abstractFunctionAbstractCapabilityInvolvement = new AbstractFunctionAbstractCapabilityInvolvementImpl();
		return abstractFunctionAbstractCapabilityInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScenarioRealization createScenarioRealization() {
		ScenarioRealizationImpl scenarioRealization = new ScenarioRealizationImpl();
		return scenarioRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateFragment createStateFragment() {
		StateFragmentImpl stateFragment = new StateFragmentImpl();
		return stateFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArmTimerEvent createArmTimerEvent() {
		ArmTimerEventImpl armTimerEvent = new ArmTimerEventImpl();
		return armTimerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CancelTimerEvent createCancelTimerEvent() {
		CancelTimerEventImpl cancelTimerEvent = new CancelTimerEventImpl();
		return cancelTimerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintDuration createConstraintDuration() {
		ConstraintDurationImpl constraintDuration = new ConstraintDurationImpl();
		return constraintDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceMessageValuation createSequenceMessageValuation() {
		SequenceMessageValuationImpl sequenceMessageValuation = new SequenceMessageValuationImpl();
		return sequenceMessageValuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageKind createMessageKindFromString(EDataType eDataType, String initialValue) {
		MessageKind result = MessageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioKind createScenarioKindFromString(EDataType eDataType, String initialValue) {
		ScenarioKind result = ScenarioKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScenarioKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperatorKind createInteractionOperatorKindFromString(EDataType eDataType, String initialValue) {
		InteractionOperatorKind result = InteractionOperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteractionPackage getInteractionPackage() {
		return (InteractionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InteractionPackage getPackage() {
		return InteractionPackage.eINSTANCE;
	}

} //InteractionFactoryImpl
