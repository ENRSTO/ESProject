package patternStrategy;

public class SuperStrategy implements Strategy{

	@Override
	public void attack() {
		System.out.println("Attacco super");
	}
}
