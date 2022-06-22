package org.emoflon.ibex.tgg.operational.csp.constraints.custom.ctx2la;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;

public class UserDefined_eq_ctxPortType extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint eq_ctxPortType(v0, v1, v2)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 3)
			throw new RuntimeException("The CSP -EQ_CTXPORTTYPE- needs exactly 3 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		RuntimeTGGAttributeConstraintVariable v1 = variables.get(1);
		RuntimeTGGAttributeConstraintVariable v2 = variables.get(2);
		String bindingStates = getBindingStates(v0, v1, v2);

	  	switch(bindingStates) {
	  		case "FFB": v0.bindToValue(v2.getValue()); v1.bindToValue(v2.getValue()); setSatisfied(true); break;
	  		case "FBB": v0.bindToValue(v1.getValue()); setSatisfied(true); break;
	  		case "BFB": v1.bindToValue(v0.getValue()); setSatisfied(true);
	  		case "BBB": setSatisfied(v0.getValue().equals(v1.getValue())); break;
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
	 	}
	  	return;
  	}
}

