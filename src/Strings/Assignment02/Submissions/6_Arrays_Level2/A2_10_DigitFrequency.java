import java.util.Scanner;

public class A2_10_DigitFrequency {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        if (number < 0) {
            System.out.println("Invalid number");
            return;
        }

        int count = 0;
        for (int temp = number; temp > 0; temp /= 10) count++;

        int[] digits = new int[count];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        int[] frequency = new int[10];
        for (int digit : digits) frequency[digit]++;

        for (int i = 0; i < frequency.length; i++)
            if (frequency[i] > 0) System.out.println(i + " = " + frequency[i]);
    }
}
