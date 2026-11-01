import java.util.Scanner;

public class L1_9_UpperCase {

    static String toUpper(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result.append(c >= 'a' && c <= 'z' ? (char) (c - 32) : c);
        }
        return result.toString();
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        System.out.println(toUpper(text));
        System.out.println(compare(toUpper(text), text.toUpperCase()));
    }
}
