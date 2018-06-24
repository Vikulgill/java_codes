package Functions;

import java.util.Scanner;

public class Fibonacci {
	
	public static boolean  checkMember(int n){
      int a=0;
      int b=1;
     for (int i=1;i<=n;i++) {
      int c=a+b;
      a=b;
      b=c;
      if (c==n) {
     return true;
      }
     }
     return false;
	}
    public static void main(String[] args) {
    
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
     boolean ans= checkMember(n);
     System.out.println(ans);
    }

}

