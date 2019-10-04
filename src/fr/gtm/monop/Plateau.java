package fr.gtm.monop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//
public class Plateau {
	List<Case> casesMonop = new ArrayList<Case>();

	public List<Case> getCasesMonop() {
		return casesMonop;
	}

	public void plateau() {
//		try {
//			InitialisationPlateauFichier();
//		} catch (Exception e) {
//			initialisationPlateau();
//		}
		
		initialisationPlateau();
	}

	public void InitialisationPlateauFichier()
			throws IOException, InstantiationException, Exception {
		// lire ligne à ligne le fichier monopoly.txt
		// recupérer
		// champ avec numéro de la case (/!\1 à 40)
		// nom de la classe (/!\ ajouter le package)
		// nom de la case
		//
		String fileName = "monopoly.txt";
		BufferedReader br = null;
		br = new BufferedReader(new FileReader(fileName));
		String line = br.readLine();
		while (line != null) {
			String[] fields = line.split(";");
			int num = Integer.parseInt(fields[0]);
			String nameClass = fields[1];
			String nameCase = fields[2];
			//String prixCase = fields[3];
			String couleurCase = fields[5];
			String clazz = "fr.gtm.monop." + nameClass;
			casesMonop.add((Case) Class.forName(clazz).newInstance());
			casesMonop.get(num - 1).nomCase = nameCase;
			casesMonop.get(num - 1).couleurCase = couleurCase;
			//System.out.println(casesMonop.get(num - 1));
			//System.out.println(num + " : " + nameClass);
			line = br.readLine();
		}
		br.close();
		for (int i = 0; i <= 38; i = i + 1) {
			casesMonop.get(i).setNext(casesMonop.get(i + 1));
		}
		casesMonop.get(39).setNext(casesMonop.get(0));
	}

