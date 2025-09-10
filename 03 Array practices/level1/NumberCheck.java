import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Define array and take input
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Step 2: Check each number
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Step 3: Compare first and last element
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("The first element " + first + " is equal to the last element " + last);
        } else if (first > last) {
            System.out.println("The first element " + first + " is greater than the last element " + last);
        } else {
            System.out.println("The first element " + first + " is less than the last element " + last);
        }

        input.close();
    }
}
