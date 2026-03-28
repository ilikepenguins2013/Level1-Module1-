package _11_binary_converter;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryStuff implements ActionListener {
	JFrame bob = new JFrame();
	JPanel tim = new JPanel();
	JLabel jay = new JLabel();
	JButton eli = new JButton();
	JTextField joe = new JTextField(20);
	void something() {
		eli.addActionListener(this);
		tim.add(joe);
		eli.setText("convert");
		tim.add(eli);
		tim.add(jay);
		bob.add(tim);
		bob.pack();
		bob.setVisible(true);
		bob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new BinaryStuff().something();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String something = convert(joe.getText());
		jay.setText(something);
		bob.pack();
	}
	
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}


}
