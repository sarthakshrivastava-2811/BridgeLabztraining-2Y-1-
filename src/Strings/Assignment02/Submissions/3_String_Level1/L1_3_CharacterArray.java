import java.util.Scanner;

public class L1_3_CharacterArray {

    static char[] toChars(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < chars.length; i++) chars[i] = text.charAt(i);
        return chars;
    }

    static boolean compare(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        String text = new Scanner(System.in).next();
        System.out.println(compare(toChars(text), text.toCharArray()));
    }
}
