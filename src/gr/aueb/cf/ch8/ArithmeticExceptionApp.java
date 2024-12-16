package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numenator = 0;
        int denomenator = 0;
        int result = 0;

        while (true) {
            try {
                System.out.println("Please insert a numerator and denominator");
                numenator = in.nextInt();
                if (numenator == 0) break;

                denomenator = in.nextInt();
                result = numenator / denomenator;

                System.out.printf("%d / %d = %d\n", numenator, denomenator, result);
            } catch (ArithmeticException e) {
                System.out.println("Error. Denominator must not be zero");
            }
        }

        System.out.println("Thanks for using the app.");
    }
}
