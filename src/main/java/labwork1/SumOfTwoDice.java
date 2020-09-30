package labwork1;

import java.util.Random;

public class SumOfTwoDice {
    public static void main(String[] args) {
        Random r = new Random();

        int firstDie = r.nextInt(6) + 1;
        int secondDie = r.nextInt(6) + 1;
        System.out.println(firstDie + secondDie);
    }
}
