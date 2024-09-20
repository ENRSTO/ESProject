package ISP;

public class Document {
	
	private final String testo = "sono un documento";
	private String testoaggiunto;
	
	
	public String getTestoaggiunto() {
		return testoaggiunto;
	}
	
	public void setTestoaggiunto(String testoaggiunto) {
		this.testoaggiunto = testoaggiunto;
	}
	
	public Document(String testoaggiunto) {
		super();
		this.testoaggiunto = testoaggiunto;
	}

} // docuemnto 
