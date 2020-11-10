package datastructure;

import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
    	Map<Integer, String> bangladesh = new LinkedHashMap<Integer, String>();

        bangladesh.put(0, "Dhaka");
        bangladesh.put(1, "Sylhet");
        bangladesh.put(2, "Chandpur");
        bangladesh.put(3, "Comila");
        bangladesh.put(4, "Satkhira");
        bangladesh.put(5, "Cox Bazaar");


        for (Map.Entry<Integer, String> cities : bangladesh.entrySet()) {
            System.out.println(cities.getKey() + " " + cities.getValue());
        }
        System.out.println("");
       
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */    		
    	
    }

}
