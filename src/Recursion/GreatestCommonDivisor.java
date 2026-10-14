package Recursion;

public class GreatestCommonDivisor {
    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return gcd(m, n % m);
    }

    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println(" " + a + "  " + b + "  " + gcd(a, b));
    }
}
