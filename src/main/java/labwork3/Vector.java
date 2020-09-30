package labwork3;

public class Vector {
    private final int x;
    private final int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Vector sum(Vector otherVector) {
        return new Vector(this.x + otherVector.x, this.y + otherVector.y);
    }

    Vector subtract(Vector otherVector) {
        return new Vector(this.x - otherVector.x, this.y - otherVector.y);
    }

    int multiply(Vector otherVector) {
        return this.x * otherVector.x + this.y * otherVector.y;
    }

    @Override
    public String toString() {
        return String.format("Vector{%d,%d}", this.x, this.y);
    }
}
