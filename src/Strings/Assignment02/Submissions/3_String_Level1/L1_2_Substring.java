import java.util.Scanner;

public class L1_2_Substring {

    static String substring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) result.append(text.charAt(i));
        return result.toString();
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt(), end = sc.nextInt();
        if (start < 0 || start > end || end > text.length()) {
            System.out.println("Invalid indexes");
            return;
        }
        String userResult = substring(text, start, end), builtInResult = text.substring(start, end);
        System.out.println(userResult);
        System.out.println(builtInResult);
        System.out.println(compare(userResult, builtInResult));
    }
}
