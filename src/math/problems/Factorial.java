package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
    	int i, factorial = 1; //i is defined as the index, and factorial equals 1 as the base number
    	int num = 5;  //number is set to 5 
    	
    	for (i=1; i<=num; i++) {
    		factorial = factorial*i; //for this equation, the factorial # is multiplied by num, 5, and 1 is subtracted
    		//from each reoccuring number. 
    		
    	}
    	System.out.println(factorial); //prints out factorial for 5 
    }
    
}

