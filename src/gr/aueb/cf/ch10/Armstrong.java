package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * 153 => 1^3 + 5^3 + 3^3
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        int numberOfDigits = 0;
        int originalNum = 0;
        int digit = 0;
        int copyOfNum = 0;



        System.out.println("Please insert number");
        num = scanner.nextInt();
        numberOfDigits = String.valueOf(num).length();   //valueOf transforms a primitive to String
        originalNum = num;

        while (num != 0) {
            digit = num % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            num /= 10;          // num = num / 10
        }

        System.out.printf("%d%s Armstrong", originalNum, (sum == originalNum) ? " is" : " is not");














//        todo na ta elegksw sto spiti

//        do {
//            numberOfDigits++;
//            copyOfNum /= 10;
//        } while (copyOfNum > 0);
//
//        int[] sums = new int[numberOfDigits];
//        copyOfNum = num;
//        int Armstrong = 0;
//        boolean isArmstrong = false;
//
//        for (int i = 0; i < sums.length; i++) {
//            sums[i] = (copyOfNum % 10) ^ numberOfDigits;
//            copyOfNum /= 10;
//            Armstrong += sums[i];
//        }
//
//        if (Armstrong == num) isArmstrong = true;


    }
}
