package gr.aueb.cf.challenges.tasks9;

import java.io.*;
import java.util.Scanner;
import java.util.UUID;

public class CopyWithMetadata {

    public static void main(String[] args) throws FileNotFoundException {
        String inputPath = "C:/tmp/";
        String outputPath = "C:/tmp/";
        String userInputFile;
        String inputFile;
        String outputFile;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert input File Name");
        userInputFile = sc.nextLine();

        inputFile = inputPath + userInputFile;
        outputFile = outputPath + UUID.randomUUID().toString().replace(":", "_") + "_" + userInputFile;

        File inFd = new File(inputFile);
        File outFd = new File(outputFile);
        byte[] buf = new byte[4096];
        int byteCounter;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inFd));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outFd))) {

            while ((byteCounter = bis.read(buf)) != -1) {
                bos.write(buf, 0, byteCounter);
            }
            System.out.println("Input File: " + inFd.getAbsolutePath());
            System.out.println("Output File: " + outFd.getAbsolutePath());

            String extension = "";
            int dotIndex = inputFile.lastIndexOf(".");
            extension = inputFile.substring(++dotIndex);
            System.out.println("Extension: " + extension);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("Failed to copy the file. " + e.getMessage());
        }

    }
}
