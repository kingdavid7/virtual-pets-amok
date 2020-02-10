package virtualpetamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	LitterBox shelterLitterBox = new LitterBox(10);

	private Map<String, VirtualPet> pets = new HashMap<>();

	public void addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public VirtualPet getPetByName(String name) {
		return pets.get(name);
	}

	public Collection<VirtualPet> pets() {
		return pets.values();
	}

	public void showPets() {
		for (Entry<String, VirtualPet> entry : pets.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	public int showPetsSize() {
		return pets.size();
	}

	public void adoptPet(String name) {
		pets.remove(name);
	}

	public void feedAllPets() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feed();
				((OrganicPet) pet).incrThirst();
			}
		}
	}

	public void waterAllPets() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).water();
				((OrganicPet) pet).incrBathroom();
			}
		}
	}

	public void tickAllPets() {
		for (VirtualPet pet : pets()) {
			pet.tick();
		}
		for (VirtualPet pet : pets()) {
			if (pet instanceof Cat) {
				shelterLitterBox.soilLitterBox();
			}
		}
	}

	public void playWithPetByName(String name) {
		VirtualPet petChosen = getPetByName(name);
		petChosen.play();
	}

	public void letOutAllPets() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).letOut();
			}
			if (pet instanceof Cat) {
				((Cat) pet).letOut();
				shelterLitterBox.soilLitterBox();
			}
			if (pet instanceof Dog) {
				((Dog) pet).incrCageLevel();
			}
		}
	}

	public void playWithAllPets() {
		for (VirtualPet pet : pets()) {
			pet.play();
		}
	}

	public void walkAllDogs() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof Walkable) {
				((Walkable) pet).walk();
			}
		}
	}

	public void oilAllRoboticPets() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).oil();
			}
		}
	}

	public void cleanAllDogsCages() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof Dog) {
				((Dog) pet).cleanDogCage();
			}
		}
	}

	public void cleanLitterBox() {
		shelterLitterBox.cleanLitterBox();
	}

	public void showLitterBox() {
		System.out.println("Litter Box dirtiness: " + shelterLitterBox.getSoilLevel());
	}

	public void rechargeRobotBatteries() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).rechargeBattery();
			}
		}
	}
}
