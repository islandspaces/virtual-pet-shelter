package momo;

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
			System.out.println("What would you like to do next? ");
			System.out.println(" ");
			System.out.println("1. Feed all the pets ");
			System.out.println("2. Feed a single pet ");
			System.out.println("3. Water all the pets ");
			System.out.println("4. Water a single pet ");
			System.out.println("5. Play with a pet ");
			System.out.println("6. Adopt a pet ");
			System.out.println("7. Admit a pet ");
			System.out.println("8. Quit ");

			userInput = Integer.parseInt(input.nextLine());

			switch (userInput) {
			case 1:
				vps.feedAllPet();
				break;
			case 2:
				System.out.println("Enter the pet's name to feed");
				String name = input.nextLine();
				vps.feedPetByName(name);
				break;
			case 3:
				vps.waterAllPet();
				break;
			case 4:
				System.out.println("Enter the pet's name to water");
				name = input.nextLine();
				vps.waterPetByName(name);
				break;
			case 5:
				System.out.println("Enter the pet's name to play with");
				name = input.nextLine();
				vps.playwithPet(name);
				break;
			case 6: 
				System.out.println("Enter the name of the pet you'd like to adopt ");
				name = input.nextLine();
				vps.adoptPet(name);
				break;
			case 7:
				System.out.println("Enter the name of the pet to admit");
				name = input.nextLine();
				System.out.println("Enter a description of the pet");
				String description = input.nextLine();
				vps.addPet(name, description);
				vps.displayPets();
				break;
			}
		} while (userInput != 8);
	}

	
	public void displayMessages() {
		System.out.println("Welcome! And thank you for volunteering at Momo Virtual Pet Shelter");
		System.out.println(" ");
		System.out.println("Here is the status of our pets currently in our shelter: ");
		System.out.println(" ");
	}

}
