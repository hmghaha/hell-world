import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.*;

public class SimpleChatClientA {
	
	JTextField outgoing;
	PrintWriter writer;
	Socket sock;
	
	public void go() {
		JFrame frame = new JFrame("HMG Simple Chat Client");
		JPanel mainPanel = new JPanel();
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		setUpNetWorking();
		frame.setSize(400, 500);
		frame.setVisible(true);
	}
	
	public void setUpNetWorking() {
		try {
			sock = new Socket("127.0.0.1", 5000); //使用localhost以便在同一台机器做测试
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("netWorking established");
		}catch(IOException ex) {ex.printStackTrace();}
	}
	
	public class SendButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent ev) {
			try {
				writer.println(outgoing.getText()); //发送信息到服务器
				writer.flush();
			}catch(Exception ex) {ex.printStackTrace();}
			outgoing.setText("");
			outgoing.requestFocus();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleChatClientA().go();
	}

}










