package generator;

import java.util.HashSet;
import java.util.LinkedList;

import org.polarsys.capella.core.data.capellacore.Generalization;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.ctx.*;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityExtend;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityGeneralization;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityInclude;

import helper.SaHelper;


public class SaGenerator {

	private HashSet<SystemComponent> all_components = new HashSet<>();
	private HashSet<SystemComponentPkg> all_component_pkgs = new HashSet<>();
	
	private HashSet<SystemFunction> all_functions = new HashSet<>();
	private HashSet<SystemFunctionPkg> all_function_pkgs = new HashSet<>();

	private HashSet<Capability> all_capabilities = new HashSet<>();
	private HashSet<CapabilityPkg> all_capability_pkgs = new HashSet<>();
	
	private HashSet<Generalization> all_comp_generalizations = new HashSet<>();
	private HashSet<ComponentExchange> all_comp_exchanges = new HashSet<>();
	private HashSet<PhysicalLink> all_phys_links = new HashSet<>();

	private HashSet<CapabilityInvolvement> all_cap_involvements = new HashSet<>();
	private HashSet<AbstractCapabilityGeneralization> all_cap_generalizations = new HashSet<>();
	private HashSet<AbstractCapabilityExtend> all_cap_extensions = new HashSet<>();
	private HashSet<AbstractCapabilityInclude> all_cap_inclusions = new HashSet<>();

	private HashSet<ComponentFunctionalAllocation> all_func_allocations = new HashSet<>();
	
	/**
	 * add model-element to registry
	 * @param a
	 */
	private void addElementToRegistry(Object a) {
		if(a instanceof SystemComponent comp) all_components.add(comp);
		else if(a instanceof SystemComponentPkg pkg) all_component_pkgs.add(pkg);
		else if(a instanceof SystemFunction func) all_functions.add(func);
		else if(a instanceof SystemFunctionPkg pkg) all_function_pkgs.add(pkg);
		else if(a instanceof Capability cap) all_capabilities.add(cap);
		else if(a instanceof CapabilityPkg pkg) all_capability_pkgs.add(pkg);
		else if(a instanceof Generalization gen) all_comp_generalizations.add(gen);
		else if(a instanceof ComponentExchange cex) all_comp_exchanges.add(cex);
		else if(a instanceof PhysicalLink pl) all_phys_links.add(pl);
		else if(a instanceof CapabilityInvolvement ci) all_cap_involvements.add(ci);
		else if(a instanceof AbstractCapabilityGeneralization cg) all_cap_generalizations.add(cg);
		else if(a instanceof AbstractCapabilityExtend ce) all_cap_extensions.add(ce);
		else if(a instanceof AbstractCapabilityInclude ci) all_cap_inclusions.add(ci);
		else if(a instanceof ComponentFunctionalAllocation fa) all_func_allocations.add(fa);
		else throw new IllegalArgumentException();
	}
	
	/**
	 * remove element from registry
	 * @param a
	 */
	private void removeElementFromRegistry(Object a) {
		if(a instanceof SystemComponent comp) all_components.remove(comp);
		else if(a instanceof SystemComponentPkg pkg) all_component_pkgs.remove(pkg);
		else if(a instanceof SystemFunction func) all_functions.remove(func);
		else if(a instanceof SystemFunctionPkg pkg) all_function_pkgs.remove(pkg);
		else if(a instanceof Capability cap) all_capabilities.remove(cap);
		else if(a instanceof CapabilityPkg pkg) all_capability_pkgs.remove(pkg);
		else if(a instanceof Generalization gen) all_comp_generalizations.remove(gen);
		else if(a instanceof ComponentExchange cex) all_comp_exchanges.remove(cex);
		else if(a instanceof PhysicalLink pl) all_phys_links.remove(pl);
		else if(a instanceof CapabilityInvolvement ci) all_cap_involvements.remove(ci);
		else if(a instanceof AbstractCapabilityGeneralization cg) all_cap_generalizations.remove(cg);
		else if(a instanceof AbstractCapabilityExtend ce) all_cap_extensions.remove(ce);
		else if(a instanceof AbstractCapabilityInclude ci) all_cap_inclusions.remove(ci);
		else if(a instanceof ComponentFunctionalAllocation fa) all_func_allocations.remove(fa);
		else throw new IllegalArgumentException();
	}

