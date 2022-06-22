package junittests.SaHelperTestcases;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;
import org.polarsys.capella.core.data.ctx.*;
import org.polarsys.capella.core.data.fa.AbstractFunction;

import helper.SaHelper;

public class SaHelperInsertionMethods {

	//####### SystemComponents and SystemComponentPkgs
	
	/**
	 * adding SystemComponents into a SystemComponent
	 */
	@Test
	public void insertSystemComponents_into_comp() {
		SystemComponent container = SaHelper.createSystemComponent();
		HashSet<SystemComponent> comps = new HashSet<>();
		for(int i = 0; i < 30; i++) {
			comps.add(SaHelper.createSystemComponent());
		}
		SaHelper.insertSystemComponents(container, comps);
		
		assertEquals(comps, new HashSet<SystemComponent>(container.getOwnedSystemComponents()));
	}

	/**
	 * Adding SystemComponents into a SystemComponentPkg
	 */
	@Test
	public void insertSystemComponents_into_pkg() {
		SystemComponentPkg container = SaHelper.createSystemComponentPkg();
		HashSet<SystemComponent> comps = new HashSet<>();
		for(int i = 0; i < 30; i++) {
			comps.add(SaHelper.createSystemComponent());
		}
		SaHelper.insertSystemComponents(container, comps);

		assertEquals(comps, new HashSet<SystemComponent>(container.getOwnedSystemComponents()));
	}
	
	/**
	 * adding SystemComponentPkgs into a SystemComponent
	 */
	@Test
	public void insertSystemComponentPkgs_into_comp() {
		SystemComponent container = SaHelper.createSystemComponent();
		HashSet<SystemComponentPkg> comps = new HashSet<>();
		for(int i = 0; i < 30; i++) comps.add(SaHelper.createSystemComponentPkg());
		SaHelper.insertSystemComponentPkgs(container, comps);
		assertEquals(comps, new HashSet<SystemComponentPkg>(container.getOwnedSystemComponentPkgs()));
	}

	/**
	 * adding SystemComponentPkgs into a SystemComponentPkg
	 */
	@Test
	public void insertSystemComponentPkgs_into_pkg() {
		SystemComponentPkg container = SaHelper.createSystemComponentPkg();
		HashSet<SystemComponentPkg> comps = new HashSet<>();
		for(int i = 0; i < 30; i++) comps.add(SaHelper.createSystemComponentPkg());
		SaHelper.insertSystemComponentPkgs(container, comps);
		assertEquals(comps, new HashSet<SystemComponentPkg>(container.getOwnedSystemComponentPkgs()));
	}
	
	/**
	 * Creating n SystemComponents in a SystemComponent
	 */
	@Test
	public void insert_n_SystemComponents_into_comp() {
		SystemComponent container = SaHelper.createSystemComponent();
		HashSet<SystemComponent> comps = 
				(HashSet<SystemComponent>) SaHelper.insertSystemComponents(container, 30);
		assertEquals(comps.size(), 30);
		assertEquals(comps, new HashSet<SystemComponent>(container.getOwnedSystemComponents()));
	}
	
	/**
	 * Creating n SystemComponents in a SystemComponentPkg
	 */
	@Test
	public void insert_n_SystemComponents_into_pkg() {
		SystemComponentPkg container = SaHelper.createSystemComponentPkg();
		HashSet<SystemComponent> comps = 
				(HashSet<SystemComponent>) SaHelper.insertSystemComponents(container, 30);
		assertEquals(comps.size(), 30);
		assertEquals(comps, new HashSet<SystemComponent>(container.getOwnedSystemComponents()));
	}
	
	/**
	 * Creating n SystemComponentPkgs in a SystemComponent
	 */
	@Test
	public void insert_n_SystemComponentPkgs_into_comp() {
		SystemComponent container = SaHelper.createSystemComponent();
		HashSet<SystemComponentPkg> comps = 
				(HashSet<SystemComponentPkg>) SaHelper.insertSystemComponentPkgs(container, 30);
		assertEquals(comps.size(), 30);
		assertEquals(comps, new HashSet<SystemComponentPkg>(container.getOwnedSystemComponentPkgs()));
	}
	
