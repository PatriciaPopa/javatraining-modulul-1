package enums_example;

public class Artefact {
	private String idUnic;
	private Stare stare;
	private Tip tip;

	public String getIdUnic() {
		return idUnic;
	}

	public Stare getStare() {
		return stare;
	}

	public void setStare(Stare stare) {
		this.stare = stare;
	}

	public Tip getTip() {
		return tip;
	}

	public void setTip(Tip tip) {
		this.tip = tip;
	}

	public Artefact(String idUnic, Stare stare, Tip tip) {
		super();
		this.idUnic = idUnic;
		this.stare = stare;
		this.tip = tip;
	}

	@Override
	public String toString() {
		return "ObiectDeArta [idUnic=" + idUnic + ", stare=" + stare + ", tip=" + tip + "]";
	}

	enum Stare{
		FOARTE_REA, REA, BUNA, FOARTE_BUNA
	}

	enum Tip{
		PODOABA, OBIECT_MENAJER, VAZA, NECUNOSCUT, OBIECT_RELIGIOS
	}
}
