package Recursion.Basic;

public class PowerOfANumber {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int result = power(x, n - 1);
        return x * result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
