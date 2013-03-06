package exo_01;

public class RomanToNumeral {

	int kErr = 7777777;
	
	public int numeralFor (String roman) {
		if (roman.equals("I")) return 1;
		if (roman.equals("II")) return 2;
		if (roman.equals("III")) return 3;
		if (roman.equals("IV")) return 4;
		
		if (roman.equals("")) return 0;
		return kErr;
	}
	
	public int numeralFor2 (char caract) {
		if (caract == 'I') return 1;
		if (caract == 'V') return 5;
		if (caract == 'X') return 10;
		if (caract == 'L') return 50;
		if (caract == 'C') return 100;
		if (caract == 'D') return 500;
		if (caract == 'M') return 1000;
		
		return kErr;
	}
	
	public int numeralForAdd (String roman) {
		int taille = roman.length();
		
		int result = 0;
		
		for (int i = 0 ; i < taille ; ++i)
		{
			int num = numeralFor2(roman.charAt(i));
			if (num == kErr) break;
			result += num;
		}
		
		return result;
	}
	
	public int numeralForVV(String roman) {
		int taille = roman.length();
		if (taille != 2) return kErr;
		
		int result = 0;
		
		if (roman.charAt(0) == 'V')
		{
			if (roman.charAt(1) == 'I')
				return 6;
		}
		
		if (roman.charAt(0) == 'I')
		{
			if (roman.charAt(1) == 'V')
				return 4;
		}
		
		return kErr;
	}
	
	public int numeralForXX(String roman) {
		int taille = roman.length();
		if (taille != 2) return kErr;
		
		int result = 0;
		
		if (roman.charAt(0) == 'X')
		{
			if (roman.charAt(1) == 'I')
				return 11;
		}
		
		if (roman.charAt(0) == 'I')
		{
			if (roman.charAt(1) == 'x')
				return 9;
		}
		
		return kErr;
	}
	
	
	public int numeralForXXL(String roman) {
		int taille = roman.length();
		
		if (taille == 0) return kErr; 
		
		int result = 0;
		int i = taille-1;
		
		if (roman.charAt(taille-1) == 'I')
		{
			result += 1;
			i -= 1 ;
		}
		
		boolean valide = true;
		
		while (i >= 0)
		{	
			if (numeralFor2(roman.charAt(i)) == kErr) return kErr;
			
			switch (roman.charAt(i))
			{
				case 'V' : result += numeralFor2(roman.charAt(i));
							valide = false;
							break;
				case 'X' : result += numeralFor2(roman.charAt(i));
							valide = false;
							break;
				case 'L' : result += numeralFor2(roman.charAt(i));
							valide = false;
							break;
				case 'C' : result += numeralFor2(roman.charAt(i));
							valide = false;
							break;
				case 'D' : result += numeralFor2(roman.charAt(i));
							valide = false;
							break;
				case 'M' : result += numeralFor2(roman.charAt(i));
							valide = false;
							break;
				default  : break;
			}
						
			if (valide == false && i != 0)
			{
				if (roman.charAt(i-1) == 'I')
				{
					result -= 1;
					i -= 2;
					valide = true;
					continue;
				}
				
				i -= 1;
				
				valide = true;
				continue;
			}
			
			if (roman.charAt(i) == 'I') result += 1;

			i -= 1;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {

	}
}
