package gr.aueb.cf.projects;

/**
 * Calculates the maximum sum sub-array of the given array at time complexity O(n)
 * (Also known as Kadane's Algorithm for the maximum sub-array problem)
 */
public class Project2 {

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int localMaxSubArray = array[0];
        int maxSubArray = array[0];
        int subElements = 0;
        int endIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int num = array[i];

            if ((localMaxSubArray + num) < num) {
                localMaxSubArray = num;
                subElements = 0;
            } else {
                localMaxSubArray = localMaxSubArray + num;
            }

            if (maxSubArray < localMaxSubArray) {
                maxSubArray = localMaxSubArray;
                endIndex = i;
                subElements++;
            }
        }

        printSubArray(array, maxSubArray, endIndex, subElements);
        printSubArrayMax(maxSubArray);
    }

    public static void printSubArray(int[] array, int maxSubArray, int endIndex, int subElements) {
        System.out.print("Max Sub-array: {");
        for (int i = endIndex - subElements; i <= endIndex; i++) {
            System.out.print(array[i]);

            if (i != endIndex) {
                System.out.print(", ");
            } else {
                System.out.print("}");
            }
        }
    }

    public static void printSubArrayMax(int maxSubArray) {
        System.out.println("   ,   Max Sub-array Sum: " + maxSubArray);
    }
}
