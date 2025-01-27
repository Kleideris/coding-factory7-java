package gr.aueb.cf.challenges.tasks17;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Line extends AbstractShape implements ILine, Serializable, Cloneable {
    private  double length;
    @Serial
    private static final long serialVersionUID = 1L;

    public Line() {
    }

    public Line(Line line) {
        super(line.getID());
        this.length = line.getLength();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line line)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(getLength(), line.getLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLength());
    }

    @Override
    public Line clone() {
        try {
            return (Line) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
