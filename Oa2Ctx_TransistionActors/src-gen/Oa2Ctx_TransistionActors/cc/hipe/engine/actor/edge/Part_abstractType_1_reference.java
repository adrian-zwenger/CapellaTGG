package Oa2Ctx_TransistionActors.cc.hipe.engine.actor.edge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import hipe.engine.util.HiPESet;
import hipe.engine.actor.Port;
import hipe.engine.match.EdgeMatch;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NewInput;
import hipe.engine.actor.edge.PortEdge;
import hipe.engine.actor.edge.PortEdgeLeft;
import hipe.engine.actor.edge.PortEdgeRight;

import hipe.network.ReferenceNode;

import hipe.generic.actor.GenericReferenceActor;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

public class Part_abstractType_1_reference extends GenericReferenceActor<modellingcore.AbstractTypedElement,modellingcore.AbstractType> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeLeft(node.getPorts().getPort().get(0), getSelf(), name2actor.get("Oa2Sa_transition_actors_recursively__CC_54_nacjunction"), this::check_constraint_16 , 0   ));
	}	

	public boolean check_constraint_16(EdgeMatch edge, int index) {
		org.polarsys.capella.core.data.cs.Part src_operational_part = (org.polarsys.capella.core.data.cs.Part) edge.source();
		org.polarsys.capella.core.data.oa.Entity src_operational_entity = (org.polarsys.capella.core.data.oa.Entity) edge.target();
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_5 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_5.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, src_operational_entity.getName(), "java.lang.String"));
		csp_5.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, src_operational_part.getName(), "java.lang.String"));
		csp_5.solve();
		
		boolean predicate = csp_5.isSatisfied();
		edge.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

