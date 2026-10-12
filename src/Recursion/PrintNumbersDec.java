package Recursion;

public class PrintNumbersDec {
    public static void printInc(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printInc(n - 1);
    }

    public static void main(String[] args) {
        printInc(10);
    }
}
