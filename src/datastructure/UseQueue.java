package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,poll elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
    	//Add 
        Queue<String> twilight = new LinkedList<String>();
        twilight.add("Edward");
        twilight.add("Bella");
        twilight.add("Alice");
        twilight.add("Jasper");
        twilight.add("Rosalie");
        twilight.add("Emmett");
        System.out.println(twilight);
        
        //Peek 
        System.out.println(twilight);
        
        //Remove
        String oldHead = twilight.poll();
        String newHead = twilight.peek();
        System.out.println(oldHead);
        System.out.println(newHead);
        
        for (String Laurett : twilight) {
        	System.out.println(Laurett);
        }

    }
}
