import java.io.*;

public class ReadAFile {
	public static void main(String[] args) {
		try {
			File myFile = new File("MyText.txt");
			FileReader fileReader = new FileReader(myFile);
//			InputStreamReader encodeFile = new InputStreamReader("MyText.txt","utf-8");
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("MyText.txt"),"UTF-8"));
			
			String line = null;
			while((line = reader.readLine())!= null) {
				System.out.println(line);
			}
			reader.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
