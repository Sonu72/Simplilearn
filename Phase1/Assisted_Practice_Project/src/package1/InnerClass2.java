package package1;

public class InnerClass2 {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
		  Inner l=new Inner();  
		  l.msg();  
		 }  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass2 ob=new InnerClass2();  
		ob.display(); 
	}

}
