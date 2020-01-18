package static_modifier_demo;

public class InstanceBlockDemo {
	private int counter;

	{
		System.out.println("valoare initiala: " + counter);
		counter = 2;
	}

	public InstanceBlockDemo(int counter) {
		System.out.println("valoare intermediara: " + this.counter);
		this.counter = counter;
	}

	public static void main(String[] args) {
		InstanceBlockDemo ib = new InstanceBlockDemo(17);
		System.out.println("valoare finala: " + ib.counter);
	}
}
