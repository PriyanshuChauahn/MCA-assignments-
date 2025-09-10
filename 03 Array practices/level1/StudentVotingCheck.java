import java.util.Scanner;

public class StudentVotingCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array for 10 students' ages
        int[] ages = new int[10];

        // Take input
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];

            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        input.close();
    }
}