	/**
	 * Returns random SystemComponent from registry
	 * @return
	 */
	private SystemComponent getRandomSystemComponent() {
		int rnd = (int) (Math.random() * this.all_components.size());
		return (SystemComponent) this.all_components.toArray()[rnd];
	}

	/**
	 * Returns random SystemComponentPkg from registry
	 * @return
	 */
	private SystemComponentPkg getRandomSystemComponentPkg() {
		int rnd = (int) (Math.random() * this.all_component_pkgs.size());
		return (SystemComponentPkg) this.all_component_pkgs.toArray()[rnd];
	}

	/**
	 * Returns a random SystemFunction from registry
	 * @return
	 */
	private SystemFunction getRandomSystemFunction() {
		int rnd = (int) (Math.random() * this.all_functions.size());
		return (SystemFunction) this.all_functions.toArray()[rnd];
	}
	
	/**
	 * Returns a random SystemFunctionPkg from registry
	 * @return
	 */
	private SystemFunctionPkg getRandomSystemFunctionPkg() {
		int rnd = (int) (Math.random() * this.all_function_pkgs.size());
		return (SystemFunctionPkg) this.all_function_pkgs.toArray()[rnd];
	}

	/**
	 * Returns a random Capability from registry
	 * @return
	 */
	private Capability getRandomCapability() {
		int rnd = (int) (Math.random() * this.all_capabilities.size());
		return (Capability) this.all_capabilities.toArray()[rnd];
	}
	
	/**
	 * Returns a random CapabilityPkg from registry
	 * @return
	 */
	private CapabilityPkg getRandomCapabilityPkg() {
		int rnd = (int) (Math.random() * this.all_capability_pkgs.size());
		return (CapabilityPkg) this.all_capability_pkgs.toArray()[rnd];
	}
	
	/**
	 * Returns a random Component Generalization from the registry	
	 * @return
	 */
	private Generalization getRandomGeneralization() {
		int rnd = (int) (Math.random() * this.all_comp_generalizations.size());
		return (Generalization) this.all_comp_generalizations.toArray()[rnd];
	}
	
	/**
	 * Returns a random ComponentExchange from the registry	
	 * @return
	 */
	private ComponentExchange getRandomComponentExchange() {
		int rnd = (int) (Math.random() * this.all_comp_exchanges.size());
		return (ComponentExchange) this.all_comp_exchanges.toArray()[rnd];
	}
	
	/**
	 * Returns a random PhysicalLink from registry
	 * @return
	 */
	private PhysicalLink getRandomPhysicalLink() {
		int rnd = (int) (Math.random() * this.all_phys_links.size());
		return (PhysicalLink) this.all_phys_links.toArray()[rnd];
	}

	/**
	 * Returns a random CapabilityInvolvement from the registry
	 * @return
	 */
	private CapabilityInvolvement getRandomCapabilityInvolvement() {
		int rnd = (int) (Math.random() * this.all_cap_involvements.size());
		return (CapabilityInvolvement) this.all_cap_involvements.toArray()[rnd];
	}
	
	/**
	 * Returns a random CapabilityGeneralization from the registry
	 * @return
	 */
	private AbstractCapabilityGeneralization getRandomCapabilityGeneralization() {
		int rnd = (int) (Math.random() * this.all_cap_generalizations.size());
		return (AbstractCapabilityGeneralization) this.all_cap_generalizations.toArray()[rnd];
	}
	
	/**
	 * Returns a random CapabilityExtenc from the registry
	 * @return
	 */
	private AbstractCapabilityExtend getRandomCapabilityExtension() {
		int rnd = (int) (Math.random() * this.all_cap_extensions.size());
		return (AbstractCapabilityExtend) this.all_cap_extensions.toArray()[rnd];
	}
	
