package helper;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import helper.LoremIpsum;
import org.polarsys.capella.core.data.capellacore.CapellacoreFactory;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.Generalization;
import org.polarsys.capella.core.data.cs.CsFactory;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.cs.PhysicalPort;
import org.polarsys.capella.core.data.ctx.*;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeKind;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.ComponentPortKind;
import org.polarsys.capella.core.data.fa.FaFactory;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.OrientationPortKind;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityExtend;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityGeneralization;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityInclude;
import org.polarsys.capella.core.data.interaction.InteractionFactory;
import org.polarsys.capella.core.data.interaction.InteractionPackage;

public class SaHelper {

	private static CtxPackage ctx_e_pack = CtxPackage.eINSTANCE;
	private static CtxFactory ctx_e_fact = (CtxFactory) ctx_e_pack.getEFactoryInstance();
	
	private static CsPackage cs_e_pack = CsPackage.eINSTANCE;
	private static CsFactory cs_e_fact = (CsFactory) cs_e_pack.getEFactoryInstance();
	
	private static CapellacorePackage cc_e_pack = CapellacorePackage.eINSTANCE;
	private static CapellacoreFactory cc_e_fact = (CapellacoreFactory) cc_e_pack.getEFactoryInstance();
	
	private static FaPackage fa_e_pack = FaPackage.eINSTANCE;
	private static FaFactory fa_e_fact = (FaFactory) fa_e_pack.getEFactoryInstance();
	
	private static InteractionPackage int_e_pack = InteractionPackage.eINSTANCE;
	private static InteractionFactory int_e_fact = (InteractionFactory) int_e_pack.getEFactoryInstance();
	
	private static String random_unique_string() {
		return LoremIpsum.getInstance().randomWord();
	}

	//########## System root

	/**
	 * Creates a deafault Capella-SA-systemmodel stump and returns it
	 * @return SystemAnalysis
	 */
	public static SystemAnalysis createSystemAnalysis() {
		SystemAnalysis arch = ctx_e_fact.createSystemAnalysis();
		arch.setName("System Analysis");
		
		SystemComponentPkg comp_pkg = createSystemComponentPkg("Structure");
		SystemComponent comp = createSystemComponent("System"); 
		Part comp_part = createPart(comp);
		comp_pkg.getOwnedSystemComponents().add(comp);
		comp_pkg.getOwnedParts().add(comp_part);
		arch.setOwnedSystemComponentPkg(comp_pkg);
		
		SystemFunctionPkg func_pkg = createSystemFunctionPkg("System Functions");
		func_pkg.getOwnedSystemFunctions().add(
				createSystemFunction("Root System Function")
				);
		arch.setOwnedFunctionPkg(func_pkg);
		
		arch.setOwnedAbstractCapabilityPkg(createCapabilityPkg("Capabilities"));
		
		return arch;
	}

	//########## SystemComponent hierarchy elements
	
	/**
	 * Returns a SystemComponentPkg with a random name
	 * @return SystemComponentPkg
	 */
	public static SystemComponentPkg createSystemComponentPkg() {
		return createSystemComponentPkg(random_unique_string());
	}
	
	/**
	 * Returns a SystemComponentPkg with given name 
	 * @param name
	 * @return SystemComponentPkg
	 */
	public static SystemComponentPkg createSystemComponentPkg(String name) {
		SystemComponentPkg pkg = ctx_e_fact.createSystemComponentPkg();
		pkg.setName(name);
		return pkg;
	}
	
	/**
	 * Returns a SystemComponent with a random name
	 * @return SystemComponent
	 */
	public static SystemComponent createSystemComponent() {
		return createSystemComponent(random_unique_string());
	}
	
	/**
	 * Returns a SystemComponent with the given name
	 * @param name
	 * @return SystemComponent
	 */
	public static SystemComponent createSystemComponent(String name) {
		SystemComponent comp = ctx_e_fact.createSystemComponent();
		comp.setName(name);
		return comp;
	}
	
	/**
	 * Returns the Part for a given SystemComponent
	 * @param comp
	 * @return Part
	 */
	public static Part createPart(SystemComponent comp) {
		Part p = cs_e_fact.createPart();
		p.setName(comp.getName());
		p.setAbstractType(comp);
		return p;
	}
	
	//########## SystemComponent hierarchy elements
	
	/**
	 * Returns a SystemFunctionPkg with a random name.
	 * @return SystemFunctionPkg
	 */
	public static SystemFunctionPkg createSystemFunctionPkg() {
		return createSystemFunctionPkg(random_unique_string());
	}
	
