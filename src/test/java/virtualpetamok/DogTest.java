package virtualpetamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DogTest {
	@Test
	public void shouldWalkDog() {
		Dog underTest = new Dog("name", "description");
		underTest.walk();
		int needToWalk = underTest.getNeedToWalk(); 
		assertEquals(0, needToWalk);
	}

	@Test
	public void shouldCreateDogCrate() {
		Dog underTest = new Dog("name", "description");
		int cageLevel = underTest.getCageLevel();
		assertEquals(10, cageLevel);
	}

	@Test
	public void shouldIncrCrateLevel() {
		Dog underTest = new Dog("name", "description");
		underTest.incrCageLevel();
		int cageLevel = underTest.getCageLevel();
		assertEquals(11, cageLevel);
	}

	@Test
	public void shouldCleanDogCrate() {
		Dog underTest = new Dog("name", "description");
		underTest.cleanDogCage();
		int cageLevel = underTest.getCageLevel();
		assertEquals(0, cageLevel);
	}

	@Test
	public void shouldTick() {
		Dog underTest = new Dog("name", "description", 0, 0, 0, 0, 0, 0);
		underTest.tick();
		underTest.getHunger();
		int hunger = underTest.getHunger();
		assertEquals(1, hunger);
		underTest.getThirst();
		int thirst = underTest.getThirst();
		assertEquals(1, thirst);
		underTest.getBathroom();
		int bathroom = underTest.getBathroom();
		assertEquals(1, bathroom);
		underTest.getEnergy();
		int energy = underTest.getEnergy();
		assertEquals(1, energy);
		underTest.getEnergy();
		int cagePoopLevel = underTest.getEnergy();
		assertEquals(1, cagePoopLevel);
		underTest.getEnergy();
		int needToWalk = underTest.getEnergy();
		assertEquals(1, needToWalk);
	}

	@Test
	public void shouldDetermineStatusAmazing() {
		OrganicPet underTest = new Dog("name", "description", 0, 0, 0, 0, 0, 0);
		underTest.health();
		String status = underTest.health();
		assertEquals("Amazing", status);
	}
}
