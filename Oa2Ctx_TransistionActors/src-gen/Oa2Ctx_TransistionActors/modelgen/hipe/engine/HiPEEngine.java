package Oa2Ctx_TransistionActors.modelgen.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Oa2Ctx_TransistionActors.modelgen.hipe.engine.actor.NotificationActor;
import Oa2Ctx_TransistionActors.modelgen.hipe.engine.actor.DispatchActor;
import Oa2Ctx_TransistionActors.modelgen.hipe.engine.actor.node.SystemComponentPkg_object;
import Oa2Ctx_TransistionActors.modelgen.hipe.engine.actor.node.SystemAnalysis_object;
import Oa2Ctx_TransistionActors.modelgen.hipe.engine.actor.localsearch.Oa2Sa_transition_actors__GEN_1_localSearch;

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
		classes.put("Oa2Sa_transition_actors__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors__GEN_production", "Oa2Sa_transition_actors__GEN");
		classes.put("Oa2Sa_transition_actors_recursively__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("Oa2Sa_transition_actors_recursively__GEN_production", "Oa2Sa_transition_actors_recursively__GEN");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("Oa2Sa_transition_actors__GEN_1_localSearch", Oa2Sa_transition_actors__GEN_1_localSearch.class);
		classes.put("Oa2Sa_transition_actors_recursively__GEN_7_junction", GenericJunctionActor.class);
	}
	
	@Override
	public void createReferenceNodes() {
		classes.put("SystemAnalysis_ownedSystemComponentPkg_0_reference",SystemAnalysis_ownedSystemComponentPkg_0_reference.class);
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("Oa2Sa_object",Oa2Sa_object.class);
		classes.put("EntityPkg_object",EntityPkg_object.class);
		classes.put("OperationalAnalysis_object",OperationalAnalysis_object.class);
		classes.put("SystemComponentPkg_object",SystemComponentPkg_object.class);
		classes.put("SystemAnalysis_object",SystemAnalysis_object.class);
		classes.put("Entity_object",Entity_object.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
		name2initRefGen.put("SystemAnalysis_ownedSystemComponentPkg_0_reference", new InitGenReferenceActor<org.polarsys.capella.core.data.ctx.SystemAnalysis,org.polarsys.capella.core.data.ctx.SystemComponentPkg>(name2actor, name2node.get("SystemAnalysis_ownedSystemComponentPkg_0_reference"), (o) -> o instanceof org.polarsys.capella.core.data.ctx.SystemAnalysis, (o) -> o.getOwnedSystemComponentPkg(), null, false, prodUtil, incUtil));
	}
}

class Oa2Sa_object extends GenericObjectActor<Oa2Ctx_TransistionActors.Oa2Sa> { }
class EntityPkg_object extends GenericObjectActor<org.polarsys.capella.core.data.oa.EntityPkg> { }
class OperationalAnalysis_object extends GenericObjectActor<org.polarsys.capella.core.data.oa.OperationalAnalysis> { }
class Entity_object extends GenericObjectActor<org.polarsys.capella.core.data.oa.Entity> { }

class SystemAnalysis_ownedSystemComponentPkg_0_reference extends GenericReferenceActor<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg> { }

