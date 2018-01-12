import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleAnimation {
	int x,y;
	
	public static void main(String [] args) {
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(drawPanel);
		frame.setSize(800,600);
		frame.setVisible(true);
		
		for(int i = 0; i < 30; i++) {
			x += 10;
			y += i*i;
			
			drawPanel.repaint();
			
			try {
				Thread.sleep(100);
			}catch(Exception e) {}
			
		}
		
	}
	
	class MyDrawPanel extends JPanel{
		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			g.setColor(Color.orange);
			g.fillOval(x, y, 30, 30);
		}
	}

}
