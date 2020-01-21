package enums_example;

public enum Meserie {
	PROGRAMATOR("1A2B"),
	BUCATAR("23CF"),
	OSPATAR("5V4S");

	private final String codMeserie;

	private Meserie(String codMeserie) {
		this.codMeserie = codMeserie;
	}

	public String getCodMeserie() {
		return codMeserie;
	}

	public static void main(String[] args) {
		Meserie job1 = Meserie.BUCATAR;
		Meserie job2 = Meserie.OSPATAR;

		System.out.println("Detalii job1: " + job1 + " " + job1.codMeserie);
		System.out.println("Detalii job1: " + job2 + " " + job2.codMeserie);
	}
}
