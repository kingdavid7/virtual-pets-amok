package virtualpetamok;

public abstract class VirtualPet {

	protected String name;
	protected String description;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	protected abstract String health();

	public String happiness() {
		if (health().equals("Dead") || health().equals("Bad") || health().equals("Okay")) {
			return "Unhappy";
		}
		if (health().equals("critical oil level reached") || health().equals("really really needs oil")
				|| (health().equals("really needs oil"))) {
			return "Unhappy \t";
		}
		return "Happy";
	}

	public abstract void tick();

	public abstract void play();
}
