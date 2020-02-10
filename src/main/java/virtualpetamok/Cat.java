package virtualpetamok;

public class Cat extends OrganicPet {

	public Cat(String name, String description, int hunger, int thirst, int bathroom, int energy) {
	}

	public Cat(String name, String description) {
		this.name = name;
		this.description = description;
		this.hunger = 10;
		this.thirst = 10;
		this.bathroom = 10;
		this.boredom = 10;
	}

	@Override
	public String toString() {
		return name + "\t\t| " + description + "\t\t| " + happiness() + "\t\t | " + health() + "\t\t|| Hunger: "
				+ hunger + "| Thirst: " + thirst + "| Bathroom: " + bathroom + "| Boredom:" + boredom;
	}

	@Override
	protected String health() {
		if (hunger >= 50 && thirst >= 50 && bathroom >= 50 && boredom >= 50) {
			return "Dead";
		}
		if (hunger > 40 && thirst > 40 && bathroom > 40 && boredom > 40) {
			return "Bad";
		}
		if (hunger > 30 && thirst > 30 && bathroom > 30 && boredom > 30) {
			return "Okay";
		}
		if (hunger > 20 && thirst > 20 && bathroom > 20 && boredom > 20) {
			return "Content";
		}
		if (hunger > 10 && thirst > 10 && bathroom > 10 && boredom > 10) {
			return "Good";
		}
		if (hunger > 0 && thirst > 0 && bathroom > 0 && boredom > 0) {
			return "Great";
		}
		return "Amazing";
	}
}
