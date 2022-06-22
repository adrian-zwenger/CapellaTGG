package Oa2Ctx_TransistionActors.initfwd.hipe.engine.actor.localsearch;

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

public class Oa2Sa_generation__FWD_18_localSearch extends GenericLocalSearchActor{
	ConstraintChecker constraint_check;
	ConstraintChecker constraint_check_0;
	EdgeExplorer edge_explorer;
	NACExplorer nac_checker;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration nac_checker_orchestration;
	
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_0 = new HashMap<>();
	
	@Override
	protected void initializeSearchComponents() {
		constraint_check = new ConstraintChecker(this, this::constraint_check_method);
		name2explorer.put("constraint_check", constraint_check);
		constraint_check_0 = new ConstraintChecker(this, this::constraint_check_0_method);
		name2explorer.put("constraint_check_0", constraint_check_0);
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.unique_lookup = (o) -> ((org.polarsys.capella.core.data.oa.OperationalAnalysis) o).getOwnedEntityPkg();
						edge_explorer_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof org.polarsys.capella.core.data.oa.OperationalAnalysis) return o.equals(edge_explorer_methods.unique_lookup.apply(result)) ? result : null; else return null;};
						edge_explorer = new EdgeExplorer(this, 0, 1, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		nac_checker = new NACExplorer(this, Arrays.asList(new Integer[] {0,1}), node.getAllOverlaps().get(0));
		name2explorer.put("nac_checker", nac_checker);
	}
	
	@Override
	protected void initializeOrchestration() {
		edge_explorer_0_orchestration = initializeOrchestration(node.getOrchestrations().get(0).getPlan());
		edge_explorer_1_orchestration = initializeOrchestration(node.getOrchestrations().get(1).getPlan());
		edge_explorer_2_orchestration = initializeOrchestration(node.getOrchestrations().get(2).getPlan());
		nac_checker_orchestration = initializeOrchestration(node.getOrchestrations().get(3).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("Oa2Sa_generation__FWD_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "OperationalAnalysis_object_SP0": 
				{
					
					// src_oa_arch
					HMatch match_0 = new LocalSearchMatch("Oa2Sa_generation__FWD_18_localSearch", 2);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_1_orchestration, match_0);
				}
				break;
			case "EntityPkg_object_SP0": 
				{
					if(!lazy_initialization) {
						
						// src_entity_pkg
						HMatch match_1 = new LocalSearchMatch("Oa2Sa_generation__FWD_18_localSearch", 2);
						match_1.getNodes()[1] = objs[0];
						start(edge_explorer_2_orchestration, match_1);
					}
				}
				break;
			case "Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_1_localSearch": 
				{
					if(nac_checker.register(match)) {
						OverlapMatch acMatch_0 = new OverlapMatch(2);
						Object[] acMatch_nodes_0 = acMatch_0.getNodes();
						acMatch_nodes_0[0] = objs[0];
						acMatch_nodes_0[1] = objs[1];
						
						Collection<HMatch> o2Matches_0 = overlap2matches_0.get(acMatch_0);
						if(o2Matches_0 != null && !o2Matches_0.isEmpty()) {
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
	protected void removed(MatchDeleted<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		switch(match.creator) {
			case "OperationalAnalysis_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				break;
			case "EntityPkg_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 1);
				break;
			case "Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_1_localSearch": 
				if(nac_checker.deregister(match)) {
					HMatch acMatch_0 = new LocalSearchMatch("Oa2Sa_generation__FWD_18_localSearch", 2);
					Object[] acMatch_nodes_0 = acMatch_0.getNodes();
					Object[] objs_0 = match.getNodes();
					acMatch_nodes_0[0] = objs_0[0];
					acMatch_nodes_0[1] = objs_0[1];
					start(nac_checker_orchestration, acMatch_0);
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
		case "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("Oa2Sa_generation__FWD_18_localSearch", 2);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("Oa2Sa_generation__FWD_18_localSearch", 2);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("Oa2Sa_generation__FWD_18_localSearch", 2);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
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
		case "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg": 
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[1].equals(msg.target))
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
						if(m.getNodes()[1].equals(msg.target))
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
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
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
		// register Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_0 = new OverlapMatch(2);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		oMatch_Nodes_0[1] = objs[1];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		
		// register src_oa_arch
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
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_0 = new OverlapMatch(2);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		oMatch_Nodes_0[1] = objs[1];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister src_oa_arch
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister src_entity_pkg
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
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
		if(obj instanceof org.polarsys.capella.core.data.oa.EntityPkg) {
			HMatch match_1 = new LocalSearchMatch("Oa2Sa_generation__FWD_18_localSearch", 2);
			match_1.getNodes()[1] = obj;
			Collection<HMatch> formerMatches_1 = obj2matches.get(obj);
			if(formerMatches_1 != null) {
				
				formerMatches_1 = formerMatches_1.stream().filter(m -> !constraint_check.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_1);
			}
			start(edge_explorer_2_orchestration, match_1);
		}
		if(obj instanceof org.polarsys.capella.core.data.oa.OperationalAnalysis) {
			HMatch match_0 = new LocalSearchMatch("Oa2Sa_generation__FWD_18_localSearch", 2);
			match_0.getNodes()[0] = obj;
			Collection<HMatch> formerMatches_0 = obj2matches.get(obj);
			if(formerMatches_0 != null) {
				
				formerMatches_0 = formerMatches_0.stream().filter(m -> !constraint_check_0.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_0);
			}
			start(edge_explorer_1_orchestration, match_0);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean constraint_check_method(HMatch match) {
		org.polarsys.capella.core.data.oa.EntityPkg src_entity_pkg = (org.polarsys.capella.core.data.oa.EntityPkg) match.getNodes()[1];
		boolean predicate = String.valueOf(src_entity_pkg.getName()).equals("Operational Entities");
		return predicate;
	}
	
	public boolean constraint_check_0_method(HMatch match) {
		org.polarsys.capella.core.data.oa.OperationalAnalysis src_oa_arch = (org.polarsys.capella.core.data.oa.OperationalAnalysis) match.getNodes()[0];
		boolean predicate = String.valueOf(src_oa_arch.getName()).equals("Operational Analysis");
		return predicate;
	}
	
	
}

