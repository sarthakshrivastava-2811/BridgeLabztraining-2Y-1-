package Recursion.Assignment;

public class Problem2_WordGrid {

    static char[][] grid = {
        {'C', 'A', 'T', 'S'},
        {'O', 'R', 'E', 'A'},
        {'D', 'E', 'A', 'M'},
        {'E', 'L', 'L', 'S'}
    };
    static boolean[][] used = new boolean[4][4];
    static int found = 0;

    static void search(String word, int i, int r, int c) {
        if (r < 0 || c < 0 || r >= 4 || c >= 4 || used[r][c] || grid[r][c] != word.charAt(i)) return;
        if (i == word.length() - 1) {
            found++;
            return;
        }
        used[r][c] = true;
        for (int dr = -1; dr <= 1; dr++)
            for (int dc = -1; dc <= 1; dc++)
                search(word, i + 1, r + dr, c + dc);
        used[r][c] = false;
    }

    public static void main(String[] args) {
        String word = "DREAM";
        for (int r = 0; r < 4; r++)
            for (int c = 0; c < 4; c++)
                search(word, 0, r, c);
        System.out.println(found > 0);
        System.out.println(found);
    }
}
