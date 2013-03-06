package IUT.BoBot.SmartCells;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import IUT.BoBot.SmartCell;

public class InfosJourNaissance implements SmartCell {


	public String ask(String question) {
		if(question.contains("Je suis né le 05/02/91"))
		{
			String jour = "";
			
			Calendar calendar = new GregorianCalendar();
			calendar.set(1991, 2, 5);
			int today = calendar.get(calendar.DAY_OF_WEEK);
		 
			switch (today) {
				case GregorianCalendar.MONDAY:
					jour = "Lundi";
					break;
				case GregorianCalendar.TUESDAY:
					jour = "Mardi";
				break;
				case GregorianCalendar.WEDNESDAY:
					jour = "Mercredi";
					break;
				case GregorianCalendar.THURSDAY:
					jour = "Jeudi";
					break;
				case GregorianCalendar.FRIDAY:
					jour = "Vendredi";
					break;
				case GregorianCalendar.SATURDAY:
					jour = "Samedi";
					break;
				case GregorianCalendar.SUNDAY:
					jour = "Dimanche";
					break;
				default:
					break;
			}
			
			return jour;
		}
		else
		  return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
