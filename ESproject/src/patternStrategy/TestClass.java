package patternStrategy;

public class TestClass {

	public static void main(String[] args) {
		
		Monster mostro = new Monster();
		mostro.attack();
		mostro.setStrategy(new SuperStrategy());
		mostro.attack();

	}

}
