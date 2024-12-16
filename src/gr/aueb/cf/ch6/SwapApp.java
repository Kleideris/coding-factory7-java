package gr.aueb.cf.ch6;

public class SwapApp {

    public static void main(String[] args) {
        int[] arr = {1, 10};
        swap(arr);
        printArray(arr);
    }

    public static void swap(int[] arr) {
        if (arr.length != 2) return;

//        arr = new arr[2]
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    //overloaded
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
