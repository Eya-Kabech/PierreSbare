package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation =0;
	public Yakuza(String nom, String boissonFav, int quantiteArgent,String clan) {
		super( nom, boissonFav, quantiteArgent);
		this.clan=clan;
		}
	
	public void extroquer(Commercant victime) {
		parler("Tiens; tiens, ne serait-ce pas un faible marchand qui passe par là?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse!");
		int argentVole = victime.getQuantiteArgent();
		gagnerArgent(victime.seFaireExtorquer());
		reputation+=1;
		parler("J'ai piqué les "+argentVole+" sous de "+victime.getNom()+", ce qui me fait "+quantiteArgent+" sous dans ma poche.Hi ! Hi !");
	}

	public int getReputation() {
		return reputation;
	}
	public int perdre() {
		int argentPerdu= quantiteArgent;
		perdreArgent(quantiteArgent);
		reputation-=1;
		parler("J'ai perdu mon duel et mes "+argentPerdu+" sous, snif... J'ai déshorné le clan de "+clan);
		return argentPerdu;
	}
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation+=1;
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+clan+" ?");
		parler("Je l'ai dépoullé de ses "+gain+" sous");
		
	}
	}
	

