package access_modifiers_demo;

public class AccessModifiersDemoClass {
	public int campPublic;
	int campDefault;
	private int campPrivat;

	// dupa cum se vede din constructor, putem accesa orice membru din interiorul clasei,
	// indiferent de modificatorul sau de access
	public AccessModifiersDemoClass(int campPublic, int campDefault, int campPrivat) {
		super();
		this.campPublic = campPublic;
		this.campDefault = campDefault;
		this.campPrivat = campPrivat;
	}

	private void doSomething() {
	}

	public void doNothing() {
		doSomething();
	}

	void doWhatever() {
		doSomething();
	}
}
