package fr.gtm.monop;

public class CaseRue extends CasePropriete {

	public CaseRue(String nomCase, String couleurCase, Case next, int prixAchat, int loyer, Joueur proprietaire) {
		super(nomCase, couleurCase, next, prixAchat, loyer, proprietaire);

	}

	public CaseRue() {
		// TODO Auto-generated constructor stub
	}

	@Override //
	public void arreter(Joueur j) {
		if (CaseRue.this.proprietaire == null || CaseRue.this.proprietaire.solde < 0) {		//Si la case Rue n'a aucun propriétaire ou si le solde du propriétaire de cette case Rue, est inférieur à zéro
			if (j.isInterresse(prixAchat)) {												//Si le joueur est intéressé par la case Rue
				j.debiter(prixAchat);														//il sera débité du prix d'achat de la case Rue
				CaseRue.this.proprietaire = j;												//le propriétaire de la case Rue devient le joueur j
				System.out.println(j.nomJoueur + " dépense " + prixAchat + " euros et, achete la propriété "		//Affiche le nom du joueur j + le montant du prix d'achat de la case Rue + le nom de la case Rue
						+ CaseRue.this.nomCase);											
				System.out.println(j.nomJoueur + " a maintenant " + j.solde + " euros");
				System.out.println("");
			}
		} else {
			if(CaseRue.this.proprietaire != j) {
			j.debiter(loyer * 10);
			CaseRue.this.proprietaire.crediter(loyer * 10);
			System.out.println(j.nomJoueur + " paye un loyer de " + loyer * 10 + " euros à "
					+ CaseRue.this.proprietaire.nomJoueur);
			System.out.println(j.nomJoueur + " a maintenant " + j.solde + " euros");
			System.out.println(CaseRue.this.proprietaire.nomJoueur + " a maintenant " + CaseRue.this.proprietaire.solde
					+ " euros");
			System.out.println("");
			}
		}

	}

	@Override
	public void passer(Joueur j) {

	}

}
