package SortingArray;

import java.util.Scanner;

public class BubbleSort {
	
public static void BubbleSort(int[] arr)  {
	for (int i=0;i<arr.length-i-1;i++)  {
		for (int j=0;j<arr.length-1;j++)   {
			int x=arr[j];
			if (arr[j]>arr[j+1])   {
				arr[j]=arr[j+1];
				arr[j+1]=x;
			}
		}
	}
}	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	
		int arr[]= new int[n];
		for (int i=0;i<n;i++ )   {
			arr[i]=s.nextInt();
		}
		BubbleSort(arr);
		for (int i=0;i<n;i++)  {
	   System.out.print(arr[i]+" ");
		}

	}

}
