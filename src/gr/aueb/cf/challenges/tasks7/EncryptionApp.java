package gr.aueb.cf.challenges.tasks7;

/**
 * Replaces every char of a string with his next char in the ASCII code.
 */
public class EncryptionApp {

    public static void main(String[] args) {
        String s = "Μήνυμα για κρυπτογράφηση..";

        encrypt(s);
        System.out.println("Encrypted message: " + s);

//        decrypt(s);
//        System.out.println("Decrypted message: " + s);
    }

    public static void encrypt(String message) {
        int alteredCh;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            alteredCh = (char) ((int) message.charAt(i) + 1);
            sb.append(alteredCh);
            message = message.valueOf(sb);
        }
    }

    public static void decrypt(String message) {

    }
}
