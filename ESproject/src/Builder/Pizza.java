package Builder;

import java.util.List;

public class Pizza {
	
	private String impasto;
    private String salsa;
    private List<String> formaggi;
    private List<String> condimenti;
    
	public Pizza(String impasto, String salsa, List<String> formaggi, List<String> condimenti) {
		super();
		this.impasto = impasto;
		this.salsa = salsa;
		this.formaggi = formaggi;
		this.condimenti = condimenti;
	}
	
	public String getImpasto() {
		return impasto;
	}
	public void setImpasto(String impasto) {
		this.impasto = impasto;
	}
	public String getSalsa() {
		return salsa;
	}
	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}
	public List<String> getFormaggi() {
		return formaggi;
	}
	public void setFormaggi(List<String> formaggi) {
		this.formaggi = formaggi;
	}
	public List<String> getCondimenti() {
		return condimenti;
	}
	public void setCondimenti(List<String> condimenti) {
		this.condimenti = condimenti;
	}

	@Override
	public String toString() {
		return "Pizza [impasto=" + impasto + ", salsa=" + salsa + ", formaggi=" + formaggi + ", condimenti="
				+ condimenti + "]";
	}
    
    
}
