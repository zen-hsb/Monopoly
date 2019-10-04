package fr.gtm.monop;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		
		Monopoly m = new Monopoly();
		m.addJoueur();
		m.Jouer();
		
//		Plateau p = new Plateau();
//		p.InitialisationPlateauFichier();
	}

}
