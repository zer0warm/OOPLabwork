package labwork2;

public class FunctionGrowth {
    public static void main(String[] args) {
        for (int i = 16; i <= 2048; i *= 2) {
            System.out.printf("%.2f", Math.log(i));
            System.out.printf("\t%d", i);
            System.out.printf("\t%-10.2f", (double)i * Math.log(i));
            System.out.printf("\t%.0f", Math.pow(i, 2));
            System.out.printf("\t%-10.0f", Math.pow(i, 3));
            System.out.printf("\t%.0f", Math.pow(2, i));
            System.out.println();
        }
    }
}
