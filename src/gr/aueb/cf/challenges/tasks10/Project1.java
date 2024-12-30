package gr.aueb.cf.challenges.tasks10;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
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
        File fd = new File("C:/tmp/project1File.txt");


        try(Scanner in = new Scanner(fd)) {
            //reads the file and substrings it then prints it.
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] numbers = line.split(" ");

                for (String number : numbers) {
                    System.out.printf("%s ", number);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
