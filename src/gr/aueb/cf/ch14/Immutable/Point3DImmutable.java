package gr.aueb.cf.ch14.Immutable;

public class Point3DImmutable {
    private final ImmutablePoint immutablePoint;
    private final int z;

    public Point3DImmutable() {
        immutablePoint = new ImmutablePoint();
        z = 0;
    }

    public Point3DImmutable(ImmutablePoint immutablePoint, int z) {
        this.immutablePoint = immutablePoint;
        this.z = z;
    }


}
