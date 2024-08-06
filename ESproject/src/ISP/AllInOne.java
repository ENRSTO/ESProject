package ISP;

import java.nio.channels.MulticastChannel;

public class AllInOne implements MultifunctionDevice {
	
	private Printer printer;
	private Iscanner scanner;
	

	
	
	public AllInOne(Printer printer, Iscanner scanner) {
		super();
		this.printer = printer;
		this.scanner = scanner;
	}

	@Override
	public void Scan(Document d) throws Exception {
		
		scanner.Scan(d);
	}

	@Override
	public void Print(Document d) throws Exception {
		
		printer.Print(d);
		
	}

}
