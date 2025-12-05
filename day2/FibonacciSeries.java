package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Number of Terms
		int n=8;
		
		//Initialize Value
		int a=0,b=1;
		
		System.out.println("Fibonacci Series");
		for(int i=0; i<n ;i++)
		{
			System.out.println(a+ "  ");
			int incr=a+b;
			a=b;
			b=incr;
			
		}
		

	}

}
