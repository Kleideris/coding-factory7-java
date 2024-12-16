package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenomenator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numenator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert numerator (Quit with numenator = 0)");
            numenator = scanner.nextInt();

            if (numenator == 0) {
                System.out.println("Numenator is zero. Quiting...");
                break;
            }

            System.out.println("Please insert denominator");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Denominator can not be zero.");
                continue;
            }

            result = numenator / denominator;
            System.out.println("Result = " + result);
        }
    }
}




// Προτιμάμε ο κώδικας να είναι γραμμικός και οχι nested όπως εδώ.
//            if (denominator != 0) {
//                if (numenator != 0) {
//                    result = numenator / denominator;
//                } else {
//                    System.out.println("Numenator is zero");
//                    break;
//                }
//            } else {
//                System.out.println("Denominator is zero");
//                continue;
//            }