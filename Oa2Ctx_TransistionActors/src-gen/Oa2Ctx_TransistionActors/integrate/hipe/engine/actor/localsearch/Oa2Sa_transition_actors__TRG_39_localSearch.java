package Oa2Ctx_TransistionActors.integrate.hipe.engine.actor.localsearch;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.match.OverlapMatch;
import hipe.engine.match.LocalSearchMatch;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;
import hipe.engine.message.production.MatchAdded;
import hipe.engine.message.production.MatchDeleted;
import hipe.engine.util.HiPEMultiUtil;

import hipe.network.LocalSearchNode;

import hipe.generic.match.GenericJunctionMatch;
import hipe.generic.actor.junction.GenericJunctionActor;
import hipe.generic.actor.local.GenericLocalSearchActor;
import hipe.generic.actor.local.search.*;
import hipe.generic.actor.local.search.misc.*;

import org.eclipse.emf.ecore.EObject;

public class Oa2Sa_transition_actors__TRG_39_localSearch extends GenericLocalSearchActor{
	ConstraintChecker constraint_check;
	ConstraintChecker constraint_checker;
	ConstraintChecker constraint_checker_0;
	EdgeExplorer edge_explorer;
	EdgeExplorer edge_explorer_3;
	EdgeExplorer edge_explorer_4;
	CachedEdgeExplorer edge_explorer_5;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration edge_explorer_3_0_orchestration;
	SearchOrchestration edge_explorer_3_1_orchestration;
	SearchOrchestration edge_explorer_4_0_orchestration;
	SearchOrchestration edge_explorer_4_1_orchestration;
	SearchOrchestration edge_explorer_5_0_orchestration;
	
	
	@Override
	protected void initializeSearchComponents() {
		constraint_check = new ConstraintChecker(this, this::constraint_check_method);
		name2explorer.put("constraint_check", constraint_check);
		constraint_checker = new ConstraintChecker(this, this::constraint_checker_method);
		name2explorer.put("constraint_checker", constraint_checker);
		constraint_checker_0 = new ConstraintChecker(this, this::constraint_checker_0_method);
		name2explorer.put("constraint_checker_0", constraint_checker_0);
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.multi_lookup = (o) -> ((org.polarsys.capella.core.data.ctx.SystemComponentPkg) o).getOwnedSystemComponents();
						edge_explorer_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) return edge_explorer_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer = new EdgeExplorer(this, 0, 2, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.multi_lookup = (o) -> ((org.polarsys.capella.core.data.cs.ComponentPkg) o).getOwnedParts();
						edge_explorer_3_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) return edge_explorer_3_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_3 = new EdgeExplorer(this, 0, 3, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> ((org.polarsys.capella.core.data.ctx.SystemAnalysis) o).getOwnedSystemComponentPkg();
						edge_explorer_4_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof org.polarsys.capella.core.data.ctx.SystemAnalysis) return o.equals(edge_explorer_4_methods.unique_lookup.apply(result)) ? result : null; else return null;};
						edge_explorer_4 = new EdgeExplorer(this, 1, 0, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.unique_lookup = (o) -> {EObject result = ((modellingcore.AbstractTypedElement) o).getAbstractType(); return (result instanceof org.polarsys.capella.core.data.ctx.SystemComponent ? result : null);};
						edge_explorer_5 = new CachedEdgeExplorer(this, 3, 2, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
	}
	
	@Override
	protected void initializeOrchestration() {
		edge_explorer_0_orchestration = initializeOrchestration(node.getOrchestrations().get(0).getPlan());
		edge_explorer_1_orchestration = initializeOrchestration(node.getOrchestrations().get(1).getPlan());
		edge_explorer_2_orchestration = initializeOrchestration(node.getOrchestrations().get(2).getPlan());
		edge_explorer_3_0_orchestration = initializeOrchestration(node.getOrchestrations().get(3).getPlan());
		edge_explorer_3_1_orchestration = initializeOrchestration(node.getOrchestrations().get(4).getPlan());
		edge_explorer_4_0_orchestration = initializeOrchestration(node.getOrchestrations().get(5).getPlan());
		edge_explorer_4_1_orchestration = initializeOrchestration(node.getOrchestrations().get(6).getPlan());
		edge_explorer_5_0_orchestration = initializeOrchestration(node.getOrchestrations().get(7).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("Oa2Sa_transition_actors__BWD_44_localSearch"), this::returnTrue  , false ));
		ports.add(new PortJunction(node.getPorts().getPort().get(1), getSelf(), name2actor.get("Oa2Sa_transition_actors__TRG_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "SystemComponentPkg_object_SP2": 
				{
					
					// trg_componenet_pkg
					HMatch match_0 = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_1_orchestration, match_0);
				}
				break;
			case "SystemAnalysis_object_SP1": 
				{
					if(!lazy_initialization) {
						
						// trg_sa_arch
						HMatch match_1 = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
						match_1.getNodes()[1] = objs[0];
						start(edge_explorer_4_1_orchestration, match_1);
					}
				}
				break;
			case "SystemComponent_object_SP1": 
				{
					if(!lazy_initialization) {
						
						// trg_sys_component
						HMatch match_2 = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
						match_2.getNodes()[2] = objs[0];
						start(edge_explorer_2_orchestration, match_2);
					}
				}
				break;
			case "Part_object_SP3": 
				{
					edge_explorer_5.registerSourceObject(objs[0]);
					
					// trg_sys_part
					HMatch match_3 = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
					match_3.getNodes()[3] = objs[0];
					start(edge_explorer_3_1_orchestration, match_3);
				}
				break;
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}

	@Override
	protected void removed(MatchDeleted<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		switch(match.creator) {
			case "SystemComponentPkg_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				break;
			case "SystemAnalysis_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 1);
				break;
			case "SystemComponent_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 2);
				break;
			case "Part_object_SP3": 
				removeMatchesUsedBy(match.getNodes()[0], 3);
				break;
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}
	
	@Override
	protected void addReference(ReferenceAdded msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "org.polarsys.capella.core.data.ctx.SystemComponentPkg_ownedSystemComponents_SystemComponent": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part": 
			if(!lazy_initialization) {
				if(msg.source instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) {
				{
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.source instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) {
				{
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "modellingcore.AbstractTypedElement_abstractType_AbstractType": 
			if(!lazy_initialization) {
				if(msg.source instanceof org.polarsys.capella.core.data.cs.Part) {
				if(msg.target instanceof org.polarsys.capella.core.data.ctx.SystemComponent) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
					Object[] objs = match.getNodes();
					objs[3] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
			}
			break;
		}
		
		msg.initialMessage.decrement();
	}

	@Override
	protected void removeReference(ReferenceDeleted msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "org.polarsys.capella.core.data.ctx.SystemComponentPkg_ownedSystemComponents_SystemComponent": 
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_0.add(m);
					}
					if(!toBeRemoved_0.isEmpty()) {
						sendDeletedMatches(toBeRemoved_0);
					}
				}
				Collection<HMatch> matches_1 = obj2matches.get(msg.source);
				if(matches_1 != null && !matches_1.isEmpty()) {
					Collection<HMatch> toBeRemoved_1 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_1) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_1.add(m);
					}
					if(!toBeRemoved_1.isEmpty()) {
						sendDeletedMatches(toBeRemoved_1);
					}
				}
				Collection<HMatch> matches_2 = obj2matches.get(msg.source);
				if(matches_2 != null && !matches_2.isEmpty()) {
					Collection<HMatch> toBeRemoved_2 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_2) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				break;
		case "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part": 
				Collection<HMatch> matches_3 = obj2matches.get(msg.source);
				if(matches_3 != null && !matches_3.isEmpty()) {
					Collection<HMatch> toBeRemoved_3 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_3) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_3.add(m);
					}
					if(!toBeRemoved_3.isEmpty()) {
						sendDeletedMatches(toBeRemoved_3);
					}
				}
				Collection<HMatch> matches_4 = obj2matches.get(msg.source);
				if(matches_4 != null && !matches_4.isEmpty()) {
					Collection<HMatch> toBeRemoved_4 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_4) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_4.add(m);
					}
					if(!toBeRemoved_4.isEmpty()) {
						sendDeletedMatches(toBeRemoved_4);
					}
				}
				break;
		case "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg": 
				Collection<HMatch> matches_5 = obj2matches.get(msg.source);
				if(matches_5 != null && !matches_5.isEmpty()) {
					Collection<HMatch> toBeRemoved_5 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_5) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_5.add(m);
					}
					if(!toBeRemoved_5.isEmpty()) {
						sendDeletedMatches(toBeRemoved_5);
					}
				}
				Collection<HMatch> matches_6 = obj2matches.get(msg.source);
				if(matches_6 != null && !matches_6.isEmpty()) {
					Collection<HMatch> toBeRemoved_6 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_6) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_6.add(m);
					}
					if(!toBeRemoved_6.isEmpty()) {
						sendDeletedMatches(toBeRemoved_6);
					}
				}
				break;
		case "modellingcore.AbstractTypedElement_abstractType_AbstractType": 
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_7 = obj2matches.get(msg.source);
				if(matches_7 != null && !matches_7.isEmpty()) {
					Collection<HMatch> toBeRemoved_7 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_7) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_7.add(m);
					}
					if(!toBeRemoved_7.isEmpty()) {
						sendDeletedMatches(toBeRemoved_7);
					}
				}
				break;
		}
		
		msg.initialMessage.decrement();
	}
	
	
	@Override
	protected void registerMatch(HMatch match) {
		allMatches.add(match);
		
		Object[] objs = match.getNodes();
		
		// register trg_componenet_pkg
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 == null) {
			matches_0 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[0], matches_0);
		}
		matches_0.add(match);
		
		// register trg_sa_arch
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 == null) {
			matches_1 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[1], matches_1);
		}
		matches_1.add(match);
		
		// register trg_sys_component
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register trg_sys_part
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister trg_componenet_pkg
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister trg_sa_arch
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		
		// deregister trg_sys_component
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister trg_sys_part
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
	}
	
	@Override
	protected void changeAttribute(AttributeChanged message) {
		initialMessage = message.initialMessage;

		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		Object obj = message.node;
		if(obj instanceof org.polarsys.capella.core.data.cs.Part) {
			HMatch match_3 = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
			match_3.getNodes()[3] = obj;
			Collection<HMatch> formerMatches_3 = obj2matches.get(obj);
			if(formerMatches_3 != null) {
				
				formerMatches_3 = formerMatches_3.stream().filter(m -> !constraint_checker_0.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_3);
			}
			start(edge_explorer_3_1_orchestration, match_3);
		}
		if(obj instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) {
			HMatch match_0 = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
			match_0.getNodes()[0] = obj;
			Collection<HMatch> formerMatches_0 = obj2matches.get(obj);
			if(formerMatches_0 != null) {
				
				formerMatches_0 = formerMatches_0.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_0);
			}
			start(edge_explorer_1_orchestration, match_0);
		}
		if(obj instanceof org.polarsys.capella.core.data.ctx.SystemComponent) {
			HMatch match_2 = new LocalSearchMatch("Oa2Sa_transition_actors__TRG_39_localSearch", 4);
			match_2.getNodes()[2] = obj;
			Collection<HMatch> formerMatches_2 = obj2matches.get(obj);
			if(formerMatches_2 != null) {
				
				formerMatches_2 = formerMatches_2.stream().filter(m -> !constraint_check.check(m) || !constraint_checker_0.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_2);
			}
			start(edge_explorer_2_orchestration, match_2);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean constraint_check_method(HMatch match) {
		org.polarsys.capella.core.data.ctx.SystemComponent trg_sys_component = (org.polarsys.capella.core.data.ctx.SystemComponent) match.getNodes()[2];
		boolean predicate = trg_sys_component.isActor()==true;
		return predicate;
	}
	
	public boolean constraint_checker_method(HMatch match) {
		org.polarsys.capella.core.data.ctx.SystemComponentPkg trg_componenet_pkg = (org.polarsys.capella.core.data.ctx.SystemComponentPkg) match.getNodes()[0];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_0 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_0.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, trg_componenet_pkg.getName(), "java.lang.String"));
		csp_0.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "Structure", "java.lang.String"));
		csp_0.solve();
		
		boolean predicate = csp_0.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_0_method(HMatch match) {
		org.polarsys.capella.core.data.ctx.SystemComponent trg_sys_component = (org.polarsys.capella.core.data.ctx.SystemComponent) match.getNodes()[2];
		org.polarsys.capella.core.data.cs.Part trg_sys_part = (org.polarsys.capella.core.data.cs.Part) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_1 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_1.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, trg_sys_component.getName(), "java.lang.String"));
		csp_1.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, trg_sys_part.getName(), "java.lang.String"));
		csp_1.solve();
		
		boolean predicate = csp_1.isSatisfied();
		return predicate;
	}
	
	
}

