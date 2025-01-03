package gr.aueb.cf.projects;

import java.io.*;
import java.util.Arrays;

/**
 * Reads the characters of a file ignoring whitespaces, and then outputs statistical
 * data of their frequency first ordered by character and then by frequency
 *
 * @author klei
 */
public class Project3 {

    public static void main(String[] args) {
        File file = new File("C:/tmp/file_name.txt");
        int[][] charFrequency = new int[128][2];
        int endOfArray = 0;

        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            int c;
            while ((c = bf.read()) != -1 && !isFull(endOfArray)) {
                if (Character.isWhitespace(c)) {
                    continue;
                }

                boolean found = false;
                for (int i = 0; i < endOfArray; i++) {
                    if (charFrequency[i][0] == c) {
                        charFrequency[i][1]++;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    charFrequency[endOfArray][0] = c;
                    charFrequency[endOfArray][1]++;
                    endOfArray++;
                }
            }

            displayStatistics(charFrequency, endOfArray);

        } catch (IOException e) {
            System.err.println("An error occurred when trying to read the file. Please try again");
        }
    }

    public static boolean isFull(int endOfArray) {
        return endOfArray >= 128;
    }

    public static void displayStatistics(int[][] characterFrequency, int endOfArray) {
        char character;
        int frequency;

        System.out.println("\nStatistical data of characters, arranged by frequency:\n");
        Arrays.sort(characterFrequency, 0, endOfArray, (a, b) -> Integer.compare(b[1], a[1]));

        for (int i = 0; i < endOfArray; i++) {
            character = (char) characterFrequency[i][0];
            frequency = characterFrequency[i][1];
            System.out.print("Character: [" + character + "] , Frequency: " + frequency);
            System.out.println();
        }

        System.out.println("\n\nStatistical data of characters, arranged by character:\n");
        Arrays.sort(characterFrequency, 0, endOfArray, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < endOfArray; i++) {
            character = (char) characterFrequency[i][0];
            frequency = characterFrequency[i][1];
            System.out.print("Character: [" + character + "] , Frequency: " + frequency);
            System.out.println();
        }
    }
}

//todo: make the data appear side to side.