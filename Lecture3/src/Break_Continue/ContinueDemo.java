package Break_Continue;

public class ContinueDemo {

	public static void main(String[] args) {
		
		int n=10;
		int i;
		for (i=0;i<=n;i++)  {
			if (i==5)   {
				continue;
			}
			System.out.println(i);
		}
//    Continue skip only one loop
	}

}
