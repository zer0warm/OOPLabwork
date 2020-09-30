package labwork4;

import java.util.Random;
import java.util.Scanner;

public class Transpose {
    static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i > j) {
                    int t = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = t;
                }
            }
        }
    }

    static void printMatrix(int[][] matrix, String title) {
        System.out.println(title);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = scanner.nextInt();
        scanner.close();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(100) - 50;
            }
        }

        printMatrix(matrix, "Before:");
        transpose(matrix);
        printMatrix(matrix, "After:");
    }
}
