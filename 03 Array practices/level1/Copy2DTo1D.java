import java.util.Scanner;

public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take rows and columns input
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        // Step 2: Create 2D array
        int[][] matrix = new int[rows][cols];

        // Step 3: Input values for 2D array
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Step 4: Create 1D array of size rows*cols
        int[] array = new int[rows * cols];

        // Step 5: Copy elements from 2D to 1D
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Step 6: Display 1D array
        System.out.println("\nThe 1D array after copying from 2D matrix:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}
