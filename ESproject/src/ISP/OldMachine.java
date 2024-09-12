package ISP;

public class OldMachine implements Machine{

	@Override
	public void print(Document d) {
		System.out.println("stampo il documento d: " + d);
	} // implementazione di una stampante old style

	@Override
	public void fax(Document d) throws Exception {
		 throw new Exception();
	}

	@Override
	public void scan(Document d) throws Exception {
		 throw new Exception();
		
	}

}
