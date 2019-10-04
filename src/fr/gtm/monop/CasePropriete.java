package fr.gtm.monop;

public abstract class CasePropriete extends Case {

	int prixAchat;
	int loyer;
	Joueur proprietaire;


	public CasePropriete(String nomCase, String couleurCase, Case next, int prixAchat, int loyer, Joueur proprietaire) {
		super(nomCase, couleurCase, next);
		this.prixAchat = prixAchat;
		this.loyer = loyer;
		this.proprietaire = proprietaire;
	}

	public CasePropriete() {
		// TODO Auto-generated constructor stub
	}
}
