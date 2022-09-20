package programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13,num=0;
		for(int i=1; i<=a;i++)
		{
			if(a%i==0)
			{
				num++;
			}
		}
		if(num==2)
		System.out.println("prime no.");
		else
		System.out.println("not prime no.");
	}

}
