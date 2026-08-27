package Arrays.leetcode;

import java.util.Scanner;

public class leetcode2535 {

    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            elementSum += num;

            int temp = num;
            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }
        }

        return Math.abs(elementSum - digitSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        leetcode2535 solution = new leetcode2535();

        System.out.print("Enter the number of elements: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                nums[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter integers only.");
                return;
            }
        }

        int result = solution.differenceOfSum(nums);
        System.out.println("The difference between element sum and digit sum is: " + result);

        scanner.close();
    }
}