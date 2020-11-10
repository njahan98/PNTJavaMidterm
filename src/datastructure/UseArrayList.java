package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
    	 List<String> harryPotter = new ArrayList<String>();
    	 
    	 //Ad
         harryPotter.add("Harry");
         harryPotter.add("Ron");
         harryPotter.add(1, "Hermione");
         harryPotter.add(2, "Snape");
         harryPotter.add(3, "Dumbledore");
         harryPotter.add(4, "Umbridge"); 

         harryPotter.remove("Umbridge"); //remove element 
         harryPotter.remove(4);

         System.out.println(harryPotter);
         System.out.println(harryPotter.get(1)); //retrieve element 


         System.out.println("Using for loop: ");
         for (String s : harryPotter)
             System.out.println(s);

         System.out.println("using while loop with Iterator");
         Iterator<String> itter = harryPotter.iterator();
         while (itter.hasNext())
             System.out.println(itter.next());


         System.out.println("Characters: "); //sorted into one database
         Collections.sort(harryPotter);
         System.out.println(harryPotter);

    }

}
