package Oa2Ctx_TransistionActors.co.hipe.engine.actor.node;

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
		
public class Part_object_SP1 extends GenericObjectActor<org.polarsys.capella.core.data.cs.Part> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<org.polarsys.capella.core.data.cs.Part>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("Entity_ownedFeatures_0_reference"), this::returnTrue   ));
		ports.add(new PortNodeLeft<org.polarsys.capella.core.data.cs.Part>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("Part_abstractType_1_reference"), this::returnTrue   ));
		ports.add(new PortNodeLeft<org.polarsys.capella.core.data.cs.Part>(node.getPorts().getPort().get(3), getSelf(), name2actor.get("Part_abstractType_2_reference"), this::returnTrue   ));
		ports.add(new PortNodeRight<org.polarsys.capella.core.data.cs.Part>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("SystemComponentPkg_ownedParts_0_reference"), this::check_constraint_7 , 0   ));
	}
	
	public boolean check_constraint_7(org.polarsys.capella.core.data.cs.Part trg_system_as_part, int index) {
		return String.valueOf(trg_system_as_part.getName()).equals("System");
	}
	
}


