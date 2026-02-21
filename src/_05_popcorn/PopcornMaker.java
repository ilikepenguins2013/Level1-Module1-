package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("what flavor popcorn do you want?");
		String cookTime = JOptionPane.showInputDialog("how long do you want to cook your popcorn?");
		int timeCook = Integer.parseInt(cookTime);
		Microwave microwave = new Microwave();
		Popcorn bag = new Popcorn(flavor);
		microwave.setTime(timeCook);
		microwave.putInMicrowave(bag);
		microwave.startMicrowave();

	}

}
