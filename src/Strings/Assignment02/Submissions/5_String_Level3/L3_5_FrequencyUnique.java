import java.util.Arrays;
import java.util.Scanner;

public class L3_5_FrequencyUnique {

    static char[] uniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++)
                if (text.charAt(i) == text.charAt(j)) {
                    duplicate = true;
                    break;
                }
            if (!duplicate) unique[count++] = text.charAt(i);
        }
        return Arrays.copyOf(unique, count);
    }

    static String[][] frequencies(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) frequency[text.charAt(i)]++;
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(frequency[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        for (String[] row : frequencies(new Scanner(System.in).nextLine()))
            System.out.println(row[0] + " = " + row[1]);
    }
}
