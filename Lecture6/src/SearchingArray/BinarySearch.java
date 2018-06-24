package SearchingArray;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int num){
		int size=arr.length;
	      int start=0,end=size-1;
	      while (start<=end)   {
	      int mid=(start+end)/2;
	     if (arr[mid]==num)  {
	       return mid;
	     }
	      else if (num>arr[mid]) {
	        start=mid+1;
	      }
	      else   {
	    	  end=mid-1;
	      }
	      }
	      return -1;
		}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int arr[]= new int[n];
		for (int i=0;i<n;i++ )   {
			arr[i]=s.nextInt();
		}
	int ans=binarySearch(arr,x);
	System.out.println(ans);

	}

}
