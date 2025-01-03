package gr.aueb.cf.projects;

/**
 * Calculates the maximum sum sub-array of the given array at time complexity O(n)
 */
public class Project2 {

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int subArrayTotal = 0;
        int subArrayMax = 0;
        int j = 0;

        for (int i = 0; i < array.length - j; i++) {
            for (i = 0; i <= j; i++) {
                subArrayTotal += array[i];
            }
            subArrayMax = Math.max(subArrayMax, subArrayTotal);
            j++;
            System.out.println(subArrayMax);
        }
        System.out.println(subArrayMax);
    }
}
