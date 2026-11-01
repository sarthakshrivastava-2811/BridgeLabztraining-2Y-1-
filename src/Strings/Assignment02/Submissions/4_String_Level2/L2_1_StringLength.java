import java.util.Scanner;

public class L2_1_StringLength {

    static int length(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        String text = new Scanner(System.in).next();
        System.out.println(length(text));
        System.out.println(text.length());
    }
}
