import java.util.Scanner;

public class L1_1_CompareStrings {

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        boolean userResult = compare(a, b), builtInResult = a.equals(b);
        System.out.println(userResult);
        System.out.println(builtInResult);
        System.out.println(userResult == builtInResult);
    }
}
