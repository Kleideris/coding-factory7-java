package gr.aueb.cf.challenges.tasks17;

import java.io.Serializable;
import java.util.Objects;

public class AbstractShape implements IShape, Serializable, Cloneable {
    private Long id;

    public AbstractShape() {
    }

    public AbstractShape(Long id) {
        this.id = id;
    }

    public void setId(Long id){
        this.id = id;
    }

    @Override
    public Long getID() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractShape that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
