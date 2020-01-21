package enums_example;

import enums_example.Artefact.Stare;
import enums_example.Artefact.Tip;

public class ArtefactDemo {
	public static void main(String[] args) {
		Artefact a1 = new Artefact("1A23B", Stare.BUNA, Tip.PODOABA);
		Artefact a2 = new Artefact("63DA1", Stare.REA, Tip.VAZA);
		Artefact a3 = new Artefact("89H4V", Stare.FOARTE_BUNA, Tip.OBIECT_RELIGIOS);
		Artefact a4 = new Artefact("0fbh3", Stare.REA, Tip.VAZA);
		Artefact a5 = new Artefact("92nnS", Stare.FOARTE_BUNA, Tip.NECUNOSCUT);

		Artefact[] colectieArtefacte = {a1, a2, a3, a4, a5};

		System.out.println(numaraArtefactePeBazaTipului(colectieArtefacte));
	}

	private static int numaraArtefactePeBazaTipului(Artefact[] colectieArtefacte) {
		Tip tipDoritDeObiect = Tip.VAZA;

		// Exercitiu: afisati numarul de obiecte de tip Vaza din colectieArtefacte
		int contor = 0;

		for(Artefact artefact : colectieArtefacte) {
			// merge si asa, dar e mai safe sa comparam obiecte folosind metoda equals()
			//			if(artefact.getTip() == tipDoritDeObiect) {
			//				contor++;
			//			}

			if(artefact.getTip().equals(tipDoritDeObiect)) {
				contor++;
			}
		}

		return contor;
	}
}
