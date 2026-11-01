import java.util.Scanner;

public class BS1_RotationPoint {

    static int rotationPoint(int[] a) {
        int left = 0, right = a.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] > a[right]) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        int index = rotationPoint(a);
        System.out.println(index);
        System.out.println(a[index]);
    }
}
