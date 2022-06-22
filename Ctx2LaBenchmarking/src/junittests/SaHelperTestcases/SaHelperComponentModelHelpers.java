package junittests.SaHelperTestcases;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;
import org.polarsys.capella.core.data.capellacore.Feature;
import org.polarsys.capella.core.data.capellacore.Generalization;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.cs.PhysicalPort;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeKind;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.ComponentPortKind;
import org.polarsys.capella.core.data.fa.OrientationPortKind;

import helper.SaHelper;

public class SaHelperComponentModelHelpers {

	/**
	 * creating a generalization relationship in an SA-systemmodel
	 */
	@Test
	public void setComponentGeneralizationRelationship() {
		SystemComponent super_comp = SaHelper.createSystemComponent();
		SystemComponent sub_comp = SaHelper.createSystemComponent();
		Generalization relation = 
				SaHelper.setComponentGeneralizationRelationship(super_comp, sub_comp);

		assertEquals(super_comp, (SystemComponent) relation.getSuper()); // check super-type
		assertEquals(sub_comp, (SystemComponent) relation.getSub()); // check sub-type
		assertEquals(relation, sub_comp.getOwnedGeneralizations().get(0)); // check model location
	}

	/**
	 * creating ComponentExchanges originating a component and flowing to the same component
	 */
	@Test
	public void createComponentExchange_for_single_component() {
		SystemComponentPkg root = SaHelper.createSystemComponentPkg();
		SystemComponent comp = SaHelper.createSystemComponent();

		ComponentExchange c_ex = SaHelper.createComponentExchange(root, comp, comp);
		assertEquals((SystemComponent) c_ex.getSource().eContainer(), comp);
		assertEquals((SystemComponent) c_ex.getTarget().eContainer(), comp);
		assertEquals(c_ex.getKind(), ComponentExchangeKind.ASSEMBLY);

		assertEquals(comp.getOwnedFeatures().size(), 2);
		for(Feature f : comp.getOwnedFeatures()) {
			ComponentPort p = (ComponentPort) f;
			assertEquals(p.getKind(), ComponentPortKind.STANDARD);
			assertEquals(p.getOrientation(), OrientationPortKind.UNSET);
			assertEquals(c_ex.getName() + " Port", p.getName());
		}
	}
	
	/**
	 * creating ComponentExchanges originating a component and flowing to the same component
	 */
	@Test
	public void createComponentExchange_for_a_component_pair() {
		SystemComponentPkg root = SaHelper.createSystemComponentPkg();
		SystemComponent src = SaHelper.createSystemComponent();
		SystemComponent trg = SaHelper.createSystemComponent();

		ComponentExchange c_ex = SaHelper.createComponentExchange(root, src, trg);
		assertEquals((SystemComponent) c_ex.getSource().eContainer(), src);
		assertEquals((SystemComponent) c_ex.getTarget().eContainer(), trg);
		assertEquals(c_ex.getKind(), ComponentExchangeKind.ASSEMBLY);
		
		assertEquals(src.getOwnedFeatures().size(), 1);
		ComponentPort p = (ComponentPort) src.getOwnedFeatures().get(0);
		assertEquals(p.getKind(), ComponentPortKind.STANDARD);
		assertEquals(p.getOrientation(), OrientationPortKind.UNSET);
		assertEquals(c_ex.getName() + " Port", p.getName());

		assertEquals(trg.getOwnedFeatures().size(), 1);
		p = (ComponentPort) trg.getOwnedFeatures().get(0);
		assertEquals(p.getKind(), ComponentPortKind.STANDARD);
		assertEquals(p.getOrientation(), OrientationPortKind.UNSET);
		assertEquals(c_ex.getName() + " Port", p.getName());
	}
	
	/**
	 * creating a PhyscialLink to and from the same component
	 */
	@Test
	public void createPhysicalLink_for_single_component() {
		SystemComponentPkg root = SaHelper.createSystemComponentPkg();
		SystemComponent comp = SaHelper.createSystemComponent();
		PhysicalLink p_link = SaHelper.createPhysicalLink(root, comp, comp);
		
		assertEquals(root.getOwnedPhysicalLinks().size(), 1);
		assertEquals(root.getOwnedPhysicalLinks().get(0), p_link);
		
		assertEquals(p_link.getLinkEnds().size(), 2);
		assertEquals(p_link.getLinkEnds().get(0).eContainer(), comp);
		assertEquals(p_link.getLinkEnds().get(1).eContainer(), comp);
		
		assertEquals(
				p_link.getName() + " Port",
				((PhysicalPort) p_link.getLinkEnds().get(0)).getName()
				);
		assertEquals(
				p_link.getName() + " Port",
				((PhysicalPort) p_link.getLinkEnds().get(1)).getName()
				);
	}
	
	/**
	 * creating a PhyscialLink to and from the same component
	 */
	@Test
	public void createPhysicalLink_for_a_component_pair() {
		SystemComponentPkg root = SaHelper.createSystemComponentPkg();
		SystemComponent src = SaHelper.createSystemComponent();
		SystemComponent trg = SaHelper.createSystemComponent();
		PhysicalLink p_link = SaHelper.createPhysicalLink(root, src, trg);
		
		assertEquals(root.getOwnedPhysicalLinks().size(), 1);
		assertEquals(root.getOwnedPhysicalLinks().get(0), p_link);
		
		assertEquals(p_link.getLinkEnds().size(), 2);

		assertNotEquals(
				p_link.getLinkEnds().get(0).eContainer(),
				p_link.getLinkEnds().get(1).eContainer()
			);
		boolean src_container =
				p_link.getLinkEnds().get(0).eContainer().equals(src) ||
				p_link.getLinkEnds().get(1).eContainer().equals(src);
		boolean trg_container =
				p_link.getLinkEnds().get(0).eContainer().equals(trg) ||
				p_link.getLinkEnds().get(1).eContainer().equals(trg);
		assertTrue(src_container && trg_container);

		assertEquals(
				p_link.getName() + " Port",
				((PhysicalPort) p_link.getLinkEnds().get(0)).getName()
				);
		assertEquals(
				p_link.getName() + " Port",
				((PhysicalPort) p_link.getLinkEnds().get(1)).getName()
				);
	}
}
