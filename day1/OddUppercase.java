package week2.day1;

public class OddUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialization of string
		 
		String text= "changeme";
		
		//Converting to character array
		char[] charArray= text.toCharArray();
		
		//loop for each character
		for(int i=charArray.length-1;i>=0;i--) {
			
			//checking odd
			if(i % 2 == 1) {
				 charArray[i] = Character.toUpperCase(charArray[i]);
			}
			
			System.out.print(charArray[i]);
		}
		

	}

}
