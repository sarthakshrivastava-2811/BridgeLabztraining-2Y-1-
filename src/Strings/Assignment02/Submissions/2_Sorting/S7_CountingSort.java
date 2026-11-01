import java.util.Arrays;
import java.util.Scanner;

public class S7_CountingSort {

    static final int MIN_AGE = 10, MAX_AGE = 18;

    static int[] sort(int[] ages) {
        int[] count = new int[MAX_AGE - MIN_AGE + 1];
        int[] output = new int[ages.length];
        for (int age : ages) count[age - MIN_AGE]++;
        for (int i = 1; i < count.length; i++) count[i] += count[i - 1];
        for (int i = ages.length - 1; i >= 0; i--) output[--count[ages[i] - MIN_AGE]] = ages[i];
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[sc.nextInt()];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
            if (ages[i] < MIN_AGE || ages[i] > MAX_AGE) {
                System.out.println("Invalid age");
                return;
            }
        }
        System.out.println(Arrays.toString(sort(ages)));
    }
}
