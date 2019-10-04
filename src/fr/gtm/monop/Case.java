package fr.gtm.monop;

public abstract class Case {
	String nomCase;
	String couleurCase;
	Case next;

	public Case(String nomCase, String couleurCase, Case next) {
		super();
		this.nomCase = nomCase;
		this.couleurCase = couleurCase;
		this.next = next;
	}
	
	public Case() {
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "Case [nomCase=" + nomCase + "]";
	}



	public Case getNext() {
		return next;
	}

	public void setNext(Case next) {
		this.next = next;
	}


	public String getCouleurCase() {
		return couleurCase;
	}



	public String getNomCase() {
		return nomCase;
	}
	
	public abstract void arreter(Joueur j);
	public abstract void passer(Joueur j);
}
