import java.util.Arrays;
import java.util.Scanner;

public class S4_QuickSort {

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    static void quickSort(int[] a, int low, int high) {
        if (low >= high) return;
        int pivot = a[high], i = low - 1;
        for (int j = low; j < high; j++)
            if (a[j] < pivot) swap(a, ++i, j);
        swap(a, i + 1, high);
        quickSort(a, low, i);
        quickSort(a, i + 2, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
