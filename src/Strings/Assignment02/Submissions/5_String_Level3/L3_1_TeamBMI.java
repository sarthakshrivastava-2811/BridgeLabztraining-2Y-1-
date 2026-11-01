import java.util.Scanner;

public class L3_1_TeamBMI {

    static final int TEAM_SIZE = 10;

    static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 40) return "Overweight";
        return "Obese";
    }

    static String[] bmiAndStatus(double weight, double heightCm) {
        double meters = heightCm / 100, bmi = weight / (meters * meters);
        return new String[]{String.format("%.2f", bmi), status(bmi)};
    }

    static String[][] bmiTable(double[][] data) {
        String[][] table = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            String[] result = bmiAndStatus(data[i][0], data[i][1]);
            table[i] = new String[]{String.valueOf(data[i][1]), String.valueOf(data[i][0]), result[0], result[1]};
        }
        return table;
    }

    static void display(String[][] table) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (String[] row : table) System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[TEAM_SIZE][2];
        for (int i = 0; i < data.length; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
            if (data[i][0] <= 0 || data[i][1] <= 0) {
                System.out.println("Invalid input");
                return;
            }
        }
        display(bmiTable(data));
    }
}
