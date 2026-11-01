import java.util.Arrays;
import java.util.Scanner;

public class S6_HeapSort {

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void heapify(int[] a, int size, int root) {
        int largest = root, left = 2 * root + 1, right = 2 * root + 2;
        if (left < size && a[left] > a[largest]) largest = left;
        if (right < size && a[right] > a[largest]) largest = right;
        if (largest != root) {
            swap(a, root, largest);
            heapify(a, size, largest);
        }
    }

    static void sort(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) heapify(a, a.length, i);
        for (int i = a.length - 1; i > 0; i--) {
            swap(a, 0, i);
            heapify(a, i, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
