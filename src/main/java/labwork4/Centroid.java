package labwork4;

import java.util.Scanner;

public class Centroid {
    public static void main(String[] args) {
        final int MAX_OBJ = 100;
        Scanner scanner = new Scanner(System.in);
        double[] xs = new double[MAX_OBJ];
        double[] ys = new double[MAX_OBJ];
        double[] ms = new double[MAX_OBJ];
        double x = 0;
        double m = 0;
        double y = 0;

        int i = 0;
        while (scanner.hasNextDouble() && i < MAX_OBJ) {
            xs[i] = scanner.nextDouble();
            ys[i] = scanner.nextDouble();
            ms[i] = scanner.nextDouble();
            i++;
        }

        for (int j = 0; j < i; j++) {
            m += ms[j];
            x += ms[j] * xs[j];
            y += ms[j] * ys[j];
        }

        System.out.print("Centroid: (" + x / m + "," + y / m + "," + m + ")");
    }
}
