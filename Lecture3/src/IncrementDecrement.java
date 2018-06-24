
public class IncrementDecrement {

	public static void main(String[] args) {
	
		int a=10;
		a++;
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a++);
	int	b=a++;
		System.out.println(b);
		System.out.println(a);
//		a++   it is post increment 
//		++a  it is pre increment
		int c=2*3/2;
		System.out.println(c);
//		As * associativity is more than /
		int d=2+2*3;
		System.out.println(d);
//		As * precedence is more than +
		int e=5;
		e*=2;
		System.out.println(e);
	}

}
