package gr.aueb.cf.challenges.tasks6;

import java.util.Scanner;

/**
 * Checks if an array passes 5 predicates.
 */
public class DoesArrayPassThese5Predicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputIntegers = new int[6];

        System.out.println("Please insert 6 integers from 1 - 49");
        for (int i = 0; i < 6; i++) {
            inputIntegers[i] = scanner.nextInt();
        }

        chechSixPredicates(inputIntegers);
    }

    public static void chechSixPredicates(int[] arr) {
        System.out.println("noMoreThanThreeEvens: " + noMoreThanThreeEvens(arr));
        System.out.println("noMoreThanThreeOdds: " + noMoreThanThreeOdds(arr));
        System.out.println("noMoreThanThreeCons: " + noMoreThanThreeCons((arr)));
        System.out.println("noMoreThanThreeNumbersWithSameEnding: " + noMoreThanThreeNumbersWithSameEnding(arr));
        System.out.println("noMoreThanThreeNumbersInSameDecade: " + noMoreThanThreeNumbersInSameDecade(arr));
    }

    public static boolean noMoreThanThreeEvens(int[] arr) {
        if (arr == null) return false;
        int evens = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                evens++;
            }
        }
        return evens <= 3;
    }

    public static boolean noMoreThanThreeOdds(int[] arr) {
        if (arr == null) return false;
        int odds = 0;

        for (int item : arr) {
            if (item % 2 != 0) {
                odds++;
            }
        }
        return odds <= 3;
    }

    public static boolean noMoreThanThreeCons(int[] arr) {
        if (arr == null) return false;
        int cons = 0;

        for (int i = 0; i < arr.length - 3; i++) {
            if ((arr[i] == arr[i+1] - 1) && (arr[i] == arr[i +2] - 2) && (arr[i] == arr[i+3] - 3)) {
                cons++;
            }
        }
        return cons < 1;
    }

    public static boolean noMoreThanThreeNumbersWithSameEnding(int[] arr) {
        if (arr == null) return false;
        boolean hasSameEnding = false;
        int[] endings = new int[10];

        for (int item : arr) {
            endings[item % 10]++;
        }

        for (int ending : endings) {
            if (ending > 3) {
                hasSameEnding = true;
                break;
            }
        }
        return !hasSameEnding;
    }

    public static boolean noMoreThanThreeNumbersInSameDecade(int[] arr) {
        if (arr == null) return false;
        boolean isInSameDecade = false;
        int[] decades = new int[10];

        for (int item : arr) {
            decades[(item / 10) % 10]++;
        }

        for (int decade: decades) {
            if (decade > 3) {
                isInSameDecade = true;
            }
        }
        return !isInSameDecade;
    }
}
