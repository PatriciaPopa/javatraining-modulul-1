package aplicatia_bancara;

public class CalculFinanciarUtils {
	private static final int NUMAR_LUNI = 12;
	public static final double DOBANDA_PROCENT = 0.02; // 2%

	public static double calculeazaDobandaLunara(double sumaDinCont) {
		return DOBANDA_PROCENT * sumaDinCont;
	}

	public static double calculeazaRataLunaraCredit(double sumaTotala) {
		return sumaTotala / NUMAR_LUNI;
	}

	// multe alte metode utilitare
}
