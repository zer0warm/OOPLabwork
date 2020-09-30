package labwork4;

import java.util.*;

public class LongestRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();

        while (scanner.hasNextInt()) {
            numberList.add(scanner.nextInt());
        }

        int candidate = numberList.get(0);
        int successor = candidate;
        int currentLength = 0;
        int longest = 0;

        for (int number : numberList) {
            if (currentLength > longest) {
                successor = candidate;
            }
            if (number == candidate) {
                ++currentLength;
            } else {
                longest = Math.max(currentLength, longest);
                currentLength = 1;
                candidate = number;
            }
        }

        scanner.close();

        System.out.println("Successful candidate: " + successor);
        System.out.println("Length of the run: " + longest);
    }
}
