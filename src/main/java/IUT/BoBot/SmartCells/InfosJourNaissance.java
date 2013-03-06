package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

public class InfosJourNaissance implements SmartCell {


	public String ask(String question) {
		if(question.contains("Quelle est la date du jour ?"))
		{
			String format = "dd/MM/yyyy";

			java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(format);
			java.util.Date date = new java.util.Date();

			System.out.println( formater.format( date ) ); 
			
			return "Ok !";
		}
		else
		  return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
