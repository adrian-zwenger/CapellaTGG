package benchmarks;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.ctx2la.config._DefaultRegistrationHelper;
import org.moflon.core.utilities.EcoreUtils;
import org.polarsys.capella.core.data.capellacore.Generalization;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.ctx.CapabilityPkg;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.ctx.SystemFunctionPkg;

import helper.SaHelper;

public class BenchmarkSync extends SYNC {

	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();
	
	public BenchmarkSync(int x, int y, int z) throws IOException{
		super(
			registrationHelper.createIbexOptions().resourceHandler(

				new TGGResourceHandler() {
					
					@Override
					public void saveModels() throws IOException {
						source = null;
						target = null;
						corr = null;
						protocol = null;
					}
						
					@Override
					public void loadModels() throws IOException {
						
						// Create model
						System.out.println("Creating model");
						InstanceMaker m = new InstanceMaker(x, y, z);
						m.create_tripel();

						source = m.getSourceResource(); // loadResource(options.project.path() + "/instances/sync/src.xmi");
						target = m.getTargetResource(); // loadResource(options.project.path() + "/instances/sync/trg.xmi");
						corr = m.getCorrespondenceResource(); // loadResource(options.project.path() + "/instances/sync/corr.xmi");
						protocol = m.getProtocolResource(); // loadResource(options.project.path() + "/instances/sync/protocol.xmi");
						
						m = null;
						//System.gc();
					}
				}	
			)
		);
	}
	
	public Resource getSourceResource() {
		return this.resourceHandler.getSourceResource();
	}

	private static Long[] do_single_add_SysComp_test(int x, int y, int z) throws IOException{
		Runtime runtime = Runtime.getRuntime();
		Date dt = new Date();
		System.out.println(dt.getTime() + " - Sizes: " +  x + " deep; " + y + " broad; " + z + " relationships;");
		BenchmarkSync m = new BenchmarkSync(x, y, z);
		SystemAnalysis sa = (SystemAnalysis) m.getSourceResource().getContents().get(0);

//		sa.getOwnedSystemComponentPkg().getOwnedSystemComponents().add(
//				SaHelper.createSystemComponent()
//		);

		SaHelper.insertSystemComponents(sa.getOwnedSystemComponentPkg(), 1);
		
		System.out.print("Syncing...");
		long tic = System.currentTimeMillis();
		m.forward();
		long toc = System.currentTimeMillis();
		System.out.println("Done. duration: " + (toc-tic) + "ms");
		m.terminate();
		
		m = null;
		runtime.gc();
		
		Long[] results = {
				toc - tic, 
				bytesToMegabytes(runtime.totalMemory() - runtime.freeMemory())
		};
		
		
		return results;
	}
	
	private static Long[] do_single_remove_SysComp_test(int x, int y, int z) throws IOException{
		Runtime runtime = Runtime.getRuntime();
		Date dt = new Date();
		System.out.println(dt.getTime() + " - Sizes: " +  x + " deep; " + y + " broad; " + z + " relationships;");
		BenchmarkSync m = new BenchmarkSync(x, y, z);
		SystemAnalysis sa = (SystemAnalysis) m.getSourceResource().getContents().get(0);
		
		// remove leaf component
		SystemComponentPkg container = sa.getOwnedSystemComponentPkg();
		for(int i=1; i<x; i++) container = container.getOwnedSystemComponentPkgs().get(0);
		SystemComponent c = container.getOwnedSystemComponents().get(0);

		for(Part i : container.getOwnedParts()) {
			if(i.getAbstractType().equals(c)) {
				EcoreUtil.delete(i, true);
				break;
			}
		}
		EcoreUtil.delete(c, true);
		c = null;
		
		System.out.print("Syncing...");
		long tic = System.currentTimeMillis();
		m.forward();
		long toc = System.currentTimeMillis();
		System.out.println("Done. duration: " + (toc-tic) + "ms");
		m.terminate();
		
		m=null;
		runtime.gc();

		Long[] results = {
				toc - tic, 
				bytesToMegabytes(runtime.totalMemory() - runtime.freeMemory())
		};
		
		
		return results;
	}

