package programs;

public class Fibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1, c, i;
		System.out.println(a);
		System.out.println(b);
		for(i=2;i<=10;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
			
	}

}
