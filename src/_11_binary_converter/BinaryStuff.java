package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		tim.add(jay);
		tim.add(eli);
		tim.add(joe);
		bob.add(tim);
		bob.pack();
		bob.setVisible(true);
	}
	public static void main(String[] args) {
		new BinaryStuff().something();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}
