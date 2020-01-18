package garbage_collection_demo;

public class EasyGCExample {
	public static void main(String[] args) {
		Object o1 = new Object();

		o1 = null;

		System.out.println(o1);
	}
}
