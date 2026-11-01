package Recursion.Assignment;

import java.util.Arrays;

public class Problem3_NQueens {

    static int n;
    static int[] queen;
    static boolean[] col, diag1, diag2;
    static boolean[][] blocked;

    static void init(int size, boolean[][] forbidden) {
        n = size;
        queen = new int[n];
        col = new boolean[n];
        diag1 = new boolean[2 * n - 1];
        diag2 = new boolean[2 * n - 1];
        blocked = forbidden;
    }

    static int solve(int row, boolean firstOnly) {
        if (row == n) return 1;
        int count = 0;
        for (int c = 0; c < n; c++) {
            if (col[c] || diag1[row + c] || diag2[row - c + n - 1]) continue;
            if (blocked != null && blocked[row][c]) continue;
            queen[row] = c;
            col[c] = diag1[row + c] = diag2[row - c + n - 1] = true;
            count += solve(row + 1, firstOnly);
            col[c] = diag1[row + c] = diag2[row - c + n - 1] = false;
            if (firstOnly && count > 0) return count;
        }
        return count;
    }

    public static void main(String[] args) {
        init(8, null);
        System.out.println(solve(0, false));

        init(8, null);
        solve(0, true);
        System.out.println(Arrays.toString(queen));

        boolean[][] forbidden = new boolean[8][8];
        forbidden[0][0] = forbidden[1][3] = forbidden[2][5] = forbidden[4][4] = true;
        init(8, forbidden);
        System.out.println(solve(0, false));
    }
}
