package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	public Ronin(String nom, String boissonFav, int quantiteArgent) {
		super(nom,boissonFav,quantiteArgent);
	}
	public void donner(Commercant beneficiare) {
		parler(beneficiare.getNom()+" prend ces "+quantiteArgent/10+" sous");
		beneficiare.recevoir(quantiteArgent/10);
	}
	public void provoquer(Yakuza adversaire) {
		int force=honneur*2;
		if (force>=adversaire.getReputation()) {
			parler("Je t'ai retrouvé "+adversaire.getNom()+", tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t'ai eu petit yakusa!");
			gagnerArgent(adversaire.perdre());
			honneur+=1;
			
		} else {
			honneur-=1;
			parler("J'ai perdu contre ce yakuza, mon bonheur et ma bourse ont en pris un coup.");
			adversaire.gagner(quantiteArgent);
			perdreArgent(quantiteArgent);
		}
	}

}
