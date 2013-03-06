package IUT.BoBot;

public class BotMain {

	public static void main(String[] args) {
		Bot monBot = new Bot();
		
		String reponse = monBot.ask("Salut");

		System.out.println(reponse);
	}

}
