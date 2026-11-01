import java.util.Scanner;

public class L2_4_ShortestLongestWord {

    static int length(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    static String[] split(String text) {
        int length = length(text), words = 1;
        for (int i = 0; i < length; i++)
            if (text.charAt(i) == ' ') words++;
        int[] spaces = new int[words + 1];
        spaces[0] = -1;
        spaces[words] = length;
        int k = 1;
        for (int i = 0; i < length; i++)
            if (text.charAt(i) == ' ') spaces[k++] = i;
        String[] result = new String[words];
        for (int i = 0; i < words; i++) result[i] = text.substring(spaces[i] + 1, spaces[i + 1]);
        return result;
    }

    static String[][] wordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(length(words[i]));
        }
        return result;
    }

    static int[] shortestAndLongest(String[][] table) {
        int shortest = Integer.parseInt(table[0][1]), longest = shortest;
        for (String[] row : table) {
            int size = Integer.parseInt(row[1]);
            if (size < shortest) shortest = size;
            if (size > longest) longest = size;
        }
        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        int[] result = shortestAndLongest(wordLengths(split(new Scanner(System.in).nextLine())));
        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
    }
}
