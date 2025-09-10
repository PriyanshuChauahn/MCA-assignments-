import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Step 2: Store digits in array
        int maxDigit = 10;  // maximum digits to store
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            int digit = number % 10;   // get last digit
            digits[index] = digit;     // store in array
            index++;
            number = number / 10;      // remove last digit

            if (index == maxDigit) {   // stop if array full
                break;
            }
        }

        // Step 3: Find largest and second largest digit
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int d = digits[i];

            if (d > largest) {
                secondLargest = largest;  // update second
                largest = d;              // update largest
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        // Step 4: Display Results
        System.out.println("\n--- Results ---");
        System.out.println("Largest digit = " + largest);
        if (secondLargest == -1) {
            System.out.println("Second largest digit = Not available (all digits same)");
        } else {
            System.out.println("Second largest digit = " + secondLargest);
        }

        input.close();
    }
}
