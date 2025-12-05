package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializing number
		int n = 7;
	    boolean isPrime = n > 1;

	    for (int i = 2; i * i <= n; i++) {
	      if (n % i == 0) {
	        isPrime = false;
	        break;
	      }
	    }

	    System.out.println(n + (isPrime ? " is prime" : " is not prime"));
	  }
	}

	   