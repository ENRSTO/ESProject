package Liskov;

public class Quadrato implements Forma{
	
	private int lato;
	
	

	public Quadrato(int lato) {
		super();
		this.lato = lato;
	}



	public int getLato() {
		return lato;
	}



	public void setLato(int lato) {
		this.lato = lato;
	}



	@Override
	public int calcolaArea() {
		return lato * lato ;
	}

}
