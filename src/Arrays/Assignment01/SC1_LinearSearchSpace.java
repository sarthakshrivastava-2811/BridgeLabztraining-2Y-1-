package Arrays.Assignment01;

public class SC1_LinearSearchSpace {

    static int search(int[] a, int target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target) return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {8, 61, 2, 3, 4, 0};
        System.out.println(search(a, 0));
    }
}
