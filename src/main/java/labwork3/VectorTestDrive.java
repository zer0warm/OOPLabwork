package labwork3;

public class VectorTestDrive {
    public static void main(String[] args) {
        Vector v1 = new Vector(-144, 10);
        Vector v2 = new Vector(2, -4);

        System.out.printf("Two vectors are: %s and %s\n", v1, v2);
        System.out.printf("The sum of them is %s\n", v1.sum(v2));
        System.out.printf("The subtraction of them is %s\n", v1.subtract(v2));
        System.out.printf("The multiplication of them is %s\n", v1.multiply(v2));
    }
}
