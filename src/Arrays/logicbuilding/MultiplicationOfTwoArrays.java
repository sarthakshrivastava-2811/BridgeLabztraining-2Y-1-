package Arrays.logicbuilding;
import java.util.Scanner;
public class MultiplicationOfTwoArrays {
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] result = new int[n];

        System.out.println("Enter " + n + " elements for the first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter " + n + " elements for the second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] * arr2[i];
        }

        System.out.print("Result: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
        sc.close();
    }
}
