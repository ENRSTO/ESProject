package Fluent;

public class Persona {
	
	private String nome;
    private String cognome;
    private int eta;
    private String citta;
    
    public Persona(PersonaBuilder personaBuilder) {
    	this.nome = personaBuilder.nome;
    	this.cognome = personaBuilder.cognome;
    	this.eta = personaBuilder.eta;
    	this.citta = personaBuilder.citta;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public static class PersonaBuilder {
    	
    	 private String nome;
         private String cognome;
         private int eta;
         private String citta;
         
         public PersonaBuilder conNome(String nome) {
        	 this.nome = nome; 
        	 return this;
         }
         
         public PersonaBuilder conCognome(String cognome) {
             this.cognome = cognome;
             return this;
         }
         
         public PersonaBuilder conEta(int eta) {
             this.eta = eta;
             return this;
         }
         
         public PersonaBuilder conCitta(String citta) {
             this.citta = citta;
             return this;
         }
         
         public Persona build() {
             return new Persona(this);
         }
         
    	
    } // PersonaBuilder
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", citta=" + citta + "]";
	}

}
