package labwork4;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        System.out.print("Enter text (send EOF to signal end of input): ");
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            count += line.split(" ").length;
        }

        scanner.close();

        System.out.println("Number of words: " + count);
    }
}
