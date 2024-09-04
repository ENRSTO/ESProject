package strategyPattern;

public class Labrador extends Dog {

	public Labrador() {
		barkBehavior = new PlayfulBark();
		eatBehavior = new NormalDiet();
	}
	
	@Override
	public void display() {
		System.out.println("Sono un Labrador");
	}

}
