package gr.aueb.cf.challenges.tasks17;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Rectangle extends AbstractShape implements IRectangle, ITwoDimensional, Serializable, Cloneable {
    private double width;
    private double height;
    @Serial
    private static final long serialVersionUID = 1L;

    public Rectangle() {
    }

    public Rectangle(Long id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle.getID());
        this.width = rectangle.getWidth();
        this.height = rectangle.getHeight();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public long getCircumference() {
        return Math.round((2 * width) + (2 * height));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(getWidth(), rectangle.getWidth()) == 0 && Double.compare(getHeight(), rectangle.getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWidth(), getHeight());
    }

    @Override
    public Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
