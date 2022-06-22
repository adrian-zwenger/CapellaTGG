package junittests.SaHelperTestcases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.ctx.CapabilityInvolvement;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityExtend;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityGeneralization;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityInclude;

import helper.SaHelper;

public class SaHelperCapabilityModelHelpers {

	/**
	 * involving components with capabilities
	 */
	@Test
	public void setCapabilityInvolvement() {
		Capability cap = SaHelper.createCapability();
		SystemComponent comp = SaHelper.createSystemComponent();
		CapabilityInvolvement inv = SaHelper.setCapabilityInvolvement(cap, comp);
		
		assertNotNull(inv.getInvolved());
		assertEquals(comp, (SystemComponent) inv.getInvolved());
		assertEquals(cap, (Capability) inv.eContainer());
	} 

	/**
	 * extending a Capability with a Capability
	 */
	@Test
	public void setCapabilityGeneralizationRelationship() {
		Capability super_cap = SaHelper.createCapability();
		Capability sub_cap = SaHelper.createCapability();
		AbstractCapabilityGeneralization gen =
				SaHelper.setCapabilityGeneralizationRelationship(super_cap, sub_cap);

		assertEquals(sub_cap, (Capability) gen.eContainer());
		assertEquals(super_cap, (Capability) gen.getSuper());
	}
	
	/**
	 * extending a Capability with a Capability
	 */
	@Test
	public void extendCapability() {
		Capability a = SaHelper.createCapability();
		Capability b = SaHelper.createCapability();
		AbstractCapabilityExtend ext = SaHelper.extendCapability(a, b);
		
		assertEquals(a, (Capability) ext.eContainer());
		assertEquals(b, (Capability) ext.getExtended());
	}
	
	/**
	 * Including a Capability
	 */
	@Test
	public void includeCapability() {
		Capability a = SaHelper.createCapability();
		Capability b = SaHelper.createCapability();
		AbstractCapabilityInclude ext = SaHelper.includeCapability(a, b);
		
		assertEquals(a, (Capability) ext.eContainer());
		assertEquals(b, (Capability) ext.getIncluded());
	}
}
