package org.emoflon.ibex.tgg.operational.csp.constraints.custom.oa2ctx;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;
import java.util.UUID;

public class UserDefined_setID extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint setID(v0)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 1)
			throw new RuntimeException("The CSP -SETID- needs exactly 1 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		String bindingStates = getBindingStates(v0);

	  	switch(bindingStates) {
	  		case "F":
  				v0.bindToValue(createId());
  				setSatisfied(true);
  				break;
	  		case "B":
	  			setSatisfied(true);
	  			return;
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
	  		 	}
	  	}

	public static String createId() {
	    UUID uuid = UUID.randomUUID();
	    return uuid.toString();
	  }
}

