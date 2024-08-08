package Builder;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

	private String impasto;
    private String salsa;
    private List<String> formaggi = new ArrayList<>();
    private List<String> condimenti = new ArrayList<>();
    
    
    public PizzaBuilder withImpasto(String impasto) {
        this.impasto = impasto;
        return this;
    }

    public PizzaBuilder withSalsa(String salsa) {
        this.salsa = salsa;
        return this;
    }
    
    public PizzaBuilder addFormaggio(String formaggio) {
        formaggi.add(formaggio);
        return this;
    }
    
    public PizzaBuilder addCondimento(String condimento) {
        condimenti.add(condimento);
        return this;
    }
    
    public Pizza build() {
        return new Pizza(impasto, salsa, formaggi, condimenti);
    }
    
    
	
	
}
