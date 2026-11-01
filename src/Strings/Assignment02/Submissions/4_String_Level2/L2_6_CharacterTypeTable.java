import java.util.Scanner;

public class L2_6_CharacterTypeTable {

    static String type(char c) {
        if (c >= 'A' && c <= 'Z') c += 32;
        if (c < 'a' || c > 'z') return "Not a Letter";
        return "aeiou".indexOf(c) >= 0 ? "Vowel" : "Consonant";
    }

    static String[][] types(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = type(text.charAt(i));
        }
        return result;
    }

    static void display(String[][] table) {
        System.out.println("Character\tType");
        for (String[] row : table) System.out.println(row[0] + "\t\t" + row[1]);
    }

    public static void main(String[] args) {
        display(types(new Scanner(System.in).nextLine()));
    }
}
