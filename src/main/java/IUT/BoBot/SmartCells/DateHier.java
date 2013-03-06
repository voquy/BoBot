package IUT.BoBot.SmartCells;

import java.util.Calendar;
import java.util.Date;


import IUT.BoBot.SmartCell;

public class DateHier implements SmartCell{
	
    public String ask(String question) {
		if(question.contains("hier"))
		{
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(new Date(System.currentTimeMillis()));
			calendar.add(Calendar.DATE, -1);
			Date hier = calendar.getTime();
			System.out.println(hier);
			
			String format = "dd/MM/yy"; 

			java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format ); 
			
			return ( formater.format( hier ) ); 
		
		    
		}
		
		else
		  return null;
    }
}
