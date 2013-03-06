package IUT.BoBot.SmartCells;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DateHierTest {

	DateHier cell = new DateHier();
	
	@Test
	public void testDateHier() {
		assertEquals("05/03/13", cell.ask("hier"));
	}
	
	@Test
	public void testNonDateHier() {
		assertEquals(null, cell.ask("Tchaoooo"));
	}


}
