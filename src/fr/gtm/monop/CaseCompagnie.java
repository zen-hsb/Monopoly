package fr.gtm.monop;

public class CaseCompagnie extends CasePropriete {

	public CaseCompagnie(String nomCase, String couleurCase, Case next, int prixAchat, int loyer, Joueur proprietaire) {
		super(nomCase, couleurCase, next, prixAchat, loyer, proprietaire);

	}
	
	public CaseCompagnie() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arreter(Joueur j) {
		if (CaseCompagnie.this.proprietaire == null|| CaseCompagnie.this.proprietaire.solde < 0) {
		if(j.isInterresse(prixAchat)) {
			j.debiter(prixAchat);
			CaseCompagnie.this.proprietaire = j;
			System.out.println(j.nomJoueur + " dépense " +prixAchat+ " euros et, achete la "+ CaseCompagnie.this.nomCase);
			System.out.println(j.nomJoueur + " a maintenant " + j.solde + " euros");
			System.out.println("");
		}
	}else {
		j.debiter(loyer);
		CaseCompagnie.this.proprietaire.crediter(loyer);
		System.out.println(j.nomJoueur + " paye un loyer à " + CaseCompagnie.this.proprietaire.nomJoueur);
		System.out.println(j.nomJoueur + " a maintenant " + j.solde + " euros");
		System.out.println(CaseCompagnie.this.proprietaire.nomJoueur + " a maintenant " + CaseCompagnie.this.proprietaire.solde + " euros");
		System.out.println("");
	}
	
	}

	@Override
	public void passer(Joueur j) {
	

	}

	
	
}
