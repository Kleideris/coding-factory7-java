package gr.aueb.cf.projects;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Project 1: Reads 6-49 integers from a file that contains numbers from 1 up to 49, sorts them, produces
 * every possible six digit combination, filters the results according to 5 criteria and prints
 * the combinations to a .txt file
 *
 * @author klei
 */
public class Project1 {

    public static void main(String[] args) {
        File file = new File("C:/tmp/project1File.txt");
        int count = 0;

        try {

            //First pass: counts the numbers, check if they are between 1-49.
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                scanner.nextInt();
                count++;
            }
            if (count == 0 || count > 49) {
                throw new IllegalArgumentException("File must contain between 1-49 numbers");
            }

            int[] numbersArray = new int[count];

            //Second pass: put numbers in array.
            scanner = new Scanner(file);
            for (int i = 0; i < count; i++) {
                numbersArray[i] = scanner.nextInt();
            }

            Arrays.sort(numbersArray);

            for (int el : numbersArray) {
                System.out.print(el + " ");
                System.out.println();
            }

            //Continuation:

            //filtering



        } catch (IOException | IllegalArgumentException | InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }
}
