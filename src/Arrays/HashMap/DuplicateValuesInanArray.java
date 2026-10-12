package Arrays.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateValuesInanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int value : arr) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }

        System.out.println("Duplicate values in the array:");
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }

        sc.close();
    }
}
