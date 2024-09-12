package ISP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Printer printer1 = new Printer() {
			@Override
			public void Print(Document d) throws Exception {
				System.out.println("stampo doc da model1  " + d.getTestoaggiunto());
			}
		};
		
		Printer nuovaPri1 = new Printer() {
			
			@Override
			public void Print(Document d) throws Exception {
				System.out.println("stampo doc da model1  " + d.getTestoaggiunto() +  " con figata aggiunta ");
			} // 
		};
		
		
		Iscanner scanner1 = new Iscanner() {
			@Override
			public void Scan(Document d) throws Exception {
				System.out.println("scanerizzo il documentoda mod scan1 " + d.getTestoaggiunto());
			}
		};
		
		
		Document documento1 = new Document("ciao sono Enrico");
		
		AllInOne stamp = new AllInOne(printer1, scanner1);
		
		AllInOne stamp1 = new AllInOne(nuovaPri1, scanner1);
		
		System.out.println("prova stampante : ");
		try {
			stamp.Print(documento1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			stamp.Scan(documento1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("prova stampante Nuova : ");

		try {
			stamp1.Print(documento1);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			stamp1.Scan(documento1);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
