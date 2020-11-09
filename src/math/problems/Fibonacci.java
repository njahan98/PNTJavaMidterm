package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
    	
    	int index = 0;
    	while (true) {
    		System.out.println(fibonacci(index)); //fibonacci sequence done with recursion 
    		index++; 
    	}
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
    }
    public static long fibonacci(int i) {
    	
    	if (i == 0) return 0;
    	if (i <= 2) return 1;
    	
    	long fib = fibonacci(i-1) + fibonacci(i-2);
    	return fib; 
    }
}