	/**
	 * Returns a SystemFunctionPkg with the given name
	 * @param name
	 * @return SystemFunctionPkg
	 */
	public static SystemFunctionPkg createSystemFunctionPkg(String name) {
		SystemFunctionPkg pkg = (SystemFunctionPkg) ctx_e_fact.createSystemFunctionPkg();
		pkg.setName(name);
		return pkg;
	}
	
	/**
	 * Returns a SystemFunction with a random name
	 * @return SystemFunction
	 */
	public static SystemFunction createSystemFunction() {
		return createSystemFunction(random_unique_string());
	}

	/**
	 * Returns a SystemFuntion with the given name
	 * @param name
	 * @return
	 */
	public static SystemFunction createSystemFunction(String name) {
		SystemFunction f = ctx_e_fact.createSystemFunction();
		f.setName(name);
		return f;
	}
	
	//########## SystemComponent hierarchy elements
	
	/**
	 * Returns a CapabilityPkg with a random name
	 * @return CapabilityPkg
	 */
	public static CapabilityPkg createCapabilityPkg() {
		return createCapabilityPkg(random_unique_string());
	}
	
	/**
	 * Returns a CapabilityPkg with the given name
	 * @param name
	 * @return
	 */
	public static CapabilityPkg createCapabilityPkg(String name) {
		CapabilityPkg pkg = ctx_e_fact.createCapabilityPkg();
		pkg.setName(name);
		return pkg;
	}
	
	/**
	 * Returns a Capability with a random name
	 * @return
	 */
	public static Capability createCapability() {
		return createCapability(random_unique_string());
	}
	
	/**
	 * Returns a Capability with the given name
	 * @param name
	 * @return Capability
	 */
	public static Capability createCapability(String name) {
		Capability c = ctx_e_fact.createCapability();
		c.setName(name);
		return c;
	}
	
	//################ Insertion Helpers
	//#############################################################################################
	//#############################################################################################
	//#############################################################################################
	//#############################################################################################
	
	// Component and Component Pkgs
	
	/**
	 * Inserts all given SystemComponents as sub-components of the given SystemComponent.
	 * A Collection of all inserted SystemComponents is returned.
	 * @param container
	 * @param elements
	 * @return Collection<SystemComponent>
	 */
	public static Collection<SystemComponent> insertSystemComponents(SystemComponent container, Collection<SystemComponent> elements) {
		for(SystemComponent c : elements) container.getOwnedFeatures().add(
			SaHelper.createPart(c)	
		);
		container.getOwnedSystemComponents().addAll(elements);
		return elements;
	}
	
	/**
	 * Inserts all given SystemComponents as sub-components of the given SystemComponentPkg.
	 * A Collection of all inserted SystemComponents is returned.
	 * @param container
	 * @param elements
	 * @return Collection<SystemComponent>
	 */
	public static Collection<SystemComponent> insertSystemComponents(SystemComponentPkg container, Collection<SystemComponent> elements) {
		for(SystemComponent c : elements) container.getOwnedParts().add(
				SaHelper.createPart(c)	
		);
		container.getOwnedSystemComponents().addAll(elements);
		return elements;
	}
	
	/**
	 * Inserts all given SystemComponentPkgs as sub-components of the given SystemComponent.
	 * A Collection of all inserted SystemComponentPkgs is returned.
	 * @param container
	 * @param elements
	 * @return Collection<SystemComponentPkg>
	 */
	public static Collection<SystemComponentPkg> insertSystemComponentPkgs(SystemComponent container, Collection<SystemComponentPkg> elements) {
		container.getOwnedSystemComponentPkgs().addAll(elements);
		return elements;
	}
	
	/**
	 * Inserts all given SystemComponentPkgs as sub-components of the given SystemComponentPkg.
	 * A Collection of all inserted SystemComponentPkgs is returned.
	 * @param container
	 * @param elements
	 * @return Collection<SystemComponent>
	 */
	public static Collection<SystemComponentPkg> insertSystemComponentPkgs(SystemComponentPkg container, Collection<SystemComponentPkg> elements) {
		container.getOwnedSystemComponentPkgs().addAll(elements);
		return elements;
	}

	/**
	 * Creates and inserts n SystemComponents into the container SystemComponent and returns the created components
	 * @param container
	 * @param n
	 * @return
	 */
	public static Collection<SystemComponent> insertSystemComponents(SystemComponent container, int n){
		HashSet<SystemComponent> comps = new HashSet<>();
		for(int i = 0; i < n; i++) comps.add(SaHelper.createSystemComponent());
		SaHelper.insertSystemComponents(container, comps);
		return comps;
	}
	