	/**
	 * Creating n SystemComponentPkgs in a SystemComponentPkg
	 */
	@Test
	public void insert_n_SystemComponentPkgs_into_pkg() {
		SystemComponentPkg container = SaHelper.createSystemComponentPkg();
		HashSet<SystemComponentPkg> comps = 
				(HashSet<SystemComponentPkg>) SaHelper.insertSystemComponentPkgs(container, 30);
		assertEquals(comps.size(), 30);
		assertEquals(comps, new HashSet<SystemComponentPkg>(container.getOwnedSystemComponentPkgs()));
	}

	//####### SystemFunctions and SystemFunctionPkgs

	/**
	 * Adding SystemFunctions to a SystemFunction
	 */
	@Test
	public void insertSystemFunction_into_func() {
		SystemFunction container = SaHelper.createSystemFunction();
		HashSet<SystemFunction> funcs = new HashSet<>();
		HashSet<SystemFunction> contained_funcs = new HashSet<>();
		for(int i = 0; i < 30; i++) funcs.add(SaHelper.createSystemFunction());
		SaHelper.insertSystemFunctions(container, funcs);
		for(AbstractFunction f : container.getOwnedFunctions())
				contained_funcs.add((SystemFunction) f);
		assertEquals(funcs, contained_funcs);
	}
	
	/**
	 * Adding SystemFunctions to a SystemFunctionPkg
	 */
	@Test
	public void insertSystemFunction_into_pkg() {
		SystemFunctionPkg container = SaHelper.createSystemFunctionPkg();
		HashSet<SystemFunction> funcs = new HashSet<>();
		HashSet<SystemFunction> contained_funcs = new HashSet<>();
		for(int i = 0; i < 30; i++) funcs.add(SaHelper.createSystemFunction());
		SaHelper.insertSystemFunctions(container, funcs);
		contained_funcs.addAll(container.getOwnedSystemFunctions());
		assertEquals(funcs, contained_funcs);
	}
	
	/**
	 * Adding SystemFunctionPkgs to a SystemFunction
	 */
	@Test
	public void insertSystemFunctionPkg_into_func() {
		SystemFunction container = SaHelper.createSystemFunction();
		HashSet<SystemFunctionPkg> pkgs = new HashSet<>();
		for(int i = 0; i < 30; i++) pkgs.add(SaHelper.createSystemFunctionPkg());
		SaHelper.insertSystemFunctionPkgs(container, pkgs);
		assertEquals(pkgs, new HashSet<SystemFunctionPkg>(container.getOwnedSystemFunctionPkgs()));
	}
	
	/**
	 * Adding SystemFunctionPkgs to a SystemFunctionPkg
	 */
	@Test
	public void insertSystemFunctionPkg_into_pkg() {
		SystemFunctionPkg container = SaHelper.createSystemFunctionPkg();
		HashSet<SystemFunctionPkg> pkgs = new HashSet<>();
		for(int i = 0; i < 30; i++) pkgs.add(SaHelper.createSystemFunctionPkg());
		SaHelper.insertSystemFunctionPkgs(container, pkgs);
		assertEquals(pkgs, new HashSet<SystemFunctionPkg>(container.getOwnedSystemFunctionPkgs()));
	}
	
	/**
	 * Creating n SystemFunctions in a SystemFunction
	 */
	@Test
	public void insert_n_SystemFunctions_into_func() {
		SystemFunction container = SaHelper.createSystemFunction();
		HashSet<SystemFunction> funcs =
				(HashSet<SystemFunction>) SaHelper.insertSystemFunctions(container, 30);
		HashSet<SystemFunction> contained_funcs = new HashSet<>();
		for(AbstractFunction f : container.getOwnedFunctions())
			contained_funcs.add((SystemFunction) f);
		assertEquals(funcs.size(), 30);
		assertEquals(funcs, contained_funcs);
	}
	
