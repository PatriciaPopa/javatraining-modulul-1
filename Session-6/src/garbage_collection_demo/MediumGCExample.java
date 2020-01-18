package garbage_collection_demo;

public class MediumGCExample {
	public static void main(String[] args) {
		String one, two;
		one = new String("a");
		two = new String("b");
		one = two;
		String three = one;
		one = null;
	}
}