	/**
	 * Creates and inserts n SystemComponents into the container SystemComponentPkg and returns the created components
	 * @param container
	 * @param n
	 * @return
	 */
	public static Collection<SystemComponent> insertSystemComponents(SystemComponentPkg container, int n){
		HashSet<SystemComponent> comps = new HashSet<>();
		for(int i = 0; i < n; i++) comps.add(SaHelper.createSystemComponent());
		SaHelper.insertSystemComponents(container, comps);
		return comps;
	}
	
	/**
	 * Creates and inserts n SystemComponentPkgs into the container SystemComponent and returns the created pkgs
	 * @param container
	 * @param n
	 * @return
	 */
	public static Collection<SystemComponentPkg> insertSystemComponentPkgs(SystemComponent container, int n){
		HashSet<SystemComponentPkg> comps = new HashSet<>();
		for(int i = 0; i < n; i++) comps.add(SaHelper.createSystemComponentPkg());
		SaHelper.insertSystemComponentPkgs(container, comps);
		return comps;
	}
	
	/**
	 * Creates and inserts n SystemComponentPkgs into the container SystemComponentPkg and returns the created pkgs
	 * @param container
	 * @param n
	 * @return
	 */
	public static Collection<SystemComponentPkg> insertSystemComponentPkgs(SystemComponentPkg container, int n){
		HashSet<SystemComponentPkg> comps = new HashSet<>();
		for(int i = 0; i < n; i++) comps.add(SaHelper.createSystemComponentPkg());
		return SaHelper.insertSystemComponentPkgs(container, comps);
	}
	
	// Functions and Function-Pkgs
	
	/**
	 * Adds the given SystemFunctions to the container SystemFunction
	 * Returns the SystemFunctions
	 * @param container
	 * @param elements
	 * @return Collection<SystemFunction>
	 */
	public static Collection<SystemFunction> insertSystemFunctions(SystemFunction container, Collection<SystemFunction> elements){
		container.getOwnedFunctions().addAll(elements);
		return elements;
	}
	
	/**
	 * Adds the given SystemFunctions to the container SystemFunctionPkg
	 * Returns the SystemFunctions
	 * @param container
	 * @param elements
	 * @return Collection<SystemFunction>
	 */
	public static Collection<SystemFunction> insertSystemFunctions(SystemFunctionPkg container, Collection<SystemFunction> elements){
		container.getOwnedSystemFunctions().addAll(elements);
		return elements;
	}
	
	/**
	 * Adds the given SystemFunctionPkgs to the container SystemFunction
	 * Returns the SystemFunctionPkgs
	 * @param container
	 * @param elements
	 * @return Collection<SystemFunction>
	 */
	public static Collection<SystemFunctionPkg> insertSystemFunctionPkgs(SystemFunction container, Collection<SystemFunctionPkg> elements){
		container.getOwnedSystemFunctionPkgs().addAll(elements);
		return elements;
	}
	
	/**
	 * Adds the given SystemFunctionPkgs to the container SystemFunctionPkg
	 * Returns the SystemFunctionPkgs
	 * @param container
	 * @param elements
	 * @return Collection<SystemFunctionPkg>
	 */
	public static Collection<SystemFunctionPkg> insertSystemFunctionPkgs(SystemFunctionPkg container, Collection<SystemFunctionPkg> elements){
		container.getOwnedSystemFunctionPkgs().addAll(elements);
		return elements;
	}
	
	/**
	 * Creates and adds n SystemFunctions inside of the container SystemFunction
	 * Returns creates SystemFunctions
	 * @param container
	 * @param n
	 * @return Collection<SystemFunction>
	 */
	public static Collection<SystemFunction> insertSystemFunctions(SystemFunction container, int n){
		HashSet<SystemFunction> funcs = new HashSet<>();
		for(int i = 0; i < n; i++) funcs.add(SaHelper.createSystemFunction());
		return SaHelper.insertSystemFunctions(container, funcs);
	}
	
	/**
	 * Creates and adds n SystemFunctions inside of the container SystemFunctionPkg
	 * Returns creates SystemFunctions
	 * @param container
	 * @param n
	 * @return Collection<SystemFunction>
	 */
	public static Collection<SystemFunction> insertSystemFunctions(SystemFunctionPkg container, int n){
		HashSet<SystemFunction> funcs = new HashSet<>();
		for(int i = 0; i < n; i++) funcs.add(SaHelper.createSystemFunction());
		return SaHelper.insertSystemFunctions(container, funcs);
	}
	
