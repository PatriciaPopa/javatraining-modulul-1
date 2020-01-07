package my_first_class_demo;

public class Caine {
	// starea
	String rasa; // ar trebui sa fie si el private, dar il lasam asa pt exemplu
	public String nume; // ar trebui sa fie si el private, dar il lasam asa pt exemplu
	private double varsta;
	private String culoare;
	//

	// constructori
	public Caine() {
	}

	public Caine(String rasa, String nume, double varsta, String culoare) {
		super();
		this.rasa = rasa;
		this.nume = nume;
		this.varsta = varsta;
		this.culoare = culoare;
	}
	//

	// getteri si setteri
	public String getRasa() {
		return rasa;
	}

	// ca sa veden ca se poate si fara "this"; in general, e mai evident sa punem "this"
	public void setRasa(String r) {
		rasa = r;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public double getVarsta() {
		return varsta;
	}

	public void setVarsta(double varsta) {
		this.varsta = varsta;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	//

	// comportament
	public void latra() {
		System.out.println("Ham-Ham");
	}

	public void musca() {
		System.out.println("Cainele tocmai te-a muscat!");
	}
	//

	@Override
	public String toString() {
		return "Caine [rasa=" + rasa + ", nume=" + nume + ", varsta=" + varsta + ", culoare=" + culoare + "]";
	}


}
