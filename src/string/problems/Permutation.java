package string.problems;

import java.util.Set;

public class Permutation { //standard for interviews 
	public static void main (String [] args) {
		permutation("ABC");
	}
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *Permutations are used to get every combination of options for an arrangement. 
         */  	    	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int s = str.length();
	    if (s == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < s; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, s));
	    }
	}
}
