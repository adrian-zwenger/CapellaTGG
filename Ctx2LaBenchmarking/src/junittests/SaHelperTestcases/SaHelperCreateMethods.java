package junittests.SaHelperTestcases;

import static org.junit.Assert.*;

import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.polarsys.capella.core.data.capellacommon.AbstractCapabilityPkg;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.ctx.CapabilityPkg;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.ctx.SystemFunctionPkg;
import org.polarsys.capella.core.data.fa.FunctionPkg;

import helper.SaHelper;

public class SaHelperCreateMethods {

	@Test
	public void create_SystemAnalysis() {
		EObject eobj = SaHelper.createSystemAnalysis();
		boolean is_sa_instance = eobj instanceof SystemAnalysis;
		assertTrue(is_sa_instance);
		if(is_sa_instance) {
			SystemAnalysis arch = (SystemAnalysis) eobj;

			assertEquals(arch.getName(), "System Analysis");

			// check ComponentHierarchy
			SystemComponentPkg comp_root = arch.getOwnedSystemComponentPkg();
			assertNotNull(comp_root);
			assertEquals(comp_root.getName(), "Structure"); // check default root name
			assertFalse(comp_root.getOwnedSystemComponents().isEmpty());
			SystemComponent system = comp_root.getOwnedSystemComponents().get(0);
			assertEquals(system.getName(), "System"); // check default system name
			assertFalse(comp_root.getOwnedParts().isEmpty());
			Part system_as_part = comp_root.getOwnedParts().get(0);
			assertEquals(system_as_part.getAbstractType(), system); // check proper type of part
			assertEquals(system_as_part.getName(), system.getName()); // check part name
			
			// check function hierarchy
			FunctionPkg f = arch.getOwnedFunctionPkg();
			assertNotNull(f);
			boolean is_sys_func_pkg = f instanceof SystemFunctionPkg; // check proper type of function root
			assertTrue(is_sys_func_pkg);
			if(is_sys_func_pkg) {
				SystemFunctionPkg func_root = (SystemFunctionPkg) f;
				assertEquals(func_root.getName(), "System Functions"); // check root name
				assertFalse(func_root.getOwnedSystemFunctions().isEmpty());
				SystemFunction func = func_root.getOwnedSystemFunctions().get(0);
				assertEquals(func.getName(), "Root System Function"); // check root func name
			}

			// check capability hierarchy
			AbstractCapabilityPkg  acpkg = arch.getOwnedAbstractCapabilityPkg();
			assertNotNull(acpkg);
			boolean is_sys_cap_pkg = acpkg instanceof CapabilityPkg;
			assertEquals(((CapabilityPkg) acpkg).getName(), "Capabilities"); // check root capabilitypkg name
		}
	}

	@Test
	public void create_SystemComponentPkg() {
		EObject pkg = SaHelper.createSystemComponentPkg();
		assertTrue(pkg instanceof SystemComponentPkg);
		assertNotNull(((SystemComponentPkg) pkg).getName());

		pkg = SaHelper.createSystemComponentPkg("Test");
		assertTrue(pkg instanceof SystemComponentPkg);
		assertEquals(((SystemComponentPkg) pkg).getName(), "Test");
	}

	@Test
	public void create_SystemComponent() {
		EObject p = SaHelper.createSystemComponent();
		assertTrue(p instanceof SystemComponent);
		assertNotNull(((SystemComponent) p).getName());
		
		p = SaHelper.createSystemComponent("Test");
		assertTrue(p instanceof SystemComponent);
		assertEquals(((SystemComponent) p).getName(), "Test");
	}

	@Test
	public void create_Part() {
		SystemComponent c = SaHelper.createSystemComponent();
		Part p = SaHelper.createPart(c);
		assertEquals(c.getName(), p.getName());
		assertEquals(c, p.getAbstractType());
	}

	@Test
	public void create_SystemFunctionPkg() {
		EObject pkg = SaHelper.createSystemFunctionPkg();
		assertTrue(pkg instanceof SystemFunctionPkg);
		assertNotNull(((SystemFunctionPkg) pkg).getName());
		
		pkg = SaHelper.createSystemFunctionPkg("Test");
		assertTrue(pkg instanceof SystemFunctionPkg);
		assertEquals(((SystemFunctionPkg) pkg).getName(), "Test");
	}

	@Test
	public void create_SystemFunction() {
		EObject p = SaHelper.createSystemFunction();
		assertTrue(p instanceof SystemFunction);
		assertNotNull(((SystemFunction) p).getName());
		
		p = SaHelper.createSystemFunction("Test");
		assertTrue(p instanceof SystemFunction);
		assertEquals(((SystemFunction) p).getName(), "Test");
	}

	@Test
	public void create_CapabilityPkg() {
		EObject pkg = SaHelper.createCapabilityPkg();
		assertTrue(pkg instanceof CapabilityPkg);
		assertNotNull(((CapabilityPkg) pkg).getName());
		
		pkg = SaHelper.createCapabilityPkg("Test");
		assertTrue(pkg instanceof CapabilityPkg);
		assertEquals(((CapabilityPkg) pkg).getName(), "Test");
	}

	@Test
	public void create_Capability() {
		EObject p = SaHelper.createCapability();
		assertTrue(p instanceof Capability);
		assertNotNull(((Capability) p).getName());
		
		p = SaHelper.createCapability("Test");
		assertTrue(p instanceof Capability);
		assertEquals(((Capability) p).getName(), "Test");
	}

}
