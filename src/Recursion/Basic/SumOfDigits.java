package Recursion.Basic;

public class SumOfDigits {
    public static int sum(int n) {
        if (n <10) {
            return n;
        }
        int small= n%10;
        return small + sum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sum(45678298));
    }
}
