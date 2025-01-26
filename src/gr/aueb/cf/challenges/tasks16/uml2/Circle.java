package gr.aueb.cf.challenges.tasks16.uml2;

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
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public long getCircumference() {
        return Math.round(2 * Math.PI * radius);
    }
}
