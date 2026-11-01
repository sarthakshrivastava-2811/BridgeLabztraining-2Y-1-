import java.util.Arrays;
import java.util.Scanner;

public class L3_2_UniqueCharacters {

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

    static char[] uniqueCharacters(String text) {
        int n = length(text), count = 0;
        char[] unique = new char[n];
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++)
                if (text.charAt(i) == text.charAt(j)) {
                    duplicate = true;
                    break;
                }
            if (!duplicate) unique[count++] = text.charAt(i);
        }
        return Arrays.copyOf(unique, count);
    }

    public static void main(String[] args) {
        System.out.println(new String(uniqueCharacters(new Scanner(System.in).nextLine())));
    }
}
