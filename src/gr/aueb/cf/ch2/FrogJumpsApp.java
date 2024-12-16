package gr.aueb.cf.ch2;

/**
 *  X = 10
 *  Y = 85
 *  D = 30
 *
 *  Jumps = 3
 *  10 + 30 = 40
 *  40 +30 = 70
 *  70 +30 = 100
 *
 *  Challenge: Να φτιάξω το γενικό πρόγραμμα για κάθε X, Y, D
 */
public class FrogJumpsApp {

    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        //calculate jumps
        jumps = (int) Math.ceil((target - start) / (double) hop);



        System.out.println("Jumps: " + jumps);
    }
}
