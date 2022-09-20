package programs;

public class Fibonacci {

	public static void main(String[] args) {
		// for first 50 numbers
		int i=0,j=1,k;
		while (i<=50)
		{
		k=i+j;
		System.out.println(i);
		i=j;
		j=k;
		}
		

	}

}
