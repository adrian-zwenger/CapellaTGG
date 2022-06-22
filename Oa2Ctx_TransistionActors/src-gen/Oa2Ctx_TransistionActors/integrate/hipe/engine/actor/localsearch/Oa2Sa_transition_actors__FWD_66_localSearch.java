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

public class Oa2Sa_transition_actors__FWD_66_localSearch extends GenericLocalSearchActor{
	ConstraintChecker constraint_checker;
	ConstraintChecker constraint_checker_0;
	ConstraintChecker constraint_checker_1;
	CachedEdgeExplorer edge_explorer;
	EdgeExplorer edge_explorer_3;
	CachedEdgeExplorer edge_explorer_4;
	PACExplorer pac_explorer;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration edge_explorer_3_0_orchestration;
	SearchOrchestration edge_explorer_3_1_orchestration;
	SearchOrchestration edge_explorer_4_0_orchestration;
	SearchOrchestration edge_explorer_4_1_orchestration;
	SearchOrchestration pac_explorer_orchestration;
	
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_0 = new HashMap<>();
	
	@Override
	protected void initializeSearchComponents() {
		constraint_checker = new ConstraintChecker(this, this::constraint_checker_method);
		name2explorer.put("constraint_checker", constraint_checker);
		constraint_checker_0 = new ConstraintChecker(this, this::constraint_checker_0_method);
		name2explorer.put("constraint_checker_0", constraint_checker_0);
		constraint_checker_1 = new ConstraintChecker(this, this::constraint_checker_1_method);
		name2explorer.put("constraint_checker_1", constraint_checker_1);
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.unique_lookup = (o) -> ((Oa2Ctx_TransistionActors.Oa2Sa) o).getTarget();
						edge_explorer = new CachedEdgeExplorer(this, 0, 4, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> ((org.polarsys.capella.core.data.ctx.SystemAnalysis) o).getOwnedSystemComponentPkg();
						edge_explorer_3_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof org.polarsys.capella.core.data.ctx.SystemAnalysis) return o.equals(edge_explorer_3_methods.unique_lookup.apply(result)) ? result : null; else return null;};
						edge_explorer_3 = new EdgeExplorer(this, 4, 3, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> ((Oa2Ctx_TransistionActors.Oa2Sa) o).getSource();
						edge_explorer_4 = new CachedEdgeExplorer(this, 0, 2, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		pac_explorer = new PACExplorer(this, Arrays.asList(new Integer[] {1,2,5,6}), node.getAllOverlaps().get(0));
		name2explorer.put("pac_explorer", pac_explorer);
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
		pac_explorer_orchestration = initializeOrchestration(node.getOrchestrations().get(7).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch"), this::returnTrue  , false ));
		ports.add(new PortJunction(node.getPorts().getPort().get(1), getSelf(), name2actor.get("Oa2Sa_transition_actors__FWD_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "Oa2Sa_object": 
				{
					edge_explorer.registerSourceObject(objs[0]);
					edge_explorer_4.registerSourceObject(objs[0]);
					
					// oa2sa
					HMatch match_0 = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_1_orchestration, match_0);
				}
				break;
			case "SystemComponentPkg_object_SP1": 
				{
					if(!lazy_initialization) {
						
						// trg_componenet_pkg
						HMatch match_3 = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
						match_3.getNodes()[3] = objs[0];
						start(edge_explorer_3_1_orchestration, match_3);
					}
				}
				break;
			case "SystemAnalysis_object_SP1": 
				{
					if(!lazy_initialization) {
						
						// trg_sa_arch
						HMatch match_4 = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
						match_4.getNodes()[4] = objs[0];
						start(edge_explorer_2_orchestration, match_4);
					}
				}
				break;
			case "Oa2Sa_transition_actors__SRC_61_localSearch": 
				{
					if(pac_explorer.register(match)) {
						HMatch acMatch_0 = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
						acMatch_0.getNodes()[1] = objs[0];
						acMatch_0.getNodes()[2] = objs[1];
						acMatch_0.getNodes()[5] = objs[2];
						acMatch_0.getNodes()[6] = objs[3];
						
						// start search
						currentDepth++;
						start(pac_explorer_orchestration, acMatch_0);
						currentDepth--;
					}
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
			case "Oa2Sa_object": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				break;
			case "SystemComponentPkg_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 3);
				break;
			case "SystemAnalysis_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 4);
				break;
			case "Oa2Sa_transition_actors__SRC_61_localSearch": 
				if(pac_explorer.deregister(match)) {
					OverlapMatch acMatch_0 = new OverlapMatch(4);
					acMatch_0.getNodes()[0] = match.getNodes()[0];
					acMatch_0.getNodes()[1] = match.getNodes()[1];
					acMatch_0.getNodes()[2] = match.getNodes()[2];
					acMatch_0.getNodes()[3] = match.getNodes()[3];
					Collection<HMatch> o2Matches_0 = overlap2matches_0.get(acMatch_0);
					if(o2Matches_0 != null) {
						if(!o2Matches_0.isEmpty()) {
							sendDeletedMatches(o2Matches_0);
							o2Matches_0.clear();
						}
					}
				}
				break;
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}
	
	@Override
	protected void addReference(ReferenceAdded msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "Oa2Ctx_TransistionActors.Oa2Sa_target_SystemAnalysis": 
			if(!lazy_initialization) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Oa2Ctx_TransistionActors.Oa2Sa_source_OperationalAnalysis": 
			if(!lazy_initialization) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
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
		case "Oa2Ctx_TransistionActors.Oa2Sa_target_SystemAnalysis": 
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_0.add(m);
					}
					if(!toBeRemoved_0.isEmpty()) {
						sendDeletedMatches(toBeRemoved_0);
					}
				}
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_1 = obj2matches.get(msg.source);
				if(matches_1 != null && !matches_1.isEmpty()) {
					Collection<HMatch> toBeRemoved_1 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_1) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_1.add(m);
					}
					if(!toBeRemoved_1.isEmpty()) {
						sendDeletedMatches(toBeRemoved_1);
					}
				}
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_2 = obj2matches.get(msg.source);
				if(matches_2 != null && !matches_2.isEmpty()) {
					Collection<HMatch> toBeRemoved_2 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_2) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				break;
		case "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg": 
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
		case "Oa2Ctx_TransistionActors.Oa2Sa_source_OperationalAnalysis": 
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_5 = obj2matches.get(msg.source);
				if(matches_5 != null && !matches_5.isEmpty()) {
					Collection<HMatch> toBeRemoved_5 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_5) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_5.add(m);
					}
					if(!toBeRemoved_5.isEmpty()) {
						sendDeletedMatches(toBeRemoved_5);
					}
				}
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_6 = obj2matches.get(msg.source);
				if(matches_6 != null && !matches_6.isEmpty()) {
					Collection<HMatch> toBeRemoved_6 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_6) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_6.add(m);
					}
					if(!toBeRemoved_6.isEmpty()) {
						sendDeletedMatches(toBeRemoved_6);
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
		// register Oa2Sa_transition_actors__SRC
		OverlapMatch oMatch_0 = new OverlapMatch(4);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[1];
		oMatch_Nodes_0[1] = objs[2];
		oMatch_Nodes_0[2] = objs[5];
		oMatch_Nodes_0[3] = objs[6];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		
		// register oa2sa
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 == null) {
			matches_0 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[0], matches_0);
		}
		matches_0.add(match);
		
		// register src_entity_pkg
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 == null) {
			matches_1 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[1], matches_1);
		}
		matches_1.add(match);
		
		// register trg_componenet_pkg
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
		// register trg_sa_arch
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 == null) {
			matches_4 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[4], matches_4);
		}
		matches_4.add(match);
		
		// register src_oa_entity
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 == null) {
			matches_5 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[5], matches_5);
		}
		matches_5.add(match);
		
		// register src_oa_part
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 == null) {
			matches_6 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[6], matches_6);
		}
		matches_6.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister Oa2Sa_transition_actors__SRC
		OverlapMatch oMatch_0 = new OverlapMatch(4);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[1];
		oMatch_Nodes_0[1] = objs[2];
		oMatch_Nodes_0[2] = objs[5];
		oMatch_Nodes_0[3] = objs[6];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister oa2sa
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister src_entity_pkg
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		
		// deregister trg_componenet_pkg
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister trg_sa_arch
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 != null) {
			matches_4.remove(match);
		}
		
		// deregister src_oa_entity
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 != null) {
			matches_5.remove(match);
		}
		
		// deregister src_oa_part
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 != null) {
			matches_6.remove(match);
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
			HMatch match_6 = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
			match_6.getNodes()[6] = obj;
			Collection<HMatch> formerMatches_6 = obj2matches.get(obj);
			if(formerMatches_6 != null) {
				
				formerMatches_6 = formerMatches_6.stream().filter(m -> !constraint_checker_0.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_6);
			}
			start(pac_explorer_orchestration, match_6);
		}
		if(obj instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) {
			HMatch match_3 = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
			match_3.getNodes()[3] = obj;
			Collection<HMatch> formerMatches_3 = obj2matches.get(obj);
			if(formerMatches_3 != null) {
				
				formerMatches_3 = formerMatches_3.stream().filter(m -> !constraint_checker_1.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_3);
			}
			start(edge_explorer_3_1_orchestration, match_3);
		}
		if(obj instanceof org.polarsys.capella.core.data.oa.EntityPkg) {
			HMatch match_1 = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
			match_1.getNodes()[1] = obj;
			Collection<HMatch> formerMatches_1 = obj2matches.get(obj);
			if(formerMatches_1 != null) {
				
				formerMatches_1 = formerMatches_1.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_1);
			}
			start(pac_explorer_orchestration, match_1);
		}
		if(obj instanceof org.polarsys.capella.core.data.oa.Entity) {
			HMatch match_5 = new LocalSearchMatch("Oa2Sa_transition_actors__FWD_66_localSearch", 7);
			match_5.getNodes()[5] = obj;
			Collection<HMatch> formerMatches_5 = obj2matches.get(obj);
			if(formerMatches_5 != null) {
				
				formerMatches_5 = formerMatches_5.stream().filter(m -> !constraint_checker_0.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_5);
			}
			start(pac_explorer_orchestration, match_5);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean constraint_checker_method(HMatch match) {
		org.polarsys.capella.core.data.oa.EntityPkg src_entity_pkg = (org.polarsys.capella.core.data.oa.EntityPkg) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_12 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_12.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, src_entity_pkg.getName(), "java.lang.String"));
		csp_12.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "Operational Entities", "java.lang.String"));
		csp_12.solve();
		
		boolean predicate = csp_12.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_0_method(HMatch match) {
		org.polarsys.capella.core.data.oa.Entity src_oa_entity = (org.polarsys.capella.core.data.oa.Entity) match.getNodes()[5];
		org.polarsys.capella.core.data.cs.Part src_oa_part = (org.polarsys.capella.core.data.cs.Part) match.getNodes()[6];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_13 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_13.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, src_oa_entity.getName(), "java.lang.String"));
		csp_13.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, src_oa_part.getName(), "java.lang.String"));
		csp_13.solve();
		
		boolean predicate = csp_13.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_1_method(HMatch match) {
		org.polarsys.capella.core.data.ctx.SystemComponentPkg trg_componenet_pkg = (org.polarsys.capella.core.data.ctx.SystemComponentPkg) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_14 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_14.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, trg_componenet_pkg.getName(), "java.lang.String"));
		csp_14.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "Structure", "java.lang.String"));
		csp_14.solve();
		
		boolean predicate = csp_14.isSatisfied();
		return predicate;
	}
	
	
}

