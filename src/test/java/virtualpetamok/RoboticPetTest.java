package virtualpetamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboticPetTest {
	@Test
	public void shouldGetRustforRoboPets() {
		RoboticPet underTest1 = new RoboDog("name", "description");
		RoboticPet underTest2 = new RoboCat("name", "description");
		int rust1 = underTest1.getRust();
		int rust2 = underTest2.getRust();
		assertEquals(10, rust1);
		assertEquals(10, rust2);
	}

	@Test
	public void shouldOilRoboPets() {
		RoboticPet underTest1 = new RoboDog("name", "description");
		RoboticPet underTest2 = new RoboCat("name", "description");
		underTest1.oil();
		underTest2.oil();
		int rust1 = underTest1.getRust();
		int rust2 = underTest2.getRust();
		assertEquals(0, rust1);
		assertEquals(0, rust2);
	}

	@Test
	public void shouldGetBattery() {
		RoboticPet underTest1 = new RoboDog("name", "description");
		RoboticPet underTest2 = new RoboCat("name", "description");
		int battery1 = underTest1.getBattery();
		int battery2 = underTest2.getBattery();
		assertEquals(100, battery1);
		assertEquals(100, battery2);
	}

	@Test
	public void shouldRechargeBattery() {
		RoboticPet underTest1 = new RoboDog("name", "description", 0, 0, 0);
		RoboticPet underTest2 = new RoboCat("name", "description", 0, 0);
		underTest1.rechargeBattery();
		int battery1 = underTest1.getBattery();
		int battery2 = underTest2.getBattery();
		assertEquals(100, battery1);
		assertEquals(0, battery2);
	}
	
	@Test
	public void shouldPlayWithRoboPets() {
		RoboticPet underTest1 = new RoboDog("name", "description");
		RoboticPet underTest2 = new RoboCat("name", "description");
		underTest1.play();
		int battery1 = underTest1.getBattery();
		int battery2 = underTest2.getBattery();
		assertEquals(0, battery1);
		assertEquals(100, battery2);
	}
	
	@Test
	public void shouldWalkRoboDogs() {
		RoboDog underTest1 = new RoboDog("name", "description");
		RoboDog underTest2 = new RoboDog("name", "description");
		underTest1.walk();
		int needToWalk1 = underTest1.getNeedToWalk();
		int needToWalk2 = underTest2.getNeedToWalk();
		assertEquals(0, needToWalk1);
		assertEquals(10, needToWalk2);
	}
}
