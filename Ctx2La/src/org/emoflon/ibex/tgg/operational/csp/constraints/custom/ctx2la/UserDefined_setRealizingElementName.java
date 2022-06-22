package org.emoflon.ibex.tgg.operational.csp.constraints.custom.ctx2la;

import java.util.HashMap;
import java.util.HashSet;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;

public class UserDefined_setRealizingElementName extends RuntimeTGGAttributeConstraint
{

	public static HashMap<String,Integer> name2id = new HashMap<>();
	
   /**
    * Constraint setRealizingElementName(v0, v1)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 2)
			throw new RuntimeException("The CSP -SETREALIZINGELEMENTNAME- needs exactly 2 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		RuntimeTGGAttributeConstraintVariable v1 = variables.get(1);
		String bindingStates = getBindingStates(v0, v1);

		int id;

	  	switch(bindingStates) {
	  		case "BB": setSatisfied(true); break;
	  		case "BF":
	  			id = getIdForName((String) v0.getValue());
	  			v1.bindToValue((String)v0.getValue() + " Realization " + id);
	  			setSatisfied(true);
	  			break;
	  		case "FF": 
	  			v0.bindToValue(generateValue(v0.getType()));
	  			id = getIdForName((String) v0.getValue());
	  			v1.bindToValue((String)v0.getValue() + " Realization " + id);
	  			setSatisfied(true);
	  			break;
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
	  		 	}
	  	}
	
	public static int getIdForName(String name) {
		int id = 1;
		if(name2id.containsKey(name)) id = name2id.get(name) + 1;
		name2id.put(name, id);
		return id;
	}
}

