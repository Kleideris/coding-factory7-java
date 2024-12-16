package gr.aueb.cf.tests;

public class test3 {

    public static void main(String[] args) {
        int i = 0;
        int abs = 0;

        while(i < 0) {
            System.out.println("NEVER gets in");
        }

        while (i <= 0) {
            System.out.println("Gets in ONCE");
            i++;
        }

        while (true) {
            System.out.println(i);
            break;
        }
        if (i >= 0) abs = i; else abs = -i;

        abs = (i >= 0) ? i : -i;
    }
}
