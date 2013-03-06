package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

public class AuRevoirCell implements SmartCell{
	
	public String ask(String question) {
		if(question.contains("au revoir"))
		  return "au revoir";
		else
		  return null;
		
	}
	
}
