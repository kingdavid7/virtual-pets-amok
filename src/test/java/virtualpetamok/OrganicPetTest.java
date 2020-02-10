package virtualpetamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicPetTest {
	@Test
	public void shouldGetHunger() {
		OrganicPet underTest = new Dog("name", "description");
		int hunger = underTest.getHunger();
		assertEquals(10, hunger);
	}

	@Test
	public void shouldGetThirst() {
		OrganicPet underTest = new Dog("name", "description");
		int thirst = underTest.getThirst();
		assertEquals(10, thirst);
	}

	@Test
	public void shouldGetBathroom() {
		OrganicPet underTest = new Cat("name", "description");
		int bathroom = underTest.getBathroom();
		assertEquals(10, bathroom);
	}

	@Test
	public void shouldGetEnergy() {
		OrganicPet underTest = new Cat("name", "description");
		int energy = underTest.getEnergy();
		assertEquals(10, energy);
	}

	@Test
	public void shouldGetStatus() {
		OrganicPet underTest = new Cat("name", "description");
		String status = underTest.health();
		assertEquals("Great", status);
	}

	@Test
	public void shouldDecreaseHunger() {
		OrganicPet underTest = new Cat("name", "description");
		underTest.feed();
		int hunger = underTest.getHunger();
		assertEquals(0, hunger);
	}

	@Test
	public void shouldDecreaseThirst() {
		OrganicPet underTest = new Cat("name", "description");
		underTest.water();
		int thirst = underTest.getThirst();
		assertEquals(0, thirst);
	}

	@Test
	public void shouldDecreaseBathroom() {
		OrganicPet underTest = new Cat("name", "description");
		underTest.letOut();
		int bathroom = underTest.getBathroom();
		assertEquals(0, bathroom);
	}

	@Test
	public void shouldDecreaseEnergy() {
		OrganicPet underTest = new Cat("name", "description");
		underTest.play();
		int energy = underTest.getEnergy();
		assertEquals(0, energy);
	}


}
