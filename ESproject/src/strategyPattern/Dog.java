package strategyPattern;

public abstract class Dog {

	EatBehavior eatBehavior;  // 
	BarkBehavior barkBehavior;
	
	public Dog() {
	}

	public void doBark() {
		barkBehavior.bark();
	}

	public void doEat() {
		eatBehavior.eat();
	}

	public abstract void display();

} // Dog
