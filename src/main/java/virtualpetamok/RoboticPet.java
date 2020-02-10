package virtualpetamok;

public abstract class RoboticPet extends VirtualPet {

	protected int rust;
	protected int battery;

	@Override
	public String toString() {
		return name + "\t| " + description + "\t| " + happiness() + "\t\t | " + health() + "\t|| Rust: " + rust
				+ "\t| Battery: " + battery;
	}

	public int getRust() {
		return rust;
	}

	public int getBattery() {
		return battery;
	}

	// robotic class specific methods
	public void oil() {
		rust = 0;
	}

	public void rechargeBattery() {
		battery = 100;
	}

	// overridden methods
	@Override
	public void tick() {
		int tickAmnt = 1;
		rust += tickAmnt;
		if (battery > 0) {			
			battery -= tickAmnt;
		}
		battery = 0; 
	}

	@Override
	public String health() {
		if (rust >= 50) {
			return "critical oil level reached";
		}
		if (rust >= 40) {
			return "really really needs oil";
		}
		if (rust >= 30) {
			return "really needs oil";
		}
		if (rust >= 20) {
			return "kind a needs oil";
		}
		if (rust >= 10) {
			return "oil would be nice";
		}
		if (rust > 0) {
			return "oil is a treat";
		}
		return "oil full";
	}

	@Override
	public void play() {
		battery = 0;
	}
}
