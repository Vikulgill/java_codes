package UsingFuncArray;

import java.util.Scanner;

public class SwapNo {
	
	
	public static void swapAlternate(int[] input){
	int size=input.length;
    for (int i=0;i<size;i+=2) {
   int  x=input[i];
      input[i]=input[i+1];
      input[i+1]=x;
     System.out.print(input[i]+" ");
     System.out.print(input[i+1]+" ");
    }
//    if (size%2!=0)  {
//    	System.out.print(size-1);
//    }
    System.out.print(input[size-1]);
    }

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++)  {
			arr[i]=s.nextInt();
		}
		swapAlternate(arr);
		
		
		}

	}


