package gr.aueb.cf.challenges.tasks16.uml1;

public class Line extends AbstractShape {
    private  double length;

    public Line() {
    }

    public Line(Long id, double length) {
        super(id);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
