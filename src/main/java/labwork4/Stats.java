package labwork4;

import java.util.Arrays;
import java.util.Scanner;

public class Stats {
    static double compSampleStdDevi(double[] data, double average) {
        double sumOfSquaresOfDiff = 0;
        for (double item : data) {
            sumOfSquaresOfDiff += Math.pow((item - average), 2);
        }
        return Math.sqrt(sumOfSquaresOfDiff / (data.length - 1));
    }

    static double compAverage(double[] data) {
        return Arrays.stream(data).sum() / data.length;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        double[] data = new double[n];

        for (int i = 0; i < n && scanner.hasNextDouble(); i++) {
            data[i] = scanner.nextDouble();
        }

        scanner.close();
        double average = compAverage(data);
        System.out.println("Average: " + average);
        System.out.println("Sample standard deviation: " + compSampleStdDevi(data, average));
    }
}
