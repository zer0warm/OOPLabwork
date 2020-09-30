package labwork5.task3;

public class Cylinder extends Circle {
    double h;

    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    @Override
    public double calArea() {
        return ((2 * Math.PI * r) * h + 2 * (Math.PI * r * r));
    }

    @Override
    public double calVolume() {
        return ((2 * (Math.PI * r * r)) * h);
    }

    @Override
    public String getName() {
        return "cylinder";
    }
}
