package gr.aueb.cf.ch5;

public class PowerAppRecursive {

    public static void main(String[] args) {
        for (int b = 2, p = 1; p <= 10; p++) {
            System.out.println(power(b, p));
        }
    }

    public static int power(int a, int n) {
        return (n == 0) ? 1 : power(a, n-1) * a;
    }
}
