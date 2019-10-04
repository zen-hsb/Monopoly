package fr.gtm.monop;

public class Joueur {
	String nomJoueur;
	int solde;
	Pion pionDuJoueur;
	Monopoly monop;
	boolean joue;

	public Joueur(String nomJoueur, int solde, Pion pionDuJoueur, boolean joue) {
		super();
		this.nomJoueur = nomJoueur;
		this.solde = solde;
		this.pionDuJoueur = pionDuJoueur;
		this.joue = joue;
	}

	public void crediter(int montant) {
		solde = solde + montant;
	}

	public void debiter(int montant) {
		solde = solde - montant;
		if (solde < 0) {
			//System.out.println(Joueur.this.nomJoueur + " n'a plus d'argent");
		}
	}

	public boolean isInterresse(int prix) {
		if (Joueur.this.solde > prix) {
			return true;
		}
		return false;
		
	}
	
	public void jouer(De d1, De d2) {
		d1.lancer();
		d2.lancer();

		Joueur.this.pionDuJoueur.deplacerPoin(d1, d2);
	}

}
