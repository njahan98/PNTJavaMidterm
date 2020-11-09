package string.problems;

import java.util.Arrays;

public class Anagram {
	//Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
    //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
	public Anagram(char[]str1, char[]str2) {
		int n1 = str1.length;
		int n2 = str2.length;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if (n1 != n2) {
			System.out.println("false");
		}
		for (int i = 0; i < n1; i++) {
			if (str1[i] != str2[i])
				System.out.println("false");
			else {
				System.out.println("true");
			}			
		}				
	}
    public static void main(String[] args) {
        
    	char str1 [] = {'l', 'i', 's', 't', 'e', 'n'};
    	char str2 [] = {'s', 'i', 'l', 'e', 'n', 't'};
    	
    	if (str1 == str2) {
    		System.out.println("These are anagrams of one another!");
    	}else
    		System.out.println("These aren't anagrams of one another :(");

    }
}
