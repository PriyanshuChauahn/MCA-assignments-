import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numEmployees = 10;

        double[] salary = new double[numEmployees];
        double[] years = new double[numEmployees];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Step 1: Take input
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double s = input.nextDouble();

            System.out.print("Years of Service: ");
            double y = input.nextDouble();

            // Validate
            if (s <= 0 || y <= 0) {
                System.out.println("Invalid input! Salary and years must be positive. Please re-enter.");
                i--; // decrement index to re-enter for same employee
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        // Step 2: Calculate bonus and new salary
        for (int i = 0; i < numEmployees; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5%
            } else {
                bonus[i] = salary[i] * 0.02; // 2%
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Step 3: Display Results
        System.out.println("\n--- Employee Salary & Bonus Details ---");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        System.out.println("\n--- Company Totals (Zara) ---");
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        input.close();
    }
}
