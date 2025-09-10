import java.util.Scanner;

public class StudentFeeDiscount_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for course fee
        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();

        // Take input for discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount and final fee
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Print result
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
