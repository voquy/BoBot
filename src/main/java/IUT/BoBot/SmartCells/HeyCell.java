package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

/**
 * Reply to Hey.
 *
 */
public class HeyCell implements SmartCell {
	
	public String ask(String question) {
		if(question.contains("Hey!"))
		  return "Hey";
		else
		  return null;
	}

}
