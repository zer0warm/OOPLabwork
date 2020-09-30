package labwork3;

class Automobile {
    private double fuel;
    private double speed;
    private String license;

    public Automobile(double f, double s, String l) {
        fuel = f;
        speed = s;
        license = l;
    }

    public void accelerate(double v) {
        if (fuel > 0) {
            speed += v;
        }
    }

    public void decelerate(double v) {
        if (fuel <= 0) {
            speed -= v;
        }
    }
}