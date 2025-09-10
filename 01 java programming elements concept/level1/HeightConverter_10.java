import java.util.Scanner;

public class HeightConverter_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter your height in centimeters: ");
        double cm = input.nextDouble();

        // Convert cm to inches
        double totalInches = cm / 2.54;

        // Find feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Output
        System.out.println("Your Height in cm is " + cm +
                           " while in feet is " + feet +
                           " and inches is " + String.format("%.2f", inches));

        input.close();
    }
}
