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

}
