package access_modifiers_demo;

public class AccessTest {
	public static void main(String[] args) {
		AccessModifiersDemoClass obj = new AccessModifiersDemoClass(1,2,3);

		System.out.println(obj.campPublic);
		System.out.println(obj.campDefault);
		// System.out.println(obj.campPrivate);

		obj.doNothing();

		// obj.doSomething();

		obj.doWhatever();
	}
}
