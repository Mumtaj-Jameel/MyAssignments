package week2.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String text = "We learn Java basics as part of java sessions in java week1";

		 // initialize count
	        int count = 0; 
	        
	     // split text
  String[] words = text.split(" ");  
  
  //Nested loops
	       
	        for (int i = 0; i < words.length; i++) 
	        {
	            if (words[i].equals("")) continue; 
	            
	            for (int j = i + 1; j < words.length; j++) 
	            {
	                if (words[j].equals("")) continue; 

	                if (words[i].equalsIgnoreCase(words[j])) 
	                {
	                    words[j] = ""; 
	                    count++;
	                }
	            }
	        }

	        if (count > 0) {
	            System.out.println("After duplicates removed:");

	            for (String w : words) {
	                if (!w.equals("")) {
	                    System.out.print(w + " ");
	                }
	            }
	        }
	    }


	}


