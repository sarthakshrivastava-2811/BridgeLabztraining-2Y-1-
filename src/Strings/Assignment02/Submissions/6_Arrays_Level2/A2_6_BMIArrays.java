import java.util.Scanner;

public class A2_6_BMIArrays {

    static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 40) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();
        if (persons < 1) {
            System.out.println("Invalid number");
            return;
        }

        double[] weight = new double[persons], height = new double[persons], bmi = new double[persons];
        String[] weightStatus = new String[persons];

        for (int i = 0; i < persons; i++) {
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();
            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Enter positive values");
                i--;
            }
        }

        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < persons; i++) {
            double meters = height[i] / 100;
            bmi[i] = weight[i] / (meters * meters);
            weightStatus[i] = status(bmi[i]);
            System.out.printf("%.1f\t\t%.1f\t\t%.2f\t%s%n", height[i], weight[i], bmi[i], weightStatus[i]);
        }
    }
}
