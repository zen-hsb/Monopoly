package fr.gtm.monop;

import java.util.ArrayList;
import java.util.List;

public class Monopoly {
	List<Joueur> joueurs = new ArrayList<Joueur>();
	Plateau plateau;
	De d1;
	De d2;

	public void addJoueur() {
		joueurs.add(new Joueur("Hubert Bonisseur de la Bath", 1500, new Pion("Sac d'argent"), true));
		joueurs.add(new Joueur("Noel Flantier", 1500, new Pion("Chaussure"), true));
		joueurs.add(new Joueur("Perceval", 1500, new Pion("Cuirassé"), true));
		joueurs.add(new Joueur("Karadoc", 1500, new Pion("Dé à coudre"), true));
	}

	public void Jouer() {
		Plateau p = new Plateau();
		p.plateau();
		// p.initialisationPlateau();
		De d1 = new De();
		De d2 = new De();
		for (Joueur j : joueurs) {
			j.pionDuJoueur.setPositionSurPlateau(p.getCaseDepart());
			j.pionDuJoueur.setJoueurDuPion(j);

		}
		int nbJoueurs = 4;
		int i = 0;
		while (nbJoueurs > 1) {
			System.out.println("Tour numéro " + (i + 1));
			// System.out.println("Tour numéro " + (i + 1));
			System.out.println("");
			System.out.println("");
			i = i + 1;
			for (Joueur j : joueurs) {
				if(i>3) {
					System.out.println(j.nomJoueur + " en a bien marre de cette partie de merde, il balance la table sur laquelle etait posé le plateau par la fenêtre.");
					System.out.println("personne n'a gagné");
					return;
				}
				if (j.joue == false) {
					System.out.println(j.nomJoueur + " est éliminé");
					System.out.println("");

				} else {
					j.jouer(d1, d2);
					if (j.solde < 0) {
						System.out.println(j.nomJoueur + " n'a plus d'argent, il est éliminé");
						System.out.println("");
						j.joue = false;
						nbJoueurs = nbJoueurs - 1;
					}
				}
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");

		}
		System.out.println("le gagnant est " + getVainqueur().nomJoueur + " avec la somme totale de " + getVainqueur().solde + " euros.");
	}

	public Joueur getVainqueur() {
		for (Joueur j : joueurs) {
			if (j.joue == true) {
				return j;
			}
		}
		return null;
	}

}
