import java.util.Scanner;

public class L1_10_LowerCase {

    static String toLower(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result.append(c >= 'A' && c <= 'Z' ? (char) (c + 32) : c);
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
        System.out.println(toLower(text));
        System.out.println(compare(toLower(text), text.toLowerCase()));
    }
}
