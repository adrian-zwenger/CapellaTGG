package junittests.SaGeneratorTestcases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;

import generator.SaGenerator;
import helper.SaHelper;

public class SaGeneratorComponentHierarchy {

	@Test
	public void createComponentModelTree_component_is_root() {
		SaGenerator gen = new SaGenerator();
		SystemComponent root = SaHelper.createSystemComponent();
		
		/*
		 * Create a tree with a depth of two and two elements per type per branch
		 */
		gen.createModelTree(root, 2, 2);
		
		// root is on level 2 --> two elements per type
		assertEquals(2, root.getOwnedSystemComponents().size());
		assertEquals(2, root.getOwnedSystemComponentPkgs().size());
		
		for(SystemComponent c : root.getOwnedSystemComponents()) {
			// SystemComponent c is on level 1 --> 2 elements per type
			assertEquals(2, c.getOwnedSystemComponents().size());
			assertEquals(2, c.getOwnedSystemComponentPkgs().size());
			
			for(SystemComponent d: c.getOwnedSystemComponents()) {
				// SystemComponent d is on level 0 --> 0 elements per type
				assertEquals(0, d.getOwnedSystemComponents().size());
				assertEquals(0, d.getOwnedSystemComponentPkgs().size());
			}
			
			for(SystemComponentPkg e: c.getOwnedSystemComponentPkgs()) {
				assertEquals(0, e.getOwnedSystemComponents().size());
				assertEquals(0, e.getOwnedSystemComponentPkgs().size());
			}
		}
		
		for(SystemComponentPkg c : root.getOwnedSystemComponentPkgs()) {
			assertEquals(2, c.getOwnedSystemComponents().size());
			assertEquals(2, c.getOwnedSystemComponentPkgs().size());
			
			for(SystemComponent d: c.getOwnedSystemComponents()) {
				assertEquals(0, d.getOwnedSystemComponents().size());
				assertEquals(0, d.getOwnedSystemComponentPkgs().size());
			}
			
			for(SystemComponentPkg e: c.getOwnedSystemComponentPkgs()) {
				assertEquals(0, e.getOwnedSystemComponents().size());
				assertEquals(0, e.getOwnedSystemComponentPkgs().size());
			}
		}
	}

	@Test
	public void createComponentModelTree_component_pkg_is_root() {
		SaGenerator gen = new SaGenerator();
		SystemComponentPkg root = SaHelper.createSystemComponentPkg();
		
		/*
		 * Create a tree with a depth of two and two elements per type per branch
		 */
		gen.createModelTree(root, 2, 2);
		
		// root is on level 2 --> two elements per type
		assertEquals(2, root.getOwnedSystemComponents().size());
		assertEquals(2, root.getOwnedSystemComponentPkgs().size());
		
		for(SystemComponent c : root.getOwnedSystemComponents()) {
			// SystemComponent c is on level 1 --> 2 elements per type
			assertEquals(2, c.getOwnedSystemComponents().size());
			assertEquals(2, c.getOwnedSystemComponentPkgs().size());
			
			for(SystemComponent d: c.getOwnedSystemComponents()) {
				// SystemComponent d is on level 0 --> 0 elements per type
				assertEquals(0, d.getOwnedSystemComponents().size());
				assertEquals(0, d.getOwnedSystemComponentPkgs().size());
			}
			
			for(SystemComponentPkg e: c.getOwnedSystemComponentPkgs()) {
				assertEquals(0, e.getOwnedSystemComponents().size());
				assertEquals(0, e.getOwnedSystemComponentPkgs().size());
			}
		}
		
		for(SystemComponentPkg c : root.getOwnedSystemComponentPkgs()) {
			assertEquals(2, c.getOwnedSystemComponents().size());
			assertEquals(2, c.getOwnedSystemComponentPkgs().size());
			
			for(SystemComponent d: c.getOwnedSystemComponents()) {
				assertEquals(0, d.getOwnedSystemComponents().size());
				assertEquals(0, d.getOwnedSystemComponentPkgs().size());
			}
			
			for(SystemComponentPkg e: c.getOwnedSystemComponentPkgs()) {
				assertEquals(0, e.getOwnedSystemComponents().size());
				assertEquals(0, e.getOwnedSystemComponentPkgs().size());
			}
		}
	}
}
