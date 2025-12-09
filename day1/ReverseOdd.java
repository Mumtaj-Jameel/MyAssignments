package week2.day1;

public class ReverseOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";

        // Split words into an array
        String[] words = test.split(" ");

        // Traverse through each word
        for (int i = 0; i < words.length; i++) {

            // Check for odd index
            if (i % 2 == 1) {

                // Convert the word into a character array
                char[] chars = words[i].toCharArray();

                //  Reverse using another loop
                for (int j = chars.length - 1; j >= 0; j--) {
                    System.out.print(chars[j]);
                }

            } else {
                
                System.out.print(words[i]);
            }

          System.out.print(" ");
     
        }
    }
}
