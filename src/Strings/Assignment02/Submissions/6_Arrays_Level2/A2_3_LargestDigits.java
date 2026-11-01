import java.util.Scanner;

public class A2_3_LargestDigits {

    static final int MAX_DIGIT = 10;

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        if (number < 0) {
            System.out.println("Invalid number");
            return;
        }

        int[] digits = new int[MAX_DIGIT];
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
            if (index == digits.length) break;
        }

        int largest = 0, second = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] < largest) second = digits[i];
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + second);
    }
}
