package Oa2Ctx_TransistionActors.initbwd.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.NotificationActor;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.DispatchActor;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.localsearch.Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_1_localSearch;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.localsearch.Oa2Sa_generation__BWD_5_localSearch;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.localsearch.Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_10_localSearch;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.localsearch.Oa2Sa_generation__CONSISTENCY_14_localSearch;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.localsearch.Oa2Sa_transition_actors__BWD_23_localSearch;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.localsearch.Oa2Sa_transition_actors_src_oa_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_31_localSearch;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.localsearch.Oa2Sa_transition_actors__CONSISTENCY_34_localSearch;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.edge.Part_abstractType_0_reference;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.localsearch.Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_60_localSearch;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.localsearch.Oa2Sa_transition_actors_recursively_src_operational_part_ownedParts_incoming_SRC__FILTER_NAC_SRC_63_localSearch;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.localsearch.Oa2Sa_transition_actors_recursively__CONSISTENCY_66_localSearch;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.node.SystemAnalysis_object_SP1;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.node.SystemComponent_object_SP0;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.node.SystemComponent_object_SP1;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.node.SystemComponentPkg_object_SP0;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.node.SystemComponentPkg_object_SP1;
import Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.node.SystemComponentPkg_object_SP2;

import hipe.engine.IHiPEEngine;
import hipe.engine.message.InitGenReferenceActor;

import hipe.generic.actor.GenericObjectActor;
import hipe.generic.actor.GenericReferenceActor;
import hipe.generic.actor.GenericProductionActor;
import hipe.generic.actor.junction.*;

import hipe.network.*;

public class HiPEEngine extends IHiPEEngine{
	
	public HiPEEngine(HiPENetwork network) {
		super(network);
	}
	
	public HiPEEngine() {
		super();
	}
	
	@Override
	public String getClassLocation() {
		return getClass().getProtectionDomain().getCodeSource().getLocation().getPath().toString();
	}
	
	@Override
	public String getPackageName() {
		return getClass().getPackageName();
	}
	
	@Override
	protected ActorRef getDispatchActor() {
		return system.actorOf(
			Props.create(DispatchActor.class, () -> new DispatchActor(name2actor, incUtil)),
			"DispatchActor");
	}
	
	@Override
	protected ActorRef getNotificationActor(boolean cascadingNotifications) {
		return system.actorOf(
			Props.create(NotificationActor.class, () -> new NotificationActor(dispatcher, incUtil, cascadingNotifications)), 
			"NotificationActor");
	}
	
