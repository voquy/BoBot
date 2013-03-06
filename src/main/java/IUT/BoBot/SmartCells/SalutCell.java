package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

/**
 * Reply to Salut.
 *
 */
public class SalutCell implements SmartCell {
	
	public String ask(String question) {
		if(question.contains("Salut"))
		  return "Salut";
		else
		  return null;
	}

}
