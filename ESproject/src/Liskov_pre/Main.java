package Liskov_pre;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		Rettangolo rettangolo = new Rettangolo();
//		rettangolo.setAltezza(3);
//		rettangolo.setLarghezza(5);
//		System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
//		
//		Rettangolo quadrato = new Quadrato();
//		
//		quadrato.setAltezza(5);
//		
//		System.out.println(quadrato.calcolaArea());
		
		   Quadrato mioQuadrato = new Quadrato(); // il qudrato è una specializzazione della superclasse rettangolo 
		   mioQuadrato.setLarghezza(5);
		   
		   System.out.println(mioQuadrato.calcolaArea());
		   
		   Rettangolo mioRettangolo = mioQuadrato; //upcasting 
		   
		   if (mioRettangolo instanceof Quadrato) {
			   
			   Quadrato QuadratoAncora = (Quadrato) mioRettangolo; // downcasting 
			   System.out.println(QuadratoAncora.calcolaAreaQuadrato());
			   
		   }
		
		

	}

}
