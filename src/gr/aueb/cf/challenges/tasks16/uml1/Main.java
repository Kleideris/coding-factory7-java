package gr.aueb.cf.challenges.tasks16.uml1;

public class Main {

    public static void main(String[] args) {
        AbstractShape oval = new AbstractShape(2L);
        AbstractShape pc = new Circle(3L, 5);
        Circle c1 = new Circle(1L, 2);
        Rectangle r1 = new Rectangle(1L, 3, 6);

        System.out.println(oval.getID());
        System.out.println(pc.getID());
        System.out.println(((Circle) pc).getRadius());
        System.out.println();

        System.out.println(c1.getArea());
        System.out.println(r1.getArea());
    }
}
