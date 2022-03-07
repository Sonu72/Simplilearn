package searchfile;

import java.io.File;
import java.util.Scanner;

public class SearchFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="D:\\Project1\\";
		 File f=new File(path);
	     Scanner sc=new Scanner(System.in);
		 System.out.println("eneter a file to search");
		 String filenameserach=sc.next();
		 File filename[]=f.listFiles();
		 int flag=0;
	     for(File ff:filename) {
		 if(ff.getName().equals(filenameserach)){
		 flag=1;
		
		 break;
		 }
		 else {
		 flag=0;
		
		 }
		
		 }
		 if(flag==1) {
		 System.out.println("file is available");
		 }
		 else {
		 System.out.println("file is not available");
		 }
		
		 System.exit(0);
		}
		

	}


