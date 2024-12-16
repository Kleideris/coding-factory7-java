package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo.
 */
public class BigIntApp {

    public static void main(String[] args) {

        //Declarations
        BigInteger bigNum1 = new BigInteger("12345678998765432199990");
        BigInteger bigNum2 = new BigInteger("32556754354241564332");
        BigInteger result;

        //Commands
        result = bigNum1.add(bigNum2);

        //Printing Results
        System.out.printf("%,d " , result);
    }
}
