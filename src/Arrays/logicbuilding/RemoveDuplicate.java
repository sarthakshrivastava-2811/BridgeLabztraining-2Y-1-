package Arrays.logicbuilding;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.print("arr[i]");
            }
        }
    }

    public static void removeduplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.print(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        removeduplicate(arr);
    }
}
