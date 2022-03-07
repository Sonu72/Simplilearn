package package1;
import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
			//	double Ans;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the First numbers");
				int num1 = sc.nextInt();
				System.out.println("enter the Second numbers");
				int num2 = sc.nextInt();
				System.out.println("Enter the operator ");
				char op=sc.next().charAt(0);
				double res=0;
				switch(op) {
				case '+': res=num1+num2;
				          break;
				case '-': res=num1-num2;
				          break;
				case '*': res=num1*num2;
			           	  break;
				case '/':res=num1/num2;
				          break;
				}
				System.out.println("the answer is " +res);

			}

		

	}


