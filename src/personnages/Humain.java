package personnages;

import java.security.PublicKey;

public class Humain {
	private String nom;
	private String boissonFav;
	protected int quantiteArgent;
	protected int nbConnaissance=0;
	protected Humain[] memoire = new Humain[30];

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
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFav);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (quantiteArgent >= prix) {
			parler("J'ai " + quantiteArgent + " sous en poche. je vais pouvoir m'offrir " + bien + " à " + prix
					+ " sous");
			quantiteArgent -= prix;
		} else {
			parler("Je n'ai que " + quantiteArgent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à "
					+ prix + " sous");
		}
	}

	protected void gagnerArgent(int gain) {
		quantiteArgent += gain;
	}

	protected void perdreArgent(int perte) {
		quantiteArgent -= perte;
	}
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	private void memoriser(Humain humain) {
		if (nbConnaissance==30){
			for (int i = 0; i < 29; i++) {
				memoire[i]=memoire[i+1];
				memoire[29]=humain;
			}
		}else {
			memoire[nbConnaissance]=humain;
			nbConnaissance++;
		}
	}
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	public void listerConnaissance() {
		if (nbConnaissance>0) {
			System.out.println("Je connais beaucoup d monde dont : ");
			for (int i = 0; i < nbConnaissance; i++) {
				System.out.print(memoire[i].getNom()+" ");
			}
		} else {
			System.out.println("Je ne connais personne");
		}
	}

}
