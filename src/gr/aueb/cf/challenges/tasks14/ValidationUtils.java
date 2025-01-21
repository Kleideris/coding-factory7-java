package gr.aueb.cf.challenges.tasks14;

public class ValidationUtils {

    public static boolean isStringLengthBetween1and31(String string) {
        int counter = 0;
        for (char ch : string.toCharArray()) {
            counter++;
        }
        return counter >= 1 && counter <= 31;
    }

    public static boolean isNumberBetween1and10(int number) {
        return number >= 1 && number <= 10;
    }
}
