package Oa2Ctx_TransistionActors.initbwd.hipe.engine.actor.node;

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
		
public class SystemComponentPkg_object_SP1 extends GenericObjectActor<org.polarsys.capella.core.data.ctx.SystemComponentPkg> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeMatch<org.polarsys.capella.core.data.ctx.SystemComponentPkg>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_1_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeMatch<org.polarsys.capella.core.data.ctx.SystemComponentPkg>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_34_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeLeft<org.polarsys.capella.core.data.ctx.SystemComponentPkg>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("SystemComponentPkg_ownedSystemComponents_0_reference"), this::check_constraint_10 , 0   ));
	}
	
	public boolean check_constraint_10(org.polarsys.capella.core.data.ctx.SystemComponentPkg trg_system_component_pkg, int index) {
		return String.valueOf(trg_system_component_pkg.getName()).equals("Structure");
	}
	
}


