package package1;
class EmpInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();

		emp1.display();
		emp2.display();
		
		Std std1=new Std(5,"Aditya");
		Std std2=new Std(8,"Kumar");
		std1.display();
		std2.display();



	}

}
