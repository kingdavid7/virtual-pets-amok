package virtualpetamok;

public class LitterBox {

	private int soilLevel;

	public LitterBox(int soilLevel) {
		this.soilLevel = soilLevel;
	}

	public int getSoilLevel() {
		return soilLevel;
	}

	public void cleanLitterBox() {
		soilLevel = 0;
	}

	public void soilLitterBox() {
		soilLevel++;
	}
}