	/**
	 * Returns a random CapabilityInclude from the registry
	 * @return
	 */
	private AbstractCapabilityInclude getRandomCapabilityInclusion() {
		int rnd = (int) (Math.random() * this.all_cap_inclusions.size());
		return (AbstractCapabilityInclude) this.all_cap_inclusions.toArray()[rnd];
	}

	/**
	 * Returns a random FunctionalAllocation from the registry
	 * @return
	 */
	private ComponentFunctionalAllocation getRandomFunctionalAllocation() {
		int rnd = (int) (Math.random() * this.all_func_allocations.size());
		return (ComponentFunctionalAllocation) this.all_func_allocations.toArray()[rnd];
	}
	
	/**
	 * Creates a recursive model element structure with root being the root
	 * Structure has tree_depth levels
	 * and elements_per_level elements per element type
	 * @param root
	 * @param tree_depth
	 * @param elements_per_level
	 */
	public void createModelTree(Object root, int tree_depth, int elements_per_level) {
		if(tree_depth <= 0) return;
		LinkedList<Object> queue = new LinkedList<>();

		if(root instanceof SystemComponent comp) {
			queue.addAll(SaHelper.insertSystemComponentPkgs(comp, elements_per_level));
			queue.addAll(SaHelper.insertSystemComponents(comp, elements_per_level));
		} else if(root instanceof SystemComponentPkg pkg) {
			queue.addAll(SaHelper.insertSystemComponentPkgs(pkg, elements_per_level));
			queue.addAll(SaHelper.insertSystemComponents(pkg, elements_per_level));
		} else if(root instanceof SystemFunction func) {
			queue.addAll(SaHelper.insertSystemFunctions(func, elements_per_level));
			queue.addAll(SaHelper.insertSystemFunctionPkgs(func, elements_per_level));
		} else if(root instanceof SystemFunctionPkg f_pkg) {
			queue.addAll(SaHelper.insertSystemFunctions(f_pkg, elements_per_level));
			queue.addAll(SaHelper.insertSystemFunctionPkgs(f_pkg, elements_per_level));
		} else if (root instanceof Capability cap) {
			return;
		} else if (root instanceof CapabilityPkg c_pkg) {
			queue.addAll(SaHelper.insertCapabilities(c_pkg, elements_per_level));
			queue.addAll(SaHelper.insertCapabilityPkgs(c_pkg, elements_per_level));
		} else {
			// System.out.println(root.getClass());
			throw new IllegalArgumentException(); 
		}
		
		while(!queue.isEmpty()) {
			Object obj = queue.poll();
			this.addElementToRegistry(obj);
			this.createModelTree(obj, tree_depth - 1, elements_per_level);
		}
		return;
	}
	
	/**
	 * The model created by this generator
	 */
	public SystemAnalysis model;
	
	/**
	 * Initial number of elements in this model  
	 */
	public final int element_count;

	public SaGenerator() {
		element_count = 0;
	}
	
	public SaGenerator(int model_depth, int elements_per_type, int relations_per_type) {
		this.model = createSystemAnalysisModel(model_depth, elements_per_type, relations_per_type);
		
		int i = 1; // modelelement
		i += this.all_component_pkgs.size() + 1; // created components + root component
		i += (this.all_components.size() + 1) * 2; // components and system are represented by two model elements.
		i += this.all_functions.size() + 1; // functions + root function
		i += this.all_function_pkgs.size() + 1; // function pkgs + root pkg
		i += this.all_capabilities.size(); // created capabilities
		i += this.all_capability_pkgs.size() + 1; // capabilities + root pkg
		i += this.all_comp_generalizations.size(); // generalizations
		i += this.all_comp_exchanges.size() * 3; // for each exchange 3 elements are created
		i += this.all_phys_links.size() * 3; // for each physical link 3 elements are created
		i += this.all_cap_involvements.size();
		i += this.all_cap_generalizations.size();
		i += this.all_cap_extensions.size();
		i += this.all_cap_inclusions.size();
		i += this.all_func_allocations.size();

		this.element_count = i;
	}
	
