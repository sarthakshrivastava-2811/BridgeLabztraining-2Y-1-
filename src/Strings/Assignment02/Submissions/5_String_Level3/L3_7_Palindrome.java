import java.util.Scanner;

public class L3_7_Palindrome {

    static boolean loopCheck(String text) {
        for (int start = 0, end = text.length() - 1; start < end; start++, end--)
            if (text.charAt(start) != text.charAt(end)) return false;
        return true;
    }

    static boolean recursiveCheck(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return recursiveCheck(text, start + 1, end - 1);
    }

    static char[] reverse(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < reversed.length; i++) reversed[i] = text.charAt(text.length() - 1 - i);
        return reversed;
    }

    static boolean arrayCheck(String text) {
        char[] original = text.toCharArray(), reversed = reverse(text);
        for (int i = 0; i < original.length; i++)
            if (original[i] != reversed[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        System.out.println(loopCheck(text));
        System.out.println(recursiveCheck(text, 0, text.length() - 1));
        System.out.println(arrayCheck(text));
    }
}
