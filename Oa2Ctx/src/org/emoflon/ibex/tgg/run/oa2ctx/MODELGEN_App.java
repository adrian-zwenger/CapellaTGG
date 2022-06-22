package org.emoflon.ibex.tgg.run.oa2ctx;

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
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.matches.ITGGMatch;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.updatepolicy.IUpdatePolicy;
import org.emoflon.ibex.tgg.run.oa2ctx.config._DefaultRegistrationHelper;

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
				//Use the commented code below to implement saveModels individually.
//				source.save(null);
//				target.save(null);
//				corr.save(null);
//				protocol.save(null);
				
//				public Resource createResource(ResourceSet rs, String workspaceRelativePath) {
//					URI uri = URI.createURI(workspaceRelativePath);
//					Resource res = rs.createResource(uri.resolve(base), ContentHandler.UNSPECIFIED_CONTENT_TYPE);
//					return res;
//				}

				super.saveModels();
			}
			
			@Override
			public void loadModels() throws IOException {
				// Use the commented code below to implement loadModels individually.
				// loadResource loads from a file while createResource creates a new resource without content
				source = createResource(options.project.path() + "/instances/modelgen/src.xmi");
				target = createResource(options.project.path() + "/instances/modelgen/trg.xmi");
				corr = createResource(options.project.path() + "/instances/modelgen/corr.xmi");
				protocol = createResource(options.project.path() + "/instances/modelgen/protocol.xmi");
				
				//super.loadModels();
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
		stop.setTimeOutInMS(1000);

		stop.setMaxRuleCount("Oa2CtxGeneration", 1);

		// actors
		stop.setMaxRuleCount("TransitionActors", 2);
		stop.setMaxRuleCount("TransitionActorsContainedInActorsRecursively", 5);
		stop.setMaxRuleCount("TransitionCommunicationMeans", 5);
		stop.setMaxRuleCount("TransitionEntityPkg", 2);
		stop.setMaxRuleCount("TransitionEntityPkgContainedInPkg", 5);
		stop.setMaxRuleCount("TransitionActorsContainedInPkgsRecursively", 5);

		// capabilities
		stop.setMaxRuleCount("TransitionCapabilities", 5);
		stop.setMaxRuleCount("TransitionCapabilityGeneralizations", 8);   // needs to be monitored. Same Capability may not be a Super-Type multiple times
		stop.setMaxRuleCount("TransistionCapabilityExtensions", 8);   // needs to be monitored. Same Capability may not be extended by the same Capability multiple times
		stop.setMaxRuleCount("TransitionCapabilityInclusions", 8);   // needs to be monitored. Same Capability may not be included multiple times
		stop.setMaxRuleCount("TransitionEntity2CapabilityInvolvements", 0); //set to 0 as on generation no scenarios exist and thus no entity is involved with any capability
		stop.setMaxRuleCount("TransitionActivity2CapabilityInvolvements", 0); //set to 0 as on generation no scenarios exist and thus no activity is involved with any capability

		// activities
		stop.setMaxRuleCount("TransitionInteractions", 5);
		stop.setMaxRuleCount("TransitionActivitiesRecursively", 20);
		stop.setMaxRuleCount("TransitionActivityAllocation", 5);
		generator.setStopCriterion(stop);
		
		tic = System.currentTimeMillis();
		
		generator.run();
		
		toc = System.currentTimeMillis();
		logger.info("Completed MODELGEN in: " + (toc - tic) + " ms");
		
		generator.saveModels();
		generator.terminate();
	}


}
