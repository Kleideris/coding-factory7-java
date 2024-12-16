package gr.aueb.cf.challenges.tasks4;

import java.util.Scanner;

/**
 * Prints out stars according to a number n and the users preferences.
 */
public class StarsTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 0;
        int j = 0;
        int starsToLine = 0;
        int programFunction = 0;

        System.out.println("Please select on of the following program functions:");
        System.out.println("1. Prints n horizontal stars");
        System.out.println("2. Prints n vertical stars");
        System.out.println("3. Prints n x n stars");
        System.out.println("4. Prints 1 to n stars");
        System.out.println("5. Prints n to 1 stars");

        programFunction = scanner.nextInt();

        if (programFunction < 1 || programFunction > 5) {
            System.out.println("Your selection was invalid!");
            System.exit(0);
        }

        System.out.println("Please insert the number of stars you want");
        numberOfStars = scanner.nextInt();

        if (programFunction == 1) {                               //n horizontal stars:
            while (i < numberOfStars) {
                System.out.print("*  ");
                i++;
            }
        } else if (programFunction == 2) {                       //n vertical stars:
            while (i < numberOfStars) {
                System.out.println("*");
                i++;
            }
        } else if (programFunction == 3) {                       //n x n stars:
            while (i < numberOfStars) {
                while (j < numberOfStars) {
                    System.out.print("*  ");
                    j++;
                }

                System.out.println();
                j = 0;
                i++;
            }
        } else if (programFunction == 4) {                       //1 to n stars:

            starsToLine = 1;

            while (i < numberOfStars) {
                while (j < starsToLine) {
                    System.out.print("*  ");
                    j++;
                }
                System.out.println();
                starsToLine += 1;
                j = 0;
                i++;
            }
        } else if (programFunction == 5) {                       //n to 1 stars:

            starsToLine = numberOfStars;

            while (i < numberOfStars) {
                while (j < starsToLine) {
                    System.out.print("*  ");
                    j++;
                }
                System.out.println();
                starsToLine -= 1;
                j = 0;
                i++;
            }
        }
    }
}
