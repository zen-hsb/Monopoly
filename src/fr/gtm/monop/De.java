package fr.gtm.monop;

public class De {
	int valeur;

	@Override
	public String toString() {
		return "De [valeur=" + valeur + "]";
	}

	public int getValeur() {
		return valeur;
	}

	public int lancer() {
		valeur = ((int) (Math.random() * ( 6 )))+1;
		return valeur;
	}

}
