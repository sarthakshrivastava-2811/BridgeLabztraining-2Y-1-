package Recursion;

public class Factorial {
    public static int fact(int n) {
        if (n == 1) {
            System.out.println(1);
            return 1;
        }
        int result = fact(n - 1);
        System.out.println(n * result);
        return n * result;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
