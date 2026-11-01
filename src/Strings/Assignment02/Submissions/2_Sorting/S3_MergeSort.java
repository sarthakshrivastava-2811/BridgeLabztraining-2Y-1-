import java.util.Arrays;
import java.util.Scanner;

public class S3_MergeSort {

    static void sort(int[] a) {
        mergeSort(a, new int[a.length], 0, a.length - 1);
    }

    static void mergeSort(int[] a, int[] temp, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(a, temp, low, mid);
        mergeSort(a, temp, mid + 1, high);
        int i = low, j = mid + 1, k = low;
        while (i <= mid && j <= high) temp[k++] = a[i] <= a[j] ? a[i++] : a[j++];
        while (i <= mid) temp[k++] = a[i++];
        while (j <= high) temp[k++] = a[j++];
        for (k = low; k <= high; k++) a[k] = temp[k];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
