package Liskov_pre;

public class Rettangolo {
	private int larghezza;
	private int altezza;

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

	public int calcolaArea() {
		return larghezza * altezza;
	}

}
