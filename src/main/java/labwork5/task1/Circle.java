package labwork5.task1;

public class Circle extends Point {
    double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public double calArea() {
        return (Math.PI * r * r);
    }

    @Override
    public String getName() {
        return "circle";
    }
}
