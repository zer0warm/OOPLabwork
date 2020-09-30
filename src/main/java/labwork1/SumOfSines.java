package labwork1;

public class SumOfSines {
    public static void main(String[] args) {
        double t = Math.toRadians(Double.parseDouble(args[0]));
        System.out.println(Math.sin(2 * t) + Math.sin(3 * t));
    }
}
