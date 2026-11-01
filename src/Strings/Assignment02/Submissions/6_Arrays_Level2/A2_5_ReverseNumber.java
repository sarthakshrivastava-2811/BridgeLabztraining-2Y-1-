import java.util.Scanner;

public class A2_5_ReverseNumber {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        if (number < 0) {
            System.out.println("Invalid number");
            return;
        }

        int count = 0;
        for (int temp = number; temp > 0; temp /= 10) count++;

        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) reversed[i] = digits[count - 1 - i];

        for (int digit : reversed) System.out.print(digit);
        System.out.println();
    }
}
