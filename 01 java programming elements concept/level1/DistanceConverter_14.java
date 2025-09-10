import java.util.Scanner;

public class DistanceConverter_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input distance in feet
        System.out.print("Enter the distance in feet: ");
        double feet = input.nextDouble();

        // Convert to yards and miles
        double yards = feet / 3.0;
        double miles = yards / 1760.0;

        // Output
        System.out.println("The distance in feet is " + feet +
                           ", which is " + yards + " yards" +
                           " and " + miles + " miles.");

        input.close();
    }
}
