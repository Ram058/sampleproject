	package programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;
		int n=9474;
		temp=n;
		while (n>0)
		{
		r=n%10;
		sum=sum+(r*r*r*r);
		n=n/10;
		}
		if(temp==sum)
			System.out.println("armstrong no");
		else
			System.out.println("not armstrong no");
	}

}
