package Arrays.logicbuilding;
import java.util.Scanner;
import java.util.Arrays;

public class mergesortedarray {
    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;
        
        while (i < n && j < m) {
            merged[k++] = arr1[i] <= arr2[j] ? arr1[i++] : arr2[j++];
        }
        
        while (i < n) merged[k++] = arr1[i++];
        while (j < m) merged[k++] = arr2[j++];
        
        return merged;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();
        
        int[] result = mergeSortedArrays(arr1, arr2);
        System.out.println("Merged: " + Arrays.toString(result));
        
        sc.close();
    }
}
