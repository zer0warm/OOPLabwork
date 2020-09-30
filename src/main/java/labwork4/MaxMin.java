package labwork4;

import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println("Enter integers: (send EOF (CTRL+D) to signal end of input)");
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();

        while (scanner.hasNextInt()) {
            numberList.add(scanner.nextInt());
        }

        System.out.println("Max: " + Collections.max(numberList));
        System.out.println("Min: " + Collections.min(numberList));

        scanner.close();
    }
}
