import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();

        // Create a 2D array for height, weight, BMI
        double[][] personData = new double[number][3]; 
        // [i][0] -> height, [i][1] -> weight, [i][2] -> BMI
        String[] weightStatus = new String[number];

        // Take input for weight and height with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            // Height input
            double height;
            do {
                System.out.print("Enter height (m): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive! Try again.");
                }
            } while (height <= 0);

            // Weight input
            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive! Try again.");
                }
            } while (weight <= 0);

            // Store in array
            personData[i][0] = height;
            personData[i][1] = weight;

            // Calculate BMI
            personData[i][2] = weight / (height * height);

            // Determine weight status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