	public static HashSet<SystemAnalysis> createSaModels(
		int models, int model_depth, int elements_per_type, int relations_per_type
	){
		HashSet<SystemAnalysis> sa_models = new HashSet<>();
		for(int i=0; i<models; i++) {
			SaGenerator s = new SaGenerator(
				model_depth, elements_per_type, relations_per_type
			);
			sa_models.add(s.model);
		}
		
		return sa_models;
	}

	private SystemAnalysis createSystemAnalysisModel(int model_depth, int elements_per_type, int relations_per_type) {
		model = SaHelper.createSystemAnalysis();
		this.createModelTree(
				model.getOwnedSystemComponentPkg(),
				model_depth,
				elements_per_type
			);
		this.createModelTree(
				model.getOwnedAbstractCapabilityPkg(),
				model_depth,
				elements_per_type
			);

		this.createModelTree(
				((SystemFunctionPkg) model.getOwnedFunctionPkg()).getOwnedSystemFunctions().get(0),
				model_depth,
				elements_per_type
			);

		createComponentGeneralizations(relations_per_type);
		createComponentExchanges(relations_per_type);
		createPhysicalLinks(relations_per_type);
		createCapabilityExtensions(relations_per_type);
		createCapabilityGeneralizations(relations_per_type);
		createCapabilityInclusions(relations_per_type);
		createCapabilityInvolvements(relations_per_type);
		createFunctionalAllocations(relations_per_type);
		
		return model;
	}
	
	private void createComponentGeneralizations(int amount) {
		for(int i=0; i<amount; i++) {
			SystemComponent a = this.getRandomSystemComponent();
			SystemComponent b = this.getRandomSystemComponent();
			this.addElementToRegistry(
					SaHelper.setComponentGeneralizationRelationship(a, b)
				);
		}
	}
	
	private void createComponentExchanges(int amount) {
		for(int i=0; i<amount; i++) {
			SystemComponent a = this.getRandomSystemComponent();
			SystemComponent b = this.getRandomSystemComponent();
			this.addElementToRegistry(
				SaHelper.createComponentExchange(
					this.model.getOwnedSystemComponentPkg(),
					a,
					b
				)	
			);
		}
	}
	
	private void createPhysicalLinks(int amount) {
		for(int i=0; i<amount; i++) {
			SystemComponent a = this.getRandomSystemComponent();
			SystemComponent b = this.getRandomSystemComponent();
			this.addElementToRegistry(
				SaHelper.createPhysicalLink(
					this.model.getOwnedSystemComponentPkg(),
					a,
					b
				)	
			);
		}
	}
	
	private void createCapabilityInvolvements(int amount) {
		for(int i=0; i<amount; i++) {
			this.addElementToRegistry(
				SaHelper.setCapabilityInvolvement(
					this.getRandomCapability(),
					this.getRandomSystemComponent()
				)
			);
		}
	}
	
	private void createCapabilityGeneralizations(int amount) {
		for(int i=0; i<amount; i++) {
			this.addElementToRegistry(
				SaHelper.setCapabilityGeneralizationRelationship(
					this.getRandomCapability(),
					this.getRandomCapability()
				)
			);
		}
	}
	
	private void createCapabilityExtensions(int amount) {
		for(int i=0; i<amount; i++) {
			this.addElementToRegistry(
				SaHelper.extendCapability(
					this.getRandomCapability(),
					this.getRandomCapability()
				)
			);
		}
	}
	
	private void createCapabilityInclusions(int amount) {
		for(int i=0; i<amount; i++) {
			this.addElementToRegistry(
				SaHelper.includeCapability(
					this.getRandomCapability(),
					this.getRandomCapability()
				)
			);
		}
	}
	
	private void createFunctionalAllocations(int amount) {
		for(int i=0; i<amount; i++) {
			this.addElementToRegistry(
				SaHelper.allocateFunctionToComponent(
					getRandomSystemComponent(),
					getRandomSystemFunction()
				)
			);
		}
	}
}