	/**
	 * Creates and adds n SystemFunctionPkgs inside of the container SystemFunction
	 * Returns creates SystemFunctions
	 * @param container
	 * @param n
	 * @return Collection<SystemFunctionPkg>
	 */
	public static Collection<SystemFunctionPkg> insertSystemFunctionPkgs(SystemFunction container, int n){
		HashSet<SystemFunctionPkg> funcs = new HashSet<>();
		for(int i = 0; i < n; i++) funcs.add(SaHelper.createSystemFunctionPkg());
		return SaHelper.insertSystemFunctionPkgs(container, funcs);
	}
	
	/**
	 * Creates and adds n SystemFunctionPkgs inside of the container SystemFunctionPkg
	 * Returns creates SystemFunctions
	 * @param container
	 * @param n
	 * @return Collection<SystemFunctionPkg>
	 */
	public static Collection<SystemFunctionPkg> insertSystemFunctionPkgs(SystemFunctionPkg container, int n){
		HashSet<SystemFunctionPkg> funcs = new HashSet<>();
		for(int i = 0; i < n; i++) funcs.add(SaHelper.createSystemFunctionPkg());
		return SaHelper.insertSystemFunctionPkgs(container, funcs);
	}

	// Capabilities and CapabilityPkgs
	
	/**
	 * Inserts passed Capabilities into the container CapabilityPkg.
	 * Returns the Capabilities
	 * @param container
	 * @param elements
	 * @return Collection<Capability>
	 */
	public static Collection<Capability> insertCapabilities(CapabilityPkg container, Collection<Capability> elements) {
		container.getOwnedCapabilities().addAll(elements);
		return elements;
	}
	
	/**
	 * Inserts passed CapabilityPkgs into the container CapabilityPkg.
	 * Returns the CapabilityPkgs
	 * @param container
	 * @param elements
	 * @return Collection<CapabilityPkg>
	 */
	public static Collection<CapabilityPkg> insertCapabilityPkgs(CapabilityPkg container, Collection<CapabilityPkg> elements) {
		container.getOwnedCapabilityPkgs().addAll(elements);
		return elements;
	}
	
	/**
	 * Creates n Capabilities and inserts them into the container CapabilityPkg.
	 * Returns the Capabilities.
	 * @param container
	 * @param n
	 * @return Collection<Capability>
	 */
	public static Collection<Capability> insertCapabilities(CapabilityPkg container, int n) {
		HashSet<Capability> c = new HashSet<>();
		for(int i = 0; i<n; i++) c.add(SaHelper.createCapability());
		return SaHelper.insertCapabilities(container, c);
	}
	
	/**
	 * Creates n CapabilityPkgs and inserts them into the container CapabilityPkg.
	 * Returns the CapabilityPkgs.
	 * @param container
	 * @param n
	 * @return Collection<CapabilityPkg>
	 */
	public static Collection<CapabilityPkg> insertCapabilityPkgs(CapabilityPkg container, int n) {
		HashSet<CapabilityPkg> c = new HashSet<>();
		for(int i = 0; i<n; i++) c.add(SaHelper.createCapabilityPkg());
		return SaHelper.insertCapabilityPkgs(container, c);
	}

	// Model Helpers
	//#############################################################################################
	//#############################################################################################
	//#############################################################################################
	//#############################################################################################
	
	// Component relationships
	
	/**
	 * creates a generalization relationship between the passed SystemComponents
	 * returns the model-element which represents this relationship
	 * @param super_comp the super-type
	 * @param sub_comp the sub-type
	 * @return capellacore.Generalization
	 */
	public static Generalization setComponentGeneralizationRelationship(SystemComponent super_comp, SystemComponent sub_comp) {
		Generalization g = cc_e_fact.createGeneralization();
		g.setSub(sub_comp);
		g.setSuper(super_comp);
		sub_comp.getOwnedGeneralizations().add(g);
		return g;
	}
	
