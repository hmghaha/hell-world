import java.awt.*;

import javax.swing.*;

public class MyDrawPanel extends JPanel{
	public void paintComponent(Graphics g) {
//		g.setColor(Color.orange);
//		g.fillRect(20, 50, 100, 100);

		//no image
//		Image image = new ImageIcon("timgs.jpg").getImage();
//		g.drawImage(image, 3, 4, this); 
		
//		g.fillRect(0, 0, this.getWidth(), this.getHeight());
//		
//		int red = (int) (Math.random() * 255);
//		int green = (int) (Math.random() * 255);
//		int blue = (int) (Math.random() * 255);
//		
//		Color randomColor = new Color(red, green, blue);
//		g.setColor(randomColor);
//		g.fillOval(70, 70, 180, 100);
		
		Graphics2D g2d = (Graphics2D) g;
		
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color StartColor = new Color(red, green, blue);
		
		red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
		blue = (int) (Math.random() * 255);
		Color EndColor = new Color(red, green, blue);
		GradientPaint gradient = new GradientPaint(70,70,StartColor,300,300, EndColor);
		g2d.setPaint(gradient);
		g2d.fillOval(150, 150, 300, 300);
	}


}
