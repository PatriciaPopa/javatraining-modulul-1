package garbage_collection_demo;

class Beta { }

class Alpha {
	static Beta c1;
	Beta c2;
}

public class HardGCExample {
	public static void main(String args[]) {
		Beta b1 = new Beta();
		Beta b2 = new Beta();
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha();
		a1.c1 = b1;
		a1.c2 = b1;
		a2.c2 = b2;
		a1 = null;
		b1 = null;
		b2 = null;
	}
}