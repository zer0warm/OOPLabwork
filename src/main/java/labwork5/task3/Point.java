package labwork5.task3;

public class Point implements Shape {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calVolume() {
        return Double.NaN;
    }

    @Override
    public double calArea() {
        return Double.NaN;
    }

    @Override
    public String getName() {
        return "point";
    }
}
