package OpenClosedPrinciple2;

public class Main {

	public static void main(String[] args) {
	
		ShapeDrawer drawer = new ShapeDrawer();
		
		ShapeI Circle = new Cerchio();
		ShapeI Rettangolo = new Rectangle();
		ShapeI Triangolo = new Triangle();
		ShapeI esagono = new esagono();
		
		drawer.drawShape(Triangolo);
		drawer.drawShape(Circle);
		drawer.drawShape(esagono);

	}

}
