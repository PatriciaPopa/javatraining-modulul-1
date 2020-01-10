package student_demo;

public class Student {
	private long nrMatricol;
	private String cnp;
	private String nume;
	private String specializare;

	public Student(long nrMatricol, String cnp, String nume, String specializare) {
		super();
		this.nrMatricol = nrMatricol; // fara setter, pt ca aceasta valoare NU se modifica
		this.cnp = cnp; // fara setter, pt ca aceasta valoare NU se modifica
		this.nume = nume;
		this.specializare = specializare;
	}

	public long getNrMatricol() {
		return nrMatricol;
	}

	public String getCnp() {
		return cnp;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getSpecializare() {
		return specializare;
	}

	public void setSpecializare(String specializare) {
		this.specializare = specializare;
	}

	public double daExamen(String numeMaterie) {
		double nota = ((int) (Math.random()*9)) + 1;

		System.out.println("Studentul a obtinut la materia " + numeMaterie + " nota: " + nota);

		return nota;
	}

	public void iaNotite() {
		System.out.println("Studentul isi ia notite...");
	}

	public void vorbeste() {
		System.out.println("Blablabla");
	}

	@Override
	public String toString() {
		return "Student [nrMatricol=" + nrMatricol + ", cnp=" + cnp + ", nume=" + nume + ", specializare="
				+ specializare + "]";
	}
}
