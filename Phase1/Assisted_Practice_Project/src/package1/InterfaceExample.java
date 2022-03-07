package package1;
interface MyInterface1{
	   public static int num = 100;
	   public default void display() {
	      System.out.println("display method for MyInterface1");
	   }
	}
	interface MyInterface2{
	   public static int num = 1000;
	   public default void display() {
	      System.out.println("display method for MyInterface2");
	   }
	}
public class InterfaceExample implements MyInterface1, MyInterface2{
	   public void display() {
		      MyInterface1.super.display();
		      
		      MyInterface2.super.display();
		   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample obj = new InterfaceExample();
	      obj.display();

	}

}
