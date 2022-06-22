package org.emoflon.ibex.tgg.run.ctx2la;

import java.io.IOException;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.matches.ITGGMatch;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.updatepolicy.IUpdatePolicy;
import org.emoflon.ibex.tgg.run.ctx2la.config._DefaultRegistrationHelper;

import language.TGG;
import language.TGGRule;
import language.TGGRuleEdge;
import language.TGGRuleNode;

public class MODELGEN_App extends MODELGEN{

	// eMoflon supports other pattern matching engines. Replace _DefaultRegistrationHelper with one of the other registrationHelpers from the *.config-package to choose between them. Default: Democles 
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public MODELGEN_App() throws IOException {
		super(registrationHelper.createIbexOptions().resourceHandler(new TGGResourceHandler() {
			@Override
			public void saveModels() throws IOException {
				// Use the commented code below to implement saveModels individually.
				// source.save(null);
				// target.save(null);
				// corr.save(null);
				// protocol.save(null);
				
				super.saveModels();
			}
			
			@Override
			public void loadModels() throws IOException {
				// Use the commented code below to implement loadModels individually.
				// loadResource loads from a file while createResource creates a new resource without content
				// source = loadResource(options.project.path() + "/instances/src.xmi");
				// target = createResource(options.project.path() + "/instances/trg.xmi");
				// corr = createResource(options.project.path() + "/instances/corr.xmi");
				// protocol = createResource(options.project.path() + "/instances/protocol.xmi");
				
				super.loadModels();
			}
			/**
			 * method to fix capella metmodel loading
			 * @author Lars Fritsche
			 * @param pkg
			 * @return
			 */
			@Override
			protected Resource loadTGGResource(String workspaceRelativePath) throws IOException {
				Resource tggResource = super.loadTGGResource(workspaceRelativePath);
				if(tggResource.getContents().isEmpty())
					return tggResource;
				
				if(tggResource.getContents().get(0) instanceof TGG tgg) {
					Collection<EPackage> srcPackages = tgg.getSrc().stream().map(this::resolveEPackage).collect(Collectors.toList());
					Collection<EPackage> trgPackages = tgg.getTrg().stream().map(this::resolveEPackage).collect(Collectors.toList());
					tgg.getSrc().clear();
					tgg.getTrg().clear();
					tgg.getSrc().addAll(srcPackages);
					tgg.getTrg().addAll(trgPackages);
					
					for(TGGRule rule : tgg.getRules()) {
						System.out.println("Resolving for rule: " + rule.getName());
						for(TGGRuleNode node : rule.getNodes()) {
							node.setType(resolveType(node.getType()));
						}
						for(TGGRuleEdge edge : rule.getEdges()) {
							edge.setType(resolveReference(edge.getType()));
						}
					}
				}
				return tggResource;
			}
			
			/**
			 * method to fix capella metmodel loading
			 * @author Lars Fritsche
			 * @param pkg
			 * @return
			 */
			private EPackage resolveEPackage(EPackage pkg) {
				if(rs.getPackageRegistry().get(pkg.getNsURI()) instanceof EPackage regPkg) {
					return regPkg;
				}
				return pkg;
			}
			
			/**
			 * method to fix capella metmodel loading
			 * @author Lars Fritsche
			 * @param pkg
			 * @return
			 */
			private EPackage resolveEPackage(String nsURI) {
				if(rs.getPackageRegistry().get(nsURI) instanceof EPackage regPkg) {
					return regPkg;
				}
				return null;
			}
			
			/**
			 * method to fix capella metmodel loading
			 * @author Lars Fritsche
			 * @param pkg
			 * @return
			 */
			private EClass resolveType(EClass ec) {
				EPackage pkg = null;
				if(ec.getEPackage() == null) {
					URI proxyURI = ((InternalEObject) ec).eProxyURI();
					URI trimedURI = proxyURI.trimFragment();
					pkg = resolveEPackage(trimedURI.toString());
				} else {
					pkg = resolveEPackage(ec.getEPackage());
				}
				
				Optional<EClassifier> resolvedEC = pkg.getEClassifiers().stream().filter(cl -> cl.getName().equals(ec.getName())).findFirst();
				if(!resolvedEC.isPresent()) {
					throw new RuntimeException("Could not resolve eClass " + ec.getName());
				}
				return (EClass) resolvedEC.get();
			}
			
			/**
			 * method to fix capella metmodel loading
			 * @author Lars Fritsche, AZ
			 * @param pkg
			 * @return
			 */
			private EReference resolveReference(EReference ref) {
				EClass containingClass = ref.getEContainingClass();
				EClass the_classifier = resolveType(containingClass);
				Optional<EReference> resolvedRef = the_classifier.getEAllReferences().stream().filter(r -> r.getName().equals(ref.getName())).findFirst();
				if(!resolvedRef.isPresent()) {
					throw new RuntimeException("Could not resolve EReference " + ref.getName());
				}
				return (EReference) resolvedRef.get();
			}
			
			/**
			 * method to fix capella metmodel loading, does not work as intended somehow
			 * @author Lars Fritsche
			 * @param pkg
			 * @return
			 */
			private EReference resolveReference_backup(EReference ref) {
				EClass containingClass = ref.getEContainingClass();
				Optional<EReference> resolvedRef = containingClass.getEAllReferences().stream().filter(r -> r.getName().equals(ref.getName())).findFirst();
				if(!resolvedRef.isPresent()) {
					throw new RuntimeException("Could not resolve EReference " + ref.getName());
				}
				return (EReference) resolvedRef.get();
			}
			
		}));
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting MODELGEN");
		long tic = System.currentTimeMillis();
		MODELGEN_App generator = new MODELGEN_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for MODELGEN in: " + (toc - tic) + " ms");
		
		MODELGENStopCriterion stop = new MODELGENStopCriterion(generator.getTGG());
//		stop.setTimeOutInMS(10001);

		// ##### CAPELLA MODEL ROOTS ##### //
		stop.setMaxRuleCount("Ctx2LaGeneration", 1);
		
		// ##### COMPONENT TRANSITIONS ##### //
		// components
		stop.setMaxRuleCount("TransitionComponent", 8); // 1 to 1 component transition contained in rootPkg
		stop.setMaxRuleCount("TransitionComponentsContainedInComponents", 8); // 1to1 component transition for comp contained in comp
		stop.setMaxRuleCount("TransitionComponentsContainedInPkgs", 8); // as above, but contained in pkgs
		// packages
		stop.setMaxRuleCount("TransitionComponentPkg", 8); // 1to1 pkg transition in rootPkg
		stop.setMaxRuleCount("TransitionComponentPkgContainedInComponents", 8); // 1to1 pkg transition, pkg contained in components
		stop.setMaxRuleCount("TransitionComponentPkgContainedInPkgs", 8); // as above, but pkgs contained in other pkgs
		// capella model elements
		stop.setMaxRuleCount("TransitionComponentGeneralization", 8);// 1to1 transition for generalization links
		stop.setMaxRuleCount("TransitionExchangeWithComponentPair", 8); // default component exchanges; 1to1 transition
		stop.setMaxRuleCount("TransitionPhysExchangeWithComponentPair", 8);
		stop.setMaxRuleCount("TransitionExchangeWithSingleComponent", 8); // physical component exchanges; 1to1 transition
		stop.setMaxRuleCount("TransitionPhysExchangeWithSingleComponent", 8);

		// ##### COMPONENT TRANSITION VARIATIONS ##### // 1 to n transition rules
		/**
		 * CreatedPkg = Pkg which does not realize any mode element in src-model
		 * TransitionedPkg = Pkg which does realize a model element in src-domain
		 */
		// realization Links
		stop.setMaxRuleCount("CreateComponentRealizationLink", 8); // creates corr nodes for existing ctx-la Component pairs
		stop.setMaxRuleCount("CreateComponentPkgRealizationLink", 8);
		// packages
		stop.setMaxRuleCount("CreateLaComponentPkgContainedInComponent", 8); // creates laComponentPkgs which do not realize any Ctx-element
		stop.setMaxRuleCount("CreateLaComponentPkgContainedInTransitionedComponentPkg", 8); // creates Pkg in transitioned pkg
		stop.setMaxRuleCount("CreateLaComponentPkgContainedInCreatedComponentPkg", 8); // creates pkg in not transitioned pkg
		stop.setMaxRuleCount("CreateLaComponentPkgContainedInRootComponentPkg", 8); // creates pkg directly contained in root-pkg		
		// transitions a new laPkg and puts it on same hierarchy level as existing realization
		stop.setMaxRuleCount("SyncComponentPkgContainedInComponentFlat", 8); // both contained in a component
		stop.setMaxRuleCount("SyncComponentPkgContainedInComponentPkgFlat", 8); // both contained in a componentPkg
		// transitions a new laPkg contained in existing pkg
		stop.setMaxRuleCount("SyncComponentPkgContainedInComponentPkgHierarchical", 8); // container is a ctxPkg realization
		stop.setMaxRuleCount("SyncComponentPkgContainedInCreatedComponentPkg", 8); // container is not a ctxPkg realization
		stop.setMaxRuleCount("SyncComponentPkgContainedInRootComponentPkgFlat", 8); // creates another pkg realization directly contained in the root pkg
		// components
		stop.setMaxRuleCount("SyncComponentContainedInComponentFlat", 8); // create component realization for component contained in a component. new trg-domain element on same hierarchy level as src-domain component
		stop.setMaxRuleCount("SyncComponentContainedInComponentPkgFlat", 8); // same as above for components contained in componentPkg
		stop.setMaxRuleCount("SyncComponentContainedInRootComponentPkgFlat", 8); // rule above uses rootPkg as context. Thus root is not matsched as container for new component
		stop.setMaxRuleCount("SyncComponentContainedInComponentHierarchical", 8); // instead of creating a new component on same hierarchy level the new component is to be created as a sub-component
		stop.setMaxRuleCount("SyncComponentContainedInCreatedComponentPkg", 8); // create component in pkg which does not realize any src-domain element
		stop.setMaxRuleCount("SyncComponentContainedInCreatedPkgContainedInComponent", 8); // special case of rule above. implemented as a possible example for thesis. rule itself not really needed

		// ##### CAPABILITY TRANSITIONS ##### //
		// capabilities
		stop.setMaxRuleCount("TransitionCapabilities", 8);
		stop.setMaxRuleCount("TransitionCapabilitiesContainedInCapabilityPkgs", 8);		
		// packages
		stop.setMaxRuleCount("TransitionCapabilityPkg", 8);
		stop.setMaxRuleCount("TransitionCapabilityPkgContainedInPkgs", 8);
		// capella model elements
		stop.setMaxRuleCount("TransitionActorInvolvement", 8);
		stop.setMaxRuleCount("TransitionCapabilityGeneralization", 8);
		stop.setMaxRuleCount("TransitionCapabilityExtensions", 8);
		stop.setMaxRuleCount("TransitionCapabilityInclusions", 8);
		// ##### CAPABILITY TRANSITIONS ##### //
		// realization links
		stop.setMaxRuleCount("CreateNewCapabilityPkgRealizationLink", 8);
		stop.setMaxRuleCount("CreateNewCapabilityRealizationLinks", 8);
		
		// create packages
		stop.setMaxRuleCount("CreateCapabilityPkgContainedInCapabilityPkg", 8);
		stop.setMaxRuleCount("CreateCapabilityPkgContainedInRootPkg", 8);
		// sync packages
		stop.setMaxRuleCount("SyncCapabilityPkgContainedInCreatedCapabilityPkg", 8);
		stop.setMaxRuleCount("SyncCapabilityPkgContainedInTransitionedCapabilityPkgFlat", 8);
		stop.setMaxRuleCount("SyncCapabilityPkgContainedInTransitionedCapabilityPkgHierarchical", 8);
		stop.setMaxRuleCount("SyncCapabilityPkgContainedInRootCapabilityPkgFlat", 8);
		// sync capabilities
		stop.setMaxRuleCount("SyncCapabilityContainedInRootCapabilityPkgFlat", 8);
		stop.setMaxRuleCount("SyncCapabilityContainedInCapabilityPkgFlat", 8);
		stop.setMaxRuleCount("SyncCapabilityContainedInCreatedCapabilityPkg", 8);
		
		
		// ##### FUNCTIONS TRANSITIONS ##### //
		// functions
		stop.setMaxRuleCount("TransitionFunction", 8);
		stop.setMaxRuleCount("TransitionFunctionsContainedInFunctions", 8);
		stop.setMaxRuleCount("TransitionFunctionsContainedInFunctionPkg", 8);
		// packages
		stop.setMaxRuleCount("TransitionFunctionPkg", 8);
		stop.setMaxRuleCount("TransitionFunctionPkgContainedInFunctions", 8);
		stop.setMaxRuleCount("TransitionFunctionPkgContainedInFunctionPkg", 8);
		// capella model elements
		stop.setMaxRuleCount("TransitionFunctionAllocation", 8);

		// ##### FUNCTION TRANSITION VARIATIONS ##### //
		// realization Links
		stop.setMaxRuleCount("CreateFunctionRealizationLink", 8); // create new realization links for existing elements in src- or trg domain
		stop.setMaxRuleCount("CreateFunctionPkgRealizationLink", 8);
		// packages
		// create trg-domain function packages which do not realize src-domain packages
		stop.setMaxRuleCount("CreateFunctionPkgContainedInFunctionPkg", 8); // creates new pkg in any pkg except for the function-root-pkg, which may only contain a single function
		stop.setMaxRuleCount("CreateFunctionPkgContainedInFunction", 8); // creates a pkg contained in a function
		stop.setMaxRuleCount("CreateFunctionPkgContainedInRootFunction", 8); // creates a new pkg contained in the root function
		// create new realizations for src-domain function-packages
		stop.setMaxRuleCount("SyncFunctionPkgContainedInFunctionFlat", 8); // creates new realization in same container as existing realization
		stop.setMaxRuleCount("SyncFunctionPkgContainedInFunctionPkgFlat", 8); // creates new realization in same container as existing realization
		stop.setMaxRuleCount("SyncFunctionPkgContainedInFunctionPkgHierarchical", 8); // creates new realization contained in existing realization
		stop.setMaxRuleCount("SyncFunctionPkgContainedInRootFunctionFlat", 8); // creates new realization in same container (root function) as existing realization
		stop.setMaxRuleCount("SyncFunctionPkgContainedInCreatedFunctionPkg", 8); // creates a realization in container which does not realize any src-domain elements
		// functions
		// create new realizations for src-domain functions
		stop.setMaxRuleCount("SyncFunctionContainedInFunctionFlat", 8); // creates new realization in same container as existing realization
		stop.setMaxRuleCount("SyncFunctionContainedInFunctionPkgFlat", 8); // creates new realization in same container as existing realization
		stop.setMaxRuleCount("SyncFunctionContainedInFunctionHierarchical", 8); // creates new realization contained in existing realization
		stop.setMaxRuleCount("SyncFunctionContainedInCreatedFunctionPkg", 8); // creates a realization contained in any Pkg. Matches need to be manually reviewed
		stop.setMaxRuleCount("SyncFunctionContainedInRootFunction", 8); // creates new realization in same container (root function only) as existing realization

		///////////////////////
		generator.setUpdatePolicy(new CustomUpdatePolicy());
		generator.setStopCriterion(stop);
		
		tic = System.currentTimeMillis();
		
		generator.run();
		
		toc = System.currentTimeMillis();
		logger.info("Completed MODELGEN in: " + (toc - tic) + " ms");
		
		generator.saveModels();
		generator.terminate();
		
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		System.out.println("RAM usage: " + bytesToMegabytes(runtime.totalMemory() - runtime.freeMemory()) + " MB");
	}
	
	private static final long MEGABYTE = 1024L * 1024L;

    private static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

}