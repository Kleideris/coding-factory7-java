package gr.aueb.cf.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 9};

        arr = (arr);
        for (int el : arr) {
            System.out.println(el + " ");
        }
    }

    public static int[] getEvens(int[] arr) {
        int count = 0;
        int pivot = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int[] evens = new int[count];

        for (int el : arr) {
            if (el % 2 == 0) evens[pivot++] = el;
        }
        return evens;
    }

//    public static int[] mapToDouble(int[] arr) {
//       int[] arrCopy = arr;
//
//        for (int el : arr) {
//            arrCopy[el] = (arr[el] * 2);
//        }
//        return arrCopy;
//    }

    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static int sum(int[] arr) {
//        int sum = new int[arr.length];
        int sum = 0;

        for (int el : arr) {
            sum += el;
        }
        return sum;
    }

//    public static double avg(int[] arr) {
//        int avg = (double) new int[arr.length];
//
//        for (int el : arr) {
//            avg =  sum(arr) / (double) arr.length;
//        }
//        return (double) avg;
//    }

    public static double avg(int[] arr) {
        return sum(arr) / (double) arr.length;
    }

    public static boolean anyEven(int[] arr) {
        boolean isEven = false;

        for (int el : arr) {
            if (el % 2 == 0) {
                isEven = true;
                break;
            }
        }
        return isEven;
    }

//        public static boolean moreThanTwoEvens(int[] arr) {
//            int count = 0;
//
//            for (int el : arr) {
//                if (el % 2 == 0) count++;
//            }
//
//            return count > 2;
//        }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) {
                count++;
                break;
            }
        }
        return count >= 1;

    }

    public static boolean moreThanTwoWithTheSameEnding(int[] arr) {
//        int rightdigit = 0;
//        int[] lastDigitArray;
//        int count = 0;
//
//        for (int el : arr) {
//            rightdigit = el % 10;
//
//            if (rightdigit == 1) count++;
//
//        }
//        return count > 2;
        int[] endings = new int[10];
        boolean isSamEnding = false;

        for (int num : arr) {
            endings[num % 10]++;
        }
//        for (int i = 0; i < arr.length; i++) {
//            endings[arr[i] % 10]++;
//        }
        for (int count : endings) {
            if (count >= 3) {
                isSamEnding = true;
                break;
            }
        }
        return isSamEnding;
    }

    public static boolean allAreEven(int[] arr) {
        //return getEvens(arr).length == arr.length;

        boolean allEven = false;
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        return count == arr.length;
    }


}