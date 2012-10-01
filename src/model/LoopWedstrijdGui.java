package model;
import model.LoopWedstrijd;
import model.Loper;
import model.Tijd;


public class LoopWedstrijdGui {

	
	public static void main(String[] args) {
		LoopWedstrijd loopWedstrijd = new LoopWedstrijd();
		String lopersLijst = null;
		boolean loperToevoegen = true;
		while (loperToevoegen){
			lopersLijst = loopWedstrijd.getIngeschrevenDeelnemers();
			String loper = IO.leesStringMetVenster(lopersLijst+"\n\nTyp naam loper(STOP is einde inschrijvingen)", "Inschrijven lopers ");
			loperToevoegen = !loper.equalsIgnoreCase("STOP");
			if (loperToevoegen)
				loopWedstrijd.voegLoperToe(loper);
		}
		
		loopWedstrijd.setStartWedstrijd(new Tijd(14,0,0));
		
		for (Loper loper:loopWedstrijd){
			int seconden = (int)(Math.random()*600)+1800;
			Tijd aankomst = loper.getStart().verhoog(seconden);
			loper.setAankomst(aankomst);
		}
		
		IO.toonStringMetVenster("Uitslag loopwedstrijd \n\n"+loopWedstrijd.getAangekomenDeelnemers());

	}

}
