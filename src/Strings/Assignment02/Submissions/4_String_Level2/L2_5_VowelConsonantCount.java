import java.util.Scanner;

public class L2_5_VowelConsonantCount {

    static String type(char c) {
        if (c >= 'A' && c <= 'Z') c += 32;
        if (c < 'a' || c > 'z') return "Not a Letter";
        return "aeiou".indexOf(c) >= 0 ? "Vowel" : "Consonant";
    }

    static int[] count(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            String kind = type(text.charAt(i));
            if (kind.equals("Vowel")) vowels++;
            else if (kind.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        int[] result = count(new Scanner(System.in).nextLine());
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
