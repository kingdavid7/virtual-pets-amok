package virtualpetamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatTest {

	@Test
	public void shouldTick() {
		Cat underTest = new Cat("name", "description", 0, 0, 0, 0);
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
	}
	
	@Test
	public void shouldDetermineStatusAmazing() {
		Cat underTest = new Cat("name", "description", 0, 0, 0, 0);
		underTest.health();
		String status = underTest.health();
		assertEquals("Amazing", status);
	}
}
