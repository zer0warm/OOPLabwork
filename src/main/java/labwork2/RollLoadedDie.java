package labwork2;

public class RollLoadedDie {
    public static void main(String[] args) {
        double result = Math.random();
        int face;

        if (result <= 1.0 / 8) {
            face = 1;
        } else if (result <= 2.0 / 8) {
            face = 2;
        } else if (result <= 3.0 / 8) {
            face = 3;
        } else if (result <= 4.0 / 8) {
            face = 4;
        } else if (result <= 5.0 / 8) {
            face = 5;
        } else {
            face = 6;
        }

        System.out.println(face);
    }
}
