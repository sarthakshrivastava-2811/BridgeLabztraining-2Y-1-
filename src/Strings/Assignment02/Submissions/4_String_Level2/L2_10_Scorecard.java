import java.util.Scanner;

public class L2_10_Scorecard {

    static int[][] randomScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++)
            for (int j = 0; j < 3; j++) scores[i][j] = 10 + (int) (Math.random() * 90);
        return scores;
    }

    static double round(double value) {
        return Math.round(value * 100) / 100.0;
    }

    static double[][] results(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            result[i][0] = total;
            result[i][1] = round(total / 3.0);
            result[i][2] = round(total / 300.0 * 100);
        }
        return result;
    }

    static String grade(double percentage) {
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        return "R";
    }

    static void display(int[][] scores, double[][] results) {
        System.out.println("Physics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++)
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t"
                    + (int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t\t" + grade(results[i][2]));
    }

    public static void main(String[] args) {
        int students = new Scanner(System.in).nextInt();
        if (students < 1) {
            System.out.println("Invalid number");
            return;
        }
        int[][] scores = randomScores(students);
        display(scores, results(scores));
    }
}
