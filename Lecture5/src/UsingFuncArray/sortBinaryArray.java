package UsingFuncArray;
import java.util.Scanner;

public class sortBinaryArray {
	
	public static void sortBinaryArray(int[] arr){
		int size=arr.length;
      int val=0;
      int val2=size-1;
       for (int i=0;i<size;i++)   {
        if  (arr[i]==0)  {
         
          val++;
        }
       }
        for (int i=0;i<val;i++){
        arr[i]=0;
        }
        for (int i=val;i<size;i++)  {
        	arr[i]=1;
        }
	}
  

	

	public static void main(String[] args) {
	
		int arr[]= {1,0,0,1,0};
		sortBinaryArray(arr);
		for (int i=0;i<5;i++)  {
			System.out.print(arr[i]+" ");
		}

	}

}
