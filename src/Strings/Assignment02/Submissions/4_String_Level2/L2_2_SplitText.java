import java.util.Scanner;

public class L2_2_SplitText {

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

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        System.out.println(compare(split(text), text.split(" ")));
    }
}
