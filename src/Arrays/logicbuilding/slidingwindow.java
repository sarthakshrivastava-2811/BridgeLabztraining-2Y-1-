package Arrays.logicbuilding;

import java.util.Scanner;

public class slidingwindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        System.out.print("Enter window size: ");
        int k = sc.nextInt();

        if (k > n) {
            System.out.println("Window size cannot be greater than array size.");
            return;
        }

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        System.out.println("Window 1 sum: " + sum);

        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            System.out.println("Window " + (i - k + 2) + " sum: " + sum);
        }
    }
}
