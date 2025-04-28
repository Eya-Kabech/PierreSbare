package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	protected int quantiteArgent ;
	
	
	
	public Humain(String nom, String boissonFav, int quantiteArgent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.quantiteArgent = quantiteArgent;
	}
	
	
	public String getNom() {
		return nom;
	}
	public int getQuantiteArgent() {
		return quantiteArgent;
	}
	protected void parler(String texte) {
		System.out.println(texte);
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boissonFav);
	}
	public void boire() {
		parler("Mmmm, un bon verre de "+boissonFav+" ! GLOUPS !");
	}
	public void acheter(String bien, int prix) {
		if (quantiteArgent>=prix) {
			parler("J'ai "+quantiteArgent+" sous en poche. je vais pouvoir m'offrir "+bien+" à "+prix+" sous");
			quantiteArgent-=prix;
		} else {
			parler("Je n'ai que "+quantiteArgent+" sous en poche. Je ne peux même pas m'offrir "+bien+" à "+prix+" sous");
		}
	}
	protected void gagnerArgent(int gain) {
		quantiteArgent+=gain;
	}
	protected void perdreArgent(int perte) {
		quantiteArgent-=perte;
	}
	
	
}