	@Override
	public void createProductionNodes() {
		classes.put("Oa2Sa_generation__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_generation__BWD_production", "Oa2Sa_generation__BWD");
		classes.put("Oa2Sa_generation__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_generation__CONSISTENCY_production", "Oa2Sa_generation__CONSISTENCY");
		classes.put("Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_production", "Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_production", "Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("Oa2Sa_transition_actors__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors__BWD_production", "Oa2Sa_transition_actors__BWD");
		classes.put("Oa2Sa_transition_actors__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors__CONSISTENCY_production", "Oa2Sa_transition_actors__CONSISTENCY");
		classes.put("Oa2Sa_transition_actors_recursively__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors_recursively__BWD_production", "Oa2Sa_transition_actors_recursively__BWD");
		classes.put("Oa2Sa_transition_actors_recursively__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors_recursively__CONSISTENCY_production", "Oa2Sa_transition_actors_recursively__CONSISTENCY");
		classes.put("Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_production", "Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC");
		classes.put("Oa2Sa_transition_actors_recursively_src_operational_part_ownedParts_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors_recursively_src_operational_part_ownedParts_incoming_SRC__FILTER_NAC_SRC_production", "Oa2Sa_transition_actors_recursively_src_operational_part_ownedParts_incoming_SRC__FILTER_NAC_SRC");
		classes.put("Oa2Sa_transition_actors_src_oa_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors_src_oa_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_production", "Oa2Sa_transition_actors_src_oa_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_1_localSearch", Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_1_localSearch.class);
		classes.put("Oa2Sa_generation__BWD_5_localSearch", Oa2Sa_generation__BWD_5_localSearch.class);
		classes.put("Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_10_localSearch", Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_10_localSearch.class);
		classes.put("Oa2Sa_generation__CONSISTENCY_14_localSearch", Oa2Sa_generation__CONSISTENCY_14_localSearch.class);
		classes.put("Oa2Sa_transition_actors__BWD_23_localSearch", Oa2Sa_transition_actors__BWD_23_localSearch.class);
		classes.put("Oa2Sa_transition_actors_src_oa_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_31_localSearch", Oa2Sa_transition_actors_src_oa_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_31_localSearch.class);
		classes.put("Oa2Sa_transition_actors__CONSISTENCY_34_localSearch", Oa2Sa_transition_actors__CONSISTENCY_34_localSearch.class);
		classes.put("Oa2Sa_transition_actors_recursively__BWD_50_junction", GenericJunctionActor.class);
		classes.put("Oa2Sa_transition_actors_recursively__BWD_51_junction", GenericJunctionActor.class);
		classes.put("Oa2Sa_transition_actors_recursively__BWD_49_junction", GenericJunctionActor.class);
		classes.put("Oa2Sa_transition_actors_recursively__BWD_47_junction", GenericJunctionActor.class);
		classes.put("Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_60_localSearch", Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_60_localSearch.class);
		classes.put("Oa2Sa_transition_actors_recursively_src_operational_part_ownedParts_incoming_SRC__FILTER_NAC_SRC_63_localSearch", Oa2Sa_transition_actors_recursively_src_operational_part_ownedParts_incoming_SRC__FILTER_NAC_SRC_63_localSearch.class);
		classes.put("Oa2Sa_transition_actors_recursively__CONSISTENCY_66_localSearch", Oa2Sa_transition_actors_recursively__CONSISTENCY_66_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		classes.put("SystemAnalysis_ownedSystemComponentPkg_0_reference",SystemAnalysis_ownedSystemComponentPkg_0_reference.class);
		classes.put("SystemComponentPkg_ownedParts_0_reference",SystemComponentPkg_ownedParts_0_reference.class);
		classes.put("SystemComponentPkg_ownedSystemComponents_0_reference",SystemComponentPkg_ownedSystemComponents_0_reference.class);
		classes.put("Part_abstractType_0_reference",Part_abstractType_0_reference.class);
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("OperationalAnalysis_object",OperationalAnalysis_object.class);
		classes.put("Oa2Sa_object",Oa2Sa_object.class);
		classes.put("Oa2Sa_generation__Marker_object",Oa2Sa_generation__Marker_object.class);
		classes.put("Entity2SystemComponent_object",Entity2SystemComponent_object.class);
		classes.put("OaPart2SaPart_object",OaPart2SaPart_object.class);
		classes.put("Oa2Sa_transition_actors__Marker_object",Oa2Sa_transition_actors__Marker_object.class);
		classes.put("Oa2Sa_transition_actors_recursively__Marker_object",Oa2Sa_transition_actors_recursively__Marker_object.class);
		classes.put("ComponentPkg_object",ComponentPkg_object.class);
		classes.put("SystemAnalysis_object_SP0",SystemAnalysis_object_SP0.class);
		classes.put("SystemAnalysis_object_SP1",SystemAnalysis_object_SP1.class);
		classes.put("SystemComponent_object_SP0",SystemComponent_object_SP0.class);
		classes.put("SystemComponent_object_SP1",SystemComponent_object_SP1.class);
		classes.put("Part_object_SP0",Part_object_SP0.class);
		classes.put("Part_object_SP1",Part_object_SP1.class);
		classes.put("SystemComponentPkg_object_SP0",SystemComponentPkg_object_SP0.class);
		classes.put("SystemComponentPkg_object_SP1",SystemComponentPkg_object_SP1.class);
		classes.put("SystemComponentPkg_object_SP2",SystemComponentPkg_object_SP2.class);
		classes.put("EntityPkg_object_SP0",EntityPkg_object_SP0.class);
		classes.put("EntityPkg_object_SP1",EntityPkg_object_SP1.class);
		classes.put("Entity_object_SP0",Entity_object_SP0.class);
		classes.put("Entity_object_SP1",Entity_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
		name2initRefGen.put("SystemAnalysis_ownedSystemComponentPkg_0_reference", new InitGenReferenceActor<org.polarsys.capella.core.data.ctx.SystemAnalysis,org.polarsys.capella.core.data.ctx.SystemComponentPkg>(name2actor, name2node.get("SystemAnalysis_ownedSystemComponentPkg_0_reference"), (o) -> o instanceof org.polarsys.capella.core.data.ctx.SystemAnalysis, (o) -> o.getOwnedSystemComponentPkg(), null, false, prodUtil, incUtil));
		name2initRefGen.put("SystemComponentPkg_ownedParts_0_reference", new InitGenReferenceActor<org.polarsys.capella.core.data.cs.ComponentPkg,org.polarsys.capella.core.data.cs.Part>(name2actor, name2node.get("SystemComponentPkg_ownedParts_0_reference"), (o) -> o instanceof org.polarsys.capella.core.data.cs.ComponentPkg, null, (o) -> o.getOwnedParts(), false, prodUtil, incUtil));
		name2initRefGen.put("SystemComponentPkg_ownedSystemComponents_0_reference", new InitGenReferenceActor<org.polarsys.capella.core.data.ctx.SystemComponentPkg,org.polarsys.capella.core.data.ctx.SystemComponent>(name2actor, name2node.get("SystemComponentPkg_ownedSystemComponents_0_reference"), (o) -> o instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg, null, (o) -> o.getOwnedSystemComponents(), false, prodUtil, incUtil));
		name2initRefGen.put("Part_abstractType_0_reference", new InitGenReferenceActor<modellingcore.AbstractTypedElement,modellingcore.AbstractType>(name2actor, name2node.get("Part_abstractType_0_reference"), (o) -> o instanceof modellingcore.AbstractTypedElement, (o) -> o.getAbstractType(), null, false, prodUtil, incUtil));
	}
}

class OperationalAnalysis_object extends GenericObjectActor<org.polarsys.capella.core.data.oa.OperationalAnalysis> { }
class Oa2Sa_object extends GenericObjectActor<Oa2Ctx_TransistionActors.Oa2Sa> { }
class Oa2Sa_generation__Marker_object extends GenericObjectActor<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker> { }
class Entity2SystemComponent_object extends GenericObjectActor<Oa2Ctx_TransistionActors.Entity2SystemComponent> { }
class OaPart2SaPart_object extends GenericObjectActor<Oa2Ctx_TransistionActors.OaPart2SaPart> { }
class Oa2Sa_transition_actors__Marker_object extends GenericObjectActor<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker> { }
class Oa2Sa_transition_actors_recursively__Marker_object extends GenericObjectActor<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker> { }
class ComponentPkg_object extends GenericObjectActor<org.polarsys.capella.core.data.cs.ComponentPkg> { }
class SystemAnalysis_object_SP0 extends GenericObjectActor<org.polarsys.capella.core.data.ctx.SystemAnalysis> { }
class Part_object_SP0 extends GenericObjectActor<org.polarsys.capella.core.data.cs.Part> { }
class Part_object_SP1 extends GenericObjectActor<org.polarsys.capella.core.data.cs.Part> { }
class EntityPkg_object_SP0 extends GenericObjectActor<org.polarsys.capella.core.data.oa.EntityPkg> { }
class EntityPkg_object_SP1 extends GenericObjectActor<org.polarsys.capella.core.data.oa.EntityPkg> { }
class Entity_object_SP0 extends GenericObjectActor<org.polarsys.capella.core.data.oa.Entity> { }
class Entity_object_SP1 extends GenericObjectActor<org.polarsys.capella.core.data.oa.Entity> { }

class SystemAnalysis_ownedSystemComponentPkg_0_reference extends GenericReferenceActor<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg> { }
class SystemComponentPkg_ownedParts_0_reference extends GenericReferenceActor<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part> { }
class SystemComponentPkg_ownedSystemComponents_0_reference extends GenericReferenceActor<org.polarsys.capella.core.data.ctx.SystemComponentPkg, org.polarsys.capella.core.data.ctx.SystemComponent> { }

