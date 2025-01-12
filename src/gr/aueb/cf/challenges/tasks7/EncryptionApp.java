package gr.aueb.cf.challenges.tasks7;

/**
 * Replaces every char of a string with his next char in the ASCII code.
 *
 * @author klei
 */
public class EncryptionApp {

    public static void main(String[] args) {
        String message = "Μήνυμα για αποκρυπτογράφηση..";
        String encryptedMessage;

        System.out.println("Original message: " + message);
        System.out.println();

        encryptedMessage = encrypt(message);
        System.out.println("Encrypted message: " + encryptedMessage);
    }

    public static String encrypt(String message) {
        char alteredChar;
        StringBuilder encryptedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            alteredChar = message.charAt(i);
            alteredChar++;
            encryptedMessage.append(alteredChar);
        }

        return String.valueOf(encryptedMessage);
    }

    //todo: let spaces as is in the encrypted message..
}
