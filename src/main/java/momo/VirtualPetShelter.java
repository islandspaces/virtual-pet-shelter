package momo;

import static org.junit.Assert.assertTrue;

import java.util.*;
import java.util.Map.Entry;

public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<>();

	public VirtualPetShelter() {

		pets.put("Bubbles", new VirtualPet("Bubbles", "This pet is fluffy and lazy", 55, 20, 40));
		pets.put("Ringo", new VirtualPet("Ringo", "Old fashion dog that loves to cuddle", 35, 25, 60));
		pets.put("Fire", new VirtualPet("Fire", "Strong and always ready to go", 44, 55, 35));
		pets.put("Buster", new VirtualPet("Buster", "This pet is loved by all the other dogs", 60, 20, 40));
		pets.put("Scally", new VirtualPet("Scally", "This pet just love to flaunt her beauty", 45, 35, 80));
		pets.put("Blue", new VirtualPet("Blue", "This pet loves wild adventure", 44, 50, 10));
	}

	public void displayPets() {
		System.out.println("Name " + " | " + " Hunger " + "|" + " Thirst " + "|" + " Boredom");
		System.out.println("=======================================");
		for (Entry<String, VirtualPet> pair : pets.entrySet()) {
			VirtualPet pet = pair.getValue();
			System.out.println(pet.getPetName() + "\t " + pet.getHunger() + " \t " + pet.getThirst() + " \t "
					+ pet.getBoredom() + " \t ");
		}

	}

	public void addPet(String name, String description) {
		boolean validPet = false;
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			if (pet.getKey().contains(name)) {
				validPet = true;
				break;
			} else {
				validPet = false;
			}

		}
		if (!validPet) {
			pets.put(name, new VirtualPet(name, description));
			System.out.println("Thank you! " + name + " has been successfully admitted into our shelter");
		}
		else {
			System.out.println(name + " is already in our shelter");
		}
	}

	public VirtualPet adoptPet(String name) {
		return pets.remove(name);
	}

	public void feedAllPet() {
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			pet.getValue().setHunger(0);
		}
		System.out.println("All the dogs have been fed! ");
	}

	public void waterAllPet() {
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			pet.getValue().setThirst(0);
		}
		System.out.println("All the dogs have been watered");
	}

	public void playwithPet(String name) {
		boolean validPet = false;
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			if (pet.getKey().contains(name)) {
				pets.get(name).setBoredom(0);
				validPet = true;
				break;
			} else {
				validPet = false;
			}
		}
		if (validPet) {
			System.out.println("You have played with " + name);
		} else {
			System.out.println("Sorry, we do not have any pet with that name in our shelter");
		}
	}

	public void waterPetByName(String name) {
		boolean validPet = false;
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			if (pet.getKey().contains(name)) {
				pet.getValue().setThirst(0);
				validPet = true;
				break;
			} else {
				validPet = false;
			}
		}
		if (validPet) {
			System.out.println(name + " has been watered ");
		} else {
			System.out.println("Sorry, we do not have any pet with that name in our shelter");
		}

	}

	public void feedPetByName(String name) {
		boolean validPet = false;
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			if (pet.getKey().contains(name)) {
				pet.getValue().setHunger(0);
				validPet = true;
				break;
			} else {
				validPet = false;
			}
		}
		if (validPet) {
			System.out.println(name + " has been fed ");
		} else {
			System.out.println("Sorry, we do not have any pet with that name in our shelter");
		}
	}

	void tick() {

	}
}
