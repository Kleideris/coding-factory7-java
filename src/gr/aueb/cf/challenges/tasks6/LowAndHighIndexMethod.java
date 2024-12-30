package gr.aueb.cf.challenges.tasks6;

public class LowAndHighIndexMethod {

    public static void main(String[] args) {
        int[] testArray = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;

        for (int el : lowAndHighIndexOf(testArray, key)) {
            System.out.print(el + " ");
        }
    }

    public static int[] lowAndHighIndexOf(int[] array, int key) {
        int low = -1;
        int high = -1;
        int stepCounter = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > key) break;

            if (array[i] == key) {
                high = i;
                stepCounter++;
            }
        }

        low = high - stepCounter;

        return new int[] {low, high};
    }
}
