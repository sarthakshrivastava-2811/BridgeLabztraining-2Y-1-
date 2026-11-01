import java.util.Arrays;
import java.util.Scanner;

public class L3_6_FrequencyNestedLoops {

    static String[] frequencies(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '\0') continue;
            frequency[i] = 1;
            for (int j = i + 1; j < chars.length; j++)
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '\0';
                }
        }
        String[] result = new String[chars.length];
        int count = 0;
        for (int i = 0; i < chars.length; i++)
            if (frequency[i] > 0) result[count++] = chars[i] + " = " + frequency[i];
        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        for (String row : frequencies(new Scanner(System.in).nextLine())) System.out.println(row);
    }
}
