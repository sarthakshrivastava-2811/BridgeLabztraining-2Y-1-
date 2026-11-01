import java.util.Arrays;
import java.util.Scanner;

public class L3_8_Anagram {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] first = new int[256], second = new int[256];
        for (int i = 0; i < a.length(); i++) {
            first[a.charAt(i)]++;
            second[b.charAt(i)]++;
        }
        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isAnagram(sc.nextLine(), sc.nextLine()));
    }
}
