package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o");  //1
        int positionOfSecondo = cf.indexOf("od", 2);    //11
        int lastPositionOfo = cf.lastIndexOf("o");

        String  cf2 = cf.substring(0);  // "Coding Factory"
        System.out.println(cf2);

        String slice = cf.substring(1, 3);  // od
        System.out.println(slice);
    }
}
