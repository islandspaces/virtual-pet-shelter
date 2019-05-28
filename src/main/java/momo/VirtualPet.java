package momo;

import java.util.ArrayList;

public class VirtualPet {

	private String petName = "Bubbles";
	private String petName1 = "Ringo";
	private String petName2 = "Fire";
	private String petName3 = "Buster";
	private String petName4 = "Scarlett";
	private String petName5 = "Blue";

	// ArrayList<String> pets = new ArrayList<String>();
	// String[]Integer[][] pets = {{"Bubbles"}, {30}, {20}};
	Object petsObject[][] = { { "Bubble", 30, 25 }, { "Fire", 20, 30 } };

	public void createPet() {

	
		
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetName1() {
		return petName1;
	}

	public void setPetName1(String petName1) {
		this.petName1 = petName1;
	}

	public String getPetName2() {
		return petName2;
	}

	public void setPetName2(String petName2) {
		this.petName2 = petName2;
	}

	public String getPetName3() {
		return petName3;
	}

	public void setPetName3(String petName3) {
		this.petName3 = petName3;
	}

	public String getPetName4() {
		return petName4;
	}

	public void setPetName4(String petName4) {
		this.petName4 = petName4;
	}

	public String getPetName5() {
		return petName5;
	}

	public void setPetName5(String petName5) {
		this.petName5 = petName5;
	}
}
