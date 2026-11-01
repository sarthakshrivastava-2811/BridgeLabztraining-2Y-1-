import java.util.Scanner;

public class L1_7_NumberFormat {

    static void generateException(String text) {
        System.out.println(Integer.parseInt(text));
    }

    static void handleException(String text) {
        try {
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("Caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Runtime exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        handleException(new Scanner(System.in).next());
    }
}
