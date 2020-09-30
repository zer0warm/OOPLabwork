package labwork1;

import java.time.LocalDate;

public class SpringSeason {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        try {
            LocalDate springStart = LocalDate.of(2020, 3, 19);
            LocalDate springEnd = LocalDate.of(2020, 6, 21);
            LocalDate testDate = LocalDate.of(2020, m, d);

            System.out.println(testDate.isAfter(springStart) && testDate.isBefore(springEnd));
        } catch (Exception e) {
            System.out.println(false);
        }
    }
}
