package string.problems;

import java.util.HashMap;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
    	findDuplicateWord("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language"); 
    }
    static void findDuplicateWord(String str) {
    	HashMap<String, Integer> hm = new HashMap<>(); //we use hashmap bc we want to put the sentence into a table
    	String [] s = str.split(" ");
    	for(String tempString : s) {
    		if (hm.get(tempString) != null) { //has some value
    			hm.put(tempString, hm.get(tempString) + 1);
    		}else {
    		hm.put(tempString, 1); 
    	}
    	} 
    	System.out.println(hm);
    }
//STILL NEEDS WORK; DIDNT COMPLETE AVG LENGTH OF WORDS**
}
