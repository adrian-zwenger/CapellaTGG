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

public class Oa2Sa_generation__BWD_10_localSearch extends GenericLocalSearchActor{
	ConstraintChecker constraint_check;
	ConstraintChecker constraint_check_0;
	ConstraintChecker constraint_check_1;
	ConstraintChecker constraint_check_2;
	ConstraintChecker constraint_check_3;
	ConstraintChecker constraint_check_4;
	PACExplorer pac_explorer;
	
	SearchOrchestration pac_explorer_orchestration;
	
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_0 = new HashMap<>();
	
	@Override
	protected void initializeSearchComponents() {
		constraint_check = new ConstraintChecker(this, this::constraint_check_method);
		name2explorer.put("constraint_check", constraint_check);
		constraint_check_0 = new ConstraintChecker(this, this::constraint_check_0_method);
		name2explorer.put("constraint_check_0", constraint_check_0);
		constraint_check_1 = new ConstraintChecker(this, this::constraint_check_1_method);
		name2explorer.put("constraint_check_1", constraint_check_1);
		constraint_check_2 = new ConstraintChecker(this, this::constraint_check_2_method);
		name2explorer.put("constraint_check_2", constraint_check_2);
		constraint_check_3 = new ConstraintChecker(this, this::constraint_check_3_method);
		name2explorer.put("constraint_check_3", constraint_check_3);
		constraint_check_4 = new ConstraintChecker(this, this::constraint_check_4_method);
		name2explorer.put("constraint_check_4", constraint_check_4);
		pac_explorer = new PACExplorer(this, Arrays.asList(new Integer[] {0,1,2,3}), node.getAllOverlaps().get(0));
		name2explorer.put("pac_explorer", pac_explorer);
	}
	
	@Override
	protected void initializeOrchestration() {
		pac_explorer_orchestration = initializeOrchestration(node.getOrchestrations().get(0).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("Oa2Sa_generation__BWD_production"), this::returnTrue , 0  , false ));
		ports.add(new PortJunction(node.getPorts().getPort().get(1), getSelf(), name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch"), this::returnTrue  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "Oa2Sa_generation__TRG_5_localSearch": 
				{
					if(pac_explorer.register(match)) {
						HMatch acMatch_0 = new LocalSearchMatch("Oa2Sa_generation__BWD_10_localSearch", 4);
						acMatch_0.getNodes()[0] = objs[0];
						acMatch_0.getNodes()[1] = objs[1];
						acMatch_0.getNodes()[2] = objs[2];
						acMatch_0.getNodes()[3] = objs[3];
						
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
			case "Oa2Sa_generation__TRG_5_localSearch": 
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
		}
		
		msg.initialMessage.decrement();
	}

	@Override
	protected void removeReference(ReferenceDeleted msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		}
		
		msg.initialMessage.decrement();
	}
	
	
	@Override
	protected void registerMatch(HMatch match) {
		allMatches.add(match);
		
		Object[] objs = match.getNodes();
		// register Oa2Sa_generation__TRG
		OverlapMatch oMatch_0 = new OverlapMatch(4);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		oMatch_Nodes_0[1] = objs[1];
		oMatch_Nodes_0[2] = objs[2];
		oMatch_Nodes_0[3] = objs[3];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		
		// register trg_sa_arch
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 == null) {
			matches_0 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[0], matches_0);
		}
		matches_0.add(match);
		
