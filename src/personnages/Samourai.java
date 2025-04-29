package personnages;

public class Samourai extends Ronin{
	private String seigneur;
	public Samourai(String nom, String boissonFav, int quantiteArgent,String seigneur) {
		super(nom,  boissonFav,  quantiteArgent);
		this.seigneur=seigneur;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("je suis fier de servir le seigneur "+seigneur);
	}
	public void boire(String boisson) {
		parler("Qu'est ce que je vais choisir comme boisson? Tiens je vais prendre du "+boisson);
	}
	
	@Override
	public void boire() {
		super.boire();
	}
	
}
