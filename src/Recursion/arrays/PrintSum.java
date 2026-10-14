package Recursion.arrays;

public class PrintSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = printSum(arr, 0);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int printSum(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + printSum(arr, index + 1);
    }
}
