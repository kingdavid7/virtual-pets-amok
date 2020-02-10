package virtualpetamok;

public class RoboDog extends RoboticPet implements Walkable {

	private int needToWalk;

	public RoboDog(String name, String description, int rust, int battery, int needToWalk) {
		this.rust = rust;
		this.battery = battery;
		this.needToWalk = needToWalk;
	}

	public RoboDog(String name, String description) {
		this.name = name;
		this.description = description;
		this.rust = 10;
		this.battery = 100;
		this.needToWalk = 10;
	}

	@Override
	public void tick() {
		super.tick();
		needToWalk += 1;
	}

	@Override
	public String toString() {
		return name + "\t\t| " + description + "\t| " + happiness() + "\t\t | " + health() + "\t|| Rust: " + rust
				+ "\t| Battery: " + battery + "\t\t\t\t|| Need to walk: " + needToWalk;
	}

	@Override
	public int getNeedToWalk() {
		return needToWalk;
	}

	@Override
	public void walk() {
		needToWalk = 0;
	}

}
