package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not. 
         */
    	String original = "do geese see god";
    	original = original.replace(" ", ""); 

    	String reverse = "";
    	for(int i = original.length()-1; i>=0; i--) {
    		reverse += original.charAt(i); 
    		System.out.println(reverse);	
    	}
    	boolean palindrome = true; 
    	for(int i = 0; i < original.length(); i++) { 
    		if (original.charAt(i) != reverse.charAt(i)) {
    			palindrome = false; 
    		}
    	}
    	if (palindrome) {
    		System.out.println("Woohoo! This is a palindrome!");
    	}else {
    		System.out.println("Shucks 😞 This is not a palindrome!");
    	}
    }
  
}
