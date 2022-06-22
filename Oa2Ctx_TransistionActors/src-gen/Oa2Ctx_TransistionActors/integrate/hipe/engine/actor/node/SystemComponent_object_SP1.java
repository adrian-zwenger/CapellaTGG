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
		
public class SystemComponent_object_SP1 extends GenericObjectActor<org.polarsys.capella.core.data.ctx.SystemComponent> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeMatch<org.polarsys.capella.core.data.ctx.SystemComponent>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("Oa2Sa_transition_actors__TRG_39_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeMatch<org.polarsys.capella.core.data.ctx.SystemComponent>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("Oa2Sa_transition_actors_recursively__TRG_74_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeRight<org.polarsys.capella.core.data.ctx.SystemComponent>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("Part_abstractType_0_reference"), this::check_constraint_6 , 0   ));
		ports.add(new PortNodeRight<org.polarsys.capella.core.data.ctx.SystemComponent>(node.getPorts().getPort().get(3), getSelf(), name2actor.get("Part_abstractType_2_reference"), this::check_constraint_32 , 1   ));
	}
	
	public boolean check_constraint_6(org.polarsys.capella.core.data.ctx.SystemComponent trg_system_as_component, int index) {
		return String.valueOf(trg_system_as_component.getName()).equals("System") && trg_system_as_component.isActor()==false && trg_system_as_component.isHuman()==false;
	}
	
	public boolean check_constraint_32(org.polarsys.capella.core.data.ctx.SystemComponent trg_system_component, int index) {
		return trg_system_component.isActor()==true;
	}
	
}


