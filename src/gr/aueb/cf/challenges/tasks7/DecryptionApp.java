package gr.aueb.cf.challenges.tasks7;

/**
 * Replaces every char of a string with his previous char in the ASCII code.
 *
 * @author klei
 */
public class DecryptionApp {

    public static void main(String[] args) {
        String encryptedMessage = "Νίξφνβ!δκβ!βρπλςφρυπδςέχθτθ//";
        String decryptedMessage;

        System.out.println("Original encrypted message: " + encryptedMessage);
        System.out.println();

        decryptedMessage = decrypt(encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);
    }

    public static String decrypt(String message) {
        char alteredChar;
        StringBuilder decryptedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            alteredChar = message.charAt(i);
            alteredChar--;
            decryptedMessage.append(alteredChar);
        }

        return String.valueOf(decryptedMessage);
    }

}
