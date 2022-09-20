package programs;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=1900;
		if(y%400==0)
		{
			System.out.println("true");
		}
		else if(y%100==0)
		{
			System.out.println("false");
		}
		else if (y%4==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
