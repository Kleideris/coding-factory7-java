package gr.aueb.cf.challenges.tasks6;

public class GetMaxPositionMethod {

    public static void main(String[] args) {
        int[] testArray = {10,14,7,4,5,9,3,20,11};

        System.out.println("The max position is in place: "
                + getMaxPosition(testArray, 0 ,testArray.length - 1));
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        if ((arr == null) || (low < 0) || (high > arr.length - 1)) {
            System.out.println("Invalid parameters inserted in method \"getMaxPosition\"");
            return -1;
        }
        int maxPosition = low;
        int maxValue = arr[low];

        for (int i = low; i <= high - 1; i++) {
            if (maxValue < arr[i+1]) {
                maxPosition = i + 1;
                maxValue = arr[i+1];
            }
        }

        return maxPosition;
    }
}