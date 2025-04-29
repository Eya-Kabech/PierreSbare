package personnages;

import java.util.Random;

public class Traitre extends Samourai{
	private Random random = new Random();
	private int niveauTraitrise =0 ;
	public Traitre(String nom, String boissonFav, int quantiteArgent,String seigneur) {
		super(nom,  boissonFav, quantiteArgent,seigneur);
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traitre et mon niveua de traitrise est : "+niveauTraitrise);
	}
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise<3) {
			int argentRaconner=commercant.getQuantiteArgent()*2/10;
			commercant.perdreArgent(argentRaconner);
			gagnerArgent(argentRaconner);
			niveauTraitrise++;
			parler("si tu veux ma protection contre les Yakuzas, il va falloir payer! Donne-moi "+argentRaconner+" sous ou gare àntoi !");
			commercant.parler("Tout de suite grand"+getNom()+".");
			
			
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraÏ risque de me démasquer !");
		}
		
	}
	public void faireLeGentil() {
		if (nbConnaissance<1) {
			parler("Je ne peux faire ami avec personne car je ne connais personne! Snif.");
		} else {
			int indexAmi = random.nextInt(nbConnaissance);
			Humain ami=memoire[indexAmi];
			int don = quantiteArgent*1/20;
			parler("il faut absolument remonter ma cote de confiance. Je vais faire ami avec "+ami.getNom());
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant "+don+" sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci "+getNom()+". Vous etes quelqu'un de bein.");
			if (niveauTraitrise>1) {
				niveauTraitrise-=1;
			}
		}
	}
}
