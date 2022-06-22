package junittests.SaHelperTestcases;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;
import org.polarsys.capella.core.data.capellacore.Generalization;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.ctx.CapabilityInvolvement;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityExtend;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityGeneralization;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityInclude;

import helper.SaHelper;

public class SaHelperFunctionModelHelpers {

	/**
	 * Allocating Functions to Components
	 */
	@Test
	public void allocateFunctionToComponent() {
		SystemComponent comp = SaHelper.createSystemComponent();
		SystemFunction func = SaHelper.createSystemFunction();
		ComponentFunctionalAllocation alloc = SaHelper.allocateFunctionToComponent(comp, func);
		
		assertEquals(comp, (SystemComponent) alloc.getSourceElement());
		assertEquals(func, (SystemFunction) alloc.getTargetElement());
		
		assertEquals(comp, (SystemComponent) alloc.eContainer());
	}
}