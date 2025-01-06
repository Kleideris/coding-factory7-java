package gr.aueb.cf.challenges.Tasks13.pointapp;

public class Main {

    public static void main(String[] args) {
        PointXYZ point1 = new PointXYZ(3,4,5);

        System.out.println("point1 state:" + point1.convertToString());
        System.out.println("distance XY from Z-Axes: " + point1.getXYDistance());
        System.out.println("distance YZ from X-Axes: " + point1.getYZDistance());
        System.out.println("distance ZX from Y-Axes: " + point1.getXZDistance());
        System.out.println("distance XYZ from center-Point: " + point1.getXYZDistance());
    }
}
