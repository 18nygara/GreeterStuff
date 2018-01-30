package greeter;

public class Greeter {
	private String name;
	private int age;
	
	public Greeter() {
		name = "John";
		age = 20;
	}
	
	public Greeter (String xName, int xAge) {
		name = xName;
		age = xAge;
	}
	
	public String toString() {
		return "Greeter Class: " + name + " " + age;
	}
}