	private static Long[] do_single_move_SysComp_test(int x, int y, int z) throws IOException{
		Runtime runtime = Runtime.getRuntime();
		Date dt = new Date();
		System.out.println(dt.getTime() + " - Sizes: " +  x + " deep; " + y + " broad; " + z + " relationships;");
		BenchmarkSync m = new BenchmarkSync(x, y, z);
		SystemAnalysis sa = (SystemAnalysis) m.getSourceResource().getContents().get(0);
		
		SystemComponent c = sa.getOwnedSystemComponentPkg().getOwnedSystemComponents().get(1);
		Part p = null;
		for(Part i : sa.getOwnedSystemComponentPkg().getOwnedParts()) {
			p = i;
			if(p.getAbstractType().equals(c))break;
		}
//		sa.getOwnedSystemComponentPkg().getOwnedSystemComponents().remove(c);		
//		EcoreUtil.remove(c);
		sa.getOwnedSystemComponentPkg().getOwnedSystemComponentPkgs().get(0)
									   .getOwnedSystemComponents().add(c);
		sa.getOwnedSystemComponentPkg().getOwnedSystemComponentPkgs().get(0)
		   							   .getOwnedParts().add(p);
		c = null;
		
		System.out.print("Syncing...");
		long tic = System.currentTimeMillis();
		m.forward();
		long toc = System.currentTimeMillis();
		System.out.println("Done. duration: " + (toc-tic) + "ms");
		m.terminate();
		
		
		m = null;
//		runtime.gc();

		Long[] results = {
				toc - tic, 
				bytesToMegabytes(runtime.totalMemory() - runtime.freeMemory())
		};

		return results;
	}
	
	private static Long[] do_single_create_generalization_test(int x, int y, int z) throws IOException{
		Runtime runtime = Runtime.getRuntime();
		Date dt = new Date();
		System.out.println(dt.getTime() + " - Sizes: " +  x + " deep; " + y + " broad; " + z + " relationships;");
		BenchmarkSync m = new BenchmarkSync(x, y, z);
		SystemAnalysis sa = (SystemAnalysis) m.getSourceResource().getContents().get(0);
		
		SystemComponent c0 = sa.getOwnedSystemComponentPkg().getOwnedSystemComponents().get(0);
		SystemComponent c1 = sa.getOwnedSystemComponentPkg().getOwnedSystemComponents().get(1);

		SaHelper.setComponentGeneralizationRelationship(c0, c1);
		
		c0 = null; 
		c1 = null; 
		
		System.out.print("Syncing...");
		long tic = System.currentTimeMillis();
		m.forward();
		long toc = System.currentTimeMillis();
		System.out.println("Done. duration: " + (toc-tic) + "ms");
		m.terminate();
		
		m=null;
		runtime.gc();

		Long[] results = {
				toc - tic, 
				bytesToMegabytes(runtime.totalMemory() - runtime.freeMemory())
		};
		
		
		return results;
	}
	
	private static Long[] do_single_remove_generalization_test(int x, int y, int z) throws IOException{
		Runtime runtime = Runtime.getRuntime();
		Date dt = new Date();
		System.out.println(dt.getTime() + " - Sizes: " +  x + " deep; " + y + " broad; " + z + " relationships;");
		BenchmarkSync m = new BenchmarkSync(x, y, z);
		TreeIterator<EObject> it = m.getSourceResource().getAllContents();
		
		Generalization del = null;
		
		while(it.hasNext()) if(it.next() instanceof Generalization g) {
			del = g;
			break;
		}
		
		if(del == null) throw new IllegalArgumentException();

		EcoreUtil.delete(del, true);
		del = null;
		
		System.out.print("Syncing...");
		long tic = System.currentTimeMillis();
		m.forward();
		long toc = System.currentTimeMillis();
		m.terminate();
		
		m=null;
		runtime.gc();

		Long[] results = {
				toc - tic, 
				bytesToMegabytes(runtime.totalMemory() - runtime.freeMemory())
		};
		
		return results;
	}	

