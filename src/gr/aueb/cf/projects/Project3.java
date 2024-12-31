package gr.aueb.cf.projects;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Project3 {
    public static int charIndex = 3;

    public static void main(String[] args) {
        File file = new File("C:/tmp/file_name");
        char[][] characters = new char[128][2];



//        try {
//            Scanner scanner = new Scanner(file);

//            while (scanner.hasNext()) {
//                charIndex = (int) scanner.next();
//                if ((charIndex - 'A') >= 26 || (charIndex - 'A' <= 31)) {
//
//                }
//
//            }
//        } catch (IOException e){
//            }
    }

    public static boolean isInvalidCharacter() {
        return ((charIndex - 'A') < 0 || (charIndex - 'A') > 57);
    }
//    public static boolean isSpecialCharacter()
}
