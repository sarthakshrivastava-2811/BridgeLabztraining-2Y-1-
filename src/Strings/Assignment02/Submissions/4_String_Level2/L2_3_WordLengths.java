import java.util.Scanner;

public class L2_3_WordLengths {

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

    public static void main(String[] args) {
        String[][] table = wordLengths(split(new Scanner(System.in).nextLine()));
        System.out.println("Word\tLength");
        for (String[] row : table) System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}
