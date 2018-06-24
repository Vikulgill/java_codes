package Array;

public class IncrementArray {
	
	public static void increment(int n) {
		n++;
		
	}
	
	public static void incrementArray(int arr[])  {
		int size=arr.length;
		for (int i=0;i<size;i++)
		arr[i]++;
		
	}
	
	public static void print(int arr[])  {
		int size=arr.length;
		for (int i=0;i<size;i++)  {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int n=10;
	int 	arr[]= {1,2,3,4,5,6}; 
	increment(n);
	incrementArray(arr);
		System.out.println(n);
		print(arr);
	

	}

}
