package displayfile;

import java.io.File;

public class DisplayFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String path="D:\\Project1\\";
		 File f=new File(path);
		 File filename[]=f.listFiles();
		 for(File ff:filename) {
		 System.out.println(ff.getName());
		 }

	}

}
