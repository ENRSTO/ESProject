package patternStrategy;

public class Monster {
	
	Strategy strategy;  
	
	

	public Monster() {
		super();
		this.strategy = new SimpleStartegy();
	}

	public void setStrategy (Strategy newStrategy) {
		this.strategy = newStrategy;
	}
	
	public void attack () {
		strategy.attack();
	}

}
