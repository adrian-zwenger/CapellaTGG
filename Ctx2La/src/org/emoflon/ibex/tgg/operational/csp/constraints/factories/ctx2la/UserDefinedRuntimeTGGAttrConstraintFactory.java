package org.emoflon.ibex.tgg.operational.csp.constraints.factories.ctx2la;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.operational.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;			

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.ctx2la.UserDefined_setRealizingElementName;

public class UserDefinedRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public UserDefinedRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("setRealizingElementName", () -> new UserDefined_setRealizingElementName());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
}
