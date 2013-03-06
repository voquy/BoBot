package IUT.BoBot;

public class BotMain {

	public static void main(String[] args) {
		Bot monBot = new Bot();
		
		String reponse = monBot.ask("Salut");

		System.out.println(reponse);
		
		// Affiche la date du jour
		System.out.print("Aujourd'hui nous sommes le ");
		monBot.ask("Quelle est la date du jour ?");
		
		System.out.println(monBot.ask("Je suis né le 05/02/91"));
		
	}

}
