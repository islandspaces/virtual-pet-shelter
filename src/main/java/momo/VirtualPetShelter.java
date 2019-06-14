package momo;

import java.util.*;
import java.util.Map.Entry;

public class VirtualPetShelter {
	VirtualPet vps;

	private Map<String, VirtualPet> pets = new HashMap<>();

	public VirtualPetShelter() {
		pets.put("Bubbles", new VirtualPet("Bubbles", "This pet is fluffy and lazy", false, true));
		pets.put("Ringo", new VirtualPet("Ringo", "Old fashion dog that loves to cuddle", false, true));
		pets.put("Fire", new VirtualPet("Fire", "Strong and always ready to go", true, false));
		pets.put("Buster", new VirtualPet("Buster", "This pet is loved by all the other dogs", false, true));
		pets.put("Scally", new VirtualPet("Scally", "This pet just love to flaunt her beauty", true, false));
		pets.put("Blue", new VirtualPet("Blue", "This pet loves wild adventure", true, false));
	}

	public void displayPets() {
		System.out.println("Name \t|" + " Hunger " + "|" + " Thirst " + "| " + " Boredom " + "| " + " Robotic Pet "
				+ "| " + " Organic Pet " + " | " + " Oil Level " + " | " + " Cage Cleanliness Level " + " | "
				+ " Shelter Litter Box ");
		System.out.println("==============================================================================="
				+ "====================================================");
		for (Entry<String, VirtualPet> pair : pets.entrySet()) {
			VirtualPet pet = pair.getValue();
			System.out.println(pet.getPetName() + "\t| " + pet.getHunger() + " \t | " + pet.getThirst() + " \t  | "
					+ pet.getBoredom() + " \t     | " + pet.getIsRobotic() + " \t    | " + pet.getIsOrganic()
					+ " \t    | " + pet.getRoboticPetOilLevel() + " \t  | " + pet.getOrganicPetCageCleanlinessLevel()
					+ " \t                     " + "| " + pet.getShelterLitterBox());
		}

	}

	public void addPet(String name, String description, String robotic) {
		boolean petExists = false;
		boolean isOrganic = false;
		boolean isRobotic = false;
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			if (pet.getKey().contains(name)) {
				petExists = true;
				break;
			} else {
				petExists = false;
			}

		}
		if (!petExists) {
			if (robotic.toUpperCase().equals("YES")) {
				isRobotic = true;
				isOrganic = false;
			} else {
				isOrganic = true;
			}
			pets.put(name, new VirtualPet(name, description, isRobotic, isOrganic));
			System.out.println("Thank you! " + name + " has been successfully admitted into our shelter");
		} else {
			System.out.println(name + " is already in our shelter");
		}
	}

	public void adoptPet(String name) {
		boolean validPet = false;
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			if (pet.getKey().contains(name)) {
				validPet = true;
				break;
			} else {
				validPet = false;
			}

		}
		if (validPet) {
			pets.remove(name);
			System.out.println("You have sucessfully adopted " + name);
		} else {
			System.out.println(name + " is not in our shelter");
		}

	}

	public void feedAllPet() {
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			if (!pet.getValue().getIsRobotic().equals(true)) {
				pet.getValue().setHunger(0);
			}
		}
		System.out.println("All the dogs have been fed! ");
	}

	public void waterAllPet() {
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			if (!pet.getValue().getIsRobotic().equals(true)) {
				pet.getValue().setThirst(0);
			}
		}
		System.out.println("All the dogs have been watered");
	}

	public void oilAllRoboticPets() {
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			if (pet.getValue().getIsRobotic().equals(true)) {
				pet.getValue().setRoboticPetOilLevel(25);
			}
		}
		System.out.println("All robotic pets have been oiled! ");
	}

	public void cleanAllOrganicPetsCages() {
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			if (pet.getValue().getIsOrganic().equals(true)) {
				pet.getValue().setOrganicPetCageCleanlinessLevel(100);
			}
		}
		System.out.println("All organic pets' cages have been cleaned! ");
	}

	public void emptyShelterLitterBox() {
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			if (pet.getValue().getIsOrganic().equals(true)) {
				pet.getValue().setShelterLitterBox(0);
			}
		}
		System.out.println("The shelter litter box is successfully emptied! ");
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
			if (pet.getKey().contains(name) && !pet.getValue().getIsRobotic().equals(true)) {
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

	public void oilRoboticPetByName(String name) {
		boolean validPet = false;
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			if (pet.getKey().contains(name) && pet.getValue().getIsRobotic().equals(true)) {
				pet.getValue().setRoboticPetOilLevel(25);
				validPet = true;
				break;
			} else {
				validPet = false;
			}
		}
		if (validPet) {
			System.out.println(" ");
			System.out.println(name + " has successfully been oiled ");
		} else {
			System.out.println(" ");
			System.out.println(name + " is either not in our shelter or is not a robotic pet");
		}
	}

	public void feedPetByName(String name) {
		boolean validPet = false;
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			if (pet.getKey().contains(name) && !pet.getValue().getIsRobotic().equals(true)) {
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
			System.out.println("Sorry, " + name + " is either not in our shelter or is not an organic dog");
		}
	}

	public void tick() {
		for (Entry<String, VirtualPet> pet : pets.entrySet()) {
			if (pet.getValue().getIsOrganic().equals(true)) {
				pet.getValue().setBoredom(40);
				pet.getValue().setHunger(40);
				pet.getValue().setThirst(40);
				pet.getValue().setOrganicPetCageCleanlinessLevel(30);
			} else {
				pet.getValue().setRoboticPetOilLevel(5);
			}
		}
	}
}
