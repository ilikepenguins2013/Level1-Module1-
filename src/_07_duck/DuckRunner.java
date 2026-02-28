package _07_duck;

public class DuckRunner {

	public static void main(String[] args) {
		Duck duck1 = new Duck("chub", 5);
		Duck duck2 = new Duck("minnows", 6);
		duck1.waddle();
		duck2.quack();
	}

}
