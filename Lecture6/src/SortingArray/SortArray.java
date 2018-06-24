package SortingArray;

import java.util.Scanner;

public class SortArray {
	
	public static void SortArray(int[] arr)    {
		for (int i=0;i<arr.length-1;i++)   {
			int min=arr[i];
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++)  {
			if (min>arr[j])   {
				min=arr[j];
				minIndex=j;
			}
			}
			arr[minIndex]=arr[i];
			arr[i]=min;
			
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	
		int arr[]= new int[n];
		for (int i=0;i<n;i++ )   {
			arr[i]=s.nextInt();
		}
		SortArray(arr);
		for (int i=0;i<n;i++)  {
			System.out.print(arr[i]+" ");
		}

	}

}
