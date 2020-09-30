package labwork5.task1;

public class Point extends Shape {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getName() {
        return "point";
    }
}
