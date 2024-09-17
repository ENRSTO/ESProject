package wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		
		
		ArrayList<Dog> listaDog = new ArrayList<Dog>();
		
		listaDog.add(new Dog("Ettore"));
		listaDog.add(new Dog("maya"));
		
		List<? extends Animal> animali = listaDog;
		System.out.println(animali.get(0));
		
		
	//	System.out.println(a);
		
		List<? super Animal> animals = new ArrayList<Animal>();
		Dog a = new Dog("Etturi");
		animals.add(a);  // Ora funziona correttamente
		System.out.println(animals.get(0));

	}

}
