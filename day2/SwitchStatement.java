package week1.day2;

public class SwitchStatement {

	public static void main(String args[]) {
		
		int day =5;
		switch(day)
		{
		case 1 :
			System.out.println("Today is Monday");
			break;
			
		case 2:
			System.out.println("Today is Tuesday");
			break;
			
		case 3 :
			System.out.println("Today is Wednesday");
			break;
		case 4 :
			System.out.println("Today is Thrusday");
			break;
			
		case 5 :
			System.out.println("Today is Friday");
			break;
			
		case 6 :
			System.out.println("Today is Saturday");
			break;
			
		default : System.out.println("No specific day");
		}
	}
		
}
