package gr.aueb.cf.challenges.tasks6;

public class GeneralArrayMethods {

    public static void main(String[] args) {
        int[] randomArray = {10,5,7,3,54,3,2,5,52,3,4,67,78,5,43,1};
        int[] doubledArray = doubleNumbersInArray(randomArray);
        int[] negativeArray = {-4 -6 -19};
        boolean positiveExists = false;

        System.out.println(positionOfElement(randomArray, 90));
        filterEvens(randomArray);
        positiveExists = checkForPositiveNumber(negativeArray);
        System.out.println("Positive Exists: " + positiveExists);
        System.out.println("All numbers are positive: " + isEveryElementPositive(randomArray));

        System.out.println();
        for (int el : doubledArray) {
            System.out.print(el + " ");
        }
    }

    public static int positionOfElement(int[] array, int element) {
        int position = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                position = i + 1;
                break;
            }
        }
        return position;
    }

    public static void filterEvens(int[] array) {
        for (int el : array) {
            if (el % 2 == 0) {
                System.out.print(el + " ");
            }
        }
    }

    public static int[] doubleNumbersInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }

        return array;
    }

    public static boolean checkForPositiveNumber(int[] array) {
        boolean positiveExists = false;

        for (int num : array) {
            if (num >= 0) {
                positiveExists = true;
                break;
            }
        }

        return positiveExists;
    }

    public static boolean isEveryElementPositive(int[] array) {
        for (int el : array) {
            if (el < 0) {
                return false;
            }
        }

        return true;
    }
}
