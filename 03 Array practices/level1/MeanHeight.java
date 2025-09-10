import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Create array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Step 2: Take user input for heights
        System.out.println("Enter the heights of 11 football players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i]; // Step 3: Add to sum
        }

        // Step 4: Calculate mean
        double mean = sum / heights.length;

        // Step 5: Display result
        System.out.println("\nThe mean height of the football team is: " + mean + " cm");

        input.close();
    }
}
