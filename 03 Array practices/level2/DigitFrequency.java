import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        // Step 2: Convert number to string to find digit count
        String numStr = Long.toString(number);
        int count = numStr.length();

        // Step 3: Store digits in an array
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = numStr.charAt(i) - '0'; // convert char to digit
        }

        // Step 4: Frequency array of size 10
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Step 5: Display frequency of digits
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {  // show only if digit appears
                System.out.println("Digit " + i + " = " + frequency[i]);
            }
        }

        input.close();
    }
}
