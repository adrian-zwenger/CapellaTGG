package org.emoflon.ibex.tgg.run.ctx2la;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.emoflon.ibex.tgg.operational.matches.ITGGMatch;
import org.emoflon.ibex.tgg.operational.matches.ImmutableMatchContainer;
import org.emoflon.ibex.tgg.operational.updatepolicy.RandomMatchUpdatePolicy;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.AbstractFunctionalBlock;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;

public class CustomUpdatePolicy extends RandomMatchUpdatePolicy{
	
	private HashSet<ITGGMatch> matchBlackList = new HashSet<ITGGMatch>();
	
	public CustomUpdatePolicy(int cacheSize) {
		super(cacheSize);
		// TODO Auto-generated constructor stub
	}

	public CustomUpdatePolicy() {
		super(50);
	}
	
	@Override
	public ITGGMatch chooseOneMatch(ImmutableMatchContainer matchContainer) {
		ITGGMatch defaultMatch = defaultAction(matchContainer);
		boolean useMatch = true;

		if(!matchBlackList.contains(defaultMatch)) {
			// check if macht should be blacklisted
			switch(defaultMatch.getRuleName()) {
				case "TransitionFunctionAllocation":
					useMatch = executeTransitionFunctionAllocation(defaultMatch);
				break;
			}
			if(useMatch) return defaultMatch; // return match if it is not to be blacklisted
			else matchBlackList.add(defaultMatch); // match not to be executed -> add it to blacklist
		}
		// match is either blacklisted or not to be executed -> chose new match
		return defaultAction(matchContainer);
	}
	
	private ITGGMatch defaultAction(ImmutableMatchContainer matchContainer) {
		ArrayList<ITGGMatch> cache = new ArrayList<>();
		cache.addAll(matchContainer.getMatches());
		int index = (int) (cache.size() * Math.random());
		return cache.get(index);
		// return super.chooseOneMatch(matchContainer);
	}
	
	private boolean executeTransitionFunctionAllocation(ITGGMatch match) {
		ArrayList<Object> nodes = new ArrayList<>(match.getObjects());
		ArrayList<String> markers = new ArrayList<>(match.getParameterNames());
		
		int ctxIndex = markers.indexOf("ctxLeafFunction");
		int laIndex = markers.indexOf("laLeafFunction");

		if(ctxIndex<0 | laIndex<0) throw new UnsupportedOperationException();
		
		
//		AbstractFunction ctxFunction = (AbstractFunction) nodes.get(ctxIndex);
		AbstractFunction ctxFunction = (AbstractFunction) match.get("ctxLeafFunction");
//		AbstractFunction laFunction = (AbstractFunction) nodes.get(laIndex);
		AbstractFunction laFunction = (AbstractFunction) match.get("laLeafFunction");

//		boolean ctxFuncIsValidTarget = isLeafFunction(ctxFunction)
		return isLeafFunction(ctxFunction) && isLeafFunction(laFunction);
	}
	
//	private static boolean isLeafFunctionAlreadyAllocatedToComponent(AbstractFunctionalBlock component, AbstractFunction function) {
//		Collection<AbstractFunction> allocatedFunctions = new HashSet<>();
//		component.getOwnedFunctionalAllocation().stream().forEach(allocation -> allocatedFunctions.add((AbstractFunction) allocation.getTargetElement()));
//		return allocatedFunctions.contains(function);
//	}
	
	/**
	 * This method checks if the passed function is to be considered a leaf function
	 * @param function
	 * @return boolean
	 */
	private static boolean isLeafFunction(AbstractFunction function) {
		return function.getOwnedFunctions().isEmpty();
	}
}
