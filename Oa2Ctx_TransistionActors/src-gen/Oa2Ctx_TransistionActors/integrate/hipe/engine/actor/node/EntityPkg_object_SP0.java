package Oa2Ctx_TransistionActors.integrate.hipe.engine.actor.node;

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
		
public class EntityPkg_object_SP0 extends GenericObjectActor<org.polarsys.capella.core.data.oa.EntityPkg> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeMatch<org.polarsys.capella.core.data.oa.EntityPkg>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("Oa2Sa_generation__SRC_32_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeMatch<org.polarsys.capella.core.data.oa.EntityPkg>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeMatch<org.polarsys.capella.core.data.oa.EntityPkg>(node.getPorts().getPort().get(3), getSelf(), name2actor.get("Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_81_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeRight<org.polarsys.capella.core.data.oa.EntityPkg>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("OperationalAnalysis_ownedEntityPkg_0_reference"), this::check_constraint_3 , 0   ));
	}
	
	public boolean check_constraint_3(org.polarsys.capella.core.data.oa.EntityPkg src_entity_pkg, int index) {
		return String.valueOf(src_entity_pkg.getName()).equals("Operational Entities");
	}
	
}


