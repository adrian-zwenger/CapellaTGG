package benchmarks;

import generator.SaGenerator;
import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.sync.INITIAL_FWD;
import org.emoflon.ibex.tgg.run.ctx2la.config.*;

public class BenchmarkInitialForward extends INITIAL_FWD {

	// eMoflon supports other pattern matching engines. Replace _DefaultRegistrationHelper with one of the other registrationHelpers from the *.config-package to choose between them. Default: Democles 
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	int x;
	int y;
	int z;
	
	public BenchmarkInitialForward(int x, int y, int z) throws IOException {
		super(registrationHelper.createIbexOptions().resourceHandler(new TGGResourceHandler() {
			@Override
			public void saveModels() throws IOException {
//				 Use the commented code below to implement saveModels individually.
				 source.save(null);
				 target.save(null);
				 corr.save(null);
				 protocol.save(null);
				
//				super.saveModels();
			}
			
			@Override
			public void loadModels() throws IOException {
				// Use the commented code below to implement loadModels individually.
				// loadResource loads from a file while createResource creates a new resource without content
				
//				source = loadResource(options.project.path() + "/instances/src.xmi");
				source = createResource(options.project.path() + "/instances/src.xmi");
				target = createResource(options.project.path() + "/instances/trg.xmi");
				corr = createResource(options.project.path() + "/instances/corr.xmi");
				protocol = createResource(options.project.path() + "/instances/protocol.xmi");
				
//				SaGenerator gen = new SaGenerator(x,y,z);
//				System.out.println(gen.element_count);
//				source.getContents().add(gen.model);
				
//				super.loadModels();
			}
		}));
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting INITIAL FWD");
		long tic = System.currentTimeMillis();
		BenchmarkInitialForward init_fwd = new BenchmarkInitialForward(2,2,2);


		SaGenerator gen = new SaGenerator(init_fwd.x,init_fwd.y,init_fwd.z);
		System.out.println(gen.element_count);

		init_fwd.resourceHandler.getSourceResource().getContents().add(gen.model);
		
		long toc = System.currentTimeMillis();
		logger.info("Completed init for FWD in: " + (toc - tic) + " ms");
		
		tic = System.currentTimeMillis();
		init_fwd.forward();
		toc = System.currentTimeMillis();
		logger.info("Completed INITIAL_FWD in: " + (toc - tic) + " ms");
		
		init_fwd.saveModels();
		init_fwd.terminate();
	}
}
