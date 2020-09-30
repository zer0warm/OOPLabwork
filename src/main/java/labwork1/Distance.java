package labwork1;

public class Distance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.printf("The Euclidean distance between (%d, %d) and (0, 0) is %.2f\n", x, y, Math.sqrt(x * x + y * y));
    }
}
