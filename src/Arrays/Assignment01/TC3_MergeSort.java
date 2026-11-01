package Arrays.Assignment01;

import java.util.Arrays;

public class TC3_MergeSort {

    static void sort(int[] a, int[] tmp, int lo, int hi, int depth) {
        System.out.println(depth + Arrays.toString(Arrays.copyOfRange(a, lo, hi + 1)));
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        sort(a, tmp, lo, mid, depth + 1);
        sort(a, tmp, mid + 1, hi, depth + 1);
        int i = lo, j = mid + 1, k = lo;
        while (i <= mid && j <= hi) tmp[k++] = a[i] <= a[j] ? a[i++] : a[j++];
        while (i <= mid) tmp[k++] = a[i++];
        while (j <= hi) tmp[k++] = a[j++];
        for (k = lo; k <= hi; k++) a[k] = tmp[k];
    }

    public static void main(String[] args) {
        int[] a = {8, 61, 2, 3, 4, 0};
        sort(a, new int[a.length], 0, a.length - 1, 0);
        System.out.println(Arrays.toString(a));
    }
}
