package Arrays.logicbuilding;
public class ArraySwap {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};

        System.out.println("Before swap:");
        print(arr);

        swap(arr, 0, 4);

        System.out.println("After swapping index 0 and 4:");
        print(arr);
    }
}