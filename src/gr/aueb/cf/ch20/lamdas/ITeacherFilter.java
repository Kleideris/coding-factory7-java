package gr.aueb.cf.ch20.lamdas;

@FunctionalInterface
public interface ITeacherFilter {
    boolean filterId(Teacher teacher);
}
