package Static;


public class FirstLetterCapital {

	public static void main(String[] args) {
		/*
Write a Java program to capitalize the first letter of each word in a sentence
Input a Sentence: the quick brown fox jumps over the lazy dog.
The Quick Brown Fox Jumps Over The Lazy Dog

		 */

		String str1= "the quick brown fox jumps over the lazy dog";				
	String[] str2 = str1.split(" ");
	String newString ="";
	
	for(String s : str2) {
		String first= s.substring(0,1);
		String other=s.substring(1);
		
		newString+=first.toUpperCase()+other +" ";
	}
	
	System.out.println(newString);
	}

}
