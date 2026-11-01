import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SB2_RemoveDuplicates {

    static String removeDuplicates(String text) {
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (char c : text.toCharArray())
            if (seen.add(c)) result.append(c);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new Scanner(System.in).nextLine()));
    }
}
