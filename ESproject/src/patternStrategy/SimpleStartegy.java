package patternStrategy;

public class SimpleStartegy implements Strategy{

	@Override
	public void attack() {
		System.out.println("NORMAL ATTACK!");
	}

}
