import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10]; // Step 1: array of 10 elements
        double total = 0.0;
        int index = 0;

        // Step 2: infinite loop for user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            // Step 3: Break if user enters 0 or negative number
            if (num <= 0) {
                break;
            }

            // Step 4: Break if array is full
            if (index == 10) {
                System.out.println("Maximum of 10 numbers reached!");
                break;
            }

            // Step 5: Store number in array
            numbers[index] = num;
            index++;
        }

        // Step 6: Calculate total and display all numbers
        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        System.out.println("\nTotal sum of numbers = " + total);

        input.close();
    }
}