	/**
	 * Creates a ComponentExchange originating from src and flowing into trg 
	 * @param comp_root the root SystemComponentPkg which recursively contains all components of the model
	 * @param src the SystemComponent from which the link originates
	 * @param trg the SystemComponent to which contents of link flow
	 * @return
	 */
	public static ComponentExchange createComponentExchange(SystemComponentPkg comp_root, SystemComponent src, SystemComponent trg) {
		ComponentExchange c = fa_e_fact.createComponentExchange();
		c.setName(random_unique_string());
		c.setKind(ComponentExchangeKind.ASSEMBLY);
		
		ComponentPort src_port = fa_e_fact.createComponentPort();
		ComponentPort trg_port = fa_e_fact.createComponentPort();
		
		src_port.setName(c.getName() + " Port");
		src_port.setKind(ComponentPortKind.STANDARD);
		src_port.setOrientation(OrientationPortKind.UNSET);
		
		trg_port.setName(c.getName() + " Port");
		trg_port.setKind(ComponentPortKind.STANDARD);
		trg_port.setOrientation(OrientationPortKind.UNSET);
		
		src.getOwnedFeatures().add(src_port);
		trg.getOwnedFeatures().add(trg_port);
		
		c.setSource(src_port);
		c.setTarget(trg_port);
		comp_root.getOwnedComponentExchanges().add(c);
		
		return c;
	}
	
	/**
	 * Creates a physical link between the passed components.
	 * The model-element representing this relationship is stored in the root-SystemComponentPkg.
	 * @param comp_root root-SystemComponentPkg
	 * @param src SystemComponent
	 * @param trg SystemComponent
	 * @return PhysicalLink
	 */
	public static PhysicalLink createPhysicalLink(SystemComponentPkg comp_root, SystemComponent src, SystemComponent trg) {
		PhysicalLink p = cs_e_fact.createPhysicalLink();
		PhysicalPort src_port = cs_e_fact.createPhysicalPort();
		PhysicalPort trg_port = cs_e_fact.createPhysicalPort();

		p.setName(random_unique_string());
		src_port.setName(p.getName() + " Port");
		trg_port.setName(p.getName() + " Port");
		
		p.getLinkEnds().add(src_port);
		p.getLinkEnds().add(trg_port);
		
		src.getOwnedFeatures().add(src_port);
		trg.getOwnedFeatures().add(trg_port);
		
		comp_root.getOwnedPhysicalLinks().add(p);
		
		return p;
	}

	// Function relationships

	/**
	 * Allocates a SystemFunction to a SystemComponent.
	 * The ComponentFunctionalAllocation-object which represents this relationship is returned.
	 * @param comp SystemComponent
	 * @param func SystemFunction
	 * @return ComponentFunctionalAllocation
	 */
	public static ComponentFunctionalAllocation allocateFunctionToComponent(SystemComponent comp, SystemFunction func) {
		ComponentFunctionalAllocation alloc =
				fa_e_fact.createComponentFunctionalAllocation();
		alloc.setSourceElement(comp);
		alloc.setTargetElement(func);
		comp.getOwnedFunctionalAllocation().add(alloc);
		return alloc;
	}
	
	// Capability relationships
	
	/**
	 * Creates an involvement relationship between a Capability and a SystemComponent.
	 * The CapabilityInvolvement which represents this relationship is returned.
	 * @param cap Capability
	 * @param comp SystemComponent
	 * @return CapabilityInvolvement
	 */
	public static CapabilityInvolvement setCapabilityInvolvement(Capability cap, SystemComponent comp) {
		CapabilityInvolvement inv = ctx_e_fact.createCapabilityInvolvement();
		inv.setInvolved(comp);
		cap.getOwnedCapabilityInvolvements().add(inv);
		return inv;
	}
	
	/**
	 * Creates an extension relationship, where Capability a extends Capability b.
	 * @param a extending Capability
	 * @param b	extended Capability
	 * @return AbstractCapabilityExtend
	 */
	public static AbstractCapabilityExtend extendCapability(Capability a, Capability b) {
		AbstractCapabilityExtend ext = int_e_fact.createAbstractCapabilityExtend();
		ext.setExtended(b);
		a.getExtends().add(ext);
		return ext;
	}
	
	/**
	 * Creates a generalization relationship between Capability super and Capability sub
	 * @param super_cap
	 * @param sub_cap
	 * @return AbstractCapabilityGeneralization
	 */
	public static AbstractCapabilityGeneralization setCapabilityGeneralizationRelationship(Capability super_cap, Capability sub_cap) {
		AbstractCapabilityGeneralization gen = int_e_fact.createAbstractCapabilityGeneralization();
		gen.setSuper(super_cap);
		sub_cap.getSuperGeneralizations().add(gen);
		return gen;
	}
	
	/**
	 * Creates an inclusion relationship, where Capability a includes Capability b.
	 * @param a including Capability
	 * @param b	included Capability
	 * @return AbstractCapabilityInclude
	 */
	public static AbstractCapabilityInclude includeCapability(Capability a, Capability b) {
		AbstractCapabilityInclude inc = int_e_fact.createAbstractCapabilityInclude();
		inc.setIncluded(b);
		a.getIncludes().add(inc);
		return inc;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
