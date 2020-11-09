package math.problems;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        System.out.println("The lowest difference between the two arrays is: " + lowDiff());
        
    }
    static int lowDiff(int [] array, int s) {
    	int difference = Integer.MAX_VALUE;
		difference = Math.abs((array[i] - array[j])); 
    	
    	for (int i=0; i< s-1; i++) {
    		for (int j=0; j<s; j++) {
    			if(Math.abs((array[i] - array[j]) < difference){
    				return difference; 
    			}
    		
    	}
    } 

}