		// register trg_system_as_component
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 == null) {
			matches_1 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[1], matches_1);
		}
		matches_1.add(match);
		
		// register trg_system_as_part
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register trg_system_component_pkg
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
		// deregister Oa2Sa_generation__TRG
		OverlapMatch oMatch_0 = new OverlapMatch(4);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		oMatch_Nodes_0[1] = objs[1];
		oMatch_Nodes_0[2] = objs[2];
		oMatch_Nodes_0[3] = objs[3];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister trg_sa_arch
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister trg_system_as_component
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		
		// deregister trg_system_as_part
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister trg_system_component_pkg
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
		if(obj instanceof org.polarsys.capella.core.data.ctx.SystemAnalysis) {
			HMatch match_0 = new LocalSearchMatch("Oa2Sa_generation__BWD_10_localSearch", 4);
			match_0.getNodes()[0] = obj;
			Collection<HMatch> formerMatches_0 = obj2matches.get(obj);
			if(formerMatches_0 != null) {
				
				formerMatches_0 = formerMatches_0.stream().filter(m -> !constraint_check.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_0);
			}
			start(pac_explorer_orchestration, match_0);
		}
		if(obj instanceof org.polarsys.capella.core.data.cs.Part) {
			HMatch match_2 = new LocalSearchMatch("Oa2Sa_generation__BWD_10_localSearch", 4);
			match_2.getNodes()[2] = obj;
			Collection<HMatch> formerMatches_2 = obj2matches.get(obj);
			if(formerMatches_2 != null) {
				
				formerMatches_2 = formerMatches_2.stream().filter(m -> !constraint_check_3.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_2);
			}
			start(pac_explorer_orchestration, match_2);
		}
		if(obj instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) {
			HMatch match_3 = new LocalSearchMatch("Oa2Sa_generation__BWD_10_localSearch", 4);
			match_3.getNodes()[3] = obj;
			Collection<HMatch> formerMatches_3 = obj2matches.get(obj);
			if(formerMatches_3 != null) {
				
				formerMatches_3 = formerMatches_3.stream().filter(m -> !constraint_check_4.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_3);
			}
			start(pac_explorer_orchestration, match_3);
		}
		if(obj instanceof org.polarsys.capella.core.data.ctx.SystemComponent) {
			HMatch match_1 = new LocalSearchMatch("Oa2Sa_generation__BWD_10_localSearch", 4);
			match_1.getNodes()[1] = obj;
			Collection<HMatch> formerMatches_1 = obj2matches.get(obj);
			if(formerMatches_1 != null) {
				
				formerMatches_1 = formerMatches_1.stream().filter(m -> !constraint_check_0.check(m) || !constraint_check_1.check(m) || !constraint_check_2.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_1);
			}
			start(pac_explorer_orchestration, match_1);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean constraint_check_method(HMatch match) {
		org.polarsys.capella.core.data.ctx.SystemAnalysis trg_sa_arch = (org.polarsys.capella.core.data.ctx.SystemAnalysis) match.getNodes()[0];
		boolean predicate = String.valueOf(trg_sa_arch.getName()).equals("System Analysis");
		return predicate;
	}
	
	public boolean constraint_check_0_method(HMatch match) {
		org.polarsys.capella.core.data.ctx.SystemComponent trg_system_as_component = (org.polarsys.capella.core.data.ctx.SystemComponent) match.getNodes()[1];
		boolean predicate = String.valueOf(trg_system_as_component.getName()).equals("System");
		return predicate;
	}
	
	public boolean constraint_check_1_method(HMatch match) {
		org.polarsys.capella.core.data.ctx.SystemComponent trg_system_as_component = (org.polarsys.capella.core.data.ctx.SystemComponent) match.getNodes()[1];
		boolean predicate = trg_system_as_component.isActor()==false;
		return predicate;
	}
	
	public boolean constraint_check_2_method(HMatch match) {
		org.polarsys.capella.core.data.ctx.SystemComponent trg_system_as_component = (org.polarsys.capella.core.data.ctx.SystemComponent) match.getNodes()[1];
		boolean predicate = trg_system_as_component.isHuman()==false;
		return predicate;
	}
	
	public boolean constraint_check_3_method(HMatch match) {
		org.polarsys.capella.core.data.cs.Part trg_system_as_part = (org.polarsys.capella.core.data.cs.Part) match.getNodes()[2];
		boolean predicate = String.valueOf(trg_system_as_part.getName()).equals("System");
		return predicate;
	}
	
	public boolean constraint_check_4_method(HMatch match) {
		org.polarsys.capella.core.data.ctx.SystemComponentPkg trg_system_component_pkg = (org.polarsys.capella.core.data.ctx.SystemComponentPkg) match.getNodes()[3];
		boolean predicate = String.valueOf(trg_system_component_pkg.getName()).equals("Structure");
		return predicate;
	}
	
	
}

