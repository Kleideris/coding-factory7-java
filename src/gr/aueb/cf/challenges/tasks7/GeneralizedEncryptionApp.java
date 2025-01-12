package gr.aueb.cf.challenges.tasks7;

/**
 * Generalized Encryption-Decryption App that replaces every char of a string with an altered char
 * in the ASCII code depending on a given key.
 *
 * @author klei
 */
public class GeneralizedEncryptionApp {

    public static void main(String[] args) {
        String message = "Μήνυμα για κρυπτογράφηση.. 012345678910";
        int encryptionKey = 3;                                                       //Caesar's Cipher.
        String encryptedMessage;
        String decryptedMessage;

        System.out.println("Original message: " + message);
        System.out.println();

        encryptedMessage = encrypt(message, encryptionKey);
        System.out.println("Encrypted message: " + encryptedMessage);

        decryptedMessage = decrypt(encryptedMessage, encryptionKey);
        System.out.println("Decrypted message: " + decryptedMessage);
    }

    public static String encrypt(String message, int key) {
        char alteredChar;
        StringBuilder encryptedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            if (isSpecialCharacter(message.charAt(i))) {
            encryptedMessage.append(message.charAt(i));
            continue;
        }

        alteredChar = message.charAt(i);
            alteredChar+= key;
            encryptedMessage.append(alteredChar);
        }

        return String.valueOf(encryptedMessage);
    }

    public static String decrypt(String message, int key) {
        char alteredChar;
        StringBuilder decryptedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {

            if (isSpecialCharacter(message.charAt(i))) {
                decryptedMessage.append(message.charAt(i));
                continue;
            }

            alteredChar = message.charAt(i);
            alteredChar-= key;
            decryptedMessage.append(alteredChar);
        }

        return String.valueOf(decryptedMessage);
    }

    public static boolean isSpecialCharacter(char character) {
        return character == ' ' || character == '.' || character == ',' || Character.isDigit(character);
    }
}