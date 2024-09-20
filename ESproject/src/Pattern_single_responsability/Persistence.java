package Pattern_single_responsability;

import java.io.File;
import java.io.PrintStream;

// classe che gestisce la persistenza
public class Persistence {
	
	public void saveToFile(Journal journal, 
			String filename, boolean overwrite) throws Exception {
		
		if (overwrite || new File(filename).exists()) {
			
			try (PrintStream out = new PrintStream(filename)){
				 out.println(journal.toString());
			} // try 
		} // i f
		
	}  // saveToFile
	 
	

}