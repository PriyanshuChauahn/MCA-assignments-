import java.util.Scanner;

public class TriangleArea_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for base and height in inches
        System.out.print("Enter base of the triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double height = input.nextDouble();

        // Calculate area in square inches
        double areaInInches = 0.5 * base * height;

        // Convert to square centimeters
        double areaInCm = areaInInches * 6.4516;

        // Output
        System.out.println("The area of the triangle is " + areaInInches + " square inches" +
                           " and " + areaInCm + " square centimeters.");

        input.close();
    }
}
