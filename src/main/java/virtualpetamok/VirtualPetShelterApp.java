package virtualpetamok;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter myShelter = new VirtualPetShelter();

		System.out.println("Welcome to Dayton Virtual Pet Program for All: (DVPPA).");
		System.out.println("Instructions: Some Pets will be organic... some Pets will be robotic!");

		myShelter.addPet(new Cat("Baboo", "Cat"));
		myShelter.addPet(new Cat("Tom", "Cat"));
		myShelter.addPet(new Dog("Bolt", "Dog"));
		myShelter.addPet(new RoboCat("Gazo", "RoboCat"));
		myShelter.addPet(new RoboDog("Mr Ma", "RoboDog"));

		String option = "";
		while (!option.equals("quit")) {

			// pets displayed
			System.out.println();
			System.out.println("Virtual Pet inventory:");
			System.out.println();
			System.out
					.println("Name \t\t| Description \t| Happiness \t | Health \t\t|| Robotic or Organic Attributes ");
			System.out.println(
					"_________________________________________________________________________________________________________________________________________________________________________________");
			myShelter.showPets();
			System.out.println(
					"_________________________________________________________________________________________________________________________________________________________________________________");
			myShelter.showLitterBox();
			System.out.println();
			
			myShelter.tickAllPets();
			
			System.out.println("What would you like to do?");
			System.out.println("1) Feed all (organic) pets.");
			System.out.println("2) Water all (organic) pets.");
			System.out.println("3) Let out all (organic) pets to go to the bathroom .");
			System.out.println("4) Playtime for all pets.");
			System.out.println("5) Play with just one pet.");
			System.out.println("6) Walk all dogs (robotic and organic).");
			System.out.println("7) Oil all robots.");
			System.out.println("8) Recharge all robot batteries.");
			System.out.println("9) Clean (organic) cats' litterbox.");
			System.out.println("10) Clean all (organic) dogs cages.");
			System.out.println("11) Choose a pet to be adopted by a loving family.");
			System.out.println("12) Invite a new pet to BitBuddies.");
			System.out.println("Or type 'quit' to exit game.");
			option = input.nextLine();
			System.out.println();

			if (option.equals("1")) {
				myShelter.feedAllPets();
				System.out.println("You have chosen to feed all of the organic pets. But now thirst has increased.");
			}
			if (option.equals("2")) {
				myShelter.waterAllPets();
				System.out.println(
						"You have chosen to water all of the organic pets. But now need to go to the bathroom has increased.");
			}
			if (option.equals("3")) {
				myShelter.letOutAllPets();
				System.out.println("You have chosen to let all of the organic pets go to the bathroom. But now the cats' litterbox and dog's cages are getting dirtier.");
			}
			if (option.equals("4")) {
				myShelter.playWithAllPets();
				System.out.println("You have chosen to play with all the pets. Organic pet boredom is now zero and robotic pet battery is drained. ");
			}
			if (option.equals("5")) {
				System.out.println("Which pet would you like to play with? please Type name:");
				String petChosen = input.nextLine();
				myShelter.playWithPetByName(petChosen);
				System.out.println("You have chosen to play with " + petChosen + ".");
			}
			if (option.equals("6")) {
				myShelter.walkAllDogs();
				System.out.println("You have chosen to walk all of the organic and robotic dogs. Need to walk is now zero.");
			}
			if (option.equals("7")) {
				myShelter.oilAllRoboticPets();
				System.out.println("You have chosen to oil all of the robotic pets. Rust is now zero.");
			}
			if (option.equals("8")) {
				myShelter.rechargeRobotBatteries();
				System.out.println("You have chosen to reacharge all robot batteries. Battery is now at 100.");
			}
			if (option.equals("9")) {
				myShelter.cleanLitterBox();
				System.out.println("You have cleaned the organic cats' litterbox.");
			}
			if (option.equals("10")) {
				myShelter.cleanAllDogsCages();
				System.out.println("You have cleaned the organic dog's cages.");
			}
			if (option.equals("11")) {
				System.out.println("Which pet would you like to be adopted? please Type name:");
				String petChosen = input.nextLine();
				myShelter.adoptPet(petChosen);
				System.out.println("You have chosen to send " + petChosen + " to be adopted. leaving DVPPA ");
			}
			if (option.equals("12")) {
				System.out.println("Please enter the name of the pet you would like to add:");
				String newPetName = input.nextLine();
				System.out.println("Please enter the type of the pet you would like to admit.");
				System.out.println("1) Cat");
				System.out.println("2) Dog");
				System.out.println("3) RoboCat");
				System.out.println("4) RoboDog");
				String newPetType = input.nextLine();
				if (newPetType.equals("1")) {
					System.out.println("Please enter a breif description of the pet: ");
					String newPetDescription = input.nextLine();
					VirtualPet newPet = new Cat(newPetName, newPetDescription);
					myShelter.addPet(newPet);
				}
				if (newPetType.equals("2")) {
					System.out.println("Please enter a breif description of the pet: ");
					String newPetDescription = input.nextLine();
					VirtualPet newPet = new Dog(newPetName, newPetDescription);
					myShelter.addPet(newPet);
				}
				if (newPetType.equals("3")) {
					System.out.println("Please enter a breif description of the pet: ");
					String newPetDescription = input.nextLine();
					VirtualPet newPet = new RoboCat(newPetName, newPetDescription);
					myShelter.addPet(newPet);
				}
				if (newPetType.equals("4")) {
					System.out.println("Please enter a breif description of the pet: ");
					String newPetDescription = input.nextLine();
					VirtualPet newPet = new RoboDog(newPetName, newPetDescription);
					myShelter.addPet(newPet);
				}
				System.out.println("You have added " + newPetName + " to DVPPA Program.");
			}
			if (option.equalsIgnoreCase("Quit")) {
				System.out.println("Goodbye!");
				input.close();
				System.exit(0);
			}
		}
	}
}
