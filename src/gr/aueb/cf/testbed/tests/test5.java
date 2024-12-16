package gr.aueb.cf.tests;

public class test5 {

    public static void main(String[] args) {
        ;Scanner in = new Scanner(System.in);int num = in.nextInt();
        // το in είναι Scannerboolean result;
        if ((num % 2) ==  0) {    if (num > 10) {        result = true;    } else {        result = false;    }} else {    result = false;}System.out.println(result);
    }
}
