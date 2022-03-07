package package1;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}
		//multidimensional array
		int[][] b = {
		 {2, 4, 6, 8}, 
		 {3, 6, 9} };
		 
		 System.out.println("\nLength of row 1: " + b[0].length);

	}

}
