package gr.aueb.cf.challenges.tasks5;

/**
 * Lots of methods.
 *
 * @author klei
 */
public class ManyMethods {

    public static void main(String[] args) {

        //Celsius to Fahrenheit:
        double tempC = 100.0;
        double tempF = 0.0;

        tempF = celsiusToFahrenheit(tempC);
        System.out.println(tempF);



        // Square Number:
        long number = 5L;
        System.out.println(square(number));



        //Is Prime:
        int number2 = 7;
        System.out.println(isPrime(number2));


        //Find Max:
        int a = -23, b = 16, c =-12;
        System.out.println(findMax(a,b,c));
    }



    public static double celsiusToFahrenheit(double tempC){
        return (tempC * 9) / 5 + 32;
    }

    public static long square(long number) {
        return number * number;
    }

    public static boolean isPrime(int number) {
        boolean isPrime = false;
        int numberCount = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                numberCount++;
            }
        }

        isPrime = (number == 1) || (numberCount == 1);

        return isPrime;
    }

    public static int findMax(int a, int b, int c) {
        int max = a;

        max = (max - b) > 0 ? max : b;
        max = (max - c) > 0 ? max : c;

        return max;
    }
}
