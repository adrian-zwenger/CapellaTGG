package benchmarks;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.sync.INITIAL_FWD;
import org.emoflon.ibex.tgg.run.ctx2la.config._DefaultRegistrationHelper;

import generator.SaGenerator;

public class InstanceMaker extends INITIAL_FWD {
		
//	public final int initial_src_element_count;
	
	public SaGenerator src_model_gen;
	
	public long forward_duration;
	
	public long needed_ram;
	
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();
	
	public InstanceMaker(int hierarchy_levels, int elements_per_level, int relationships) throws IOException{
		super(
			registrationHelper.createIbexOptions().resourceHandler(

				new TGGResourceHandler() {
					
					@Override
					public void saveModels() throws IOException {
						source.save(null);
						target.save(null);
						corr.save(null);
						protocol.save(null);
					}
						
					@Override
					public void loadModels() throws IOException {
						source = createResource(options.project.path() + "/instances/sync/src.xmi");
						target = createResource(options.project.path() + "/instances/sync/trg.xmi");
						corr = createResource(options.project.path() + "/instances/sync/corr.xmi");
						protocol = createResource(options.project.path() + "/instances/sync/protocol.xmi");
					}
				}	
			)
		);
		src_model_gen = new SaGenerator(hierarchy_levels,elements_per_level, relationships);
	
//		resourceHandler.getSourceResource().getContents().removeAll(resourceHandler.getSourceResource().getContents());
//		resourceHandler.getTargetResource().getContents().removeAll(resourceHandler.getTargetResource().getContents());
//		resourceHandler.getCorrResource().getContents().removeAll(resourceHandler.getCorrResource().getContents());
//		resourceHandler.getProtocolResource().getContents().removeAll(resourceHandler.getProtocolResource().getContents());
		
		resourceHandler.getSourceResource().getContents().add(src_model_gen.model);
	}

	public void create_tripel() throws IOException{
		System.out.println("Now translating " + this.src_model_gen.element_count + " elements.");
		
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		long tic = System.currentTimeMillis();
		this.forward();	
		long toc = System.currentTimeMillis();
		
		this.forward_duration = toc - tic;
		this.terminate();
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		
		this.needed_ram = bytesToMegabytes(runtime.totalMemory() - runtime.freeMemory());
	}

	private static final long MEGABYTE = 1024L * 1024L;
	
	private static long bytesToMegabytes(long bytes) {
	    return bytes / MEGABYTE;
	}

	public Resource getSourceResource() {
		return this.resourceHandler.getSourceResource();
	}
	
	public Resource getTargetResource() {
		return this.resourceHandler.getTargetResource();
	}
	
	public Resource getProtocolResource() {
		return this.resourceHandler.getProtocolResource();
	}
	
	public Resource getCorrespondenceResource() {
		return this.resourceHandler.getCorrResource();
	}
	
	public static void main(String[] args) throws IOException {
		logger.info("Starting INITIAL FWD");
		InstanceMaker i = new InstanceMaker(4,4,4);
		i.create_tripel();
		i.saveModels();
		logger.info("Completed init FWD");
		logger.info("RAM-usage: " + i.needed_ram + "MB");
		logger.info("duration: " + i.forward_duration + "ms");
	}
}
