package gr.aueb.cf.model.PointXYZ;

/**
 * The point class represents <i>points</i> in 3d space where <b>x</b> , <b>y</b> and <b>z</b>
 * are the coordinates of a point of the instance.
 */
public class PointXYZ {
    private int x;
    private int y;
    private int z;

    /**
     * initialises a newly created object to a (0,0,0) point.
     */
    public PointXYZ() {
    }

    /**
     * Constructs a new point with coordinates (x,y,z).
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Gets the x-coordinate.
     * @return the value of the x-coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the x-coordinate.
     * @param x the x-coordinate.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets the y-coordinate.
     * @return the value of the y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y-coordinate.
     * @param y the y-coordinate.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Gets the z-coordinate.
     * @return the value of the z-coordinate
     */
    public int getZ() {
        return z;
    }

    /**
     * Sets the z-coordinate.
     * @param z the z-coordinate
     */
    public void setZ(int z) {
        this.z = z;
    }

    /**
     * Returns the state of this point.
     * @return (x,y,z) coordinates transformed into String.
     */
    public String convertToString() {
        return "PointXYZ{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * Calculates the distance of the point from the Z-axes
     * @return the distance XY from the Z-axes
     */
    public double getXYDistance() {
        return Math.sqrt((x * x) + (y * y));
    }

    /**
     * Calculates the distance of the point from the X-axes
     * @return the distance YZ from the X-axes
     */
    public double getYZDistance() {
        return Math.sqrt((y * y) + (z * z));
    }

    /**
     * Calculates the distance of the point from the Y-axes
     * @return the distance XZ from the Y-axes
     */
    public double getXZDistance() {
        return Math.sqrt((x * x) + (z * z));
    }

    /**
     * Calculates the distance of the point from the center point (0,0,0)
     * @return the distance XYZ from the center-point
     */
    public double getXYZDistance() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }
}
