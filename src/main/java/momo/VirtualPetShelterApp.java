package momo;

import java.awt.Window;
import java.util.Scanner;

public class VirtualPetShelterApp {
	
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		int userInput;
		VirtualPetShelter vps = new VirtualPetShelter();
		
		VirtualPetShelterApp vpsa = new VirtualPetShelterApp();
		vpsa.displayMessages();
		vps.displayPets();
		System.out.println(" ");

		
		do {
			System.out.println(" ");
			System.out.println("What would you like to do next? ");
			System.out.println(" ");
			System.out.println("1. Feed all the pets ");
			System.out.println("2. Feed a single pet ");
			System.out.println("3. Water all the pets ");
			System.out.println("4. Water a single pet ");
			System.out.println("5. Play with a pet ");
			System.out.println("6. Adopt a pet ");
			System.out.println("7. Admit a pet ");
			System.out.println("8. Oil all robotic pets ");
			System.out.println("9. Oil a robotic pet ");
			System.out.println("10. Clean all organic pets cages ");
			System.out.println("11. Empty Shelter Litter Box ");
			System.out.println("12. Quit ");

			//userInput = Integer.parseInt(input.nextLine());
			userInput = input.nextInt();
			input.nextLine();
			

			switch (userInput) {
			case 1:
				vps.feedAllPet();
				System.out.println(" ");
				vps.displayPets();
				break;
			case 2:
				System.out.println("Enter the pet's name to feed");
				String name = input.nextLine();
				vps.feedPetByName(name);
				System.out.println(" ");
				vps.displayPets();
				break;
			case 3:
				vps.waterAllPet();
				System.out.println(" ");
				vps.displayPets();
				break;
			case 4:
				System.out.println("Enter the pet's name to water");
				name = input.nextLine();
				vps.waterPetByName(name);
				System.out.println(" ");
				vps.displayPets();
				break;
			case 5:
				System.out.println("Enter the pet's name to play with");
				name = input.nextLine();
				vps.playwithPet(name);
				System.out.println(" ");
				vps.displayPets();
				break;
			case 6: 
				System.out.println("Enter the name of the pet you'd like to adopt ");
				name = input.nextLine();
				System.out.println(" ");
				vps.adoptPet(name);
				break;
			case 7:
				System.out.println("Enter the name of the pet to admit");
				name = input.nextLine();
				System.out.println("Enter a description of the pet");
				String description = input.nextLine();
				System.out.println("Is your pet robotic? ");
				String isRobotic = input.nextLine();
				vps.addPet(name, description, isRobotic);
				System.out.println(" ");
				vps.displayPets();
				break;
			case 8:
				vps.oilAllRoboticPets();
				System.out.println(" ");
				vps.displayPets();
				break;
			case 9: 
				System.out.println("Enter the name of the robotic pet to oil");
				name = input.nextLine();
				vps.oilRoboticPetByName(name);
				System.out.println(" ");
				vps.displayPets();
				break;
			case 10:
				vps.cleanAllOrganicPetsCages();
				System.out.println(" ");
				vps.displayPets();
				break;
			case 11:
				vps.emptyShelterLitterBox();
				System.out.println(" ");
				vps.displayPets();
				break;
			case 12:
				System.out.println("Thank you for volunteering. You've successfully quit the game! ");
				System.exit(0);
			}
			vps.tick();
		} while (userInput != 12);
	}

	
	public void displayMessages() {
		System.out.println("Welcome and thank you for volunteering at Momo Virtual Pet Shelter!");
		System.out.println(" ");
		System.out.println("Here is the status of "
				+ "pets currently in our shelter: ");
		System.out.println(" ");
	}

}
