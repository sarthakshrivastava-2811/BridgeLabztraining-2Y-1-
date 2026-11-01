import java.util.Scanner;

public class BS3_MatrixSearch {

    static boolean search(int[][] matrix, int target) {
        int columns = matrix[0].length, left = 0, right = matrix.length * columns - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = matrix[mid / columns][mid % columns];
            if (value == target) return true;
            if (value < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++) matrix[i][j] = sc.nextInt();
        System.out.println(search(matrix, sc.nextInt()));
    }
}
