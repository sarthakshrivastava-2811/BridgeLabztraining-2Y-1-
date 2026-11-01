import java.util.Scanner;

public class L2_7_TrimSpaces {

    static int[] trimRange(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    static String substring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) result.append(text.charAt(i));
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
        int[] range = trimRange(text);
        String userResult = substring(text, range[0], range[1]);
        System.out.println("[" + userResult + "]");
        System.out.println("[" + text.trim() + "]");
        System.out.println(compare(userResult, text.trim()));
    }
}
