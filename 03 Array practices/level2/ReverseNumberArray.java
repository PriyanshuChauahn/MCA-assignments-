import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store original number for later display
        int originalNumber = number;

        // Step 2: Count digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Step 3: Extract digits and store in array
        int[] digits = new int[count];
        int index = count - 1;
        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index--;
        }

        // Step 4: Create reverse array
        int[] reverseDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        // Step 5: Display results
        System.out.println("\nOriginal number: " + originalNumber);

        System.out.print("Digits in order: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.print("\nDigits in reverse order: ");
        for (int d : reverseDigits) {
            System.out.print(d + " ");
        }

        System.out.print("\nReversed number: ");
        for (int d : reverseDigits) {
            System.out.print(d);
        }

        input.close();
    }
}
