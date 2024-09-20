package OpenClosedPrinciple2;

public class Shape {

	void draw (String shapeType) {
		 if (shapeType.equals("Circle")) {
	            drawCircle();
	        } else if (shapeType.equals("Rectangle")) {
	            drawRectangle();
	        }
	}

	private void drawCircle() {
		System.out.println("Drawing Circle");
	}

	private void drawRectangle() {
		System.out.println("Drawing Rectangle");
	}

// io non voglio modificare questa classe

}
