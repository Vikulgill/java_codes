package UsingFuncArray;

import java.util.Scanner;

public class largestNum {

	

	public static int[] input() {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}

	public static void printlargest(int arr[])   {
	int	size=arr.length;
	int max=Integer.MIN_VALUE;
		for (int i=0;i<size;i++)  {
		if  (max<arr[i])     {
			max=arr[i];
	}
		}
		System.out.println(max);
		
	}

	public static void main(String[] args) {
		int ans[]=input();
	printlargest(ans);	

	}



}
