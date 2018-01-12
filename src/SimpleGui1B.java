import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;

import javax.swing.*;

public class SimpleGui1B implements ActionListener {
	JButton button;
	
	public static void main(String[] args) {
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
		
	}
	
	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		
		button.addActionListener(this);
		
		MyDrawPanel pan = new MyDrawPanel();
		frame.getContentPane().add(pan);
		
//		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 600);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		button.setText("I've been clicked!");
	}

}
