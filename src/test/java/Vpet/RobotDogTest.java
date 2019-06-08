package Vpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import momo.VirtualPet;

public class RobotDogTest {
	VirtualPet vpTest = new VirtualPet("Zuma", "Is a Robot Dog", false, true);

	@Test
	public void shouldReturnDogName() {
		String check = vpTest.getPetName();
		assertEquals(check, "Zuma");
	}

	@Test
	public void shouldReturnDogDescription() {
		String check = vpTest.getDescription();
		assertEquals(check, "Is a Robot Dog");
	}

	@Test
	public void shouldReturnRobotDogOilLevel() {
		int check = vpTest.getRoboticPetOilLevel();
		assertEquals(check, 0);
	}

	@Test
	public void shouldReturnPetBoreDom() {
		int check = vpTest.getBoredom();
		assertEquals(check, 47);
	}

}