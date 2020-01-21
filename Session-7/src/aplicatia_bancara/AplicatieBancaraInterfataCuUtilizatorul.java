package aplicatia_bancara;

public class AplicatieBancaraInterfataCuUtilizatorul {
	public static void main(String[] args) {

		double sumaDinCont = 5635.253;
		double dobandaLunara = CalculFinanciarUtils.calculeazaDobandaLunara(sumaDinCont);
		System.out.println(dobandaLunara);

		double sumaTotala = 900;
		double rataLunara = CalculFinanciarUtils.calculeazaRataLunaraCredit(sumaTotala);
		System.out.println(rataLunara);
	}
}
