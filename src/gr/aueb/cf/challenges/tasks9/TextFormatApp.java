package gr.aueb.cf.challenges.tasks9;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class TextFormatApp {

    public static void main(String[] args) {
        File inputFile = new File("C:/tmp/locations.txt");
        File outputFile = new File("C:/tmp/formated-locations.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintStream ps = new PrintStream(outputFile, StandardCharsets.UTF_8)) {

            String line;
            String firstLine = reader.readLine();
            String[] headerTokens = firstLine.split(",");
            String[] tokens;

            while ((line = reader.readLine()) != null) {
                tokens = line.split("\\s*,\\s*");
                ps.printf("{ location: '%s', latitude: %s, longitude: %s },\n", tokens[0], tokens[1], tokens[2]);
                System.out.printf("{ location: '%s', latitude: %s, longitude: %s },\n", tokens[0], tokens[1], tokens[2]);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
