package momo;

import java.util.*;
import java.util.Map.Entry;


public class VirtualPetShelter {

	// private String petName;
	private String description;
	//private Enumeration<String> namesOfPet;
	private String petName;
	private static Map<String, String> pet = new HashMap<String, String>();

	public void getShelterPets() {
		pet.put("Bubbles", "This pet is fluffy and lazy");
		pet.put("Ringo", "Old fashion dog that loves to cuddle");
		pet.put("Fire", "Strong and always ready to go");
		pet.put("Buster", "This pet is loved by all the other dogs");
		pet.put("Scarlett", "This pet just love to flaunt her beauty");
		pet.put("Blue", "This pet loves wild adventure");
   
   for(Entry<String, String> entry : pet.entrySet()) {
			System.out.println("[" + entry.getKey() + "]" + " " + entry.getValue());
		}
	}

	public static void getPetByName(String petName) {
		String petFound = null;
		 for(Entry<String, String> keys : pet.entrySet()) {
				if (keys.getKey().contains(petName)) {
					petFound = VirtualPetShelter.pet.get(petName);
					break;
			}
			else {
				petFound = "We do not have that pet in our shelter";
			}
		}
		System.out.println("[" + petName + "]" + " " + petFound);
	}
	
	public void intakeHomelessPet(String newPetName, String petDescription) {
		// for (Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();it.hasNext();) 
		 for(Entry<String, String> entry : pet.entrySet()) {
			 if (entry.getKey().contains(newPetName)){
				 System.out.println("We already have that pet in our shelter");
				 break;		
			}
			 
			else {
				VirtualPetShelter.pet.put(newPetName, petDescription);
				System.out.println("We have successfully taken your pet in our shelter - thank you!");
				}
			 for(Entry<String, String> newList : VirtualPetShelter.pet.entrySet()) {
					System.out.println("[" + newList.getKey() + "]" + " " + newList.getValue());
				}
			}
		}
	

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
