package mypackage;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//If a year is divisible by 400, it is a leap year.
		//If a year is divisible by 100 (but not by 400), it is not a leap year.
		//If a year is divisible by 4 (but not by 100), it is a leap year.
	//Otherwise, it is not a leap year.
		int year=1900;
		if(year%400==0)
		{
			System.out.println("leap year");
		}
		else if(year%100==0) 
			{
			System.out.println("not leap year");
			}
		else if(year%4==0)
				{
					System.out.println("leap year");
					
				}
				else {
					System.out.println(" not leap year");
					
				}
			

	}

}
