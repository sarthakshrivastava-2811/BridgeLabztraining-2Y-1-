import java.util.Scanner;

public class A2_7_BMIMatrix {

    static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 40) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Invalid number");
            return;
        }

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            personData[i][0] = sc.nextDouble();
            personData[i][1] = sc.nextDouble();
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Enter positive values");
                i--;
            }
        }

        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            double meters = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (meters * meters);
            weightStatus[i] = status(personData[i][2]);
            System.out.printf("%.1f\t\t%.1f\t\t%.2f\t%s%n", personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
