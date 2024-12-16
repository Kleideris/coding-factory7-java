package gr.aueb.cf.challenges.tasks6;

public class GetSecondLowestMethod {

    public static void main(String[] args) {
        int[] testArray = {10,14,7,4,5,9,3,20,11};

        System.out.println("The second lowest value is: "
                + getSecondLowestElement(testArray));
//        System.out.println( "the second is: " + getAnyLowestElement(testArray, 2));
//        System.out.println( "the third is: " + getAnyLowestElement(testArray, 3));
//        System.out.println( "the forth is: " + getAnyLowestElement(testArray, 4));
    }

    public static int getSecondLowestElement(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array not valid");
            return -1;
        }
        int lowestValue = arr[0];
        int secondLowestValue = arr[1];


        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] < lowestValue) {
                secondLowestValue = lowestValue;
                lowestValue = arr[i+1];
            } else if(arr[i+1] < secondLowestValue) {
                secondLowestValue = arr[i+1];
            }
        }
        return secondLowestValue;
    }

//    public static int getAnyLowestElement(int[] arr, int placeFromEnd) {
//        //todo: stateCheck input arr and placeFromEnd.
//        int[] arrayWithLows = new int[placeFromEnd+1];
//        arrayWithLows[0] = arr[0];
//        int top = 0;
//        int nextMin = arr[1];
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            top++;
//            arrayWithLows[top] = nextMin;
//            while (arrayWithLows[current] < arrayWithLows[previous] && top != 0) {
//                swap(previous,current);
//                top--;
//            }
//        }
//        return arrayWithLows[placeFromEnd];
//    }
}