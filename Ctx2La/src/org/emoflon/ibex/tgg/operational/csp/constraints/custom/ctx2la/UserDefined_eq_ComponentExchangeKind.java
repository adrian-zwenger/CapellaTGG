package org.emoflon.ibex.tgg.operational.csp.constraints.custom.ctx2la;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeKind;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.ComponentPortKind;
import org.polarsys.capella.core.data.fa.impl.ComponentExchangeImpl;

public class UserDefined_eq_ComponentExchangeKind extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint eq_ComponentExchangeKind(v0, v1)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 2)
			throw new RuntimeException("The CSP -EQ_COMPONENTEXCHANGEKIND- needs exactly 2 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		RuntimeTGGAttributeConstraintVariable v1 = variables.get(1);
		String bindingStates = getBindingStates(v0, v1);

		ComponentExchangeImpl a = v0.getValue() == null ? null : (ComponentExchangeImpl) v0.getValue();
		ComponentExchangeImpl b = v1.getValue() == null ? null : (ComponentExchangeImpl) v1.getValue();
		
		if (a == null && b == null) {
			setSatisfied(false);
			return;
		}
		
	  	switch(bindingStates) {
	  		case "BB":
  				if (a.getKind() == null && b.getKind() == null) setSatisfied(true);
  				else setSatisfied(a.getKind().equals(b.getKind()));
  				return;
	  		case "BF":
	  			b.setKind(a.getKind());
	  			v1.bindToValue(b);
	  			setSatisfied(true);
	  			return;
	  		case "FB": 
	  			a.setKind(b.getKind());
	  			setSatisfied(true);
	  			v0.bindToValue(a);
	  			return;
	  		case "FF":
	  			Object obj = a.getSourcePort();
	  			ComponentPort aSrc = obj == null ? null : (ComponentPort) obj;
	  			
	  			obj = a.getTargetPort();
	  			ComponentPort aTrg = obj == null ? null : (ComponentPort) obj;
	  			
	  			
	  			obj = b.getSourcePort();
	  			ComponentPort bSrc = obj == null ? null : (ComponentPort) obj;
	  			
	  			obj = b.getTargetPort();
	  			ComponentPort bTrg = obj == null ? null : (ComponentPort) obj;
	  			
	  			ComponentExchangeKind aType = ComponentExchangeKind.UNSET;
	  			
	  			if(aSrc != null && aTrg != null) {
	  				if(aSrc.getKind() == ComponentPortKind.STANDARD || aTrg.getKind() == ComponentPortKind.STANDARD)
	  					aType = ComponentExchangeKind.ASSEMBLY;
	  				else
	  					aType = ComponentExchangeKind.FLOW;
	  			}
	  			
  				ComponentExchangeKind bType = ComponentExchangeKind.UNSET;
	  			
	  			if(bSrc != null && bTrg != null) {
	  				if(bSrc.getKind() == ComponentPortKind.STANDARD || bTrg.getKind() == ComponentPortKind.STANDARD)
	  					bType = ComponentExchangeKind.ASSEMBLY;
	  				else
	  					bType = ComponentExchangeKind.FLOW;
	  			}
	  			
	  			if (!aType.equals(bType))
	  				throw new UnsupportedOperationException("The ComponentPorts of passed ComponentExchanges are not of same kind. Exchange equality does not make sense.");

	  			a.setKind(aType);
	  			v0.bindToValue(a);
	  			b.setKind(aType);
	  			v1.bindToValue(b);
	  			
	  			setSatisfied(true);
	  			return;
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
	  		 	}
	  	}
}

