package momo;

public class VirtualPet {

	private String petName;
	private int hunger;
	private int thirst;
	private int boredom;
	private String description;
	
	public VirtualPet(String petName, String description) {
		this.petName = petName;
		this.description = description;
		this.hunger = 0;
		this.thirst = 0;
		this.boredom = 0;
	}
	public VirtualPet(String petName, String description, int hunger, int thirst, int boredom) {
		this.petName = petName;
		this.description = description;
		this.thirst = thirst;
		this.hunger = hunger;
		this.boredom = boredom;
	}
	
	
	
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getHunger() {
		return hunger;
	}
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	public int getThirst() {
		return thirst;
	}
	public void setThirst(int thirst) {
		this.thirst = thirst;
	}
	public int getBoredom() {
		return boredom;
	}
	public void setBoredom(int boredom) {
		this.boredom = boredom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
