package labwork2;

public class FivePerLine {
    public static void main(String[] args) {
        for (int i = 1000; i < 2000; i += 5) {
            System.out.printf("%d\t%d\t%d\t%d\t%d\n", i, i+1, i+2, i+3, i+4);
        }
    }
}
