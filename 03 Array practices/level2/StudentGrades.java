import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        // b. Create arrays for marks, percentage, and grades
        int[][] marks = new int[n][3];     // [i][0] = Physics, [i][1] = Chemistry, [i][2] = Maths
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // c. Take input for marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                int mark;

                do {
                    System.out.print(subject + " marks: ");
                    mark = scanner.nextInt();
                    if (mark < 0) {
                        System.out.println("Marks cannot be negative! Enter again.");
                    }
                } while (mark < 0);

                marks[i][j] = mark;
            }

            // d. Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // e. Determine grade
            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        // f. Display results
        System.out.println("\nResults:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        scanner.close();
    }
}
