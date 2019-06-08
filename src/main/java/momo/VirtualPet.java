package momo;

public class VirtualPet {

	private String petName;
	private int hunger;
	private int thirst;
	private int boredom;
	private String description;
	private Boolean isRobotic;
	private Boolean isOrganic;
	private int roboticPetOilLevel;
	private int organicPetCageCleanlinessLevel;
	private int shelterLitterBox;

	public VirtualPet(String petName, String description, Boolean isRobotic, Boolean isOrganic) {
		this.petName = petName;
		this.description = description;
		this.isRobotic = isRobotic;
		this.isOrganic = isOrganic;
		if (getIsRobotic().equals(true)) {
			this.roboticPetOilLevel = 10;
		}
		if (getIsOrganic().equals(true)) {
			this.hunger = 25;
			this.thirst = 35;
			this.boredom = 47;
			this.organicPetCageCleanlinessLevel = 15;
			this.shelterLitterBox = 20;
		}	
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

	public Boolean getIsRobotic() {
		return isRobotic;
	}

	public void setIsRobotic(Boolean isRobotic) {
		this.isRobotic = isRobotic;
	}

	public Boolean getIsOrganic() {
		return isOrganic;
	}

	public void setIsOrganic(Boolean isOrganic) {
		this.isOrganic = isOrganic;
	}

	public int getRoboticPetOilLevel() {
		return roboticPetOilLevel;
	}

	public void setRoboticPetOilLevel(int roboticPetOilLevel) {
		this.roboticPetOilLevel = roboticPetOilLevel;
	}

	public int getOrganicPetCageCleanlinessLevel() {
		return organicPetCageCleanlinessLevel;
	}

	public void setOrganicPetCageCleanlinessLevel(int organicPetCageCleanlinessLevel) {
		this.organicPetCageCleanlinessLevel = organicPetCageCleanlinessLevel;
	}

	public int getShelterLitterBox() {
		return shelterLitterBox;
	}

	public void setShelterLitterBox(int shelterLitterBox) {
		this.shelterLitterBox = shelterLitterBox;
	}
}
