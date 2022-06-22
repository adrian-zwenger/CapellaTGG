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

public class Oa2Sa_transition_actors_recursively__BWD_79_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> componentAttrMap = HiPEMultiUtil.createMap();
	private Map<Object, Collection<HMatch>> abstractNamedElement_2_AttrMap = HiPEMultiUtil.createMap();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		constraints.add(this::check_constraint_27);
		constraints.add(this::returnTrue);
		
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("Oa2Sa_transition_actors_recursively__BWD_production"), this::returnTrue , 0  , false ));
		ports.add(new PortJunction(node.getPorts().getPort().get(1), getSelf(), name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch"), this::returnTrue  , false ));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> component_2_Matches = componentAttrMap.get(matchObjects[2]);
		if(component_2_Matches == null) {
			component_2_Matches = new LinkedList<>();
			componentAttrMap.put(matchObjects[2], component_2_Matches);
		}
		
		component_2_Matches.add(match);
		
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
		
		Collection<HMatch> abstractNamedElement_3_Matches = abstractNamedElement_2_AttrMap.get(matchObjects[3]);
		if(abstractNamedElement_3_Matches == null) {
			abstractNamedElement_3_Matches = new LinkedList<>();
			abstractNamedElement_2_AttrMap.put(matchObjects[3], abstractNamedElement_3_Matches);
		}
		
		abstractNamedElement_3_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = componentAttrMap.get(matchObjects[2]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		Collection<HMatch> matches_1 = abstractNamedElement_2_AttrMap.get(matchObjects[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		Collection<HMatch> matches_2 = abstractNamedElement_2_AttrMap.get(matchObjects[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		Collection<HMatch> matches_3 = abstractNamedElement_2_AttrMap.get(matchObjects[3]);
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
		if(obj instanceof org.polarsys.capella.core.data.cs.Component) {
			if(componentAttrMap.containsKey(obj)) {
				for(HMatch attr_match : componentAttrMap.get(obj)) {
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
	
	public boolean check_constraint_27(HMatch match, int index) {
		org.polarsys.capella.core.data.ctx.SystemComponent trg_system_component = (org.polarsys.capella.core.data.ctx.SystemComponent) match.getNodes()[2];
		org.polarsys.capella.core.data.ctx.SystemComponentPkg trg_system_component_pkg = (org.polarsys.capella.core.data.ctx.SystemComponentPkg) match.getNodes()[3];
		org.polarsys.capella.core.data.ctx.SystemAnalysis trg_sa_arch = (org.polarsys.capella.core.data.ctx.SystemAnalysis) match.getNodes()[1];
		boolean predicate = String.valueOf(trg_sa_arch.getName()).equals("System Analysis") && String.valueOf(trg_system_component_pkg.getName()).equals("Structure") && trg_system_component.isActor()==true;
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

