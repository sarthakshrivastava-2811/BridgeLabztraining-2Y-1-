import java.util.Scanner;

public class A2_8_GradesArrays {

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

        double[] physics = new double[students], chemistry = new double[students], maths = new double[students];
        double[] percentage = new double[students];
        String[] grades = new String[students];

        for (int i = 0; i < students; i++) {
            physics[i] = sc.nextDouble();
            chemistry[i] = sc.nextDouble();
            maths[i] = sc.nextDouble();
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Enter positive values");
                i--;
            }
        }

        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < students; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
            grades[i] = grade(percentage[i]);
            System.out.printf("%.1f\t%.1f\t\t%.1f\t%.2f\t\t%s%n", physics[i], chemistry[i], maths[i], percentage[i], grades[i]);
        }
    }
}
