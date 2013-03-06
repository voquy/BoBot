package IUT.BoBot.SmartCells;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AuRevoirCellTest {
	
	AuRevoirCell cell = new AuRevoirCell();
	
	@Test
	public void testAuRevoir() {
		assertEquals("au revoir", cell.ask("au revoir"));
	}
	
	@Test
	public void testNonAuRevoir() {
		assertEquals(null, cell.ask("Tchaoooo"));
	}

}
