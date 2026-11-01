import java.util.Scanner;

public class A2_9_GradesMatrix {

    static String grade(double percentage) {
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        return "R";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        if (students < 1) {
            System.out.println("Invalid number");
            return;
        }

        double[][] marks = new double[students][3];
        double[] percentage = new double[students];
        String[] grades = new String[students];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < marks[i].length; j++) marks[i][j] = sc.nextDouble();
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Enter positive values");
                i--;
            }
        }

        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < students; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / marks[i].length;
            grades[i] = grade(percentage[i]);
            System.out.printf("%.1f\t%.1f\t\t%.1f\t%.2f\t\t%s%n", marks[i][0], marks[i][1], marks[i][2], percentage[i], grades[i]);
        }
    }
}
