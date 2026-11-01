package Arrays.Assignment01;

public class SC2_BinarySearchSpace {

    static int search(int[] a, int target) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == target) return mid;
            if (a[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {0, 2, 3, 4, 8, 61};
        System.out.println(search(a, 4));
    }
}
