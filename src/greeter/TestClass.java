package greeter;

public class TestClass {
	public static void main(String[] args) {
		Greeter[] list = new Greeter[5];

		list[0] = new Greeter("Eric", 5);
		list[1] = new Greeter("John", 15);
		list[2] = new Greeter("Jack", 25);
		list[3] = new Greeter("James",35);
		list[4] = new Greeter("Ree", 87);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(list[i].toString());
		}
	}
}
