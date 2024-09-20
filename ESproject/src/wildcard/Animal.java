package wildcard;

public class Animal {
	
	private String name;
	
	public Animal(String name) {
		//super();
		this.name = name;
	}
	
	void verso() {
		System.out.println("verso animale!");
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

}
