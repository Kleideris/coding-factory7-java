package gr.aueb.cf.projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Reads 6-49 integers from a file that contains numbers from 1 up to 49, sorts them, produces
 * every possible six digit combination, filters the results according to 5 criteria and prints
 * the combinations to a .txt file
 *
 * @author klei
 */
public class Project1 {

    public static void main(String[] args) {
        File fileInput = new File("C:/tmp/project1_File.txt");
        File fileOutput = new File("C:/tmp/project1_Combinations_Output.txt");
        int count;

        try(Scanner scanner = new Scanner(fileInput);
            PrintWriter pw = new PrintWriter(fileOutput)) {

            //state checks file
            count = countNumbersInFile(fileInput);

            if(count < 6 || count > 49) {
                System.out.println("File must contain at least 6 and at most 49 numbers");
                System.exit(1);
            }

            if (!areValuesValid(fileInput)) {
                System.out.println("Numbers in file must be between 1-49");
                System.exit(1);
            }

            //creates and populate array
            int[] numbersArray = new int[count];

            for (int i = 0; i < count; i++) {
                numbersArray[i] = scanner.nextInt();
            }

            //sorts array and produces 6digit combinations
            Arrays.sort(numbersArray);
            int[] combination = new int[6];
            final int COMBINATION_SIZE = 6;
            int window = count - COMBINATION_SIZE;
            int newRow = 0;

            for (int i = 0; i <= window; i++) {
                for (int j = i + 1; j <= window + 1; j++) {
                    for (int k = j + 1; k <= window + 2; k++) {
                        for (int l = k + 1; l <= window + 3; l++) {
                            for (int m = l + 1; m <= window + 4; m++) {
                                for (int n = m + 1; n <= window + 5; n++) {

                                    combination[0] = numbersArray[i];
                                    combination[1] = numbersArray[j];
                                    combination[2] = numbersArray[k];
                                    combination[3] = numbersArray[l];
                                    combination[4] = numbersArray[m];
                                    combination[5] = numbersArray[n];

                                    //keeps only the combinations that consist of unique numbers.
                                    if (!consistsOfUniqueNumbers(combination)) {
                                        continue;
                                    }

                                    //filters combinations and prints them to output file
                                        if (passesFilter(combination)) {
                                            pw.printf("{%02d,%02d,%02d,%02d,%02d,%02d}  ",
                                                    combination[0], combination[1], combination[2],
                                                    combination[3], combination[4], combination[5]);
                                            newRow++;
                                        }

                                        if (newRow == 6) {
                                            pw.println();
                                            newRow = 0;
                                        }
                                }
                            }
                        }
                    }
                }
            }

            System.out.println("Combinations created successfully, and stored in: " + fileOutput);

        } catch (IOException e) {

            if (!fileOutput.exists()) {
                System.err.println("The specified path: " + fileOutput + " for the file output does not exist.");
                System.err.println("Please create the path and try again.");
                System.exit(1);
            }

            System.err.println("An error occurred when trying to read the file. Please try again.");
        }
    }

    public static int countNumbersInFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int count = 0;

        while (scanner.hasNextInt()) {
            scanner.nextInt();
            count++;
        }

        return count;
    }

    public static boolean areValuesValid(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        boolean isValidValue = true;
        int number;

        while (scanner.hasNextInt()) {
            number = scanner.nextInt();

            if (number < 0 || number >= 49) {
                isValidValue = false;
                break;
            }
        }

        return isValidValue;
    }

    public static boolean consistsOfUniqueNumbers(int[] combination) {
        boolean hasUniqueNumbers = true;

        for (int i = 1; i < 6; i++) {
            if (combination[i - 1] == combination[i]) {
                hasUniqueNumbers = false;
                break;
            }
        }

        return hasUniqueNumbers;
    }

    public static boolean passesFilter(int[] combination) {
        return hasNoMoreThan4Evens(combination) &&
                hasNoMoreThan4Odds(combination) &&
                hasNoMoreThan2Consecutive(combination) &&
                hasNoMoreThan3SameEndingNumbers(combination) &&
                hasNoMoreThan3SameDecadeNumbers(combination);
    }

    public static boolean hasNoMoreThan4Evens(int[] combination) {
        int evens = 0;

        for (int num : combination) {
            if (num % 2 == 0) {
                evens++;
            }
        }

        return evens <= 4;
    }

    public static boolean hasNoMoreThan4Odds(int[] combination) {
        int odds = 0;

        for (int num : combination) {
            if (num % 2 != 0) {
                odds++;
            }
        }

        return odds <= 4;
    }

    public static boolean hasNoMoreThan2Consecutive(int[] combination) {
        int consecutive = 0;

        for (int i = 0; i < combination.length; i++) {
            int num = combination[i];

            if (i > 0 && (combination[i - 1] + 1) == num) {
                consecutive++;
            } else {
                consecutive = 0;
            }
        }

        return consecutive <= 2;
    }

    public static boolean hasNoMoreThan3SameEndingNumbers(int[] combination) {
        int[] sameEndingNumbers = new int[10];
        boolean statementIsTrue = true;

        for (int num : combination) {
            int ending = num % 10;

            sameEndingNumbers[ending]++;

            if (sameEndingNumbers[ending] > 2) {
                statementIsTrue = false;
                break;
            }
        }

        return statementIsTrue;
    }

    public static boolean hasNoMoreThan3SameDecadeNumbers(int[] combination) {
        int[] sameDecadeNumbers = new int[10];
        boolean statementIsTrue = true;

        for (int num : combination) {
            int decade = num / 10;

            sameDecadeNumbers[decade]++;

            if (sameDecadeNumbers[decade] > 2) {
                statementIsTrue = false;
                break;
            }
        }

        return statementIsTrue;
    }
}
