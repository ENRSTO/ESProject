package Fluent;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	
	private String size;
    private String crust;
    private List<String> toppings = new ArrayList<>();

    public Pizza withSize(String size) {
        this.size = size;
        return this;
    }

    public Pizza withCrust(String crust) {
        this.crust = crust;
        return this;
    }

    public Pizza withTopping(String topping) {
        toppings.add(topping);
        return this;
    }
    
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crust='" + crust + '\'' +
                ", toppings=" + toppings +
                '}';
    }


}
