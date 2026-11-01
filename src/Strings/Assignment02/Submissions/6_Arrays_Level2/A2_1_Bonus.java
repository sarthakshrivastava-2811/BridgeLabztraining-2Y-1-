import java.util.Scanner;

public class A2_1_Bonus {

    static final int EMPLOYEES = 10;
    static final int SERVICE_LIMIT = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[EMPLOYEES], years = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES], newSalary = new double[EMPLOYEES];
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < EMPLOYEES; i++) {
            salary[i] = sc.nextDouble();
            years[i] = sc.nextDouble();
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input, enter again");
                i--;
            }
        }

        for (int i = 0; i < EMPLOYEES; i++) {
            bonus[i] = salary[i] * (years[i] > SERVICE_LIMIT ? 0.05 : 0.02);
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("Total bonus: " + totalBonus);
        System.out.println("Total old salary: " + totalOld);
        System.out.println("Total new salary: " + totalNew);
    }
}
