package gr.aueb.cf.challenges.tasks17;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create an instance of Circle
        Circle circle1 = new Circle(1L, 5.0);
        System.out.println("Original Circle:");
        System.out.println("ID: " + circle1.getID() + ", Radius: " + circle1.getRadius());

        // Use the copy constructor
        Circle circle2 = new Circle(circle1);
        System.out.println("\nCopy Constructor Circle:");
        System.out.println("ID: " + circle2.getID() + ", Radius: " + circle2.getRadius());

        // Use the clone() method
        Circle circle4 = circle1.clone();
        System.out.println("\nClone Method Circle:");
        System.out.println("ID: " + circle4.getID() + ", Radius: " + circle4.getRadius());

        // Modify the original circle and check if the copies are independent
        circle1.setRadius(10.0);
        System.out.println("\nModified Original Circle:");
        System.out.println("ID: " + circle1.getID() + ", Radius: " + circle1.getRadius());


        System.out.println("\nAfter Modification:");
        System.out.println("Clone Method Circle - Radius: " + circle4.getRadius());
    }
}
