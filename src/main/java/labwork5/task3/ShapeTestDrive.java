package labwork5.task3;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Point(1, 2);
        shapes[1] = new Circle(1, 2, 3);
        shapes[2] = new Cylinder(1, 2, 3, 5);

        for (Shape s : shapes) {
            System.out.println(s.getName() + ":");
            System.out.printf("\tArea:\t%.2f\n", s.calArea());
            System.out.printf("\tVolume:\t%.2f\n", s.calVolume());
        }
    }
}
