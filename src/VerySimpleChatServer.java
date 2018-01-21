import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.text.StyledEditorKit.ItalicAction;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import com.sun.org.apache.xpath.internal.operations.String;

import sun.nio.cs.ext.ISCII91;

public class VerySimpleChatServer {
	
	ArrayList clientOutputStreams;
	public class ClientHandler implements Runnable{
		BufferedReader reader;
		Socket sock;
		
		public ClientHandler(Socket clientSocket){
			try {
				sock = clientSocket;
				InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
				Reader = new BufferedReader(isReader);
			}catch(Exception ex) {ex.printStackTrace();}
		}
		
		public void run() {
			String message;
			try {
				while((Message = Reader.readLine()) != null) {
					System.out.println("reader " + message);
					tellEveryone(message);
				}
			}catch(Exception ex) {ex.printStackTrace();}
		}
		
	}
	
	public static void main(String[] args) {
		new VerySimpleChatServer().go();
	}
	
	public void go() {
		clientOutputStreams = new ArrayList();
		try {
			ServerSocket serverSocket = new ServerSocket(5000);
			
			while(true) {
				Socket clientSocket = serverSocket.accept();
				PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
				clientOutputStreams.add(writer);
				
				Thread thread = new Thread(new ClientHandler(clientSocket));
				thread.start();
				System.out.println("got a connection");
			}
		}catch(Exception ex) {ex.printStackTrace();}
	}
	
	public void tellEveryone(String message) {
		Iterator iterator  = clientOutputStreams.iterator();
		while(it.hasNext()) {
			try {
				PrintWriter writer = (PrintWriter) it.next();
				Writer.println(message);
				Writer.flush();
			}catch(Exception ex) {ex.printStackTrace();}
		}
	}

}
















