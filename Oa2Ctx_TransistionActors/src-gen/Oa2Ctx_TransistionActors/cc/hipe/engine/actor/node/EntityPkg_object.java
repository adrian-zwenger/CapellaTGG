package Oa2Ctx_TransistionActors.cc.hipe.engine.actor.node;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.actor.node.PortNode;
import hipe.engine.actor.node.PortNodeLeft;
import hipe.engine.actor.node.PortNodeRight;
import hipe.engine.actor.node.PortNodeMatch;
import hipe.engine.actor.node.PortNodeMatchLeft;
import hipe.engine.actor.node.PortNodeMatchRight;

import hipe.network.ObjectNode;

import hipe.generic.actor.GenericObjectActor;

import hipe.generic.actor.junction.util.HiPEConfig;
		
public class EntityPkg_object extends GenericObjectActor<org.polarsys.capella.core.data.oa.EntityPkg> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeMatch<org.polarsys.capella.core.data.oa.EntityPkg>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_1_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeMatch<org.polarsys.capella.core.data.oa.EntityPkg>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("Oa2Sa_transition_actors__CC_29_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeMatch<org.polarsys.capella.core.data.oa.EntityPkg>(node.getPorts().getPort().get(3), getSelf(), name2actor.get("Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_39_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeRight<org.polarsys.capella.core.data.oa.EntityPkg>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("OperationalAnalysis_ownedEntityPkg_0_reference"), this::check_constraint_2 , 0   ));
	}
	
	public boolean check_constraint_2(org.polarsys.capella.core.data.oa.EntityPkg src_entity_pkg, int index) {
		return String.valueOf(src_entity_pkg.getName()).equals("Operational Entities");
	}
	
}


