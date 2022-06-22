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
		
public class SystemComponent_object_SP1 extends GenericObjectActor<org.polarsys.capella.core.data.ctx.SystemComponent> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<org.polarsys.capella.core.data.ctx.SystemComponent>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("SystemComponentPkg_ownedSystemComponents_0_reference"), this::check_constraint_9 , 0   ));
		ports.add(new PortNodeRight<org.polarsys.capella.core.data.ctx.SystemComponent>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("SystemComponentPkg_ownedSystemComponents_1_reference"), this::check_constraint_19 , 1   ));
	}
	
	public boolean check_constraint_9(org.polarsys.capella.core.data.ctx.SystemComponent trg_system_as_component, int index) {
		return String.valueOf(trg_system_as_component.getName()).equals("System") && trg_system_as_component.isActor()==false && trg_system_as_component.isHuman()==false;
	}
	
	public boolean check_constraint_19(org.polarsys.capella.core.data.ctx.SystemComponent trg_system_component, int index) {
		return trg_system_component.isActor()==true;
	}
	
}


