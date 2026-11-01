package Arrays.Assignment01;

public class TC1_LinearSearch {

    static int comparisons;

    static int search(int[] a, int target) {
        comparisons = 0;
        for (int i = 0; i < a.length; i++) {
            comparisons++;
            if (a[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {8, 61, 2, 3, 4, 0};

        for (int target : new int[]{8, 0, 5}) {
            System.out.println(search(a, target));
            System.out.println(comparisons);
        }

        int total = 0;
        for (int x : a) {
            search(a, x);
            total += comparisons;
        }
        System.out.println(total / (double) a.length);
    }
}
