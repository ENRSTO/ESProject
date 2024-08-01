package OpenClosedPrinciple;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
		Product tree = new Product("Tree", Color.GREEN, Size.MEDIUM);
		Product House = new Product("House", Color.BLUE,Size.LARGE);
		
		
		List<Product> products = List.of(apple,tree,House);
		
		ProductFilter pf = new ProductFilter();
		
		pf.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(p.name + " is green"));
		
		
		BetterFilter bf = new BetterFilter();
		System.out.println(" nuovo filtro :");
		
		bf.filter(products, new ColorSpecification(Color.GREEN)).forEach(p -> System.out.println(p.name +" is Green new"));
		
		
		
	}

}