	public static void normal_test() throws IOException {
		int t = 4;
		int repeat = 10;
		Date dt = new Date();
		String base_path = "./csv/syncbenchmark/" + dt.getTime() + "/";
		File f = new File(base_path);
		f.mkdir();

		String path = base_path + "movComp/";
		f = new File(path);
		f.mkdir();
		for(int x=1; x<=t; x++) {
			String file_name = path + x + "_changes_sync.csv";
			init_file(file_name);
			for(int i=1; i<=4; i++) {
				//if(x>=4 && i>5) break;
				dt = new Date();
				append_to_file(file_name, do_single_move_SysComp_test(x, x, x));
				System.out.println("Run " + i + "/" + repeat + " done.");
			}
		}
		
		path = base_path + "addGen/";
		f = new File(path);
		f.mkdir();
		for(int x=1; x<=t; x++) {
			String file_name = path + x + "_changes_sync.csv";
			init_file(file_name);
			for(int i=1; i<=repeat; i++) {
				//if(x>=4 && i>5) break;
				dt = new Date();
				append_to_file(file_name, do_single_create_generalization_test(x, x, x));
				System.out.println("Run " + i + "/" + repeat + " done.");
			}
		}

		path = base_path + "delGen/";
		f = new File(path);
		f.mkdir();
		for(int x=1; x<=t; x++) {
			String file_name = path + x + "_changes_sync.csv";
			init_file(file_name);
			for(int i=1; i<=repeat; i++) {
				//if(x>=4 && i>5) break;
				dt = new Date();
				append_to_file(file_name, do_single_remove_generalization_test(x, x, x));
				System.out.println("Run " + i + "/" + repeat + " done.");
			}
		}
		
		path = base_path + "addComp/";
		f = new File(path);
		f.mkdir();
		for(int x=1; x<=t; x++) {
			String file_name = path + x + "_changes_sync.csv";
			init_file(file_name);
			for(int i=1; i<=repeat; i++) {
				//if(x>=4 && i>5) break;
				dt = new Date();
				append_to_file(file_name, do_single_add_SysComp_test(x, x, x));
				System.out.println("Run " + i + "/" + repeat + " done.");
			}
		}

		path = base_path + "delComp/";
		f = new File(path);
		f.mkdir();
		for(int x=1; x<=t-1; x++) {
			String file_name = path + x + "_changes_sync.csv";
			init_file(file_name);
			for(int i=1; i<=repeat; i++) {
				//if(x>=4 && i>5) break;
				dt = new Date();
				append_to_file(file_name, do_single_remove_SysComp_test(x, x, x));
				System.out.println("Run " + i + "/" + repeat + " done.");
			}
		}
	}

	private static Long[] do_n_add_SysComp_test(int x, int y, int z, int n) throws IOException{
		Runtime runtime = Runtime.getRuntime();
		Date dt = new Date();
		System.out.println(dt.getTime() + " - Sizes: " +  x + " deep; " + y + " broad; " + z + " relationships;");
		BenchmarkSync m = new BenchmarkSync(x, y, z);
		SystemAnalysis sa = (SystemAnalysis) m.getSourceResource().getContents().get(0);
		
		for(int i = 0; i < n ; i++) {
			EObject e = return_random_component_container(sa.getOwnedSystemComponentPkg());
//			if(e instanceof SystemComponentPkg p)
//				p.getOwnedSystemComponents().add(
//						SaHelper.createSystemComponent()
//				);
//			else if (e instanceof SystemComponent c)
//				c.getOwnedSystemComponents().add(
//						SaHelper.createSystemComponent()
//				);
			if(e instanceof SystemComponentPkg p)
				SaHelper.insertSystemComponents(p, 1);
			else if (e instanceof SystemComponent c)
				SaHelper.insertSystemComponents(c, 1);
		}
		
		System.out.print("Syncing...");
		long tic = System.currentTimeMillis();
		m.forward();
		long toc = System.currentTimeMillis();
		System.out.println("Done. duration: " + (toc-tic) + "ms");
		m.terminate();
		
		m = null;
		runtime.gc();
		
		Long[] results = {
				toc - tic, 
				bytesToMegabytes(runtime.totalMemory() - runtime.freeMemory())
		};

		return results;
	}
	
