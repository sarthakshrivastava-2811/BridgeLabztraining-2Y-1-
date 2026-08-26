package Arrays.logicbuilding;
import java.util.Scanner;

public class maximumelement {
    public static int maxElement(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >max){
                max = arr[i];
            }
        }
        return max;
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
        int max = maxElement(arr);
        System.out.println("The maximum element in the array is: " + max);
    }
}