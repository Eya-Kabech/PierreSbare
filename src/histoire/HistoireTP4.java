package histoire;

import java.awt.Robot;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("prof", "Kombucha", 54);
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un Kimono", 50);
		
		Commercant Marco = new Commercant("marco", 20);
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoir(15);
		Marco.boire();
		System.out.println(Marco.getQuantiteArgent());
		System.out.println("------------------------------");
		Yakuza yaku = new Yakuza("Yaku Le Noir", "Whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.extroquer(Marco);
		Ronin roro = new Ronin("roro", "shochu", 60);
		roro.donner(Marco);
	

	}
	

}
