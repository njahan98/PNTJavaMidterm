package datastructure;

import java.util.HashMap;

public class CollectionView {

    public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> country = new HashMap<Integer, String>();
        country.put(1, "USA");
        country.put(2, "Bangladesh");
        country.put(3, "Thailand");
        country.put(4, "Japan");
        country.put(5, "South Korea");
        country.put(6, "Russia");
        
        System.out.println(country);

    }

}
