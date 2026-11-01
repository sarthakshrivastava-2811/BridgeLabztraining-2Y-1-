import java.util.Scanner;

public class BS4_FirstLastOccurrence {

    static int find(int[] a, int target, boolean first) {
        int low = 0, high = a.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == target) {
                result = mid;
                if (first) high = mid - 1;
                else low = mid + 1;
            } else if (a[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(find(a, target, true));
        System.out.println(find(a, target, false));
    }
}
