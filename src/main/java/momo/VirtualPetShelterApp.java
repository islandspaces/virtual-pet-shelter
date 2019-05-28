package momo;

import java.util.Scanner;

public class VirtualPetShelterApp {
	
	public static void main (String[] arg) {
		
	VirtualPet vp = new VirtualPet();
	VirtualPetShelter vps = new VirtualPetShelter();
	Scanner input = new Scanner(System.in);
		
	//displayMessages();
//	System.out. println("What would you like to do next? ");
//	 int userInput = input.nextInt();
		
	 vp.createPet();
	      //vps.getShelterPets();
		//VirtualPetShelter.getPetByName("Hope");
	   //vps.intakeHomelessPet("Hope", "This is Marie's new dog");
		//vps.getShelterPets();
		//VirtualPetShelter.getPetByName("Blue");
		
	
	  
	}
	
	 public static void displayMessages()
	   {		
		 System.out.println ("Welcome! And thank you for volunteering at Momo Virtual Pet Shelter");
		 System.out.println(" ");
			System.out.println("Here is the status of our pets currently in our shelter");
	   }
}
