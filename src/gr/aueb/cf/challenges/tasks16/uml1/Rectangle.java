package gr.aueb.cf.challenges.tasks16.uml1;

public class Rectangle extends AbstractShape implements ITwoDimensional {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(Long id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
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
}
