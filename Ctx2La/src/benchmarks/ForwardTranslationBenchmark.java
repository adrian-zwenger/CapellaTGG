package benchmarks;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;


public class ForwardTranslationBenchmark {

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
		f.write("depth, elements, relations, ram, duration, elements;" + System.lineSeparator());
		f.close();
	}
	
	public static Long[] do_single_test(int x, int y, int z) throws IOException {
		Runtime runtime = Runtime.getRuntime();
		Date dt = new Date();
		System.out.println(dt.getTime() + " - Sizes: " +  x + " deep; " + y + " broad; " + z + " relationships;");
		InstanceMaker m = new InstanceMaker(x, y, z);
		m.create_tripel();
		
		Long duration = m.forward_duration;
		Long count = Long.valueOf(m.src_model_gen.element_count);
		Long m_ram = m.needed_ram;
		m.terminate();
		m = null;
		runtime.gc();

		Long[] results = {
				Long.valueOf(x), Long.valueOf(y), Long.valueOf(z),
				m_ram, duration, count
			};
		return results;
	}
	
	public static void main(String[] args) throws IOException{
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();

		int depth = 4;
		int width = 4;
		int relations = 4;
		int repetitions = 200;
		
		Date dt = new Date();
		String path = "./csv/" + dt.getTime() + "/";
		
		ForwardTranslationBenchmark tr = new ForwardTranslationBenchmark();
		File f = new File(path);
		f.mkdir();
		
//		for(int x=1; x<=depth; x++) {
//			for(int y=1; y<=width; y++) {
//				String file_name = path + x + "_" + y + "_" + relations + ".csv";
//				init_file(file_name);
//				for(int r=0; r<repetitions; r++) {
//					append_to_file(file_name, do_single_test(x, y, relations));
//					runtime.gc();
//				}
//			}
//		}

		for(int x=4; x<=8; x+=2) {
			String file_name = path + 2 + "_" + x + "_" + x + ".csv";
			init_file(file_name);
			for(int r=1; r<=repetitions; r++) {
				append_to_file(file_name, do_single_test(2, x, 2));
			}
		}
//		
//		for(int x=1; x<=depth; x++) {
//			String file_name = path + x + "_" + x + "_" + x + ".csv";
//			init_file(file_name);
//			for(int r=1; r<=repetitions; r++) {
//				append_to_file(file_name, do_single_test(x, x, x));
//			}
//		}
		System.out.println("EOF");
	}

	private static final long MEGABYTE = 1024L * 1024L;
	
	private static long bytesToMegabytes(long bytes) {
	    return bytes / MEGABYTE;
	}

}
