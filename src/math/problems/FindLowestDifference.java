package math.problems;

public class FindLowestDifference {
	 /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
    
	public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        System.out.println(lowDiff(array2, array1));

    }
    static int lowDiff(int[] arr, int s)
    {
        int difference = Integer.MAX_VALUE;

        for (int i=0; i<s-1; i++)
            for (int j=i+1; j<s; j++)
                if (Math.abs((arr[i] - arr[j]) )< difference)
                    difference = Math.abs((arr[i] - arr[j]));

        return difference;
    }

}
