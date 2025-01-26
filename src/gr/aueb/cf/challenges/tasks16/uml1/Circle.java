package gr.aueb.cf.challenges.tasks16.uml1;

public class Circle extends AbstractShape implements ITwoDimensional {
    private double radius;

    public Circle() {
    }

    public Circle(Long id, double radius) {
        super(id);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        final double PI = 3.14;
        return PI * Math.pow(radius, 2);
    }
}
