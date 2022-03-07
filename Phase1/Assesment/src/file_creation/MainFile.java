package file_creation;
import java.io.IOException;
import java.util.Scanner;
import deletefile.DeleteFile;
import searchfile.SearchFile;

public class MainFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int choice = -1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Insert");
			System.out.println("2. Delete");
			System.out.println("3. search");
			System.out.println("4. Exit");
		
			choice = sc.nextInt();
			
			MainFile mf = new MainFile();
			switch(choice) {
			case 1: Create_File cf = new Create_File();
			        Create_File.main(null);
				    break;
				    
			case 2: DeleteFile df = new DeleteFile();
				    df.main(null);
				    break;
				    
			case 3:	SearchFile sf = new SearchFile();
			        sf.main(null);
			         break;  
			case 4: System.exit(0);
			         break;
				     
			}
			
		}while(choice!=0);
		
			}

	}


