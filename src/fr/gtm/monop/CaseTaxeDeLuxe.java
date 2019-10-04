package fr.gtm.monop;

public class CaseTaxeDeLuxe extends Case{
	
	public CaseTaxeDeLuxe(String nomCase, String couleurCase, Case next) {
		super(nomCase, couleurCase, next);
	}
	
	public CaseTaxeDeLuxe() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void arreter(Joueur j) {
		System.out.println(j.nomJoueur + " s'arrete sur la case Taxe de luxe et paye 100 euros");
		j.debiter(100);
		System.out.println(j.nomJoueur + " a maintenant " + j.solde + " euros");
		System.out.println("");
	}
	@Override
	public void passer(Joueur j) {

	}
}
