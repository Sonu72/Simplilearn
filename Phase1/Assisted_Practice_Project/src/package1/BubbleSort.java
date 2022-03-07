package package1;

public class BubbleSort {
	int flag;
	int temp;
	void bubbleSort(int arr[]) {
		int s = arr.length;
		for(int i =0;i< s-1;i++) {
			flag =0 ;
			for(int j =0 ; j< s-i-1;j++) {
				if (arr[j]> arr[j+1]) {
					temp = arr[j];
					arr[j]= arr[j+1];
					arr [j+1]=temp;
					flag =1 ;
				}
			}
			if(flag==0) break;
		}
	}
	void printArray(int arr[]) {
		int s= arr.length;
		for(int i =0 ; i< s ;i++) {
			System.out.println(arr[i] + "  ");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort a = new BubbleSort();
		int arr[]= { 2,1,6,4,8,5,9};
		a.bubbleSort(arr);
		System.out.println("Sorted Array will be:");
		a.printArray(arr);

	}

}
