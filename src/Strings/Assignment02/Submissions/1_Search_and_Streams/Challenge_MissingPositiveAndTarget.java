import java.util.Arrays;
import java.util.Scanner;

public class Challenge_MissingPositiveAndTarget {

    static int firstMissingPositive(int[] a) {
        boolean[] present = new boolean[a.length + 2];
        for (int x : a)
            if (x > 0 && x <= a.length) present[x] = true;
        for (int i = 1; i < present.length; i++)
            if (!present[i]) return i;
        return a.length + 1;
    }

    static int binarySearch(int[] sorted, int target) {
        int low = 0, high = sorted.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sorted[mid] == target) return mid;
            if (sorted[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(firstMissingPositive(a));
        int[] sorted = a.clone();
        Arrays.sort(sorted);
        System.out.println(binarySearch(sorted, target));
    }
}
