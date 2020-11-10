package math.problems;

import java.lang.reflect.Array;

public class FindLowestDifference {
	 /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
    
	public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int lowDif = array1[0];
        for (int i=0; i < Array.getLength(array1); i++) {
        	if ((array1[i] < array2[i]) && (array1[i] < lowDif)) {
        		lowDif = array1[i];
        	}else if (array2[i] < lowDif) {
        		lowDif = array2[i];
        	}
        }
        System.out.println(lowDif);   
	}
}
