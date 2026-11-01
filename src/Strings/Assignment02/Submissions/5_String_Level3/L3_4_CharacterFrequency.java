import java.util.Arrays;
import java.util.Scanner;

public class L3_4_CharacterFrequency {

    static String[][] frequencies(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) frequency[text.charAt(i)]++;
        String[][] result = new String[text.length()][];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (frequency[c] > 0) {
                result[count++] = new String[]{String.valueOf(c), String.valueOf(frequency[c])};
                frequency[c] = 0;
            }
        }
        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        for (String[] row : frequencies(new Scanner(System.in).nextLine()))
            System.out.println(row[0] + " = " + row[1]);
    }
}
