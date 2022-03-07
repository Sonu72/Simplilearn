package file_creation;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Create_File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "D:\\Project1\\";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name to Create");
		String fname = path+sc.next();
		File f = new File(fname);
		boolean result = f.createNewFile();
		//boolean result=f.createNewFile();
		 if(result==false) {
		 System.out.println("file is not created");
		 }
		else {
		// al.add(filename);
		 System.out.println("file is created at : "+fname);
	 //  System.out.println(f.getName());
	}
	}
}
