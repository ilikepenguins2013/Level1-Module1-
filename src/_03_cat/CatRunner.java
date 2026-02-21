package _03_cat;

public class CatRunner {
	
	public static void main(String[] args) {
		Cat micah = new Cat("Micah");
		micah.meow();
		micah.printName();
		for(int i = 0; i < 9; i++) {
			micah.kill();
		}
	}

}
