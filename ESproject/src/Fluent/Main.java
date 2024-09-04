package Fluent;

public class Main {

	public static void main(String[] args) {

			Persona pers = new Persona.PersonaBuilder()
					 .conNome("Mario")
				        .conCognome("Rossi")
				        .conEta(30)
				        .conCitta("Roma")
					.build();
	
		System.out.println(pers.toString());
		
		System.out.println(pers.getCitta());
		
		
		Pizza pizza = new Pizza()
		        .withSize("large")
		        .withCrust("thin")
		        .withTopping("pepperoni")
		        .withTopping("mushrooms");

		System.out.println(pizza);
		
		
	}

}
