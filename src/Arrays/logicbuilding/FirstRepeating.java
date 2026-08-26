package Arrays.logicbuilding;
import java.util.Scanner;
public class FirstRepeating {
    public static int firstRepeating(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
    }
}
