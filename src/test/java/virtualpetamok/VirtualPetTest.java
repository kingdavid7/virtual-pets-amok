package virtualpetamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldShowRoboticPet() {
		VirtualPet underTest = new RoboCat("name", "description");
		String asString = underTest.toString();
		assertEquals("name	| description	| Happy		 | oil would be nice	|| Rust: 10	| Battery: 100", asString);
	}
}

