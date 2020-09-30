package labwork2;

public class Hellos {
    static String makeOrdinal(int number)
    {
        if (number % 100 >= 11 && number % 100 <= 20) {
            return "th";
        }
        return switch (number % 10) {
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            default -> "th";
        };
    }

    public static void main(String[] args) {
        int numberOfLines = Integer.parseInt(args[0]);

        for (int i = 1; i <= numberOfLines; i++) {
            System.out.printf("%d%s\tHello\n", i, makeOrdinal(i));
        }
    }
}
