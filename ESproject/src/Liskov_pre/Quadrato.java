package Liskov_pre;

public class Quadrato extends Rettangolo{

	@Override
	public void setLarghezza(int larghezza) {
		super.setLarghezza(larghezza);
		super.setAltezza(larghezza);
	}

	@Override
	public void setAltezza(int altezza) {
		super.setAltezza(altezza);
		super.setLarghezza(altezza);
	}
	
	public int calcolaAreaQuadrato () {
		return super.getAltezza() * super.getAltezza();
	}
	
}
