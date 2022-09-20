package programs;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rem,sum=0;
		int n=951;
		while(n>0)
		{
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
		}
		System.out.println(sum);
		
		}

	}


