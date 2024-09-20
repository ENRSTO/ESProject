package Builder;

public abstract class MainPizza {

	public static void main(String[] args) {

		Pizza pizza = new PizzaBuilder()
		        .withImpasto("integrale")
		        .withSalsa("pomodoro")
		        .addFormaggio("mozzarella")
		        .addFormaggio("gorgonzola")
		        .addFormaggio("Burrata")
		        .addCondimento("basilico")
		        .build();
		
		
		System.out.println(pizza);
	}
	

}
