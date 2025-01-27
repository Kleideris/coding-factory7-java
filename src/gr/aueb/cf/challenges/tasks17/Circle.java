package gr.aueb.cf.challenges.tasks17;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ITwoDimensional, Serializable, Cloneable {
    private double radius;
    @Serial
    private static final long serialVersionUID = 1L;

    public Circle() {
    }

    public Circle(Long id, double radius) {
        super(id);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle.getID());
        this.radius = circle.getRadius();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle)) return false;
        return Double.compare(getRadius(), circle.getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRadius());
    }

    @Override
    public Circle clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
