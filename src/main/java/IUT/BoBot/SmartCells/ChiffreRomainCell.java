package IUT.BoBot.SmartCells;

import IUT.BoBot.EnNbArabe;
import IUT.BoBot.SmartCell;
import IUT.BoBot.Romains;

/**
 * Reply to ChiffreRomain.
 *
 */
public class ChiffreRomainCell implements SmartCell, EnNbArabe {
	
	public String ask(String chiffreromain) {
		int Chiffre = 0;
		String Romain ;
		if(chiffreromain.contains(null))
			return null;
		else
		{
			Chiffre = enNombreArabe(chiffreromain);
     		return  String.valueOf(Chiffre);
		}
	}

}