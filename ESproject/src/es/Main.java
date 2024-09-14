package es;

public class Main {

	public static void main(String[] args) {

		//Cane ettore = new Cane();
		Animale an = new Cane();
		an.faiVerso();  //upcasting implicito
		
		// Downcasting esplicito
		
		Cane cane = (Cane) an;
		cane.abbaia();
		
		
	}

}
