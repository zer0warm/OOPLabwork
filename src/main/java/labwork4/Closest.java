package labwork4;

import java.util.Scanner;

public class Closest {
    private static class Point3D {
        private final double x;
        private final double y;
        private final double z;

        public Point3D(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double compDist(Point3D p) {
            double diffX = this.x - p.x;
            double diffY = this.y - p.y;
            double diffZ = this.z - p.z;
            return diffX * diffX + diffY * diffY + diffZ * diffZ;
        }

        @Override
        public String toString() {
            return String.format("Point{%.2f,%.2f,%.2f}", this.x, this.y, this.z);
        }
    }

    public static void main(String[] args) {
        Point3D refPoint = new Point3D(Double.parseDouble(args[0]),
                                       Double.parseDouble(args[1]),
                                       Double.parseDouble(args[2]));
        Point3D closestPoint = new Point3D(0, 0, 0);
        double min = Double.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Point3D point = new Point3D(scanner.nextDouble(),
                                        scanner.nextDouble(),
                                        scanner.nextDouble());
            double dist = point.compDist(refPoint);
            if (dist < min) {
                min = dist;
                closestPoint = point;
            }
        }

        scanner.close();
        System.out.println("Closest point: " + closestPoint);
    }
}
