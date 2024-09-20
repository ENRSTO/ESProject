package Pattern_single_responsability;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Journal J = new Journal();
		J.addEntry("Giornata difficile");
		J.addEntry("d");
		
		
		Persistence p = new Persistence();

		String filename = "c:\\temp\\journal.txt";
		p.saveToFile(J, filename, true);
		 // windows!
	    Runtime.getRuntime().exec("notepad.exe " + filename);
		
	// 	System.out.println(J);
	}

}
