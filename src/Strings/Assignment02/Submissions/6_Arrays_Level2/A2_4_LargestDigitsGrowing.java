import java.util.Arrays;
import java.util.Scanner;

public class A2_4_LargestDigitsGrowing {

    static final int INITIAL_SIZE = 10;

    public static void main(String[] args) {
        long number = new Scanner(System.in).nextLong();
        if (number < 0) {
            System.out.println("Invalid number");
            return;
        }

        int[] digits = new int[INITIAL_SIZE];
        int index = 0;
        while (number != 0) {
            if (index == digits.length) digits = Arrays.copyOf(digits, digits.length + INITIAL_SIZE);
            digits[index++] = (int) (number % 10);
            number /= 10;
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
