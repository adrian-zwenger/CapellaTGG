package Oa2Ctx_TransistionActors.initfwd.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.NotificationActor;
import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.DispatchActor;
import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.localsearch.Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_1_localSearch;
import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.localsearch.Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_5_localSearch;
import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.localsearch.Oa2Sa_generation__CONSISTENCY_9_localSearch;
import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.localsearch.Oa2Sa_generation__FWD_18_localSearch;
import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.localsearch.Oa2Sa_transition_actors_src_oa_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_21_localSearch;
import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.localsearch.Oa2Sa_transition_actors__CONSISTENCY_24_localSearch;
import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.localsearch.Oa2Sa_transition_actors__FWD_37_localSearch;
import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.localsearch.Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_45_localSearch;
import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.localsearch.Oa2Sa_transition_actors_recursively_src_operational_part_ownedParts_incoming_SRC__FILTER_NAC_SRC_48_localSearch;
import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.localsearch.Oa2Sa_transition_actors_recursively__CONSISTENCY_51_localSearch;
import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.edge.Part_abstractType_0_reference;
import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.node.SystemAnalysis_object_SP1;
import Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.node.SystemComponentPkg_object_SP1;

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
		classes.put("Oa2Sa_generation__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_generation__CONSISTENCY_production", "Oa2Sa_generation__CONSISTENCY");
		classes.put("Oa2Sa_generation__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_generation__FWD_production", "Oa2Sa_generation__FWD");
		classes.put("Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_production", "Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_production", "Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("Oa2Sa_transition_actors__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors__CONSISTENCY_production", "Oa2Sa_transition_actors__CONSISTENCY");
		classes.put("Oa2Sa_transition_actors__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors__FWD_production", "Oa2Sa_transition_actors__FWD");
		classes.put("Oa2Sa_transition_actors_recursively__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors_recursively__CONSISTENCY_production", "Oa2Sa_transition_actors_recursively__CONSISTENCY");
		classes.put("Oa2Sa_transition_actors_recursively__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors_recursively__FWD_production", "Oa2Sa_transition_actors_recursively__FWD");
		classes.put("Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_production", "Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC");
		classes.put("Oa2Sa_transition_actors_recursively_src_operational_part_ownedParts_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors_recursively_src_operational_part_ownedParts_incoming_SRC__FILTER_NAC_SRC_production", "Oa2Sa_transition_actors_recursively_src_operational_part_ownedParts_incoming_SRC__FILTER_NAC_SRC");
		classes.put("Oa2Sa_transition_actors_src_oa_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors_src_oa_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_production", "Oa2Sa_transition_actors_src_oa_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_1_localSearch", Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_1_localSearch.class);
		classes.put("Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_5_localSearch", Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_5_localSearch.class);
		classes.put("Oa2Sa_generation__CONSISTENCY_9_localSearch", Oa2Sa_generation__CONSISTENCY_9_localSearch.class);
		classes.put("Oa2Sa_generation__FWD_18_localSearch", Oa2Sa_generation__FWD_18_localSearch.class);
		classes.put("Oa2Sa_transition_actors_src_oa_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_21_localSearch", Oa2Sa_transition_actors_src_oa_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_21_localSearch.class);
		classes.put("Oa2Sa_transition_actors__CONSISTENCY_24_localSearch", Oa2Sa_transition_actors__CONSISTENCY_24_localSearch.class);
		classes.put("Oa2Sa_transition_actors__FWD_37_localSearch", Oa2Sa_transition_actors__FWD_37_localSearch.class);
		classes.put("Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_45_localSearch", Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_45_localSearch.class);
		classes.put("Oa2Sa_transition_actors_recursively_src_operational_part_ownedParts_incoming_SRC__FILTER_NAC_SRC_48_localSearch", Oa2Sa_transition_actors_recursively_src_operational_part_ownedParts_incoming_SRC__FILTER_NAC_SRC_48_localSearch.class);
		classes.put("Oa2Sa_transition_actors_recursively__CONSISTENCY_51_localSearch", Oa2Sa_transition_actors_recursively__CONSISTENCY_51_localSearch.class);
		classes.put("Oa2Sa_transition_actors_recursively__FWD_67_nacjunction", GenericNACJunctionActor.class);
		classes.put("Oa2Sa_transition_actors_recursively__FWD_71_nacjunction", GenericNACJunctionActor.class);
		classes.put("Oa2Sa_transition_actors_recursively__FWD_68_junction", GenericJunctionActor.class);
		classes.put("Oa2Sa_transition_actors_recursively__FWD_64_junction", GenericJunctionActor.class);
		classes.put("Oa2Sa_transition_actors_recursively__FWD_62_junction", GenericJunctionActor.class);
	}
	
	@Override
	public void createReferenceNodes() {
		classes.put("SystemAnalysis_ownedSystemComponentPkg_0_reference",SystemAnalysis_ownedSystemComponentPkg_0_reference.class);
		classes.put("Entity_ownedFeatures_0_reference",Entity_ownedFeatures_0_reference.class);
		classes.put("Entity_ownedEntities_0_reference",Entity_ownedEntities_0_reference.class);
		classes.put("Part_abstractType_0_reference",Part_abstractType_0_reference.class);
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("SystemComponent_object",SystemComponent_object.class);
		classes.put("Oa2Sa_object",Oa2Sa_object.class);
		classes.put("Oa2Sa_generation__Marker_object",Oa2Sa_generation__Marker_object.class);
		classes.put("Entity2SystemComponent_object",Entity2SystemComponent_object.class);
		classes.put("OaPart2SaPart_object",OaPart2SaPart_object.class);
		classes.put("Oa2Sa_transition_actors__Marker_object",Oa2Sa_transition_actors__Marker_object.class);
		classes.put("Oa2Sa_transition_actors_recursively__Marker_object",Oa2Sa_transition_actors_recursively__Marker_object.class);
		classes.put("ComponentPkg_object",ComponentPkg_object.class);
		classes.put("EntityPkg_object_SP0",EntityPkg_object_SP0.class);
		classes.put("EntityPkg_object_SP1",EntityPkg_object_SP1.class);
		classes.put("OperationalAnalysis_object_SP0",OperationalAnalysis_object_SP0.class);
		classes.put("OperationalAnalysis_object_SP1",OperationalAnalysis_object_SP1.class);
		classes.put("SystemAnalysis_object_SP0",SystemAnalysis_object_SP0.class);
		classes.put("SystemAnalysis_object_SP1",SystemAnalysis_object_SP1.class);
		classes.put("Part_object_SP0",Part_object_SP0.class);
		classes.put("Part_object_SP1",Part_object_SP1.class);
		classes.put("SystemComponentPkg_object_SP0",SystemComponentPkg_object_SP0.class);
		classes.put("SystemComponentPkg_object_SP1",SystemComponentPkg_object_SP1.class);
		classes.put("Entity_object_SP0",Entity_object_SP0.class);
		classes.put("Entity_object_SP1",Entity_object_SP1.class);
		classes.put("Entity_object_SP2",Entity_object_SP2.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
		name2initRefGen.put("SystemAnalysis_ownedSystemComponentPkg_0_reference", new InitGenReferenceActor<org.polarsys.capella.core.data.ctx.SystemAnalysis,org.polarsys.capella.core.data.ctx.SystemComponentPkg>(name2actor, name2node.get("SystemAnalysis_ownedSystemComponentPkg_0_reference"), (o) -> o instanceof org.polarsys.capella.core.data.ctx.SystemAnalysis, (o) -> o.getOwnedSystemComponentPkg(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Entity_ownedFeatures_0_reference", new InitGenReferenceActor<org.polarsys.capella.core.data.capellacore.Classifier,org.polarsys.capella.core.data.capellacore.Feature>(name2actor, name2node.get("Entity_ownedFeatures_0_reference"), (o) -> o instanceof org.polarsys.capella.core.data.capellacore.Classifier, null, (o) -> o.getOwnedFeatures(), false, prodUtil, incUtil));
		name2initRefGen.put("Entity_ownedEntities_0_reference", new InitGenReferenceActor<org.polarsys.capella.core.data.oa.Entity,org.polarsys.capella.core.data.oa.Entity>(name2actor, name2node.get("Entity_ownedEntities_0_reference"), (o) -> o instanceof org.polarsys.capella.core.data.oa.Entity, null, (o) -> o.getOwnedEntities(), true, prodUtil, incUtil));
		name2initRefGen.put("Part_abstractType_0_reference", new InitGenReferenceActor<modellingcore.AbstractTypedElement,modellingcore.AbstractType>(name2actor, name2node.get("Part_abstractType_0_reference"), (o) -> o instanceof modellingcore.AbstractTypedElement, (o) -> o.getAbstractType(), null, false, prodUtil, incUtil));
	}
}

class SystemComponent_object extends GenericObjectActor<org.polarsys.capella.core.data.ctx.SystemComponent> { }
class Oa2Sa_object extends GenericObjectActor<Oa2Ctx_TransistionActors.Oa2Sa> { }
class Oa2Sa_generation__Marker_object extends GenericObjectActor<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker> { }
class Entity2SystemComponent_object extends GenericObjectActor<Oa2Ctx_TransistionActors.Entity2SystemComponent> { }
class OaPart2SaPart_object extends GenericObjectActor<Oa2Ctx_TransistionActors.OaPart2SaPart> { }
class Oa2Sa_transition_actors__Marker_object extends GenericObjectActor<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker> { }
class Oa2Sa_transition_actors_recursively__Marker_object extends GenericObjectActor<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker> { }
class ComponentPkg_object extends GenericObjectActor<org.polarsys.capella.core.data.cs.ComponentPkg> { }
class EntityPkg_object_SP0 extends GenericObjectActor<org.polarsys.capella.core.data.oa.EntityPkg> { }
class EntityPkg_object_SP1 extends GenericObjectActor<org.polarsys.capella.core.data.oa.EntityPkg> { }
class OperationalAnalysis_object_SP0 extends GenericObjectActor<org.polarsys.capella.core.data.oa.OperationalAnalysis> { }
class OperationalAnalysis_object_SP1 extends GenericObjectActor<org.polarsys.capella.core.data.oa.OperationalAnalysis> { }
class SystemAnalysis_object_SP0 extends GenericObjectActor<org.polarsys.capella.core.data.ctx.SystemAnalysis> { }
class Part_object_SP0 extends GenericObjectActor<org.polarsys.capella.core.data.cs.Part> { }
class Part_object_SP1 extends GenericObjectActor<org.polarsys.capella.core.data.cs.Part> { }
class SystemComponentPkg_object_SP0 extends GenericObjectActor<org.polarsys.capella.core.data.ctx.SystemComponentPkg> { }
class Entity_object_SP0 extends GenericObjectActor<org.polarsys.capella.core.data.oa.Entity> { }
class Entity_object_SP1 extends GenericObjectActor<org.polarsys.capella.core.data.oa.Entity> { }
class Entity_object_SP2 extends GenericObjectActor<org.polarsys.capella.core.data.oa.Entity> { }

class SystemAnalysis_ownedSystemComponentPkg_0_reference extends GenericReferenceActor<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg> { }
class Entity_ownedFeatures_0_reference extends GenericReferenceActor<org.polarsys.capella.core.data.capellacore.Classifier, org.polarsys.capella.core.data.capellacore.Feature> { }
class Entity_ownedEntities_0_reference extends GenericReferenceActor<org.polarsys.capella.core.data.oa.Entity, org.polarsys.capella.core.data.oa.Entity> { }

