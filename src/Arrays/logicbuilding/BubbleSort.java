package Arrays.logicbuilding;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int k = sc.nextInt();
        int[] nums = new int[k];

        System.out.println("Enter " + k + " numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(nums));
        sc.close();
    }
}
