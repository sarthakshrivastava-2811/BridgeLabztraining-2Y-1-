import java.util.Scanner;

public class L3_3_FirstNonRepeating {

    static char firstNonRepeating(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) frequency[text.charAt(i)]++;
        for (int i = 0; i < text.length(); i++)
            if (frequency[text.charAt(i)] == 1) return text.charAt(i);
        return '\0';
    }

    public static void main(String[] args) {
        char result = firstNonRepeating(new Scanner(System.in).nextLine());
        System.out.println(result == '\0' ? "None" : String.valueOf(result));
    }
}
