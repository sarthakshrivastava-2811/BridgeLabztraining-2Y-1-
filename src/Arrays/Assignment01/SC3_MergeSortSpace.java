package Arrays.Assignment01;

import java.util.Arrays;

public class SC3_MergeSortSpace {

    static void sort(int[] a, int[] tmp, int lo, int hi) {
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        sort(a, tmp, lo, mid);
        sort(a, tmp, mid + 1, hi);
        int i = lo, j = mid + 1, k = lo;
        while (i <= mid && j <= hi) tmp[k++] = a[i] <= a[j] ? a[i++] : a[j++];
        while (i <= mid) tmp[k++] = a[i++];
        while (j <= hi) tmp[k++] = a[j++];
        for (k = lo; k <= hi; k++) a[k] = tmp[k];
    }

    public static void main(String[] args) {
        int[] a = {8, 61, 2, 3, 4, 0};
        sort(a, new int[a.length], 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
