package fr.gtm.monop;

public class CaseImpots extends Case{

	public CaseImpots(String nomCase, String couleurCase, Case next) {
		super(nomCase, couleurCase, next);
	}
	
	public CaseImpots() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void arreter(Joueur j) {
		System.out.println(j.nomJoueur + " s'arrete sur la case Impots sur le revenu et paye " + j.solde / 10 + " euros");
		int impot = j.solde / 10;
		if (impot>500) {
			impot = 500;
		}
		j.debiter(impot);
		System.out.println(j.nomJoueur + " a maintenant " + j.solde + " euros");
		System.out.println("");
	}
	@Override
	public void passer(Joueur j) {

	}
}
