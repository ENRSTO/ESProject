package Liskov;

public class Rettangolo implements Forma {

	private int larghezza;
	private int altezza;
	
	public Rettangolo(int larghezza, int altezza) {
		super();
		this.larghezza = larghezza;
		this.altezza = altezza;
	}

	public int getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	@Override
	public int calcolaArea() {
		return larghezza * altezza;
	}

}
