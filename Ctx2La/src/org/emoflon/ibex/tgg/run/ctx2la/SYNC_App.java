package org.emoflon.ibex.tgg.run.ctx2la;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.matches.ITGGMatch;
import org.emoflon.ibex.tgg.operational.matches.ImmutableMatchContainer;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.operational.updatepolicy.IUpdatePolicy;
import org.emoflon.ibex.tgg.run.ctx2la.config.*;

public class SYNC_App extends SYNC {

	// eMoflon supports other pattern matching engines. Replace _DefaultRegistrationHelper with one of the other registrationHelpers from the *.config-package to choose between them. Default: Democles 
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public SYNC_App() throws IOException {
		super(registrationHelper.createIbexOptions().resourceHandler(new TGGResourceHandler() {
			@Override
			public void saveModels() throws IOException {
				// Use the commented code below to implement saveModels individually.
				String dir =  options.project.path() + "/instances/sync/post/";
				source.setURI(URI.createURI(dir + "src.xmi"));
				target.setURI(URI.createURI(dir + "trg.xmi"));
				corr.setURI(URI.createURI(dir + "corr.xmi"));
				protocol.setURI(URI.createURI(dir + "protocol.xmi"));
				
				source.save(null);
				target.save(null);
				corr.save(null);
				protocol.save(null);
				
				//super.saveModels();
			}
			
			@Override
			public void loadModels() throws IOException {
				// Use the commented code below to implement loadModels individually.
				// loadResource loads from a file while createResource creates a new resource without content
				String dir =  options.project.path() + "/instances/sync/pre/";
				source = loadResource(dir + "src.xmi");
				target = createResource(dir + "trg.xmi");
				corr = createResource(dir + "corr.xmi");
				protocol = createResource(dir + "protocol.xmi");
				
				super.loadModels();
			}
		}));
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting SYNC");
		long tic = System.currentTimeMillis();
		SYNC_App sync = new SYNC_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for SYNC in: " + (toc - tic) + " ms");
		
		tic = System.currentTimeMillis();
		
		sync.getUpdatePolicy();
		sync.getMatchContainer();
		
//		sync.setUpdatePolicy(
//			new IUpdatePolicy() {
//				
//				@Override
//				public ITGGMatch chooseOneMatch(ImmutableMatchContainer matchContainer) {
//					// TODO Auto-generated method stub
//					return null;
//				}
//			}
//		);
		
		
		sync.forward();
		toc = System.currentTimeMillis();
		logger.info("Completed SYNC in: " + (toc - tic) + " ms");
		
		sync.saveModels();
		sync.terminate();
	}
}
