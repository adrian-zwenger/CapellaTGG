package Oa2Ctx_TransistionActors.integrate.hipe.engine.actor.junction;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.util.Set;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.util.HiPEMultiUtil;

import hipe.generic.match.GenericJunctionMatch;
import hipe.generic.actor.junction.GenericJunctionActor;

import hipe.network.JunctionNode;

public class Oa2Sa_transition_actors_recursively__CC_87_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> abstractNamedElement_2_AttrMap = HiPEMultiUtil.createMap();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		constraints.add(this::check_constraint_34);
		
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("Oa2Sa_transition_actors_recursively__CC_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> abstractNamedElement_1_Matches = abstractNamedElement_2_AttrMap.get(matchObjects[1]);
		if(abstractNamedElement_1_Matches == null) {
			abstractNamedElement_1_Matches = new LinkedList<>();
			abstractNamedElement_2_AttrMap.put(matchObjects[1], abstractNamedElement_1_Matches);
		}
		
		abstractNamedElement_1_Matches.add(match);
		
		Collection<HMatch> abstractNamedElement_2_Matches = abstractNamedElement_2_AttrMap.get(matchObjects[2]);
		if(abstractNamedElement_2_Matches == null) {
			abstractNamedElement_2_Matches = new LinkedList<>();
			abstractNamedElement_2_AttrMap.put(matchObjects[2], abstractNamedElement_2_Matches);
		}
		
		abstractNamedElement_2_Matches.add(match);
		
		Collection<HMatch> abstractNamedElement_5_Matches = abstractNamedElement_2_AttrMap.get(matchObjects[5]);
		if(abstractNamedElement_5_Matches == null) {
			abstractNamedElement_5_Matches = new LinkedList<>();
			abstractNamedElement_2_AttrMap.put(matchObjects[5], abstractNamedElement_5_Matches);
		}
		
		abstractNamedElement_5_Matches.add(match);
		
		Collection<HMatch> abstractNamedElement_6_Matches = abstractNamedElement_2_AttrMap.get(matchObjects[6]);
		if(abstractNamedElement_6_Matches == null) {
			abstractNamedElement_6_Matches = new LinkedList<>();
			abstractNamedElement_2_AttrMap.put(matchObjects[6], abstractNamedElement_6_Matches);
		}
		
		abstractNamedElement_6_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = abstractNamedElement_2_AttrMap.get(matchObjects[1]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		Collection<HMatch> matches_1 = abstractNamedElement_2_AttrMap.get(matchObjects[2]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		Collection<HMatch> matches_2 = abstractNamedElement_2_AttrMap.get(matchObjects[5]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		Collection<HMatch> matches_3 = abstractNamedElement_2_AttrMap.get(matchObjects[6]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
	}
	
	@Override
	protected void changeAttribute(AttributeChanged<HMatch> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		Object obj = message.node;
		if(obj instanceof modellingcore.AbstractNamedElement) {
			if(abstractNamedElement_2_AttrMap.containsKey(obj)) {
				for(HMatch attr_match : abstractNamedElement_2_AttrMap.get(obj)) {
					for(int i=0; i<ports.size(); i++) {
						Port<HMatch> port = ports.get(i);
						HMatch match = attr_match;
												
						if(match.isConstraintSatisfied(i)) {
							if(!constraints.get(i).apply(match, i))
								port.sendRemove(message.initialMessage, match);
						}
						else {
							if(constraints.get(i).apply(match, i))
								port.sendAdd(message.initialMessage, match);
						}
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_34(HMatch match, int index) {
		org.polarsys.capella.core.data.ctx.SystemComponent trg_system_component = (org.polarsys.capella.core.data.ctx.SystemComponent) match.getNodes()[6];
		org.polarsys.capella.core.data.cs.Part trg_system_part = (org.polarsys.capella.core.data.cs.Part) match.getNodes()[5];
		org.polarsys.capella.core.data.oa.Entity src_operational_entity = (org.polarsys.capella.core.data.oa.Entity) match.getNodes()[2];
		org.polarsys.capella.core.data.cs.Part src_operational_part = (org.polarsys.capella.core.data.cs.Part) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_24 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_24.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, src_operational_entity.getName(), "java.lang.String"));
		csp_24.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, trg_system_component.getName(), "java.lang.String"));
		csp_24.solve();
		
		boolean predicate = !src_operational_part.equals(trg_system_part) && csp_24.isSatisfied();
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

