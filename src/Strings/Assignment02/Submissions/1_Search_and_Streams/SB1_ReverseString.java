import java.util.Scanner;

public class SB1_ReverseString {

    static String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse(new Scanner(System.in).nextLine()));
    }
}
