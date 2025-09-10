import java.util.Scanner;

public class MultiplicationFrom6To9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
        int number = input.nextInt();

        // Step 2: Define array to store results (for 6 to 9 → 4 values)
        int[] multiplicationResult = new int[4];

        // Step 3: Generate multiplication results for 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Step 4: Display results
        System.out.println("\nMultiplication Table of " + number + " (from 6 to 9):");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        input.close();
    }
}
