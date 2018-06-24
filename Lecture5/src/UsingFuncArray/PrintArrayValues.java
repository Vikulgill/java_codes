package UsingFuncArray;
import java.util.Scanner;

public class PrintArrayValues {
	
	public static int[] input() {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}

	public static void printarr(int arr[])   {
	int	size=arr.length;
		for (int i=0;i<size;i++)  {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int ans[]=input();
		printarr(ans);

	}

}
