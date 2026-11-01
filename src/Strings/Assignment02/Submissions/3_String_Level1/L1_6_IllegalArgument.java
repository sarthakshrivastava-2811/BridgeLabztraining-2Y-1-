import java.util.Scanner;

public class L1_6_IllegalArgument {

    static void generateException(String text) {
        System.out.println(text.substring(2, 1));
    }

    static void handleException(String text) {
        try {
            System.out.println(text.substring(2, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Runtime exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        handleException(new Scanner(System.in).next());
    }
}
