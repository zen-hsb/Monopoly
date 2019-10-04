package fr.gtm.monop;

//
public class Pion {
	String nomPion;
	Case positionSurPlateau;
	Joueur joueurDuPion;

	public Case getPositionSurPlateau() {
		return positionSurPlateau;
	}

	public void setPositionSurPlateau(Case positionSurPlateau) {
		this.positionSurPlateau = positionSurPlateau;
	}

	public void deplacerPoin(De d1, De d2) {
		Case old = Pion.this.getPositionSurPlateau();
		Case p = Pion.this.getPositionSurPlateau();
		for (int i = 0; i < (d1.valeur + d2.valeur); i = i + 1) {
			Pion.this.setPositionSurPlateau(p.next);
			p = Pion.this.getPositionSurPlateau();
			p.passer(Pion.this.joueurDuPion);
		}

		int tot = d1.getValeur() + d2.getValeur();
		System.out.println(joueurDuPion.nomJoueur + " lance les dés et obtient " + d1.valeur + " et " + d2.valeur);
		System.out.println("");
		System.out.println("Il se déplace de " + tot + " cases");
		System.out.println(joueurDuPion.nomJoueur + " était sur la case " + old.nomCase
				+ ", il est maintenant sur la case " + p.nomCase);
		System.out.println("");

		p.arreter(joueurDuPion);
	}

	public Joueur getJoueurDuPion() {
		return joueurDuPion;
	}

	public void setJoueurDuPion(Joueur joueurDuPion) {
		this.joueurDuPion = joueurDuPion;
	}

	public String getNomPion() {
		return nomPion;
	}

	public Pion(String nomPion) {
		this.nomPion = nomPion;
	}

}
