package gr.aueb.cf.challenges.tasks16.uml1;

public class AbstractShape implements IShape {
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
}