	public void initialisationPlateau() {
		int i;
		for (i = 0; i <= 39; i = i + 1) {
			switch (i) {
			case 0:
				casesMonop.add(new CaseDepart("Case départ", null, null));
				break;
			case 1:
				casesMonop.add(new CaseRue("Boulevard de Belleville", "Marron", null, 60, 6, null));
				break;
			case 2:
				casesMonop.add(new CaseDefault("Caisse de Communauté", null, null));
				break;
			case 3:
				casesMonop.add(new CaseRue("Rue Lecourbe", "Marron", null, 60, 6, null));
				break;
			case 4:
				casesMonop.add(new CaseImpots("Impots sur le revenu", null, null));
				break;
			case 5:
				casesMonop.add(new CaseGare("Gare Montparnasse", null, null, 200, 20, null));
				break;
			case 6:
				casesMonop.add(new CaseRue("Rue de Vaugirard", "Bleu ciel", null, 100, 10, null));
				break;
			case 7:
				casesMonop.add(new CaseDefault("Chance", null, null));
				break;
			case 8:
				casesMonop.add(new CaseRue("Rue de Courcelles", "Bleu ciel", null, 100, 10, null));
				break;
			case 9:
				casesMonop.add(new CaseRue("Avenue de la République", "Bleu ciel", null, 120, 12, null));
				break;
			case 10:
				casesMonop.add(new CaseDefault("Prise", null, null));
				break;
			case 11:
				casesMonop.add(new CaseRue("Boulevard de la Villette", "Violet", null, 140, 14, null));
				break;
			case 12:
				casesMonop.add(new CaseCompagnie("Compagnie de distribution d'électricité", null, null, 150, 15, null));
				break;
			case 13:
				casesMonop.add(new CaseRue("Avenue de Neuilly", "Violet", null, 140, 14, null));
				break;
			case 14:
				casesMonop.add(new CaseRue("Rue de Paradis", "Violet", null, 160, 16, null));
				break;
			case 15:
				casesMonop.add(new CaseGare("Gare de Lyon", null, null, 200, 20, null));
				break;
			case 16:
				casesMonop.add(new CaseRue("Avenue Mozart", "Orange", null, 180, 18, null));
				break;
			case 17:
				casesMonop.add(new CaseDefault("Caisse de Communauté", null, null));
				break;
			case 18:
				casesMonop.add(new CaseRue("Boulevard Saint-Michel", "Orange", null, 180, 18, null));
				break;
			case 19:
				casesMonop.add(new CaseRue("Place Pigalle", "Orange", null, 200, 20, null));
				break;
			case 20:
				casesMonop.add(new CaseDefault("Parc Gratuit", null, null));
				break;
			case 21:
				casesMonop.add(new CaseRue("Avenue Matignon", "Rouge", null, 220, 22, null));
				break;
			case 22:
				casesMonop.add(new CaseDefault("Chance", null, null));
				break;
			case 23:
				casesMonop.add(new CaseRue("Boulevard Malesherbe", "Rouge", null, 220, 22, null));
				break;
			case 24:
				casesMonop.add(new CaseRue("Avenue Henri-Martin", "Rouge", null, 240, 24, null));
				break;
			case 25:
				casesMonop.add(new CaseGare("Gare du Nord", null, null, 200, 20, null));
				break;
			case 26:
				casesMonop.add(new CaseRue("Faubourg Saint-Honoré", "Jaune", null, 260, 26, null));
				break;
			case 27:
				casesMonop.add(new CaseRue("Place de la Bourse", "Jaune", null, 260, 26, null));
				break;
			case 28:
				casesMonop.add(new CaseCompagnie("Compagnie de distribution des eaux", null, null, 150, 15, null));
				break;
			case 29:
				casesMonop.add(new CaseRue("Rue Lafayette", "Jaune", null, 280, 28, null));
				break;
			case 30:
				casesMonop.add(new CaseDefault("Allez en Prison", null, null));
				break;
			case 31:
				casesMonop.add(new CaseRue("Avenue de Breteuil", "Vert", null, 300, 30, null));
				break;
			case 32:
				casesMonop.add(new CaseRue("Avenue Foch", "Vert", null, 300, 30, null));
				break;
			case 33:
				casesMonop.add(new CaseDefault("Caisse de Communauté", null, null));
				break;
			case 34:
				casesMonop.add(new CaseRue("Boulevard des Capucines", "Vert", null, 320, 32, null));
				break;
			case 35:
				casesMonop.add(new CaseGare("Gare Saint-Lazare", null, null, 200, 20, null));
				break;
			case 36:
				casesMonop.add(new CaseDefault("Chance", null, null));
				break;
			case 37:
				casesMonop.add(new CaseRue("Avenue des Champs Élysées", "Bleu", null, 350, 35, null));
				break;
			case 38:
				casesMonop.add(new CaseTaxeDeLuxe("Taxe de luxe", null, null));
				break;
			case 39:
				casesMonop.add(new CaseRue("Rue de la Paix", "Bleu", null, 400, 40, null));
				break;
			default:
				casesMonop.add(new CaseRue(Integer.toString(i + 1), null, null, 100, 10, null));
			}
		}
		casesMonop.add(new CaseDepart("Case d�part", null, null));
		for (i = 1; i <= 3; i = i + 1) {
			casesMonop.add(new CaseDefault(Integer.toString(i + 1), null, null));
		}
		casesMonop.add(new CaseImpots("Impots sur le revenu", null, null));
		for (i = 1; i <= 33; i = i + 1) {
			casesMonop.add(new CaseDefault(Integer.toString(i + 5), null, null));
		}
		casesMonop.add(new CaseTaxeDeLuxe("Taxe de luxe", null, null));
		casesMonop.add(new CaseDefault("40", null, null));

		for (i = 0; i <= 38; i = i + 1) {
			casesMonop.get(i).setNext(casesMonop.get(i + 1));
		}
		casesMonop.get(39).setNext(casesMonop.get(0));

	}

	public Case getCaseDepart() {

		Case depart = casesMonop.get(0);
		// System.out.println(depart);
		return depart;

	}

}
