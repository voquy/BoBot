package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeyCellTest {
	
	HeyCell cell = new HeyCell();

	@Test
	public void testHey() {
		assertEquals("Hey", cell.ask("Hey!"));
	}
	
	@Test
	public void testNotHey() {
		assertEquals(null, cell.ask("au revoir"));
	}

}
