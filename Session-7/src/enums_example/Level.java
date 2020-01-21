package enums_example;

public enum Level {
	HIGH  (3),  //calls constructor with value 3
	MEDIUM(2),  //calls constructor with value 2
	LOW   (1)   //calls constructor with value 1
	; // semicolon needed when fields / methods follow

	private final int levelCode;

	private Level(int levelCode) {
		this.levelCode = levelCode;
	}

	public int getLevelCode() {
		return levelCode;
	}

	public static void main(String[] args) {
		Level unNivel = Level.HIGH;
		Level altNivel = Level.LOW;

		Level nivelMaiDificil = null;

		if(unNivel.getLevelCode() > altNivel.getLevelCode()) {
			nivelMaiDificil = unNivel;
		}
		else {
			nivelMaiDificil = altNivel;
		}

		System.out.println("Nivelul mai dificil este: " + nivelMaiDificil);
	}
}