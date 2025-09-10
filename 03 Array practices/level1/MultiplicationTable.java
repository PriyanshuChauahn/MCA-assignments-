import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a number to print its multiplication table: ");
        int number = input.nextInt();

        // Step 2: Define array to store results
        int[] table = new int[10];

        // Step 3: Generate multiplication table
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Step 4: Display results
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        input.close();
    }
}