	/**
	 * Creating n SystemFunctions in a SystemFunctionPkg
	 */
	@Test
	public void insert_n_SystemFunctions_into_pkg() {
		SystemFunctionPkg container = SaHelper.createSystemFunctionPkg();
		HashSet<SystemFunction> funcs =
				(HashSet<SystemFunction>) SaHelper.insertSystemFunctions(container, 30);
		assertEquals(funcs.size(), 30);
		assertEquals(funcs, new HashSet<SystemFunction>(container.getOwnedSystemFunctions()));
	}
	
	/**
	 * Creating n SystemFunctionPkgs in a SystemFunction
	 */
	@Test
	public void insert_n_SystemFunctionPkgs_into_func() {
		SystemFunction container = SaHelper.createSystemFunction();
		HashSet<SystemFunctionPkg> pkgs = 
				(HashSet<SystemFunctionPkg>) SaHelper.insertSystemFunctionPkgs(container, 30);
		assertEquals(pkgs.size(), 30);
		assertEquals(pkgs, new HashSet<SystemFunctionPkg>(container.getOwnedSystemFunctionPkgs()));
	}
	
	/**
	 * Creating n SystemFunctionPkgs in a SystemFunction
	 */
	@Test
	public void insert_n_SystemFunctionPkgs_into_pkg() {
		SystemFunctionPkg container = SaHelper.createSystemFunctionPkg();
		HashSet<SystemFunctionPkg> pkgs = 
				(HashSet<SystemFunctionPkg>) SaHelper.insertSystemFunctionPkgs(container, 30);
		assertEquals(pkgs.size(), 30);
		assertEquals(pkgs, new HashSet<SystemFunctionPkg>(container.getOwnedSystemFunctionPkgs()));
	}

	//####### Capabilities and CapabilityPkgs
	
	/**
	 * Adding Capabilities to a CapabilityPkg
	 */
	@Test
	public void insertCapabilities_into_pkg() {
		CapabilityPkg container = SaHelper.createCapabilityPkg();
		HashSet<Capability> cap = new HashSet<>();
		for(int i=0; i < 30; i++) cap.add(SaHelper.createCapability());
		SaHelper.insertCapabilities(container, cap);
		assertEquals(cap, 
			new HashSet<Capability>(container.getOwnedCapabilities())
		);
	}
	
	/**
	 * Adding CapabilityPkgs to a CapabilityPkg
	 */
	@Test
	public void insertCapabilityPkgs_into_pkg() {
		CapabilityPkg container = SaHelper.createCapabilityPkg();
		HashSet<CapabilityPkg> cap = new HashSet<>();
		for(int i=0; i < 30; i++) cap.add(SaHelper.createCapabilityPkg());
		SaHelper.insertCapabilityPkgs(container, cap);
		assertEquals(cap, 
			new HashSet<CapabilityPkg>(container.getOwnedCapabilityPkgs())
		);
	}
	
	/**
	 * Creating and inserting n Capabilities into a CapabilityPkg
	 */
	@Test
	public void instert_n_Capabilities_into_pkg() {
		CapabilityPkg container = SaHelper.createCapabilityPkg();
		HashSet<Capability> cap = 
			new HashSet<Capability>(SaHelper.insertCapabilities(container, 30));
		assertEquals(cap.size(), 30);
		assertEquals(cap, new HashSet<Capability>(container.getOwnedCapabilities()));
	}
	
	/**
	 * Creating and inserting n CapabilityPkgs into a CapabilityPkg
	 */
	public void instert_n_CapabilityPkgs_into_pkg() {
		CapabilityPkg container = SaHelper.createCapabilityPkg();
		HashSet<CapabilityPkg> cap = 
			new HashSet<CapabilityPkg>(SaHelper.insertCapabilityPkgs(container, 30));
		assertEquals(cap.size(), 30);
		assertEquals(cap, new HashSet<CapabilityPkg>(container.getOwnedCapabilityPkgs()));
	}
}
