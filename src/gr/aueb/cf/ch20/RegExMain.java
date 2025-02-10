package gr.aueb.cf.ch20;

public class RegExMain {

    public static void main(String[] args) {
        String s = "A8ana Androutsos";
//        System.out.println(isRed(s));
//        System.out.println(isrRedOrgGreen());
//        System.out.println(beginsWithOneUpperCaseAndEndsIning(s));
//        System.out.println(whitespaceDigit(s));
//        System.out.println(anySymbolDigit(s));
//        System.out.println(isEmail(s));
//        System.out.println(isDate(s));
//        String[] tokens = doSplit(s);
//        for (String token : tokens) {
//            System.out.print(token + " ");
//        }
//        System.out.println(doReplace(s));
        System.out.println(doReplaceBackReference(s));
    }

    /**
     * Ελέγχει (matches) αν το input string
     * είναι το "red".
     * @param s the string to be checked
     * @return true if the string matches the pattern, false otherwise
     */
    public static boolean isRed(String s) {
        return s.matches("red");
    }

    /**
     * Ελέγχει (matches) αν το input string
     * είναι το "red" ή "green".
     * @param s the string to be checked
     * @return true if the string matches the pattern, false otherwise
     */
    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }

    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }

    public static boolean beginsWithOneUpperCaseAndEndsIning(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean isOneLetterAndEndsIning(String s) {
        return s.matches("[A-Za-z]ing");
    }

    public static boolean whitespaceDigit(String s) {
        return s.matches("\\s\\d");
    }

    public static boolean anySymbolDigit(String s) {
        // return s.matches(".\\d");
        return s.matches(".[0-9]");
    }

    public static boolean isEmail(String s) {
        return s.matches("\\w*\\.?\\w+@\\w*\\.[a-z]{2,4}");
    }

    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static String[] doSplit(String s) {
        return s.split("\\s+");
    }

    public static String doReplace(String s) {
        return s.replaceAll("\\s+", " ");
    }

    public static String doReplaceBackReference(String s) {
        return s.replaceAll("(.+)\\s(.+)", "$2 $1");
    }
}
