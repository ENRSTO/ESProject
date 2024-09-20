package Pattern_single_responsability;

import java.util.ArrayList;
import java.util.List;
// single responsibiliy
public class Journal {

	private static List<String> entries = new ArrayList<String>();
	private static int count = 0; 

	public void addEntry(String text) {
		entries.add(" " +  (++count)+":" + text);
	} // addEntry

	public void removeEntry(int index) {
		entries.remove(index);
	} // removeEntry


	@Override
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}
}






