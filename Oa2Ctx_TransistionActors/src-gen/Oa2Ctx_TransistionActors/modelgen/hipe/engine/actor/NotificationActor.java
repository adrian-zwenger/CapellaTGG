package Oa2Ctx_TransistionActors.modelgen.hipe.engine.actor;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;

import akka.actor.ActorRef;

import hipe.engine.actor.GenericNotificationActor;
import hipe.engine.util.IncUtil;

public class NotificationActor extends GenericNotificationActor {
	
	public NotificationActor(ActorRef dispatchActor, IncUtil incUtil, boolean cascadingNotifications) {
		super(dispatchActor, incUtil, cascadingNotifications);
	}
	
	@Override
	protected void initializeExploration() {
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getAbstractCapabilityExtend(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.AbstractCapabilityExtend _abstractcapabilityextend = (org.polarsys.capella.core.data.interaction.AbstractCapabilityExtend) obj;
			children.addAll(_abstractcapabilityextend.getOwnedExtensions());
			children.addAll(_abstractcapabilityextend.getOwnedConstraints());
			children.addAll(_abstractcapabilityextend.getOwnedMigratedElements());
			children.addAll(_abstractcapabilityextend.getOwnedPropertyValues());
			children.addAll(_abstractcapabilityextend.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractcapabilityextend.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getBlock(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.Block _block = (org.polarsys.capella.core.data.cs.Block) obj;
			children.addAll(_block.getOwnedExtensions());
			children.addAll(_block.getOwnedConstraints());
			children.addAll(_block.getOwnedMigratedElements());
			children.addAll(_block.getOwnedPropertyValues());
			children.addAll(_block.getOwnedEnumerationPropertyTypes());
			children.addAll(_block.getOwnedPropertyValueGroups());
			children.addAll(_block.getOwnedTraces());
			children.addAll(_block.getNamingRules());
			children.addAll(_block.getOwnedFunctionalAllocation());
			children.addAll(_block.getOwnedComponentExchanges());
			children.addAll(_block.getOwnedComponentExchangeCategories());
			if(_block.getOwnedAbstractCapabilityPkg() != null)
				children.add(_block.getOwnedAbstractCapabilityPkg());
			if(_block.getOwnedInterfacePkg() != null)
				children.add(_block.getOwnedInterfacePkg());
			if(_block.getOwnedDataPkg() != null)
				children.add(_block.getOwnedDataPkg());
			children.addAll(_block.getOwnedStateMachines());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getExchangeItem(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.ExchangeItem _exchangeitem = (org.polarsys.capella.core.data.information.ExchangeItem) obj;
			children.addAll(_exchangeitem.getOwnedExtensions());
			children.addAll(_exchangeitem.getOwnedConstraints());
			children.addAll(_exchangeitem.getOwnedMigratedElements());
			children.addAll(_exchangeitem.getOwnedPropertyValues());
			children.addAll(_exchangeitem.getOwnedEnumerationPropertyTypes());
			children.addAll(_exchangeitem.getOwnedPropertyValueGroups());
			children.addAll(_exchangeitem.getOwnedTraces());
			children.addAll(_exchangeitem.getNamingRules());
			children.addAll(_exchangeitem.getOwnedGeneralizations());
			children.addAll(_exchangeitem.getOwnedElements());
			children.addAll(_exchangeitem.getOwnedInformationRealizations());
			children.addAll(_exchangeitem.getOwnedExchangeItemInstances());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getGeneralClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.GeneralClass _generalclass = (org.polarsys.capella.core.data.capellacore.GeneralClass) obj;
			children.addAll(_generalclass.getOwnedExtensions());
			children.addAll(_generalclass.getOwnedConstraints());
			children.addAll(_generalclass.getOwnedMigratedElements());
			children.addAll(_generalclass.getOwnedPropertyValues());
			children.addAll(_generalclass.getOwnedEnumerationPropertyTypes());
			children.addAll(_generalclass.getOwnedPropertyValueGroups());
			children.addAll(_generalclass.getOwnedTraces());
			children.addAll(_generalclass.getNamingRules());
			children.addAll(_generalclass.getOwnedGeneralizations());
			children.addAll(_generalclass.getOwnedFeatures());
			children.addAll(_generalclass.getNestedGeneralClasses());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datatype.DatatypePackage.eINSTANCE.getNumericType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datatype.NumericType _numerictype = (org.polarsys.capella.core.data.information.datatype.NumericType) obj;
			children.addAll(_numerictype.getOwnedExtensions());
			children.addAll(_numerictype.getOwnedConstraints());
			children.addAll(_numerictype.getOwnedMigratedElements());
			children.addAll(_numerictype.getOwnedPropertyValues());
			children.addAll(_numerictype.getOwnedEnumerationPropertyTypes());
			children.addAll(_numerictype.getOwnedPropertyValueGroups());
			children.addAll(_numerictype.getOwnedTraces());
			children.addAll(_numerictype.getNamingRules());
			children.addAll(_numerictype.getOwnedGeneralizations());
			children.addAll(_numerictype.getOwnedPropertyValuePkgs());
			children.addAll(_numerictype.getOwnedDataValues());
			children.addAll(_numerictype.getOwnedInformationRealizations());
			if(_numerictype.getOwnedDefaultValue() != null)
				children.add(_numerictype.getOwnedDefaultValue());
			if(_numerictype.getOwnedNullValue() != null)
				children.add(_numerictype.getOwnedNullValue());
			if(_numerictype.getOwnedMinValue() != null)
				children.add(_numerictype.getOwnedMinValue());
			if(_numerictype.getOwnedMaxValue() != null)
				children.add(_numerictype.getOwnedMaxValue());
			return children;
		});
		explorationConsumer.put(behavior.BehaviorPackage.eINSTANCE.getAbstractBehavior(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			behavior.AbstractBehavior _abstractbehavior = (behavior.AbstractBehavior) obj;
			children.addAll(_abstractbehavior.getOwnedExtensions());
			children.addAll(_abstractbehavior.getOwnedConstraints());
			children.addAll(_abstractbehavior.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getPropertyValuePkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.PropertyValuePkg _propertyvaluepkg = (org.polarsys.capella.core.data.capellacore.PropertyValuePkg) obj;
			children.addAll(_propertyvaluepkg.getOwnedExtensions());
			children.addAll(_propertyvaluepkg.getOwnedConstraints());
			children.addAll(_propertyvaluepkg.getOwnedMigratedElements());
			children.addAll(_propertyvaluepkg.getOwnedPropertyValues());
			children.addAll(_propertyvaluepkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_propertyvaluepkg.getOwnedPropertyValueGroups());
			children.addAll(_propertyvaluepkg.getOwnedTraces());
			children.addAll(_propertyvaluepkg.getNamingRules());
			children.addAll(_propertyvaluepkg.getOwnedPropertyValuePkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getBlockArchitecture(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.BlockArchitecture _blockarchitecture = (org.polarsys.capella.core.data.cs.BlockArchitecture) obj;
			children.addAll(_blockarchitecture.getOwnedExtensions());
			children.addAll(_blockarchitecture.getOwnedConstraints());
			children.addAll(_blockarchitecture.getOwnedMigratedElements());
			children.addAll(_blockarchitecture.getOwnedPropertyValues());
			children.addAll(_blockarchitecture.getOwnedEnumerationPropertyTypes());
			children.addAll(_blockarchitecture.getOwnedPropertyValueGroups());
			children.addAll(_blockarchitecture.getOwnedTraces());
			children.addAll(_blockarchitecture.getNamingRules());
			children.addAll(_blockarchitecture.getOwnedPropertyValuePkgs());
			if(_blockarchitecture.getOwnedFunctionPkg() != null)
				children.add(_blockarchitecture.getOwnedFunctionPkg());
			children.addAll(_blockarchitecture.getOwnedComponentExchanges());
			children.addAll(_blockarchitecture.getOwnedComponentExchangeCategories());
			children.addAll(_blockarchitecture.getOwnedFunctionalLinks());
			children.addAll(_blockarchitecture.getOwnedFunctionalAllocations());
			children.addAll(_blockarchitecture.getOwnedComponentExchangeRealizations());
			children.addAll(_blockarchitecture.getOwnedRequirementPkgs());
			if(_blockarchitecture.getOwnedAbstractCapabilityPkg() != null)
				children.add(_blockarchitecture.getOwnedAbstractCapabilityPkg());
			if(_blockarchitecture.getOwnedInterfacePkg() != null)
				children.add(_blockarchitecture.getOwnedInterfacePkg());
			if(_blockarchitecture.getOwnedDataPkg() != null)
				children.add(_blockarchitecture.getOwnedDataPkg());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemCommunication(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.SystemCommunication _systemcommunication = (org.polarsys.capella.core.data.ctx.SystemCommunication) obj;
			children.addAll(_systemcommunication.getOwnedExtensions());
			children.addAll(_systemcommunication.getOwnedConstraints());
			children.addAll(_systemcommunication.getOwnedMigratedElements());
			children.addAll(_systemcommunication.getOwnedPropertyValues());
			children.addAll(_systemcommunication.getOwnedEnumerationPropertyTypes());
			children.addAll(_systemcommunication.getOwnedPropertyValueGroups());
			children.addAll(_systemcommunication.getEnds());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getKeyPart(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.KeyPart _keypart = (org.polarsys.capella.core.data.information.KeyPart) obj;
			children.addAll(_keypart.getOwnedExtensions());
			children.addAll(_keypart.getOwnedConstraints());
			children.addAll(_keypart.getOwnedMigratedElements());
			children.addAll(_keypart.getOwnedPropertyValues());
			children.addAll(_keypart.getOwnedEnumerationPropertyTypes());
			children.addAll(_keypart.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getRole(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.Role _role = (org.polarsys.capella.core.data.oa.Role) obj;
			children.addAll(_role.getOwnedExtensions());
			children.addAll(_role.getOwnedConstraints());
			children.addAll(_role.getOwnedMigratedElements());
			children.addAll(_role.getOwnedPropertyValues());
			children.addAll(_role.getOwnedEnumerationPropertyTypes());
			children.addAll(_role.getOwnedPropertyValueGroups());
			if(_role.getOwnedDefaultValue() != null)
				children.add(_role.getOwnedDefaultValue());
			if(_role.getOwnedMinValue() != null)
				children.add(_role.getOwnedMinValue());
			if(_role.getOwnedMaxValue() != null)
				children.add(_role.getOwnedMaxValue());
			if(_role.getOwnedNullValue() != null)
				children.add(_role.getOwnedNullValue());
			if(_role.getOwnedMinCard() != null)
				children.add(_role.getOwnedMinCard());
			if(_role.getOwnedMinLength() != null)
				children.add(_role.getOwnedMinLength());
			if(_role.getOwnedMaxCard() != null)
				children.add(_role.getOwnedMaxCard());
			if(_role.getOwnedMaxLength() != null)
				children.add(_role.getOwnedMaxLength());
			children.addAll(_role.getOwnedRoleAssemblyUsages());
			children.addAll(_role.getOwnedActivityAllocations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionPkg _functionpkg = (org.polarsys.capella.core.data.fa.FunctionPkg) obj;
			children.addAll(_functionpkg.getOwnedExtensions());
			children.addAll(_functionpkg.getOwnedConstraints());
			children.addAll(_functionpkg.getOwnedMigratedElements());
			children.addAll(_functionpkg.getOwnedPropertyValues());
			children.addAll(_functionpkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionpkg.getOwnedPropertyValueGroups());
			children.addAll(_functionpkg.getOwnedTraces());
			children.addAll(_functionpkg.getNamingRules());
			children.addAll(_functionpkg.getOwnedPropertyValuePkgs());
			children.addAll(_functionpkg.getOwnedFunctionalLinks());
			children.addAll(_functionpkg.getOwnedExchanges());
			children.addAll(_functionpkg.getOwnedExchangeSpecificationRealizations());
			children.addAll(_functionpkg.getOwnedCategories());
			children.addAll(_functionpkg.getOwnedFunctionSpecifications());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getGenericTrace(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.GenericTrace _generictrace = (org.polarsys.capella.core.data.capellacommon.GenericTrace) obj;
			children.addAll(_generictrace.getOwnedExtensions());
			children.addAll(_generictrace.getOwnedConstraints());
			children.addAll(_generictrace.getOwnedMigratedElements());
			children.addAll(_generictrace.getOwnedPropertyValues());
			children.addAll(_generictrace.getOwnedEnumerationPropertyTypes());
			children.addAll(_generictrace.getOwnedPropertyValueGroups());
			children.addAll(_generictrace.getKeyValuePairs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getAbstractInstance(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.AbstractInstance _abstractinstance = (org.polarsys.capella.core.data.information.AbstractInstance) obj;
			children.addAll(_abstractinstance.getOwnedExtensions());
			children.addAll(_abstractinstance.getOwnedConstraints());
			children.addAll(_abstractinstance.getOwnedMigratedElements());
			children.addAll(_abstractinstance.getOwnedPropertyValues());
			children.addAll(_abstractinstance.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractinstance.getOwnedPropertyValueGroups());
			if(_abstractinstance.getOwnedDefaultValue() != null)
				children.add(_abstractinstance.getOwnedDefaultValue());
			if(_abstractinstance.getOwnedMinValue() != null)
				children.add(_abstractinstance.getOwnedMinValue());
			if(_abstractinstance.getOwnedMaxValue() != null)
				children.add(_abstractinstance.getOwnedMaxValue());
			if(_abstractinstance.getOwnedNullValue() != null)
				children.add(_abstractinstance.getOwnedNullValue());
			if(_abstractinstance.getOwnedMinCard() != null)
				children.add(_abstractinstance.getOwnedMinCard());
			if(_abstractinstance.getOwnedMinLength() != null)
				children.add(_abstractinstance.getOwnedMinLength());
			if(_abstractinstance.getOwnedMaxCard() != null)
				children.add(_abstractinstance.getOwnedMaxCard());
			if(_abstractinstance.getOwnedMaxLength() != null)
				children.add(_abstractinstance.getOwnedMaxLength());
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getTGGRuleApplication(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionalChainReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionalChainReference _functionalchainreference = (org.polarsys.capella.core.data.fa.FunctionalChainReference) obj;
			children.addAll(_functionalchainreference.getOwnedExtensions());
			children.addAll(_functionalchainreference.getOwnedConstraints());
			children.addAll(_functionalchainreference.getOwnedMigratedElements());
			children.addAll(_functionalchainreference.getOwnedPropertyValues());
			children.addAll(_functionalchainreference.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionalchainreference.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getComponentFunctionalAllocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation _componentfunctionalallocation = (org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation) obj;
			children.addAll(_componentfunctionalallocation.getOwnedExtensions());
			children.addAll(_componentfunctionalallocation.getOwnedConstraints());
			children.addAll(_componentfunctionalallocation.getOwnedMigratedElements());
			children.addAll(_componentfunctionalallocation.getOwnedPropertyValues());
			children.addAll(_componentfunctionalallocation.getOwnedEnumerationPropertyTypes());
			children.addAll(_componentfunctionalallocation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(behavior.BehaviorPackage.eINSTANCE.getAbstractTimeEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			behavior.AbstractTimeEvent _abstracttimeevent = (behavior.AbstractTimeEvent) obj;
			children.addAll(_abstracttimeevent.getOwnedExtensions());
			children.addAll(_abstracttimeevent.getOwnedConstraints());
			children.addAll(_abstracttimeevent.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getExchangeItemInstance(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.ExchangeItemInstance _exchangeiteminstance = (org.polarsys.capella.core.data.information.ExchangeItemInstance) obj;
			children.addAll(_exchangeiteminstance.getOwnedExtensions());
			children.addAll(_exchangeiteminstance.getOwnedConstraints());
			children.addAll(_exchangeiteminstance.getOwnedMigratedElements());
			children.addAll(_exchangeiteminstance.getOwnedPropertyValues());
			children.addAll(_exchangeiteminstance.getOwnedEnumerationPropertyTypes());
			children.addAll(_exchangeiteminstance.getOwnedPropertyValueGroups());
			if(_exchangeiteminstance.getOwnedDefaultValue() != null)
				children.add(_exchangeiteminstance.getOwnedDefaultValue());
			if(_exchangeiteminstance.getOwnedMinValue() != null)
				children.add(_exchangeiteminstance.getOwnedMinValue());
			if(_exchangeiteminstance.getOwnedMaxValue() != null)
				children.add(_exchangeiteminstance.getOwnedMaxValue());
			if(_exchangeiteminstance.getOwnedNullValue() != null)
				children.add(_exchangeiteminstance.getOwnedNullValue());
			if(_exchangeiteminstance.getOwnedMinCard() != null)
				children.add(_exchangeiteminstance.getOwnedMinCard());
			if(_exchangeiteminstance.getOwnedMinLength() != null)
				children.add(_exchangeiteminstance.getOwnedMinLength());
			if(_exchangeiteminstance.getOwnedMaxCard() != null)
				children.add(_exchangeiteminstance.getOwnedMaxCard());
			if(_exchangeiteminstance.getOwnedMaxLength() != null)
				children.add(_exchangeiteminstance.getOwnedMaxLength());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getComplexValueReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.ComplexValueReference _complexvaluereference = (org.polarsys.capella.core.data.information.datavalue.ComplexValueReference) obj;
			children.addAll(_complexvaluereference.getOwnedExtensions());
			children.addAll(_complexvaluereference.getOwnedConstraints());
			children.addAll(_complexvaluereference.getOwnedMigratedElements());
			children.addAll(_complexvaluereference.getOwnedPropertyValues());
			children.addAll(_complexvaluereference.getOwnedEnumerationPropertyTypes());
			children.addAll(_complexvaluereference.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getTerminatePseudoState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.TerminatePseudoState _terminatepseudostate = (org.polarsys.capella.core.data.capellacommon.TerminatePseudoState) obj;
			children.addAll(_terminatepseudostate.getOwnedExtensions());
			children.addAll(_terminatepseudostate.getOwnedConstraints());
			children.addAll(_terminatepseudostate.getOwnedMigratedElements());
			children.addAll(_terminatepseudostate.getOwnedPropertyValues());
			children.addAll(_terminatepseudostate.getOwnedEnumerationPropertyTypes());
			children.addAll(_terminatepseudostate.getOwnedPropertyValueGroups());
			children.addAll(_terminatepseudostate.getOwnedAbstractStateRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getPhysicalPathInvolvement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.PhysicalPathInvolvement _physicalpathinvolvement = (org.polarsys.capella.core.data.cs.PhysicalPathInvolvement) obj;
			children.addAll(_physicalpathinvolvement.getOwnedExtensions());
			children.addAll(_physicalpathinvolvement.getOwnedConstraints());
			children.addAll(_physicalpathinvolvement.getOwnedMigratedElements());
			children.addAll(_physicalpathinvolvement.getOwnedPropertyValues());
			children.addAll(_physicalpathinvolvement.getOwnedEnumerationPropertyTypes());
			children.addAll(_physicalpathinvolvement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemComponentPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.SystemComponentPkg _systemcomponentpkg = (org.polarsys.capella.core.data.ctx.SystemComponentPkg) obj;
			children.addAll(_systemcomponentpkg.getOwnedExtensions());
			children.addAll(_systemcomponentpkg.getOwnedConstraints());
			children.addAll(_systemcomponentpkg.getOwnedMigratedElements());
			children.addAll(_systemcomponentpkg.getOwnedPropertyValues());
			children.addAll(_systemcomponentpkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_systemcomponentpkg.getOwnedPropertyValueGroups());
			children.addAll(_systemcomponentpkg.getOwnedTraces());
			children.addAll(_systemcomponentpkg.getNamingRules());
			children.addAll(_systemcomponentpkg.getOwnedPropertyValuePkgs());
			children.addAll(_systemcomponentpkg.getOwnedParts());
			children.addAll(_systemcomponentpkg.getOwnedComponentExchanges());
			children.addAll(_systemcomponentpkg.getOwnedComponentExchangeCategories());
			children.addAll(_systemcomponentpkg.getOwnedFunctionalLinks());
			children.addAll(_systemcomponentpkg.getOwnedFunctionalAllocations());
			children.addAll(_systemcomponentpkg.getOwnedComponentExchangeRealizations());
			children.addAll(_systemcomponentpkg.getOwnedPhysicalLinks());
			children.addAll(_systemcomponentpkg.getOwnedPhysicalLinkCategories());
			children.addAll(_systemcomponentpkg.getOwnedStateMachines());
			children.addAll(_systemcomponentpkg.getOwnedSystemComponents());
			children.addAll(_systemcomponentpkg.getOwnedSystemComponentPkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionPort(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionPort _functionport = (org.polarsys.capella.core.data.fa.FunctionPort) obj;
			children.addAll(_functionport.getOwnedExtensions());
			children.addAll(_functionport.getOwnedConstraints());
			children.addAll(_functionport.getOwnedMigratedElements());
			children.addAll(_functionport.getOwnedPropertyValues());
			children.addAll(_functionport.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionport.getOwnedPropertyValueGroups());
			children.addAll(_functionport.getOwnedProtocols());
			children.addAll(_functionport.getOwnedPortRealizations());
			children.addAll(_functionport.getOwnedPortAllocations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getCapellaElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.CapellaElement _capellaelement = (org.polarsys.capella.core.data.capellacore.CapellaElement) obj;
			children.addAll(_capellaelement.getOwnedExtensions());
			children.addAll(_capellaelement.getOwnedConstraints());
			children.addAll(_capellaelement.getOwnedMigratedElements());
			children.addAll(_capellaelement.getOwnedPropertyValues());
			children.addAll(_capellaelement.getOwnedEnumerationPropertyTypes());
			children.addAll(_capellaelement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getPhysicalPathReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.PhysicalPathReference _physicalpathreference = (org.polarsys.capella.core.data.cs.PhysicalPathReference) obj;
			children.addAll(_physicalpathreference.getOwnedExtensions());
			children.addAll(_physicalpathreference.getOwnedConstraints());
			children.addAll(_physicalpathreference.getOwnedMigratedElements());
			children.addAll(_physicalpathreference.getOwnedPropertyValues());
			children.addAll(_physicalpathreference.getOwnedEnumerationPropertyTypes());
			children.addAll(_physicalpathreference.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getValueSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.ValueSpecification _valuespecification = (modellingcore.ValueSpecification) obj;
			children.addAll(_valuespecification.getOwnedExtensions());
			children.addAll(_valuespecification.getOwnedConstraints());
			children.addAll(_valuespecification.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionalExchangeRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionalExchangeRealization _functionalexchangerealization = (org.polarsys.capella.core.data.fa.FunctionalExchangeRealization) obj;
			children.addAll(_functionalexchangerealization.getOwnedExtensions());
			children.addAll(_functionalexchangerealization.getOwnedConstraints());
			children.addAll(_functionalexchangerealization.getOwnedMigratedElements());
			children.addAll(_functionalexchangerealization.getOwnedPropertyValues());
			children.addAll(_functionalexchangerealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionalexchangerealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(behavior.BehaviorPackage.eINSTANCE.getAbstractMessageEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			behavior.AbstractMessageEvent _abstractmessageevent = (behavior.AbstractMessageEvent) obj;
			children.addAll(_abstractmessageevent.getOwnedExtensions());
			children.addAll(_abstractmessageevent.getOwnedConstraints());
			children.addAll(_abstractmessageevent.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getTrace(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.Trace _trace = (org.polarsys.capella.core.data.capellacore.Trace) obj;
			children.addAll(_trace.getOwnedExtensions());
			children.addAll(_trace.getOwnedConstraints());
			children.addAll(_trace.getOwnedMigratedElements());
			children.addAll(_trace.getOwnedPropertyValues());
			children.addAll(_trace.getOwnedEnumerationPropertyTypes());
			children.addAll(_trace.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemFunction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.SystemFunction _systemfunction = (org.polarsys.capella.core.data.ctx.SystemFunction) obj;
			children.addAll(_systemfunction.getOwnedExtensions());
			children.addAll(_systemfunction.getOwnedConstraints());
			children.addAll(_systemfunction.getOwnedMigratedElements());
			children.addAll(_systemfunction.getOwnedPropertyValues());
			children.addAll(_systemfunction.getOwnedEnumerationPropertyTypes());
			children.addAll(_systemfunction.getOwnedPropertyValueGroups());
			children.addAll(_systemfunction.getOwnedTraces());
			children.addAll(_systemfunction.getNamingRules());
			if(_systemfunction.getOwnedDefaultValue() != null)
				children.add(_systemfunction.getOwnedDefaultValue());
			if(_systemfunction.getOwnedMinValue() != null)
				children.add(_systemfunction.getOwnedMinValue());
			if(_systemfunction.getOwnedMaxValue() != null)
				children.add(_systemfunction.getOwnedMaxValue());
			if(_systemfunction.getOwnedNullValue() != null)
				children.add(_systemfunction.getOwnedNullValue());
			if(_systemfunction.getOwnedMinCard() != null)
				children.add(_systemfunction.getOwnedMinCard());
			if(_systemfunction.getOwnedMinLength() != null)
				children.add(_systemfunction.getOwnedMinLength());
			if(_systemfunction.getOwnedMaxCard() != null)
				children.add(_systemfunction.getOwnedMaxCard());
			if(_systemfunction.getOwnedMaxLength() != null)
				children.add(_systemfunction.getOwnedMaxLength());
			children.addAll(_systemfunction.getOwnedFunctionalChains());
			children.addAll(_systemfunction.getOwnedHandlers());
			if(_systemfunction.getLocalPrecondition() != null)
				children.add(_systemfunction.getLocalPrecondition());
			if(_systemfunction.getLocalPostcondition() != null)
				children.add(_systemfunction.getLocalPostcondition());
			children.addAll(_systemfunction.getInputs());
			children.addAll(_systemfunction.getOutputs());
			children.addAll(_systemfunction.getArguments());
			children.addAll(_systemfunction.getResults());
			children.addAll(_systemfunction.getOwnedFunctions());
			children.addAll(_systemfunction.getOwnedFunctionRealizations());
			children.addAll(_systemfunction.getOwnedFunctionalExchanges());
			children.addAll(_systemfunction.getOwnedSystemFunctionPkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getExceptionHandler(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.ExceptionHandler _exceptionhandler = (org.polarsys.capella.common.data.activity.ExceptionHandler) obj;
			children.addAll(_exceptionhandler.getOwnedExtensions());
			children.addAll(_exceptionhandler.getOwnedConstraints());
			children.addAll(_exceptionhandler.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datatype.DatatypePackage.eINSTANCE.getStringType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datatype.StringType _stringtype = (org.polarsys.capella.core.data.information.datatype.StringType) obj;
			children.addAll(_stringtype.getOwnedExtensions());
			children.addAll(_stringtype.getOwnedConstraints());
			children.addAll(_stringtype.getOwnedMigratedElements());
			children.addAll(_stringtype.getOwnedPropertyValues());
			children.addAll(_stringtype.getOwnedEnumerationPropertyTypes());
			children.addAll(_stringtype.getOwnedPropertyValueGroups());
			children.addAll(_stringtype.getOwnedTraces());
			children.addAll(_stringtype.getNamingRules());
			children.addAll(_stringtype.getOwnedGeneralizations());
			children.addAll(_stringtype.getOwnedPropertyValuePkgs());
			children.addAll(_stringtype.getOwnedDataValues());
			children.addAll(_stringtype.getOwnedInformationRealizations());
			if(_stringtype.getOwnedDefaultValue() != null)
				children.add(_stringtype.getOwnedDefaultValue());
			if(_stringtype.getOwnedNullValue() != null)
				children.add(_stringtype.getOwnedNullValue());
			if(_stringtype.getOwnedMinLength() != null)
				children.add(_stringtype.getOwnedMinLength());
			if(_stringtype.getOwnedMaxLength() != null)
				children.add(_stringtype.getOwnedMaxLength());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getShallowHistoryPseudoState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.ShallowHistoryPseudoState _shallowhistorypseudostate = (org.polarsys.capella.core.data.capellacommon.ShallowHistoryPseudoState) obj;
			children.addAll(_shallowhistorypseudostate.getOwnedExtensions());
			children.addAll(_shallowhistorypseudostate.getOwnedConstraints());
			children.addAll(_shallowhistorypseudostate.getOwnedMigratedElements());
			children.addAll(_shallowhistorypseudostate.getOwnedPropertyValues());
			children.addAll(_shallowhistorypseudostate.getOwnedEnumerationPropertyTypes());
			children.addAll(_shallowhistorypseudostate.getOwnedPropertyValueGroups());
			children.addAll(_shallowhistorypseudostate.getOwnedAbstractStateRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getAbstractCapabilityExtensionPoint(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.AbstractCapabilityExtensionPoint _abstractcapabilityextensionpoint = (org.polarsys.capella.core.data.interaction.AbstractCapabilityExtensionPoint) obj;
			children.addAll(_abstractcapabilityextensionpoint.getOwnedExtensions());
			children.addAll(_abstractcapabilityextensionpoint.getOwnedConstraints());
			children.addAll(_abstractcapabilityextensionpoint.getOwnedMigratedElements());
			children.addAll(_abstractcapabilityextensionpoint.getOwnedPropertyValues());
			children.addAll(_abstractcapabilityextensionpoint.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractcapabilityextensionpoint.getOwnedPropertyValueGroups());
			children.addAll(_abstractcapabilityextensionpoint.getNamingRules());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getDeploymentTarget(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.DeploymentTarget _deploymenttarget = (org.polarsys.capella.core.data.cs.DeploymentTarget) obj;
			children.addAll(_deploymenttarget.getOwnedExtensions());
			children.addAll(_deploymenttarget.getOwnedConstraints());
			children.addAll(_deploymenttarget.getOwnedMigratedElements());
			children.addAll(_deploymenttarget.getOwnedPropertyValues());
			children.addAll(_deploymenttarget.getOwnedEnumerationPropertyTypes());
			children.addAll(_deploymenttarget.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getEnumerationReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.EnumerationReference _enumerationreference = (org.polarsys.capella.core.data.information.datavalue.EnumerationReference) obj;
			children.addAll(_enumerationreference.getOwnedExtensions());
			children.addAll(_enumerationreference.getOwnedConstraints());
			children.addAll(_enumerationreference.getOwnedMigratedElements());
			children.addAll(_enumerationreference.getOwnedPropertyValues());
			children.addAll(_enumerationreference.getOwnedEnumerationPropertyTypes());
			children.addAll(_enumerationreference.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getPublishableElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.PublishableElement _publishableelement = (modellingcore.PublishableElement) obj;
			children.addAll(_publishableelement.getOwnedExtensions());
			children.addAll(_publishableelement.getOwnedConstraints());
			children.addAll(_publishableelement.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getStateFragment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.StateFragment _statefragment = (org.polarsys.capella.core.data.interaction.StateFragment) obj;
			children.addAll(_statefragment.getOwnedExtensions());
			children.addAll(_statefragment.getOwnedConstraints());
			children.addAll(_statefragment.getOwnedMigratedElements());
			children.addAll(_statefragment.getOwnedPropertyValues());
			children.addAll(_statefragment.getOwnedEnumerationPropertyTypes());
			children.addAll(_statefragment.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getAbstractExpressionValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.AbstractExpressionValue _abstractexpressionvalue = (org.polarsys.capella.core.data.information.datavalue.AbstractExpressionValue) obj;
			children.addAll(_abstractexpressionvalue.getOwnedExtensions());
			children.addAll(_abstractexpressionvalue.getOwnedConstraints());
			children.addAll(_abstractexpressionvalue.getOwnedMigratedElements());
			children.addAll(_abstractexpressionvalue.getOwnedPropertyValues());
			children.addAll(_abstractexpressionvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractexpressionvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getScenario(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.Scenario _scenario = (org.polarsys.capella.core.data.interaction.Scenario) obj;
			children.addAll(_scenario.getOwnedExtensions());
			children.addAll(_scenario.getOwnedConstraints());
			children.addAll(_scenario.getOwnedMigratedElements());
			children.addAll(_scenario.getOwnedPropertyValues());
			children.addAll(_scenario.getOwnedEnumerationPropertyTypes());
			children.addAll(_scenario.getOwnedPropertyValueGroups());
			children.addAll(_scenario.getOwnedTraces());
			children.addAll(_scenario.getNamingRules());
			children.addAll(_scenario.getOwnedInstanceRoles());
			children.addAll(_scenario.getOwnedMessages());
			children.addAll(_scenario.getOwnedInteractionFragments());
			children.addAll(_scenario.getOwnedTimeLapses());
			children.addAll(_scenario.getOwnedEvents());
			children.addAll(_scenario.getOwnedFormalGates());
			children.addAll(_scenario.getOwnedScenarioRealization());
			children.addAll(_scenario.getOwnedConstraintDurations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOperationalActivityPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.OperationalActivityPkg _operationalactivitypkg = (org.polarsys.capella.core.data.oa.OperationalActivityPkg) obj;
			children.addAll(_operationalactivitypkg.getOwnedExtensions());
			children.addAll(_operationalactivitypkg.getOwnedConstraints());
			children.addAll(_operationalactivitypkg.getOwnedMigratedElements());
			children.addAll(_operationalactivitypkg.getOwnedPropertyValues());
			children.addAll(_operationalactivitypkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_operationalactivitypkg.getOwnedPropertyValueGroups());
			children.addAll(_operationalactivitypkg.getOwnedTraces());
			children.addAll(_operationalactivitypkg.getNamingRules());
			children.addAll(_operationalactivitypkg.getOwnedPropertyValuePkgs());
			children.addAll(_operationalactivitypkg.getOwnedFunctionalLinks());
			children.addAll(_operationalactivitypkg.getOwnedExchanges());
			children.addAll(_operationalactivitypkg.getOwnedExchangeSpecificationRealizations());
			children.addAll(_operationalactivitypkg.getOwnedCategories());
			children.addAll(_operationalactivitypkg.getOwnedFunctionSpecifications());
			children.addAll(_operationalactivitypkg.getOwnedOperationalActivities());
			children.addAll(_operationalactivitypkg.getOwnedOperationalActivityPkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getAbstractState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.AbstractState _abstractstate = (org.polarsys.capella.core.data.capellacommon.AbstractState) obj;
			children.addAll(_abstractstate.getOwnedExtensions());
			children.addAll(_abstractstate.getOwnedConstraints());
			children.addAll(_abstractstate.getOwnedMigratedElements());
			children.addAll(_abstractstate.getOwnedPropertyValues());
			children.addAll(_abstractstate.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractstate.getOwnedPropertyValueGroups());
			children.addAll(_abstractstate.getOwnedAbstractStateRealizations());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getAbstractNamedElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.AbstractNamedElement _abstractnamedelement = (modellingcore.AbstractNamedElement) obj;
			children.addAll(_abstractnamedelement.getOwnedExtensions());
			children.addAll(_abstractnamedelement.getOwnedConstraints());
			children.addAll(_abstractnamedelement.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getAbstractCapabilityInclude(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.AbstractCapabilityInclude _abstractcapabilityinclude = (org.polarsys.capella.core.data.interaction.AbstractCapabilityInclude) obj;
			children.addAll(_abstractcapabilityinclude.getOwnedExtensions());
			children.addAll(_abstractcapabilityinclude.getOwnedConstraints());
			children.addAll(_abstractcapabilityinclude.getOwnedMigratedElements());
			children.addAll(_abstractcapabilityinclude.getOwnedPropertyValues());
			children.addAll(_abstractcapabilityinclude.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractcapabilityinclude.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getComponentPortAllocationEnd(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ComponentPortAllocationEnd _componentportallocationend = (org.polarsys.capella.core.data.fa.ComponentPortAllocationEnd) obj;
			children.addAll(_componentportallocationend.getOwnedExtensions());
			children.addAll(_componentportallocationend.getOwnedConstraints());
			children.addAll(_componentportallocationend.getOwnedMigratedElements());
			children.addAll(_componentportallocationend.getOwnedPropertyValues());
			children.addAll(_componentportallocationend.getOwnedEnumerationPropertyTypes());
			children.addAll(_componentportallocationend.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getCapabilityRealizationInvolvedElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvedElement _capabilityrealizationinvolvedelement = (org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvedElement) obj;
			children.addAll(_capabilityrealizationinvolvedelement.getOwnedExtensions());
			children.addAll(_capabilityrealizationinvolvedelement.getOwnedConstraints());
			children.addAll(_capabilityrealizationinvolvedelement.getOwnedMigratedElements());
			children.addAll(_capabilityrealizationinvolvedelement.getOwnedPropertyValues());
			children.addAll(_capabilityrealizationinvolvedelement.getOwnedEnumerationPropertyTypes());
			children.addAll(_capabilityrealizationinvolvedelement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getAbstractExchangeItem(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.AbstractExchangeItem _abstractexchangeitem = (modellingcore.AbstractExchangeItem) obj;
			children.addAll(_abstractexchangeitem.getOwnedExtensions());
			children.addAll(_abstractexchangeitem.getOwnedConstraints());
			children.addAll(_abstractexchangeitem.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getModelElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.ModelElement _modelelement = (modellingcore.ModelElement) obj;
			children.addAll(_modelelement.getOwnedExtensions());
			children.addAll(_modelelement.getOwnedConstraints());
			children.addAll(_modelelement.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getDataValueContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.DataValueContainer _datavaluecontainer = (org.polarsys.capella.core.data.information.datavalue.DataValueContainer) obj;
			children.addAll(_datavaluecontainer.getOwnedExtensions());
			children.addAll(_datavaluecontainer.getOwnedConstraints());
			children.addAll(_datavaluecontainer.getOwnedMigratedElements());
			children.addAll(_datavaluecontainer.getOwnedPropertyValues());
			children.addAll(_datavaluecontainer.getOwnedEnumerationPropertyTypes());
			children.addAll(_datavaluecontainer.getOwnedPropertyValueGroups());
			children.addAll(_datavaluecontainer.getOwnedTraces());
			children.addAll(_datavaluecontainer.getNamingRules());
			children.addAll(_datavaluecontainer.getOwnedPropertyValuePkgs());
			children.addAll(_datavaluecontainer.getOwnedDataValues());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getFinalState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.FinalState _finalstate = (org.polarsys.capella.core.data.capellacommon.FinalState) obj;
			children.addAll(_finalstate.getOwnedExtensions());
			children.addAll(_finalstate.getOwnedConstraints());
			children.addAll(_finalstate.getOwnedMigratedElements());
			children.addAll(_finalstate.getOwnedPropertyValues());
			children.addAll(_finalstate.getOwnedEnumerationPropertyTypes());
			children.addAll(_finalstate.getOwnedPropertyValueGroups());
			children.addAll(_finalstate.getOwnedAbstractStateRealizations());
			children.addAll(_finalstate.getOwnedRegions());
			children.addAll(_finalstate.getOwnedConnectionPoints());
			if(_finalstate.getStateInvariant() != null)
				children.add(_finalstate.getStateInvariant());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getDataValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.DataValue _datavalue = (org.polarsys.capella.core.data.information.datavalue.DataValue) obj;
			children.addAll(_datavalue.getOwnedExtensions());
			children.addAll(_datavalue.getOwnedConstraints());
			children.addAll(_datavalue.getOwnedMigratedElements());
			children.addAll(_datavalue.getOwnedPropertyValues());
			children.addAll(_datavalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_datavalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getConstraintDuration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.ConstraintDuration _constraintduration = (org.polarsys.capella.core.data.interaction.ConstraintDuration) obj;
			children.addAll(_constraintduration.getOwnedExtensions());
			children.addAll(_constraintduration.getOwnedConstraints());
			children.addAll(_constraintduration.getOwnedMigratedElements());
			children.addAll(_constraintduration.getOwnedPropertyValues());
			children.addAll(_constraintduration.getOwnedEnumerationPropertyTypes());
			children.addAll(_constraintduration.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getFinalizableElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.FinalizableElement _finalizableelement = (modellingcore.FinalizableElement) obj;
			children.addAll(_finalizableelement.getOwnedExtensions());
			children.addAll(_finalizableelement.getOwnedConstraints());
			children.addAll(_finalizableelement.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getAbstractModellingStructure(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.AbstractModellingStructure _abstractmodellingstructure = (org.polarsys.capella.core.data.capellacore.AbstractModellingStructure) obj;
			children.addAll(_abstractmodellingstructure.getOwnedExtensions());
			children.addAll(_abstractmodellingstructure.getOwnedConstraints());
			children.addAll(_abstractmodellingstructure.getOwnedMigratedElements());
			children.addAll(_abstractmodellingstructure.getOwnedPropertyValues());
			children.addAll(_abstractmodellingstructure.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractmodellingstructure.getOwnedPropertyValueGroups());
			children.addAll(_abstractmodellingstructure.getOwnedTraces());
			children.addAll(_abstractmodellingstructure.getNamingRules());
			children.addAll(_abstractmodellingstructure.getOwnedPropertyValuePkgs());
			children.addAll(_abstractmodellingstructure.getOwnedReuseLinks());
			children.addAll(_abstractmodellingstructure.getOwnedArchitectures());
			children.addAll(_abstractmodellingstructure.getOwnedArchitecturePkgs());
			return children;
		});
		explorationConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getLiteralStringValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.LiteralStringValue _literalstringvalue = (org.polarsys.capella.core.data.information.datavalue.LiteralStringValue) obj;
			children.addAll(_literalstringvalue.getOwnedExtensions());
			children.addAll(_literalstringvalue.getOwnedConstraints());
			children.addAll(_literalstringvalue.getOwnedMigratedElements());
			children.addAll(_literalstringvalue.getOwnedPropertyValues());
			children.addAll(_literalstringvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_literalstringvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getComponentExchangeAllocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ComponentExchangeAllocation _componentexchangeallocation = (org.polarsys.capella.core.data.fa.ComponentExchangeAllocation) obj;
			children.addAll(_componentexchangeallocation.getOwnedExtensions());
			children.addAll(_componentexchangeallocation.getOwnedConstraints());
			children.addAll(_componentexchangeallocation.getOwnedMigratedElements());
			children.addAll(_componentexchangeallocation.getOwnedPropertyValues());
			children.addAll(_componentexchangeallocation.getOwnedEnumerationPropertyTypes());
			children.addAll(_componentexchangeallocation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getLocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.Location _location = (org.polarsys.capella.core.data.oa.Location) obj;
			children.addAll(_location.getOwnedExtensions());
			children.addAll(_location.getOwnedConstraints());
			children.addAll(_location.getOwnedMigratedElements());
			children.addAll(_location.getOwnedPropertyValues());
			children.addAll(_location.getOwnedEnumerationPropertyTypes());
			children.addAll(_location.getOwnedPropertyValueGroups());
			children.addAll(_location.getOwnedTraces());
			children.addAll(_location.getNamingRules());
			children.addAll(_location.getOwnedFunctionalAllocation());
			children.addAll(_location.getOwnedComponentExchanges());
			children.addAll(_location.getOwnedComponentExchangeCategories());
			if(_location.getOwnedAbstractCapabilityPkg() != null)
				children.add(_location.getOwnedAbstractCapabilityPkg());
			if(_location.getOwnedInterfacePkg() != null)
				children.add(_location.getOwnedInterfacePkg());
			if(_location.getOwnedDataPkg() != null)
				children.add(_location.getOwnedDataPkg());
			children.addAll(_location.getOwnedStateMachines());
			children.addAll(_location.getOwnedGeneralizations());
			children.addAll(_location.getOwnedFeatures());
			children.addAll(_location.getOwnedInterfaceAllocations());
			children.addAll(_location.getOwnedCommunicationLinks());
			children.addAll(_location.getOwnedInterfaceUses());
			children.addAll(_location.getOwnedInterfaceImplementations());
			children.addAll(_location.getOwnedComponentRealizations());
			children.addAll(_location.getOwnedPhysicalPath());
			children.addAll(_location.getOwnedPhysicalLinks());
			children.addAll(_location.getOwnedPhysicalLinkCategories());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemFunctionPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.SystemFunctionPkg _systemfunctionpkg = (org.polarsys.capella.core.data.ctx.SystemFunctionPkg) obj;
			children.addAll(_systemfunctionpkg.getOwnedExtensions());
			children.addAll(_systemfunctionpkg.getOwnedConstraints());
			children.addAll(_systemfunctionpkg.getOwnedMigratedElements());
			children.addAll(_systemfunctionpkg.getOwnedPropertyValues());
			children.addAll(_systemfunctionpkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_systemfunctionpkg.getOwnedPropertyValueGroups());
			children.addAll(_systemfunctionpkg.getOwnedTraces());
			children.addAll(_systemfunctionpkg.getNamingRules());
			children.addAll(_systemfunctionpkg.getOwnedPropertyValuePkgs());
			children.addAll(_systemfunctionpkg.getOwnedFunctionalLinks());
			children.addAll(_systemfunctionpkg.getOwnedExchanges());
			children.addAll(_systemfunctionpkg.getOwnedExchangeSpecificationRealizations());
			children.addAll(_systemfunctionpkg.getOwnedCategories());
			children.addAll(_systemfunctionpkg.getOwnedFunctionSpecifications());
			children.addAll(_systemfunctionpkg.getOwnedSystemFunctions());
			children.addAll(_systemfunctionpkg.getOwnedSystemFunctionPkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getAbstractPhysicalLinkEnd(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.AbstractPhysicalLinkEnd _abstractphysicallinkend = (org.polarsys.capella.core.data.cs.AbstractPhysicalLinkEnd) obj;
			children.addAll(_abstractphysicallinkend.getOwnedExtensions());
			children.addAll(_abstractphysicallinkend.getOwnedConstraints());
			children.addAll(_abstractphysicallinkend.getOwnedMigratedElements());
			children.addAll(_abstractphysicallinkend.getOwnedPropertyValues());
			children.addAll(_abstractphysicallinkend.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractphysicallinkend.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getService(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.Service _service = (org.polarsys.capella.core.data.information.Service) obj;
			children.addAll(_service.getOwnedExtensions());
			children.addAll(_service.getOwnedConstraints());
			children.addAll(_service.getOwnedMigratedElements());
			children.addAll(_service.getOwnedPropertyValues());
			children.addAll(_service.getOwnedEnumerationPropertyTypes());
			children.addAll(_service.getOwnedPropertyValueGroups());
			children.addAll(_service.getOwnedParameters());
			children.addAll(_service.getOwnedOperationAllocation());
			children.addAll(_service.getOwnedExchangeItemRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getCapabilityPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.CapabilityPkg _capabilitypkg = (org.polarsys.capella.core.data.ctx.CapabilityPkg) obj;
			children.addAll(_capabilitypkg.getOwnedExtensions());
			children.addAll(_capabilitypkg.getOwnedConstraints());
			children.addAll(_capabilitypkg.getOwnedMigratedElements());
			children.addAll(_capabilitypkg.getOwnedPropertyValues());
			children.addAll(_capabilitypkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_capabilitypkg.getOwnedPropertyValueGroups());
			children.addAll(_capabilitypkg.getOwnedTraces());
			children.addAll(_capabilitypkg.getNamingRules());
			children.addAll(_capabilitypkg.getOwnedPropertyValuePkgs());
			children.addAll(_capabilitypkg.getOwnedCapabilities());
			children.addAll(_capabilitypkg.getOwnedCapabilityPkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.communication.CommunicationPackage.eINSTANCE.getMessage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.communication.Message _message = (org.polarsys.capella.core.data.information.communication.Message) obj;
			children.addAll(_message.getOwnedExtensions());
			children.addAll(_message.getOwnedConstraints());
			children.addAll(_message.getOwnedMigratedElements());
			children.addAll(_message.getOwnedPropertyValues());
			children.addAll(_message.getOwnedEnumerationPropertyTypes());
			children.addAll(_message.getOwnedPropertyValueGroups());
			children.addAll(_message.getOwnedTraces());
			children.addAll(_message.getNamingRules());
			children.addAll(_message.getOwnedGeneralizations());
			children.addAll(_message.getOwnedFeatures());
			children.addAll(_message.getOwnedPropertyValuePkgs());
			children.addAll(_message.getOwnedDataValues());
			children.addAll(_message.getOwnedStateMachines());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getDomainElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.DomainElement _domainelement = (org.polarsys.capella.core.data.information.DomainElement) obj;
			children.addAll(_domainelement.getOwnedExtensions());
			children.addAll(_domainelement.getOwnedConstraints());
			children.addAll(_domainelement.getOwnedMigratedElements());
			children.addAll(_domainelement.getOwnedPropertyValues());
			children.addAll(_domainelement.getOwnedEnumerationPropertyTypes());
			children.addAll(_domainelement.getOwnedPropertyValueGroups());
			children.addAll(_domainelement.getOwnedTraces());
			children.addAll(_domainelement.getNamingRules());
			children.addAll(_domainelement.getOwnedGeneralizations());
			children.addAll(_domainelement.getOwnedFeatures());
			children.addAll(_domainelement.getNestedGeneralClasses());
			children.addAll(_domainelement.getOwnedStateMachines());
			children.addAll(_domainelement.getOwnedDataValues());
			children.addAll(_domainelement.getOwnedInformationRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getExecution(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.Execution _execution = (org.polarsys.capella.core.data.interaction.Execution) obj;
			children.addAll(_execution.getOwnedExtensions());
			children.addAll(_execution.getOwnedConstraints());
			children.addAll(_execution.getOwnedMigratedElements());
			children.addAll(_execution.getOwnedPropertyValues());
			children.addAll(_execution.getOwnedEnumerationPropertyTypes());
			children.addAll(_execution.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.Parameter _parameter = (org.polarsys.capella.core.data.information.Parameter) obj;
			children.addAll(_parameter.getOwnedExtensions());
			children.addAll(_parameter.getOwnedConstraints());
			children.addAll(_parameter.getOwnedMigratedElements());
			children.addAll(_parameter.getOwnedPropertyValues());
			children.addAll(_parameter.getOwnedEnumerationPropertyTypes());
			children.addAll(_parameter.getOwnedPropertyValueGroups());
			if(_parameter.getOwnedDefaultValue() != null)
				children.add(_parameter.getOwnedDefaultValue());
			if(_parameter.getOwnedMinValue() != null)
				children.add(_parameter.getOwnedMinValue());
			if(_parameter.getOwnedMaxValue() != null)
				children.add(_parameter.getOwnedMaxValue());
			if(_parameter.getOwnedNullValue() != null)
				children.add(_parameter.getOwnedNullValue());
			if(_parameter.getOwnedMinCard() != null)
				children.add(_parameter.getOwnedMinCard());
			if(_parameter.getOwnedMinLength() != null)
				children.add(_parameter.getOwnedMinLength());
			if(_parameter.getOwnedMaxCard() != null)
				children.add(_parameter.getOwnedMaxCard());
			if(_parameter.getOwnedMaxLength() != null)
				children.add(_parameter.getOwnedMaxLength());
			if(_parameter.getRate() != null)
				children.add(_parameter.getRate());
			if(_parameter.getProbability() != null)
				children.add(_parameter.getProbability());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getConstraint(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.Constraint _constraint = (org.polarsys.capella.core.data.capellacore.Constraint) obj;
			children.addAll(_constraint.getOwnedExtensions());
			children.addAll(_constraint.getOwnedConstraints());
			children.addAll(_constraint.getOwnedMigratedElements());
			children.addAll(_constraint.getOwnedPropertyValues());
			children.addAll(_constraint.getOwnedEnumerationPropertyTypes());
			children.addAll(_constraint.getOwnedPropertyValueGroups());
			if(_constraint.getOwnedSpecification() != null)
				children.add(_constraint.getOwnedSpecification());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getStateEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.StateEvent _stateevent = (org.polarsys.capella.core.data.capellacommon.StateEvent) obj;
			children.addAll(_stateevent.getOwnedExtensions());
			children.addAll(_stateevent.getOwnedConstraints());
			children.addAll(_stateevent.getOwnedMigratedElements());
			children.addAll(_stateevent.getOwnedPropertyValues());
			children.addAll(_stateevent.getOwnedEnumerationPropertyTypes());
			children.addAll(_stateevent.getOwnedPropertyValueGroups());
			children.addAll(_stateevent.getOwnedStateEventRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getRolePkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.RolePkg _rolepkg = (org.polarsys.capella.core.data.oa.RolePkg) obj;
			children.addAll(_rolepkg.getOwnedExtensions());
			children.addAll(_rolepkg.getOwnedConstraints());
			children.addAll(_rolepkg.getOwnedMigratedElements());
			children.addAll(_rolepkg.getOwnedPropertyValues());
			children.addAll(_rolepkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_rolepkg.getOwnedPropertyValueGroups());
			children.addAll(_rolepkg.getOwnedTraces());
			children.addAll(_rolepkg.getNamingRules());
			children.addAll(_rolepkg.getOwnedPropertyValuePkgs());
			children.addAll(_rolepkg.getOwnedRolePkgs());
			children.addAll(_rolepkg.getOwnedRoles());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getExecutableNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.ExecutableNode _executablenode = (org.polarsys.capella.common.data.activity.ExecutableNode) obj;
			children.addAll(_executablenode.getOwnedExtensions());
			children.addAll(_executablenode.getOwnedConstraints());
			children.addAll(_executablenode.getOwnedMigratedElements());
			children.addAll(_executablenode.getOwnedHandlers());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getNamespace(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.Namespace _namespace = (org.polarsys.capella.core.data.capellacore.Namespace) obj;
			children.addAll(_namespace.getOwnedExtensions());
			children.addAll(_namespace.getOwnedConstraints());
			children.addAll(_namespace.getOwnedMigratedElements());
			children.addAll(_namespace.getOwnedPropertyValues());
			children.addAll(_namespace.getOwnedEnumerationPropertyTypes());
			children.addAll(_namespace.getOwnedPropertyValueGroups());
			children.addAll(_namespace.getOwnedTraces());
			children.addAll(_namespace.getNamingRules());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getControlFlow(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.ControlFlow _controlflow = (org.polarsys.capella.common.data.activity.ControlFlow) obj;
			children.addAll(_controlflow.getOwnedExtensions());
			children.addAll(_controlflow.getOwnedConstraints());
			children.addAll(_controlflow.getOwnedMigratedElements());
			if(_controlflow.getRate() != null)
				children.add(_controlflow.getRate());
			if(_controlflow.getProbability() != null)
				children.add(_controlflow.getProbability());
			if(_controlflow.getGuard() != null)
				children.add(_controlflow.getGuard());
			if(_controlflow.getWeight() != null)
				children.add(_controlflow.getWeight());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getCapabilityConfiguration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.CapabilityConfiguration _capabilityconfiguration = (org.polarsys.capella.core.data.oa.CapabilityConfiguration) obj;
			children.addAll(_capabilityconfiguration.getOwnedExtensions());
			children.addAll(_capabilityconfiguration.getOwnedConstraints());
			children.addAll(_capabilityconfiguration.getOwnedMigratedElements());
			children.addAll(_capabilityconfiguration.getOwnedPropertyValues());
			children.addAll(_capabilityconfiguration.getOwnedEnumerationPropertyTypes());
			children.addAll(_capabilityconfiguration.getOwnedPropertyValueGroups());
			children.addAll(_capabilityconfiguration.getOwnedTraces());
			children.addAll(_capabilityconfiguration.getNamingRules());
			children.addAll(_capabilityconfiguration.getOwnedFunctionalAllocation());
			children.addAll(_capabilityconfiguration.getOwnedComponentExchanges());
			children.addAll(_capabilityconfiguration.getOwnedComponentExchangeCategories());
			if(_capabilityconfiguration.getOwnedAbstractCapabilityPkg() != null)
				children.add(_capabilityconfiguration.getOwnedAbstractCapabilityPkg());
			if(_capabilityconfiguration.getOwnedInterfacePkg() != null)
				children.add(_capabilityconfiguration.getOwnedInterfacePkg());
			if(_capabilityconfiguration.getOwnedDataPkg() != null)
				children.add(_capabilityconfiguration.getOwnedDataPkg());
			children.addAll(_capabilityconfiguration.getOwnedStateMachines());
			children.addAll(_capabilityconfiguration.getOwnedGeneralizations());
			children.addAll(_capabilityconfiguration.getOwnedFeatures());
			children.addAll(_capabilityconfiguration.getOwnedInterfaceAllocations());
			children.addAll(_capabilityconfiguration.getOwnedCommunicationLinks());
			children.addAll(_capabilityconfiguration.getOwnedInterfaceUses());
			children.addAll(_capabilityconfiguration.getOwnedInterfaceImplementations());
			children.addAll(_capabilityconfiguration.getOwnedComponentRealizations());
			children.addAll(_capabilityconfiguration.getOwnedPhysicalPath());
			children.addAll(_capabilityconfiguration.getOwnedPhysicalLinks());
			children.addAll(_capabilityconfiguration.getOwnedPhysicalLinkCategories());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getAbstractFunctionAbstractCapabilityInvolvement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.AbstractFunctionAbstractCapabilityInvolvement _abstractfunctionabstractcapabilityinvolvement = (org.polarsys.capella.core.data.interaction.AbstractFunctionAbstractCapabilityInvolvement) obj;
			children.addAll(_abstractfunctionabstractcapabilityinvolvement.getOwnedExtensions());
			children.addAll(_abstractfunctionabstractcapabilityinvolvement.getOwnedConstraints());
			children.addAll(_abstractfunctionabstractcapabilityinvolvement.getOwnedMigratedElements());
			children.addAll(_abstractfunctionabstractcapabilityinvolvement.getOwnedPropertyValues());
			children.addAll(_abstractfunctionabstractcapabilityinvolvement.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractfunctionabstractcapabilityinvolvement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getAbstractActivity(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.AbstractActivity _abstractactivity = (org.polarsys.capella.common.data.activity.AbstractActivity) obj;
			children.addAll(_abstractactivity.getOwnedExtensions());
			children.addAll(_abstractactivity.getOwnedConstraints());
			children.addAll(_abstractactivity.getOwnedMigratedElements());
			children.addAll(_abstractactivity.getOwnedNodes());
			children.addAll(_abstractactivity.getOwnedEdges());
			children.addAll(_abstractactivity.getOwnedGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getComponentExchangeRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ComponentExchangeRealization _componentexchangerealization = (org.polarsys.capella.core.data.fa.ComponentExchangeRealization) obj;
			children.addAll(_componentexchangerealization.getOwnedExtensions());
			children.addAll(_componentexchangerealization.getOwnedConstraints());
			children.addAll(_componentexchangerealization.getOwnedMigratedElements());
			children.addAll(_componentexchangerealization.getOwnedPropertyValues());
			children.addAll(_componentexchangerealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_componentexchangerealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getBooleanPropertyValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.BooleanPropertyValue _booleanpropertyvalue = (org.polarsys.capella.core.data.capellacore.BooleanPropertyValue) obj;
			children.addAll(_booleanpropertyvalue.getOwnedExtensions());
			children.addAll(_booleanpropertyvalue.getOwnedConstraints());
			children.addAll(_booleanpropertyvalue.getOwnedMigratedElements());
			children.addAll(_booleanpropertyvalue.getOwnedPropertyValues());
			children.addAll(_booleanpropertyvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_booleanpropertyvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getDeployableElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.DeployableElement _deployableelement = (org.polarsys.capella.core.data.cs.DeployableElement) obj;
			children.addAll(_deployableelement.getOwnedExtensions());
			children.addAll(_deployableelement.getOwnedConstraints());
			children.addAll(_deployableelement.getOwnedMigratedElements());
			children.addAll(_deployableelement.getOwnedPropertyValues());
			children.addAll(_deployableelement.getOwnedEnumerationPropertyTypes());
			children.addAll(_deployableelement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getAbstractParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.AbstractParameter _abstractparameter = (modellingcore.AbstractParameter) obj;
			children.addAll(_abstractparameter.getOwnedExtensions());
			children.addAll(_abstractparameter.getOwnedConstraints());
			children.addAll(_abstractparameter.getOwnedMigratedElements());
			if(_abstractparameter.getRate() != null)
				children.add(_abstractparameter.getRate());
			if(_abstractparameter.getProbability() != null)
				children.add(_abstractparameter.getProbability());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getStateMachine(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.StateMachine _statemachine = (org.polarsys.capella.core.data.capellacommon.StateMachine) obj;
			children.addAll(_statemachine.getOwnedExtensions());
			children.addAll(_statemachine.getOwnedConstraints());
			children.addAll(_statemachine.getOwnedMigratedElements());
			children.addAll(_statemachine.getOwnedPropertyValues());
			children.addAll(_statemachine.getOwnedEnumerationPropertyTypes());
			children.addAll(_statemachine.getOwnedPropertyValueGroups());
			children.addAll(_statemachine.getOwnedRegions());
			children.addAll(_statemachine.getOwnedConnectionPoints());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getRoleAllocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.RoleAllocation _roleallocation = (org.polarsys.capella.core.data.oa.RoleAllocation) obj;
			children.addAll(_roleallocation.getOwnedExtensions());
			children.addAll(_roleallocation.getOwnedConstraints());
			children.addAll(_roleallocation.getOwnedMigratedElements());
			children.addAll(_roleallocation.getOwnedPropertyValues());
			children.addAll(_roleallocation.getOwnedEnumerationPropertyTypes());
			children.addAll(_roleallocation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getRelationship(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.Relationship _relationship = (org.polarsys.capella.core.data.capellacore.Relationship) obj;
			children.addAll(_relationship.getOwnedExtensions());
			children.addAll(_relationship.getOwnedConstraints());
			children.addAll(_relationship.getOwnedMigratedElements());
			children.addAll(_relationship.getOwnedPropertyValues());
			children.addAll(_relationship.getOwnedEnumerationPropertyTypes());
			children.addAll(_relationship.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getEntityPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.EntityPkg _entitypkg = (org.polarsys.capella.core.data.oa.EntityPkg) obj;
			children.addAll(_entitypkg.getOwnedExtensions());
			children.addAll(_entitypkg.getOwnedConstraints());
			children.addAll(_entitypkg.getOwnedMigratedElements());
			children.addAll(_entitypkg.getOwnedPropertyValues());
			children.addAll(_entitypkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_entitypkg.getOwnedPropertyValueGroups());
			children.addAll(_entitypkg.getOwnedTraces());
			children.addAll(_entitypkg.getNamingRules());
			children.addAll(_entitypkg.getOwnedPropertyValuePkgs());
			children.addAll(_entitypkg.getOwnedParts());
			children.addAll(_entitypkg.getOwnedComponentExchanges());
			children.addAll(_entitypkg.getOwnedComponentExchangeCategories());
			children.addAll(_entitypkg.getOwnedFunctionalLinks());
			children.addAll(_entitypkg.getOwnedFunctionalAllocations());
			children.addAll(_entitypkg.getOwnedComponentExchangeRealizations());
			children.addAll(_entitypkg.getOwnedPhysicalLinks());
			children.addAll(_entitypkg.getOwnedPhysicalLinkCategories());
			children.addAll(_entitypkg.getOwnedStateMachines());
			children.addAll(_entitypkg.getOwnedEntities());
			children.addAll(_entitypkg.getOwnedEntityPkgs());
			children.addAll(_entitypkg.getOwnedLocations());
			children.addAll(_entitypkg.getOwnedCommunicationMeans());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getGeneralizableElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.GeneralizableElement _generalizableelement = (org.polarsys.capella.core.data.capellacore.GeneralizableElement) obj;
			children.addAll(_generalizableelement.getOwnedExtensions());
			children.addAll(_generalizableelement.getOwnedConstraints());
			children.addAll(_generalizableelement.getOwnedMigratedElements());
			children.addAll(_generalizableelement.getOwnedPropertyValues());
			children.addAll(_generalizableelement.getOwnedEnumerationPropertyTypes());
			children.addAll(_generalizableelement.getOwnedPropertyValueGroups());
			children.addAll(_generalizableelement.getOwnedTraces());
			children.addAll(_generalizableelement.getNamingRules());
			children.addAll(_generalizableelement.getOwnedGeneralizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getBooleanReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.BooleanReference _booleanreference = (org.polarsys.capella.core.data.information.datavalue.BooleanReference) obj;
			children.addAll(_booleanreference.getOwnedExtensions());
			children.addAll(_booleanreference.getOwnedConstraints());
			children.addAll(_booleanreference.getOwnedMigratedElements());
			children.addAll(_booleanreference.getOwnedPropertyValues());
			children.addAll(_booleanreference.getOwnedEnumerationPropertyTypes());
			children.addAll(_booleanreference.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getMission(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.Mission _mission = (org.polarsys.capella.core.data.ctx.Mission) obj;
			children.addAll(_mission.getOwnedExtensions());
			children.addAll(_mission.getOwnedConstraints());
			children.addAll(_mission.getOwnedMigratedElements());
			children.addAll(_mission.getOwnedPropertyValues());
			children.addAll(_mission.getOwnedEnumerationPropertyTypes());
			children.addAll(_mission.getOwnedPropertyValueGroups());
			children.addAll(_mission.getOwnedMissionInvolvements());
			children.addAll(_mission.getOwnedCapabilityExploitations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getModellingArchitecture(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.ModellingArchitecture _modellingarchitecture = (org.polarsys.capella.core.data.capellacore.ModellingArchitecture) obj;
			children.addAll(_modellingarchitecture.getOwnedExtensions());
			children.addAll(_modellingarchitecture.getOwnedConstraints());
			children.addAll(_modellingarchitecture.getOwnedMigratedElements());
			children.addAll(_modellingarchitecture.getOwnedPropertyValues());
			children.addAll(_modellingarchitecture.getOwnedEnumerationPropertyTypes());
			children.addAll(_modellingarchitecture.getOwnedPropertyValueGroups());
			children.addAll(_modellingarchitecture.getOwnedTraces());
			children.addAll(_modellingarchitecture.getNamingRules());
			children.addAll(_modellingarchitecture.getOwnedPropertyValuePkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getOperationalAnalysisRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.OperationalAnalysisRealization _operationalanalysisrealization = (org.polarsys.capella.core.data.ctx.OperationalAnalysisRealization) obj;
			children.addAll(_operationalanalysisrealization.getOwnedExtensions());
			children.addAll(_operationalanalysisrealization.getOwnedConstraints());
			children.addAll(_operationalanalysisrealization.getOwnedMigratedElements());
			children.addAll(_operationalanalysisrealization.getOwnedPropertyValues());
			children.addAll(_operationalanalysisrealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_operationalanalysisrealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getSequenceMessage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.SequenceMessage _sequencemessage = (org.polarsys.capella.core.data.interaction.SequenceMessage) obj;
			children.addAll(_sequencemessage.getOwnedExtensions());
			children.addAll(_sequencemessage.getOwnedConstraints());
			children.addAll(_sequencemessage.getOwnedMigratedElements());
			children.addAll(_sequencemessage.getOwnedPropertyValues());
			children.addAll(_sequencemessage.getOwnedEnumerationPropertyTypes());
			children.addAll(_sequencemessage.getOwnedPropertyValueGroups());
			children.addAll(_sequencemessage.getOwnedSequenceMessageValuations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getNamedRelationship(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.NamedRelationship _namedrelationship = (org.polarsys.capella.core.data.capellacore.NamedRelationship) obj;
			children.addAll(_namedrelationship.getOwnedExtensions());
			children.addAll(_namedrelationship.getOwnedConstraints());
			children.addAll(_namedrelationship.getOwnedMigratedElements());
			children.addAll(_namedrelationship.getOwnedPropertyValues());
			children.addAll(_namedrelationship.getOwnedEnumerationPropertyTypes());
			children.addAll(_namedrelationship.getOwnedPropertyValueGroups());
			children.addAll(_namedrelationship.getNamingRules());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getLiteralBooleanValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.LiteralBooleanValue _literalbooleanvalue = (org.polarsys.capella.core.data.information.datavalue.LiteralBooleanValue) obj;
			children.addAll(_literalbooleanvalue.getOwnedExtensions());
			children.addAll(_literalbooleanvalue.getOwnedConstraints());
			children.addAll(_literalbooleanvalue.getOwnedMigratedElements());
			children.addAll(_literalbooleanvalue.getOwnedPropertyValues());
			children.addAll(_literalbooleanvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_literalbooleanvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getComponentExchangeCategory(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ComponentExchangeCategory _componentexchangecategory = (org.polarsys.capella.core.data.fa.ComponentExchangeCategory) obj;
			children.addAll(_componentexchangecategory.getOwnedExtensions());
			children.addAll(_componentexchangecategory.getOwnedConstraints());
			children.addAll(_componentexchangecategory.getOwnedMigratedElements());
			children.addAll(_componentexchangecategory.getOwnedPropertyValues());
			children.addAll(_componentexchangecategory.getOwnedEnumerationPropertyTypes());
			children.addAll(_componentexchangecategory.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datatype.DatatypePackage.eINSTANCE.getDataType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datatype.DataType _datatype = (org.polarsys.capella.core.data.information.datatype.DataType) obj;
			children.addAll(_datatype.getOwnedExtensions());
			children.addAll(_datatype.getOwnedConstraints());
			children.addAll(_datatype.getOwnedMigratedElements());
			children.addAll(_datatype.getOwnedPropertyValues());
			children.addAll(_datatype.getOwnedEnumerationPropertyTypes());
			children.addAll(_datatype.getOwnedPropertyValueGroups());
			children.addAll(_datatype.getOwnedTraces());
			children.addAll(_datatype.getNamingRules());
			children.addAll(_datatype.getOwnedGeneralizations());
			children.addAll(_datatype.getOwnedPropertyValuePkgs());
			children.addAll(_datatype.getOwnedDataValues());
			children.addAll(_datatype.getOwnedInformationRealizations());
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getProtocol(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			runtime.Protocol _protocol = (runtime.Protocol) obj;
			children.addAll(_protocol.getSteps());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getModellingBlock(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.ModellingBlock _modellingblock = (org.polarsys.capella.core.data.capellacore.ModellingBlock) obj;
			children.addAll(_modellingblock.getOwnedExtensions());
			children.addAll(_modellingblock.getOwnedConstraints());
			children.addAll(_modellingblock.getOwnedMigratedElements());
			children.addAll(_modellingblock.getOwnedPropertyValues());
			children.addAll(_modellingblock.getOwnedEnumerationPropertyTypes());
			children.addAll(_modellingblock.getOwnedPropertyValueGroups());
			children.addAll(_modellingblock.getOwnedTraces());
			children.addAll(_modellingblock.getNamingRules());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getInteractionOperand(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.InteractionOperand _interactionoperand = (org.polarsys.capella.core.data.interaction.InteractionOperand) obj;
			children.addAll(_interactionoperand.getOwnedExtensions());
			children.addAll(_interactionoperand.getOwnedConstraints());
			children.addAll(_interactionoperand.getOwnedMigratedElements());
			children.addAll(_interactionoperand.getOwnedPropertyValues());
			children.addAll(_interactionoperand.getOwnedEnumerationPropertyTypes());
			children.addAll(_interactionoperand.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.kitalpha.emde.model.EmdePackage.eINSTANCE.getElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getActivityExchange(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.ActivityExchange _activityexchange = (org.polarsys.capella.common.data.activity.ActivityExchange) obj;
			children.addAll(_activityexchange.getOwnedExtensions());
			children.addAll(_activityexchange.getOwnedConstraints());
			children.addAll(_activityexchange.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getExchangeSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ExchangeSpecification _exchangespecification = (org.polarsys.capella.core.data.fa.ExchangeSpecification) obj;
			children.addAll(_exchangespecification.getOwnedExtensions());
			children.addAll(_exchangespecification.getOwnedConstraints());
			children.addAll(_exchangespecification.getOwnedMigratedElements());
			children.addAll(_exchangespecification.getOwnedPropertyValues());
			children.addAll(_exchangespecification.getOwnedEnumerationPropertyTypes());
			children.addAll(_exchangespecification.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getMode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.Mode _mode = (org.polarsys.capella.core.data.capellacommon.Mode) obj;
			children.addAll(_mode.getOwnedExtensions());
			children.addAll(_mode.getOwnedConstraints());
			children.addAll(_mode.getOwnedMigratedElements());
			children.addAll(_mode.getOwnedPropertyValues());
			children.addAll(_mode.getOwnedEnumerationPropertyTypes());
			children.addAll(_mode.getOwnedPropertyValueGroups());
			children.addAll(_mode.getOwnedAbstractStateRealizations());
			children.addAll(_mode.getOwnedRegions());
			children.addAll(_mode.getOwnedConnectionPoints());
			if(_mode.getStateInvariant() != null)
				children.add(_mode.getStateInvariant());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOrganisationalUnitComposition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.OrganisationalUnitComposition _organisationalunitcomposition = (org.polarsys.capella.core.data.oa.OrganisationalUnitComposition) obj;
			children.addAll(_organisationalunitcomposition.getOwnedExtensions());
			children.addAll(_organisationalunitcomposition.getOwnedConstraints());
			children.addAll(_organisationalunitcomposition.getOwnedMigratedElements());
			children.addAll(_organisationalunitcomposition.getOwnedPropertyValues());
			children.addAll(_organisationalunitcomposition.getOwnedEnumerationPropertyTypes());
			children.addAll(_organisationalunitcomposition.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getStringReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.StringReference _stringreference = (org.polarsys.capella.core.data.information.datavalue.StringReference) obj;
			children.addAll(_stringreference.getOwnedExtensions());
			children.addAll(_stringreference.getOwnedConstraints());
			children.addAll(_stringreference.getOwnedMigratedElements());
			children.addAll(_stringreference.getOwnedPropertyValues());
			children.addAll(_stringreference.getOwnedEnumerationPropertyTypes());
			children.addAll(_stringreference.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getBinaryExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.BinaryExpression _binaryexpression = (org.polarsys.capella.core.data.information.datavalue.BinaryExpression) obj;
			children.addAll(_binaryexpression.getOwnedExtensions());
			children.addAll(_binaryexpression.getOwnedConstraints());
			children.addAll(_binaryexpression.getOwnedMigratedElements());
			children.addAll(_binaryexpression.getOwnedPropertyValues());
			children.addAll(_binaryexpression.getOwnedEnumerationPropertyTypes());
			children.addAll(_binaryexpression.getOwnedPropertyValueGroups());
			if(_binaryexpression.getOwnedLeftOperand() != null)
				children.add(_binaryexpression.getOwnedLeftOperand());
			if(_binaryexpression.getOwnedRightOperand() != null)
				children.add(_binaryexpression.getOwnedRightOperand());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getActivityEdge(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.ActivityEdge _activityedge = (org.polarsys.capella.common.data.activity.ActivityEdge) obj;
			children.addAll(_activityedge.getOwnedExtensions());
			children.addAll(_activityedge.getOwnedConstraints());
			children.addAll(_activityedge.getOwnedMigratedElements());
			if(_activityedge.getRate() != null)
				children.add(_activityedge.getRate());
			if(_activityedge.getProbability() != null)
				children.add(_activityedge.getProbability());
			if(_activityedge.getGuard() != null)
				children.add(_activityedge.getGuard());
			if(_activityedge.getWeight() != null)
				children.add(_activityedge.getWeight());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.State _state = (org.polarsys.capella.core.data.capellacommon.State) obj;
			children.addAll(_state.getOwnedExtensions());
			children.addAll(_state.getOwnedConstraints());
			children.addAll(_state.getOwnedMigratedElements());
			children.addAll(_state.getOwnedPropertyValues());
			children.addAll(_state.getOwnedEnumerationPropertyTypes());
			children.addAll(_state.getOwnedPropertyValueGroups());
			children.addAll(_state.getOwnedAbstractStateRealizations());
			children.addAll(_state.getOwnedRegions());
			children.addAll(_state.getOwnedConnectionPoints());
			if(_state.getStateInvariant() != null)
				children.add(_state.getStateInvariant());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getAbstractPhysicalArtifact(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.AbstractPhysicalArtifact _abstractphysicalartifact = (org.polarsys.capella.core.data.cs.AbstractPhysicalArtifact) obj;
			children.addAll(_abstractphysicalartifact.getOwnedExtensions());
			children.addAll(_abstractphysicalartifact.getOwnedConstraints());
			children.addAll(_abstractphysicalartifact.getOwnedMigratedElements());
			children.addAll(_abstractphysicalartifact.getOwnedPropertyValues());
			children.addAll(_abstractphysicalartifact.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractphysicalartifact.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getAbstractTypedElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.AbstractTypedElement _abstracttypedelement = (modellingcore.AbstractTypedElement) obj;
			children.addAll(_abstracttypedelement.getOwnedExtensions());
			children.addAll(_abstracttypedelement.getOwnedConstraints());
			children.addAll(_abstracttypedelement.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getNumericValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.NumericValue _numericvalue = (org.polarsys.capella.core.data.information.datavalue.NumericValue) obj;
			children.addAll(_numericvalue.getOwnedExtensions());
			children.addAll(_numericvalue.getOwnedConstraints());
			children.addAll(_numericvalue.getOwnedMigratedElements());
			children.addAll(_numericvalue.getOwnedPropertyValues());
			children.addAll(_numericvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_numericvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getAbstractStringValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.AbstractStringValue _abstractstringvalue = (org.polarsys.capella.core.data.information.datavalue.AbstractStringValue) obj;
			children.addAll(_abstractstringvalue.getOwnedExtensions());
			children.addAll(_abstractstringvalue.getOwnedConstraints());
			children.addAll(_abstractstringvalue.getOwnedMigratedElements());
			children.addAll(_abstractstringvalue.getOwnedPropertyValues());
			children.addAll(_abstractstringvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractstringvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getChoicePseudoState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.ChoicePseudoState _choicepseudostate = (org.polarsys.capella.core.data.capellacommon.ChoicePseudoState) obj;
			children.addAll(_choicepseudostate.getOwnedExtensions());
			children.addAll(_choicepseudostate.getOwnedConstraints());
			children.addAll(_choicepseudostate.getOwnedMigratedElements());
			children.addAll(_choicepseudostate.getOwnedPropertyValues());
			children.addAll(_choicepseudostate.getOwnedEnumerationPropertyTypes());
			children.addAll(_choicepseudostate.getOwnedPropertyValueGroups());
			children.addAll(_choicepseudostate.getOwnedAbstractStateRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getAbstractFunctionalChainContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.AbstractFunctionalChainContainer _abstractfunctionalchaincontainer = (org.polarsys.capella.core.data.fa.AbstractFunctionalChainContainer) obj;
			children.addAll(_abstractfunctionalchaincontainer.getOwnedExtensions());
			children.addAll(_abstractfunctionalchaincontainer.getOwnedConstraints());
			children.addAll(_abstractfunctionalchaincontainer.getOwnedMigratedElements());
			children.addAll(_abstractfunctionalchaincontainer.getOwnedPropertyValues());
			children.addAll(_abstractfunctionalchaincontainer.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractfunctionalchaincontainer.getOwnedPropertyValueGroups());
			children.addAll(_abstractfunctionalchaincontainer.getOwnedFunctionalChains());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getCommunityOfInterestComposition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.CommunityOfInterestComposition _communityofinterestcomposition = (org.polarsys.capella.core.data.oa.CommunityOfInterestComposition) obj;
			children.addAll(_communityofinterestcomposition.getOwnedExtensions());
			children.addAll(_communityofinterestcomposition.getOwnedConstraints());
			children.addAll(_communityofinterestcomposition.getOwnedMigratedElements());
			children.addAll(_communityofinterestcomposition.getOwnedPropertyValues());
			children.addAll(_communityofinterestcomposition.getOwnedEnumerationPropertyTypes());
			children.addAll(_communityofinterestcomposition.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getTimeLapse(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.TimeLapse _timelapse = (org.polarsys.capella.core.data.interaction.TimeLapse) obj;
			children.addAll(_timelapse.getOwnedExtensions());
			children.addAll(_timelapse.getOwnedConstraints());
			children.addAll(_timelapse.getOwnedMigratedElements());
			children.addAll(_timelapse.getOwnedPropertyValues());
			children.addAll(_timelapse.getOwnedEnumerationPropertyTypes());
			children.addAll(_timelapse.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getClassifier(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.Classifier _classifier = (org.polarsys.capella.core.data.capellacore.Classifier) obj;
			children.addAll(_classifier.getOwnedExtensions());
			children.addAll(_classifier.getOwnedConstraints());
			children.addAll(_classifier.getOwnedMigratedElements());
			children.addAll(_classifier.getOwnedPropertyValues());
			children.addAll(_classifier.getOwnedEnumerationPropertyTypes());
			children.addAll(_classifier.getOwnedPropertyValueGroups());
			children.addAll(_classifier.getOwnedTraces());
			children.addAll(_classifier.getNamingRules());
			children.addAll(_classifier.getOwnedGeneralizations());
			children.addAll(_classifier.getOwnedFeatures());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.communication.CommunicationPackage.eINSTANCE.getCommunicationItem(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.communication.CommunicationItem _communicationitem = (org.polarsys.capella.core.data.information.communication.CommunicationItem) obj;
			children.addAll(_communicationitem.getOwnedExtensions());
			children.addAll(_communicationitem.getOwnedConstraints());
			children.addAll(_communicationitem.getOwnedMigratedElements());
			children.addAll(_communicationitem.getOwnedPropertyValues());
			children.addAll(_communicationitem.getOwnedEnumerationPropertyTypes());
			children.addAll(_communicationitem.getOwnedPropertyValueGroups());
			children.addAll(_communicationitem.getOwnedTraces());
			children.addAll(_communicationitem.getNamingRules());
			children.addAll(_communicationitem.getOwnedGeneralizations());
			children.addAll(_communicationitem.getOwnedFeatures());
			children.addAll(_communicationitem.getOwnedPropertyValuePkgs());
			children.addAll(_communicationitem.getOwnedDataValues());
			children.addAll(_communicationitem.getOwnedStateMachines());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getIntegerPropertyValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.IntegerPropertyValue _integerpropertyvalue = (org.polarsys.capella.core.data.capellacore.IntegerPropertyValue) obj;
			children.addAll(_integerpropertyvalue.getOwnedExtensions());
			children.addAll(_integerpropertyvalue.getOwnedConstraints());
			children.addAll(_integerpropertyvalue.getOwnedMigratedElements());
			children.addAll(_integerpropertyvalue.getOwnedPropertyValues());
			children.addAll(_integerpropertyvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_integerpropertyvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getEntryPointPseudoState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.EntryPointPseudoState _entrypointpseudostate = (org.polarsys.capella.core.data.capellacommon.EntryPointPseudoState) obj;
			children.addAll(_entrypointpseudostate.getOwnedExtensions());
			children.addAll(_entrypointpseudostate.getOwnedConstraints());
			children.addAll(_entrypointpseudostate.getOwnedMigratedElements());
			children.addAll(_entrypointpseudostate.getOwnedPropertyValues());
			children.addAll(_entrypointpseudostate.getOwnedEnumerationPropertyTypes());
			children.addAll(_entrypointpseudostate.getOwnedPropertyValueGroups());
			children.addAll(_entrypointpseudostate.getOwnedAbstractStateRealizations());
			return children;
		});
		explorationConsumer.put(behavior.BehaviorPackage.eINSTANCE.getAbstractEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			behavior.AbstractEvent _abstractevent = (behavior.AbstractEvent) obj;
			children.addAll(_abstractevent.getOwnedExtensions());
			children.addAll(_abstractevent.getOwnedConstraints());
			children.addAll(_abstractevent.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getBlockArchitecturePkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.BlockArchitecturePkg _blockarchitecturepkg = (org.polarsys.capella.core.data.cs.BlockArchitecturePkg) obj;
			children.addAll(_blockarchitecturepkg.getOwnedExtensions());
			children.addAll(_blockarchitecturepkg.getOwnedConstraints());
			children.addAll(_blockarchitecturepkg.getOwnedMigratedElements());
			children.addAll(_blockarchitecturepkg.getOwnedPropertyValues());
			children.addAll(_blockarchitecturepkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_blockarchitecturepkg.getOwnedPropertyValueGroups());
			children.addAll(_blockarchitecturepkg.getOwnedTraces());
			children.addAll(_blockarchitecturepkg.getNamingRules());
			children.addAll(_blockarchitecturepkg.getOwnedPropertyValuePkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getInterfaceAllocator(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.InterfaceAllocator _interfaceallocator = (org.polarsys.capella.core.data.cs.InterfaceAllocator) obj;
			children.addAll(_interfaceallocator.getOwnedExtensions());
			children.addAll(_interfaceallocator.getOwnedConstraints());
			children.addAll(_interfaceallocator.getOwnedMigratedElements());
			children.addAll(_interfaceallocator.getOwnedPropertyValues());
			children.addAll(_interfaceallocator.getOwnedEnumerationPropertyTypes());
			children.addAll(_interfaceallocator.getOwnedPropertyValueGroups());
			children.addAll(_interfaceallocator.getOwnedInterfaceAllocations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getOpaqueExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.OpaqueExpression _opaqueexpression = (org.polarsys.capella.core.data.information.datavalue.OpaqueExpression) obj;
			children.addAll(_opaqueexpression.getOwnedExtensions());
			children.addAll(_opaqueexpression.getOwnedConstraints());
			children.addAll(_opaqueexpression.getOwnedMigratedElements());
			children.addAll(_opaqueexpression.getOwnedPropertyValues());
			children.addAll(_opaqueexpression.getOwnedEnumerationPropertyTypes());
			children.addAll(_opaqueexpression.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getPhysicalLinkRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.PhysicalLinkRealization _physicallinkrealization = (org.polarsys.capella.core.data.cs.PhysicalLinkRealization) obj;
			children.addAll(_physicallinkrealization.getOwnedExtensions());
			children.addAll(_physicallinkrealization.getOwnedConstraints());
			children.addAll(_physicallinkrealization.getOwnedMigratedElements());
			children.addAll(_physicallinkrealization.getOwnedPropertyValues());
			children.addAll(_physicallinkrealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_physicallinkrealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getReuseLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.ReuseLink _reuselink = (org.polarsys.capella.core.data.capellacore.ReuseLink) obj;
			children.addAll(_reuselink.getOwnedExtensions());
			children.addAll(_reuselink.getOwnedConstraints());
			children.addAll(_reuselink.getOwnedMigratedElements());
			children.addAll(_reuselink.getOwnedPropertyValues());
			children.addAll(_reuselink.getOwnedEnumerationPropertyTypes());
			children.addAll(_reuselink.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getEventReceiptOperation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.EventReceiptOperation _eventreceiptoperation = (org.polarsys.capella.core.data.interaction.EventReceiptOperation) obj;
			children.addAll(_eventreceiptoperation.getOwnedExtensions());
			children.addAll(_eventreceiptoperation.getOwnedConstraints());
			children.addAll(_eventreceiptoperation.getOwnedMigratedElements());
			children.addAll(_eventreceiptoperation.getOwnedPropertyValues());
			children.addAll(_eventreceiptoperation.getOwnedEnumerationPropertyTypes());
			children.addAll(_eventreceiptoperation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getConcept(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.Concept _concept = (org.polarsys.capella.core.data.oa.Concept) obj;
			children.addAll(_concept.getOwnedExtensions());
			children.addAll(_concept.getOwnedConstraints());
			children.addAll(_concept.getOwnedMigratedElements());
			children.addAll(_concept.getOwnedPropertyValues());
			children.addAll(_concept.getOwnedEnumerationPropertyTypes());
			children.addAll(_concept.getOwnedPropertyValueGroups());
			children.addAll(_concept.getCompositeLinks());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOperationalProcess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.OperationalProcess _operationalprocess = (org.polarsys.capella.core.data.oa.OperationalProcess) obj;
			children.addAll(_operationalprocess.getOwnedExtensions());
			children.addAll(_operationalprocess.getOwnedConstraints());
			children.addAll(_operationalprocess.getOwnedMigratedElements());
			children.addAll(_operationalprocess.getOwnedPropertyValues());
			children.addAll(_operationalprocess.getOwnedEnumerationPropertyTypes());
			children.addAll(_operationalprocess.getOwnedPropertyValueGroups());
			children.addAll(_operationalprocess.getOwnedFunctionalChainInvolvements());
			children.addAll(_operationalprocess.getOwnedFunctionalChainRealizations());
			children.addAll(_operationalprocess.getOwnedSequenceNodes());
			children.addAll(_operationalprocess.getOwnedSequenceLinks());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getAllocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.Allocation _allocation = (org.polarsys.capella.core.data.capellacore.Allocation) obj;
			children.addAll(_allocation.getOwnedExtensions());
			children.addAll(_allocation.getOwnedConstraints());
			children.addAll(_allocation.getOwnedMigratedElements());
			children.addAll(_allocation.getOwnedPropertyValues());
			children.addAll(_allocation.getOwnedEnumerationPropertyTypes());
			children.addAll(_allocation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOperationalAnalysis(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.OperationalAnalysis _operationalanalysis = (org.polarsys.capella.core.data.oa.OperationalAnalysis) obj;
			children.addAll(_operationalanalysis.getOwnedExtensions());
			children.addAll(_operationalanalysis.getOwnedConstraints());
			children.addAll(_operationalanalysis.getOwnedMigratedElements());
			children.addAll(_operationalanalysis.getOwnedPropertyValues());
			children.addAll(_operationalanalysis.getOwnedEnumerationPropertyTypes());
			children.addAll(_operationalanalysis.getOwnedPropertyValueGroups());
			children.addAll(_operationalanalysis.getOwnedTraces());
			children.addAll(_operationalanalysis.getNamingRules());
			children.addAll(_operationalanalysis.getOwnedPropertyValuePkgs());
			if(_operationalanalysis.getOwnedFunctionPkg() != null)
				children.add(_operationalanalysis.getOwnedFunctionPkg());
			children.addAll(_operationalanalysis.getOwnedComponentExchanges());
			children.addAll(_operationalanalysis.getOwnedComponentExchangeCategories());
			children.addAll(_operationalanalysis.getOwnedFunctionalLinks());
			children.addAll(_operationalanalysis.getOwnedFunctionalAllocations());
			children.addAll(_operationalanalysis.getOwnedComponentExchangeRealizations());
			children.addAll(_operationalanalysis.getOwnedRequirementPkgs());
			if(_operationalanalysis.getOwnedAbstractCapabilityPkg() != null)
				children.add(_operationalanalysis.getOwnedAbstractCapabilityPkg());
			if(_operationalanalysis.getOwnedInterfacePkg() != null)
				children.add(_operationalanalysis.getOwnedInterfacePkg());
			if(_operationalanalysis.getOwnedDataPkg() != null)
				children.add(_operationalanalysis.getOwnedDataPkg());
			if(_operationalanalysis.getOwnedRolePkg() != null)
				children.add(_operationalanalysis.getOwnedRolePkg());
			if(_operationalanalysis.getOwnedEntityPkg() != null)
				children.add(_operationalanalysis.getOwnedEntityPkg());
			if(_operationalanalysis.getOwnedConceptPkg() != null)
				children.add(_operationalanalysis.getOwnedConceptPkg());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionalExchange(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionalExchange _functionalexchange = (org.polarsys.capella.core.data.fa.FunctionalExchange) obj;
			children.addAll(_functionalexchange.getOwnedExtensions());
			children.addAll(_functionalexchange.getOwnedConstraints());
			children.addAll(_functionalexchange.getOwnedMigratedElements());
			children.addAll(_functionalexchange.getOwnedPropertyValues());
			children.addAll(_functionalexchange.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionalexchange.getOwnedPropertyValueGroups());
			if(_functionalexchange.getRate() != null)
				children.add(_functionalexchange.getRate());
			if(_functionalexchange.getProbability() != null)
				children.add(_functionalexchange.getProbability());
			if(_functionalexchange.getGuard() != null)
				children.add(_functionalexchange.getGuard());
			if(_functionalexchange.getWeight() != null)
				children.add(_functionalexchange.getWeight());
			children.addAll(_functionalexchange.getOwnedFunctionalExchangeRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getSequenceLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.SequenceLink _sequencelink = (org.polarsys.capella.core.data.fa.SequenceLink) obj;
			children.addAll(_sequencelink.getOwnedExtensions());
			children.addAll(_sequencelink.getOwnedConstraints());
			children.addAll(_sequencelink.getOwnedMigratedElements());
			children.addAll(_sequencelink.getOwnedPropertyValues());
			children.addAll(_sequencelink.getOwnedEnumerationPropertyTypes());
			children.addAll(_sequencelink.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getEntityOperationalCapabilityInvolvement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.EntityOperationalCapabilityInvolvement _entityoperationalcapabilityinvolvement = (org.polarsys.capella.core.data.oa.EntityOperationalCapabilityInvolvement) obj;
			children.addAll(_entityoperationalcapabilityinvolvement.getOwnedExtensions());
			children.addAll(_entityoperationalcapabilityinvolvement.getOwnedConstraints());
			children.addAll(_entityoperationalcapabilityinvolvement.getOwnedMigratedElements());
			children.addAll(_entityoperationalcapabilityinvolvement.getOwnedPropertyValues());
			children.addAll(_entityoperationalcapabilityinvolvement.getOwnedEnumerationPropertyTypes());
			children.addAll(_entityoperationalcapabilityinvolvement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.Type _type = (org.polarsys.capella.core.data.capellacore.Type) obj;
			children.addAll(_type.getOwnedExtensions());
			children.addAll(_type.getOwnedConstraints());
			children.addAll(_type.getOwnedMigratedElements());
			children.addAll(_type.getOwnedPropertyValues());
			children.addAll(_type.getOwnedEnumerationPropertyTypes());
			children.addAll(_type.getOwnedPropertyValueGroups());
			children.addAll(_type.getOwnedTraces());
			children.addAll(_type.getNamingRules());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getReuserStructure(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.ReuserStructure _reuserstructure = (org.polarsys.capella.core.data.capellacore.ReuserStructure) obj;
			children.addAll(_reuserstructure.getOwnedExtensions());
			children.addAll(_reuserstructure.getOwnedConstraints());
			children.addAll(_reuserstructure.getOwnedMigratedElements());
			children.addAll(_reuserstructure.getOwnedPropertyValues());
			children.addAll(_reuserstructure.getOwnedEnumerationPropertyTypes());
			children.addAll(_reuserstructure.getOwnedPropertyValueGroups());
			children.addAll(_reuserstructure.getOwnedTraces());
			children.addAll(_reuserstructure.getNamingRules());
			children.addAll(_reuserstructure.getOwnedPropertyValuePkgs());
			children.addAll(_reuserstructure.getOwnedReuseLinks());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getScenarioRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.ScenarioRealization _scenariorealization = (org.polarsys.capella.core.data.interaction.ScenarioRealization) obj;
			children.addAll(_scenariorealization.getOwnedExtensions());
			children.addAll(_scenariorealization.getOwnedConstraints());
			children.addAll(_scenariorealization.getOwnedMigratedElements());
			children.addAll(_scenariorealization.getOwnedPropertyValues());
			children.addAll(_scenariorealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_scenariorealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getPseudostate(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.Pseudostate _pseudostate = (org.polarsys.capella.core.data.capellacommon.Pseudostate) obj;
			children.addAll(_pseudostate.getOwnedExtensions());
			children.addAll(_pseudostate.getOwnedConstraints());
			children.addAll(_pseudostate.getOwnedMigratedElements());
			children.addAll(_pseudostate.getOwnedPropertyValues());
			children.addAll(_pseudostate.getOwnedEnumerationPropertyTypes());
			children.addAll(_pseudostate.getOwnedPropertyValueGroups());
			children.addAll(_pseudostate.getOwnedAbstractStateRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getSequenceMessageValuation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.SequenceMessageValuation _sequencemessagevaluation = (org.polarsys.capella.core.data.interaction.SequenceMessageValuation) obj;
			children.addAll(_sequencemessagevaluation.getOwnedExtensions());
			children.addAll(_sequencemessagevaluation.getOwnedConstraints());
			children.addAll(_sequencemessagevaluation.getOwnedMigratedElements());
			children.addAll(_sequencemessagevaluation.getOwnedPropertyValues());
			children.addAll(_sequencemessagevaluation.getOwnedEnumerationPropertyTypes());
			children.addAll(_sequencemessagevaluation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getPin(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.Pin _pin = (org.polarsys.capella.common.data.activity.Pin) obj;
			children.addAll(_pin.getOwnedExtensions());
			children.addAll(_pin.getOwnedConstraints());
			children.addAll(_pin.getOwnedMigratedElements());
			if(_pin.getUpperBound() != null)
				children.add(_pin.getUpperBound());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getMissionInvolvement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.MissionInvolvement _missioninvolvement = (org.polarsys.capella.core.data.ctx.MissionInvolvement) obj;
			children.addAll(_missioninvolvement.getOwnedExtensions());
			children.addAll(_missioninvolvement.getOwnedConstraints());
			children.addAll(_missioninvolvement.getOwnedMigratedElements());
			children.addAll(_missioninvolvement.getOwnedPropertyValues());
			children.addAll(_missioninvolvement.getOwnedEnumerationPropertyTypes());
			children.addAll(_missioninvolvement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getExchangeLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ExchangeLink _exchangelink = (org.polarsys.capella.core.data.fa.ExchangeLink) obj;
			children.addAll(_exchangelink.getOwnedExtensions());
			children.addAll(_exchangelink.getOwnedConstraints());
			children.addAll(_exchangelink.getOwnedMigratedElements());
			children.addAll(_exchangelink.getOwnedPropertyValues());
			children.addAll(_exchangelink.getOwnedEnumerationPropertyTypes());
			children.addAll(_exchangelink.getOwnedPropertyValueGroups());
			children.addAll(_exchangelink.getNamingRules());
			children.addAll(_exchangelink.getOwnedExchangeContainments());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getPortAllocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.PortAllocation _portallocation = (org.polarsys.capella.core.data.information.PortAllocation) obj;
			children.addAll(_portallocation.getOwnedExtensions());
			children.addAll(_portallocation.getOwnedConstraints());
			children.addAll(_portallocation.getOwnedMigratedElements());
			children.addAll(_portallocation.getOwnedPropertyValues());
			children.addAll(_portallocation.getOwnedEnumerationPropertyTypes());
			children.addAll(_portallocation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionOutputPort(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionOutputPort _functionoutputport = (org.polarsys.capella.core.data.fa.FunctionOutputPort) obj;
			children.addAll(_functionoutputport.getOwnedExtensions());
			children.addAll(_functionoutputport.getOwnedConstraints());
			children.addAll(_functionoutputport.getOwnedMigratedElements());
			children.addAll(_functionoutputport.getOwnedPropertyValues());
			children.addAll(_functionoutputport.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionoutputport.getOwnedPropertyValueGroups());
			children.addAll(_functionoutputport.getOwnedProtocols());
			children.addAll(_functionoutputport.getOwnedPortRealizations());
			children.addAll(_functionoutputport.getOwnedPortAllocations());
			if(_functionoutputport.getUpperBound() != null)
				children.add(_functionoutputport.getUpperBound());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getStructuredActivityNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.StructuredActivityNode _structuredactivitynode = (org.polarsys.capella.common.data.activity.StructuredActivityNode) obj;
			children.addAll(_structuredactivitynode.getOwnedExtensions());
			children.addAll(_structuredactivitynode.getOwnedConstraints());
			children.addAll(_structuredactivitynode.getOwnedMigratedElements());
			children.addAll(_structuredactivitynode.getSubGroups());
			children.addAll(_structuredactivitynode.getOwnedNodes());
			children.addAll(_structuredactivitynode.getOwnedEdges());
			children.addAll(_structuredactivitynode.getOwnedHandlers());
			if(_structuredactivitynode.getLocalPrecondition() != null)
				children.add(_structuredactivitynode.getLocalPrecondition());
			if(_structuredactivitynode.getLocalPostcondition() != null)
				children.add(_structuredactivitynode.getLocalPostcondition());
			children.addAll(_structuredactivitynode.getInputs());
			children.addAll(_structuredactivitynode.getOutputs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getCancelTimerEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.CancelTimerEvent _canceltimerevent = (org.polarsys.capella.core.data.interaction.CancelTimerEvent) obj;
			children.addAll(_canceltimerevent.getOwnedExtensions());
			children.addAll(_canceltimerevent.getOwnedConstraints());
			children.addAll(_canceltimerevent.getOwnedMigratedElements());
			children.addAll(_canceltimerevent.getOwnedPropertyValues());
			children.addAll(_canceltimerevent.getOwnedEnumerationPropertyTypes());
			children.addAll(_canceltimerevent.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getAbstractInformationFlow(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.AbstractInformationFlow _abstractinformationflow = (modellingcore.AbstractInformationFlow) obj;
			children.addAll(_abstractinformationflow.getOwnedExtensions());
			children.addAll(_abstractinformationflow.getOwnedConstraints());
			children.addAll(_abstractinformationflow.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getInvolverElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.InvolverElement _involverelement = (org.polarsys.capella.core.data.capellacore.InvolverElement) obj;
			children.addAll(_involverelement.getOwnedExtensions());
			children.addAll(_involverelement.getOwnedConstraints());
			children.addAll(_involverelement.getOwnedMigratedElements());
			children.addAll(_involverelement.getOwnedPropertyValues());
			children.addAll(_involverelement.getOwnedEnumerationPropertyTypes());
			children.addAll(_involverelement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getObjectFlow(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.ObjectFlow _objectflow = (org.polarsys.capella.common.data.activity.ObjectFlow) obj;
			children.addAll(_objectflow.getOwnedExtensions());
			children.addAll(_objectflow.getOwnedConstraints());
			children.addAll(_objectflow.getOwnedMigratedElements());
			if(_objectflow.getRate() != null)
				children.add(_objectflow.getRate());
			if(_objectflow.getProbability() != null)
				children.add(_objectflow.getProbability());
			if(_objectflow.getGuard() != null)
				children.add(_objectflow.getGuard());
			if(_objectflow.getWeight() != null)
				children.add(_objectflow.getWeight());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getInterfacePkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.InterfacePkg _interfacepkg = (org.polarsys.capella.core.data.cs.InterfacePkg) obj;
			children.addAll(_interfacepkg.getOwnedExtensions());
			children.addAll(_interfacepkg.getOwnedConstraints());
			children.addAll(_interfacepkg.getOwnedMigratedElements());
			children.addAll(_interfacepkg.getOwnedPropertyValues());
			children.addAll(_interfacepkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_interfacepkg.getOwnedPropertyValueGroups());
			children.addAll(_interfacepkg.getOwnedTraces());
			children.addAll(_interfacepkg.getNamingRules());
			children.addAll(_interfacepkg.getOwnedPropertyValuePkgs());
			children.addAll(_interfacepkg.getOwnedMessageReferences());
			children.addAll(_interfacepkg.getOwnedExchangeItems());
			children.addAll(_interfacepkg.getOwnedInterfaces());
			children.addAll(_interfacepkg.getOwnedInterfacePkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getCollection(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.Collection _collection = (org.polarsys.capella.core.data.information.Collection) obj;
			children.addAll(_collection.getOwnedExtensions());
			children.addAll(_collection.getOwnedConstraints());
			children.addAll(_collection.getOwnedMigratedElements());
			children.addAll(_collection.getOwnedPropertyValues());
			children.addAll(_collection.getOwnedEnumerationPropertyTypes());
			children.addAll(_collection.getOwnedPropertyValueGroups());
			children.addAll(_collection.getOwnedTraces());
			children.addAll(_collection.getNamingRules());
			children.addAll(_collection.getOwnedGeneralizations());
			children.addAll(_collection.getOwnedFeatures());
			if(_collection.getOwnedDefaultValue() != null)
				children.add(_collection.getOwnedDefaultValue());
			if(_collection.getOwnedMinValue() != null)
				children.add(_collection.getOwnedMinValue());
			if(_collection.getOwnedMaxValue() != null)
				children.add(_collection.getOwnedMaxValue());
			if(_collection.getOwnedNullValue() != null)
				children.add(_collection.getOwnedNullValue());
			if(_collection.getOwnedMinCard() != null)
				children.add(_collection.getOwnedMinCard());
			if(_collection.getOwnedMinLength() != null)
				children.add(_collection.getOwnedMinLength());
			if(_collection.getOwnedMaxCard() != null)
				children.add(_collection.getOwnedMaxCard());
			if(_collection.getOwnedMaxLength() != null)
				children.add(_collection.getOwnedMaxLength());
			children.addAll(_collection.getOwnedPropertyValuePkgs());
			children.addAll(_collection.getOwnedDataValues());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getEnumerationLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.EnumerationLiteral _enumerationliteral = (org.polarsys.capella.core.data.information.datavalue.EnumerationLiteral) obj;
			children.addAll(_enumerationliteral.getOwnedExtensions());
			children.addAll(_enumerationliteral.getOwnedConstraints());
			children.addAll(_enumerationliteral.getOwnedMigratedElements());
			children.addAll(_enumerationliteral.getOwnedPropertyValues());
			children.addAll(_enumerationliteral.getOwnedEnumerationPropertyTypes());
			children.addAll(_enumerationliteral.getOwnedPropertyValueGroups());
			if(_enumerationliteral.getDomainValue() != null)
				children.add(_enumerationliteral.getDomainValue());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getTypedElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.TypedElement _typedelement = (org.polarsys.capella.core.data.capellacore.TypedElement) obj;
			children.addAll(_typedelement.getOwnedExtensions());
			children.addAll(_typedelement.getOwnedConstraints());
			children.addAll(_typedelement.getOwnedMigratedElements());
			children.addAll(_typedelement.getOwnedPropertyValues());
			children.addAll(_typedelement.getOwnedEnumerationPropertyTypes());
			children.addAll(_typedelement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getAbstractExchangeItemPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.AbstractExchangeItemPkg _abstractexchangeitempkg = (org.polarsys.capella.core.data.capellacore.AbstractExchangeItemPkg) obj;
			children.addAll(_abstractexchangeitempkg.getOwnedExtensions());
			children.addAll(_abstractexchangeitempkg.getOwnedConstraints());
			children.addAll(_abstractexchangeitempkg.getOwnedMigratedElements());
			children.addAll(_abstractexchangeitempkg.getOwnedPropertyValues());
			children.addAll(_abstractexchangeitempkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractexchangeitempkg.getOwnedPropertyValueGroups());
			children.addAll(_abstractexchangeitempkg.getOwnedTraces());
			children.addAll(_abstractexchangeitempkg.getNamingRules());
			children.addAll(_abstractexchangeitempkg.getOwnedPropertyValuePkgs());
			children.addAll(_abstractexchangeitempkg.getOwnedExchangeItems());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getInvolvedElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.InvolvedElement _involvedelement = (org.polarsys.capella.core.data.capellacore.InvolvedElement) obj;
			children.addAll(_involvedelement.getOwnedExtensions());
			children.addAll(_involvedelement.getOwnedConstraints());
			children.addAll(_involvedelement.getOwnedMigratedElements());
			children.addAll(_involvedelement.getOwnedPropertyValues());
			children.addAll(_involvedelement.getOwnedEnumerationPropertyTypes());
			children.addAll(_involvedelement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getCallBehaviorAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.CallBehaviorAction _callbehavioraction = (org.polarsys.capella.common.data.activity.CallBehaviorAction) obj;
			children.addAll(_callbehavioraction.getOwnedExtensions());
			children.addAll(_callbehavioraction.getOwnedConstraints());
			children.addAll(_callbehavioraction.getOwnedMigratedElements());
			children.addAll(_callbehavioraction.getOwnedHandlers());
			if(_callbehavioraction.getLocalPrecondition() != null)
				children.add(_callbehavioraction.getLocalPrecondition());
			if(_callbehavioraction.getLocalPostcondition() != null)
				children.add(_callbehavioraction.getLocalPostcondition());
			children.addAll(_callbehavioraction.getInputs());
			children.addAll(_callbehavioraction.getOutputs());
			children.addAll(_callbehavioraction.getArguments());
			children.addAll(_callbehavioraction.getResults());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getControlNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ControlNode _controlnode = (org.polarsys.capella.core.data.fa.ControlNode) obj;
			children.addAll(_controlnode.getOwnedExtensions());
			children.addAll(_controlnode.getOwnedConstraints());
			children.addAll(_controlnode.getOwnedMigratedElements());
			children.addAll(_controlnode.getOwnedPropertyValues());
			children.addAll(_controlnode.getOwnedEnumerationPropertyTypes());
			children.addAll(_controlnode.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getCorrespondenceNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getMergeLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.MergeLink _mergelink = (org.polarsys.capella.core.data.interaction.MergeLink) obj;
			children.addAll(_mergelink.getOwnedExtensions());
			children.addAll(_mergelink.getOwnedConstraints());
			children.addAll(_mergelink.getOwnedMigratedElements());
			children.addAll(_mergelink.getOwnedPropertyValues());
			children.addAll(_mergelink.getOwnedEnumerationPropertyTypes());
			children.addAll(_mergelink.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionInputPort(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionInputPort _functioninputport = (org.polarsys.capella.core.data.fa.FunctionInputPort) obj;
			children.addAll(_functioninputport.getOwnedExtensions());
			children.addAll(_functioninputport.getOwnedConstraints());
			children.addAll(_functioninputport.getOwnedMigratedElements());
			children.addAll(_functioninputport.getOwnedPropertyValues());
			children.addAll(_functioninputport.getOwnedEnumerationPropertyTypes());
			children.addAll(_functioninputport.getOwnedPropertyValueGroups());
			children.addAll(_functioninputport.getOwnedProtocols());
			children.addAll(_functioninputport.getOwnedPortRealizations());
			children.addAll(_functioninputport.getOwnedPortAllocations());
			if(_functioninputport.getUpperBound() != null)
				children.add(_functioninputport.getUpperBound());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getPropertyValueGroup(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.PropertyValueGroup _propertyvaluegroup = (org.polarsys.capella.core.data.capellacore.PropertyValueGroup) obj;
			children.addAll(_propertyvaluegroup.getOwnedExtensions());
			children.addAll(_propertyvaluegroup.getOwnedConstraints());
			children.addAll(_propertyvaluegroup.getOwnedMigratedElements());
			children.addAll(_propertyvaluegroup.getOwnedPropertyValues());
			children.addAll(_propertyvaluegroup.getOwnedEnumerationPropertyTypes());
			children.addAll(_propertyvaluegroup.getOwnedPropertyValueGroups());
			children.addAll(_propertyvaluegroup.getOwnedTraces());
			children.addAll(_propertyvaluegroup.getNamingRules());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getExchangeSpecificationRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ExchangeSpecificationRealization _exchangespecificationrealization = (org.polarsys.capella.core.data.fa.ExchangeSpecificationRealization) obj;
			children.addAll(_exchangespecificationrealization.getOwnedExtensions());
			children.addAll(_exchangespecificationrealization.getOwnedConstraints());
			children.addAll(_exchangespecificationrealization.getOwnedMigratedElements());
			children.addAll(_exchangespecificationrealization.getOwnedPropertyValues());
			children.addAll(_exchangespecificationrealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_exchangespecificationrealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getArmTimerEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.ArmTimerEvent _armtimerevent = (org.polarsys.capella.core.data.interaction.ArmTimerEvent) obj;
			children.addAll(_armtimerevent.getOwnedExtensions());
			children.addAll(_armtimerevent.getOwnedConstraints());
			children.addAll(_armtimerevent.getOwnedMigratedElements());
			children.addAll(_armtimerevent.getOwnedPropertyValues());
			children.addAll(_armtimerevent.getOwnedEnumerationPropertyTypes());
			children.addAll(_armtimerevent.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getEnumerationPropertyLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral _enumerationpropertyliteral = (org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral) obj;
			children.addAll(_enumerationpropertyliteral.getOwnedExtensions());
			children.addAll(_enumerationpropertyliteral.getOwnedConstraints());
			children.addAll(_enumerationpropertyliteral.getOwnedMigratedElements());
			children.addAll(_enumerationpropertyliteral.getOwnedPropertyValues());
			children.addAll(_enumerationpropertyliteral.getOwnedEnumerationPropertyTypes());
			children.addAll(_enumerationpropertyliteral.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.communication.CommunicationPackage.eINSTANCE.getCommunicationLinkExchanger(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.communication.CommunicationLinkExchanger _communicationlinkexchanger = (org.polarsys.capella.core.data.information.communication.CommunicationLinkExchanger) obj;
			children.addAll(_communicationlinkexchanger.getOwnedCommunicationLinks());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getPhysicalPath(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.PhysicalPath _physicalpath = (org.polarsys.capella.core.data.cs.PhysicalPath) obj;
			children.addAll(_physicalpath.getOwnedExtensions());
			children.addAll(_physicalpath.getOwnedConstraints());
			children.addAll(_physicalpath.getOwnedMigratedElements());
			children.addAll(_physicalpath.getOwnedPropertyValues());
			children.addAll(_physicalpath.getOwnedEnumerationPropertyTypes());
			children.addAll(_physicalpath.getOwnedPropertyValueGroups());
			children.addAll(_physicalpath.getOwnedComponentExchangeAllocations());
			children.addAll(_physicalpath.getOwnedPhysicalPathInvolvements());
			children.addAll(_physicalpath.getOwnedPhysicalPathRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getUnion(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.Union _union = (org.polarsys.capella.core.data.information.Union) obj;
			children.addAll(_union.getOwnedExtensions());
			children.addAll(_union.getOwnedConstraints());
			children.addAll(_union.getOwnedMigratedElements());
			children.addAll(_union.getOwnedPropertyValues());
			children.addAll(_union.getOwnedEnumerationPropertyTypes());
			children.addAll(_union.getOwnedPropertyValueGroups());
			children.addAll(_union.getOwnedTraces());
			children.addAll(_union.getNamingRules());
			children.addAll(_union.getOwnedGeneralizations());
			children.addAll(_union.getOwnedFeatures());
			children.addAll(_union.getNestedGeneralClasses());
			children.addAll(_union.getOwnedStateMachines());
			children.addAll(_union.getOwnedDataValues());
			children.addAll(_union.getOwnedInformationRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getInvolvement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.Involvement _involvement = (org.polarsys.capella.core.data.capellacore.Involvement) obj;
			children.addAll(_involvement.getOwnedExtensions());
			children.addAll(_involvement.getOwnedConstraints());
			children.addAll(_involvement.getOwnedMigratedElements());
			children.addAll(_involvement.getOwnedPropertyValues());
			children.addAll(_involvement.getOwnedEnumerationPropertyTypes());
			children.addAll(_involvement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getPhysicalLinkEnd(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.PhysicalLinkEnd _physicallinkend = (org.polarsys.capella.core.data.cs.PhysicalLinkEnd) obj;
			children.addAll(_physicallinkend.getOwnedExtensions());
			children.addAll(_physicallinkend.getOwnedConstraints());
			children.addAll(_physicallinkend.getOwnedMigratedElements());
			children.addAll(_physicallinkend.getOwnedPropertyValues());
			children.addAll(_physicallinkend.getOwnedEnumerationPropertyTypes());
			children.addAll(_physicallinkend.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getRoleAssemblyUsage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.RoleAssemblyUsage _roleassemblyusage = (org.polarsys.capella.core.data.oa.RoleAssemblyUsage) obj;
			children.addAll(_roleassemblyusage.getOwnedExtensions());
			children.addAll(_roleassemblyusage.getOwnedConstraints());
			children.addAll(_roleassemblyusage.getOwnedMigratedElements());
			children.addAll(_roleassemblyusage.getOwnedPropertyValues());
			children.addAll(_roleassemblyusage.getOwnedEnumerationPropertyTypes());
			children.addAll(_roleassemblyusage.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getUnionProperty(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.UnionProperty _unionproperty = (org.polarsys.capella.core.data.information.UnionProperty) obj;
			children.addAll(_unionproperty.getOwnedExtensions());
			children.addAll(_unionproperty.getOwnedConstraints());
			children.addAll(_unionproperty.getOwnedMigratedElements());
			children.addAll(_unionproperty.getOwnedPropertyValues());
			children.addAll(_unionproperty.getOwnedEnumerationPropertyTypes());
			children.addAll(_unionproperty.getOwnedPropertyValueGroups());
			if(_unionproperty.getOwnedDefaultValue() != null)
				children.add(_unionproperty.getOwnedDefaultValue());
			if(_unionproperty.getOwnedMinValue() != null)
				children.add(_unionproperty.getOwnedMinValue());
			if(_unionproperty.getOwnedMaxValue() != null)
				children.add(_unionproperty.getOwnedMaxValue());
			if(_unionproperty.getOwnedNullValue() != null)
				children.add(_unionproperty.getOwnedNullValue());
			if(_unionproperty.getOwnedMinCard() != null)
				children.add(_unionproperty.getOwnedMinCard());
			if(_unionproperty.getOwnedMinLength() != null)
				children.add(_unionproperty.getOwnedMinLength());
			if(_unionproperty.getOwnedMaxCard() != null)
				children.add(_unionproperty.getOwnedMaxCard());
			if(_unionproperty.getOwnedMaxLength() != null)
				children.add(_unionproperty.getOwnedMaxLength());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getValuePart(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.ValuePart _valuepart = (org.polarsys.capella.core.data.information.datavalue.ValuePart) obj;
			children.addAll(_valuepart.getOwnedExtensions());
			children.addAll(_valuepart.getOwnedConstraints());
			children.addAll(_valuepart.getOwnedMigratedElements());
			children.addAll(_valuepart.getOwnedPropertyValues());
			children.addAll(_valuepart.getOwnedEnumerationPropertyTypes());
			children.addAll(_valuepart.getOwnedPropertyValueGroups());
			if(_valuepart.getOwnedValue() != null)
				children.add(_valuepart.getOwnedValue());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getEnumerationPropertyType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.EnumerationPropertyType _enumerationpropertytype = (org.polarsys.capella.core.data.capellacore.EnumerationPropertyType) obj;
			children.addAll(_enumerationpropertytype.getOwnedExtensions());
			children.addAll(_enumerationpropertytype.getOwnedConstraints());
			children.addAll(_enumerationpropertytype.getOwnedMigratedElements());
			children.addAll(_enumerationpropertytype.getOwnedPropertyValues());
			children.addAll(_enumerationpropertytype.getOwnedEnumerationPropertyTypes());
			children.addAll(_enumerationpropertytype.getOwnedPropertyValueGroups());
			children.addAll(_enumerationpropertytype.getOwnedLiterals());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getObjectNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.ObjectNode _objectnode = (org.polarsys.capella.common.data.activity.ObjectNode) obj;
			children.addAll(_objectnode.getOwnedExtensions());
			children.addAll(_objectnode.getOwnedConstraints());
			children.addAll(_objectnode.getOwnedMigratedElements());
			if(_objectnode.getUpperBound() != null)
				children.add(_objectnode.getUpperBound());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getMessageEnd(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.MessageEnd _messageend = (org.polarsys.capella.core.data.interaction.MessageEnd) obj;
			children.addAll(_messageend.getOwnedExtensions());
			children.addAll(_messageend.getOwnedConstraints());
			children.addAll(_messageend.getOwnedMigratedElements());
			children.addAll(_messageend.getOwnedPropertyValues());
			children.addAll(_messageend.getOwnedEnumerationPropertyTypes());
			children.addAll(_messageend.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getEventSentOperation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.EventSentOperation _eventsentoperation = (org.polarsys.capella.core.data.interaction.EventSentOperation) obj;
			children.addAll(_eventsentoperation.getOwnedExtensions());
			children.addAll(_eventsentoperation.getOwnedConstraints());
			children.addAll(_eventsentoperation.getOwnedMigratedElements());
			children.addAll(_eventsentoperation.getOwnedPropertyValues());
			children.addAll(_eventsentoperation.getOwnedEnumerationPropertyTypes());
			children.addAll(_eventsentoperation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getComponentExchangeEnd(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ComponentExchangeEnd _componentexchangeend = (org.polarsys.capella.core.data.fa.ComponentExchangeEnd) obj;
			children.addAll(_componentexchangeend.getOwnedExtensions());
			children.addAll(_componentexchangeend.getOwnedConstraints());
			children.addAll(_componentexchangeend.getOwnedMigratedElements());
			children.addAll(_componentexchangeend.getOwnedPropertyValues());
			children.addAll(_componentexchangeend.getOwnedEnumerationPropertyTypes());
			children.addAll(_componentexchangeend.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getAbstractPhysicalPathLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.AbstractPhysicalPathLink _abstractphysicalpathlink = (org.polarsys.capella.core.data.cs.AbstractPhysicalPathLink) obj;
			children.addAll(_abstractphysicalpathlink.getOwnedExtensions());
			children.addAll(_abstractphysicalpathlink.getOwnedConstraints());
			children.addAll(_abstractphysicalpathlink.getOwnedMigratedElements());
			children.addAll(_abstractphysicalpathlink.getOwnedPropertyValues());
			children.addAll(_abstractphysicalpathlink.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractphysicalpathlink.getOwnedPropertyValueGroups());
			children.addAll(_abstractphysicalpathlink.getOwnedComponentExchangeAllocations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getDestructionEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.DestructionEvent _destructionevent = (org.polarsys.capella.core.data.interaction.DestructionEvent) obj;
			children.addAll(_destructionevent.getOwnedExtensions());
			children.addAll(_destructionevent.getOwnedConstraints());
			children.addAll(_destructionevent.getOwnedMigratedElements());
			children.addAll(_destructionevent.getOwnedPropertyValues());
			children.addAll(_destructionevent.getOwnedEnumerationPropertyTypes());
			children.addAll(_destructionevent.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getExchangeCategory(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ExchangeCategory _exchangecategory = (org.polarsys.capella.core.data.fa.ExchangeCategory) obj;
			children.addAll(_exchangecategory.getOwnedExtensions());
			children.addAll(_exchangecategory.getOwnedConstraints());
			children.addAll(_exchangecategory.getOwnedMigratedElements());
			children.addAll(_exchangecategory.getOwnedPropertyValues());
			children.addAll(_exchangecategory.getOwnedEnumerationPropertyTypes());
			children.addAll(_exchangecategory.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getAbstractFragment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.AbstractFragment _abstractfragment = (org.polarsys.capella.core.data.interaction.AbstractFragment) obj;
			children.addAll(_abstractfragment.getOwnedExtensions());
			children.addAll(_abstractfragment.getOwnedConstraints());
			children.addAll(_abstractfragment.getOwnedMigratedElements());
			children.addAll(_abstractfragment.getOwnedPropertyValues());
			children.addAll(_abstractfragment.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractfragment.getOwnedPropertyValueGroups());
			children.addAll(_abstractfragment.getOwnedGates());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getMissionPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.MissionPkg _missionpkg = (org.polarsys.capella.core.data.ctx.MissionPkg) obj;
			children.addAll(_missionpkg.getOwnedExtensions());
			children.addAll(_missionpkg.getOwnedConstraints());
			children.addAll(_missionpkg.getOwnedMigratedElements());
			children.addAll(_missionpkg.getOwnedPropertyValues());
			children.addAll(_missionpkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_missionpkg.getOwnedPropertyValueGroups());
			children.addAll(_missionpkg.getOwnedTraces());
			children.addAll(_missionpkg.getNamingRules());
			children.addAll(_missionpkg.getOwnedPropertyValuePkgs());
			children.addAll(_missionpkg.getOwnedMissionPkgs());
			children.addAll(_missionpkg.getOwnedMissions());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getPhysicalLinkCategory(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.PhysicalLinkCategory _physicallinkcategory = (org.polarsys.capella.core.data.cs.PhysicalLinkCategory) obj;
			children.addAll(_physicallinkcategory.getOwnedExtensions());
			children.addAll(_physicallinkcategory.getOwnedConstraints());
			children.addAll(_physicallinkcategory.getOwnedMigratedElements());
			children.addAll(_physicallinkcategory.getOwnedPropertyValues());
			children.addAll(_physicallinkcategory.getOwnedEnumerationPropertyTypes());
			children.addAll(_physicallinkcategory.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getChangeEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.ChangeEvent _changeevent = (org.polarsys.capella.core.data.capellacommon.ChangeEvent) obj;
			children.addAll(_changeevent.getOwnedExtensions());
			children.addAll(_changeevent.getOwnedConstraints());
			children.addAll(_changeevent.getOwnedMigratedElements());
			children.addAll(_changeevent.getOwnedPropertyValues());
			children.addAll(_changeevent.getOwnedEnumerationPropertyTypes());
			children.addAll(_changeevent.getOwnedPropertyValueGroups());
			children.addAll(_changeevent.getOwnedStateEventRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getInteractionUse(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.InteractionUse _interactionuse = (org.polarsys.capella.core.data.interaction.InteractionUse) obj;
			children.addAll(_interactionuse.getOwnedExtensions());
			children.addAll(_interactionuse.getOwnedConstraints());
			children.addAll(_interactionuse.getOwnedMigratedElements());
			children.addAll(_interactionuse.getOwnedPropertyValues());
			children.addAll(_interactionuse.getOwnedEnumerationPropertyTypes());
			children.addAll(_interactionuse.getOwnedPropertyValueGroups());
			children.addAll(_interactionuse.getOwnedGates());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemAnalysis(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.SystemAnalysis _systemanalysis = (org.polarsys.capella.core.data.ctx.SystemAnalysis) obj;
			children.addAll(_systemanalysis.getOwnedExtensions());
			children.addAll(_systemanalysis.getOwnedConstraints());
			children.addAll(_systemanalysis.getOwnedMigratedElements());
			children.addAll(_systemanalysis.getOwnedPropertyValues());
			children.addAll(_systemanalysis.getOwnedEnumerationPropertyTypes());
			children.addAll(_systemanalysis.getOwnedPropertyValueGroups());
			children.addAll(_systemanalysis.getOwnedTraces());
			children.addAll(_systemanalysis.getNamingRules());
			children.addAll(_systemanalysis.getOwnedPropertyValuePkgs());
			if(_systemanalysis.getOwnedFunctionPkg() != null)
				children.add(_systemanalysis.getOwnedFunctionPkg());
			children.addAll(_systemanalysis.getOwnedComponentExchanges());
			children.addAll(_systemanalysis.getOwnedComponentExchangeCategories());
			children.addAll(_systemanalysis.getOwnedFunctionalLinks());
			children.addAll(_systemanalysis.getOwnedFunctionalAllocations());
			children.addAll(_systemanalysis.getOwnedComponentExchangeRealizations());
			children.addAll(_systemanalysis.getOwnedRequirementPkgs());
			if(_systemanalysis.getOwnedAbstractCapabilityPkg() != null)
				children.add(_systemanalysis.getOwnedAbstractCapabilityPkg());
			if(_systemanalysis.getOwnedInterfacePkg() != null)
				children.add(_systemanalysis.getOwnedInterfacePkg());
			if(_systemanalysis.getOwnedDataPkg() != null)
				children.add(_systemanalysis.getOwnedDataPkg());
			if(_systemanalysis.getOwnedSystemComponentPkg() != null)
				children.add(_systemanalysis.getOwnedSystemComponentPkg());
			if(_systemanalysis.getOwnedMissionPkg() != null)
				children.add(_systemanalysis.getOwnedMissionPkg());
			children.addAll(_systemanalysis.getOwnedOperationalAnalysisRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.communication.CommunicationPackage.eINSTANCE.getMessageReferencePkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.communication.MessageReferencePkg _messagereferencepkg = (org.polarsys.capella.core.data.information.communication.MessageReferencePkg) obj;
			children.addAll(_messagereferencepkg.getOwnedExtensions());
			children.addAll(_messagereferencepkg.getOwnedConstraints());
			children.addAll(_messagereferencepkg.getOwnedMigratedElements());
			children.addAll(_messagereferencepkg.getOwnedPropertyValues());
			children.addAll(_messagereferencepkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_messagereferencepkg.getOwnedPropertyValueGroups());
			children.addAll(_messagereferencepkg.getOwnedTraces());
			children.addAll(_messagereferencepkg.getNamingRules());
			children.addAll(_messagereferencepkg.getOwnedPropertyValuePkgs());
			children.addAll(_messagereferencepkg.getOwnedMessageReferences());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getFeature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.Feature _feature = (org.polarsys.capella.core.data.capellacore.Feature) obj;
			children.addAll(_feature.getOwnedExtensions());
			children.addAll(_feature.getOwnedConstraints());
			children.addAll(_feature.getOwnedMigratedElements());
			children.addAll(_feature.getOwnedPropertyValues());
			children.addAll(_feature.getOwnedEnumerationPropertyTypes());
			children.addAll(_feature.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getInformationRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.InformationRealization _informationrealization = (org.polarsys.capella.core.data.information.InformationRealization) obj;
			children.addAll(_informationrealization.getOwnedExtensions());
			children.addAll(_informationrealization.getOwnedConstraints());
			children.addAll(_informationrealization.getOwnedMigratedElements());
			children.addAll(_informationrealization.getOwnedPropertyValues());
			children.addAll(_informationrealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_informationrealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getInteractionState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.InteractionState _interactionstate = (org.polarsys.capella.core.data.interaction.InteractionState) obj;
			children.addAll(_interactionstate.getOwnedExtensions());
			children.addAll(_interactionstate.getOwnedConstraints());
			children.addAll(_interactionstate.getOwnedMigratedElements());
			children.addAll(_interactionstate.getOwnedPropertyValues());
			children.addAll(_interactionstate.getOwnedEnumerationPropertyTypes());
			children.addAll(_interactionstate.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getExchangeItemRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.ExchangeItemRealization _exchangeitemrealization = (org.polarsys.capella.core.data.information.ExchangeItemRealization) obj;
			children.addAll(_exchangeitemrealization.getOwnedExtensions());
			children.addAll(_exchangeitemrealization.getOwnedConstraints());
			children.addAll(_exchangeitemrealization.getOwnedMigratedElements());
			children.addAll(_exchangeitemrealization.getOwnedPropertyValues());
			children.addAll(_exchangeitemrealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_exchangeitemrealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getConceptPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.ConceptPkg _conceptpkg = (org.polarsys.capella.core.data.oa.ConceptPkg) obj;
			children.addAll(_conceptpkg.getOwnedExtensions());
			children.addAll(_conceptpkg.getOwnedConstraints());
			children.addAll(_conceptpkg.getOwnedMigratedElements());
			children.addAll(_conceptpkg.getOwnedPropertyValues());
			children.addAll(_conceptpkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_conceptpkg.getOwnedPropertyValueGroups());
			children.addAll(_conceptpkg.getOwnedTraces());
			children.addAll(_conceptpkg.getNamingRules());
			children.addAll(_conceptpkg.getOwnedPropertyValuePkgs());
			children.addAll(_conceptpkg.getOwnedConceptPkgs());
			children.addAll(_conceptpkg.getOwnedConcepts());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionalChainInvolvement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionalChainInvolvement _functionalchaininvolvement = (org.polarsys.capella.core.data.fa.FunctionalChainInvolvement) obj;
			children.addAll(_functionalchaininvolvement.getOwnedExtensions());
			children.addAll(_functionalchaininvolvement.getOwnedConstraints());
			children.addAll(_functionalchaininvolvement.getOwnedMigratedElements());
			children.addAll(_functionalchaininvolvement.getOwnedPropertyValues());
			children.addAll(_functionalchaininvolvement.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionalchaininvolvement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getAbstractConceptItem(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.AbstractConceptItem _abstractconceptitem = (org.polarsys.capella.core.data.oa.AbstractConceptItem) obj;
			children.addAll(_abstractconceptitem.getOwnedExtensions());
			children.addAll(_abstractconceptitem.getOwnedConstraints());
			children.addAll(_abstractconceptitem.getOwnedMigratedElements());
			children.addAll(_abstractconceptitem.getOwnedPropertyValues());
			children.addAll(_abstractconceptitem.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractconceptitem.getOwnedPropertyValueGroups());
			children.addAll(_abstractconceptitem.getOwnedTraces());
			children.addAll(_abstractconceptitem.getNamingRules());
			children.addAll(_abstractconceptitem.getOwnedFunctionalAllocation());
			children.addAll(_abstractconceptitem.getOwnedComponentExchanges());
			children.addAll(_abstractconceptitem.getOwnedComponentExchangeCategories());
			if(_abstractconceptitem.getOwnedAbstractCapabilityPkg() != null)
				children.add(_abstractconceptitem.getOwnedAbstractCapabilityPkg());
			if(_abstractconceptitem.getOwnedInterfacePkg() != null)
				children.add(_abstractconceptitem.getOwnedInterfacePkg());
			if(_abstractconceptitem.getOwnedDataPkg() != null)
				children.add(_abstractconceptitem.getOwnedDataPkg());
			children.addAll(_abstractconceptitem.getOwnedStateMachines());
			children.addAll(_abstractconceptitem.getOwnedGeneralizations());
			children.addAll(_abstractconceptitem.getOwnedFeatures());
			children.addAll(_abstractconceptitem.getOwnedInterfaceAllocations());
			children.addAll(_abstractconceptitem.getOwnedCommunicationLinks());
			children.addAll(_abstractconceptitem.getOwnedInterfaceUses());
			children.addAll(_abstractconceptitem.getOwnedInterfaceImplementations());
			children.addAll(_abstractconceptitem.getOwnedComponentRealizations());
			children.addAll(_abstractconceptitem.getOwnedPhysicalPath());
			children.addAll(_abstractconceptitem.getOwnedPhysicalLinks());
			children.addAll(_abstractconceptitem.getOwnedPhysicalLinkCategories());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOperationalActivity(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.OperationalActivity _operationalactivity = (org.polarsys.capella.core.data.oa.OperationalActivity) obj;
			children.addAll(_operationalactivity.getOwnedExtensions());
			children.addAll(_operationalactivity.getOwnedConstraints());
			children.addAll(_operationalactivity.getOwnedMigratedElements());
			children.addAll(_operationalactivity.getOwnedPropertyValues());
			children.addAll(_operationalactivity.getOwnedEnumerationPropertyTypes());
			children.addAll(_operationalactivity.getOwnedPropertyValueGroups());
			children.addAll(_operationalactivity.getOwnedTraces());
			children.addAll(_operationalactivity.getNamingRules());
			if(_operationalactivity.getOwnedDefaultValue() != null)
				children.add(_operationalactivity.getOwnedDefaultValue());
			if(_operationalactivity.getOwnedMinValue() != null)
				children.add(_operationalactivity.getOwnedMinValue());
			if(_operationalactivity.getOwnedMaxValue() != null)
				children.add(_operationalactivity.getOwnedMaxValue());
			if(_operationalactivity.getOwnedNullValue() != null)
				children.add(_operationalactivity.getOwnedNullValue());
			if(_operationalactivity.getOwnedMinCard() != null)
				children.add(_operationalactivity.getOwnedMinCard());
			if(_operationalactivity.getOwnedMinLength() != null)
				children.add(_operationalactivity.getOwnedMinLength());
			if(_operationalactivity.getOwnedMaxCard() != null)
				children.add(_operationalactivity.getOwnedMaxCard());
			if(_operationalactivity.getOwnedMaxLength() != null)
				children.add(_operationalactivity.getOwnedMaxLength());
			children.addAll(_operationalactivity.getOwnedFunctionalChains());
			children.addAll(_operationalactivity.getOwnedHandlers());
			if(_operationalactivity.getLocalPrecondition() != null)
				children.add(_operationalactivity.getLocalPrecondition());
			if(_operationalactivity.getLocalPostcondition() != null)
				children.add(_operationalactivity.getLocalPostcondition());
			children.addAll(_operationalactivity.getInputs());
			children.addAll(_operationalactivity.getOutputs());
			children.addAll(_operationalactivity.getArguments());
			children.addAll(_operationalactivity.getResults());
			children.addAll(_operationalactivity.getOwnedFunctions());
			children.addAll(_operationalactivity.getOwnedFunctionRealizations());
			children.addAll(_operationalactivity.getOwnedFunctionalExchanges());
			children.addAll(_operationalactivity.getOwnedOperationalActivityPkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.communication.CommunicationPackage.eINSTANCE.getSignalInstance(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.communication.SignalInstance _signalinstance = (org.polarsys.capella.core.data.information.communication.SignalInstance) obj;
			children.addAll(_signalinstance.getOwnedExtensions());
			children.addAll(_signalinstance.getOwnedConstraints());
			children.addAll(_signalinstance.getOwnedMigratedElements());
			children.addAll(_signalinstance.getOwnedPropertyValues());
			children.addAll(_signalinstance.getOwnedEnumerationPropertyTypes());
			children.addAll(_signalinstance.getOwnedPropertyValueGroups());
			if(_signalinstance.getOwnedDefaultValue() != null)
				children.add(_signalinstance.getOwnedDefaultValue());
			if(_signalinstance.getOwnedMinValue() != null)
				children.add(_signalinstance.getOwnedMinValue());
			if(_signalinstance.getOwnedMaxValue() != null)
				children.add(_signalinstance.getOwnedMaxValue());
			if(_signalinstance.getOwnedNullValue() != null)
				children.add(_signalinstance.getOwnedNullValue());
			if(_signalinstance.getOwnedMinCard() != null)
				children.add(_signalinstance.getOwnedMinCard());
			if(_signalinstance.getOwnedMinLength() != null)
				children.add(_signalinstance.getOwnedMinLength());
			if(_signalinstance.getOwnedMaxCard() != null)
				children.add(_signalinstance.getOwnedMaxCard());
			if(_signalinstance.getOwnedMaxLength() != null)
				children.add(_signalinstance.getOwnedMaxLength());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getInterfaceImplementation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.InterfaceImplementation _interfaceimplementation = (org.polarsys.capella.core.data.cs.InterfaceImplementation) obj;
			children.addAll(_interfaceimplementation.getOwnedExtensions());
			children.addAll(_interfaceimplementation.getOwnedConstraints());
			children.addAll(_interfaceimplementation.getOwnedMigratedElements());
			children.addAll(_interfaceimplementation.getOwnedPropertyValues());
			children.addAll(_interfaceimplementation.getOwnedEnumerationPropertyTypes());
			children.addAll(_interfaceimplementation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOperationalScenario(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.OperationalScenario _operationalscenario = (org.polarsys.capella.core.data.oa.OperationalScenario) obj;
			children.addAll(_operationalscenario.getOwnedExtensions());
			children.addAll(_operationalscenario.getOwnedConstraints());
			children.addAll(_operationalscenario.getOwnedMigratedElements());
			children.addAll(_operationalscenario.getOwnedPropertyValues());
			children.addAll(_operationalscenario.getOwnedEnumerationPropertyTypes());
			children.addAll(_operationalscenario.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getTraceableElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.TraceableElement _traceableelement = (modellingcore.TraceableElement) obj;
			children.addAll(_traceableelement.getOwnedExtensions());
			children.addAll(_traceableelement.getOwnedConstraints());
			children.addAll(_traceableelement.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemComponent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.SystemComponent _systemcomponent = (org.polarsys.capella.core.data.ctx.SystemComponent) obj;
			children.addAll(_systemcomponent.getOwnedExtensions());
			children.addAll(_systemcomponent.getOwnedConstraints());
			children.addAll(_systemcomponent.getOwnedMigratedElements());
			children.addAll(_systemcomponent.getOwnedPropertyValues());
			children.addAll(_systemcomponent.getOwnedEnumerationPropertyTypes());
			children.addAll(_systemcomponent.getOwnedPropertyValueGroups());
			children.addAll(_systemcomponent.getOwnedTraces());
			children.addAll(_systemcomponent.getNamingRules());
			children.addAll(_systemcomponent.getOwnedFunctionalAllocation());
			children.addAll(_systemcomponent.getOwnedComponentExchanges());
			children.addAll(_systemcomponent.getOwnedComponentExchangeCategories());
			if(_systemcomponent.getOwnedAbstractCapabilityPkg() != null)
				children.add(_systemcomponent.getOwnedAbstractCapabilityPkg());
			if(_systemcomponent.getOwnedInterfacePkg() != null)
				children.add(_systemcomponent.getOwnedInterfacePkg());
			if(_systemcomponent.getOwnedDataPkg() != null)
				children.add(_systemcomponent.getOwnedDataPkg());
			children.addAll(_systemcomponent.getOwnedStateMachines());
			children.addAll(_systemcomponent.getOwnedGeneralizations());
			children.addAll(_systemcomponent.getOwnedFeatures());
			children.addAll(_systemcomponent.getOwnedInterfaceAllocations());
			children.addAll(_systemcomponent.getOwnedCommunicationLinks());
			children.addAll(_systemcomponent.getOwnedInterfaceUses());
			children.addAll(_systemcomponent.getOwnedInterfaceImplementations());
			children.addAll(_systemcomponent.getOwnedComponentRealizations());
			children.addAll(_systemcomponent.getOwnedPhysicalPath());
			children.addAll(_systemcomponent.getOwnedPhysicalLinks());
			children.addAll(_systemcomponent.getOwnedPhysicalLinkCategories());
			children.addAll(_systemcomponent.getOwnedSystemComponents());
			children.addAll(_systemcomponent.getOwnedSystemComponentPkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getFloatPropertyValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.FloatPropertyValue _floatpropertyvalue = (org.polarsys.capella.core.data.capellacore.FloatPropertyValue) obj;
			children.addAll(_floatpropertyvalue.getOwnedExtensions());
			children.addAll(_floatpropertyvalue.getOwnedConstraints());
			children.addAll(_floatpropertyvalue.getOwnedMigratedElements());
			children.addAll(_floatpropertyvalue.getOwnedPropertyValues());
			children.addAll(_floatpropertyvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_floatpropertyvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(behavior.BehaviorPackage.eINSTANCE.getAbstractSignal(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			behavior.AbstractSignal _abstractsignal = (behavior.AbstractSignal) obj;
			children.addAll(_abstractsignal.getOwnedExtensions());
			children.addAll(_abstractsignal.getOwnedConstraints());
			children.addAll(_abstractsignal.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getExitPointPseudoState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.ExitPointPseudoState _exitpointpseudostate = (org.polarsys.capella.core.data.capellacommon.ExitPointPseudoState) obj;
			children.addAll(_exitpointpseudostate.getOwnedExtensions());
			children.addAll(_exitpointpseudostate.getOwnedConstraints());
			children.addAll(_exitpointpseudostate.getOwnedMigratedElements());
			children.addAll(_exitpointpseudostate.getOwnedPropertyValues());
			children.addAll(_exitpointpseudostate.getOwnedEnumerationPropertyTypes());
			children.addAll(_exitpointpseudostate.getOwnedPropertyValueGroups());
			children.addAll(_exitpointpseudostate.getOwnedAbstractStateRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemCommunicationHook(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.SystemCommunicationHook _systemcommunicationhook = (org.polarsys.capella.core.data.ctx.SystemCommunicationHook) obj;
			children.addAll(_systemcommunicationhook.getOwnedExtensions());
			children.addAll(_systemcommunicationhook.getOwnedConstraints());
			children.addAll(_systemcommunicationhook.getOwnedMigratedElements());
			children.addAll(_systemcommunicationhook.getOwnedPropertyValues());
			children.addAll(_systemcommunicationhook.getOwnedEnumerationPropertyTypes());
			children.addAll(_systemcommunicationhook.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getOperation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.Operation _operation = (org.polarsys.capella.core.data.information.Operation) obj;
			children.addAll(_operation.getOwnedExtensions());
			children.addAll(_operation.getOwnedConstraints());
			children.addAll(_operation.getOwnedMigratedElements());
			children.addAll(_operation.getOwnedPropertyValues());
			children.addAll(_operation.getOwnedEnumerationPropertyTypes());
			children.addAll(_operation.getOwnedPropertyValueGroups());
			children.addAll(_operation.getOwnedParameters());
			children.addAll(_operation.getOwnedOperationAllocation());
			children.addAll(_operation.getOwnedExchangeItemRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getDeepHistoryPseudoState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.DeepHistoryPseudoState _deephistorypseudostate = (org.polarsys.capella.core.data.capellacommon.DeepHistoryPseudoState) obj;
			children.addAll(_deephistorypseudostate.getOwnedExtensions());
			children.addAll(_deephistorypseudostate.getOwnedConstraints());
			children.addAll(_deephistorypseudostate.getOwnedMigratedElements());
			children.addAll(_deephistorypseudostate.getOwnedPropertyValues());
			children.addAll(_deephistorypseudostate.getOwnedEnumerationPropertyTypes());
			children.addAll(_deephistorypseudostate.getOwnedPropertyValueGroups());
			children.addAll(_deephistorypseudostate.getOwnedAbstractStateRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getInitialPseudoState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.InitialPseudoState _initialpseudostate = (org.polarsys.capella.core.data.capellacommon.InitialPseudoState) obj;
			children.addAll(_initialpseudostate.getOwnedExtensions());
			children.addAll(_initialpseudostate.getOwnedConstraints());
			children.addAll(_initialpseudostate.getOwnedMigratedElements());
			children.addAll(_initialpseudostate.getOwnedPropertyValues());
			children.addAll(_initialpseudostate.getOwnedEnumerationPropertyTypes());
			children.addAll(_initialpseudostate.getOwnedPropertyValueGroups());
			children.addAll(_initialpseudostate.getOwnedAbstractStateRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getReuseableStructure(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.ReuseableStructure _reuseablestructure = (org.polarsys.capella.core.data.capellacore.ReuseableStructure) obj;
			children.addAll(_reuseablestructure.getOwnedExtensions());
			children.addAll(_reuseablestructure.getOwnedConstraints());
			children.addAll(_reuseablestructure.getOwnedMigratedElements());
			children.addAll(_reuseablestructure.getOwnedPropertyValues());
			children.addAll(_reuseablestructure.getOwnedEnumerationPropertyTypes());
			children.addAll(_reuseablestructure.getOwnedPropertyValueGroups());
			children.addAll(_reuseablestructure.getOwnedTraces());
			children.addAll(_reuseablestructure.getNamingRules());
			children.addAll(_reuseablestructure.getOwnedPropertyValuePkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getAbstractAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.AbstractAction _abstractaction = (org.polarsys.capella.common.data.activity.AbstractAction) obj;
			children.addAll(_abstractaction.getOwnedExtensions());
			children.addAll(_abstractaction.getOwnedConstraints());
			children.addAll(_abstractaction.getOwnedMigratedElements());
			children.addAll(_abstractaction.getOwnedHandlers());
			if(_abstractaction.getLocalPrecondition() != null)
				children.add(_abstractaction.getLocalPrecondition());
			if(_abstractaction.getLocalPostcondition() != null)
				children.add(_abstractaction.getLocalPostcondition());
			children.addAll(_abstractaction.getInputs());
			children.addAll(_abstractaction.getOutputs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getValuePin(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.ValuePin _valuepin = (org.polarsys.capella.common.data.activity.ValuePin) obj;
			children.addAll(_valuepin.getOwnedExtensions());
			children.addAll(_valuepin.getOwnedConstraints());
			children.addAll(_valuepin.getOwnedMigratedElements());
			if(_valuepin.getUpperBound() != null)
				children.add(_valuepin.getUpperBound());
			if(_valuepin.getValue() != null)
				children.add(_valuepin.getValue());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getStateEventRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.StateEventRealization _stateeventrealization = (org.polarsys.capella.core.data.capellacommon.StateEventRealization) obj;
			children.addAll(_stateeventrealization.getOwnedExtensions());
			children.addAll(_stateeventrealization.getOwnedConstraints());
			children.addAll(_stateeventrealization.getOwnedMigratedElements());
			children.addAll(_stateeventrealization.getOwnedPropertyValues());
			children.addAll(_stateeventrealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_stateeventrealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getComponentPortAllocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ComponentPortAllocation _componentportallocation = (org.polarsys.capella.core.data.fa.ComponentPortAllocation) obj;
			children.addAll(_componentportallocation.getOwnedExtensions());
			children.addAll(_componentportallocation.getOwnedConstraints());
			children.addAll(_componentportallocation.getOwnedMigratedElements());
			children.addAll(_componentportallocation.getOwnedPropertyValues());
			children.addAll(_componentportallocation.getOwnedEnumerationPropertyTypes());
			children.addAll(_componentportallocation.getOwnedPropertyValueGroups());
			children.addAll(_componentportallocation.getOwnedComponentPortAllocationEnds());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getComplexValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.ComplexValue _complexvalue = (org.polarsys.capella.core.data.information.datavalue.ComplexValue) obj;
			children.addAll(_complexvalue.getOwnedExtensions());
			children.addAll(_complexvalue.getOwnedConstraints());
			children.addAll(_complexvalue.getOwnedMigratedElements());
			children.addAll(_complexvalue.getOwnedPropertyValues());
			children.addAll(_complexvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_complexvalue.getOwnedPropertyValueGroups());
			children.addAll(_complexvalue.getOwnedParts());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getAbstractPropertyValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.AbstractPropertyValue _abstractpropertyvalue = (org.polarsys.capella.core.data.capellacore.AbstractPropertyValue) obj;
			children.addAll(_abstractpropertyvalue.getOwnedExtensions());
			children.addAll(_abstractpropertyvalue.getOwnedConstraints());
			children.addAll(_abstractpropertyvalue.getOwnedMigratedElements());
			children.addAll(_abstractpropertyvalue.getOwnedPropertyValues());
			children.addAll(_abstractpropertyvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractpropertyvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getCapabilityInvolvement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.CapabilityInvolvement _capabilityinvolvement = (org.polarsys.capella.core.data.ctx.CapabilityInvolvement) obj;
			children.addAll(_capabilityinvolvement.getOwnedExtensions());
			children.addAll(_capabilityinvolvement.getOwnedConstraints());
			children.addAll(_capabilityinvolvement.getOwnedMigratedElements());
			children.addAll(_capabilityinvolvement.getOwnedPropertyValues());
			children.addAll(_capabilityinvolvement.getOwnedEnumerationPropertyTypes());
			children.addAll(_capabilityinvolvement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getGate(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.Gate _gate = (org.polarsys.capella.core.data.interaction.Gate) obj;
			children.addAll(_gate.getOwnedExtensions());
			children.addAll(_gate.getOwnedConstraints());
			children.addAll(_gate.getOwnedMigratedElements());
			children.addAll(_gate.getOwnedPropertyValues());
			children.addAll(_gate.getOwnedEnumerationPropertyTypes());
			children.addAll(_gate.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(behavior.BehaviorPackage.eINSTANCE.getAbstractSignalEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			behavior.AbstractSignalEvent _abstractsignalevent = (behavior.AbstractSignalEvent) obj;
			children.addAll(_abstractsignalevent.getOwnedExtensions());
			children.addAll(_abstractsignalevent.getOwnedConstraints());
			children.addAll(_abstractsignalevent.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getCommunicationMean(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.CommunicationMean _communicationmean = (org.polarsys.capella.core.data.oa.CommunicationMean) obj;
			children.addAll(_communicationmean.getOwnedExtensions());
			children.addAll(_communicationmean.getOwnedConstraints());
			children.addAll(_communicationmean.getOwnedMigratedElements());
			children.addAll(_communicationmean.getOwnedPropertyValues());
			children.addAll(_communicationmean.getOwnedEnumerationPropertyTypes());
			children.addAll(_communicationmean.getOwnedPropertyValueGroups());
			children.addAll(_communicationmean.getNamingRules());
			children.addAll(_communicationmean.getOwnedComponentExchangeFunctionalExchangeAllocations());
			children.addAll(_communicationmean.getOwnedComponentExchangeRealizations());
			children.addAll(_communicationmean.getOwnedComponentExchangeEnds());
			return children;
		});
		explorationConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getComponentPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.ComponentPkg _componentpkg = (org.polarsys.capella.core.data.cs.ComponentPkg) obj;
			children.addAll(_componentpkg.getOwnedExtensions());
			children.addAll(_componentpkg.getOwnedConstraints());
			children.addAll(_componentpkg.getOwnedMigratedElements());
			children.addAll(_componentpkg.getOwnedPropertyValues());
			children.addAll(_componentpkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_componentpkg.getOwnedPropertyValueGroups());
			children.addAll(_componentpkg.getOwnedTraces());
			children.addAll(_componentpkg.getNamingRules());
			children.addAll(_componentpkg.getOwnedPropertyValuePkgs());
			children.addAll(_componentpkg.getOwnedParts());
			children.addAll(_componentpkg.getOwnedComponentExchanges());
			children.addAll(_componentpkg.getOwnedComponentExchangeCategories());
			children.addAll(_componentpkg.getOwnedFunctionalLinks());
			children.addAll(_componentpkg.getOwnedFunctionalAllocations());
			children.addAll(_componentpkg.getOwnedComponentExchangeRealizations());
			children.addAll(_componentpkg.getOwnedPhysicalLinks());
			children.addAll(_componentpkg.getOwnedPhysicalLinkCategories());
			children.addAll(_componentpkg.getOwnedStateMachines());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getAbstractCapabilityRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.AbstractCapabilityRealization _abstractcapabilityrealization = (org.polarsys.capella.core.data.interaction.AbstractCapabilityRealization) obj;
			children.addAll(_abstractcapabilityrealization.getOwnedExtensions());
			children.addAll(_abstractcapabilityrealization.getOwnedConstraints());
			children.addAll(_abstractcapabilityrealization.getOwnedMigratedElements());
			children.addAll(_abstractcapabilityrealization.getOwnedPropertyValues());
			children.addAll(_abstractcapabilityrealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractcapabilityrealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getFunctionalChainAbstractCapabilityInvolvement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.FunctionalChainAbstractCapabilityInvolvement _functionalchainabstractcapabilityinvolvement = (org.polarsys.capella.core.data.interaction.FunctionalChainAbstractCapabilityInvolvement) obj;
			children.addAll(_functionalchainabstractcapabilityinvolvement.getOwnedExtensions());
			children.addAll(_functionalchainabstractcapabilityinvolvement.getOwnedConstraints());
			children.addAll(_functionalchainabstractcapabilityinvolvement.getOwnedMigratedElements());
			children.addAll(_functionalchainabstractcapabilityinvolvement.getOwnedPropertyValues());
			children.addAll(_functionalchainabstractcapabilityinvolvement.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionalchainabstractcapabilityinvolvement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(behavior.BehaviorPackage.eINSTANCE.getTimeExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			behavior.TimeExpression _timeexpression = (behavior.TimeExpression) obj;
			children.addAll(_timeexpression.getOwnedExtensions());
			children.addAll(_timeexpression.getOwnedConstraints());
			children.addAll(_timeexpression.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getAbstractCapability(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.AbstractCapability _abstractcapability = (org.polarsys.capella.core.data.interaction.AbstractCapability) obj;
			children.addAll(_abstractcapability.getOwnedExtensions());
			children.addAll(_abstractcapability.getOwnedConstraints());
			children.addAll(_abstractcapability.getOwnedMigratedElements());
			children.addAll(_abstractcapability.getOwnedPropertyValues());
			children.addAll(_abstractcapability.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractcapability.getOwnedPropertyValueGroups());
			children.addAll(_abstractcapability.getOwnedTraces());
			children.addAll(_abstractcapability.getNamingRules());
			children.addAll(_abstractcapability.getOwnedPropertyValuePkgs());
			children.addAll(_abstractcapability.getOwnedFunctionalChains());
			children.addAll(_abstractcapability.getOwnedScenarios());
			children.addAll(_abstractcapability.getExtends());
			children.addAll(_abstractcapability.getAbstractCapabilityExtensionPoints());
			children.addAll(_abstractcapability.getSuperGeneralizations());
			children.addAll(_abstractcapability.getIncludes());
			children.addAll(_abstractcapability.getOwnedFunctionalChainAbstractCapabilityInvolvements());
			children.addAll(_abstractcapability.getOwnedAbstractFunctionAbstractCapabilityInvolvements());
			children.addAll(_abstractcapability.getOwnedAbstractCapabilityRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOperationalCapability(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.OperationalCapability _operationalcapability = (org.polarsys.capella.core.data.oa.OperationalCapability) obj;
			children.addAll(_operationalcapability.getOwnedExtensions());
			children.addAll(_operationalcapability.getOwnedConstraints());
			children.addAll(_operationalcapability.getOwnedMigratedElements());
			children.addAll(_operationalcapability.getOwnedPropertyValues());
			children.addAll(_operationalcapability.getOwnedEnumerationPropertyTypes());
			children.addAll(_operationalcapability.getOwnedPropertyValueGroups());
			children.addAll(_operationalcapability.getOwnedTraces());
			children.addAll(_operationalcapability.getNamingRules());
			children.addAll(_operationalcapability.getOwnedPropertyValuePkgs());
			children.addAll(_operationalcapability.getOwnedFunctionalChains());
			children.addAll(_operationalcapability.getOwnedScenarios());
			children.addAll(_operationalcapability.getExtends());
			children.addAll(_operationalcapability.getAbstractCapabilityExtensionPoints());
			children.addAll(_operationalcapability.getSuperGeneralizations());
			children.addAll(_operationalcapability.getIncludes());
			children.addAll(_operationalcapability.getOwnedFunctionalChainAbstractCapabilityInvolvements());
			children.addAll(_operationalcapability.getOwnedAbstractFunctionAbstractCapabilityInvolvements());
			children.addAll(_operationalcapability.getOwnedAbstractCapabilityRealizations());
			children.addAll(_operationalcapability.getOwnedEntityOperationalCapabilityInvolvements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getPort(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.Port _port = (org.polarsys.capella.core.data.information.Port) obj;
			children.addAll(_port.getOwnedExtensions());
			children.addAll(_port.getOwnedConstraints());
			children.addAll(_port.getOwnedMigratedElements());
			children.addAll(_port.getOwnedPropertyValues());
			children.addAll(_port.getOwnedEnumerationPropertyTypes());
			children.addAll(_port.getOwnedPropertyValueGroups());
			children.addAll(_port.getOwnedProtocols());
			children.addAll(_port.getOwnedPortRealizations());
			children.addAll(_port.getOwnedPortAllocations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getModellingArchitecturePkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.ModellingArchitecturePkg _modellingarchitecturepkg = (org.polarsys.capella.core.data.capellacore.ModellingArchitecturePkg) obj;
			children.addAll(_modellingarchitecturepkg.getOwnedExtensions());
			children.addAll(_modellingarchitecturepkg.getOwnedConstraints());
			children.addAll(_modellingarchitecturepkg.getOwnedMigratedElements());
			children.addAll(_modellingarchitecturepkg.getOwnedPropertyValues());
			children.addAll(_modellingarchitecturepkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_modellingarchitecturepkg.getOwnedPropertyValueGroups());
			children.addAll(_modellingarchitecturepkg.getOwnedTraces());
			children.addAll(_modellingarchitecturepkg.getNamingRules());
			children.addAll(_modellingarchitecturepkg.getOwnedPropertyValuePkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getComponentArchitecture(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.ComponentArchitecture _componentarchitecture = (org.polarsys.capella.core.data.cs.ComponentArchitecture) obj;
			children.addAll(_componentarchitecture.getOwnedExtensions());
			children.addAll(_componentarchitecture.getOwnedConstraints());
			children.addAll(_componentarchitecture.getOwnedMigratedElements());
			children.addAll(_componentarchitecture.getOwnedPropertyValues());
			children.addAll(_componentarchitecture.getOwnedEnumerationPropertyTypes());
			children.addAll(_componentarchitecture.getOwnedPropertyValueGroups());
			children.addAll(_componentarchitecture.getOwnedTraces());
			children.addAll(_componentarchitecture.getNamingRules());
			children.addAll(_componentarchitecture.getOwnedPropertyValuePkgs());
			if(_componentarchitecture.getOwnedFunctionPkg() != null)
				children.add(_componentarchitecture.getOwnedFunctionPkg());
			children.addAll(_componentarchitecture.getOwnedComponentExchanges());
			children.addAll(_componentarchitecture.getOwnedComponentExchangeCategories());
			children.addAll(_componentarchitecture.getOwnedFunctionalLinks());
			children.addAll(_componentarchitecture.getOwnedFunctionalAllocations());
			children.addAll(_componentarchitecture.getOwnedComponentExchangeRealizations());
			children.addAll(_componentarchitecture.getOwnedRequirementPkgs());
			if(_componentarchitecture.getOwnedAbstractCapabilityPkg() != null)
				children.add(_componentarchitecture.getOwnedAbstractCapabilityPkg());
			if(_componentarchitecture.getOwnedInterfacePkg() != null)
				children.add(_componentarchitecture.getOwnedInterfacePkg());
			if(_componentarchitecture.getOwnedDataPkg() != null)
				children.add(_componentarchitecture.getOwnedDataPkg());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getSwimlane(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.Swimlane _swimlane = (org.polarsys.capella.core.data.oa.Swimlane) obj;
			children.addAll(_swimlane.getOwnedExtensions());
			children.addAll(_swimlane.getOwnedConstraints());
			children.addAll(_swimlane.getOwnedMigratedElements());
			children.addAll(_swimlane.getOwnedPropertyValues());
			children.addAll(_swimlane.getOwnedEnumerationPropertyTypes());
			children.addAll(_swimlane.getOwnedPropertyValueGroups());
			children.addAll(_swimlane.getSubGroups());
			children.addAll(_swimlane.getOwnedNodes());
			children.addAll(_swimlane.getOwnedEdges());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getConceptCompliance(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.ConceptCompliance _conceptcompliance = (org.polarsys.capella.core.data.oa.ConceptCompliance) obj;
			children.addAll(_conceptcompliance.getOwnedExtensions());
			children.addAll(_conceptcompliance.getOwnedConstraints());
			children.addAll(_conceptcompliance.getOwnedMigratedElements());
			children.addAll(_conceptcompliance.getOwnedPropertyValues());
			children.addAll(_conceptcompliance.getOwnedEnumerationPropertyTypes());
			children.addAll(_conceptcompliance.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getExecutionEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.ExecutionEvent _executionevent = (org.polarsys.capella.core.data.interaction.ExecutionEvent) obj;
			children.addAll(_executionevent.getOwnedExtensions());
			children.addAll(_executionevent.getOwnedConstraints());
			children.addAll(_executionevent.getOwnedMigratedElements());
			children.addAll(_executionevent.getOwnedPropertyValues());
			children.addAll(_executionevent.getOwnedEnumerationPropertyTypes());
			children.addAll(_executionevent.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionalChain(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionalChain _functionalchain = (org.polarsys.capella.core.data.fa.FunctionalChain) obj;
			children.addAll(_functionalchain.getOwnedExtensions());
			children.addAll(_functionalchain.getOwnedConstraints());
			children.addAll(_functionalchain.getOwnedMigratedElements());
			children.addAll(_functionalchain.getOwnedPropertyValues());
			children.addAll(_functionalchain.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionalchain.getOwnedPropertyValueGroups());
			children.addAll(_functionalchain.getOwnedFunctionalChainInvolvements());
			children.addAll(_functionalchain.getOwnedFunctionalChainRealizations());
			children.addAll(_functionalchain.getOwnedSequenceNodes());
			children.addAll(_functionalchain.getOwnedSequenceLinks());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionalChainRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionalChainRealization _functionalchainrealization = (org.polarsys.capella.core.data.fa.FunctionalChainRealization) obj;
			children.addAll(_functionalchainrealization.getOwnedExtensions());
			children.addAll(_functionalchainrealization.getOwnedConstraints());
			children.addAll(_functionalchainrealization.getOwnedMigratedElements());
			children.addAll(_functionalchainrealization.getOwnedPropertyValues());
			children.addAll(_functionalchainrealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionalchainrealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getAbstractStateRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.AbstractStateRealization _abstractstaterealization = (org.polarsys.capella.core.data.capellacommon.AbstractStateRealization) obj;
			children.addAll(_abstractstaterealization.getOwnedExtensions());
			children.addAll(_abstractstaterealization.getOwnedConstraints());
			children.addAll(_abstractstaterealization.getOwnedMigratedElements());
			children.addAll(_abstractstaterealization.getOwnedPropertyValues());
			children.addAll(_abstractstaterealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractstaterealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getAbstractCapabilityPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.AbstractCapabilityPkg _abstractcapabilitypkg = (org.polarsys.capella.core.data.capellacommon.AbstractCapabilityPkg) obj;
			children.addAll(_abstractcapabilitypkg.getOwnedExtensions());
			children.addAll(_abstractcapabilitypkg.getOwnedConstraints());
			children.addAll(_abstractcapabilitypkg.getOwnedMigratedElements());
			children.addAll(_abstractcapabilitypkg.getOwnedPropertyValues());
			children.addAll(_abstractcapabilitypkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractcapabilitypkg.getOwnedPropertyValueGroups());
			children.addAll(_abstractcapabilitypkg.getOwnedTraces());
			children.addAll(_abstractcapabilitypkg.getNamingRules());
			children.addAll(_abstractcapabilitypkg.getOwnedPropertyValuePkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getGeneralization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.Generalization _generalization = (org.polarsys.capella.core.data.capellacore.Generalization) obj;
			children.addAll(_generalization.getOwnedExtensions());
			children.addAll(_generalization.getOwnedConstraints());
			children.addAll(_generalization.getOwnedMigratedElements());
			children.addAll(_generalization.getOwnedPropertyValues());
			children.addAll(_generalization.getOwnedEnumerationPropertyTypes());
			children.addAll(_generalization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getMultiplicityElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.MultiplicityElement _multiplicityelement = (org.polarsys.capella.core.data.information.MultiplicityElement) obj;
			children.addAll(_multiplicityelement.getOwnedExtensions());
			children.addAll(_multiplicityelement.getOwnedConstraints());
			children.addAll(_multiplicityelement.getOwnedMigratedElements());
			children.addAll(_multiplicityelement.getOwnedPropertyValues());
			children.addAll(_multiplicityelement.getOwnedEnumerationPropertyTypes());
			children.addAll(_multiplicityelement.getOwnedPropertyValueGroups());
			if(_multiplicityelement.getOwnedDefaultValue() != null)
				children.add(_multiplicityelement.getOwnedDefaultValue());
			if(_multiplicityelement.getOwnedMinValue() != null)
				children.add(_multiplicityelement.getOwnedMinValue());
			if(_multiplicityelement.getOwnedMaxValue() != null)
				children.add(_multiplicityelement.getOwnedMaxValue());
			if(_multiplicityelement.getOwnedNullValue() != null)
				children.add(_multiplicityelement.getOwnedNullValue());
			if(_multiplicityelement.getOwnedMinCard() != null)
				children.add(_multiplicityelement.getOwnedMinCard());
			if(_multiplicityelement.getOwnedMinLength() != null)
				children.add(_multiplicityelement.getOwnedMinLength());
			if(_multiplicityelement.getOwnedMaxCard() != null)
				children.add(_multiplicityelement.getOwnedMaxCard());
			if(_multiplicityelement.getOwnedMaxLength() != null)
				children.add(_multiplicityelement.getOwnedMaxLength());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getAbstractFunctionalArchitecture(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.AbstractFunctionalArchitecture _abstractfunctionalarchitecture = (org.polarsys.capella.core.data.fa.AbstractFunctionalArchitecture) obj;
			children.addAll(_abstractfunctionalarchitecture.getOwnedExtensions());
			children.addAll(_abstractfunctionalarchitecture.getOwnedConstraints());
			children.addAll(_abstractfunctionalarchitecture.getOwnedMigratedElements());
			children.addAll(_abstractfunctionalarchitecture.getOwnedPropertyValues());
			children.addAll(_abstractfunctionalarchitecture.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractfunctionalarchitecture.getOwnedPropertyValueGroups());
			children.addAll(_abstractfunctionalarchitecture.getOwnedTraces());
			children.addAll(_abstractfunctionalarchitecture.getNamingRules());
			children.addAll(_abstractfunctionalarchitecture.getOwnedPropertyValuePkgs());
			if(_abstractfunctionalarchitecture.getOwnedFunctionPkg() != null)
				children.add(_abstractfunctionalarchitecture.getOwnedFunctionPkg());
			children.addAll(_abstractfunctionalarchitecture.getOwnedComponentExchanges());
			children.addAll(_abstractfunctionalarchitecture.getOwnedComponentExchangeCategories());
			children.addAll(_abstractfunctionalarchitecture.getOwnedFunctionalLinks());
			children.addAll(_abstractfunctionalarchitecture.getOwnedFunctionalAllocations());
			children.addAll(_abstractfunctionalarchitecture.getOwnedComponentExchangeRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getComponentRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.ComponentRealization _componentrealization = (org.polarsys.capella.core.data.cs.ComponentRealization) obj;
			children.addAll(_componentrealization.getOwnedExtensions());
			children.addAll(_componentrealization.getOwnedConstraints());
			children.addAll(_componentrealization.getOwnedMigratedElements());
			children.addAll(_componentrealization.getOwnedPropertyValues());
			children.addAll(_componentrealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_componentrealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.communication.CommunicationPackage.eINSTANCE.getMessageReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.communication.MessageReference _messagereference = (org.polarsys.capella.core.data.information.communication.MessageReference) obj;
			children.addAll(_messagereference.getOwnedExtensions());
			children.addAll(_messagereference.getOwnedConstraints());
			children.addAll(_messagereference.getOwnedMigratedElements());
			children.addAll(_messagereference.getOwnedPropertyValues());
			children.addAll(_messagereference.getOwnedEnumerationPropertyTypes());
			children.addAll(_messagereference.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getCapability(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.Capability _capability = (org.polarsys.capella.core.data.ctx.Capability) obj;
			children.addAll(_capability.getOwnedExtensions());
			children.addAll(_capability.getOwnedConstraints());
			children.addAll(_capability.getOwnedMigratedElements());
			children.addAll(_capability.getOwnedPropertyValues());
			children.addAll(_capability.getOwnedEnumerationPropertyTypes());
			children.addAll(_capability.getOwnedPropertyValueGroups());
			children.addAll(_capability.getOwnedTraces());
			children.addAll(_capability.getNamingRules());
			children.addAll(_capability.getOwnedPropertyValuePkgs());
			children.addAll(_capability.getOwnedFunctionalChains());
			children.addAll(_capability.getOwnedScenarios());
			children.addAll(_capability.getExtends());
			children.addAll(_capability.getAbstractCapabilityExtensionPoints());
			children.addAll(_capability.getSuperGeneralizations());
			children.addAll(_capability.getIncludes());
			children.addAll(_capability.getOwnedFunctionalChainAbstractCapabilityInvolvements());
			children.addAll(_capability.getOwnedAbstractFunctionAbstractCapabilityInvolvements());
			children.addAll(_capability.getOwnedAbstractCapabilityRealizations());
			children.addAll(_capability.getOwnedCapabilityInvolvements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getAbstractBooleanValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.AbstractBooleanValue _abstractbooleanvalue = (org.polarsys.capella.core.data.information.datavalue.AbstractBooleanValue) obj;
			children.addAll(_abstractbooleanvalue.getOwnedExtensions());
			children.addAll(_abstractbooleanvalue.getOwnedConstraints());
			children.addAll(_abstractbooleanvalue.getOwnedMigratedElements());
			children.addAll(_abstractbooleanvalue.getOwnedPropertyValues());
			children.addAll(_abstractbooleanvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractbooleanvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionalChainInvolvementLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionalChainInvolvementLink _functionalchaininvolvementlink = (org.polarsys.capella.core.data.fa.FunctionalChainInvolvementLink) obj;
			children.addAll(_functionalchaininvolvementlink.getOwnedExtensions());
			children.addAll(_functionalchaininvolvementlink.getOwnedConstraints());
			children.addAll(_functionalchaininvolvementlink.getOwnedMigratedElements());
			children.addAll(_functionalchaininvolvementlink.getOwnedPropertyValues());
			children.addAll(_functionalchaininvolvementlink.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionalchaininvolvementlink.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getTempContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			runtime.TempContainer _tempcontainer = (runtime.TempContainer) obj;
			children.addAll(_tempcontainer.getObjects());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getSequenceLinkEnd(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.SequenceLinkEnd _sequencelinkend = (org.polarsys.capella.core.data.fa.SequenceLinkEnd) obj;
			children.addAll(_sequencelinkend.getOwnedExtensions());
			children.addAll(_sequencelinkend.getOwnedConstraints());
			children.addAll(_sequencelinkend.getOwnedMigratedElements());
			children.addAll(_sequencelinkend.getOwnedPropertyValues());
			children.addAll(_sequencelinkend.getOwnedEnumerationPropertyTypes());
			children.addAll(_sequencelinkend.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getTimeEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.TimeEvent _timeevent = (org.polarsys.capella.core.data.capellacommon.TimeEvent) obj;
			children.addAll(_timeevent.getOwnedExtensions());
			children.addAll(_timeevent.getOwnedConstraints());
			children.addAll(_timeevent.getOwnedMigratedElements());
			children.addAll(_timeevent.getOwnedPropertyValues());
			children.addAll(_timeevent.getOwnedEnumerationPropertyTypes());
			children.addAll(_timeevent.getOwnedPropertyValueGroups());
			children.addAll(_timeevent.getOwnedStateEventRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getPhysicalPort(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.PhysicalPort _physicalport = (org.polarsys.capella.core.data.cs.PhysicalPort) obj;
			children.addAll(_physicalport.getOwnedExtensions());
			children.addAll(_physicalport.getOwnedConstraints());
			children.addAll(_physicalport.getOwnedMigratedElements());
			children.addAll(_physicalport.getOwnedPropertyValues());
			children.addAll(_physicalport.getOwnedEnumerationPropertyTypes());
			children.addAll(_physicalport.getOwnedPropertyValueGroups());
			children.addAll(_physicalport.getOwnedProtocols());
			children.addAll(_physicalport.getOwnedPortRealizations());
			children.addAll(_physicalport.getOwnedPortAllocations());
			if(_physicalport.getOwnedDefaultValue() != null)
				children.add(_physicalport.getOwnedDefaultValue());
			if(_physicalport.getOwnedMinValue() != null)
				children.add(_physicalport.getOwnedMinValue());
			if(_physicalport.getOwnedMaxValue() != null)
				children.add(_physicalport.getOwnedMaxValue());
			if(_physicalport.getOwnedNullValue() != null)
				children.add(_physicalport.getOwnedNullValue());
			if(_physicalport.getOwnedMinCard() != null)
				children.add(_physicalport.getOwnedMinCard());
			if(_physicalport.getOwnedMinLength() != null)
				children.add(_physicalport.getOwnedMinLength());
			if(_physicalport.getOwnedMaxCard() != null)
				children.add(_physicalport.getOwnedMaxCard());
			if(_physicalport.getOwnedMaxLength() != null)
				children.add(_physicalport.getOwnedMaxLength());
			children.addAll(_physicalport.getOwnedComponentPortAllocations());
			children.addAll(_physicalport.getOwnedPhysicalPortRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getInputPin(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.InputPin _inputpin = (org.polarsys.capella.common.data.activity.InputPin) obj;
			children.addAll(_inputpin.getOwnedExtensions());
			children.addAll(_inputpin.getOwnedConstraints());
			children.addAll(_inputpin.getOwnedMigratedElements());
			if(_inputpin.getUpperBound() != null)
				children.add(_inputpin.getUpperBound());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getIState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.IState _istate = (modellingcore.IState) obj;
			children.addAll(_istate.getOwnedExtensions());
			children.addAll(_istate.getOwnedConstraints());
			children.addAll(_istate.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getStateTransition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.StateTransition _statetransition = (org.polarsys.capella.core.data.capellacommon.StateTransition) obj;
			children.addAll(_statetransition.getOwnedExtensions());
			children.addAll(_statetransition.getOwnedConstraints());
			children.addAll(_statetransition.getOwnedMigratedElements());
			children.addAll(_statetransition.getOwnedPropertyValues());
			children.addAll(_statetransition.getOwnedEnumerationPropertyTypes());
			children.addAll(_statetransition.getOwnedPropertyValueGroups());
			children.addAll(_statetransition.getOwnedStateTransitionRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getAbstractComplexValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.AbstractComplexValue _abstractcomplexvalue = (org.polarsys.capella.core.data.information.datavalue.AbstractComplexValue) obj;
			children.addAll(_abstractcomplexvalue.getOwnedExtensions());
			children.addAll(_abstractcomplexvalue.getOwnedConstraints());
			children.addAll(_abstractcomplexvalue.getOwnedMigratedElements());
			children.addAll(_abstractcomplexvalue.getOwnedPropertyValues());
			children.addAll(_abstractcomplexvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractcomplexvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getProperty(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.Property _property = (org.polarsys.capella.core.data.information.Property) obj;
			children.addAll(_property.getOwnedExtensions());
			children.addAll(_property.getOwnedConstraints());
			children.addAll(_property.getOwnedMigratedElements());
			children.addAll(_property.getOwnedPropertyValues());
			children.addAll(_property.getOwnedEnumerationPropertyTypes());
			children.addAll(_property.getOwnedPropertyValueGroups());
			if(_property.getOwnedDefaultValue() != null)
				children.add(_property.getOwnedDefaultValue());
			if(_property.getOwnedMinValue() != null)
				children.add(_property.getOwnedMinValue());
			if(_property.getOwnedMaxValue() != null)
				children.add(_property.getOwnedMaxValue());
			if(_property.getOwnedNullValue() != null)
				children.add(_property.getOwnedNullValue());
			if(_property.getOwnedMinCard() != null)
				children.add(_property.getOwnedMinCard());
			if(_property.getOwnedMinLength() != null)
				children.add(_property.getOwnedMinLength());
			if(_property.getOwnedMaxCard() != null)
				children.add(_property.getOwnedMaxCard());
			if(_property.getOwnedMaxLength() != null)
				children.add(_property.getOwnedMaxLength());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getLiteralNumericValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.LiteralNumericValue _literalnumericvalue = (org.polarsys.capella.core.data.information.datavalue.LiteralNumericValue) obj;
			children.addAll(_literalnumericvalue.getOwnedExtensions());
			children.addAll(_literalnumericvalue.getOwnedConstraints());
			children.addAll(_literalnumericvalue.getOwnedMigratedElements());
			children.addAll(_literalnumericvalue.getOwnedPropertyValues());
			children.addAll(_literalnumericvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_literalnumericvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getActivityPartition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.ActivityPartition _activitypartition = (org.polarsys.capella.common.data.activity.ActivityPartition) obj;
			children.addAll(_activitypartition.getOwnedExtensions());
			children.addAll(_activitypartition.getOwnedConstraints());
			children.addAll(_activitypartition.getOwnedMigratedElements());
			children.addAll(_activitypartition.getSubGroups());
			children.addAll(_activitypartition.getOwnedNodes());
			children.addAll(_activitypartition.getOwnedEdges());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getComponentExchangeAllocator(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ComponentExchangeAllocator _componentexchangeallocator = (org.polarsys.capella.core.data.fa.ComponentExchangeAllocator) obj;
			children.addAll(_componentexchangeallocator.getOwnedExtensions());
			children.addAll(_componentexchangeallocator.getOwnedConstraints());
			children.addAll(_componentexchangeallocator.getOwnedMigratedElements());
			children.addAll(_componentexchangeallocator.getOwnedPropertyValues());
			children.addAll(_componentexchangeallocator.getOwnedEnumerationPropertyTypes());
			children.addAll(_componentexchangeallocator.getOwnedPropertyValueGroups());
			children.addAll(_componentexchangeallocator.getOwnedComponentExchangeAllocations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getReferenceHierarchyContext(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getExecutionEnd(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.ExecutionEnd _executionend = (org.polarsys.capella.core.data.interaction.ExecutionEnd) obj;
			children.addAll(_executionend.getOwnedExtensions());
			children.addAll(_executionend.getOwnedConstraints());
			children.addAll(_executionend.getOwnedMigratedElements());
			children.addAll(_executionend.getOwnedPropertyValues());
			children.addAll(_executionend.getOwnedEnumerationPropertyTypes());
			children.addAll(_executionend.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getArchitectureAllocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.ArchitectureAllocation _architectureallocation = (org.polarsys.capella.core.data.cs.ArchitectureAllocation) obj;
			children.addAll(_architectureallocation.getOwnedExtensions());
			children.addAll(_architectureallocation.getOwnedConstraints());
			children.addAll(_architectureallocation.getOwnedMigratedElements());
			children.addAll(_architectureallocation.getOwnedPropertyValues());
			children.addAll(_architectureallocation.getOwnedEnumerationPropertyTypes());
			children.addAll(_architectureallocation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getExchangeContainment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ExchangeContainment _exchangecontainment = (org.polarsys.capella.core.data.fa.ExchangeContainment) obj;
			children.addAll(_exchangecontainment.getOwnedExtensions());
			children.addAll(_exchangecontainment.getOwnedConstraints());
			children.addAll(_exchangecontainment.getOwnedMigratedElements());
			children.addAll(_exchangecontainment.getOwnedPropertyValues());
			children.addAll(_exchangecontainment.getOwnedEnumerationPropertyTypes());
			children.addAll(_exchangecontainment.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.Class _class = (org.polarsys.capella.core.data.information.Class) obj;
			children.addAll(_class.getOwnedExtensions());
			children.addAll(_class.getOwnedConstraints());
			children.addAll(_class.getOwnedMigratedElements());
			children.addAll(_class.getOwnedPropertyValues());
			children.addAll(_class.getOwnedEnumerationPropertyTypes());
			children.addAll(_class.getOwnedPropertyValueGroups());
			children.addAll(_class.getOwnedTraces());
			children.addAll(_class.getNamingRules());
			children.addAll(_class.getOwnedGeneralizations());
			children.addAll(_class.getOwnedFeatures());
			children.addAll(_class.getNestedGeneralClasses());
			children.addAll(_class.getOwnedStateMachines());
			children.addAll(_class.getOwnedDataValues());
			children.addAll(_class.getOwnedInformationRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getNamedElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.NamedElement _namedelement = (org.polarsys.capella.core.data.capellacore.NamedElement) obj;
			children.addAll(_namedelement.getOwnedExtensions());
			children.addAll(_namedelement.getOwnedConstraints());
			children.addAll(_namedelement.getOwnedMigratedElements());
			children.addAll(_namedelement.getOwnedPropertyValues());
			children.addAll(_namedelement.getOwnedEnumerationPropertyTypes());
			children.addAll(_namedelement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getInvocationAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.InvocationAction _invocationaction = (org.polarsys.capella.common.data.activity.InvocationAction) obj;
			children.addAll(_invocationaction.getOwnedExtensions());
			children.addAll(_invocationaction.getOwnedConstraints());
			children.addAll(_invocationaction.getOwnedMigratedElements());
			children.addAll(_invocationaction.getOwnedHandlers());
			if(_invocationaction.getLocalPrecondition() != null)
				children.add(_invocationaction.getLocalPrecondition());
			if(_invocationaction.getLocalPostcondition() != null)
				children.add(_invocationaction.getLocalPostcondition());
			children.addAll(_invocationaction.getInputs());
			children.addAll(_invocationaction.getOutputs());
			children.addAll(_invocationaction.getArguments());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getExchangeItemElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.ExchangeItemElement _exchangeitemelement = (org.polarsys.capella.core.data.information.ExchangeItemElement) obj;
			children.addAll(_exchangeitemelement.getOwnedExtensions());
			children.addAll(_exchangeitemelement.getOwnedConstraints());
			children.addAll(_exchangeitemelement.getOwnedMigratedElements());
			children.addAll(_exchangeitemelement.getOwnedPropertyValues());
			children.addAll(_exchangeitemelement.getOwnedEnumerationPropertyTypes());
			children.addAll(_exchangeitemelement.getOwnedPropertyValueGroups());
			if(_exchangeitemelement.getOwnedDefaultValue() != null)
				children.add(_exchangeitemelement.getOwnedDefaultValue());
			if(_exchangeitemelement.getOwnedMinValue() != null)
				children.add(_exchangeitemelement.getOwnedMinValue());
			if(_exchangeitemelement.getOwnedMaxValue() != null)
				children.add(_exchangeitemelement.getOwnedMaxValue());
			if(_exchangeitemelement.getOwnedNullValue() != null)
				children.add(_exchangeitemelement.getOwnedNullValue());
			if(_exchangeitemelement.getOwnedMinCard() != null)
				children.add(_exchangeitemelement.getOwnedMinCard());
			if(_exchangeitemelement.getOwnedMinLength() != null)
				children.add(_exchangeitemelement.getOwnedMinLength());
			if(_exchangeitemelement.getOwnedMaxCard() != null)
				children.add(_exchangeitemelement.getOwnedMaxCard());
			if(_exchangeitemelement.getOwnedMaxLength() != null)
				children.add(_exchangeitemelement.getOwnedMaxLength());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionalChainInvolvementFunction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionalChainInvolvementFunction _functionalchaininvolvementfunction = (org.polarsys.capella.core.data.fa.FunctionalChainInvolvementFunction) obj;
			children.addAll(_functionalchaininvolvementfunction.getOwnedExtensions());
			children.addAll(_functionalchaininvolvementfunction.getOwnedConstraints());
			children.addAll(_functionalchaininvolvementfunction.getOwnedMigratedElements());
			children.addAll(_functionalchaininvolvementfunction.getOwnedPropertyValues());
			children.addAll(_functionalchaininvolvementfunction.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionalchaininvolvementfunction.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getAbstractType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.AbstractType _abstracttype = (modellingcore.AbstractType) obj;
			children.addAll(_abstracttype.getOwnedExtensions());
			children.addAll(_abstracttype.getOwnedConstraints());
			children.addAll(_abstracttype.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getAbstractFunction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.AbstractFunction _abstractfunction = (org.polarsys.capella.core.data.fa.AbstractFunction) obj;
			children.addAll(_abstractfunction.getOwnedExtensions());
			children.addAll(_abstractfunction.getOwnedConstraints());
			children.addAll(_abstractfunction.getOwnedMigratedElements());
			children.addAll(_abstractfunction.getOwnedPropertyValues());
			children.addAll(_abstractfunction.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractfunction.getOwnedPropertyValueGroups());
			children.addAll(_abstractfunction.getOwnedTraces());
			children.addAll(_abstractfunction.getNamingRules());
			if(_abstractfunction.getOwnedDefaultValue() != null)
				children.add(_abstractfunction.getOwnedDefaultValue());
			if(_abstractfunction.getOwnedMinValue() != null)
				children.add(_abstractfunction.getOwnedMinValue());
			if(_abstractfunction.getOwnedMaxValue() != null)
				children.add(_abstractfunction.getOwnedMaxValue());
			if(_abstractfunction.getOwnedNullValue() != null)
				children.add(_abstractfunction.getOwnedNullValue());
			if(_abstractfunction.getOwnedMinCard() != null)
				children.add(_abstractfunction.getOwnedMinCard());
			if(_abstractfunction.getOwnedMinLength() != null)
				children.add(_abstractfunction.getOwnedMinLength());
			if(_abstractfunction.getOwnedMaxCard() != null)
				children.add(_abstractfunction.getOwnedMaxCard());
			if(_abstractfunction.getOwnedMaxLength() != null)
				children.add(_abstractfunction.getOwnedMaxLength());
			children.addAll(_abstractfunction.getOwnedFunctionalChains());
			children.addAll(_abstractfunction.getOwnedHandlers());
			if(_abstractfunction.getLocalPrecondition() != null)
				children.add(_abstractfunction.getLocalPrecondition());
			if(_abstractfunction.getLocalPostcondition() != null)
				children.add(_abstractfunction.getLocalPostcondition());
			children.addAll(_abstractfunction.getInputs());
			children.addAll(_abstractfunction.getOutputs());
			children.addAll(_abstractfunction.getArguments());
			children.addAll(_abstractfunction.getResults());
			children.addAll(_abstractfunction.getOwnedFunctions());
			children.addAll(_abstractfunction.getOwnedFunctionRealizations());
			children.addAll(_abstractfunction.getOwnedFunctionalExchanges());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getRequiredInterfaceLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.RequiredInterfaceLink _requiredinterfacelink = (org.polarsys.capella.core.data.cs.RequiredInterfaceLink) obj;
			children.addAll(_requiredinterfacelink.getOwnedExtensions());
			children.addAll(_requiredinterfacelink.getOwnedConstraints());
			children.addAll(_requiredinterfacelink.getOwnedMigratedElements());
			children.addAll(_requiredinterfacelink.getOwnedPropertyValues());
			children.addAll(_requiredinterfacelink.getOwnedEnumerationPropertyTypes());
			children.addAll(_requiredinterfacelink.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getAbstractPathInvolvedElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.AbstractPathInvolvedElement _abstractpathinvolvedelement = (org.polarsys.capella.core.data.cs.AbstractPathInvolvedElement) obj;
			children.addAll(_abstractpathinvolvedelement.getOwnedExtensions());
			children.addAll(_abstractpathinvolvedelement.getOwnedConstraints());
			children.addAll(_abstractpathinvolvedelement.getOwnedMigratedElements());
			children.addAll(_abstractpathinvolvedelement.getOwnedPropertyValues());
			children.addAll(_abstractpathinvolvedelement.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractpathinvolvedelement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getCallAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.CallAction _callaction = (org.polarsys.capella.common.data.activity.CallAction) obj;
			children.addAll(_callaction.getOwnedExtensions());
			children.addAll(_callaction.getOwnedConstraints());
			children.addAll(_callaction.getOwnedMigratedElements());
			children.addAll(_callaction.getOwnedHandlers());
			if(_callaction.getLocalPrecondition() != null)
				children.add(_callaction.getLocalPrecondition());
			if(_callaction.getLocalPostcondition() != null)
				children.add(_callaction.getLocalPostcondition());
			children.addAll(_callaction.getInputs());
			children.addAll(_callaction.getOutputs());
			children.addAll(_callaction.getArguments());
			children.addAll(_callaction.getResults());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getCombinedFragment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.CombinedFragment _combinedfragment = (org.polarsys.capella.core.data.interaction.CombinedFragment) obj;
			children.addAll(_combinedfragment.getOwnedExtensions());
			children.addAll(_combinedfragment.getOwnedConstraints());
			children.addAll(_combinedfragment.getOwnedMigratedElements());
			children.addAll(_combinedfragment.getOwnedPropertyValues());
			children.addAll(_combinedfragment.getOwnedEnumerationPropertyTypes());
			children.addAll(_combinedfragment.getOwnedPropertyValueGroups());
			children.addAll(_combinedfragment.getOwnedGates());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getPhysicalLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.PhysicalLink _physicallink = (org.polarsys.capella.core.data.cs.PhysicalLink) obj;
			children.addAll(_physicallink.getOwnedExtensions());
			children.addAll(_physicallink.getOwnedConstraints());
			children.addAll(_physicallink.getOwnedMigratedElements());
			children.addAll(_physicallink.getOwnedPropertyValues());
			children.addAll(_physicallink.getOwnedEnumerationPropertyTypes());
			children.addAll(_physicallink.getOwnedPropertyValueGroups());
			children.addAll(_physicallink.getOwnedComponentExchangeAllocations());
			children.addAll(_physicallink.getOwnedComponentExchangeFunctionalExchangeAllocations());
			children.addAll(_physicallink.getOwnedPhysicalLinkEnds());
			children.addAll(_physicallink.getOwnedPhysicalLinkRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datatype.DatatypePackage.eINSTANCE.getEnumeration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datatype.Enumeration _enumeration = (org.polarsys.capella.core.data.information.datatype.Enumeration) obj;
			children.addAll(_enumeration.getOwnedExtensions());
			children.addAll(_enumeration.getOwnedConstraints());
			children.addAll(_enumeration.getOwnedMigratedElements());
			children.addAll(_enumeration.getOwnedPropertyValues());
			children.addAll(_enumeration.getOwnedEnumerationPropertyTypes());
			children.addAll(_enumeration.getOwnedPropertyValueGroups());
			children.addAll(_enumeration.getOwnedTraces());
			children.addAll(_enumeration.getNamingRules());
			children.addAll(_enumeration.getOwnedGeneralizations());
			children.addAll(_enumeration.getOwnedPropertyValuePkgs());
			children.addAll(_enumeration.getOwnedDataValues());
			children.addAll(_enumeration.getOwnedInformationRealizations());
			children.addAll(_enumeration.getOwnedLiterals());
			if(_enumeration.getOwnedDefaultValue() != null)
				children.add(_enumeration.getOwnedDefaultValue());
			if(_enumeration.getOwnedNullValue() != null)
				children.add(_enumeration.getOwnedNullValue());
			if(_enumeration.getOwnedMinValue() != null)
				children.add(_enumeration.getOwnedMinValue());
			if(_enumeration.getOwnedMaxValue() != null)
				children.add(_enumeration.getOwnedMaxValue());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getInstanceRole(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.InstanceRole _instancerole = (org.polarsys.capella.core.data.interaction.InstanceRole) obj;
			children.addAll(_instancerole.getOwnedExtensions());
			children.addAll(_instancerole.getOwnedConstraints());
			children.addAll(_instancerole.getOwnedMigratedElements());
			children.addAll(_instancerole.getOwnedPropertyValues());
			children.addAll(_instancerole.getOwnedEnumerationPropertyTypes());
			children.addAll(_instancerole.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getInterfaceUse(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.InterfaceUse _interfaceuse = (org.polarsys.capella.core.data.cs.InterfaceUse) obj;
			children.addAll(_interfaceuse.getOwnedExtensions());
			children.addAll(_interfaceuse.getOwnedConstraints());
			children.addAll(_interfaceuse.getOwnedMigratedElements());
			children.addAll(_interfaceuse.getOwnedPropertyValues());
			children.addAll(_interfaceuse.getOwnedEnumerationPropertyTypes());
			children.addAll(_interfaceuse.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datatype.DatatypePackage.eINSTANCE.getPhysicalQuantity(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datatype.PhysicalQuantity _physicalquantity = (org.polarsys.capella.core.data.information.datatype.PhysicalQuantity) obj;
			children.addAll(_physicalquantity.getOwnedExtensions());
			children.addAll(_physicalquantity.getOwnedConstraints());
			children.addAll(_physicalquantity.getOwnedMigratedElements());
			children.addAll(_physicalquantity.getOwnedPropertyValues());
			children.addAll(_physicalquantity.getOwnedEnumerationPropertyTypes());
			children.addAll(_physicalquantity.getOwnedPropertyValueGroups());
			children.addAll(_physicalquantity.getOwnedTraces());
			children.addAll(_physicalquantity.getNamingRules());
			children.addAll(_physicalquantity.getOwnedGeneralizations());
			children.addAll(_physicalquantity.getOwnedPropertyValuePkgs());
			children.addAll(_physicalquantity.getOwnedDataValues());
			children.addAll(_physicalquantity.getOwnedInformationRealizations());
			if(_physicalquantity.getOwnedDefaultValue() != null)
				children.add(_physicalquantity.getOwnedDefaultValue());
			if(_physicalquantity.getOwnedNullValue() != null)
				children.add(_physicalquantity.getOwnedNullValue());
			if(_physicalquantity.getOwnedMinValue() != null)
				children.add(_physicalquantity.getOwnedMinValue());
			if(_physicalquantity.getOwnedMaxValue() != null)
				children.add(_physicalquantity.getOwnedMaxValue());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getAbstractParameterSet(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.AbstractParameterSet _abstractparameterset = (modellingcore.AbstractParameterSet) obj;
			children.addAll(_abstractparameterset.getOwnedExtensions());
			children.addAll(_abstractparameterset.getOwnedConstraints());
			children.addAll(_abstractparameterset.getOwnedMigratedElements());
			children.addAll(_abstractparameterset.getOwnedConditions());
			if(_abstractparameterset.getProbability() != null)
				children.add(_abstractparameterset.getProbability());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getComponent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.Component _component = (org.polarsys.capella.core.data.cs.Component) obj;
			children.addAll(_component.getOwnedExtensions());
			children.addAll(_component.getOwnedConstraints());
			children.addAll(_component.getOwnedMigratedElements());
			children.addAll(_component.getOwnedPropertyValues());
			children.addAll(_component.getOwnedEnumerationPropertyTypes());
			children.addAll(_component.getOwnedPropertyValueGroups());
			children.addAll(_component.getOwnedTraces());
			children.addAll(_component.getNamingRules());
			children.addAll(_component.getOwnedFunctionalAllocation());
			children.addAll(_component.getOwnedComponentExchanges());
			children.addAll(_component.getOwnedComponentExchangeCategories());
			if(_component.getOwnedAbstractCapabilityPkg() != null)
				children.add(_component.getOwnedAbstractCapabilityPkg());
			if(_component.getOwnedInterfacePkg() != null)
				children.add(_component.getOwnedInterfacePkg());
			if(_component.getOwnedDataPkg() != null)
				children.add(_component.getOwnedDataPkg());
			children.addAll(_component.getOwnedStateMachines());
			children.addAll(_component.getOwnedGeneralizations());
			children.addAll(_component.getOwnedFeatures());
			children.addAll(_component.getOwnedInterfaceAllocations());
			children.addAll(_component.getOwnedCommunicationLinks());
			children.addAll(_component.getOwnedInterfaceUses());
			children.addAll(_component.getOwnedInterfaceImplementations());
			children.addAll(_component.getOwnedComponentRealizations());
			children.addAll(_component.getOwnedPhysicalPath());
			children.addAll(_component.getOwnedPhysicalLinks());
			children.addAll(_component.getOwnedPhysicalLinkCategories());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getSendSignalAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.SendSignalAction _sendsignalaction = (org.polarsys.capella.common.data.activity.SendSignalAction) obj;
			children.addAll(_sendsignalaction.getOwnedExtensions());
			children.addAll(_sendsignalaction.getOwnedConstraints());
			children.addAll(_sendsignalaction.getOwnedMigratedElements());
			children.addAll(_sendsignalaction.getOwnedHandlers());
			if(_sendsignalaction.getLocalPrecondition() != null)
				children.add(_sendsignalaction.getLocalPrecondition());
			if(_sendsignalaction.getLocalPostcondition() != null)
				children.add(_sendsignalaction.getLocalPostcondition());
			children.addAll(_sendsignalaction.getInputs());
			children.addAll(_sendsignalaction.getOutputs());
			children.addAll(_sendsignalaction.getArguments());
			if(_sendsignalaction.getTarget() != null)
				children.add(_sendsignalaction.getTarget());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getAbstractDeploymentLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.AbstractDeploymentLink _abstractdeploymentlink = (org.polarsys.capella.core.data.cs.AbstractDeploymentLink) obj;
			children.addAll(_abstractdeploymentlink.getOwnedExtensions());
			children.addAll(_abstractdeploymentlink.getOwnedConstraints());
			children.addAll(_abstractdeploymentlink.getOwnedMigratedElements());
			children.addAll(_abstractdeploymentlink.getOwnedPropertyValues());
			children.addAll(_abstractdeploymentlink.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractdeploymentlink.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getInterface(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.Interface _interface = (org.polarsys.capella.core.data.cs.Interface) obj;
			children.addAll(_interface.getOwnedExtensions());
			children.addAll(_interface.getOwnedConstraints());
			children.addAll(_interface.getOwnedMigratedElements());
			children.addAll(_interface.getOwnedPropertyValues());
			children.addAll(_interface.getOwnedEnumerationPropertyTypes());
			children.addAll(_interface.getOwnedPropertyValueGroups());
			children.addAll(_interface.getOwnedTraces());
			children.addAll(_interface.getNamingRules());
			children.addAll(_interface.getOwnedGeneralizations());
			children.addAll(_interface.getOwnedFeatures());
			children.addAll(_interface.getNestedGeneralClasses());
			children.addAll(_interface.getOwnedInterfaceAllocations());
			children.addAll(_interface.getOwnedExchangeItemAllocations());
			return children;
		});
		explorationConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getEntity2SystemComponent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionRealization _functionrealization = (org.polarsys.capella.core.data.fa.FunctionRealization) obj;
			children.addAll(_functionrealization.getOwnedExtensions());
			children.addAll(_functionrealization.getOwnedConstraints());
			children.addAll(_functionrealization.getOwnedMigratedElements());
			children.addAll(_functionrealization.getOwnedPropertyValues());
			children.addAll(_functionrealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionrealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getPhysicalPortRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.PhysicalPortRealization _physicalportrealization = (org.polarsys.capella.core.data.cs.PhysicalPortRealization) obj;
			children.addAll(_physicalportrealization.getOwnedExtensions());
			children.addAll(_physicalportrealization.getOwnedConstraints());
			children.addAll(_physicalportrealization.getOwnedMigratedElements());
			children.addAll(_physicalportrealization.getOwnedPropertyValues());
			children.addAll(_physicalportrealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_physicalportrealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getEnumerationPropertyValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.EnumerationPropertyValue _enumerationpropertyvalue = (org.polarsys.capella.core.data.capellacore.EnumerationPropertyValue) obj;
			children.addAll(_enumerationpropertyvalue.getOwnedExtensions());
			children.addAll(_enumerationpropertyvalue.getOwnedConstraints());
			children.addAll(_enumerationpropertyvalue.getOwnedMigratedElements());
			children.addAll(_enumerationpropertyvalue.getOwnedPropertyValues());
			children.addAll(_enumerationpropertyvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_enumerationpropertyvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getAbstractConstraint(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.AbstractConstraint _abstractconstraint = (modellingcore.AbstractConstraint) obj;
			children.addAll(_abstractconstraint.getOwnedExtensions());
			children.addAll(_abstractconstraint.getOwnedConstraints());
			children.addAll(_abstractconstraint.getOwnedMigratedElements());
			if(_abstractconstraint.getOwnedSpecification() != null)
				children.add(_abstractconstraint.getOwnedSpecification());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getUnaryExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.UnaryExpression _unaryexpression = (org.polarsys.capella.core.data.information.datavalue.UnaryExpression) obj;
			children.addAll(_unaryexpression.getOwnedExtensions());
			children.addAll(_unaryexpression.getOwnedConstraints());
			children.addAll(_unaryexpression.getOwnedMigratedElements());
			children.addAll(_unaryexpression.getOwnedPropertyValues());
			children.addAll(_unaryexpression.getOwnedEnumerationPropertyTypes());
			children.addAll(_unaryexpression.getOwnedPropertyValueGroups());
			if(_unaryexpression.getOwnedOperand() != null)
				children.add(_unaryexpression.getOwnedOperand());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getTransfoLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.TransfoLink _transfolink = (org.polarsys.capella.core.data.capellacommon.TransfoLink) obj;
			children.addAll(_transfolink.getOwnedExtensions());
			children.addAll(_transfolink.getOwnedConstraints());
			children.addAll(_transfolink.getOwnedMigratedElements());
			children.addAll(_transfolink.getOwnedPropertyValues());
			children.addAll(_transfolink.getOwnedEnumerationPropertyTypes());
			children.addAll(_transfolink.getOwnedPropertyValueGroups());
			children.addAll(_transfolink.getKeyValuePairs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getJustificationLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.JustificationLink _justificationlink = (org.polarsys.capella.core.data.capellacommon.JustificationLink) obj;
			children.addAll(_justificationlink.getOwnedExtensions());
			children.addAll(_justificationlink.getOwnedConstraints());
			children.addAll(_justificationlink.getOwnedMigratedElements());
			children.addAll(_justificationlink.getOwnedPropertyValues());
			children.addAll(_justificationlink.getOwnedEnumerationPropertyTypes());
			children.addAll(_justificationlink.getOwnedPropertyValueGroups());
			children.addAll(_justificationlink.getKeyValuePairs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOrganisationalUnit(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.OrganisationalUnit _organisationalunit = (org.polarsys.capella.core.data.oa.OrganisationalUnit) obj;
			children.addAll(_organisationalunit.getOwnedExtensions());
			children.addAll(_organisationalunit.getOwnedConstraints());
			children.addAll(_organisationalunit.getOwnedMigratedElements());
			children.addAll(_organisationalunit.getOwnedPropertyValues());
			children.addAll(_organisationalunit.getOwnedEnumerationPropertyTypes());
			children.addAll(_organisationalunit.getOwnedPropertyValueGroups());
			children.addAll(_organisationalunit.getOrganisationalUnitCompositions());
			return children;
		});
		explorationConsumer.put(org.polarsys.kitalpha.emde.model.EmdePackage.eINSTANCE.getExtensibleElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.kitalpha.emde.model.ExtensibleElement _extensibleelement = (org.polarsys.kitalpha.emde.model.ExtensibleElement) obj;
			children.addAll(_extensibleelement.getOwnedExtensions());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getAbstractDependenciesPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.AbstractDependenciesPkg _abstractdependenciespkg = (org.polarsys.capella.core.data.capellacore.AbstractDependenciesPkg) obj;
			children.addAll(_abstractdependenciespkg.getOwnedExtensions());
			children.addAll(_abstractdependenciespkg.getOwnedConstraints());
			children.addAll(_abstractdependenciespkg.getOwnedMigratedElements());
			children.addAll(_abstractdependenciespkg.getOwnedPropertyValues());
			children.addAll(_abstractdependenciespkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractdependenciespkg.getOwnedPropertyValueGroups());
			children.addAll(_abstractdependenciespkg.getOwnedTraces());
			children.addAll(_abstractdependenciespkg.getNamingRules());
			children.addAll(_abstractdependenciespkg.getOwnedPropertyValuePkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getCollectionValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.CollectionValue _collectionvalue = (org.polarsys.capella.core.data.information.CollectionValue) obj;
			children.addAll(_collectionvalue.getOwnedExtensions());
			children.addAll(_collectionvalue.getOwnedConstraints());
			children.addAll(_collectionvalue.getOwnedMigratedElements());
			children.addAll(_collectionvalue.getOwnedPropertyValues());
			children.addAll(_collectionvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_collectionvalue.getOwnedPropertyValueGroups());
			children.addAll(_collectionvalue.getOwnedElements());
			if(_collectionvalue.getOwnedDefaultElement() != null)
				children.add(_collectionvalue.getOwnedDefaultElement());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getAbstractEnd(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.AbstractEnd _abstractend = (org.polarsys.capella.core.data.interaction.AbstractEnd) obj;
			children.addAll(_abstractend.getOwnedExtensions());
			children.addAll(_abstractend.getOwnedConstraints());
			children.addAll(_abstractend.getOwnedMigratedElements());
			children.addAll(_abstractend.getOwnedPropertyValues());
			children.addAll(_abstractend.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractend.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getAbstractFunctionalBlock(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.AbstractFunctionalBlock _abstractfunctionalblock = (org.polarsys.capella.core.data.fa.AbstractFunctionalBlock) obj;
			children.addAll(_abstractfunctionalblock.getOwnedExtensions());
			children.addAll(_abstractfunctionalblock.getOwnedConstraints());
			children.addAll(_abstractfunctionalblock.getOwnedMigratedElements());
			children.addAll(_abstractfunctionalblock.getOwnedPropertyValues());
			children.addAll(_abstractfunctionalblock.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractfunctionalblock.getOwnedPropertyValueGroups());
			children.addAll(_abstractfunctionalblock.getOwnedTraces());
			children.addAll(_abstractfunctionalblock.getNamingRules());
			children.addAll(_abstractfunctionalblock.getOwnedFunctionalAllocation());
			children.addAll(_abstractfunctionalblock.getOwnedComponentExchanges());
			children.addAll(_abstractfunctionalblock.getOwnedComponentExchangeCategories());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getInterruptibleActivityRegion(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.InterruptibleActivityRegion _interruptibleactivityregion = (org.polarsys.capella.common.data.activity.InterruptibleActivityRegion) obj;
			children.addAll(_interruptibleactivityregion.getOwnedExtensions());
			children.addAll(_interruptibleactivityregion.getOwnedConstraints());
			children.addAll(_interruptibleactivityregion.getOwnedMigratedElements());
			children.addAll(_interruptibleactivityregion.getSubGroups());
			children.addAll(_interruptibleactivityregion.getOwnedNodes());
			children.addAll(_interruptibleactivityregion.getOwnedEdges());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.Event _event = (org.polarsys.capella.core.data.interaction.Event) obj;
			children.addAll(_event.getOwnedExtensions());
			children.addAll(_event.getOwnedConstraints());
			children.addAll(_event.getOwnedMigratedElements());
			children.addAll(_event.getOwnedPropertyValues());
			children.addAll(_event.getOwnedEnumerationPropertyTypes());
			children.addAll(_event.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getActivityAllocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.ActivityAllocation _activityallocation = (org.polarsys.capella.core.data.oa.ActivityAllocation) obj;
			children.addAll(_activityallocation.getOwnedExtensions());
			children.addAll(_activityallocation.getOwnedConstraints());
			children.addAll(_activityallocation.getOwnedMigratedElements());
			children.addAll(_activityallocation.getOwnedPropertyValues());
			children.addAll(_activityallocation.getOwnedEnumerationPropertyTypes());
			children.addAll(_activityallocation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOperationalCapabilityPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.OperationalCapabilityPkg _operationalcapabilitypkg = (org.polarsys.capella.core.data.oa.OperationalCapabilityPkg) obj;
			children.addAll(_operationalcapabilitypkg.getOwnedExtensions());
			children.addAll(_operationalcapabilitypkg.getOwnedConstraints());
			children.addAll(_operationalcapabilitypkg.getOwnedMigratedElements());
			children.addAll(_operationalcapabilitypkg.getOwnedPropertyValues());
			children.addAll(_operationalcapabilitypkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_operationalcapabilitypkg.getOwnedPropertyValueGroups());
			children.addAll(_operationalcapabilitypkg.getOwnedTraces());
			children.addAll(_operationalcapabilitypkg.getNamingRules());
			children.addAll(_operationalcapabilitypkg.getOwnedPropertyValuePkgs());
			children.addAll(_operationalcapabilitypkg.getOwnedOperationalCapabilities());
			children.addAll(_operationalcapabilitypkg.getOwnedOperationalCapabilityPkgs());
			children.addAll(_operationalcapabilitypkg.getOwnedCapabilityConfigurations());
			children.addAll(_operationalcapabilitypkg.getOwnedConceptCompliances());
			return children;
		});
		explorationConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOaPart2SaPart(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getFragmentEnd(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.FragmentEnd _fragmentend = (org.polarsys.capella.core.data.interaction.FragmentEnd) obj;
			children.addAll(_fragmentend.getOwnedExtensions());
			children.addAll(_fragmentend.getOwnedConstraints());
			children.addAll(_fragmentend.getOwnedMigratedElements());
			children.addAll(_fragmentend.getOwnedPropertyValues());
			children.addAll(_fragmentend.getOwnedEnumerationPropertyTypes());
			children.addAll(_fragmentend.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getAssociationPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.AssociationPkg _associationpkg = (org.polarsys.capella.core.data.information.AssociationPkg) obj;
			children.addAll(_associationpkg.getOwnedExtensions());
			children.addAll(_associationpkg.getOwnedConstraints());
			children.addAll(_associationpkg.getOwnedMigratedElements());
			children.addAll(_associationpkg.getOwnedPropertyValues());
			children.addAll(_associationpkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_associationpkg.getOwnedPropertyValueGroups());
			children.addAll(_associationpkg.getOwnedTraces());
			children.addAll(_associationpkg.getNamingRules());
			children.addAll(_associationpkg.getOwnedPropertyValuePkgs());
			children.addAll(_associationpkg.getOwnedAssociations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getUnit(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.Unit _unit = (org.polarsys.capella.core.data.information.Unit) obj;
			children.addAll(_unit.getOwnedExtensions());
			children.addAll(_unit.getOwnedConstraints());
			children.addAll(_unit.getOwnedMigratedElements());
			children.addAll(_unit.getOwnedPropertyValues());
			children.addAll(_unit.getOwnedEnumerationPropertyTypes());
			children.addAll(_unit.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getAbstractCapabilityGeneralization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.AbstractCapabilityGeneralization _abstractcapabilitygeneralization = (org.polarsys.capella.core.data.interaction.AbstractCapabilityGeneralization) obj;
			children.addAll(_abstractcapabilitygeneralization.getOwnedExtensions());
			children.addAll(_abstractcapabilitygeneralization.getOwnedConstraints());
			children.addAll(_abstractcapabilitygeneralization.getOwnedMigratedElements());
			children.addAll(_abstractcapabilitygeneralization.getOwnedPropertyValues());
			children.addAll(_abstractcapabilitygeneralization.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractcapabilitygeneralization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionalExchangeSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionalExchangeSpecification _functionalexchangespecification = (org.polarsys.capella.core.data.fa.FunctionalExchangeSpecification) obj;
			children.addAll(_functionalexchangespecification.getOwnedExtensions());
			children.addAll(_functionalexchangespecification.getOwnedConstraints());
			children.addAll(_functionalexchangespecification.getOwnedMigratedElements());
			children.addAll(_functionalexchangespecification.getOwnedPropertyValues());
			children.addAll(_functionalexchangespecification.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionalexchangespecification.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getInteractionFragment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.InteractionFragment _interactionfragment = (org.polarsys.capella.core.data.interaction.InteractionFragment) obj;
			children.addAll(_interactionfragment.getOwnedExtensions());
			children.addAll(_interactionfragment.getOwnedConstraints());
			children.addAll(_interactionfragment.getOwnedMigratedElements());
			children.addAll(_interactionfragment.getOwnedPropertyValues());
			children.addAll(_interactionfragment.getOwnedEnumerationPropertyTypes());
			children.addAll(_interactionfragment.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.kitalpha.emde.model.EmdePackage.eINSTANCE.getElementExtension(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.kitalpha.emde.model.ElementExtension _elementextension = (org.polarsys.kitalpha.emde.model.ElementExtension) obj;
			children.addAll(_elementextension.getOwnedExtensions());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getCapabilityRealizationInvolvement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvement _capabilityrealizationinvolvement = (org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvement) obj;
			children.addAll(_capabilityrealizationinvolvement.getOwnedExtensions());
			children.addAll(_capabilityrealizationinvolvement.getOwnedConstraints());
			children.addAll(_capabilityrealizationinvolvement.getOwnedMigratedElements());
			children.addAll(_capabilityrealizationinvolvement.getOwnedPropertyValues());
			children.addAll(_capabilityrealizationinvolvement.getOwnedEnumerationPropertyTypes());
			children.addAll(_capabilityrealizationinvolvement.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.communication.CommunicationPackage.eINSTANCE.getCommunicationLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.communication.CommunicationLink _communicationlink = (org.polarsys.capella.core.data.information.communication.CommunicationLink) obj;
			children.addAll(_communicationlink.getOwnedExtensions());
			children.addAll(_communicationlink.getOwnedConstraints());
			children.addAll(_communicationlink.getOwnedMigratedElements());
			children.addAll(_communicationlink.getOwnedPropertyValues());
			children.addAll(_communicationlink.getOwnedEnumerationPropertyTypes());
			children.addAll(_communicationlink.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getComponentExchangeFunctionalExchangeAllocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ComponentExchangeFunctionalExchangeAllocation _componentexchangefunctionalexchangeallocation = (org.polarsys.capella.core.data.fa.ComponentExchangeFunctionalExchangeAllocation) obj;
			children.addAll(_componentexchangefunctionalexchangeallocation.getOwnedExtensions());
			children.addAll(_componentexchangefunctionalexchangeallocation.getOwnedConstraints());
			children.addAll(_componentexchangefunctionalexchangeallocation.getOwnedMigratedElements());
			children.addAll(_componentexchangefunctionalexchangeallocation.getOwnedPropertyValues());
			children.addAll(_componentexchangefunctionalexchangeallocation.getOwnedEnumerationPropertyTypes());
			children.addAll(_componentexchangefunctionalexchangeallocation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getItemInConcept(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.ItemInConcept _iteminconcept = (org.polarsys.capella.core.data.oa.ItemInConcept) obj;
			children.addAll(_iteminconcept.getOwnedExtensions());
			children.addAll(_iteminconcept.getOwnedConstraints());
			children.addAll(_iteminconcept.getOwnedMigratedElements());
			children.addAll(_iteminconcept.getOwnedPropertyValues());
			children.addAll(_iteminconcept.getOwnedEnumerationPropertyTypes());
			children.addAll(_iteminconcept.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getOperationAllocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.OperationAllocation _operationallocation = (org.polarsys.capella.core.data.information.OperationAllocation) obj;
			children.addAll(_operationallocation.getOwnedExtensions());
			children.addAll(_operationallocation.getOwnedConstraints());
			children.addAll(_operationallocation.getOwnedMigratedElements());
			children.addAll(_operationallocation.getOwnedPropertyValues());
			children.addAll(_operationallocation.getOwnedEnumerationPropertyTypes());
			children.addAll(_operationallocation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getPart(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.Part _part = (org.polarsys.capella.core.data.cs.Part) obj;
			children.addAll(_part.getOwnedExtensions());
			children.addAll(_part.getOwnedConstraints());
			children.addAll(_part.getOwnedMigratedElements());
			children.addAll(_part.getOwnedPropertyValues());
			children.addAll(_part.getOwnedEnumerationPropertyTypes());
			children.addAll(_part.getOwnedPropertyValueGroups());
			if(_part.getOwnedDefaultValue() != null)
				children.add(_part.getOwnedDefaultValue());
			if(_part.getOwnedMinValue() != null)
				children.add(_part.getOwnedMinValue());
			if(_part.getOwnedMaxValue() != null)
				children.add(_part.getOwnedMaxValue());
			if(_part.getOwnedNullValue() != null)
				children.add(_part.getOwnedNullValue());
			if(_part.getOwnedMinCard() != null)
				children.add(_part.getOwnedMinCard());
			if(_part.getOwnedMinLength() != null)
				children.add(_part.getOwnedMinLength());
			if(_part.getOwnedMaxCard() != null)
				children.add(_part.getOwnedMaxCard());
			if(_part.getOwnedMaxLength() != null)
				children.add(_part.getOwnedMaxLength());
			children.addAll(_part.getOwnedDeploymentLinks());
			if(_part.getOwnedAbstractType() != null)
				children.add(_part.getOwnedAbstractType());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getStructure(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.Structure _structure = (org.polarsys.capella.core.data.capellacore.Structure) obj;
			children.addAll(_structure.getOwnedExtensions());
			children.addAll(_structure.getOwnedConstraints());
			children.addAll(_structure.getOwnedMigratedElements());
			children.addAll(_structure.getOwnedPropertyValues());
			children.addAll(_structure.getOwnedEnumerationPropertyTypes());
			children.addAll(_structure.getOwnedPropertyValueGroups());
			children.addAll(_structure.getOwnedTraces());
			children.addAll(_structure.getNamingRules());
			children.addAll(_structure.getOwnedPropertyValuePkgs());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getAbstractFunctionAllocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.AbstractFunctionAllocation _abstractfunctionallocation = (org.polarsys.capella.core.data.fa.AbstractFunctionAllocation) obj;
			children.addAll(_abstractfunctionallocation.getOwnedExtensions());
			children.addAll(_abstractfunctionallocation.getOwnedConstraints());
			children.addAll(_abstractfunctionallocation.getOwnedMigratedElements());
			children.addAll(_abstractfunctionallocation.getOwnedPropertyValues());
			children.addAll(_abstractfunctionallocation.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractfunctionallocation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getNumericReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.NumericReference _numericreference = (org.polarsys.capella.core.data.information.datavalue.NumericReference) obj;
			children.addAll(_numericreference.getOwnedExtensions());
			children.addAll(_numericreference.getOwnedConstraints());
			children.addAll(_numericreference.getOwnedMigratedElements());
			children.addAll(_numericreference.getOwnedPropertyValues());
			children.addAll(_numericreference.getOwnedEnumerationPropertyTypes());
			children.addAll(_numericreference.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datatype.DatatypePackage.eINSTANCE.getBooleanType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datatype.BooleanType _booleantype = (org.polarsys.capella.core.data.information.datatype.BooleanType) obj;
			children.addAll(_booleantype.getOwnedExtensions());
			children.addAll(_booleantype.getOwnedConstraints());
			children.addAll(_booleantype.getOwnedMigratedElements());
			children.addAll(_booleantype.getOwnedPropertyValues());
			children.addAll(_booleantype.getOwnedEnumerationPropertyTypes());
			children.addAll(_booleantype.getOwnedPropertyValueGroups());
			children.addAll(_booleantype.getOwnedTraces());
			children.addAll(_booleantype.getNamingRules());
			children.addAll(_booleantype.getOwnedGeneralizations());
			children.addAll(_booleantype.getOwnedPropertyValuePkgs());
			children.addAll(_booleantype.getOwnedDataValues());
			children.addAll(_booleantype.getOwnedInformationRealizations());
			children.addAll(_booleantype.getOwnedLiterals());
			if(_booleantype.getOwnedDefaultValue() != null)
				children.add(_booleantype.getOwnedDefaultValue());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getAbstractAnnotation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.AbstractAnnotation _abstractannotation = (org.polarsys.capella.core.data.capellacore.AbstractAnnotation) obj;
			children.addAll(_abstractannotation.getOwnedExtensions());
			children.addAll(_abstractannotation.getOwnedConstraints());
			children.addAll(_abstractannotation.getOwnedMigratedElements());
			children.addAll(_abstractannotation.getOwnedPropertyValues());
			children.addAll(_abstractannotation.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractannotation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getAssociation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.Association _association = (org.polarsys.capella.core.data.information.Association) obj;
			children.addAll(_association.getOwnedExtensions());
			children.addAll(_association.getOwnedConstraints());
			children.addAll(_association.getOwnedMigratedElements());
			children.addAll(_association.getOwnedPropertyValues());
			children.addAll(_association.getOwnedEnumerationPropertyTypes());
			children.addAll(_association.getOwnedPropertyValueGroups());
			children.addAll(_association.getNamingRules());
			children.addAll(_association.getOwnedMembers());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getCollectionValueReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.CollectionValueReference _collectionvaluereference = (org.polarsys.capella.core.data.information.CollectionValueReference) obj;
			children.addAll(_collectionvaluereference.getOwnedExtensions());
			children.addAll(_collectionvaluereference.getOwnedConstraints());
			children.addAll(_collectionvaluereference.getOwnedMigratedElements());
			children.addAll(_collectionvaluereference.getOwnedPropertyValues());
			children.addAll(_collectionvaluereference.getOwnedEnumerationPropertyTypes());
			children.addAll(_collectionvaluereference.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getComponentPort(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ComponentPort _componentport = (org.polarsys.capella.core.data.fa.ComponentPort) obj;
			children.addAll(_componentport.getOwnedExtensions());
			children.addAll(_componentport.getOwnedConstraints());
			children.addAll(_componentport.getOwnedMigratedElements());
			children.addAll(_componentport.getOwnedPropertyValues());
			children.addAll(_componentport.getOwnedEnumerationPropertyTypes());
			children.addAll(_componentport.getOwnedPropertyValueGroups());
			children.addAll(_componentport.getOwnedProtocols());
			children.addAll(_componentport.getOwnedPortRealizations());
			children.addAll(_componentport.getOwnedPortAllocations());
			if(_componentport.getOwnedDefaultValue() != null)
				children.add(_componentport.getOwnedDefaultValue());
			if(_componentport.getOwnedMinValue() != null)
				children.add(_componentport.getOwnedMinValue());
			if(_componentport.getOwnedMaxValue() != null)
				children.add(_componentport.getOwnedMaxValue());
			if(_componentport.getOwnedNullValue() != null)
				children.add(_componentport.getOwnedNullValue());
			if(_componentport.getOwnedMinCard() != null)
				children.add(_componentport.getOwnedMinCard());
			if(_componentport.getOwnedMinLength() != null)
				children.add(_componentport.getOwnedMinLength());
			if(_componentport.getOwnedMaxCard() != null)
				children.add(_componentport.getOwnedMaxCard());
			if(_componentport.getOwnedMaxLength() != null)
				children.add(_componentport.getOwnedMaxLength());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getRegion(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.Region _region = (org.polarsys.capella.core.data.capellacommon.Region) obj;
			children.addAll(_region.getOwnedExtensions());
			children.addAll(_region.getOwnedConstraints());
			children.addAll(_region.getOwnedMigratedElements());
			children.addAll(_region.getOwnedPropertyValues());
			children.addAll(_region.getOwnedEnumerationPropertyTypes());
			children.addAll(_region.getOwnedPropertyValueGroups());
			children.addAll(_region.getOwnedStates());
			children.addAll(_region.getOwnedTransitions());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getExchangeItemAllocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.ExchangeItemAllocation _exchangeitemallocation = (org.polarsys.capella.core.data.cs.ExchangeItemAllocation) obj;
			children.addAll(_exchangeitemallocation.getOwnedExtensions());
			children.addAll(_exchangeitemallocation.getOwnedConstraints());
			children.addAll(_exchangeitemallocation.getOwnedMigratedElements());
			children.addAll(_exchangeitemallocation.getOwnedPropertyValues());
			children.addAll(_exchangeitemallocation.getOwnedEnumerationPropertyTypes());
			children.addAll(_exchangeitemallocation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getInformationsExchanger(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.InformationsExchanger _informationsexchanger = (modellingcore.InformationsExchanger) obj;
			children.addAll(_informationsexchanger.getOwnedExtensions());
			children.addAll(_informationsexchanger.getOwnedConstraints());
			children.addAll(_informationsexchanger.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getStateTransitionRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.StateTransitionRealization _statetransitionrealization = (org.polarsys.capella.core.data.capellacommon.StateTransitionRealization) obj;
			children.addAll(_statetransitionrealization.getOwnedExtensions());
			children.addAll(_statetransitionrealization.getOwnedConstraints());
			children.addAll(_statetransitionrealization.getOwnedMigratedElements());
			children.addAll(_statetransitionrealization.getOwnedPropertyValues());
			children.addAll(_statetransitionrealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_statetransitionrealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE.getAbstractEnumerationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.datavalue.AbstractEnumerationValue _abstractenumerationvalue = (org.polarsys.capella.core.data.information.datavalue.AbstractEnumerationValue) obj;
			children.addAll(_abstractenumerationvalue.getOwnedExtensions());
			children.addAll(_abstractenumerationvalue.getOwnedConstraints());
			children.addAll(_abstractenumerationvalue.getOwnedMigratedElements());
			children.addAll(_abstractenumerationvalue.getOwnedPropertyValues());
			children.addAll(_abstractenumerationvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractenumerationvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getPhysicalPathRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.PhysicalPathRealization _physicalpathrealization = (org.polarsys.capella.core.data.cs.PhysicalPathRealization) obj;
			children.addAll(_physicalpathrealization.getOwnedExtensions());
			children.addAll(_physicalpathrealization.getOwnedConstraints());
			children.addAll(_physicalpathrealization.getOwnedMigratedElements());
			children.addAll(_physicalpathrealization.getOwnedPropertyValues());
			children.addAll(_physicalpathrealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_physicalpathrealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getEntity(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.Entity _entity = (org.polarsys.capella.core.data.oa.Entity) obj;
			children.addAll(_entity.getOwnedExtensions());
			children.addAll(_entity.getOwnedConstraints());
			children.addAll(_entity.getOwnedMigratedElements());
			children.addAll(_entity.getOwnedPropertyValues());
			children.addAll(_entity.getOwnedEnumerationPropertyTypes());
			children.addAll(_entity.getOwnedPropertyValueGroups());
			children.addAll(_entity.getOwnedTraces());
			children.addAll(_entity.getNamingRules());
			children.addAll(_entity.getOwnedFunctionalAllocation());
			children.addAll(_entity.getOwnedComponentExchanges());
			children.addAll(_entity.getOwnedComponentExchangeCategories());
			if(_entity.getOwnedAbstractCapabilityPkg() != null)
				children.add(_entity.getOwnedAbstractCapabilityPkg());
			if(_entity.getOwnedInterfacePkg() != null)
				children.add(_entity.getOwnedInterfacePkg());
			if(_entity.getOwnedDataPkg() != null)
				children.add(_entity.getOwnedDataPkg());
			children.addAll(_entity.getOwnedStateMachines());
			children.addAll(_entity.getOwnedGeneralizations());
			children.addAll(_entity.getOwnedFeatures());
			children.addAll(_entity.getOwnedInterfaceAllocations());
			children.addAll(_entity.getOwnedCommunicationLinks());
			children.addAll(_entity.getOwnedInterfaceUses());
			children.addAll(_entity.getOwnedInterfaceImplementations());
			children.addAll(_entity.getOwnedComponentRealizations());
			children.addAll(_entity.getOwnedPhysicalPath());
			children.addAll(_entity.getOwnedPhysicalLinks());
			children.addAll(_entity.getOwnedPhysicalLinkCategories());
			children.addAll(_entity.getOwnedEntities());
			children.addAll(_entity.getOwnedCommunicationMeans());
			children.addAll(_entity.getOwnedRoleAllocations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getActivityNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.ActivityNode _activitynode = (org.polarsys.capella.common.data.activity.ActivityNode) obj;
			children.addAll(_activitynode.getOwnedExtensions());
			children.addAll(_activitynode.getOwnedConstraints());
			children.addAll(_activitynode.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.communication.CommunicationPackage.eINSTANCE.getSignal(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.communication.Signal _signal = (org.polarsys.capella.core.data.information.communication.Signal) obj;
			children.addAll(_signal.getOwnedExtensions());
			children.addAll(_signal.getOwnedConstraints());
			children.addAll(_signal.getOwnedMigratedElements());
			children.addAll(_signal.getOwnedPropertyValues());
			children.addAll(_signal.getOwnedEnumerationPropertyTypes());
			children.addAll(_signal.getOwnedPropertyValueGroups());
			children.addAll(_signal.getOwnedTraces());
			children.addAll(_signal.getNamingRules());
			children.addAll(_signal.getOwnedGeneralizations());
			children.addAll(_signal.getOwnedFeatures());
			children.addAll(_signal.getOwnedPropertyValuePkgs());
			children.addAll(_signal.getOwnedDataValues());
			children.addAll(_signal.getOwnedStateMachines());
			children.addAll(_signal.getSignalInstances());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getForkPseudoState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.ForkPseudoState _forkpseudostate = (org.polarsys.capella.core.data.capellacommon.ForkPseudoState) obj;
			children.addAll(_forkpseudostate.getOwnedExtensions());
			children.addAll(_forkpseudostate.getOwnedConstraints());
			children.addAll(_forkpseudostate.getOwnedMigratedElements());
			children.addAll(_forkpseudostate.getOwnedPropertyValues());
			children.addAll(_forkpseudostate.getOwnedEnumerationPropertyTypes());
			children.addAll(_forkpseudostate.getOwnedPropertyValueGroups());
			children.addAll(_forkpseudostate.getOwnedAbstractStateRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE.getJoinPseudoState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacommon.JoinPseudoState _joinpseudostate = (org.polarsys.capella.core.data.capellacommon.JoinPseudoState) obj;
			children.addAll(_joinpseudostate.getOwnedExtensions());
			children.addAll(_joinpseudostate.getOwnedConstraints());
			children.addAll(_joinpseudostate.getOwnedMigratedElements());
			children.addAll(_joinpseudostate.getOwnedPropertyValues());
			children.addAll(_joinpseudostate.getOwnedEnumerationPropertyTypes());
			children.addAll(_joinpseudostate.getOwnedPropertyValueGroups());
			children.addAll(_joinpseudostate.getOwnedAbstractStateRealizations());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getProvidedInterfaceLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.ProvidedInterfaceLink _providedinterfacelink = (org.polarsys.capella.core.data.cs.ProvidedInterfaceLink) obj;
			children.addAll(_providedinterfacelink.getOwnedExtensions());
			children.addAll(_providedinterfacelink.getOwnedConstraints());
			children.addAll(_providedinterfacelink.getOwnedMigratedElements());
			children.addAll(_providedinterfacelink.getOwnedPropertyValues());
			children.addAll(_providedinterfacelink.getOwnedEnumerationPropertyTypes());
			children.addAll(_providedinterfacelink.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getAcceptEventAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.AcceptEventAction _accepteventaction = (org.polarsys.capella.common.data.activity.AcceptEventAction) obj;
			children.addAll(_accepteventaction.getOwnedExtensions());
			children.addAll(_accepteventaction.getOwnedConstraints());
			children.addAll(_accepteventaction.getOwnedMigratedElements());
			children.addAll(_accepteventaction.getOwnedHandlers());
			if(_accepteventaction.getLocalPrecondition() != null)
				children.add(_accepteventaction.getLocalPrecondition());
			if(_accepteventaction.getLocalPostcondition() != null)
				children.add(_accepteventaction.getLocalPostcondition());
			children.addAll(_accepteventaction.getInputs());
			children.addAll(_accepteventaction.getOutputs());
			children.addAll(_accepteventaction.getResult());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getCommunityOfInterest(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.oa.CommunityOfInterest _communityofinterest = (org.polarsys.capella.core.data.oa.CommunityOfInterest) obj;
			children.addAll(_communityofinterest.getOwnedExtensions());
			children.addAll(_communityofinterest.getOwnedConstraints());
			children.addAll(_communityofinterest.getOwnedMigratedElements());
			children.addAll(_communityofinterest.getOwnedPropertyValues());
			children.addAll(_communityofinterest.getOwnedEnumerationPropertyTypes());
			children.addAll(_communityofinterest.getOwnedPropertyValueGroups());
			children.addAll(_communityofinterest.getCommunityOfInterestCompositions());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getDataPkg(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.DataPkg _datapkg = (org.polarsys.capella.core.data.information.DataPkg) obj;
			children.addAll(_datapkg.getOwnedExtensions());
			children.addAll(_datapkg.getOwnedConstraints());
			children.addAll(_datapkg.getOwnedMigratedElements());
			children.addAll(_datapkg.getOwnedPropertyValues());
			children.addAll(_datapkg.getOwnedEnumerationPropertyTypes());
			children.addAll(_datapkg.getOwnedPropertyValueGroups());
			children.addAll(_datapkg.getOwnedTraces());
			children.addAll(_datapkg.getNamingRules());
			children.addAll(_datapkg.getOwnedPropertyValuePkgs());
			children.addAll(_datapkg.getOwnedExchangeItems());
			children.addAll(_datapkg.getOwnedAssociations());
			children.addAll(_datapkg.getOwnedDataValues());
			children.addAll(_datapkg.getOwnedMessageReferences());
			children.addAll(_datapkg.getOwnedDataPkgs());
			children.addAll(_datapkg.getOwnedClasses());
			children.addAll(_datapkg.getOwnedKeyParts());
			children.addAll(_datapkg.getOwnedCollections());
			children.addAll(_datapkg.getOwnedUnits());
			children.addAll(_datapkg.getOwnedDataTypes());
			children.addAll(_datapkg.getOwnedSignals());
			children.addAll(_datapkg.getOwnedMessages());
			children.addAll(_datapkg.getOwnedExceptions());
			children.addAll(_datapkg.getOwnedStateEvents());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.communication.CommunicationPackage.eINSTANCE.getException(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.communication.Exception _exception = (org.polarsys.capella.core.data.information.communication.Exception) obj;
			children.addAll(_exception.getOwnedExtensions());
			children.addAll(_exception.getOwnedConstraints());
			children.addAll(_exception.getOwnedMigratedElements());
			children.addAll(_exception.getOwnedPropertyValues());
			children.addAll(_exception.getOwnedEnumerationPropertyTypes());
			children.addAll(_exception.getOwnedPropertyValueGroups());
			children.addAll(_exception.getOwnedTraces());
			children.addAll(_exception.getNamingRules());
			children.addAll(_exception.getOwnedGeneralizations());
			children.addAll(_exception.getOwnedFeatures());
			children.addAll(_exception.getOwnedPropertyValuePkgs());
			children.addAll(_exception.getOwnedDataValues());
			children.addAll(_exception.getOwnedStateMachines());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getAbstractTrace(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.AbstractTrace _abstracttrace = (modellingcore.AbstractTrace) obj;
			children.addAll(_abstracttrace.getOwnedExtensions());
			children.addAll(_abstracttrace.getOwnedConstraints());
			children.addAll(_abstracttrace.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getFunctionSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.FunctionSpecification _functionspecification = (org.polarsys.capella.core.data.fa.FunctionSpecification) obj;
			children.addAll(_functionspecification.getOwnedExtensions());
			children.addAll(_functionspecification.getOwnedConstraints());
			children.addAll(_functionspecification.getOwnedMigratedElements());
			children.addAll(_functionspecification.getOwnedPropertyValues());
			children.addAll(_functionspecification.getOwnedEnumerationPropertyTypes());
			children.addAll(_functionspecification.getOwnedPropertyValueGroups());
			children.addAll(_functionspecification.getOwnedTraces());
			children.addAll(_functionspecification.getNamingRules());
			children.addAll(_functionspecification.getOwnedNodes());
			children.addAll(_functionspecification.getOwnedEdges());
			children.addAll(_functionspecification.getOwnedGroups());
			children.addAll(_functionspecification.getOwnedFunctionPorts());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getRefinementLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.RefinementLink _refinementlink = (org.polarsys.capella.core.data.interaction.RefinementLink) obj;
			children.addAll(_refinementlink.getOwnedExtensions());
			children.addAll(_refinementlink.getOwnedConstraints());
			children.addAll(_refinementlink.getOwnedMigratedElements());
			children.addAll(_refinementlink.getOwnedPropertyValues());
			children.addAll(_refinementlink.getOwnedEnumerationPropertyTypes());
			children.addAll(_refinementlink.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getCapabilityExploitation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.ctx.CapabilityExploitation _capabilityexploitation = (org.polarsys.capella.core.data.ctx.CapabilityExploitation) obj;
			children.addAll(_capabilityexploitation.getOwnedExtensions());
			children.addAll(_capabilityexploitation.getOwnedConstraints());
			children.addAll(_capabilityexploitation.getOwnedMigratedElements());
			children.addAll(_capabilityexploitation.getOwnedPropertyValues());
			children.addAll(_capabilityexploitation.getOwnedEnumerationPropertyTypes());
			children.addAll(_capabilityexploitation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getAbstractRelationship(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			modellingcore.AbstractRelationship _abstractrelationship = (modellingcore.AbstractRelationship) obj;
			children.addAll(_abstractrelationship.getOwnedExtensions());
			children.addAll(_abstractrelationship.getOwnedConstraints());
			children.addAll(_abstractrelationship.getOwnedMigratedElements());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getInterfaceAllocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.cs.InterfaceAllocation _interfaceallocation = (org.polarsys.capella.core.data.cs.InterfaceAllocation) obj;
			children.addAll(_interfaceallocation.getOwnedExtensions());
			children.addAll(_interfaceallocation.getOwnedConstraints());
			children.addAll(_interfaceallocation.getOwnedMigratedElements());
			children.addAll(_interfaceallocation.getOwnedPropertyValues());
			children.addAll(_interfaceallocation.getOwnedEnumerationPropertyTypes());
			children.addAll(_interfaceallocation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getKeyValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.KeyValue _keyvalue = (org.polarsys.capella.core.data.capellacore.KeyValue) obj;
			children.addAll(_keyvalue.getOwnedExtensions());
			children.addAll(_keyvalue.getOwnedConstraints());
			children.addAll(_keyvalue.getOwnedMigratedElements());
			children.addAll(_keyvalue.getOwnedPropertyValues());
			children.addAll(_keyvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_keyvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getPortRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.PortRealization _portrealization = (org.polarsys.capella.core.data.information.PortRealization) obj;
			children.addAll(_portrealization.getOwnedExtensions());
			children.addAll(_portrealization.getOwnedConstraints());
			children.addAll(_portrealization.getOwnedMigratedElements());
			children.addAll(_portrealization.getOwnedPropertyValues());
			children.addAll(_portrealization.getOwnedEnumerationPropertyTypes());
			children.addAll(_portrealization.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE.getComponentExchange(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.fa.ComponentExchange _componentexchange = (org.polarsys.capella.core.data.fa.ComponentExchange) obj;
			children.addAll(_componentexchange.getOwnedExtensions());
			children.addAll(_componentexchange.getOwnedConstraints());
			children.addAll(_componentexchange.getOwnedMigratedElements());
			children.addAll(_componentexchange.getOwnedPropertyValues());
			children.addAll(_componentexchange.getOwnedEnumerationPropertyTypes());
			children.addAll(_componentexchange.getOwnedPropertyValueGroups());
			children.addAll(_componentexchange.getOwnedComponentExchangeFunctionalExchangeAllocations());
			children.addAll(_componentexchange.getOwnedComponentExchangeRealizations());
			children.addAll(_componentexchange.getOwnedComponentExchangeEnds());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getStringPropertyValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.StringPropertyValue _stringpropertyvalue = (org.polarsys.capella.core.data.capellacore.StringPropertyValue) obj;
			children.addAll(_stringpropertyvalue.getOwnedExtensions());
			children.addAll(_stringpropertyvalue.getOwnedConstraints());
			children.addAll(_stringpropertyvalue.getOwnedMigratedElements());
			children.addAll(_stringpropertyvalue.getOwnedPropertyValues());
			children.addAll(_stringpropertyvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_stringpropertyvalue.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getAbstractEventOperation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.AbstractEventOperation _abstracteventoperation = (org.polarsys.capella.core.data.information.AbstractEventOperation) obj;
			children.addAll(_abstracteventoperation.getOwnedExtensions());
			children.addAll(_abstracteventoperation.getOwnedConstraints());
			children.addAll(_abstracteventoperation.getOwnedMigratedElements());
			children.addAll(_abstracteventoperation.getOwnedPropertyValues());
			children.addAll(_abstracteventoperation.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstracteventoperation.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE.getCreationEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.interaction.CreationEvent _creationevent = (org.polarsys.capella.core.data.interaction.CreationEvent) obj;
			children.addAll(_creationevent.getOwnedExtensions());
			children.addAll(_creationevent.getOwnedConstraints());
			children.addAll(_creationevent.getOwnedMigratedElements());
			children.addAll(_creationevent.getOwnedPropertyValues());
			children.addAll(_creationevent.getOwnedEnumerationPropertyTypes());
			children.addAll(_creationevent.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getActivityGroup(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.ActivityGroup _activitygroup = (org.polarsys.capella.common.data.activity.ActivityGroup) obj;
			children.addAll(_activitygroup.getOwnedExtensions());
			children.addAll(_activitygroup.getOwnedConstraints());
			children.addAll(_activitygroup.getOwnedMigratedElements());
			children.addAll(_activitygroup.getSubGroups());
			children.addAll(_activitygroup.getOwnedNodes());
			children.addAll(_activitygroup.getOwnedEdges());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE.getOutputPin(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.common.data.activity.OutputPin _outputpin = (org.polarsys.capella.common.data.activity.OutputPin) obj;
			children.addAll(_outputpin.getOwnedExtensions());
			children.addAll(_outputpin.getOwnedConstraints());
			children.addAll(_outputpin.getOwnedMigratedElements());
			if(_outputpin.getUpperBound() != null)
				children.add(_outputpin.getUpperBound());
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getNamingRule(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.capellacore.NamingRule _namingrule = (org.polarsys.capella.core.data.capellacore.NamingRule) obj;
			children.addAll(_namingrule.getOwnedExtensions());
			children.addAll(_namingrule.getOwnedConstraints());
			children.addAll(_namingrule.getOwnedMigratedElements());
			children.addAll(_namingrule.getOwnedPropertyValues());
			children.addAll(_namingrule.getOwnedEnumerationPropertyTypes());
			children.addAll(_namingrule.getOwnedPropertyValueGroups());
			return children;
		});
		explorationConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE.getAbstractCollectionValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.polarsys.capella.core.data.information.AbstractCollectionValue _abstractcollectionvalue = (org.polarsys.capella.core.data.information.AbstractCollectionValue) obj;
			children.addAll(_abstractcollectionvalue.getOwnedExtensions());
			children.addAll(_abstractcollectionvalue.getOwnedConstraints());
			children.addAll(_abstractcollectionvalue.getOwnedMigratedElements());
			children.addAll(_abstractcollectionvalue.getOwnedPropertyValues());
			children.addAll(_abstractcollectionvalue.getOwnedEnumerationPropertyTypes());
			children.addAll(_abstractcollectionvalue.getOwnedPropertyValueGroups());
			return children;
		});
	}
}

