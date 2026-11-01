import java.util.Scanner;

public class L1_5_StringIndexOutOfBounds {

    static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Runtime exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        handleException(new Scanner(System.in).next());
    }
}
