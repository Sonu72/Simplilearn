package slpracticeproject;

import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = new char[50];
		String data = "put this data in the file";
		try {
			FileWriter w = new FileWriter("D:\\eclipse_workspaceSimplilearn");
			FileReader input = new FileReader("D:\\eclipse_workspaceSimplilearn");
			w.write(data);
			input.read(array);
			
			System.out.println("data is written to the file");
			System.out.println("data in the file");
			System.out.println(array);
			
			StringBuffer str = new StringBuffer("I am the String \n");
			str.append("I am only the String");
			
			System.out.println(str);
			w.close();
			input.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