	private static EObject return_random_component_container(SystemComponentPkg root) {
		HashSet<EObject> content = new HashSet<>();
		TreeIterator<EObject> iter = root.eAllContents();
		while(iter.hasNext()) {
			EObject e = iter.next();
			if(e instanceof SystemComponentPkg || e instanceof SystemComponent)
				content.add(e);
		}
		int rnd = (int) (Math.random() * content.size());
		return (EObject) content.toArray()[rnd];
	}
	
	public static void test_static_size_increasing_changes() throws IOException{
		int t = 3;
		int changes_increment = 250;
		int max_changes = 2000;
		int changes_start = 250;
		
		int repeats = 200;
		
		Date dt = new Date();
		String base_path = "./csv/syncbenchmark_inc_changes/" + dt.getTime() + "/";
		File f = new File(base_path);
		f.mkdir();
		
		for(int c = changes_start; c <= max_changes; c+=changes_increment) {
			String path = base_path;
			f = new File(path);
			f.mkdir();
			String file_name = path + c + "_changes_sync.csv";
			init_file(file_name);
			for(int i=1; i<=repeats; i++) {
				dt = new Date();
				append_to_file(file_name, do_n_add_SysComp_test(t, t, t, c));
				System.out.println("Run " + i + "/" + repeats + "/" + c + " done.");
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
//		normal_test();
		test_static_size_increasing_changes();
		System.out.println("EOF");
	}

	public static void append_to_file(String path, Long[] data) throws IOException {
		FileWriter fw = new FileWriter(path, true);
		BufferedWriter writer = new BufferedWriter(fw);
		String line = "";
		for(Long val : data) line += val.toString() + ", ";
		writer.write(line + System.lineSeparator());
		writer.close();
	}
	
	public static void init_file(String fqdn) throws IOException {
		FileWriter f = new FileWriter(fqdn);
		f.write("duration, ram;" + System.lineSeparator());
		f.close();
	}
	
	public static void moveSystemComponent(SystemAnalysis sa) {
		SystemComponentPkg root = sa.getOwnedSystemComponentPkg();
		SystemComponent move = root.getOwnedSystemComponents().get(0);
		root.getOwnedSystemComponents().remove(move);
		root.getOwnedSystemComponentPkgs().get(0).getOwnedSystemComponents().add(move);
	}

	public static void moveSystemFunction(SystemAnalysis sa) {
		SystemFunction root = ((SystemFunctionPkg) sa.getOwnedFunctionPkg()).getOwnedSystemFunctions().get(0);
		SystemFunction move = (SystemFunction) root.getOwnedFunctions().get(0); 
		root.getOwnedFunctions().remove(move);
		root.getOwnedSystemFunctionPkgs().get(0).getOwnedSystemFunctions().add(move);
	}

	public static void moveCapability(SystemAnalysis sa) {
		CapabilityPkg root = (CapabilityPkg) sa.getOwnedAbstractCapabilityPkg();
		Capability move = root.getOwnedCapabilities().get(0);
		root.getOwnedCapabilities().remove(move);
		root.getOwnedCapabilityPkgs().get(0).getOwnedCapabilities().add(move);
	}
	
	private static final long MEGABYTE = 1024L * 1024L;
	
	private static long bytesToMegabytes(long bytes) {
	    return bytes / MEGABYTE;
	}
}