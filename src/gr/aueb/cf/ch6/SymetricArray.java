package gr.aueb.cf.ch6;

public class SymetricArray {

    public static void main(String[] args) {

    }

    //Να ελεγξω αν δουλεύει...

//    public static boolean isSymetric(int[] arr) {
//        int mid = (0 + arr.length - 1) / 2;
//
//        for (int i = 0; i < mid; i++) {
//            if (arr[i] != arr[arr.length -1 -i])
//              return false;
//        }
//    }

    public static boolean isSymetric(int[] arr) {
        boolean isSymetric = false;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            isSymetric = false;
            break;
        }

        return isSymetric;
    }
}
