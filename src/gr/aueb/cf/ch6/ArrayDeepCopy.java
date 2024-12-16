package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 *
 */
public class ArrayDeepCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copied = arrDeepCopy(arr);

        for (int el : copied) {
            System.out.print(el + " ");
        }

        copied[4] = 100;
        System.out.println();

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    /**
     * it creates a fresh-copy (deep copy) of an
     * input array.
     * @param source    the source array.
     * @return          the copied array.
     */
    public static int[] arrDeepCopy(int[] source) {

        int[] destination = new int[source.length];

        for (int i =0; i < source.length; i++) {
            destination[i] = source[i];
        }
//        System.arraycopy(source, 0, destination, 0, source.length);
//        return Arrays.copyOf(source, source.length);
//        destination = Arrays.copyOfRange(source, 0, source.length);

        return destination;
    }
}
